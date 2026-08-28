package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import j3.r0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import kh.u;
import kh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class MediaCodecVideoConvertor {
    private static final int MEDIACODEC_TIMEOUT_DEFAULT = 2500;
    private static final int MEDIACODEC_TIMEOUT_INCREASED = 22000;
    private static final int PROCESSOR_TYPE_INTEL = 2;
    private static final int PROCESSOR_TYPE_MTK = 3;
    private static final int PROCESSOR_TYPE_OTHER = 0;
    private static final int PROCESSOR_TYPE_QCOM = 1;
    private static final int PROCESSOR_TYPE_SEC = 4;
    private static final int PROCESSOR_TYPE_TI = 5;
    private MediaController.VideoConvertorListener callback;
    private long endPresentationTime;
    private MediaExtractor extractor;
    private Muxer muxer;
    private String outputMimeType;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class ConversionCanceledException extends RuntimeException {
        public ConversionCanceledException() {
            super("canceled conversion");
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class ConvertVideoParams {
        int account;
        long avatarStartTime;
        String backgroundPath;
        int bitrate;
        String blurPath;
        File cacheFile;
        MediaController.VideoConvertorListener callback;
        u collage;
        ArrayList<VideoEditedInfo.Part> collageParts;
        MediaController.CropState cropState;
        long duration;
        long endTime;
        int framerate;
        Integer gradientBottomColor;
        Integer gradientTopColor;
        z7 hdrInfo;
        boolean isDark;
        boolean isPhoto;
        boolean isRound;
        boolean isSecret;
        boolean isSticker;
        boolean isStory;
        ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
        String messagePath;
        String messageVideoMaskPath;
        boolean muted;
        boolean needCompress;
        int originalBitrate;
        int originalHeight;
        int originalWidth;
        String paintPath;
        int resultHeight;
        int resultWidth;
        int rotationValue;
        MediaController.SavedFilterState savedFilterState;
        public ArrayList<MixedSoundInfo> soundInfos = new ArrayList<>();
        long startTime;
        long videoOffset;
        String videoPath;
        float volume;
        long wallpaperPeerId;

        private ConvertVideoParams() {
        }

        public static ConvertVideoParams of(String str, File file, long j10, int i9, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j11, long j12, long j13, boolean z11, long j14, MediaController.VideoConvertorListener videoConvertorListener, VideoEditedInfo videoEditedInfo) {
            ConvertVideoParams convertVideoParams = new ConvertVideoParams();
            convertVideoParams.videoPath = str;
            convertVideoParams.videoOffset = j10;
            convertVideoParams.cacheFile = file;
            convertVideoParams.rotationValue = i9;
            convertVideoParams.isSecret = z10;
            convertVideoParams.originalWidth = i10;
            convertVideoParams.originalHeight = i11;
            convertVideoParams.resultWidth = i12;
            convertVideoParams.resultHeight = i13;
            convertVideoParams.framerate = i14;
            convertVideoParams.bitrate = i15;
            convertVideoParams.originalBitrate = i16;
            convertVideoParams.startTime = j11;
            convertVideoParams.endTime = j12;
            convertVideoParams.avatarStartTime = j13;
            convertVideoParams.needCompress = z11;
            convertVideoParams.duration = j14;
            convertVideoParams.savedFilterState = videoEditedInfo.filterState;
            convertVideoParams.paintPath = videoEditedInfo.paintPath;
            convertVideoParams.blurPath = videoEditedInfo.blurPath;
            convertVideoParams.mediaEntities = videoEditedInfo.mediaEntities;
            convertVideoParams.isPhoto = videoEditedInfo.isPhoto;
            convertVideoParams.cropState = videoEditedInfo.cropState;
            convertVideoParams.isRound = videoEditedInfo.roundVideo;
            convertVideoParams.callback = videoConvertorListener;
            convertVideoParams.gradientTopColor = videoEditedInfo.gradientTopColor;
            convertVideoParams.gradientBottomColor = videoEditedInfo.gradientBottomColor;
            convertVideoParams.muted = videoEditedInfo.muted;
            convertVideoParams.volume = videoEditedInfo.volume;
            convertVideoParams.isStory = videoEditedInfo.isStory;
            convertVideoParams.hdrInfo = videoEditedInfo.hdrInfo;
            convertVideoParams.isDark = videoEditedInfo.isDark;
            convertVideoParams.wallpaperPeerId = videoEditedInfo.wallpaperPeerId;
            convertVideoParams.account = videoEditedInfo.account;
            convertVideoParams.messagePath = videoEditedInfo.messagePath;
            convertVideoParams.messageVideoMaskPath = videoEditedInfo.messageVideoMaskPath;
            convertVideoParams.backgroundPath = videoEditedInfo.backgroundPath;
            convertVideoParams.isSticker = videoEditedInfo.isSticker;
            convertVideoParams.collage = videoEditedInfo.collage;
            convertVideoParams.collageParts = videoEditedInfo.collageParts;
            return convertVideoParams;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class MixedSoundInfo {
        final String audioFile;
        public long audioOffset;
        public long duration;
        public long startTime;
        public float volume = 1.0f;

        public MixedSoundInfo(String str) {
            this.audioFile = str;
        }
    }

    private static void applyAudioInputs(ArrayList<MixedSoundInfo> arrayList, ArrayList<hf.a> arrayList2) {
        if (arrayList == null) {
            return;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            MixedSoundInfo mixedSoundInfo = arrayList.get(i9);
            try {
                hf.c cVar = new hf.c(mixedSoundInfo.audioFile);
                AudioDecoder audioDecoder = cVar.b;
                cVar.a = Math.max(0.0f, Math.min(mixedSoundInfo.volume, 1.0f));
                long j10 = mixedSoundInfo.startTime;
                if (j10 > 0) {
                    if (j10 < 0) {
                        j10 = 0;
                    }
                    cVar.d = j10;
                }
                long j11 = mixedSoundInfo.audioOffset;
                if (j11 > 0) {
                    audioDecoder.setStartTimeUs(j11);
                } else {
                    j11 = 0;
                }
                long j12 = mixedSoundInfo.duration;
                if (j12 > 0) {
                    audioDecoder.setEndTimeUs(j11 + j12);
                }
                arrayList2.add(cVar);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    private void checkConversionCanceled() {
        MediaController.VideoConvertorListener videoConvertorListener = this.callback;
        if (videoConvertorListener != null && videoConvertorListener.checkConversionCanceled()) {
            throw new ConversionCanceledException();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r112v2 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), method size: 7789
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private boolean convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r129, boolean r130, int r131) {
        /*
            Method dump skipped, instructions count: 7789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.MediaCodecVideoConvertor.convertVideoInternal(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, boolean, int):boolean");
    }

    private MediaCodec createEncoderForMimeType() {
        MediaCodec createEncoderByType;
        if (!this.outputMimeType.equals("video/hevc") || Build.VERSION.SDK_INT < 29) {
            if (this.outputMimeType.equals("video/hevc")) {
                this.outputMimeType = MediaController.VIDEO_MIME_TYPE;
            }
            createEncoderByType = MediaCodec.createEncoderByType(this.outputMimeType);
        } else {
            String findGoodHevcEncoder = SharedConfig.findGoodHevcEncoder();
            createEncoderByType = findGoodHevcEncoder != null ? MediaCodec.createByCodecName(findGoodHevcEncoder) : null;
        }
        if (createEncoderByType != null || !this.outputMimeType.equals("video/hevc")) {
            return createEncoderByType;
        }
        this.outputMimeType = MediaController.VIDEO_MIME_TYPE;
        return MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
    }

    private static String createFragmentShader(int i9, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        float f10 = i9;
        float f11 = f10 / (z11 ? i12 : i11);
        float f12 = i10;
        float f13 = f12 / (z11 ? i11 : i12);
        int i14 = 1;
        int max = Math.max(1, Math.round(f11));
        int max2 = Math.max(1, Math.round(f13));
        if (SharedConfig.deviceIsAverage()) {
            max2 = 1;
        } else {
            i14 = max;
        }
        int min = Math.min(i13, i14);
        int min2 = Math.min(i13, max2);
        float f14 = f11 / min;
        float f15 = f13 / min2;
        float f16 = (-(min - 1)) / 2.0f;
        float f17 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f16 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f17 += 0.01f;
        }
        StringBuilder o6 = e2.c.o("source size ", i9, "x", i10, "    dest size ");
        r0.y(o6, i11, "x", i12, "   rotated ");
        o6.append(z11);
        o6.append("   ratio ");
        o6.append(f11);
        o6.append("x");
        o6.append(f13);
        o6.append("   samples ");
        o6.append(min);
        o6.append("x");
        o6.append(min2);
        o6.append("   kernel scale ");
        o6.append(f14);
        o6.append("x");
        o6.append(f15);
        FileLog.d(o6.toString());
        String glslFloat = glslFloat(f16);
        String glslFloat2 = glslFloat(f17);
        String glslFloat3 = glslFloat(f14);
        String glslFloat4 = glslFloat(f15);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f10);
        String glslFloat7 = glslFloat(1.0f / f12);
        String str = z10 ? "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\n" : "uniform sampler2D sTexture;\n";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("precision highp float;\nvarying vec2 vTextureCoord;\nconst float offsetX = ");
        sb2.append(glslFloat);
        sb2.append(";\nconst float offsetY = ");
        sb2.append(glslFloat2);
        r0.A(sb2, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        r0.A(sb2, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
        sb2.append(";\nconst float pixelSizeY = ");
        sb2.append(glslFloat7);
        sb2.append(";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < ");
        sb2.append(min);
        sb2.append("; ++i) {\n        for (int j = 0; j < ");
        sb2.append(min2);
        sb2.append("; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += ");
        sb2.append("texture2D(sTexture, uv).rgb");
        sb2.append(";\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n");
        return sb2.toString();
    }

    public static void cutOfNalData(String str, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i9 = str.equals("video/hevc") ? 3 : 1;
        if (bufferInfo.size > 100) {
            byteBuffer.position(bufferInfo.offset);
            byte[] bArr = new byte[100];
            byteBuffer.get(bArr);
            int i10 = 0;
            for (int i11 = 0; i11 < 96; i11++) {
                if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 0 && bArr[i11 + 3] == 1 && (i10 = i10 + 1) > i9) {
                    bufferInfo.offset += i11;
                    bufferInfo.size -= i11;
                    return;
                }
            }
        }
    }

    private MediaCodec getDecoderByFormat(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            throw new RuntimeException("getDecoderByFormat: format is null");
        }
        ArrayList arrayList = new ArrayList();
        String string = mediaFormat.getString("mime");
        arrayList.add(string);
        if ("video/dolby-vision".equals(string)) {
            arrayList.add("video/hevc");
            arrayList.add(MediaController.VIDEO_MIME_TYPE);
        }
        Exception exc = null;
        while (!arrayList.isEmpty()) {
            try {
                String str = (String) arrayList.remove(0);
                mediaFormat.setString("mime", str);
                return MediaCodec.createDecoderByType(str);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new RuntimeException(exc);
    }

    private static String glslFloat(float f10) {
        boolean z10 = f10 < 0.0f;
        if (z10) {
            f10 = -f10;
        }
        long round = Math.round(f10 * 1000000.0f);
        long j10 = round / 1000000;
        long j11 = round % 1000000;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        sb2.append(j10);
        sb2.append('.');
        String valueOf = String.valueOf(j11);
        for (int length = valueOf.length(); length < 6; length++) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    private static String hdrFragmentShader(int i9, int i10, int i11, int i12, boolean z10, z7 z7Var, int i13, boolean z11) {
        if (!z10) {
            return createFragmentShader(i9, i10, i11, i12, false, i13, z11);
        }
        float f10 = i9;
        float f11 = f10 / (z11 ? i12 : i11);
        float f12 = i10;
        float f13 = f12 / (z11 ? i11 : i12);
        int max = Math.max(1, Math.round(f11));
        int max2 = Math.max(1, Math.round(f13));
        if (SharedConfig.deviceIsAverage()) {
            max = 1;
            max2 = 1;
        }
        int min = Math.min(i13, max);
        int min2 = Math.min(i13, max2);
        float f14 = f11 / min;
        float f15 = f13 / min2;
        float f16 = (-(min - 1)) / 2.0f;
        float f17 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f16 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f17 += 0.01f;
        }
        StringBuilder o6 = e2.c.o("HDR source size ", i9, "x", i10, "    dest size ");
        r0.y(o6, i11, "x", i12, "   rotated ");
        o6.append(z11);
        o6.append("   ratio ");
        o6.append(f11);
        o6.append("x");
        o6.append(f13);
        o6.append("   samples ");
        o6.append(min);
        o6.append("x");
        o6.append(min2);
        o6.append("   kernel scale ");
        o6.append(f14);
        o6.append("x");
        o6.append(f15);
        FileLog.d(o6.toString());
        String glslFloat = glslFloat(f16);
        String glslFloat2 = glslFloat(f17);
        String glslFloat3 = glslFloat(f14);
        String glslFloat4 = glslFloat(f15);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f10);
        String glslFloat7 = glslFloat(1.0f / f12);
        String readRes = z7Var.a() == 1 ? AndroidUtilities.readRes(R.raw.hdr2sdr_hlg) : AndroidUtilities.readRes(R.raw.hdr2sdr_pq);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(readRes);
        sb2.append("\nvarying vec2 vTextureCoord;\nconst float offsetX = ");
        sb2.append(glslFloat);
        sb2.append(";\nconst float offsetY = ");
        sb2.append(glslFloat2);
        r0.A(sb2, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        r0.A(sb2, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
        sb2.append(";\nconst float pixelSizeY = ");
        sb2.append(glslFloat7);
        sb2.append(";\nvoid main() {\n    vec3 accumulation = vec3(0.0);\n    for (int i = 0; i < ");
        sb2.append(min);
        sb2.append("; ++i) {\n        for (int j = 0; j < ");
        sb2.append(min2);
        sb2.append("; ++j) {\n            float x = (offsetX + float(i)) * kernelScaleX;\n            float y = (offsetY + float(j)) * kernelScaleY;\n            vec2 uv = vTextureCoord + vec2(\n                    x * pixelSizeX,\n                    y * pixelSizeY\n            );\n            accumulation += TEX(uv).rgb;\n        }\n    }\n    gl_FragColor = vec4(accumulation / weightsum, 1.0);\n}\n");
        return sb2.toString();
    }

    private boolean isMediatekAvcEncoder(MediaCodec mediaCodec) {
        return mediaCodec.getName().equals("c2.mtk.avc.encoder");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        if (r14[r4 + 3] != 1) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long readAndWriteTracks(MediaExtractor mediaExtractor, Muxer muxer, MediaCodec.BufferInfo bufferInfo, long j10, long j11, long j12, File file, boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        byte[] array;
        int i16;
        int i17;
        int i18;
        int i19 = 0;
        int findTrack = MediaController.findTrack(mediaExtractor, false);
        int findTrack2 = z10 ? MediaController.findTrack(mediaExtractor, true) : -1;
        float f10 = j12 / 1000.0f;
        if (findTrack >= 0) {
            mediaExtractor.selectTrack(findTrack);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
            i10 = muxer.addTrack(trackFormat, false);
            try {
                i18 = trackFormat.getInteger("max-input-size");
            } catch (Exception e10) {
                FileLog.e(e10);
                i18 = 0;
            }
            if (j10 > 0) {
                mediaExtractor.seekTo(j10, 0);
            } else {
                mediaExtractor.seekTo(0L, 0);
            }
            i9 = i18;
        } else {
            i9 = 0;
            i10 = -1;
        }
        if (findTrack2 >= 0) {
            mediaExtractor.selectTrack(findTrack2);
            MediaFormat trackFormat2 = mediaExtractor.getTrackFormat(findTrack2);
            if (trackFormat2.getString("mime").equals("audio/unknown")) {
                i11 = -1;
                findTrack2 = -1;
            } else {
                i11 = muxer.addTrack(trackFormat2, true);
                try {
                    i9 = Math.max(trackFormat2.getInteger("max-input-size"), i9);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (j10 > 0) {
                    mediaExtractor.seekTo(j10, 0);
                } else {
                    mediaExtractor.seekTo(0L, 0);
                }
            }
        } else {
            i11 = -1;
        }
        if (i9 <= 0) {
            i9 = 65536;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i9);
        long j13 = -1;
        if (findTrack2 < 0 && findTrack < 0) {
            return -1L;
        }
        checkConversionCanceled();
        long j14 = -1;
        boolean z12 = false;
        long j15 = 0;
        while (!z12) {
            checkConversionCanceled();
            long j16 = j13;
            if (Build.VERSION.SDK_INT >= 28) {
                long sampleSize = mediaExtractor.getSampleSize();
                i12 = findTrack2;
                if (sampleSize > i9) {
                    int i20 = (int) (sampleSize + 1024);
                    i9 = i20;
                    allocateDirect = ByteBuffer.allocateDirect(i20);
                }
            } else {
                i12 = findTrack2;
            }
            bufferInfo.size = mediaExtractor.readSampleData(allocateDirect, i19);
            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
            if (sampleTrackIndex == findTrack) {
                findTrack2 = i12;
                i13 = i10;
            } else {
                findTrack2 = i12;
                i13 = sampleTrackIndex == findTrack2 ? i11 : -1;
            }
            if (i13 != -1) {
                if (sampleTrackIndex != findTrack2 && (array = allocateDirect.array()) != null) {
                    int arrayOffset = allocateDirect.arrayOffset();
                    int limit = allocateDirect.limit() + arrayOffset;
                    int i21 = arrayOffset;
                    int i22 = -1;
                    while (true) {
                        int i23 = limit - 4;
                        if (i21 > i23) {
                            break;
                        }
                        if (array[i21] == 0 && array[i21 + 1] == 0 && array[i21 + 2] == 0) {
                            i16 = i11;
                            i17 = i9;
                        } else {
                            i16 = i11;
                            i17 = i9;
                        }
                        if (i21 != i23) {
                            i21++;
                            i11 = i16;
                            i9 = i17;
                        }
                        if (i22 != -1) {
                            int i24 = (i21 - i22) - (i21 != i23 ? 4 : 0);
                            array[i22] = (byte) (i24 >> 24);
                            array[i22 + 1] = (byte) (i24 >> 16);
                            array[i22 + 2] = (byte) (i24 >> 8);
                            array[i22 + 3] = (byte) i24;
                        }
                        i22 = i21;
                        i21++;
                        i11 = i16;
                        i9 = i17;
                    }
                }
                i14 = i11;
                i15 = i9;
                if (bufferInfo.size >= 0) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    z11 = false;
                } else {
                    bufferInfo.size = 0;
                    z11 = true;
                }
                if (bufferInfo.size > 0 && !z11) {
                    if (sampleTrackIndex == findTrack && j10 > 0 && j14 == j16) {
                        j14 = bufferInfo.presentationTimeUs;
                    }
                    if (j11 < 0 || bufferInfo.presentationTimeUs < j11) {
                        bufferInfo.offset = 0;
                        bufferInfo.flags = mediaExtractor.getSampleFlags();
                        long writeSampleData = muxer.writeSampleData(i13, allocateDirect, bufferInfo, false);
                        if (writeSampleData != 0) {
                            MediaController.VideoConvertorListener videoConvertorListener = this.callback;
                            if (videoConvertorListener != null) {
                                long j17 = bufferInfo.presentationTimeUs;
                                if (j17 - j14 > j15) {
                                    j15 = j17 - j14;
                                }
                                long j18 = j15;
                                videoConvertorListener.didWriteData(writeSampleData, (j18 / 1000.0f) / f10);
                                j15 = j18;
                            }
                            if (!z11) {
                                mediaExtractor.advance();
                            }
                        }
                        if (!z11) {
                        }
                    } else {
                        z11 = true;
                    }
                }
                if (!z11) {
                }
            } else {
                i14 = i11;
                i15 = i9;
                if (sampleTrackIndex == -1) {
                    z11 = true;
                } else {
                    mediaExtractor.advance();
                    z11 = false;
                }
            }
            if (z11) {
                z12 = true;
            }
            i11 = i14;
            j13 = j16;
            i9 = i15;
            i19 = 0;
        }
        if (findTrack >= 0) {
            mediaExtractor.unselectTrack(findTrack);
        }
        if (findTrack2 >= 0) {
            mediaExtractor.unselectTrack(findTrack2);
        }
        return j14;
    }

    public boolean convertVideo(ConvertVideoParams convertVideoParams) {
        if (convertVideoParams.isSticker) {
            return WebmEncoder.convert(convertVideoParams, 0);
        }
        this.callback = convertVideoParams.callback;
        return convertVideoInternal(convertVideoParams, false, 0);
    }

    public long getLastFrameTimestamp() {
        return this.endPresentationTime;
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Muxer {
        public final MediaMuxer mediaMuxer;
        public final MP4Builder mp4Builder;
        private boolean started;

        public Muxer(MP4Builder mP4Builder) {
            this.started = false;
            this.mp4Builder = mP4Builder;
            this.mediaMuxer = null;
        }

        public int addTrack(MediaFormat mediaFormat, boolean z10) {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                return mediaMuxer.addTrack(mediaFormat);
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.addTrack(mediaFormat, z10);
            }
            return 0;
        }

        public void finishMovie() {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.mediaMuxer.release();
            } else {
                MP4Builder mP4Builder = this.mp4Builder;
                if (mP4Builder != null) {
                    mP4Builder.finishMovie();
                }
            }
        }

        public long getLastFrameTimestamp(int i9, MediaCodec.BufferInfo bufferInfo) {
            if (this.mediaMuxer != null) {
                return bufferInfo.presentationTimeUs;
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.getLastFrameTimestamp(i9);
            }
            return 0L;
        }

        public void start() {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.start();
            }
        }

        public long writeSampleData(int i9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer == null) {
                MP4Builder mP4Builder = this.mp4Builder;
                if (mP4Builder != null) {
                    return mP4Builder.writeSampleData(i9, byteBuffer, bufferInfo, z10);
                }
                return 0L;
            }
            if (!this.started) {
                mediaMuxer.start();
                this.started = true;
            }
            this.mediaMuxer.writeSampleData(i9, byteBuffer, bufferInfo);
            return 0L;
        }

        public Muxer(MediaMuxer mediaMuxer) {
            this.started = false;
            this.mp4Builder = null;
            this.mediaMuxer = mediaMuxer;
        }
    }
}

package org.telegram.messenger.video;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import com.google.android.gms.internal.vision.e2;
import di.n8;
import di.t;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public class ConversionCanceledException extends RuntimeException {
        public ConversionCanceledException() {
            super("canceled conversion");
        }
    }

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static class ConvertVideoParams {
        int account;
        long avatarStartTime;
        String backgroundPath;
        int bitrate;
        String blurPath;
        File cacheFile;
        MediaController.VideoConvertorListener callback;
        t collage;
        ArrayList<VideoEditedInfo.Part> collageParts;
        MediaController.CropState cropState;
        long duration;
        long endTime;
        int framerate;
        Integer gradientBottomColor;
        Integer gradientTopColor;
        n8 hdrInfo;
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

        public static ConvertVideoParams of(String str, File file, long j3, int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j10, long j11, long j12, boolean z11, long j13, MediaController.VideoConvertorListener videoConvertorListener, VideoEditedInfo videoEditedInfo) {
            ConvertVideoParams convertVideoParams = new ConvertVideoParams();
            convertVideoParams.videoPath = str;
            convertVideoParams.videoOffset = j3;
            convertVideoParams.cacheFile = file;
            convertVideoParams.rotationValue = i10;
            convertVideoParams.isSecret = z10;
            convertVideoParams.originalWidth = i11;
            convertVideoParams.originalHeight = i12;
            convertVideoParams.resultWidth = i13;
            convertVideoParams.resultHeight = i14;
            convertVideoParams.framerate = i15;
            convertVideoParams.bitrate = i16;
            convertVideoParams.originalBitrate = i17;
            convertVideoParams.startTime = j10;
            convertVideoParams.endTime = j11;
            convertVideoParams.avatarStartTime = j12;
            convertVideoParams.needCompress = z11;
            convertVideoParams.duration = j13;
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

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    private static void applyAudioInputs(ArrayList<MixedSoundInfo> arrayList, ArrayList<ag.a> arrayList2) {
        if (arrayList == null) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MixedSoundInfo mixedSoundInfo = arrayList.get(i10);
            try {
                ag.c cVar = new ag.c(mixedSoundInfo.audioFile);
                AudioDecoder audioDecoder = cVar.b;
                cVar.a = Math.max(0.0f, Math.min(mixedSoundInfo.volume, 1.0f));
                long j3 = mixedSoundInfo.startTime;
                if (j3 > 0) {
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    cVar.d = j3;
                }
                long j10 = mixedSoundInfo.audioOffset;
                if (j10 > 0) {
                    audioDecoder.setStartTimeUs(j10);
                } else {
                    j10 = 0;
                }
                long j11 = mixedSoundInfo.duration;
                if (j11 > 0) {
                    audioDecoder.setEndTimeUs(j10 + j11);
                }
                arrayList2.add(cVar);
            } catch (Exception e7) {
                FileLog.e(e7);
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
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r1v183 ??), method size: 7788
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
            Method dump skipped, instructions count: 7788
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

    private static String createFragmentShader(int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11) {
        float f7 = i10;
        float f10 = f7 / (z11 ? i13 : i12);
        float f11 = i11;
        float f12 = f11 / (z11 ? i12 : i13);
        int i15 = 1;
        int max = Math.max(1, Math.round(f10));
        int max2 = Math.max(1, Math.round(f12));
        if (SharedConfig.deviceIsAverage()) {
            max2 = 1;
        } else {
            i15 = max;
        }
        int min = Math.min(i14, i15);
        int min2 = Math.min(i14, max2);
        float f13 = f10 / min;
        float f14 = f12 / min2;
        float f15 = (-(min - 1)) / 2.0f;
        float f16 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f15 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f16 += 0.01f;
        }
        StringBuilder k10 = e2.k("source size ", i10, "x", i11, "    dest size ");
        i2.g.v(k10, i12, "x", i13, "   rotated ");
        k10.append(z11);
        k10.append("   ratio ");
        k10.append(f10);
        k10.append("x");
        k10.append(f12);
        k10.append("   samples ");
        k10.append(min);
        k10.append("x");
        k10.append(min2);
        k10.append("   kernel scale ");
        k10.append(f13);
        k10.append("x");
        k10.append(f14);
        FileLog.d(k10.toString());
        String glslFloat = glslFloat(f15);
        String glslFloat2 = glslFloat(f16);
        String glslFloat3 = glslFloat(f13);
        String glslFloat4 = glslFloat(f14);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f7);
        String glslFloat7 = glslFloat(1.0f / f11);
        String str = z10 ? "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\n" : "uniform sampler2D sTexture;\n";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("precision highp float;\nvarying vec2 vTextureCoord;\nconst float offsetX = ");
        sb2.append(glslFloat);
        sb2.append(";\nconst float offsetY = ");
        sb2.append(glslFloat2);
        a4.a.z(sb2, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        a4.a.z(sb2, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
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
        int i10 = str.equals("video/hevc") ? 3 : 1;
        if (bufferInfo.size > 100) {
            byteBuffer.position(bufferInfo.offset);
            byte[] bArr = new byte[100];
            byteBuffer.get(bArr);
            int i11 = 0;
            for (int i12 = 0; i12 < 96; i12++) {
                if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 0 && bArr[i12 + 3] == 1 && (i11 = i11 + 1) > i10) {
                    bufferInfo.offset += i12;
                    bufferInfo.size -= i12;
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
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
        throw new RuntimeException(exc);
    }

    private static String glslFloat(float f7) {
        boolean z10 = f7 < 0.0f;
        if (z10) {
            f7 = -f7;
        }
        long round = Math.round(f7 * 1000000.0f);
        long j3 = round / 1000000;
        long j10 = round % 1000000;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        sb2.append(j3);
        sb2.append('.');
        String valueOf = String.valueOf(j10);
        for (int length = valueOf.length(); length < 6; length++) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    private static String hdrFragmentShader(int i10, int i11, int i12, int i13, boolean z10, n8 n8Var, int i14, boolean z11) {
        if (!z10) {
            return createFragmentShader(i10, i11, i12, i13, false, i14, z11);
        }
        float f7 = i10;
        float f10 = f7 / (z11 ? i13 : i12);
        float f11 = i11;
        float f12 = f11 / (z11 ? i12 : i13);
        int max = Math.max(1, Math.round(f10));
        int max2 = Math.max(1, Math.round(f12));
        if (SharedConfig.deviceIsAverage()) {
            max = 1;
            max2 = 1;
        }
        int min = Math.min(i14, max);
        int min2 = Math.min(i14, max2);
        float f13 = f10 / min;
        float f14 = f12 / min2;
        float f15 = (-(min - 1)) / 2.0f;
        float f16 = (-(min2 - 1)) / 2.0f;
        if ((min & 1) == 0) {
            f15 += 0.01f;
        }
        if ((min2 & 1) == 0) {
            f16 += 0.01f;
        }
        StringBuilder k10 = e2.k("HDR source size ", i10, "x", i11, "    dest size ");
        i2.g.v(k10, i12, "x", i13, "   rotated ");
        k10.append(z11);
        k10.append("   ratio ");
        k10.append(f10);
        k10.append("x");
        k10.append(f12);
        k10.append("   samples ");
        k10.append(min);
        k10.append("x");
        k10.append(min2);
        k10.append("   kernel scale ");
        k10.append(f13);
        k10.append("x");
        k10.append(f14);
        FileLog.d(k10.toString());
        String glslFloat = glslFloat(f15);
        String glslFloat2 = glslFloat(f16);
        String glslFloat3 = glslFloat(f13);
        String glslFloat4 = glslFloat(f14);
        String glslFloat5 = glslFloat(min * min2);
        String glslFloat6 = glslFloat(1.0f / f7);
        String glslFloat7 = glslFloat(1.0f / f11);
        String readRes = n8Var.a() == 1 ? AndroidUtilities.readRes(R.raw.hdr2sdr_hlg) : AndroidUtilities.readRes(R.raw.hdr2sdr_pq);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(readRes);
        sb2.append("\nvarying vec2 vTextureCoord;\nconst float offsetX = ");
        sb2.append(glslFloat);
        sb2.append(";\nconst float offsetY = ");
        sb2.append(glslFloat2);
        a4.a.z(sb2, ";\nconst float kernelScaleX = ", glslFloat3, ";\nconst float kernelScaleY = ", glslFloat4);
        a4.a.z(sb2, ";\nconst float weightsum = ", glslFloat5, ";\nconst float pixelSizeX = ", glslFloat6);
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
    private long readAndWriteTracks(MediaExtractor mediaExtractor, Muxer muxer, MediaCodec.BufferInfo bufferInfo, long j3, long j10, long j11, File file, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        byte[] array;
        int i17;
        int i18;
        int i19;
        int i20 = 0;
        int findTrack = MediaController.findTrack(mediaExtractor, false);
        int findTrack2 = z10 ? MediaController.findTrack(mediaExtractor, true) : -1;
        float f7 = j11 / 1000.0f;
        if (findTrack >= 0) {
            mediaExtractor.selectTrack(findTrack);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
            i11 = muxer.addTrack(trackFormat, false);
            try {
                i19 = trackFormat.getInteger("max-input-size");
            } catch (Exception e7) {
                FileLog.e(e7);
                i19 = 0;
            }
            if (j3 > 0) {
                mediaExtractor.seekTo(j3, 0);
            } else {
                mediaExtractor.seekTo(0L, 0);
            }
            i10 = i19;
        } else {
            i10 = 0;
            i11 = -1;
        }
        if (findTrack2 >= 0) {
            mediaExtractor.selectTrack(findTrack2);
            MediaFormat trackFormat2 = mediaExtractor.getTrackFormat(findTrack2);
            if (trackFormat2.getString("mime").equals("audio/unknown")) {
                i12 = -1;
                findTrack2 = -1;
            } else {
                i12 = muxer.addTrack(trackFormat2, true);
                try {
                    i10 = Math.max(trackFormat2.getInteger("max-input-size"), i10);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (j3 > 0) {
                    mediaExtractor.seekTo(j3, 0);
                } else {
                    mediaExtractor.seekTo(0L, 0);
                }
            }
        } else {
            i12 = -1;
        }
        if (i10 <= 0) {
            i10 = 65536;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10);
        long j12 = -1;
        if (findTrack2 < 0 && findTrack < 0) {
            return -1L;
        }
        checkConversionCanceled();
        long j13 = -1;
        boolean z12 = false;
        long j14 = 0;
        while (!z12) {
            checkConversionCanceled();
            long j15 = j12;
            if (Build.VERSION.SDK_INT >= 28) {
                long sampleSize = mediaExtractor.getSampleSize();
                i13 = findTrack2;
                if (sampleSize > i10) {
                    int i21 = (int) (sampleSize + 1024);
                    i10 = i21;
                    allocateDirect = ByteBuffer.allocateDirect(i21);
                }
            } else {
                i13 = findTrack2;
            }
            bufferInfo.size = mediaExtractor.readSampleData(allocateDirect, i20);
            int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
            if (sampleTrackIndex == findTrack) {
                findTrack2 = i13;
                i14 = i11;
            } else {
                findTrack2 = i13;
                i14 = sampleTrackIndex == findTrack2 ? i12 : -1;
            }
            if (i14 != -1) {
                if (sampleTrackIndex != findTrack2 && (array = allocateDirect.array()) != null) {
                    int arrayOffset = allocateDirect.arrayOffset();
                    int limit = allocateDirect.limit() + arrayOffset;
                    int i22 = arrayOffset;
                    int i23 = -1;
                    while (true) {
                        int i24 = limit - 4;
                        if (i22 > i24) {
                            break;
                        }
                        if (array[i22] == 0 && array[i22 + 1] == 0 && array[i22 + 2] == 0) {
                            i17 = i12;
                            i18 = i10;
                        } else {
                            i17 = i12;
                            i18 = i10;
                        }
                        if (i22 != i24) {
                            i22++;
                            i12 = i17;
                            i10 = i18;
                        }
                        if (i23 != -1) {
                            int i25 = (i22 - i23) - (i22 != i24 ? 4 : 0);
                            array[i23] = (byte) (i25 >> 24);
                            array[i23 + 1] = (byte) (i25 >> 16);
                            array[i23 + 2] = (byte) (i25 >> 8);
                            array[i23 + 3] = (byte) i25;
                        }
                        i23 = i22;
                        i22++;
                        i12 = i17;
                        i10 = i18;
                    }
                }
                i15 = i12;
                i16 = i10;
                if (bufferInfo.size >= 0) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    z11 = false;
                } else {
                    bufferInfo.size = 0;
                    z11 = true;
                }
                if (bufferInfo.size > 0 && !z11) {
                    if (sampleTrackIndex == findTrack && j3 > 0 && j13 == j15) {
                        j13 = bufferInfo.presentationTimeUs;
                    }
                    if (j10 < 0 || bufferInfo.presentationTimeUs < j10) {
                        bufferInfo.offset = 0;
                        bufferInfo.flags = mediaExtractor.getSampleFlags();
                        long writeSampleData = muxer.writeSampleData(i14, allocateDirect, bufferInfo, false);
                        if (writeSampleData != 0) {
                            MediaController.VideoConvertorListener videoConvertorListener = this.callback;
                            if (videoConvertorListener != null) {
                                long j16 = bufferInfo.presentationTimeUs;
                                if (j16 - j13 > j14) {
                                    j14 = j16 - j13;
                                }
                                long j17 = j14;
                                videoConvertorListener.didWriteData(writeSampleData, (j17 / 1000.0f) / f7);
                                j14 = j17;
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
                i15 = i12;
                i16 = i10;
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
            i12 = i15;
            j12 = j15;
            i10 = i16;
            i20 = 0;
        }
        if (findTrack >= 0) {
            mediaExtractor.unselectTrack(findTrack);
        }
        if (findTrack2 >= 0) {
            mediaExtractor.unselectTrack(findTrack2);
        }
        return j13;
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

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

        public long getLastFrameTimestamp(int i10, MediaCodec.BufferInfo bufferInfo) {
            if (this.mediaMuxer != null) {
                return bufferInfo.presentationTimeUs;
            }
            MP4Builder mP4Builder = this.mp4Builder;
            if (mP4Builder != null) {
                return mP4Builder.getLastFrameTimestamp(i10);
            }
            return 0L;
        }

        public void start() {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.start();
            }
        }

        public long writeSampleData(int i10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z10) {
            MediaMuxer mediaMuxer = this.mediaMuxer;
            if (mediaMuxer == null) {
                MP4Builder mP4Builder = this.mp4Builder;
                if (mP4Builder != null) {
                    return mP4Builder.writeSampleData(i10, byteBuffer, bufferInfo, z10);
                }
                return 0L;
            }
            if (!this.started) {
                mediaMuxer.start();
                this.started = true;
            }
            this.mediaMuxer.writeSampleData(i10, byteBuffer, bufferInfo);
            return 0L;
        }

        public Muxer(MediaMuxer mediaMuxer) {
            this.started = false;
            this.mp4Builder = null;
            this.mediaMuxer = mediaMuxer;
        }
    }
}

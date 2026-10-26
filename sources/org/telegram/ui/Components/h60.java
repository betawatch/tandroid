package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.bluetooth.BluetoothAdapter;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Looper;
import android.util.Property;
import android.view.Surface;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h60 implements Runnable {
    public DispatchQueue B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final /* synthetic */ o60 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.c T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile c60 Y;
    public long Z;
    public u50 a;
    public boolean a0;
    public File b;
    public long b0;
    public boolean c;
    public int d;
    public long d0;
    public int e;
    public long e0;
    public int f;
    public long f0;
    public boolean l0;
    public int m0;
    public boolean n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public Surface r;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public EGLContext w;
    public EGLConfig x;
    public n50 x0;
    public AudioRecord y0;
    public boolean h = true;
    public EGLDisplay s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface y = EGL14.EGL_NO_SURFACE;
    public final ArrayList L = new ArrayList();
    public int M = -5;
    public int N = -5;
    public long P = -1;
    public long R = 0;
    public long S = -1;
    public final Object U = new Object();
    public long c0 = -1;
    public long g0 = -1;
    public long h0 = -1;
    public long i0 = -1;
    public long j0 = 0;
    public long k0 = -1;
    public Integer w0 = 0;
    public final ArrayBlockingQueue z0 = new ArrayBlockingQueue(10);
    public final ArrayList A0 = new ArrayList();
    public final g60 E0 = new g60(this, 0);

    public h60(o60 o60Var) {
        this.H0 = o60Var;
    }

    public static void a(h60 h60Var, boolean z10) {
        long j10;
        int i10;
        g(true);
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 3584;
            }
            int i11 = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * 4096 : 49152;
            h60Var.z0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                h60Var.z0.add(new w50());
            }
            if (z10) {
                h60Var.g0 = h60Var.d0 + h60Var.e0;
                h60Var.k0 = h60Var.i0 + h60Var.j0;
                h60Var.Q = true;
                j10 = 0;
            } else {
                h60Var.g0 = -1L;
                h60Var.k0 = -1L;
                j10 = 0;
                h60Var.R = 0L;
            }
            h60Var.S = -1L;
            h60Var.O = j10;
            h60Var.P = -1L;
            h60Var.h0 = -1L;
            h60Var.c0 = -1L;
            h60Var.d0 = -1L;
            h60Var.f0 = -1L;
            h60Var.i0 = -1L;
            h60Var.a0 = false;
            h60Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i11);
            h60Var.y0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + h60Var.y0.getChannelCount() + " sample rate = " + h60Var.y0.getSampleRate() + " bufferSize = " + i11);
            }
            h60Var.D0 = false;
            Thread thread = new Thread(h60Var.E0);
            thread.setPriority(10);
            thread.start();
            h60Var.J = new MediaCodec.BufferInfo();
            h60Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", MediaController.AUDIO_MIME_TYPE);
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(h60Var.H0.f).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MediaController.AUDIO_MIME_TYPE);
            h60Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            h60Var.F.start();
            h60Var.E = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
            h60Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MediaController.VIDEO_MIME_TYPE, h60Var.d, h60Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", h60Var.f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            h60Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            h60Var.r = h60Var.E.createInputSurface();
            h60Var.E.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(h60Var.a);
                h60Var.b = h60Var.a;
                if (isSdCardPath) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                        h60Var.b = file;
                        if (file.exists()) {
                            h60Var.b.delete();
                        }
                        h60Var.c = true;
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        h60Var.b = h60Var.a;
                        h60Var.c = false;
                    }
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(h60Var.b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(h60Var.d, h60Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, h60Var.H0.R, false);
                h60Var.K = createMovie;
                o60 o60Var = h60Var.H0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                o60Var.a1 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new d60(0, h60Var, z10));
            if (h60Var.s != EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("EGL already set up");
            }
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            h60Var.s = eglGetDisplay;
            if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                h60Var.s = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            if (h60Var.v == EGL14.EGL_NO_CONTEXT) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(h60Var.s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                i10 = 0;
                h60Var.v = EGL14.eglCreateContext(h60Var.s, eGLConfigArr[0], h60Var.w, new int[]{12440, 2, 12344}, 0);
                h60Var.x = eGLConfigArr[0];
            } else {
                i10 = 0;
            }
            EGL14.eglQueryContext(h60Var.s, h60Var.v, 12440, new int[1], i10);
            if (h60Var.y != EGL14.EGL_NO_SURFACE) {
                throw new IllegalStateException("surface already created");
            }
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(h60Var.s, h60Var.x, h60Var.r, new int[]{12344}, i10);
            h60Var.y = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                throw new RuntimeException("surface was null");
            }
            if (!EGL14.eglMakeCurrent(h60Var.s, eglCreateWindowSurface, eglCreateWindowSurface, h60Var.v)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                throw new RuntimeException("eglMakeCurrent failed");
            }
            GLES20.glBlendFunc(770, 771);
            n50 n50Var = h60Var.x0;
            if (n50Var != null) {
                n50Var.b();
                h60Var.x0 = null;
            }
            h60Var.x0 = new n50(h60Var.d, h60Var.e);
            o60 o60Var2 = h60Var.H0;
            Size size = o60Var2.n0[0];
            String str = (SharedConfig.deviceIsLow() || !o60.k() || (size != null && ((float) Math.max(size.getHeight(), size.getWidth())) * 0.7f < ((float) MessagesController.getInstance(o60Var2.f).roundVideoSize))) ? "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n" : "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
            int j11 = o60.j(h60Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
            int j12 = o60.j(h60Var.H0, 35632, str);
            if (j11 == 0 || j12 == 0) {
                return;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            h60Var.m0 = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, j11);
            GLES20.glAttachShader(h60Var.m0, j12);
            GLES20.glLinkProgram(h60Var.m0);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(h60Var.m0, 35714, iArr2, 0);
            if (iArr2[0] == 0) {
                GLES20.glDeleteProgram(h60Var.m0);
                h60Var.m0 = 0;
                return;
            }
            h60Var.p0 = GLES20.glGetAttribLocation(h60Var.m0, "aPosition");
            h60Var.q0 = GLES20.glGetAttribLocation(h60Var.m0, "aTextureCoord");
            h60Var.s0 = GLES20.glGetUniformLocation(h60Var.m0, "preview");
            h60Var.r0 = GLES20.glGetUniformLocation(h60Var.m0, "resolution");
            h60Var.u0 = GLES20.glGetUniformLocation(h60Var.m0, "alpha");
            h60Var.n0 = GLES20.glGetUniformLocation(h60Var.m0, "uMVPMatrix");
            h60Var.o0 = GLES20.glGetUniformLocation(h60Var.m0, "uSTMatrix");
            h60Var.t0 = GLES20.glGetUniformLocation(h60Var.m0, "texelSize");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(h60 h60Var, int i10, c60 c60Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 != 1 || (((videoEditedInfo = h60Var.H0.S) != null && videoEditedInfo.needConvert()) || h60Var.H0.n.c())) {
            z10 = true;
        } else {
            if (!h60Var.G0) {
                h60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new so(24, h60Var, c60Var));
            }
            z10 = false;
        }
        if (h60Var.W && !h60Var.D0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            h60Var.X = i10;
            h60Var.Y = c60Var;
            h60Var.W = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            h60Var.d(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaCodec mediaCodec = h60Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                h60Var.E.release();
                h60Var.E = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        MediaCodec mediaCodec2 = h60Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                h60Var.F.release();
                h60Var.F = null;
                g(false);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        File file = h60Var.H0.g0;
        if (file != null) {
            file.delete();
            h60Var.H0.g0 = null;
        }
        MP4Builder mP4Builder = h60Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (h60Var.c) {
                if (h60Var.a.exists()) {
                    try {
                        h60Var.a.delete();
                    } catch (Exception e13) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + h60Var.a);
                        FileLog.e(e13);
                    }
                }
                if (!h60Var.b.renameTo(h60Var.a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(h60Var.b, h60Var.a);
                        h60Var.b.delete();
                    } catch (IOException e14) {
                        FileLog.e(e14);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = h60Var.B0) != null) {
            dispatchQueue.cleanupQueue();
            h60Var.B0.recycle();
            h60Var.B0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(h60Var.H0.f).cancelFileUpload(h60Var.a.getAbsolutePath(), false);
            try {
                h60Var.b.delete();
            } catch (Throwable unused) {
            }
            try {
                h60Var.a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !h60Var.G0)) {
                h60Var.G0 = true;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(h60Var, i10, c60Var, 13));
            }
            AndroidUtilities.runOnUIThread(new e60(h60Var, 2));
        }
        EGL14.eglDestroySurface(h60Var.s, h60Var.y);
        h60Var.y = EGL14.EGL_NO_SURFACE;
        Surface surface = h60Var.r;
        if (surface != null) {
            surface.release();
            h60Var.r = null;
        }
        EGLDisplay eGLDisplay = h60Var.s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(h60Var.s, h60Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(h60Var.s);
        }
        h60Var.s = EGL14.EGL_NO_DISPLAY;
        h60Var.v = EGL14.EGL_NO_CONTEXT;
        h60Var.x = null;
        h60Var.T.getClass();
        Looper.myLooper().quit();
        n50 n50Var = h60Var.x0;
        if (n50Var != null) {
            n50Var.b();
            h60Var.x0 = null;
        }
        AndroidUtilities.runOnUIThread(new e60(h60Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (SharedConfig.recordViaSco && !xe0.d("android.permission.BLUETOOTH_CONNECT")) {
            SharedConfig.recordViaSco = false;
            SharedConfig.saveConfig();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && SharedConfig.recordViaSco) && z10) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                if (defaultAdapter.getProfileConnectionState(1) != 2) {
                }
                if (!z10 && !audioManager.isBluetoothScoOn()) {
                    audioManager.startBluetoothSco();
                    return;
                } else if (z10 && audioManager.isBluetoothScoOn()) {
                    audioManager.stopBluetoothSco();
                    return;
                }
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th2) {
                FileLog.e(th2);
                if (z10) {
                    return;
                }
                try {
                    if (audioManager.isBluetoothScoOn()) {
                        audioManager.stopBluetoothSco();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
        }
        if (z10) {
            return;
        }
        if (!z10) {
        }
        if (z10) {
        }
    }

    public final void c(u50 u50Var, long j10, boolean z10) {
        o60 o60Var = this.H0;
        int i10 = o60Var.f;
        if (!this.h) {
            FileLoader.getInstance(i10).checkUploadNewDataAvailable(u50Var.toString(), o60Var.R, j10, z10 ? u50Var.length() : 0L);
            return;
        }
        FileLoader.getInstance(i10).uploadFile(u50Var.toString(), o60Var.R, false, 1L, 33554432, false);
        this.h = false;
        if (z10) {
            FileLoader.getInstance(i10).checkUploadNewDataAvailable(u50Var.toString(), o60Var.R, j10, z10 ? u50Var.length() : 0L);
        }
    }

    public final void d(boolean z10) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (z10) {
            this.E.signalEndOfInputStream();
        }
        while (true) {
            int dequeueOutputBuffer = this.E.dequeueOutputBuffer(this.I, 10000L);
            byte b10 = 1;
            if (dequeueOutputBuffer == -1) {
                if (!z10 || this.D0) {
                    break;
                }
            } else if (dequeueOutputBuffer == -3) {
                continue;
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.E.getOutputFormat();
                if (this.M == -5) {
                    this.M = this.K.addTrack(outputFormat, false);
                    if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                        this.G = outputFormat.getByteBuffer("csd-1").limit() + outputFormat.getByteBuffer("csd-0").limit();
                    }
                }
            } else if (dequeueOutputBuffer < 0) {
                continue;
            } else {
                ByteBuffer outputBuffer = this.E.getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer == null) {
                    throw new RuntimeException(ic.a.j(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
                MediaCodec.BufferInfo bufferInfo = this.I;
                int i10 = bufferInfo.size;
                if (i10 > 1) {
                    int i11 = bufferInfo.flags;
                    if ((i11 & 2) == 0) {
                        int i12 = this.G;
                        if (i12 != 0 && (i11 & 1) != 0) {
                            bufferInfo.offset += i12;
                            bufferInfo.size = i10 - i12;
                        }
                        if (this.H && (i11 & 1) != 0) {
                            if (bufferInfo.size > 100) {
                                outputBuffer.position(bufferInfo.offset);
                                byte[] bArr = new byte[100];
                                outputBuffer.get(bArr);
                                int i13 = 0;
                                int i14 = 0;
                                while (true) {
                                    if (i13 < 96) {
                                        if (bArr[i13] == 0 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 0 && bArr[i13 + 3] == 1 && (i14 = i14 + 1) > 1) {
                                            MediaCodec.BufferInfo bufferInfo2 = this.I;
                                            bufferInfo2.offset += i13;
                                            bufferInfo2.size -= i13;
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        break;
                                    }
                                }
                            }
                            this.H = false;
                        }
                        long writeSampleData = this.K.writeSampleData(this.M, outputBuffer, this.I, true);
                        if (writeSampleData != 0 && !this.c && this.H0.a1) {
                            c(this.a, writeSampleData, false);
                        }
                    } else if (this.M == -5) {
                        byte[] bArr2 = new byte[i10];
                        outputBuffer.limit(bufferInfo.offset + i10);
                        outputBuffer.position(this.I.offset);
                        outputBuffer.get(bArr2);
                        int i15 = this.I.size - 1;
                        while (i15 >= 0 && i15 > 3) {
                            if (bArr2[i15] == b10 && bArr2[i15 - 1] == 0 && bArr2[i15 - 2] == 0) {
                                int i16 = i15 - 3;
                                if (bArr2[i16] == 0) {
                                    byteBuffer = ByteBuffer.allocate(i16);
                                    byteBuffer2 = ByteBuffer.allocate(this.I.size - i16);
                                    byteBuffer.put(bArr2, 0, i16).position(0);
                                    byteBuffer2.put(bArr2, i16, this.I.size - i16).position(0);
                                    break;
                                }
                            }
                            i15--;
                            b10 = 1;
                        }
                        byteBuffer = null;
                        byteBuffer2 = null;
                        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MediaController.VIDEO_MIME_TYPE, this.d, this.e);
                        if (byteBuffer != null && byteBuffer2 != null) {
                            createVideoFormat.setByteBuffer("csd-0", byteBuffer);
                            createVideoFormat.setByteBuffer("csd-1", byteBuffer2);
                        }
                        this.M = this.K.addTrack(createVideoFormat, false);
                    }
                }
                this.E.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((this.I.flags & 4) != 0) {
                    break;
                }
            }
        }
        while (true) {
            int dequeueOutputBuffer2 = this.F.dequeueOutputBuffer(this.J, 0L);
            if (dequeueOutputBuffer2 == -1) {
                if (!z10) {
                    return;
                }
                if ((!this.W && this.X == 0) || this.D0) {
                    return;
                }
            } else if (dequeueOutputBuffer2 != -3) {
                if (dequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat2 = this.F.getOutputFormat();
                    if (this.N == -5) {
                        this.N = this.K.addTrack(outputFormat2, true);
                    }
                } else if (dequeueOutputBuffer2 < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer2 = this.F.getOutputBuffer(dequeueOutputBuffer2);
                    if (outputBuffer2 == null) {
                        throw new RuntimeException(ic.a.j(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                    MediaCodec.BufferInfo bufferInfo3 = this.J;
                    if ((bufferInfo3.flags & 2) != 0) {
                        bufferInfo3.size = 0;
                    }
                    if (bufferInfo3.size != 0) {
                        long writeSampleData2 = this.K.writeSampleData(this.N, outputBuffer2, bufferInfo3, false);
                        if (writeSampleData2 != 0 && !this.c && this.H0.a1) {
                            c(this.a, writeSampleData2, false);
                        }
                        MediaCodec mediaCodec = this.F;
                        if (mediaCodec != null) {
                            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        }
                    } else {
                        MediaCodec mediaCodec2 = this.F;
                        if (mediaCodec2 != null) {
                            mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        }
                    }
                    if ((this.J.flags & 4) != 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j10) {
        synchronized (this.U) {
            try {
                if (this.V) {
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == 0) {
                        int i10 = this.v0 + 1;
                        this.v0 = i10;
                        if (i10 <= 1) {
                            return;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        this.v0 = 0;
                        j10 = timestamp;
                    }
                    this.T.sendMessage(this.T.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        n50 n50Var = this.x0;
        if (n50Var != null) {
            n50Var.b();
            this.x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.s, this.v);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.s);
                this.s = EGL14.EGL_NO_DISPLAY;
                this.v = EGL14.EGL_NO_CONTEXT;
                this.x = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        s81 s81Var = new s81();
        o60 o60Var = this.H0;
        o60Var.T = s81Var;
        s81Var.J = new jg.s0(this, 19);
        s81Var.V(o60Var.q0);
        o60Var.T.D(Uri.fromFile(file), "other");
        o60Var.T.C();
        o60Var.T.O(true);
        o60Var.s();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = o60Var.b1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(o60Var.r, v6.b, 0), ObjectAnimator.ofFloat(o60Var.G, (Property<ImageView, Float>) property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.s, this.y);
        this.y = EGL14.EGL_NO_SURFACE;
        Surface surface = this.r;
        if (surface != null) {
            surface.release();
            this.r = null;
        }
        EGLDisplay eGLDisplay = this.s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.s, this.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.s);
        }
        this.s = EGL14.EGL_NO_DISPLAY;
        this.v = EGL14.EGL_NO_CONTEXT;
        this.x = null;
    }

    public final void i(int i10, c60 c60Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i10, 0, c60Var));
        AndroidUtilities.runOnUIThread(new k5(15));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.prepare();
        synchronized (this.U) {
            g.c cVar = new g.c(1);
            cVar.b = new WeakReference(this);
            this.T = cVar;
            this.V = true;
            this.U.notify();
        }
        Looper.loop();
        synchronized (this.U) {
            this.V = false;
        }
    }
}

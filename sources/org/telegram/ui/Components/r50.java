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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r50 implements Runnable {
    public MediaCodec A;
    public MediaCodec B;
    public boolean B0;
    public int C;
    public boolean C0;
    public boolean D;
    public final /* synthetic */ s50 D0;
    public MediaCodec.BufferInfo E;
    public MediaCodec.BufferInfo F;
    public MP4Builder G;
    public long K;
    public boolean M;
    public volatile c2.w0 P;
    public volatile boolean R;
    public volatile boolean S;
    public volatile int T;
    public volatile n50 U;
    public long V;
    public boolean W;
    public long X;
    public long Z;
    public g50 a;
    public long a0;
    public File b;
    public long b0;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public boolean n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public Surface r;
    public int r0;
    public z40 t0;
    public AudioRecord u0;
    public EGLContext w;
    public EGLConfig x;
    public DispatchQueue x0;
    public int y0;
    public volatile boolean z0;
    public boolean h = true;
    public EGLDisplay s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface y = EGL14.EGL_NO_SURFACE;
    public final ArrayList H = new ArrayList();
    public int I = -5;
    public int J = -5;
    public long L = -1;
    public long N = 0;
    public long O = -1;
    public final Object Q = new Object();
    public long Y = -1;
    public long c0 = -1;
    public long d0 = -1;
    public long e0 = -1;
    public long f0 = 0;
    public long g0 = -1;
    public Integer s0 = 0;
    public final ArrayBlockingQueue v0 = new ArrayBlockingQueue(10);
    public final ArrayList w0 = new ArrayList();
    public final q50 A0 = new q50(this);

    public r50(s50 s50Var) {
        this.D0 = s50Var;
    }

    public static void a(r50 r50Var, boolean z10) {
        long j10;
        int i10;
        g(true);
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 3584;
            }
            int i11 = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * 4096 : 49152;
            r50Var.v0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                r50Var.v0.add(new h50());
            }
            if (z10) {
                r50Var.c0 = r50Var.Z + r50Var.a0;
                r50Var.g0 = r50Var.e0 + r50Var.f0;
                r50Var.M = true;
                j10 = 0;
            } else {
                r50Var.c0 = -1L;
                r50Var.g0 = -1L;
                j10 = 0;
                r50Var.N = 0L;
            }
            r50Var.O = -1L;
            r50Var.K = j10;
            r50Var.L = -1L;
            r50Var.d0 = -1L;
            r50Var.Y = -1L;
            r50Var.Z = -1L;
            r50Var.b0 = -1L;
            r50Var.e0 = -1L;
            r50Var.W = false;
            r50Var.V = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i11);
            r50Var.u0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + r50Var.u0.getChannelCount() + " sample rate = " + r50Var.u0.getSampleRate() + " bufferSize = " + i11);
            }
            r50Var.z0 = false;
            Thread thread = new Thread(r50Var.A0);
            thread.setPriority(10);
            thread.start();
            r50Var.F = new MediaCodec.BufferInfo();
            r50Var.E = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", MediaController.AUDIO_MIME_TYPE);
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(r50Var.D0.a).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MediaController.AUDIO_MIME_TYPE);
            r50Var.B = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            r50Var.B.start();
            r50Var.A = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
            r50Var.D = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MediaController.VIDEO_MIME_TYPE, r50Var.d, r50Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", r50Var.f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            r50Var.A.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            r50Var.r = r50Var.A.createInputSurface();
            r50Var.A.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(r50Var.a);
                r50Var.b = r50Var.a;
                if (isSdCardPath) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                        r50Var.b = file;
                        if (file.exists()) {
                            r50Var.b.delete();
                        }
                        r50Var.c = true;
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        r50Var.b = r50Var.a;
                        r50Var.c = false;
                    }
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(r50Var.b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(r50Var.d, r50Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, r50Var.D0.I, false);
                r50Var.G = createMovie;
                s50 s50Var = r50Var.D0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                s50Var.M0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new hh.f(29, r50Var, z10));
            if (r50Var.s != EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("EGL already set up");
            }
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            r50Var.s = eglGetDisplay;
            if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                r50Var.s = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            if (r50Var.v == EGL14.EGL_NO_CONTEXT) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(r50Var.s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                i10 = 0;
                r50Var.v = EGL14.eglCreateContext(r50Var.s, eGLConfigArr[0], r50Var.w, new int[]{12440, 2, 12344}, 0);
                r50Var.x = eGLConfigArr[0];
            } else {
                i10 = 0;
            }
            EGL14.eglQueryContext(r50Var.s, r50Var.v, 12440, new int[1], i10);
            if (r50Var.y != EGL14.EGL_NO_SURFACE) {
                throw new IllegalStateException("surface already created");
            }
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(r50Var.s, r50Var.x, r50Var.r, new int[]{12344}, i10);
            r50Var.y = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                throw new RuntimeException("surface was null");
            }
            if (!EGL14.eglMakeCurrent(r50Var.s, eglCreateWindowSurface, eglCreateWindowSurface, r50Var.v)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                throw new RuntimeException("eglMakeCurrent failed");
            }
            GLES20.glBlendFunc(770, 771);
            z40 z40Var = r50Var.t0;
            if (z40Var != null) {
                z40Var.b();
                r50Var.t0 = null;
            }
            r50Var.t0 = new z40(r50Var.d, r50Var.e);
            s50 s50Var2 = r50Var.D0;
            Size size = s50Var2.e0[0];
            String str = (SharedConfig.deviceIsLow() || !s50.b() || (size != null && ((float) Math.max(size.getHeight(), size.getWidth())) * 0.7f < ((float) MessagesController.getInstance(s50Var2.a).roundVideoSize))) ? "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n" : "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
            int a2 = s50.a(r50Var.D0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
            int a10 = s50.a(r50Var.D0, 35632, str);
            if (a2 == 0 || a10 == 0) {
                return;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            r50Var.i0 = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(r50Var.i0, a10);
            GLES20.glLinkProgram(r50Var.i0);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(r50Var.i0, 35714, iArr2, 0);
            if (iArr2[0] == 0) {
                GLES20.glDeleteProgram(r50Var.i0);
                r50Var.i0 = 0;
                return;
            }
            r50Var.l0 = GLES20.glGetAttribLocation(r50Var.i0, "aPosition");
            r50Var.m0 = GLES20.glGetAttribLocation(r50Var.i0, "aTextureCoord");
            r50Var.o0 = GLES20.glGetUniformLocation(r50Var.i0, "preview");
            r50Var.n0 = GLES20.glGetUniformLocation(r50Var.i0, "resolution");
            r50Var.q0 = GLES20.glGetUniformLocation(r50Var.i0, "alpha");
            r50Var.j0 = GLES20.glGetUniformLocation(r50Var.i0, "uMVPMatrix");
            r50Var.k0 = GLES20.glGetUniformLocation(r50Var.i0, "uSTMatrix");
            r50Var.p0 = GLES20.glGetUniformLocation(r50Var.i0, "texelSize");
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void b(r50 r50Var, int i10, n50 n50Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 != 1 || (((videoEditedInfo = r50Var.D0.J) != null && videoEditedInfo.needConvert()) || r50Var.D0.c.c())) {
            z10 = true;
        } else {
            if (!r50Var.C0) {
                r50Var.C0 = true;
                AndroidUtilities.runOnUIThread(new gt(16, r50Var, n50Var));
            }
            z10 = false;
        }
        if (r50Var.S && !r50Var.z0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            r50Var.T = i10;
            r50Var.U = n50Var;
            r50Var.S = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            r50Var.e(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        MediaCodec mediaCodec = r50Var.A;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                r50Var.A.release();
                r50Var.A = null;
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        MediaCodec mediaCodec2 = r50Var.B;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                r50Var.B.release();
                r50Var.B = null;
                g(false);
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        File file = r50Var.D0.U;
        if (file != null) {
            file.delete();
            r50Var.D0.U = null;
        }
        MP4Builder mP4Builder = r50Var.G;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e13) {
                FileLog.e(e13);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (r50Var.c) {
                if (r50Var.a.exists()) {
                    try {
                        r50Var.a.delete();
                    } catch (Exception e14) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + r50Var.a);
                        FileLog.e(e14);
                    }
                }
                if (!r50Var.b.renameTo(r50Var.a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(r50Var.b, r50Var.a);
                        r50Var.b.delete();
                    } catch (IOException e15) {
                        FileLog.e(e15);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = r50Var.x0) != null) {
            dispatchQueue.cleanupQueue();
            r50Var.x0.recycle();
            r50Var.x0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(r50Var.D0.a).cancelFileUpload(r50Var.a.getAbsolutePath(), false);
            try {
                r50Var.b.delete();
            } catch (Throwable unused) {
            }
            try {
                r50Var.a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i10 != 1 || !r50Var.C0)) {
                r50Var.C0 = true;
                AndroidUtilities.runOnUIThread(new rm(r50Var, i10, n50Var, 7));
            }
            AndroidUtilities.runOnUIThread(new o50(r50Var, 3));
        }
        EGL14.eglDestroySurface(r50Var.s, r50Var.y);
        r50Var.y = EGL14.EGL_NO_SURFACE;
        Surface surface = r50Var.r;
        if (surface != null) {
            surface.release();
            r50Var.r = null;
        }
        EGLDisplay eGLDisplay = r50Var.s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(r50Var.s, r50Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(r50Var.s);
        }
        r50Var.s = EGL14.EGL_NO_DISPLAY;
        r50Var.v = EGL14.EGL_NO_CONTEXT;
        r50Var.x = null;
        r50Var.P.getClass();
        Looper.myLooper().quit();
        z40 z40Var = r50Var.t0;
        if (z40Var != null) {
            z40Var.b();
            r50Var.t0 = null;
        }
        AndroidUtilities.runOnUIThread(new o50(r50Var, 4));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (SharedConfig.recordViaSco && !yd0.f("android.permission.BLUETOOTH_CONNECT")) {
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
                } catch (Exception e10) {
                    FileLog.e(e10);
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

    public final void c(g50 g50Var, long j10, boolean z10) {
        s50 s50Var = this.D0;
        int i10 = s50Var.a;
        if (!this.h) {
            FileLoader.getInstance(i10).checkUploadNewDataAvailable(g50Var.toString(), s50Var.I, j10, z10 ? g50Var.length() : 0L);
            return;
        }
        FileLoader.getInstance(i10).uploadFile(g50Var.toString(), s50Var.I, false, 1L, 33554432, false);
        this.h = false;
        if (z10) {
            FileLoader.getInstance(i10).checkUploadNewDataAvailable(g50Var.toString(), s50Var.I, j10, z10 ? g50Var.length() : 0L);
        }
    }

    public final void e(boolean z10) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (z10) {
            this.A.signalEndOfInputStream();
        }
        while (true) {
            int dequeueOutputBuffer = this.A.dequeueOutputBuffer(this.E, 10000L);
            byte b10 = 1;
            if (dequeueOutputBuffer == -1) {
                if (!z10 || this.z0) {
                    break;
                }
            } else if (dequeueOutputBuffer == -3) {
                continue;
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.A.getOutputFormat();
                if (this.I == -5) {
                    this.I = this.G.addTrack(outputFormat, false);
                    if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                        this.C = outputFormat.getByteBuffer("csd-1").limit() + outputFormat.getByteBuffer("csd-0").limit();
                    }
                }
            } else if (dequeueOutputBuffer < 0) {
                continue;
            } else {
                ByteBuffer outputBuffer = this.A.getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer == null) {
                    throw new RuntimeException(j7.l1.l(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
                MediaCodec.BufferInfo bufferInfo = this.E;
                int i10 = bufferInfo.size;
                if (i10 > 1) {
                    int i11 = bufferInfo.flags;
                    if ((i11 & 2) == 0) {
                        int i12 = this.C;
                        if (i12 != 0 && (i11 & 1) != 0) {
                            bufferInfo.offset += i12;
                            bufferInfo.size = i10 - i12;
                        }
                        if (this.D && (i11 & 1) != 0) {
                            if (bufferInfo.size > 100) {
                                outputBuffer.position(bufferInfo.offset);
                                byte[] bArr = new byte[100];
                                outputBuffer.get(bArr);
                                int i13 = 0;
                                int i14 = 0;
                                while (true) {
                                    if (i13 < 96) {
                                        if (bArr[i13] == 0 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 0 && bArr[i13 + 3] == 1 && (i14 = i14 + 1) > 1) {
                                            MediaCodec.BufferInfo bufferInfo2 = this.E;
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
                            this.D = false;
                        }
                        long writeSampleData = this.G.writeSampleData(this.I, outputBuffer, this.E, true);
                        if (writeSampleData != 0 && !this.c && this.D0.M0) {
                            c(this.a, writeSampleData, false);
                        }
                    } else if (this.I == -5) {
                        byte[] bArr2 = new byte[i10];
                        outputBuffer.limit(bufferInfo.offset + i10);
                        outputBuffer.position(this.E.offset);
                        outputBuffer.get(bArr2);
                        int i15 = this.E.size - 1;
                        while (i15 >= 0 && i15 > 3) {
                            if (bArr2[i15] == b10 && bArr2[i15 - 1] == 0 && bArr2[i15 - 2] == 0) {
                                int i16 = i15 - 3;
                                if (bArr2[i16] == 0) {
                                    byteBuffer = ByteBuffer.allocate(i16);
                                    byteBuffer2 = ByteBuffer.allocate(this.E.size - i16);
                                    byteBuffer.put(bArr2, 0, i16).position(0);
                                    byteBuffer2.put(bArr2, i16, this.E.size - i16).position(0);
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
                        this.I = this.G.addTrack(createVideoFormat, false);
                    }
                }
                this.A.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((this.E.flags & 4) != 0) {
                    break;
                }
            }
        }
        while (true) {
            int dequeueOutputBuffer2 = this.B.dequeueOutputBuffer(this.F, 0L);
            if (dequeueOutputBuffer2 == -1) {
                if (!z10) {
                    return;
                }
                if ((!this.S && this.T == 0) || this.z0) {
                    return;
                }
            } else if (dequeueOutputBuffer2 != -3) {
                if (dequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat2 = this.B.getOutputFormat();
                    if (this.J == -5) {
                        this.J = this.G.addTrack(outputFormat2, true);
                    }
                } else if (dequeueOutputBuffer2 < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer2 = this.B.getOutputBuffer(dequeueOutputBuffer2);
                    if (outputBuffer2 == null) {
                        throw new RuntimeException(j7.l1.l(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                    MediaCodec.BufferInfo bufferInfo3 = this.F;
                    if ((bufferInfo3.flags & 2) != 0) {
                        bufferInfo3.size = 0;
                    }
                    if (bufferInfo3.size != 0) {
                        long writeSampleData2 = this.G.writeSampleData(this.J, outputBuffer2, bufferInfo3, false);
                        if (writeSampleData2 != 0 && !this.c && this.D0.M0) {
                            c(this.a, writeSampleData2, false);
                        }
                        MediaCodec mediaCodec = this.B;
                        if (mediaCodec != null) {
                            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        }
                    } else {
                        MediaCodec mediaCodec2 = this.B;
                        if (mediaCodec2 != null) {
                            mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        }
                    }
                    if ((this.F.flags & 4) != 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j10) {
        synchronized (this.Q) {
            try {
                if (this.R) {
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == 0) {
                        int i10 = this.r0 + 1;
                        this.r0 = i10;
                        if (i10 <= 1) {
                            return;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        this.r0 = 0;
                        j10 = timestamp;
                    }
                    this.P.sendMessage(this.P.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        z40 z40Var = this.t0;
        if (z40Var != null) {
            z40Var.b();
            this.t0 = null;
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
        x61 x61Var = new x61();
        s50 s50Var = this.D0;
        s50Var.K = x61Var;
        x61Var.F = new n(this, 2);
        x61Var.W(s50Var.h0);
        s50Var.K.E(Uri.fromFile(file), "other");
        s50Var.K.D();
        s50Var.K.P(true);
        s50Var.n();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = s50Var.N0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(s50Var.d, r6.b, 0), ObjectAnimator.ofFloat(s50Var.w, (Property<ImageView, Float>) property, 1.0f));
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

    public final void i(int i10, n50 n50Var) {
        this.P.sendMessage(this.P.obtainMessage(1, i10, 0, n50Var));
        AndroidUtilities.runOnUIThread(new o50(this, 5));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.prepare();
        synchronized (this.Q) {
            c2.w0 w0Var = new c2.w0(2);
            w0Var.b = new WeakReference(this);
            this.P = w0Var;
            this.R = true;
            this.Q.notify();
        }
        Looper.loop();
        synchronized (this.Q) {
            this.R = false;
        }
    }
}

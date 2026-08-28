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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e50 implements Runnable {
    public MediaCodec A;
    public MediaCodec B;
    public boolean B0;
    public int C;
    public boolean C0;
    public boolean D;
    public final /* synthetic */ f50 D0;
    public MediaCodec.BufferInfo E;
    public MediaCodec.BufferInfo F;
    public MP4Builder G;
    public long K;
    public boolean M;
    public volatile c2.v0 P;
    public volatile boolean R;
    public volatile boolean S;
    public volatile int T;
    public volatile z40 U;
    public long V;
    public boolean W;
    public long X;
    public long Z;
    public s40 a;
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
    public l40 t0;
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
    public final d50 A0 = new d50(this);

    public e50(f50 f50Var) {
        this.D0 = f50Var;
    }

    public static void a(e50 e50Var, boolean z10) {
        long j10;
        int i9;
        g(true);
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 3584;
            }
            int i10 = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * 4096 : 49152;
            e50Var.v0.clear();
            for (int i11 = 0; i11 < 3; i11++) {
                e50Var.v0.add(new t40());
            }
            if (z10) {
                e50Var.c0 = e50Var.Z + e50Var.a0;
                e50Var.g0 = e50Var.e0 + e50Var.f0;
                e50Var.M = true;
                j10 = 0;
            } else {
                e50Var.c0 = -1L;
                e50Var.g0 = -1L;
                j10 = 0;
                e50Var.N = 0L;
            }
            e50Var.O = -1L;
            e50Var.K = j10;
            e50Var.L = -1L;
            e50Var.d0 = -1L;
            e50Var.Y = -1L;
            e50Var.Z = -1L;
            e50Var.b0 = -1L;
            e50Var.e0 = -1L;
            e50Var.W = false;
            e50Var.V = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i10);
            e50Var.u0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + e50Var.u0.getChannelCount() + " sample rate = " + e50Var.u0.getSampleRate() + " bufferSize = " + i10);
            }
            e50Var.z0 = false;
            Thread thread = new Thread(e50Var.A0);
            thread.setPriority(10);
            thread.start();
            e50Var.F = new MediaCodec.BufferInfo();
            e50Var.E = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", MediaController.AUDIO_MIME_TYPE);
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(e50Var.D0.a).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MediaController.AUDIO_MIME_TYPE);
            e50Var.B = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            e50Var.B.start();
            e50Var.A = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
            e50Var.D = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MediaController.VIDEO_MIME_TYPE, e50Var.d, e50Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", e50Var.f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            e50Var.A.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            e50Var.r = e50Var.A.createInputSurface();
            e50Var.A.start();
            if (!z10) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(e50Var.a);
                e50Var.b = e50Var.a;
                if (isSdCardPath) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                        e50Var.b = file;
                        if (file.exists()) {
                            e50Var.b.delete();
                        }
                        e50Var.c = true;
                    } catch (Throwable th) {
                        FileLog.e(th);
                        e50Var.b = e50Var.a;
                        e50Var.c = false;
                    }
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(e50Var.b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(e50Var.d, e50Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, e50Var.D0.I, false);
                e50Var.G = createMovie;
                f50 f50Var = e50Var.D0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                f50Var.M0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new a50(0, e50Var, z10));
            if (e50Var.s != EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("EGL already set up");
            }
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            e50Var.s = eglGetDisplay;
            if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                e50Var.s = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            if (e50Var.v == EGL14.EGL_NO_CONTEXT) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(e50Var.s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                i9 = 0;
                e50Var.v = EGL14.eglCreateContext(e50Var.s, eGLConfigArr[0], e50Var.w, new int[]{12440, 2, 12344}, 0);
                e50Var.x = eGLConfigArr[0];
            } else {
                i9 = 0;
            }
            EGL14.eglQueryContext(e50Var.s, e50Var.v, 12440, new int[1], i9);
            if (e50Var.y != EGL14.EGL_NO_SURFACE) {
                throw new IllegalStateException("surface already created");
            }
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(e50Var.s, e50Var.x, e50Var.r, new int[]{12344}, i9);
            e50Var.y = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                throw new RuntimeException("surface was null");
            }
            if (!EGL14.eglMakeCurrent(e50Var.s, eglCreateWindowSurface, eglCreateWindowSurface, e50Var.v)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                throw new RuntimeException("eglMakeCurrent failed");
            }
            GLES20.glBlendFunc(770, 771);
            l40 l40Var = e50Var.t0;
            if (l40Var != null) {
                l40Var.b();
                e50Var.t0 = null;
            }
            e50Var.t0 = new l40(e50Var.d, e50Var.e);
            f50 f50Var2 = e50Var.D0;
            Size size = f50Var2.e0[0];
            String str = (SharedConfig.deviceIsLow() || !f50.b() || (size != null && ((float) Math.max(size.getHeight(), size.getWidth())) * 0.7f < ((float) MessagesController.getInstance(f50Var2.a).roundVideoSize))) ? "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n" : "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
            int a2 = f50.a(e50Var.D0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
            int a3 = f50.a(e50Var.D0, 35632, str);
            if (a2 == 0 || a3 == 0) {
                return;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            e50Var.i0 = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(e50Var.i0, a3);
            GLES20.glLinkProgram(e50Var.i0);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(e50Var.i0, 35714, iArr2, 0);
            if (iArr2[0] == 0) {
                GLES20.glDeleteProgram(e50Var.i0);
                e50Var.i0 = 0;
                return;
            }
            e50Var.l0 = GLES20.glGetAttribLocation(e50Var.i0, "aPosition");
            e50Var.m0 = GLES20.glGetAttribLocation(e50Var.i0, "aTextureCoord");
            e50Var.o0 = GLES20.glGetUniformLocation(e50Var.i0, "preview");
            e50Var.n0 = GLES20.glGetUniformLocation(e50Var.i0, "resolution");
            e50Var.q0 = GLES20.glGetUniformLocation(e50Var.i0, "alpha");
            e50Var.j0 = GLES20.glGetUniformLocation(e50Var.i0, "uMVPMatrix");
            e50Var.k0 = GLES20.glGetUniformLocation(e50Var.i0, "uSTMatrix");
            e50Var.p0 = GLES20.glGetUniformLocation(e50Var.i0, "texelSize");
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void b(e50 e50Var, int i9, z40 z40Var) {
        boolean z10;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i9 != 1 || (((videoEditedInfo = e50Var.D0.J) != null && videoEditedInfo.needConvert()) || e50Var.D0.c.c())) {
            z10 = true;
        } else {
            if (!e50Var.C0) {
                e50Var.C0 = true;
                AndroidUtilities.runOnUIThread(new zq(19, e50Var, z40Var));
            }
            z10 = false;
        }
        if (e50Var.S && !e50Var.z0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            e50Var.T = i9;
            e50Var.U = z40Var;
            e50Var.S = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            e50Var.e(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        MediaCodec mediaCodec = e50Var.A;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                e50Var.A.release();
                e50Var.A = null;
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        MediaCodec mediaCodec2 = e50Var.B;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                e50Var.B.release();
                e50Var.B = null;
                g(false);
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        File file = e50Var.D0.U;
        if (file != null) {
            file.delete();
            e50Var.D0.U = null;
        }
        MP4Builder mP4Builder = e50Var.G;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e13) {
                FileLog.e(e13);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (e50Var.c) {
                if (e50Var.a.exists()) {
                    try {
                        e50Var.a.delete();
                    } catch (Exception e14) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + e50Var.a);
                        FileLog.e(e14);
                    }
                }
                if (!e50Var.b.renameTo(e50Var.a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(e50Var.b, e50Var.a);
                        e50Var.b.delete();
                    } catch (IOException e15) {
                        FileLog.e(e15);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i9 != 2 && (dispatchQueue = e50Var.x0) != null) {
            dispatchQueue.cleanupQueue();
            e50Var.x0.recycle();
            e50Var.x0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i9);
        if (i9 == 0) {
            FileLoader.getInstance(e50Var.D0.a).cancelFileUpload(e50Var.a.getAbsolutePath(), false);
            try {
                e50Var.b.delete();
            } catch (Throwable unused) {
            }
            try {
                e50Var.a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i9 != 1 || !e50Var.C0)) {
                e50Var.C0 = true;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(e50Var, i9, z40Var, 8));
            }
            AndroidUtilities.runOnUIThread(new b50(e50Var, 3));
        }
        EGL14.eglDestroySurface(e50Var.s, e50Var.y);
        e50Var.y = EGL14.EGL_NO_SURFACE;
        Surface surface = e50Var.r;
        if (surface != null) {
            surface.release();
            e50Var.r = null;
        }
        EGLDisplay eGLDisplay = e50Var.s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(e50Var.s, e50Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(e50Var.s);
        }
        e50Var.s = EGL14.EGL_NO_DISPLAY;
        e50Var.v = EGL14.EGL_NO_CONTEXT;
        e50Var.x = null;
        e50Var.P.getClass();
        Looper.myLooper().quit();
        l40 l40Var = e50Var.t0;
        if (l40Var != null) {
            l40Var.b();
            e50Var.t0 = null;
        }
        AndroidUtilities.runOnUIThread(new b50(e50Var, 4));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (SharedConfig.recordViaSco && !kd0.f("android.permission.BLUETOOTH_CONNECT")) {
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
            } catch (Throwable th) {
                FileLog.e(th);
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

    public final void c(s40 s40Var, long j10, boolean z10) {
        f50 f50Var = this.D0;
        int i9 = f50Var.a;
        if (!this.h) {
            FileLoader.getInstance(i9).checkUploadNewDataAvailable(s40Var.toString(), f50Var.I, j10, z10 ? s40Var.length() : 0L);
            return;
        }
        FileLoader.getInstance(i9).uploadFile(s40Var.toString(), f50Var.I, false, 1L, 33554432, false);
        this.h = false;
        if (z10) {
            FileLoader.getInstance(i9).checkUploadNewDataAvailable(s40Var.toString(), f50Var.I, j10, z10 ? s40Var.length() : 0L);
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
                    throw new RuntimeException(j3.r0.m(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
                MediaCodec.BufferInfo bufferInfo = this.E;
                int i9 = bufferInfo.size;
                if (i9 > 1) {
                    int i10 = bufferInfo.flags;
                    if ((i10 & 2) == 0) {
                        int i11 = this.C;
                        if (i11 != 0 && (i10 & 1) != 0) {
                            bufferInfo.offset += i11;
                            bufferInfo.size = i9 - i11;
                        }
                        if (this.D && (i10 & 1) != 0) {
                            if (bufferInfo.size > 100) {
                                outputBuffer.position(bufferInfo.offset);
                                byte[] bArr = new byte[100];
                                outputBuffer.get(bArr);
                                int i12 = 0;
                                int i13 = 0;
                                while (true) {
                                    if (i12 < 96) {
                                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 0 && bArr[i12 + 3] == 1 && (i13 = i13 + 1) > 1) {
                                            MediaCodec.BufferInfo bufferInfo2 = this.E;
                                            bufferInfo2.offset += i12;
                                            bufferInfo2.size -= i12;
                                            break;
                                        }
                                        i12++;
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
                        byte[] bArr2 = new byte[i9];
                        outputBuffer.limit(bufferInfo.offset + i9);
                        outputBuffer.position(this.E.offset);
                        outputBuffer.get(bArr2);
                        int i14 = this.E.size - 1;
                        while (i14 >= 0 && i14 > 3) {
                            if (bArr2[i14] == b10 && bArr2[i14 - 1] == 0 && bArr2[i14 - 2] == 0) {
                                int i15 = i14 - 3;
                                if (bArr2[i15] == 0) {
                                    byteBuffer = ByteBuffer.allocate(i15);
                                    byteBuffer2 = ByteBuffer.allocate(this.E.size - i15);
                                    byteBuffer.put(bArr2, 0, i15).position(0);
                                    byteBuffer2.put(bArr2, i15, this.E.size - i15).position(0);
                                    break;
                                }
                            }
                            i14--;
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
                        throw new RuntimeException(j3.r0.m(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
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
                        int i9 = this.r0 + 1;
                        this.r0 = i9;
                        if (i9 <= 1) {
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() {
        l40 l40Var = this.t0;
        if (l40Var != null) {
            l40Var.b();
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
        k61 k61Var = new k61();
        f50 f50Var = this.D0;
        f50Var.K = k61Var;
        k61Var.F = new n2.p(this, 9);
        k61Var.W(f50Var.h0);
        f50Var.K.E(Uri.fromFile(file), "other");
        f50Var.K.D();
        f50Var.K.P(true);
        f50Var.n();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = f50Var.N0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(f50Var.d, m6.b, 0), ObjectAnimator.ofFloat(f50Var.w, (Property<ImageView, Float>) property, 1.0f));
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

    public final void i(int i9, z40 z40Var) {
        this.P.sendMessage(this.P.obtainMessage(1, i9, 0, z40Var));
        AndroidUtilities.runOnUIThread(new b50(this, 5));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.prepare();
        synchronized (this.Q) {
            c2.v0 v0Var = new c2.v0(2);
            v0Var.b = new WeakReference(this);
            this.P = v0Var;
            this.R = true;
            this.Q.notify();
        }
        Looper.loop();
        synchronized (this.Q) {
            this.R = false;
        }
    }
}

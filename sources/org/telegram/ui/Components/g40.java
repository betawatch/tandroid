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
import android.text.TextUtils;
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
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.tgnet.TLObject;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g40 implements Runnable {
    public org.telegram.messenger.q5 B0;
    public int C0;
    public volatile boolean D0;
    public MediaCodec E;
    public MediaCodec F;
    public boolean F0;
    public int G;
    public boolean G0;
    public boolean H;
    public final /* synthetic */ o40 H0;
    public MediaCodec.BufferInfo I;
    public MediaCodec.BufferInfo J;
    public MP4Builder K;
    public long O;
    public boolean Q;
    public volatile g.c T;
    public volatile boolean V;
    public volatile boolean W;
    public volatile int X;
    public volatile d40 Y;
    public long Z;
    public org.telegram.messenger.pe a;
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
    public EGLContext x;
    public p30 x0;
    public EGLConfig y;
    public AudioRecord y0;
    public boolean h = true;
    public EGLDisplay s = EGL14.EGL_NO_DISPLAY;
    public EGLContext w = EGL14.EGL_NO_CONTEXT;
    public EGLSurface D = EGL14.EGL_NO_SURFACE;
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
    public final f40 E0 = new f40(this, 0);

    public g40(o40 o40Var) {
        this.H0 = o40Var;
    }

    public static void a(g40 g40Var, boolean z9) {
        long j3;
        int i7;
        g(true);
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 3584;
            }
            int i10 = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * TLObject.FLAG_12 : 49152;
            g40Var.z0.clear();
            for (int i11 = 0; i11 < 3; i11++) {
                g40Var.z0.add(new x30());
            }
            if (z9) {
                g40Var.g0 = g40Var.d0 + g40Var.e0;
                g40Var.k0 = g40Var.i0 + g40Var.j0;
                g40Var.Q = true;
                j3 = 0;
            } else {
                g40Var.g0 = -1L;
                g40Var.k0 = -1L;
                j3 = 0;
                g40Var.R = 0L;
            }
            g40Var.S = -1L;
            g40Var.O = j3;
            g40Var.P = -1L;
            g40Var.h0 = -1L;
            g40Var.c0 = -1L;
            g40Var.d0 = -1L;
            g40Var.f0 = -1L;
            g40Var.i0 = -1L;
            g40Var.a0 = false;
            g40Var.Z = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i10);
            g40Var.y0 = audioRecord;
            audioRecord.startRecording();
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.a8.b("InstantCamera initied audio record with channels " + g40Var.y0.getChannelCount() + " sample rate = " + g40Var.y0.getSampleRate() + " bufferSize = " + i10);
            }
            g40Var.D0 = false;
            Thread thread = new Thread(g40Var.E0);
            thread.setPriority(10);
            thread.start();
            g40Var.J = new MediaCodec.BufferInfo();
            g40Var.I = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", org.telegram.messenger.qp.s1(g40Var.H0.e).x3 * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            g40Var.F = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            g40Var.F.start();
            g40Var.E = MediaCodec.createEncoderByType("video/avc");
            g40Var.H = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", g40Var.d, g40Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", g40Var.f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            g40Var.E.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            g40Var.r = g40Var.E.createInputSurface();
            g40Var.E.start();
            if (!z9) {
                org.telegram.messenger.pe peVar = g40Var.a;
                ThreadLocal threadLocal = org.telegram.messenger.gc.I;
                boolean z10 = !TextUtils.isEmpty(org.telegram.messenger.iz.h0) && peVar.getAbsolutePath().startsWith(org.telegram.messenger.iz.h0);
                g40Var.b = g40Var.a;
                if (z10) {
                    try {
                        File file = new File(org.telegram.messenger.t0.h(), "camera_tmp.mp4");
                        g40Var.b = file;
                        if (file.exists()) {
                            g40Var.b.delete();
                        }
                        g40Var.c = true;
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                        g40Var.b = g40Var.a;
                        g40Var.c = false;
                    }
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(g40Var.b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(g40Var.d, g40Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, g40Var.H0.Q, false);
                g40Var.K = createMovie;
                o40 o40Var = g40Var.H0;
                boolean j10 = org.telegram.messenger.iz.j();
                o40Var.Z0 = j10;
                createMovie.setAllowSyncFiles(j10);
            }
            org.telegram.messenger.g0.h3(new bi.k1(26, g40Var, z9));
            if (g40Var.s != EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("EGL already set up");
            }
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            g40Var.s = eglGetDisplay;
            if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                g40Var.s = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            if (g40Var.w == EGL14.EGL_NO_CONTEXT) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(g40Var.s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                i7 = 0;
                g40Var.w = EGL14.eglCreateContext(g40Var.s, eGLConfigArr[0], g40Var.x, new int[]{12440, 2, 12344}, 0);
                g40Var.y = eGLConfigArr[0];
            } else {
                i7 = 0;
            }
            EGL14.eglQueryContext(g40Var.s, g40Var.w, 12440, new int[1], i7);
            if (g40Var.D != EGL14.EGL_NO_SURFACE) {
                throw new IllegalStateException("surface already created");
            }
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(g40Var.s, g40Var.y, g40Var.r, new int[]{12344}, i7);
            g40Var.D = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                throw new RuntimeException("surface was null");
            }
            if (!EGL14.eglMakeCurrent(g40Var.s, eglCreateWindowSurface, eglCreateWindowSurface, g40Var.w)) {
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.d("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                throw new RuntimeException("eglMakeCurrent failed");
            }
            GLES20.glBlendFunc(770, 771);
            p30 p30Var = g40Var.x0;
            if (p30Var != null) {
                p30Var.b();
                g40Var.x0 = null;
            }
            g40Var.x0 = new p30(g40Var.d, g40Var.e);
            o40 o40Var2 = g40Var.H0;
            Size size = o40Var2.m0[0];
            String str = (org.telegram.messenger.iz.o() != 0 && o40.m() && (size == null || ((float) Math.max(size.getHeight(), size.getWidth())) * 0.7f >= ((float) org.telegram.messenger.qp.s1(o40Var2.e).v3))) ? "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n" : "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
            int l10 = o40.l(g40Var.H0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
            int l11 = o40.l(g40Var.H0, 35632, str);
            if (l10 == 0 || l11 == 0) {
                return;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            g40Var.m0 = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, l10);
            GLES20.glAttachShader(g40Var.m0, l11);
            GLES20.glLinkProgram(g40Var.m0);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(g40Var.m0, 35714, iArr2, 0);
            if (iArr2[0] == 0) {
                GLES20.glDeleteProgram(g40Var.m0);
                g40Var.m0 = 0;
                return;
            }
            g40Var.p0 = GLES20.glGetAttribLocation(g40Var.m0, "aPosition");
            g40Var.q0 = GLES20.glGetAttribLocation(g40Var.m0, "aTextureCoord");
            g40Var.s0 = GLES20.glGetUniformLocation(g40Var.m0, "preview");
            g40Var.r0 = GLES20.glGetUniformLocation(g40Var.m0, "resolution");
            g40Var.u0 = GLES20.glGetUniformLocation(g40Var.m0, "alpha");
            g40Var.n0 = GLES20.glGetUniformLocation(g40Var.m0, "uMVPMatrix");
            g40Var.o0 = GLES20.glGetUniformLocation(g40Var.m0, "uSTMatrix");
            g40Var.t0 = GLES20.glGetUniformLocation(g40Var.m0, "texelSize");
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void b(g40 g40Var, int i7, d40 d40Var) {
        boolean z9;
        org.telegram.messenger.q5 q5Var;
        org.telegram.messenger.j20 j20Var;
        if (i7 != 1 || (((j20Var = g40Var.H0.R) != null && j20Var.c()) || g40Var.H0.h.c())) {
            z9 = true;
        } else {
            if (!g40Var.G0) {
                g40Var.G0 = true;
                org.telegram.messenger.g0.h3(new ro(22, g40Var, d40Var));
            }
            z9 = false;
        }
        if (g40Var.W && !g40Var.D0) {
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording running=false");
            g40Var.X = i7;
            g40Var.Y = d40Var;
            g40Var.W = false;
            return;
        }
        try {
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording drain encoders");
            g40Var.d(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        MediaCodec mediaCodec = g40Var.E;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                g40Var.E.release();
                g40Var.E = null;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        MediaCodec mediaCodec2 = g40Var.F;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                g40Var.F.release();
                g40Var.F = null;
                g(false);
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        File file = g40Var.H0.f0;
        if (file != null) {
            file.delete();
            g40Var.H0.f0 = null;
        }
        MP4Builder mP4Builder = g40Var.K;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e13) {
                org.telegram.messenger.a8.g(e13, true);
            }
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording finish muxer");
            if (g40Var.c) {
                if (g40Var.a.exists()) {
                    try {
                        g40Var.a.delete();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.d("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + g40Var.a);
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                if (!g40Var.b.renameTo(g40Var.a)) {
                    org.telegram.messenger.a8.d("InstantCamera unable to rename file, try move file");
                    try {
                        org.telegram.messenger.g0.E(g40Var.b, g40Var.a);
                        g40Var.b.delete();
                    } catch (IOException e15) {
                        org.telegram.messenger.a8.g(e15, true);
                        org.telegram.messenger.a8.d("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i7 != 2 && (q5Var = g40Var.B0) != null) {
            q5Var.cleanupQueue();
            g40Var.B0.recycle();
            g40Var.B0 = null;
        }
        org.telegram.messenger.a8.b("InstantCamera handleStopRecording send " + i7);
        if (i7 == 0) {
            org.telegram.messenger.w7.G(g40Var.H0.e).b(g40Var.a.getAbsolutePath(), false);
            try {
                g40Var.b.delete();
            } catch (Throwable unused) {
            }
            try {
                g40Var.a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z9 && (i7 != 1 || !g40Var.G0)) {
                g40Var.G0 = true;
                org.telegram.messenger.g0.h3(new org.telegram.ui.q8(g40Var, i7, d40Var, 12));
            }
            org.telegram.messenger.g0.h3(new e40(g40Var, 2));
        }
        EGL14.eglDestroySurface(g40Var.s, g40Var.D);
        g40Var.D = EGL14.EGL_NO_SURFACE;
        Surface surface = g40Var.r;
        if (surface != null) {
            surface.release();
            g40Var.r = null;
        }
        EGLDisplay eGLDisplay = g40Var.s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(g40Var.s, g40Var.w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(g40Var.s);
        }
        g40Var.s = EGL14.EGL_NO_DISPLAY;
        g40Var.w = EGL14.EGL_NO_CONTEXT;
        g40Var.y = null;
        g40Var.T.getClass();
        Looper.myLooper().quit();
        p30 p30Var = g40Var.x0;
        if (p30Var != null) {
            p30Var.b();
            g40Var.x0 = null;
        }
        org.telegram.messenger.g0.h3(new e40(g40Var, 3));
    }

    public static void g(boolean z9) {
        AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (org.telegram.messenger.iz.u0 && !c8.ia.d("android.permission.BLUETOOTH_CONNECT")) {
            org.telegram.messenger.iz.u0 = false;
            org.telegram.messenger.iz.y();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && org.telegram.messenger.iz.u0) && z9) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                if (defaultAdapter.getProfileConnectionState(1) != 2) {
                }
                if (!z9 && !audioManager.isBluetoothScoOn()) {
                    audioManager.startBluetoothSco();
                    return;
                } else if (z9 && audioManager.isBluetoothScoOn()) {
                    audioManager.stopBluetoothSco();
                    return;
                }
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
                if (z9) {
                    return;
                }
                try {
                    if (audioManager.isBluetoothScoOn()) {
                        audioManager.stopBluetoothSco();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
        }
        if (z9) {
            return;
        }
        if (!z9) {
        }
        if (z9) {
        }
    }

    public final void c(org.telegram.messenger.pe peVar, long j3, boolean z9) {
        o40 o40Var = this.H0;
        int i7 = o40Var.e;
        if (!this.h) {
            org.telegram.messenger.w7.G(i7).n(peVar.toString(), o40Var.Q, j3, z9 ? peVar.length() : 0L, null);
            return;
        }
        org.telegram.messenger.w7.G(i7).g0(peVar.toString(), o40Var.Q, false, 1L, 33554432, false);
        this.h = false;
        if (z9) {
            org.telegram.messenger.w7.G(i7).n(peVar.toString(), o40Var.Q, j3, z9 ? peVar.length() : 0L, null);
        }
    }

    public final void d(boolean z9) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (z9) {
            this.E.signalEndOfInputStream();
        }
        while (true) {
            int dequeueOutputBuffer = this.E.dequeueOutputBuffer(this.I, 10000L);
            byte b10 = 1;
            if (dequeueOutputBuffer == -1) {
                if (!z9 || this.D0) {
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
                    throw new RuntimeException(jg.g.k(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
                MediaCodec.BufferInfo bufferInfo = this.I;
                int i7 = bufferInfo.size;
                if (i7 > 1) {
                    int i10 = bufferInfo.flags;
                    if ((i10 & 2) == 0) {
                        int i11 = this.G;
                        if (i11 != 0 && (i10 & 1) != 0) {
                            bufferInfo.offset += i11;
                            bufferInfo.size = i7 - i11;
                        }
                        if (this.H && (i10 & 1) != 0) {
                            if (bufferInfo.size > 100) {
                                outputBuffer.position(bufferInfo.offset);
                                byte[] bArr = new byte[100];
                                outputBuffer.get(bArr);
                                int i12 = 0;
                                int i13 = 0;
                                while (true) {
                                    if (i12 < 96) {
                                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 0 && bArr[i12 + 3] == 1 && (i13 = i13 + 1) > 1) {
                                            MediaCodec.BufferInfo bufferInfo2 = this.I;
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
                            this.H = false;
                        }
                        long writeSampleData = this.K.writeSampleData(this.M, outputBuffer, this.I, true);
                        if (writeSampleData != 0 && !this.c && this.H0.Z0) {
                            c(this.a, writeSampleData, false);
                        }
                    } else if (this.M == -5) {
                        byte[] bArr2 = new byte[i7];
                        outputBuffer.limit(bufferInfo.offset + i7);
                        outputBuffer.position(this.I.offset);
                        outputBuffer.get(bArr2);
                        int i14 = this.I.size - 1;
                        while (i14 >= 0 && i14 > 3) {
                            if (bArr2[i14] == b10 && bArr2[i14 - 1] == 0 && bArr2[i14 - 2] == 0) {
                                int i15 = i14 - 3;
                                if (bArr2[i15] == 0) {
                                    byteBuffer = ByteBuffer.allocate(i15);
                                    byteBuffer2 = ByteBuffer.allocate(this.I.size - i15);
                                    byteBuffer.put(bArr2, 0, i15).position(0);
                                    byteBuffer2.put(bArr2, i15, this.I.size - i15).position(0);
                                    break;
                                }
                            }
                            i14--;
                            b10 = 1;
                        }
                        byteBuffer = null;
                        byteBuffer2 = null;
                        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.d, this.e);
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
                if (!z9) {
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
                        throw new RuntimeException(jg.g.k(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                    MediaCodec.BufferInfo bufferInfo3 = this.J;
                    if ((bufferInfo3.flags & 2) != 0) {
                        bufferInfo3.size = 0;
                    }
                    if (bufferInfo3.size != 0) {
                        long writeSampleData2 = this.K.writeSampleData(this.N, outputBuffer2, bufferInfo3, false);
                        if (writeSampleData2 != 0 && !this.c && this.H0.Z0) {
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

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j3) {
        synchronized (this.U) {
            try {
                if (this.V) {
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == 0) {
                        int i7 = this.v0 + 1;
                        this.v0 = i7;
                        if (i7 <= 1) {
                            return;
                        }
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        this.v0 = 0;
                        j3 = timestamp;
                    }
                    this.T.sendMessage(this.T.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        p30 p30Var = this.x0;
        if (p30Var != null) {
            p30Var.b();
            this.x0 = null;
        }
        try {
            EGLDisplay eGLDisplay = this.s;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.s, this.w);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.s);
                this.s = EGL14.EGL_NO_DISPLAY;
                this.w = EGL14.EGL_NO_CONTEXT;
                this.y = null;
            }
        } finally {
            super.finalize();
        }
    }

    public final void h(File file) {
        t51 t51Var = new t51();
        o40 o40Var = this.H0;
        o40Var.S = t51Var;
        t51Var.J = new uy(this, 1);
        t51Var.A0(o40Var.p0);
        o40Var.S.j0(Uri.fromFile(file), "other");
        o40Var.S.h0();
        o40Var.S.t0(true);
        o40Var.t();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = o40Var.a1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(o40Var.n, l6.b, 0), ObjectAnimator.ofFloat(o40Var.F, (Property<ImageView, Float>) property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.s, this.D);
        this.D = EGL14.EGL_NO_SURFACE;
        Surface surface = this.r;
        if (surface != null) {
            surface.release();
            this.r = null;
        }
        EGLDisplay eGLDisplay = this.s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.s, this.w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.s);
        }
        this.s = EGL14.EGL_NO_DISPLAY;
        this.w = EGL14.EGL_NO_CONTEXT;
        this.y = null;
    }

    public final void i(int i7, d40 d40Var) {
        this.T.sendMessage(this.T.obtainMessage(1, i7, 0, d40Var));
        org.telegram.messenger.g0.h3(new us(4));
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

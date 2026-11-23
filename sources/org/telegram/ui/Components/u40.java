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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u40 implements Runnable {
    public org.telegram.messenger.r5 C0;
    public int D0;
    public volatile boolean E0;
    public MediaCodec F;
    public MediaCodec G;
    public boolean G0;
    public int H;
    public boolean H0;
    public boolean I;
    public final /* synthetic */ c50 I0;
    public MediaCodec.BufferInfo J;
    public MediaCodec.BufferInfo K;
    public MP4Builder L;
    public long P;
    public boolean R;
    public volatile g.c U;
    public volatile boolean W;
    public volatile boolean X;
    public volatile int Y;
    public volatile r40 Z;
    public org.telegram.messenger.oe a;
    public long a0;
    public File b;
    public boolean b0;
    public boolean c;
    public long c0;
    public int d;
    public int e;
    public long e0;
    public int f;
    public long f0;
    public long g0;
    public boolean m0;
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
    public int w0;
    public EGLContext x;
    public EGLConfig y;
    public d40 y0;
    public AudioRecord z0;
    public boolean h = true;
    public EGLDisplay s = EGL14.EGL_NO_DISPLAY;
    public EGLContext w = EGL14.EGL_NO_CONTEXT;
    public EGLSurface E = EGL14.EGL_NO_SURFACE;
    public final ArrayList M = new ArrayList();
    public int N = -5;
    public int O = -5;
    public long Q = -1;
    public long S = 0;
    public long T = -1;
    public final Object V = new Object();
    public long d0 = -1;
    public long h0 = -1;
    public long i0 = -1;
    public long j0 = -1;
    public long k0 = 0;
    public long l0 = -1;
    public Integer x0 = 0;
    public final ArrayBlockingQueue A0 = new ArrayBlockingQueue(10);
    public final ArrayList B0 = new ArrayList();
    public final t40 F0 = new t40(this, 0);

    public u40(c50 c50Var) {
        this.I0 = c50Var;
    }

    public static void a(u40 u40Var, boolean z10) {
        long j3;
        int i7;
        g(true);
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 3584;
            }
            int i10 = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * TLObject.FLAG_12 : 49152;
            u40Var.A0.clear();
            for (int i11 = 0; i11 < 3; i11++) {
                u40Var.A0.add(new l40());
            }
            if (z10) {
                u40Var.h0 = u40Var.e0 + u40Var.f0;
                u40Var.l0 = u40Var.j0 + u40Var.k0;
                u40Var.R = true;
                j3 = 0;
            } else {
                u40Var.h0 = -1L;
                u40Var.l0 = -1L;
                j3 = 0;
                u40Var.S = 0L;
            }
            u40Var.T = -1L;
            u40Var.P = j3;
            u40Var.Q = -1L;
            u40Var.i0 = -1L;
            u40Var.d0 = -1L;
            u40Var.e0 = -1L;
            u40Var.g0 = -1L;
            u40Var.j0 = -1L;
            u40Var.b0 = false;
            u40Var.a0 = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i10);
            u40Var.z0 = audioRecord;
            audioRecord.startRecording();
            if (org.telegram.messenger.s2.a) {
                org.telegram.messenger.a8.b("InstantCamera initied audio record with channels " + u40Var.z0.getChannelCount() + " sample rate = " + u40Var.z0.getSampleRate() + " bufferSize = " + i10);
            }
            u40Var.E0 = false;
            Thread thread = new Thread(u40Var.F0);
            thread.setPriority(10);
            thread.start();
            u40Var.K = new MediaCodec.BufferInfo();
            u40Var.J = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", "audio/mp4a-latm");
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", org.telegram.messenger.np.u1(u40Var.I0.e).A3 * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
            u40Var.G = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            u40Var.G.start();
            u40Var.F = MediaCodec.createEncoderByType("video/avc");
            u40Var.I = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", u40Var.d, u40Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", u40Var.f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            u40Var.F.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            u40Var.r = u40Var.F.createInputSurface();
            u40Var.F.start();
            if (!z10) {
                org.telegram.messenger.oe oeVar = u40Var.a;
                ThreadLocal threadLocal = org.telegram.messenger.fc.I;
                boolean z11 = !TextUtils.isEmpty(org.telegram.messenger.cz.h0) && oeVar.getAbsolutePath().startsWith(org.telegram.messenger.cz.h0);
                u40Var.b = u40Var.a;
                if (z11) {
                    try {
                        File file = new File(org.telegram.messenger.t0.h(), "camera_tmp.mp4");
                        u40Var.b = file;
                        if (file.exists()) {
                            u40Var.b.delete();
                        }
                        u40Var.c = true;
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                        u40Var.b = u40Var.a;
                        u40Var.c = false;
                    }
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(u40Var.b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(u40Var.d, u40Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, u40Var.I0.R, false);
                u40Var.L = createMovie;
                c50 c50Var = u40Var.I0;
                boolean j10 = org.telegram.messenger.cz.j();
                c50Var.a1 = j10;
                createMovie.setAllowSyncFiles(j10);
            }
            org.telegram.messenger.g0.g3(new ch.k(27, u40Var, z10));
            if (u40Var.s != EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("EGL already set up");
            }
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            u40Var.s = eglGetDisplay;
            if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                u40Var.s = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            if (u40Var.w == EGL14.EGL_NO_CONTEXT) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(u40Var.s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                i7 = 0;
                u40Var.w = EGL14.eglCreateContext(u40Var.s, eGLConfigArr[0], u40Var.x, new int[]{12440, 2, 12344}, 0);
                u40Var.y = eGLConfigArr[0];
            } else {
                i7 = 0;
            }
            EGL14.eglQueryContext(u40Var.s, u40Var.w, 12440, new int[1], i7);
            if (u40Var.E != EGL14.EGL_NO_SURFACE) {
                throw new IllegalStateException("surface already created");
            }
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(u40Var.s, u40Var.y, u40Var.r, new int[]{12344}, i7);
            u40Var.E = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                throw new RuntimeException("surface was null");
            }
            if (!EGL14.eglMakeCurrent(u40Var.s, eglCreateWindowSurface, eglCreateWindowSurface, u40Var.w)) {
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.d("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                throw new RuntimeException("eglMakeCurrent failed");
            }
            GLES20.glBlendFunc(770, 771);
            d40 d40Var = u40Var.y0;
            if (d40Var != null) {
                d40Var.b();
                u40Var.y0 = null;
            }
            u40Var.y0 = new d40(u40Var.d, u40Var.e);
            c50 c50Var2 = u40Var.I0;
            Size size = c50Var2.n0[0];
            String str = (org.telegram.messenger.cz.o() != 0 && c50.m() && (size == null || ((float) Math.max(size.getHeight(), size.getWidth())) * 0.7f >= ((float) org.telegram.messenger.np.u1(c50Var2.e).y3))) ? "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n" : "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n";
            int l10 = c50.l(u40Var.I0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
            int l11 = c50.l(u40Var.I0, 35632, str);
            if (l10 == 0 || l11 == 0) {
                return;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            u40Var.n0 = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, l10);
            GLES20.glAttachShader(u40Var.n0, l11);
            GLES20.glLinkProgram(u40Var.n0);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(u40Var.n0, 35714, iArr2, 0);
            if (iArr2[0] == 0) {
                GLES20.glDeleteProgram(u40Var.n0);
                u40Var.n0 = 0;
                return;
            }
            u40Var.q0 = GLES20.glGetAttribLocation(u40Var.n0, "aPosition");
            u40Var.r0 = GLES20.glGetAttribLocation(u40Var.n0, "aTextureCoord");
            u40Var.t0 = GLES20.glGetUniformLocation(u40Var.n0, "preview");
            u40Var.s0 = GLES20.glGetUniformLocation(u40Var.n0, "resolution");
            u40Var.v0 = GLES20.glGetUniformLocation(u40Var.n0, "alpha");
            u40Var.o0 = GLES20.glGetUniformLocation(u40Var.n0, "uMVPMatrix");
            u40Var.p0 = GLES20.glGetUniformLocation(u40Var.n0, "uSTMatrix");
            u40Var.u0 = GLES20.glGetUniformLocation(u40Var.n0, "texelSize");
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void b(u40 u40Var, int i7, r40 r40Var) {
        boolean z10;
        org.telegram.messenger.r5 r5Var;
        org.telegram.messenger.f20 f20Var;
        if (i7 != 1 || (((f20Var = u40Var.I0.S) != null && f20Var.c()) || u40Var.I0.h.c())) {
            z10 = true;
        } else {
            if (!u40Var.H0) {
                u40Var.H0 = true;
                org.telegram.messenger.g0.g3(new ou(13, u40Var, r40Var));
            }
            z10 = false;
        }
        if (u40Var.X && !u40Var.E0) {
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording running=false");
            u40Var.Y = i7;
            u40Var.Z = r40Var;
            u40Var.X = false;
            return;
        }
        try {
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording drain encoders");
            u40Var.d(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        MediaCodec mediaCodec = u40Var.F;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                u40Var.F.release();
                u40Var.F = null;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        MediaCodec mediaCodec2 = u40Var.G;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                u40Var.G.release();
                u40Var.G = null;
                g(false);
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
        File file = u40Var.I0.g0;
        if (file != null) {
            file.delete();
            u40Var.I0.g0 = null;
        }
        MP4Builder mP4Builder = u40Var.L;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e13) {
                org.telegram.messenger.a8.g(e13, true);
            }
            org.telegram.messenger.a8.b("InstantCamera handleStopRecording finish muxer");
            if (u40Var.c) {
                if (u40Var.a.exists()) {
                    try {
                        u40Var.a.delete();
                    } catch (Exception e14) {
                        org.telegram.messenger.a8.d("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + u40Var.a);
                        org.telegram.messenger.a8.g(e14, true);
                    }
                }
                if (!u40Var.b.renameTo(u40Var.a)) {
                    org.telegram.messenger.a8.d("InstantCamera unable to rename file, try move file");
                    try {
                        org.telegram.messenger.g0.E(u40Var.b, u40Var.a);
                        u40Var.b.delete();
                    } catch (IOException e15) {
                        org.telegram.messenger.a8.g(e15, true);
                        org.telegram.messenger.a8.d("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i7 != 2 && (r5Var = u40Var.C0) != null) {
            r5Var.cleanupQueue();
            u40Var.C0.recycle();
            u40Var.C0 = null;
        }
        org.telegram.messenger.a8.b("InstantCamera handleStopRecording send " + i7);
        if (i7 == 0) {
            org.telegram.messenger.w7.G(u40Var.I0.e).b(u40Var.a.getAbsolutePath(), false);
            try {
                u40Var.b.delete();
            } catch (Throwable unused) {
            }
            try {
                u40Var.a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z10 && (i7 != 1 || !u40Var.H0)) {
                u40Var.H0 = true;
                org.telegram.messenger.g0.g3(new org.telegram.ui.f0(u40Var, i7, r40Var, 15));
            }
            org.telegram.messenger.g0.g3(new s40(u40Var, 2));
        }
        EGL14.eglDestroySurface(u40Var.s, u40Var.E);
        u40Var.E = EGL14.EGL_NO_SURFACE;
        Surface surface = u40Var.r;
        if (surface != null) {
            surface.release();
            u40Var.r = null;
        }
        EGLDisplay eGLDisplay = u40Var.s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(u40Var.s, u40Var.w);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(u40Var.s);
        }
        u40Var.s = EGL14.EGL_NO_DISPLAY;
        u40Var.w = EGL14.EGL_NO_CONTEXT;
        u40Var.y = null;
        u40Var.U.getClass();
        Looper.myLooper().quit();
        d40 d40Var = u40Var.y0;
        if (d40Var != null) {
            d40Var.b();
            u40Var.y0 = null;
        }
        org.telegram.messenger.g0.g3(new s40(u40Var, 3));
    }

    public static void g(boolean z10) {
        AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (org.telegram.messenger.cz.u0 && !c8.na.d("android.permission.BLUETOOTH_CONNECT")) {
            org.telegram.messenger.cz.u0 = false;
            org.telegram.messenger.cz.y();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && org.telegram.messenger.cz.u0) && z10) {
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
                org.telegram.messenger.a8.g(th2, true);
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
                    org.telegram.messenger.a8.g(e10, true);
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

    public final void c(org.telegram.messenger.oe oeVar, long j3, boolean z10) {
        c50 c50Var = this.I0;
        int i7 = c50Var.e;
        if (!this.h) {
            org.telegram.messenger.w7.G(i7).n(oeVar.toString(), c50Var.R, j3, z10 ? oeVar.length() : 0L, null);
            return;
        }
        org.telegram.messenger.w7.G(i7).g0(oeVar.toString(), c50Var.R, false, 1L, 33554432, false);
        this.h = false;
        if (z10) {
            org.telegram.messenger.w7.G(i7).n(oeVar.toString(), c50Var.R, j3, z10 ? oeVar.length() : 0L, null);
        }
    }

    public final void d(boolean z10) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (z10) {
            this.F.signalEndOfInputStream();
        }
        while (true) {
            int dequeueOutputBuffer = this.F.dequeueOutputBuffer(this.J, 10000L);
            byte b10 = 1;
            if (dequeueOutputBuffer == -1) {
                if (!z10 || this.E0) {
                    break;
                }
            } else if (dequeueOutputBuffer == -3) {
                continue;
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.F.getOutputFormat();
                if (this.N == -5) {
                    this.N = this.L.addTrack(outputFormat, false);
                    if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                        this.H = outputFormat.getByteBuffer("csd-1").limit() + outputFormat.getByteBuffer("csd-0").limit();
                    }
                }
            } else if (dequeueOutputBuffer < 0) {
                continue;
            } else {
                ByteBuffer outputBuffer = this.F.getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer == null) {
                    throw new RuntimeException(i5.c.j(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
                MediaCodec.BufferInfo bufferInfo = this.J;
                int i7 = bufferInfo.size;
                if (i7 > 1) {
                    int i10 = bufferInfo.flags;
                    if ((i10 & 2) == 0) {
                        int i11 = this.H;
                        if (i11 != 0 && (i10 & 1) != 0) {
                            bufferInfo.offset += i11;
                            bufferInfo.size = i7 - i11;
                        }
                        if (this.I && (i10 & 1) != 0) {
                            if (bufferInfo.size > 100) {
                                outputBuffer.position(bufferInfo.offset);
                                byte[] bArr = new byte[100];
                                outputBuffer.get(bArr);
                                int i12 = 0;
                                int i13 = 0;
                                while (true) {
                                    if (i12 < 96) {
                                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 0 && bArr[i12 + 3] == 1 && (i13 = i13 + 1) > 1) {
                                            MediaCodec.BufferInfo bufferInfo2 = this.J;
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
                            this.I = false;
                        }
                        long writeSampleData = this.L.writeSampleData(this.N, outputBuffer, this.J, true);
                        if (writeSampleData != 0 && !this.c && this.I0.a1) {
                            c(this.a, writeSampleData, false);
                        }
                    } else if (this.N == -5) {
                        byte[] bArr2 = new byte[i7];
                        outputBuffer.limit(bufferInfo.offset + i7);
                        outputBuffer.position(this.J.offset);
                        outputBuffer.get(bArr2);
                        int i14 = this.J.size - 1;
                        while (i14 >= 0 && i14 > 3) {
                            if (bArr2[i14] == b10 && bArr2[i14 - 1] == 0 && bArr2[i14 - 2] == 0) {
                                int i15 = i14 - 3;
                                if (bArr2[i15] == 0) {
                                    byteBuffer = ByteBuffer.allocate(i15);
                                    byteBuffer2 = ByteBuffer.allocate(this.J.size - i15);
                                    byteBuffer.put(bArr2, 0, i15).position(0);
                                    byteBuffer2.put(bArr2, i15, this.J.size - i15).position(0);
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
                        this.N = this.L.addTrack(createVideoFormat, false);
                    }
                }
                this.F.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((this.J.flags & 4) != 0) {
                    break;
                }
            }
        }
        while (true) {
            int dequeueOutputBuffer2 = this.G.dequeueOutputBuffer(this.K, 0L);
            if (dequeueOutputBuffer2 == -1) {
                if (!z10) {
                    return;
                }
                if ((!this.X && this.Y == 0) || this.E0) {
                    return;
                }
            } else if (dequeueOutputBuffer2 != -3) {
                if (dequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat2 = this.G.getOutputFormat();
                    if (this.O == -5) {
                        this.O = this.L.addTrack(outputFormat2, true);
                    }
                } else if (dequeueOutputBuffer2 < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer2 = this.G.getOutputBuffer(dequeueOutputBuffer2);
                    if (outputBuffer2 == null) {
                        throw new RuntimeException(i5.c.j(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                    MediaCodec.BufferInfo bufferInfo3 = this.K;
                    if ((bufferInfo3.flags & 2) != 0) {
                        bufferInfo3.size = 0;
                    }
                    if (bufferInfo3.size != 0) {
                        long writeSampleData2 = this.L.writeSampleData(this.O, outputBuffer2, bufferInfo3, false);
                        if (writeSampleData2 != 0 && !this.c && this.I0.a1) {
                            c(this.a, writeSampleData2, false);
                        }
                        MediaCodec mediaCodec = this.G;
                        if (mediaCodec != null) {
                            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        }
                    } else {
                        MediaCodec mediaCodec2 = this.G;
                        if (mediaCodec2 != null) {
                            mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        }
                    }
                    if ((this.K.flags & 4) != 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j3) {
        synchronized (this.V) {
            try {
                if (this.W) {
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == 0) {
                        int i7 = this.w0 + 1;
                        this.w0 = i7;
                        if (i7 <= 1) {
                            return;
                        }
                        if (org.telegram.messenger.s2.a) {
                            org.telegram.messenger.a8.b("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        this.w0 = 0;
                        j3 = timestamp;
                    }
                    this.U.sendMessage(this.U.obtainMessage(2, (int) (j3 >> 32), (int) j3, num));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        d40 d40Var = this.y0;
        if (d40Var != null) {
            d40Var.b();
            this.y0 = null;
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
        i61 i61Var = new i61();
        c50 c50Var = this.I0;
        c50Var.T = i61Var;
        i61Var.K = new jn(this, 2);
        i61Var.A0(c50Var.q0);
        c50Var.T.j0(Uri.fromFile(file), "other");
        c50Var.T.h0();
        c50Var.T.t0(true);
        c50Var.t();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = c50Var.b1;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(c50Var.n, r6.b, 0), ObjectAnimator.ofFloat(c50Var.G, (Property<ImageView, Float>) property, 1.0f));
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        EGL14.eglDestroySurface(this.s, this.E);
        this.E = EGL14.EGL_NO_SURFACE;
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

    public final void i(int i7, r40 r40Var) {
        this.U.sendMessage(this.U.obtainMessage(1, i7, 0, r40Var));
        org.telegram.messenger.g0.g3(new me(10));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.prepare();
        synchronized (this.V) {
            g.c cVar = new g.c(1);
            cVar.b = new WeakReference(this);
            this.U = cVar;
            this.W = true;
            this.V.notify();
        }
        Looper.loop();
        synchronized (this.V) {
            this.W = false;
        }
    }
}

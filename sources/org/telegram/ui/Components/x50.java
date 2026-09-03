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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x50 implements Runnable {
    public volatile boolean A0;
    public MediaCodec B;
    public MediaCodec C;
    public boolean C0;
    public int D;
    public boolean D0;
    public boolean E;
    public final /* synthetic */ y50 E0;
    public MediaCodec.BufferInfo F;
    public MediaCodec.BufferInfo G;
    public MP4Builder H;
    public long L;
    public boolean N;
    public volatile c2.v0 Q;
    public volatile boolean S;
    public volatile boolean T;
    public volatile int U;
    public volatile t50 V;
    public long W;
    public boolean X;
    public long Y;
    public m50 a;
    public long a0;
    public File b;
    public long b0;
    public boolean c;
    public long c0;
    public int d;
    public int e;
    public int f;
    public boolean i0;
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
    public int s0;
    public e50 u0;
    public AudioRecord v0;
    public EGLContext w;
    public EGLConfig x;
    public DispatchQueue y0;
    public int z0;
    public boolean h = true;
    public EGLDisplay s = EGL14.EGL_NO_DISPLAY;
    public EGLContext v = EGL14.EGL_NO_CONTEXT;
    public EGLSurface y = EGL14.EGL_NO_SURFACE;
    public final ArrayList I = new ArrayList();
    public int J = -5;
    public int K = -5;
    public long M = -1;
    public long O = 0;
    public long P = -1;
    public final Object R = new Object();
    public long Z = -1;
    public long d0 = -1;
    public long e0 = -1;
    public long f0 = -1;
    public long g0 = 0;
    public long h0 = -1;
    public Integer t0 = 0;
    public final ArrayBlockingQueue w0 = new ArrayBlockingQueue(10);
    public final ArrayList x0 = new ArrayList();
    public final w50 B0 = new w50(this);

    public x50(y50 y50Var) {
        this.E0 = y50Var;
    }

    public static void a(x50 x50Var, boolean z4) {
        long j10;
        int i10;
        g(true);
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 3584;
            }
            int i11 = 49152 < minBufferSize ? ((minBufferSize / 2048) + 1) * 4096 : 49152;
            x50Var.w0.clear();
            for (int i12 = 0; i12 < 3; i12++) {
                x50Var.w0.add(new n50());
            }
            if (z4) {
                x50Var.d0 = x50Var.a0 + x50Var.b0;
                x50Var.h0 = x50Var.f0 + x50Var.g0;
                x50Var.N = true;
                j10 = 0;
            } else {
                x50Var.d0 = -1L;
                x50Var.h0 = -1L;
                j10 = 0;
                x50Var.O = 0L;
            }
            x50Var.P = -1L;
            x50Var.L = j10;
            x50Var.M = -1L;
            x50Var.e0 = -1L;
            x50Var.Z = -1L;
            x50Var.a0 = -1L;
            x50Var.c0 = -1L;
            x50Var.f0 = -1L;
            x50Var.X = false;
            x50Var.W = 0L;
            AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, i11);
            x50Var.v0 = audioRecord;
            audioRecord.startRecording();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera initied audio record with channels " + x50Var.v0.getChannelCount() + " sample rate = " + x50Var.v0.getSampleRate() + " bufferSize = " + i11);
            }
            x50Var.A0 = false;
            Thread thread = new Thread(x50Var.B0);
            thread.setPriority(10);
            thread.start();
            x50Var.G = new MediaCodec.BufferInfo();
            x50Var.F = new MediaCodec.BufferInfo();
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", MediaController.AUDIO_MIME_TYPE);
            mediaFormat.setInteger("sample-rate", 48000);
            mediaFormat.setInteger("channel-count", 1);
            mediaFormat.setInteger("bitrate", MessagesController.getInstance(x50Var.E0.a).roundAudioBitrate * 1024);
            mediaFormat.setInteger("max-input-size", 20480);
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MediaController.AUDIO_MIME_TYPE);
            x50Var.C = createEncoderByType;
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            x50Var.C.start();
            x50Var.B = MediaCodec.createEncoderByType(MediaController.VIDEO_MIME_TYPE);
            x50Var.E = true;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MediaController.VIDEO_MIME_TYPE, x50Var.d, x50Var.e);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", x50Var.f);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            x50Var.B.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            x50Var.r = x50Var.B.createInputSurface();
            x50Var.B.start();
            if (!z4) {
                boolean isSdCardPath = ImageLoader.isSdCardPath(x50Var.a);
                x50Var.b = x50Var.a;
                if (isSdCardPath) {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), "camera_tmp.mp4");
                        x50Var.b = file;
                        if (file.exists()) {
                            x50Var.b.delete();
                        }
                        x50Var.c = true;
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                        x50Var.b = x50Var.a;
                        x50Var.c = false;
                    }
                }
                Mp4Movie mp4Movie = new Mp4Movie();
                mp4Movie.setCacheFile(x50Var.b);
                mp4Movie.setRotation(0);
                mp4Movie.setSize(x50Var.d, x50Var.e);
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, x50Var.E0.J, false);
                x50Var.H = createMovie;
                y50 y50Var = x50Var.E0;
                boolean deviceIsHigh = SharedConfig.deviceIsHigh();
                y50Var.N0 = deviceIsHigh;
                createMovie.setAllowSyncFiles(deviceIsHigh);
            }
            AndroidUtilities.runOnUIThread(new jh.f(24, x50Var, z4));
            if (x50Var.s != EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("EGL already set up");
            }
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            x50Var.s = eglGetDisplay;
            if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                throw new RuntimeException("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                x50Var.s = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            if (x50Var.v == EGL14.EGL_NO_CONTEXT) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(x50Var.s, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                i10 = 0;
                x50Var.v = EGL14.eglCreateContext(x50Var.s, eGLConfigArr[0], x50Var.w, new int[]{12440, 2, 12344}, 0);
                x50Var.x = eGLConfigArr[0];
            } else {
                i10 = 0;
            }
            EGL14.eglQueryContext(x50Var.s, x50Var.v, 12440, new int[1], i10);
            if (x50Var.y != EGL14.EGL_NO_SURFACE) {
                throw new IllegalStateException("surface already created");
            }
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(x50Var.s, x50Var.x, x50Var.r, new int[]{12344}, i10);
            x50Var.y = eglCreateWindowSurface;
            if (eglCreateWindowSurface == null) {
                throw new RuntimeException("surface was null");
            }
            if (!EGL14.eglMakeCurrent(x50Var.s, eglCreateWindowSurface, eglCreateWindowSurface, x50Var.v)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                throw new RuntimeException("eglMakeCurrent failed");
            }
            GLES20.glBlendFunc(770, 771);
            e50 e50Var = x50Var.u0;
            if (e50Var != null) {
                e50Var.b();
                x50Var.u0 = null;
            }
            x50Var.u0 = new e50(x50Var.d, x50Var.e);
            y50 y50Var2 = x50Var.E0;
            Size size = y50Var2.f0[0];
            String str = (SharedConfig.deviceIsLow() || !y50.b() || (size != null && ((float) Math.max(size.getHeight(), size.getWidth())) * 0.7f < ((float) MessagesController.getInstance(y50Var2.a).roundVideoSize))) ? "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform float alpha;\nuniform vec2 preview;\nuniform vec2 resolution;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec4 textColor = texture2D(sTexture, vTextureCoord);\n   gl_FragColor = vec4(textColor.rgb * alpha, alpha);\n}\n" : "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform vec2 resolution;\nuniform vec2 preview;\nuniform float alpha;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   vec2 c_textureSize = preview;\n   vec2 c_onePixel = (1.0 / c_textureSize);\n   vec2 uv = vTextureCoord;\n   vec2 pixel = uv * c_textureSize + 0.5;\n   vec2 frac = fract(pixel);\n   pixel = (floor(pixel) / c_textureSize) - vec2(c_onePixel);\n   vec4 tl = texture2D(sTexture, pixel + vec2(0.0         , 0.0));\n   vec4 tr = texture2D(sTexture, pixel + vec2(c_onePixel.x, 0.0));\n   vec4 bl = texture2D(sTexture, pixel + vec2(0.0         , c_onePixel.y));\n   vec4 br = texture2D(sTexture, pixel + vec2(c_onePixel.x, c_onePixel.y));\n   vec4 x1 = mix(tl, tr, frac.x);\n   vec4 x2 = mix(bl, br, frac.x);\n   gl_FragColor = mix(x1, x2, frac.y) * alpha;\n}\n";
            int a2 = y50.a(x50Var.E0, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
            int a10 = y50.a(x50Var.E0, 35632, str);
            if (a2 == 0 || a10 == 0) {
                return;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            x50Var.j0 = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(x50Var.j0, a10);
            GLES20.glLinkProgram(x50Var.j0);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(x50Var.j0, 35714, iArr2, 0);
            if (iArr2[0] == 0) {
                GLES20.glDeleteProgram(x50Var.j0);
                x50Var.j0 = 0;
                return;
            }
            x50Var.m0 = GLES20.glGetAttribLocation(x50Var.j0, "aPosition");
            x50Var.n0 = GLES20.glGetAttribLocation(x50Var.j0, "aTextureCoord");
            x50Var.p0 = GLES20.glGetUniformLocation(x50Var.j0, "preview");
            x50Var.o0 = GLES20.glGetUniformLocation(x50Var.j0, "resolution");
            x50Var.r0 = GLES20.glGetUniformLocation(x50Var.j0, "alpha");
            x50Var.k0 = GLES20.glGetUniformLocation(x50Var.j0, "uMVPMatrix");
            x50Var.l0 = GLES20.glGetUniformLocation(x50Var.j0, "uSTMatrix");
            x50Var.q0 = GLES20.glGetUniformLocation(x50Var.j0, "texelSize");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void b(x50 x50Var, int i10, t50 t50Var) {
        boolean z4;
        DispatchQueue dispatchQueue;
        VideoEditedInfo videoEditedInfo;
        if (i10 != 1 || (((videoEditedInfo = x50Var.E0.K) != null && videoEditedInfo.needConvert()) || x50Var.E0.c.c())) {
            z4 = true;
        } else {
            if (!x50Var.D0) {
                x50Var.D0 = true;
                AndroidUtilities.runOnUIThread(new em(24, x50Var, t50Var));
            }
            z4 = false;
        }
        if (x50Var.T && !x50Var.A0) {
            FileLog.d("InstantCamera handleStopRecording running=false");
            x50Var.U = i10;
            x50Var.V = t50Var;
            x50Var.T = false;
            return;
        }
        try {
            FileLog.d("InstantCamera handleStopRecording drain encoders");
            x50Var.e(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaCodec mediaCodec = x50Var.B;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                x50Var.B.release();
                x50Var.B = null;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        MediaCodec mediaCodec2 = x50Var.C;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
                x50Var.C.release();
                x50Var.C = null;
                g(false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        File file = x50Var.E0.V;
        if (file != null) {
            file.delete();
            x50Var.E0.V = null;
        }
        MP4Builder mP4Builder = x50Var.H;
        if (mP4Builder != null) {
            try {
                mP4Builder.finishMovie();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            FileLog.d("InstantCamera handleStopRecording finish muxer");
            if (x50Var.c) {
                if (x50Var.a.exists()) {
                    try {
                        x50Var.a.delete();
                    } catch (Exception e12) {
                        FileLog.e("InstantCamera copying fileToWrite to videoFile, deleting videoFile error " + x50Var.a);
                        FileLog.e(e12);
                    }
                }
                if (!x50Var.b.renameTo(x50Var.a)) {
                    FileLog.e("InstantCamera unable to rename file, try move file");
                    try {
                        AndroidUtilities.copyFile(x50Var.b, x50Var.a);
                        x50Var.b.delete();
                    } catch (IOException e13) {
                        FileLog.e(e13);
                        FileLog.e("InstantCamera unable to move file");
                    }
                }
            }
        }
        if (i10 != 2 && (dispatchQueue = x50Var.y0) != null) {
            dispatchQueue.cleanupQueue();
            x50Var.y0.recycle();
            x50Var.y0 = null;
        }
        FileLog.d("InstantCamera handleStopRecording send " + i10);
        if (i10 == 0) {
            FileLoader.getInstance(x50Var.E0.a).cancelFileUpload(x50Var.a.getAbsolutePath(), false);
            try {
                x50Var.b.delete();
            } catch (Throwable unused) {
            }
            try {
                x50Var.a.delete();
            } catch (Throwable unused2) {
            }
        } else {
            if (z4 && (i10 != 1 || !x50Var.D0)) {
                x50Var.D0 = true;
                AndroidUtilities.runOnUIThread(new ey(x50Var, i10, t50Var, 5));
            }
            AndroidUtilities.runOnUIThread(new u50(x50Var, 3));
        }
        EGL14.eglDestroySurface(x50Var.s, x50Var.y);
        x50Var.y = EGL14.EGL_NO_SURFACE;
        Surface surface = x50Var.r;
        if (surface != null) {
            surface.release();
            x50Var.r = null;
        }
        EGLDisplay eGLDisplay = x50Var.s;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(x50Var.s, x50Var.v);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(x50Var.s);
        }
        x50Var.s = EGL14.EGL_NO_DISPLAY;
        x50Var.v = EGL14.EGL_NO_CONTEXT;
        x50Var.x = null;
        x50Var.Q.getClass();
        Looper.myLooper().quit();
        e50 e50Var = x50Var.u0;
        if (e50Var != null) {
            e50Var.b();
            x50Var.u0 = null;
        }
        AndroidUtilities.runOnUIThread(new u50(x50Var, 4));
    }

    public static void g(boolean z4) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (SharedConfig.recordViaSco && !he0.f("android.permission.BLUETOOTH_CONNECT")) {
            SharedConfig.recordViaSco = false;
            SharedConfig.saveConfig();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && SharedConfig.recordViaSco) && z4) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                if (defaultAdapter.getProfileConnectionState(1) != 2) {
                }
                if (!z4 && !audioManager.isBluetoothScoOn()) {
                    audioManager.startBluetoothSco();
                    return;
                } else if (z4 && audioManager.isBluetoothScoOn()) {
                    audioManager.stopBluetoothSco();
                    return;
                }
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th2) {
                FileLog.e(th2);
                if (z4) {
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
        if (z4) {
            return;
        }
        if (!z4) {
        }
        if (z4) {
        }
    }

    public final void c(m50 m50Var, long j10, boolean z4) {
        y50 y50Var = this.E0;
        int i10 = y50Var.a;
        if (!this.h) {
            FileLoader.getInstance(i10).checkUploadNewDataAvailable(m50Var.toString(), y50Var.J, j10, z4 ? m50Var.length() : 0L);
            return;
        }
        FileLoader.getInstance(i10).uploadFile(m50Var.toString(), y50Var.J, false, 1L, 33554432, false);
        this.h = false;
        if (z4) {
            FileLoader.getInstance(i10).checkUploadNewDataAvailable(m50Var.toString(), y50Var.J, j10, z4 ? m50Var.length() : 0L);
        }
    }

    public final void e(boolean z4) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (z4) {
            this.B.signalEndOfInputStream();
        }
        while (true) {
            int dequeueOutputBuffer = this.B.dequeueOutputBuffer(this.F, 10000L);
            byte b10 = 1;
            if (dequeueOutputBuffer == -1) {
                if (!z4 || this.A0) {
                    break;
                }
            } else if (dequeueOutputBuffer == -3) {
                continue;
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.B.getOutputFormat();
                if (this.J == -5) {
                    this.J = this.H.addTrack(outputFormat, false);
                    if (outputFormat.containsKey("prepend-sps-pps-to-idr-frames") && outputFormat.getInteger("prepend-sps-pps-to-idr-frames") == 1) {
                        this.D = outputFormat.getByteBuffer("csd-1").limit() + outputFormat.getByteBuffer("csd-0").limit();
                    }
                }
            } else if (dequeueOutputBuffer < 0) {
                continue;
            } else {
                ByteBuffer outputBuffer = this.B.getOutputBuffer(dequeueOutputBuffer);
                if (outputBuffer == null) {
                    throw new RuntimeException(kf.k0.k(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
                MediaCodec.BufferInfo bufferInfo = this.F;
                int i10 = bufferInfo.size;
                if (i10 > 1) {
                    int i11 = bufferInfo.flags;
                    if ((i11 & 2) == 0) {
                        int i12 = this.D;
                        if (i12 != 0 && (i11 & 1) != 0) {
                            bufferInfo.offset += i12;
                            bufferInfo.size = i10 - i12;
                        }
                        if (this.E && (i11 & 1) != 0) {
                            if (bufferInfo.size > 100) {
                                outputBuffer.position(bufferInfo.offset);
                                byte[] bArr = new byte[100];
                                outputBuffer.get(bArr);
                                int i13 = 0;
                                int i14 = 0;
                                while (true) {
                                    if (i13 < 96) {
                                        if (bArr[i13] == 0 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 0 && bArr[i13 + 3] == 1 && (i14 = i14 + 1) > 1) {
                                            MediaCodec.BufferInfo bufferInfo2 = this.F;
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
                            this.E = false;
                        }
                        long writeSampleData = this.H.writeSampleData(this.J, outputBuffer, this.F, true);
                        if (writeSampleData != 0 && !this.c && this.E0.N0) {
                            c(this.a, writeSampleData, false);
                        }
                    } else if (this.J == -5) {
                        byte[] bArr2 = new byte[i10];
                        outputBuffer.limit(bufferInfo.offset + i10);
                        outputBuffer.position(this.F.offset);
                        outputBuffer.get(bArr2);
                        int i15 = this.F.size - 1;
                        while (i15 >= 0 && i15 > 3) {
                            if (bArr2[i15] == b10 && bArr2[i15 - 1] == 0 && bArr2[i15 - 2] == 0) {
                                int i16 = i15 - 3;
                                if (bArr2[i16] == 0) {
                                    byteBuffer = ByteBuffer.allocate(i16);
                                    byteBuffer2 = ByteBuffer.allocate(this.F.size - i16);
                                    byteBuffer.put(bArr2, 0, i16).position(0);
                                    byteBuffer2.put(bArr2, i16, this.F.size - i16).position(0);
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
                        this.J = this.H.addTrack(createVideoFormat, false);
                    }
                }
                this.B.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((this.F.flags & 4) != 0) {
                    break;
                }
            }
        }
        while (true) {
            int dequeueOutputBuffer2 = this.C.dequeueOutputBuffer(this.G, 0L);
            if (dequeueOutputBuffer2 == -1) {
                if (!z4) {
                    return;
                }
                if ((!this.T && this.U == 0) || this.A0) {
                    return;
                }
            } else if (dequeueOutputBuffer2 != -3) {
                if (dequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat2 = this.C.getOutputFormat();
                    if (this.K == -5) {
                        this.K = this.H.addTrack(outputFormat2, true);
                    }
                } else if (dequeueOutputBuffer2 < 0) {
                    continue;
                } else {
                    ByteBuffer outputBuffer2 = this.C.getOutputBuffer(dequeueOutputBuffer2);
                    if (outputBuffer2 == null) {
                        throw new RuntimeException(kf.k0.k(dequeueOutputBuffer2, "encoderOutputBuffer ", " was null"));
                    }
                    MediaCodec.BufferInfo bufferInfo3 = this.G;
                    if ((bufferInfo3.flags & 2) != 0) {
                        bufferInfo3.size = 0;
                    }
                    if (bufferInfo3.size != 0) {
                        long writeSampleData2 = this.H.writeSampleData(this.K, outputBuffer2, bufferInfo3, false);
                        if (writeSampleData2 != 0 && !this.c && this.E0.N0) {
                            c(this.a, writeSampleData2, false);
                        }
                        MediaCodec mediaCodec = this.C;
                        if (mediaCodec != null) {
                            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        }
                    } else {
                        MediaCodec mediaCodec2 = this.C;
                        if (mediaCodec2 != null) {
                            mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        }
                    }
                    if ((this.G.flags & 4) != 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void f(SurfaceTexture surfaceTexture, Integer num, long j10) {
        synchronized (this.R) {
            try {
                if (this.S) {
                    long timestamp = surfaceTexture.getTimestamp();
                    if (timestamp == 0) {
                        int i10 = this.s0 + 1;
                        this.s0 = i10;
                        if (i10 <= 1) {
                            return;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("InstantCamera fix timestamp enabled");
                        }
                    } else {
                        this.s0 = 0;
                        j10 = timestamp;
                    }
                    this.Q.sendMessage(this.Q.obtainMessage(2, (int) (j10 >> 32), (int) j10, num));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() {
        e50 e50Var = this.u0;
        if (e50Var != null) {
            e50Var.b();
            this.u0 = null;
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
        i71 i71Var = new i71();
        y50 y50Var = this.E0;
        y50Var.L = i71Var;
        i71Var.G = new androidx.biometric.e0(this, 28);
        i71Var.V(y50Var.i0);
        y50Var.L.D(Uri.fromFile(file), "other");
        y50Var.L.C();
        y50Var.L.O(true);
        y50Var.n();
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = y50Var.O0;
        Property property = View.ALPHA;
        animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, 0.0f), ObjectAnimator.ofInt(y50Var.d, n6.b, 0), ObjectAnimator.ofFloat(y50Var.w, (Property<ImageView, Float>) property, 1.0f));
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

    public final void i(int i10, t50 t50Var) {
        this.Q.sendMessage(this.Q.obtainMessage(1, i10, 0, t50Var));
        AndroidUtilities.runOnUIThread(new u50(this, 5));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.prepare();
        synchronized (this.R) {
            c2.v0 v0Var = new c2.v0(2);
            v0Var.b = new WeakReference(this);
            this.Q = v0Var;
            this.S = true;
            this.R.notify();
        }
        Looper.loop();
        synchronized (this.R) {
            this.S = false;
        }
    }
}

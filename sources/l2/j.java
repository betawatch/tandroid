package l2;

import a8.ia;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import di.h4;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class j {
    public final Context a;
    public final k0.b b;
    public int c = 0;

    public j(Context context) {
        this.a = context;
        this.b = new k0.b(context, false);
    }

    public n2.q0 a(Context context) {
        return new h4(context, 1).a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:22|23)|24|25|26|(2:27|28)|(5:29|30|31|32|33)|(5:35|36|37|38|39)|41|42|87|(0)|90|91|92) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02df A[LOOP:0: B:88:0x02dd->B:89:0x02df, LOOP_END] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b[] b(Handler handler, c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList = new ArrayList();
        int i19 = this.c;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Context context = this.a;
        d3.j jVar = new d3.j(context);
        k0.b bVar = this.b;
        jVar.c = bVar;
        jVar.d = 5000L;
        jVar.e = handler;
        jVar.f = c0Var;
        jVar.g = 50;
        ia.p(!jVar.b);
        Handler handler2 = jVar.e;
        ia.p((handler2 == null && jVar.f == null) || !(handler2 == null || jVar.f == null));
        jVar.b = true;
        arrayList.add(new d3.l(jVar));
        if (i19 == 0) {
            i7 = 2;
        } else {
            int size = arrayList.size();
            if (i19 == 2) {
                size--;
            }
            int i20 = size;
            i7 = 2;
            try {
                try {
                    i10 = i20 + 1;
                    try {
                        arrayList.add(i20, (b) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, d3.h0.class, cls).newInstance(5000L, handler, c0Var, 50));
                        h2.a.g("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        i20 = i10;
                        i10 = i20;
                        try {
                            i11 = i10 + 1;
                            try {
                                arrayList.add(i10, (b) Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer").getConstructor(cls2, Handler.class, d3.h0.class, cls).newInstance(5000L, handler, c0Var, 50));
                                h2.a.g("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");
                            } catch (ClassNotFoundException unused2) {
                                i10 = i11;
                                i11 = i10;
                                int i21 = ExperimentalFfmpegVideoRenderer.r0;
                                arrayList.add(i11, (b) ExperimentalFfmpegVideoRenderer.class.getConstructor(cls2, Handler.class, d3.h0.class, cls).newInstance(5000L, handler, c0Var, 50));
                                h2.a.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                                n2.q0 a10 = a(context);
                                i12 = this.c;
                                Context context2 = this.a;
                                arrayList.add(new n2.t0(context2, bVar, handler, c0Var2, a10));
                                if (i12 != 0) {
                                }
                                arrayList.add(new z2.f(c0Var3, handler.getLooper()));
                                Looper looper = handler.getLooper();
                                while (i13 < 4) {
                                }
                                arrayList.add(new e3.a());
                                arrayList.add(new t2.f(new androidx.biometric.t(context, 2)));
                                return (b[]) arrayList.toArray(new b[0]);
                            }
                        } catch (ClassNotFoundException unused3) {
                        }
                        int i212 = ExperimentalFfmpegVideoRenderer.r0;
                        arrayList.add(i11, (b) ExperimentalFfmpegVideoRenderer.class.getConstructor(cls2, Handler.class, d3.h0.class, cls).newInstance(5000L, handler, c0Var, 50));
                        h2.a.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                        n2.q0 a102 = a(context);
                        i12 = this.c;
                        Context context22 = this.a;
                        arrayList.add(new n2.t0(context22, bVar, handler, c0Var2, a102));
                        if (i12 != 0) {
                        }
                        arrayList.add(new z2.f(c0Var3, handler.getLooper()));
                        Looper looper2 = handler.getLooper();
                        while (i13 < 4) {
                        }
                        arrayList.add(new e3.a());
                        arrayList.add(new t2.f(new androidx.biometric.t(context, 2)));
                        return (b[]) arrayList.toArray(new b[0]);
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    i11 = i10 + 1;
                    arrayList.add(i10, (b) Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer").getConstructor(cls2, Handler.class, d3.h0.class, cls).newInstance(5000L, handler, c0Var, 50));
                    h2.a.g("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");
                    try {
                        int i2122 = ExperimentalFfmpegVideoRenderer.r0;
                        arrayList.add(i11, (b) ExperimentalFfmpegVideoRenderer.class.getConstructor(cls2, Handler.class, d3.h0.class, cls).newInstance(5000L, handler, c0Var, 50));
                        h2.a.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                    } catch (ClassNotFoundException unused5) {
                    } catch (Exception e10) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e10);
                    }
                } catch (Exception e11) {
                    throw new IllegalStateException("Error instantiating AV1 extension", e11);
                }
            } catch (Exception e12) {
                throw new IllegalStateException("Error instantiating VP9 extension", e12);
            }
        }
        n2.q0 a1022 = a(context);
        i12 = this.c;
        Context context222 = this.a;
        arrayList.add(new n2.t0(context222, bVar, handler, c0Var2, a1022));
        if (i12 != 0) {
            int size2 = arrayList.size();
            if (i12 == i7) {
                size2--;
            }
            try {
                try {
                    Object[] objArr = {context222, handler, c0Var2, a1022};
                    i14 = size2 + 1;
                    try {
                        arrayList.add(size2, (b) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, n2.s.class, n2.x.class).newInstance(objArr));
                        h2.a.g("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused6) {
                        size2 = i14;
                        i14 = size2;
                        try {
                            i15 = i14 + 1;
                        } catch (ClassNotFoundException unused7) {
                        }
                        try {
                            try {
                                arrayList.add(i14, (b) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                                h2.a.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                            } catch (ClassNotFoundException unused8) {
                                i14 = i15;
                                i15 = i14;
                                i16 = i15 + 1;
                                arrayList.add(i15, (b) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                                h2.a.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                                try {
                                    i17 = i16 + 1;
                                    arrayList.add(i16, (b) FfmpegAudioRenderer.class.getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                                    h2.a.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                                    Class<?> cls3 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                                    Object newInstance = cls3.getConstructor(n2.x.class).newInstance(a1022);
                                    cls3.getMethod("setEventHandlerAndListener", Handler.class, n2.s.class).invoke(newInstance, handler, c0Var2);
                                    b bVar2 = (b) cls3.getMethod("build", null).invoke(newInstance, null);
                                    bVar2.getClass();
                                    i18 = i17 + 1;
                                    arrayList.add(i17, bVar2);
                                    h2.a.g("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                                    arrayList.add(i18, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                                    h2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                    arrayList.add(new z2.f(c0Var3, handler.getLooper()));
                                    Looper looper22 = handler.getLooper();
                                    while (i13 < 4) {
                                    }
                                    arrayList.add(new e3.a());
                                    arrayList.add(new t2.f(new androidx.biometric.t(context, 2)));
                                    return (b[]) arrayList.toArray(new b[0]);
                                } catch (Exception e13) {
                                    throw new IllegalStateException("Error instantiating FFmpeg extension", e13);
                                }
                            }
                            i16 = i15 + 1;
                            try {
                                arrayList.add(i15, (b) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                                h2.a.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused9) {
                                i15 = i16;
                                i16 = i15;
                                i17 = i16 + 1;
                                arrayList.add(i16, (b) FfmpegAudioRenderer.class.getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                                h2.a.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                                Class<?> cls32 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                                Object newInstance2 = cls32.getConstructor(n2.x.class).newInstance(a1022);
                                cls32.getMethod("setEventHandlerAndListener", Handler.class, n2.s.class).invoke(newInstance2, handler, c0Var2);
                                b bVar22 = (b) cls32.getMethod("build", null).invoke(newInstance2, null);
                                bVar22.getClass();
                                i18 = i17 + 1;
                                arrayList.add(i17, bVar22);
                                h2.a.g("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                                arrayList.add(i18, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                                h2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                arrayList.add(new z2.f(c0Var3, handler.getLooper()));
                                Looper looper222 = handler.getLooper();
                                while (i13 < 4) {
                                }
                                arrayList.add(new e3.a());
                                arrayList.add(new t2.f(new androidx.biometric.t(context, 2)));
                                return (b[]) arrayList.toArray(new b[0]);
                            }
                            try {
                                i17 = i16 + 1;
                                arrayList.add(i16, (b) FfmpegAudioRenderer.class.getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                                h2.a.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused10) {
                            }
                            try {
                                Class<?> cls322 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                                Object newInstance22 = cls322.getConstructor(n2.x.class).newInstance(a1022);
                                cls322.getMethod("setEventHandlerAndListener", Handler.class, n2.s.class).invoke(newInstance22, handler, c0Var2);
                                b bVar222 = (b) cls322.getMethod("build", null).invoke(newInstance22, null);
                                bVar222.getClass();
                                i18 = i17 + 1;
                                arrayList.add(i17, bVar222);
                                h2.a.g("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                            } catch (ReflectiveOperationException unused11) {
                            }
                            arrayList.add(i18, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                            h2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            arrayList.add(new z2.f(c0Var3, handler.getLooper()));
                            Looper looper2222 = handler.getLooper();
                            while (i13 < 4) {
                            }
                            arrayList.add(new e3.a());
                            arrayList.add(new t2.f(new androidx.biometric.t(context, 2)));
                            return (b[]) arrayList.toArray(new b[0]);
                        } catch (Exception e14) {
                            throw new IllegalStateException("Error instantiating FLAC extension", e14);
                        }
                    }
                } catch (ClassNotFoundException unused12) {
                }
                try {
                    i15 = i14 + 1;
                    arrayList.add(i14, (b) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                    h2.a.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    i16 = i15 + 1;
                    arrayList.add(i15, (b) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                    h2.a.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    i17 = i16 + 1;
                    try {
                        try {
                            arrayList.add(i16, (b) FfmpegAudioRenderer.class.getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                            h2.a.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused13) {
                            i16 = i17;
                            i17 = i16;
                            Class<?> cls3222 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                            Object newInstance222 = cls3222.getConstructor(n2.x.class).newInstance(a1022);
                            cls3222.getMethod("setEventHandlerAndListener", Handler.class, n2.s.class).invoke(newInstance222, handler, c0Var2);
                            b bVar2222 = (b) cls3222.getMethod("build", null).invoke(newInstance222, null);
                            bVar2222.getClass();
                            i18 = i17 + 1;
                            arrayList.add(i17, bVar2222);
                            h2.a.g("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                            arrayList.add(i18, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                            h2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            arrayList.add(new z2.f(c0Var3, handler.getLooper()));
                            Looper looper22222 = handler.getLooper();
                            while (i13 < 4) {
                            }
                            arrayList.add(new e3.a());
                            arrayList.add(new t2.f(new androidx.biometric.t(context, 2)));
                            return (b[]) arrayList.toArray(new b[0]);
                        }
                        Class<?> cls32222 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                        Object newInstance2222 = cls32222.getConstructor(n2.x.class).newInstance(a1022);
                        cls32222.getMethod("setEventHandlerAndListener", Handler.class, n2.s.class).invoke(newInstance2222, handler, c0Var2);
                        b bVar22222 = (b) cls32222.getMethod("build", null).invoke(newInstance2222, null);
                        bVar22222.getClass();
                        i18 = i17 + 1;
                        try {
                            arrayList.add(i17, bVar22222);
                            h2.a.g("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                        } catch (ReflectiveOperationException unused14) {
                            i17 = i18;
                            i18 = i17;
                            arrayList.add(i18, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                            h2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            arrayList.add(new z2.f(c0Var3, handler.getLooper()));
                            Looper looper222222 = handler.getLooper();
                            while (i13 < 4) {
                            }
                            arrayList.add(new e3.a());
                            arrayList.add(new t2.f(new androidx.biometric.t(context, 2)));
                            return (b[]) arrayList.toArray(new b[0]);
                        }
                        try {
                            arrayList.add(i18, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, n2.s.class, n2.x.class).newInstance(handler, c0Var2, a1022));
                            h2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                        } catch (ClassNotFoundException unused15) {
                        } catch (Exception e15) {
                            throw new IllegalStateException("Error instantiating MPEG-H extension", e15);
                        }
                    } catch (Exception e16) {
                        throw new IllegalStateException("Error instantiating IAMF extension", e16);
                    }
                } catch (Exception e17) {
                    throw new IllegalStateException("Error instantiating Opus extension", e17);
                }
            } catch (Exception e18) {
                throw new IllegalStateException("Error instantiating MIDI extension", e18);
            }
        }
        arrayList.add(new z2.f(c0Var3, handler.getLooper()));
        Looper looper2222222 = handler.getLooper();
        for (i13 = 0; i13 < 4; i13++) {
            arrayList.add(new v2.b(c0Var4, looper2222222));
        }
        arrayList.add(new e3.a());
        arrayList.add(new t2.f(new androidx.biometric.t(context, 2)));
        return (b[]) arrayList.toArray(new b[0]);
    }
}

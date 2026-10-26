package i2;

import a8.yb;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import di.p4;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class k {
    public final Context a;
    public final m5.j b;
    public int c = 0;

    public k(Context context) {
        this.a = context;
        this.b = new m5.j(context, 1);
    }

    public k2.u0 a(Context context) {
        return new p4(context, 1).a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:22|23)|24|25|26|(2:27|28)|(5:29|30|31|32|33)|(5:35|36|37|38|39)|41|42|87|(0)|90|91|92) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e0 A[LOOP:0: B:88:0x02de->B:89:0x02e0, LOOP_END] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b[] b(Handler handler, d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList = new ArrayList();
        int i20 = this.c;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Context context = this.a;
        a3.k kVar = new a3.k(context);
        m5.j jVar = this.b;
        kVar.c = jVar;
        kVar.d = 5000L;
        kVar.e = handler;
        kVar.f = d0Var;
        kVar.g = 50;
        yb.p(!kVar.b);
        Handler handler2 = kVar.e;
        yb.p((handler2 == null && kVar.f == null) || !(handler2 == null || kVar.f == null));
        kVar.b = true;
        arrayList.add(new a3.n(kVar));
        if (i20 == 0) {
            i10 = 2;
        } else {
            int size = arrayList.size();
            if (i20 == 2) {
                size--;
            }
            int i21 = size;
            i10 = 2;
            try {
                try {
                    i11 = i21 + 1;
                    try {
                        arrayList.add(i21, (b) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, a3.m0.class, cls).newInstance(5000L, handler, d0Var, 50));
                        e2.a.g("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        i21 = i11;
                        i11 = i21;
                        try {
                            i12 = i11 + 1;
                            try {
                                arrayList.add(i11, (b) Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer").getConstructor(cls2, Handler.class, a3.m0.class, cls).newInstance(5000L, handler, d0Var, 50));
                                e2.a.g("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");
                            } catch (ClassNotFoundException unused2) {
                                i11 = i12;
                                i12 = i11;
                                int i22 = ExperimentalFfmpegVideoRenderer.r0;
                                arrayList.add(i12, (b) ExperimentalFfmpegVideoRenderer.class.getConstructor(cls2, Handler.class, a3.m0.class, cls).newInstance(5000L, handler, d0Var, 50));
                                e2.a.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                                k2.u0 a2 = a(context);
                                i13 = this.c;
                                Context context2 = this.a;
                                arrayList.add(new k2.x0(context2, jVar, handler, d0Var2, a2));
                                if (i13 != 0) {
                                }
                                arrayList.add(new w2.e(d0Var3, handler.getLooper()));
                                Looper looper = handler.getLooper();
                                while (i14 < 4) {
                                }
                                arrayList.add(new b3.a());
                                arrayList.add(new q2.f(new l6.h(context, 4)));
                                return (b[]) arrayList.toArray(new b[0]);
                            }
                        } catch (ClassNotFoundException unused3) {
                        }
                        int i222 = ExperimentalFfmpegVideoRenderer.r0;
                        arrayList.add(i12, (b) ExperimentalFfmpegVideoRenderer.class.getConstructor(cls2, Handler.class, a3.m0.class, cls).newInstance(5000L, handler, d0Var, 50));
                        e2.a.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                        k2.u0 a22 = a(context);
                        i13 = this.c;
                        Context context22 = this.a;
                        arrayList.add(new k2.x0(context22, jVar, handler, d0Var2, a22));
                        if (i13 != 0) {
                        }
                        arrayList.add(new w2.e(d0Var3, handler.getLooper()));
                        Looper looper2 = handler.getLooper();
                        while (i14 < 4) {
                        }
                        arrayList.add(new b3.a());
                        arrayList.add(new q2.f(new l6.h(context, 4)));
                        return (b[]) arrayList.toArray(new b[0]);
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    i12 = i11 + 1;
                    arrayList.add(i11, (b) Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer").getConstructor(cls2, Handler.class, a3.m0.class, cls).newInstance(5000L, handler, d0Var, 50));
                    e2.a.g("DefaultRenderersFactory", "Loaded Libdav1dVideoRenderer.");
                    try {
                        int i2222 = ExperimentalFfmpegVideoRenderer.r0;
                        arrayList.add(i12, (b) ExperimentalFfmpegVideoRenderer.class.getConstructor(cls2, Handler.class, a3.m0.class, cls).newInstance(5000L, handler, d0Var, 50));
                        e2.a.g("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                    } catch (ClassNotFoundException unused5) {
                    } catch (Exception e) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e);
                    }
                } catch (Exception e10) {
                    throw new IllegalStateException("Error instantiating AV1 extension", e10);
                }
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating VP9 extension", e11);
            }
        }
        k2.u0 a222 = a(context);
        i13 = this.c;
        Context context222 = this.a;
        arrayList.add(new k2.x0(context222, jVar, handler, d0Var2, a222));
        if (i13 != 0) {
            int size2 = arrayList.size();
            if (i13 == i10) {
                size2--;
            }
            try {
                try {
                    Object[] objArr = {context222, handler, d0Var2, a222};
                    i15 = size2 + 1;
                    try {
                        arrayList.add(size2, (b) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, k2.v.class, k2.a0.class).newInstance(objArr));
                        e2.a.g("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused6) {
                        size2 = i15;
                        i15 = size2;
                        try {
                            i16 = i15 + 1;
                        } catch (ClassNotFoundException unused7) {
                        }
                        try {
                            try {
                                arrayList.add(i15, (b) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                                e2.a.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                            } catch (ClassNotFoundException unused8) {
                                i15 = i16;
                                i16 = i15;
                                i17 = i16 + 1;
                                arrayList.add(i16, (b) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                                e2.a.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                                try {
                                    i18 = i17 + 1;
                                    arrayList.add(i17, (b) FfmpegAudioRenderer.class.getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                                    e2.a.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                                    Class<?> cls3 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                                    Object newInstance = cls3.getConstructor(k2.a0.class).newInstance(a222);
                                    cls3.getMethod("setEventHandlerAndListener", Handler.class, k2.v.class).invoke(newInstance, handler, d0Var2);
                                    b bVar = (b) cls3.getMethod("build", null).invoke(newInstance, null);
                                    bVar.getClass();
                                    i19 = i18 + 1;
                                    arrayList.add(i18, bVar);
                                    e2.a.g("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                                    arrayList.add(i19, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                                    e2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                    arrayList.add(new w2.e(d0Var3, handler.getLooper()));
                                    Looper looper22 = handler.getLooper();
                                    while (i14 < 4) {
                                    }
                                    arrayList.add(new b3.a());
                                    arrayList.add(new q2.f(new l6.h(context, 4)));
                                    return (b[]) arrayList.toArray(new b[0]);
                                } catch (Exception e12) {
                                    throw new IllegalStateException("Error instantiating FFmpeg extension", e12);
                                }
                            }
                            i17 = i16 + 1;
                            try {
                                arrayList.add(i16, (b) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                                e2.a.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused9) {
                                i16 = i17;
                                i17 = i16;
                                i18 = i17 + 1;
                                arrayList.add(i17, (b) FfmpegAudioRenderer.class.getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                                e2.a.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                                Class<?> cls32 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                                Object newInstance2 = cls32.getConstructor(k2.a0.class).newInstance(a222);
                                cls32.getMethod("setEventHandlerAndListener", Handler.class, k2.v.class).invoke(newInstance2, handler, d0Var2);
                                b bVar2 = (b) cls32.getMethod("build", null).invoke(newInstance2, null);
                                bVar2.getClass();
                                i19 = i18 + 1;
                                arrayList.add(i18, bVar2);
                                e2.a.g("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                                arrayList.add(i19, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                                e2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                arrayList.add(new w2.e(d0Var3, handler.getLooper()));
                                Looper looper222 = handler.getLooper();
                                while (i14 < 4) {
                                }
                                arrayList.add(new b3.a());
                                arrayList.add(new q2.f(new l6.h(context, 4)));
                                return (b[]) arrayList.toArray(new b[0]);
                            }
                            try {
                                i18 = i17 + 1;
                                arrayList.add(i17, (b) FfmpegAudioRenderer.class.getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                                e2.a.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused10) {
                            }
                            try {
                                Class<?> cls322 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                                Object newInstance22 = cls322.getConstructor(k2.a0.class).newInstance(a222);
                                cls322.getMethod("setEventHandlerAndListener", Handler.class, k2.v.class).invoke(newInstance22, handler, d0Var2);
                                b bVar22 = (b) cls322.getMethod("build", null).invoke(newInstance22, null);
                                bVar22.getClass();
                                i19 = i18 + 1;
                                arrayList.add(i18, bVar22);
                                e2.a.g("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                            } catch (ReflectiveOperationException unused11) {
                            }
                            arrayList.add(i19, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                            e2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            arrayList.add(new w2.e(d0Var3, handler.getLooper()));
                            Looper looper2222 = handler.getLooper();
                            while (i14 < 4) {
                            }
                            arrayList.add(new b3.a());
                            arrayList.add(new q2.f(new l6.h(context, 4)));
                            return (b[]) arrayList.toArray(new b[0]);
                        } catch (Exception e13) {
                            throw new IllegalStateException("Error instantiating FLAC extension", e13);
                        }
                    }
                } catch (ClassNotFoundException unused12) {
                }
                try {
                    i16 = i15 + 1;
                    arrayList.add(i15, (b) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                    e2.a.g("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    i17 = i16 + 1;
                    arrayList.add(i16, (b) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                    e2.a.g("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    i18 = i17 + 1;
                    try {
                        try {
                            arrayList.add(i17, (b) FfmpegAudioRenderer.class.getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                            e2.a.g("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused13) {
                            i17 = i18;
                            i18 = i17;
                            Class<?> cls3222 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                            Object newInstance222 = cls3222.getConstructor(k2.a0.class).newInstance(a222);
                            cls3222.getMethod("setEventHandlerAndListener", Handler.class, k2.v.class).invoke(newInstance222, handler, d0Var2);
                            b bVar222 = (b) cls3222.getMethod("build", null).invoke(newInstance222, null);
                            bVar222.getClass();
                            i19 = i18 + 1;
                            arrayList.add(i18, bVar222);
                            e2.a.g("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                            arrayList.add(i19, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                            e2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            arrayList.add(new w2.e(d0Var3, handler.getLooper()));
                            Looper looper22222 = handler.getLooper();
                            while (i14 < 4) {
                            }
                            arrayList.add(new b3.a());
                            arrayList.add(new q2.f(new l6.h(context, 4)));
                            return (b[]) arrayList.toArray(new b[0]);
                        }
                        Class<?> cls32222 = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                        Object newInstance2222 = cls32222.getConstructor(k2.a0.class).newInstance(a222);
                        cls32222.getMethod("setEventHandlerAndListener", Handler.class, k2.v.class).invoke(newInstance2222, handler, d0Var2);
                        b bVar2222 = (b) cls32222.getMethod("build", null).invoke(newInstance2222, null);
                        bVar2222.getClass();
                        i19 = i18 + 1;
                        try {
                            arrayList.add(i18, bVar2222);
                            e2.a.g("DefaultRenderersFactory", "Loaded IamfAudioRenderer.");
                        } catch (ReflectiveOperationException unused14) {
                            i18 = i19;
                            i19 = i18;
                            arrayList.add(i19, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                            e2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                            arrayList.add(new w2.e(d0Var3, handler.getLooper()));
                            Looper looper222222 = handler.getLooper();
                            while (i14 < 4) {
                            }
                            arrayList.add(new b3.a());
                            arrayList.add(new q2.f(new l6.h(context, 4)));
                            return (b[]) arrayList.toArray(new b[0]);
                        }
                        try {
                            arrayList.add(i19, (b) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.v.class, k2.a0.class).newInstance(handler, d0Var2, a222));
                            e2.a.g("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                        } catch (ClassNotFoundException unused15) {
                        } catch (Exception e14) {
                            throw new IllegalStateException("Error instantiating MPEG-H extension", e14);
                        }
                    } catch (Exception e15) {
                        throw new IllegalStateException("Error instantiating IAMF extension", e15);
                    }
                } catch (Exception e16) {
                    throw new IllegalStateException("Error instantiating Opus extension", e16);
                }
            } catch (Exception e17) {
                throw new IllegalStateException("Error instantiating MIDI extension", e17);
            }
        }
        arrayList.add(new w2.e(d0Var3, handler.getLooper()));
        Looper looper2222222 = handler.getLooper();
        for (i14 = 0; i14 < 4; i14++) {
            arrayList.add(new s2.b(d0Var4, looper2222222));
        }
        arrayList.add(new b3.a());
        arrayList.add(new q2.f(new l6.h(context, 4)));
        return (b[]) arrayList.toArray(new b[0]);
    }
}

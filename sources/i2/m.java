package i2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import bi.n5;
import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class m {
    public final Context a;
    public final q2.b b;
    public int c = 0;

    public m(Context context) {
        this.a = context;
        this.b = new q2.b(context);
    }

    public k2.d0 a(Context context) {
        return new n5(context).a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:11|(1:13)|14|15|16|(2:17|18)|20|21|22|(17:(2:23|24)|26|27|28|29|30|32|33|34|35|36|38|39|40|41|42|(2:44|45))) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:11|(1:13)|14|15|16|17|18|20|21|22|(2:23|24)|26|27|28|29|30|32|33|34|35|36|38|39|40|41|42|(2:44|45)) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0113  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f[] b(Handler handler, c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ArrayList arrayList = new ArrayList();
        int i16 = this.c;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Context context = this.a;
        a3.j jVar = new a3.j(context);
        q2.b bVar = this.b;
        jVar.c = bVar;
        jVar.d = 5000L;
        jVar.e = handler;
        jVar.f = c0Var;
        jVar.g = 50;
        e2.d.g(!jVar.b);
        Handler handler2 = jVar.e;
        e2.d.g((handler2 == null && jVar.f == null) || !(handler2 == null || jVar.f == null));
        jVar.b = true;
        arrayList.add(new a3.m(jVar));
        if (i16 != 0) {
            int size = arrayList.size();
            if (i16 == 2) {
                size--;
            }
            int i17 = size;
            try {
                try {
                    i10 = i17 + 1;
                } catch (Exception e7) {
                    throw new IllegalStateException("Error instantiating VP9 extension", e7);
                }
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(i17, (f) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, c0.class, cls).newInstance(5000L, handler, c0Var, 50));
                e2.a.i("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused2) {
                i17 = i10;
                i10 = i17;
                arrayList.add(i10, (f) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, c0.class, cls).newInstance(5000L, handler, c0Var, 50));
                e2.a.i("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                k2.d0 a2 = a(context);
                i11 = this.c;
                Context context2 = this.a;
                arrayList.add(new k2.h0(context2, bVar, handler, c0Var2, a2));
                if (i11 != 0) {
                }
                arrayList.add(new w2.e(c0Var3, handler.getLooper()));
                Looper looper = handler.getLooper();
                arrayList.add(new s2.b(c0Var4, looper));
                arrayList.add(new s2.b(c0Var4, looper));
                arrayList.add(new b3.a());
                arrayList.add(new q2.g(new q2.b(context)));
                return (f[]) arrayList.toArray(new f[0]);
            }
            try {
                arrayList.add(i10, (f) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, c0.class, cls).newInstance(5000L, handler, c0Var, 50));
                e2.a.i("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e10) {
                throw new IllegalStateException("Error instantiating AV1 extension", e10);
            }
        }
        k2.d0 a22 = a(context);
        i11 = this.c;
        Context context22 = this.a;
        arrayList.add(new k2.h0(context22, bVar, handler, c0Var2, a22));
        if (i11 != 0) {
            int size2 = arrayList.size();
            if (i11 == 2) {
                size2--;
            }
            try {
                try {
                    i12 = size2 + 1;
                } catch (Exception e11) {
                    throw new IllegalStateException("Error instantiating MIDI extension", e11);
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                try {
                    arrayList.add(size2, (f) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(context22, handler, c0Var2, a22));
                    e2.a.i("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused5) {
                    size2 = i12;
                    i12 = size2;
                    i13 = i12 + 1;
                    arrayList.add(i12, (f) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                    e2.a.i("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    try {
                        i14 = i13 + 1;
                        try {
                            arrayList.add(i13, (f) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                            e2.a.i("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused6) {
                            i13 = i14;
                            i14 = i13;
                            try {
                                i15 = i14 + 1;
                            } catch (ClassNotFoundException unused7) {
                            }
                            try {
                                arrayList.add(i14, (f) androidx.media3.decoder.ffmpeg.b.class.getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                e2.a.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused8) {
                                i14 = i15;
                                i15 = i14;
                                Object[] objArr = {context22, handler, c0Var2, a22};
                                int i18 = i15 + 1;
                                try {
                                    arrayList.add(i15, (f) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(objArr));
                                    e2.a.i("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                                } catch (ClassNotFoundException unused9) {
                                    i15 = i18;
                                    i18 = i15;
                                    arrayList.add(i18, (f) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                    e2.a.i("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                    arrayList.add(new w2.e(c0Var3, handler.getLooper()));
                                    Looper looper2 = handler.getLooper();
                                    arrayList.add(new s2.b(c0Var4, looper2));
                                    arrayList.add(new s2.b(c0Var4, looper2));
                                    arrayList.add(new b3.a());
                                    arrayList.add(new q2.g(new q2.b(context)));
                                    return (f[]) arrayList.toArray(new f[0]);
                                }
                                arrayList.add(i18, (f) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                e2.a.i("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                arrayList.add(new w2.e(c0Var3, handler.getLooper()));
                                Looper looper22 = handler.getLooper();
                                arrayList.add(new s2.b(c0Var4, looper22));
                                arrayList.add(new s2.b(c0Var4, looper22));
                                arrayList.add(new b3.a());
                                arrayList.add(new q2.g(new q2.b(context)));
                                return (f[]) arrayList.toArray(new f[0]);
                            }
                            try {
                                Object[] objArr2 = {context22, handler, c0Var2, a22};
                                int i182 = i15 + 1;
                                arrayList.add(i15, (f) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(objArr2));
                                e2.a.i("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                                arrayList.add(i182, (f) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                e2.a.i("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                arrayList.add(new w2.e(c0Var3, handler.getLooper()));
                                Looper looper222 = handler.getLooper();
                                arrayList.add(new s2.b(c0Var4, looper222));
                                arrayList.add(new s2.b(c0Var4, looper222));
                                arrayList.add(new b3.a());
                                arrayList.add(new q2.g(new q2.b(context)));
                                return (f[]) arrayList.toArray(new f[0]);
                            } catch (Exception e12) {
                                throw new IllegalStateException("Error instantiating IAMF extension", e12);
                            }
                        }
                    } catch (ClassNotFoundException unused10) {
                    }
                    try {
                        i15 = i14 + 1;
                        arrayList.add(i14, (f) androidx.media3.decoder.ffmpeg.b.class.getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                        e2.a.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        Object[] objArr22 = {context22, handler, c0Var2, a22};
                        int i1822 = i15 + 1;
                        arrayList.add(i15, (f) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(objArr22));
                        e2.a.i("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                        arrayList.add(i1822, (f) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                        e2.a.i("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                        arrayList.add(new w2.e(c0Var3, handler.getLooper()));
                        Looper looper2222 = handler.getLooper();
                        arrayList.add(new s2.b(c0Var4, looper2222));
                        arrayList.add(new s2.b(c0Var4, looper2222));
                        arrayList.add(new b3.a());
                        arrayList.add(new q2.g(new q2.b(context)));
                        return (f[]) arrayList.toArray(new f[0]);
                    } catch (Exception e13) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e13);
                    }
                }
                i13 = i12 + 1;
                try {
                    try {
                        arrayList.add(i12, (f) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                        e2.a.i("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused11) {
                        i12 = i13;
                        i13 = i12;
                        i14 = i13 + 1;
                        arrayList.add(i13, (f) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                        e2.a.i("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        i15 = i14 + 1;
                        arrayList.add(i14, (f) androidx.media3.decoder.ffmpeg.b.class.getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                        e2.a.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        Object[] objArr222 = {context22, handler, c0Var2, a22};
                        int i18222 = i15 + 1;
                        arrayList.add(i15, (f) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(objArr222));
                        e2.a.i("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                        arrayList.add(i18222, (f) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                        e2.a.i("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                        arrayList.add(new w2.e(c0Var3, handler.getLooper()));
                        Looper looper22222 = handler.getLooper();
                        arrayList.add(new s2.b(c0Var4, looper22222));
                        arrayList.add(new s2.b(c0Var4, looper22222));
                        arrayList.add(new b3.a());
                        arrayList.add(new q2.g(new q2.b(context)));
                        return (f[]) arrayList.toArray(new f[0]);
                    }
                    i14 = i13 + 1;
                    arrayList.add(i13, (f) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                    e2.a.i("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    i15 = i14 + 1;
                    arrayList.add(i14, (f) androidx.media3.decoder.ffmpeg.b.class.getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                    e2.a.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    Object[] objArr2222 = {context22, handler, c0Var2, a22};
                    int i182222 = i15 + 1;
                    arrayList.add(i15, (f) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(objArr2222));
                    e2.a.i("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                    try {
                        arrayList.add(i182222, (f) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                        e2.a.i("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                    } catch (ClassNotFoundException unused12) {
                    } catch (Exception e14) {
                        throw new IllegalStateException("Error instantiating MPEG-H extension", e14);
                    }
                } catch (Exception e15) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e15);
                }
            } catch (Exception e16) {
                throw new IllegalStateException("Error instantiating Opus extension", e16);
            }
        }
        arrayList.add(new w2.e(c0Var3, handler.getLooper()));
        Looper looper222222 = handler.getLooper();
        arrayList.add(new s2.b(c0Var4, looper222222));
        arrayList.add(new s2.b(c0Var4, looper222222));
        arrayList.add(new b3.a());
        arrayList.add(new q2.g(new q2.b(context)));
        return (f[]) arrayList.toArray(new f[0]);
    }
}

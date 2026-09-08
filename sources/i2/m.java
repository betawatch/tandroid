package i2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import bi.n5;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    /* JADX WARN: Can't wrap try/catch for region: R(11:(10:(2:22|23)|37|38|39|40|41|43|44|87|88)|25|26|27|28|29|31|32|33|34|35) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:89|(1:91)|92|93|94|(6:95|96|97|98|99|100)|(2:101|102)|104|105|106|107|108|(2:110|111)) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:80|81|19|20|21|(2:22|23)|25|26|27|28|29|31|32|33|34|35|37|38|39|40|41|43|44|87|88) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:101|102)|104|105|106|107|108|(2:110|111)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00f9, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0103, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x029e, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02a8, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0256, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x025e, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x015f  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f[] b(Handler handler, c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4) {
        Integer num;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = this.c;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        Context context = this.a;
        a3.k kVar = new a3.k(context);
        q2.b bVar = this.b;
        kVar.c = bVar;
        kVar.d = 5000L;
        kVar.e = handler;
        kVar.f = c0Var;
        kVar.g = 50;
        e2.d.g(!kVar.b);
        Handler handler2 = kVar.e;
        e2.d.g((handler2 == null && kVar.f == null) || !(handler2 == null || kVar.f == null));
        kVar.b = true;
        arrayList.add(new a3.n(kVar));
        if (i15 != 0) {
            int size = arrayList.size();
            if (i15 == 2) {
                size--;
            }
            int i16 = size;
            try {
                try {
                    num = 50;
                    try {
                        i10 = i16 + 1;
                    } catch (ClassNotFoundException unused) {
                    }
                } catch (Exception e7) {
                    throw new IllegalStateException("Error instantiating VP9 extension", e7);
                }
            } catch (ClassNotFoundException unused2) {
                num = 50;
            }
            try {
                try {
                    arrayList.add(i16, (f) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, a3.l0.class, cls).newInstance(5000L, handler, c0Var, 50));
                    e2.a.i("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i16 = i10;
                    i10 = i16;
                    int i17 = i10 + 1;
                    arrayList.add(i10, (f) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, a3.l0.class, cls).newInstance(5000L, handler, c0Var, num));
                    e2.a.i("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                    int i18 = ExperimentalFfmpegVideoRenderer.r0;
                    arrayList.add(i17, (f) ExperimentalFfmpegVideoRenderer.class.getConstructor(cls2, Handler.class, a3.l0.class, cls).newInstance(5000L, handler, c0Var, num));
                    e2.a.i("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
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
                int i172 = i10 + 1;
                arrayList.add(i10, (f) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, a3.l0.class, cls).newInstance(5000L, handler, c0Var, num));
                e2.a.i("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                try {
                    int i182 = ExperimentalFfmpegVideoRenderer.r0;
                    arrayList.add(i172, (f) ExperimentalFfmpegVideoRenderer.class.getConstructor(cls2, Handler.class, a3.l0.class, cls).newInstance(5000L, handler, c0Var, num));
                    e2.a.i("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused4) {
                } catch (Exception e10) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e10);
                }
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating AV1 extension", e11);
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
                    try {
                        arrayList.add(size2, (f) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(context22, handler, c0Var2, a22));
                        e2.a.i("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        size2 = i12;
                        i12 = size2;
                        try {
                            i13 = i12 + 1;
                            try {
                                try {
                                    try {
                                        arrayList.add(i12, (f) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                        e2.a.i("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                                    } catch (ClassNotFoundException unused6) {
                                        i12 = i13;
                                        i13 = i12;
                                        i14 = i13 + 1;
                                        arrayList.add(i13, (f) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                        e2.a.i("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                                        int i19 = i14 + 1;
                                        arrayList.add(i14, (f) FfmpegAudioRenderer.class.getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                        e2.a.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                                        Object[] objArr = {context22, handler, c0Var2, a22};
                                        int i20 = i19 + 1;
                                        arrayList.add(i19, (f) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(objArr));
                                        e2.a.i("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                                        arrayList.add(i20, (f) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                        e2.a.i("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                        arrayList.add(new w2.e(c0Var3, handler.getLooper()));
                                        Looper looper2 = handler.getLooper();
                                        arrayList.add(new s2.b(c0Var4, looper2));
                                        arrayList.add(new s2.b(c0Var4, looper2));
                                        arrayList.add(new b3.a());
                                        arrayList.add(new q2.g(new q2.b(context)));
                                        return (f[]) arrayList.toArray(new f[0]);
                                    }
                                    Object[] objArr2 = {context22, handler, c0Var2, a22};
                                    int i202 = i19 + 1;
                                    arrayList.add(i19, (f) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(objArr2));
                                    e2.a.i("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                                    arrayList.add(i202, (f) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                    e2.a.i("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                                    arrayList.add(new w2.e(c0Var3, handler.getLooper()));
                                    Looper looper22 = handler.getLooper();
                                    arrayList.add(new s2.b(c0Var4, looper22));
                                    arrayList.add(new s2.b(c0Var4, looper22));
                                    arrayList.add(new b3.a());
                                    arrayList.add(new q2.g(new q2.b(context)));
                                    return (f[]) arrayList.toArray(new f[0]);
                                } catch (Exception e12) {
                                    throw new IllegalStateException("Error instantiating IAMF extension", e12);
                                }
                                i14 = i13 + 1;
                                arrayList.add(i13, (f) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                e2.a.i("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                                int i192 = i14 + 1;
                                arrayList.add(i14, (f) FfmpegAudioRenderer.class.getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                                e2.a.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            } catch (Exception e13) {
                                throw new IllegalStateException("Error instantiating FLAC extension", e13);
                            }
                        } catch (Exception e14) {
                            throw new IllegalStateException("Error instantiating Opus extension", e14);
                        }
                    }
                } catch (Exception e15) {
                    throw new IllegalStateException("Error instantiating MIDI extension", e15);
                }
            } catch (ClassNotFoundException unused7) {
            }
            try {
                i13 = i12 + 1;
                arrayList.add(i12, (f) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                e2.a.i("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
            } catch (ClassNotFoundException unused8) {
            }
            try {
                i14 = i13 + 1;
            } catch (ClassNotFoundException unused9) {
            }
            try {
                try {
                    arrayList.add(i13, (f) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                    e2.a.i("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused10) {
                    i13 = i14;
                    i14 = i13;
                    int i1922 = i14 + 1;
                    arrayList.add(i14, (f) FfmpegAudioRenderer.class.getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                    e2.a.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    Object[] objArr22 = {context22, handler, c0Var2, a22};
                    int i2022 = i1922 + 1;
                    arrayList.add(i1922, (f) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(objArr22));
                    e2.a.i("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                    arrayList.add(i2022, (f) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                    e2.a.i("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                    arrayList.add(new w2.e(c0Var3, handler.getLooper()));
                    Looper looper222 = handler.getLooper();
                    arrayList.add(new s2.b(c0Var4, looper222));
                    arrayList.add(new s2.b(c0Var4, looper222));
                    arrayList.add(new b3.a());
                    arrayList.add(new q2.g(new q2.b(context)));
                    return (f[]) arrayList.toArray(new f[0]);
                }
                int i19222 = i14 + 1;
                arrayList.add(i14, (f) FfmpegAudioRenderer.class.getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                e2.a.i("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                Object[] objArr222 = {context22, handler, c0Var2, a22};
                int i20222 = i19222 + 1;
                arrayList.add(i19222, (f) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, k2.j.class, k2.p.class).newInstance(objArr222));
                e2.a.i("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                try {
                    arrayList.add(i20222, (f) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, k2.j.class, k2.p.class).newInstance(handler, c0Var2, a22));
                    e2.a.i("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                } catch (ClassNotFoundException unused11) {
                } catch (Exception e16) {
                    throw new IllegalStateException("Error instantiating MPEG-H extension", e16);
                }
            } catch (Exception e17) {
                throw new IllegalStateException("Error instantiating FFmpeg extension", e17);
            }
        }
        arrayList.add(new w2.e(c0Var3, handler.getLooper()));
        Looper looper2222 = handler.getLooper();
        arrayList.add(new s2.b(c0Var4, looper2222));
        arrayList.add(new s2.b(c0Var4, looper2222));
        arrayList.add(new b3.a());
        arrayList.add(new q2.g(new q2.b(context)));
        return (f[]) arrayList.toArray(new f[0]);
    }
}

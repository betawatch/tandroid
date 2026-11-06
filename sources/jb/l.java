package jb;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class l {
    public final q a;
    public final q b;

    public l(q localOverrideSettings, q remoteSettings) {
        kotlin.jvm.internal.j.e(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.j.e(remoteSettings, "remoteSettings");
        this.a = localOverrideSettings;
        this.b = remoteSettings;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double doubleValue2 = d2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r5.b.b(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r5.a.b(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kd.c cVar) {
        k kVar;
        int i7;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                kVar.c = i10 - TLObject.FLAG_31;
                Object obj = kVar.a;
                jd.a aVar = jd.a.a;
                i7 = kVar.c;
                if (i7 != 0) {
                    af.b.c(obj);
                    kVar.c = 1;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        af.b.c(obj);
                        return gd.k.a;
                    }
                    af.b.c(obj);
                }
                kVar.c = 2;
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.a;
        jd.a aVar2 = jd.a.a;
        i7 = kVar.c;
        if (i7 != 0) {
        }
        kVar.c = 2;
    }
}

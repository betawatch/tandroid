package gb;

import b8.ib;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        Double d10 = this.b.d();
        if (d10 != null) {
            double doubleValue2 = d10.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r5.b.a(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r5.a.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hd.c cVar) {
        k kVar;
        int i3;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                kVar.c = i10 - TLObject.FLAG_31;
                Object obj = kVar.a;
                gd.a aVar = gd.a.a;
                i3 = kVar.c;
                if (i3 != 0) {
                    ib.b(obj);
                    kVar.c = 1;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                        return dd.k.a;
                    }
                    ib.b(obj);
                }
                kVar.c = 2;
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.a;
        gd.a aVar2 = gd.a.a;
        i3 = kVar.c;
        if (i3 != 0) {
        }
        kVar.c = 2;
    }
}

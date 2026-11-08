package bi;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ wg.f1[] d;

    public /* synthetic */ b3(k7 k7Var, Long l10, wg.f1[] f1VarArr, int i7) {
        this.a = i7;
        this.b = k7Var;
        this.c = l10;
        this.d = f1VarArr;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                vf.b bVar = (vf.b) obj;
                bVar.d();
                long longValue = this.c.longValue();
                k7 k7Var = this.b;
                k7Var.s1(longValue, new v3(k7Var, bVar, this.d, 0));
                break;
            default:
                k7 k7Var2 = this.b;
                k7Var2.getClass();
                k7Var2.r1(this.c.longValue(), null, (vf.b) obj, this.d[0]);
                break;
        }
    }
}

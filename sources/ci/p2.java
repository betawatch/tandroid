package ci;

import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ xg.e1[] d;

    public /* synthetic */ p2(l6 l6Var, Long l10, xg.e1[] e1VarArr, int i3) {
        this.a = i3;
        this.b = l6Var;
        this.c = l10;
        this.d = e1VarArr;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                sf.b bVar = (sf.b) obj;
                bVar.d();
                long longValue = this.c.longValue();
                l6 l6Var = this.b;
                l6Var.s1(longValue, new ai.m(l6Var, bVar, this.d, 2));
                break;
            default:
                l6 l6Var2 = this.b;
                l6Var2.getClass();
                l6Var2.r1(this.c.longValue(), null, (sf.b) obj, this.d[0]);
                break;
        }
    }
}

package di;

import org.telegram.messenger.z10;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ wg.c1[] d;

    public /* synthetic */ j2(c6 c6Var, Long l10, wg.c1[] c1VarArr, int i7) {
        this.a = i7;
        this.b = c6Var;
        this.c = l10;
        this.d = c1VarArr;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                vf.b bVar = (vf.b) obj;
                bVar.d();
                long longValue = this.c.longValue();
                c6 c6Var = this.b;
                c6Var.s1(longValue, new bi.j(c6Var, bVar, this.d, 2));
                break;
            default:
                c6 c6Var2 = this.b;
                c6Var2.getClass();
                c6Var2.r1(this.c.longValue(), null, (vf.b) obj, this.d[0]);
                break;
        }
    }
}

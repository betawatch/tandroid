package ai;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ ug.l1[] d;

    public /* synthetic */ m3(k7 k7Var, Long l4, ug.l1[] l1VarArr, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = l4;
        this.d = l1VarArr;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                pf.c cVar = (pf.c) obj;
                cVar.d();
                long longValue = this.c.longValue();
                k7 k7Var = this.b;
                k7Var.I1(longValue, new w3(k7Var, cVar, this.d, 0));
                break;
            default:
                k7 k7Var2 = this.b;
                k7Var2.getClass();
                k7Var2.H1(this.c.longValue(), null, (pf.c) obj, this.d[0]);
                break;
        }
    }
}

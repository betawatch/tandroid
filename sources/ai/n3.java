package ai;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ ug.m1[] d;

    public /* synthetic */ n3(k7 k7Var, Long l4, ug.m1[] m1VarArr, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = l4;
        this.d = m1VarArr;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                pf.c cVar = (pf.c) obj;
                cVar.d();
                long longValue = this.c.longValue();
                k7 k7Var = this.b;
                k7Var.J1(longValue, new w3(k7Var, cVar, this.d, 0));
                break;
            default:
                k7 k7Var2 = this.b;
                k7Var2.getClass();
                k7Var2.I1(this.c.longValue(), null, (pf.c) obj, this.d[0]);
                break;
        }
    }
}

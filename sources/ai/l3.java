package ai;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ ug.m1[] d;

    public /* synthetic */ l3(k7 k7Var, Long l4, ug.m1[] m1VarArr, int i10) {
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
                k7Var.J1(longValue, new y3(k7Var, cVar, this.d, 0));
                break;
            default:
                k7 k7Var2 = this.b;
                k7Var2.getClass();
                k7Var2.I1(this.c.longValue(), null, (pf.c) obj, this.d[0]);
                break;
        }
    }
}

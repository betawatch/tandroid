package ai;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ ug.l1[] d;

    public /* synthetic */ h3(l7 l7Var, Long l4, ug.l1[] l1VarArr, int i10) {
        this.a = i10;
        this.b = l7Var;
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
                l7 l7Var = this.b;
                l7Var.P1(longValue, new a4(l7Var, cVar, this.d, 0));
                break;
            default:
                l7 l7Var2 = this.b;
                l7Var2.getClass();
                l7Var2.O1(this.c.longValue(), null, (pf.c) obj, this.d[0]);
                break;
        }
    }
}

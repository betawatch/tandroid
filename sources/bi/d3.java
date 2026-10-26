package bi;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ vg.n1[] d;

    public /* synthetic */ d3(h7 h7Var, Long l4, vg.n1[] n1VarArr, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = l4;
        this.d = n1VarArr;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                qf.c cVar = (qf.c) obj;
                cVar.d();
                long longValue = this.c.longValue();
                h7 h7Var = this.b;
                h7Var.P1(longValue, new v3(h7Var, cVar, this.d, 0));
                break;
            default:
                h7 h7Var2 = this.b;
                h7Var2.getClass();
                h7Var2.O1(this.c.longValue(), null, (qf.c) obj, this.d[0]);
                break;
        }
    }
}

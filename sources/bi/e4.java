package bi;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ qf.c c;
    public final /* synthetic */ vg.n1 d;

    public /* synthetic */ e4(h7 h7Var, qf.c cVar, vg.n1 n1Var, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = cVar;
        this.d = n1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                h7.f0(this.b, this.c, this.d, (String) obj);
                break;
            default:
                h7.h0(this.b, this.c, this.d, (String) obj);
                break;
        }
    }
}

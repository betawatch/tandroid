// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b0a extends u55 {
    public final /* synthetic */ byte Q;
    public final /* synthetic */ n1a R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0a(n1a n1aVar, byte b) {
        super(40);
        this.Q = b;
        this.R = n1aVar;
    }

    @Override // q79
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        switch (this.Q) {
            case 0:
                try {
                    aw3 aw3Var = new aw3((byte) 3, recyclerView.getContext(), this);
                    aw3Var.a = i;
                    v0(aw3Var);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            default:
                try {
                    aw3 aw3Var2 = new aw3((byte) 5, recyclerView.getContext(), this);
                    aw3Var2.a = i;
                    v0(aw3Var2);
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}

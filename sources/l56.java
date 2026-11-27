// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l56 implements hj, fd, yma {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v56 b;

    public /* synthetic */ l56(v56 v56Var, byte b) {
        this.a = b;
        this.b = v56Var;
    }

    @Override // yma
    public final void j(int i) {
        byte b = this.a;
        v56 v56Var = this.b;
        switch (b) {
            case 2:
                if (i >= v56Var.P.size()) {
                    v56Var.x.setText("");
                    break;
                } else {
                    v56Var.x.setText(ob6.s(v56Var.getConnectionsManager().getCurrentTime() + ((Integer) r0.get(i)).intValue(), false));
                    break;
                }
            default:
                v56Var.G.clearFocus();
                v56Var.O = true;
                ArrayList arrayList = v56Var.R;
                int size = arrayList.size();
                q56 q56Var = v56Var.G;
                if (i < size) {
                    q56Var.setText(((Integer) arrayList.get(i)).toString());
                } else {
                    q56Var.setText("");
                }
                v56Var.O = false;
                break;
        }
    }

    @Override // yma
    public final void m() {
        byte b = this.a;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        v56 v56Var = this.b;
        v56Var.T.a(v56Var.e);
        v56Var.finishFragment();
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        this.b.Z(i);
    }

    private final void a() {
    }

    private final void b() {
    }
}

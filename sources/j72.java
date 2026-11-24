// default package

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j72 extends u2b {
    public final /* synthetic */ byte S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j72(v6c v6cVar) {
        super(null, false);
        this.T = v6cVar;
    }

    @Override // u2b
    public final void f(long j) {
        byte b = this.S;
        View view = this.T;
        switch (b) {
            case 0:
                k72 k72Var = (k72) view;
                k72Var.I.getOrCreateStoryViewer().H(k72Var.getContext(), j, new rh1(this, (byte) 19));
                break;
            case 1:
                ((qz8) view).b(j);
                break;
            default:
                v6c v6cVar = (v6c) view;
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().H(v6cVar.getContext(), j, p2b.a((o39) v6cVar.getParent()));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j72(qz8 qz8Var, wjb wjbVar) {
        super(wjbVar, false);
        this.T = qz8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j72(k72 k72Var) {
        super(null, true);
        this.T = k72Var;
    }
}

// default package

import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class a82 extends q6b {
    public final /* synthetic */ byte S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a82(vac vacVar) {
        super(null, false);
        this.T = vacVar;
    }

    @Override // q6b
    public final void f(long j) {
        byte b = this.S;
        View view = this.T;
        switch (b) {
            case 0:
                b82 b82Var = (b82) view;
                b82Var.I.getOrCreateStoryViewer().H(b82Var.getContext(), j, new rd1(this, (byte) 21));
                break;
            case 1:
                ((e39) view).b(j);
                break;
            default:
                vac vacVar = (vac) view;
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().H(vacVar.getContext(), j, l6b.a((d79) vacVar.getParent()));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a82(e39 e39Var, vnb vnbVar) {
        super(vnbVar, false);
        this.T = e39Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a82(b82 b82Var) {
        super(null, true);
        this.T = b82Var;
    }
}

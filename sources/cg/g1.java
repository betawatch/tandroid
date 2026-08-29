package cg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g1 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ g1(p1 p1Var, int i10) {
        this.a = i10;
        this.b = p1Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                p1 p1Var = this.b;
                viewGroup = ((f3) p1Var).containerView;
                viewGroup.invalidate();
                p1Var.y();
                break;
            default:
                p1 p1Var2 = this.b;
                viewGroup2 = ((f3) p1Var2).containerView;
                viewGroup2.invalidate();
                p1Var2.y();
                break;
        }
    }
}

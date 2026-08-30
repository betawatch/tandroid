package eg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.g3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f1 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ f1(o1 o1Var, int i10) {
        this.a = i10;
        this.b = o1Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                o1 o1Var = this.b;
                viewGroup = ((g3) o1Var).containerView;
                viewGroup.invalidate();
                o1Var.y();
                break;
            default:
                o1 o1Var2 = this.b;
                viewGroup2 = ((g3) o1Var2).containerView;
                viewGroup2.invalidate();
                o1Var2.y();
                break;
        }
    }
}

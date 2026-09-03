package fg;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.h3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e1 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ e1(n1 n1Var, int i10) {
        this.a = i10;
        this.b = n1Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                n1 n1Var = this.b;
                viewGroup = ((h3) n1Var).containerView;
                viewGroup.invalidate();
                n1Var.y();
                break;
            default:
                n1 n1Var2 = this.b;
                viewGroup2 = ((h3) n1Var2).containerView;
                viewGroup2.invalidate();
                n1Var2.y();
                break;
        }
    }
}

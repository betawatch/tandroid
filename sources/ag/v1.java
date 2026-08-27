package ag;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v1 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ v1(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                g2 g2Var = this.b;
                viewGroup = ((org.telegram.ui.ActionBar.e3) g2Var).containerView;
                viewGroup.invalidate();
                g2Var.z();
                break;
            default:
                g2 g2Var2 = this.b;
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) g2Var2).containerView;
                viewGroup2.invalidate();
                g2Var2.z();
                break;
        }
    }
}

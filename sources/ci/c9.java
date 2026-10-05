package ci;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class c9 extends s4.s0 {
    public final /* synthetic */ e9 a;

    public c9(e9 e9Var) {
        this.a = e9Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.a).containerView;
        viewGroup.invalidate();
    }
}

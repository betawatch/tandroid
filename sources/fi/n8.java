package fi;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class n8 extends s4.u0 {
    public final /* synthetic */ p8 a;

    public n8(p8 p8Var) {
        this.a = p8Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.a).containerView;
        viewGroup.invalidate();
    }
}

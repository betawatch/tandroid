package ei;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class e8 extends s4.k {
    public final /* synthetic */ j8 F;

    public e8(j8 j8Var) {
        this.F = j8Var;
    }

    @Override // s4.k
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}

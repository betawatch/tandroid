package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class o extends FrameLayout implements k.b {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // k.b
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // k.b
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}

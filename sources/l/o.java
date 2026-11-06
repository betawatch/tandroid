package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

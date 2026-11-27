// default package

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l27 extends FrameLayout implements ml2 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public l27(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // ml2
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // ml2
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}

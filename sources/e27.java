// default package

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e27 extends FrameLayout implements em2 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public e27(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // em2
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // em2
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}

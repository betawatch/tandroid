// default package

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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

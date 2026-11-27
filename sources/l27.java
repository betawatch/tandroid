// default package

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

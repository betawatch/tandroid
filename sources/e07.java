// default package

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class e07 extends FrameLayout implements sk2 {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public e07(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // sk2
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // sk2
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}

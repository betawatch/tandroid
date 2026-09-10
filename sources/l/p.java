package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p extends FrameLayout implements k.b {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
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

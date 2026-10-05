package l;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class t implements PopupWindow.OnDismissListener {
    public final /* synthetic */ v a;

    public t(v vVar) {
        this.a = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}

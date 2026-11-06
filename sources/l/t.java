package l;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

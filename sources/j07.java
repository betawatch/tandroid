// default package

import android.widget.PopupWindow;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class j07 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ l07 a;

    public j07(l07 l07Var) {
        this.a = l07Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}

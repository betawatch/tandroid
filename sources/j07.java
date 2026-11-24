// default package

import android.widget.PopupWindow;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

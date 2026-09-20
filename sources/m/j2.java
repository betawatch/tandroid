package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class j2 extends d2 implements e2 {
    public static final Method T;
    public l.d S;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.d2
    public final r1 o(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }

    @Override // m.e2
    public final void p(l.l lVar, MenuItem menuItem) {
        l.d dVar = this.S;
        if (dVar != null) {
            dVar.p(lVar, menuItem);
        }
    }

    @Override // m.e2
    public final void u(l.l lVar, l.n nVar) {
        l.d dVar = this.S;
        if (dVar != null) {
            dVar.u(lVar, nVar);
        }
    }
}

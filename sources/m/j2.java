package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class j2 extends d2 implements e2 {
    public static final Method U;
    public hi.u0 T;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                U = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.e2
    public final void Z(l.k kVar, l.m mVar) {
        hi.u0 u0Var = this.T;
        if (u0Var != null) {
            u0Var.Z(kVar, mVar);
        }
    }

    @Override // m.e2
    public final void j(l.k kVar, MenuItem menuItem) {
        hi.u0 u0Var = this.T;
        if (u0Var != null) {
            u0Var.j(kVar, menuItem);
        }
    }

    @Override // m.d2
    public final r1 p(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }
}

package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import gi.v5;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j2 extends d2 implements e2 {
    public static final Method U;
    public v5 T;

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
    public final void S(l.k kVar, l.m mVar) {
        v5 v5Var = this.T;
        if (v5Var != null) {
            v5Var.S(kVar, mVar);
        }
    }

    @Override // m.e2
    public final void d(l.k kVar, MenuItem menuItem) {
        v5 v5Var = this.T;
        if (v5Var != null) {
            v5Var.d(kVar, menuItem);
        }
    }

    @Override // m.d2
    public final r1 p(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }
}

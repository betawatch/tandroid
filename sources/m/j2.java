package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j2 extends d2 implements e2 {
    public static final Method T;
    public a4.l S;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.e2
    public final void d(l.l lVar, MenuItem menuItem) {
        a4.l lVar2 = this.S;
        if (lVar2 != null) {
            lVar2.d(lVar, menuItem);
        }
    }

    @Override // m.d2
    public final r1 p(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }

    @Override // m.e2
    public final void t(l.l lVar, l.n nVar) {
        a4.l lVar2 = this.S;
        if (lVar2 != null) {
            lVar2.t(lVar, nVar);
        }
    }
}

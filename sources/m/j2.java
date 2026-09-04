package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

    @Override // m.e2
    public final void d(l.l lVar, MenuItem menuItem) {
        l.d dVar = this.S;
        if (dVar != null) {
            dVar.d(lVar, menuItem);
        }
    }

    @Override // m.e2
    public final void o(l.l lVar, l.n nVar) {
        l.d dVar = this.S;
        if (dVar != null) {
            dVar.o(lVar, nVar);
        }
    }

    @Override // m.d2
    public final r1 q(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }
}

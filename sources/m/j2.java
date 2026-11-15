package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class j2 extends d2 implements e2 {
    public static final Method U;
    public ia.d T;

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
    public final void j(l.k kVar, MenuItem menuItem) {
        ia.d dVar = this.T;
        if (dVar != null) {
            dVar.j(kVar, menuItem);
        }
    }

    @Override // m.d2
    public final r1 p(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }

    @Override // m.e2
    public final void q(l.k kVar, l.m mVar) {
        ia.d dVar = this.T;
        if (dVar != null) {
            dVar.q(kVar, mVar);
        }
    }
}

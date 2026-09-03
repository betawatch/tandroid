package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j2 extends d2 implements e2 {
    public static final Method Q;
    public androidx.biometric.f0 P;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Q = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.e2
    public final void D(l.l lVar, l.n nVar) {
        androidx.biometric.f0 f0Var = this.P;
        if (f0Var != null) {
            f0Var.D(lVar, nVar);
        }
    }

    @Override // m.e2
    public final void h(l.l lVar, MenuItem menuItem) {
        androidx.biometric.f0 f0Var = this.P;
        if (f0Var != null) {
            f0Var.h(lVar, menuItem);
        }
    }

    @Override // m.d2
    public final r1 p(Context context, boolean z4) {
        i2 i2Var = new i2(context, z4);
        i2Var.setHoverListener(this);
        return i2Var;
    }
}

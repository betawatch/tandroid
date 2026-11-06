package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class k2 extends e2 implements f2 {
    public static final Method T;
    public h9.f1 S;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.f2
    public final void c0(l.k kVar, MenuItem menuItem) {
        h9.f1 f1Var = this.S;
        if (f1Var != null) {
            f1Var.c0(kVar, menuItem);
        }
    }

    @Override // m.f2
    public final void h1(l.k kVar, l.m mVar) {
        h9.f1 f1Var = this.S;
        if (f1Var != null) {
            f1Var.h1(kVar, mVar);
        }
    }

    @Override // m.e2
    public final s1 o(Context context, boolean z9) {
        j2 j2Var = new j2(context, z9);
        j2Var.setHoverListener(this);
        return j2Var;
    }
}

package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k2 extends e2 implements f2 {
    public static final Method P;
    public k5.i O;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                P = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.f2
    public final void k(l.k kVar, MenuItem menuItem) {
        k5.i iVar = this.O;
        if (iVar != null) {
            iVar.k(kVar, menuItem);
        }
    }

    @Override // m.e2
    public final s1 p(Context context, boolean z10) {
        j2 j2Var = new j2(context, z10);
        j2Var.setHoverListener(this);
        return j2Var;
    }

    @Override // m.f2
    public final void y(l.k kVar, l.m mVar) {
        k5.i iVar = this.O;
        if (iVar != null) {
            iVar.y(kVar, mVar);
        }
    }
}

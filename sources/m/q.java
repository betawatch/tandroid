package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class q {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static q c;
    public n2 a;

    public static synchronized q a() {
        q qVar;
        synchronized (q.class) {
            try {
                if (c == null) {
                    c();
                }
                qVar = c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public static synchronized void c() {
        synchronized (q.class) {
            if (c == null) {
                q qVar = new q();
                c = qVar;
                qVar.a = n2.d();
                c.a.l(new a9.a(8));
            }
        }
    }

    public static void d(Drawable drawable, f3 f3Var, int[] iArr) {
        PorterDuff.Mode mode = n2.h;
        int[] state = drawable.getState();
        int[] iArr2 = m1.a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = f3Var.b;
        if (z4 || f3Var.a) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z4 ? (ColorStateList) f3Var.c : null;
            PorterDuff.Mode mode2 = f3Var.a ? (PorterDuff.Mode) f3Var.d : n2.h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = n2.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.a.g(context, i10);
    }
}

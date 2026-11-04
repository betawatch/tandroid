package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static q c;
    public m2 a;

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
                qVar.a = m2.d();
                c.a.l(new l2.e(1));
            }
        }
    }

    public static void d(Drawable drawable, b3 b3Var, int[] iArr) {
        PorterDuff.Mode mode = m2.h;
        int[] state = drawable.getState();
        int[] iArr2 = l1.a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = b3Var.b;
        if (z10 || b3Var.a) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z10 ? (ColorStateList) b3Var.c : null;
            PorterDuff.Mode mode2 = b3Var.a ? (PorterDuff.Mode) b3Var.d : m2.h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = m2.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i3) {
        return this.a.g(context, i3);
    }
}

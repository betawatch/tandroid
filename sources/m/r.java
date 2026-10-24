package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class r {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static r c;
    public n2 a;

    public static synchronized r a() {
        r rVar;
        synchronized (r.class) {
            try {
                if (c == null) {
                    c();
                }
                rVar = c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public static synchronized void c() {
        synchronized (r.class) {
            if (c == null) {
                r rVar = new r();
                c = rVar;
                rVar.a = n2.d();
                c.a.l(new com.google.firebase.messaging.l(3));
            }
        }
    }

    public static void d(Drawable drawable, e3 e3Var, int[] iArr) {
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
        boolean z10 = e3Var.b;
        if (z10 || e3Var.a) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z10 ? (ColorStateList) e3Var.c : null;
            PorterDuff.Mode mode2 = e3Var.a ? (PorterDuff.Mode) e3Var.d : n2.h;
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

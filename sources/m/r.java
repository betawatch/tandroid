package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            } catch (Throwable th) {
                throw th;
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
                c.a.l(new com.google.firebase.messaging.m(6));
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
        boolean z10 = f3Var.b;
        if (z10 || f3Var.a) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z10 ? (ColorStateList) f3Var.c : null;
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

    public final synchronized Drawable b(Context context, int i9) {
        return this.a.g(context, i9);
    }
}

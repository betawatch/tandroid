package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class s {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static s c;
    public o2 a;

    public static synchronized s a() {
        s sVar;
        synchronized (s.class) {
            try {
                if (c == null) {
                    c();
                }
                sVar = c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public static synchronized void c() {
        synchronized (s.class) {
            if (c == null) {
                s sVar = new s();
                c = sVar;
                sVar.a = o2.d();
                c.a.l(new com.google.firebase.messaging.m(3));
            }
        }
    }

    public static void d(Drawable drawable, f3 f3Var, int[] iArr) {
        PorterDuff.Mode mode = o2.h;
        int[] state = drawable.getState();
        int[] iArr2 = n1.a;
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
            PorterDuff.Mode mode2 = f3Var.a ? (PorterDuff.Mode) f3Var.d : o2.h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = o2.h(colorStateList.getColorForState(iArr, 0), mode2);
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

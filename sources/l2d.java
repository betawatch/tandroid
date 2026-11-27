// default package

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l2d {
    public static final l2d b;
    public final i2d a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = h2d.s;
        } else if (i >= 30) {
            b = g2d.r;
        } else {
            b = i2d.b;
        }
    }

    public l2d(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new h2d(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new g2d(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new f2d(this, windowInsets);
        } else if (i >= 28) {
            this.a = new e2d(this, windowInsets);
        } else {
            this.a = new d2d(this, windowInsets);
        }
    }

    public static mq5 e(mq5 mq5Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, mq5Var.a - i);
        int max2 = Math.max(0, mq5Var.b - i2);
        int max3 = Math.max(0, mq5Var.c - i3);
        int max4 = Math.max(0, mq5Var.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? mq5Var : mq5.b(max, max2, max3, max4);
    }

    public static l2d h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        l2d l2dVar = new l2d(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = ihc.a;
            l2d a = bhc.a(view);
            i2d i2dVar = l2dVar.a;
            i2dVar.r(a);
            i2dVar.d(view.getRootView());
            i2dVar.t(view.getWindowSystemUiVisibility());
        }
        return l2dVar;
    }

    public final int a() {
        return this.a.k().d;
    }

    public final int b() {
        return this.a.k().a;
    }

    public final int c() {
        return this.a.k().c;
    }

    public final int d() {
        return this.a.k().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l2d) {
            return Objects.equals(this.a, ((l2d) obj).a);
        }
        return false;
    }

    public final l2d f(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        b2d a2dVar = i5 >= 34 ? new a2d(this) : i5 >= 30 ? new z1d(this) : i5 >= 29 ? new y1d(this) : new x1d(this);
        a2dVar.g(mq5.b(i, i2, i3, i4));
        return a2dVar.b();
    }

    public final WindowInsets g() {
        i2d i2dVar = this.a;
        if (i2dVar instanceof c2d) {
            return ((c2d) i2dVar).c;
        }
        return null;
    }

    public final int hashCode() {
        i2d i2dVar = this.a;
        if (i2dVar == null) {
            return 0;
        }
        return i2dVar.hashCode();
    }

    public l2d() {
        this.a = new i2d(this);
    }
}

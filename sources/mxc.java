// default package

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class mxc extends sxc {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public io5[] d;
    public io5 e;
    public vxc f;
    public io5 g;
    public int h;

    public mxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean B(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private io5 u(int i2, boolean z) {
        io5 io5Var = io5.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                io5Var = io5.a(io5Var, v(i3, z));
            }
        }
        return io5Var;
    }

    private io5 w() {
        vxc vxcVar = this.f;
        return vxcVar != null ? vxcVar.a.i() : io5.e;
    }

    private io5 x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            fyb.i("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!i) {
            z();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(invoke));
                if (rect != null) {
                    return io5.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void z() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public void A(io5 io5Var) {
        this.g = io5Var;
    }

    @Override // sxc
    public void d(View view) {
        io5 x = x(view);
        if (x == null) {
            x = io5.e;
        }
        A(x);
    }

    @Override // sxc
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        mxc mxcVar = (mxc) obj;
        return Objects.equals(this.g, mxcVar.g) && B(this.h, mxcVar.h);
    }

    @Override // sxc
    public io5 f(int i2) {
        return u(i2, false);
    }

    @Override // sxc
    public io5 g(int i2) {
        return u(i2, true);
    }

    @Override // sxc
    public final io5 k() {
        io5 io5Var = this.e;
        if (io5Var != null) {
            return io5Var;
        }
        WindowInsets windowInsets = this.c;
        io5 b = io5.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = b;
        return b;
    }

    @Override // sxc
    public vxc m(int i2, int i3, int i4, int i5) {
        vxc h = vxc.h(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        lxc kxcVar = i6 >= 34 ? new kxc(h) : i6 >= 30 ? new jxc(h) : i6 >= 29 ? new ixc(h) : new hxc(h);
        kxcVar.g(vxc.e(k(), i2, i3, i4, i5));
        kxcVar.e(vxc.e(i(), i2, i3, i4, i5));
        return kxcVar.b();
    }

    @Override // sxc
    public boolean o() {
        return this.c.isRound();
    }

    @Override // sxc
    public boolean p(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !y(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // sxc
    public void q(io5[] io5VarArr) {
        this.d = io5VarArr;
    }

    @Override // sxc
    public void r(vxc vxcVar) {
        this.f = vxcVar;
    }

    @Override // sxc
    public void t(int i2) {
        this.h = i2;
    }

    public io5 v(int i2, boolean z) {
        io5 i3;
        int i4;
        int i5;
        int i6;
        int i7;
        io5 io5Var = io5.e;
        int i8 = 0;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    io5[] io5VarArr = this.d;
                    i3 = io5VarArr != null ? io5VarArr[hye.a(8)] : null;
                    if (i3 != null) {
                        return i3;
                    }
                    io5 k2 = k();
                    io5 w = w();
                    int i9 = k2.d;
                    if (i9 > w.d) {
                        return io5.b(0, 0, 0, i9);
                    }
                    io5 io5Var2 = this.g;
                    if (io5Var2 != null && !io5Var2.equals(io5Var) && (i4 = this.g.d) > w.d) {
                        return io5.b(0, 0, 0, i4);
                    }
                } else {
                    if (i2 == 16) {
                        return j();
                    }
                    if (i2 == 32) {
                        return h();
                    }
                    if (i2 == 64) {
                        return l();
                    }
                    if (i2 == 128) {
                        vxc vxcVar = this.f;
                        lo3 e = vxcVar != null ? vxcVar.a.e() : e();
                        if (e != null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                int n = fo.n(e.a);
                                i6 = fo.p(e.a);
                                i7 = fo.o(e.a);
                                i8 = fo.m(e.a);
                                i5 = n;
                            } else {
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                            }
                            return io5.b(i5, i6, i7, i8);
                        }
                    }
                }
            } else {
                if (z) {
                    io5 w2 = w();
                    io5 i10 = i();
                    return io5.b(Math.max(w2.a, i10.a), 0, Math.max(w2.c, i10.c), Math.max(w2.d, i10.d));
                }
                if ((this.h & 2) == 0) {
                    io5 k3 = k();
                    vxc vxcVar2 = this.f;
                    i3 = vxcVar2 != null ? vxcVar2.a.i() : null;
                    int i11 = k3.d;
                    if (i3 != null) {
                        i11 = Math.min(i11, i3.d);
                    }
                    return io5.b(k3.a, 0, k3.c, i11);
                }
            }
        } else {
            if (z) {
                return io5.b(0, Math.max(w().b, k().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return io5.b(0, k().b, 0, 0);
            }
        }
        return io5Var;
    }

    public boolean y(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !v(i2, false).equals(io5.e);
    }
}

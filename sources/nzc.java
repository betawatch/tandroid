// default package

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class nzc extends tzc {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public iq5[] d;
    public iq5 e;
    public wzc f;
    public iq5 g;
    public int h;

    public nzc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean B(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private iq5 u(int i2, boolean z) {
        iq5 iq5Var = iq5.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                iq5Var = iq5.a(iq5Var, v(i3, z));
            }
        }
        return iq5Var;
    }

    private iq5 w() {
        wzc wzcVar = this.f;
        return wzcVar != null ? wzcVar.a.i() : iq5.e;
    }

    private iq5 x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            rjb.j("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
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
                    return iq5.b(rect.left, rect.top, rect.right, rect.bottom);
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

    public void A(iq5 iq5Var) {
        this.g = iq5Var;
    }

    @Override // tzc
    public void d(View view) {
        iq5 x = x(view);
        if (x == null) {
            x = iq5.e;
        }
        A(x);
    }

    @Override // tzc
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        nzc nzcVar = (nzc) obj;
        return Objects.equals(this.g, nzcVar.g) && B(this.h, nzcVar.h);
    }

    @Override // tzc
    public iq5 f(int i2) {
        return u(i2, false);
    }

    @Override // tzc
    public iq5 g(int i2) {
        return u(i2, true);
    }

    @Override // tzc
    public final iq5 k() {
        iq5 iq5Var = this.e;
        if (iq5Var != null) {
            return iq5Var;
        }
        WindowInsets windowInsets = this.c;
        iq5 b = iq5.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = b;
        return b;
    }

    @Override // tzc
    public wzc m(int i2, int i3, int i4, int i5) {
        wzc h = wzc.h(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        mzc lzcVar = i6 >= 34 ? new lzc(h) : i6 >= 30 ? new kzc(h) : i6 >= 29 ? new jzc(h) : new izc(h);
        lzcVar.g(wzc.e(k(), i2, i3, i4, i5));
        lzcVar.e(wzc.e(i(), i2, i3, i4, i5));
        return lzcVar.b();
    }

    @Override // tzc
    public boolean o() {
        return this.c.isRound();
    }

    @Override // tzc
    public boolean p(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !y(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // tzc
    public void q(iq5[] iq5VarArr) {
        this.d = iq5VarArr;
    }

    @Override // tzc
    public void r(wzc wzcVar) {
        this.f = wzcVar;
    }

    @Override // tzc
    public void t(int i2) {
        this.h = i2;
    }

    public iq5 v(int i2, boolean z) {
        iq5 i3;
        int i4;
        int i5;
        int i6;
        int i7;
        iq5 iq5Var = iq5.e;
        int i8 = 0;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    iq5[] iq5VarArr = this.d;
                    i3 = iq5VarArr != null ? iq5VarArr[j0f.a(8)] : null;
                    if (i3 != null) {
                        return i3;
                    }
                    iq5 k2 = k();
                    iq5 w = w();
                    int i9 = k2.d;
                    if (i9 > w.d) {
                        return iq5.b(0, 0, 0, i9);
                    }
                    iq5 iq5Var2 = this.g;
                    if (iq5Var2 != null && !iq5Var2.equals(iq5Var) && (i4 = this.g.d) > w.d) {
                        return iq5.b(0, 0, 0, i4);
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
                        wzc wzcVar = this.f;
                        vp3 e = wzcVar != null ? wzcVar.a.e() : e();
                        if (e != null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                int n = fp.n(e.a);
                                i6 = fp.p(e.a);
                                i7 = fp.o(e.a);
                                i8 = fp.m(e.a);
                                i5 = n;
                            } else {
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                            }
                            return iq5.b(i5, i6, i7, i8);
                        }
                    }
                }
            } else {
                if (z) {
                    iq5 w2 = w();
                    iq5 i10 = i();
                    return iq5.b(Math.max(w2.a, i10.a), 0, Math.max(w2.c, i10.c), Math.max(w2.d, i10.d));
                }
                if ((this.h & 2) == 0) {
                    iq5 k3 = k();
                    wzc wzcVar2 = this.f;
                    i3 = wzcVar2 != null ? wzcVar2.a.i() : null;
                    int i11 = k3.d;
                    if (i3 != null) {
                        i11 = Math.min(i11, i3.d);
                    }
                    return iq5.b(k3.a, 0, k3.c, i11);
                }
            }
        } else {
            if (z) {
                return iq5.b(0, Math.max(w().b, k().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return iq5.b(0, k().b, 0, 0);
            }
        }
        return iq5Var;
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
        return !v(i2, false).equals(iq5.e);
    }
}

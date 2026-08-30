package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class m {
    public final View a;
    public f3 d;
    public f3 e;
    public f3 f;
    public int c = -1;
    public final q b = q.a();

    public m(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 ? i10 == 21 : this.d != null) {
                if (this.f == null) {
                    this.f = new f3();
                }
                f3 f3Var = this.f;
                f3Var.c = null;
                f3Var.b = false;
                f3Var.d = null;
                f3Var.a = false;
                WeakHashMap weakHashMap = r0.j0.a;
                ColorStateList c3 = r0.b0.c(view);
                if (c3 != null) {
                    f3Var.b = true;
                    f3Var.c = c3;
                }
                PorterDuff.Mode d = r0.b0.d(view);
                if (d != null) {
                    f3Var.a = true;
                    f3Var.d = d;
                }
                if (f3Var.b || f3Var.a) {
                    q.d(background, f3Var, view.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = this.e;
            if (f3Var2 != null) {
                q.d(background, f3Var2, view.getDrawableState());
                return;
            }
            f3 f3Var3 = this.d;
            if (f3Var3 != null) {
                q.d(background, f3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        f3 f3Var = this.e;
        if (f3Var != null) {
            return (ColorStateList) f3Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        f3 f3Var = this.e;
        if (f3Var != null) {
            return (PorterDuff.Mode) f3Var.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0022, B:5:0x0029, B:6:0x0037, B:9:0x003e, B:11:0x0041, B:16:0x004c, B:18:0x004d, B:20:0x0056, B:22:0x0061, B:24:0x006b, B:30:0x0079, B:32:0x007f, B:33:0x0086, B:35:0x0089, B:37:0x0090, B:39:0x00a0, B:41:0x00aa, B:45:0x00b5, B:47:0x00bb, B:48:0x00c2, B:8:0x0038), top: B:2:0x0022, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i10) {
        boolean z4;
        ColorStateList i11;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = f.a.z;
        l7.w0 y10 = l7.w0.y(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) y10.c;
        View view2 = this.a;
        r0.j0.j(view2, view2.getContext(), iArr, attributeSet, (TypedArray) y10.c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                q qVar = this.b;
                Context context2 = view.getContext();
                int i12 = this.c;
                synchronized (qVar) {
                    i11 = qVar.a.i(context2, i12);
                }
                if (i11 != null) {
                    g(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList r10 = y10.r(1);
                int i13 = Build.VERSION.SDK_INT;
                r0.b0.g(view, r10);
                if (i13 == 21) {
                    Drawable background = view.getBackground();
                    if (r0.b0.c(view) == null && r0.b0.d(view) == null) {
                        z4 = false;
                        if (background != null && z4) {
                            if (background.isStateful()) {
                                background.setState(view.getDrawableState());
                            }
                            view.setBackground(background);
                        }
                    }
                    z4 = true;
                    if (background != null) {
                        if (background.isStateful()) {
                        }
                        view.setBackground(background);
                    }
                }
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode b10 = m1.b(typedArray.getInt(2, -1), null);
                int i14 = Build.VERSION.SDK_INT;
                r0.b0.h(view, b10);
                if (i14 == 21) {
                    Drawable background2 = view.getBackground();
                    boolean z10 = (r0.b0.c(view) == null && r0.b0.d(view) == null) ? false : true;
                    if (background2 != null && z10) {
                        if (background2.isStateful()) {
                            background2.setState(view.getDrawableState());
                        }
                        view.setBackground(background2);
                    }
                }
            }
            y10.A();
        } catch (Throwable th2) {
            y10.A();
            throw th2;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.c = i10;
        q qVar = this.b;
        if (qVar != null) {
            Context context = this.a.getContext();
            synchronized (qVar) {
                colorStateList = qVar.a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new f3();
            }
            f3 f3Var = this.d;
            f3Var.c = colorStateList;
            f3Var.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new f3();
        }
        f3 f3Var = this.e;
        f3Var.c = colorStateList;
        f3Var.b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new f3();
        }
        f3 f3Var = this.e;
        f3Var.d = mode;
        f3Var.a = true;
        a();
    }
}

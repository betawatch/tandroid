package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.d30;
import org.telegram.ui.n30;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class t6 {
    public static final s6 a = new s6();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        l(editTextBoldCursor, 34, i7, h6Var);
    }

    public static void B(View view, Drawable drawable, p6 p6Var, h6 h6Var) {
        view.setBackground(drawable);
        j(view, drawable, p6Var, null, h6Var);
    }

    public static void C(TextView textView, int i7, h6 h6Var) {
        n(textView, 3, i7, -1, 0, 0.0f, h6Var);
    }

    public static void D(TextView textView, int i7, h6 h6Var) {
        n(textView, 1, i7, -1, 0, 0.0f, h6Var);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i7) {
        D(editTextBoldCursor, i7, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i7, int i10, int i11, h6 h6Var) {
        editTextBoldCursor.u(m6.w0(i7, h6Var), m6.w0(i10, h6Var), m6.w0(i11, h6Var));
        T(editTextBoldCursor, 31, i7, h6Var).g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i10, h6Var).g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i11, h6Var).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i7, h6 h6Var) {
        n(textView, 2, i7, -1, 0, 0.0f, h6Var);
    }

    public static void H(RecyclerView recyclerView, int i7, h6 h6Var) {
        l(recyclerView, 21, i7, h6Var);
    }

    public static void I(int i7, n30 n30Var) {
        l(n30Var, 20, i7, null);
    }

    public static void J(ek0 ek0Var, int i7, h6 h6Var) {
        l(ek0Var, 20, i7, h6Var);
    }

    public static p6 K(float f10, int i7) {
        return new p6(i7, -1, f10, 2);
    }

    public static s6 L(boolean z10, int i7, HashSet hashSet) {
        s6 s6Var = a;
        if (s6Var.e) {
            s6Var = new s6();
        }
        s6Var.e = true;
        s6Var.b = z10;
        s6Var.c = i7;
        s6Var.d = hashSet;
        s6Var.a.clear();
        return s6Var;
    }

    public static p6 M(int i7) {
        return new p6(i7, -1, 0.0f, 0);
    }

    public static n6 N(View view, int i7, int i10, int i11, int i12, float f10, h6 h6Var, int i13, PorterDuffColorFilter porterDuffColorFilter) {
        n6[] n6VarArr = o(view, true).a;
        n6 n6Var = n6VarArr[i7];
        if (n6Var == null) {
            n6Var = new n6();
            n6VarArr[i7] = n6Var;
        }
        n6 n6Var2 = n6Var;
        n6Var2.c(i10, i11, i12, f10, h6Var);
        n6Var2.g = i13;
        n6Var2.i = porterDuffColorFilter;
        return n6Var2;
    }

    public static void O(RadioButton radioButton, int i7, int i10, h6 h6Var) {
        radioButton.b(m6.w0(i7, h6Var), m6.w0(i10, h6Var));
        l(radioButton, 23, i7, h6Var);
        l(radioButton, 24, i10, h6Var);
    }

    public static int P(int i7, int i10, int i11, float f10, h6 h6Var) {
        int w02 = m6.w0(i7, h6Var);
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? w02 : a6.b(w02) : m6.w(w02, m6.w0(i10, h6Var)) : i0.a.f(f10, w02, m6.w0(i10, h6Var)) : m6.r1(f10, w02) : i0.a.o(w02, (int) f10);
    }

    public static void Q(View view, Drawable drawable, p6 p6Var, p6 p6Var2, h6 h6Var) {
        view.setBackground(drawable);
        j(view, drawable, p6Var, p6Var2, h6Var);
    }

    public static void R(View view, org.telegram.ui.Cells.y yVar, p6 p6Var, p6 p6Var2) {
        Q(view, yVar, p6Var, p6Var2, null);
    }

    public static void S(View view, n6 n6Var, int i7) {
        int i10 = n6Var.l;
        switch (i10) {
            case 1:
            case 2:
                if (view instanceof k) {
                    ((k) view).G(i7, i10 == 2);
                    break;
                }
                break;
            case 3:
            case 4:
                if (view instanceof k) {
                    ((k) view).F(i7, i10 == 4);
                    break;
                }
                break;
            case 5:
                if (view instanceof k) {
                    ((k) view).setTitleColor(i7);
                    break;
                }
                break;
            case 6:
                if (view instanceof k) {
                    ((k) view).setSubtitleColor(i7);
                    break;
                }
                break;
            default:
                switch (i10) {
                    case 20:
                        if (view instanceof ek0) {
                            ((ek0) view).setSelectorDrawableColor(i7);
                            break;
                        }
                        break;
                    case 21:
                        if (view instanceof RecyclerView) {
                            ((RecyclerView) view).setGlowColor(i7);
                            break;
                        }
                        break;
                    case 22:
                        WeakReference weakReference = n6Var.j;
                        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
                        if (drawable != null && i7 != n6Var.g) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                            view.invalidate();
                            break;
                        }
                        break;
                    case 23:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setBackgroundColor(i7);
                            break;
                        }
                        break;
                    case 24:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setCheckedColor(i7);
                            break;
                        }
                        break;
                    default:
                        if (view instanceof EditTextBoldCursor) {
                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                            switch (i10) {
                                case ks.T /* 30 */:
                                    editTextBoldCursor.setCursorColor(i7);
                                    break;
                                case ks.U /* 31 */:
                                    editTextBoldCursor.setLineColor(i7);
                                    break;
                                case 32:
                                    editTextBoldCursor.setActiveLineColor(i7);
                                    break;
                                case 33:
                                    editTextBoldCursor.setErrorLineColor(i7);
                                    break;
                                case 34:
                                    editTextBoldCursor.setHintColor(i7);
                                    break;
                                case 35:
                                    editTextBoldCursor.setHeaderHintColor(i7);
                                    break;
                                case 36:
                                    editTextBoldCursor.setHandlesColor(i7);
                                    break;
                            }
                        }
                        break;
                }
        }
    }

    public static n6 T(View view, int i7, int i10, h6 h6Var) {
        n6 w10 = w(i7, view);
        w10.c(i10, -1, 0, 0.0f, h6Var);
        w10.n = null;
        w10.o = null;
        w10.m = true;
        return w10;
    }

    public static void U(TextView textView, int i7, h6 h6Var) {
        m(textView, i7, -1, 0, 0.0f, h6Var);
    }

    public static void V(TextView textView, p6 p6Var, h6 h6Var) {
        m(textView, p6Var.a, p6Var.b, p6Var.c, p6Var.d, h6Var);
    }

    public static void W(m5 m5Var, int i7) {
        X(m5Var, i7, null);
    }

    public static void X(m5 m5Var, int i7, h6 h6Var) {
        m(m5Var, i7, -1, 0, 0.0f, h6Var);
    }

    public static void Y(org.telegram.ui.Components.o6 o6Var, int i7, h6 h6Var) {
        m(o6Var, i7, -1, 0, 0.0f, h6Var);
    }

    public static void Z(View view, Context context, int i7, int i10) {
        Drawable X0 = m6.X0(context, i7, m6.w0(i10, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        n6 T = T(view, 22, i10, null);
        T.j = new WeakReference(X0);
        T.g = m6.v0(i10);
    }

    public static void a(k kVar, int i7, h6 h6Var, boolean z10) {
        l(kVar, z10 ? 4 : 3, i7, h6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(View view) {
        int i7;
        int f10;
        int b10;
        boolean z10;
        int b11;
        int currentTextColor;
        int currentHintTextColor;
        int defaultColor;
        int color;
        k kVar;
        d dVar;
        o6 o4 = o(view, false);
        if (o4 == null) {
            return;
        }
        for (int i10 = 0; i10 < 6; i10++) {
            n6 n6Var = o4.a[i10];
            if (n6Var != null && !n6Var.a()) {
                int b12 = n6Var.b();
                if (i10 != 0) {
                    if (i10 == 1) {
                        TextView textView = (TextView) view;
                        if (textView.getHintTextColors() != null && !textView.getHintTextColors().isStateful() && ((currentHintTextColor = textView.getCurrentHintTextColor()) == n6Var.g || currentHintTextColor == b12)) {
                            if (currentHintTextColor != b12) {
                                textView.setHintTextColor(b12);
                            }
                            n6Var.g = b12;
                        }
                    } else if (i10 == 2) {
                        TextView textView2 = (TextView) view;
                        if (textView2.getLinkTextColors() != null && !textView2.getLinkTextColors().isStateful() && ((defaultColor = textView2.getLinkTextColors().getDefaultColor()) == n6Var.g || defaultColor == b12)) {
                            if (defaultColor != b12) {
                                textView2.setLinkTextColor(b12);
                            }
                            n6Var.g = b12;
                        }
                    } else if (i10 == 3) {
                        TextView textView3 = (TextView) view;
                        int highlightColor = textView3.getHighlightColor();
                        if (highlightColor == n6Var.g || highlightColor == b12) {
                            if (highlightColor != b12) {
                                textView3.setHighlightColor(b12);
                            }
                            n6Var.g = b12;
                        }
                    } else if (i10 != 4) {
                        if (i10 == 5) {
                            ImageView imageView = (ImageView) view;
                            if (imageView.getColorFilter() == n6Var.i) {
                                if (b12 != n6Var.g) {
                                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b12, n6Var.h);
                                    imageView.setColorFilter(porterDuffColorFilter);
                                    n6Var.i = porterDuffColorFilter;
                                }
                            }
                        }
                        n6Var.g = b12;
                    } else {
                        if (view instanceof k) {
                            k kVar2 = (k) view;
                            if (kVar2.M0) {
                                color = kVar2.getBackgroundColor();
                                if (color != n6Var.g || color == b12) {
                                    if (color != b12) {
                                        view.setBackgroundColor(b12);
                                    }
                                    n6Var.g = b12;
                                }
                            }
                        }
                        if ((view instanceof y) && (kVar = ((y) view).b) != null && kVar.M0 && (dVar = kVar.G) != null && dVar == view) {
                            color = dVar == view ? kVar.x : 0;
                        } else {
                            Drawable background = view.getBackground();
                            if (background instanceof ColorDrawable) {
                                color = ((ColorDrawable) background).getColor();
                            }
                        }
                        if (color != n6Var.g) {
                        }
                        if (color != b12) {
                        }
                        n6Var.g = b12;
                    }
                } else if (view instanceof TextView) {
                    TextView textView4 = (TextView) view;
                    if (!textView4.getTextColors().isStateful() && ((currentTextColor = textView4.getCurrentTextColor()) == n6Var.g || currentTextColor == b12)) {
                        if (currentTextColor != b12) {
                            textView4.setTextColor(b12);
                        }
                        n6Var.g = b12;
                    }
                } else {
                    boolean z11 = view instanceof m5;
                    if (z11 || (view instanceof org.telegram.ui.Components.o6)) {
                        int textColor = z11 ? ((m5) view).getTextColor() : ((org.telegram.ui.Components.o6) view).getTextColor();
                        int i11 = textColor & 16777215;
                        if (i11 == (n6Var.g & 16777215) || i11 == (b12 & 16777215)) {
                            if (textColor != b12) {
                                if (z11) {
                                    ((m5) view).setTextColor(b12);
                                } else {
                                    ((org.telegram.ui.Components.o6) view).setTextColor(b12);
                                }
                            }
                            n6Var.g = b12;
                        }
                    }
                }
            }
        }
        if (o4.b != null) {
            boolean z12 = false;
            for (int i12 = 0; i12 < o4.b.size(); i12++) {
                n6 n6Var2 = (n6) o4.b.get(i12);
                Drawable drawable = (Drawable) n6Var2.j.get();
                if (drawable == null || n6Var2.a() || (!(n6Var2.k || drawable.getColorFilter() == n6Var2.i) || (b11 = n6Var2.b()) == n6Var2.g)) {
                    z10 = false;
                } else {
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(b11, n6Var2.h);
                    drawable.setColorFilter(porterDuffColorFilter2);
                    n6Var2.i = porterDuffColorFilter2;
                    n6Var2.g = b11;
                    z10 = true;
                }
                z12 |= z10;
            }
            if (z12) {
                view.invalidate();
            }
        }
        if (o4.d != null && view.getBackground() == o4.d) {
            n6 n6Var3 = o4.e;
            if (n6Var3 != null && !n6Var3.a()) {
                int b13 = n6Var3.b();
                int t6 = t(o4.d);
                if (t6 == n6Var3.g || t6 == b13) {
                    if (t6 != b13) {
                        Drawable drawable2 = o4.d;
                        Drawable drawable3 = drawable2 instanceof InsetDrawable ? ((InsetDrawable) drawable2).getDrawable() : drawable2;
                        if (drawable3 instanceof RippleDrawable) {
                            RippleDrawable rippleDrawable = (RippleDrawable) drawable3;
                            drawable3 = (rippleDrawable.getNumberOfLayers() <= 0 || rippleDrawable.getId(0) == 16908334) ? null : rippleDrawable.getDrawable(0);
                        }
                        if (drawable3 instanceof ShapeDrawable) {
                            ((ShapeDrawable) drawable3).getPaint().setColor(b13);
                            drawable2.invalidateSelf();
                        } else if (drawable3 instanceof ColorDrawable) {
                            ((ColorDrawable) drawable3).setColor(b13);
                        }
                    }
                    n6Var3.g = b13;
                }
            }
            n6 n6Var4 = o4.f;
            if (n6Var4 != null && !n6Var4.a() && (o4.d instanceof RippleDrawable) && (b10 = n6Var4.b()) != n6Var4.g) {
                ((RippleDrawable) o4.d).setColor(ColorStateList.valueOf(b10));
                n6Var4.g = b10;
            }
        }
        if (o4.c != null) {
            for (int i13 = 0; i13 < o4.c.size(); i13++) {
                n6 n6Var5 = (n6) o4.c.get(i13);
                if (!n6Var5.a()) {
                    int b14 = n6Var5.b();
                    if (n6Var5.m) {
                        int i14 = n6Var5.l;
                        switch (i14) {
                            case 1:
                                if (view instanceof k) {
                                    f10 = ((k) view).s0;
                                    break;
                                } else {
                                    i7 = n6Var5.g;
                                    f10 = ~i7;
                                    break;
                                }
                            case 2:
                                if (view instanceof k) {
                                    f10 = ((k) view).t0;
                                    break;
                                } else {
                                    i7 = n6Var5.g;
                                    f10 = ~i7;
                                    break;
                                }
                            case 3:
                                if (view instanceof k) {
                                    f10 = ((k) view).q0;
                                    break;
                                } else {
                                    i7 = n6Var5.g;
                                    f10 = ~i7;
                                    break;
                                }
                            case 4:
                                if (view instanceof k) {
                                    f10 = ((k) view).r0;
                                    break;
                                } else {
                                    i7 = n6Var5.g;
                                    f10 = ~i7;
                                    break;
                                }
                            case 5:
                                if (view instanceof k) {
                                    f10 = ((k) view).getTitleColorToSet();
                                    break;
                                } else {
                                    i7 = n6Var5.g;
                                    f10 = ~i7;
                                    break;
                                }
                            case 6:
                                if (view instanceof k) {
                                    f10 = ((k) view).getSubtitleColorInternal();
                                    break;
                                } else {
                                    i7 = n6Var5.g;
                                    f10 = ~i7;
                                    break;
                                }
                            default:
                                switch (i14) {
                                    case 20:
                                        if (view instanceof ek0) {
                                            f10 = ((ek0) view).getSelectorDrawableColor();
                                            break;
                                        } else {
                                            i7 = n6Var5.g;
                                            f10 = ~i7;
                                            break;
                                        }
                                    case 21:
                                        if (view instanceof RecyclerView) {
                                            f10 = ((RecyclerView) view).getGlowColor();
                                            break;
                                        } else {
                                            i7 = n6Var5.g;
                                            f10 = ~i7;
                                            break;
                                        }
                                    case 22:
                                        WeakReference weakReference = n6Var5.j;
                                        Drawable drawable4 = weakReference != null ? (Drawable) weakReference.get() : null;
                                        if (drawable4 == null || view.getBackground() != drawable4) {
                                            i7 = n6Var5.g;
                                            f10 = ~i7;
                                            break;
                                        } else {
                                            f10 = n6Var5.g;
                                            break;
                                        }
                                        break;
                                    case 23:
                                        if (view instanceof RadioButton) {
                                            f10 = ((RadioButton) view).getColor();
                                            break;
                                        } else {
                                            i7 = n6Var5.g;
                                            f10 = ~i7;
                                            break;
                                        }
                                    case 24:
                                        if (view instanceof RadioButton) {
                                            f10 = ((RadioButton) view).getCheckedColor();
                                            break;
                                        } else {
                                            i7 = n6Var5.g;
                                            f10 = ~i7;
                                            break;
                                        }
                                    default:
                                        if (view instanceof EditTextBoldCursor) {
                                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                                            switch (i14) {
                                                case ks.T /* 30 */:
                                                    f10 = editTextBoldCursor.getCursorColor();
                                                    break;
                                                case ks.U /* 31 */:
                                                    f10 = editTextBoldCursor.getLineColor();
                                                    break;
                                                case 32:
                                                    f10 = editTextBoldCursor.getActiveLineColor();
                                                    break;
                                                case 33:
                                                    f10 = editTextBoldCursor.getErrorLineColor();
                                                    break;
                                                case 34:
                                                    f10 = editTextBoldCursor.getHintColor();
                                                    break;
                                                case 35:
                                                    f10 = editTextBoldCursor.getHeaderHintColor();
                                                    break;
                                                case 36:
                                                    f10 = editTextBoldCursor.getHandlesColor();
                                                    break;
                                            }
                                        }
                                        i7 = n6Var5.g;
                                        f10 = ~i7;
                                        break;
                                }
                        }
                        if (f10 != n6Var5.g || f10 == b14) {
                            if (f10 != b14) {
                                if (n6Var5.m) {
                                    S(view, n6Var5, b14);
                                } else {
                                    r6 r6Var = n6Var5.o;
                                    if (r6Var != null) {
                                        r6Var.d(b14, view);
                                    }
                                }
                            }
                            n6Var5.g = b14;
                        }
                    } else {
                        q6 q6Var = n6Var5.n;
                        if (q6Var != null) {
                            f10 = q6Var.f(view);
                            if (f10 != n6Var5.g) {
                            }
                            if (f10 != b14) {
                            }
                            n6Var5.g = b14;
                        } else {
                            i7 = n6Var5.g;
                            f10 = ~i7;
                            if (f10 != n6Var5.g) {
                            }
                            if (f10 != b14) {
                            }
                            n6Var5.g = b14;
                        }
                    }
                }
            }
        }
    }

    public static void b(k kVar, int i7, h6 h6Var, boolean z10) {
        l(kVar, z10 ? 2 : 1, i7, h6Var);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z10) {
        b++;
        s6 L = L(z10, 0, null);
        try {
            List j3 = org.telegram.messenger.g0.j();
            if (j3 == null) {
                j3 = new ArrayList();
            }
            for (int i7 = 0; i7 < j3.size(); i7++) {
                L.b((View) j3.get(i7));
            }
            L.b(actionBarLayout);
            L.a();
        } catch (Throwable th2) {
            L.a();
            throw th2;
        }
    }

    public static void c(k kVar, int i7, h6 h6Var) {
        l(kVar, 5, i7, h6Var);
    }

    public static void c0(FrameLayout frameLayout, boolean z10) {
        s6 L = L(z10, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(d30 d30Var, int i7) {
        l(d30Var, 5, i7, null);
    }

    public static p6 e(int i7) {
        return new p6(i7, -1, 0.0f, 5);
    }

    public static void f(n6 n6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6Var.a));
        int i7 = n6Var.b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public static p6 g(int i7, int i10) {
        return new p6(i7, -1, i10, 1);
    }

    public static void h(int i7, View view, h6 h6Var) {
        int P = P(i7, -1, 0, 0.0f, h6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, -1, 0, 0.0f, h6Var, P, null);
    }

    public static void i(View view, p6 p6Var, h6 h6Var) {
        int i7 = p6Var.a;
        int i10 = p6Var.b;
        int i11 = p6Var.c;
        float f10 = p6Var.d;
        int P = P(i7, i10, i11, f10, h6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, i10, i11, f10, h6Var, P, null);
    }

    public static void j(View view, Drawable drawable, p6 p6Var, p6 p6Var2, h6 h6Var) {
        o6 o4 = o(view, true);
        o4.d = drawable;
        o4.e = null;
        o4.f = null;
        if (drawable == null) {
            return;
        }
        if (p6Var != null) {
            n6 n6Var = new n6();
            o4.e = n6Var;
            n6Var.c(p6Var.a, p6Var.b, p6Var.c, p6Var.d, h6Var);
            n6Var.g = t(drawable);
        }
        if (p6Var2 != null) {
            n6 n6Var2 = new n6();
            o4.f = n6Var2;
            n6Var2.c(p6Var2.a, p6Var2.b, p6Var2.c, p6Var2.d, h6Var);
            n6Var2.g = n6Var2.b();
        }
    }

    public static void k(View view, Drawable drawable, int i7, int i10, int i11, float f10, h6 h6Var, PorterDuff.Mode mode) {
        int P = P(i7, i10, i11, f10, h6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        o6 o4 = o(view, true);
        if (o4.b == null) {
            o4.b = new ArrayList(2);
        }
        n6 n6Var = null;
        for (int size = o4.b.size() - 1; size >= 0; size--) {
            n6 n6Var2 = (n6) o4.b.get(size);
            Drawable drawable2 = (Drawable) n6Var2.j.get();
            if (drawable2 == drawable) {
                n6Var = n6Var2;
            } else if (drawable2 == null || (!n6Var2.k && drawable2.getColorFilter() != n6Var2.i)) {
                o4.b.remove(size);
            }
        }
        if (n6Var == null) {
            n6Var = new n6();
            n6Var.j = new WeakReference(drawable);
            o4.b.add(n6Var);
        }
        n6 n6Var3 = n6Var;
        n6Var3.c(i7, i10, i11, f10, h6Var);
        n6Var3.g = P;
        n6Var3.i = porterDuffColorFilter;
        n6Var3.h = mode;
        n6Var3.k = drawable.getColorFilter() != porterDuffColorFilter;
    }

    public static void l(View view, int i7, int i10, h6 h6Var) {
        n6 T = T(view, i7, i10, h6Var);
        int b10 = T.b();
        S(view, T, b10);
        T.g = b10;
    }

    public static void m(View view, int i7, int i10, int i11, float f10, h6 h6Var) {
        int P = P(i7, i10, i11, f10, h6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof m5) {
            ((m5) view).setTextColor(P);
        } else {
            ((org.telegram.ui.Components.o6) view).setTextColor(P);
        }
        N(view, 0, i7, i10, i11, f10, h6Var, P, null);
    }

    public static void n(TextView textView, int i7, int i10, int i11, int i12, float f10, h6 h6Var) {
        int P = P(i10, i11, i12, f10, h6Var);
        if (i7 == 1) {
            textView.setHintTextColor(P);
        } else if (i7 == 2) {
            textView.setLinkTextColor(P);
        } else if (i7 == 3) {
            textView.setHighlightColor(P);
        }
        N(textView, i7, i10, i11, i12, f10, h6Var, P, null);
    }

    public static o6 o(View view, boolean z10) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof o6) {
            return (o6) tag;
        }
        if (!z10) {
            return null;
        }
        o6 o6Var = new o6();
        view.setTag(R.id.theme_bind, o6Var);
        return o6Var;
    }

    public static p6 p(int i7, int i10) {
        return new p6(i7, i10, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        s6 L = L(true, 1, hashSet);
        try {
            List j3 = org.telegram.messenger.g0.j();
            if (j3 == null) {
                j3 = new ArrayList();
            }
            for (int i7 = 0; i7 < j3.size(); i7++) {
                L.b((View) j3.get(i7));
            }
            return hashSet;
        } finally {
            L.a();
        }
    }

    public static void s(ImageView imageView, int i7, h6 h6Var, PorterDuff.Mode mode) {
        int P = P(i7, -1, 0, 0.0f, h6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i7, -1, 0, 0.0f, h6Var, P, porterDuffColorFilter).h = mode;
    }

    public static int t(Drawable drawable) {
        if (drawable instanceof InsetDrawable) {
            drawable = ((InsetDrawable) drawable).getDrawable();
        }
        if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            drawable = (rippleDrawable.getNumberOfLayers() <= 0 || rippleDrawable.getId(0) == 16908334) ? null : rippleDrawable.getDrawable(0);
        }
        if (drawable instanceof ShapeDrawable) {
            return ((ShapeDrawable) drawable).getPaint().getColor();
        }
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return 0;
    }

    public static void u(EditTextBoldCursor editTextBoldCursor, int i7) {
        v(editTextBoldCursor, i7, null);
    }

    public static void v(EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        l(editTextBoldCursor, 30, i7, h6Var);
    }

    public static n6 w(int i7, View view) {
        o6 o4 = o(view, true);
        if (o4.c == null) {
            o4.c = new ArrayList(2);
        }
        for (int i10 = 0; i10 < o4.c.size(); i10++) {
            if (((n6) o4.c.get(i10)).l == i7) {
                return (n6) o4.c.get(i10);
            }
        }
        n6 n6Var = new n6();
        n6Var.l = i7;
        o4.c.add(n6Var);
        return n6Var;
    }

    public static void x(View view, Drawable drawable, int i7, h6 h6Var, PorterDuff.Mode mode) {
        k(view, drawable, i7, -1, 0, 0.0f, h6Var, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        l(editTextBoldCursor, 36, i7, h6Var);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i7, h6 h6Var) {
        l(editTextBoldCursor, 35, i7, h6Var);
    }
}

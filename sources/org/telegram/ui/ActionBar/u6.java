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
import org.telegram.ui.c30;
import org.telegram.ui.m30;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class u6 {
    public static final t6 a = new t6();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        l(editTextBoldCursor, 34, i7, i6Var);
    }

    public static void B(View view, Drawable drawable, q6 q6Var, i6 i6Var) {
        view.setBackground(drawable);
        j(view, drawable, q6Var, null, i6Var);
    }

    public static void C(TextView textView, int i7, i6 i6Var) {
        n(textView, 3, i7, -1, 0, 0.0f, i6Var);
    }

    public static void D(TextView textView, int i7, i6 i6Var) {
        n(textView, 1, i7, -1, 0, 0.0f, i6Var);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i7) {
        D(editTextBoldCursor, i7, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i7, int i10, int i11, i6 i6Var) {
        editTextBoldCursor.u(n6.w0(i7, i6Var), n6.w0(i10, i6Var), n6.w0(i11, i6Var));
        T(editTextBoldCursor, 31, i7, i6Var).g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i10, i6Var).g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i11, i6Var).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i7, i6 i6Var) {
        n(textView, 2, i7, -1, 0, 0.0f, i6Var);
    }

    public static void H(RecyclerView recyclerView, int i7, i6 i6Var) {
        l(recyclerView, 21, i7, i6Var);
    }

    public static void I(int i7, m30 m30Var) {
        l(m30Var, 20, i7, null);
    }

    public static void J(ek0 ek0Var, int i7, i6 i6Var) {
        l(ek0Var, 20, i7, i6Var);
    }

    public static q6 K(float f10, int i7) {
        return new q6(i7, -1, f10, 2);
    }

    public static t6 L(boolean z10, int i7, HashSet hashSet) {
        t6 t6Var = a;
        if (t6Var.e) {
            t6Var = new t6();
        }
        t6Var.e = true;
        t6Var.b = z10;
        t6Var.c = i7;
        t6Var.d = hashSet;
        t6Var.a.clear();
        return t6Var;
    }

    public static q6 M(int i7) {
        return new q6(i7, -1, 0.0f, 0);
    }

    public static o6 N(View view, int i7, int i10, int i11, int i12, float f10, i6 i6Var, int i13, PorterDuffColorFilter porterDuffColorFilter) {
        o6[] o6VarArr = o(view, true).a;
        o6 o6Var = o6VarArr[i7];
        if (o6Var == null) {
            o6Var = new o6();
            o6VarArr[i7] = o6Var;
        }
        o6 o6Var2 = o6Var;
        o6Var2.c(i10, i11, i12, f10, i6Var);
        o6Var2.g = i13;
        o6Var2.i = porterDuffColorFilter;
        return o6Var2;
    }

    public static void O(RadioButton radioButton, int i7, int i10, i6 i6Var) {
        radioButton.b(n6.w0(i7, i6Var), n6.w0(i10, i6Var));
        l(radioButton, 23, i7, i6Var);
        l(radioButton, 24, i10, i6Var);
    }

    public static int P(int i7, int i10, int i11, float f10, i6 i6Var) {
        int w02 = n6.w0(i7, i6Var);
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? w02 : b6.b(w02) : n6.w(w02, n6.w0(i10, i6Var)) : i0.a.f(f10, w02, n6.w0(i10, i6Var)) : n6.r1(f10, w02) : i0.a.o(w02, (int) f10);
    }

    public static void Q(View view, Drawable drawable, q6 q6Var, q6 q6Var2, i6 i6Var) {
        view.setBackground(drawable);
        j(view, drawable, q6Var, q6Var2, i6Var);
    }

    public static void R(View view, org.telegram.ui.Cells.y yVar, q6 q6Var, q6 q6Var2) {
        Q(view, yVar, q6Var, q6Var2, null);
    }

    public static void S(View view, o6 o6Var, int i7) {
        int i10 = o6Var.l;
        switch (i10) {
            case 1:
            case 2:
                if (view instanceof k) {
                    ((k) view).F(i7, i10 == 2);
                    break;
                }
                break;
            case 3:
            case 4:
                if (view instanceof k) {
                    ((k) view).E(i7, i10 == 4);
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
                        WeakReference weakReference = o6Var.j;
                        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
                        if (drawable != null && i7 != o6Var.g) {
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

    public static o6 T(View view, int i7, int i10, i6 i6Var) {
        o6 w10 = w(i7, view);
        w10.c(i10, -1, 0, 0.0f, i6Var);
        w10.n = null;
        w10.o = null;
        w10.m = true;
        return w10;
    }

    public static void U(TextView textView, int i7, i6 i6Var) {
        m(textView, i7, -1, 0, 0.0f, i6Var);
    }

    public static void V(TextView textView, q6 q6Var, i6 i6Var) {
        m(textView, q6Var.a, q6Var.b, q6Var.c, q6Var.d, i6Var);
    }

    public static void W(n5 n5Var, int i7) {
        X(n5Var, i7, null);
    }

    public static void X(n5 n5Var, int i7, i6 i6Var) {
        m(n5Var, i7, -1, 0, 0.0f, i6Var);
    }

    public static void Y(org.telegram.ui.Components.n6 n6Var, int i7, i6 i6Var) {
        m(n6Var, i7, -1, 0, 0.0f, i6Var);
    }

    public static void Z(View view, Context context, int i7, int i10) {
        Drawable X0 = n6.X0(context, i7, n6.w0(i10, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        o6 T = T(view, 22, i10, null);
        T.j = new WeakReference(X0);
        T.g = n6.v0(i10);
    }

    public static void a(k kVar, int i7, i6 i6Var, boolean z10) {
        l(kVar, z10 ? 4 : 3, i7, i6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(View view) {
        int i7;
        int k10;
        int b10;
        boolean z10;
        int b11;
        int currentTextColor;
        int currentHintTextColor;
        int defaultColor;
        int color;
        k kVar;
        d dVar;
        p6 o4 = o(view, false);
        if (o4 == null) {
            return;
        }
        for (int i10 = 0; i10 < 6; i10++) {
            o6 o6Var = o4.a[i10];
            if (o6Var != null && !o6Var.a()) {
                int b12 = o6Var.b();
                if (i10 != 0) {
                    if (i10 == 1) {
                        TextView textView = (TextView) view;
                        if (textView.getHintTextColors() != null && !textView.getHintTextColors().isStateful() && ((currentHintTextColor = textView.getCurrentHintTextColor()) == o6Var.g || currentHintTextColor == b12)) {
                            if (currentHintTextColor != b12) {
                                textView.setHintTextColor(b12);
                            }
                            o6Var.g = b12;
                        }
                    } else if (i10 == 2) {
                        TextView textView2 = (TextView) view;
                        if (textView2.getLinkTextColors() != null && !textView2.getLinkTextColors().isStateful() && ((defaultColor = textView2.getLinkTextColors().getDefaultColor()) == o6Var.g || defaultColor == b12)) {
                            if (defaultColor != b12) {
                                textView2.setLinkTextColor(b12);
                            }
                            o6Var.g = b12;
                        }
                    } else if (i10 == 3) {
                        TextView textView3 = (TextView) view;
                        int highlightColor = textView3.getHighlightColor();
                        if (highlightColor == o6Var.g || highlightColor == b12) {
                            if (highlightColor != b12) {
                                textView3.setHighlightColor(b12);
                            }
                            o6Var.g = b12;
                        }
                    } else if (i10 != 4) {
                        if (i10 == 5) {
                            ImageView imageView = (ImageView) view;
                            if (imageView.getColorFilter() == o6Var.i) {
                                if (b12 != o6Var.g) {
                                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b12, o6Var.h);
                                    imageView.setColorFilter(porterDuffColorFilter);
                                    o6Var.i = porterDuffColorFilter;
                                }
                            }
                        }
                        o6Var.g = b12;
                    } else {
                        if (view instanceof k) {
                            k kVar2 = (k) view;
                            if (kVar2.M0) {
                                color = kVar2.getBackgroundColor();
                                if (color != o6Var.g || color == b12) {
                                    if (color != b12) {
                                        view.setBackgroundColor(b12);
                                    }
                                    o6Var.g = b12;
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
                        if (color != o6Var.g) {
                        }
                        if (color != b12) {
                        }
                        o6Var.g = b12;
                    }
                } else if (view instanceof TextView) {
                    TextView textView4 = (TextView) view;
                    if (!textView4.getTextColors().isStateful() && ((currentTextColor = textView4.getCurrentTextColor()) == o6Var.g || currentTextColor == b12)) {
                        if (currentTextColor != b12) {
                            textView4.setTextColor(b12);
                        }
                        o6Var.g = b12;
                    }
                } else {
                    boolean z11 = view instanceof n5;
                    if (z11 || (view instanceof org.telegram.ui.Components.n6)) {
                        int textColor = z11 ? ((n5) view).getTextColor() : ((org.telegram.ui.Components.n6) view).getTextColor();
                        int i11 = textColor & 16777215;
                        if (i11 == (o6Var.g & 16777215) || i11 == (b12 & 16777215)) {
                            if (textColor != b12) {
                                if (z11) {
                                    ((n5) view).setTextColor(b12);
                                } else {
                                    ((org.telegram.ui.Components.n6) view).setTextColor(b12);
                                }
                            }
                            o6Var.g = b12;
                        }
                    }
                }
            }
        }
        if (o4.b != null) {
            boolean z12 = false;
            for (int i12 = 0; i12 < o4.b.size(); i12++) {
                o6 o6Var2 = (o6) o4.b.get(i12);
                Drawable drawable = (Drawable) o6Var2.j.get();
                if (drawable == null || o6Var2.a() || (!(o6Var2.k || drawable.getColorFilter() == o6Var2.i) || (b11 = o6Var2.b()) == o6Var2.g)) {
                    z10 = false;
                } else {
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(b11, o6Var2.h);
                    drawable.setColorFilter(porterDuffColorFilter2);
                    o6Var2.i = porterDuffColorFilter2;
                    o6Var2.g = b11;
                    z10 = true;
                }
                z12 |= z10;
            }
            if (z12) {
                view.invalidate();
            }
        }
        if (o4.d != null && view.getBackground() == o4.d) {
            o6 o6Var3 = o4.e;
            if (o6Var3 != null && !o6Var3.a()) {
                int b13 = o6Var3.b();
                int t6 = t(o4.d);
                if (t6 == o6Var3.g || t6 == b13) {
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
                    o6Var3.g = b13;
                }
            }
            o6 o6Var4 = o4.f;
            if (o6Var4 != null && !o6Var4.a() && (o4.d instanceof RippleDrawable) && (b10 = o6Var4.b()) != o6Var4.g) {
                ((RippleDrawable) o4.d).setColor(ColorStateList.valueOf(b10));
                o6Var4.g = b10;
            }
        }
        if (o4.c != null) {
            for (int i13 = 0; i13 < o4.c.size(); i13++) {
                o6 o6Var5 = (o6) o4.c.get(i13);
                if (!o6Var5.a()) {
                    int b14 = o6Var5.b();
                    if (o6Var5.m) {
                        int i14 = o6Var5.l;
                        switch (i14) {
                            case 1:
                                if (view instanceof k) {
                                    k10 = ((k) view).s0;
                                    break;
                                } else {
                                    i7 = o6Var5.g;
                                    k10 = ~i7;
                                    break;
                                }
                            case 2:
                                if (view instanceof k) {
                                    k10 = ((k) view).t0;
                                    break;
                                } else {
                                    i7 = o6Var5.g;
                                    k10 = ~i7;
                                    break;
                                }
                            case 3:
                                if (view instanceof k) {
                                    k10 = ((k) view).q0;
                                    break;
                                } else {
                                    i7 = o6Var5.g;
                                    k10 = ~i7;
                                    break;
                                }
                            case 4:
                                if (view instanceof k) {
                                    k10 = ((k) view).r0;
                                    break;
                                } else {
                                    i7 = o6Var5.g;
                                    k10 = ~i7;
                                    break;
                                }
                            case 5:
                                if (view instanceof k) {
                                    k10 = ((k) view).getTitleColorToSet();
                                    break;
                                } else {
                                    i7 = o6Var5.g;
                                    k10 = ~i7;
                                    break;
                                }
                            case 6:
                                if (view instanceof k) {
                                    k10 = ((k) view).getSubtitleColorInternal();
                                    break;
                                } else {
                                    i7 = o6Var5.g;
                                    k10 = ~i7;
                                    break;
                                }
                            default:
                                switch (i14) {
                                    case 20:
                                        if (view instanceof ek0) {
                                            k10 = ((ek0) view).getSelectorDrawableColor();
                                            break;
                                        } else {
                                            i7 = o6Var5.g;
                                            k10 = ~i7;
                                            break;
                                        }
                                    case 21:
                                        if (view instanceof RecyclerView) {
                                            k10 = ((RecyclerView) view).getGlowColor();
                                            break;
                                        } else {
                                            i7 = o6Var5.g;
                                            k10 = ~i7;
                                            break;
                                        }
                                    case 22:
                                        WeakReference weakReference = o6Var5.j;
                                        Drawable drawable4 = weakReference != null ? (Drawable) weakReference.get() : null;
                                        if (drawable4 == null || view.getBackground() != drawable4) {
                                            i7 = o6Var5.g;
                                            k10 = ~i7;
                                            break;
                                        } else {
                                            k10 = o6Var5.g;
                                            break;
                                        }
                                        break;
                                    case 23:
                                        if (view instanceof RadioButton) {
                                            k10 = ((RadioButton) view).getColor();
                                            break;
                                        } else {
                                            i7 = o6Var5.g;
                                            k10 = ~i7;
                                            break;
                                        }
                                    case 24:
                                        if (view instanceof RadioButton) {
                                            k10 = ((RadioButton) view).getCheckedColor();
                                            break;
                                        } else {
                                            i7 = o6Var5.g;
                                            k10 = ~i7;
                                            break;
                                        }
                                    default:
                                        if (view instanceof EditTextBoldCursor) {
                                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                                            switch (i14) {
                                                case ks.T /* 30 */:
                                                    k10 = editTextBoldCursor.getCursorColor();
                                                    break;
                                                case ks.U /* 31 */:
                                                    k10 = editTextBoldCursor.getLineColor();
                                                    break;
                                                case 32:
                                                    k10 = editTextBoldCursor.getActiveLineColor();
                                                    break;
                                                case 33:
                                                    k10 = editTextBoldCursor.getErrorLineColor();
                                                    break;
                                                case 34:
                                                    k10 = editTextBoldCursor.getHintColor();
                                                    break;
                                                case 35:
                                                    k10 = editTextBoldCursor.getHeaderHintColor();
                                                    break;
                                                case 36:
                                                    k10 = editTextBoldCursor.getHandlesColor();
                                                    break;
                                            }
                                        }
                                        i7 = o6Var5.g;
                                        k10 = ~i7;
                                        break;
                                }
                        }
                        if (k10 != o6Var5.g || k10 == b14) {
                            if (k10 != b14) {
                                if (o6Var5.m) {
                                    S(view, o6Var5, b14);
                                } else {
                                    s6 s6Var = o6Var5.o;
                                    if (s6Var != null) {
                                        s6Var.g(b14, view);
                                    }
                                }
                            }
                            o6Var5.g = b14;
                        }
                    } else {
                        r6 r6Var = o6Var5.n;
                        if (r6Var != null) {
                            k10 = r6Var.k(view);
                            if (k10 != o6Var5.g) {
                            }
                            if (k10 != b14) {
                            }
                            o6Var5.g = b14;
                        } else {
                            i7 = o6Var5.g;
                            k10 = ~i7;
                            if (k10 != o6Var5.g) {
                            }
                            if (k10 != b14) {
                            }
                            o6Var5.g = b14;
                        }
                    }
                }
            }
        }
    }

    public static void b(k kVar, int i7, i6 i6Var, boolean z10) {
        l(kVar, z10 ? 2 : 1, i7, i6Var);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z10) {
        b++;
        t6 L = L(z10, 0, null);
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

    public static void c(k kVar, int i7, i6 i6Var) {
        l(kVar, 5, i7, i6Var);
    }

    public static void c0(FrameLayout frameLayout, boolean z10) {
        t6 L = L(z10, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(c30 c30Var, int i7) {
        l(c30Var, 5, i7, null);
    }

    public static q6 e(int i7) {
        return new q6(i7, -1, 0.0f, 5);
    }

    public static void f(o6 o6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(o6Var.a));
        int i7 = o6Var.b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public static q6 g(int i7, int i10) {
        return new q6(i7, -1, i10, 1);
    }

    public static void h(int i7, View view, i6 i6Var) {
        int P = P(i7, -1, 0, 0.0f, i6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, -1, 0, 0.0f, i6Var, P, null);
    }

    public static void i(View view, q6 q6Var, i6 i6Var) {
        int i7 = q6Var.a;
        int i10 = q6Var.b;
        int i11 = q6Var.c;
        float f10 = q6Var.d;
        int P = P(i7, i10, i11, f10, i6Var);
        view.setBackgroundColor(P);
        N(view, 4, i7, i10, i11, f10, i6Var, P, null);
    }

    public static void j(View view, Drawable drawable, q6 q6Var, q6 q6Var2, i6 i6Var) {
        p6 o4 = o(view, true);
        o4.d = drawable;
        o4.e = null;
        o4.f = null;
        if (drawable == null) {
            return;
        }
        if (q6Var != null) {
            o6 o6Var = new o6();
            o4.e = o6Var;
            o6Var.c(q6Var.a, q6Var.b, q6Var.c, q6Var.d, i6Var);
            o6Var.g = t(drawable);
        }
        if (q6Var2 != null) {
            o6 o6Var2 = new o6();
            o4.f = o6Var2;
            o6Var2.c(q6Var2.a, q6Var2.b, q6Var2.c, q6Var2.d, i6Var);
            o6Var2.g = o6Var2.b();
        }
    }

    public static void k(View view, Drawable drawable, int i7, int i10, int i11, float f10, i6 i6Var, PorterDuff.Mode mode) {
        int P = P(i7, i10, i11, f10, i6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        p6 o4 = o(view, true);
        if (o4.b == null) {
            o4.b = new ArrayList(2);
        }
        o6 o6Var = null;
        for (int size = o4.b.size() - 1; size >= 0; size--) {
            o6 o6Var2 = (o6) o4.b.get(size);
            Drawable drawable2 = (Drawable) o6Var2.j.get();
            if (drawable2 == drawable) {
                o6Var = o6Var2;
            } else if (drawable2 == null || (!o6Var2.k && drawable2.getColorFilter() != o6Var2.i)) {
                o4.b.remove(size);
            }
        }
        if (o6Var == null) {
            o6Var = new o6();
            o6Var.j = new WeakReference(drawable);
            o4.b.add(o6Var);
        }
        o6 o6Var3 = o6Var;
        o6Var3.c(i7, i10, i11, f10, i6Var);
        o6Var3.g = P;
        o6Var3.i = porterDuffColorFilter;
        o6Var3.h = mode;
        o6Var3.k = drawable.getColorFilter() != porterDuffColorFilter;
    }

    public static void l(View view, int i7, int i10, i6 i6Var) {
        o6 T = T(view, i7, i10, i6Var);
        int b10 = T.b();
        S(view, T, b10);
        T.g = b10;
    }

    public static void m(View view, int i7, int i10, int i11, float f10, i6 i6Var) {
        int P = P(i7, i10, i11, f10, i6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof n5) {
            ((n5) view).setTextColor(P);
        } else {
            ((org.telegram.ui.Components.n6) view).setTextColor(P);
        }
        N(view, 0, i7, i10, i11, f10, i6Var, P, null);
    }

    public static void n(TextView textView, int i7, int i10, int i11, int i12, float f10, i6 i6Var) {
        int P = P(i10, i11, i12, f10, i6Var);
        if (i7 == 1) {
            textView.setHintTextColor(P);
        } else if (i7 == 2) {
            textView.setLinkTextColor(P);
        } else if (i7 == 3) {
            textView.setHighlightColor(P);
        }
        N(textView, i7, i10, i11, i12, f10, i6Var, P, null);
    }

    public static p6 o(View view, boolean z10) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof p6) {
            return (p6) tag;
        }
        if (!z10) {
            return null;
        }
        p6 p6Var = new p6();
        view.setTag(R.id.theme_bind, p6Var);
        return p6Var;
    }

    public static q6 p(int i7, int i10) {
        return new q6(i7, i10, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        t6 L = L(true, 1, hashSet);
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

    public static void s(ImageView imageView, int i7, i6 i6Var, PorterDuff.Mode mode) {
        int P = P(i7, -1, 0, 0.0f, i6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i7, -1, 0, 0.0f, i6Var, P, porterDuffColorFilter).h = mode;
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        l(editTextBoldCursor, 30, i7, i6Var);
    }

    public static o6 w(int i7, View view) {
        p6 o4 = o(view, true);
        if (o4.c == null) {
            o4.c = new ArrayList(2);
        }
        for (int i10 = 0; i10 < o4.c.size(); i10++) {
            if (((o6) o4.c.get(i10)).l == i7) {
                return (o6) o4.c.get(i10);
            }
        }
        o6 o6Var = new o6();
        o6Var.l = i7;
        o4.c.add(o6Var);
        return o6Var;
    }

    public static void x(View view, Drawable drawable, int i7, i6 i6Var, PorterDuff.Mode mode) {
        k(view, drawable, i7, -1, 0, 0.0f, i6Var, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        l(editTextBoldCursor, 36, i7, i6Var);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i7, i6 i6Var) {
        l(editTextBoldCursor, 35, i7, i6Var);
    }
}

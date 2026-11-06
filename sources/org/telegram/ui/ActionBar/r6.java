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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.k30;
import org.telegram.ui.z20;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class r6 {
    public static final q6 a = new q6();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i7, f6 f6Var) {
        m(editTextBoldCursor, 35, i7, f6Var);
    }

    public static void B(EditTextBoldCursor editTextBoldCursor, int i7, f6 f6Var) {
        m(editTextBoldCursor, 34, i7, f6Var);
    }

    public static void C(View view, Drawable drawable, n6 n6Var, f6 f6Var) {
        view.setBackground(drawable);
        k(view, drawable, n6Var, null, f6Var);
    }

    public static void D(TextView textView, int i7, f6 f6Var) {
        o(textView, 3, i7, -1, 0, 0.0f, f6Var);
    }

    public static void E(TextView textView, int i7, f6 f6Var) {
        o(textView, 1, i7, -1, 0, 0.0f, f6Var);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i7) {
        E(editTextBoldCursor, i7, null);
    }

    public static void G(EditTextBoldCursor editTextBoldCursor, int i7, int i10, int i11, f6 f6Var) {
        editTextBoldCursor.u(k6.w0(i7, f6Var), k6.w0(i10, f6Var), k6.w0(i11, f6Var));
        U(editTextBoldCursor, 31, i7, f6Var).g = editTextBoldCursor.getLineColor();
        U(editTextBoldCursor, 32, i10, f6Var).g = editTextBoldCursor.getActiveLineColor();
        U(editTextBoldCursor, 33, i11, f6Var).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void H(TextView textView, int i7, f6 f6Var) {
        o(textView, 2, i7, -1, 0, 0.0f, f6Var);
    }

    public static void I(RecyclerView recyclerView, int i7, f6 f6Var) {
        m(recyclerView, 21, i7, f6Var);
    }

    public static void J(int i7, k30 k30Var) {
        m(k30Var, 20, i7, null);
    }

    public static void K(pj0 pj0Var, int i7, f6 f6Var) {
        m(pj0Var, 20, i7, f6Var);
    }

    public static n6 L(float f10, int i7) {
        return new n6(i7, -1, f10, 2);
    }

    public static q6 M(boolean z9, int i7, HashSet hashSet) {
        q6 q6Var = a;
        if (q6Var.e) {
            q6Var = new q6();
        }
        q6Var.e = true;
        q6Var.b = z9;
        q6Var.c = i7;
        q6Var.d = hashSet;
        q6Var.a.clear();
        return q6Var;
    }

    public static n6 N(int i7) {
        return new n6(i7, -1, 0.0f, 0);
    }

    public static l6 O(View view, int i7, int i10, int i11, int i12, float f10, f6 f6Var, int i13, PorterDuffColorFilter porterDuffColorFilter) {
        l6[] l6VarArr = p(view, true).a;
        l6 l6Var = l6VarArr[i7];
        if (l6Var == null) {
            l6Var = new l6();
            l6VarArr[i7] = l6Var;
        }
        l6 l6Var2 = l6Var;
        l6Var2.c(i10, i11, i12, f10, f6Var);
        l6Var2.g = i13;
        l6Var2.i = porterDuffColorFilter;
        return l6Var2;
    }

    public static void P(RadioButton radioButton, int i7, int i10, f6 f6Var) {
        radioButton.b(k6.w0(i7, f6Var), k6.w0(i10, f6Var));
        m(radioButton, 23, i7, f6Var);
        m(radioButton, 24, i10, f6Var);
    }

    public static int Q(int i7, int i10, int i11, float f10, f6 f6Var) {
        int w02 = k6.w0(i7, f6Var);
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? w02 : z5.b(w02) : k6.w(w02, k6.w0(i10, f6Var)) : i0.a.f(f10, w02, k6.w0(i10, f6Var)) : k6.r1(f10, w02) : i0.a.o(w02, (int) f10);
    }

    public static void R(View view, Drawable drawable, n6 n6Var, n6 n6Var2, f6 f6Var) {
        view.setBackground(drawable);
        k(view, drawable, n6Var, n6Var2, f6Var);
    }

    public static void S(View view, org.telegram.ui.Cells.y yVar, n6 n6Var, n6 n6Var2) {
        R(view, yVar, n6Var, n6Var2, null);
    }

    public static void T(View view, l6 l6Var, int i7) {
        int i10 = l6Var.l;
        switch (i10) {
            case 1:
            case 2:
                if (view instanceof k) {
                    ((k) view).D(i7, i10 == 2);
                    break;
                }
                break;
            case 3:
            case 4:
                if (view instanceof k) {
                    ((k) view).C(i7, i10 == 4);
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
                        if (view instanceof pj0) {
                            ((pj0) view).setSelectorDrawableColor(i7);
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
                        WeakReference weakReference = l6Var.j;
                        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
                        if (drawable != null && i7 != l6Var.g) {
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
                                case qs.T /* 30 */:
                                    editTextBoldCursor.setCursorColor(i7);
                                    break;
                                case qs.U /* 31 */:
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

    public static l6 U(View view, int i7, int i10, f6 f6Var) {
        l6 x10 = x(i7, view);
        x10.c(i10, -1, 0, 0.0f, f6Var);
        x10.n = null;
        x10.o = null;
        x10.m = true;
        return x10;
    }

    public static void V(TextView textView, int i7, f6 f6Var) {
        n(textView, i7, -1, 0, 0.0f, f6Var);
    }

    public static void W(TextView textView, n6 n6Var, f6 f6Var) {
        n(textView, n6Var.a, n6Var.b, n6Var.c, n6Var.d, f6Var);
    }

    public static void X(k5 k5Var, int i7) {
        Y(k5Var, i7, null);
    }

    public static void Y(k5 k5Var, int i7, f6 f6Var) {
        n(k5Var, i7, -1, 0, 0.0f, f6Var);
    }

    public static void Z(org.telegram.ui.Components.j6 j6Var, int i7, f6 f6Var) {
        n(j6Var, i7, -1, 0, 0.0f, f6Var);
    }

    public static void a(k kVar, int i7, f6 f6Var, boolean z9) {
        m(kVar, z9 ? 4 : 3, i7, f6Var);
    }

    public static void a0(View view, Context context, int i7, int i10) {
        Drawable X0 = k6.X0(context, i7, k6.w0(i10, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        l6 U = U(view, 22, i10, null);
        U.j = new WeakReference(X0);
        U.g = k6.v0(i10);
    }

    public static void b(k kVar, int i7, f6 f6Var, boolean z9) {
        m(kVar, z9 ? 2 : 1, i7, f6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(View view) {
        int i7;
        int i10;
        int b10;
        boolean z9;
        int b11;
        int currentTextColor;
        int currentHintTextColor;
        int defaultColor;
        int color;
        k kVar;
        d dVar;
        m6 p10 = p(view, false);
        if (p10 == null) {
            return;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            l6 l6Var = p10.a[i11];
            if (l6Var != null && !l6Var.a()) {
                int b12 = l6Var.b();
                if (i11 != 0) {
                    if (i11 == 1) {
                        TextView textView = (TextView) view;
                        if (textView.getHintTextColors() != null && !textView.getHintTextColors().isStateful() && ((currentHintTextColor = textView.getCurrentHintTextColor()) == l6Var.g || currentHintTextColor == b12)) {
                            if (currentHintTextColor != b12) {
                                textView.setHintTextColor(b12);
                            }
                            l6Var.g = b12;
                        }
                    } else if (i11 == 2) {
                        TextView textView2 = (TextView) view;
                        if (textView2.getLinkTextColors() != null && !textView2.getLinkTextColors().isStateful() && ((defaultColor = textView2.getLinkTextColors().getDefaultColor()) == l6Var.g || defaultColor == b12)) {
                            if (defaultColor != b12) {
                                textView2.setLinkTextColor(b12);
                            }
                            l6Var.g = b12;
                        }
                    } else if (i11 == 3) {
                        TextView textView3 = (TextView) view;
                        int highlightColor = textView3.getHighlightColor();
                        if (highlightColor == l6Var.g || highlightColor == b12) {
                            if (highlightColor != b12) {
                                textView3.setHighlightColor(b12);
                            }
                            l6Var.g = b12;
                        }
                    } else if (i11 != 4) {
                        if (i11 == 5) {
                            ImageView imageView = (ImageView) view;
                            if (imageView.getColorFilter() == l6Var.i) {
                                if (b12 != l6Var.g) {
                                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b12, l6Var.h);
                                    imageView.setColorFilter(porterDuffColorFilter);
                                    l6Var.i = porterDuffColorFilter;
                                }
                            }
                        }
                        l6Var.g = b12;
                    } else {
                        if (view instanceof k) {
                            k kVar2 = (k) view;
                            if (kVar2.L0) {
                                color = kVar2.getBackgroundColor();
                                if (color != l6Var.g || color == b12) {
                                    if (color != b12) {
                                        view.setBackgroundColor(b12);
                                    }
                                    l6Var.g = b12;
                                }
                            }
                        }
                        if ((view instanceof y) && (kVar = ((y) view).b) != null && kVar.L0 && (dVar = kVar.F) != null && dVar == view) {
                            color = dVar == view ? kVar.x : 0;
                        } else {
                            Drawable background = view.getBackground();
                            if (background instanceof ColorDrawable) {
                                color = ((ColorDrawable) background).getColor();
                            }
                        }
                        if (color != l6Var.g) {
                        }
                        if (color != b12) {
                        }
                        l6Var.g = b12;
                    }
                } else if (view instanceof TextView) {
                    TextView textView4 = (TextView) view;
                    if (!textView4.getTextColors().isStateful() && ((currentTextColor = textView4.getCurrentTextColor()) == l6Var.g || currentTextColor == b12)) {
                        if (currentTextColor != b12) {
                            textView4.setTextColor(b12);
                        }
                        l6Var.g = b12;
                    }
                } else {
                    boolean z10 = view instanceof k5;
                    if (z10 || (view instanceof org.telegram.ui.Components.j6)) {
                        int textColor = z10 ? ((k5) view).getTextColor() : ((org.telegram.ui.Components.j6) view).getTextColor();
                        int i12 = textColor & 16777215;
                        if (i12 == (l6Var.g & 16777215) || i12 == (b12 & 16777215)) {
                            if (textColor != b12) {
                                if (z10) {
                                    ((k5) view).setTextColor(b12);
                                } else {
                                    ((org.telegram.ui.Components.j6) view).setTextColor(b12);
                                }
                            }
                            l6Var.g = b12;
                        }
                    }
                }
            }
        }
        if (p10.b != null) {
            boolean z11 = false;
            for (int i13 = 0; i13 < p10.b.size(); i13++) {
                l6 l6Var2 = (l6) p10.b.get(i13);
                Drawable drawable = (Drawable) l6Var2.j.get();
                if (drawable == null || l6Var2.a() || (!(l6Var2.k || drawable.getColorFilter() == l6Var2.i) || (b11 = l6Var2.b()) == l6Var2.g)) {
                    z9 = false;
                } else {
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(b11, l6Var2.h);
                    drawable.setColorFilter(porterDuffColorFilter2);
                    l6Var2.i = porterDuffColorFilter2;
                    l6Var2.g = b11;
                    z9 = true;
                }
                z11 |= z9;
            }
            if (z11) {
                view.invalidate();
            }
        }
        if (p10.d != null && view.getBackground() == p10.d) {
            l6 l6Var3 = p10.e;
            if (l6Var3 != null && !l6Var3.a()) {
                int b13 = l6Var3.b();
                int u10 = u(p10.d);
                if (u10 == l6Var3.g || u10 == b13) {
                    if (u10 != b13) {
                        Drawable drawable2 = p10.d;
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
                    l6Var3.g = b13;
                }
            }
            l6 l6Var4 = p10.f;
            if (l6Var4 != null && !l6Var4.a() && (p10.d instanceof RippleDrawable) && (b10 = l6Var4.b()) != l6Var4.g) {
                ((RippleDrawable) p10.d).setColor(ColorStateList.valueOf(b10));
                l6Var4.g = b10;
            }
        }
        if (p10.c != null) {
            for (int i14 = 0; i14 < p10.c.size(); i14++) {
                l6 l6Var5 = (l6) p10.c.get(i14);
                if (!l6Var5.a()) {
                    int b14 = l6Var5.b();
                    if (l6Var5.m) {
                        int i15 = l6Var5.l;
                        switch (i15) {
                            case 1:
                                if (view instanceof k) {
                                    i10 = ((k) view).r0;
                                    break;
                                } else {
                                    i7 = l6Var5.g;
                                    i10 = ~i7;
                                    break;
                                }
                            case 2:
                                if (view instanceof k) {
                                    i10 = ((k) view).s0;
                                    break;
                                } else {
                                    i7 = l6Var5.g;
                                    i10 = ~i7;
                                    break;
                                }
                            case 3:
                                if (view instanceof k) {
                                    i10 = ((k) view).p0;
                                    break;
                                } else {
                                    i7 = l6Var5.g;
                                    i10 = ~i7;
                                    break;
                                }
                            case 4:
                                if (view instanceof k) {
                                    i10 = ((k) view).q0;
                                    break;
                                } else {
                                    i7 = l6Var5.g;
                                    i10 = ~i7;
                                    break;
                                }
                            case 5:
                                if (view instanceof k) {
                                    i10 = ((k) view).getTitleColorToSet();
                                    break;
                                } else {
                                    i7 = l6Var5.g;
                                    i10 = ~i7;
                                    break;
                                }
                            case 6:
                                if (view instanceof k) {
                                    i10 = ((k) view).getSubtitleColorInternal();
                                    break;
                                } else {
                                    i7 = l6Var5.g;
                                    i10 = ~i7;
                                    break;
                                }
                            default:
                                switch (i15) {
                                    case 20:
                                        if (view instanceof pj0) {
                                            i10 = ((pj0) view).getSelectorDrawableColor();
                                            break;
                                        } else {
                                            i7 = l6Var5.g;
                                            i10 = ~i7;
                                            break;
                                        }
                                    case 21:
                                        if (view instanceof RecyclerView) {
                                            i10 = ((RecyclerView) view).getGlowColor();
                                            break;
                                        } else {
                                            i7 = l6Var5.g;
                                            i10 = ~i7;
                                            break;
                                        }
                                    case 22:
                                        WeakReference weakReference = l6Var5.j;
                                        Drawable drawable4 = weakReference != null ? (Drawable) weakReference.get() : null;
                                        if (drawable4 == null || view.getBackground() != drawable4) {
                                            i7 = l6Var5.g;
                                            i10 = ~i7;
                                            break;
                                        } else {
                                            i10 = l6Var5.g;
                                            break;
                                        }
                                        break;
                                    case 23:
                                        if (view instanceof RadioButton) {
                                            i10 = ((RadioButton) view).getColor();
                                            break;
                                        } else {
                                            i7 = l6Var5.g;
                                            i10 = ~i7;
                                            break;
                                        }
                                    case 24:
                                        if (view instanceof RadioButton) {
                                            i10 = ((RadioButton) view).getCheckedColor();
                                            break;
                                        } else {
                                            i7 = l6Var5.g;
                                            i10 = ~i7;
                                            break;
                                        }
                                    default:
                                        if (view instanceof EditTextBoldCursor) {
                                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                                            switch (i15) {
                                                case qs.T /* 30 */:
                                                    i10 = editTextBoldCursor.getCursorColor();
                                                    break;
                                                case qs.U /* 31 */:
                                                    i10 = editTextBoldCursor.getLineColor();
                                                    break;
                                                case 32:
                                                    i10 = editTextBoldCursor.getActiveLineColor();
                                                    break;
                                                case 33:
                                                    i10 = editTextBoldCursor.getErrorLineColor();
                                                    break;
                                                case 34:
                                                    i10 = editTextBoldCursor.getHintColor();
                                                    break;
                                                case 35:
                                                    i10 = editTextBoldCursor.getHeaderHintColor();
                                                    break;
                                                case 36:
                                                    i10 = editTextBoldCursor.getHandlesColor();
                                                    break;
                                            }
                                        }
                                        i7 = l6Var5.g;
                                        i10 = ~i7;
                                        break;
                                }
                        }
                        if (i10 != l6Var5.g || i10 == b14) {
                            if (i10 != b14) {
                                if (l6Var5.m) {
                                    T(view, l6Var5, b14);
                                } else {
                                    p6 p6Var = l6Var5.o;
                                    if (p6Var != null) {
                                        p6Var.c(b14, view);
                                    }
                                }
                            }
                            l6Var5.g = b14;
                        }
                    } else {
                        o6 o6Var = l6Var5.n;
                        if (o6Var != null) {
                            i10 = o6Var.i(view);
                            if (i10 != l6Var5.g) {
                            }
                            if (i10 != b14) {
                            }
                            l6Var5.g = b14;
                        } else {
                            i7 = l6Var5.g;
                            i10 = ~i7;
                            if (i10 != l6Var5.g) {
                            }
                            if (i10 != b14) {
                            }
                            l6Var5.g = b14;
                        }
                    }
                }
            }
        }
    }

    public static void c(k kVar, int i7, f6 f6Var) {
        m(kVar, 6, i7, f6Var);
    }

    public static void c0(ActionBarLayout actionBarLayout, boolean z9) {
        b++;
        q6 M = M(z9, 0, null);
        try {
            List j3 = org.telegram.messenger.g0.j();
            if (j3 == null) {
                j3 = new ArrayList();
            }
            for (int i7 = 0; i7 < j3.size(); i7++) {
                M.b((View) j3.get(i7));
            }
            M.b(actionBarLayout);
            M.a();
        } catch (Throwable th2) {
            M.a();
            throw th2;
        }
    }

    public static void d(k kVar, int i7, f6 f6Var) {
        m(kVar, 5, i7, f6Var);
    }

    public static void d0(FrameLayout frameLayout, boolean z9) {
        q6 M = M(z9, 0, null);
        try {
            M.b(frameLayout);
        } finally {
            M.a();
        }
    }

    public static void e(z20 z20Var, int i7) {
        m(z20Var, 5, i7, null);
    }

    public static n6 f(int i7) {
        return new n6(i7, -1, 0.0f, 5);
    }

    public static void g(l6 l6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6Var.a));
        int i7 = l6Var.b;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
    }

    public static n6 h(int i7, int i10) {
        return new n6(i7, -1, i10, 1);
    }

    public static void i(int i7, View view, f6 f6Var) {
        int Q = Q(i7, -1, 0, 0.0f, f6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i7, -1, 0, 0.0f, f6Var, Q, null);
    }

    public static void j(View view, n6 n6Var, f6 f6Var) {
        int i7 = n6Var.a;
        int i10 = n6Var.b;
        int i11 = n6Var.c;
        float f10 = n6Var.d;
        int Q = Q(i7, i10, i11, f10, f6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i7, i10, i11, f10, f6Var, Q, null);
    }

    public static void k(View view, Drawable drawable, n6 n6Var, n6 n6Var2, f6 f6Var) {
        m6 p10 = p(view, true);
        p10.d = drawable;
        p10.e = null;
        p10.f = null;
        if (drawable == null) {
            return;
        }
        if (n6Var != null) {
            l6 l6Var = new l6();
            p10.e = l6Var;
            l6Var.c(n6Var.a, n6Var.b, n6Var.c, n6Var.d, f6Var);
            l6Var.g = u(drawable);
        }
        if (n6Var2 != null) {
            l6 l6Var2 = new l6();
            p10.f = l6Var2;
            l6Var2.c(n6Var2.a, n6Var2.b, n6Var2.c, n6Var2.d, f6Var);
            l6Var2.g = l6Var2.b();
        }
    }

    public static void l(View view, Drawable drawable, int i7, int i10, int i11, float f10, f6 f6Var, PorterDuff.Mode mode) {
        int Q = Q(i7, i10, i11, f10, f6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        m6 p10 = p(view, true);
        if (p10.b == null) {
            p10.b = new ArrayList(2);
        }
        l6 l6Var = null;
        for (int size = p10.b.size() - 1; size >= 0; size--) {
            l6 l6Var2 = (l6) p10.b.get(size);
            Drawable drawable2 = (Drawable) l6Var2.j.get();
            if (drawable2 == drawable) {
                l6Var = l6Var2;
            } else if (drawable2 == null || (!l6Var2.k && drawable2.getColorFilter() != l6Var2.i)) {
                p10.b.remove(size);
            }
        }
        if (l6Var == null) {
            l6Var = new l6();
            l6Var.j = new WeakReference(drawable);
            p10.b.add(l6Var);
        }
        l6 l6Var3 = l6Var;
        l6Var3.c(i7, i10, i11, f10, f6Var);
        l6Var3.g = Q;
        l6Var3.i = porterDuffColorFilter;
        l6Var3.h = mode;
        l6Var3.k = drawable.getColorFilter() != porterDuffColorFilter;
    }

    public static void m(View view, int i7, int i10, f6 f6Var) {
        l6 U = U(view, i7, i10, f6Var);
        int b10 = U.b();
        T(view, U, b10);
        U.g = b10;
    }

    public static void n(View view, int i7, int i10, int i11, float f10, f6 f6Var) {
        int Q = Q(i7, i10, i11, f10, f6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(Q);
        } else if (view instanceof k5) {
            ((k5) view).setTextColor(Q);
        } else {
            ((org.telegram.ui.Components.j6) view).setTextColor(Q);
        }
        O(view, 0, i7, i10, i11, f10, f6Var, Q, null);
    }

    public static void o(TextView textView, int i7, int i10, int i11, int i12, float f10, f6 f6Var) {
        int Q = Q(i10, i11, i12, f10, f6Var);
        if (i7 == 1) {
            textView.setHintTextColor(Q);
        } else if (i7 == 2) {
            textView.setLinkTextColor(Q);
        } else if (i7 == 3) {
            textView.setHighlightColor(Q);
        }
        O(textView, i7, i10, i11, i12, f10, f6Var, Q, null);
    }

    public static m6 p(View view, boolean z9) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof m6) {
            return (m6) tag;
        }
        if (!z9) {
            return null;
        }
        m6 m6Var = new m6();
        view.setTag(R.id.theme_bind, m6Var);
        return m6Var;
    }

    public static n6 q(int i7, int i10) {
        return new n6(i7, i10, 0.0f, 4);
    }

    public static void r(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet s() {
        HashSet hashSet = new HashSet();
        q6 M = M(true, 1, hashSet);
        try {
            List j3 = org.telegram.messenger.g0.j();
            if (j3 == null) {
                j3 = new ArrayList();
            }
            for (int i7 = 0; i7 < j3.size(); i7++) {
                M.b((View) j3.get(i7));
            }
            return hashSet;
        } finally {
            M.a();
        }
    }

    public static void t(ImageView imageView, int i7, f6 f6Var, PorterDuff.Mode mode) {
        int Q = Q(i7, -1, 0, 0.0f, f6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        O(imageView, 5, i7, -1, 0, 0.0f, f6Var, Q, porterDuffColorFilter).h = mode;
    }

    public static int u(Drawable drawable) {
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i7) {
        w(editTextBoldCursor, i7, null);
    }

    public static void w(EditTextBoldCursor editTextBoldCursor, int i7, f6 f6Var) {
        m(editTextBoldCursor, 30, i7, f6Var);
    }

    public static l6 x(int i7, View view) {
        m6 p10 = p(view, true);
        if (p10.c == null) {
            p10.c = new ArrayList(2);
        }
        for (int i10 = 0; i10 < p10.c.size(); i10++) {
            if (((l6) p10.c.get(i10)).l == i7) {
                return (l6) p10.c.get(i10);
            }
        }
        l6 l6Var = new l6();
        l6Var.l = i7;
        p10.c.add(l6Var);
        return l6Var;
    }

    public static void y(View view, Drawable drawable, int i7, f6 f6Var, PorterDuff.Mode mode) {
        l(view, drawable, i7, -1, 0, 0.0f, f6Var, mode);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i7, f6 f6Var) {
        m(editTextBoldCursor, 36, i7, f6Var);
    }
}

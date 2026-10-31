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
import org.telegram.messenger.zs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.i40;
import org.telegram.ui.y30;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class a7 {
    public static final z6 a = new z6();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i10, p6 p6Var) {
        m(editTextBoldCursor, 35, i10, p6Var);
    }

    public static void B(EditTextBoldCursor editTextBoldCursor, int i10, p6 p6Var) {
        m(editTextBoldCursor, 34, i10, p6Var);
    }

    public static void C(View view, Drawable drawable, w6 w6Var, p6 p6Var) {
        view.setBackground(drawable);
        k(view, drawable, w6Var, null, p6Var);
    }

    public static void D(TextView textView, int i10, p6 p6Var) {
        o(textView, 3, i10, -1, 0, 0.0f, p6Var);
    }

    public static void E(TextView textView, int i10, p6 p6Var) {
        o(textView, 1, i10, -1, 0, 0.0f, p6Var);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i10) {
        E(editTextBoldCursor, i10, null);
    }

    public static void G(EditTextBoldCursor editTextBoldCursor, int i10, int i11, int i12, p6 p6Var) {
        editTextBoldCursor.u(t6.w0(i10, p6Var), t6.w0(i11, p6Var), t6.w0(i12, p6Var));
        U(editTextBoldCursor, 31, i10, p6Var).g = editTextBoldCursor.getLineColor();
        U(editTextBoldCursor, 32, i11, p6Var).g = editTextBoldCursor.getActiveLineColor();
        U(editTextBoldCursor, 33, i12, p6Var).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void H(TextView textView, int i10, p6 p6Var) {
        o(textView, 2, i10, -1, 0, 0.0f, p6Var);
    }

    public static void I(RecyclerView recyclerView, int i10, p6 p6Var) {
        m(recyclerView, 21, i10, p6Var);
    }

    public static void J(int i10, i40 i40Var) {
        m(i40Var, 20, i10, null);
    }

    public static void K(tk0 tk0Var, int i10, p6 p6Var) {
        m(tk0Var, 20, i10, p6Var);
    }

    public static w6 L(float f7, int i10) {
        return new w6(i10, -1, f7, 2);
    }

    public static z6 M(boolean z10, int i10, HashSet hashSet) {
        z6 z6Var = a;
        if (z6Var.e) {
            z6Var = new z6();
        }
        z6Var.e = true;
        z6Var.b = z10;
        z6Var.c = i10;
        z6Var.d = hashSet;
        z6Var.a.clear();
        return z6Var;
    }

    public static w6 N(int i10) {
        return new w6(i10, -1, 0.0f, 0);
    }

    public static u6 O(View view, int i10, int i11, int i12, int i13, float f7, p6 p6Var, int i14, PorterDuffColorFilter porterDuffColorFilter) {
        u6[] u6VarArr = p(view, true).a;
        u6 u6Var = u6VarArr[i10];
        if (u6Var == null) {
            u6Var = new u6();
            u6VarArr[i10] = u6Var;
        }
        u6 u6Var2 = u6Var;
        u6Var2.c(i11, i12, i13, f7, p6Var);
        u6Var2.g = i14;
        u6Var2.i = porterDuffColorFilter;
        return u6Var2;
    }

    public static void P(RadioButton radioButton, int i10, int i11, p6 p6Var) {
        radioButton.b(t6.w0(i10, p6Var), t6.w0(i11, p6Var));
        m(radioButton, 23, i10, p6Var);
        m(radioButton, 24, i11, p6Var);
    }

    public static int Q(int i10, int i11, int i12, float f7, p6 p6Var) {
        int w02 = t6.w0(i10, p6Var);
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? w02 : j6.b(w02) : t6.w(w02, t6.w0(i11, p6Var)) : i0.b.f(f7, w02, t6.w0(i11, p6Var)) : t6.r1(f7, w02) : i0.b.o(w02, (int) f7);
    }

    public static void R(View view, Drawable drawable, w6 w6Var, w6 w6Var2, p6 p6Var) {
        view.setBackground(drawable);
        k(view, drawable, w6Var, w6Var2, p6Var);
    }

    public static void S(View view, org.telegram.ui.Cells.y yVar, w6 w6Var, w6 w6Var2) {
        R(view, yVar, w6Var, w6Var2, null);
    }

    public static void T(View view, u6 u6Var, int i10) {
        int i11 = u6Var.l;
        switch (i11) {
            case 1:
            case 2:
                if (view instanceof l) {
                    ((l) view).D(i10, i11 == 2);
                    break;
                }
                break;
            case 3:
            case 4:
                if (view instanceof l) {
                    ((l) view).C(i10, i11 == 4);
                    break;
                }
                break;
            case 5:
                if (view instanceof l) {
                    ((l) view).setTitleColor(i10);
                    break;
                }
                break;
            case 6:
                if (view instanceof l) {
                    ((l) view).setSubtitleColor(i10);
                    break;
                }
                break;
            default:
                switch (i11) {
                    case 20:
                        if (view instanceof tk0) {
                            ((tk0) view).setSelectorDrawableColor(i10);
                            break;
                        }
                        break;
                    case 21:
                        if (view instanceof RecyclerView) {
                            ((RecyclerView) view).setGlowColor(i10);
                            break;
                        }
                        break;
                    case 22:
                        WeakReference weakReference = u6Var.j;
                        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
                        if (drawable != null && i10 != u6Var.g) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                            view.invalidate();
                            break;
                        }
                        break;
                    case 23:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setBackgroundColor(i10);
                            break;
                        }
                        break;
                    case 24:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setCheckedColor(i10);
                            break;
                        }
                        break;
                    default:
                        if (view instanceof EditTextBoldCursor) {
                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                            switch (i11) {
                                case zs.T /* 30 */:
                                    editTextBoldCursor.setCursorColor(i10);
                                    break;
                                case zs.U /* 31 */:
                                    editTextBoldCursor.setLineColor(i10);
                                    break;
                                case 32:
                                    editTextBoldCursor.setActiveLineColor(i10);
                                    break;
                                case 33:
                                    editTextBoldCursor.setErrorLineColor(i10);
                                    break;
                                case 34:
                                    editTextBoldCursor.setHintColor(i10);
                                    break;
                                case 35:
                                    editTextBoldCursor.setHeaderHintColor(i10);
                                    break;
                                case 36:
                                    editTextBoldCursor.setHandlesColor(i10);
                                    break;
                            }
                        }
                        break;
                }
        }
    }

    public static u6 U(View view, int i10, int i11, p6 p6Var) {
        u6 x10 = x(i10, view);
        x10.c(i11, -1, 0, 0.0f, p6Var);
        x10.n = null;
        x10.o = null;
        x10.m = true;
        return x10;
    }

    public static void V(TextView textView, int i10, p6 p6Var) {
        n(textView, i10, -1, 0, 0.0f, p6Var);
    }

    public static void W(TextView textView, w6 w6Var, p6 p6Var) {
        n(textView, w6Var.a, w6Var.b, w6Var.c, w6Var.d, p6Var);
    }

    public static void X(u5 u5Var, int i10) {
        Y(u5Var, i10, null);
    }

    public static void Y(u5 u5Var, int i10, p6 p6Var) {
        n(u5Var, i10, -1, 0, 0.0f, p6Var);
    }

    public static void Z(org.telegram.ui.Components.f6 f6Var, int i10, p6 p6Var) {
        n(f6Var, i10, -1, 0, 0.0f, p6Var);
    }

    public static void a(l lVar, int i10, p6 p6Var, boolean z10) {
        m(lVar, z10 ? 4 : 3, i10, p6Var);
    }

    public static void a0(View view, Context context, int i10, int i11) {
        Drawable X0 = t6.X0(context, i10, t6.w0(i11, null));
        view.setBackground(X0);
        if (X0 == null) {
            return;
        }
        u6 U = U(view, 22, i11, null);
        U.j = new WeakReference(X0);
        U.g = t6.v0(i11);
    }

    public static void b(l lVar, int i10, p6 p6Var, boolean z10) {
        m(lVar, z10 ? 2 : 1, i10, p6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(View view) {
        int i10;
        int f7;
        int b10;
        boolean z10;
        int b11;
        int currentTextColor;
        int currentHintTextColor;
        int defaultColor;
        int color;
        l lVar;
        d dVar;
        v6 p5 = p(view, false);
        if (p5 == null) {
            return;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            u6 u6Var = p5.a[i11];
            if (u6Var != null && !u6Var.a()) {
                int b12 = u6Var.b();
                if (i11 != 0) {
                    if (i11 == 1) {
                        TextView textView = (TextView) view;
                        if (textView.getHintTextColors() != null && !textView.getHintTextColors().isStateful() && ((currentHintTextColor = textView.getCurrentHintTextColor()) == u6Var.g || currentHintTextColor == b12)) {
                            if (currentHintTextColor != b12) {
                                textView.setHintTextColor(b12);
                            }
                            u6Var.g = b12;
                        }
                    } else if (i11 == 2) {
                        TextView textView2 = (TextView) view;
                        if (textView2.getLinkTextColors() != null && !textView2.getLinkTextColors().isStateful() && ((defaultColor = textView2.getLinkTextColors().getDefaultColor()) == u6Var.g || defaultColor == b12)) {
                            if (defaultColor != b12) {
                                textView2.setLinkTextColor(b12);
                            }
                            u6Var.g = b12;
                        }
                    } else if (i11 == 3) {
                        TextView textView3 = (TextView) view;
                        int highlightColor = textView3.getHighlightColor();
                        if (highlightColor == u6Var.g || highlightColor == b12) {
                            if (highlightColor != b12) {
                                textView3.setHighlightColor(b12);
                            }
                            u6Var.g = b12;
                        }
                    } else if (i11 != 4) {
                        if (i11 == 5) {
                            ImageView imageView = (ImageView) view;
                            if (imageView.getColorFilter() == u6Var.i) {
                                if (b12 != u6Var.g) {
                                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b12, u6Var.h);
                                    imageView.setColorFilter(porterDuffColorFilter);
                                    u6Var.i = porterDuffColorFilter;
                                }
                            }
                        }
                        u6Var.g = b12;
                    } else {
                        if (view instanceof l) {
                            l lVar2 = (l) view;
                            if (lVar2.L0) {
                                color = lVar2.getBackgroundColor();
                                if (color != u6Var.g || color == b12) {
                                    if (color != b12) {
                                        view.setBackgroundColor(b12);
                                    }
                                    u6Var.g = b12;
                                }
                            }
                        }
                        if ((view instanceof y) && (lVar = ((y) view).b) != null && lVar.L0 && (dVar = lVar.F) != null && dVar == view) {
                            color = dVar == view ? lVar.x : 0;
                        } else {
                            Drawable background = view.getBackground();
                            if (background instanceof ColorDrawable) {
                                color = ((ColorDrawable) background).getColor();
                            }
                        }
                        if (color != u6Var.g) {
                        }
                        if (color != b12) {
                        }
                        u6Var.g = b12;
                    }
                } else if (view instanceof TextView) {
                    TextView textView4 = (TextView) view;
                    if (!textView4.getTextColors().isStateful() && ((currentTextColor = textView4.getCurrentTextColor()) == u6Var.g || currentTextColor == b12)) {
                        if (currentTextColor != b12) {
                            textView4.setTextColor(b12);
                        }
                        u6Var.g = b12;
                    }
                } else {
                    boolean z11 = view instanceof u5;
                    if (z11 || (view instanceof org.telegram.ui.Components.f6)) {
                        int textColor = z11 ? ((u5) view).getTextColor() : ((org.telegram.ui.Components.f6) view).getTextColor();
                        int i12 = textColor & 16777215;
                        if (i12 == (u6Var.g & 16777215) || i12 == (b12 & 16777215)) {
                            if (textColor != b12) {
                                if (z11) {
                                    ((u5) view).setTextColor(b12);
                                } else {
                                    ((org.telegram.ui.Components.f6) view).setTextColor(b12);
                                }
                            }
                            u6Var.g = b12;
                        }
                    }
                }
            }
        }
        if (p5.b != null) {
            boolean z12 = false;
            for (int i13 = 0; i13 < p5.b.size(); i13++) {
                u6 u6Var2 = (u6) p5.b.get(i13);
                Drawable drawable = (Drawable) u6Var2.j.get();
                if (drawable == null || u6Var2.a() || (!(u6Var2.k || drawable.getColorFilter() == u6Var2.i) || (b11 = u6Var2.b()) == u6Var2.g)) {
                    z10 = false;
                } else {
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(b11, u6Var2.h);
                    drawable.setColorFilter(porterDuffColorFilter2);
                    u6Var2.i = porterDuffColorFilter2;
                    u6Var2.g = b11;
                    z10 = true;
                }
                z12 |= z10;
            }
            if (z12) {
                view.invalidate();
            }
        }
        if (p5.d != null && view.getBackground() == p5.d) {
            u6 u6Var3 = p5.e;
            if (u6Var3 != null && !u6Var3.a()) {
                int b13 = u6Var3.b();
                int u10 = u(p5.d);
                if (u10 == u6Var3.g || u10 == b13) {
                    if (u10 != b13) {
                        Drawable drawable2 = p5.d;
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
                    u6Var3.g = b13;
                }
            }
            u6 u6Var4 = p5.f;
            if (u6Var4 != null && !u6Var4.a() && (p5.d instanceof RippleDrawable) && (b10 = u6Var4.b()) != u6Var4.g) {
                ((RippleDrawable) p5.d).setColor(ColorStateList.valueOf(b10));
                u6Var4.g = b10;
            }
        }
        if (p5.c != null) {
            for (int i14 = 0; i14 < p5.c.size(); i14++) {
                u6 u6Var5 = (u6) p5.c.get(i14);
                if (!u6Var5.a()) {
                    int b14 = u6Var5.b();
                    if (u6Var5.m) {
                        int i15 = u6Var5.l;
                        switch (i15) {
                            case 1:
                                if (view instanceof l) {
                                    f7 = ((l) view).r0;
                                    break;
                                } else {
                                    i10 = u6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            case 2:
                                if (view instanceof l) {
                                    f7 = ((l) view).s0;
                                    break;
                                } else {
                                    i10 = u6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            case 3:
                                if (view instanceof l) {
                                    f7 = ((l) view).p0;
                                    break;
                                } else {
                                    i10 = u6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            case 4:
                                if (view instanceof l) {
                                    f7 = ((l) view).q0;
                                    break;
                                } else {
                                    i10 = u6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            case 5:
                                if (view instanceof l) {
                                    f7 = ((l) view).getTitleColorToSet();
                                    break;
                                } else {
                                    i10 = u6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            case 6:
                                if (view instanceof l) {
                                    f7 = ((l) view).getSubtitleColorInternal();
                                    break;
                                } else {
                                    i10 = u6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            default:
                                switch (i15) {
                                    case 20:
                                        if (view instanceof tk0) {
                                            f7 = ((tk0) view).getSelectorDrawableColor();
                                            break;
                                        } else {
                                            i10 = u6Var5.g;
                                            f7 = ~i10;
                                            break;
                                        }
                                    case 21:
                                        if (view instanceof RecyclerView) {
                                            f7 = ((RecyclerView) view).getGlowColor();
                                            break;
                                        } else {
                                            i10 = u6Var5.g;
                                            f7 = ~i10;
                                            break;
                                        }
                                    case 22:
                                        WeakReference weakReference = u6Var5.j;
                                        Drawable drawable4 = weakReference != null ? (Drawable) weakReference.get() : null;
                                        if (drawable4 == null || view.getBackground() != drawable4) {
                                            i10 = u6Var5.g;
                                            f7 = ~i10;
                                            break;
                                        } else {
                                            f7 = u6Var5.g;
                                            break;
                                        }
                                        break;
                                    case 23:
                                        if (view instanceof RadioButton) {
                                            f7 = ((RadioButton) view).getColor();
                                            break;
                                        } else {
                                            i10 = u6Var5.g;
                                            f7 = ~i10;
                                            break;
                                        }
                                    case 24:
                                        if (view instanceof RadioButton) {
                                            f7 = ((RadioButton) view).getCheckedColor();
                                            break;
                                        } else {
                                            i10 = u6Var5.g;
                                            f7 = ~i10;
                                            break;
                                        }
                                    default:
                                        if (view instanceof EditTextBoldCursor) {
                                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                                            switch (i15) {
                                                case zs.T /* 30 */:
                                                    f7 = editTextBoldCursor.getCursorColor();
                                                    break;
                                                case zs.U /* 31 */:
                                                    f7 = editTextBoldCursor.getLineColor();
                                                    break;
                                                case 32:
                                                    f7 = editTextBoldCursor.getActiveLineColor();
                                                    break;
                                                case 33:
                                                    f7 = editTextBoldCursor.getErrorLineColor();
                                                    break;
                                                case 34:
                                                    f7 = editTextBoldCursor.getHintColor();
                                                    break;
                                                case 35:
                                                    f7 = editTextBoldCursor.getHeaderHintColor();
                                                    break;
                                                case 36:
                                                    f7 = editTextBoldCursor.getHandlesColor();
                                                    break;
                                            }
                                        }
                                        i10 = u6Var5.g;
                                        f7 = ~i10;
                                        break;
                                }
                        }
                        if (f7 != u6Var5.g || f7 == b14) {
                            if (f7 != b14) {
                                if (u6Var5.m) {
                                    T(view, u6Var5, b14);
                                } else {
                                    y6 y6Var = u6Var5.o;
                                    if (y6Var != null) {
                                        y6Var.d(b14, view);
                                    }
                                }
                            }
                            u6Var5.g = b14;
                        }
                    } else {
                        x6 x6Var = u6Var5.n;
                        if (x6Var != null) {
                            f7 = x6Var.f(view);
                            if (f7 != u6Var5.g) {
                            }
                            if (f7 != b14) {
                            }
                            u6Var5.g = b14;
                        } else {
                            i10 = u6Var5.g;
                            f7 = ~i10;
                            if (f7 != u6Var5.g) {
                            }
                            if (f7 != b14) {
                            }
                            u6Var5.g = b14;
                        }
                    }
                }
            }
        }
    }

    public static void c(l lVar, int i10, p6 p6Var) {
        m(lVar, 6, i10, p6Var);
    }

    public static void c0(ActionBarLayout actionBarLayout, boolean z10) {
        b++;
        z6 M = M(z10, 0, null);
        try {
            List j10 = org.telegram.messenger.i0.j();
            if (j10 == null) {
                j10 = new ArrayList();
            }
            for (int i10 = 0; i10 < j10.size(); i10++) {
                M.b((View) j10.get(i10));
            }
            M.b(actionBarLayout);
            M.a();
        } catch (Throwable th2) {
            M.a();
            throw th2;
        }
    }

    public static void d(l lVar, int i10, p6 p6Var) {
        m(lVar, 5, i10, p6Var);
    }

    public static void d0(FrameLayout frameLayout, boolean z10) {
        z6 M = M(z10, 0, null);
        try {
            M.b(frameLayout);
        } finally {
            M.a();
        }
    }

    public static void e(y30 y30Var, int i10) {
        m(y30Var, 5, i10, null);
    }

    public static w6 f(int i10) {
        return new w6(i10, -1, 0.0f, 5);
    }

    public static void g(u6 u6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(u6Var.a));
        int i10 = u6Var.b;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
    }

    public static w6 h(int i10, int i11) {
        return new w6(i10, -1, i11, 1);
    }

    public static void i(int i10, View view, p6 p6Var) {
        int Q = Q(i10, -1, 0, 0.0f, p6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i10, -1, 0, 0.0f, p6Var, Q, null);
    }

    public static void j(View view, w6 w6Var, p6 p6Var) {
        int i10 = w6Var.a;
        int i11 = w6Var.b;
        int i12 = w6Var.c;
        float f7 = w6Var.d;
        int Q = Q(i10, i11, i12, f7, p6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i10, i11, i12, f7, p6Var, Q, null);
    }

    public static void k(View view, Drawable drawable, w6 w6Var, w6 w6Var2, p6 p6Var) {
        v6 p5 = p(view, true);
        p5.d = drawable;
        p5.e = null;
        p5.f = null;
        if (drawable == null) {
            return;
        }
        if (w6Var != null) {
            u6 u6Var = new u6();
            p5.e = u6Var;
            u6Var.c(w6Var.a, w6Var.b, w6Var.c, w6Var.d, p6Var);
            u6Var.g = u(drawable);
        }
        if (w6Var2 != null) {
            u6 u6Var2 = new u6();
            p5.f = u6Var2;
            u6Var2.c(w6Var2.a, w6Var2.b, w6Var2.c, w6Var2.d, p6Var);
            u6Var2.g = u6Var2.b();
        }
    }

    public static void l(View view, Drawable drawable, int i10, int i11, int i12, float f7, p6 p6Var, PorterDuff.Mode mode) {
        int Q = Q(i10, i11, i12, f7, p6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        v6 p5 = p(view, true);
        if (p5.b == null) {
            p5.b = new ArrayList(2);
        }
        u6 u6Var = null;
        for (int size = p5.b.size() - 1; size >= 0; size--) {
            u6 u6Var2 = (u6) p5.b.get(size);
            Drawable drawable2 = (Drawable) u6Var2.j.get();
            if (drawable2 == drawable) {
                u6Var = u6Var2;
            } else if (drawable2 == null || (!u6Var2.k && drawable2.getColorFilter() != u6Var2.i)) {
                p5.b.remove(size);
            }
        }
        if (u6Var == null) {
            u6Var = new u6();
            u6Var.j = new WeakReference(drawable);
            p5.b.add(u6Var);
        }
        u6 u6Var3 = u6Var;
        u6Var3.c(i10, i11, i12, f7, p6Var);
        u6Var3.g = Q;
        u6Var3.i = porterDuffColorFilter;
        u6Var3.h = mode;
        u6Var3.k = drawable.getColorFilter() != porterDuffColorFilter;
    }

    public static void m(View view, int i10, int i11, p6 p6Var) {
        u6 U = U(view, i10, i11, p6Var);
        int b10 = U.b();
        T(view, U, b10);
        U.g = b10;
    }

    public static void n(View view, int i10, int i11, int i12, float f7, p6 p6Var) {
        int Q = Q(i10, i11, i12, f7, p6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(Q);
        } else if (view instanceof u5) {
            ((u5) view).setTextColor(Q);
        } else {
            ((org.telegram.ui.Components.f6) view).setTextColor(Q);
        }
        O(view, 0, i10, i11, i12, f7, p6Var, Q, null);
    }

    public static void o(TextView textView, int i10, int i11, int i12, int i13, float f7, p6 p6Var) {
        int Q = Q(i11, i12, i13, f7, p6Var);
        if (i10 == 1) {
            textView.setHintTextColor(Q);
        } else if (i10 == 2) {
            textView.setLinkTextColor(Q);
        } else if (i10 == 3) {
            textView.setHighlightColor(Q);
        }
        O(textView, i10, i11, i12, i13, f7, p6Var, Q, null);
    }

    public static v6 p(View view, boolean z10) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof v6) {
            return (v6) tag;
        }
        if (!z10) {
            return null;
        }
        v6 v6Var = new v6();
        view.setTag(R.id.theme_bind, v6Var);
        return v6Var;
    }

    public static w6 q(int i10, int i11) {
        return new w6(i10, i11, 0.0f, 4);
    }

    public static void r(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet s() {
        HashSet hashSet = new HashSet();
        z6 M = M(true, 1, hashSet);
        try {
            List j10 = org.telegram.messenger.i0.j();
            if (j10 == null) {
                j10 = new ArrayList();
            }
            for (int i10 = 0; i10 < j10.size(); i10++) {
                M.b((View) j10.get(i10));
            }
            return hashSet;
        } finally {
            M.a();
        }
    }

    public static void t(ImageView imageView, int i10, p6 p6Var, PorterDuff.Mode mode) {
        int Q = Q(i10, -1, 0, 0.0f, p6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        O(imageView, 5, i10, -1, 0, 0.0f, p6Var, Q, porterDuffColorFilter).h = mode;
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

    public static void v(EditTextBoldCursor editTextBoldCursor, int i10) {
        w(editTextBoldCursor, i10, null);
    }

    public static void w(EditTextBoldCursor editTextBoldCursor, int i10, p6 p6Var) {
        m(editTextBoldCursor, 30, i10, p6Var);
    }

    public static u6 x(int i10, View view) {
        v6 p5 = p(view, true);
        if (p5.c == null) {
            p5.c = new ArrayList(2);
        }
        for (int i11 = 0; i11 < p5.c.size(); i11++) {
            if (((u6) p5.c.get(i11)).l == i10) {
                return (u6) p5.c.get(i11);
            }
        }
        u6 u6Var = new u6();
        u6Var.l = i10;
        p5.c.add(u6Var);
        return u6Var;
    }

    public static void y(View view, Drawable drawable, int i10, p6 p6Var, PorterDuff.Mode mode) {
        l(view, drawable, i10, -1, 0, 0.0f, p6Var, mode);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i10, p6 p6Var) {
        m(editTextBoldCursor, 36, i10, p6Var);
    }
}

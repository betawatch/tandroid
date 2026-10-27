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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.d50;
import org.telegram.ui.t40;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class f7 {
    public static final e7 a = new e7();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i10, u6 u6Var) {
        m(editTextBoldCursor, 35, i10, u6Var);
    }

    public static void B(EditTextBoldCursor editTextBoldCursor, int i10, u6 u6Var) {
        m(editTextBoldCursor, 34, i10, u6Var);
    }

    public static void C(View view, Drawable drawable, b7 b7Var, u6 u6Var) {
        view.setBackground(drawable);
        k(view, drawable, b7Var, null, u6Var);
    }

    public static void D(TextView textView, int i10, u6 u6Var) {
        o(textView, 3, i10, -1, 0, 0.0f, u6Var);
    }

    public static void E(TextView textView, int i10, u6 u6Var) {
        o(textView, 1, i10, -1, 0, 0.0f, u6Var);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i10) {
        E(editTextBoldCursor, i10, null);
    }

    public static void G(EditTextBoldCursor editTextBoldCursor, int i10, int i11, int i12, u6 u6Var) {
        editTextBoldCursor.setLineColors(y6.w0(i10, u6Var), y6.w0(i11, u6Var), y6.w0(i12, u6Var));
        U(editTextBoldCursor, 31, i10, u6Var).g = editTextBoldCursor.getLineColor();
        U(editTextBoldCursor, 32, i11, u6Var).g = editTextBoldCursor.getActiveLineColor();
        U(editTextBoldCursor, 33, i12, u6Var).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void H(TextView textView, int i10, u6 u6Var) {
        o(textView, 2, i10, -1, 0, 0.0f, u6Var);
    }

    public static void I(RecyclerView recyclerView, int i10, u6 u6Var) {
        m(recyclerView, 21, i10, u6Var);
    }

    public static void J(int i10, d50 d50Var) {
        m(d50Var, 20, i10, null);
    }

    public static void K(nm0 nm0Var, int i10, u6 u6Var) {
        m(nm0Var, 20, i10, u6Var);
    }

    public static b7 L(float f7, int i10) {
        return new b7(i10, -1, f7, 2);
    }

    public static e7 M(boolean z10, int i10, HashSet hashSet) {
        e7 e7Var = a;
        if (e7Var.e) {
            e7Var = new e7();
        }
        e7Var.e = true;
        e7Var.b = z10;
        e7Var.c = i10;
        e7Var.d = hashSet;
        e7Var.a.clear();
        return e7Var;
    }

    public static b7 N(int i10) {
        return new b7(i10, -1, 0.0f, 0);
    }

    public static z6 O(View view, int i10, int i11, int i12, int i13, float f7, u6 u6Var, int i14, PorterDuffColorFilter porterDuffColorFilter) {
        z6[] z6VarArr = p(view, true).a;
        z6 z6Var = z6VarArr[i10];
        if (z6Var == null) {
            z6Var = new z6();
            z6VarArr[i10] = z6Var;
        }
        z6 z6Var2 = z6Var;
        z6Var2.c(i11, i12, i13, f7, u6Var);
        z6Var2.g = i14;
        z6Var2.i = porterDuffColorFilter;
        return z6Var2;
    }

    public static void P(RadioButton radioButton, int i10, int i11, u6 u6Var) {
        radioButton.b(y6.w0(i10, u6Var), y6.w0(i11, u6Var));
        m(radioButton, 23, i10, u6Var);
        m(radioButton, 24, i11, u6Var);
    }

    public static int Q(int i10, int i11, int i12, float f7, u6 u6Var) {
        int w02 = y6.w0(i10, u6Var);
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? w02 : o6.b(w02) : y6.v(w02, y6.w0(i11, u6Var)) : i0.a.f(f7, w02, y6.w0(i11, u6Var)) : y6.o1(f7, w02) : i0.a.o(w02, (int) f7);
    }

    public static void R(View view, Drawable drawable, b7 b7Var, b7 b7Var2, u6 u6Var) {
        view.setBackground(drawable);
        k(view, drawable, b7Var, b7Var2, u6Var);
    }

    public static void S(View view, org.telegram.ui.Cells.y yVar, b7 b7Var, b7 b7Var2) {
        R(view, yVar, b7Var, b7Var2, null);
    }

    public static void T(View view, z6 z6Var, int i10) {
        int i11 = z6Var.l;
        switch (i11) {
            case 1:
            case 2:
                if (view instanceof k) {
                    ((k) view).y(i10, i11 == 2);
                    break;
                }
                break;
            case 3:
            case 4:
                if (view instanceof k) {
                    ((k) view).x(i10, i11 == 4);
                    break;
                }
                break;
            case 5:
                if (view instanceof k) {
                    ((k) view).setTitleColor(i10);
                    break;
                }
                break;
            case 6:
                if (view instanceof k) {
                    ((k) view).setSubtitleColor(i10);
                    break;
                }
                break;
            default:
                switch (i11) {
                    case 20:
                        if (view instanceof nm0) {
                            ((nm0) view).setSelectorDrawableColor(i10);
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
                        WeakReference weakReference = z6Var.j;
                        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
                        if (drawable != null && i10 != z6Var.g) {
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
                                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                    editTextBoldCursor.setCursorColor(i10);
                                    break;
                                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
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

    public static z6 U(View view, int i10, int i11, u6 u6Var) {
        z6 x9 = x(i10, view);
        x9.c(i11, -1, 0, 0.0f, u6Var);
        x9.n = null;
        x9.o = null;
        x9.m = true;
        return x9;
    }

    public static void V(TextView textView, int i10, u6 u6Var) {
        n(textView, i10, -1, 0, 0.0f, u6Var);
    }

    public static void W(TextView textView, b7 b7Var, u6 u6Var) {
        n(textView, b7Var.a, b7Var.b, b7Var.c, b7Var.d, u6Var);
    }

    public static void X(b6 b6Var, int i10) {
        Y(b6Var, i10, null);
    }

    public static void Y(b6 b6Var, int i10, u6 u6Var) {
        n(b6Var, i10, -1, 0, 0.0f, u6Var);
    }

    public static void Z(org.telegram.ui.Components.s6 s6Var, int i10, u6 u6Var) {
        n(s6Var, i10, -1, 0, 0.0f, u6Var);
    }

    public static void a(k kVar, int i10, u6 u6Var, boolean z10) {
        m(kVar, z10 ? 4 : 3, i10, u6Var);
    }

    public static void a0(int i10, int i11, Context context, View view, u6 u6Var) {
        Drawable W0 = y6.W0(context, i10, y6.w0(i11, u6Var));
        view.setBackground(W0);
        if (W0 == null) {
            return;
        }
        z6 U = U(view, 22, i11, u6Var);
        U.j = new WeakReference(W0);
        U.g = y6.w0(i11, u6Var);
    }

    public static void b(k kVar, int i10, u6 u6Var, boolean z10) {
        m(kVar, z10 ? 2 : 1, i10, u6Var);
    }

    public static void b0(View view, Context context, int i10, int i11) {
        a0(i10, i11, context, view, null);
    }

    public static void c(k kVar, int i10, u6 u6Var) {
        m(kVar, 6, i10, u6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c0(View view) {
        int i10;
        int e;
        int b10;
        boolean z10;
        int b11;
        int currentTextColor;
        int currentHintTextColor;
        int defaultColor;
        int color;
        k kVar;
        d dVar;
        a7 p10 = p(view, false);
        if (p10 == null) {
            return;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            z6 z6Var = p10.a[i11];
            if (z6Var != null && !z6Var.a()) {
                int b12 = z6Var.b();
                if (i11 != 0) {
                    if (i11 == 1) {
                        TextView textView = (TextView) view;
                        if (textView.getHintTextColors() != null && !textView.getHintTextColors().isStateful() && ((currentHintTextColor = textView.getCurrentHintTextColor()) == z6Var.g || currentHintTextColor == b12)) {
                            if (currentHintTextColor != b12) {
                                textView.setHintTextColor(b12);
                            }
                            z6Var.g = b12;
                        }
                    } else if (i11 == 2) {
                        TextView textView2 = (TextView) view;
                        if (textView2.getLinkTextColors() != null && !textView2.getLinkTextColors().isStateful() && ((defaultColor = textView2.getLinkTextColors().getDefaultColor()) == z6Var.g || defaultColor == b12)) {
                            if (defaultColor != b12) {
                                textView2.setLinkTextColor(b12);
                            }
                            z6Var.g = b12;
                        }
                    } else if (i11 == 3) {
                        TextView textView3 = (TextView) view;
                        int highlightColor = textView3.getHighlightColor();
                        if (highlightColor == z6Var.g || highlightColor == b12) {
                            if (highlightColor != b12) {
                                textView3.setHighlightColor(b12);
                            }
                            z6Var.g = b12;
                        }
                    } else if (i11 != 4) {
                        if (i11 == 5) {
                            ImageView imageView = (ImageView) view;
                            if (imageView.getColorFilter() == z6Var.i) {
                                if (b12 != z6Var.g) {
                                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b12, z6Var.h);
                                    imageView.setColorFilter(porterDuffColorFilter);
                                    z6Var.i = porterDuffColorFilter;
                                }
                            }
                        }
                        z6Var.g = b12;
                    } else {
                        if (view instanceof k) {
                            k kVar2 = (k) view;
                            if (kVar2.L0) {
                                color = kVar2.getBackgroundColor();
                                if (color != z6Var.g || color == b12) {
                                    if (color != b12) {
                                        view.setBackgroundColor(b12);
                                    }
                                    z6Var.g = b12;
                                }
                            }
                        }
                        if ((view instanceof z) && (kVar = ((z) view).b) != null && kVar.L0 && (dVar = kVar.F) != null && dVar == view) {
                            color = dVar == view ? kVar.w : 0;
                        } else {
                            Drawable background = view.getBackground();
                            if (background instanceof ColorDrawable) {
                                color = ((ColorDrawable) background).getColor();
                            }
                        }
                        if (color != z6Var.g) {
                        }
                        if (color != b12) {
                        }
                        z6Var.g = b12;
                    }
                } else if (view instanceof TextView) {
                    TextView textView4 = (TextView) view;
                    if (!textView4.getTextColors().isStateful() && ((currentTextColor = textView4.getCurrentTextColor()) == z6Var.g || currentTextColor == b12)) {
                        if (currentTextColor != b12) {
                            textView4.setTextColor(b12);
                        }
                        z6Var.g = b12;
                    }
                } else {
                    boolean z11 = view instanceof b6;
                    if (z11 || (view instanceof org.telegram.ui.Components.s6)) {
                        int textColor = z11 ? ((b6) view).getTextColor() : ((org.telegram.ui.Components.s6) view).getTextColor();
                        int i12 = textColor & 16777215;
                        if (i12 == (z6Var.g & 16777215) || i12 == (b12 & 16777215)) {
                            if (textColor != b12) {
                                if (z11) {
                                    ((b6) view).setTextColor(b12);
                                } else {
                                    ((org.telegram.ui.Components.s6) view).setTextColor(b12);
                                }
                            }
                            z6Var.g = b12;
                        }
                    }
                }
            }
        }
        if (p10.b != null) {
            boolean z12 = false;
            for (int i13 = 0; i13 < p10.b.size(); i13++) {
                z6 z6Var2 = (z6) p10.b.get(i13);
                Drawable drawable = (Drawable) z6Var2.j.get();
                if (drawable == null || z6Var2.a() || (!(z6Var2.k || drawable.getColorFilter() == z6Var2.i) || (b11 = z6Var2.b()) == z6Var2.g)) {
                    z10 = false;
                } else {
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(b11, z6Var2.h);
                    drawable.setColorFilter(porterDuffColorFilter2);
                    z6Var2.i = porterDuffColorFilter2;
                    z6Var2.g = b11;
                    z10 = true;
                }
                z12 |= z10;
            }
            if (z12) {
                view.invalidate();
            }
        }
        if (p10.d != null && view.getBackground() == p10.d) {
            z6 z6Var3 = p10.e;
            if (z6Var3 != null && !z6Var3.a()) {
                int b13 = z6Var3.b();
                int u10 = u(p10.d);
                if (u10 == z6Var3.g || u10 == b13) {
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
                    z6Var3.g = b13;
                }
            }
            z6 z6Var4 = p10.f;
            if (z6Var4 != null && !z6Var4.a() && (p10.d instanceof RippleDrawable) && (b10 = z6Var4.b()) != z6Var4.g) {
                ((RippleDrawable) p10.d).setColor(ColorStateList.valueOf(b10));
                z6Var4.g = b10;
            }
        }
        if (p10.c != null) {
            for (int i14 = 0; i14 < p10.c.size(); i14++) {
                z6 z6Var5 = (z6) p10.c.get(i14);
                if (!z6Var5.a()) {
                    int b14 = z6Var5.b();
                    if (z6Var5.m) {
                        int i15 = z6Var5.l;
                        switch (i15) {
                            case 1:
                                if (view instanceof k) {
                                    e = ((k) view).r0;
                                    break;
                                } else {
                                    i10 = z6Var5.g;
                                    e = ~i10;
                                    break;
                                }
                            case 2:
                                if (view instanceof k) {
                                    e = ((k) view).s0;
                                    break;
                                } else {
                                    i10 = z6Var5.g;
                                    e = ~i10;
                                    break;
                                }
                            case 3:
                                if (view instanceof k) {
                                    e = ((k) view).p0;
                                    break;
                                } else {
                                    i10 = z6Var5.g;
                                    e = ~i10;
                                    break;
                                }
                            case 4:
                                if (view instanceof k) {
                                    e = ((k) view).q0;
                                    break;
                                } else {
                                    i10 = z6Var5.g;
                                    e = ~i10;
                                    break;
                                }
                            case 5:
                                if (view instanceof k) {
                                    e = ((k) view).getTitleColorToSet();
                                    break;
                                } else {
                                    i10 = z6Var5.g;
                                    e = ~i10;
                                    break;
                                }
                            case 6:
                                if (view instanceof k) {
                                    e = ((k) view).getSubtitleColorInternal();
                                    break;
                                } else {
                                    i10 = z6Var5.g;
                                    e = ~i10;
                                    break;
                                }
                            default:
                                switch (i15) {
                                    case 20:
                                        if (view instanceof nm0) {
                                            e = ((nm0) view).getSelectorDrawableColor();
                                            break;
                                        } else {
                                            i10 = z6Var5.g;
                                            e = ~i10;
                                            break;
                                        }
                                    case 21:
                                        if (view instanceof RecyclerView) {
                                            e = ((RecyclerView) view).getGlowColor();
                                            break;
                                        } else {
                                            i10 = z6Var5.g;
                                            e = ~i10;
                                            break;
                                        }
                                    case 22:
                                        WeakReference weakReference = z6Var5.j;
                                        Drawable drawable4 = weakReference != null ? (Drawable) weakReference.get() : null;
                                        if (drawable4 == null || view.getBackground() != drawable4) {
                                            i10 = z6Var5.g;
                                            e = ~i10;
                                            break;
                                        } else {
                                            e = z6Var5.g;
                                            break;
                                        }
                                        break;
                                    case 23:
                                        if (view instanceof RadioButton) {
                                            e = ((RadioButton) view).getColor();
                                            break;
                                        } else {
                                            i10 = z6Var5.g;
                                            e = ~i10;
                                            break;
                                        }
                                    case 24:
                                        if (view instanceof RadioButton) {
                                            e = ((RadioButton) view).getCheckedColor();
                                            break;
                                        } else {
                                            i10 = z6Var5.g;
                                            e = ~i10;
                                            break;
                                        }
                                    default:
                                        if (view instanceof EditTextBoldCursor) {
                                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                                            switch (i15) {
                                                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                                    e = editTextBoldCursor.getCursorColor();
                                                    break;
                                                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                                    e = editTextBoldCursor.getLineColor();
                                                    break;
                                                case 32:
                                                    e = editTextBoldCursor.getActiveLineColor();
                                                    break;
                                                case 33:
                                                    e = editTextBoldCursor.getErrorLineColor();
                                                    break;
                                                case 34:
                                                    e = editTextBoldCursor.getHintColor();
                                                    break;
                                                case 35:
                                                    e = editTextBoldCursor.getHeaderHintColor();
                                                    break;
                                                case 36:
                                                    e = editTextBoldCursor.getHandlesColor();
                                                    break;
                                            }
                                        }
                                        i10 = z6Var5.g;
                                        e = ~i10;
                                        break;
                                }
                        }
                        if (e != z6Var5.g || e == b14) {
                            if (e != b14) {
                                if (z6Var5.m) {
                                    T(view, z6Var5, b14);
                                } else {
                                    d7 d7Var = z6Var5.o;
                                    if (d7Var != null) {
                                        d7Var.d(b14, view);
                                    }
                                }
                            }
                            z6Var5.g = b14;
                        }
                    } else {
                        c7 c7Var = z6Var5.n;
                        if (c7Var != null) {
                            e = c7Var.e(view);
                            if (e != z6Var5.g) {
                            }
                            if (e != b14) {
                            }
                            z6Var5.g = b14;
                        } else {
                            i10 = z6Var5.g;
                            e = ~i10;
                            if (e != z6Var5.g) {
                            }
                            if (e != b14) {
                            }
                            z6Var5.g = b14;
                        }
                    }
                }
            }
        }
    }

    public static void d(k kVar, int i10, u6 u6Var) {
        m(kVar, 5, i10, u6Var);
    }

    public static void d0(ActionBarLayout actionBarLayout, boolean z10) {
        b++;
        e7 M = M(z10, 0, null);
        try {
            List allGlobalViews = AndroidUtilities.allGlobalViews();
            if (allGlobalViews == null) {
                allGlobalViews = new ArrayList();
            }
            for (int i10 = 0; i10 < allGlobalViews.size(); i10++) {
                M.b((View) allGlobalViews.get(i10));
            }
            M.b(actionBarLayout);
            M.a();
        } catch (Throwable th2) {
            M.a();
            throw th2;
        }
    }

    public static void e(t40 t40Var, int i10) {
        m(t40Var, 5, i10, null);
    }

    public static void e0(FrameLayout frameLayout, boolean z10) {
        e7 M = M(z10, 0, null);
        try {
            M.b(frameLayout);
        } finally {
            M.a();
        }
    }

    public static b7 f(int i10) {
        return new b7(i10, -1, 0.0f, 5);
    }

    public static void g(z6 z6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(z6Var.a));
        int i10 = z6Var.b;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
    }

    public static b7 h(int i10, int i11) {
        return new b7(i10, -1, i11, 1);
    }

    public static void i(int i10, View view, u6 u6Var) {
        int Q = Q(i10, -1, 0, 0.0f, u6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i10, -1, 0, 0.0f, u6Var, Q, null);
    }

    public static void j(View view, b7 b7Var, u6 u6Var) {
        int i10 = b7Var.a;
        int i11 = b7Var.b;
        int i12 = b7Var.c;
        float f7 = b7Var.d;
        int Q = Q(i10, i11, i12, f7, u6Var);
        view.setBackgroundColor(Q);
        O(view, 4, i10, i11, i12, f7, u6Var, Q, null);
    }

    public static void k(View view, Drawable drawable, b7 b7Var, b7 b7Var2, u6 u6Var) {
        a7 p10 = p(view, true);
        p10.d = drawable;
        p10.e = null;
        p10.f = null;
        if (drawable == null) {
            return;
        }
        if (b7Var != null) {
            z6 z6Var = new z6();
            p10.e = z6Var;
            z6Var.c(b7Var.a, b7Var.b, b7Var.c, b7Var.d, u6Var);
            z6Var.g = u(drawable);
        }
        if (b7Var2 != null) {
            z6 z6Var2 = new z6();
            p10.f = z6Var2;
            z6Var2.c(b7Var2.a, b7Var2.b, b7Var2.c, b7Var2.d, u6Var);
            z6Var2.g = z6Var2.b();
        }
    }

    public static void l(View view, Drawable drawable, int i10, int i11, int i12, float f7, u6 u6Var, PorterDuff.Mode mode) {
        int Q = Q(i10, i11, i12, f7, u6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        a7 p10 = p(view, true);
        if (p10.b == null) {
            p10.b = new ArrayList(2);
        }
        z6 z6Var = null;
        for (int size = p10.b.size() - 1; size >= 0; size--) {
            z6 z6Var2 = (z6) p10.b.get(size);
            Drawable drawable2 = (Drawable) z6Var2.j.get();
            if (drawable2 == drawable) {
                z6Var = z6Var2;
            } else if (drawable2 == null || (!z6Var2.k && drawable2.getColorFilter() != z6Var2.i)) {
                p10.b.remove(size);
            }
        }
        if (z6Var == null) {
            z6Var = new z6();
            z6Var.j = new WeakReference(drawable);
            p10.b.add(z6Var);
        }
        z6 z6Var3 = z6Var;
        z6Var3.c(i10, i11, i12, f7, u6Var);
        z6Var3.g = Q;
        z6Var3.i = porterDuffColorFilter;
        z6Var3.h = mode;
        z6Var3.k = drawable.getColorFilter() != porterDuffColorFilter;
    }

    public static void m(View view, int i10, int i11, u6 u6Var) {
        z6 U = U(view, i10, i11, u6Var);
        int b10 = U.b();
        T(view, U, b10);
        U.g = b10;
    }

    public static void n(View view, int i10, int i11, int i12, float f7, u6 u6Var) {
        int Q = Q(i10, i11, i12, f7, u6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(Q);
        } else if (view instanceof b6) {
            ((b6) view).setTextColor(Q);
        } else {
            ((org.telegram.ui.Components.s6) view).setTextColor(Q);
        }
        O(view, 0, i10, i11, i12, f7, u6Var, Q, null);
    }

    public static void o(TextView textView, int i10, int i11, int i12, int i13, float f7, u6 u6Var) {
        int Q = Q(i11, i12, i13, f7, u6Var);
        if (i10 == 1) {
            textView.setHintTextColor(Q);
        } else if (i10 == 2) {
            textView.setLinkTextColor(Q);
        } else if (i10 == 3) {
            textView.setHighlightColor(Q);
        }
        O(textView, i10, i11, i12, i13, f7, u6Var, Q, null);
    }

    public static a7 p(View view, boolean z10) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof a7) {
            return (a7) tag;
        }
        if (!z10) {
            return null;
        }
        a7 a7Var = new a7();
        view.setTag(R.id.theme_bind, a7Var);
        return a7Var;
    }

    public static b7 q(int i10, int i11) {
        return new b7(i10, i11, 0.0f, 4);
    }

    public static void r(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet s() {
        HashSet hashSet = new HashSet();
        e7 M = M(true, 1, hashSet);
        try {
            List allGlobalViews = AndroidUtilities.allGlobalViews();
            if (allGlobalViews == null) {
                allGlobalViews = new ArrayList();
            }
            for (int i10 = 0; i10 < allGlobalViews.size(); i10++) {
                M.b((View) allGlobalViews.get(i10));
            }
            return hashSet;
        } finally {
            M.a();
        }
    }

    public static void t(ImageView imageView, int i10, u6 u6Var, PorterDuff.Mode mode) {
        int Q = Q(i10, -1, 0, 0.0f, u6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        O(imageView, 5, i10, -1, 0, 0.0f, u6Var, Q, porterDuffColorFilter).h = mode;
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

    public static void w(EditTextBoldCursor editTextBoldCursor, int i10, u6 u6Var) {
        m(editTextBoldCursor, 30, i10, u6Var);
    }

    public static z6 x(int i10, View view) {
        a7 p10 = p(view, true);
        if (p10.c == null) {
            p10.c = new ArrayList(2);
        }
        for (int i11 = 0; i11 < p10.c.size(); i11++) {
            if (((z6) p10.c.get(i11)).l == i10) {
                return (z6) p10.c.get(i11);
            }
        }
        z6 z6Var = new z6();
        z6Var.l = i10;
        p10.c.add(z6Var);
        return z6Var;
    }

    public static void y(View view, Drawable drawable, int i10, u6 u6Var, PorterDuff.Mode mode) {
        l(view, drawable, i10, -1, 0, 0.0f, u6Var, mode);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i10, u6 u6Var) {
        m(editTextBoldCursor, 36, i10, u6Var);
    }
}

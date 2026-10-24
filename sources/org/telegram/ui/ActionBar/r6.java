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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.p40;
import org.telegram.ui.z40;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class r6 {
    public static final q6 a = new q6();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i10, g6 g6Var) {
        m(editTextBoldCursor, 36, i10, g6Var);
    }

    public static void B(EditTextBoldCursor editTextBoldCursor, int i10, g6 g6Var) {
        m(editTextBoldCursor, 35, i10, g6Var);
    }

    public static void C(EditTextBoldCursor editTextBoldCursor, int i10, g6 g6Var) {
        m(editTextBoldCursor, 34, i10, g6Var);
    }

    public static void D(View view, Drawable drawable, n6 n6Var, g6 g6Var) {
        view.setBackground(drawable);
        k(view, drawable, n6Var, null, g6Var);
    }

    public static void E(TextView textView, int i10, g6 g6Var) {
        o(textView, 3, i10, -1, 0, 0.0f, g6Var);
    }

    public static void F(TextView textView, int i10, g6 g6Var) {
        o(textView, 1, i10, -1, 0, 0.0f, g6Var);
    }

    public static void G(EditTextBoldCursor editTextBoldCursor, int i10) {
        F(editTextBoldCursor, i10, null);
    }

    public static void H(EditTextBoldCursor editTextBoldCursor, int i10, int i11, int i12, g6 g6Var) {
        editTextBoldCursor.setLineColors(k6.w0(i10, g6Var), k6.w0(i11, g6Var), k6.w0(i12, g6Var));
        V(editTextBoldCursor, 31, i10, g6Var).g = editTextBoldCursor.getLineColor();
        V(editTextBoldCursor, 32, i11, g6Var).g = editTextBoldCursor.getActiveLineColor();
        V(editTextBoldCursor, 33, i12, g6Var).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void I(TextView textView, int i10, g6 g6Var) {
        o(textView, 2, i10, -1, 0, 0.0f, g6Var);
    }

    public static void J(RecyclerView recyclerView, int i10, g6 g6Var) {
        m(recyclerView, 21, i10, g6Var);
    }

    public static void K(int i10, z40 z40Var) {
        m(z40Var, 20, i10, null);
    }

    public static void L(mm0 mm0Var, int i10, g6 g6Var) {
        m(mm0Var, 20, i10, g6Var);
    }

    public static n6 M(float f7, int i10) {
        return new n6(i10, -1, f7, 2);
    }

    public static q6 N(boolean z10, int i10, HashSet hashSet) {
        q6 q6Var = a;
        if (q6Var.e) {
            q6Var = new q6();
        }
        q6Var.e = true;
        q6Var.b = z10;
        q6Var.c = i10;
        q6Var.d = hashSet;
        q6Var.a.clear();
        return q6Var;
    }

    public static n6 O(int i10) {
        return new n6(i10, -1, 0.0f, 0);
    }

    public static l6 P(View view, int i10, int i11, int i12, int i13, float f7, g6 g6Var, int i14, PorterDuffColorFilter porterDuffColorFilter) {
        l6[] l6VarArr = p(view, true).a;
        l6 l6Var = l6VarArr[i10];
        if (l6Var == null) {
            l6Var = new l6();
            l6VarArr[i10] = l6Var;
        }
        l6 l6Var2 = l6Var;
        l6Var2.c(i11, i12, i13, f7, g6Var);
        l6Var2.g = i14;
        l6Var2.i = porterDuffColorFilter;
        return l6Var2;
    }

    public static void Q(RadioButton radioButton, int i10, int i11, g6 g6Var) {
        radioButton.b(k6.w0(i10, g6Var), k6.w0(i11, g6Var));
        m(radioButton, 23, i10, g6Var);
        m(radioButton, 24, i11, g6Var);
    }

    public static int R(int i10, int i11, int i12, float f7, g6 g6Var) {
        int w02 = k6.w0(i10, g6Var);
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? w02 : a6.b(w02) : k6.v(w02, k6.w0(i11, g6Var)) : i0.a.f(f7, w02, k6.w0(i11, g6Var)) : k6.o1(f7, w02) : i0.a.o(w02, (int) f7);
    }

    public static void S(View view, Drawable drawable, n6 n6Var, n6 n6Var2, g6 g6Var) {
        view.setBackground(drawable);
        k(view, drawable, n6Var, n6Var2, g6Var);
    }

    public static void T(View view, org.telegram.ui.Cells.y yVar, n6 n6Var, n6 n6Var2) {
        S(view, yVar, n6Var, n6Var2, null);
    }

    public static void U(View view, l6 l6Var, int i10) {
        int i11 = l6Var.l;
        switch (i11) {
            case 1:
            case 2:
                if (view instanceof k) {
                    ((k) view).B(i10, i11 == 2);
                    break;
                }
                break;
            case 3:
            case 4:
                if (view instanceof k) {
                    ((k) view).A(i10, i11 == 4);
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
                        if (view instanceof mm0) {
                            ((mm0) view).setSelectorDrawableColor(i10);
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
                        WeakReference weakReference = l6Var.j;
                        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
                        if (drawable != null && i10 != l6Var.g) {
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

    public static l6 V(View view, int i10, int i11, g6 g6Var) {
        l6 y3 = y(i10, view);
        y3.c(i11, -1, 0, 0.0f, g6Var);
        y3.n = null;
        y3.o = null;
        y3.m = true;
        return y3;
    }

    public static void W(TextView textView, int i10, g6 g6Var) {
        n(textView, i10, -1, 0, 0.0f, g6Var);
    }

    public static void X(TextView textView, n6 n6Var, g6 g6Var) {
        n(textView, n6Var.a, n6Var.b, n6Var.c, n6Var.d, g6Var);
    }

    public static void Y(n5 n5Var, int i10) {
        Z(n5Var, i10, null);
    }

    public static void Z(n5 n5Var, int i10, g6 g6Var) {
        n(n5Var, i10, -1, 0, 0.0f, g6Var);
    }

    public static void a(k kVar, int i10, g6 g6Var, boolean z10) {
        m(kVar, z10 ? 4 : 3, i10, g6Var);
    }

    public static void a0(org.telegram.ui.Components.q6 q6Var, int i10, g6 g6Var) {
        n(q6Var, i10, -1, 0, 0.0f, g6Var);
    }

    public static void b(k kVar, int i10, g6 g6Var, boolean z10) {
        m(kVar, z10 ? 2 : 1, i10, g6Var);
    }

    public static void b0(int i10, int i11, Context context, View view, g6 g6Var) {
        Drawable W0 = k6.W0(context, i10, k6.w0(i11, g6Var));
        view.setBackground(W0);
        if (W0 == null) {
            return;
        }
        l6 V = V(view, 22, i11, g6Var);
        V.j = new WeakReference(W0);
        V.g = k6.w0(i11, g6Var);
    }

    public static void c(k kVar, int i10, g6 g6Var) {
        m(kVar, 6, i10, g6Var);
    }

    public static void c0(View view, Context context, int i10, int i11) {
        b0(i10, i11, context, view, null);
    }

    public static void d(k kVar, int i10, g6 g6Var) {
        m(kVar, 5, i10, g6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d0(View view) {
        int i10;
        int f7;
        int b10;
        boolean z10;
        int b11;
        int currentTextColor;
        int currentHintTextColor;
        int defaultColor;
        int color;
        k kVar;
        d dVar;
        m6 p5 = p(view, false);
        if (p5 == null) {
            return;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            l6 l6Var = p5.a[i11];
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
                            if (kVar2.K0) {
                                color = kVar2.getBackgroundColor();
                                if (color != l6Var.g || color == b12) {
                                    if (color != b12) {
                                        view.setBackgroundColor(b12);
                                    }
                                    l6Var.g = b12;
                                }
                            }
                        }
                        if ((view instanceof y) && (kVar = ((y) view).b) != null && kVar.K0 && (dVar = kVar.F) != null && dVar == view) {
                            color = dVar == view ? kVar.w : 0;
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
                    boolean z11 = view instanceof n5;
                    if (z11 || (view instanceof org.telegram.ui.Components.q6)) {
                        int textColor = z11 ? ((n5) view).getTextColor() : ((org.telegram.ui.Components.q6) view).getTextColor();
                        int i12 = textColor & 16777215;
                        if (i12 == (l6Var.g & 16777215) || i12 == (b12 & 16777215)) {
                            if (textColor != b12) {
                                if (z11) {
                                    ((n5) view).setTextColor(b12);
                                } else {
                                    ((org.telegram.ui.Components.q6) view).setTextColor(b12);
                                }
                            }
                            l6Var.g = b12;
                        }
                    }
                }
            }
        }
        if (p5.b != null) {
            boolean z12 = false;
            for (int i13 = 0; i13 < p5.b.size(); i13++) {
                l6 l6Var2 = (l6) p5.b.get(i13);
                Drawable drawable = (Drawable) l6Var2.j.get();
                if (drawable == null || l6Var2.a() || (!(l6Var2.k || drawable.getColorFilter() == l6Var2.i) || (b11 = l6Var2.b()) == l6Var2.g)) {
                    z10 = false;
                } else {
                    PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(b11, l6Var2.h);
                    drawable.setColorFilter(porterDuffColorFilter2);
                    l6Var2.i = porterDuffColorFilter2;
                    l6Var2.g = b11;
                    z10 = true;
                }
                z12 |= z10;
            }
            if (z12) {
                view.invalidate();
            }
        }
        if (p5.d != null && view.getBackground() == p5.d) {
            l6 l6Var3 = p5.e;
            if (l6Var3 != null && !l6Var3.a()) {
                int b13 = l6Var3.b();
                int v = v(p5.d);
                if (v == l6Var3.g || v == b13) {
                    if (v != b13) {
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
                    l6Var3.g = b13;
                }
            }
            l6 l6Var4 = p5.f;
            if (l6Var4 != null && !l6Var4.a() && (p5.d instanceof RippleDrawable) && (b10 = l6Var4.b()) != l6Var4.g) {
                ((RippleDrawable) p5.d).setColor(ColorStateList.valueOf(b10));
                l6Var4.g = b10;
            }
        }
        if (p5.c != null) {
            for (int i14 = 0; i14 < p5.c.size(); i14++) {
                l6 l6Var5 = (l6) p5.c.get(i14);
                if (!l6Var5.a()) {
                    int b14 = l6Var5.b();
                    if (l6Var5.m) {
                        int i15 = l6Var5.l;
                        switch (i15) {
                            case 1:
                                if (view instanceof k) {
                                    f7 = ((k) view).r0;
                                    break;
                                } else {
                                    i10 = l6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            case 2:
                                if (view instanceof k) {
                                    f7 = ((k) view).s0;
                                    break;
                                } else {
                                    i10 = l6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            case 3:
                                if (view instanceof k) {
                                    f7 = ((k) view).p0;
                                    break;
                                } else {
                                    i10 = l6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            case 4:
                                if (view instanceof k) {
                                    f7 = ((k) view).q0;
                                    break;
                                } else {
                                    i10 = l6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            case 5:
                                if (view instanceof k) {
                                    f7 = ((k) view).getTitleColorToSet();
                                    break;
                                } else {
                                    i10 = l6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            case 6:
                                if (view instanceof k) {
                                    f7 = ((k) view).getSubtitleColorInternal();
                                    break;
                                } else {
                                    i10 = l6Var5.g;
                                    f7 = ~i10;
                                    break;
                                }
                            default:
                                switch (i15) {
                                    case 20:
                                        if (view instanceof mm0) {
                                            f7 = ((mm0) view).getSelectorDrawableColor();
                                            break;
                                        } else {
                                            i10 = l6Var5.g;
                                            f7 = ~i10;
                                            break;
                                        }
                                    case 21:
                                        if (view instanceof RecyclerView) {
                                            f7 = ((RecyclerView) view).getGlowColor();
                                            break;
                                        } else {
                                            i10 = l6Var5.g;
                                            f7 = ~i10;
                                            break;
                                        }
                                    case 22:
                                        WeakReference weakReference = l6Var5.j;
                                        Drawable drawable4 = weakReference != null ? (Drawable) weakReference.get() : null;
                                        if (drawable4 == null || view.getBackground() != drawable4) {
                                            i10 = l6Var5.g;
                                            f7 = ~i10;
                                            break;
                                        } else {
                                            f7 = l6Var5.g;
                                            break;
                                        }
                                        break;
                                    case 23:
                                        if (view instanceof RadioButton) {
                                            f7 = ((RadioButton) view).getColor();
                                            break;
                                        } else {
                                            i10 = l6Var5.g;
                                            f7 = ~i10;
                                            break;
                                        }
                                    case 24:
                                        if (view instanceof RadioButton) {
                                            f7 = ((RadioButton) view).getCheckedColor();
                                            break;
                                        } else {
                                            i10 = l6Var5.g;
                                            f7 = ~i10;
                                            break;
                                        }
                                    default:
                                        if (view instanceof EditTextBoldCursor) {
                                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                                            switch (i15) {
                                                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                                    f7 = editTextBoldCursor.getCursorColor();
                                                    break;
                                                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
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
                                        i10 = l6Var5.g;
                                        f7 = ~i10;
                                        break;
                                }
                        }
                        if (f7 != l6Var5.g || f7 == b14) {
                            if (f7 != b14) {
                                if (l6Var5.m) {
                                    U(view, l6Var5, b14);
                                } else {
                                    p6 p6Var = l6Var5.o;
                                    if (p6Var != null) {
                                        p6Var.d(b14, view);
                                    }
                                }
                            }
                            l6Var5.g = b14;
                        }
                    } else {
                        o6 o6Var = l6Var5.n;
                        if (o6Var != null) {
                            f7 = o6Var.f(view);
                            if (f7 != l6Var5.g) {
                            }
                            if (f7 != b14) {
                            }
                            l6Var5.g = b14;
                        } else {
                            i10 = l6Var5.g;
                            f7 = ~i10;
                            if (f7 != l6Var5.g) {
                            }
                            if (f7 != b14) {
                            }
                            l6Var5.g = b14;
                        }
                    }
                }
            }
        }
    }

    public static void e(p40 p40Var, int i10) {
        m(p40Var, 5, i10, null);
    }

    public static void e0(ActionBarLayout actionBarLayout, boolean z10) {
        b++;
        q6 N = N(z10, 0, null);
        try {
            List allGlobalViews = AndroidUtilities.allGlobalViews();
            if (allGlobalViews == null) {
                allGlobalViews = new ArrayList();
            }
            for (int i10 = 0; i10 < allGlobalViews.size(); i10++) {
                N.b((View) allGlobalViews.get(i10));
            }
            N.b(actionBarLayout);
            N.a();
        } catch (Throwable th2) {
            N.a();
            throw th2;
        }
    }

    public static n6 f(int i10) {
        return new n6(i10, -1, 0.0f, 5);
    }

    public static void g(l6 l6Var, HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6Var.a));
        int i10 = l6Var.b;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
    }

    public static n6 h(int i10, int i11) {
        return new n6(i10, -1, i11, 1);
    }

    public static void i(int i10, View view, g6 g6Var) {
        int R = R(i10, -1, 0, 0.0f, g6Var);
        view.setBackgroundColor(R);
        P(view, 4, i10, -1, 0, 0.0f, g6Var, R, null);
    }

    public static void j(View view, n6 n6Var, g6 g6Var) {
        int i10 = n6Var.a;
        int i11 = n6Var.b;
        int i12 = n6Var.c;
        float f7 = n6Var.d;
        int R = R(i10, i11, i12, f7, g6Var);
        view.setBackgroundColor(R);
        P(view, 4, i10, i11, i12, f7, g6Var, R, null);
    }

    public static void k(View view, Drawable drawable, n6 n6Var, n6 n6Var2, g6 g6Var) {
        m6 p5 = p(view, true);
        p5.d = drawable;
        p5.e = null;
        p5.f = null;
        if (drawable == null) {
            return;
        }
        if (n6Var != null) {
            l6 l6Var = new l6();
            p5.e = l6Var;
            l6Var.c(n6Var.a, n6Var.b, n6Var.c, n6Var.d, g6Var);
            l6Var.g = v(drawable);
        }
        if (n6Var2 != null) {
            l6 l6Var2 = new l6();
            p5.f = l6Var2;
            l6Var2.c(n6Var2.a, n6Var2.b, n6Var2.c, n6Var2.d, g6Var);
            l6Var2.g = l6Var2.b();
        }
    }

    public static void l(View view, Drawable drawable, int i10, int i11, int i12, float f7, g6 g6Var, PorterDuff.Mode mode) {
        int R = R(i10, i11, i12, f7, g6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(R, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        m6 p5 = p(view, true);
        if (p5.b == null) {
            p5.b = new ArrayList(2);
        }
        l6 l6Var = null;
        for (int size = p5.b.size() - 1; size >= 0; size--) {
            l6 l6Var2 = (l6) p5.b.get(size);
            Drawable drawable2 = (Drawable) l6Var2.j.get();
            if (drawable2 == drawable) {
                l6Var = l6Var2;
            } else if (drawable2 == null || (!l6Var2.k && drawable2.getColorFilter() != l6Var2.i)) {
                p5.b.remove(size);
            }
        }
        if (l6Var == null) {
            l6Var = new l6();
            l6Var.j = new WeakReference(drawable);
            p5.b.add(l6Var);
        }
        l6 l6Var3 = l6Var;
        l6Var3.c(i10, i11, i12, f7, g6Var);
        l6Var3.g = R;
        l6Var3.i = porterDuffColorFilter;
        l6Var3.h = mode;
        l6Var3.k = drawable.getColorFilter() != porterDuffColorFilter;
    }

    public static void m(View view, int i10, int i11, g6 g6Var) {
        l6 V = V(view, i10, i11, g6Var);
        int b10 = V.b();
        U(view, V, b10);
        V.g = b10;
    }

    public static void n(View view, int i10, int i11, int i12, float f7, g6 g6Var) {
        int R = R(i10, i11, i12, f7, g6Var);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(R);
        } else if (view instanceof n5) {
            ((n5) view).setTextColor(R);
        } else {
            ((org.telegram.ui.Components.q6) view).setTextColor(R);
        }
        P(view, 0, i10, i11, i12, f7, g6Var, R, null);
    }

    public static void o(TextView textView, int i10, int i11, int i12, int i13, float f7, g6 g6Var) {
        int R = R(i11, i12, i13, f7, g6Var);
        if (i10 == 1) {
            textView.setHintTextColor(R);
        } else if (i10 == 2) {
            textView.setLinkTextColor(R);
        } else if (i10 == 3) {
            textView.setHighlightColor(R);
        }
        P(textView, i10, i11, i12, i13, f7, g6Var, R, null);
    }

    public static m6 p(View view, boolean z10) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof m6) {
            return (m6) tag;
        }
        if (!z10) {
            return null;
        }
        m6 m6Var = new m6();
        view.setTag(R.id.theme_bind, m6Var);
        return m6Var;
    }

    public static n6 q(int i10, int i11) {
        return new n6(i10, i11, 0.0f, 4);
    }

    public static void r(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet s() {
        HashSet hashSet = new HashSet();
        q6 N = N(true, 1, hashSet);
        try {
            List allGlobalViews = AndroidUtilities.allGlobalViews();
            if (allGlobalViews == null) {
                allGlobalViews = new ArrayList();
            }
            for (int i10 = 0; i10 < allGlobalViews.size(); i10++) {
                N.b((View) allGlobalViews.get(i10));
            }
            return hashSet;
        } finally {
            N.a();
        }
    }

    public static void t(ImageView imageView, int i10, g6 g6Var, PorterDuff.Mode mode) {
        int R = R(i10, -1, 0, 0.0f, g6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(R, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        P(imageView, 5, i10, -1, 0, 0.0f, g6Var, R, porterDuffColorFilter).h = mode;
    }

    public static void u(ImageView imageView, n6 n6Var, g6 g6Var, PorterDuff.Mode mode) {
        int i10 = n6Var.a;
        int i11 = n6Var.b;
        int i12 = n6Var.c;
        float f7 = n6Var.d;
        int R = R(i10, i11, i12, f7, g6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(R, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        P(imageView, 5, i10, i11, i12, f7, g6Var, R, porterDuffColorFilter).h = mode;
    }

    public static int v(Drawable drawable) {
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

    public static void w(EditTextBoldCursor editTextBoldCursor, int i10) {
        x(editTextBoldCursor, i10, null);
    }

    public static void x(EditTextBoldCursor editTextBoldCursor, int i10, g6 g6Var) {
        m(editTextBoldCursor, 30, i10, g6Var);
    }

    public static l6 y(int i10, View view) {
        m6 p5 = p(view, true);
        if (p5.c == null) {
            p5.c = new ArrayList(2);
        }
        for (int i11 = 0; i11 < p5.c.size(); i11++) {
            if (((l6) p5.c.get(i11)).l == i10) {
                return (l6) p5.c.get(i11);
            }
        }
        l6 l6Var = new l6();
        l6Var.l = i10;
        p5.c.add(l6Var);
        return l6Var;
    }

    public static void z(View view, Drawable drawable, int i10, g6 g6Var, PorterDuff.Mode mode) {
        l(view, drawable, i10, -1, 0, 0.0f, g6Var, mode);
    }
}

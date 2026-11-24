// default package

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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class anb {
    public static final zmb a = new zmb();
    public static int b = 1;
    public static long c = -1;
    public static float d;

    public static void A(EditTextBoldCursor editTextBoldCursor, int i, ylb ylbVar) {
        l(editTextBoldCursor, 34, i, ylbVar);
    }

    public static void B(View view, Drawable drawable, wmb wmbVar, ylb ylbVar) {
        view.setBackground(drawable);
        j(view, drawable, wmbVar, null, ylbVar);
    }

    public static void C(TextView textView, int i, ylb ylbVar) {
        n(textView, 3, i, -1, 0, 0.0f, ylbVar);
    }

    public static void D(TextView textView, int i, ylb ylbVar) {
        n(textView, 1, i, -1, 0, 0.0f, ylbVar);
    }

    public static void E(EditTextBoldCursor editTextBoldCursor, int i) {
        D(editTextBoldCursor, i, null);
    }

    public static void F(EditTextBoldCursor editTextBoldCursor, int i, int i2, int i3, ylb ylbVar) {
        editTextBoldCursor.u(cmb.v0(i, ylbVar), cmb.v0(i2, ylbVar), cmb.v0(i3, ylbVar));
        T(editTextBoldCursor, 31, i, ylbVar).g = editTextBoldCursor.getLineColor();
        T(editTextBoldCursor, 32, i2, ylbVar).g = editTextBoldCursor.getActiveLineColor();
        T(editTextBoldCursor, 33, i3, ylbVar).g = editTextBoldCursor.getErrorLineColor();
    }

    public static void G(TextView textView, int i, ylb ylbVar) {
        n(textView, 2, i, -1, 0, 0.0f, ylbVar);
    }

    public static void H(RecyclerView recyclerView, int i, ylb ylbVar) {
        l(recyclerView, 21, i, ylbVar);
    }

    public static void I(int i, p85 p85Var) {
        l(p85Var, 20, i, null);
    }

    public static void J(r59 r59Var, int i, ylb ylbVar) {
        l(r59Var, 20, i, ylbVar);
    }

    public static wmb K(float f, int i) {
        return new wmb(i, -1, f, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zmb L(boolean z, int i, HashSet hashSet) {
        zmb zmbVar = a;
        if (zmbVar.e) {
            zmbVar = new zmb();
        }
        zmbVar.e = true;
        zmbVar.b = z;
        zmbVar.c = i;
        zmbVar.d = hashSet;
        zmbVar.a.clear();
        return zmbVar;
    }

    public static wmb M(int i) {
        return new wmb(i, -1, 0.0f, 0);
    }

    public static umb N(View view, int i, int i2, int i3, int i4, float f, ylb ylbVar, int i5, PorterDuffColorFilter porterDuffColorFilter) {
        umb[] umbVarArr = o(view, true).a;
        umb umbVar = umbVarArr[i];
        if (umbVar == null) {
            umbVar = new umb();
            umbVarArr[i] = umbVar;
        }
        umb umbVar2 = umbVar;
        umbVar2.c(i2, i3, i4, f, ylbVar);
        umbVar2.g = i5;
        umbVar2.i = porterDuffColorFilter;
        return umbVar2;
    }

    public static void O(RadioButton radioButton, int i, int i2, ylb ylbVar) {
        radioButton.b(cmb.v0(i, ylbVar), cmb.v0(i2, ylbVar));
        l(radioButton, 23, i, ylbVar);
        l(radioButton, 24, i2, ylbVar);
    }

    public static int P(int i, int i2, int i3, float f, ylb ylbVar) {
        int v0 = cmb.v0(i, ylbVar);
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? v0 : ulb.b(v0) : cmb.v(v0, cmb.v0(i2, ylbVar)) : on2.f(f, v0, cmb.v0(i2, ylbVar)) : cmb.p1(f, v0) : on2.p(v0, (int) f);
    }

    public static void Q(View view, fg0 fg0Var, wmb wmbVar, wmb wmbVar2) {
        R(view, fg0Var, wmbVar, wmbVar2, null);
    }

    public static void R(View view, Drawable drawable, wmb wmbVar, wmb wmbVar2, ylb ylbVar) {
        view.setBackground(drawable);
        j(view, drawable, wmbVar, wmbVar2, ylbVar);
    }

    public static void S(View view, umb umbVar, int i) {
        byte b2 = umbVar.l;
        switch (b2) {
            case 1:
            case 2:
                if (view instanceof a) {
                    ((a) view).H(i, b2 == 2);
                    break;
                }
                break;
            case 3:
            case 4:
                if (view instanceof a) {
                    ((a) view).G(i, b2 == 4);
                    break;
                }
                break;
            case 5:
                if (view instanceof a) {
                    ((a) view).setTitleColor(i);
                    break;
                }
                break;
            case 6:
                if (view instanceof a) {
                    ((a) view).setSubtitleColor(i);
                    break;
                }
                break;
            default:
                switch (b2) {
                    case 20:
                        if (view instanceof r59) {
                            ((r59) view).setSelectorDrawableColor(i);
                            break;
                        }
                        break;
                    case 21:
                        if (view instanceof RecyclerView) {
                            ((RecyclerView) view).setGlowColor(i);
                            break;
                        }
                        break;
                    case 22:
                        WeakReference weakReference = umbVar.j;
                        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
                        if (drawable != null && i != umbVar.g) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                            view.invalidate();
                            break;
                        }
                        break;
                    case 23:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setBackgroundColor(i);
                            break;
                        }
                        break;
                    case 24:
                        if (view instanceof RadioButton) {
                            ((RadioButton) view).setCheckedColor(i);
                            break;
                        }
                        break;
                    default:
                        if (view instanceof EditTextBoldCursor) {
                            EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                            switch (b2) {
                                case nm7.S /* 30 */:
                                    editTextBoldCursor.setCursorColor(i);
                                    break;
                                case 31:
                                    editTextBoldCursor.setLineColor(i);
                                    break;
                                case 32:
                                    editTextBoldCursor.setActiveLineColor(i);
                                    break;
                                case 33:
                                    editTextBoldCursor.setErrorLineColor(i);
                                    break;
                                case 34:
                                    editTextBoldCursor.setHintColor(i);
                                    break;
                                case 35:
                                    editTextBoldCursor.setHeaderHintColor(i);
                                    break;
                                case 36:
                                    editTextBoldCursor.setHandlesColor(i);
                                    break;
                            }
                        }
                        break;
                }
        }
    }

    public static umb T(View view, int i, int i2, ylb ylbVar) {
        umb w = w(i, view);
        w.c(i2, -1, 0, 0.0f, ylbVar);
        w.n = null;
        w.o = null;
        w.m = true;
        return w;
    }

    public static void U(io ioVar, int i, ylb ylbVar) {
        m(ioVar, i, -1, 0, 0.0f, ylbVar);
    }

    public static void V(lka lkaVar, int i) {
        W(lkaVar, i, null);
    }

    public static void W(lka lkaVar, int i, ylb ylbVar) {
        m(lkaVar, i, -1, 0, 0.0f, ylbVar);
    }

    public static void X(TextView textView, int i, ylb ylbVar) {
        m(textView, i, -1, 0, 0.0f, ylbVar);
    }

    public static void Y(TextView textView, wmb wmbVar, ylb ylbVar) {
        m(textView, wmbVar.a, wmbVar.b, wmbVar.c, wmbVar.d, ylbVar);
    }

    public static void Z(View view, Context context, int i, int i2) {
        Drawable V0 = cmb.V0(context, i, cmb.v0(i2, null));
        view.setBackground(V0);
        if (V0 == null) {
            return;
        }
        umb T = T(view, 22, i2, null);
        T.j = new WeakReference(V0);
        T.g = cmb.w0(null, i2, false);
    }

    public static void a(a aVar, int i, ylb ylbVar, boolean z) {
        l(aVar, z ? 4 : 3, i, ylbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(View view) {
        int i;
        int g;
        int b2;
        boolean z;
        int b3;
        int textColor;
        int currentTextColor;
        int currentHintTextColor;
        int defaultColor;
        int color;
        a aVar;
        t5 t5Var;
        vmb o = o(view, false);
        if (o != null) {
            for (int i2 = 0; i2 < 6; i2++) {
                umb umbVar = o.a[i2];
                if (umbVar != null && !umbVar.a()) {
                    int b4 = umbVar.b();
                    if (i2 != 0) {
                        if (i2 == 1) {
                            TextView textView = (TextView) view;
                            if (textView.getHintTextColors() != null && !textView.getHintTextColors().isStateful() && ((currentHintTextColor = textView.getCurrentHintTextColor()) == umbVar.g || currentHintTextColor == b4)) {
                                if (currentHintTextColor != b4) {
                                    textView.setHintTextColor(b4);
                                }
                                umbVar.g = b4;
                            }
                        } else if (i2 == 2) {
                            TextView textView2 = (TextView) view;
                            if (textView2.getLinkTextColors() != null && !textView2.getLinkTextColors().isStateful() && ((defaultColor = textView2.getLinkTextColors().getDefaultColor()) == umbVar.g || defaultColor == b4)) {
                                if (defaultColor != b4) {
                                    textView2.setLinkTextColor(b4);
                                }
                                umbVar.g = b4;
                            }
                        } else if (i2 == 3) {
                            TextView textView3 = (TextView) view;
                            int highlightColor = textView3.getHighlightColor();
                            if (highlightColor == umbVar.g || highlightColor == b4) {
                                if (highlightColor != b4) {
                                    textView3.setHighlightColor(b4);
                                }
                                umbVar.g = b4;
                            }
                        } else if (i2 != 4) {
                            if (i2 == 5) {
                                ImageView imageView = (ImageView) view;
                                if (imageView.getColorFilter() == umbVar.i) {
                                    if (b4 != umbVar.g) {
                                        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b4, umbVar.h);
                                        imageView.setColorFilter(porterDuffColorFilter);
                                        umbVar.i = porterDuffColorFilter;
                                    }
                                }
                            }
                            umbVar.g = b4;
                        } else {
                            if (view instanceof a) {
                                a aVar2 = (a) view;
                                if (aVar2.M0) {
                                    color = aVar2.getBackgroundColor();
                                    if (color != umbVar.g || color == b4) {
                                        if (color != b4) {
                                            view.setBackgroundColor(b4);
                                        }
                                        umbVar.g = b4;
                                    }
                                }
                            }
                            if ((view instanceof r6) && (aVar = ((r6) view).b) != null && aVar.M0 && (t5Var = aVar.G) != null && t5Var == view) {
                                color = t5Var == view ? aVar.x : 0;
                            } else {
                                Drawable background = view.getBackground();
                                if (background instanceof ColorDrawable) {
                                    color = ((ColorDrawable) background).getColor();
                                }
                            }
                            if (color != umbVar.g) {
                            }
                            if (color != b4) {
                            }
                            umbVar.g = b4;
                        }
                    } else if (view instanceof TextView) {
                        TextView textView4 = (TextView) view;
                        if (!textView4.getTextColors().isStateful() && ((currentTextColor = textView4.getCurrentTextColor()) == umbVar.g || currentTextColor == b4)) {
                            if (currentTextColor != b4) {
                                textView4.setTextColor(b4);
                            }
                            umbVar.g = b4;
                        }
                    } else {
                        boolean z2 = view instanceof lka;
                        if (z2) {
                            textColor = ((lka) view).getTextColor();
                        } else if (view instanceof io) {
                            textColor = ((io) view).getTextColor();
                        }
                        int i3 = textColor & 16777215;
                        if (i3 == (umbVar.g & 16777215) || i3 == (16777215 & b4)) {
                            if (textColor != b4) {
                                if (z2) {
                                    ((lka) view).setTextColor(b4);
                                } else {
                                    ((io) view).setTextColor(b4);
                                }
                            }
                            umbVar.g = b4;
                        }
                    }
                }
            }
            if (o.b != null) {
                boolean z3 = false;
                for (int i4 = 0; i4 < o.b.size(); i4++) {
                    umb umbVar2 = (umb) o.b.get(i4);
                    Drawable drawable = (Drawable) umbVar2.j.get();
                    if (drawable == null || umbVar2.a() || (!(umbVar2.k || drawable.getColorFilter() == umbVar2.i) || (b3 = umbVar2.b()) == umbVar2.g)) {
                        z = false;
                    } else {
                        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(b3, umbVar2.h);
                        drawable.setColorFilter(porterDuffColorFilter2);
                        umbVar2.i = porterDuffColorFilter2;
                        umbVar2.g = b3;
                        z = true;
                    }
                    z3 |= z;
                }
                if (z3) {
                    view.invalidate();
                }
            }
            if (o.d != null && view.getBackground() == o.d) {
                umb umbVar3 = o.e;
                if (umbVar3 != null && !umbVar3.a()) {
                    int b5 = umbVar3.b();
                    int t = t(o.d);
                    if (t == umbVar3.g || t == b5) {
                        if (t != b5) {
                            Drawable drawable2 = o.d;
                            Drawable drawable3 = drawable2 instanceof InsetDrawable ? ((InsetDrawable) drawable2).getDrawable() : drawable2;
                            if (drawable3 instanceof RippleDrawable) {
                                RippleDrawable rippleDrawable = (RippleDrawable) drawable3;
                                drawable3 = (rippleDrawable.getNumberOfLayers() <= 0 || rippleDrawable.getId(0) == 16908334) ? null : rippleDrawable.getDrawable(0);
                            }
                            if (drawable3 instanceof ShapeDrawable) {
                                ((ShapeDrawable) drawable3).getPaint().setColor(b5);
                                drawable2.invalidateSelf();
                            } else if (drawable3 instanceof ColorDrawable) {
                                ((ColorDrawable) drawable3).setColor(b5);
                            }
                        }
                        umbVar3.g = b5;
                    }
                }
                umb umbVar4 = o.f;
                if (umbVar4 != null && !umbVar4.a() && (o.d instanceof RippleDrawable) && (b2 = umbVar4.b()) != umbVar4.g) {
                    ((RippleDrawable) o.d).setColor(ColorStateList.valueOf(b2));
                    umbVar4.g = b2;
                }
            }
            if (o.c != null) {
                for (int i5 = 0; i5 < o.c.size(); i5++) {
                    umb umbVar5 = (umb) o.c.get(i5);
                    if (!umbVar5.a()) {
                        int b6 = umbVar5.b();
                        if (umbVar5.m) {
                            byte b7 = umbVar5.l;
                            switch (b7) {
                                case 1:
                                    if (view instanceof a) {
                                        g = ((a) view).s0;
                                        break;
                                    } else {
                                        i = umbVar5.g;
                                        g = ~i;
                                        break;
                                    }
                                case 2:
                                    if (view instanceof a) {
                                        g = ((a) view).t0;
                                        break;
                                    } else {
                                        i = umbVar5.g;
                                        g = ~i;
                                        break;
                                    }
                                case 3:
                                    if (view instanceof a) {
                                        g = ((a) view).q0;
                                        break;
                                    } else {
                                        i = umbVar5.g;
                                        g = ~i;
                                        break;
                                    }
                                case 4:
                                    if (view instanceof a) {
                                        g = ((a) view).r0;
                                        break;
                                    } else {
                                        i = umbVar5.g;
                                        g = ~i;
                                        break;
                                    }
                                case 5:
                                    if (view instanceof a) {
                                        g = ((a) view).getTitleColorToSet();
                                        break;
                                    } else {
                                        i = umbVar5.g;
                                        g = ~i;
                                        break;
                                    }
                                case 6:
                                    if (view instanceof a) {
                                        g = ((a) view).getSubtitleColorInternal();
                                        break;
                                    } else {
                                        i = umbVar5.g;
                                        g = ~i;
                                        break;
                                    }
                                default:
                                    switch (b7) {
                                        case 20:
                                            if (view instanceof r59) {
                                                g = ((r59) view).getSelectorDrawableColor();
                                                break;
                                            } else {
                                                i = umbVar5.g;
                                                g = ~i;
                                                break;
                                            }
                                        case 21:
                                            if (view instanceof RecyclerView) {
                                                g = ((RecyclerView) view).getGlowColor();
                                                break;
                                            } else {
                                                i = umbVar5.g;
                                                g = ~i;
                                                break;
                                            }
                                        case 22:
                                            WeakReference weakReference = umbVar5.j;
                                            Drawable drawable4 = weakReference != null ? (Drawable) weakReference.get() : null;
                                            if (drawable4 == null || view.getBackground() != drawable4) {
                                                i = umbVar5.g;
                                                g = ~i;
                                                break;
                                            } else {
                                                g = umbVar5.g;
                                                break;
                                            }
                                            break;
                                        case 23:
                                            if (view instanceof RadioButton) {
                                                g = ((RadioButton) view).getColor();
                                                break;
                                            } else {
                                                i = umbVar5.g;
                                                g = ~i;
                                                break;
                                            }
                                        case 24:
                                            if (view instanceof RadioButton) {
                                                g = ((RadioButton) view).getCheckedColor();
                                                break;
                                            } else {
                                                i = umbVar5.g;
                                                g = ~i;
                                                break;
                                            }
                                        default:
                                            if (view instanceof EditTextBoldCursor) {
                                                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                                                switch (b7) {
                                                    case nm7.S /* 30 */:
                                                        g = editTextBoldCursor.getCursorColor();
                                                        break;
                                                    case 31:
                                                        g = editTextBoldCursor.getLineColor();
                                                        break;
                                                    case 32:
                                                        g = editTextBoldCursor.getActiveLineColor();
                                                        break;
                                                    case 33:
                                                        g = editTextBoldCursor.getErrorLineColor();
                                                        break;
                                                    case 34:
                                                        g = editTextBoldCursor.getHintColor();
                                                        break;
                                                    case 35:
                                                        g = editTextBoldCursor.getHeaderHintColor();
                                                        break;
                                                    case 36:
                                                        g = editTextBoldCursor.getHandlesColor();
                                                        break;
                                                }
                                            }
                                            i = umbVar5.g;
                                            g = ~i;
                                            break;
                                    }
                            }
                            if (g != umbVar5.g || g == b6) {
                                if (g != b6) {
                                    if (umbVar5.m) {
                                        S(view, umbVar5, b6);
                                    } else {
                                        ymb ymbVar = umbVar5.o;
                                        if (ymbVar != null) {
                                            ymbVar.e(b6, view);
                                        }
                                    }
                                }
                                umbVar5.g = b6;
                            }
                        } else {
                            xmb xmbVar = umbVar5.n;
                            if (xmbVar != null) {
                                g = xmbVar.g(view);
                                if (g != umbVar5.g) {
                                }
                                if (g != b6) {
                                }
                                umbVar5.g = b6;
                            } else {
                                i = umbVar5.g;
                                g = ~i;
                                if (g != umbVar5.g) {
                                }
                                if (g != b6) {
                                }
                                umbVar5.g = b6;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void b(a aVar, int i, ylb ylbVar, boolean z) {
        l(aVar, z ? 2 : 1, i, ylbVar);
    }

    public static void b0(ActionBarLayout actionBarLayout, boolean z) {
        b++;
        zmb L = L(z, 0, null);
        try {
            List j = gm.j();
            if (j == null) {
                j = new ArrayList();
            }
            for (int i = 0; i < j.size(); i++) {
                L.b((View) j.get(i));
            }
            L.b(actionBarLayout);
        } finally {
            L.a();
        }
    }

    public static void c(a85 a85Var, int i) {
        l(a85Var, 5, i, null);
    }

    public static void c0(FrameLayout frameLayout, boolean z) {
        zmb L = L(z, 0, null);
        try {
            L.b(frameLayout);
        } finally {
            L.a();
        }
    }

    public static void d(a aVar, int i, ylb ylbVar) {
        l(aVar, 5, i, ylbVar);
    }

    public static wmb e(int i) {
        return new wmb(i, -1, 0.0f, 5);
    }

    public static void f(umb umbVar, HashSet hashSet) {
        hashSet.add(Integer.valueOf(umbVar.a));
        int i = umbVar.b;
        if (i >= 0) {
            hashSet.add(Integer.valueOf(i));
        }
    }

    public static wmb g(int i, int i2) {
        return new wmb(i, -1, i2, 1);
    }

    public static void h(int i, ylb ylbVar, View view) {
        int P = P(i, -1, 0, 0.0f, ylbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, -1, 0, 0.0f, ylbVar, P, null);
    }

    public static void i(View view, wmb wmbVar, ylb ylbVar) {
        int i = wmbVar.a;
        int i2 = wmbVar.b;
        byte b2 = wmbVar.c;
        float f = wmbVar.d;
        int P = P(i, i2, b2, f, ylbVar);
        view.setBackgroundColor(P);
        N(view, 4, i, i2, b2, f, ylbVar, P, null);
    }

    public static void j(View view, Drawable drawable, wmb wmbVar, wmb wmbVar2, ylb ylbVar) {
        vmb o = o(view, true);
        o.d = drawable;
        o.e = null;
        o.f = null;
        if (drawable != null) {
            if (wmbVar != null) {
                umb umbVar = new umb();
                o.e = umbVar;
                umbVar.c(wmbVar.a, wmbVar.b, wmbVar.c, wmbVar.d, ylbVar);
                umbVar.g = t(drawable);
            }
            if (wmbVar2 != null) {
                umb umbVar2 = new umb();
                o.f = umbVar2;
                umbVar2.c(wmbVar2.a, wmbVar2.b, wmbVar2.c, wmbVar2.d, ylbVar);
                umbVar2.g = umbVar2.b();
            }
        }
    }

    public static void k(View view, Drawable drawable, int i, int i2, int i3, float f, ylb ylbVar, PorterDuff.Mode mode) {
        int P = P(i, i2, i3, f, ylbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        drawable.setColorFilter(porterDuffColorFilter);
        if (view == null) {
            return;
        }
        vmb o = o(view, true);
        ArrayList arrayList = o.b;
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            o.b = arrayList;
        }
        umb umbVar = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            umb umbVar2 = (umb) o.b.get(size);
            Drawable drawable2 = (Drawable) umbVar2.j.get();
            if (drawable2 == drawable) {
                umbVar = umbVar2;
            } else if (drawable2 == null || (!umbVar2.k && drawable2.getColorFilter() != umbVar2.i)) {
                o.b.remove(size);
            }
        }
        if (umbVar == null) {
            umbVar = new umb();
            umbVar.j = new WeakReference(drawable);
            o.b.add(umbVar);
        }
        umb umbVar3 = umbVar;
        umbVar3.c(i, i2, i3, f, ylbVar);
        umbVar3.g = P;
        umbVar3.i = porterDuffColorFilter;
        umbVar3.h = mode;
        umbVar3.k = drawable.getColorFilter() != porterDuffColorFilter;
    }

    public static void l(View view, int i, int i2, ylb ylbVar) {
        umb T = T(view, i, i2, ylbVar);
        int b2 = T.b();
        S(view, T, b2);
        T.g = b2;
    }

    public static void m(View view, int i, int i2, int i3, float f, ylb ylbVar) {
        int P = P(i, i2, i3, f, ylbVar);
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(P);
        } else if (view instanceof lka) {
            ((lka) view).setTextColor(P);
        } else {
            ((io) view).setTextColor(P);
        }
        N(view, 0, i, i2, i3, f, ylbVar, P, null);
    }

    public static void n(TextView textView, int i, int i2, int i3, int i4, float f, ylb ylbVar) {
        int P = P(i2, i3, i4, f, ylbVar);
        if (i == 1) {
            textView.setHintTextColor(P);
        } else if (i == 2) {
            textView.setLinkTextColor(P);
        } else if (i == 3) {
            textView.setHighlightColor(P);
        }
        N(textView, i, i2, i3, i4, f, ylbVar, P, null);
    }

    public static vmb o(View view, boolean z) {
        Object tag = view.getTag(R.id.theme_bind);
        if (tag instanceof vmb) {
            return (vmb) tag;
        }
        if (!z) {
            return null;
        }
        vmb vmbVar = new vmb();
        view.setTag(R.id.theme_bind, vmbVar);
        return vmbVar;
    }

    public static wmb p(int i, int i2) {
        return new wmb(i, i2, 0.0f, 4);
    }

    public static void q(View view) {
        if (view != null) {
            view.setTag(R.id.theme_bind, null);
        }
    }

    public static HashSet r() {
        HashSet hashSet = new HashSet();
        zmb L = L(true, 1, hashSet);
        try {
            List j = gm.j();
            if (j == null) {
                j = new ArrayList();
            }
            for (int i = 0; i < j.size(); i++) {
                L.b((View) j.get(i));
            }
            return hashSet;
        } finally {
            L.a();
        }
    }

    public static void s(ImageView imageView, int i, ylb ylbVar, PorterDuff.Mode mode) {
        int P = P(i, -1, 0, 0.0f, ylbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        N(imageView, 5, i, -1, 0, 0.0f, ylbVar, P, porterDuffColorFilter).h = mode;
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

    public static void u(EditTextBoldCursor editTextBoldCursor, int i) {
        v(editTextBoldCursor, i, null);
    }

    public static void v(EditTextBoldCursor editTextBoldCursor, int i, ylb ylbVar) {
        l(editTextBoldCursor, 30, i, ylbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static umb w(int i, View view) {
        vmb o = o(view, true);
        if (o.c == null) {
            o.c = new ArrayList(2);
        }
        for (int i2 = 0; i2 < o.c.size(); i2++) {
            if (((umb) o.c.get(i2)).l == i) {
                return (umb) o.c.get(i2);
            }
        }
        umb umbVar = new umb();
        umbVar.l = i;
        o.c.add(umbVar);
        return umbVar;
    }

    public static void x(View view, Drawable drawable, int i, ylb ylbVar, PorterDuff.Mode mode) {
        k(view, drawable, i, -1, 0, 0.0f, ylbVar, mode);
    }

    public static void y(EditTextBoldCursor editTextBoldCursor, int i, ylb ylbVar) {
        l(editTextBoldCursor, 36, i, ylbVar);
    }

    public static void z(EditTextBoldCursor editTextBoldCursor, int i, ylb ylbVar) {
        l(editTextBoldCursor, 35, i, ylbVar);
    }
}

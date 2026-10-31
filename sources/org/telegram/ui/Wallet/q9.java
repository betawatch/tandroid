package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ns0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q9 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final gr S = gr.h;
    public int D;
    public final org.telegram.ui.ActionBar.p6 E;
    public final boolean F;
    public final ArrayList G;
    public ValueAnimator H;
    public float I;
    public float J;
    public String K;
    public final ArrayList L;
    public float M;
    public float N;
    public float O;
    public String P;
    public String Q;
    public boolean R;
    public int a;
    public final LinearLayout b;
    public final m9 c;
    public final a7 d;
    public final FrameLayout e;
    public final TextView f;
    public final org.telegram.ui.Cells.y3 h;
    public ValueAnimator n;
    public o1.j r;
    public o1.j s;
    public boolean w;
    public boolean x;
    public boolean y;

    public q9(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        this.a = i10;
        this.G = new ArrayList();
        this.I = 1.0f;
        this.K = "";
        this.L = new ArrayList();
        this.O = 0.5f;
        this.P = ",";
        this.Q = ".";
        this.E = p6Var;
        this.F = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, w7.b6.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.i0.L(1.0f));
        linearLayout.addView(frameLayout, w7.b6.r(59, 60, 16));
        this.D = org.telegram.messenger.i0.L(59.0f);
        a7 a7Var = new a7(60, context, true);
        this.d = a7Var;
        a7Var.i();
        frameLayout.addView(a7Var, w7.b6.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i11 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, w7.b6.e(-2, 60, 19));
        m9 m9Var = new m9(this, context);
        this.c = m9Var;
        org.telegram.ui.ActionBar.a7.V(m9Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        org.telegram.ui.ActionBar.a7.E(m9Var, i11, p6Var);
        m9Var.setHint("0");
        m9Var.setTextSize(1, 44.0f);
        m9Var.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        m9Var.setIncludeFontPadding(false);
        m9Var.setSingleLine(true);
        m9Var.setGravity(21);
        m9Var.setBackground(null);
        m9Var.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        m9Var.setMinWidth(org.telegram.messenger.i0.L(24.0f));
        m9Var.setHorizontallyScrolling(true);
        m9Var.setCursorWidth(3.0f);
        m9Var.setCursorSize(org.telegram.messenger.i0.L(48.0f));
        org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        org.telegram.ui.ActionBar.a7.m(m9Var, 30, i10, p6Var);
        org.telegram.ui.ActionBar.a7.m(m9Var, 36, i10, p6Var);
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.3f, i10);
        org.telegram.ui.ActionBar.a7.o(m9Var, 3, L.a, -1, 2, L.d, p6Var);
        m9Var.setAllowDrawCursor(true);
        m9Var.setInputType(8194);
        m9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        m9Var.setImeOptions(33554438);
        linearLayout.addView(m9Var, w7.b6.r(-2, 60, 16));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, false, true, false, true, true);
        this.h = y3Var;
        y3Var.c.m(0.35f, 420L, 3.5f, gr.h);
        y3Var.setScaleProperty(0.2f);
        y3Var.setAllowCancel(true);
        y3Var.getDrawable().b0 = new l(y3Var, 13);
        y3Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(this.a, p6Var));
        y3Var.setTextSize(org.telegram.messenger.i0.L(28.0f));
        y3Var.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        y3Var.setGravity(3);
        y3Var.getDrawable().S = false;
        y3Var.c(cd.L0(2131749525, null), false, true);
        linearLayout.addView(y3Var, w7.b6.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new i3(this, 7));
        m9Var.addTextChangedListener(new eh(this, 1));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        o1.j jVar = this.r;
        if (jVar != null) {
            jVar.d();
        }
        o1.j jVar2 = this.s;
        if (jVar2 != null) {
            jVar2.d();
        }
        FrameLayout frameLayout = this.e;
        TextView textView = this.f;
        a7 a7Var = this.d;
        if (!z10) {
            a7Var.setAlpha(this.x ? 0.0f : 1.0f);
            textView.setAlpha(this.y ? 1.0f : 0.0f);
            a7Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            a7Var.setEnabled(!this.x);
            a7Var.setVisibility(this.x ? 4 : 0);
            textView.setVisibility(this.y ? 0 : 4);
            frameLayout.getLayoutParams().width = this.D;
            frameLayout.requestLayout();
            return;
        }
        int i10 = frameLayout.getLayoutParams().width;
        float alpha = a7Var.getAlpha();
        float alpha2 = textView.getAlpha();
        float f7 = this.x ? 0.0f : 1.0f;
        float f10 = this.y ? 1.0f : 0.0f;
        if (alpha > 0.0f || f7 > 0.0f) {
            a7Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f10 > 0.0f) {
            textView.setVisibility(0);
        }
        a7Var.setEnabled(!this.x);
        float f11 = this.x ? 24.0f : -24.0f;
        if (a7Var.getAlpha() < 0.01f) {
            a7Var.setConversionWobble(f11);
        }
        o1.j jVar3 = new o1.j(new o1.i(a7Var.getConversionWobble()));
        o1.k kVar = new o1.k(0.0f);
        kVar.a(0.3f);
        kVar.b(180.0f);
        jVar3.m = kVar;
        jVar3.f(0.1f);
        jVar3.a = (-f11) * 10.0f;
        jVar3.b(new q3(this, 3));
        jVar3.h();
        this.s = jVar3;
        float f12 = this.x ? 18.0f : -18.0f;
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f12);
        }
        o1.j jVar4 = new o1.j(textView, o1.j.s);
        o1.k kVar2 = new o1.k(0.0f);
        kVar2.a(0.3f);
        kVar2.b(180.0f);
        jVar4.m = kVar2;
        jVar4.a = (-f12) * 10.0f;
        jVar4.h();
        this.r = jVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = ofFloat;
        ofFloat.setDuration(320L);
        this.n.setInterpolator(new LinearInterpolator());
        this.n.addUpdateListener(new oh.k(this, alpha, f7, alpha2, f10, i10, 1));
        this.n.addListener(new ns0(this, 22));
        this.n.start();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.H = null;
            this.I = 1.0f;
            c();
        }
    }

    public final void c() {
        m9 m9Var = this.c;
        Editable text = m9Var.getText();
        boolean z10 = this.F;
        if (z10) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(m9Var.getHint(), charSequence)) {
                m9Var.setHint(charSequence);
            }
        }
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                break;
            }
            n9 n9Var = (n9) arrayList.get(i10);
            n9Var.d = f7;
            f7 += n9Var.a();
            if (text.getSpanStart(n9Var) >= 0) {
                text.setSpan(n9Var, text.getSpanStart(n9Var), text.getSpanEnd(n9Var), 33);
            }
            i10++;
        }
        if (text.length() != 0 || this.I >= 1.0f) {
            m9Var.setMinWidth((!z10 || text.length() <= 0) ? org.telegram.messenger.i0.L(24.0f) : org.telegram.messenger.i0.L(3.0f) + m9Var.getPaddingRight() + m9Var.getPaddingLeft());
        } else {
            float measureText = m9Var.getPaint().measureText("0");
            int L = org.telegram.messenger.i0.L(24.0f);
            float f10 = this.M;
            m9Var.setMinWidth(Math.max(L, m9Var.getPaddingRight() + m9Var.getPaddingLeft() + Math.round((S.getInterpolation(this.I) * (measureText - f10)) + f10)));
        }
        m9Var.requestLayout();
        m9Var.invalidate();
    }

    public final void d(k0 k0Var, boolean z10) {
        TL_wallet.currencyRate currencyrate;
        int i10;
        TL_wallet.currencyRate currencyrate2;
        String str;
        f fVar = k0Var.h;
        boolean z11 = this.w && isAttachedToWindow() && isShown();
        boolean z12 = this.F;
        m9 m9Var = this.c;
        org.telegram.ui.Cells.y3 y3Var = this.h;
        TextView textView = this.f;
        if (z12) {
            int i11 = z10 ? org.telegram.ui.ActionBar.t6.Zl : org.telegram.ui.ActionBar.t6.Ci;
            this.a = i11;
            org.telegram.ui.ActionBar.p6 p6Var = this.E;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
            org.telegram.ui.ActionBar.a7.V(textView, z10 ? org.telegram.ui.ActionBar.t6.Zl : org.telegram.ui.ActionBar.t6.Ci, p6Var);
            y3Var.c.v(w02, z11);
            y3Var.invalidate();
            org.telegram.ui.ActionBar.a7.w(m9Var, this.a, p6Var);
            org.telegram.ui.ActionBar.a7.m(m9Var, 36, this.a, p6Var);
            org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.3f, z10 ? org.telegram.ui.ActionBar.t6.Zl : org.telegram.ui.ActionBar.t6.Ci);
            org.telegram.ui.ActionBar.a7.o(m9Var, 3, L.a, -1, 2, L.d, p6Var);
        }
        TL_wallet.currencyRate j10 = fVar.j();
        String g10 = fVar.g();
        boolean equals = TextUtils.equals(g10, "USD");
        String str2 = (j10 == null || TextUtils.isEmpty(j10.symbol)) ? equals ? "$" : g10 : j10.symbol;
        boolean z13 = z10 && (j10 == null ? equals : j10.symbolLeft);
        boolean z14 = j10 != null && j10.spaceBetween;
        boolean z15 = (this.x == z10 && this.y == z13 && (!z13 || TextUtils.equals(textView.getText(), str2))) ? false : true;
        if (z13) {
            textView.setText(str2);
            currencyrate = j10;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str2));
            textView.requestLayout();
        } else {
            currencyrate = j10;
        }
        this.x = z10;
        this.y = z13;
        if (!z10) {
            i10 = org.telegram.messenger.i0.L(59.0f);
        } else if (z13) {
            i10 = ((int) Math.ceil(textView.getPaint().measureText(str2))) + (z14 ? org.telegram.messenger.i0.L(8.0f) : 0);
        } else {
            i10 = 0;
        }
        this.D = i10;
        if (z15 || !this.w) {
            a(z11 && z15);
        }
        this.w = true;
        if (!z10) {
            g10 = cd.L0(2131749525, null);
        } else if (!z13) {
            g10 = str2;
        }
        y3Var.c(g10, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) y3Var.getLayoutParams();
        layoutParams.leftMargin = (!z10 || z13 || z14) ? org.telegram.messenger.i0.L(4.0f) : 0;
        y3Var.setLayoutParams(layoutParams);
        if (!z10 || currencyrate == null) {
            currencyrate2 = currencyrate;
            str = ",";
        } else {
            currencyrate2 = currencyrate;
            str = currencyrate2.thousandsSeparator;
            if (str == null) {
                str = "";
            }
        }
        String str3 = (!z10 || currencyrate2 == null || TextUtils.isEmpty(currencyrate2.decimalSeparator)) ? "." : currencyrate2.decimalSeparator;
        if (TextUtils.equals(this.P, str) && TextUtils.equals(this.Q, str3)) {
            return;
        }
        b();
        this.P = str;
        this.Q = str3;
        f(m9Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        a7 a7Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - a7Var.getLeft()) - (a7Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(z20.x(a7Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - a7Var.getTop(), f11) - (org.telegram.messenger.i0.L(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.y3 y3Var = this.h;
        int visibility = y3Var.getVisibility();
        m9 m9Var = this.c;
        float left = (1.0f - f10) * (width - ((m9Var.getLeft() + (visibility == 8 ? m9Var.getRight() : y3Var.getRight())) / 2.0f));
        m9Var.setTranslationX(left);
        y3Var.setTranslationX(left);
        m9Var.setAlpha(f10);
        y3Var.setAlpha(f10);
        a7Var.setEnabled(z10 && !this.x);
        a7Var.setIntroProgress(f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Editable editable) {
        float f7;
        int max;
        m9 m9Var;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        boolean z12;
        String obj = editable.toString();
        int i13 = 0;
        while (i13 < Math.min(obj.length(), this.K.length()) && obj.charAt(i13) == this.K.charAt(i13)) {
            i13++;
        }
        int i14 = 0;
        while (i14 < Math.min(obj.length(), this.K.length()) - i13) {
            char charAt = obj.charAt((obj.length() - i14) - 1);
            String str = this.K;
            if (charAt != str.charAt((str.length() - i14) - 1)) {
                break;
            } else {
                i14++;
            }
        }
        int length = (this.K.length() - i13) - i14;
        int length2 = (obj.length() - i13) - i14;
        ArrayList arrayList3 = this.G;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        p9 p9Var = (arrayList4.isEmpty() && this.K.isEmpty() && obj.startsWith("0")) ? new p9(this, 0.0f) : null;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        int size = arrayList4.size();
        float f10 = 0.0f;
        int i15 = 0;
        while (i15 < size) {
            Object obj2 = arrayList4.get(i15);
            i15++;
            int i16 = size;
            n9 n9Var = (n9) obj2;
            int i17 = length2;
            arrayList5.add(n9Var.h.c());
            arrayList8.add(Integer.valueOf(n9Var.a()));
            f10 += n9Var.a();
            p9 p9Var2 = n9Var.n;
            if (p9Var2 != null) {
                arrayList6.add(p9Var2.c());
                arrayList7.add(n9Var.b);
            }
            length2 = i17;
            size = i16;
        }
        int i18 = length2;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.H = null;
        }
        Object[] objArr = (n9[]) editable.getSpans(0, editable.length(), n9.class);
        int i19 = 0;
        for (int length3 = objArr.length; i19 < length3; length3 = length3) {
            editable.removeSpan(objArr[i19]);
            i19++;
        }
        arrayList3.clear();
        ArrayList arrayList9 = this.L;
        arrayList9.clear();
        int max2 = Math.max(obj.indexOf(46), obj.indexOf(44));
        int length4 = max2 < 0 ? obj.length() : max2;
        p9 p9Var3 = p9Var;
        if (this.P.isEmpty()) {
            f7 = f10;
            max = 0;
        } else {
            f7 = f10;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.J = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        m9 m9Var2 = this.c;
        if (isAttachedToWindow) {
            m9Var = m9Var2;
            i10 = max;
            if (m9Var.getSelectionStart() == m9Var.getSelectionEnd()) {
                z10 = true;
                boolean[] zArr = new boolean[arrayList4.size()];
                z11 = z10;
                boolean[] zArr2 = new boolean[arrayList6.size()];
                i11 = 0;
                int i20 = 0;
                int i21 = 0;
                while (i11 < obj.length()) {
                    int i22 = i11 < i13 ? i11 : i11 >= i13 + i18 ? (i11 - i18) + length : -1;
                    ArrayList arrayList10 = arrayList7;
                    boolean z13 = i22 >= 0 && i22 < arrayList4.size();
                    if (z13) {
                        zArr[i22] = true;
                    }
                    boolean z14 = z13;
                    boolean z15 = !this.P.isEmpty() && i11 > 0 && i11 < length4 && (length4 - i11) % 3 == 0;
                    int i23 = length4;
                    ArrayList arrayList11 = arrayList9;
                    String valueOf = i11 == max2 ? this.Q : String.valueOf(obj.charAt(i11));
                    if (max2 < 0 || i11 < max2) {
                        i12 = max2;
                        z12 = false;
                    } else {
                        i12 = max2;
                        z12 = true;
                    }
                    n9 n9Var2 = new n9(this, valueOf, z15, z12);
                    float measureText = z15 ? m9Var.getPaint().measureText(this.P) : 0.0f;
                    TextPaint paint = m9Var.getPaint();
                    float f11 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z16 = z15;
                    if (n9Var2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(n9Var2.b) + paint.measureText(n9Var2.a);
                    paint.setTextSize(textSize);
                    n9Var2.f = (int) Math.ceil(measureText2);
                    n9Var2.e = z14 ? ((Integer) arrayList8.get(i22)).intValue() : 0;
                    if (i11 == 0 && p9Var3 != null) {
                        n9Var2.e = n9Var2.f;
                    }
                    if (this.F && i11 == 0 && this.K.isEmpty() && arrayList4.isEmpty()) {
                        n9Var2.e = (int) Math.ceil(m9Var.getPaint().measureText("0"));
                    }
                    i20 += n9Var2.e;
                    n9Var2.h = new p9(this, z14 ? (p9) arrayList5.get(i22) : i11 == 0 ? p9Var3 : null, this.J + f11, false);
                    if (z16) {
                        int i24 = i21 + 1;
                        int size2 = (arrayList6.size() - i10) + i21;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        n9Var2.n = new p9(this, size2 >= 0 ? (p9) arrayList6.get(size2) : null, this.J, false);
                        i21 = i24;
                    }
                    arrayList3.add(n9Var2);
                    this.J += n9Var2.f;
                    int i25 = i11 + 1;
                    editable.setSpan(n9Var2, i11, i25, 33);
                    i11 = i25;
                    arrayList7 = arrayList10;
                    length4 = i23;
                    arrayList9 = arrayList11;
                    max2 = i12;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    ((n9) arrayList3.get(Math.min(i13, arrayList3.size() - 1))).e += Math.max(0, Math.round(f7) - i20);
                }
                if (z11) {
                    int i26 = 0;
                    while (i26 < arrayList4.size()) {
                        if (zArr[i26] || (obj.isEmpty() && i26 == 0 && ((n9) arrayList4.get(i26)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            n9 n9Var3 = (n9) arrayList4.get(i26);
                            o9 o9Var = new o9(this, n9Var3.a, n9Var3.c, (p9) arrayList5.get(i26));
                            arrayList2 = arrayList12;
                            arrayList2.add(o9Var);
                        }
                        i26++;
                        arrayList12 = arrayList2;
                    }
                    ArrayList arrayList14 = arrayList12;
                    int i27 = 0;
                    while (i27 < arrayList6.size()) {
                        if (zArr2[i27]) {
                            arrayList = arrayList13;
                        } else {
                            arrayList = arrayList13;
                            arrayList14.add(new o9(this, (String) arrayList.get(i27), false, (p9) arrayList6.get(i27)));
                        }
                        i27++;
                        arrayList13 = arrayList;
                    }
                    if (obj.isEmpty() && !arrayList4.isEmpty()) {
                        this.M = f7;
                    }
                }
                this.K = obj;
                this.I = !z11 ? 0.0f : 1.0f;
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.H = ofFloat;
                    ofFloat.setDuration(320L);
                    this.H.setInterpolator(new LinearInterpolator());
                    this.H.addUpdateListener(new r3(this, 9));
                    this.H.start();
                }
                c();
            }
        } else {
            m9Var = m9Var2;
            i10 = max;
        }
        z10 = false;
        boolean[] zArr3 = new boolean[arrayList4.size()];
        z11 = z10;
        boolean[] zArr22 = new boolean[arrayList6.size()];
        i11 = 0;
        int i202 = 0;
        int i212 = 0;
        while (i11 < obj.length()) {
        }
        ArrayList arrayList122 = arrayList9;
        ArrayList arrayList132 = arrayList7;
        if (!arrayList3.isEmpty()) {
        }
        if (z11) {
        }
        this.K = obj;
        this.I = !z11 ? 0.0f : 1.0f;
        if (z11) {
        }
        c();
    }

    public org.telegram.ui.Components.f6 getCurrencyView() {
        return this.h;
    }

    public a7 getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        a(false);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m9 m9Var = this.c;
        int baseline = m9Var.getBaseline() + m9Var.getTop();
        TextView textView = this.f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        this.h.setTranslationY((baseline - r3.getTop()) - r3.getBaseline());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        float min = Math.min(1.0f, getMeasuredWidth() / Math.max(1, linearLayout.getMeasuredWidth()));
        linearLayout.setPivotX(linearLayout.getMeasuredWidth() / 2.0f);
        linearLayout.setPivotY(linearLayout.getMeasuredHeight() / 2.0f);
        linearLayout.setScaleX(min);
        linearLayout.setScaleY(min);
    }

    public void setAmountText(String str) {
        this.R = true;
        try {
            this.c.setText(str);
        } finally {
            this.R = false;
        }
    }

    public void setScaleProperty(float f7) {
        this.O = 1.0f - Math.max(0.0f, Math.min(1.0f, f7));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.Cells.y3 y3Var;
        m9 m9Var = this.c;
        if (m9Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(this.a, this.E);
            m9Var.setCursorColor(w02);
            m9Var.setHandlesColor(w02);
            if (!this.F || (y3Var = this.h) == null) {
                return;
            }
            y3Var.c.v(w02, false);
            y3Var.invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

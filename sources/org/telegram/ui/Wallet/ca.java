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
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.wh;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class ca extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final lr T = lr.h;
    public int E;
    public final org.telegram.ui.ActionBar.i6 F;
    public final boolean G;
    public final ArrayList H;
    public ValueAnimator I;
    public float J;
    public float K;
    public String L;
    public final ArrayList M;
    public float N;
    public float O;
    public float P;
    public String Q;
    public String R;
    public boolean S;
    public int a;
    public final LinearLayout b;
    public final y9 c;
    public final m7 d;
    public final FrameLayout e;
    public final TextView f;
    public final org.telegram.ui.Cells.x3 h;
    public ValueAnimator n;
    public r1.g r;
    public r1.g s;
    public boolean w;
    public boolean x;
    public boolean y;

    public ca(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        this.a = i7;
        this.H = new ArrayList();
        this.J = 1.0f;
        this.L = "";
        this.M = new ArrayList();
        this.P = 0.5f;
        this.Q = ",";
        this.R = ".";
        this.F = i6Var;
        this.G = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, c8.ma.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.g0.L(1.0f));
        linearLayout.addView(frameLayout, c8.ma.r(59, 60, 16));
        this.E = org.telegram.messenger.g0.L(59.0f);
        m7 m7Var = new m7(60, context, true);
        this.d = m7Var;
        m7Var.i();
        frameLayout.addView(m7Var, c8.ma.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i10 = org.telegram.ui.ActionBar.n6.z6;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, c8.ma.e(-2, 60, 19));
        y9 y9Var = new y9(this, context);
        this.c = y9Var;
        org.telegram.ui.ActionBar.u6.U(y9Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        org.telegram.ui.ActionBar.u6.D(y9Var, i10, i6Var);
        y9Var.setHint("0");
        y9Var.setTextSize(1, 44.0f);
        y9Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        y9Var.setIncludeFontPadding(false);
        y9Var.setSingleLine(true);
        y9Var.setGravity(21);
        y9Var.setBackground(null);
        y9Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        y9Var.setMinWidth(org.telegram.messenger.g0.L(24.0f));
        y9Var.setHorizontallyScrolling(true);
        y9Var.setCursorWidth(3.0f);
        y9Var.setCursorSize(org.telegram.messenger.g0.L(48.0f));
        org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        org.telegram.ui.ActionBar.u6.l(y9Var, 30, i7, i6Var);
        org.telegram.ui.ActionBar.u6.l(y9Var, 36, i7, i6Var);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.3f, i7);
        org.telegram.ui.ActionBar.u6.n(y9Var, 3, K.a, -1, 2, K.d, i6Var);
        y9Var.setAllowDrawCursor(true);
        y9Var.setInputType(8194);
        y9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        y9Var.setImeOptions(33554438);
        linearLayout.addView(y9Var, c8.ma.r(-2, 60, 16));
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, false, true, false, true, true);
        this.h = x3Var;
        x3Var.c.m(0.35f, 420L, 3.5f, lr.h);
        x3Var.setScaleProperty(0.2f);
        x3Var.setAllowCancel(true);
        x3Var.getDrawable().c0 = new m(x3Var, 13);
        x3Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(this.a, i6Var));
        x3Var.setTextSize(org.telegram.messenger.g0.L(28.0f));
        x3Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        x3Var.setGravity(3);
        x3Var.getDrawable().T = false;
        x3Var.c(gd.M0(2131749341, null), false, true);
        linearLayout.addView(x3Var, c8.ma.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new o3(this, 7));
        y9Var.addTextChangedListener(new wh(this, 1));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        r1.g gVar = this.r;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = this.s;
        if (gVar2 != null) {
            gVar2.d();
        }
        FrameLayout frameLayout = this.e;
        TextView textView = this.f;
        m7 m7Var = this.d;
        if (!z10) {
            m7Var.setAlpha(this.x ? 0.0f : 1.0f);
            textView.setAlpha(this.y ? 1.0f : 0.0f);
            m7Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            m7Var.setEnabled(!this.x);
            m7Var.setVisibility(this.x ? 4 : 0);
            textView.setVisibility(this.y ? 0 : 4);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i7 = frameLayout.getLayoutParams().width;
        float alpha = m7Var.getAlpha();
        float alpha2 = textView.getAlpha();
        float f10 = this.x ? 0.0f : 1.0f;
        float f11 = this.y ? 1.0f : 0.0f;
        if (alpha > 0.0f || f10 > 0.0f) {
            m7Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f11 > 0.0f) {
            textView.setVisibility(0);
        }
        m7Var.setEnabled(!this.x);
        float f12 = this.x ? 24.0f : -24.0f;
        if (m7Var.getAlpha() < 0.01f) {
            m7Var.setConversionWobble(f12);
        }
        r1.g gVar3 = new r1.g(new r1.f(m7Var.getConversionWobble()));
        r1.h hVar = new r1.h(0.0f);
        hVar.a(0.3f);
        hVar.b(180.0f);
        gVar3.m = hVar;
        gVar3.f(0.1f);
        gVar3.a = (-f12) * 10.0f;
        gVar3.b(new y3(this, 3));
        gVar3.h();
        this.s = gVar3;
        float f13 = this.x ? 18.0f : -18.0f;
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f13);
        }
        r1.g gVar4 = new r1.g(textView, r1.g.s);
        r1.h hVar2 = new r1.h(0.0f);
        hVar2.a(0.3f);
        hVar2.b(180.0f);
        gVar4.m = hVar2;
        gVar4.a = (-f13) * 10.0f;
        gVar4.h();
        this.r = gVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = ofFloat;
        ofFloat.setDuration(320L);
        this.n.setInterpolator(new LinearInterpolator());
        this.n.addUpdateListener(new x9(this, alpha, f10, alpha2, f11, i7, 0));
        this.n.addListener(new k71(this, 12));
        this.n.start();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
            this.J = 1.0f;
            c();
        }
    }

    public final void c() {
        y9 y9Var = this.c;
        Editable text = y9Var.getText();
        boolean z10 = this.G;
        if (z10) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(y9Var.getHint(), charSequence)) {
                y9Var.setHint(charSequence);
            }
        }
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 >= arrayList.size()) {
                break;
            }
            z9 z9Var = (z9) arrayList.get(i7);
            z9Var.d = f10;
            f10 += z9Var.a();
            if (text.getSpanStart(z9Var) >= 0) {
                text.setSpan(z9Var, text.getSpanStart(z9Var), text.getSpanEnd(z9Var), 33);
            }
            i7++;
        }
        if (text.length() != 0 || this.J >= 1.0f) {
            y9Var.setMinWidth((!z10 || text.length() <= 0) ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.g0.L(3.0f) + y9Var.getPaddingRight() + y9Var.getPaddingLeft());
        } else {
            float measureText = y9Var.getPaint().measureText("0");
            int L = org.telegram.messenger.g0.L(24.0f);
            float f11 = this.N;
            y9Var.setMinWidth(Math.max(L, y9Var.getPaddingRight() + y9Var.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f11)) + f11)));
        }
        y9Var.requestLayout();
        y9Var.invalidate();
    }

    public final void d(u0 u0Var, boolean z10) {
        TL_wallet.currencyRate currencyrate;
        int i7;
        TL_wallet.currencyRate currencyrate2;
        String str;
        g gVar = u0Var.h;
        boolean z11 = this.w && isAttachedToWindow() && isShown();
        boolean z12 = this.G;
        y9 y9Var = this.c;
        org.telegram.ui.Cells.x3 x3Var = this.h;
        TextView textView = this.f;
        if (z12) {
            int i10 = z10 ? org.telegram.ui.ActionBar.n6.cm : org.telegram.ui.ActionBar.n6.Fi;
            this.a = i10;
            org.telegram.ui.ActionBar.i6 i6Var = this.F;
            int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
            org.telegram.ui.ActionBar.u6.U(textView, z10 ? org.telegram.ui.ActionBar.n6.cm : org.telegram.ui.ActionBar.n6.Fi, i6Var);
            x3Var.c.v(w02, z11);
            x3Var.invalidate();
            org.telegram.ui.ActionBar.u6.v(y9Var, this.a, i6Var);
            org.telegram.ui.ActionBar.u6.l(y9Var, 36, this.a, i6Var);
            org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.3f, z10 ? org.telegram.ui.ActionBar.n6.cm : org.telegram.ui.ActionBar.n6.Fi);
            org.telegram.ui.ActionBar.u6.n(y9Var, 3, K.a, -1, 2, K.d, i6Var);
        }
        TL_wallet.currencyRate j3 = gVar.j();
        String g10 = gVar.g();
        boolean equals = TextUtils.equals(g10, "USD");
        String str2 = (j3 == null || TextUtils.isEmpty(j3.symbol)) ? equals ? "$" : g10 : j3.symbol;
        boolean z13 = z10 && (j3 == null ? equals : j3.symbolLeft);
        boolean z14 = j3 != null && j3.spaceBetween;
        boolean z15 = (this.x == z10 && this.y == z13 && (!z13 || TextUtils.equals(textView.getText(), str2))) ? false : true;
        if (z13) {
            textView.setText(str2);
            currencyrate = j3;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str2));
            textView.requestLayout();
        } else {
            currencyrate = j3;
        }
        this.x = z10;
        this.y = z13;
        if (!z10) {
            i7 = org.telegram.messenger.g0.L(59.0f);
        } else if (z13) {
            i7 = ((int) Math.ceil(textView.getPaint().measureText(str2))) + (z14 ? org.telegram.messenger.g0.L(8.0f) : 0);
        } else {
            i7 = 0;
        }
        this.E = i7;
        if (z15 || !this.w) {
            a(z11 && z15);
        }
        this.w = true;
        if (!z10) {
            g10 = gd.M0(2131749341, null);
        } else if (!z13) {
            g10 = str2;
        }
        x3Var.c(g10, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) x3Var.getLayoutParams();
        layoutParams.leftMargin = (!z10 || z13 || z14) ? org.telegram.messenger.g0.L(4.0f) : 0;
        x3Var.setLayoutParams(layoutParams);
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
        if (TextUtils.equals(this.Q, str) && TextUtils.equals(this.R, str3)) {
            return;
        }
        b();
        this.Q = str;
        this.R = str3;
        f(y9Var.getText());
        b();
    }

    public final void e(float f10, float f11, boolean z10) {
        float f12 = 1.0f - f10;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        m7 m7Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - m7Var.getLeft()) - (m7Var.getWidth() / 2.0f)) * f12);
        frameLayout.setTranslationY(n10.y(m7Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - m7Var.getTop(), f12) - (org.telegram.messenger.g0.L(36.0f) * ((float) Math.sin(f10 * 3.141592653589793d))));
        org.telegram.ui.Cells.x3 x3Var = this.h;
        int visibility = x3Var.getVisibility();
        y9 y9Var = this.c;
        float left = (1.0f - f11) * (width - ((y9Var.getLeft() + (visibility == 8 ? y9Var.getRight() : x3Var.getRight())) / 2.0f));
        y9Var.setTranslationX(left);
        x3Var.setTranslationX(left);
        y9Var.setAlpha(f11);
        x3Var.setAlpha(f11);
        m7Var.setEnabled(z10 && !this.x);
        m7Var.setIntroProgress(f10);
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
        float f10;
        int max;
        y9 y9Var;
        int i7;
        boolean z10;
        boolean z11;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        boolean z12;
        String obj = editable.toString();
        int i12 = 0;
        while (i12 < Math.min(obj.length(), this.L.length()) && obj.charAt(i12) == this.L.charAt(i12)) {
            i12++;
        }
        int i13 = 0;
        while (i13 < Math.min(obj.length(), this.L.length()) - i12) {
            char charAt = obj.charAt((obj.length() - i13) - 1);
            String str = this.L;
            if (charAt != str.charAt((str.length() - i13) - 1)) {
                break;
            } else {
                i13++;
            }
        }
        int length = (this.L.length() - i12) - i13;
        int length2 = (obj.length() - i12) - i13;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        ba baVar = (arrayList4.isEmpty() && this.L.isEmpty() && obj.startsWith("0")) ? new ba(this, 0.0f) : null;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        int size = arrayList4.size();
        float f11 = 0.0f;
        int i14 = 0;
        while (i14 < size) {
            Object obj2 = arrayList4.get(i14);
            i14++;
            int i15 = size;
            z9 z9Var = (z9) obj2;
            int i16 = length2;
            arrayList5.add(z9Var.h.c());
            arrayList8.add(Integer.valueOf(z9Var.a()));
            f11 += z9Var.a();
            ba baVar2 = z9Var.n;
            if (baVar2 != null) {
                arrayList6.add(baVar2.c());
                arrayList7.add(z9Var.b);
            }
            length2 = i16;
            size = i15;
        }
        int i17 = length2;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
        }
        Object[] objArr = (z9[]) editable.getSpans(0, editable.length(), z9.class);
        int i18 = 0;
        for (int length3 = objArr.length; i18 < length3; length3 = length3) {
            editable.removeSpan(objArr[i18]);
            i18++;
        }
        arrayList3.clear();
        ArrayList arrayList9 = this.M;
        arrayList9.clear();
        int max2 = Math.max(obj.indexOf(46), obj.indexOf(44));
        int length4 = max2 < 0 ? obj.length() : max2;
        ba baVar3 = baVar;
        if (this.Q.isEmpty()) {
            f10 = f11;
            max = 0;
        } else {
            f10 = f11;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.K = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        y9 y9Var2 = this.c;
        if (isAttachedToWindow) {
            y9Var = y9Var2;
            i7 = max;
            if (y9Var.getSelectionStart() == y9Var.getSelectionEnd()) {
                z10 = true;
                boolean[] zArr = new boolean[arrayList4.size()];
                z11 = z10;
                boolean[] zArr2 = new boolean[arrayList6.size()];
                i10 = 0;
                int i19 = 0;
                int i20 = 0;
                while (i10 < obj.length()) {
                    int i21 = i10 < i12 ? i10 : i10 >= i12 + i17 ? (i10 - i17) + length : -1;
                    ArrayList arrayList10 = arrayList7;
                    boolean z13 = i21 >= 0 && i21 < arrayList4.size();
                    if (z13) {
                        zArr[i21] = true;
                    }
                    boolean z14 = z13;
                    boolean z15 = !this.Q.isEmpty() && i10 > 0 && i10 < length4 && (length4 - i10) % 3 == 0;
                    int i22 = length4;
                    ArrayList arrayList11 = arrayList9;
                    String valueOf = i10 == max2 ? this.R : String.valueOf(obj.charAt(i10));
                    if (max2 < 0 || i10 < max2) {
                        i11 = max2;
                        z12 = false;
                    } else {
                        i11 = max2;
                        z12 = true;
                    }
                    z9 z9Var2 = new z9(this, valueOf, z15, z12);
                    float measureText = z15 ? y9Var.getPaint().measureText(this.Q) : 0.0f;
                    TextPaint paint = y9Var.getPaint();
                    float f12 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z16 = z15;
                    if (z9Var2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(z9Var2.b) + paint.measureText(z9Var2.a);
                    paint.setTextSize(textSize);
                    z9Var2.f = (int) Math.ceil(measureText2);
                    z9Var2.e = z14 ? ((Integer) arrayList8.get(i21)).intValue() : 0;
                    if (i10 == 0 && baVar3 != null) {
                        z9Var2.e = z9Var2.f;
                    }
                    if (this.G && i10 == 0 && this.L.isEmpty() && arrayList4.isEmpty()) {
                        z9Var2.e = (int) Math.ceil(y9Var.getPaint().measureText("0"));
                    }
                    i19 += z9Var2.e;
                    z9Var2.h = new ba(this, z14 ? (ba) arrayList5.get(i21) : i10 == 0 ? baVar3 : null, this.K + f12, false);
                    if (z16) {
                        int i23 = i20 + 1;
                        int size2 = (arrayList6.size() - i7) + i20;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        z9Var2.n = new ba(this, size2 >= 0 ? (ba) arrayList6.get(size2) : null, this.K, false);
                        i20 = i23;
                    }
                    arrayList3.add(z9Var2);
                    this.K += z9Var2.f;
                    int i24 = i10 + 1;
                    editable.setSpan(z9Var2, i10, i24, 33);
                    i10 = i24;
                    arrayList7 = arrayList10;
                    length4 = i22;
                    arrayList9 = arrayList11;
                    max2 = i11;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    ((z9) arrayList3.get(Math.min(i12, arrayList3.size() - 1))).e += Math.max(0, Math.round(f10) - i19);
                }
                if (z11) {
                    int i25 = 0;
                    while (i25 < arrayList4.size()) {
                        if (zArr[i25] || (obj.isEmpty() && i25 == 0 && ((z9) arrayList4.get(i25)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            z9 z9Var3 = (z9) arrayList4.get(i25);
                            aa aaVar = new aa(this, z9Var3.a, z9Var3.c, (ba) arrayList5.get(i25));
                            arrayList2 = arrayList12;
                            arrayList2.add(aaVar);
                        }
                        i25++;
                        arrayList12 = arrayList2;
                    }
                    ArrayList arrayList14 = arrayList12;
                    int i26 = 0;
                    while (i26 < arrayList6.size()) {
                        if (zArr2[i26]) {
                            arrayList = arrayList13;
                        } else {
                            arrayList = arrayList13;
                            arrayList14.add(new aa(this, (String) arrayList.get(i26), false, (ba) arrayList6.get(i26)));
                        }
                        i26++;
                        arrayList13 = arrayList;
                    }
                    if (obj.isEmpty() && !arrayList4.isEmpty()) {
                        this.N = f10;
                    }
                }
                this.L = obj;
                this.J = !z11 ? 0.0f : 1.0f;
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(320L);
                    this.I.setInterpolator(new LinearInterpolator());
                    this.I.addUpdateListener(new z3(this, 9));
                    this.I.start();
                }
                c();
            }
        } else {
            y9Var = y9Var2;
            i7 = max;
        }
        z10 = false;
        boolean[] zArr3 = new boolean[arrayList4.size()];
        z11 = z10;
        boolean[] zArr22 = new boolean[arrayList6.size()];
        i10 = 0;
        int i192 = 0;
        int i202 = 0;
        while (i10 < obj.length()) {
        }
        ArrayList arrayList122 = arrayList9;
        ArrayList arrayList132 = arrayList7;
        if (!arrayList3.isEmpty()) {
        }
        if (z11) {
        }
        this.L = obj;
        this.J = !z11 ? 0.0f : 1.0f;
        if (z11) {
        }
        c();
    }

    public org.telegram.ui.Components.n6 getCurrencyView() {
        return this.h;
    }

    public m7 getDiamondView() {
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        y9 y9Var = this.c;
        int baseline = y9Var.getBaseline() + y9Var.getTop();
        TextView textView = this.f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        this.h.setTranslationY((baseline - r3.getTop()) - r3.getBaseline());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
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
        this.S = true;
        try {
            this.c.setText(str);
        } finally {
            this.S = false;
        }
    }

    public void setScaleProperty(float f10) {
        this.P = 1.0f - Math.max(0.0f, Math.min(1.0f, f10));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Cells.x3 x3Var;
        y9 y9Var = this.c;
        if (y9Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(this.a, this.F);
            y9Var.setCursorColor(w02);
            y9Var.setHandlesColor(w02);
            if (!this.G || (x3Var = this.h) == null) {
                return;
            }
            x3Var.c.v(w02, false);
            x3Var.invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

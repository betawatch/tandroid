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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oh;
import org.telegram.ui.g71;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class o9 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final er T = er.h;
    public int E;
    public final org.telegram.ui.ActionBar.e6 F;
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
    public final k9 c;
    public final w6 d;
    public final FrameLayout e;
    public final TextView f;
    public final org.telegram.ui.Cells.w3 h;
    public ValueAnimator n;
    public r1.g r;
    public r1.g s;
    public boolean w;
    public boolean x;
    public boolean y;

    public o9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        this.a = i7;
        this.H = new ArrayList();
        this.J = 1.0f;
        this.L = "";
        this.M = new ArrayList();
        this.P = 0.5f;
        this.Q = ",";
        this.R = ".";
        this.F = e6Var;
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
        addView(linearLayout, c8.ja.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.g0.L(1.0f));
        linearLayout.addView(frameLayout, c8.ja.r(59, 60, 16));
        this.E = org.telegram.messenger.g0.L(59.0f);
        w6 w6Var = new w6(60, context, true);
        this.d = w6Var;
        w6Var.i();
        frameLayout.addView(w6Var, c8.ja.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i10 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, c8.ja.e(-2, 60, 19));
        k9 k9Var = new k9(this, context);
        this.c = k9Var;
        org.telegram.ui.ActionBar.q6.U(k9Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        org.telegram.ui.ActionBar.q6.D(k9Var, i10, e6Var);
        k9Var.setHint("0");
        k9Var.setTextSize(1, 44.0f);
        k9Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        k9Var.setIncludeFontPadding(false);
        k9Var.setSingleLine(true);
        k9Var.setGravity(21);
        k9Var.setBackground(null);
        k9Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        k9Var.setMinWidth(org.telegram.messenger.g0.L(24.0f));
        k9Var.setHorizontallyScrolling(true);
        k9Var.setCursorWidth(3.0f);
        k9Var.setCursorSize(org.telegram.messenger.g0.L(48.0f));
        org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        org.telegram.ui.ActionBar.q6.l(k9Var, 30, i7, e6Var);
        org.telegram.ui.ActionBar.q6.l(k9Var, 36, i7, e6Var);
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.3f, i7);
        org.telegram.ui.ActionBar.q6.n(k9Var, 3, K.a, -1, 2, K.d, e6Var);
        k9Var.setAllowDrawCursor(true);
        k9Var.setInputType(8194);
        k9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        k9Var.setImeOptions(33554438);
        linearLayout.addView(k9Var, c8.ja.r(-2, 60, 16));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, false, true, false, true, true);
        this.h = w3Var;
        w3Var.c.m(0.35f, 420L, 3.5f, er.h);
        w3Var.setScaleProperty(0.2f);
        w3Var.setAllowCancel(true);
        w3Var.getDrawable().c0 = new l(w3Var, 13);
        w3Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(this.a, e6Var));
        w3Var.setTextSize(org.telegram.messenger.g0.L(28.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        w3Var.setGravity(3);
        w3Var.getDrawable().T = false;
        w3Var.c(hd.M0(2131749516, null), false, true);
        linearLayout.addView(w3Var, c8.ja.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new g3(this, 7));
        k9Var.addTextChangedListener(new oh(this, 1));
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
        w6 w6Var = this.d;
        if (!z10) {
            w6Var.setAlpha(this.x ? 0.0f : 1.0f);
            textView.setAlpha(this.y ? 1.0f : 0.0f);
            w6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            w6Var.setEnabled(!this.x);
            w6Var.setVisibility(this.x ? 4 : 0);
            textView.setVisibility(this.y ? 0 : 4);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i7 = frameLayout.getLayoutParams().width;
        float alpha = w6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        float f10 = this.x ? 0.0f : 1.0f;
        float f11 = this.y ? 1.0f : 0.0f;
        if (alpha > 0.0f || f10 > 0.0f) {
            w6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f11 > 0.0f) {
            textView.setVisibility(0);
        }
        w6Var.setEnabled(!this.x);
        float f12 = this.x ? 24.0f : -24.0f;
        if (w6Var.getAlpha() < 0.01f) {
            w6Var.setConversionWobble(f12);
        }
        r1.g gVar3 = new r1.g(new r1.f(w6Var.getConversionWobble()));
        r1.h hVar = new r1.h(0.0f);
        hVar.a(0.3f);
        hVar.b(180.0f);
        gVar3.m = hVar;
        gVar3.f(0.1f);
        gVar3.a = (-f12) * 10.0f;
        gVar3.b(new p3(this, 3));
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
        this.n.addUpdateListener(new j9(this, alpha, f10, alpha2, f11, i7, 0));
        this.n.addListener(new g71(this, 12));
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
        k9 k9Var = this.c;
        Editable text = k9Var.getText();
        boolean z10 = this.G;
        if (z10) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(k9Var.getHint(), charSequence)) {
                k9Var.setHint(charSequence);
            }
        }
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 >= arrayList.size()) {
                break;
            }
            l9 l9Var = (l9) arrayList.get(i7);
            l9Var.d = f10;
            f10 += l9Var.a();
            if (text.getSpanStart(l9Var) >= 0) {
                text.setSpan(l9Var, text.getSpanStart(l9Var), text.getSpanEnd(l9Var), 33);
            }
            i7++;
        }
        if (text.length() != 0 || this.J >= 1.0f) {
            k9Var.setMinWidth((!z10 || text.length() <= 0) ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.g0.L(3.0f) + k9Var.getPaddingRight() + k9Var.getPaddingLeft());
        } else {
            float measureText = k9Var.getPaint().measureText("0");
            int L = org.telegram.messenger.g0.L(24.0f);
            float f11 = this.N;
            k9Var.setMinWidth(Math.max(L, k9Var.getPaddingRight() + k9Var.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f11)) + f11)));
        }
        k9Var.requestLayout();
        k9Var.invalidate();
    }

    public final void d(l0 l0Var, boolean z10) {
        TL_wallet.currencyRate currencyrate;
        int i7;
        TL_wallet.currencyRate currencyrate2;
        String str;
        f fVar = l0Var.h;
        boolean z11 = this.w && isAttachedToWindow() && isShown();
        boolean z12 = this.G;
        k9 k9Var = this.c;
        org.telegram.ui.Cells.w3 w3Var = this.h;
        TextView textView = this.f;
        if (z12) {
            int i10 = z10 ? org.telegram.ui.ActionBar.j6.cm : org.telegram.ui.ActionBar.j6.Fi;
            this.a = i10;
            org.telegram.ui.ActionBar.e6 e6Var = this.F;
            int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
            org.telegram.ui.ActionBar.q6.U(textView, z10 ? org.telegram.ui.ActionBar.j6.cm : org.telegram.ui.ActionBar.j6.Fi, e6Var);
            w3Var.c.v(w02, z11);
            w3Var.invalidate();
            org.telegram.ui.ActionBar.q6.v(k9Var, this.a, e6Var);
            org.telegram.ui.ActionBar.q6.l(k9Var, 36, this.a, e6Var);
            org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.3f, z10 ? org.telegram.ui.ActionBar.j6.cm : org.telegram.ui.ActionBar.j6.Fi);
            org.telegram.ui.ActionBar.q6.n(k9Var, 3, K.a, -1, 2, K.d, e6Var);
        }
        TL_wallet.currencyRate j3 = fVar.j();
        String g10 = fVar.g();
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
            g10 = hd.M0(2131749516, null);
        } else if (!z13) {
            g10 = str2;
        }
        w3Var.c(g10, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) w3Var.getLayoutParams();
        layoutParams.leftMargin = (!z10 || z13 || z14) ? org.telegram.messenger.g0.L(4.0f) : 0;
        w3Var.setLayoutParams(layoutParams);
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
        f(k9Var.getText());
        b();
    }

    public final void e(float f10, float f11, boolean z10) {
        float f12 = 1.0f - f10;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        w6 w6Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - w6Var.getLeft()) - (w6Var.getWidth() / 2.0f)) * f12);
        frameLayout.setTranslationY(i20.x(w6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - w6Var.getTop(), f12) - (org.telegram.messenger.g0.L(36.0f) * ((float) Math.sin(f10 * 3.141592653589793d))));
        org.telegram.ui.Cells.w3 w3Var = this.h;
        int visibility = w3Var.getVisibility();
        k9 k9Var = this.c;
        float left = (1.0f - f11) * (width - ((k9Var.getLeft() + (visibility == 8 ? k9Var.getRight() : w3Var.getRight())) / 2.0f));
        k9Var.setTranslationX(left);
        w3Var.setTranslationX(left);
        k9Var.setAlpha(f11);
        w3Var.setAlpha(f11);
        w6Var.setEnabled(z10 && !this.x);
        w6Var.setIntroProgress(f10);
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
        k9 k9Var;
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
        n9 n9Var = (arrayList4.isEmpty() && this.L.isEmpty() && obj.startsWith("0")) ? new n9(this, 0.0f) : null;
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
            l9 l9Var = (l9) obj2;
            int i16 = length2;
            arrayList5.add(l9Var.h.c());
            arrayList8.add(Integer.valueOf(l9Var.a()));
            f11 += l9Var.a();
            n9 n9Var2 = l9Var.n;
            if (n9Var2 != null) {
                arrayList6.add(n9Var2.c());
                arrayList7.add(l9Var.b);
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
        Object[] objArr = (l9[]) editable.getSpans(0, editable.length(), l9.class);
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
        n9 n9Var3 = n9Var;
        if (this.Q.isEmpty()) {
            f10 = f11;
            max = 0;
        } else {
            f10 = f11;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.K = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        k9 k9Var2 = this.c;
        if (isAttachedToWindow) {
            k9Var = k9Var2;
            i7 = max;
            if (k9Var.getSelectionStart() == k9Var.getSelectionEnd()) {
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
                    l9 l9Var2 = new l9(this, valueOf, z15, z12);
                    float measureText = z15 ? k9Var.getPaint().measureText(this.Q) : 0.0f;
                    TextPaint paint = k9Var.getPaint();
                    float f12 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z16 = z15;
                    if (l9Var2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(l9Var2.b) + paint.measureText(l9Var2.a);
                    paint.setTextSize(textSize);
                    l9Var2.f = (int) Math.ceil(measureText2);
                    l9Var2.e = z14 ? ((Integer) arrayList8.get(i21)).intValue() : 0;
                    if (i10 == 0 && n9Var3 != null) {
                        l9Var2.e = l9Var2.f;
                    }
                    if (this.G && i10 == 0 && this.L.isEmpty() && arrayList4.isEmpty()) {
                        l9Var2.e = (int) Math.ceil(k9Var.getPaint().measureText("0"));
                    }
                    i19 += l9Var2.e;
                    l9Var2.h = new n9(this, z14 ? (n9) arrayList5.get(i21) : i10 == 0 ? n9Var3 : null, this.K + f12, false);
                    if (z16) {
                        int i23 = i20 + 1;
                        int size2 = (arrayList6.size() - i7) + i20;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        l9Var2.n = new n9(this, size2 >= 0 ? (n9) arrayList6.get(size2) : null, this.K, false);
                        i20 = i23;
                    }
                    arrayList3.add(l9Var2);
                    this.K += l9Var2.f;
                    int i24 = i10 + 1;
                    editable.setSpan(l9Var2, i10, i24, 33);
                    i10 = i24;
                    arrayList7 = arrayList10;
                    length4 = i22;
                    arrayList9 = arrayList11;
                    max2 = i11;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    ((l9) arrayList3.get(Math.min(i12, arrayList3.size() - 1))).e += Math.max(0, Math.round(f10) - i19);
                }
                if (z11) {
                    int i25 = 0;
                    while (i25 < arrayList4.size()) {
                        if (zArr[i25] || (obj.isEmpty() && i25 == 0 && ((l9) arrayList4.get(i25)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            l9 l9Var3 = (l9) arrayList4.get(i25);
                            m9 m9Var = new m9(this, l9Var3.a, l9Var3.c, (n9) arrayList5.get(i25));
                            arrayList2 = arrayList12;
                            arrayList2.add(m9Var);
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
                            arrayList14.add(new m9(this, (String) arrayList.get(i26), false, (n9) arrayList6.get(i26)));
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
                    this.I.addUpdateListener(new q3(this, 9));
                    this.I.start();
                }
                c();
            }
        } else {
            k9Var = k9Var2;
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

    public org.telegram.ui.Components.h6 getCurrencyView() {
        return this.h;
    }

    public w6 getDiamondView() {
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
        k9 k9Var = this.c;
        int baseline = k9Var.getBaseline() + k9Var.getTop();
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Cells.w3 w3Var;
        k9 k9Var = this.c;
        if (k9Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.j6.w0(this.a, this.F);
            k9Var.setCursorColor(w02);
            k9Var.setHandlesColor(w02);
            if (!this.G || (w3Var = this.h) == null) {
                return;
            }
            w3Var.c.v(w02, false);
            w3Var.invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

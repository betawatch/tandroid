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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bs;
import org.telegram.ui.ve1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class i9 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final bs S = bs.h;
    public final org.telegram.ui.ActionBar.g6 E;
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
    public final e9 c;
    public final m6 d;
    public final FrameLayout e;
    public final TextView f;
    public final org.telegram.ui.Cells.t3 h;
    public ValueAnimator n;
    public o1.k r;
    public o1.k s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    public i9(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        this.a = i10;
        this.G = new ArrayList();
        this.I = 1.0f;
        this.K = "";
        this.L = new ArrayList();
        this.O = 0.5f;
        this.P = ",";
        this.Q = ".";
        this.E = g6Var;
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
        addView(linearLayout, w7.z5.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(AndroidUtilities.dp(1.0f));
        linearLayout.addView(frameLayout, w7.z5.q(59, 60, 16));
        this.y = AndroidUtilities.dp(59.0f);
        m6 m6Var = new m6(60, context, true);
        this.d = m6Var;
        m6Var.i();
        frameLayout.addView(m6Var, w7.z5.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i11 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, w7.z5.e(-2, 60, 19));
        e9 e9Var = new e9(this, context);
        this.c = e9Var;
        org.telegram.ui.ActionBar.r6.W(e9Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        org.telegram.ui.ActionBar.r6.F(e9Var, i11, g6Var);
        e9Var.setHint("0");
        e9Var.setTextSize(1, 44.0f);
        e9Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        e9Var.setIncludeFontPadding(false);
        e9Var.setSingleLine(true);
        e9Var.setGravity(21);
        e9Var.setBackground(null);
        e9Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        e9Var.setMinWidth(AndroidUtilities.dp(24.0f));
        e9Var.setHorizontallyScrolling(true);
        e9Var.setCursorWidth(3.0f);
        e9Var.setCursorSize(AndroidUtilities.dp(48.0f));
        org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        org.telegram.ui.ActionBar.r6.m(e9Var, 30, i10, g6Var);
        org.telegram.ui.ActionBar.r6.m(e9Var, 36, i10, g6Var);
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.3f, i10);
        org.telegram.ui.ActionBar.r6.o(e9Var, 3, M.a, -1, 2, M.d, g6Var);
        e9Var.setAllowDrawCursor(true);
        e9Var.setInputType(8194);
        e9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        e9Var.setImeOptions(33554438);
        linearLayout.addView(e9Var, w7.z5.q(-2, 60, 16));
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, false, true, false, true, true);
        this.h = t3Var;
        t3Var.c.m(0.35f, 420L, 3.5f, bs.h);
        t3Var.setScaleProperty(0.2f);
        t3Var.setAllowCancel(true);
        t3Var.getDrawable().b0 = new m(t3Var, 13);
        t3Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(this.a, g6Var));
        t3Var.setTextSize(AndroidUtilities.dp(28.0f));
        t3Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        t3Var.setGravity(3);
        t3Var.getDrawable().S = false;
        t3Var.c(LocaleController.getString(R.string.GramCurrency), false, true);
        linearLayout.addView(t3Var, w7.z5.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new s2(this, 7));
        e9Var.addTextChangedListener(new bi(this, 1));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        o1.k kVar = this.r;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = this.s;
        if (kVar2 != null) {
            kVar2.c();
        }
        FrameLayout frameLayout = this.e;
        TextView textView = this.f;
        m6 m6Var = this.d;
        if (!z10) {
            m6Var.setAlpha(this.w ? 0.0f : 1.0f);
            textView.setAlpha(this.x ? 1.0f : 0.0f);
            m6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            m6Var.setEnabled(!this.w);
            m6Var.setVisibility(this.w ? 4 : 0);
            textView.setVisibility(this.x ? 0 : 4);
            frameLayout.getLayoutParams().width = this.y;
            frameLayout.requestLayout();
            return;
        }
        int i10 = frameLayout.getLayoutParams().width;
        float alpha = m6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        float f7 = this.w ? 0.0f : 1.0f;
        float f10 = this.x ? 1.0f : 0.0f;
        if (alpha > 0.0f || f7 > 0.0f) {
            m6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f10 > 0.0f) {
            textView.setVisibility(0);
        }
        m6Var.setEnabled(!this.w);
        float f11 = this.w ? 24.0f : -24.0f;
        if (m6Var.getAlpha() < 0.01f) {
            m6Var.setConversionWobble(f11);
        }
        o1.k kVar3 = new o1.k(new o1.j(m6Var.getConversionWobble()));
        o1.l lVar = new o1.l(0.0f);
        lVar.a(0.3f);
        lVar.b(180.0f);
        kVar3.u = lVar;
        kVar3.e(0.1f);
        kVar3.a = (-f11) * 10.0f;
        kVar3.b(new z2(this, 3));
        kVar3.h();
        this.s = kVar3;
        float f12 = this.w ? 18.0f : -18.0f;
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f12);
        }
        o1.k kVar4 = new o1.k(textView, o1.h.q);
        o1.l lVar2 = new o1.l(0.0f);
        lVar2.a(0.3f);
        lVar2.b(180.0f);
        kVar4.u = lVar2;
        kVar4.a = (-f12) * 10.0f;
        kVar4.h();
        this.r = kVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = ofFloat;
        ofFloat.setDuration(320L);
        this.n.setInterpolator(new LinearInterpolator());
        this.n.addUpdateListener(new d9(this, alpha, f7, alpha2, f10, i10, 0));
        this.n.addListener(new ve1(this, 10));
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
        e9 e9Var = this.c;
        Editable text = e9Var.getText();
        boolean z10 = this.F;
        if (z10) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(e9Var.getHint(), charSequence)) {
                e9Var.setHint(charSequence);
            }
        }
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                break;
            }
            f9 f9Var = (f9) arrayList.get(i10);
            f9Var.d = f7;
            f7 += f9Var.a();
            if (text.getSpanStart(f9Var) >= 0) {
                text.setSpan(f9Var, text.getSpanStart(f9Var), text.getSpanEnd(f9Var), 33);
            }
            i10++;
        }
        if (text.length() != 0 || this.I >= 1.0f) {
            e9Var.setMinWidth((!z10 || text.length() <= 0) ? AndroidUtilities.dp(24.0f) : AndroidUtilities.dp(3.0f) + e9Var.getPaddingRight() + e9Var.getPaddingLeft());
        } else {
            float measureText = e9Var.getPaint().measureText("0");
            int dp = AndroidUtilities.dp(24.0f);
            float f10 = this.M;
            e9Var.setMinWidth(Math.max(dp, e9Var.getPaddingRight() + e9Var.getPaddingLeft() + Math.round((S.getInterpolation(this.I) * (measureText - f10)) + f10)));
        }
        e9Var.requestLayout();
        e9Var.invalidate();
    }

    public final void d(l0 l0Var, boolean z10) {
        TL_wallet.currencyRate currencyrate;
        int i10;
        TL_wallet.currencyRate currencyrate2;
        String str;
        f fVar = l0Var.h;
        boolean z11 = this.v && isAttachedToWindow() && isShown();
        boolean z12 = this.F;
        e9 e9Var = this.c;
        org.telegram.ui.Cells.t3 t3Var = this.h;
        TextView textView = this.f;
        if (z12) {
            int i11 = z10 ? org.telegram.ui.ActionBar.k6.ll : org.telegram.ui.ActionBar.k6.Oh;
            this.a = i11;
            org.telegram.ui.ActionBar.g6 g6Var = this.E;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
            org.telegram.ui.ActionBar.r6.W(textView, z10 ? org.telegram.ui.ActionBar.k6.ll : org.telegram.ui.ActionBar.k6.Oh, g6Var);
            t3Var.c.v(w02, z11);
            t3Var.invalidate();
            org.telegram.ui.ActionBar.r6.x(e9Var, this.a, g6Var);
            org.telegram.ui.ActionBar.r6.m(e9Var, 36, this.a, g6Var);
            org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.3f, z10 ? org.telegram.ui.ActionBar.k6.ll : org.telegram.ui.ActionBar.k6.Oh);
            org.telegram.ui.ActionBar.r6.o(e9Var, 3, M.a, -1, 2, M.d, g6Var);
        }
        TL_wallet.currencyRate j10 = fVar.j();
        String g10 = fVar.g();
        boolean equals = TextUtils.equals(g10, "USD");
        String str2 = (j10 == null || TextUtils.isEmpty(j10.symbol)) ? equals ? "$" : g10 : j10.symbol;
        boolean z13 = z10 && (j10 == null ? equals : j10.symbolLeft);
        boolean z14 = j10 != null && j10.spaceBetween;
        boolean z15 = (this.w == z10 && this.x == z13 && (!z13 || TextUtils.equals(textView.getText(), str2))) ? false : true;
        if (z13) {
            textView.setText(str2);
            currencyrate = j10;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str2));
            textView.requestLayout();
        } else {
            currencyrate = j10;
        }
        this.w = z10;
        this.x = z13;
        if (!z10) {
            i10 = AndroidUtilities.dp(59.0f);
        } else if (z13) {
            i10 = ((int) Math.ceil(textView.getPaint().measureText(str2))) + (z14 ? AndroidUtilities.dp(8.0f) : 0);
        } else {
            i10 = 0;
        }
        this.y = i10;
        if (z15 || !this.v) {
            a(z11 && z15);
        }
        this.v = true;
        if (!z10) {
            g10 = LocaleController.getString(R.string.GramCurrency);
        } else if (!z13) {
            g10 = str2;
        }
        t3Var.c(g10, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) t3Var.getLayoutParams();
        layoutParams.leftMargin = (!z10 || z13 || z14) ? AndroidUtilities.dp(4.0f) : 0;
        t3Var.setLayoutParams(layoutParams);
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
        f(e9Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        m6 m6Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - m6Var.getLeft()) - (m6Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(sl.z(m6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - m6Var.getTop(), f11) - (AndroidUtilities.dp(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.t3 t3Var = this.h;
        int visibility = t3Var.getVisibility();
        e9 e9Var = this.c;
        float left = (1.0f - f10) * (width - ((e9Var.getLeft() + (visibility == 8 ? e9Var.getRight() : t3Var.getRight())) / 2.0f));
        e9Var.setTranslationX(left);
        t3Var.setTranslationX(left);
        e9Var.setAlpha(f10);
        t3Var.setAlpha(f10);
        m6Var.setEnabled(z10 && !this.w);
        m6Var.setIntroProgress(f7);
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
        e9 e9Var;
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
        h9 h9Var = (arrayList4.isEmpty() && this.K.isEmpty() && obj.startsWith("0")) ? new h9(this, 0.0f) : null;
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
            f9 f9Var = (f9) obj2;
            int i17 = length2;
            arrayList5.add(f9Var.h.c());
            arrayList8.add(Integer.valueOf(f9Var.a()));
            f10 += f9Var.a();
            h9 h9Var2 = f9Var.n;
            if (h9Var2 != null) {
                arrayList6.add(h9Var2.c());
                arrayList7.add(f9Var.b);
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
        Object[] objArr = (f9[]) editable.getSpans(0, editable.length(), f9.class);
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
        h9 h9Var3 = h9Var;
        if (this.P.isEmpty()) {
            f7 = f10;
            max = 0;
        } else {
            f7 = f10;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.J = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        e9 e9Var2 = this.c;
        if (isAttachedToWindow) {
            e9Var = e9Var2;
            i10 = max;
            if (e9Var.getSelectionStart() == e9Var.getSelectionEnd()) {
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
                    f9 f9Var2 = new f9(this, valueOf, z15, z12);
                    float measureText = z15 ? e9Var.getPaint().measureText(this.P) : 0.0f;
                    TextPaint paint = e9Var.getPaint();
                    float f11 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z16 = z15;
                    if (f9Var2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(f9Var2.b) + paint.measureText(f9Var2.a);
                    paint.setTextSize(textSize);
                    f9Var2.f = (int) Math.ceil(measureText2);
                    f9Var2.e = z14 ? ((Integer) arrayList8.get(i22)).intValue() : 0;
                    if (i11 == 0 && h9Var3 != null) {
                        f9Var2.e = f9Var2.f;
                    }
                    if (this.F && i11 == 0 && this.K.isEmpty() && arrayList4.isEmpty()) {
                        f9Var2.e = (int) Math.ceil(e9Var.getPaint().measureText("0"));
                    }
                    i20 += f9Var2.e;
                    f9Var2.h = new h9(this, z14 ? (h9) arrayList5.get(i22) : i11 == 0 ? h9Var3 : null, this.J + f11, false);
                    if (z16) {
                        int i24 = i21 + 1;
                        int size2 = (arrayList6.size() - i10) + i21;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        f9Var2.n = new h9(this, size2 >= 0 ? (h9) arrayList6.get(size2) : null, this.J, false);
                        i21 = i24;
                    }
                    arrayList3.add(f9Var2);
                    this.J += f9Var2.f;
                    int i25 = i11 + 1;
                    editable.setSpan(f9Var2, i11, i25, 33);
                    i11 = i25;
                    arrayList7 = arrayList10;
                    length4 = i23;
                    arrayList9 = arrayList11;
                    max2 = i12;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    ((f9) arrayList3.get(Math.min(i13, arrayList3.size() - 1))).e += Math.max(0, Math.round(f7) - i20);
                }
                if (z11) {
                    int i26 = 0;
                    while (i26 < arrayList4.size()) {
                        if (zArr[i26] || (obj.isEmpty() && i26 == 0 && ((f9) arrayList4.get(i26)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            f9 f9Var3 = (f9) arrayList4.get(i26);
                            g9 g9Var = new g9(this, f9Var3.a, f9Var3.c, (h9) arrayList5.get(i26));
                            arrayList2 = arrayList12;
                            arrayList2.add(g9Var);
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
                            arrayList14.add(new g9(this, (String) arrayList.get(i27), false, (h9) arrayList6.get(i27)));
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
                    this.H.addUpdateListener(new a3(this, 9));
                    this.H.start();
                }
                c();
            }
        } else {
            e9Var = e9Var2;
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

    public org.telegram.ui.Components.q6 getCurrencyView() {
        return this.h;
    }

    public m6 getDiamondView() {
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
        e9 e9Var = this.c;
        int baseline = e9Var.getBaseline() + e9Var.getTop();
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.Cells.t3 t3Var;
        e9 e9Var = this.c;
        if (e9Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(this.a, this.E);
            e9Var.setCursorColor(w02);
            e9Var.setHandlesColor(w02);
            if (!this.F || (t3Var = this.h) == null) {
                return;
            }
            t3Var.c.v(w02, false);
            t3Var.invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

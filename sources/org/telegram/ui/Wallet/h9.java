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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.nk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bs;
import org.telegram.ui.tf1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class h9 extends FrameLayout {
    public static final bs R = bs.h;
    public final boolean E;
    public final ArrayList F;
    public ValueAnimator G;
    public float H;
    public float I;
    public String J;
    public final ArrayList K;
    public float L;
    public float M;
    public float N;
    public String O;
    public String P;
    public boolean Q;
    public final LinearLayout a;
    public final d9 b;
    public final m6 c;
    public final FrameLayout d;
    public final TextView e;
    public final org.telegram.ui.Cells.t3 f;
    public ValueAnimator h;
    public o1.k n;
    public o1.k r;
    public boolean s;
    public boolean v;
    public boolean w;
    public int x;
    public final org.telegram.ui.ActionBar.d6 y;

    public h9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.F = new ArrayList();
        this.H = 1.0f;
        this.J = "";
        this.K = new ArrayList();
        this.N = 0.5f;
        this.O = ",";
        this.P = ".";
        this.y = d6Var;
        this.E = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, w7.z5.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(AndroidUtilities.dp(1.0f));
        linearLayout.addView(frameLayout, w7.z5.q(59, 60, 16));
        this.x = AndroidUtilities.dp(59.0f);
        m6 m6Var = new m6(60, context, true);
        this.c = m6Var;
        m6Var.i();
        frameLayout.addView(m6Var, w7.z5.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        int i10 = org.telegram.ui.ActionBar.h6.z6;
        nk.o(i10, d6Var, textView, 1, 44.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, w7.z5.e(-2, 60, 19));
        d9 d9Var = new d9(this, context);
        this.b = d9Var;
        d9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        d9Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        d9Var.setHint("0");
        d9Var.setTextSize(1, 44.0f);
        d9Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        d9Var.setIncludeFontPadding(false);
        d9Var.setSingleLine(true);
        d9Var.setGravity(21);
        d9Var.setBackground(null);
        d9Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        d9Var.setMinWidth(AndroidUtilities.dp(24.0f));
        d9Var.setHorizontallyScrolling(true);
        d9Var.setCursorWidth(3.0f);
        d9Var.setCursorSize(AndroidUtilities.dp(48.0f));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        d9Var.setCursorColor(w02);
        d9Var.setHandlesColor(w02);
        d9Var.setHighlightColor(org.telegram.ui.ActionBar.h6.m1(0.3f, w02));
        d9Var.setAllowDrawCursor(true);
        d9Var.setInputType(8194);
        d9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        d9Var.setImeOptions(33554438);
        linearLayout.addView(d9Var, w7.z5.q(-2, 60, 16));
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, false, true, false, true, true);
        this.f = t3Var;
        t3Var.c.m(0.35f, 420L, 3.5f, bs.h);
        t3Var.setScaleProperty(0.2f);
        t3Var.setAllowCancel(true);
        t3Var.getDrawable().b0 = new n(t3Var, 13);
        t3Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        t3Var.setTextSize(AndroidUtilities.dp(28.0f));
        t3Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        t3Var.setGravity(3);
        t3Var.getDrawable().S = false;
        t3Var.c(LocaleController.getString(R.string.GramCurrency), false, true);
        linearLayout.addView(t3Var, w7.z5.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new t2(this, 7));
        d9Var.addTextChangedListener(new bi(this, 1));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.h.cancel();
            this.h = null;
        }
        o1.k kVar = this.n;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = this.r;
        if (kVar2 != null) {
            kVar2.c();
        }
        FrameLayout frameLayout = this.d;
        TextView textView = this.e;
        m6 m6Var = this.c;
        if (!z10) {
            m6Var.setAlpha(this.v ? 0.0f : 1.0f);
            textView.setAlpha(this.w ? 1.0f : 0.0f);
            m6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            m6Var.setEnabled(!this.v);
            m6Var.setVisibility(this.v ? 4 : 0);
            textView.setVisibility(this.w ? 0 : 4);
            frameLayout.getLayoutParams().width = this.x;
            frameLayout.requestLayout();
            return;
        }
        int i10 = frameLayout.getLayoutParams().width;
        float alpha = m6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        float f7 = this.v ? 0.0f : 1.0f;
        float f10 = this.w ? 1.0f : 0.0f;
        if (alpha > 0.0f || f7 > 0.0f) {
            m6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f10 > 0.0f) {
            textView.setVisibility(0);
        }
        m6Var.setEnabled(!this.v);
        float f11 = this.v ? 24.0f : -24.0f;
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
        kVar3.b(new a3(this, 3));
        kVar3.h();
        this.r = kVar3;
        float f12 = this.v ? 18.0f : -18.0f;
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
        this.n = kVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.setDuration(320L);
        this.h.setInterpolator(new LinearInterpolator());
        this.h.addUpdateListener(new c9(this, alpha, f7, alpha2, f10, i10, 0));
        this.h.addListener(new tf1(this, 9));
        this.h.start();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
            this.H = 1.0f;
            c();
        }
    }

    public final void c() {
        d9 d9Var = this.b;
        Editable text = d9Var.getText();
        boolean z10 = this.E;
        if (z10) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(d9Var.getHint(), charSequence)) {
                d9Var.setHint(charSequence);
            }
        }
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                break;
            }
            e9 e9Var = (e9) arrayList.get(i10);
            e9Var.d = f7;
            f7 += e9Var.a();
            if (text.getSpanStart(e9Var) >= 0) {
                text.setSpan(e9Var, text.getSpanStart(e9Var), text.getSpanEnd(e9Var), 33);
            }
            i10++;
        }
        if (text.length() != 0 || this.H >= 1.0f) {
            d9Var.setMinWidth((!z10 || text.length() <= 0) ? AndroidUtilities.dp(24.0f) : AndroidUtilities.dp(3.0f) + d9Var.getPaddingRight() + d9Var.getPaddingLeft());
        } else {
            float measureText = d9Var.getPaint().measureText("0");
            int dp = AndroidUtilities.dp(24.0f);
            float f10 = this.L;
            d9Var.setMinWidth(Math.max(dp, d9Var.getPaddingRight() + d9Var.getPaddingLeft() + Math.round((R.getInterpolation(this.H) * (measureText - f10)) + f10)));
        }
        d9Var.requestLayout();
        d9Var.invalidate();
    }

    public final void d(m0 m0Var, boolean z10) {
        TL_wallet.currencyRate currencyrate;
        int i10;
        TL_wallet.currencyRate currencyrate2;
        String str;
        f fVar = m0Var.h;
        boolean z11 = this.s && isAttachedToWindow() && isShown();
        boolean z12 = this.E;
        d9 d9Var = this.b;
        org.telegram.ui.Cells.t3 t3Var = this.f;
        TextView textView = this.e;
        if (z12) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.ll : org.telegram.ui.ActionBar.h6.Oh, this.y);
            textView.setTextColor(w02);
            t3Var.c.v(w02, z11);
            t3Var.invalidate();
            d9Var.setCursorColor(w02);
            d9Var.setHandlesColor(w02);
            d9Var.setHighlightColor(org.telegram.ui.ActionBar.h6.m1(0.3f, w02));
        }
        TL_wallet.currencyRate j10 = fVar.j();
        String g10 = fVar.g();
        boolean equals = TextUtils.equals(g10, "USD");
        String str2 = (j10 == null || TextUtils.isEmpty(j10.symbol)) ? equals ? "$" : g10 : j10.symbol;
        boolean z13 = z10 && (j10 == null ? equals : j10.symbolLeft);
        boolean z14 = j10 != null && j10.spaceBetween;
        boolean z15 = (this.v == z10 && this.w == z13 && (!z13 || TextUtils.equals(textView.getText(), str2))) ? false : true;
        if (z13) {
            textView.setText(str2);
            currencyrate = j10;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str2));
            textView.requestLayout();
        } else {
            currencyrate = j10;
        }
        this.v = z10;
        this.w = z13;
        if (!z10) {
            i10 = AndroidUtilities.dp(59.0f);
        } else if (z13) {
            i10 = ((int) Math.ceil(textView.getPaint().measureText(str2))) + (z14 ? AndroidUtilities.dp(8.0f) : 0);
        } else {
            i10 = 0;
        }
        this.x = i10;
        if (z15 || !this.s) {
            a(z11 && z15);
        }
        this.s = true;
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
        if (TextUtils.equals(this.O, str) && TextUtils.equals(this.P, str3)) {
            return;
        }
        b();
        this.O = str;
        this.P = str3;
        f(d9Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.a;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.d;
        m6 m6Var = this.c;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - m6Var.getLeft()) - (m6Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(nk.z(m6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - m6Var.getTop(), f11) - (AndroidUtilities.dp(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.t3 t3Var = this.f;
        int visibility = t3Var.getVisibility();
        d9 d9Var = this.b;
        float left = (1.0f - f10) * (width - ((d9Var.getLeft() + (visibility == 8 ? d9Var.getRight() : t3Var.getRight())) / 2.0f));
        d9Var.setTranslationX(left);
        t3Var.setTranslationX(left);
        d9Var.setAlpha(f10);
        t3Var.setAlpha(f10);
        m6Var.setEnabled(z10 && !this.v);
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
        d9 d9Var;
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
        while (i13 < Math.min(obj.length(), this.J.length()) && obj.charAt(i13) == this.J.charAt(i13)) {
            i13++;
        }
        int i14 = 0;
        while (i14 < Math.min(obj.length(), this.J.length()) - i13) {
            char charAt = obj.charAt((obj.length() - i14) - 1);
            String str = this.J;
            if (charAt != str.charAt((str.length() - i14) - 1)) {
                break;
            } else {
                i14++;
            }
        }
        int length = (this.J.length() - i13) - i14;
        int length2 = (obj.length() - i13) - i14;
        ArrayList arrayList3 = this.F;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        g9 g9Var = (arrayList4.isEmpty() && this.J.isEmpty() && obj.startsWith("0")) ? new g9(this, 0.0f) : null;
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
            e9 e9Var = (e9) obj2;
            int i17 = length2;
            arrayList5.add(e9Var.h.c());
            arrayList8.add(Integer.valueOf(e9Var.a()));
            f10 += e9Var.a();
            g9 g9Var2 = e9Var.n;
            if (g9Var2 != null) {
                arrayList6.add(g9Var2.c());
                arrayList7.add(e9Var.b);
            }
            length2 = i17;
            size = i16;
        }
        int i18 = length2;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        Object[] objArr = (e9[]) editable.getSpans(0, editable.length(), e9.class);
        int i19 = 0;
        for (int length3 = objArr.length; i19 < length3; length3 = length3) {
            editable.removeSpan(objArr[i19]);
            i19++;
        }
        arrayList3.clear();
        ArrayList arrayList9 = this.K;
        arrayList9.clear();
        int max2 = Math.max(obj.indexOf(46), obj.indexOf(44));
        int length4 = max2 < 0 ? obj.length() : max2;
        g9 g9Var3 = g9Var;
        if (this.O.isEmpty()) {
            f7 = f10;
            max = 0;
        } else {
            f7 = f10;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.I = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        d9 d9Var2 = this.b;
        if (isAttachedToWindow) {
            d9Var = d9Var2;
            i10 = max;
            if (d9Var.getSelectionStart() == d9Var.getSelectionEnd()) {
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
                    boolean z15 = !this.O.isEmpty() && i11 > 0 && i11 < length4 && (length4 - i11) % 3 == 0;
                    int i23 = length4;
                    ArrayList arrayList11 = arrayList9;
                    String valueOf = i11 == max2 ? this.P : String.valueOf(obj.charAt(i11));
                    if (max2 < 0 || i11 < max2) {
                        i12 = max2;
                        z12 = false;
                    } else {
                        i12 = max2;
                        z12 = true;
                    }
                    e9 e9Var2 = new e9(this, valueOf, z15, z12);
                    float measureText = z15 ? d9Var.getPaint().measureText(this.O) : 0.0f;
                    TextPaint paint = d9Var.getPaint();
                    float f11 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z16 = z15;
                    if (e9Var2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(e9Var2.b) + paint.measureText(e9Var2.a);
                    paint.setTextSize(textSize);
                    e9Var2.f = (int) Math.ceil(measureText2);
                    e9Var2.e = z14 ? ((Integer) arrayList8.get(i22)).intValue() : 0;
                    if (i11 == 0 && g9Var3 != null) {
                        e9Var2.e = e9Var2.f;
                    }
                    if (this.E && i11 == 0 && this.J.isEmpty() && arrayList4.isEmpty()) {
                        e9Var2.e = (int) Math.ceil(d9Var.getPaint().measureText("0"));
                    }
                    i20 += e9Var2.e;
                    e9Var2.h = new g9(this, z14 ? (g9) arrayList5.get(i22) : i11 == 0 ? g9Var3 : null, this.I + f11, false);
                    if (z16) {
                        int i24 = i21 + 1;
                        int size2 = (arrayList6.size() - i10) + i21;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        e9Var2.n = new g9(this, size2 >= 0 ? (g9) arrayList6.get(size2) : null, this.I, false);
                        i21 = i24;
                    }
                    arrayList3.add(e9Var2);
                    this.I += e9Var2.f;
                    int i25 = i11 + 1;
                    editable.setSpan(e9Var2, i11, i25, 33);
                    i11 = i25;
                    arrayList7 = arrayList10;
                    length4 = i23;
                    arrayList9 = arrayList11;
                    max2 = i12;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    ((e9) arrayList3.get(Math.min(i13, arrayList3.size() - 1))).e += Math.max(0, Math.round(f7) - i20);
                }
                if (z11) {
                    int i26 = 0;
                    while (i26 < arrayList4.size()) {
                        if (zArr[i26] || (obj.isEmpty() && i26 == 0 && ((e9) arrayList4.get(i26)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            e9 e9Var3 = (e9) arrayList4.get(i26);
                            f9 f9Var = new f9(this, e9Var3.a, e9Var3.c, (g9) arrayList5.get(i26));
                            arrayList2 = arrayList12;
                            arrayList2.add(f9Var);
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
                            arrayList14.add(new f9(this, (String) arrayList.get(i27), false, (g9) arrayList6.get(i27)));
                        }
                        i27++;
                        arrayList13 = arrayList;
                    }
                    if (obj.isEmpty() && !arrayList4.isEmpty()) {
                        this.L = f7;
                    }
                }
                this.J = obj;
                this.H = !z11 ? 0.0f : 1.0f;
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.G = ofFloat;
                    ofFloat.setDuration(320L);
                    this.G.setInterpolator(new LinearInterpolator());
                    this.G.addUpdateListener(new b3(this, 9));
                    this.G.start();
                }
                c();
            }
        } else {
            d9Var = d9Var2;
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
        this.J = obj;
        this.H = !z11 ? 0.0f : 1.0f;
        if (z11) {
        }
        c();
    }

    public org.telegram.ui.Components.q6 getCurrencyView() {
        return this.f;
    }

    public m6 getDiamondView() {
        return this.c;
    }

    public EditTextBoldCursor getEditText() {
        return this.b;
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
        d9 d9Var = this.b;
        int baseline = d9Var.getBaseline() + d9Var.getTop();
        TextView textView = this.e;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.d.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        this.f.setTranslationY((baseline - r3.getTop()) - r3.getBaseline());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        LinearLayout linearLayout = this.a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        float min = Math.min(1.0f, getMeasuredWidth() / Math.max(1, linearLayout.getMeasuredWidth()));
        linearLayout.setPivotX(linearLayout.getMeasuredWidth() / 2.0f);
        linearLayout.setPivotY(linearLayout.getMeasuredHeight() / 2.0f);
        linearLayout.setScaleX(min);
        linearLayout.setScaleY(min);
    }

    public void setAmountText(String str) {
        this.Q = true;
        try {
            this.b.setText(str);
        } finally {
            this.Q = false;
        }
    }

    public void setScaleProperty(float f7) {
        this.N = 1.0f - Math.max(0.0f, Math.min(1.0f, f7));
    }
}

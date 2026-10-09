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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class i8 extends FrameLayout {
    public static final hs R = hs.h;
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
    public final e8 b;
    public final c6 c;
    public final FrameLayout d;
    public final TextView e;
    public final org.telegram.ui.Cells.u3 f;
    public ValueAnimator h;
    public o1.k n;
    public o1.k r;
    public boolean s;
    public boolean v;
    public boolean w;
    public int x;
    public final org.telegram.ui.ActionBar.e6 y;

    public i8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.F = new ArrayList();
        this.H = 1.0f;
        this.J = "";
        this.K = new ArrayList();
        this.N = 0.5f;
        this.O = ",";
        this.P = ".";
        this.y = e6Var;
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
        addView(linearLayout, w7.x5.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(AndroidUtilities.dp(1.0f));
        linearLayout.addView(frameLayout, w7.x5.q(59, 60, 16));
        this.x = AndroidUtilities.dp(59.0f);
        c6 c6Var = new c6(60, context, true);
        this.c = c6Var;
        c6Var.i();
        frameLayout.addView(c6Var, w7.x5.a(60.0f, 0.0f, -5.0f, -2.0f, 0.0f, 60, 19));
        TextView textView = new TextView(context);
        this.e = textView;
        int i10 = org.telegram.ui.ActionBar.i6.z6;
        bi.o(i10, e6Var, textView, 1, 44.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, w7.x5.e(-2, 60, 19));
        e8 e8Var = new e8(this, context);
        this.b = e8Var;
        e8Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        e8Var.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        e8Var.setHint("0");
        e8Var.setTextSize(1, 44.0f);
        e8Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        e8Var.setIncludeFontPadding(false);
        e8Var.setSingleLine(true);
        e8Var.setGravity(21);
        e8Var.setBackground(null);
        e8Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        e8Var.setMinWidth(AndroidUtilities.dp(24.0f));
        e8Var.setHorizontallyScrolling(true);
        e8Var.setCursorWidth(3.0f);
        e8Var.setCursorSize(AndroidUtilities.dp(48.0f));
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        e8Var.setCursorColor(w02);
        e8Var.setHandlesColor(w02);
        e8Var.setHighlightColor(org.telegram.ui.ActionBar.i6.m1(0.3f, w02));
        e8Var.setAllowDrawCursor(true);
        e8Var.setInputType(8194);
        e8Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        e8Var.setImeOptions(33554438);
        linearLayout.addView(e8Var, w7.x5.q(-2, 60, 16));
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, false, true, false, true, true);
        this.f = u3Var;
        u3Var.c.m(0.35f, 420L, 3.5f, hs.h);
        u3Var.setScaleProperty(0.2f);
        u3Var.setAllowCancel(true);
        u3Var.getDrawable().b0 = new m(u3Var, 13);
        u3Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        u3Var.setTextSize(AndroidUtilities.dp(28.0f));
        u3Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        u3Var.setGravity(3);
        u3Var.getDrawable().S = false;
        u3Var.c(LocaleController.getString(R.string.GramCurrency), false, true);
        linearLayout.addView(u3Var, w7.x5.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new j3(this, 5));
        e8Var.addTextChangedListener(new fi(this, 1));
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
        c6 c6Var = this.c;
        if (!z10) {
            c6Var.setAlpha(this.v ? 0.0f : 1.0f);
            textView.setAlpha(this.w ? 1.0f : 0.0f);
            c6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            c6Var.setEnabled(!this.v);
            c6Var.setVisibility(this.v ? 4 : 0);
            textView.setVisibility(this.w ? 0 : 4);
            frameLayout.getLayoutParams().width = this.x;
            frameLayout.requestLayout();
            return;
        }
        int i10 = frameLayout.getLayoutParams().width;
        float alpha = c6Var.getAlpha();
        float f7 = 1.0f;
        float alpha2 = textView.getAlpha();
        float f10 = this.v ? 0.0f : 1.0f;
        if (!this.w) {
            f7 = 0.0f;
        }
        if (alpha > 0.0f || f10 > 0.0f) {
            c6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f7 > 0.0f) {
            textView.setVisibility(0);
        }
        c6Var.setEnabled(!this.v);
        float f11 = this.v ? 24.0f : -24.0f;
        if (c6Var.getAlpha() < 0.01f) {
            c6Var.setConversionWobble(f11);
        }
        o1.k kVar3 = new o1.k(new o1.j(c6Var.getConversionWobble()));
        o1.l lVar = new o1.l(0.0f);
        lVar.a(0.3f);
        lVar.b(180.0f);
        kVar3.u = lVar;
        kVar3.e(0.1f);
        kVar3.a = (-f11) * 10.0f;
        kVar3.b(new r2(this, 2));
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
        this.h.addUpdateListener(new d8(this, alpha, f10, alpha2, f7, i10, 0));
        this.h.addListener(new x4(this, r8));
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
        e8 e8Var = this.b;
        Editable text = e8Var.getText();
        boolean z10 = this.E;
        if (z10) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(e8Var.getHint(), charSequence)) {
                e8Var.setHint(charSequence);
            }
        }
        float f7 = 0.0f;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                break;
            }
            f8 f8Var = (f8) arrayList.get(i10);
            f8Var.d = f7;
            f7 += f8Var.a();
            if (text.getSpanStart(f8Var) >= 0) {
                text.setSpan(f8Var, text.getSpanStart(f8Var), text.getSpanEnd(f8Var), 33);
            }
            i10++;
        }
        if (text.length() != 0 || this.H >= 1.0f) {
            e8Var.setMinWidth((!z10 || text.length() <= 0) ? AndroidUtilities.dp(24.0f) : AndroidUtilities.dp(3.0f) + e8Var.getPaddingRight() + e8Var.getPaddingLeft());
        } else {
            float measureText = e8Var.getPaint().measureText("0");
            int dp = AndroidUtilities.dp(24.0f);
            float f10 = this.L;
            e8Var.setMinWidth(Math.max(dp, e8Var.getPaddingRight() + e8Var.getPaddingLeft() + Math.round((R.getInterpolation(this.H) * (measureText - f10)) + f10)));
        }
        e8Var.requestLayout();
        e8Var.invalidate();
    }

    public final void d(k0 k0Var, boolean z10) {
        TL_wallet.currencyRate currencyrate;
        int i10;
        TL_wallet.currencyRate currencyrate2;
        String str;
        f fVar = k0Var.h;
        boolean z11 = this.s && isAttachedToWindow() && isShown();
        boolean z12 = this.E;
        e8 e8Var = this.b;
        org.telegram.ui.Cells.u3 u3Var = this.f;
        TextView textView = this.e;
        if (z12) {
            int w02 = org.telegram.ui.ActionBar.i6.w0(z10 ? org.telegram.ui.ActionBar.i6.ll : org.telegram.ui.ActionBar.i6.Oh, this.y);
            textView.setTextColor(w02);
            u3Var.c.v(w02, z11);
            u3Var.invalidate();
            e8Var.setCursorColor(w02);
            e8Var.setHandlesColor(w02);
            e8Var.setHighlightColor(org.telegram.ui.ActionBar.i6.m1(0.3f, w02));
        }
        TL_wallet.currencyRate j3 = fVar.j();
        String g10 = fVar.g();
        boolean equals = TextUtils.equals(g10, "USD");
        String str2 = (j3 == null || TextUtils.isEmpty(j3.symbol)) ? equals ? "$" : g10 : j3.symbol;
        boolean z13 = z10 && (j3 == null ? equals : j3.symbolLeft);
        boolean z14 = j3 != null && j3.spaceBetween;
        boolean z15 = (this.v == z10 && this.w == z13 && (!z13 || TextUtils.equals(textView.getText(), str2))) ? false : true;
        if (z13) {
            textView.setText(str2);
            currencyrate = j3;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str2));
            textView.requestLayout();
        } else {
            currencyrate = j3;
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
        u3Var.c(g10, z11, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) u3Var.getLayoutParams();
        layoutParams.leftMargin = (!z10 || z13 || z14) ? AndroidUtilities.dp(4.0f) : 0;
        u3Var.setLayoutParams(layoutParams);
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
        f(e8Var.getText());
        b();
    }

    public final void e(float f7, float f10, boolean z10) {
        float f11 = 1.0f - f7;
        LinearLayout linearLayout = this.a;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.d;
        c6 c6Var = this.c;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - c6Var.getLeft()) - (c6Var.getWidth() / 2.0f)) * f11);
        frameLayout.setTranslationY(bi.y(c6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - c6Var.getTop(), f11) - (AndroidUtilities.dp(36.0f) * ((float) Math.sin(f7 * 3.141592653589793d))));
        org.telegram.ui.Cells.u3 u3Var = this.f;
        int visibility = u3Var.getVisibility();
        e8 e8Var = this.b;
        float left = (1.0f - f10) * (width - ((e8Var.getLeft() + (visibility == 8 ? e8Var.getRight() : u3Var.getRight())) / 2.0f));
        e8Var.setTranslationX(left);
        u3Var.setTranslationX(left);
        e8Var.setAlpha(f10);
        u3Var.setAlpha(f10);
        c6Var.setEnabled(z10 && !this.v);
        c6Var.setIntroProgress(f7);
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
        e8 e8Var;
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
        h8 h8Var = (arrayList4.isEmpty() && this.J.isEmpty() && obj.startsWith("0")) ? new h8(this, 0.0f) : null;
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
            f8 f8Var = (f8) obj2;
            int i17 = length2;
            arrayList5.add(f8Var.h.c());
            arrayList8.add(Integer.valueOf(f8Var.a()));
            f10 += f8Var.a();
            h8 h8Var2 = f8Var.n;
            if (h8Var2 != null) {
                arrayList6.add(h8Var2.c());
                arrayList7.add(f8Var.b);
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
        Object[] objArr = (f8[]) editable.getSpans(0, editable.length(), f8.class);
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
        h8 h8Var3 = h8Var;
        if (this.O.isEmpty()) {
            f7 = f10;
            max = 0;
        } else {
            f7 = f10;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.I = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        e8 e8Var2 = this.b;
        if (isAttachedToWindow) {
            e8Var = e8Var2;
            i10 = max;
            if (e8Var.getSelectionStart() == e8Var.getSelectionEnd()) {
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
                    f8 f8Var2 = new f8(this, valueOf, z15, z12);
                    float measureText = z15 ? e8Var.getPaint().measureText(this.O) : 0.0f;
                    TextPaint paint = e8Var.getPaint();
                    float f11 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z16 = z15;
                    if (f8Var2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(f8Var2.b) + paint.measureText(f8Var2.a);
                    paint.setTextSize(textSize);
                    f8Var2.f = (int) Math.ceil(measureText2);
                    f8Var2.e = z14 ? ((Integer) arrayList8.get(i22)).intValue() : 0;
                    if (i11 == 0 && h8Var3 != null) {
                        f8Var2.e = f8Var2.f;
                    }
                    if (this.E && i11 == 0 && this.J.isEmpty() && arrayList4.isEmpty()) {
                        f8Var2.e = (int) Math.ceil(e8Var.getPaint().measureText("0"));
                    }
                    i20 += f8Var2.e;
                    f8Var2.h = new h8(this, z14 ? (h8) arrayList5.get(i22) : i11 == 0 ? h8Var3 : null, this.I + f11, false);
                    if (z16) {
                        int i24 = i21 + 1;
                        int size2 = (arrayList6.size() - i10) + i21;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        f8Var2.n = new h8(this, size2 >= 0 ? (h8) arrayList6.get(size2) : null, this.I, false);
                        i21 = i24;
                    }
                    arrayList3.add(f8Var2);
                    this.I += f8Var2.f;
                    int i25 = i11 + 1;
                    editable.setSpan(f8Var2, i11, i25, 33);
                    i11 = i25;
                    arrayList7 = arrayList10;
                    length4 = i23;
                    arrayList9 = arrayList11;
                    max2 = i12;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    ((f8) arrayList3.get(Math.min(i13, arrayList3.size() - 1))).e += Math.max(0, Math.round(f7) - i20);
                }
                if (z11) {
                    int i26 = 0;
                    while (i26 < arrayList4.size()) {
                        if (zArr[i26] || (obj.isEmpty() && i26 == 0 && ((f8) arrayList4.get(i26)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            f8 f8Var3 = (f8) arrayList4.get(i26);
                            g8 g8Var = new g8(this, f8Var3.a, f8Var3.c, (h8) arrayList5.get(i26));
                            arrayList2 = arrayList12;
                            arrayList2.add(g8Var);
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
                            arrayList14.add(new g8(this, (String) arrayList.get(i27), false, (h8) arrayList6.get(i27)));
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
                    this.G.addUpdateListener(new s2(this, 8));
                    this.G.start();
                }
                c();
            }
        } else {
            e8Var = e8Var2;
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

    public org.telegram.ui.Components.r6 getCurrencyView() {
        return this.f;
    }

    public c6 getDiamondView() {
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
        e8 e8Var = this.b;
        int baseline = e8Var.getBaseline() + e8Var.getTop();
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

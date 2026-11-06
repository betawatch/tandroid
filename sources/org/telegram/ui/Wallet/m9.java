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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.xq;
import org.telegram.ui.r81;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class m9 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final xq S = xq.h;
    public int D;
    public final org.telegram.ui.ActionBar.f6 E;
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
    public final i9 c;
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

    public m9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        this.a = i7;
        this.G = new ArrayList();
        this.I = 1.0f;
        this.K = "";
        this.L = new ArrayList();
        this.O = 0.5f;
        this.P = ",";
        this.Q = ".";
        this.E = f6Var;
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
        addView(linearLayout, c8.ha.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.g0.L(1.0f));
        linearLayout.addView(frameLayout, c8.ha.r(59, 60, 16));
        this.D = org.telegram.messenger.g0.L(59.0f);
        w6 w6Var = new w6(60, context, true);
        this.d = w6Var;
        w6Var.i();
        frameLayout.addView(w6Var, c8.ha.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i10 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, c8.ha.e(-2, 60, 19));
        i9 i9Var = new i9(this, context);
        this.c = i9Var;
        org.telegram.ui.ActionBar.r6.V(i9Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.ui.ActionBar.r6.E(i9Var, i10, f6Var);
        i9Var.setHint("0");
        i9Var.setTextSize(1, 44.0f);
        i9Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        i9Var.setIncludeFontPadding(false);
        i9Var.setSingleLine(true);
        i9Var.setGravity(21);
        i9Var.setBackground(null);
        i9Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        i9Var.setMinWidth(org.telegram.messenger.g0.L(24.0f));
        i9Var.setHorizontallyScrolling(true);
        i9Var.setCursorWidth(3.0f);
        i9Var.setCursorSize(org.telegram.messenger.g0.L(48.0f));
        org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        org.telegram.ui.ActionBar.r6.m(i9Var, 30, i7, f6Var);
        org.telegram.ui.ActionBar.r6.m(i9Var, 36, i7, f6Var);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.3f, i7);
        org.telegram.ui.ActionBar.r6.o(i9Var, 3, L.a, -1, 2, L.d, f6Var);
        i9Var.setAllowDrawCursor(true);
        i9Var.setInputType(8194);
        i9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        i9Var.setImeOptions(33554438);
        linearLayout.addView(i9Var, c8.ha.r(-2, 60, 16));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, false, true, false, true, true);
        this.h = w3Var;
        w3Var.c.m(0.35f, 420L, 3.5f, xq.h);
        w3Var.setScaleProperty(0.2f);
        w3Var.setAllowCancel(true);
        w3Var.getDrawable().b0 = new l(w3Var, 13);
        w3Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(this.a, f6Var));
        w3Var.setTextSize(org.telegram.messenger.g0.L(28.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        w3Var.setGravity(3);
        w3Var.getDrawable().S = false;
        w3Var.c(hd.M0(2131749515, null), false, true);
        linearLayout.addView(w3Var, c8.ha.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new j3(this, 7));
        i9Var.addTextChangedListener(new hh(this, 1));
    }

    public final void a(boolean z9) {
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
        if (!z9) {
            w6Var.setAlpha(this.x ? 0.0f : 1.0f);
            textView.setAlpha(this.y ? 1.0f : 0.0f);
            w6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            w6Var.setEnabled(!this.x);
            w6Var.setVisibility(this.x ? 4 : 0);
            textView.setVisibility(this.y ? 0 : 4);
            frameLayout.getLayoutParams().width = this.D;
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
        gVar3.b(new q3(this, 3));
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
        this.n.addUpdateListener(new h9(this, alpha, f10, alpha2, f11, i7, 0));
        this.n.addListener(new r81(this, 11));
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
        i9 i9Var = this.c;
        Editable text = i9Var.getText();
        boolean z9 = this.F;
        if (z9) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(i9Var.getHint(), charSequence)) {
                i9Var.setHint(charSequence);
            }
        }
        float f10 = 0.0f;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i7 >= arrayList.size()) {
                break;
            }
            j9 j9Var = (j9) arrayList.get(i7);
            j9Var.d = f10;
            f10 += j9Var.a();
            if (text.getSpanStart(j9Var) >= 0) {
                text.setSpan(j9Var, text.getSpanStart(j9Var), text.getSpanEnd(j9Var), 33);
            }
            i7++;
        }
        if (text.length() != 0 || this.I >= 1.0f) {
            i9Var.setMinWidth((!z9 || text.length() <= 0) ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.g0.L(3.0f) + i9Var.getPaddingRight() + i9Var.getPaddingLeft());
        } else {
            float measureText = i9Var.getPaint().measureText("0");
            int L = org.telegram.messenger.g0.L(24.0f);
            float f11 = this.M;
            i9Var.setMinWidth(Math.max(L, i9Var.getPaddingRight() + i9Var.getPaddingLeft() + Math.round((S.getInterpolation(this.I) * (measureText - f11)) + f11)));
        }
        i9Var.requestLayout();
        i9Var.invalidate();
    }

    public final void d(n0 n0Var, boolean z9) {
        TL_wallet.currencyRate currencyrate;
        int i7;
        TL_wallet.currencyRate currencyrate2;
        String str;
        f fVar = n0Var.h;
        boolean z10 = this.w && isAttachedToWindow() && isShown();
        boolean z11 = this.F;
        i9 i9Var = this.c;
        org.telegram.ui.Cells.w3 w3Var = this.h;
        TextView textView = this.f;
        if (z11) {
            int i10 = z9 ? org.telegram.ui.ActionBar.k6.Zl : org.telegram.ui.ActionBar.k6.Ci;
            this.a = i10;
            org.telegram.ui.ActionBar.f6 f6Var = this.E;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
            org.telegram.ui.ActionBar.r6.V(textView, z9 ? org.telegram.ui.ActionBar.k6.Zl : org.telegram.ui.ActionBar.k6.Ci, f6Var);
            w3Var.c.v(w02, z10);
            w3Var.invalidate();
            org.telegram.ui.ActionBar.r6.w(i9Var, this.a, f6Var);
            org.telegram.ui.ActionBar.r6.m(i9Var, 36, this.a, f6Var);
            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.3f, z9 ? org.telegram.ui.ActionBar.k6.Zl : org.telegram.ui.ActionBar.k6.Ci);
            org.telegram.ui.ActionBar.r6.o(i9Var, 3, L.a, -1, 2, L.d, f6Var);
        }
        TL_wallet.currencyRate j3 = fVar.j();
        String g10 = fVar.g();
        boolean equals = TextUtils.equals(g10, "USD");
        String str2 = (j3 == null || TextUtils.isEmpty(j3.symbol)) ? equals ? "$" : g10 : j3.symbol;
        boolean z12 = z9 && (j3 == null ? equals : j3.symbolLeft);
        boolean z13 = j3 != null && j3.spaceBetween;
        boolean z14 = (this.x == z9 && this.y == z12 && (!z12 || TextUtils.equals(textView.getText(), str2))) ? false : true;
        if (z12) {
            textView.setText(str2);
            currencyrate = j3;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str2));
            textView.requestLayout();
        } else {
            currencyrate = j3;
        }
        this.x = z9;
        this.y = z12;
        if (!z9) {
            i7 = org.telegram.messenger.g0.L(59.0f);
        } else if (z12) {
            i7 = ((int) Math.ceil(textView.getPaint().measureText(str2))) + (z13 ? org.telegram.messenger.g0.L(8.0f) : 0);
        } else {
            i7 = 0;
        }
        this.D = i7;
        if (z14 || !this.w) {
            a(z10 && z14);
        }
        this.w = true;
        if (!z9) {
            g10 = hd.M0(2131749515, null);
        } else if (!z12) {
            g10 = str2;
        }
        w3Var.c(g10, z10, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) w3Var.getLayoutParams();
        layoutParams.leftMargin = (!z9 || z12 || z13) ? org.telegram.messenger.g0.L(4.0f) : 0;
        w3Var.setLayoutParams(layoutParams);
        if (!z9 || currencyrate == null) {
            currencyrate2 = currencyrate;
            str = ",";
        } else {
            currencyrate2 = currencyrate;
            str = currencyrate2.thousandsSeparator;
            if (str == null) {
                str = "";
            }
        }
        String str3 = (!z9 || currencyrate2 == null || TextUtils.isEmpty(currencyrate2.decimalSeparator)) ? "." : currencyrate2.decimalSeparator;
        if (TextUtils.equals(this.P, str) && TextUtils.equals(this.Q, str3)) {
            return;
        }
        b();
        this.P = str;
        this.Q = str3;
        f(i9Var.getText());
        b();
    }

    public final void e(float f10, float f11, boolean z9) {
        float f12 = 1.0f - f10;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        w6 w6Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - w6Var.getLeft()) - (w6Var.getWidth() / 2.0f)) * f12);
        frameLayout.setTranslationY(org.telegram.messenger.camera.q.x(w6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - w6Var.getTop(), f12) - (org.telegram.messenger.g0.L(36.0f) * ((float) Math.sin(f10 * 3.141592653589793d))));
        org.telegram.ui.Cells.w3 w3Var = this.h;
        int visibility = w3Var.getVisibility();
        i9 i9Var = this.c;
        float left = (1.0f - f11) * (width - ((i9Var.getLeft() + (visibility == 8 ? i9Var.getRight() : w3Var.getRight())) / 2.0f));
        i9Var.setTranslationX(left);
        w3Var.setTranslationX(left);
        i9Var.setAlpha(f11);
        w3Var.setAlpha(f11);
        w6Var.setEnabled(z9 && !this.x);
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
        i9 i9Var;
        int i7;
        boolean z9;
        boolean z10;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        boolean z11;
        String obj = editable.toString();
        int i12 = 0;
        while (i12 < Math.min(obj.length(), this.K.length()) && obj.charAt(i12) == this.K.charAt(i12)) {
            i12++;
        }
        int i13 = 0;
        while (i13 < Math.min(obj.length(), this.K.length()) - i12) {
            char charAt = obj.charAt((obj.length() - i13) - 1);
            String str = this.K;
            if (charAt != str.charAt((str.length() - i13) - 1)) {
                break;
            } else {
                i13++;
            }
        }
        int length = (this.K.length() - i12) - i13;
        int length2 = (obj.length() - i12) - i13;
        ArrayList arrayList3 = this.G;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        l9 l9Var = (arrayList4.isEmpty() && this.K.isEmpty() && obj.startsWith("0")) ? new l9(this, 0.0f) : null;
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
            j9 j9Var = (j9) obj2;
            int i16 = length2;
            arrayList5.add(j9Var.h.c());
            arrayList8.add(Integer.valueOf(j9Var.a()));
            f11 += j9Var.a();
            l9 l9Var2 = j9Var.n;
            if (l9Var2 != null) {
                arrayList6.add(l9Var2.c());
                arrayList7.add(j9Var.b);
            }
            length2 = i16;
            size = i15;
        }
        int i17 = length2;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.H = null;
        }
        Object[] objArr = (j9[]) editable.getSpans(0, editable.length(), j9.class);
        int i18 = 0;
        for (int length3 = objArr.length; i18 < length3; length3 = length3) {
            editable.removeSpan(objArr[i18]);
            i18++;
        }
        arrayList3.clear();
        ArrayList arrayList9 = this.L;
        arrayList9.clear();
        int max2 = Math.max(obj.indexOf(46), obj.indexOf(44));
        int length4 = max2 < 0 ? obj.length() : max2;
        l9 l9Var3 = l9Var;
        if (this.P.isEmpty()) {
            f10 = f11;
            max = 0;
        } else {
            f10 = f11;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.J = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        i9 i9Var2 = this.c;
        if (isAttachedToWindow) {
            i9Var = i9Var2;
            i7 = max;
            if (i9Var.getSelectionStart() == i9Var.getSelectionEnd()) {
                z9 = true;
                boolean[] zArr = new boolean[arrayList4.size()];
                z10 = z9;
                boolean[] zArr2 = new boolean[arrayList6.size()];
                i10 = 0;
                int i19 = 0;
                int i20 = 0;
                while (i10 < obj.length()) {
                    int i21 = i10 < i12 ? i10 : i10 >= i12 + i17 ? (i10 - i17) + length : -1;
                    ArrayList arrayList10 = arrayList7;
                    boolean z12 = i21 >= 0 && i21 < arrayList4.size();
                    if (z12) {
                        zArr[i21] = true;
                    }
                    boolean z13 = z12;
                    boolean z14 = !this.P.isEmpty() && i10 > 0 && i10 < length4 && (length4 - i10) % 3 == 0;
                    int i22 = length4;
                    ArrayList arrayList11 = arrayList9;
                    String valueOf = i10 == max2 ? this.Q : String.valueOf(obj.charAt(i10));
                    if (max2 < 0 || i10 < max2) {
                        i11 = max2;
                        z11 = false;
                    } else {
                        i11 = max2;
                        z11 = true;
                    }
                    j9 j9Var2 = new j9(this, valueOf, z14, z11);
                    float measureText = z14 ? i9Var.getPaint().measureText(this.P) : 0.0f;
                    TextPaint paint = i9Var.getPaint();
                    float f12 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z15 = z14;
                    if (j9Var2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(j9Var2.b) + paint.measureText(j9Var2.a);
                    paint.setTextSize(textSize);
                    j9Var2.f = (int) Math.ceil(measureText2);
                    j9Var2.e = z13 ? ((Integer) arrayList8.get(i21)).intValue() : 0;
                    if (i10 == 0 && l9Var3 != null) {
                        j9Var2.e = j9Var2.f;
                    }
                    if (this.F && i10 == 0 && this.K.isEmpty() && arrayList4.isEmpty()) {
                        j9Var2.e = (int) Math.ceil(i9Var.getPaint().measureText("0"));
                    }
                    i19 += j9Var2.e;
                    j9Var2.h = new l9(this, z13 ? (l9) arrayList5.get(i21) : i10 == 0 ? l9Var3 : null, this.J + f12, false);
                    if (z15) {
                        int i23 = i20 + 1;
                        int size2 = (arrayList6.size() - i7) + i20;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        j9Var2.n = new l9(this, size2 >= 0 ? (l9) arrayList6.get(size2) : null, this.J, false);
                        i20 = i23;
                    }
                    arrayList3.add(j9Var2);
                    this.J += j9Var2.f;
                    int i24 = i10 + 1;
                    editable.setSpan(j9Var2, i10, i24, 33);
                    i10 = i24;
                    arrayList7 = arrayList10;
                    length4 = i22;
                    arrayList9 = arrayList11;
                    max2 = i11;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    ((j9) arrayList3.get(Math.min(i12, arrayList3.size() - 1))).e += Math.max(0, Math.round(f10) - i19);
                }
                if (z10) {
                    int i25 = 0;
                    while (i25 < arrayList4.size()) {
                        if (zArr[i25] || (obj.isEmpty() && i25 == 0 && ((j9) arrayList4.get(i25)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            j9 j9Var3 = (j9) arrayList4.get(i25);
                            k9 k9Var = new k9(this, j9Var3.a, j9Var3.c, (l9) arrayList5.get(i25));
                            arrayList2 = arrayList12;
                            arrayList2.add(k9Var);
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
                            arrayList14.add(new k9(this, (String) arrayList.get(i26), false, (l9) arrayList6.get(i26)));
                        }
                        i26++;
                        arrayList13 = arrayList;
                    }
                    if (obj.isEmpty() && !arrayList4.isEmpty()) {
                        this.M = f10;
                    }
                }
                this.K = obj;
                this.I = !z10 ? 0.0f : 1.0f;
                if (z10) {
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
            i9Var = i9Var2;
            i7 = max;
        }
        z9 = false;
        boolean[] zArr3 = new boolean[arrayList4.size()];
        z10 = z9;
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
        if (z10) {
        }
        this.K = obj;
        this.I = !z10 ? 0.0f : 1.0f;
        if (z10) {
        }
        c();
    }

    public org.telegram.ui.Components.j6 getCurrencyView() {
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        i9 i9Var = this.c;
        int baseline = i9Var.getBaseline() + i9Var.getTop();
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
        this.R = true;
        try {
            this.c.setText(str);
        } finally {
            this.R = false;
        }
    }

    public void setScaleProperty(float f10) {
        this.O = 1.0f - Math.max(0.0f, Math.min(1.0f, f10));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.Cells.w3 w3Var;
        i9 i9Var = this.c;
        if (i9Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(this.a, this.E);
            i9Var.setCursorColor(w02);
            i9Var.setHandlesColor(w02);
            if (!this.F || (w3Var = this.h) == null) {
                return;
            }
            w3Var.c.v(w02, false);
            w3Var.invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}

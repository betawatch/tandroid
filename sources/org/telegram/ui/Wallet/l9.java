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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l9 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final xq T = xq.h;
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
    public final h9 c;
    public final u6 d;
    public final FrameLayout e;
    public final TextView f;
    public final org.telegram.ui.Cells.w3 h;
    public ValueAnimator n;
    public q1.g r;
    public q1.g s;
    public boolean w;
    public boolean x;
    public boolean y;

    public l9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        this.a = i3;
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
        addView(linearLayout, mf.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(org.telegram.messenger.g0.L(1.0f));
        linearLayout.addView(frameLayout, mf.r(59, 60, 16));
        this.E = org.telegram.messenger.g0.L(59.0f);
        u6 u6Var = new u6(60, context, true);
        this.d = u6Var;
        u6Var.i();
        frameLayout.addView(u6Var, mf.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i10 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, mf.e(-2, 60, 19));
        h9 h9Var = new h9(this, context);
        this.c = h9Var;
        org.telegram.ui.ActionBar.r6.V(h9Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.ui.ActionBar.r6.E(h9Var, i10, e6Var);
        h9Var.setHint("0");
        h9Var.setTextSize(1, 44.0f);
        h9Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        h9Var.setIncludeFontPadding(false);
        h9Var.setSingleLine(true);
        h9Var.setGravity(21);
        h9Var.setBackground(null);
        h9Var.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        h9Var.setMinWidth(org.telegram.messenger.g0.L(24.0f));
        h9Var.setHorizontallyScrolling(true);
        h9Var.setCursorWidth(3.0f);
        h9Var.setCursorSize(org.telegram.messenger.g0.L(48.0f));
        org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        org.telegram.ui.ActionBar.r6.m(h9Var, 30, i3, e6Var);
        org.telegram.ui.ActionBar.r6.m(h9Var, 36, i3, e6Var);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.3f, i3);
        org.telegram.ui.ActionBar.r6.o(h9Var, 3, L.a, -1, 2, L.d, e6Var);
        h9Var.setAllowDrawCursor(true);
        h9Var.setInputType(8194);
        h9Var.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        h9Var.setImeOptions(33554438);
        linearLayout.addView(h9Var, mf.r(-2, 60, 16));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, false, true, false, true, true);
        this.h = w3Var;
        w3Var.c.m(0.35f, 420L, 3.5f, xq.h);
        w3Var.setScaleProperty(0.2f);
        w3Var.setAllowCancel(true);
        w3Var.getDrawable().b0 = new l(w3Var, 13);
        w3Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(this.a, e6Var));
        w3Var.setTextSize(org.telegram.messenger.g0.L(28.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        w3Var.setGravity(3);
        w3Var.getDrawable().S = false;
        w3Var.c(bd.M0(2131749524, null), false, true);
        linearLayout.addView(w3Var, mf.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new h3(this, 7));
        h9Var.addTextChangedListener(new eh(this, 1));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        q1.g gVar = this.r;
        if (gVar != null) {
            gVar.d();
        }
        q1.g gVar2 = this.s;
        if (gVar2 != null) {
            gVar2.d();
        }
        FrameLayout frameLayout = this.e;
        TextView textView = this.f;
        u6 u6Var = this.d;
        if (!z10) {
            u6Var.setAlpha(this.x ? 0.0f : 1.0f);
            textView.setAlpha(this.y ? 1.0f : 0.0f);
            u6Var.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            u6Var.setEnabled(!this.x);
            u6Var.setVisibility(this.x ? 4 : 0);
            textView.setVisibility(this.y ? 0 : 4);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i3 = frameLayout.getLayoutParams().width;
        float alpha = u6Var.getAlpha();
        float alpha2 = textView.getAlpha();
        float f10 = this.x ? 0.0f : 1.0f;
        float f11 = this.y ? 1.0f : 0.0f;
        if (alpha > 0.0f || f10 > 0.0f) {
            u6Var.setVisibility(0);
        }
        if (alpha2 > 0.0f || f11 > 0.0f) {
            textView.setVisibility(0);
        }
        u6Var.setEnabled(!this.x);
        float f12 = this.x ? 24.0f : -24.0f;
        if (u6Var.getAlpha() < 0.01f) {
            u6Var.setConversionWobble(f12);
        }
        q1.g gVar3 = new q1.g(new q1.f(u6Var.getConversionWobble()));
        q1.h hVar = new q1.h(0.0f);
        hVar.a(0.3f);
        hVar.b(180.0f);
        gVar3.m = hVar;
        gVar3.f(0.1f);
        gVar3.a = (-f12) * 10.0f;
        gVar3.b(new o3(this, 3));
        gVar3.h();
        this.s = gVar3;
        float f13 = this.x ? 18.0f : -18.0f;
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f13);
        }
        q1.g gVar4 = new q1.g(textView, q1.g.s);
        q1.h hVar2 = new q1.h(0.0f);
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
        this.n.addUpdateListener(new g9(this, alpha, f10, alpha2, f11, i3, 0));
        this.n.addListener(new i81(this, 11));
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
        h9 h9Var = this.c;
        Editable text = h9Var.getText();
        boolean z10 = this.G;
        if (z10) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(h9Var.getHint(), charSequence)) {
                h9Var.setHint(charSequence);
            }
        }
        float f10 = 0.0f;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i3 >= arrayList.size()) {
                break;
            }
            i9 i9Var = (i9) arrayList.get(i3);
            i9Var.d = f10;
            f10 += i9Var.a();
            if (text.getSpanStart(i9Var) >= 0) {
                text.setSpan(i9Var, text.getSpanStart(i9Var), text.getSpanEnd(i9Var), 33);
            }
            i3++;
        }
        if (text.length() != 0 || this.J >= 1.0f) {
            h9Var.setMinWidth((!z10 || text.length() <= 0) ? org.telegram.messenger.g0.L(24.0f) : org.telegram.messenger.g0.L(3.0f) + h9Var.getPaddingRight() + h9Var.getPaddingLeft());
        } else {
            float measureText = h9Var.getPaint().measureText("0");
            int L = org.telegram.messenger.g0.L(24.0f);
            float f11 = this.N;
            h9Var.setMinWidth(Math.max(L, h9Var.getPaddingRight() + h9Var.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f11)) + f11)));
        }
        h9Var.requestLayout();
        h9Var.invalidate();
    }

    public final void d(k0 k0Var, boolean z10) {
        TL_wallet.currencyRate currencyrate;
        int i3;
        TL_wallet.currencyRate currencyrate2;
        String str;
        f fVar = k0Var.h;
        boolean z11 = this.w && isAttachedToWindow() && isShown();
        boolean z12 = this.G;
        h9 h9Var = this.c;
        org.telegram.ui.Cells.w3 w3Var = this.h;
        TextView textView = this.f;
        if (z12) {
            int i10 = z10 ? org.telegram.ui.ActionBar.k6.Zl : org.telegram.ui.ActionBar.k6.Ci;
            this.a = i10;
            org.telegram.ui.ActionBar.e6 e6Var = this.F;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
            org.telegram.ui.ActionBar.r6.V(textView, z10 ? org.telegram.ui.ActionBar.k6.Zl : org.telegram.ui.ActionBar.k6.Ci, e6Var);
            w3Var.c.v(w02, z11);
            w3Var.invalidate();
            org.telegram.ui.ActionBar.r6.w(h9Var, this.a, e6Var);
            org.telegram.ui.ActionBar.r6.m(h9Var, 36, this.a, e6Var);
            org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.3f, z10 ? org.telegram.ui.ActionBar.k6.Zl : org.telegram.ui.ActionBar.k6.Ci);
            org.telegram.ui.ActionBar.r6.o(h9Var, 3, L.a, -1, 2, L.d, e6Var);
        }
        TL_wallet.currencyRate j10 = fVar.j();
        String g7 = fVar.g();
        boolean equals = TextUtils.equals(g7, "USD");
        String str2 = (j10 == null || TextUtils.isEmpty(j10.symbol)) ? equals ? "$" : g7 : j10.symbol;
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
            i3 = org.telegram.messenger.g0.L(59.0f);
        } else if (z13) {
            i3 = ((int) Math.ceil(textView.getPaint().measureText(str2))) + (z14 ? org.telegram.messenger.g0.L(8.0f) : 0);
        } else {
            i3 = 0;
        }
        this.E = i3;
        if (z15 || !this.w) {
            a(z11 && z15);
        }
        this.w = true;
        if (!z10) {
            g7 = bd.M0(2131749524, null);
        } else if (!z13) {
            g7 = str2;
        }
        w3Var.c(g7, z11, true);
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
        f(h9Var.getText());
        b();
    }

    public final void e(float f10, float f11, boolean z10) {
        float f12 = 1.0f - f10;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        u6 u6Var = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - u6Var.getLeft()) - (u6Var.getWidth() / 2.0f)) * f12);
        frameLayout.setTranslationY(org.telegram.messenger.camera.q.x(u6Var.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - u6Var.getTop(), f12) - (org.telegram.messenger.g0.L(36.0f) * ((float) Math.sin(f10 * 3.141592653589793d))));
        org.telegram.ui.Cells.w3 w3Var = this.h;
        int visibility = w3Var.getVisibility();
        h9 h9Var = this.c;
        float left = (1.0f - f11) * (width - ((h9Var.getLeft() + (visibility == 8 ? h9Var.getRight() : w3Var.getRight())) / 2.0f));
        h9Var.setTranslationX(left);
        w3Var.setTranslationX(left);
        h9Var.setAlpha(f11);
        w3Var.setAlpha(f11);
        u6Var.setEnabled(z10 && !this.x);
        u6Var.setIntroProgress(f10);
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
        h9 h9Var;
        int i3;
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
        k9 k9Var = (arrayList4.isEmpty() && this.L.isEmpty() && obj.startsWith("0")) ? new k9(this, 0.0f) : null;
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
            i9 i9Var = (i9) obj2;
            int i16 = length2;
            arrayList5.add(i9Var.h.c());
            arrayList8.add(Integer.valueOf(i9Var.a()));
            f11 += i9Var.a();
            k9 k9Var2 = i9Var.n;
            if (k9Var2 != null) {
                arrayList6.add(k9Var2.c());
                arrayList7.add(i9Var.b);
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
        Object[] objArr = (i9[]) editable.getSpans(0, editable.length(), i9.class);
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
        k9 k9Var3 = k9Var;
        if (this.Q.isEmpty()) {
            f10 = f11;
            max = 0;
        } else {
            f10 = f11;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.K = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        h9 h9Var2 = this.c;
        if (isAttachedToWindow) {
            h9Var = h9Var2;
            i3 = max;
            if (h9Var.getSelectionStart() == h9Var.getSelectionEnd()) {
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
                    i9 i9Var2 = new i9(this, valueOf, z15, z12);
                    float measureText = z15 ? h9Var.getPaint().measureText(this.Q) : 0.0f;
                    TextPaint paint = h9Var.getPaint();
                    float f12 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z16 = z15;
                    if (i9Var2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(i9Var2.b) + paint.measureText(i9Var2.a);
                    paint.setTextSize(textSize);
                    i9Var2.f = (int) Math.ceil(measureText2);
                    i9Var2.e = z14 ? ((Integer) arrayList8.get(i21)).intValue() : 0;
                    if (i10 == 0 && k9Var3 != null) {
                        i9Var2.e = i9Var2.f;
                    }
                    if (this.G && i10 == 0 && this.L.isEmpty() && arrayList4.isEmpty()) {
                        i9Var2.e = (int) Math.ceil(h9Var.getPaint().measureText("0"));
                    }
                    i19 += i9Var2.e;
                    i9Var2.h = new k9(this, z14 ? (k9) arrayList5.get(i21) : i10 == 0 ? k9Var3 : null, this.K + f12, false);
                    if (z16) {
                        int i23 = i20 + 1;
                        int size2 = (arrayList6.size() - i3) + i20;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        i9Var2.n = new k9(this, size2 >= 0 ? (k9) arrayList6.get(size2) : null, this.K, false);
                        i20 = i23;
                    }
                    arrayList3.add(i9Var2);
                    this.K += i9Var2.f;
                    int i24 = i10 + 1;
                    editable.setSpan(i9Var2, i10, i24, 33);
                    i10 = i24;
                    arrayList7 = arrayList10;
                    length4 = i22;
                    arrayList9 = arrayList11;
                    max2 = i11;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    ((i9) arrayList3.get(Math.min(i12, arrayList3.size() - 1))).e += Math.max(0, Math.round(f10) - i19);
                }
                if (z11) {
                    int i25 = 0;
                    while (i25 < arrayList4.size()) {
                        if (zArr[i25] || (obj.isEmpty() && i25 == 0 && ((i9) arrayList4.get(i25)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            i9 i9Var3 = (i9) arrayList4.get(i25);
                            j9 j9Var = new j9(this, i9Var3.a, i9Var3.c, (k9) arrayList5.get(i25));
                            arrayList2 = arrayList12;
                            arrayList2.add(j9Var);
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
                            arrayList14.add(new j9(this, (String) arrayList.get(i26), false, (k9) arrayList6.get(i26)));
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
                    this.I.addUpdateListener(new p3(this, 9));
                    this.I.start();
                }
                c();
            }
        } else {
            h9Var = h9Var2;
            i3 = max;
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

    public u6 getDiamondView() {
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        h9 h9Var = this.c;
        int baseline = h9Var.getBaseline() + h9Var.getTop();
        TextView textView = this.f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        this.h.setTranslationY((baseline - r3.getTop()) - r3.getBaseline());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
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
        h9 h9Var = this.c;
        if (h9Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(this.a, this.F);
            h9Var.setCursorColor(w02);
            h9Var.setHandlesColor(w02);
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

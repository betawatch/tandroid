// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class duc extends FrameLayout implements snb {
    public static final k43 T = k43.h;
    public int E;
    public final vnb F;
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
    public final ytc c;
    public final yrc d;
    public final FrameLayout e;
    public final TextView f;
    public final si h;
    public ValueAnimator n;
    public vpa r;
    public vpa s;
    public boolean w;
    public boolean x;
    public boolean y;

    public duc(Context context, vnb vnbVar) {
        super(context);
        int i = aob.Fi;
        this.a = i;
        this.H = new ArrayList();
        this.J = 1.0f;
        this.L = "";
        this.M = new ArrayList();
        this.P = 0.5f;
        this.Q = ",";
        this.R = ".";
        this.F = vnbVar;
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
        addView(linearLayout, tre.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(hl.L(1.0f));
        linearLayout.addView(frameLayout, tre.r(59, 60, 16));
        this.E = hl.L(59.0f);
        yrc yrcVar = new yrc(60, context, true);
        this.d = yrcVar;
        yrcVar.g();
        frameLayout.addView(yrcVar, tre.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i2 = aob.z6;
        yob.X(textView, i2, vnbVar);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(hl.n1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, tre.e(-2, 60, 19));
        ytc ytcVar = new ytc(this, context);
        this.c = ytcVar;
        yob.X(ytcVar, aob.G6, vnbVar);
        yob.D(ytcVar, i2, vnbVar);
        ytcVar.setHint("0");
        ytcVar.setTextSize(1, 44.0f);
        ytcVar.setTypeface(hl.n1("fonts/gram.ttf"));
        ytcVar.setIncludeFontPadding(false);
        ytcVar.setSingleLine(true);
        ytcVar.setGravity(21);
        ytcVar.setBackground(null);
        ytcVar.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        ytcVar.setMinWidth(hl.L(24.0f));
        ytcVar.setHorizontallyScrolling(true);
        ytcVar.setCursorWidth(3.0f);
        ytcVar.setCursorSize(hl.L(48.0f));
        aob.v0(i, vnbVar);
        yob.l(ytcVar, 30, i, vnbVar);
        yob.l(ytcVar, 36, i, vnbVar);
        uob K = yob.K(0.3f, i);
        yob.n(ytcVar, 3, K.a, -1, 2, K.d, vnbVar);
        ytcVar.setAllowDrawCursor(true);
        ytcVar.setInputType(8194);
        ytcVar.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        ytcVar.setImeOptions(33554438);
        linearLayout.addView(ytcVar, tre.r(-2, 60, 16));
        si siVar = new si(context, false, true, false, true, true);
        this.h = siVar;
        siVar.c.m(0.35f, 420L, 3.5f, k43.h);
        siVar.setScaleProperty(0.2f);
        siVar.setAllowCancel(true);
        siVar.getDrawable().c0 = new olc(siVar, (byte) 14);
        siVar.setTextColor(aob.v0(this.a, vnbVar));
        siVar.setTextSize(hl.L(28.0f));
        siVar.setTypeface(hl.n1("fonts/gram.ttf"));
        siVar.setGravity(3);
        siVar.getDrawable().T = false;
        siVar.c(ob6.M0(2131749287, null), false, true);
        linearLayout.addView(siVar, tre.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new xtc(this, (byte) 0));
        ytcVar.addTextChangedListener(new q02(this, (byte) 1));
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        vpa vpaVar = this.r;
        if (vpaVar != null) {
            vpaVar.d();
        }
        vpa vpaVar2 = this.s;
        if (vpaVar2 != null) {
            vpaVar2.d();
        }
        TextView textView = this.f;
        yrc yrcVar = this.d;
        FrameLayout frameLayout = this.e;
        if (!z) {
            yrcVar.setAlpha(this.x ? 0.0f : 1.0f);
            textView.setAlpha(this.y ? 1.0f : 0.0f);
            yrcVar.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            yrcVar.setEnabled(!this.x);
            yrcVar.setVisibility(this.x ? 4 : 0);
            textView.setVisibility(this.y ? (byte) 0 : (byte) 4);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i = frameLayout.getLayoutParams().width;
        float alpha = yrcVar.getAlpha();
        float alpha2 = textView.getAlpha();
        float f = this.x ? 0.0f : 1.0f;
        float f2 = this.y ? 1.0f : 0.0f;
        if (alpha > 0.0f || f > 0.0f) {
            yrcVar.setVisibility(0);
        }
        if (alpha2 > 0.0f || f2 > 0.0f) {
            textView.setVisibility(0);
        }
        yrcVar.setEnabled(!this.x);
        float f3 = this.x ? 24.0f : -24.0f;
        if (yrcVar.getAlpha() < 0.01f) {
            yrcVar.setConversionWobble(f3);
        }
        vpa vpaVar3 = new vpa(new xk4(yrcVar.getConversionWobble()));
        wpa wpaVar = new wpa(0.0f);
        wpaVar.a(0.3f);
        wpaVar.b(180.0f);
        vpaVar3.m = wpaVar;
        vpaVar3.f(0.1f);
        vpaVar3.a = (-f3) * 10.0f;
        vpaVar3.b(new i10(this, (byte) 22));
        vpaVar3.h();
        this.s = vpaVar3;
        float f4 = this.x ? 18.0f : -18.0f;
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f4);
        }
        vpa vpaVar4 = new vpa(textView, vpa.s);
        wpa wpaVar2 = new wpa(0.0f);
        wpaVar2.a(0.3f);
        wpaVar2.b(180.0f);
        vpaVar4.m = wpaVar2;
        vpaVar4.a = (-f4) * 10.0f;
        vpaVar4.h();
        this.r = vpaVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = ofFloat;
        ofFloat.setDuration(320L);
        this.n.setInterpolator(new LinearInterpolator());
        this.n.addUpdateListener(new y07(this, alpha, f, alpha2, f2, i, (byte) 1));
        this.n.addListener(new ztc(this, r0));
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
        ytc ytcVar = this.c;
        Editable text = ytcVar.getText();
        boolean z = this.G;
        if (z) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(ytcVar.getHint(), charSequence)) {
                ytcVar.setHint(charSequence);
            }
        }
        float f = 0.0f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                break;
            }
            auc aucVar = (auc) arrayList.get(i);
            aucVar.d = f;
            f += aucVar.a();
            if (text.getSpanStart(aucVar) >= 0) {
                text.setSpan(aucVar, text.getSpanStart(aucVar), text.getSpanEnd(aucVar), 33);
            }
            i++;
        }
        if (text.length() != 0 || this.J >= 1.0f) {
            ytcVar.setMinWidth((!z || text.length() <= 0) ? hl.L(24.0f) : hl.L(3.0f) + ytcVar.getPaddingRight() + ytcVar.getPaddingLeft());
        } else {
            float measureText = ytcVar.getPaint().measureText("0");
            int L = hl.L(24.0f);
            float f2 = this.N;
            ytcVar.setMinWidth(Math.max(L, ytcVar.getPaddingRight() + ytcVar.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f2)) + f2)));
        }
        ytcVar.requestLayout();
        ytcVar.invalidate();
    }

    public final void d(c cVar, boolean z) {
        TL_wallet.currencyRate currencyrate;
        int i;
        TL_wallet.currencyRate currencyrate2;
        String str;
        s43 s43Var = cVar.h;
        boolean z2 = this.w && isAttachedToWindow() && isShown();
        boolean z3 = this.G;
        ytc ytcVar = this.c;
        si siVar = this.h;
        TextView textView = this.f;
        if (z3) {
            int i2 = z ? aob.cm : aob.Fi;
            this.a = i2;
            vnb vnbVar = this.F;
            int v0 = aob.v0(i2, vnbVar);
            yob.X(textView, z ? aob.cm : aob.Fi, vnbVar);
            siVar.c.v(v0, z2);
            siVar.invalidate();
            yob.v(ytcVar, this.a, vnbVar);
            yob.l(ytcVar, 36, this.a, vnbVar);
            uob K = yob.K(0.3f, z ? aob.cm : aob.Fi);
            yob.n(ytcVar, 3, K.a, -1, 2, K.d, vnbVar);
        }
        TL_wallet.currencyRate j = s43Var.j();
        String g = s43Var.g();
        boolean equals = TextUtils.equals(g, "USD");
        String str2 = (j == null || TextUtils.isEmpty(j.symbol)) ? equals ? "$" : g : j.symbol;
        boolean z4 = z && (j == null ? equals : j.symbolLeft);
        boolean z5 = j != null && j.spaceBetween;
        boolean z6 = (this.x == z && this.y == z4 && (!z4 || TextUtils.equals(textView.getText(), str2))) ? false : true;
        if (z4) {
            textView.setText(str2);
            currencyrate = j;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str2));
            textView.requestLayout();
        } else {
            currencyrate = j;
        }
        this.x = z;
        this.y = z4;
        if (!z) {
            i = hl.L(59.0f);
        } else if (z4) {
            i = ((int) Math.ceil(textView.getPaint().measureText(str2))) + (z5 ? hl.L(8.0f) : 0);
        } else {
            i = 0;
        }
        this.E = i;
        if (z6 || !this.w) {
            a(z2 && z6);
        }
        this.w = true;
        if (!z) {
            g = ob6.M0(2131749287, null);
        } else if (!z4) {
            g = str2;
        }
        siVar.c(g, z2, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) siVar.getLayoutParams();
        layoutParams.leftMargin = (!z || z4 || z5) ? hl.L(4.0f) : 0;
        siVar.setLayoutParams(layoutParams);
        if (!z || currencyrate == null) {
            currencyrate2 = currencyrate;
            str = ",";
        } else {
            currencyrate2 = currencyrate;
            str = currencyrate2.thousandsSeparator;
            if (str == null) {
                str = "";
            }
        }
        String str3 = (!z || currencyrate2 == null || TextUtils.isEmpty(currencyrate2.decimalSeparator)) ? "." : currencyrate2.decimalSeparator;
        if (TextUtils.equals(this.Q, str) && TextUtils.equals(this.R, str3)) {
            return;
        }
        b();
        this.Q = str;
        this.R = str3;
        f(ytcVar.getText());
        b();
    }

    public final void e(float f, float f2, boolean z) {
        float f3 = 1.0f - f;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        yrc yrcVar = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - yrcVar.getLeft()) - (yrcVar.getWidth() / 2.0f)) * f3);
        frameLayout.setTranslationY(uh9.e(yrcVar.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - yrcVar.getTop(), f3) - (hl.L(36.0f) * ((float) Math.sin(f * 3.141592653589793d))));
        si siVar = this.h;
        int visibility = siVar.getVisibility();
        ytc ytcVar = this.c;
        float left = (1.0f - f2) * (width - ((ytcVar.getLeft() + (visibility == 8 ? ytcVar.getRight() : siVar.getRight())) / 2.0f));
        ytcVar.setTranslationX(left);
        siVar.setTranslationX(left);
        ytcVar.setAlpha(f2);
        siVar.setAlpha(f2);
        yrcVar.setEnabled(z && !this.x);
        yrcVar.setIntroProgress(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Editable editable) {
        float f;
        int max;
        ytc ytcVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        boolean z3;
        String obj = editable.toString();
        int i4 = 0;
        while (i4 < Math.min(obj.length(), this.L.length()) && obj.charAt(i4) == this.L.charAt(i4)) {
            i4++;
        }
        int i5 = 0;
        while (i5 < Math.min(obj.length(), this.L.length()) - i4) {
            char charAt = obj.charAt((obj.length() - i5) - 1);
            String str = this.L;
            if (charAt != str.charAt((str.length() - i5) - 1)) {
                break;
            } else {
                i5++;
            }
        }
        int length = (this.L.length() - i4) - i5;
        int length2 = (obj.length() - i4) - i5;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        cuc cucVar = (arrayList4.isEmpty() && this.L.isEmpty() && obj.startsWith("0")) ? new cuc(this, 0.0f) : null;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        int size = arrayList4.size();
        float f2 = 0.0f;
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList4.get(i6);
            i6++;
            int i7 = size;
            auc aucVar = (auc) obj2;
            int i8 = length2;
            arrayList5.add(aucVar.h.c());
            arrayList8.add(Integer.valueOf(aucVar.a()));
            f2 += aucVar.a();
            cuc cucVar2 = aucVar.n;
            if (cucVar2 != null) {
                arrayList6.add(cucVar2.c());
                arrayList7.add(aucVar.b);
            }
            length2 = i8;
            size = i7;
        }
        int i9 = length2;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
        }
        Object[] objArr = (auc[]) editable.getSpans(0, editable.length(), auc.class);
        int i10 = 0;
        for (int length3 = objArr.length; i10 < length3; length3 = length3) {
            editable.removeSpan(objArr[i10]);
            i10++;
        }
        arrayList3.clear();
        ArrayList arrayList9 = this.M;
        arrayList9.clear();
        int max2 = Math.max(obj.indexOf(46), obj.indexOf(44));
        int length4 = max2 < 0 ? obj.length() : max2;
        cuc cucVar3 = cucVar;
        if (this.Q.isEmpty()) {
            f = f2;
            max = 0;
        } else {
            f = f2;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.K = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        ytc ytcVar2 = this.c;
        if (isAttachedToWindow) {
            ytcVar = ytcVar2;
            i = max;
            if (ytcVar.getSelectionStart() == ytcVar.getSelectionEnd()) {
                z = true;
                boolean[] zArr = new boolean[arrayList4.size()];
                z2 = z;
                boolean[] zArr2 = new boolean[arrayList6.size()];
                i2 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i2 < obj.length()) {
                    int i13 = i2 < i4 ? i2 : i2 >= i4 + i9 ? (i2 - i9) + length : -1;
                    ArrayList arrayList10 = arrayList7;
                    boolean z4 = i13 >= 0 && i13 < arrayList4.size();
                    if (z4) {
                        zArr[i13] = true;
                    }
                    boolean z5 = z4;
                    boolean z6 = !this.Q.isEmpty() && i2 > 0 && i2 < length4 && (length4 - i2) % 3 == 0;
                    int i14 = length4;
                    ArrayList arrayList11 = arrayList9;
                    String valueOf = i2 == max2 ? this.R : String.valueOf(obj.charAt(i2));
                    if (max2 < 0 || i2 < max2) {
                        i3 = max2;
                        z3 = false;
                    } else {
                        i3 = max2;
                        z3 = true;
                    }
                    auc aucVar2 = new auc(this, valueOf, z6, z3);
                    float measureText = z6 ? ytcVar.getPaint().measureText(this.Q) : 0.0f;
                    TextPaint paint = ytcVar.getPaint();
                    float f3 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z7 = z6;
                    if (aucVar2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(aucVar2.b) + paint.measureText(aucVar2.a);
                    paint.setTextSize(textSize);
                    aucVar2.f = (int) Math.ceil(measureText2);
                    aucVar2.e = z5 ? ((Integer) arrayList8.get(i13)).intValue() : 0;
                    if (i2 == 0 && cucVar3 != null) {
                        aucVar2.e = aucVar2.f;
                    }
                    if (this.G && i2 == 0 && this.L.isEmpty() && arrayList4.isEmpty()) {
                        aucVar2.e = (int) Math.ceil(ytcVar.getPaint().measureText("0"));
                    }
                    i11 += aucVar2.e;
                    aucVar2.h = new cuc(this, z5 ? (cuc) arrayList5.get(i13) : i2 == 0 ? cucVar3 : null, this.K + f3, false);
                    if (z7) {
                        int i15 = i12 + 1;
                        int size2 = (arrayList6.size() - i) + i12;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        aucVar2.n = new cuc(this, size2 >= 0 ? (cuc) arrayList6.get(size2) : null, this.K, false);
                        i12 = i15;
                    }
                    arrayList3.add(aucVar2);
                    this.K += aucVar2.f;
                    int i16 = i2 + 1;
                    editable.setSpan(aucVar2, i2, i16, 33);
                    i2 = i16;
                    arrayList7 = arrayList10;
                    length4 = i14;
                    arrayList9 = arrayList11;
                    max2 = i3;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    auc aucVar3 = (auc) arrayList3.get(Math.min(i4, arrayList3.size() - 1));
                    aucVar3.e = Math.max(0, Math.round(f) - i11) + aucVar3.e;
                }
                if (z2) {
                    int i17 = 0;
                    while (i17 < arrayList4.size()) {
                        if (zArr[i17] || (obj.isEmpty() && i17 == 0 && ((auc) arrayList4.get(i17)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            auc aucVar4 = (auc) arrayList4.get(i17);
                            buc bucVar = new buc(this, aucVar4.a, aucVar4.c, (cuc) arrayList5.get(i17));
                            arrayList2 = arrayList12;
                            arrayList2.add(bucVar);
                        }
                        i17++;
                        arrayList12 = arrayList2;
                    }
                    ArrayList arrayList14 = arrayList12;
                    int i18 = 0;
                    while (i18 < arrayList6.size()) {
                        if (zArr2[i18]) {
                            arrayList = arrayList13;
                        } else {
                            arrayList = arrayList13;
                            arrayList14.add(new buc(this, (String) arrayList.get(i18), false, (cuc) arrayList6.get(i18)));
                        }
                        i18++;
                        arrayList13 = arrayList;
                    }
                    if (obj.isEmpty() && !arrayList4.isEmpty()) {
                        this.N = f;
                    }
                }
                this.L = obj;
                this.J = !z2 ? 0.0f : 1.0f;
                if (z2) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(320L);
                    this.I.setInterpolator(new LinearInterpolator());
                    this.I.addUpdateListener(new pzb(this, (byte) 19));
                    this.I.start();
                }
                c();
            }
        } else {
            ytcVar = ytcVar2;
            i = max;
        }
        z = false;
        boolean[] zArr3 = new boolean[arrayList4.size()];
        z2 = z;
        boolean[] zArr22 = new boolean[arrayList6.size()];
        i2 = 0;
        int i112 = 0;
        int i122 = 0;
        while (i2 < obj.length()) {
        }
        ArrayList arrayList122 = arrayList9;
        ArrayList arrayList132 = arrayList7;
        if (!arrayList3.isEmpty()) {
        }
        if (z2) {
        }
        this.L = obj;
        this.J = !z2 ? 0.0f : 1.0f;
        if (z2) {
        }
        c();
    }

    public in getCurrencyView() {
        return this.h;
    }

    public yrc getDiamondView() {
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ytc ytcVar = this.c;
        int baseline = ytcVar.getBaseline() + ytcVar.getTop();
        TextView textView = this.f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        this.h.setTranslationY((baseline - r0.getTop()) - r0.getBaseline());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(0, makeMeasureSpec);
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

    public void setScaleProperty(float f) {
        this.P = 1.0f - Math.max(0.0f, Math.min(1.0f, f));
    }

    @Override // snb
    public final void updateColors() {
        si siVar;
        ytc ytcVar = this.c;
        if (ytcVar != null) {
            try {
                int v0 = aob.v0(this.a, this.F);
                ytcVar.setCursorColor(v0);
                ytcVar.setHandlesColor(v0);
                if (!this.G || (siVar = this.h) == null) {
                    return;
                }
                siVar.c.v(v0, false);
                siVar.invalidate();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}

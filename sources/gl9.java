// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gl9 implements kmb, rib {
    public static Paint U;
    public final AtomicReference E;
    public dm F;
    public final f66 G;
    public f66 H;
    public va6 I;
    public m66 J;
    public v59 K;
    public boolean L;
    public npa M;
    public CharacterStyle N;
    public int O;
    public int P;
    public hm Q;
    public gk9 R;
    public final RectF S;
    public View T;
    public final hl9 a;
    public final StaticLayout b;
    public int c;
    public int d;
    public int e;
    public final int f;
    public final int h;
    public final int n;
    public boolean r;
    public final int s;
    public boolean w;
    public final ArrayList x;
    public final Stack y;

    public gl9(hl9 hl9Var, CharSequence charSequence, int i, Layout.Alignment alignment, float f) {
        Paint.FontMetricsInt fontMetricsInt;
        boolean z;
        int i2;
        TextPaint textPaint;
        int i3;
        this.x = new ArrayList();
        this.y = new Stack();
        this.E = new AtomicReference();
        this.S = new RectF();
        this.a = hl9Var;
        TextPaint textPaint2 = hl9Var.w;
        Paint.FontMetricsInt fontMetricsInt2 = textPaint2.getFontMetricsInt();
        boolean z2 = true;
        boolean z3 = false;
        if (ik8.A(charSequence)) {
            for (el9 el9Var : (el9[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), el9.class)) {
                int i4 = el9Var.b & 15;
                if (i4 >= 1 && i4 <= 6) {
                    TextPaint textPaint3 = new TextPaint(textPaint2);
                    el9Var.a(textPaint3);
                    fontMetricsInt = textPaint3.getFontMetricsInt();
                    z = true;
                    break;
                }
            }
        }
        fontMetricsInt = fontMetricsInt2;
        z = false;
        CharSequence n = pv3.n(charSequence, fontMetricsInt, false, null, 0, z ? 0.85f : 1.0f, 0);
        if (n instanceof Spanned) {
            Spanned spanned = (Spanned) n;
            if (((hm[]) spanned.getSpans(0, spanned.length(), hm.class)).length != 0 || ((mv3[]) spanned.getSpans(0, spanned.length(), mv3.class)).length != 0 || ((gk9[]) spanned.getSpans(0, spanned.length(), gk9.class)).length != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n);
                for (hm hmVar : (hm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hm.class)) {
                    hmVar.setPreserveFontMetrics(true);
                }
                for (mv3 mv3Var : (mv3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), mv3.class)) {
                    mv3Var.e = true;
                }
                for (gk9 gk9Var : (gk9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gk9.class)) {
                    if (gk9Var.a.a.s > 0) {
                        gk9Var.e = true;
                    }
                }
                int i5 = 0;
                while (i5 < spannableStringBuilder.length()) {
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '\n', i5);
                    boolean z4 = indexOf >= 0 ? z2 : z3;
                    indexOf = z4 ? indexOf : spannableStringBuilder.length();
                    rc0 s = s(spannableStringBuilder, i5, indexOf, textPaint2);
                    int i6 = s.b;
                    if (i6 <= 0 || s.a * 100 < i6 * 70 || (i3 = s.c) <= 0) {
                        textPaint = textPaint2;
                    } else {
                        hm[] hmVarArr = (hm[]) spannableStringBuilder.getSpans(i5, indexOf, hm.class);
                        int length = hmVarArr.length;
                        int i7 = 0;
                        while (i7 < length) {
                            hm hmVar2 = hmVarArr[i7];
                            TextPaint textPaint4 = textPaint2;
                            int spanStart = spannableStringBuilder.getSpanStart(hmVar2);
                            if (spanStart >= i5 && spanStart < indexOf) {
                                hmVar2.setMinimumLineHeight(i3);
                            }
                            i7++;
                            textPaint2 = textPaint4;
                        }
                        textPaint = textPaint2;
                        for (mv3 mv3Var2 : (mv3[]) spannableStringBuilder.getSpans(i5, indexOf, mv3.class)) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(mv3Var2);
                            if (spanStart2 >= i5 && spanStart2 < indexOf) {
                                mv3Var2.f = i3;
                            }
                        }
                        gk9[] gk9VarArr = (gk9[]) spannableStringBuilder.getSpans(i5, indexOf, gk9.class);
                        int length2 = gk9VarArr.length;
                        int i8 = 0;
                        while (i8 < length2) {
                            gk9 gk9Var2 = gk9VarArr[i8];
                            int spanStart3 = spannableStringBuilder.getSpanStart(gk9Var2);
                            gk9[] gk9VarArr2 = gk9VarArr;
                            if (gk9Var2.a.a.s > 0 && spanStart3 >= i5 && spanStart3 < indexOf) {
                                gk9Var2.f = i3;
                            }
                            i8++;
                            gk9VarArr = gk9VarArr2;
                        }
                    }
                    if (!z4) {
                        break;
                    }
                    i5 = indexOf + 1;
                    textPaint2 = textPaint;
                    z2 = true;
                    z3 = false;
                }
                n = spannableStringBuilder;
            }
        }
        int d = mm9.d(n);
        this.s = d;
        if (d == 0 && (n instanceof Spanned)) {
            Spanned spanned2 = (Spanned) n;
            gk9[] gk9VarArr3 = (gk9[]) spanned2.getSpans(0, n.length(), gk9.class);
            if (gk9VarArr3.length > 0) {
                Arrays.sort(gk9VarArr3, new db2(spanned2, (byte) 2));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(n);
                int length3 = gk9VarArr3.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length3) {
                        this.s = mm9.d(spannableStringBuilder2);
                        break;
                    }
                    gk9 gk9Var3 = gk9VarArr3[i9];
                    int spanStart4 = spanned2.getSpanStart(gk9Var3);
                    int spanEnd = spanned2.getSpanEnd(gk9Var3);
                    if (spanStart4 < 0 || spanEnd <= spanStart4) {
                        break;
                    }
                    gl9 gl9Var = gk9Var3.a.a;
                    if (gl9Var.s == 0) {
                        break;
                    }
                    spannableStringBuilder2.replace(spanStart4, spanEnd, gl9Var.b.getText());
                    i9++;
                }
            }
        }
        if (this.s > 0 && (n instanceof Spanned)) {
            for (el9 el9Var2 : (el9[]) ((Spanned) n).getSpans(0, n.length(), el9.class)) {
                if ((el9Var2.b & 15) == 14) {
                    el9Var2.d = true;
                }
            }
        }
        if (n instanceof Spanned) {
            el9[] el9VarArr = (el9[]) ((Spanned) n).getSpans(0, n.length(), el9.class);
            int length4 = el9VarArr.length;
            for (int i10 = 0; i10 < length4 && (el9VarArr[i10].b & 15) == 0; i10++) {
            }
        }
        this.b = r47.f5(f, 0.0f, i, alignment, hl9Var.w, n, false);
        this.f = i;
        this.h = 0;
        for (int i11 = 0; i11 < this.b.getLineCount(); i11++) {
            this.f = Math.min(this.f, (int) Math.floor(this.b.getLineLeft(i11)));
            this.h = Math.max(this.h, (int) Math.ceil(this.b.getLineRight(i11)));
        }
        this.n = 0;
        if (this.b.getLineCount() > 0) {
            StaticLayout staticLayout = this.b;
            this.n = (int) Math.ceil(staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        f66 f66Var = null;
        npa.c(null, this.b, this.y, this.x);
        if (this.b.getText() instanceof Spanned) {
            Spanned spanned3 = (Spanned) this.b.getText();
            for (el9 el9Var3 : (el9[]) spanned3.getSpans(0, spanned3.length(), el9.class)) {
                int i12 = el9Var3.b;
                if (TLObject.hasFlag(i12, TLObject.FLAG_13)) {
                    int spanStart5 = spanned3.getSpanStart(el9Var3);
                    int spanEnd2 = spanned3.getSpanEnd(el9Var3);
                    if (spanStart5 >= 0 && spanEnd2 > spanStart5) {
                        if (f66Var == null) {
                            i2 = 0;
                            f66Var = new f66(0);
                            f66Var.n = false;
                        } else {
                            i2 = 0;
                        }
                        f66Var.d(this.b, spanStart5, 0.0f);
                        int L = TLObject.hasFlag(i12, TLObject.FLAG_12) ? -hl.L(6.0f) : TLObject.hasFlag(i12, 2048) ? hl.L(2.0f) : i2;
                        f66Var.o = L != 0 ? L + hl.L(L > 0 ? 5.0f : -2.0f) : i2;
                        this.b.getSelectionPath(spanStart5, spanEnd2, f66Var);
                    }
                }
            }
            if (f66Var != null) {
                f66Var.n = true;
                this.G = f66Var;
            }
        }
    }

    public static rc0 s(Spanned spanned, int i, int i2, TextPaint textPaint) {
        gk9[] gk9VarArr;
        int i3;
        rc0 rc0Var = new rc0();
        int i4 = i2 - i;
        if (i4 > 0) {
            hm[] hmVarArr = (hm[]) spanned.getSpans(i, i2, hm.class);
            mv3[] mv3VarArr = (mv3[]) spanned.getSpans(i, i2, mv3.class);
            int[] iArr = (hmVarArr.length == 0 && mv3VarArr.length == 0) ? null : new int[i4];
            int length = hmVarArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = i5;
                hm hmVar = hmVarArr[i6];
                int spanStart = spanned.getSpanStart(hmVar);
                int min = Math.min(i2, spanned.getSpanEnd(hmVar));
                if (spanStart < i || spanStart >= i2 || min <= spanStart) {
                    i3 = i6;
                } else {
                    int i7 = spanStart - i;
                    iArr[i7] = Math.max(iArr[i7], min);
                    i3 = i6;
                    rc0Var.c = Math.max(rc0Var.c, hmVar.getSize(textPaint, spanned, spanStart, min, null) + 1);
                }
                i5 = i3 + 1;
            }
            for (mv3 mv3Var : mv3VarArr) {
                int spanStart2 = spanned.getSpanStart(mv3Var);
                int min2 = Math.min(i2, spanned.getSpanEnd(mv3Var));
                if (spanStart2 >= i && spanStart2 < i2 && min2 > spanStart2) {
                    int i8 = spanStart2 - i;
                    iArr[i8] = Math.max(iArr[i8], min2);
                    rc0Var.c = Math.max(rc0Var.c, mv3Var.getSize(textPaint, spanned, spanStart2, min2, null));
                }
            }
            gk9[] gk9VarArr2 = (gk9[]) spanned.getSpans(i, i2, gk9.class);
            if (gk9VarArr2.length > 0) {
                gk9VarArr = null;
                for (gk9 gk9Var : gk9VarArr2) {
                    int spanStart3 = spanned.getSpanStart(gk9Var);
                    if (gk9Var.a.a.s > 0 && spanStart3 >= i && spanStart3 < i2) {
                        if (gk9VarArr == null) {
                            gk9VarArr = new gk9[i4];
                        }
                        gk9VarArr[spanStart3 - i] = gk9Var;
                    }
                }
            } else {
                gk9VarArr = null;
            }
            if (iArr != null || gk9VarArr != null) {
                int i9 = i;
                while (i9 < i2) {
                    int i10 = i9 - i;
                    gk9 gk9Var2 = gk9VarArr == null ? null : gk9VarArr[i10];
                    if (gk9Var2 != null) {
                        ek9 ek9Var = gk9Var2.a;
                        gl9 gl9Var = ek9Var.a;
                        gl9 gl9Var2 = ek9Var.a;
                        if (gl9Var.b.getText() instanceof Spanned) {
                            Spanned spanned2 = (Spanned) gl9Var2.b.getText();
                            rc0 s = s(spanned2, 0, spanned2.length(), gl9Var2.b.getPaint());
                            rc0Var.a += s.a;
                            rc0Var.b = Math.max(1, s.b) + rc0Var.b;
                            rc0Var.c = Math.max(rc0Var.c, s.c);
                            i9 = Math.min(i2, spanned.getSpanEnd(gk9Var2));
                        }
                    }
                    int i11 = iArr == null ? 0 : iArr[i10];
                    if (i11 > i9) {
                        rc0Var.a++;
                        rc0Var.b++;
                        i9 = i11;
                    } else {
                        int codePointAt = Character.codePointAt(spanned, i9);
                        if (!Character.isWhitespace(codePointAt)) {
                            rc0Var.b++;
                        }
                        i9 += Character.charCount(codePointAt);
                    }
                }
            }
        }
        return rc0Var;
    }

    @Override // kmb
    public final Layout a() {
        return this.b;
    }

    @Override // rib
    public final int b() {
        return this.s;
    }

    @Override // kmb
    public final Rect c() {
        return null;
    }

    @Override // rib
    public final void d(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        hl9 hl9Var = this.a;
        boolean D = hl9Var.D();
        TextPaint textPaint = hl9Var.w;
        int v0 = aob.v0(D ? aob.Wc : aob.Vc, hl9Var.D);
        textPaint.setColor(v0);
        textPaint.linkColor = aob.v0(hl9Var.D() ? aob.Yc : aob.Xc, hl9Var.D);
        f66 f66Var = this.G;
        if (f66Var != null) {
            if (U == null) {
                Paint paint = new Paint(1);
                U = paint;
                paint.setPathEffect(f66.c());
            }
            U.setColor((hl9Var.y.h() & 16777215) | 855638016);
            canvas.drawPath(f66Var, U);
        }
        View view2 = view != null ? view : this.T;
        m66 m66Var = this.J;
        if (m66Var != null && m66Var.g(canvas) && view2 != null) {
            view2.invalidate();
        }
        StaticLayout staticLayout = this.b;
        AtomicReference atomicReference = this.E;
        ArrayList arrayList = this.x;
        npa.g(view2, false, v0, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        StaticLayout staticLayout2 = this.b;
        xpa.a(canvas, staticLayout2);
        if (!hl9Var.E()) {
            hm.drawAnimatedEmojis(canvas, this.b, this.F, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
        }
        float f = hl9Var.V;
        if (f > 0.0f) {
            r47 r47Var = hl9Var.b;
            boolean z = hl9Var.O || (r47Var != null && uc7.s1(hl9Var.a).i4.z(r47Var));
            if (this.I == null) {
                va6 va6Var = new va6();
                this.I = va6Var;
                va6Var.D = true;
                f66 f66Var2 = new f66(0);
                this.H = f66Var2;
                f66Var2.c = true;
                va6 va6Var2 = this.I;
                va6Var2.y = f66Var2;
                va6Var2.j(5.0f);
                this.I.b = -1L;
                this.H.reset();
                this.H.d(staticLayout2, 0, 0.0f);
                this.H.n = false;
                staticLayout2.getSelectionPath(0, staticLayout2.getText().length(), this.H);
                f66 f66Var3 = this.H;
                f66Var3.n = true;
                f66Var3.a();
                this.I.k();
            }
            va6 va6Var3 = this.I;
            if (z) {
                if (va6Var3.d() || this.I.c()) {
                    va6 va6Var4 = this.I;
                    va6Var4.b = -1L;
                    va6Var4.c = -1L;
                }
            } else if (!va6Var3.d() && !this.I.c()) {
                this.I.a();
            }
            int v02 = aob.v0(hl9Var.D() ? aob.Yc : aob.Xc, hl9Var.D);
            this.I.g(aob.p1(0.05f, v02), aob.p1(0.15f, v02), aob.p1(0.1f, v02), aob.p1(0.3f, v02));
            this.I.setAlpha((int) (f * 255.0f));
            this.I.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean e(gk9 gk9Var, float f, float f2) {
        float L = hl.L(8.0f);
        RectF rectF = gk9Var.c;
        if (f < rectF.left - L || f >= rectF.right + L || f2 < rectF.top - L || f2 >= rectF.bottom + L) {
            StaticLayout staticLayout = this.b;
            gk9 gk9Var2 = null;
            if (staticLayout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) staticLayout.getText();
                gk9[] gk9VarArr = (gk9[]) spanned.getSpans(0, spanned.length(), gk9.class);
                if (gk9VarArr.length == 1) {
                    int spanStart = spanned.getSpanStart(gk9VarArr[0]);
                    int spanEnd = spanned.getSpanEnd(gk9VarArr[0]);
                    int i = 0;
                    while (true) {
                        if (i >= spanned.length()) {
                            gk9Var2 = gk9VarArr[0];
                            break;
                        }
                        if ((i < spanStart || i >= spanEnd) && !Character.isWhitespace(spanned.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                }
            }
            if (gk9Var != gk9Var2 || !this.S.contains(f, f2)) {
                return false;
            }
        }
        return true;
    }

    @Override // rib
    public final void f(View view) {
        View view2 = this.T;
        if (view2 != view || view2 == null) {
            return;
        }
        this.T = null;
        hm.release((View) null, this.F);
        this.F = null;
        m66 m66Var = this.J;
        if (m66Var != null) {
            m66Var.c = null;
        }
        gk9[] p = p();
        if (p != null) {
            for (gk9 gk9Var : p) {
                View view3 = this.T;
                gk9Var.h = null;
                gk9Var.a.a.f(view3);
            }
        }
    }

    @Override // rib
    public final void g(int i) {
        this.e = i;
    }

    @Override // kmb
    public final CharSequence getPrefix() {
        return null;
    }

    @Override // kmb
    public final int getRow() {
        return this.e;
    }

    @Override // kmb
    public final CharSequence getText() {
        if (a() == null) {
            return null;
        }
        return a().getText();
    }

    @Override // kmb
    public final int getX() {
        return this.c;
    }

    @Override // kmb
    public final int getY() {
        return this.d;
    }

    @Override // rib
    public final void h(int i) {
        this.d = i;
    }

    @Override // rib
    public final void i(View view) {
        View view2 = this.T;
        if (view != view2) {
            if (view2 != null) {
                f(view2);
            }
            this.T = view;
            this.F = hm.update(0, view, this.a.v && !this.w, this.F, this.b);
            m66 m66Var = this.J;
            if (m66Var != null) {
                m66Var.c = this.T;
            }
            gk9[] p = p();
            if (p != null) {
                for (gk9 gk9Var : p) {
                    gk9Var.a(this.T);
                }
            }
        }
    }

    @Override // rib
    public final void j(int i) {
        this.c = i;
    }

    public final void k() {
        v59 v59Var = this.K;
        if (v59Var != null) {
            hl.r(v59Var);
            this.K = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        r2 = ((android.text.style.URLSpan) r13).getURL();
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(CharacterStyle characterStyle, boolean z) {
        View view;
        String url;
        String substring;
        RecyclerView recyclerView;
        View view2;
        Context context;
        TL_iv.RichText richText;
        if (characterStyle != null) {
            hl9 hl9Var = this.a;
            if (!z && (characterStyle instanceof URLSpan) && !(characterStyle instanceof f8c) && url != null && url.startsWith("#")) {
                hl9Var.getClass();
                if (url.startsWith("#")) {
                    try {
                        substring = URLDecoder.decode(url.substring(1), "UTF-8");
                    } catch (Exception unused) {
                        substring = url.substring(1);
                    }
                    if (!TextUtils.isEmpty(substring)) {
                        String lowerCase = substring.toLowerCase();
                        TL_iv.textAnchor textanchor = (TL_iv.textAnchor) hl9Var.k.get(lowerCase);
                        if (textanchor != null) {
                            View view3 = hl9Var.Q;
                            if (view3 != null && (context = view3.getContext()) != null && (richText = textanchor.text) != null && !(richText instanceof TL_iv.textEmpty)) {
                                String str = textanchor.name;
                                SpannableStringBuilder l = hl9Var.l(rxc.d(textanchor.text, "", str == null ? "" : str.toLowerCase()), 0);
                                nx0 h = uh9.h(1, hl9Var.D, context, true);
                                h.v0 = false;
                                h.w0 = false;
                                LinearLayout j = uh9.j(context, 1);
                                TextView textView = new TextView(context);
                                textView.setTextSize(1, 16.0f);
                                textView.setTypeface(hl.o());
                                textView.setText(ob6.M0(2131748946, null));
                                textView.setGravity((ob6.a0 ? 5 : 3) | 16);
                                int i = aob.j5;
                                yob.X(textView, i, hl9Var.D);
                                textView.setPadding(hl.L(22.0f), 0, hl.L(22.0f), 0);
                                j.addView(textView, new LinearLayout.LayoutParams(-1, hl.L(48.0f)));
                                p66 p66Var = new p66(context, hl9Var.D);
                                p66Var.setTextSize(1, xea.S0);
                                yob.X(p66Var, i, hl9Var.D);
                                yob.G(p66Var, aob.k5, hl9Var.D);
                                p66Var.setMovementMethod(LinkMovementMethod.getInstance());
                                p66Var.setPadding(hl.L(22.0f), 0, hl.L(22.0f), hl.L(16.0f));
                                p66Var.setText(l);
                                j.addView(p66Var, new LinearLayout.LayoutParams(-1, -2));
                                FrameLayout frameLayout = new FrameLayout(context);
                                frameLayout.addView(j, tre.c(-2.0f, -1));
                                h.O = frameLayout;
                                h.show();
                                view2 = this.T;
                                if (view2 == null) {
                                    view2.playSoundEffect(0);
                                    return;
                                }
                                return;
                            }
                        } else {
                            Integer num = (Integer) hl9Var.j.get(lowerCase);
                            if (num != null) {
                                int intValue = num.intValue();
                                if (hl9Var.E != null && intValue >= 0 && intValue < hl9Var.g.size()) {
                                    ViewParent parent = hl9Var.E.getParent();
                                    while (true) {
                                        if (parent == null) {
                                            recyclerView = null;
                                            break;
                                        } else {
                                            if (parent instanceof RecyclerView) {
                                                recyclerView = (RecyclerView) parent;
                                                break;
                                            }
                                            parent = parent.getParent();
                                        }
                                    }
                                    if (recyclerView != null) {
                                        recyclerView.y0(0, (((hl9Var.E.getTop() + hl9Var.E.u0) + hl9Var.r(intValue, null)) - recyclerView.getPaddingTop()) - hl.L(8.0f), null);
                                    }
                                }
                            }
                            view2 = this.T;
                            if (view2 == null) {
                            }
                        }
                    }
                }
            }
            CharacterStyle e8cVar = ((characterStyle instanceof el9) && TLObject.hasFlag(((el9) characterStyle).b, 256)) ? new e8c(this.b.getText(), this.O, this.P, hl9Var.D() ? (byte) 1 : (byte) 0, null) : characterStyle;
            rb2 rb2Var = hl9Var.F;
            wb2 wb2Var = hl9Var.E;
            if (rb2Var != null && wb2Var != null) {
                View view4 = this.T;
                if (view4 != null && !z) {
                    view4.playSoundEffect(0);
                }
                rb2Var.L(wb2Var, e8cVar, z);
                return;
            }
            if (z || (view = this.T) == null || !(characterStyle instanceof ClickableSpan)) {
                return;
            }
            view.playSoundEffect(0);
            ((ClickableSpan) characterStyle).onClick(this.T);
        }
    }

    public final void m(Canvas canvas, int i, float f) {
        canvas.save();
        canvas.translate(-n(), 0.0f);
        hl9 hl9Var = this.a;
        boolean D = hl9Var.D();
        TextPaint textPaint = hl9Var.w;
        int v0 = aob.v0(D ? aob.Wc : aob.Vc, hl9Var.D);
        textPaint.setColor(v0);
        textPaint.linkColor = aob.v0(hl9Var.D() ? aob.Yc : aob.Xc, hl9Var.D);
        ui7.b(canvas, this.b, i, f, new bf((Object) this, (Object) this.T, v0, (byte) 14));
        canvas.restore();
    }

    public final int n() {
        if (this.r) {
            return 0;
        }
        return this.f;
    }

    public final boolean o(CharacterStyle characterStyle, vj9 vj9Var) {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanEnd = spanned.getSpanEnd(characterStyle);
        if (spanStart < 0 || spanEnd <= spanStart) {
            return false;
        }
        vj9Var.a = staticLayout;
        vj9Var.b = spanStart;
        vj9Var.c = spanEnd;
        vj9Var.d = staticLayout.getWidth();
        return true;
    }

    public final gk9[] p() {
        StaticLayout staticLayout = this.b;
        if (!(staticLayout.getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) staticLayout.getText();
        return (gk9[]) spanned.getSpans(0, spanned.length(), gk9.class);
    }

    public final int q() {
        return Math.max(0, this.n - this.f);
    }

    public final int r() {
        return Math.max(0, this.h - this.f);
    }

    public final boolean t(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        el9 el9Var;
        el9 el9Var2;
        int spanEnd;
        el9 el9Var3;
        int spanStart;
        int actionMasked = motionEvent.getActionMasked();
        int n = n() + ((int) motionEvent.getX());
        int y = (int) motionEvent.getY();
        ArrayList arrayList = this.x;
        hl9 hl9Var = this.a;
        StaticLayout staticLayout = this.b;
        boolean z3 = true;
        int i = 0;
        if (actionMasked == 0) {
            this.M = null;
            this.N = null;
            this.Q = null;
            this.R = null;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                npa npaVar = (npa) obj;
                if (npaVar.getBounds().contains(n, y)) {
                    this.M = npaVar;
                    return true;
                }
            }
            gk9[] p = p();
            if (p != null) {
                for (gk9 gk9Var : p) {
                    if (e(gk9Var, n, y)) {
                        ek9 ek9Var = gk9Var.a;
                        if (ek9Var.b) {
                            return true;
                        }
                        this.R = gk9Var;
                        this.L = false;
                        ek9Var.m(true);
                        View view = this.T;
                        if (view != null) {
                            view.invalidate();
                        }
                        u();
                        return true;
                    }
                }
            }
            if ((staticLayout.getText() instanceof Spannable) && y >= 0 && y < staticLayout.getHeight()) {
                int lineForVertical = staticLayout.getLineForVertical(y);
                float lineLeft = staticLayout.getLineLeft(lineForVertical);
                float lineWidth = staticLayout.getLineWidth(lineForVertical) + lineLeft;
                float f = n;
                if (f >= lineLeft && f <= lineWidth) {
                    int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f);
                    Spannable spannable = (Spannable) staticLayout.getText();
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                        ClickableSpan clickableSpan = clickableSpanArr[0];
                        this.N = clickableSpan;
                        this.O = spannable.getSpanStart(clickableSpan);
                        this.P = spannable.getSpanEnd(this.N);
                        this.L = false;
                        q66 q66Var = new q66(this.N, hl9Var.D, f, y, 0);
                        f66 b = q66Var.b();
                        b.d(staticLayout, this.O, 0.0f);
                        staticLayout.getSelectionPath(this.O, this.P, b);
                        m66 m66Var = this.J;
                        if (m66Var == null) {
                            m66Var = new m66(this.T);
                            this.J = m66Var;
                        }
                        m66Var.a(q66Var, null);
                        View view2 = this.T;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        u();
                        return true;
                    }
                    el9[] el9VarArr = (el9[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, el9.class);
                    if (el9VarArr != null) {
                        int length = el9VarArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            z2 = z3;
                            el9Var = el9VarArr[i3];
                            if (TLObject.hasFlag(el9Var.b, 256)) {
                                break;
                            }
                            i3++;
                            z3 = z2;
                        }
                    }
                    z2 = z3;
                    el9Var = null;
                    if (el9Var != null) {
                        int spanStart2 = spannable.getSpanStart(el9Var);
                        int spanEnd2 = spannable.getSpanEnd(el9Var);
                        while (spanStart2 > 0) {
                            int i4 = spanStart2 - 1;
                            el9[] el9VarArr2 = (el9[]) spannable.getSpans(i4, i4, el9.class);
                            int length2 = el9VarArr2.length;
                            int i5 = i;
                            while (true) {
                                if (i5 >= length2) {
                                    el9Var3 = null;
                                    break;
                                }
                                el9Var3 = el9VarArr2[i5];
                                if (TLObject.hasFlag(el9Var3.b, 256)) {
                                    break;
                                }
                                i5++;
                            }
                            if (el9Var3 == null || (spanStart = spannable.getSpanStart(el9Var3)) >= spanStart2) {
                                break;
                            }
                            spanStart2 = spanStart;
                            i = 0;
                        }
                        while (spanEnd2 < spannable.length()) {
                            el9[] el9VarArr3 = (el9[]) spannable.getSpans(spanEnd2, spanEnd2, el9.class);
                            int length3 = el9VarArr3.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length3) {
                                    el9Var2 = null;
                                    break;
                                }
                                el9Var2 = el9VarArr3[i6];
                                if (TLObject.hasFlag(el9Var2.b, 256)) {
                                    break;
                                }
                                i6++;
                            }
                            if (el9Var2 == null || (spanEnd = spannable.getSpanEnd(el9Var2)) <= spanEnd2) {
                                break;
                            }
                            spanEnd2 = spanEnd;
                        }
                        this.N = el9Var;
                        this.O = spanStart2;
                        this.P = spanEnd2;
                        this.L = false;
                        q66 q66Var2 = new q66(el9Var, hl9Var.D, f, y, 0);
                        f66 b2 = q66Var2.b();
                        b2.d(staticLayout, spanStart2, 0.0f);
                        staticLayout.getSelectionPath(spanStart2, spanEnd2, b2);
                        m66 m66Var2 = this.J;
                        if (m66Var2 == null) {
                            m66Var2 = new m66(this.T);
                            this.J = m66Var2;
                        }
                        m66Var2.a(q66Var2, null);
                        View view3 = this.T;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        u();
                        return z2;
                    }
                    hm[] hmVarArr = (hm[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, hm.class);
                    if (hmVarArr != null && hmVarArr.length > 0) {
                        this.Q = hmVarArr[0];
                        return z2;
                    }
                }
            }
            return false;
        }
        if (actionMasked == 2) {
            gk9 gk9Var2 = this.R;
            if (gk9Var2 != null) {
                if (e(gk9Var2, n, y)) {
                    return true;
                }
                k();
                this.R.a.m(false);
                this.R = null;
                this.L = false;
                return true;
            }
        } else {
            if (actionMasked == 1) {
                if (this.R != null) {
                    k();
                    gk9 gk9Var3 = this.R;
                    this.R = null;
                    gk9Var3.a.m(false);
                    if (this.L) {
                        z = false;
                    } else {
                        View view4 = this.T;
                        if (view4 != null) {
                            view4.playSoundEffect(0);
                        }
                        wb2 wb2Var = hl9Var.E;
                        rb2 rb2Var = hl9Var.F;
                        if (wb2Var != null && rb2Var != null) {
                            rb2Var.I0(wb2Var, gk9Var3.b);
                        }
                        z = false;
                    }
                    this.L = z;
                    return true;
                }
                if (this.M != null) {
                    float width = staticLayout.getWidth();
                    float height = staticLayout.getHeight();
                    float sqrt = (float) Math.sqrt((height * height) + (width * width));
                    View view5 = this.T;
                    this.M.q = new fl9(this, view5, hl9Var);
                    int size2 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj2 = arrayList.get(i7);
                        i7++;
                        ((npa) obj2).j(n, y, sqrt, false);
                    }
                    if (view5 != null) {
                        view5.playSoundEffect(0);
                    }
                    this.M = null;
                    return true;
                }
                if (this.N != null) {
                    k();
                    if (!this.L) {
                        l(this.N, false);
                    }
                    m66 m66Var3 = this.J;
                    if (m66Var3 != null) {
                        m66Var3.e(true);
                    }
                    this.N = null;
                    this.L = false;
                    return true;
                }
                hm hmVar = this.Q;
                if (hmVar == null) {
                    return false;
                }
                this.Q = null;
                wb2 wb2Var2 = hl9Var.E;
                rb2 rb2Var2 = hl9Var.F;
                if (wb2Var2 == null || rb2Var2 == null) {
                    return true;
                }
                View view6 = this.T;
                if (view6 != null) {
                    view6.playSoundEffect(0);
                }
                rb2Var2.A1(hmVar);
                return true;
            }
            if (actionMasked == 3) {
                this.M = null;
                this.Q = null;
                if (this.R != null) {
                    k();
                    this.R.a.m(false);
                    this.R = null;
                    this.L = false;
                }
                if (this.N != null) {
                    k();
                    m66 m66Var4 = this.J;
                    if (m66Var4 != null) {
                        m66Var4.e(true);
                    }
                    this.N = null;
                    this.L = false;
                    return false;
                }
            }
        }
        return false;
    }

    public final void u() {
        k();
        v59 v59Var = new v59(this, (byte) 13);
        this.K = v59Var;
        hl.d3(v59Var, ViewConfiguration.getLongPressTimeout());
    }

    public gl9(hl9 hl9Var, SpannableStringBuilder spannableStringBuilder, int i, Layout.Alignment alignment) {
        this(hl9Var, spannableStringBuilder, i, alignment, 1.0f);
    }

    public gl9(hl9 hl9Var, SpannableStringBuilder spannableStringBuilder, int i) {
        this(hl9Var, spannableStringBuilder, i, Layout.Alignment.ALIGN_NORMAL);
    }
}

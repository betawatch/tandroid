package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.lg0;
import org.telegram.ui.ng0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class xt implements lg0 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public org.telegram.ui.Components.gc K;
    public ng0 L;
    public du M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final cv a;
    public final Rect b;
    public final int c;
    public StaticLayout d;
    public float e;
    public int f;
    public int h;
    public int n;
    public CheckBoxBase r;
    public float s;
    public int w;
    public boolean x;
    public boolean y;
    public final RectF I = new RectF();
    public boolean R = true;
    public boolean S = true;

    public xt(cv cvVar, Rect rect, int i3) {
        this.a = cvVar;
        this.b = new Rect(rect);
        this.c = (i3 - rect.left) - rect.right;
    }

    public static CharSequence h0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        org.telegram.ui.Cells.n9[] n9VarArr = (org.telegram.ui.Cells.n9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.n9.class);
        if (n9VarArr == null || n9VarArr.length == 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Arrays.sort(n9VarArr, new wt(spanned, 0));
        for (org.telegram.ui.Cells.n9 n9Var : n9VarArr) {
            int spanStart = spanned.getSpanStart(n9Var);
            int spanEnd = spanned.getSpanEnd(n9Var);
            if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                CharSequence charSequence2 = n9Var.a;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                spannableStringBuilder.replace(spanStart, spanEnd, charSequence2);
            }
        }
        return spannableStringBuilder;
    }

    public static void l(SpannableStringBuilder spannableStringBuilder, bv bvVar, bv[] bvVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (bvVar != null && (staticLayout2 = bvVar.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(h0(staticLayout2.getText()));
            return;
        }
        if (bvVarArr != null) {
            for (bv bvVar2 : bvVarArr) {
                if (bvVar2 != null && (staticLayout = bvVar2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(h0(staticLayout.getText()));
                }
            }
        }
    }

    public void A(int i3, Rect rect) {
        int i10 = this.b.left;
        float f10 = this.N;
        rect.set(i10, (int) f10, this.c + i10, (int) (f10 + I()));
    }

    public int B() {
        return 0;
    }

    public CharSequence D() {
        return null;
    }

    public CharSequence E(int i3) {
        return null;
    }

    public final RectF F() {
        cv cvVar = this.a;
        float textY = cvVar.E.getTextY() + this.N;
        Rect rect = this.b;
        float f10 = textY + rect.top;
        return new RectF(g0.L(4.0f) + (cvVar.E.getTextX() - cvVar.S), f10, ((cvVar.E.getTextX() + cvVar.C) + cvVar.T) - g0.L(4.0f), ((I() + f10) - rect.top) - rect.bottom);
    }

    public final boolean G() {
        TLObject tLObject = this.H;
        if (tLObject instanceof TL_iv.PageListItem) {
            return ((TL_iv.PageListItem) tLObject).checked;
        }
        if (tLObject instanceof TL_iv.PageListOrderedItem) {
            return ((TL_iv.PageListOrderedItem) tLObject).checked;
        }
        CheckBoxBase checkBoxBase = this.r;
        return checkBoxBase != null && checkBoxBase.q;
    }

    public int H() {
        return 0;
    }

    public abstract int I();

    public int J() {
        return K();
    }

    public int K() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    public org.telegram.ui.Cells.s9[] L() {
        return null;
    }

    public final boolean N(int i3) {
        return this.r != null && i3 == 0 && G();
    }

    public final boolean O(int i3) {
        return this.r == null || i3 != 0 || n();
    }

    public final boolean P(int i3) {
        return (this.r == null || i3 != 0) && (this instanceof du);
    }

    public boolean Q() {
        return false;
    }

    public final boolean R() {
        int indexOf;
        cv cvVar = this.a;
        if (cvVar.h.isEmpty() || (indexOf = cvVar.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i3 = 0; i3 < cvVar.h.size(); i3++) {
            tt ttVar = (tt) cvVar.h.get(i3);
            if (indexOf >= ttVar.a && indexOf <= ttVar.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        du duVar = this.M;
        if (duVar == null) {
            return true;
        }
        if (duVar.X.open) {
            return duVar.S();
        }
        return false;
    }

    public boolean U(int i3, View view) {
        return false;
    }

    public void X(Canvas canvas, int i3, float f10) {
        W(canvas);
    }

    public boolean Y(MotionEvent motionEvent) {
        return false;
    }

    public void Z(int i3, int i10, int i11) {
        this.T = i3;
        this.U = i10;
        this.V = i11;
        org.telegram.ui.Cells.s9[] L = L();
        if (L == null) {
            return;
        }
        for (org.telegram.ui.Cells.s9 s9Var : L) {
            if (s9Var instanceof bv) {
                bv bvVar = (bv) s9Var;
                bvVar.c = i3 - bvVar.f;
                bvVar.d = i10;
                bvVar.e = i11;
            }
        }
    }

    @Override // org.telegram.ui.lg0
    public Layout a() {
        return null;
    }

    public final void a0(boolean z10) {
        View view = this.W;
        if (view == null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void b(boolean z10) {
        a0(z10);
    }

    public final void b0(TLObject tLObject, boolean z10) {
        this.H = tLObject;
        if (this.r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this.a.D);
            this.r = checkBoxBase;
            checkBoxBase.h(org.telegram.ui.ActionBar.k6.Vl, org.telegram.ui.ActionBar.k6.z5, org.telegram.ui.ActionBar.k6.k7);
            this.r.d(10);
            this.r.k(true);
            this.r.i(g0.L(5.0f));
        }
        this.r.f(-1, z10, false);
        g0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(String str) {
        String str2;
        cv cvVar = this.a;
        cvVar.x.setTextSize(g0.L(az.W0));
        Layout a10 = a();
        CharSequence text = a10 == null ? null : a10.getText();
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (yu yuVar : (yu[]) ((Spanned) text).getSpans(0, 1, yu.class)) {
                if (TLObject.hasFlag(yuVar.b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i3 = this.n;
        if (i3 <= 0) {
            boolean I = cvVar.I();
            Rect rect = this.b;
            i3 = Math.max(I ? rect.right : rect.left, g0.L(cvVar.M + 4));
        }
        this.d = new StaticLayout(str2, cvVar.x, i3, cvVar.I() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
        this.f = g0.L(cvVar.M + 4);
        this.h = 0;
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.f = Math.min(this.f, (int) this.d.getLineLeft(i10));
            this.h = Math.max(this.h, (int) this.d.getLineRight(i10));
        }
        g0();
    }

    public void d0() {
        this.P = this.N;
        this.Q = this.O;
        this.S = this.R;
    }

    @Override // org.telegram.ui.lg0
    public final View e() {
        return null;
    }

    public final void e0() {
        if (n()) {
            cv cvVar = this.a;
            if (!hp.s1(cvVar.a).s4()) {
                new vg.v0(43, cvVar.E.getContext(), cvVar.D).show();
                return;
            }
            boolean z10 = !G();
            TLObject tLObject = this.H;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z10;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
            }
            View view = cvVar.Q;
            if (view != null) {
                this.r.a = view;
            }
            this.r.f(-1, z10, true);
            View view2 = cvVar.Q;
            if (view2 != null) {
                view2.invalidate();
            }
            View view3 = cvVar.Q;
            if (view3 != null) {
                view3.performHapticFeedback(3, 2);
            }
            cvVar.F.Q1(cvVar.E, new g10(5, this, z10));
        }
    }

    public final boolean f0(MotionEvent motionEvent) {
        View view;
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (this.r != null) {
                int actionMasked = motionEvent.getActionMasked();
                boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
                cv cvVar = this.a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.J = true;
                        if (this.K == null && (view = cvVar.Q) != null) {
                            this.K = new org.telegram.ui.Components.gc(view);
                        }
                        org.telegram.ui.Components.gc gcVar = this.K;
                        if (gcVar != null) {
                            gcVar.c(true);
                        }
                        View view2 = cvVar.Q;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        motionEvent.offsetLocation(rect.left, rect.top);
                        return true;
                    }
                } else if (this.J) {
                    if (actionMasked == 2) {
                        if (!contains) {
                            this.J = false;
                            org.telegram.ui.Components.gc gcVar2 = this.K;
                            if (gcVar2 != null) {
                                gcVar2.c(false);
                            }
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = actionMasked == 1 && contains;
                        this.J = false;
                        org.telegram.ui.Components.gc gcVar3 = this.K;
                        if (gcVar3 != null) {
                            gcVar3.c(false);
                        }
                        if (z10) {
                            e0();
                        }
                        View view3 = cvVar.Q;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                    }
                    motionEvent.offsetLocation(rect.left, rect.top);
                    return true;
                }
            }
            boolean Y = Y(motionEvent);
            motionEvent.offsetLocation(rect.left, rect.top);
            return Y;
        } catch (Throwable th2) {
            motionEvent.offsetLocation(rect.left, rect.top);
            throw th2;
        }
    }

    public final void g0() {
        StaticLayout staticLayout = this.d;
        Rect rect = this.b;
        cv cvVar = this.a;
        if (staticLayout != null) {
            if (a() == null || a().getLineCount() <= 0 || this.d.getLineCount() <= 0) {
                this.e = (Math.min(g0.L(cvVar.M + 14), (I() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            } else {
                this.e = (a().getLineBaseline(0) + H()) - this.d.getLineBaseline(0);
            }
        }
        if (this.r != null) {
            if (a() == null || a().getLineCount() <= 0) {
                this.s = (Math.min(g0.L(cvVar.M + 14), (I() - rect.top) - rect.bottom) - g0.L(20.0f)) / 2.0f;
            } else {
                this.s = (a().getLineBaseline(0) + H()) - (g0.L(20.0f) * 0.7f);
            }
        }
    }

    public final void m(View view) {
        View view2 = this.W;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            V();
            CheckBoxBase checkBoxBase = this.r;
            if (checkBoxBase != null) {
                checkBoxBase.l = false;
            }
            this.W = null;
        }
        this.W = view;
        CheckBoxBase checkBoxBase2 = this.r;
        if (checkBoxBase2 != null) {
            checkBoxBase2.a = view;
            checkBoxBase2.l = true;
        }
        T();
    }

    public final boolean n() {
        cv cvVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        return (this.r == null || this.H == null || (q1Var = (cvVar = this.a).E) == null || (l1Var = cvVar.F) == null || !l1Var.S(q1Var)) ? false : true;
    }

    public void p(ArrayList arrayList) {
        arrayList.add(this);
    }

    public void q(Canvas canvas) {
        r(canvas, TLObject.FLAG_31, 0.0f);
    }

    public final void r(Canvas canvas, int i3, float f10) {
        float N;
        float f11;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        cv cvVar = this.a;
        boolean I = cvVar.I();
        TextPaint textPaint = cvVar.x;
        float L = (((cvVar.C + cvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(g0.L(az.W0));
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.Tc : org.telegram.ui.ActionBar.k6.Sc, cvVar.D));
            canvas.save();
            if (!this.x && !this.y) {
                float N2 = g0.N(5.0f);
                if (I) {
                    N = (this.n + L) - g0.N(0.5f);
                    f11 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + g0.N(0.5f);
                    f11 = this.n;
                }
                canvas.drawCircle(N - f11, (this.e + this.d.getLineBaseline(0)) - (g0.L(az.W0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (I) {
                canvas.translate(((g0.L(0.0f) + L) - this.f) + (this.r != null ? g0.L(26.0f) : 0), this.e);
                this.d.draw(canvas);
            } else {
                canvas.translate((g0.L(0.0f) - this.n) - this.f, this.e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.r != null) {
            int L2 = I ? (int) (L + g0.L(6.0f)) : -g0.L(26.0f);
            this.I.set(L2 - g0.L(6.0f), this.s - g0.L(6.0f), g0.L(6.0f) + g0.L(20.0f) + L2, this.s + g0.L(20.0f) + g0.L(6.0f));
            View view = cvVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.r;
                if (checkBoxBase.a == null) {
                    checkBoxBase.a = view;
                }
            }
            org.telegram.ui.Components.gc gcVar = this.K;
            float a10 = gcVar != null ? gcVar.a(0.1f) : 1.0f;
            canvas.save();
            canvas.scale(a10, a10, g0.L(10.0f) + L2, this.s + g0.L(10.0f));
            this.r.e(L2, (int) this.s, g0.L(20.0f), g0.L(20.0f));
            this.r.a(canvas);
            canvas.restore();
        }
        if (i3 == Integer.MIN_VALUE) {
            W(canvas);
        } else {
            X(canvas, i3, f10);
        }
        canvas.restore();
    }

    public boolean s(Canvas canvas, ColorFilter colorFilter) {
        bv bvVar;
        org.telegram.ui.Components.l5 l5Var;
        org.telegram.ui.Cells.s9[] L = L();
        if (L == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.s9 s9Var : L) {
            if ((s9Var instanceof bv) && (l5Var = (bvVar = (bv) s9Var).F) != null && !l5Var.a.isEmpty()) {
                canvas.save();
                canvas.translate(bvVar.c, bvVar.d - this.N);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, bvVar.b, bvVar.F, 0.0f, bvVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        ng0 ng0Var = this.L;
        if (ng0Var != null && ng0Var.h && ng0Var.d(this) >= 0) {
            if (!ng0Var.i(this)) {
                return;
            }
            if (ng0Var.g(this)) {
                r(canvas, ng0Var.g(this) ? ng0Var.e : -1, ng0Var.g(this) ? ng0Var.f : 0.0f);
                return;
            }
            float c2 = ng0Var.c(this);
            if (c2 <= 0.0f) {
                return;
            }
            if (c2 < 1.0f) {
                Rect rect = this.b;
                int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.c + rect.right, I(), (int) (c2 * 255.0f));
                q(canvas);
                canvas.restoreToCount(saveLayerAlpha);
                return;
            }
        }
        q(canvas);
    }

    public boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        org.telegram.ui.Cells.s9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.s9 s9Var : L) {
                if (s9Var instanceof bv) {
                    if (((bv) s9Var).o(characterStyle, otVar)) {
                        Rect rect = this.b;
                        otVar.e = rect.left - r4.f;
                        otVar.f = i3 + rect.top;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean v() {
        return J() >= K();
    }

    public final void w(int i3, Rect rect) {
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase == null || i3 != 0) {
            A(i3 - (checkBoxBase == null ? 0 : 1), rect);
        } else {
            int i10 = this.b.left;
            float f10 = this.N;
            rect.set(i10, (int) f10, this.c + i10, (int) (f10 + I()));
        }
        cv cvVar = this.a;
        int i11 = -cvVar.S;
        int i12 = cvVar.C + cvVar.T;
        int min = Math.min(i12, Math.max(rect.left, i11));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i12));
    }

    public final CharSequence x(int i3) {
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase == null || i3 != 0) {
            return E(i3 - (checkBoxBase == null ? 0 : 1));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence text = (!this.x || (staticLayout = this.d) == null) ? null : staticLayout.getText();
        CharSequence y9 = y();
        if (!TextUtils.isEmpty(text)) {
            spannableStringBuilder.append(text).append(' ');
        }
        if (!TextUtils.isEmpty(y9)) {
            spannableStringBuilder.append(y9).append(", ");
        }
        k(spannableStringBuilder);
        return spannableStringBuilder.length() > 0 ? spannableStringBuilder : bd.M0(2131754903, null);
    }

    public CharSequence y() {
        int i3 = this.F;
        String M0 = i3 == 0 ? null : bd.M0(i3, null);
        int i10 = this.G;
        String M02 = i10 != 0 ? bd.M0(i10, null) : null;
        return TextUtils.isEmpty(M0) ? M02 : TextUtils.isEmpty(M02) ? M0 : TextUtils.concat(M0, ", ", M02);
    }

    public float z() {
        return 1.0f;
    }

    public void T() {
    }

    public void V() {
    }

    public void W(Canvas canvas) {
    }

    public void k(SpannableStringBuilder spannableStringBuilder) {
    }
}

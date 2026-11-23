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
import org.telegram.ui.wg0;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class au implements wg0 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public org.telegram.ui.Components.mc K;
    public yg0 L;
    public gu M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final fv a;
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

    public au(fv fvVar, Rect rect, int i7) {
        this.a = fvVar;
        this.b = new Rect(rect);
        this.c = (i7 - rect.left) - rect.right;
    }

    public static CharSequence h0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        org.telegram.ui.Cells.p9[] p9VarArr = (org.telegram.ui.Cells.p9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.p9.class);
        if (p9VarArr == null || p9VarArr.length == 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Arrays.sort(p9VarArr, new zt(spanned, 0));
        for (org.telegram.ui.Cells.p9 p9Var : p9VarArr) {
            int spanStart = spanned.getSpanStart(p9Var);
            int spanEnd = spanned.getSpanEnd(p9Var);
            if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                CharSequence charSequence2 = p9Var.a;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                spannableStringBuilder.replace(spanStart, spanEnd, charSequence2);
            }
        }
        return spannableStringBuilder;
    }

    public static void l(SpannableStringBuilder spannableStringBuilder, ev evVar, ev[] evVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (evVar != null && (staticLayout2 = evVar.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(h0(staticLayout2.getText()));
            return;
        }
        if (evVarArr != null) {
            for (ev evVar2 : evVarArr) {
                if (evVar2 != null && (staticLayout = evVar2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(h0(staticLayout.getText()));
                }
            }
        }
    }

    public void A(int i7, Rect rect) {
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

    public CharSequence E(int i7) {
        return null;
    }

    public final RectF F() {
        fv fvVar = this.a;
        float textY = fvVar.E.getTextY() + this.N;
        Rect rect = this.b;
        float f10 = textY + rect.top;
        return new RectF(g0.L(4.0f) + (fvVar.E.getTextX() - fvVar.S), f10, ((fvVar.E.getTextX() + fvVar.C) + fvVar.T) - g0.L(4.0f), ((I() + f10) - rect.top) - rect.bottom);
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

    public org.telegram.ui.Cells.u9[] L() {
        return null;
    }

    public final boolean M(int i7) {
        return this.r != null && i7 == 0 && G();
    }

    public final boolean O(int i7) {
        return this.r == null || i7 != 0 || n();
    }

    public final boolean P(int i7) {
        return (this.r == null || i7 != 0) && (this instanceof gu);
    }

    public boolean Q() {
        return false;
    }

    public final boolean R() {
        int indexOf;
        fv fvVar = this.a;
        if (fvVar.h.isEmpty() || (indexOf = fvVar.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i7 = 0; i7 < fvVar.h.size(); i7++) {
            wt wtVar = (wt) fvVar.h.get(i7);
            if (indexOf >= wtVar.a && indexOf <= wtVar.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        gu guVar = this.M;
        if (guVar == null) {
            return true;
        }
        if (guVar.X.open) {
            return guVar.S();
        }
        return false;
    }

    public boolean U(int i7, View view) {
        return false;
    }

    public void X(Canvas canvas, int i7, float f10) {
        W(canvas);
    }

    public boolean Y(MotionEvent motionEvent) {
        return false;
    }

    public void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        org.telegram.ui.Cells.u9[] L = L();
        if (L == null) {
            return;
        }
        for (org.telegram.ui.Cells.u9 u9Var : L) {
            if (u9Var instanceof ev) {
                ev evVar = (ev) u9Var;
                evVar.c = i7 - evVar.f;
                evVar.d = i10;
                evVar.e = i11;
            }
        }
    }

    @Override // org.telegram.ui.wg0
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
            checkBoxBase.h(org.telegram.ui.ActionBar.m6.Yl, org.telegram.ui.ActionBar.m6.z5, org.telegram.ui.ActionBar.m6.k7);
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
        fv fvVar = this.a;
        fvVar.x.setTextSize(g0.L(cz.W0));
        Layout a10 = a();
        CharSequence text = a10 == null ? null : a10.getText();
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (bv bvVar : (bv[]) ((Spanned) text).getSpans(0, 1, bv.class)) {
                if (TLObject.hasFlag(bvVar.b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i7 = this.n;
        if (i7 <= 0) {
            boolean I = fvVar.I();
            Rect rect = this.b;
            i7 = Math.max(I ? rect.right : rect.left, g0.L(fvVar.M + 4));
        }
        this.d = new StaticLayout(str2, fvVar.x, i7, fvVar.I() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
        this.f = g0.L(fvVar.M + 4);
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

    @Override // org.telegram.ui.wg0
    public final View e() {
        return null;
    }

    public final void e0() {
        if (n()) {
            fv fvVar = this.a;
            if (!np.u1(fvVar.a).B4()) {
                new ug.y0(43, fvVar.E.getContext(), fvVar.D).show();
                return;
            }
            boolean z10 = !G();
            TLObject tLObject = this.H;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z10;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
            }
            View view = fvVar.Q;
            if (view != null) {
                this.r.a = view;
            }
            this.r.f(-1, z10, true);
            View view2 = fvVar.Q;
            if (view2 != null) {
                view2.invalidate();
            }
            View view3 = fvVar.Q;
            if (view3 != null) {
                view3.performHapticFeedback(3, 2);
            }
            fvVar.F.a2(fvVar.E, new j10(5, this, z10));
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
                fv fvVar = this.a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.J = true;
                        if (this.K == null && (view = fvVar.Q) != null) {
                            this.K = new org.telegram.ui.Components.mc(view);
                        }
                        org.telegram.ui.Components.mc mcVar = this.K;
                        if (mcVar != null) {
                            mcVar.c(true);
                        }
                        View view2 = fvVar.Q;
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
                            org.telegram.ui.Components.mc mcVar2 = this.K;
                            if (mcVar2 != null) {
                                mcVar2.c(false);
                            }
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = actionMasked == 1 && contains;
                        this.J = false;
                        org.telegram.ui.Components.mc mcVar3 = this.K;
                        if (mcVar3 != null) {
                            mcVar3.c(false);
                        }
                        if (z10) {
                            e0();
                        }
                        View view3 = fvVar.Q;
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
        fv fvVar = this.a;
        if (staticLayout != null) {
            if (a() == null || a().getLineCount() <= 0 || this.d.getLineCount() <= 0) {
                this.e = (Math.min(g0.L(fvVar.M + 14), (I() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            } else {
                this.e = (a().getLineBaseline(0) + H()) - this.d.getLineBaseline(0);
            }
        }
        if (this.r != null) {
            if (a() == null || a().getLineCount() <= 0) {
                this.s = (Math.min(g0.L(fvVar.M + 14), (I() - rect.top) - rect.bottom) - g0.L(20.0f)) / 2.0f;
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
        fv fvVar;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Cells.m1 m1Var;
        return (this.r == null || this.H == null || (r1Var = (fvVar = this.a).E) == null || (m1Var = fvVar.F) == null || !m1Var.U(r1Var)) ? false : true;
    }

    public void p(ArrayList arrayList) {
        arrayList.add(this);
    }

    public void q(Canvas canvas) {
        r(canvas, TLObject.FLAG_31, 0.0f);
    }

    public final void r(Canvas canvas, int i7, float f10) {
        float N;
        float f11;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        fv fvVar = this.a;
        boolean I = fvVar.I();
        TextPaint textPaint = fvVar.x;
        float L = (((fvVar.C + fvVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(g0.L(cz.W0));
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(fvVar.E() ? org.telegram.ui.ActionBar.m6.Wc : org.telegram.ui.ActionBar.m6.Vc, fvVar.D));
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
                canvas.drawCircle(N - f11, (this.e + this.d.getLineBaseline(0)) - (g0.L(cz.W0) * 0.35f), N2 / 2.0f, textPaint);
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
            View view = fvVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.r;
                if (checkBoxBase.a == null) {
                    checkBoxBase.a = view;
                }
            }
            org.telegram.ui.Components.mc mcVar = this.K;
            float a10 = mcVar != null ? mcVar.a(0.1f) : 1.0f;
            canvas.save();
            canvas.scale(a10, a10, g0.L(10.0f) + L2, this.s + g0.L(10.0f));
            this.r.e(L2, (int) this.s, g0.L(20.0f), g0.L(20.0f));
            this.r.a(canvas);
            canvas.restore();
        }
        if (i7 == Integer.MIN_VALUE) {
            W(canvas);
        } else {
            X(canvas, i7, f10);
        }
        canvas.restore();
    }

    public boolean s(Canvas canvas, ColorFilter colorFilter) {
        ev evVar;
        org.telegram.ui.Components.u5 u5Var;
        org.telegram.ui.Cells.u9[] L = L();
        if (L == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.u9 u9Var : L) {
            if ((u9Var instanceof ev) && (u5Var = (evVar = (ev) u9Var).F) != null && !u5Var.a.isEmpty()) {
                canvas.save();
                canvas.translate(evVar.c, evVar.d - this.N);
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, evVar.b, evVar.F, 0.0f, evVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        yg0 yg0Var = this.L;
        if (yg0Var != null && yg0Var.h && yg0Var.d(this) >= 0) {
            if (!yg0Var.i(this)) {
                return;
            }
            if (yg0Var.g(this)) {
                r(canvas, yg0Var.g(this) ? yg0Var.e : -1, yg0Var.g(this) ? yg0Var.f : 0.0f);
                return;
            }
            float c10 = yg0Var.c(this);
            if (c10 <= 0.0f) {
                return;
            }
            if (c10 < 1.0f) {
                Rect rect = this.b;
                int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.c + rect.right, I(), (int) (c10 * 255.0f));
                q(canvas);
                canvas.restoreToCount(saveLayerAlpha);
                return;
            }
        }
        q(canvas);
    }

    public boolean u(CharacterStyle characterStyle, int i7, rt rtVar) {
        org.telegram.ui.Cells.u9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.u9 u9Var : L) {
                if (u9Var instanceof ev) {
                    if (((ev) u9Var).o(characterStyle, rtVar)) {
                        Rect rect = this.b;
                        rtVar.e = rect.left - r4.f;
                        rtVar.f = i7 + rect.top;
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

    public final void w(int i7, Rect rect) {
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase == null || i7 != 0) {
            A(i7 - (checkBoxBase == null ? 0 : 1), rect);
        } else {
            int i10 = this.b.left;
            float f10 = this.N;
            rect.set(i10, (int) f10, this.c + i10, (int) (f10 + I()));
        }
        fv fvVar = this.a;
        int i11 = -fvVar.S;
        int i12 = fvVar.C + fvVar.T;
        int min = Math.min(i12, Math.max(rect.left, i11));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i12));
    }

    public final CharSequence x(int i7) {
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase == null || i7 != 0) {
            return E(i7 - (checkBoxBase == null ? 0 : 1));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence text = (!this.x || (staticLayout = this.d) == null) ? null : staticLayout.getText();
        CharSequence y10 = y();
        if (!TextUtils.isEmpty(text)) {
            spannableStringBuilder.append(text).append(' ');
        }
        if (!TextUtils.isEmpty(y10)) {
            spannableStringBuilder.append(y10).append(", ");
        }
        k(spannableStringBuilder);
        return spannableStringBuilder.length() > 0 ? spannableStringBuilder : hd.N0(2131754903, null);
    }

    public CharSequence y() {
        int i7 = this.F;
        String N0 = i7 == 0 ? null : hd.N0(i7, null);
        int i10 = this.G;
        String N02 = i10 != 0 ? hd.N0(i10, null) : null;
        return TextUtils.isEmpty(N0) ? N02 : TextUtils.isEmpty(N02) ? N0 : TextUtils.concat(N0, ", ", N02);
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

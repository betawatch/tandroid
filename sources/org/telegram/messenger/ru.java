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
import org.telegram.ui.vh0;
import org.telegram.ui.xh0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class ru implements vh0 {
    public boolean D;
    public int E;
    public int F;
    public TLObject G;
    public boolean I;
    public org.telegram.ui.Components.dc J;
    public xh0 K;
    public xu L;
    public float M;
    public int N;
    public float O;
    public int P;
    public int S;
    public int T;
    public int U;
    public View V;
    public final wv a;
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
    public final RectF H = new RectF();
    public boolean Q = true;
    public boolean R = true;

    public ru(wv wvVar, Rect rect, int i10) {
        this.a = wvVar;
        this.b = new Rect(rect);
        this.c = (i10 - rect.left) - rect.right;
    }

    public static CharSequence g0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        org.telegram.ui.Cells.p9[] p9VarArr = (org.telegram.ui.Cells.p9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.p9.class);
        if (p9VarArr == null || p9VarArr.length == 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Arrays.sort(p9VarArr, new qu(spanned, 0));
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

    public static void l(SpannableStringBuilder spannableStringBuilder, vv vvVar, vv[] vvVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (vvVar != null && (staticLayout2 = vvVar.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(g0(staticLayout2.getText()));
            return;
        }
        if (vvVarArr != null) {
            for (vv vvVar2 : vvVarArr) {
                if (vvVar2 != null && (staticLayout = vvVar2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(g0(staticLayout.getText()));
                }
            }
        }
    }

    public void A(int i10, Rect rect) {
        int i11 = this.b.left;
        float f7 = this.M;
        rect.set(i11, (int) f7, this.c + i11, (int) (f7 + H()));
    }

    public int B() {
        return 0;
    }

    public CharSequence C() {
        return null;
    }

    public CharSequence E(int i10) {
        return null;
    }

    public final boolean F() {
        TLObject tLObject = this.G;
        if (tLObject instanceof TL_iv.PageListItem) {
            return ((TL_iv.PageListItem) tLObject).checked;
        }
        if (tLObject instanceof TL_iv.PageListOrderedItem) {
            return ((TL_iv.PageListOrderedItem) tLObject).checked;
        }
        CheckBoxBase checkBoxBase = this.r;
        return checkBoxBase != null && checkBoxBase.q;
    }

    public int G() {
        return 0;
    }

    public abstract int H();

    public int I() {
        return J();
    }

    public int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    public org.telegram.ui.Cells.u9[] K() {
        return null;
    }

    public final boolean L(int i10) {
        return this.r != null && i10 == 0 && F();
    }

    public final boolean M(int i10) {
        return this.r == null || i10 != 0 || n();
    }

    public final boolean O(int i10) {
        return (this.r == null || i10 != 0) && (this instanceof xu);
    }

    public boolean P() {
        return false;
    }

    public final boolean Q() {
        int indexOf;
        wv wvVar = this.a;
        if (wvVar.h.isEmpty() || (indexOf = wvVar.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i10 = 0; i10 < wvVar.h.size(); i10++) {
            nu nuVar = (nu) wvVar.h.get(i10);
            if (indexOf >= nuVar.a && indexOf <= nuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean R() {
        xu xuVar = this.L;
        if (xuVar == null) {
            return true;
        }
        if (xuVar.W.open) {
            return xuVar.R();
        }
        return false;
    }

    public boolean T(int i10, View view) {
        return false;
    }

    public void W(Canvas canvas, int i10, float f7) {
        V(canvas);
    }

    public boolean X(MotionEvent motionEvent) {
        return false;
    }

    public void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        org.telegram.ui.Cells.u9[] K = K();
        if (K == null) {
            return;
        }
        for (org.telegram.ui.Cells.u9 u9Var : K) {
            if (u9Var instanceof vv) {
                vv vvVar = (vv) u9Var;
                vvVar.c = i10 - vvVar.f;
                vvVar.d = i11;
                vvVar.e = i12;
            }
        }
    }

    public final void Z(boolean z10) {
        View view = this.V;
        if (view == null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    @Override // org.telegram.ui.vh0
    public Layout a() {
        return null;
    }

    public final void a0(TLObject tLObject, boolean z10) {
        this.G = tLObject;
        if (this.r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, null, this.a.D);
            this.r = checkBoxBase;
            checkBoxBase.h(org.telegram.ui.ActionBar.t6.Vl, org.telegram.ui.ActionBar.t6.z5, org.telegram.ui.ActionBar.t6.k7);
            this.r.d(10);
            this.r.k(true);
            this.r.i(i0.L(5.0f));
        }
        this.r.f(-1, z10, false);
        f0();
    }

    public void b(boolean z10) {
        Z(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(String str) {
        String str2;
        wv wvVar = this.a;
        wvVar.x.setTextSize(i0.L(uz.W0));
        Layout a2 = a();
        CharSequence text = a2 == null ? null : a2.getText();
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (sv svVar : (sv[]) ((Spanned) text).getSpans(0, 1, sv.class)) {
                if (TLObject.hasFlag(svVar.b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i10 = this.n;
        if (i10 <= 0) {
            boolean I = wvVar.I();
            Rect rect = this.b;
            i10 = Math.max(I ? rect.right : rect.left, i0.L(wvVar.M + 4));
        }
        this.d = new StaticLayout(str2, wvVar.x, i10, wvVar.I() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
        this.f = i0.L(wvVar.M + 4);
        this.h = 0;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.f = Math.min(this.f, (int) this.d.getLineLeft(i11));
            this.h = Math.max(this.h, (int) this.d.getLineRight(i11));
        }
        f0();
    }

    public void c0() {
        this.O = this.M;
        this.P = this.N;
        this.R = this.Q;
    }

    public final void d0() {
        if (n()) {
            wv wvVar = this.a;
            if (!wp.r1(wvVar.a).p4()) {
                new kg.i1(43, wvVar.E.getContext(), wvVar.D).show();
                return;
            }
            boolean z10 = !F();
            TLObject tLObject = this.G;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z10;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
            }
            View view = wvVar.Q;
            if (view != null) {
                this.r.a = view;
            }
            this.r.f(-1, z10, true);
            View view2 = wvVar.Q;
            if (view2 != null) {
                view2.invalidate();
            }
            View view3 = wvVar.Q;
            if (view3 != null) {
                view3.performHapticFeedback(3, 2);
            }
            wvVar.F.F1(wvVar.E, new d20(5, this, z10));
        }
    }

    @Override // org.telegram.ui.vh0
    public final View e() {
        return null;
    }

    public final boolean e0(MotionEvent motionEvent) {
        View view;
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (this.r != null) {
                int actionMasked = motionEvent.getActionMasked();
                boolean contains = this.H.contains(motionEvent.getX(), motionEvent.getY());
                wv wvVar = this.a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.I = true;
                        if (this.J == null && (view = wvVar.Q) != null) {
                            this.J = new org.telegram.ui.Components.dc(view);
                        }
                        org.telegram.ui.Components.dc dcVar = this.J;
                        if (dcVar != null) {
                            dcVar.c(true);
                        }
                        View view2 = wvVar.Q;
                        if (view2 != null) {
                            view2.invalidate();
                        }
                        motionEvent.offsetLocation(rect.left, rect.top);
                        return true;
                    }
                } else if (this.I) {
                    if (actionMasked == 2) {
                        if (!contains) {
                            this.I = false;
                            org.telegram.ui.Components.dc dcVar2 = this.J;
                            if (dcVar2 != null) {
                                dcVar2.c(false);
                            }
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = actionMasked == 1 && contains;
                        this.I = false;
                        org.telegram.ui.Components.dc dcVar3 = this.J;
                        if (dcVar3 != null) {
                            dcVar3.c(false);
                        }
                        if (z10) {
                            d0();
                        }
                        View view3 = wvVar.Q;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                    }
                    motionEvent.offsetLocation(rect.left, rect.top);
                    return true;
                }
            }
            boolean X = X(motionEvent);
            motionEvent.offsetLocation(rect.left, rect.top);
            return X;
        } catch (Throwable th2) {
            motionEvent.offsetLocation(rect.left, rect.top);
            throw th2;
        }
    }

    public final void f0() {
        StaticLayout staticLayout = this.d;
        Rect rect = this.b;
        wv wvVar = this.a;
        if (staticLayout != null) {
            if (a() == null || a().getLineCount() <= 0 || this.d.getLineCount() <= 0) {
                this.e = (Math.min(i0.L(wvVar.M + 14), (H() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            } else {
                this.e = (a().getLineBaseline(0) + G()) - this.d.getLineBaseline(0);
            }
        }
        if (this.r != null) {
            if (a() == null || a().getLineCount() <= 0) {
                this.s = (Math.min(i0.L(wvVar.M + 14), (H() - rect.top) - rect.bottom) - i0.L(20.0f)) / 2.0f;
            } else {
                this.s = (a().getLineBaseline(0) + G()) - (i0.L(20.0f) * 0.7f);
            }
        }
    }

    public final void m(View view) {
        View view2 = this.V;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            U();
            CheckBoxBase checkBoxBase = this.r;
            if (checkBoxBase != null) {
                checkBoxBase.l = false;
            }
            this.V = null;
        }
        this.V = view;
        CheckBoxBase checkBoxBase2 = this.r;
        if (checkBoxBase2 != null) {
            checkBoxBase2.a = view;
            checkBoxBase2.l = true;
        }
        S();
    }

    public final boolean n() {
        wv wvVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        return (this.r == null || this.G == null || (q1Var = (wvVar = this.a).E) == null || (l1Var = wvVar.F) == null || !l1Var.R(q1Var)) ? false : true;
    }

    public void p(ArrayList arrayList) {
        arrayList.add(this);
    }

    public void q(Canvas canvas) {
        r(canvas, TLObject.FLAG_31, 0.0f);
    }

    public final void r(Canvas canvas, int i10, float f7) {
        float N;
        float f10;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        wv wvVar = this.a;
        boolean I = wvVar.I();
        TextPaint textPaint = wvVar.x;
        float L = (((wvVar.C + wvVar.T) - i0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(i0.L(uz.W0));
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(wvVar.E() ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, wvVar.D));
            canvas.save();
            if (!this.x && !this.y) {
                float N2 = i0.N(5.0f);
                if (I) {
                    N = (this.n + L) - i0.N(0.5f);
                    f10 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + i0.N(0.5f);
                    f10 = this.n;
                }
                canvas.drawCircle(N - f10, (this.e + this.d.getLineBaseline(0)) - (i0.L(uz.W0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (I) {
                canvas.translate(((i0.L(0.0f) + L) - this.f) + (this.r != null ? i0.L(26.0f) : 0), this.e);
                this.d.draw(canvas);
            } else {
                canvas.translate((i0.L(0.0f) - this.n) - this.f, this.e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.r != null) {
            int L2 = I ? (int) (L + i0.L(6.0f)) : -i0.L(26.0f);
            this.H.set(L2 - i0.L(6.0f), this.s - i0.L(6.0f), i0.L(6.0f) + i0.L(20.0f) + L2, this.s + i0.L(20.0f) + i0.L(6.0f));
            View view = wvVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.r;
                if (checkBoxBase.a == null) {
                    checkBoxBase.a = view;
                }
            }
            org.telegram.ui.Components.dc dcVar = this.J;
            float a2 = dcVar != null ? dcVar.a(0.1f) : 1.0f;
            canvas.save();
            canvas.scale(a2, a2, i0.L(10.0f) + L2, this.s + i0.L(10.0f));
            this.r.e(L2, (int) this.s, i0.L(20.0f), i0.L(20.0f));
            this.r.a(canvas);
            canvas.restore();
        }
        if (i10 == Integer.MIN_VALUE) {
            V(canvas);
        } else {
            W(canvas, i10, f7);
        }
        canvas.restore();
    }

    public boolean s(Canvas canvas, ColorFilter colorFilter) {
        vv vvVar;
        org.telegram.ui.Components.k5 k5Var;
        org.telegram.ui.Cells.u9[] K = K();
        if (K == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.u9 u9Var : K) {
            if ((u9Var instanceof vv) && (k5Var = (vvVar = (vv) u9Var).E) != null && !k5Var.a.isEmpty()) {
                canvas.save();
                canvas.translate(vvVar.c, vvVar.d - this.M);
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, vvVar.b, vvVar.E, 0.0f, vvVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        xh0 xh0Var = this.K;
        if (xh0Var != null && xh0Var.h && xh0Var.d(this) >= 0) {
            if (!xh0Var.i(this)) {
                return;
            }
            if (xh0Var.g(this)) {
                r(canvas, xh0Var.g(this) ? xh0Var.e : -1, xh0Var.g(this) ? xh0Var.f : 0.0f);
                return;
            }
            float c10 = xh0Var.c(this);
            if (c10 <= 0.0f) {
                return;
            }
            if (c10 < 1.0f) {
                Rect rect = this.b;
                int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.c + rect.right, H(), (int) (c10 * 255.0f));
                q(canvas);
                canvas.restoreToCount(saveLayerAlpha);
                return;
            }
        }
        q(canvas);
    }

    public boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        org.telegram.ui.Cells.u9[] K = K();
        if (K != null) {
            for (org.telegram.ui.Cells.u9 u9Var : K) {
                if (u9Var instanceof vv) {
                    if (((vv) u9Var).o(characterStyle, iuVar)) {
                        Rect rect = this.b;
                        iuVar.e = rect.left - r4.f;
                        iuVar.f = i10 + rect.top;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean v() {
        return I() >= J();
    }

    public final void w(int i10, Rect rect) {
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase == null || i10 != 0) {
            A(i10 - (checkBoxBase == null ? 0 : 1), rect);
        } else {
            int i11 = this.b.left;
            float f7 = this.M;
            rect.set(i11, (int) f7, this.c + i11, (int) (f7 + H()));
        }
        wv wvVar = this.a;
        int i12 = -wvVar.S;
        int i13 = wvVar.C + wvVar.T;
        int min = Math.min(i13, Math.max(rect.left, i12));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i13));
    }

    public final CharSequence x(int i10) {
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase == null || i10 != 0) {
            return E(i10 - (checkBoxBase == null ? 0 : 1));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence text = (!this.x || (staticLayout = this.d) == null) ? null : staticLayout.getText();
        CharSequence y3 = y();
        if (!TextUtils.isEmpty(text)) {
            spannableStringBuilder.append(text).append(' ');
        }
        if (!TextUtils.isEmpty(y3)) {
            spannableStringBuilder.append(y3).append(", ");
        }
        k(spannableStringBuilder);
        return spannableStringBuilder.length() > 0 ? spannableStringBuilder : dd.L0(2131754903, null);
    }

    public CharSequence y() {
        int i10 = this.E;
        String L0 = i10 == 0 ? null : dd.L0(i10, null);
        int i11 = this.F;
        String L02 = i11 != 0 ? dd.L0(i11, null) : null;
        return TextUtils.isEmpty(L0) ? L02 : TextUtils.isEmpty(L02) ? L0 : TextUtils.concat(L0, ", ", L02);
    }

    public float z() {
        return 1.0f;
    }

    public void S() {
    }

    public void U() {
    }

    public void V(Canvas canvas) {
    }

    public void k(SpannableStringBuilder spannableStringBuilder) {
    }
}

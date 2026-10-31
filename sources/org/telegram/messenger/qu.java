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
import org.telegram.ui.xh0;
import org.telegram.ui.zh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class qu implements xh0 {
    public boolean D;
    public int E;
    public int F;
    public TLObject G;
    public boolean I;
    public org.telegram.ui.Components.dc J;
    public zh0 K;
    public wu L;
    public float M;
    public int N;
    public float O;
    public int P;
    public int S;
    public int T;
    public int U;
    public View V;
    public final vv a;
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

    public qu(vv vvVar, Rect rect, int i10) {
        this.a = vvVar;
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
        Arrays.sort(p9VarArr, new pu(spanned, 0));
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

    public static void l(SpannableStringBuilder spannableStringBuilder, uv uvVar, uv[] uvVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (uvVar != null && (staticLayout2 = uvVar.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(g0(staticLayout2.getText()));
            return;
        }
        if (uvVarArr != null) {
            for (uv uvVar2 : uvVarArr) {
                if (uvVar2 != null && (staticLayout = uvVar2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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

    public CharSequence D() {
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

    public final boolean N(int i10) {
        return this.r == null || i10 != 0 || o();
    }

    public final boolean O(int i10) {
        return (this.r == null || i10 != 0) && (this instanceof wu);
    }

    public boolean P() {
        return false;
    }

    public final boolean Q() {
        int indexOf;
        vv vvVar = this.a;
        if (vvVar.h.isEmpty() || (indexOf = vvVar.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i10 = 0; i10 < vvVar.h.size(); i10++) {
            mu muVar = (mu) vvVar.h.get(i10);
            if (indexOf >= muVar.a && indexOf <= muVar.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean R() {
        wu wuVar = this.L;
        if (wuVar == null) {
            return true;
        }
        if (wuVar.W.open) {
            return wuVar.R();
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
            if (u9Var instanceof uv) {
                uv uvVar = (uv) u9Var;
                uvVar.c = i10 - uvVar.f;
                uvVar.d = i11;
                uvVar.e = i12;
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

    @Override // org.telegram.ui.xh0
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
        vv vvVar = this.a;
        vvVar.x.setTextSize(i0.L(tz.W0));
        Layout a2 = a();
        CharSequence text = a2 == null ? null : a2.getText();
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (rv rvVar : (rv[]) ((Spanned) text).getSpans(0, 1, rv.class)) {
                if (TLObject.hasFlag(rvVar.b, 16)) {
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
            boolean I = vvVar.I();
            Rect rect = this.b;
            i10 = Math.max(I ? rect.right : rect.left, i0.L(vvVar.M + 4));
        }
        this.d = new StaticLayout(str2, vvVar.x, i10, vvVar.I() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
        this.f = i0.L(vvVar.M + 4);
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
        if (o()) {
            vv vvVar = this.a;
            if (!vp.r1(vvVar.a).p4()) {
                new kg.i1(43, vvVar.E.getContext(), vvVar.D).show();
                return;
            }
            boolean z10 = !F();
            TLObject tLObject = this.G;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z10;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
            }
            View view = vvVar.Q;
            if (view != null) {
                this.r.a = view;
            }
            this.r.f(-1, z10, true);
            View view2 = vvVar.Q;
            if (view2 != null) {
                view2.invalidate();
            }
            View view3 = vvVar.Q;
            if (view3 != null) {
                view3.performHapticFeedback(3, 2);
            }
            vvVar.F.F1(vvVar.E, new c20(5, this, z10));
        }
    }

    @Override // org.telegram.ui.xh0
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
                vv vvVar = this.a;
                if (actionMasked == 0) {
                    if (contains && o()) {
                        this.I = true;
                        if (this.J == null && (view = vvVar.Q) != null) {
                            this.J = new org.telegram.ui.Components.dc(view);
                        }
                        org.telegram.ui.Components.dc dcVar = this.J;
                        if (dcVar != null) {
                            dcVar.c(true);
                        }
                        View view2 = vvVar.Q;
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
                        View view3 = vvVar.Q;
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
        vv vvVar = this.a;
        if (staticLayout != null) {
            if (a() == null || a().getLineCount() <= 0 || this.d.getLineCount() <= 0) {
                this.e = (Math.min(i0.L(vvVar.M + 14), (H() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            } else {
                this.e = (a().getLineBaseline(0) + G()) - this.d.getLineBaseline(0);
            }
        }
        if (this.r != null) {
            if (a() == null || a().getLineCount() <= 0) {
                this.s = (Math.min(i0.L(vvVar.M + 14), (H() - rect.top) - rect.bottom) - i0.L(20.0f)) / 2.0f;
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

    public final boolean o() {
        vv vvVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        return (this.r == null || this.G == null || (q1Var = (vvVar = this.a).E) == null || (l1Var = vvVar.F) == null || !l1Var.R(q1Var)) ? false : true;
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
        vv vvVar = this.a;
        boolean I = vvVar.I();
        TextPaint textPaint = vvVar.x;
        float L = (((vvVar.C + vvVar.T) - i0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(i0.L(tz.W0));
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, vvVar.D));
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
                canvas.drawCircle(N - f10, (this.e + this.d.getLineBaseline(0)) - (i0.L(tz.W0) * 0.35f), N2 / 2.0f, textPaint);
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
            View view = vvVar.Q;
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
        uv uvVar;
        org.telegram.ui.Components.k5 k5Var;
        org.telegram.ui.Cells.u9[] K = K();
        if (K == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.u9 u9Var : K) {
            if ((u9Var instanceof uv) && (k5Var = (uvVar = (uv) u9Var).E) != null && !k5Var.a.isEmpty()) {
                canvas.save();
                canvas.translate(uvVar.c, uvVar.d - this.M);
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, uvVar.b, uvVar.E, 0.0f, uvVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        zh0 zh0Var = this.K;
        if (zh0Var != null && zh0Var.h && zh0Var.d(this) >= 0) {
            if (!zh0Var.i(this)) {
                return;
            }
            if (zh0Var.g(this)) {
                r(canvas, zh0Var.g(this) ? zh0Var.e : -1, zh0Var.g(this) ? zh0Var.f : 0.0f);
                return;
            }
            float c10 = zh0Var.c(this);
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

    public boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        org.telegram.ui.Cells.u9[] K = K();
        if (K != null) {
            for (org.telegram.ui.Cells.u9 u9Var : K) {
                if (u9Var instanceof uv) {
                    if (((uv) u9Var).o(characterStyle, huVar)) {
                        Rect rect = this.b;
                        huVar.e = rect.left - r4.f;
                        huVar.f = i10 + rect.top;
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
        vv vvVar = this.a;
        int i12 = -vvVar.S;
        int i13 = vvVar.C + vvVar.T;
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
        return spannableStringBuilder.length() > 0 ? spannableStringBuilder : cd.L0(2131754903, null);
    }

    public CharSequence y() {
        int i10 = this.E;
        String L0 = i10 == 0 ? null : cd.L0(i10, null);
        int i11 = this.F;
        String L02 = i11 != 0 ? cd.L0(i11, null) : null;
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

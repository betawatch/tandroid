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
import org.telegram.ui.rg0;
import org.telegram.ui.tg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class cu implements rg0 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public org.telegram.ui.Components.dc K;
    public tg0 L;
    public iu M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final iv a;
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

    public cu(iv ivVar, Rect rect, int i7) {
        this.a = ivVar;
        this.b = new Rect(rect);
        this.c = (i7 - rect.left) - rect.right;
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
        Arrays.sort(n9VarArr, new bu(spanned, 0));
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

    public static void l(SpannableStringBuilder spannableStringBuilder, hv hvVar, hv[] hvVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (hvVar != null && (staticLayout2 = hvVar.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(h0(staticLayout2.getText()));
            return;
        }
        if (hvVarArr != null) {
            for (hv hvVar2 : hvVarArr) {
                if (hvVar2 != null && (staticLayout = hvVar2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
        iv ivVar = this.a;
        float textY = ivVar.E.getTextY() + this.N;
        Rect rect = this.b;
        float f10 = textY + rect.top;
        return new RectF(g0.L(4.0f) + (ivVar.E.getTextX() - ivVar.S), f10, ((ivVar.E.getTextX() + ivVar.C) + ivVar.T) - g0.L(4.0f), ((I() + f10) - rect.top) - rect.bottom);
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

    public final boolean M(int i7) {
        return this.r != null && i7 == 0 && G();
    }

    public final boolean O(int i7) {
        return this.r == null || i7 != 0 || n();
    }

    public final boolean P(int i7) {
        return (this.r == null || i7 != 0) && (this instanceof iu);
    }

    public boolean Q() {
        return false;
    }

    public final boolean R() {
        int indexOf;
        iv ivVar = this.a;
        if (ivVar.h.isEmpty() || (indexOf = ivVar.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i7 = 0; i7 < ivVar.h.size(); i7++) {
            yt ytVar = (yt) ivVar.h.get(i7);
            if (indexOf >= ytVar.a && indexOf <= ytVar.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        iu iuVar = this.M;
        if (iuVar == null) {
            return true;
        }
        if (iuVar.X.open) {
            return iuVar.S();
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
        org.telegram.ui.Cells.s9[] L = L();
        if (L == null) {
            return;
        }
        for (org.telegram.ui.Cells.s9 s9Var : L) {
            if (s9Var instanceof hv) {
                hv hvVar = (hv) s9Var;
                hvVar.c = i7 - hvVar.f;
                hvVar.d = i10;
                hvVar.e = i11;
            }
        }
    }

    @Override // org.telegram.ui.rg0
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
            checkBoxBase.h(org.telegram.ui.ActionBar.j6.Yl, org.telegram.ui.ActionBar.j6.z5, org.telegram.ui.ActionBar.j6.k7);
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
        iv ivVar = this.a;
        ivVar.x.setTextSize(g0.L(gz.W0));
        Layout a10 = a();
        CharSequence text = a10 == null ? null : a10.getText();
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (ev evVar : (ev[]) ((Spanned) text).getSpans(0, 1, ev.class)) {
                if (TLObject.hasFlag(evVar.b, 16)) {
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
            boolean I = ivVar.I();
            Rect rect = this.b;
            i7 = Math.max(I ? rect.right : rect.left, g0.L(ivVar.M + 4));
        }
        this.d = new StaticLayout(str2, ivVar.x, i7, ivVar.I() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
        this.f = g0.L(ivVar.M + 4);
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

    @Override // org.telegram.ui.rg0
    public final View e() {
        return null;
    }

    public final void e0() {
        if (n()) {
            iv ivVar = this.a;
            if (!np.s1(ivVar.a).s4()) {
                new ug.x0(43, ivVar.E.getContext(), ivVar.D).show();
                return;
            }
            boolean z10 = !G();
            TLObject tLObject = this.H;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z10;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
            }
            View view = ivVar.Q;
            if (view != null) {
                this.r.a = view;
            }
            this.r.f(-1, z10, true);
            View view2 = ivVar.Q;
            if (view2 != null) {
                view2.invalidate();
            }
            View view3 = ivVar.Q;
            if (view3 != null) {
                view3.performHapticFeedback(3, 2);
            }
            ivVar.F.a2(ivVar.E, new l10(5, this, z10));
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
                iv ivVar = this.a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.J = true;
                        if (this.K == null && (view = ivVar.Q) != null) {
                            this.K = new org.telegram.ui.Components.dc(view);
                        }
                        org.telegram.ui.Components.dc dcVar = this.K;
                        if (dcVar != null) {
                            dcVar.c(true);
                        }
                        View view2 = ivVar.Q;
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
                            org.telegram.ui.Components.dc dcVar2 = this.K;
                            if (dcVar2 != null) {
                                dcVar2.c(false);
                            }
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = actionMasked == 1 && contains;
                        this.J = false;
                        org.telegram.ui.Components.dc dcVar3 = this.K;
                        if (dcVar3 != null) {
                            dcVar3.c(false);
                        }
                        if (z10) {
                            e0();
                        }
                        View view3 = ivVar.Q;
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
        iv ivVar = this.a;
        if (staticLayout != null) {
            if (a() == null || a().getLineCount() <= 0 || this.d.getLineCount() <= 0) {
                this.e = (Math.min(g0.L(ivVar.M + 14), (I() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            } else {
                this.e = (a().getLineBaseline(0) + H()) - this.d.getLineBaseline(0);
            }
        }
        if (this.r != null) {
            if (a() == null || a().getLineCount() <= 0) {
                this.s = (Math.min(g0.L(ivVar.M + 14), (I() - rect.top) - rect.bottom) - g0.L(20.0f)) / 2.0f;
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
        iv ivVar;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        return (this.r == null || this.H == null || (q1Var = (ivVar = this.a).E) == null || (l1Var = ivVar.F) == null || !l1Var.S(q1Var)) ? false : true;
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
        iv ivVar = this.a;
        boolean I = ivVar.I();
        TextPaint textPaint = ivVar.x;
        float L = (((ivVar.C + ivVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(g0.L(gz.W0));
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(ivVar.E() ? org.telegram.ui.ActionBar.j6.Wc : org.telegram.ui.ActionBar.j6.Vc, ivVar.D));
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
                canvas.drawCircle(N - f11, (this.e + this.d.getLineBaseline(0)) - (g0.L(gz.W0) * 0.35f), N2 / 2.0f, textPaint);
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
            View view = ivVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.r;
                if (checkBoxBase.a == null) {
                    checkBoxBase.a = view;
                }
            }
            org.telegram.ui.Components.dc dcVar = this.K;
            float a10 = dcVar != null ? dcVar.a(0.1f) : 1.0f;
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
        hv hvVar;
        org.telegram.ui.Components.l5 l5Var;
        org.telegram.ui.Cells.s9[] L = L();
        if (L == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.s9 s9Var : L) {
            if ((s9Var instanceof hv) && (l5Var = (hvVar = (hv) s9Var).F) != null && !l5Var.a.isEmpty()) {
                canvas.save();
                canvas.translate(hvVar.c, hvVar.d - this.N);
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, hvVar.b, hvVar.F, 0.0f, hvVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        tg0 tg0Var = this.L;
        if (tg0Var != null && tg0Var.h && tg0Var.d(this) >= 0) {
            if (!tg0Var.i(this)) {
                return;
            }
            if (tg0Var.g(this)) {
                r(canvas, tg0Var.g(this) ? tg0Var.e : -1, tg0Var.g(this) ? tg0Var.f : 0.0f);
                return;
            }
            float c10 = tg0Var.c(this);
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

    public boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        org.telegram.ui.Cells.s9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.s9 s9Var : L) {
                if (s9Var instanceof hv) {
                    if (((hv) s9Var).o(characterStyle, ttVar)) {
                        Rect rect = this.b;
                        ttVar.e = rect.left - r4.f;
                        ttVar.f = i7 + rect.top;
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
        iv ivVar = this.a;
        int i11 = -ivVar.S;
        int i12 = ivVar.C + ivVar.T;
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
        return spannableStringBuilder.length() > 0 ? spannableStringBuilder : hd.M0(2131754903, null);
    }

    public CharSequence y() {
        int i7 = this.F;
        String M0 = i7 == 0 ? null : hd.M0(i7, null);
        int i10 = this.G;
        String M02 = i10 != 0 ? hd.M0(i10, null) : null;
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

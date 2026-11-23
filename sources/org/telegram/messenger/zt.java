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
import org.telegram.ui.ug0;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class zt implements ug0 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public org.telegram.ui.Components.lc K;
    public wg0 L;
    public fu M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final ev a;
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

    public zt(ev evVar, Rect rect, int i7) {
        this.a = evVar;
        this.b = new Rect(rect);
        this.c = (i7 - rect.left) - rect.right;
    }

    public static CharSequence h0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        org.telegram.ui.Cells.o9[] o9VarArr = (org.telegram.ui.Cells.o9[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Cells.o9.class);
        if (o9VarArr == null || o9VarArr.length == 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Arrays.sort(o9VarArr, new yt(spanned, 0));
        for (org.telegram.ui.Cells.o9 o9Var : o9VarArr) {
            int spanStart = spanned.getSpanStart(o9Var);
            int spanEnd = spanned.getSpanEnd(o9Var);
            if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                CharSequence charSequence2 = o9Var.a;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                spannableStringBuilder.replace(spanStart, spanEnd, charSequence2);
            }
        }
        return spannableStringBuilder;
    }

    public static void l(SpannableStringBuilder spannableStringBuilder, dv dvVar, dv[] dvVarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (dvVar != null && (staticLayout2 = dvVar.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(h0(staticLayout2.getText()));
            return;
        }
        if (dvVarArr != null) {
            for (dv dvVar2 : dvVarArr) {
                if (dvVar2 != null && (staticLayout = dvVar2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
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
        ev evVar = this.a;
        float textY = evVar.E.getTextY() + this.N;
        Rect rect = this.b;
        float f10 = textY + rect.top;
        return new RectF(g0.L(4.0f) + (evVar.E.getTextX() - evVar.S), f10, ((evVar.E.getTextX() + evVar.C) + evVar.T) - g0.L(4.0f), ((I() + f10) - rect.top) - rect.bottom);
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

    public org.telegram.ui.Cells.t9[] L() {
        return null;
    }

    public final boolean M(int i7) {
        return this.r != null && i7 == 0 && G();
    }

    public final boolean O(int i7) {
        return this.r == null || i7 != 0 || n();
    }

    public final boolean P(int i7) {
        return (this.r == null || i7 != 0) && (this instanceof fu);
    }

    public boolean Q() {
        return false;
    }

    public final boolean R() {
        int indexOf;
        ev evVar = this.a;
        if (evVar.h.isEmpty() || (indexOf = evVar.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i7 = 0; i7 < evVar.h.size(); i7++) {
            vt vtVar = (vt) evVar.h.get(i7);
            if (indexOf >= vtVar.a && indexOf <= vtVar.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        fu fuVar = this.M;
        if (fuVar == null) {
            return true;
        }
        if (fuVar.X.open) {
            return fuVar.S();
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
        org.telegram.ui.Cells.t9[] L = L();
        if (L == null) {
            return;
        }
        for (org.telegram.ui.Cells.t9 t9Var : L) {
            if (t9Var instanceof dv) {
                dv dvVar = (dv) t9Var;
                dvVar.c = i7 - dvVar.f;
                dvVar.d = i10;
                dvVar.e = i11;
            }
        }
    }

    @Override // org.telegram.ui.ug0
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
            checkBoxBase.h(org.telegram.ui.ActionBar.n6.Yl, org.telegram.ui.ActionBar.n6.z5, org.telegram.ui.ActionBar.n6.k7);
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
        ev evVar = this.a;
        evVar.x.setTextSize(g0.L(bz.W0));
        Layout a10 = a();
        CharSequence text = a10 == null ? null : a10.getText();
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (av avVar : (av[]) ((Spanned) text).getSpans(0, 1, av.class)) {
                if (TLObject.hasFlag(avVar.b, 16)) {
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
            boolean I = evVar.I();
            Rect rect = this.b;
            i7 = Math.max(I ? rect.right : rect.left, g0.L(evVar.M + 4));
        }
        this.d = new StaticLayout(str2, evVar.x, i7, evVar.I() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
        this.f = g0.L(evVar.M + 4);
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

    @Override // org.telegram.ui.ug0
    public final View e() {
        return null;
    }

    public final void e0() {
        if (n()) {
            ev evVar = this.a;
            if (!mp.u1(evVar.a).B4()) {
                new ug.y0(43, evVar.E.getContext(), evVar.D).show();
                return;
            }
            boolean z10 = !G();
            TLObject tLObject = this.H;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z10;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z10;
            }
            View view = evVar.Q;
            if (view != null) {
                this.r.a = view;
            }
            this.r.f(-1, z10, true);
            View view2 = evVar.Q;
            if (view2 != null) {
                view2.invalidate();
            }
            View view3 = evVar.Q;
            if (view3 != null) {
                view3.performHapticFeedback(3, 2);
            }
            evVar.F.b2(evVar.E, new h10(5, this, z10));
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
                ev evVar = this.a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.J = true;
                        if (this.K == null && (view = evVar.Q) != null) {
                            this.K = new org.telegram.ui.Components.lc(view);
                        }
                        org.telegram.ui.Components.lc lcVar = this.K;
                        if (lcVar != null) {
                            lcVar.c(true);
                        }
                        View view2 = evVar.Q;
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
                            org.telegram.ui.Components.lc lcVar2 = this.K;
                            if (lcVar2 != null) {
                                lcVar2.c(false);
                            }
                        }
                    } else if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = actionMasked == 1 && contains;
                        this.J = false;
                        org.telegram.ui.Components.lc lcVar3 = this.K;
                        if (lcVar3 != null) {
                            lcVar3.c(false);
                        }
                        if (z10) {
                            e0();
                        }
                        View view3 = evVar.Q;
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
        ev evVar = this.a;
        if (staticLayout != null) {
            if (a() == null || a().getLineCount() <= 0 || this.d.getLineCount() <= 0) {
                this.e = (Math.min(g0.L(evVar.M + 14), (I() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            } else {
                this.e = (a().getLineBaseline(0) + H()) - this.d.getLineBaseline(0);
            }
        }
        if (this.r != null) {
            if (a() == null || a().getLineCount() <= 0) {
                this.s = (Math.min(g0.L(evVar.M + 14), (I() - rect.top) - rect.bottom) - g0.L(20.0f)) / 2.0f;
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
        ev evVar;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.Cells.m1 m1Var;
        return (this.r == null || this.H == null || (r1Var = (evVar = this.a).E) == null || (m1Var = evVar.F) == null || !m1Var.Z(r1Var)) ? false : true;
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
        ev evVar = this.a;
        boolean I = evVar.I();
        TextPaint textPaint = evVar.x;
        float L = (((evVar.C + evVar.T) - g0.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(g0.L(bz.W0));
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.Wc : org.telegram.ui.ActionBar.n6.Vc, evVar.D));
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
                canvas.drawCircle(N - f11, (this.e + this.d.getLineBaseline(0)) - (g0.L(bz.W0) * 0.35f), N2 / 2.0f, textPaint);
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
            View view = evVar.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.r;
                if (checkBoxBase.a == null) {
                    checkBoxBase.a = view;
                }
            }
            org.telegram.ui.Components.lc lcVar = this.K;
            float a10 = lcVar != null ? lcVar.a(0.1f) : 1.0f;
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
        dv dvVar;
        org.telegram.ui.Components.t5 t5Var;
        org.telegram.ui.Cells.t9[] L = L();
        if (L == null) {
            return false;
        }
        boolean z10 = false;
        for (org.telegram.ui.Cells.t9 t9Var : L) {
            if ((t9Var instanceof dv) && (t5Var = (dvVar = (dv) t9Var).F) != null && !t5Var.a.isEmpty()) {
                canvas.save();
                canvas.translate(dvVar.c, dvVar.d - this.N);
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar.b, dvVar.F, 0.0f, dvVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z10 = true;
            }
        }
        return z10;
    }

    public void t(Canvas canvas) {
        wg0 wg0Var = this.L;
        if (wg0Var != null && wg0Var.h && wg0Var.d(this) >= 0) {
            if (!wg0Var.i(this)) {
                return;
            }
            if (wg0Var.g(this)) {
                r(canvas, wg0Var.g(this) ? wg0Var.e : -1, wg0Var.g(this) ? wg0Var.f : 0.0f);
                return;
            }
            float c10 = wg0Var.c(this);
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

    public boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        org.telegram.ui.Cells.t9[] L = L();
        if (L != null) {
            for (org.telegram.ui.Cells.t9 t9Var : L) {
                if (t9Var instanceof dv) {
                    if (((dv) t9Var).o(characterStyle, qtVar)) {
                        Rect rect = this.b;
                        qtVar.e = rect.left - r4.f;
                        qtVar.f = i7 + rect.top;
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
        ev evVar = this.a;
        int i11 = -evVar.S;
        int i12 = evVar.C + evVar.T;
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
        return spannableStringBuilder.length() > 0 ? spannableStringBuilder : gd.N0(2131754903, null);
    }

    public CharSequence y() {
        int i7 = this.F;
        String N0 = i7 == 0 ? null : gd.N0(i7, null);
        int i10 = this.G;
        String N02 = i10 != 0 ? gd.N0(i10, null) : null;
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

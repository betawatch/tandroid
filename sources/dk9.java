// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class dk9 implements si7 {
    public boolean E;
    public int F;
    public int G;
    public TLObject H;
    public boolean J;
    public v41 K;
    public ui7 L;
    public jk9 M;
    public float N;
    public int O;
    public float P;
    public int Q;
    public int T;
    public int U;
    public int V;
    public View W;
    public final hl9 a;
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

    public dk9(hl9 hl9Var, Rect rect, int i) {
        this.a = hl9Var;
        this.b = new Rect(rect);
        this.c = (i - rect.left) - rect.right;
    }

    public static CharSequence g0(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        fmb[] fmbVarArr = (fmb[]) spanned.getSpans(0, spanned.length(), fmb.class);
        if (fmbVarArr == null || fmbVarArr.length == 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Arrays.sort(fmbVarArr, new db2(spanned, (byte) 1));
        for (fmb fmbVar : fmbVarArr) {
            int spanStart = spanned.getSpanStart(fmbVar);
            int spanEnd = spanned.getSpanEnd(fmbVar);
            if (spanStart >= 0 && spanEnd >= 0 && spanStart <= spanEnd && spanEnd <= spannableStringBuilder.length()) {
                String str = fmbVar.a;
                if (str == null) {
                    str = "";
                }
                spannableStringBuilder.replace(spanStart, spanEnd, (CharSequence) str);
            }
        }
        return spannableStringBuilder;
    }

    public static void k(SpannableStringBuilder spannableStringBuilder, gl9 gl9Var, gl9[] gl9VarArr) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (gl9Var != null && (staticLayout2 = gl9Var.b) != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            spannableStringBuilder.append(g0(staticLayout2.getText()));
            return;
        }
        if (gl9VarArr != null) {
            for (gl9 gl9Var2 : gl9VarArr) {
                if (gl9Var2 != null && (staticLayout = gl9Var2.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append(g0(staticLayout.getText()));
                }
            }
        }
    }

    public int A() {
        return 0;
    }

    public CharSequence C() {
        return null;
    }

    public CharSequence D(int i) {
        return null;
    }

    public final RectF E() {
        hl9 hl9Var = this.a;
        float textY = hl9Var.E.getTextY() + this.N;
        Rect rect = this.b;
        float f = textY + rect.top;
        return new RectF(hl.L(4.0f) + (hl9Var.E.getTextX() - hl9Var.S), f, ((hl9Var.E.getTextX() + hl9Var.C) + hl9Var.T) - hl.L(4.0f), ((H() + f) - rect.top) - rect.bottom);
    }

    public final boolean F() {
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

    public int G() {
        return 0;
    }

    public int H() {
        Rect rect = this.b;
        return hl.L(62.0f) + rect.top + rect.bottom;
    }

    public int I() {
        return J();
    }

    public int J() {
        Rect rect = this.b;
        return rect.left + this.c + rect.right;
    }

    public kmb[] K() {
        return null;
    }

    public final boolean L(int i) {
        return this.r != null && i == 0 && F();
    }

    public final boolean M(int i) {
        return this.r == null || i != 0 || n();
    }

    public final boolean O(int i) {
        return (this.r == null || i != 0) && (this instanceof jk9);
    }

    public boolean P() {
        return false;
    }

    public final boolean Q() {
        int indexOf;
        hl9 hl9Var = this.a;
        if (hl9Var.h.isEmpty() || (indexOf = hl9Var.g.indexOf(this)) < 0) {
            return false;
        }
        for (int i = 0; i < hl9Var.h.size(); i++) {
            ak9 ak9Var = (ak9) hl9Var.h.get(i);
            if (indexOf >= ak9Var.a && indexOf <= ak9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean R() {
        jk9 jk9Var = this.M;
        if (jk9Var == null) {
            return true;
        }
        if (jk9Var.X.open) {
            return jk9Var.R();
        }
        return false;
    }

    public boolean T(int i, View view) {
        return false;
    }

    public void W(Canvas canvas, int i, float f) {
        V(canvas);
    }

    public boolean X(MotionEvent motionEvent) {
        return false;
    }

    public void Y(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        kmb[] K = K();
        if (K != null) {
            for (kmb kmbVar : K) {
                if (kmbVar instanceof gl9) {
                    gl9 gl9Var = (gl9) kmbVar;
                    gl9Var.c = i - gl9Var.f;
                    gl9Var.d = i2;
                    gl9Var.e = i3;
                }
            }
        }
    }

    public final void Z(boolean z) {
        View view = this.W;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    @Override // si7
    public Layout a() {
        return null;
    }

    public final void a0(TLObject tLObject, boolean z) {
        this.H = tLObject;
        if (this.r == null) {
            CheckBoxBase checkBoxBase = new CheckBoxBase(20, this.a.D, null);
            this.r = checkBoxBase;
            checkBoxBase.h(aob.Yl, aob.z5, aob.k7);
            this.r.d(10);
            this.r.k(true);
            this.r.i(hl.L(5.0f));
        }
        this.r.f(-1, z, false);
        f0();
    }

    public final void b(boolean z) {
        Z(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(String str) {
        String str2;
        hl9 hl9Var = this.a;
        hl9Var.x.setTextSize(hl.L(xea.S0));
        Layout a = a();
        CharSequence text = a == null ? null : a.getText();
        if (!TextUtils.isEmpty(str) && (text instanceof Spanned) && text.length() > 0) {
            for (el9 el9Var : (el9[]) ((Spanned) text).getSpans(0, 1, el9.class)) {
                if (TLObject.hasFlag(el9Var.b, 16)) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                    str2 = spannableString;
                    break;
                }
            }
        }
        str2 = str;
        int i = this.n;
        if (i <= 0) {
            boolean H = hl9Var.H();
            Rect rect = this.b;
            i = Math.max(H ? rect.right : rect.left, hl.L(hl9Var.M + 4));
        }
        this.d = new StaticLayout(str2, hl9Var.x, i, hl9Var.H() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
        this.f = hl.L(hl9Var.M + 4);
        this.h = 0;
        for (int i2 = 0; i2 < this.d.getLineCount(); i2++) {
            this.f = Math.min(this.f, (int) this.d.getLineLeft(i2));
            this.h = Math.max(this.h, (int) this.d.getLineRight(i2));
        }
        f0();
    }

    public void c0() {
        this.P = this.N;
        this.Q = this.O;
        this.S = this.R;
    }

    public final void d0() {
        if (n()) {
            hl9 hl9Var = this.a;
            if (!uc7.s1(hl9Var.a).D4()) {
                new xk8(43, hl9Var.D, hl9Var.E.getContext()).show();
                return;
            }
            boolean z = !F();
            TLObject tLObject = this.H;
            if (tLObject instanceof TL_iv.PageListItem) {
                ((TL_iv.PageListItem) tLObject).checked = z;
            } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                ((TL_iv.PageListOrderedItem) tLObject).checked = z;
            }
            View view = hl9Var.Q;
            if (view != null) {
                this.r.a = view;
            }
            this.r.f(-1, z, true);
            View view2 = hl9Var.Q;
            if (view2 != null) {
                view2.invalidate();
            }
            View view3 = hl9Var.Q;
            if (view3 != null) {
                view3.performHapticFeedback(3, 2);
            }
            hl9Var.F.M1(hl9Var.E, new q38((byte) 5, (Object) this, z));
        }
    }

    @Override // si7
    public final View e() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x000d, B:5:0x0011, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:15:0x003a, B:17:0x0043, B:18:0x0046, B:20:0x004a, B:24:0x004e, B:29:0x0058, B:31:0x005e, B:37:0x006d, B:39:0x0073, B:41:0x0078, B:42:0x007b, B:44:0x007f, B:47:0x008c), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x000d, B:5:0x0011, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:15:0x003a, B:17:0x0043, B:18:0x0046, B:20:0x004a, B:24:0x004e, B:29:0x0058, B:31:0x005e, B:37:0x006d, B:39:0x0073, B:41:0x0078, B:42:0x007b, B:44:0x007f, B:47:0x008c), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x000d, B:5:0x0011, B:9:0x002a, B:11:0x0030, B:13:0x0036, B:15:0x003a, B:17:0x0043, B:18:0x0046, B:20:0x004a, B:24:0x004e, B:29:0x0058, B:31:0x005e, B:37:0x006d, B:39:0x0073, B:41:0x0078, B:42:0x007b, B:44:0x007f, B:47:0x008c), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e0(MotionEvent motionEvent) {
        boolean z;
        v41 v41Var;
        View view;
        View view2;
        Rect rect = this.b;
        motionEvent.offsetLocation(-rect.left, -rect.top);
        try {
            if (this.r != null) {
                int actionMasked = motionEvent.getActionMasked();
                boolean contains = this.I.contains(motionEvent.getX(), motionEvent.getY());
                hl9 hl9Var = this.a;
                if (actionMasked == 0) {
                    if (contains && n()) {
                        this.J = true;
                        v41 v41Var2 = this.K;
                        if (v41Var2 == null && (view2 = hl9Var.Q) != null) {
                            v41Var2 = new v41(view2);
                            this.K = v41Var2;
                        }
                        if (v41Var2 != null) {
                            v41Var2.c(true);
                        }
                        View view3 = hl9Var.Q;
                        if (view3 != null) {
                            view3.invalidate();
                        }
                        return true;
                    }
                } else if (this.J) {
                    if (actionMasked != 2) {
                        if (actionMasked != 1) {
                            if (actionMasked == 3) {
                            }
                        } else if (contains) {
                            z = true;
                            this.J = false;
                            v41Var = this.K;
                            if (v41Var != null) {
                                v41Var.c(false);
                            }
                            if (z) {
                                d0();
                            }
                            view = hl9Var.Q;
                            if (view != null) {
                                view.invalidate();
                            }
                        }
                        z = false;
                        this.J = false;
                        v41Var = this.K;
                        if (v41Var != null) {
                        }
                        if (z) {
                        }
                        view = hl9Var.Q;
                        if (view != null) {
                        }
                    } else if (!contains) {
                        this.J = false;
                        v41 v41Var3 = this.K;
                        if (v41Var3 != null) {
                            v41Var3.c(false);
                        }
                    }
                    return true;
                }
            }
            return X(motionEvent);
        } finally {
            motionEvent.offsetLocation(rect.left, rect.top);
        }
    }

    public final void f0() {
        StaticLayout staticLayout = this.d;
        Rect rect = this.b;
        hl9 hl9Var = this.a;
        if (staticLayout != null) {
            if (a() == null || a().getLineCount() <= 0 || this.d.getLineCount() <= 0) {
                this.e = (Math.min(hl.L(hl9Var.M + 14), (H() - rect.top) - rect.bottom) - this.d.getHeight()) / 2.0f;
            } else {
                this.e = (a().getLineBaseline(0) + G()) - this.d.getLineBaseline(0);
            }
        }
        if (this.r != null) {
            if (a() == null || a().getLineCount() <= 0) {
                this.s = (Math.min(hl.L(hl9Var.M + 14), (H() - rect.top) - rect.bottom) - hl.L(20.0f)) / 2.0f;
            } else {
                this.s = (a().getLineBaseline(0) + G()) - (hl.L(20.0f) * 0.7f);
            }
        }
    }

    public final void m(View view) {
        View view2 = this.W;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            U();
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
        S();
    }

    public final boolean n() {
        hl9 hl9Var;
        wb2 wb2Var;
        rb2 rb2Var;
        return (this.r == null || this.H == null || (wb2Var = (hl9Var = this.a).E) == null || (rb2Var = hl9Var.F) == null || !rb2Var.w0(wb2Var)) ? false : true;
    }

    public void o(ArrayList arrayList) {
        arrayList.add(this);
    }

    public void p(Canvas canvas) {
        q(canvas, TLObject.FLAG_31, 0.0f);
    }

    public final void q(Canvas canvas, int i, float f) {
        float N;
        float f2;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        hl9 hl9Var = this.a;
        boolean H = hl9Var.H();
        TextPaint textPaint = hl9Var.x;
        float L = (((hl9Var.C + hl9Var.T) - hl.L(14.0f)) - rect.right) - rect.left;
        if (this.d != null) {
            textPaint.setTextSize(hl.L(xea.S0));
            textPaint.setColor(aob.v0(hl9Var.D() ? aob.Wc : aob.Vc, hl9Var.D));
            canvas.save();
            if (!this.x && !this.y) {
                float N2 = hl.N(5.0f);
                if (H) {
                    N = (this.n + L) - hl.N(0.5f);
                    f2 = N2 / 2.0f;
                } else {
                    N = (N2 / 2.0f) + hl.N(0.5f);
                    f2 = this.n;
                }
                canvas.drawCircle(N - f2, (this.e + this.d.getLineBaseline(0)) - (hl.L(xea.S0) * 0.35f), N2 / 2.0f, textPaint);
            } else if (H) {
                canvas.translate(((hl.L(0.0f) + L) - this.f) + (this.r != null ? hl.L(26.0f) : 0), this.e);
                this.d.draw(canvas);
            } else {
                canvas.translate((hl.L(0.0f) - this.n) - this.f, this.e);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
        if (this.r != null) {
            int L2 = H ? (int) (L + hl.L(6.0f)) : -hl.L(26.0f);
            this.I.set(L2 - hl.L(6.0f), this.s - hl.L(6.0f), hl.L(6.0f) + hl.L(20.0f) + L2, this.s + hl.L(20.0f) + hl.L(6.0f));
            View view = hl9Var.Q;
            if (view != null) {
                CheckBoxBase checkBoxBase = this.r;
                if (checkBoxBase.a == null) {
                    checkBoxBase.a = view;
                }
            }
            v41 v41Var = this.K;
            float a = v41Var != null ? v41Var.a(0.1f) : 1.0f;
            canvas.save();
            canvas.scale(a, a, hl.L(10.0f) + L2, this.s + hl.L(10.0f));
            this.r.e(L2, (int) this.s, hl.L(20.0f), hl.L(20.0f));
            this.r.a(canvas);
            canvas.restore();
        }
        if (i == Integer.MIN_VALUE) {
            V(canvas);
        } else {
            W(canvas, i, f);
        }
        canvas.restore();
    }

    public boolean r(Canvas canvas, ColorFilter colorFilter) {
        gl9 gl9Var;
        dm dmVar;
        kmb[] K = K();
        if (K == null) {
            return false;
        }
        boolean z = false;
        for (kmb kmbVar : K) {
            if ((kmbVar instanceof gl9) && (dmVar = (gl9Var = (gl9) kmbVar).F) != null && !dmVar.a.isEmpty()) {
                canvas.save();
                canvas.translate(gl9Var.c, gl9Var.d - this.N);
                hm.drawAnimatedEmojis(canvas, gl9Var.b, gl9Var.F, 0.0f, gl9Var.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                canvas.restore();
                z = true;
            }
        }
        return z;
    }

    public void s(Canvas canvas) {
        ui7 ui7Var = this.L;
        if (ui7Var != null && ui7Var.h && ui7Var.d(this) >= 0) {
            if (!ui7Var.i(this)) {
                return;
            }
            if (ui7Var.g(this)) {
                q(canvas, ui7Var.g(this) ? ui7Var.e : -1, ui7Var.g(this) ? ui7Var.f : 0.0f);
                return;
            }
            float c = ui7Var.c(this);
            if (c <= 0.0f) {
                return;
            }
            if (c < 1.0f) {
                Rect rect = this.b;
                int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rect.left + this.c + rect.right, H(), (int) (c * 255.0f));
                p(canvas);
                canvas.restoreToCount(saveLayerAlpha);
                return;
            }
        }
        p(canvas);
    }

    public boolean t(CharacterStyle characterStyle, int i, vj9 vj9Var) {
        kmb[] K = K();
        if (K != null) {
            for (kmb kmbVar : K) {
                if (kmbVar instanceof gl9) {
                    if (((gl9) kmbVar).o(characterStyle, vj9Var)) {
                        Rect rect = this.b;
                        vj9Var.e = rect.left - r4.f;
                        vj9Var.f = i + rect.top;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean u() {
        return I() >= J();
    }

    public final void v(int i, Rect rect) {
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase == null || i != 0) {
            z(i - (checkBoxBase == null ? 0 : 1), rect);
        } else {
            int i2 = this.b.left;
            float f = this.N;
            rect.set(i2, (int) f, this.c + i2, (int) (f + H()));
        }
        hl9 hl9Var = this.a;
        int i3 = -hl9Var.S;
        int i4 = hl9Var.C + hl9Var.T;
        int min = Math.min(i4, Math.max(rect.left, i3));
        rect.left = min;
        rect.right = Math.max(min, Math.min(rect.right, i4));
    }

    public final CharSequence w(int i) {
        StaticLayout staticLayout;
        CheckBoxBase checkBoxBase = this.r;
        if (checkBoxBase == null || i != 0) {
            return D(i - (checkBoxBase == null ? 0 : 1));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence text = (!this.x || (staticLayout = this.d) == null) ? null : staticLayout.getText();
        CharSequence x = x();
        if (!TextUtils.isEmpty(text)) {
            spannableStringBuilder.append(text).append(' ');
        }
        if (!TextUtils.isEmpty(x)) {
            spannableStringBuilder.append(x).append(", ");
        }
        j(spannableStringBuilder);
        return spannableStringBuilder.length() > 0 ? spannableStringBuilder : ob6.M0(2131754899, null);
    }

    public CharSequence x() {
        int i = this.F;
        String M0 = i == 0 ? null : ob6.M0(i, null);
        int i2 = this.G;
        String M02 = i2 != 0 ? ob6.M0(i2, null) : null;
        return TextUtils.isEmpty(M0) ? M02 : TextUtils.isEmpty(M02) ? M0 : TextUtils.concat(M0, ", ", M02);
    }

    public float y() {
        return 1.0f;
    }

    public void z(int i, Rect rect) {
        int i2 = this.b.left;
        float f = this.N;
        rect.set(i2, (int) f, this.c + i2, (int) (f + H()));
    }

    public void S() {
    }

    public void U() {
    }

    public void V(Canvas canvas) {
    }

    public void j(SpannableStringBuilder spannableStringBuilder) {
    }
}

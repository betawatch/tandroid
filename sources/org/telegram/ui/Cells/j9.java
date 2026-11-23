package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.NoCopySpan;
import android.text.SpanWatcher;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public class j9 extends w9 {
    public boolean E0;
    public int r0;
    public int u0;
    public v4.c0 z0;
    public int p0 = -1;
    public int q0 = -1;
    public int s0 = -1;
    public int t0 = -1;
    public int v0 = -1;
    public final SparseArray w0 = new SparseArray();
    public final SparseArray x0 = new SparseArray();
    public final SparseIntArray y0 = new SparseIntArray();
    public final ArrayList A0 = new ArrayList();
    public int B0 = -1;
    public int C0 = -1;
    public int D0 = 0;

    public j9() {
        this.Z = true;
    }

    public static CharSequence Y(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        if (!(charSequence instanceof Spanned)) {
            return charSequence.toString();
        }
        Spanned spanned = (Spanned) charSequence;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            if (!(obj instanceof TextWatcher) && !(obj instanceof SpanWatcher) && !(obj instanceof NoCopySpan)) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                if (spanStart >= 0 && spanEnd >= spanStart && spanStart <= spannableStringBuilder.length()) {
                    spannableStringBuilder.setSpan(obj, spanStart, Math.min(spanEnd, spannableStringBuilder.length()), spanned.getSpanFlags(obj));
                }
            }
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void A(int i7, int i10, boolean z10, float f10, float f11, r9 r9Var) {
        i9 i9Var = (i9) r9Var;
        if (!z10 || i9Var != this.W || f11 != f10) {
            super.A(i7, i10, z10, f10, f11, i9Var);
        } else if (this.j) {
            this.u = i7;
        } else {
            this.v = i7;
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public void F() {
        int d02 = d0((i9) this.W);
        int i7 = this.E0 ? this.q0 : this.t0;
        if (d02 == this.p0 && i7 == this.q0) {
            this.r0 = this.u;
        }
        if (d02 == this.s0 && i7 == this.t0) {
            this.u0 = this.v;
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final void L(r9 r9Var, r9 r9Var2) {
        i9 i9Var = (i9) r9Var;
        int d02 = d0(i9Var);
        if (d02 < 0) {
            return;
        }
        this.s0 = d02;
        this.p0 = d02;
        int i7 = this.v0;
        this.t0 = i7;
        this.q0 = i7;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        i9Var.k(arrayList);
        int size = arrayList.size();
        this.y0.put(d02, size);
        for (int i10 = 0; i10 < size; i10++) {
            W(d02, i10, (u9) arrayList.get(i10));
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final void N() {
        if (x()) {
            this.E0 = false;
            int i7 = this.s0;
            if (i7 >= 0) {
                v4.c0 c0Var = this.z0;
                i9 i9Var = c0Var != null ? (i9) c0Var.m(i7) : i7 < this.F.getChildCount() ? (i9) this.F.getChildAt(this.s0) : null;
                if (i9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = i9Var;
                if (this.p0 != this.s0) {
                    this.u = 0;
                } else if (this.q0 != this.t0) {
                    this.u = 0;
                } else {
                    this.u = this.r0;
                }
                this.v = this.u0;
                CharSequence s5 = s(i9Var, false);
                if (this.v > s5.length()) {
                    this.v = s5.length();
                }
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((i9) this.W).k(arrayList);
                int i10 = this.t0;
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                this.a = ((u9) arrayList.get(this.t0)).getX();
                this.b = ((u9) arrayList.get(this.t0)).getY();
            }
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final void O() {
        if (x()) {
            this.E0 = true;
            int i7 = this.p0;
            if (i7 >= 0) {
                v4.c0 c0Var = this.z0;
                i9 i9Var = c0Var != null ? (i9) c0Var.m(i7) : this.s0 < this.F.getChildCount() ? (i9) this.F.getChildAt(this.p0) : null;
                if (i9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = i9Var;
                if (this.p0 != this.s0) {
                    this.v = s(i9Var, false).length();
                } else if (this.q0 != this.t0) {
                    this.v = s(i9Var, false).length();
                } else {
                    this.v = this.u0;
                }
                this.u = this.r0;
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((i9) this.W).k(arrayList);
                int i10 = this.q0;
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                this.a = ((u9) arrayList.get(this.q0)).getX();
                this.b = ((u9) arrayList.get(this.q0)).getY();
            }
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean P(int i7, int i10) {
        if (this.Z) {
            if (i10 <= ((i9) this.W).getTop() || i10 >= ((i9) this.W).getBottom()) {
                int childCount = this.F.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    if (f0(this.F.getChildAt(i11))) {
                        i9 i9Var = (i9) this.F.getChildAt(i11);
                        if (i10 > i9Var.getTop() && i10 < i9Var.getBottom()) {
                            int c02 = c0((int) (i7 - i9Var.getX()), (int) (i10 - i9Var.getY()), i9Var);
                            if (c02 >= 0) {
                                g0((i9) this.W, i9Var, c02);
                                this.W = i9Var;
                                return true;
                            }
                        }
                    }
                    i11++;
                }
            } else {
                int i12 = this.E0 ? this.q0 : this.t0;
                int c03 = c0((int) (i7 - ((i9) this.W).getX()), (int) (i10 - ((i9) this.W).getY()), (i9) this.W);
                if (c03 != i12 && c03 >= 0) {
                    i9 i9Var2 = (i9) this.W;
                    g0(i9Var2, i9Var2, c03);
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(int i7, int i10, u9 u9Var) {
        int i11 = i7 + (i10 << 16);
        this.w0.put(i11, Y(u9Var.getText()));
        CharSequence prefix = u9Var.getPrefix();
        SparseArray sparseArray = this.x0;
        if (prefix == null) {
            sparseArray.remove(i11);
        } else {
            sparseArray.put(i11, Y(prefix));
        }
    }

    public final void X(int i7, String str) {
        this.w0.put(i7, Y(str));
        this.x0.remove(i7);
        SparseIntArray sparseIntArray = this.y0;
        sparseIntArray.put(i7, Math.max(1, sparseIntArray.get(i7)));
    }

    public final void Z(Canvas canvas, i9 i9Var, int i7) {
        u9 u9Var;
        int i10 = org.telegram.ui.ActionBar.m6.lg;
        this.o.setColor(org.telegram.ui.ActionBar.m6.w0(i10, this.g0));
        this.p.setColor(org.telegram.ui.ActionBar.m6.w0(i10, this.g0));
        int d02 = d0(i9Var);
        if (d02 < 0) {
            return;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        i9Var.k(arrayList);
        if (i7 < 0 || i7 >= arrayList.size() || (u9Var = (u9) arrayList.get(i7)) == null || u9Var.a() == null || u9Var.a().getText() == null) {
            return;
        }
        int i11 = this.u0;
        int length = u9Var.a().getText().length();
        if (i11 > length) {
            i11 = length;
        }
        int i12 = this.p0;
        if (d02 == i12 && d02 == this.s0) {
            int i13 = this.q0;
            int i14 = this.t0;
            if (i13 == i14 && i13 == i7) {
                h(canvas, u9Var.a(), this.r0, i11, true, true, 0.0f);
                return;
            }
            if (i7 == i13) {
                h(canvas, u9Var.a(), this.r0, length, true, false, 0.0f);
                return;
            }
            int i15 = i11;
            if (i7 == i14) {
                h(canvas, u9Var.a(), 0, i15, false, true, 0.0f);
                return;
            } else {
                if (i7 <= i13 || i7 >= i14) {
                    return;
                }
                h(canvas, u9Var.a(), 0, length, false, false, 0.0f);
                return;
            }
        }
        int i16 = i11;
        if (d02 == i12 && this.q0 == i7) {
            h(canvas, u9Var.a(), this.r0, length, true, false, 0.0f);
            return;
        }
        int i17 = this.s0;
        if (d02 == i17 && this.t0 == i7) {
            h(canvas, u9Var.a(), 0, i16, false, true, 0.0f);
            return;
        }
        if ((d02 <= i12 || d02 >= i17) && ((d02 != i12 || i7 <= this.q0) && (d02 != i17 || i7 >= this.t0))) {
            return;
        }
        h(canvas, u9Var.a(), 0, length, false, false, 0.0f);
    }

    public final boolean a0() {
        int i7;
        int length;
        if (x() && this.W != null && this.p0 == this.s0 && (i7 = this.q0) == this.t0) {
            if (i7 < 0) {
                i7 = 0;
            }
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((i9) this.W).k(arrayList);
            if (!arrayList.isEmpty() && i7 < arrayList.size() && (length = ((u9) arrayList.get(i7)).a().getText().length()) > 0 && (this.r0 > 0 || this.u0 < length)) {
                return j0((i9) this.W, i7, 0, length);
            }
        }
        return false;
    }

    public final boolean b0(int i7, int i10, i9 i9Var) {
        int i11;
        int i12;
        int i13;
        int d02 = d0(i9Var);
        if (d02 < 0) {
            return false;
        }
        if (this.B0 < 0) {
            this.B0 = this.p0;
            this.D0 = this.q0;
            this.C0 = this.r0;
        }
        h0(i9Var, d02);
        int i14 = this.B0;
        int i15 = this.D0;
        if ((d02 != i14 ? Integer.compare(d02, i14) : i7 != i15 ? Integer.compare(i7, i15) : Integer.compare(i10, this.C0)) < 0) {
            i13 = this.B0;
            i11 = this.D0;
            i12 = this.C0;
        } else {
            int i16 = this.B0;
            i11 = i7;
            i7 = this.D0;
            i12 = i10;
            i10 = this.C0;
            d02 = i16;
            i13 = d02;
        }
        if (d02 == i13 && i7 == i11 && i10 == i12) {
            f(false);
            return true;
        }
        this.p0 = d02;
        this.q0 = i7;
        this.r0 = i10;
        this.s0 = i13;
        this.t0 = i11;
        this.u0 = i12;
        N();
        w();
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.invalidate();
        }
        f fVar = this.m0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.g3(fVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean c(int i7) {
        if (this.p0 == this.s0 && this.q0 == this.t0) {
            return super.c(i7);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c0(int i7, int i10, i9 i9Var) {
        int i11 = 0;
        if (i9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) i9Var;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof i9) {
                    float f10 = i10;
                    if (f10 > childAt.getY() && f10 < childAt.getY() + childAt.getHeight()) {
                        return c0((int) (i7 - childAt.getX()), (int) (f10 - childAt.getY()), (i9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        i9Var.k(arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        while (true) {
            if (size < 0) {
                i11 = i15;
                size = i14;
                break;
            }
            u9 u9Var = (u9) arrayList.get(size);
            int y10 = u9Var.getY();
            int height = u9Var.a().getHeight() + y10;
            if (i10 >= y10 && i10 < height) {
                break;
            }
            int min = Math.min(Math.abs(i10 - y10), Math.abs(i10 - height));
            if (min < i15) {
                i14 = size;
                i15 = min;
            }
            size--;
        }
        if (size < 0) {
            return -1;
        }
        int row = ((u9) arrayList.get(size)).getRow();
        if (row > 0 && i11 < org.telegram.messenger.g0.L(24.0f)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                u9 u9Var2 = (u9) arrayList.get(size2);
                if (u9Var2.getRow() == row) {
                    int x10 = u9Var2.getX();
                    int width = u9Var2.a().getWidth() + u9Var2.getX();
                    if (i7 >= x10 && i7 <= width) {
                        return size2;
                    }
                    int min2 = Math.min(Math.abs(i7 - x10), Math.abs(i7 - width));
                    if (min2 < i13) {
                        size = size2;
                        i13 = min2;
                    }
                }
            }
        }
        return size;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean d() {
        v4.c0 c0Var = this.z0;
        if (c0Var == null) {
            return true;
        }
        int L0 = c0Var.L0();
        int N0 = this.z0.N0();
        int i7 = this.p0;
        if ((L0 < i7 || L0 > this.s0) && (N0 < i7 || N0 > this.s0)) {
            return i7 >= L0 && this.s0 <= N0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d0(i9 i9Var) {
        ViewGroup viewGroup;
        View view = (View) i9Var;
        ViewParent parent = view.getParent();
        while (true) {
            viewGroup = this.F;
            if (parent != viewGroup && parent != null) {
                if (!(parent instanceof View)) {
                    parent = null;
                    break;
                }
                view = parent;
                parent = view.getParent();
            } else {
                break;
            }
        }
        if (parent != null) {
            return this.E != null ? RecyclerView.R(view) : viewGroup.indexOfChild(view);
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.w9
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final CharSequence s(i9 i9Var, boolean z10) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        i9Var.k(arrayList);
        int i7 = z10 ? this.v0 : this.E0 ? this.q0 : this.t0;
        return (arrayList.isEmpty() || i7 < 0 || i7 >= arrayList.size()) ? "" : ((u9) arrayList.get(i7)).a().getText();
    }

    @Override // org.telegram.ui.Cells.w9
    public final void f(boolean z10) {
        super.f(z10);
        this.p0 = -1;
        this.s0 = -1;
        this.q0 = -1;
        this.t0 = -1;
        this.w0.clear();
        this.y0.clear();
        this.B0 = -1;
        this.C0 = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f0(View view) {
        if (!(view instanceof i9)) {
            return false;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        ((i9) view).k(arrayList);
        if (view instanceof org.telegram.ui.s2) {
            return true;
        }
        return !arrayList.isEmpty();
    }

    public final void g0(i9 i9Var, i9 i9Var2, int i7) {
        int i10;
        int d02 = d0(i9Var2);
        int d03 = i9Var != null ? d0(i9Var) : -1;
        w();
        if (this.R && (i10 = this.p0) == this.s0) {
            if (d02 == i10) {
                if (i7 < this.q0) {
                    this.q0 = i7;
                    O();
                    this.j = true;
                    int i11 = this.v;
                    this.r0 = i11;
                    this.u = i11 - 1;
                } else {
                    this.t0 = i7;
                    N();
                    this.j = false;
                    this.u0 = 0;
                }
            } else if (d02 < i10) {
                this.p0 = d02;
                this.q0 = i7;
                O();
                this.j = true;
                int i12 = this.v;
                this.r0 = i12;
                this.u = i12 - 1;
            } else {
                this.s0 = d02;
                this.t0 = i7;
                N();
                this.j = false;
                this.u0 = 0;
            }
        } else if (this.j) {
            if (d02 == d03) {
                int i13 = this.t0;
                if (i7 <= i13 || d02 < this.s0) {
                    this.p0 = d02;
                    this.q0 = i7;
                    O();
                    this.r0 = this.v;
                } else {
                    this.s0 = d02;
                    this.q0 = i13;
                    this.t0 = i7;
                    this.r0 = this.u0;
                    N();
                    this.u0 = 0;
                    this.j = false;
                }
            } else if (d02 <= this.s0) {
                this.p0 = d02;
                this.q0 = i7;
                O();
                this.r0 = this.v;
            } else {
                this.s0 = d02;
                this.q0 = this.t0;
                this.t0 = i7;
                this.r0 = this.u0;
                N();
                this.u0 = 0;
                this.j = false;
            }
        } else if (d02 == d03) {
            int i14 = this.q0;
            if (i7 >= i14 || d02 > this.p0) {
                this.s0 = d02;
                this.t0 = i7;
                N();
                this.u0 = 0;
            } else {
                this.p0 = d02;
                this.t0 = i14;
                this.q0 = i7;
                this.u0 = this.r0;
                O();
                this.j = true;
                this.r0 = this.v;
            }
        } else if (d02 >= this.p0) {
            this.s0 = d02;
            this.t0 = i7;
            N();
            this.u0 = 0;
        } else {
            this.p0 = d02;
            this.t0 = this.q0;
            this.q0 = i7;
            this.u0 = this.r0;
            O();
            this.j = true;
            this.r0 = this.v;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        i9Var2.k(arrayList);
        int size = arrayList.size();
        this.y0.put(d02, size);
        for (int i15 = 0; i15 < size; i15++) {
            W(d02, i15, (u9) arrayList.get(i15));
        }
    }

    public final void h0(i9 i9Var, int i7) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        i9Var.k(arrayList);
        int size = arrayList.size();
        this.y0.put(i7, size);
        for (int i10 = 0; i10 < size; i10++) {
            W(i7, i10, (u9) arrayList.get(i10));
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final void i(int i7, m9 m9Var, boolean z10) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        m9Var.e = null;
        i9 i9Var = (i9) (z10 ? this.X : this.W);
        if (i9Var == null) {
            m9Var.d = null;
            return;
        }
        i9Var.k(arrayList);
        int i10 = z10 ? this.v0 : this.E0 ? this.q0 : this.t0;
        if (i10 < 0 || i10 >= arrayList.size()) {
            m9Var.d = null;
            return;
        }
        m9Var.d = ((u9) arrayList.get(i10)).a();
        m9Var.e = ((u9) arrayList.get(i10)).c();
        m9Var.b = 0.0f;
        m9Var.c = 0.0f;
    }

    public final void i0(int i7, int i10) {
        i9 i9Var;
        if (i7 < 0 || i10 < i7) {
            return;
        }
        CharSequence charSequence = (CharSequence) this.w0.get(i10);
        int length = charSequence == null ? 0 : charSequence.length();
        if (this.F != null) {
            for (int i11 = 0; i11 < this.F.getChildCount(); i11++) {
                KeyEvent.Callback childAt = this.F.getChildAt(i11);
                if (childAt instanceof i9) {
                    i9Var = (i9) childAt;
                    if (d0(i9Var) == i10) {
                        break;
                    }
                }
            }
        }
        i9Var = null;
        this.W = i9Var;
        this.u = 0;
        this.v = length;
        this.p0 = i7;
        this.s0 = i10;
        this.t0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.u0 = length;
        SparseIntArray sparseIntArray = this.y0;
        sparseIntArray.put(i7, Math.max(1, sparseIntArray.get(i7)));
        sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
        this.B0 = i7;
        this.C0 = 0;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        U();
        w();
        u();
        f fVar = this.m0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.g3(fVar);
        c8.ha haVar = this.D;
        if (haVar != null) {
            haVar.a(true);
        }
    }

    public final boolean j0(i9 i9Var, int i7, int i10, int i11) {
        int d02 = d0(i9Var);
        if (d02 < 0 || i10 == i11) {
            return false;
        }
        int min = Math.min(i10, i11);
        int max = Math.max(i10, i11);
        this.W = i9Var;
        this.u = min;
        this.v = max;
        this.s0 = d02;
        this.p0 = d02;
        this.t0 = i7;
        this.q0 = i7;
        this.r0 = min;
        this.u0 = max;
        this.B0 = d02;
        this.C0 = i10;
        this.D0 = i7;
        h0(i9Var, d02);
        ArrayList arrayList = this.A0;
        if (!arrayList.isEmpty() && i7 >= 0 && i7 < arrayList.size()) {
            this.a = ((u9) arrayList.get(i7)).getX();
            this.b = ((u9) arrayList.get(i7)).getY();
        } else if (!arrayList.isEmpty()) {
            this.a = ((u9) arrayList.get(0)).getX();
            this.b = ((u9) arrayList.get(0)).getY();
        }
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        U();
        w();
        u();
        f fVar = this.m0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.g3(fVar);
        c8.ha haVar = this.D;
        if (haVar != null) {
            haVar.a(true);
        }
        i9Var.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int k(int i7, int i10, int i11, int i12, r9 r9Var, boolean z10) {
        i9 i9Var = (i9) r9Var;
        if (i9Var != null) {
            int i13 = i7 - i11;
            int i14 = i10 - i12;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            i9Var.k(arrayList);
            int i15 = z10 ? this.v0 : this.E0 ? this.q0 : this.t0;
            if (i15 >= 0 && i15 < arrayList.size()) {
                Layout a10 = ((u9) arrayList.get(i15)).a();
                if (i13 < 0) {
                    i13 = 1;
                }
                if (i14 < 0) {
                    i14 = 1;
                }
                if (i13 > a10.getWidth()) {
                    i13 = a10.getWidth();
                }
                if (i14 > a10.getLineBottom(a10.getLineCount() - 1)) {
                    i14 = a10.getLineBottom(a10.getLineCount() - 1) - 1;
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= a10.getLineCount()) {
                        i16 = -1;
                        break;
                    }
                    if (i14 >= a10.getLineTop(i16) && i14 <= a10.getLineBottom(i16)) {
                        break;
                    }
                    i16++;
                }
                if (i16 >= 0) {
                    return a10.getOffsetForHorizontal(i16, i13);
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0(View view, int i7, int i10) {
        if (view instanceof i9) {
            this.s = i7;
            this.t = i10;
            i9 i9Var = (i9) view;
            this.X = i9Var;
            int c02 = c0(i7, i10, i9Var);
            this.v0 = c02;
            if (c02 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.A0;
            this.c = ((u9) arrayList.get(c02)).getX();
            this.d = ((u9) arrayList.get(this.v0)).getY();
        }
    }

    public final void l0() {
        if (this.X != null) {
            this.f0.run();
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final int m() {
        if (this.W != null) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((i9) this.W).k(arrayList);
            int i7 = this.E0 ? this.q0 : this.t0;
            if (i7 >= 0 && i7 < arrayList.size()) {
                Layout a10 = ((u9) arrayList.get(i7)).a();
                int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i11 = 0; i11 < a10.getLineCount(); i11++) {
                    int lineBottom = a10.getLineBottom(i11) - a10.getLineTop(i11);
                    if (lineBottom < i10) {
                        i10 = lineBottom;
                    }
                }
                return i10;
            }
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.w9
    public final CharSequence r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.p0;
        while (true) {
            int i10 = this.s0;
            if (i7 > i10) {
                break;
            }
            int i11 = this.p0;
            SparseIntArray sparseIntArray = this.y0;
            SparseArray sparseArray = this.w0;
            SparseArray sparseArray2 = this.x0;
            if (i7 == i11) {
                int i12 = i11 == i10 ? this.t0 : sparseIntArray.get(i7) - 1;
                for (int i13 = this.q0; i13 <= i12; i13++) {
                    int i14 = (i13 << 16) + i7;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i14);
                    if (charSequence != null) {
                        int i15 = this.p0;
                        int i16 = this.s0;
                        if (i15 == i16 && i13 == this.t0 && i13 == this.q0) {
                            int i17 = this.u0;
                            int i18 = this.r0;
                            if (i17 >= i18) {
                                i18 = i17;
                                i17 = i18;
                            }
                            if (i17 < charSequence.length()) {
                                if (i18 > charSequence.length()) {
                                    i18 = charSequence.length();
                                }
                                spannableStringBuilder.append(charSequence.subSequence(i17, i18));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i15 == i16 && i13 == this.t0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i19 = this.u0;
                            if (i19 > charSequence.length()) {
                                i19 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i19));
                            spannableStringBuilder.append('\n');
                        } else if (i13 == this.q0) {
                            int i20 = this.r0;
                            if (i20 < charSequence.length()) {
                                spannableStringBuilder.append(charSequence.subSequence(i20, charSequence.length()));
                                spannableStringBuilder.append('\n');
                            }
                        } else {
                            CharSequence charSequence3 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence3 != null) {
                                spannableStringBuilder.append(charSequence3).append(' ');
                            }
                            spannableStringBuilder.append(charSequence);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else if (i7 == i10) {
                for (int i21 = 0; i21 <= this.t0; i21++) {
                    int i22 = (i21 << 16) + i7;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i22);
                    if (charSequence4 != null) {
                        if (this.p0 == this.s0 && i21 == this.t0 && i21 == this.q0) {
                            int i23 = this.u0;
                            int i24 = this.r0;
                            if (i24 < charSequence4.length()) {
                                if (i23 > charSequence4.length()) {
                                    i23 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i24, i23));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i21 == this.t0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i22);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i25 = this.u0;
                            if (i25 > charSequence4.length()) {
                                i25 = charSequence4.length();
                            }
                            spannableStringBuilder.append(charSequence4.subSequence(0, i25));
                            spannableStringBuilder.append('\n');
                        } else {
                            CharSequence charSequence6 = (CharSequence) sparseArray2.get(i22);
                            if (charSequence6 != null) {
                                spannableStringBuilder.append(charSequence6).append(' ');
                            }
                            spannableStringBuilder.append(charSequence4);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else {
                int i26 = sparseIntArray.get(i7);
                for (int i27 = this.q0; i27 < i26; i27++) {
                    int i28 = (i27 << 16) + i7;
                    CharSequence charSequence7 = (CharSequence) sparseArray2.get(i28);
                    if (charSequence7 != null) {
                        spannableStringBuilder.append(charSequence7).append(' ');
                    }
                    spannableStringBuilder.append((CharSequence) sparseArray.get(i28));
                    spannableStringBuilder.append('\n');
                }
            }
            i7++;
        }
        if (spannableStringBuilder.length() <= 0) {
            return null;
        }
        p9[] p9VarArr = (p9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, p9.class);
        if (p9VarArr != null && p9VarArr.length > 0) {
            Arrays.sort(p9VarArr, new z0(spannableStringBuilder, 1));
            for (p9 p9Var : p9VarArr) {
                int spanStart = spannableStringBuilder.getSpanStart(p9Var);
                int spanEnd = spannableStringBuilder.getSpanEnd(p9Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    CharSequence charSequence8 = p9Var.a;
                    if (charSequence8 == null) {
                        charSequence8 = "";
                    }
                    spannableStringBuilder.replace(spanStart, spanEnd, charSequence8);
                }
            }
        }
        for (l9 l9Var : (l9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, l9.class)) {
            spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(l9Var), spannableStringBuilder.getSpanEnd(l9Var));
        }
        return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
    }

    @Override // org.telegram.ui.Cells.w9
    public final void w() {
        super.w();
        if (this.F != null) {
            for (int i7 = 0; i7 < this.F.getChildCount(); i7++) {
                this.F.getChildAt(i7).invalidate();
            }
        }
    }
}

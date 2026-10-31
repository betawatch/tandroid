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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class k9 extends w9 {
    public boolean E0;
    public int r0;
    public int u0;
    public s4.a0 z0;
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

    public k9() {
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
    public final void A(int i10, int i11, boolean z10, float f7, float f10, r9 r9Var) {
        j9 j9Var = (j9) r9Var;
        if (!z10 || j9Var != this.W || f10 != f7) {
            super.A(i10, i11, z10, f7, f10, j9Var);
        } else if (this.j) {
            this.u = i10;
        } else {
            this.v = i10;
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public void F() {
        int d02 = d0((j9) this.W);
        int i10 = this.E0 ? this.q0 : this.t0;
        if (d02 == this.p0 && i10 == this.q0) {
            this.r0 = this.u;
        }
        if (d02 == this.s0 && i10 == this.t0) {
            this.u0 = this.v;
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final void L(r9 r9Var, r9 r9Var2) {
        j9 j9Var = (j9) r9Var;
        int d02 = d0(j9Var);
        if (d02 < 0) {
            return;
        }
        this.s0 = d02;
        this.p0 = d02;
        int i10 = this.v0;
        this.t0 = i10;
        this.q0 = i10;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        j9Var.h(arrayList);
        int size = arrayList.size();
        this.y0.put(d02, size);
        for (int i11 = 0; i11 < size; i11++) {
            W(d02, i11, (u9) arrayList.get(i11));
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final void N() {
        if (x()) {
            this.E0 = false;
            int i10 = this.s0;
            if (i10 >= 0) {
                s4.a0 a0Var = this.z0;
                j9 j9Var = a0Var != null ? (j9) a0Var.m(i10) : i10 < this.F.getChildCount() ? (j9) this.F.getChildAt(this.s0) : null;
                if (j9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = j9Var;
                if (this.p0 != this.s0) {
                    this.u = 0;
                } else if (this.q0 != this.t0) {
                    this.u = 0;
                } else {
                    this.u = this.r0;
                }
                this.v = this.u0;
                CharSequence s10 = s(j9Var, false);
                if (this.v > s10.length()) {
                    this.v = s10.length();
                }
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((j9) this.W).h(arrayList);
                int i11 = this.t0;
                if (i11 < 0 || i11 >= arrayList.size()) {
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
            int i10 = this.p0;
            if (i10 >= 0) {
                s4.a0 a0Var = this.z0;
                j9 j9Var = a0Var != null ? (j9) a0Var.m(i10) : this.s0 < this.F.getChildCount() ? (j9) this.F.getChildAt(this.p0) : null;
                if (j9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = j9Var;
                if (this.p0 != this.s0) {
                    this.v = s(j9Var, false).length();
                } else if (this.q0 != this.t0) {
                    this.v = s(j9Var, false).length();
                } else {
                    this.v = this.u0;
                }
                this.u = this.r0;
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((j9) this.W).h(arrayList);
                int i11 = this.q0;
                if (i11 < 0 || i11 >= arrayList.size()) {
                    return;
                }
                this.a = ((u9) arrayList.get(this.q0)).getX();
                this.b = ((u9) arrayList.get(this.q0)).getY();
            }
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean P(int i10, int i11) {
        if (this.Z) {
            if (i11 <= ((j9) this.W).getTop() || i11 >= ((j9) this.W).getBottom()) {
                int childCount = this.F.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    if (f0(this.F.getChildAt(i12))) {
                        j9 j9Var = (j9) this.F.getChildAt(i12);
                        if (i11 > j9Var.getTop() && i11 < j9Var.getBottom()) {
                            int c02 = c0((int) (i10 - j9Var.getX()), (int) (i11 - j9Var.getY()), j9Var);
                            if (c02 >= 0) {
                                g0((j9) this.W, j9Var, c02);
                                this.W = j9Var;
                                return true;
                            }
                        }
                    }
                    i12++;
                }
            } else {
                int i13 = this.E0 ? this.q0 : this.t0;
                int c03 = c0((int) (i10 - ((j9) this.W).getX()), (int) (i11 - ((j9) this.W).getY()), (j9) this.W);
                if (c03 != i13 && c03 >= 0) {
                    j9 j9Var2 = (j9) this.W;
                    g0(j9Var2, j9Var2, c03);
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(int i10, int i11, u9 u9Var) {
        int i12 = i10 + (i11 << 16);
        this.w0.put(i12, Y(u9Var.getText()));
        CharSequence prefix = u9Var.getPrefix();
        SparseArray sparseArray = this.x0;
        if (prefix == null) {
            sparseArray.remove(i12);
        } else {
            sparseArray.put(i12, Y(prefix));
        }
    }

    public final void X(int i10, String str) {
        this.w0.put(i10, Y(str));
        this.x0.remove(i10);
        SparseIntArray sparseIntArray = this.y0;
        sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
    }

    public final void Z(Canvas canvas, j9 j9Var, int i10) {
        u9 u9Var;
        int i11 = org.telegram.ui.ActionBar.t6.ig;
        this.o.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.g0));
        this.p.setColor(org.telegram.ui.ActionBar.t6.w0(i11, this.g0));
        int d02 = d0(j9Var);
        if (d02 < 0) {
            return;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        j9Var.h(arrayList);
        if (i10 < 0 || i10 >= arrayList.size() || (u9Var = (u9) arrayList.get(i10)) == null || u9Var.a() == null || u9Var.a().getText() == null) {
            return;
        }
        int i12 = this.u0;
        int length = u9Var.a().getText().length();
        if (i12 > length) {
            i12 = length;
        }
        int i13 = this.p0;
        if (d02 == i13 && d02 == this.s0) {
            int i14 = this.q0;
            int i15 = this.t0;
            if (i14 == i15 && i14 == i10) {
                h(canvas, u9Var.a(), this.r0, i12, true, true, 0.0f);
                return;
            }
            if (i10 == i14) {
                h(canvas, u9Var.a(), this.r0, length, true, false, 0.0f);
                return;
            }
            int i16 = i12;
            if (i10 == i15) {
                h(canvas, u9Var.a(), 0, i16, false, true, 0.0f);
                return;
            } else {
                if (i10 <= i14 || i10 >= i15) {
                    return;
                }
                h(canvas, u9Var.a(), 0, length, false, false, 0.0f);
                return;
            }
        }
        int i17 = i12;
        if (d02 == i13 && this.q0 == i10) {
            h(canvas, u9Var.a(), this.r0, length, true, false, 0.0f);
            return;
        }
        int i18 = this.s0;
        if (d02 == i18 && this.t0 == i10) {
            h(canvas, u9Var.a(), 0, i17, false, true, 0.0f);
            return;
        }
        if ((d02 <= i13 || d02 >= i18) && ((d02 != i13 || i10 <= this.q0) && (d02 != i18 || i10 >= this.t0))) {
            return;
        }
        h(canvas, u9Var.a(), 0, length, false, false, 0.0f);
    }

    public final boolean a0() {
        int i10;
        int length;
        if (x() && this.W != null && this.p0 == this.s0 && (i10 = this.q0) == this.t0) {
            if (i10 < 0) {
                i10 = 0;
            }
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((j9) this.W).h(arrayList);
            if (!arrayList.isEmpty() && i10 < arrayList.size() && (length = ((u9) arrayList.get(i10)).a().getText().length()) > 0 && (this.r0 > 0 || this.u0 < length)) {
                return j0((j9) this.W, i10, 0, length);
            }
        }
        return false;
    }

    public final boolean b0(int i10, int i11, j9 j9Var) {
        int i12;
        int i13;
        int i14;
        int d02 = d0(j9Var);
        if (d02 < 0) {
            return false;
        }
        if (this.B0 < 0) {
            this.B0 = this.p0;
            this.D0 = this.q0;
            this.C0 = this.r0;
        }
        h0(j9Var, d02);
        int i15 = this.B0;
        int i16 = this.D0;
        if ((d02 != i15 ? Integer.compare(d02, i15) : i10 != i16 ? Integer.compare(i10, i16) : Integer.compare(i11, this.C0)) < 0) {
            i14 = this.B0;
            i12 = this.D0;
            i13 = this.C0;
        } else {
            int i17 = this.B0;
            i12 = i10;
            i10 = this.D0;
            i13 = i11;
            i11 = this.C0;
            d02 = i17;
            i14 = d02;
        }
        if (d02 == i14 && i10 == i12 && i11 == i13) {
            f(false);
            return true;
        }
        this.p0 = d02;
        this.q0 = i10;
        this.r0 = i11;
        this.s0 = i14;
        this.t0 = i12;
        this.u0 = i13;
        N();
        w();
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.invalidate();
        }
        f fVar = this.m0;
        org.telegram.messenger.i0.r(fVar);
        org.telegram.messenger.i0.g3(fVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean c(int i10) {
        if (this.p0 == this.s0 && this.q0 == this.t0) {
            return super.c(i10);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c0(int i10, int i11, j9 j9Var) {
        int i12 = 0;
        if (j9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) j9Var;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof j9) {
                    float f7 = i11;
                    if (f7 > childAt.getY() && f7 < childAt.getY() + childAt.getHeight()) {
                        return c0((int) (i10 - childAt.getX()), (int) (f7 - childAt.getY()), (j9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        j9Var.h(arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i15 = -1;
        int i16 = Integer.MAX_VALUE;
        while (true) {
            if (size < 0) {
                i12 = i16;
                size = i15;
                break;
            }
            u9 u9Var = (u9) arrayList.get(size);
            int y3 = u9Var.getY();
            int height = u9Var.a().getHeight() + y3;
            if (i11 >= y3 && i11 < height) {
                break;
            }
            int min = Math.min(Math.abs(i11 - y3), Math.abs(i11 - height));
            if (min < i16) {
                i15 = size;
                i16 = min;
            }
            size--;
        }
        if (size < 0) {
            return -1;
        }
        int row = ((u9) arrayList.get(size)).getRow();
        if (row > 0 && i12 < org.telegram.messenger.i0.L(24.0f)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                u9 u9Var2 = (u9) arrayList.get(size2);
                if (u9Var2.getRow() == row) {
                    int x10 = u9Var2.getX();
                    int width = u9Var2.a().getWidth() + u9Var2.getX();
                    if (i10 >= x10 && i10 <= width) {
                        return size2;
                    }
                    int min2 = Math.min(Math.abs(i10 - x10), Math.abs(i10 - width));
                    if (min2 < i14) {
                        size = size2;
                        i14 = min2;
                    }
                }
            }
        }
        return size;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean d() {
        s4.a0 a0Var = this.z0;
        if (a0Var == null) {
            return true;
        }
        int L0 = a0Var.L0();
        int N0 = this.z0.N0();
        int i10 = this.p0;
        if ((L0 < i10 || L0 > this.s0) && (N0 < i10 || N0 > this.s0)) {
            return i10 >= L0 && this.s0 <= N0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d0(j9 j9Var) {
        ViewGroup viewGroup;
        View view = (View) j9Var;
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
    public final CharSequence s(j9 j9Var, boolean z10) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        j9Var.h(arrayList);
        int i10 = z10 ? this.v0 : this.E0 ? this.q0 : this.t0;
        return (arrayList.isEmpty() || i10 < 0 || i10 >= arrayList.size()) ? "" : ((u9) arrayList.get(i10)).a().getText();
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
        if (!(view instanceof j9)) {
            return false;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        ((j9) view).h(arrayList);
        if (view instanceof org.telegram.ui.s2) {
            return true;
        }
        return !arrayList.isEmpty();
    }

    public final void g0(j9 j9Var, j9 j9Var2, int i10) {
        int i11;
        int d02 = d0(j9Var2);
        int d03 = j9Var != null ? d0(j9Var) : -1;
        w();
        if (this.R && (i11 = this.p0) == this.s0) {
            if (d02 == i11) {
                if (i10 < this.q0) {
                    this.q0 = i10;
                    O();
                    this.j = true;
                    int i12 = this.v;
                    this.r0 = i12;
                    this.u = i12 - 1;
                } else {
                    this.t0 = i10;
                    N();
                    this.j = false;
                    this.u0 = 0;
                }
            } else if (d02 < i11) {
                this.p0 = d02;
                this.q0 = i10;
                O();
                this.j = true;
                int i13 = this.v;
                this.r0 = i13;
                this.u = i13 - 1;
            } else {
                this.s0 = d02;
                this.t0 = i10;
                N();
                this.j = false;
                this.u0 = 0;
            }
        } else if (this.j) {
            if (d02 == d03) {
                int i14 = this.t0;
                if (i10 <= i14 || d02 < this.s0) {
                    this.p0 = d02;
                    this.q0 = i10;
                    O();
                    this.r0 = this.v;
                } else {
                    this.s0 = d02;
                    this.q0 = i14;
                    this.t0 = i10;
                    this.r0 = this.u0;
                    N();
                    this.u0 = 0;
                    this.j = false;
                }
            } else if (d02 <= this.s0) {
                this.p0 = d02;
                this.q0 = i10;
                O();
                this.r0 = this.v;
            } else {
                this.s0 = d02;
                this.q0 = this.t0;
                this.t0 = i10;
                this.r0 = this.u0;
                N();
                this.u0 = 0;
                this.j = false;
            }
        } else if (d02 == d03) {
            int i15 = this.q0;
            if (i10 >= i15 || d02 > this.p0) {
                this.s0 = d02;
                this.t0 = i10;
                N();
                this.u0 = 0;
            } else {
                this.p0 = d02;
                this.t0 = i15;
                this.q0 = i10;
                this.u0 = this.r0;
                O();
                this.j = true;
                this.r0 = this.v;
            }
        } else if (d02 >= this.p0) {
            this.s0 = d02;
            this.t0 = i10;
            N();
            this.u0 = 0;
        } else {
            this.p0 = d02;
            this.t0 = this.q0;
            this.q0 = i10;
            this.u0 = this.r0;
            O();
            this.j = true;
            this.r0 = this.v;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        j9Var2.h(arrayList);
        int size = arrayList.size();
        this.y0.put(d02, size);
        for (int i16 = 0; i16 < size; i16++) {
            W(d02, i16, (u9) arrayList.get(i16));
        }
    }

    public final void h0(j9 j9Var, int i10) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        j9Var.h(arrayList);
        int size = arrayList.size();
        this.y0.put(i10, size);
        for (int i11 = 0; i11 < size; i11++) {
            W(i10, i11, (u9) arrayList.get(i11));
        }
    }

    @Override // org.telegram.ui.Cells.w9
    public final void i(int i10, ge.b bVar, boolean z10) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        bVar.e = null;
        j9 j9Var = (j9) (z10 ? this.X : this.W);
        if (j9Var == null) {
            bVar.d = null;
            return;
        }
        j9Var.h(arrayList);
        int i11 = z10 ? this.v0 : this.E0 ? this.q0 : this.t0;
        if (i11 < 0 || i11 >= arrayList.size()) {
            bVar.d = null;
            return;
        }
        bVar.d = ((u9) arrayList.get(i11)).a();
        bVar.e = ((u9) arrayList.get(i11)).c();
        bVar.b = 0.0f;
        bVar.c = 0.0f;
    }

    public final void i0(int i10, int i11) {
        j9 j9Var;
        if (i10 < 0 || i11 < i10) {
            return;
        }
        CharSequence charSequence = (CharSequence) this.w0.get(i11);
        int length = charSequence == null ? 0 : charSequence.length();
        if (this.F != null) {
            for (int i12 = 0; i12 < this.F.getChildCount(); i12++) {
                KeyEvent.Callback childAt = this.F.getChildAt(i12);
                if (childAt instanceof j9) {
                    j9Var = (j9) childAt;
                    if (d0(j9Var) == i11) {
                        break;
                    }
                }
            }
        }
        j9Var = null;
        this.W = j9Var;
        this.u = 0;
        this.v = length;
        this.p0 = i10;
        this.s0 = i11;
        this.t0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.u0 = length;
        SparseIntArray sparseIntArray = this.y0;
        sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
        sparseIntArray.put(i11, Math.max(1, sparseIntArray.get(i11)));
        this.B0 = i10;
        this.C0 = 0;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        U();
        w();
        u();
        f fVar = this.m0;
        org.telegram.messenger.i0.r(fVar);
        org.telegram.messenger.i0.g3(fVar);
        w7.x5 x5Var = this.D;
        if (x5Var != null) {
            x5Var.a(true);
        }
    }

    public final boolean j0(j9 j9Var, int i10, int i11, int i12) {
        int d02 = d0(j9Var);
        if (d02 < 0 || i11 == i12) {
            return false;
        }
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        this.W = j9Var;
        this.u = min;
        this.v = max;
        this.s0 = d02;
        this.p0 = d02;
        this.t0 = i10;
        this.q0 = i10;
        this.r0 = min;
        this.u0 = max;
        this.B0 = d02;
        this.C0 = i11;
        this.D0 = i10;
        h0(j9Var, d02);
        ArrayList arrayList = this.A0;
        if (!arrayList.isEmpty() && i10 >= 0 && i10 < arrayList.size()) {
            this.a = ((u9) arrayList.get(i10)).getX();
            this.b = ((u9) arrayList.get(i10)).getY();
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
        org.telegram.messenger.i0.r(fVar);
        org.telegram.messenger.i0.g3(fVar);
        w7.x5 x5Var = this.D;
        if (x5Var != null) {
            x5Var.a(true);
        }
        j9Var.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int k(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10) {
        j9 j9Var = (j9) r9Var;
        if (j9Var != null) {
            int i14 = i10 - i12;
            int i15 = i11 - i13;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            j9Var.h(arrayList);
            int i16 = z10 ? this.v0 : this.E0 ? this.q0 : this.t0;
            if (i16 >= 0 && i16 < arrayList.size()) {
                Layout a2 = ((u9) arrayList.get(i16)).a();
                if (i14 < 0) {
                    i14 = 1;
                }
                if (i15 < 0) {
                    i15 = 1;
                }
                if (i14 > a2.getWidth()) {
                    i14 = a2.getWidth();
                }
                if (i15 > a2.getLineBottom(a2.getLineCount() - 1)) {
                    i15 = a2.getLineBottom(a2.getLineCount() - 1) - 1;
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= a2.getLineCount()) {
                        i17 = -1;
                        break;
                    }
                    if (i15 >= a2.getLineTop(i17) && i15 <= a2.getLineBottom(i17)) {
                        break;
                    }
                    i17++;
                }
                if (i17 >= 0) {
                    return a2.getOffsetForHorizontal(i17, i14);
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0(View view, int i10, int i11) {
        if (view instanceof j9) {
            this.s = i10;
            this.t = i11;
            j9 j9Var = (j9) view;
            this.X = j9Var;
            int c02 = c0(i10, i11, j9Var);
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
            ((j9) this.W).h(arrayList);
            int i10 = this.E0 ? this.q0 : this.t0;
            if (i10 >= 0 && i10 < arrayList.size()) {
                Layout a2 = ((u9) arrayList.get(i10)).a();
                int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i12 = 0; i12 < a2.getLineCount(); i12++) {
                    int lineBottom = a2.getLineBottom(i12) - a2.getLineTop(i12);
                    if (lineBottom < i11) {
                        i11 = lineBottom;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.w9
    public final CharSequence r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.p0;
        while (true) {
            int i11 = this.s0;
            if (i10 > i11) {
                break;
            }
            int i12 = this.p0;
            SparseIntArray sparseIntArray = this.y0;
            SparseArray sparseArray = this.w0;
            SparseArray sparseArray2 = this.x0;
            if (i10 == i12) {
                int i13 = i12 == i11 ? this.t0 : sparseIntArray.get(i10) - 1;
                for (int i14 = this.q0; i14 <= i13; i14++) {
                    int i15 = (i14 << 16) + i10;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i15);
                    if (charSequence != null) {
                        int i16 = this.p0;
                        int i17 = this.s0;
                        if (i16 == i17 && i14 == this.t0 && i14 == this.q0) {
                            int i18 = this.u0;
                            int i19 = this.r0;
                            if (i18 >= i19) {
                                i19 = i18;
                                i18 = i19;
                            }
                            if (i18 < charSequence.length()) {
                                if (i19 > charSequence.length()) {
                                    i19 = charSequence.length();
                                }
                                spannableStringBuilder.append(charSequence.subSequence(i18, i19));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i16 == i17 && i14 == this.t0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i15);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i20 = this.u0;
                            if (i20 > charSequence.length()) {
                                i20 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i20));
                            spannableStringBuilder.append('\n');
                        } else if (i14 == this.q0) {
                            int i21 = this.r0;
                            if (i21 < charSequence.length()) {
                                spannableStringBuilder.append(charSequence.subSequence(i21, charSequence.length()));
                                spannableStringBuilder.append('\n');
                            }
                        } else {
                            CharSequence charSequence3 = (CharSequence) sparseArray2.get(i15);
                            if (charSequence3 != null) {
                                spannableStringBuilder.append(charSequence3).append(' ');
                            }
                            spannableStringBuilder.append(charSequence);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else if (i10 == i11) {
                for (int i22 = 0; i22 <= this.t0; i22++) {
                    int i23 = (i22 << 16) + i10;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i23);
                    if (charSequence4 != null) {
                        if (this.p0 == this.s0 && i22 == this.t0 && i22 == this.q0) {
                            int i24 = this.u0;
                            int i25 = this.r0;
                            if (i25 < charSequence4.length()) {
                                if (i24 > charSequence4.length()) {
                                    i24 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i25, i24));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i22 == this.t0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i23);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i26 = this.u0;
                            if (i26 > charSequence4.length()) {
                                i26 = charSequence4.length();
                            }
                            spannableStringBuilder.append(charSequence4.subSequence(0, i26));
                            spannableStringBuilder.append('\n');
                        } else {
                            CharSequence charSequence6 = (CharSequence) sparseArray2.get(i23);
                            if (charSequence6 != null) {
                                spannableStringBuilder.append(charSequence6).append(' ');
                            }
                            spannableStringBuilder.append(charSequence4);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else {
                int i27 = sparseIntArray.get(i10);
                for (int i28 = this.q0; i28 < i27; i28++) {
                    int i29 = (i28 << 16) + i10;
                    CharSequence charSequence7 = (CharSequence) sparseArray2.get(i29);
                    if (charSequence7 != null) {
                        spannableStringBuilder.append(charSequence7).append(' ');
                    }
                    spannableStringBuilder.append((CharSequence) sparseArray.get(i29));
                    spannableStringBuilder.append('\n');
                }
            }
            i10++;
        }
        if (spannableStringBuilder.length() <= 0) {
            return null;
        }
        p9[] p9VarArr = (p9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, p9.class);
        if (p9VarArr != null && p9VarArr.length > 0) {
            Arrays.sort(p9VarArr, new w0(spannableStringBuilder, 1));
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
        for (m9 m9Var : (m9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, m9.class)) {
            spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(m9Var), spannableStringBuilder.getSpanEnd(m9Var));
        }
        return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
    }

    @Override // org.telegram.ui.Cells.w9
    public final void w() {
        super.w();
        if (this.F != null) {
            for (int i10 = 0; i10 < this.F.getChildCount(); i10++) {
                this.F.getChildAt(i10).invalidate();
            }
        }
    }
}

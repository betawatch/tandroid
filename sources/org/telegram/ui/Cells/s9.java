package org.telegram.ui.Cells;

import a8.ye;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class s9 extends fa {
    public boolean E0;
    public int r0;
    public int u0;
    public s4.c0 z0;
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

    public s9() {
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

    @Override // org.telegram.ui.Cells.fa
    public final void A(int i10, int i11, boolean z10, float f7, float f10, aa aaVar) {
        r9 r9Var = (r9) aaVar;
        if (!z10 || r9Var != this.W || f10 != f7) {
            super.A(i10, i11, z10, f7, f10, r9Var);
        } else if (this.j) {
            this.u = i10;
        } else {
            this.v = i10;
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public void F() {
        int d02 = d0((r9) this.W);
        int i10 = this.E0 ? this.q0 : this.t0;
        if (d02 == this.p0 && i10 == this.q0) {
            this.r0 = this.u;
        }
        if (d02 == this.s0 && i10 == this.t0) {
            this.u0 = this.v;
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final void L(aa aaVar, aa aaVar2) {
        r9 r9Var = (r9) aaVar;
        int d02 = d0(r9Var);
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
        r9Var.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.y0.put(d02, size);
        for (int i11 = 0; i11 < size; i11++) {
            W((da) arrayList.get(i11), d02, i11);
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final void N() {
        if (x()) {
            this.E0 = false;
            int i10 = this.s0;
            if (i10 >= 0) {
                s4.c0 c0Var = this.z0;
                r9 r9Var = c0Var != null ? (r9) c0Var.m(i10) : i10 < this.F.getChildCount() ? (r9) this.F.getChildAt(this.s0) : null;
                if (r9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = r9Var;
                if (this.p0 != this.s0) {
                    this.u = 0;
                } else if (this.q0 != this.t0) {
                    this.u = 0;
                } else {
                    this.u = this.r0;
                }
                this.v = this.u0;
                CharSequence s10 = s(r9Var, false);
                if (this.v > s10.length()) {
                    this.v = s10.length();
                }
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((r9) this.W).fillTextLayoutBlocks(arrayList);
                int i11 = this.t0;
                if (i11 < 0 || i11 >= arrayList.size()) {
                    return;
                }
                this.a = ((da) arrayList.get(this.t0)).getX();
                this.b = ((da) arrayList.get(this.t0)).getY();
            }
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final void O() {
        if (x()) {
            this.E0 = true;
            int i10 = this.p0;
            if (i10 >= 0) {
                s4.c0 c0Var = this.z0;
                r9 r9Var = c0Var != null ? (r9) c0Var.m(i10) : this.s0 < this.F.getChildCount() ? (r9) this.F.getChildAt(this.p0) : null;
                if (r9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = r9Var;
                if (this.p0 != this.s0) {
                    this.v = s(r9Var, false).length();
                } else if (this.q0 != this.t0) {
                    this.v = s(r9Var, false).length();
                } else {
                    this.v = this.u0;
                }
                this.u = this.r0;
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((r9) this.W).fillTextLayoutBlocks(arrayList);
                int i11 = this.q0;
                if (i11 < 0 || i11 >= arrayList.size()) {
                    return;
                }
                this.a = ((da) arrayList.get(this.q0)).getX();
                this.b = ((da) arrayList.get(this.q0)).getY();
            }
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean P(int i10, int i11) {
        if (this.Z) {
            if (i11 <= ((r9) this.W).getTop() || i11 >= ((r9) this.W).getBottom()) {
                int childCount = this.F.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    if (f0(this.F.getChildAt(i12))) {
                        r9 r9Var = (r9) this.F.getChildAt(i12);
                        if (i11 > r9Var.getTop() && i11 < r9Var.getBottom()) {
                            int c02 = c0((int) (i10 - r9Var.getX()), (int) (i11 - r9Var.getY()), r9Var);
                            if (c02 >= 0) {
                                g0((r9) this.W, r9Var, c02);
                                this.W = r9Var;
                                return true;
                            }
                        }
                    }
                    i12++;
                }
            } else {
                int i13 = this.E0 ? this.q0 : this.t0;
                int c03 = c0((int) (i10 - ((r9) this.W).getX()), (int) (i11 - ((r9) this.W).getY()), (r9) this.W);
                if (c03 != i13 && c03 >= 0) {
                    r9 r9Var2 = (r9) this.W;
                    g0(r9Var2, r9Var2, c03);
                    return true;
                }
            }
        }
        return false;
    }

    public final void W(da daVar, int i10, int i11) {
        int i12 = i10 + (i11 << 16);
        this.w0.put(i12, Y(daVar.getText()));
        CharSequence prefix = daVar.getPrefix();
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

    public final void Z(Canvas canvas, r9 r9Var, int i10) {
        da daVar;
        int i11 = org.telegram.ui.ActionBar.y6.uf;
        this.o.setColor(org.telegram.ui.ActionBar.y6.w0(i11, this.g0));
        this.p.setColor(org.telegram.ui.ActionBar.y6.w0(i11, this.g0));
        int d02 = d0(r9Var);
        if (d02 < 0) {
            return;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        r9Var.fillTextLayoutBlocks(arrayList);
        if (i10 < 0 || i10 >= arrayList.size() || (daVar = (da) arrayList.get(i10)) == null || daVar.getLayout() == null || daVar.getLayout().getText() == null) {
            return;
        }
        int i12 = this.u0;
        int length = daVar.getLayout().getText().length();
        if (i12 > length) {
            i12 = length;
        }
        int i13 = this.p0;
        if (d02 == i13 && d02 == this.s0) {
            int i14 = this.q0;
            int i15 = this.t0;
            if (i14 == i15 && i14 == i10) {
                h(canvas, daVar.getLayout(), this.r0, i12, true, true, 0.0f);
                return;
            }
            if (i10 == i14) {
                h(canvas, daVar.getLayout(), this.r0, length, true, false, 0.0f);
                return;
            }
            int i16 = i12;
            if (i10 == i15) {
                h(canvas, daVar.getLayout(), 0, i16, false, true, 0.0f);
                return;
            } else {
                if (i10 <= i14 || i10 >= i15) {
                    return;
                }
                h(canvas, daVar.getLayout(), 0, length, false, false, 0.0f);
                return;
            }
        }
        int i17 = i12;
        if (d02 == i13 && this.q0 == i10) {
            h(canvas, daVar.getLayout(), this.r0, length, true, false, 0.0f);
            return;
        }
        int i18 = this.s0;
        if (d02 == i18 && this.t0 == i10) {
            h(canvas, daVar.getLayout(), 0, i17, false, true, 0.0f);
            return;
        }
        if ((d02 <= i13 || d02 >= i18) && ((d02 != i13 || i10 <= this.q0) && (d02 != i18 || i10 >= this.t0))) {
            return;
        }
        h(canvas, daVar.getLayout(), 0, length, false, false, 0.0f);
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
            ((r9) this.W).fillTextLayoutBlocks(arrayList);
            if (!arrayList.isEmpty() && i10 < arrayList.size() && (length = ((da) arrayList.get(i10)).getLayout().getText().length()) > 0 && (this.r0 > 0 || this.u0 < length)) {
                return j0((r9) this.W, i10, 0, length);
            }
        }
        return false;
    }

    public final boolean b0(int i10, int i11, r9 r9Var) {
        int i12;
        int i13;
        int i14;
        int d02 = d0(r9Var);
        if (d02 < 0) {
            return false;
        }
        if (this.B0 < 0) {
            this.B0 = this.p0;
            this.D0 = this.q0;
            this.C0 = this.r0;
        }
        h0(r9Var, d02);
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
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.invalidate();
        }
        g gVar = this.m0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean c(int i10) {
        if (this.p0 == this.s0 && this.q0 == this.t0) {
            return super.c(i10);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c0(int i10, int i11, r9 r9Var) {
        int i12 = 0;
        if (r9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) r9Var;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof r9) {
                    float f7 = i11;
                    if (f7 > childAt.getY() && f7 < childAt.getY() + childAt.getHeight()) {
                        return c0((int) (i10 - childAt.getX()), (int) (f7 - childAt.getY()), (r9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        r9Var.fillTextLayoutBlocks(arrayList);
        if (!arrayList.isEmpty()) {
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
                da daVar = (da) arrayList.get(size);
                int y3 = daVar.getY();
                int height = daVar.getLayout().getHeight() + y3;
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
            if (size >= 0) {
                int row = ((da) arrayList.get(size)).getRow();
                if (row > 0 && i12 < AndroidUtilities.dp(24.0f)) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        da daVar2 = (da) arrayList.get(size2);
                        if (daVar2.getRow() == row) {
                            int x9 = daVar2.getX();
                            int width = daVar2.getLayout().getWidth() + daVar2.getX();
                            if (i10 >= x9 && i10 <= width) {
                                return size2;
                            }
                            int min2 = Math.min(Math.abs(i10 - x9), Math.abs(i10 - width));
                            if (min2 < i14) {
                                size = size2;
                                i14 = min2;
                            }
                        }
                    }
                }
                return size;
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean d() {
        s4.c0 c0Var = this.z0;
        if (c0Var == null) {
            return true;
        }
        int L0 = c0Var.L0();
        int N0 = this.z0.N0();
        int i10 = this.p0;
        if ((L0 < i10 || L0 > this.s0) && (N0 < i10 || N0 > this.s0)) {
            return i10 >= L0 && this.s0 <= N0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d0(r9 r9Var) {
        ViewGroup viewGroup;
        View view = (View) r9Var;
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

    @Override // org.telegram.ui.Cells.fa
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final CharSequence s(r9 r9Var, boolean z10) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        r9Var.fillTextLayoutBlocks(arrayList);
        int i10 = z10 ? this.v0 : this.E0 ? this.q0 : this.t0;
        return (arrayList.isEmpty() || i10 < 0 || i10 >= arrayList.size()) ? "" : ((da) arrayList.get(i10)).getLayout().getText();
    }

    @Override // org.telegram.ui.Cells.fa
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
        if (!(view instanceof r9)) {
            return false;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        ((r9) view).fillTextLayoutBlocks(arrayList);
        if (view instanceof org.telegram.ui.t2) {
            return true;
        }
        return !arrayList.isEmpty();
    }

    public final void g0(r9 r9Var, r9 r9Var2, int i10) {
        int i11;
        int d02 = d0(r9Var2);
        int d03 = r9Var != null ? d0(r9Var) : -1;
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
        r9Var2.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.y0.put(d02, size);
        for (int i16 = 0; i16 < size; i16++) {
            W((da) arrayList.get(i16), d02, i16);
        }
    }

    public final void h0(r9 r9Var, int i10) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        r9Var.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.y0.put(i10, size);
        for (int i11 = 0; i11 < size; i11++) {
            W((da) arrayList.get(i11), i10, i11);
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final void i(int i10, v9 v9Var, boolean z10) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        v9Var.e = null;
        r9 r9Var = (r9) (z10 ? this.X : this.W);
        if (r9Var == null) {
            v9Var.b = null;
            return;
        }
        r9Var.fillTextLayoutBlocks(arrayList);
        int i11 = z10 ? this.v0 : this.E0 ? this.q0 : this.t0;
        if (i11 < 0 || i11 >= arrayList.size()) {
            v9Var.b = null;
            return;
        }
        v9Var.b = ((da) arrayList.get(i11)).getLayout();
        v9Var.e = ((da) arrayList.get(i11)).getSelectionBounds();
        v9Var.c = 0.0f;
        v9Var.d = 0.0f;
    }

    public final void i0(int i10, int i11) {
        r9 r9Var;
        if (i10 < 0 || i11 < i10) {
            return;
        }
        CharSequence charSequence = (CharSequence) this.w0.get(i11);
        int length = charSequence == null ? 0 : charSequence.length();
        if (this.F != null) {
            for (int i12 = 0; i12 < this.F.getChildCount(); i12++) {
                KeyEvent.Callback childAt = this.F.getChildAt(i12);
                if (childAt instanceof r9) {
                    r9Var = (r9) childAt;
                    if (d0(r9Var) == i11) {
                        break;
                    }
                }
            }
        }
        r9Var = null;
        this.W = r9Var;
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
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.setVisibility(0);
        }
        U();
        w();
        u();
        g gVar = this.m0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        ye yeVar = this.D;
        if (yeVar != null) {
            yeVar.a(true);
        }
    }

    public final boolean j0(r9 r9Var, int i10, int i11, int i12) {
        int d02 = d0(r9Var);
        if (d02 < 0 || i11 == i12) {
            return false;
        }
        int min = Math.min(i11, i12);
        int max = Math.max(i11, i12);
        this.W = r9Var;
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
        h0(r9Var, d02);
        ArrayList arrayList = this.A0;
        if (!arrayList.isEmpty() && i10 >= 0 && i10 < arrayList.size()) {
            this.a = ((da) arrayList.get(i10)).getX();
            this.b = ((da) arrayList.get(i10)).getY();
        } else if (!arrayList.isEmpty()) {
            this.a = ((da) arrayList.get(0)).getX();
            this.b = ((da) arrayList.get(0)).getY();
        }
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.setVisibility(0);
        }
        U();
        w();
        u();
        g gVar = this.m0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        ye yeVar = this.D;
        if (yeVar != null) {
            yeVar.a(true);
        }
        r9Var.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int k(int i10, int i11, int i12, int i13, aa aaVar, boolean z10) {
        r9 r9Var = (r9) aaVar;
        if (r9Var != null) {
            int i14 = i10 - i12;
            int i15 = i11 - i13;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            r9Var.fillTextLayoutBlocks(arrayList);
            int i16 = z10 ? this.v0 : this.E0 ? this.q0 : this.t0;
            if (i16 >= 0 && i16 < arrayList.size()) {
                Layout layout = ((da) arrayList.get(i16)).getLayout();
                if (i14 < 0) {
                    i14 = 1;
                }
                if (i15 < 0) {
                    i15 = 1;
                }
                if (i14 > layout.getWidth()) {
                    i14 = layout.getWidth();
                }
                if (i15 > layout.getLineBottom(layout.getLineCount() - 1)) {
                    i15 = layout.getLineBottom(layout.getLineCount() - 1) - 1;
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= layout.getLineCount()) {
                        i17 = -1;
                        break;
                    }
                    if (i15 >= layout.getLineTop(i17) && i15 <= layout.getLineBottom(i17)) {
                        break;
                    }
                    i17++;
                }
                if (i17 >= 0) {
                    return layout.getOffsetForHorizontal(i17, i14);
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0(View view, int i10, int i11) {
        if (view instanceof r9) {
            this.s = i10;
            this.t = i11;
            r9 r9Var = (r9) view;
            this.X = r9Var;
            int c02 = c0(i10, i11, r9Var);
            this.v0 = c02;
            if (c02 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.A0;
            this.c = ((da) arrayList.get(c02)).getX();
            this.d = ((da) arrayList.get(this.v0)).getY();
        }
    }

    public final void l0() {
        if (this.X != null) {
            this.f0.run();
        }
    }

    @Override // org.telegram.ui.Cells.fa
    public final int m() {
        if (this.W != null) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((r9) this.W).fillTextLayoutBlocks(arrayList);
            int i10 = this.E0 ? this.q0 : this.t0;
            if (i10 >= 0 && i10 < arrayList.size()) {
                Layout layout = ((da) arrayList.get(i10)).getLayout();
                int i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i12 = 0; i12 < layout.getLineCount(); i12++) {
                    int lineBottom = layout.getLineBottom(i12) - layout.getLineTop(i12);
                    if (lineBottom < i11) {
                        i11 = lineBottom;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.fa
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
        y9[] y9VarArr = (y9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, y9.class);
        if (y9VarArr != null && y9VarArr.length > 0) {
            Arrays.sort(y9VarArr, new n1(spannableStringBuilder, 1));
            for (y9 y9Var : y9VarArr) {
                int spanStart = spannableStringBuilder.getSpanStart(y9Var);
                int spanEnd = spannableStringBuilder.getSpanEnd(y9Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    CharSequence charSequence8 = y9Var.a;
                    if (charSequence8 == null) {
                        charSequence8 = "";
                    }
                    spannableStringBuilder.replace(spanStart, spanEnd, charSequence8);
                }
            }
        }
        for (u9 u9Var : (u9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, u9.class)) {
            spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(u9Var), spannableStringBuilder.getSpanEnd(u9Var));
        }
        return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
    }

    @Override // org.telegram.ui.Cells.fa
    public final void w() {
        super.w();
        if (this.F != null) {
            for (int i10 = 0; i10 < this.F.getChildCount(); i10++) {
                this.F.getChildAt(i10).invalidate();
            }
        }
    }
}

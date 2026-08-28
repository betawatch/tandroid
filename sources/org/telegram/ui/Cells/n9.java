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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class n9 extends aa {
    public f2.m0 E0;
    public boolean J0;
    public int w0;
    public int z0;
    public int u0 = -1;
    public int v0 = -1;
    public int x0 = -1;
    public int y0 = -1;
    public int A0 = -1;
    public final SparseArray B0 = new SparseArray();
    public final SparseArray C0 = new SparseArray();
    public final SparseIntArray D0 = new SparseIntArray();
    public final ArrayList F0 = new ArrayList();
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = 0;

    public n9() {
        this.Z = true;
        this.d0 = true;
    }

    public static CharSequence Z(CharSequence charSequence) {
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

    @Override // org.telegram.ui.Cells.aa
    public final void B(int i9, int i10, boolean z10, float f10, float f11, v9 v9Var) {
        m9 m9Var = (m9) v9Var;
        if (!z10 || m9Var != this.W || f11 != f10) {
            super.B(i9, i10, z10, f10, f11, m9Var);
        } else if (this.j) {
            this.u = i9;
        } else {
            this.v = i9;
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public void G() {
        int e02 = e0((m9) this.W);
        int i9 = this.J0 ? this.v0 : this.y0;
        if (e02 == this.u0 && i9 == this.v0) {
            this.w0 = this.u;
        }
        if (e02 == this.x0 && i9 == this.y0) {
            this.z0 = this.v;
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final void M(v9 v9Var, v9 v9Var2) {
        m9 m9Var = (m9) v9Var;
        int e02 = e0(m9Var);
        if (e02 < 0) {
            return;
        }
        this.x0 = e02;
        this.u0 = e02;
        int i9 = this.A0;
        this.y0 = i9;
        this.v0 = i9;
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.D0.put(e02, size);
        for (int i10 = 0; i10 < size; i10++) {
            X((y9) arrayList.get(i10), e02, i10);
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final void O() {
        if (y()) {
            this.J0 = false;
            int i9 = this.x0;
            if (i9 >= 0) {
                f2.m0 m0Var = this.E0;
                m9 m9Var = m0Var != null ? (m9) m0Var.m(i9) : i9 < this.F.getChildCount() ? (m9) this.F.getChildAt(this.x0) : null;
                if (m9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = m9Var;
                if (this.u0 != this.x0) {
                    this.u = 0;
                } else if (this.v0 != this.y0) {
                    this.u = 0;
                } else {
                    this.u = this.w0;
                }
                this.v = this.z0;
                CharSequence t10 = t(m9Var, false);
                if (this.v > t10.length()) {
                    this.v = t10.length();
                }
                ArrayList arrayList = this.F0;
                arrayList.clear();
                ((m9) this.W).fillTextLayoutBlocks(arrayList);
                int i10 = this.y0;
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                this.a = ((y9) arrayList.get(this.y0)).getX();
                this.b = ((y9) arrayList.get(this.y0)).getY();
            }
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final void P() {
        if (y()) {
            this.J0 = true;
            int i9 = this.u0;
            if (i9 >= 0) {
                f2.m0 m0Var = this.E0;
                m9 m9Var = m0Var != null ? (m9) m0Var.m(i9) : this.x0 < this.F.getChildCount() ? (m9) this.F.getChildAt(this.u0) : null;
                if (m9Var == null) {
                    this.W = null;
                    return;
                }
                this.W = m9Var;
                if (this.u0 != this.x0) {
                    this.v = t(m9Var, false).length();
                } else if (this.v0 != this.y0) {
                    this.v = t(m9Var, false).length();
                } else {
                    this.v = this.z0;
                }
                this.u = this.w0;
                ArrayList arrayList = this.F0;
                arrayList.clear();
                ((m9) this.W).fillTextLayoutBlocks(arrayList);
                int i10 = this.v0;
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                this.a = ((y9) arrayList.get(this.v0)).getX();
                this.b = ((y9) arrayList.get(this.v0)).getY();
            }
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean Q(int i9, int i10) {
        if (this.Z) {
            if (i10 <= ((m9) this.W).getTop() || i10 >= ((m9) this.W).getBottom()) {
                int childCount = this.F.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    if (g0(this.F.getChildAt(i11))) {
                        m9 m9Var = (m9) this.F.getChildAt(i11);
                        if (i10 > m9Var.getTop() && i10 < m9Var.getBottom()) {
                            int d02 = d0((int) (i9 - m9Var.getX()), (int) (i10 - m9Var.getY()), m9Var);
                            if (d02 >= 0) {
                                h0((m9) this.W, m9Var, d02);
                                this.W = m9Var;
                                return true;
                            }
                        }
                    }
                    i11++;
                }
            } else {
                int i12 = this.J0 ? this.v0 : this.y0;
                int d03 = d0((int) (i9 - ((m9) this.W).getX()), (int) (i10 - ((m9) this.W).getY()), (m9) this.W);
                if (d03 != i12 && d03 >= 0) {
                    m9 m9Var2 = (m9) this.W;
                    h0(m9Var2, m9Var2, d03);
                    return true;
                }
            }
        }
        return false;
    }

    public final void X(y9 y9Var, int i9, int i10) {
        int i11 = i9 + (i10 << 16);
        this.B0.put(i11, Z(y9Var.getText()));
        CharSequence prefix = y9Var.getPrefix();
        SparseArray sparseArray = this.C0;
        if (prefix == null) {
            sparseArray.remove(i11);
        } else {
            sparseArray.put(i11, Z(prefix));
        }
    }

    public final void Y(int i9, String str) {
        this.B0.put(i9, Z(str));
        this.C0.remove(i9);
        SparseIntArray sparseIntArray = this.D0;
        sparseIntArray.put(i9, Math.max(1, sparseIntArray.get(i9)));
    }

    public final void a0(Canvas canvas, m9 m9Var, int i9) {
        y9 y9Var;
        int i10 = org.telegram.ui.ActionBar.f6.uf;
        this.o.setColor(org.telegram.ui.ActionBar.f6.v0(i10, this.h0));
        this.p.setColor(org.telegram.ui.ActionBar.f6.v0(i10, this.h0));
        int e02 = e0(m9Var);
        if (e02 < 0) {
            return;
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var.fillTextLayoutBlocks(arrayList);
        if (i9 < 0 || i9 >= arrayList.size() || (y9Var = (y9) arrayList.get(i9)) == null || y9Var.getLayout() == null || y9Var.getLayout().getText() == null) {
            return;
        }
        int i11 = this.z0;
        int length = y9Var.getLayout().getText().length();
        if (i11 > length) {
            i11 = length;
        }
        int i12 = this.u0;
        if (e02 == i12 && e02 == this.x0) {
            int i13 = this.v0;
            int i14 = this.y0;
            if (i13 == i14 && i13 == i9) {
                i(canvas, y9Var.getLayout(), this.w0, i11, true, true, 0.0f);
                return;
            }
            if (i9 == i13) {
                i(canvas, y9Var.getLayout(), this.w0, length, true, false, 0.0f);
                return;
            }
            int i15 = i11;
            if (i9 == i14) {
                i(canvas, y9Var.getLayout(), 0, i15, false, true, 0.0f);
                return;
            } else {
                if (i9 <= i13 || i9 >= i14) {
                    return;
                }
                i(canvas, y9Var.getLayout(), 0, length, false, false, 0.0f);
                return;
            }
        }
        int i16 = i11;
        if (e02 == i12 && this.v0 == i9) {
            i(canvas, y9Var.getLayout(), this.w0, length, true, false, 0.0f);
            return;
        }
        int i17 = this.x0;
        if (e02 == i17 && this.y0 == i9) {
            i(canvas, y9Var.getLayout(), 0, i16, false, true, 0.0f);
            return;
        }
        if ((e02 <= i12 || e02 >= i17) && ((e02 != i12 || i9 <= this.v0) && (e02 != i17 || i9 >= this.y0))) {
            return;
        }
        i(canvas, y9Var.getLayout(), 0, length, false, false, 0.0f);
    }

    public final boolean b0() {
        int i9;
        int length;
        if (y() && this.W != null && this.u0 == this.x0 && (i9 = this.v0) == this.y0) {
            if (i9 < 0) {
                i9 = 0;
            }
            ArrayList arrayList = this.F0;
            arrayList.clear();
            ((m9) this.W).fillTextLayoutBlocks(arrayList);
            if (!arrayList.isEmpty() && i9 < arrayList.size() && (length = ((y9) arrayList.get(i9)).getLayout().getText().length()) > 0 && (this.w0 > 0 || this.z0 < length)) {
                return k0((m9) this.W, i9, 0, length);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean c(int i9) {
        if (this.u0 == this.x0 && this.v0 == this.y0) {
            return super.c(i9);
        }
        return true;
    }

    public final boolean c0(int i9, int i10, m9 m9Var) {
        int i11;
        int i12;
        int i13;
        int e02 = e0(m9Var);
        if (e02 < 0) {
            return false;
        }
        if (this.G0 < 0) {
            this.G0 = this.u0;
            this.I0 = this.v0;
            this.H0 = this.w0;
        }
        i0(m9Var, e02);
        int i14 = this.G0;
        int i15 = this.I0;
        if ((e02 != i14 ? Integer.compare(e02, i14) : i9 != i15 ? Integer.compare(i9, i15) : Integer.compare(i10, this.H0)) < 0) {
            i13 = this.G0;
            i11 = this.I0;
            i12 = this.H0;
        } else {
            int i16 = this.G0;
            i11 = i9;
            i9 = this.I0;
            i12 = i10;
            i10 = this.H0;
            e02 = i16;
            i13 = e02;
        }
        if (e02 == i13 && i9 == i11 && i10 == i12) {
            f(false);
            return true;
        }
        this.u0 = e02;
        this.v0 = i9;
        this.w0 = i10;
        this.x0 = i13;
        this.y0 = i11;
        this.z0 = i12;
        O();
        x();
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.invalidate();
        }
        g gVar = this.r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        return true;
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean d() {
        f2.m0 m0Var = this.E0;
        if (m0Var == null) {
            return true;
        }
        int L0 = m0Var.L0();
        int N0 = this.E0.N0();
        int i9 = this.u0;
        if ((L0 < i9 || L0 > this.x0) && (N0 < i9 || N0 > this.x0)) {
            return i9 >= L0 && this.x0 <= N0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d0(int i9, int i10, m9 m9Var) {
        int i11 = 0;
        if (m9Var instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) m9Var;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt instanceof m9) {
                    float f10 = i10;
                    if (f10 > childAt.getY() && f10 < childAt.getY() + childAt.getHeight()) {
                        return d0((int) (i9 - childAt.getX()), (int) (f10 - childAt.getY()), (m9) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var.fillTextLayoutBlocks(arrayList);
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i15 = -1;
        while (true) {
            if (size < 0) {
                i11 = i14;
                size = i15;
                break;
            }
            y9 y9Var = (y9) arrayList.get(size);
            int y10 = y9Var.getY();
            int height = y9Var.getLayout().getHeight() + y10;
            if (i10 >= y10 && i10 < height) {
                break;
            }
            int min = Math.min(Math.abs(i10 - y10), Math.abs(i10 - height));
            if (min < i14) {
                i15 = size;
                i14 = min;
            }
            size--;
        }
        if (size < 0) {
            return -1;
        }
        int row = ((y9) arrayList.get(size)).getRow();
        if (row > 0 && i11 < AndroidUtilities.dp(24.0f)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                y9 y9Var2 = (y9) arrayList.get(size2);
                if (y9Var2.getRow() == row) {
                    int x10 = y9Var2.getX();
                    int width = y9Var2.getLayout().getWidth() + y9Var2.getX();
                    if (i9 >= x10 && i9 <= width) {
                        return size2;
                    }
                    int min2 = Math.min(Math.abs(i9 - x10), Math.abs(i9 - width));
                    if (min2 < i13) {
                        size = size2;
                        i13 = min2;
                    }
                }
            }
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e0(m9 m9Var) {
        ViewGroup viewGroup;
        View view = (View) m9Var;
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

    @Override // org.telegram.ui.Cells.aa
    public final void f(boolean z10) {
        super.f(z10);
        this.u0 = -1;
        this.x0 = -1;
        this.v0 = -1;
        this.y0 = -1;
        this.B0.clear();
        this.D0.clear();
        this.G0 = -1;
        this.H0 = -1;
    }

    @Override // org.telegram.ui.Cells.aa
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final CharSequence t(m9 m9Var, boolean z10) {
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var.fillTextLayoutBlocks(arrayList);
        int i9 = z10 ? this.A0 : this.J0 ? this.v0 : this.y0;
        return (arrayList.isEmpty() || i9 < 0 || i9 >= arrayList.size()) ? "" : ((y9) arrayList.get(i9)).getLayout().getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g0(View view) {
        if (!(view instanceof m9)) {
            return false;
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        ((m9) view).fillTextLayoutBlocks(arrayList);
        if (view instanceof org.telegram.ui.x2) {
            return true;
        }
        return !arrayList.isEmpty();
    }

    public final void h0(m9 m9Var, m9 m9Var2, int i9) {
        int i10;
        int e02 = e0(m9Var2);
        int e03 = m9Var != null ? e0(m9Var) : -1;
        x();
        if (this.R && (i10 = this.u0) == this.x0) {
            if (e02 == i10) {
                if (i9 < this.v0) {
                    this.v0 = i9;
                    P();
                    this.j = true;
                    int i11 = this.v;
                    this.w0 = i11;
                    this.u = i11 - 1;
                } else {
                    this.y0 = i9;
                    O();
                    this.j = false;
                    this.z0 = 0;
                }
            } else if (e02 < i10) {
                this.u0 = e02;
                this.v0 = i9;
                P();
                this.j = true;
                int i12 = this.v;
                this.w0 = i12;
                this.u = i12 - 1;
            } else {
                this.x0 = e02;
                this.y0 = i9;
                O();
                this.j = false;
                this.z0 = 0;
            }
        } else if (this.j) {
            if (e02 == e03) {
                int i13 = this.y0;
                if (i9 <= i13 || e02 < this.x0) {
                    this.u0 = e02;
                    this.v0 = i9;
                    P();
                    this.w0 = this.v;
                } else {
                    this.x0 = e02;
                    this.v0 = i13;
                    this.y0 = i9;
                    this.w0 = this.z0;
                    O();
                    this.z0 = 0;
                    this.j = false;
                }
            } else if (e02 <= this.x0) {
                this.u0 = e02;
                this.v0 = i9;
                P();
                this.w0 = this.v;
            } else {
                this.x0 = e02;
                this.v0 = this.y0;
                this.y0 = i9;
                this.w0 = this.z0;
                O();
                this.z0 = 0;
                this.j = false;
            }
        } else if (e02 == e03) {
            int i14 = this.v0;
            if (i9 >= i14 || e02 > this.u0) {
                this.x0 = e02;
                this.y0 = i9;
                O();
                this.z0 = 0;
            } else {
                this.u0 = e02;
                this.y0 = i14;
                this.v0 = i9;
                this.z0 = this.w0;
                P();
                this.j = true;
                this.w0 = this.v;
            }
        } else if (e02 >= this.u0) {
            this.x0 = e02;
            this.y0 = i9;
            O();
            this.z0 = 0;
        } else {
            this.u0 = e02;
            this.y0 = this.v0;
            this.v0 = i9;
            this.z0 = this.w0;
            P();
            this.j = true;
            this.w0 = this.v;
        }
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var2.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.D0.put(e02, size);
        for (int i15 = 0; i15 < size; i15++) {
            X((y9) arrayList.get(i15), e02, i15);
        }
    }

    public final void i0(m9 m9Var, int i9) {
        ArrayList arrayList = this.F0;
        arrayList.clear();
        m9Var.fillTextLayoutBlocks(arrayList);
        int size = arrayList.size();
        this.D0.put(i9, size);
        for (int i10 = 0; i10 < size; i10++) {
            X((y9) arrayList.get(i10), i9, i10);
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final void j(int i9, q9 q9Var, boolean z10) {
        ArrayList arrayList = this.F0;
        arrayList.clear();
        q9Var.e = null;
        m9 m9Var = (m9) (z10 ? this.X : this.W);
        if (m9Var == null) {
            q9Var.b = null;
            return;
        }
        m9Var.fillTextLayoutBlocks(arrayList);
        int i10 = z10 ? this.A0 : this.J0 ? this.v0 : this.y0;
        if (i10 < 0 || i10 >= arrayList.size()) {
            q9Var.b = null;
            return;
        }
        q9Var.b = ((y9) arrayList.get(i10)).getLayout();
        q9Var.e = ((y9) arrayList.get(i10)).getSelectionBounds();
        q9Var.c = 0.0f;
        q9Var.d = 0.0f;
    }

    public final void j0(int i9, int i10) {
        m9 m9Var;
        if (i9 < 0 || i10 < i9) {
            return;
        }
        CharSequence charSequence = (CharSequence) this.B0.get(i10);
        int length = charSequence == null ? 0 : charSequence.length();
        if (this.F != null) {
            for (int i11 = 0; i11 < this.F.getChildCount(); i11++) {
                KeyEvent.Callback childAt = this.F.getChildAt(i11);
                if (childAt instanceof m9) {
                    m9Var = (m9) childAt;
                    if (e0(m9Var) == i10) {
                        break;
                    }
                }
            }
        }
        m9Var = null;
        this.W = m9Var;
        this.u = 0;
        this.v = length;
        this.u0 = i9;
        this.x0 = i10;
        this.y0 = 0;
        this.v0 = 0;
        this.w0 = 0;
        this.z0 = length;
        SparseIntArray sparseIntArray = this.D0;
        sparseIntArray.put(i9, Math.max(1, sparseIntArray.get(i9)));
        sparseIntArray.put(i10, Math.max(1, sparseIntArray.get(i10)));
        this.G0 = i9;
        this.H0 = 0;
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.setVisibility(0);
        }
        V();
        x();
        v();
        g gVar = this.r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        g7.a6 a6Var = this.D;
        if (a6Var != null) {
            a6Var.a(true);
        }
    }

    public final boolean k0(m9 m9Var, int i9, int i10, int i11) {
        int e02 = e0(m9Var);
        if (e02 < 0 || i10 == i11) {
            return false;
        }
        int min = Math.min(i10, i11);
        int max = Math.max(i10, i11);
        this.W = m9Var;
        this.u = min;
        this.v = max;
        this.x0 = e02;
        this.u0 = e02;
        this.y0 = i9;
        this.v0 = i9;
        this.w0 = min;
        this.z0 = max;
        this.G0 = e02;
        this.H0 = i10;
        this.I0 = i9;
        i0(m9Var, e02);
        ArrayList arrayList = this.F0;
        if (!arrayList.isEmpty() && i9 >= 0 && i9 < arrayList.size()) {
            this.a = ((y9) arrayList.get(i9)).getX();
            this.b = ((y9) arrayList.get(i9)).getY();
        } else if (!arrayList.isEmpty()) {
            this.a = ((y9) arrayList.get(0)).getX();
            this.b = ((y9) arrayList.get(0)).getY();
        }
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.setVisibility(0);
        }
        V();
        x();
        v();
        g gVar = this.r0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
        g7.a6 a6Var = this.D;
        if (a6Var != null) {
            a6Var.a(true);
        }
        m9Var.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int l(int i9, int i10, int i11, int i12, v9 v9Var, boolean z10) {
        m9 m9Var = (m9) v9Var;
        if (m9Var != null) {
            int i13 = i9 - i11;
            int i14 = i10 - i12;
            ArrayList arrayList = this.F0;
            arrayList.clear();
            m9Var.fillTextLayoutBlocks(arrayList);
            int i15 = z10 ? this.A0 : this.J0 ? this.v0 : this.y0;
            if (i15 >= 0 && i15 < arrayList.size()) {
                Layout layout = ((y9) arrayList.get(i15)).getLayout();
                if (i13 < 0) {
                    i13 = 1;
                }
                if (i14 < 0) {
                    i14 = 1;
                }
                if (i13 > layout.getWidth()) {
                    i13 = layout.getWidth();
                }
                if (i14 > layout.getLineBottom(layout.getLineCount() - 1)) {
                    i14 = layout.getLineBottom(layout.getLineCount() - 1) - 1;
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= layout.getLineCount()) {
                        i16 = -1;
                        break;
                    }
                    if (i14 >= layout.getLineTop(i16) && i14 <= layout.getLineBottom(i16)) {
                        break;
                    }
                    i16++;
                }
                if (i16 >= 0) {
                    return layout.getOffsetForHorizontal(i16, i13);
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(View view, int i9, int i10) {
        if (view instanceof m9) {
            this.s = i9;
            this.t = i10;
            m9 m9Var = (m9) view;
            this.X = m9Var;
            int d02 = d0(i9, i10, m9Var);
            this.A0 = d02;
            if (d02 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.F0;
            this.c = ((y9) arrayList.get(d02)).getX();
            this.d = ((y9) arrayList.get(this.A0)).getY();
        }
    }

    public final void m0() {
        if (this.X != null) {
            this.g0.run();
        }
    }

    @Override // org.telegram.ui.Cells.aa
    public final int n() {
        if (this.W != null) {
            ArrayList arrayList = this.F0;
            arrayList.clear();
            ((m9) this.W).fillTextLayoutBlocks(arrayList);
            int i9 = this.J0 ? this.v0 : this.y0;
            if (i9 >= 0 && i9 < arrayList.size()) {
                Layout layout = ((y9) arrayList.get(i9)).getLayout();
                int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                    int lineBottom = layout.getLineBottom(i11) - layout.getLineTop(i11);
                    if (lineBottom < i10) {
                        i10 = lineBottom;
                    }
                }
                return i10;
            }
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.aa
    public final CharSequence s() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i9 = this.u0;
        while (true) {
            int i10 = this.x0;
            if (i9 > i10) {
                break;
            }
            int i11 = this.u0;
            SparseIntArray sparseIntArray = this.D0;
            SparseArray sparseArray = this.B0;
            SparseArray sparseArray2 = this.C0;
            if (i9 == i11) {
                int i12 = i11 == i10 ? this.y0 : sparseIntArray.get(i9) - 1;
                for (int i13 = this.v0; i13 <= i12; i13++) {
                    int i14 = (i13 << 16) + i9;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i14);
                    if (charSequence != null) {
                        int i15 = this.u0;
                        int i16 = this.x0;
                        if (i15 == i16 && i13 == this.y0 && i13 == this.v0) {
                            int i17 = this.z0;
                            int i18 = this.w0;
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
                        } else if (i15 == i16 && i13 == this.y0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i19 = this.z0;
                            if (i19 > charSequence.length()) {
                                i19 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i19));
                            spannableStringBuilder.append('\n');
                        } else if (i13 == this.v0) {
                            int i20 = this.w0;
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
            } else if (i9 == i10) {
                for (int i21 = 0; i21 <= this.y0; i21++) {
                    int i22 = (i21 << 16) + i9;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i22);
                    if (charSequence4 != null) {
                        if (this.u0 == this.x0 && i21 == this.y0 && i21 == this.v0) {
                            int i23 = this.z0;
                            int i24 = this.w0;
                            if (i24 < charSequence4.length()) {
                                if (i23 > charSequence4.length()) {
                                    i23 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i24, i23));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i21 == this.y0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i22);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i25 = this.z0;
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
                int i26 = sparseIntArray.get(i9);
                for (int i27 = this.v0; i27 < i26; i27++) {
                    int i28 = (i27 << 16) + i9;
                    CharSequence charSequence7 = (CharSequence) sparseArray2.get(i28);
                    if (charSequence7 != null) {
                        spannableStringBuilder.append(charSequence7).append(' ');
                    }
                    spannableStringBuilder.append((CharSequence) sparseArray.get(i28));
                    spannableStringBuilder.append('\n');
                }
            }
            i9++;
        }
        if (spannableStringBuilder.length() <= 0) {
            return null;
        }
        t9[] t9VarArr = (t9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, t9.class);
        if (t9VarArr != null && t9VarArr.length > 0) {
            Arrays.sort(t9VarArr, new o1(spannableStringBuilder, 1));
            for (t9 t9Var : t9VarArr) {
                int spanStart = spannableStringBuilder.getSpanStart(t9Var);
                int spanEnd = spannableStringBuilder.getSpanEnd(t9Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    CharSequence charSequence8 = t9Var.a;
                    if (charSequence8 == null) {
                        charSequence8 = "";
                    }
                    spannableStringBuilder.replace(spanStart, spanEnd, charSequence8);
                }
            }
        }
        for (p9 p9Var : (p9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, p9.class)) {
            spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(p9Var), spannableStringBuilder.getSpanEnd(p9Var));
        }
        return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
    }

    @Override // org.telegram.ui.Cells.aa
    public final void x() {
        super.x();
        if (this.F != null) {
            for (int i9 = 0; i9 < this.F.getChildCount(); i9++) {
                this.F.getChildAt(i9).invalidate();
            }
        }
    }
}

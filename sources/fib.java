// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class fib extends rib {
    public boolean E0;
    public int r0;
    public int u0;
    public t26 z0;
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

    public fib() {
        this.Z = true;
    }

    public static CharSequence X(CharSequence charSequence) {
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

    @Override // rib
    public void E() {
        int c0 = c0((eib) this.W);
        int i = this.E0 ? this.q0 : this.t0;
        if (c0 == this.p0 && i == this.q0) {
            this.r0 = this.u;
        }
        if (c0 == this.s0 && i == this.t0) {
            this.u0 = this.v;
        }
    }

    @Override // rib
    public final void K(mib mibVar, mib mibVar2) {
        eib eibVar = (eib) mibVar;
        int c0 = c0(eibVar);
        if (c0 >= 0) {
            this.s0 = c0;
            this.p0 = c0;
            int i = this.v0;
            this.t0 = i;
            this.q0 = i;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            eibVar.k(arrayList);
            int size = arrayList.size();
            this.y0.put(c0, size);
            for (int i2 = 0; i2 < size; i2++) {
                V(c0, i2, (pib) arrayList.get(i2));
            }
        }
    }

    @Override // rib
    public final void M() {
        if (w()) {
            this.E0 = false;
            int i = this.s0;
            if (i >= 0) {
                t26 t26Var = this.z0;
                eib eibVar = t26Var != null ? (eib) t26Var.m(i) : i < this.F.getChildCount() ? (eib) this.F.getChildAt(this.s0) : null;
                if (eibVar == null) {
                    this.W = null;
                    return;
                }
                this.W = eibVar;
                if (this.p0 != this.s0) {
                    this.u = 0;
                } else if (this.q0 != this.t0) {
                    this.u = 0;
                } else {
                    this.u = this.r0;
                }
                this.v = this.u0;
                CharSequence r = r(eibVar, false);
                if (this.v > r.length()) {
                    this.v = r.length();
                }
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((eib) this.W).k(arrayList);
                int i2 = this.t0;
                if (i2 < 0 || i2 >= arrayList.size()) {
                    return;
                }
                this.a = ((pib) arrayList.get(this.t0)).getX();
                this.b = ((pib) arrayList.get(this.t0)).getY();
            }
        }
    }

    @Override // rib
    public final void N() {
        if (w()) {
            this.E0 = true;
            int i = this.p0;
            if (i >= 0) {
                t26 t26Var = this.z0;
                eib eibVar = t26Var != null ? (eib) t26Var.m(i) : this.s0 < this.F.getChildCount() ? (eib) this.F.getChildAt(this.p0) : null;
                if (eibVar == null) {
                    this.W = null;
                    return;
                }
                this.W = eibVar;
                if (this.p0 != this.s0) {
                    this.v = r(eibVar, false).length();
                } else if (this.q0 != this.t0) {
                    this.v = r(eibVar, false).length();
                } else {
                    this.v = this.u0;
                }
                this.u = this.r0;
                ArrayList arrayList = this.A0;
                arrayList.clear();
                ((eib) this.W).k(arrayList);
                int i2 = this.q0;
                if (i2 < 0 || i2 >= arrayList.size()) {
                    return;
                }
                this.a = ((pib) arrayList.get(this.q0)).getX();
                this.b = ((pib) arrayList.get(this.q0)).getY();
            }
        }
    }

    @Override // rib
    public final boolean O(int i, int i2) {
        if (this.Z) {
            if (i2 <= ((eib) this.W).getTop() || i2 >= ((eib) this.W).getBottom()) {
                int childCount = this.F.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    if (e0(this.F.getChildAt(i3))) {
                        eib eibVar = (eib) this.F.getChildAt(i3);
                        if (i2 > eibVar.getTop() && i2 < eibVar.getBottom()) {
                            int b0 = b0((int) (i - eibVar.getX()), (int) (i2 - eibVar.getY()), eibVar);
                            if (b0 >= 0) {
                                f0((eib) this.W, eibVar, b0);
                                this.W = eibVar;
                                return true;
                            }
                        }
                    }
                    i3++;
                }
            } else {
                int i4 = this.E0 ? this.q0 : this.t0;
                int b02 = b0((int) (i - ((eib) this.W).getX()), (int) (i2 - ((eib) this.W).getY()), (eib) this.W);
                if (b02 != i4 && b02 >= 0) {
                    eib eibVar2 = (eib) this.W;
                    f0(eibVar2, eibVar2, b02);
                    return true;
                }
            }
        }
        return false;
    }

    public final void V(int i, int i2, pib pibVar) {
        int i3 = i + (i2 << 16);
        this.w0.put(i3, X(pibVar.getText()));
        CharSequence prefix = pibVar.getPrefix();
        SparseArray sparseArray = this.x0;
        if (prefix == null) {
            sparseArray.remove(i3);
        } else {
            sparseArray.put(i3, X(prefix));
        }
    }

    public final void W(int i, String str) {
        this.w0.put(i, X(str));
        this.x0.remove(i);
        SparseIntArray sparseIntArray = this.y0;
        sparseIntArray.put(i, Math.max(1, sparseIntArray.get(i)));
    }

    public final void Y(Canvas canvas, eib eibVar, int i) {
        pib pibVar;
        int i2;
        int i3;
        int i4 = bkb.kg;
        this.o.setColor(bkb.v0(i4, this.g0));
        this.p.setColor(bkb.v0(i4, this.g0));
        int c0 = c0(eibVar);
        if (c0 >= 0) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            eibVar.k(arrayList);
            if (i < 0 || i >= arrayList.size() || (pibVar = (pib) arrayList.get(i)) == null || pibVar.a() == null || pibVar.a().getText() == null) {
                return;
            }
            int i5 = this.u0;
            int length = pibVar.a().getText().length();
            if (i5 > length) {
                i5 = length;
            }
            int i6 = this.p0;
            if (c0 == i6) {
                int i7 = this.s0;
                int i8 = this.q0;
                if (c0 == i7) {
                    int i9 = this.t0;
                    if (i8 == i9 && i8 == i) {
                        g(canvas, pibVar.a(), this.r0, i5, true, true, 0.0f);
                        return;
                    }
                    if (i == i8) {
                        g(canvas, pibVar.a(), this.r0, length, true, false, 0.0f);
                        return;
                    }
                    int i10 = i5;
                    if (i == i9) {
                        g(canvas, pibVar.a(), 0, i10, false, true, 0.0f);
                        return;
                    } else {
                        if (i <= i8 || i >= i9) {
                            return;
                        }
                        g(canvas, pibVar.a(), 0, length, false, false, 0.0f);
                        return;
                    }
                }
                i2 = i5;
                i3 = length;
                if (i8 == i) {
                    g(canvas, pibVar.a(), this.r0, i3, true, false, 0.0f);
                    return;
                }
            } else {
                i2 = i5;
                i3 = length;
            }
            int i11 = this.s0;
            if (c0 == i11 && this.t0 == i) {
                g(canvas, pibVar.a(), 0, i2, false, true, 0.0f);
                return;
            }
            if ((c0 <= i6 || c0 >= i11) && ((c0 != i6 || i <= this.q0) && (c0 != i11 || i >= this.t0))) {
                return;
            }
            g(canvas, pibVar.a(), 0, i3, false, false, 0.0f);
        }
    }

    public final boolean Z() {
        int i;
        int length;
        if (w() && this.W != null && this.p0 == this.s0 && (i = this.q0) == this.t0) {
            if (i < 0) {
                i = 0;
            }
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((eib) this.W).k(arrayList);
            if (!arrayList.isEmpty() && i < arrayList.size() && (length = ((pib) arrayList.get(i)).a().getText().length()) > 0 && (this.r0 > 0 || this.u0 < length)) {
                return i0((eib) this.W, i, 0, length);
            }
        }
        return false;
    }

    public final boolean a0(int i, int i2, eib eibVar) {
        int i3;
        int c0 = c0(eibVar);
        if (c0 < 0) {
            return false;
        }
        if (this.B0 < 0) {
            this.B0 = this.p0;
            this.D0 = this.q0;
            this.C0 = this.r0;
        }
        g0(eibVar, c0);
        int i4 = this.B0;
        int i5 = this.D0;
        int compare = c0 != i4 ? Integer.compare(c0, i4) : i != i5 ? Integer.compare(i, i5) : Integer.compare(i2, this.C0);
        int i6 = this.B0;
        int i7 = this.D0;
        if (compare < 0) {
            i3 = this.C0;
        } else {
            i7 = i;
            i = i7;
            i3 = i2;
            i2 = this.C0;
            i6 = c0;
            c0 = i6;
        }
        if (c0 == i6 && i == i7 && i2 == i3) {
            e(false);
            return true;
        }
        this.p0 = c0;
        this.q0 = i;
        this.r0 = i2;
        this.s0 = i6;
        this.t0 = i7;
        this.u0 = i3;
        M();
        v();
        qib qibVar = this.C;
        if (qibVar != null) {
            qibVar.invalidate();
        }
        kya kyaVar = this.m0;
        gl.r(kyaVar);
        gl.c3(kyaVar);
        return true;
    }

    @Override // rib
    public final boolean b(int i) {
        if (this.p0 == this.s0 && this.q0 == this.t0) {
            return super.b(i);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b0(int i, int i2, eib eibVar) {
        int i3 = 0;
        if (eibVar instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) eibVar;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt instanceof eib) {
                    float f = i2;
                    if (f > childAt.getY() && f < childAt.getY() + childAt.getHeight()) {
                        return b0((int) (i - childAt.getX()), (int) (f - childAt.getY()), (eib) childAt);
                    }
                }
            }
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        eibVar.k(arrayList);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size() - 1;
            int i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i6 = -1;
            int i7 = Integer.MAX_VALUE;
            while (true) {
                if (size < 0) {
                    i3 = i7;
                    size = i6;
                    break;
                }
                pib pibVar = (pib) arrayList.get(size);
                int y = pibVar.getY();
                int height = pibVar.a().getHeight() + y;
                if (i2 >= y && i2 < height) {
                    break;
                }
                int min = Math.min(Math.abs(i2 - y), Math.abs(i2 - height));
                if (min < i7) {
                    i6 = size;
                    i7 = min;
                }
                size--;
            }
            if (size >= 0) {
                int row = ((pib) arrayList.get(size)).getRow();
                if (row > 0 && i3 < gl.L(24.0f)) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        pib pibVar2 = (pib) arrayList.get(size2);
                        if (pibVar2.getRow() == row) {
                            int x = pibVar2.getX();
                            int width = pibVar2.a().getWidth() + pibVar2.getX();
                            if (i >= x && i <= width) {
                                return size2;
                            }
                            int min2 = Math.min(Math.abs(i - x), Math.abs(i - width));
                            if (min2 < i5) {
                                size = size2;
                                i5 = min2;
                            }
                        }
                    }
                }
                return size;
            }
        }
        return -1;
    }

    @Override // rib
    public final boolean c() {
        t26 t26Var = this.z0;
        if (t26Var == null) {
            return true;
        }
        int K0 = t26Var.K0();
        int M0 = this.z0.M0();
        int i = this.p0;
        if ((K0 < i || K0 > this.s0) && (M0 < i || M0 > this.s0)) {
            return i >= K0 && this.s0 <= M0;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c0(eib eibVar) {
        ViewGroup viewGroup;
        View view = (View) eibVar;
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

    @Override // rib
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final CharSequence r(eib eibVar, boolean z) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        eibVar.k(arrayList);
        int i = z ? this.v0 : this.E0 ? this.q0 : this.t0;
        return (arrayList.isEmpty() || i < 0 || i >= arrayList.size()) ? "" : ((pib) arrayList.get(i)).a().getText();
    }

    @Override // rib
    public final void e(boolean z) {
        super.e(z);
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
    public final boolean e0(View view) {
        if (!(view instanceof eib)) {
            return false;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        ((eib) view).k(arrayList);
        if (view instanceof uv) {
            return true;
        }
        return !arrayList.isEmpty();
    }

    public final void f0(eib eibVar, eib eibVar2, int i) {
        int i2;
        int c0 = c0(eibVar2);
        int c02 = eibVar != null ? c0(eibVar) : -1;
        v();
        if (this.R && (i2 = this.p0) == this.s0) {
            if (c0 == i2) {
                if (i < this.q0) {
                    this.q0 = i;
                    N();
                    this.j = true;
                    int i3 = this.v;
                    this.r0 = i3;
                    this.u = i3 - 1;
                } else {
                    this.t0 = i;
                    M();
                    this.j = false;
                    this.u0 = 0;
                }
            } else if (c0 < i2) {
                this.p0 = c0;
                this.q0 = i;
                N();
                this.j = true;
                int i4 = this.v;
                this.r0 = i4;
                this.u = i4 - 1;
            } else {
                this.s0 = c0;
                this.t0 = i;
                M();
                this.j = false;
                this.u0 = 0;
            }
        } else if (this.j) {
            if (c0 == c02) {
                int i5 = this.t0;
                if (i <= i5 || c0 < this.s0) {
                    this.p0 = c0;
                    this.q0 = i;
                    N();
                    this.r0 = this.v;
                } else {
                    this.s0 = c0;
                    this.q0 = i5;
                    this.t0 = i;
                    this.r0 = this.u0;
                    M();
                    this.u0 = 0;
                    this.j = false;
                }
            } else if (c0 <= this.s0) {
                this.p0 = c0;
                this.q0 = i;
                N();
                this.r0 = this.v;
            } else {
                this.s0 = c0;
                this.q0 = this.t0;
                this.t0 = i;
                this.r0 = this.u0;
                M();
                this.u0 = 0;
                this.j = false;
            }
        } else if (c0 == c02) {
            int i6 = this.q0;
            if (i >= i6 || c0 > this.p0) {
                this.s0 = c0;
                this.t0 = i;
                M();
                this.u0 = 0;
            } else {
                this.p0 = c0;
                this.t0 = i6;
                this.q0 = i;
                this.u0 = this.r0;
                N();
                this.j = true;
                this.r0 = this.v;
            }
        } else if (c0 >= this.p0) {
            this.s0 = c0;
            this.t0 = i;
            M();
            this.u0 = 0;
        } else {
            this.p0 = c0;
            this.t0 = this.q0;
            this.q0 = i;
            this.u0 = this.r0;
            N();
            this.j = true;
            this.r0 = this.v;
        }
        ArrayList arrayList = this.A0;
        arrayList.clear();
        eibVar2.k(arrayList);
        int size = arrayList.size();
        this.y0.put(c0, size);
        for (int i7 = 0; i7 < size; i7++) {
            V(c0, i7, (pib) arrayList.get(i7));
        }
    }

    public final void g0(eib eibVar, int i) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        eibVar.k(arrayList);
        int size = arrayList.size();
        this.y0.put(i, size);
        for (int i2 = 0; i2 < size; i2++) {
            V(i, i2, (pib) arrayList.get(i2));
        }
    }

    @Override // rib
    public final void h(int i, hi2 hi2Var, boolean z) {
        ArrayList arrayList = this.A0;
        arrayList.clear();
        hi2Var.e = null;
        eib eibVar = (eib) (z ? this.X : this.W);
        if (eibVar == null) {
            hi2Var.d = null;
            return;
        }
        eibVar.k(arrayList);
        int i2 = z ? this.v0 : this.E0 ? this.q0 : this.t0;
        if (i2 < 0 || i2 >= arrayList.size()) {
            hi2Var.d = null;
            return;
        }
        hi2Var.d = ((pib) arrayList.get(i2)).a();
        hi2Var.e = ((pib) arrayList.get(i2)).c();
        hi2Var.b = 0.0f;
        hi2Var.c = 0.0f;
    }

    public final void h0(int i, int i2) {
        eib eibVar;
        if (i < 0 || i2 < i) {
            return;
        }
        CharSequence charSequence = (CharSequence) this.w0.get(i2);
        int length = charSequence == null ? 0 : charSequence.length();
        if (this.F != null) {
            for (int i3 = 0; i3 < this.F.getChildCount(); i3++) {
                KeyEvent.Callback childAt = this.F.getChildAt(i3);
                if (childAt instanceof eib) {
                    eibVar = (eib) childAt;
                    if (c0(eibVar) == i2) {
                        break;
                    }
                }
            }
        }
        eibVar = null;
        this.W = eibVar;
        this.u = 0;
        this.v = length;
        this.p0 = i;
        this.s0 = i2;
        this.t0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        this.u0 = length;
        SparseIntArray sparseIntArray = this.y0;
        sparseIntArray.put(i, Math.max(1, sparseIntArray.get(i)));
        sparseIntArray.put(i2, Math.max(1, sparseIntArray.get(i2)));
        this.B0 = i;
        this.C0 = 0;
        qib qibVar = this.C;
        if (qibVar != null) {
            qibVar.setVisibility(0);
        }
        S();
        v();
        t();
        kya kyaVar = this.m0;
        gl.r(kyaVar);
        gl.c3(kyaVar);
        ive iveVar = this.D;
        if (iveVar != null) {
            iveVar.a(true);
        }
    }

    public final boolean i0(eib eibVar, int i, int i2, int i3) {
        int c0 = c0(eibVar);
        if (c0 < 0 || i2 == i3) {
            return false;
        }
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        this.W = eibVar;
        this.u = min;
        this.v = max;
        this.s0 = c0;
        this.p0 = c0;
        this.t0 = i;
        this.q0 = i;
        this.r0 = min;
        this.u0 = max;
        this.B0 = c0;
        this.C0 = i2;
        this.D0 = i;
        g0(eibVar, c0);
        ArrayList arrayList = this.A0;
        if (!arrayList.isEmpty() && i >= 0 && i < arrayList.size()) {
            this.a = ((pib) arrayList.get(i)).getX();
            this.b = ((pib) arrayList.get(i)).getY();
        } else if (!arrayList.isEmpty()) {
            this.a = ((pib) arrayList.get(0)).getX();
            this.b = ((pib) arrayList.get(0)).getY();
        }
        qib qibVar = this.C;
        if (qibVar != null) {
            qibVar.setVisibility(0);
        }
        S();
        v();
        t();
        kya kyaVar = this.m0;
        gl.r(kyaVar);
        gl.c3(kyaVar);
        ive iveVar = this.D;
        if (iveVar != null) {
            iveVar.a(true);
        }
        eibVar.invalidate();
        return true;
    }

    @Override // rib
    public final int j(int i, int i2, int i3, int i4, mib mibVar, boolean z) {
        eib eibVar = (eib) mibVar;
        if (eibVar != null) {
            int i5 = i - i3;
            int i6 = i2 - i4;
            ArrayList arrayList = this.A0;
            arrayList.clear();
            eibVar.k(arrayList);
            int i7 = z ? this.v0 : this.E0 ? this.q0 : this.t0;
            if (i7 >= 0 && i7 < arrayList.size()) {
                Layout a = ((pib) arrayList.get(i7)).a();
                if (i5 < 0) {
                    i5 = 1;
                }
                if (i6 < 0) {
                    i6 = 1;
                }
                if (i5 > a.getWidth()) {
                    i5 = a.getWidth();
                }
                if (i6 > a.getLineBottom(a.getLineCount() - 1)) {
                    i6 = a.getLineBottom(a.getLineCount() - 1) - 1;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= a.getLineCount()) {
                        i8 = -1;
                        break;
                    }
                    if (i6 >= a.getLineTop(i8) && i6 <= a.getLineBottom(i8)) {
                        break;
                    }
                    i8++;
                }
                if (i8 >= 0) {
                    return a.getOffsetForHorizontal(i8, i5);
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(View view, int i, int i2) {
        if (view instanceof eib) {
            this.s = i;
            this.t = i2;
            eib eibVar = (eib) view;
            this.X = eibVar;
            int b0 = b0(i, i2, eibVar);
            this.v0 = b0;
            if (b0 < 0) {
                this.X = null;
                return;
            }
            ArrayList arrayList = this.A0;
            this.c = ((pib) arrayList.get(b0)).getX();
            this.d = ((pib) arrayList.get(this.v0)).getY();
        }
    }

    public final void k0() {
        if (this.X != null) {
            this.f0.run();
        }
    }

    @Override // rib
    public final int l() {
        if (this.W != null) {
            ArrayList arrayList = this.A0;
            arrayList.clear();
            ((eib) this.W).k(arrayList);
            int i = this.E0 ? this.q0 : this.t0;
            if (i >= 0 && i < arrayList.size()) {
                Layout a = ((pib) arrayList.get(i)).a();
                int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i3 = 0; i3 < a.getLineCount(); i3++) {
                    int lineBottom = a.getLineBottom(i3) - a.getLineTop(i3);
                    if (lineBottom < i2) {
                        i2 = lineBottom;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    @Override // rib
    public final CharSequence q() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.p0;
        while (true) {
            int i2 = this.s0;
            if (i > i2) {
                break;
            }
            int i3 = this.p0;
            SparseIntArray sparseIntArray = this.y0;
            SparseArray sparseArray = this.w0;
            SparseArray sparseArray2 = this.x0;
            if (i == i3) {
                int i4 = i3 == i2 ? this.t0 : sparseIntArray.get(i) - 1;
                for (int i5 = this.q0; i5 <= i4; i5++) {
                    int i6 = (i5 << 16) + i;
                    CharSequence charSequence = (CharSequence) sparseArray.get(i6);
                    if (charSequence != null) {
                        int i7 = this.p0;
                        int i8 = this.s0;
                        if (i7 == i8 && i5 == this.t0 && i5 == this.q0) {
                            int i9 = this.u0;
                            int i10 = this.r0;
                            if (i9 >= i10) {
                                i10 = i9;
                                i9 = i10;
                            }
                            if (i9 < charSequence.length()) {
                                if (i10 > charSequence.length()) {
                                    i10 = charSequence.length();
                                }
                                spannableStringBuilder.append(charSequence.subSequence(i9, i10));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i7 == i8 && i5 == this.t0) {
                            CharSequence charSequence2 = (CharSequence) sparseArray2.get(i6);
                            if (charSequence2 != null) {
                                spannableStringBuilder.append(charSequence2).append(' ');
                            }
                            int i11 = this.u0;
                            if (i11 > charSequence.length()) {
                                i11 = charSequence.length();
                            }
                            spannableStringBuilder.append(charSequence.subSequence(0, i11));
                            spannableStringBuilder.append('\n');
                        } else if (i5 == this.q0) {
                            int i12 = this.r0;
                            if (i12 < charSequence.length()) {
                                spannableStringBuilder.append(charSequence.subSequence(i12, charSequence.length()));
                                spannableStringBuilder.append('\n');
                            }
                        } else {
                            CharSequence charSequence3 = (CharSequence) sparseArray2.get(i6);
                            if (charSequence3 != null) {
                                spannableStringBuilder.append(charSequence3).append(' ');
                            }
                            spannableStringBuilder.append(charSequence);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else if (i == i2) {
                for (int i13 = 0; i13 <= this.t0; i13++) {
                    int i14 = (i13 << 16) + i;
                    CharSequence charSequence4 = (CharSequence) sparseArray.get(i14);
                    if (charSequence4 != null) {
                        if (this.p0 == this.s0 && i13 == this.t0 && i13 == this.q0) {
                            int i15 = this.u0;
                            int i16 = this.r0;
                            if (i16 < charSequence4.length()) {
                                if (i15 > charSequence4.length()) {
                                    i15 = charSequence4.length();
                                }
                                spannableStringBuilder.append(charSequence4.subSequence(i16, i15));
                                spannableStringBuilder.append('\n');
                            }
                        } else if (i13 == this.t0) {
                            CharSequence charSequence5 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence5 != null) {
                                spannableStringBuilder.append(charSequence5).append(' ');
                            }
                            int i17 = this.u0;
                            if (i17 > charSequence4.length()) {
                                i17 = charSequence4.length();
                            }
                            spannableStringBuilder.append(charSequence4.subSequence(0, i17));
                            spannableStringBuilder.append('\n');
                        } else {
                            CharSequence charSequence6 = (CharSequence) sparseArray2.get(i14);
                            if (charSequence6 != null) {
                                spannableStringBuilder.append(charSequence6).append(' ');
                            }
                            spannableStringBuilder.append(charSequence4);
                            spannableStringBuilder.append('\n');
                        }
                    }
                }
            } else {
                int i18 = sparseIntArray.get(i);
                for (int i19 = this.q0; i19 < i18; i19++) {
                    int i20 = (i19 << 16) + i;
                    CharSequence charSequence7 = (CharSequence) sparseArray2.get(i20);
                    if (charSequence7 != null) {
                        spannableStringBuilder.append(charSequence7).append(' ');
                    }
                    spannableStringBuilder.append((CharSequence) sparseArray.get(i20));
                    spannableStringBuilder.append('\n');
                }
            }
            i++;
        }
        if (spannableStringBuilder.length() <= 0) {
            return null;
        }
        kib[] kibVarArr = (kib[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, kib.class);
        if (kibVarArr != null && kibVarArr.length > 0) {
            Arrays.sort(kibVarArr, new bz0(spannableStringBuilder, (byte) 9));
            for (kib kibVar : kibVarArr) {
                int spanStart = spannableStringBuilder.getSpanStart(kibVar);
                int spanEnd = spannableStringBuilder.getSpanEnd(kibVar);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    String str = kibVar.a;
                    if (str == null) {
                        str = "";
                    }
                    spannableStringBuilder.replace(spanStart, spanEnd, (CharSequence) str);
                }
            }
        }
        for (hib hibVar : (hib[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length() - 1, hib.class)) {
            spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(hibVar), spannableStringBuilder.getSpanEnd(hibVar));
        }
        return spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1);
    }

    @Override // rib
    public final void v() {
        super.v();
        if (this.F != null) {
            for (int i = 0; i < this.F.getChildCount(); i++) {
                this.F.getChildAt(i).invalidate();
            }
        }
    }

    @Override // rib
    public final void z(int i, int i2, boolean z, float f, float f2, mib mibVar) {
        eib eibVar = (eib) mibVar;
        if (!z || eibVar != this.W || f2 != f) {
            super.z(i, i2, z, f, f2, eibVar);
        } else if (this.j) {
            this.u = i;
        } else {
            this.v = i;
        }
    }
}

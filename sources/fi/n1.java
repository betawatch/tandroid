package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class n1 extends mm0 {
    public pl0 f3;
    public boolean g3;
    public float h3;
    public float i3;
    public boolean j3;
    public final SparseArray k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final ArrayList n3;
    public final ArrayList o3;
    public final PorterDuffColorFilter p3;

    public n1(Context context) {
        super(context, null);
        this.j3 = false;
        this.k3 = new SparseArray();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.o3 = new ArrayList();
        this.p3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void C1(n1 n1Var, int i10, int i11) {
        if (n1Var.f3 == null || !(n1Var.getLayoutManager() instanceof s4.t)) {
            return;
        }
        s4.t tVar = (s4.t) n1Var.getLayoutManager();
        View m10 = tVar.m(i10);
        int L0 = tVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > tVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            n1Var.f3.b = tVar.L0() < i10 ? 0 : 1;
            n1Var.f3.c(i10, i11, false, false);
        } else {
            k1 k1Var = new k1(n1Var, n1Var.getContext(), 0);
            k1Var.a = i10;
            k1Var.p = i11;
            tVar.w0(k1Var);
        }
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        l1 l1Var;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.h3, getWidth(), this.i3);
        if (!this.g3) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.E1;
        if (!rect.isEmpty()) {
            this.B1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.m2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.B1.draw(canvas);
            canvas.restore();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.k3;
            int size = sparseArray.size();
            arrayList = this.l3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof m1) {
                m1 m1Var = (m1) childAt;
                if (m1Var.getY() < this.i3 && m1Var.getY() + m1Var.getHeight() > this.h3) {
                    int y3 = this.j3 ? (int) m1Var.getY() : m1Var.getTop();
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(y3);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) ic.a.y(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList4);
                    }
                    arrayList4.add(m1Var);
                }
            }
        }
        ArrayList arrayList5 = this.o3;
        arrayList5.clear();
        ArrayList arrayList6 = this.n3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.m3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            m1 m1Var2 = (m1) arrayList7.get(i10);
            int R = RecyclerView.R(m1Var2);
            while (true) {
                if (i10 >= arrayList5.size()) {
                    l1Var = null;
                    break;
                } else {
                    if (((l1) arrayList5.get(i10)).M == R) {
                        l1Var = (l1) arrayList5.get(i10);
                        arrayList5.remove(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (l1Var == null) {
                if (arrayList2.isEmpty()) {
                    l1Var = new l1(this);
                    l1Var.l(7);
                } else {
                    l1Var = (l1) ic.a.y(1, arrayList2);
                }
                l1Var.M = R;
                l1Var.e();
            }
            arrayList6.add(l1Var);
            l1Var.O = arrayList7;
            canvas.save();
            canvas.translate(m1Var2.getLeft(), m1Var2.getY());
            l1Var.N = m1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (m1Var2.getLeft() * 2);
            int measuredHeight = m1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                l1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i13++;
            i10 = 0;
        }
        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((l1) arrayList5.get(i14));
                ((l1) arrayList5.get(i14)).O = null;
                ((l1) arrayList5.get(i14)).k();
            } else {
                ((l1) arrayList5.get(i14)).f();
            }
        }
        arrayList5.clear();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2 != null && !(childAt2 instanceof m1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
                canvas.save();
                canvas.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
        canvas.restoreToCount(saveCount);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setLayoutManager(s4.p0 p0Var) {
        super.setLayoutManager(p0Var);
        this.f3 = null;
        if (p0Var instanceof s4.c0) {
            pl0 pl0Var = new pl0(this, (s4.c0) p0Var);
            this.f3 = pl0Var;
            pl0Var.i = new ai.m(this, 1);
            pl0Var.h = new e1.c(this, 6);
        }
    }
}

package ci;

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
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class o1 extends qm0 {
    public tl0 V2;
    public boolean W2;
    public float X2;
    public float Y2;
    public boolean Z2;
    public final SparseArray a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public final ArrayList d3;
    public final ArrayList e3;
    public final PorterDuffColorFilter f3;

    public o1(Context context) {
        super(context, null);
        this.Z2 = false;
        this.a3 = new SparseArray();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.d3 = new ArrayList();
        this.e3 = new ArrayList();
        this.f3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void x1(o1 o1Var, int i10, int i11) {
        if (o1Var.V2 == null || !(o1Var.getLayoutManager() instanceof s4.s)) {
            return;
        }
        s4.s sVar = (s4.s) o1Var.getLayoutManager();
        View m10 = sVar.m(i10);
        int L0 = sVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > sVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            o1Var.V2.b = sVar.L0() < i10 ? 0 : 1;
            o1Var.V2.c(i10, i11, false, false);
        } else {
            l1 l1Var = new l1(o1Var, o1Var.getContext(), 0);
            l1Var.a = i10;
            l1Var.p = i11;
            sVar.w0(l1Var);
        }
    }

    @Override // org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        m1 m1Var;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.X2, getWidth(), this.Y2);
        if (!this.W2) {
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
            sparseArray = this.a3;
            int size = sparseArray.size();
            arrayList = this.b3;
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
            if (childAt instanceof n1) {
                n1 n1Var = (n1) childAt;
                if (n1Var.getY() < this.Y2 && n1Var.getY() + n1Var.getHeight() > this.X2) {
                    int y3 = this.Z2 ? (int) n1Var.getY() : n1Var.getTop();
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(y3);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) hg.c.x(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList4);
                    }
                    arrayList4.add(n1Var);
                }
            }
        }
        ArrayList arrayList5 = this.e3;
        arrayList5.clear();
        ArrayList arrayList6 = this.d3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.c3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            n1 n1Var2 = (n1) arrayList7.get(i10);
            int R = RecyclerView.R(n1Var2);
            while (true) {
                if (i10 >= arrayList5.size()) {
                    m1Var = null;
                    break;
                } else {
                    if (((m1) arrayList5.get(i10)).M == R) {
                        m1Var = (m1) arrayList5.get(i10);
                        arrayList5.remove(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (m1Var == null) {
                if (arrayList2.isEmpty()) {
                    m1Var = new m1(this);
                    m1Var.l(7);
                } else {
                    m1Var = (m1) hg.c.x(1, arrayList2);
                }
                m1Var.M = R;
                m1Var.e();
            }
            arrayList6.add(m1Var);
            m1Var.O = arrayList7;
            canvas.save();
            canvas.translate(n1Var2.getLeft(), n1Var2.getY());
            m1Var.N = n1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (n1Var2.getLeft() * 2);
            int measuredHeight = n1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                m1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i13++;
            i10 = 0;
        }
        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((m1) arrayList5.get(i14));
                ((m1) arrayList5.get(i14)).O = null;
                ((m1) arrayList5.get(i14)).k();
            } else {
                ((m1) arrayList5.get(i14)).f();
            }
        }
        arrayList5.clear();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2 != null && !(childAt2 instanceof n1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
        this.V2 = null;
        if (p0Var instanceof s4.d0) {
            tl0 tl0Var = new tl0(this, (s4.d0) p0Var);
            this.V2 = tl0Var;
            tl0Var.i = new k1(this, 0);
            tl0Var.h = new a1.c(this, 15);
        }
    }
}

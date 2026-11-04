package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vi0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m1 extends tj0 {
    public vi0 f3;
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

    public m1(Context context) {
        super(context, null);
        this.j3 = false;
        this.k3 = new SparseArray();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.o3 = new ArrayList();
        this.p3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void z1(m1 m1Var, int i3, int i10) {
        if (m1Var.f3 == null || !(m1Var.getLayoutManager() instanceof u4.s)) {
            return;
        }
        u4.s sVar = (u4.s) m1Var.getLayoutManager();
        View m10 = sVar.m(i3);
        int L0 = sVar.L0();
        if ((m10 == null && Math.abs(i3 - L0) > sVar.J * 9.0f) || !az.c()) {
            m1Var.f3.b = sVar.L0() < i3 ? 0 : 1;
            m1Var.f3.d(i3, i10, false, false);
        } else {
            j1 j1Var = new j1(0, m1Var.getContext(), m1Var);
            j1Var.a = i3;
            j1Var.p = i10;
            sVar.w0(j1Var);
        }
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        k1 k1Var;
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
        Rect rect = this.F1;
        if (!rect.isEmpty()) {
            this.C1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.n2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.C1.draw(canvas);
            canvas.restore();
        }
        int i3 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.k3;
            int size = sparseArray.size();
            arrayList = this.l3;
            if (i10 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i10++;
        }
        sparseArray.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof l1) {
                l1 l1Var = (l1) childAt;
                if (l1Var.getY() < this.i3 && l1Var.getY() + l1Var.getHeight() > this.h3) {
                    int y9 = this.j3 ? (int) l1Var.getY() : l1Var.getTop();
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(y9);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) org.telegram.ui.Cells.f1.o(1, arrayList) : new ArrayList();
                        sparseArray.put(y9, arrayList4);
                    }
                    arrayList4.add(l1Var);
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
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.m3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            l1 l1Var2 = (l1) arrayList7.get(i3);
            int R = RecyclerView.R(l1Var2);
            while (true) {
                if (i3 >= arrayList5.size()) {
                    k1Var = null;
                    break;
                } else {
                    if (((k1) arrayList5.get(i3)).N == R) {
                        k1Var = (k1) arrayList5.get(i3);
                        arrayList5.remove(i3);
                        break;
                    }
                    i3++;
                }
            }
            if (k1Var == null) {
                if (arrayList2.isEmpty()) {
                    k1Var = new k1(this);
                    k1Var.l(7);
                } else {
                    k1Var = (k1) org.telegram.ui.Cells.f1.o(1, arrayList2);
                }
                k1Var.N = R;
                k1Var.e();
            }
            arrayList6.add(k1Var);
            k1Var.P = arrayList7;
            canvas.save();
            canvas.translate(l1Var2.getLeft(), l1Var2.getY());
            k1Var.O = l1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (l1Var2.getLeft() * 2);
            int measuredHeight = l1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                k1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i12++;
            i3 = 0;
        }
        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((k1) arrayList5.get(i13));
                ((k1) arrayList5.get(i13)).P = null;
                ((k1) arrayList5.get(i13)).k();
            } else {
                ((k1) arrayList5.get(i13)).f();
            }
        }
        arrayList5.clear();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2 != null && !(childAt2 instanceof l1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(u4.o0 o0Var) {
        super.setLayoutManager(o0Var);
        this.f3 = null;
        if (o0Var instanceof u4.b0) {
            vi0 vi0Var = new vi0(this, (u4.b0) o0Var);
            this.f3 = vi0Var;
            vi0Var.i = new bi.h(this, 1);
            vi0Var.h = new ei.y8(this, 6);
        }
    }
}

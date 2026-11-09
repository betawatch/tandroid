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
import org.telegram.messenger.iz;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.si0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m1 extends qj0 {
    public si0 e3;
    public boolean f3;
    public float g3;
    public float h3;
    public boolean i3;
    public final SparseArray j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final ArrayList n3;
    public final PorterDuffColorFilter o3;

    public m1(Context context) {
        super(context, null);
        this.i3 = false;
        this.j3 = new SparseArray();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.o3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void z1(m1 m1Var, int i7, int i10) {
        if (m1Var.e3 == null || !(m1Var.getLayoutManager() instanceof v4.s)) {
            return;
        }
        v4.s sVar = (v4.s) m1Var.getLayoutManager();
        View m10 = sVar.m(i7);
        int L0 = sVar.L0();
        if ((m10 == null && Math.abs(i7 - L0) > sVar.J * 9.0f) || !iz.c()) {
            m1Var.e3.b = sVar.L0() < i7 ? 0 : 1;
            m1Var.e3.d(i7, i10, false, false);
        } else {
            j1 j1Var = new j1(0, m1Var.getContext(), m1Var);
            j1Var.a = i7;
            j1Var.p = i10;
            sVar.w0(j1Var);
        }
    }

    @Override // org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
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
        canvas.clipRect(0.0f, this.g3, getWidth(), this.h3);
        if (!this.f3) {
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
        int i7 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.j3;
            int size = sparseArray.size();
            arrayList = this.k3;
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
                if (l1Var.getY() < this.h3 && l1Var.getY() + l1Var.getHeight() > this.g3) {
                    int y10 = this.i3 ? (int) l1Var.getY() : l1Var.getTop();
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(y10);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList) : new ArrayList();
                        sparseArray.put(y10, arrayList4);
                    }
                    arrayList4.add(l1Var);
                }
            }
        }
        ArrayList arrayList5 = this.n3;
        arrayList5.clear();
        ArrayList arrayList6 = this.m3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.l3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            l1 l1Var2 = (l1) arrayList7.get(i7);
            int R = RecyclerView.R(l1Var2);
            while (true) {
                if (i7 >= arrayList5.size()) {
                    k1Var = null;
                    break;
                } else {
                    if (((k1) arrayList5.get(i7)).M == R) {
                        k1Var = (k1) arrayList5.get(i7);
                        arrayList5.remove(i7);
                        break;
                    }
                    i7++;
                }
            }
            if (k1Var == null) {
                if (arrayList2.isEmpty()) {
                    k1Var = new k1(this);
                    k1Var.l(7);
                } else {
                    k1Var = (k1) org.telegram.ui.Cells.f1.k(1, arrayList2);
                }
                k1Var.M = R;
                k1Var.e();
            }
            arrayList6.add(k1Var);
            k1Var.O = arrayList7;
            canvas.save();
            canvas.translate(l1Var2.getLeft(), l1Var2.getY());
            k1Var.N = l1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (l1Var2.getLeft() * 2);
            int measuredHeight = l1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                k1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i12++;
            i7 = 0;
        }
        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((k1) arrayList5.get(i13));
                ((k1) arrayList5.get(i13)).O = null;
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
    public final void setLayoutManager(v4.n0 n0Var) {
        super.setLayoutManager(n0Var);
        this.e3 = null;
        if (n0Var instanceof v4.b0) {
            si0 si0Var = new si0(this, (v4.b0) n0Var);
            this.e3 = si0Var;
            si0Var.i = new ai.m(this, 1);
            si0Var.h = new di.r4(this, 10);
        }
    }
}

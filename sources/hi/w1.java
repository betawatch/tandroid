package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.ek0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class w1 extends ek0 {
    public org.telegram.ui.ActionBar.l5 f3;
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

    public w1(Context context) {
        super(context, null);
        this.j3 = false;
        this.k3 = new SparseArray();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.o3 = new ArrayList();
        this.p3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void z1(w1 w1Var, int i7, int i10) {
        if (w1Var.f3 == null || !(w1Var.getLayoutManager() instanceof v4.t)) {
            return;
        }
        v4.t tVar = (v4.t) w1Var.getLayoutManager();
        View m10 = tVar.m(i7);
        int L0 = tVar.L0();
        if ((m10 == null && Math.abs(i7 - L0) > tVar.J * 9.0f) || !bz.c()) {
            w1Var.f3.b = tVar.L0() < i7 ? 0 : 1;
            w1Var.f3.k(i7, i10, false, false);
        } else {
            t1 t1Var = new t1(0, w1Var.getContext(), w1Var);
            t1Var.a = i7;
            t1Var.p = i10;
            tVar.w0(t1Var);
        }
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        u1 u1Var;
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
        int i7 = 0;
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
            if (childAt instanceof v1) {
                v1 v1Var = (v1) childAt;
                if (v1Var.getY() < this.i3 && v1Var.getY() + v1Var.getHeight() > this.h3) {
                    int y10 = this.j3 ? (int) v1Var.getY() : v1Var.getTop();
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(y10);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) p5.c.g(1, arrayList) : new ArrayList();
                        sparseArray.put(y10, arrayList4);
                    }
                    arrayList4.add(v1Var);
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
            v1 v1Var2 = (v1) arrayList7.get(i7);
            int R = RecyclerView.R(v1Var2);
            while (true) {
                if (i7 >= arrayList5.size()) {
                    u1Var = null;
                    break;
                } else {
                    if (((u1) arrayList5.get(i7)).N == R) {
                        u1Var = (u1) arrayList5.get(i7);
                        arrayList5.remove(i7);
                        break;
                    }
                    i7++;
                }
            }
            if (u1Var == null) {
                if (arrayList2.isEmpty()) {
                    u1Var = new u1(this);
                    u1Var.l(7);
                } else {
                    u1Var = (u1) p5.c.g(1, arrayList2);
                }
                u1Var.N = R;
                u1Var.e();
            }
            arrayList6.add(u1Var);
            u1Var.P = arrayList7;
            canvas.save();
            canvas.translate(v1Var2.getLeft(), v1Var2.getY());
            u1Var.O = v1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (v1Var2.getLeft() * 2);
            int measuredHeight = v1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                u1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i12++;
            i7 = 0;
        }
        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((u1) arrayList5.get(i13));
                ((u1) arrayList5.get(i13)).P = null;
                ((u1) arrayList5.get(i13)).k();
            } else {
                ((u1) arrayList5.get(i13)).f();
            }
        }
        arrayList5.clear();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2 != null && !(childAt2 instanceof v1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(v4.p0 p0Var) {
        super.setLayoutManager(p0Var);
        this.f3 = null;
        if (p0Var instanceof v4.c0) {
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(this, (v4.c0) p0Var);
            this.f3 = l5Var;
            l5Var.r = new ci.h(this, 1);
            l5Var.n = new di.v6(this, 20);
        }
    }
}

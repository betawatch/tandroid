package kh;

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
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q1 extends wk0 {
    public c2.y T2;
    public boolean U2;
    public float V2;
    public float W2;
    public boolean X2;
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public final PorterDuffColorFilter d3;

    public q1(Context context) {
        super(context, null);
        this.X2 = false;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.d3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void w1(q1 q1Var, int i9, int i10) {
        if (q1Var.T2 == null || !(q1Var.getLayoutManager() instanceof f2.y)) {
            return;
        }
        f2.y yVar = (f2.y) q1Var.getLayoutManager();
        View m10 = yVar.m(i9);
        int L0 = yVar.L0();
        if ((m10 == null && Math.abs(i9 - L0) > yVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            q1Var.T2.b = yVar.L0() < i9 ? 0 : 1;
            q1Var.T2.c(i9, i10, false, false);
        } else {
            n1 n1Var = new n1(q1Var, q1Var.getContext(), 0);
            n1Var.a = i9;
            n1Var.p = i10;
            yVar.w0(n1Var);
        }
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        o1 o1Var;
        if (getVisibility() != 0) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.clipRect(0.0f, this.V2, getWidth(), this.W2);
        if (!this.U2) {
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        Rect rect = this.C1;
        if (!rect.isEmpty()) {
            this.z1.setBounds(rect);
            canvas.save();
            q0.a aVar = this.k2;
            if (aVar != null) {
                aVar.accept(canvas);
            }
            this.z1.draw(canvas);
            canvas.restore();
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.Y2;
            int size = sparseArray.size();
            arrayList = this.Z2;
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
            if (childAt instanceof p1) {
                p1 p1Var = (p1) childAt;
                if (p1Var.getY() < this.W2 && p1Var.getY() + p1Var.getHeight() > this.V2) {
                    int y10 = this.X2 ? (int) p1Var.getY() : p1Var.getTop();
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(y10);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) e2.c.k(1, arrayList) : new ArrayList();
                        sparseArray.put(y10, arrayList4);
                    }
                    arrayList4.add(p1Var);
                }
            }
        }
        ArrayList arrayList5 = this.c3;
        arrayList5.clear();
        ArrayList arrayList6 = this.b3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getWidth(), getHeight() - getPaddingBottom());
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.a3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            p1 p1Var2 = (p1) arrayList7.get(i9);
            int R = RecyclerView.R(p1Var2);
            while (true) {
                if (i9 >= arrayList5.size()) {
                    o1Var = null;
                    break;
                } else {
                    if (((o1) arrayList5.get(i9)).I == R) {
                        o1Var = (o1) arrayList5.get(i9);
                        arrayList5.remove(i9);
                        break;
                    }
                    i9++;
                }
            }
            if (o1Var == null) {
                if (arrayList2.isEmpty()) {
                    o1Var = new o1(this);
                    o1Var.l(7);
                } else {
                    o1Var = (o1) e2.c.k(1, arrayList2);
                }
                o1Var.I = R;
                o1Var.e();
            }
            arrayList6.add(o1Var);
            o1Var.K = arrayList7;
            canvas.save();
            canvas.translate(p1Var2.getLeft(), p1Var2.getY());
            o1Var.J = p1Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (p1Var2.getLeft() * 2);
            int measuredHeight = p1Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                o1Var.a(canvas, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
            }
            canvas.restore();
            i12++;
            i9 = 0;
        }
        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((o1) arrayList5.get(i13));
                ((o1) arrayList5.get(i13)).K = null;
                ((o1) arrayList5.get(i13)).k();
            } else {
                ((o1) arrayList5.get(i13)).f();
            }
        }
        arrayList5.clear();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2 != null && !(childAt2 instanceof p1) && childAt2.getY() <= getHeight() - getPaddingBottom() && childAt2.getY() + childAt2.getHeight() >= getPaddingTop()) {
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
    public final void setLayoutManager(f2.z0 z0Var) {
        super.setLayoutManager(z0Var);
        this.T2 = null;
        if (z0Var instanceof f2.m0) {
            c2.y yVar = new c2.y(this, (f2.m0) z0Var);
            this.T2 = yVar;
            yVar.i = new m1(this, 0);
            yVar.h = new p(this, 1);
        }
    }
}

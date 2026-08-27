package lh;

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
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class o1 extends zk0 {
    public c2.x T2;
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

    public o1(Context context) {
        super(context, null);
        this.X2 = false;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.d3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static void w1(o1 o1Var, int i10, int i11) {
        if (o1Var.T2 == null || !(o1Var.getLayoutManager() instanceof f2.x)) {
            return;
        }
        f2.x xVar = (f2.x) o1Var.getLayoutManager();
        View m10 = xVar.m(i10);
        int L0 = xVar.L0();
        if ((m10 == null && Math.abs(i10 - L0) > xVar.J * 9.0f) || !SharedConfig.animationsEnabled()) {
            o1Var.T2.b = xVar.L0() < i10 ? 0 : 1;
            o1Var.T2.d(i10, i11, false, false);
        } else {
            l1 l1Var = new l1(o1Var, o1Var.getContext(), 0);
            l1Var.a = i10;
            l1Var.p = i11;
            xVar.w0(l1Var);
        }
    }

    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
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
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.Y2;
            int size = sparseArray.size();
            arrayList = this.Z2;
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
                if (n1Var.getY() < this.W2 && n1Var.getY() + n1Var.getHeight() > this.V2) {
                    int y10 = this.X2 ? (int) n1Var.getY() : n1Var.getTop();
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(y10);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) com.google.android.recaptcha.internal.a.k(1, arrayList) : new ArrayList();
                        sparseArray.put(y10, arrayList4);
                    }
                    arrayList4.add(n1Var);
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
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.a3;
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
                    if (((m1) arrayList5.get(i10)).I == R) {
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
                    m1Var = (m1) com.google.android.recaptcha.internal.a.k(1, arrayList2);
                }
                m1Var.I = R;
                m1Var.e();
            }
            arrayList6.add(m1Var);
            m1Var.K = arrayList7;
            canvas.save();
            canvas.translate(n1Var2.getLeft(), n1Var2.getY());
            m1Var.J = n1Var2.getLeft();
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
                ((m1) arrayList5.get(i14)).K = null;
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
    public final void setLayoutManager(f2.x0 x0Var) {
        super.setLayoutManager(x0Var);
        this.T2 = null;
        if (x0Var instanceof f2.k0) {
            c2.x xVar = new c2.x(this, (f2.k0) x0Var);
            this.T2 = xVar;
            xVar.i = new k1(this, 0);
            xVar.h = new p(this, 1);
        }
    }
}

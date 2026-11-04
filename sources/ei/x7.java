package ei;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class x7 extends b5.l {
    public final u7 A0;
    public ArrayList B0;
    public c4 C0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public int G0;
    public Runnable H0;
    public final g4 I0;
    public int J0;
    public int K0;
    public float L0;
    public boolean M0;
    public final a3.o N0;
    public final r9 O0;
    public int P0;
    public final ArrayList Q0;
    public float R0;
    public long x0;
    public ArrayList y0;
    public int z0;

    public x7(int i3, Context context, r9 r9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.B0 = new ArrayList();
        this.E0 = true;
        x xVar = (x) this;
        this.N0 = new a3.o(xVar, 21);
        this.P0 = -1;
        this.Q0 = new ArrayList();
        this.z0 = i3;
        this.I0 = new g4(context);
        this.O0 = r9Var;
        u7 u7Var = new u7(xVar, context, r9Var, e6Var);
        this.A0 = u7Var;
        setAdapter(u7Var);
        a1.c cVar = new a1.c(xVar, 28);
        boolean z10 = this.n0 == null;
        this.n0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.p0 = 1;
        this.o0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new v7(0, xVar, r9Var));
        setOverScrollMode(2);
    }

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) != arrayList2.get(i3)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        boolean z10 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= getChildCount()) {
                z10 = true;
                break;
            }
            w7 w7Var = (w7) getChildAt(i3);
            if (w7Var.d && !w7Var.a.y1.d()) {
                break;
            } else {
                i3++;
            }
        }
        this.O0.x(z10);
    }

    public final void B() {
        if (this.P0 >= 0) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (((Integer) getChildAt(i3).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.P0) {
                    w7 w7Var = (w7) getChildAt(i3);
                    if (!w7Var.d) {
                        this.P0 = -1;
                        w7Var.a(true);
                        if (this.y0 != null) {
                            j4 j4Var = w7Var.a;
                            long j10 = w7Var.b;
                            ArrayList arrayList = w7Var.c;
                            j4Var.l1 = j10;
                            j4Var.j1 = arrayList;
                            j4Var.m0(0);
                        } else {
                            w7Var.a.S0(0, w7Var.b);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(int i3, long j10, ArrayList arrayList) {
        boolean z10;
        u7 u7Var;
        int size;
        r9 r9Var;
        ArrayList arrayList2;
        int i10 = 0;
        if (this.x0 == j10) {
            ArrayList arrayList3 = this.y0;
            if (arrayList3 != null || arrayList != null) {
                if (arrayList3 != null && arrayList != null && arrayList3.size() == arrayList.size()) {
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (!C((ArrayList) arrayList3.get(i11), (ArrayList) arrayList.get(i11))) {
                            break;
                        }
                    }
                }
            }
            if (this.z0 == i3) {
                return;
            }
        }
        if (this.x0 == j10 && this.z0 == i3 && (arrayList2 = this.y0) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (C((ArrayList) arrayList2.get(i12), (ArrayList) arrayList.get(i12))) {
                }
            }
            z10 = true;
            this.x0 = j10;
            this.y0 = arrayList;
            this.z0 = i3;
            u7Var = this.A0;
            if (!z10 && u7Var != null) {
                u7Var.g();
                this.D0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(u7Var);
            while (true) {
                size = arrayList.size();
                r9Var = this.O0;
                if (i10 < size || ((ArrayList) arrayList.get(i10)).contains(Integer.valueOf(r9Var.Q0))) {
                    break;
                } else {
                    i10++;
                }
            }
            if (r9Var.S0) {
                i10 = (arrayList.size() - 1) - i10;
            }
            setCurrentItem(i10);
            this.D0 = true;
        }
        z10 = false;
        this.x0 = j10;
        this.y0 = arrayList;
        this.z0 = i3;
        u7Var = this.A0;
        if (!z10) {
        }
        setAdapter(null);
        setAdapter(u7Var);
        while (true) {
            size = arrayList.size();
            r9Var = this.O0;
            if (i10 < size) {
                break;
            } else {
                break;
            }
            i10++;
        }
        if (r9Var.S0) {
        }
        setCurrentItem(i10);
        this.D0 = true;
    }

    public final boolean E(boolean z10) {
        r9 r9Var = this.O0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.y0;
            if (arrayList == null) {
                arrayList = this.B0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (r9Var.a && Build.VERSION.SDK_INT < 33) {
                    z11 = true;
                }
                x(currentItem2, !z11);
                return true;
            }
        }
        if (z10 || getCurrentItem() <= 0) {
            return false;
        }
        int currentItem3 = getCurrentItem() - 1;
        if (r9Var.a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            j4 j4Var = (j4) ((FrameLayout) getChildAt(i3)).getChildAt(0);
            j4Var.setActive(((Integer) getChildAt(i3).getTag()).intValue() == getCurrentItem() && !j4Var.E3);
        }
    }

    public long getCurrentDialogId() {
        if (this.y0 != null) {
            return this.x0;
        }
        if (getCurrentItem() < this.B0.size()) {
            return ((Long) this.B0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public j4 getCurrentPeerView() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (((Integer) getChildAt(i3).getTag()).intValue() == getCurrentItem()) {
                return (j4) ((FrameLayout) getChildAt(i3)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.B0;
    }

    @Override // b5.l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.E0 && !this.M0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return false;
    }

    @Override // b5.l, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.D0) {
            this.D0 = false;
            j4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                c4 c4Var = this.C0;
                i9 i9Var = (i9) c4Var;
                i9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override // b5.l, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E0 && !this.M0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.M0) {
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        return false;
    }

    public void setDelegate(c4 c4Var) {
        this.C0 = c4Var;
    }

    public void setHorizontalProgressToDismiss(float f10) {
        if (Math.abs(f10) > 1.0f || this.R0 == f10) {
            return;
        }
        this.R0 = f10;
        setCameraDistance(getWidth() * 15);
        setPivotX(f10 < 0.0f ? getWidth() : 0.0f);
        setPivotY(getHeight() * 0.5f);
        setRotationY(f10 * 90.0f);
    }

    public void setKeyboardHeight(int i3) {
        if (this.F0 != i3) {
            this.F0 = i3;
            j4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            ((j4) ((FrameLayout) getChildAt(i3)).getChildAt(0)).setPaused(z10);
        }
    }
}

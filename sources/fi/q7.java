package fi;

import a8.sa;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class q7 extends c5.l {
    public final n7 A0;
    public ArrayList B0;
    public u3 C0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public int G0;
    public Runnable H0;
    public final y3 I0;
    public int J0;
    public int K0;
    public float L0;
    public boolean M0;
    public final sa N0;
    public final i9 O0;
    public int P0;
    public final ArrayList Q0;
    public float R0;
    public long x0;
    public ArrayList y0;
    public int z0;

    public q7(int i7, Context context, i9 i9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.B0 = new ArrayList();
        this.E0 = true;
        w wVar = (w) this;
        this.N0 = new sa(wVar, 25);
        this.P0 = -1;
        this.Q0 = new ArrayList();
        this.z0 = i7;
        this.I0 = new y3(context);
        this.O0 = i9Var;
        n7 n7Var = new n7(wVar, context, i9Var, e6Var);
        this.A0 = n7Var;
        setAdapter(n7Var);
        di.z6 z6Var = new di.z6(wVar, 9);
        boolean z10 = this.n0 == null;
        this.n0 = z6Var;
        setChildrenDrawingOrderEnabled(true);
        this.p0 = 1;
        this.o0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new o7(wVar, i9Var, 0));
        setOverScrollMode(2);
    }

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != arrayList2.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= getChildCount()) {
                z10 = true;
                break;
            }
            p7 p7Var = (p7) getChildAt(i7);
            if (p7Var.d && !p7Var.a.y1.d()) {
                break;
            } else {
                i7++;
            }
        }
        this.O0.l(z10);
    }

    public final void B() {
        if (this.P0 >= 0) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                if (((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.P0) {
                    p7 p7Var = (p7) getChildAt(i7);
                    if (!p7Var.d) {
                        this.P0 = -1;
                        p7Var.a(true);
                        if (this.y0 != null) {
                            b4 b4Var = p7Var.a;
                            long j3 = p7Var.b;
                            ArrayList arrayList = p7Var.c;
                            b4Var.l1 = j3;
                            b4Var.j1 = arrayList;
                            b4Var.m0(0);
                        } else {
                            p7Var.a.S0(0, p7Var.b);
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
    public final void D(int i7, long j3, ArrayList arrayList) {
        boolean z10;
        n7 n7Var;
        int size;
        i9 i9Var;
        ArrayList arrayList2;
        int i10 = 0;
        if (this.x0 == j3) {
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
            if (this.z0 == i7) {
                return;
            }
        }
        if (this.x0 == j3 && this.z0 == i7 && (arrayList2 = this.y0) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (C((ArrayList) arrayList2.get(i12), (ArrayList) arrayList.get(i12))) {
                }
            }
            z10 = true;
            this.x0 = j3;
            this.y0 = arrayList;
            this.z0 = i7;
            n7Var = this.A0;
            if (!z10 && n7Var != null) {
                n7Var.g();
                this.D0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(n7Var);
            while (true) {
                size = arrayList.size();
                i9Var = this.O0;
                if (i10 < size || ((ArrayList) arrayList.get(i10)).contains(Integer.valueOf(i9Var.P0))) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i9Var.R0) {
                i10 = (arrayList.size() - 1) - i10;
            }
            setCurrentItem(i10);
            this.D0 = true;
        }
        z10 = false;
        this.x0 = j3;
        this.y0 = arrayList;
        this.z0 = i7;
        n7Var = this.A0;
        if (!z10) {
        }
        setAdapter(null);
        setAdapter(n7Var);
        while (true) {
            size = arrayList.size();
            i9Var = this.O0;
            if (i10 < size) {
                break;
            } else {
                break;
            }
            i10++;
        }
        if (i9Var.R0) {
        }
        setCurrentItem(i10);
        this.D0 = true;
    }

    public final boolean E(boolean z10) {
        i9 i9Var = this.O0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.y0;
            if (arrayList == null) {
                arrayList = this.B0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (i9Var.a && Build.VERSION.SDK_INT < 33) {
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
        if (i9Var.a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            b4 b4Var = (b4) ((FrameLayout) getChildAt(i7)).getChildAt(0);
            b4Var.setActive(((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem() && !b4Var.E3);
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

    public b4 getCurrentPeerView() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem()) {
                return (b4) ((FrameLayout) getChildAt(i7)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.B0;
    }

    @Override // c5.l, android.view.ViewGroup
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

    @Override // c5.l, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.D0) {
            this.D0 = false;
            b4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                u3 u3Var = this.C0;
                z8 z8Var = (z8) u3Var;
                z8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override // c5.l, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E0 && !this.M0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.M0) {
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        return false;
    }

    public void setDelegate(u3 u3Var) {
        this.C0 = u3Var;
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

    public void setKeyboardHeight(int i7) {
        if (this.F0 != i7) {
            this.F0 = i7;
            b4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ((b4) ((FrameLayout) getChildAt(i7)).getChildAt(0)).setPaused(z10);
        }
    }
}

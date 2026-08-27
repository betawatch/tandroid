package jh;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class q7 extends m2.g {
    public int A0;
    public int B0;
    public Runnable C0;
    public b4 D0;
    public int E0;
    public int F0;
    public float G0;
    public boolean H0;
    public a8.b I0;
    public i9 J0;
    public int K0;
    public float L0;
    public long s0;
    public ArrayList t0;
    public int u0;
    public n7 v0;
    public ArrayList w0;
    public y3 x0;
    public boolean y0;
    public boolean z0;

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != arrayList2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= getChildCount()) {
                z10 = true;
                break;
            }
            p7 p7Var = (p7) getChildAt(i10);
            if (p7Var.d && !p7Var.a.K1.d()) {
                break;
            } else {
                i10++;
            }
        }
        this.J0.l(z10);
    }

    public final void B() {
        if (this.K0 >= 0) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.K0) {
                    p7 p7Var = (p7) getChildAt(i10);
                    if (!p7Var.d) {
                        this.K0 = -1;
                        p7Var.a(true);
                        if (this.t0 != null) {
                            e4 e4Var = p7Var.a;
                            long j10 = p7Var.b;
                            ArrayList arrayList = p7Var.c;
                            e4Var.x1 = j10;
                            e4Var.v1 = arrayList;
                            e4Var.o0(0);
                        } else {
                            p7Var.a.U0(0, p7Var.b);
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
    public final void D(int i10, long j10, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        i9 i9Var = this.J0;
        n7 n7Var = this.v0;
        int i11 = 0;
        if (this.s0 == j10) {
            ArrayList arrayList3 = this.t0;
            if (arrayList3 != null || arrayList != null) {
                if (arrayList3 != null && arrayList != null && arrayList3.size() == arrayList.size()) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        if (!C((ArrayList) arrayList3.get(i12), (ArrayList) arrayList.get(i12))) {
                            break;
                        }
                    }
                }
            }
            if (this.u0 == i10) {
                return;
            }
        }
        if (this.s0 == j10 && this.u0 == i10 && (arrayList2 = this.t0) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (C((ArrayList) arrayList2.get(i13), (ArrayList) arrayList.get(i13))) {
                }
            }
            z10 = true;
            this.s0 = j10;
            this.t0 = arrayList;
            this.u0 = i10;
            if (!z10 && n7Var != null) {
                n7Var.g();
                this.y0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(n7Var);
            while (i11 < arrayList.size() && !((ArrayList) arrayList.get(i11)).contains(Integer.valueOf(i9Var.L0))) {
                i11++;
            }
            if (i9Var.N0) {
                i11 = (arrayList.size() - 1) - i11;
            }
            setCurrentItem(i11);
            this.y0 = true;
        }
        z10 = false;
        this.s0 = j10;
        this.t0 = arrayList;
        this.u0 = i10;
        if (!z10) {
        }
        setAdapter(null);
        setAdapter(n7Var);
        while (i11 < arrayList.size()) {
            i11++;
        }
        if (i9Var.N0) {
        }
        setCurrentItem(i11);
        this.y0 = true;
    }

    public final boolean E(boolean z10) {
        i9 i9Var = this.J0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.t0;
            if (arrayList == null) {
                arrayList = this.w0;
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
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            e4 e4Var = (e4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            e4Var.setActive(((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !e4Var.Q3);
        }
    }

    public long getCurrentDialogId() {
        if (this.t0 != null) {
            return this.s0;
        }
        if (getCurrentItem() < this.w0.size()) {
            return ((Long) this.w0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public e4 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (e4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.w0;
    }

    @Override // m2.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.z0 && !this.H0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return false;
    }

    @Override // m2.g, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.y0) {
            this.y0 = false;
            e4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                y3 y3Var = this.x0;
                z8 z8Var = (z8) y3Var;
                z8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override // m2.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.z0 && !this.H0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.H0) {
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        return false;
    }

    public void setDelegate(y3 y3Var) {
        this.x0 = y3Var;
    }

    public void setHorizontalProgressToDismiss(float f10) {
        if (Math.abs(f10) > 1.0f || this.L0 == f10) {
            return;
        }
        this.L0 = f10;
        setCameraDistance(getWidth() * 15);
        setPivotX(f10 < 0.0f ? getWidth() : 0.0f);
        setPivotY(getHeight() * 0.5f);
        setRotationY(f10 * 90.0f);
    }

    public void setKeyboardHeight(int i10) {
        if (this.A0 != i10) {
            this.A0 = i10;
            e4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((e4) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z10);
        }
    }
}

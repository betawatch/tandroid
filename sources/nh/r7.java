package nh;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class r7 extends m2.h {
    public boolean A0;
    public int B0;
    public int C0;
    public Runnable D0;
    public a4 E0;
    public int F0;
    public int G0;
    public float H0;
    public boolean I0;
    public m2.b J0;
    public i9 K0;
    public int L0;
    public float M0;
    public long t0;
    public ArrayList u0;
    public int v0;
    public o7 w0;
    public ArrayList x0;
    public x3 y0;
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
        boolean z4 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= getChildCount()) {
                z4 = true;
                break;
            }
            q7 q7Var = (q7) getChildAt(i10);
            if (q7Var.d && !q7Var.a.L1.d()) {
                break;
            } else {
                i10++;
            }
        }
        this.K0.l(z4);
    }

    public final void B() {
        if (this.L0 >= 0) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.L0) {
                    q7 q7Var = (q7) getChildAt(i10);
                    if (!q7Var.d) {
                        this.L0 = -1;
                        q7Var.a(true);
                        if (this.u0 != null) {
                            d4 d4Var = q7Var.a;
                            long j10 = q7Var.b;
                            ArrayList arrayList = q7Var.c;
                            d4Var.y1 = j10;
                            d4Var.w1 = arrayList;
                            d4Var.o0(0);
                        } else {
                            q7Var.a.U0(0, q7Var.b);
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
        boolean z4;
        ArrayList arrayList2;
        i9 i9Var = this.K0;
        o7 o7Var = this.w0;
        int i11 = 0;
        if (this.t0 == j10) {
            ArrayList arrayList3 = this.u0;
            if (arrayList3 != null || arrayList != null) {
                if (arrayList3 != null && arrayList != null && arrayList3.size() == arrayList.size()) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        if (!C((ArrayList) arrayList3.get(i12), (ArrayList) arrayList.get(i12))) {
                            break;
                        }
                    }
                }
            }
            if (this.v0 == i10) {
                return;
            }
        }
        if (this.t0 == j10 && this.v0 == i10 && (arrayList2 = this.u0) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (C((ArrayList) arrayList2.get(i13), (ArrayList) arrayList.get(i13))) {
                }
            }
            z4 = true;
            this.t0 = j10;
            this.u0 = arrayList;
            this.v0 = i10;
            if (!z4 && o7Var != null) {
                o7Var.g();
                this.z0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(o7Var);
            while (i11 < arrayList.size() && !((ArrayList) arrayList.get(i11)).contains(Integer.valueOf(i9Var.M0))) {
                i11++;
            }
            if (i9Var.O0) {
                i11 = (arrayList.size() - 1) - i11;
            }
            setCurrentItem(i11);
            this.z0 = true;
        }
        z4 = false;
        this.t0 = j10;
        this.u0 = arrayList;
        this.v0 = i10;
        if (!z4) {
        }
        setAdapter(null);
        setAdapter(o7Var);
        while (i11 < arrayList.size()) {
            i11++;
        }
        if (i9Var.O0) {
        }
        setCurrentItem(i11);
        this.z0 = true;
    }

    public final boolean E(boolean z4) {
        i9 i9Var = this.K0;
        boolean z10 = false;
        if (z4) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.u0;
            if (arrayList == null) {
                arrayList = this.x0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (i9Var.a && Build.VERSION.SDK_INT < 33) {
                    z10 = true;
                }
                x(currentItem2, !z10);
                return true;
            }
        }
        if (z4 || getCurrentItem() <= 0) {
            return false;
        }
        int currentItem3 = getCurrentItem() - 1;
        if (i9Var.a && Build.VERSION.SDK_INT < 33) {
            z10 = true;
        }
        x(currentItem3, !z10);
        return true;
    }

    public final void F() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            d4 d4Var = (d4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            d4Var.setActive(((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !d4Var.R3);
        }
    }

    public long getCurrentDialogId() {
        if (this.u0 != null) {
            return this.t0;
        }
        if (getCurrentItem() < this.x0.size()) {
            return ((Long) this.x0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public d4 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (d4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.x0;
    }

    @Override // m2.h, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0 && !this.I0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    @Override // m2.h, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.z0) {
            this.z0 = false;
            d4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                x3 x3Var = this.y0;
                z8 z8Var = (z8) x3Var;
                z8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override // m2.h, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A0 && !this.I0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.I0) {
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        return false;
    }

    public void setDelegate(x3 x3Var) {
        this.y0 = x3Var;
    }

    public void setHorizontalProgressToDismiss(float f10) {
        if (Math.abs(f10) > 1.0f || this.M0 == f10) {
            return;
        }
        this.M0 = f10;
        setCameraDistance(getWidth() * 15);
        setPivotX(f10 < 0.0f ? getWidth() : 0.0f);
        setPivotY(getHeight() * 0.5f);
        setRotationY(f10 * 90.0f);
    }

    public void setKeyboardHeight(int i10) {
        if (this.B0 != i10) {
            this.B0 = i10;
            d4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z4) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((d4) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z4);
        }
    }
}

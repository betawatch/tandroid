package ih;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class u7 extends m2.g {
    public int A0;
    public int B0;
    public Runnable C0;
    public f4 D0;
    public int E0;
    public int F0;
    public float G0;
    public boolean H0;
    public androidx.activity.i I0;
    public m9 J0;
    public int K0;
    public float L0;
    public long s0;
    public ArrayList t0;
    public int u0;
    public r7 v0;
    public ArrayList w0;
    public c4 x0;
    public boolean y0;
    public boolean z0;

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (arrayList.get(i9) != arrayList2.get(i9)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        boolean z10 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= getChildCount()) {
                z10 = true;
                break;
            }
            t7 t7Var = (t7) getChildAt(i9);
            if (t7Var.d && !t7Var.a.K1.d()) {
                break;
            } else {
                i9++;
            }
        }
        this.J0.l(z10);
    }

    public final void B() {
        if (this.K0 >= 0) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                if (((Integer) getChildAt(i9).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.K0) {
                    t7 t7Var = (t7) getChildAt(i9);
                    if (!t7Var.d) {
                        this.K0 = -1;
                        t7Var.a(true);
                        if (this.t0 != null) {
                            i4 i4Var = t7Var.a;
                            long j10 = t7Var.b;
                            ArrayList arrayList = t7Var.c;
                            i4Var.x1 = j10;
                            i4Var.v1 = arrayList;
                            i4Var.o0(0);
                        } else {
                            t7Var.a.U0(0, t7Var.b);
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
    public final void D(int i9, long j10, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        m9 m9Var = this.J0;
        r7 r7Var = this.v0;
        int i10 = 0;
        if (this.s0 == j10) {
            ArrayList arrayList3 = this.t0;
            if (arrayList3 != null || arrayList != null) {
                if (arrayList3 != null && arrayList != null && arrayList3.size() == arrayList.size()) {
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (!C((ArrayList) arrayList3.get(i11), (ArrayList) arrayList.get(i11))) {
                            break;
                        }
                    }
                }
            }
            if (this.u0 == i9) {
                return;
            }
        }
        if (this.s0 == j10 && this.u0 == i9 && (arrayList2 = this.t0) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (C((ArrayList) arrayList2.get(i12), (ArrayList) arrayList.get(i12))) {
                }
            }
            z10 = true;
            this.s0 = j10;
            this.t0 = arrayList;
            this.u0 = i9;
            if (!z10 && r7Var != null) {
                r7Var.g();
                this.y0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(r7Var);
            while (i10 < arrayList.size() && !((ArrayList) arrayList.get(i10)).contains(Integer.valueOf(m9Var.L0))) {
                i10++;
            }
            if (m9Var.N0) {
                i10 = (arrayList.size() - 1) - i10;
            }
            setCurrentItem(i10);
            this.y0 = true;
        }
        z10 = false;
        this.s0 = j10;
        this.t0 = arrayList;
        this.u0 = i9;
        if (!z10) {
        }
        setAdapter(null);
        setAdapter(r7Var);
        while (i10 < arrayList.size()) {
            i10++;
        }
        if (m9Var.N0) {
        }
        setCurrentItem(i10);
        this.y0 = true;
    }

    public final boolean E(boolean z10) {
        m9 m9Var = this.J0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.t0;
            if (arrayList == null) {
                arrayList = this.w0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (m9Var.a && Build.VERSION.SDK_INT < 33) {
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
        if (m9Var.a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            i4 i4Var = (i4) ((FrameLayout) getChildAt(i9)).getChildAt(0);
            i4Var.setActive(((Integer) getChildAt(i9).getTag()).intValue() == getCurrentItem() && !i4Var.Q3);
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

    public i4 getCurrentPeerView() {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (((Integer) getChildAt(i9).getTag()).intValue() == getCurrentItem()) {
                return (i4) ((FrameLayout) getChildAt(i9)).getChildAt(0);
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return false;
    }

    @Override // m2.g, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.y0) {
            this.y0 = false;
            i4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                c4 c4Var = this.x0;
                d9 d9Var = (d9) c4Var;
                d9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
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

    public void setDelegate(c4 c4Var) {
        this.x0 = c4Var;
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

    public void setKeyboardHeight(int i9) {
        if (this.A0 != i9) {
            this.A0 = i9;
            i4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            ((i4) ((FrameLayout) getChildAt(i9)).getChildAt(0)).setPaused(z10);
        }
    }
}

package di;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class f8 extends a5.m {
    public ArrayList A0;
    public j4 B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public Runnable G0;
    public n4 H0;
    public int I0;
    public int J0;
    public float K0;
    public boolean L0;
    public a5.d M0;
    public y9 N0;
    public int O0;
    public float P0;
    public long w0;
    public ArrayList x0;
    public int y0;
    public c8 z0;

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
            e8 e8Var = (e8) getChildAt(i10);
            if (e8Var.d && !e8Var.a.D1.d()) {
                break;
            } else {
                i10++;
            }
        }
        this.N0.l(z10);
    }

    public final void B() {
        if (this.O0 >= 0) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.O0) {
                    e8 e8Var = (e8) getChildAt(i10);
                    if (!e8Var.d) {
                        this.O0 = -1;
                        e8Var.a(true);
                        if (this.x0 != null) {
                            q4 q4Var = e8Var.a;
                            long j10 = e8Var.b;
                            ArrayList arrayList = e8Var.c;
                            q4Var.q1 = j10;
                            q4Var.o1 = arrayList;
                            q4Var.m0(0);
                        } else {
                            e8Var.a.S0(0, e8Var.b);
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
        y9 y9Var = this.N0;
        c8 c8Var = this.z0;
        int i11 = 0;
        if (this.w0 == j10) {
            ArrayList arrayList3 = this.x0;
            if (arrayList3 != null || arrayList != null) {
                if (arrayList3 != null && arrayList != null && arrayList3.size() == arrayList.size()) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        if (!C((ArrayList) arrayList3.get(i12), (ArrayList) arrayList.get(i12))) {
                            break;
                        }
                    }
                }
            }
            if (this.y0 == i10) {
                return;
            }
        }
        if (this.w0 == j10 && this.y0 == i10 && (arrayList2 = this.x0) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (C((ArrayList) arrayList2.get(i13), (ArrayList) arrayList.get(i13))) {
                }
            }
            z10 = true;
            this.w0 = j10;
            this.x0 = arrayList;
            this.y0 = i10;
            if (!z10 && c8Var != null) {
                c8Var.g();
                this.C0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(c8Var);
            while (i11 < arrayList.size() && !((ArrayList) arrayList.get(i11)).contains(Integer.valueOf(y9Var.P0))) {
                i11++;
            }
            if (y9Var.R0) {
                i11 = (arrayList.size() - 1) - i11;
            }
            setCurrentItem(i11);
            this.C0 = true;
        }
        z10 = false;
        this.w0 = j10;
        this.x0 = arrayList;
        this.y0 = i10;
        if (!z10) {
        }
        setAdapter(null);
        setAdapter(c8Var);
        while (i11 < arrayList.size()) {
            i11++;
        }
        if (y9Var.R0) {
        }
        setCurrentItem(i11);
        this.C0 = true;
    }

    public final boolean E(boolean z10) {
        y9 y9Var = this.N0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.x0;
            if (arrayList == null) {
                arrayList = this.A0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (y9Var.a && Build.VERSION.SDK_INT < 33) {
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
        if (y9Var.a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            q4 q4Var = (q4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            q4Var.setActive(((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !q4Var.J3);
        }
    }

    public long getCurrentDialogId() {
        if (this.x0 != null) {
            return this.w0;
        }
        if (getCurrentItem() < this.A0.size()) {
            return ((Long) this.A0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public q4 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (q4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.A0;
    }

    @Override // a5.m, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    @Override // a5.m, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.C0) {
            this.C0 = false;
            q4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                j4 j4Var = this.B0;
                p9 p9Var = (p9) j4Var;
                p9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override // a5.m, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.L0) {
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        return false;
    }

    public void setDelegate(j4 j4Var) {
        this.B0 = j4Var;
    }

    public void setHorizontalProgressToDismiss(float f7) {
        if (Math.abs(f7) > 1.0f || this.P0 == f7) {
            return;
        }
        this.P0 = f7;
        setCameraDistance(getWidth() * 15);
        setPivotX(f7 < 0.0f ? getWidth() : 0.0f);
        setPivotY(getHeight() * 0.5f);
        setRotationY(f7 * 90.0f);
    }

    public void setKeyboardHeight(int i10) {
        if (this.E0 != i10) {
            this.E0 = i10;
            q4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((q4) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z10);
        }
    }
}

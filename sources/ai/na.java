package ai;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public abstract class na extends z4.g {
    public ArrayList A0;
    public y5 B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public Runnable G0;
    public c6 H0;
    public int I0;
    public int J0;
    public float K0;
    public boolean L0;
    public q4 M0;
    public jc N0;
    public int O0;
    public float P0;
    public long w0;
    public ArrayList x0;
    public int y0;
    public ka z0;

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
            ma maVar = (ma) getChildAt(i10);
            if (maVar.d && !maVar.a.O1.d()) {
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
                    ma maVar = (ma) getChildAt(i10);
                    if (!maVar.d) {
                        this.O0 = -1;
                        maVar.a(true);
                        if (this.x0 != null) {
                            f6 f6Var = maVar.a;
                            long j3 = maVar.b;
                            ArrayList arrayList = maVar.c;
                            f6Var.B1 = j3;
                            f6Var.z1 = arrayList;
                            f6Var.o0(0);
                        } else {
                            maVar.a.U0(0, maVar.b);
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
    public final void D(int i10, long j3, ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2;
        jc jcVar = this.N0;
        ka kaVar = this.z0;
        int i11 = 0;
        if (this.w0 == j3) {
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
        if (this.w0 == j3 && this.y0 == i10 && (arrayList2 = this.x0) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (C((ArrayList) arrayList2.get(i13), (ArrayList) arrayList.get(i13))) {
                }
            }
            z10 = true;
            this.w0 = j3;
            this.x0 = arrayList;
            this.y0 = i10;
            if (!z10 && kaVar != null) {
                kaVar.g();
                this.C0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(kaVar);
            while (i11 < arrayList.size() && !((ArrayList) arrayList.get(i11)).contains(Integer.valueOf(jcVar.P0))) {
                i11++;
            }
            if (jcVar.R0) {
                i11 = (arrayList.size() - 1) - i11;
            }
            setCurrentItem(i11);
            this.C0 = true;
        }
        z10 = false;
        this.w0 = j3;
        this.x0 = arrayList;
        this.y0 = i10;
        if (!z10) {
        }
        setAdapter(null);
        setAdapter(kaVar);
        while (i11 < arrayList.size()) {
            i11++;
        }
        if (jcVar.R0) {
        }
        setCurrentItem(i11);
        this.C0 = true;
    }

    public final boolean E(boolean z10) {
        jc jcVar = this.N0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.x0;
            if (arrayList == null) {
                arrayList = this.A0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (jcVar.a && Build.VERSION.SDK_INT < 33) {
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
        if (jcVar.a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f6 f6Var = (f6) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            f6Var.setActive(((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !f6Var.U3);
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

    public f6 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (f6) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.A0;
    }

    @Override // z4.g, android.view.ViewGroup
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

    @Override // z4.g, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.C0) {
            this.C0 = false;
            f6 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                y5 y5Var = this.B0;
                ac acVar = (ac) y5Var;
                acVar.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override // z4.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.L0) {
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        return false;
    }

    public void setDelegate(y5 y5Var) {
        this.B0 = y5Var;
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
            f6 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((f6) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z10);
        }
    }
}

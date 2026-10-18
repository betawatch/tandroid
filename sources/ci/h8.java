package ci;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public abstract class h8 extends z4.g {
    public ArrayList A0;
    public i4 B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public Runnable G0;
    public m4 H0;
    public int I0;
    public int J0;
    public float K0;
    public boolean L0;
    public androidx.activity.i M0;
    public z9 N0;
    public int O0;
    public float P0;
    public long w0;
    public ArrayList x0;
    public int y0;
    public e8 z0;

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
            g8 g8Var = (g8) getChildAt(i10);
            if (g8Var.d && !g8Var.a.O1.d()) {
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
                    g8 g8Var = (g8) getChildAt(i10);
                    if (!g8Var.d) {
                        this.O0 = -1;
                        g8Var.a(true);
                        if (this.x0 != null) {
                            p4 p4Var = g8Var.a;
                            long j10 = g8Var.b;
                            ArrayList arrayList = g8Var.c;
                            p4Var.B1 = j10;
                            p4Var.z1 = arrayList;
                            p4Var.o0(0);
                        } else {
                            g8Var.a.U0(0, g8Var.b);
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
        z9 z9Var = this.N0;
        e8 e8Var = this.z0;
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
            if (!z10 && e8Var != null) {
                e8Var.g();
                this.C0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(e8Var);
            while (i11 < arrayList.size() && !((ArrayList) arrayList.get(i11)).contains(Integer.valueOf(z9Var.P0))) {
                i11++;
            }
            if (z9Var.R0) {
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
        setAdapter(e8Var);
        while (i11 < arrayList.size()) {
            i11++;
        }
        if (z9Var.R0) {
        }
        setCurrentItem(i11);
        this.C0 = true;
    }

    public final boolean E(boolean z10) {
        z9 z9Var = this.N0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.x0;
            if (arrayList == null) {
                arrayList = this.A0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (z9Var.a && Build.VERSION.SDK_INT < 33) {
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
        if (z9Var.a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            p4 p4Var = (p4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            p4Var.setActive(((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !p4Var.U3);
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

    public p4 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (p4) ((FrameLayout) getChildAt(i10)).getChildAt(0);
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
            p4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                i4 i4Var = this.B0;
                q9 q9Var = (q9) i4Var;
                q9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
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

    public void setDelegate(i4 i4Var) {
        this.B0 = i4Var;
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
            p4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((p4) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z10);
        }
    }
}

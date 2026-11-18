package fi;

import a8.sa;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public abstract class n7 extends c5.l {
    public final k7 A0;
    public ArrayList B0;
    public s3 C0;
    public boolean D0;
    public boolean E0;
    public int F0;
    public int G0;
    public Runnable H0;
    public final w3 I0;
    public int J0;
    public int K0;
    public float L0;
    public boolean M0;
    public final sa N0;
    public final f9 O0;
    public int P0;
    public final ArrayList Q0;
    public float R0;
    public long x0;
    public ArrayList y0;
    public int z0;

    public n7(int i7, Context context, f9 f9Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.B0 = new ArrayList();
        this.E0 = true;
        w wVar = (w) this;
        this.N0 = new sa(wVar, 25);
        this.P0 = -1;
        this.Q0 = new ArrayList();
        this.z0 = i7;
        this.I0 = new w3(context);
        this.O0 = f9Var;
        k7 k7Var = new k7(wVar, context, f9Var, i6Var);
        this.A0 = k7Var;
        setAdapter(k7Var);
        di.c7 c7Var = new di.c7(wVar, 9);
        boolean z10 = this.n0 == null;
        this.n0 = c7Var;
        setChildrenDrawingOrderEnabled(true);
        this.p0 = 1;
        this.o0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new l7(wVar, f9Var, 0));
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
            m7 m7Var = (m7) getChildAt(i7);
            if (m7Var.d && !m7Var.a.y1.d()) {
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
                    m7 m7Var = (m7) getChildAt(i7);
                    if (!m7Var.d) {
                        this.P0 = -1;
                        m7Var.a(true);
                        if (this.y0 != null) {
                            z3 z3Var = m7Var.a;
                            long j3 = m7Var.b;
                            ArrayList arrayList = m7Var.c;
                            z3Var.l1 = j3;
                            z3Var.j1 = arrayList;
                            z3Var.m0(0);
                        } else {
                            m7Var.a.S0(0, m7Var.b);
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
        k7 k7Var;
        int size;
        f9 f9Var;
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
            k7Var = this.A0;
            if (!z10 && k7Var != null) {
                k7Var.g();
                this.D0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(k7Var);
            while (true) {
                size = arrayList.size();
                f9Var = this.O0;
                if (i10 < size || ((ArrayList) arrayList.get(i10)).contains(Integer.valueOf(f9Var.P0))) {
                    break;
                } else {
                    i10++;
                }
            }
            if (f9Var.R0) {
                i10 = (arrayList.size() - 1) - i10;
            }
            setCurrentItem(i10);
            this.D0 = true;
        }
        z10 = false;
        this.x0 = j3;
        this.y0 = arrayList;
        this.z0 = i7;
        k7Var = this.A0;
        if (!z10) {
        }
        setAdapter(null);
        setAdapter(k7Var);
        while (true) {
            size = arrayList.size();
            f9Var = this.O0;
            if (i10 < size) {
                break;
            } else {
                break;
            }
            i10++;
        }
        if (f9Var.R0) {
        }
        setCurrentItem(i10);
        this.D0 = true;
    }

    public final boolean E(boolean z10) {
        f9 f9Var = this.O0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.y0;
            if (arrayList == null) {
                arrayList = this.B0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (f9Var.a && Build.VERSION.SDK_INT < 33) {
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
        if (f9Var.a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            z3 z3Var = (z3) ((FrameLayout) getChildAt(i7)).getChildAt(0);
            z3Var.setActive(((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem() && !z3Var.E3);
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

    public z3 getCurrentPeerView() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem()) {
                return (z3) ((FrameLayout) getChildAt(i7)).getChildAt(0);
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
            z3 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                s3 s3Var = this.C0;
                w8 w8Var = (w8) s3Var;
                w8Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
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

    public void setDelegate(s3 s3Var) {
        this.C0 = s3Var;
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
            z3 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ((z3) ((FrameLayout) getChildAt(i7)).getChildAt(0)).setPaused(z10);
        }
    }
}

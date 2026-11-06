package di;

import a8.ra;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class x7 extends c5.k {
    public ArrayList A0;
    public b4 B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public Runnable G0;
    public final f4 H0;
    public int I0;
    public int J0;
    public float K0;
    public boolean L0;
    public final ra M0;
    public final p9 N0;
    public int O0;
    public final ArrayList P0;
    public float Q0;
    public long w0;
    public ArrayList x0;
    public int y0;
    public final u7 z0;

    public x7(int i7, Context context, p9 p9Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.A0 = new ArrayList();
        this.D0 = true;
        w wVar = (w) this;
        this.M0 = new ra(wVar, 21);
        this.O0 = -1;
        this.P0 = new ArrayList();
        this.y0 = i7;
        this.H0 = new f4(context);
        this.N0 = p9Var;
        u7 u7Var = new u7(wVar, context, p9Var, f6Var);
        this.z0 = u7Var;
        setAdapter(u7Var);
        q4 q4Var = new q4(wVar, 2);
        boolean z9 = this.m0 == null;
        this.m0 = q4Var;
        setChildrenDrawingOrderEnabled(true);
        this.o0 = 1;
        this.n0 = 2;
        if (z9) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new v7(wVar, p9Var, 0));
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
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= getChildCount()) {
                z9 = true;
                break;
            }
            w7 w7Var = (w7) getChildAt(i7);
            if (w7Var.d && !w7Var.a.x1.d()) {
                break;
            } else {
                i7++;
            }
        }
        this.N0.l(z9);
    }

    public final void B() {
        if (this.O0 >= 0) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                if (((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.O0) {
                    w7 w7Var = (w7) getChildAt(i7);
                    if (!w7Var.d) {
                        this.O0 = -1;
                        w7Var.a(true);
                        if (this.x0 != null) {
                            i4 i4Var = w7Var.a;
                            long j3 = w7Var.b;
                            ArrayList arrayList = w7Var.c;
                            i4Var.k1 = j3;
                            i4Var.i1 = arrayList;
                            i4Var.m0(0);
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
    public final void D(int i7, long j3, ArrayList arrayList) {
        boolean z9;
        u7 u7Var;
        int size;
        p9 p9Var;
        ArrayList arrayList2;
        int i10 = 0;
        if (this.w0 == j3) {
            ArrayList arrayList3 = this.x0;
            if (arrayList3 != null || arrayList != null) {
                if (arrayList3 != null && arrayList != null && arrayList3.size() == arrayList.size()) {
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        if (!C((ArrayList) arrayList3.get(i11), (ArrayList) arrayList.get(i11))) {
                            break;
                        }
                    }
                }
            }
            if (this.y0 == i7) {
                return;
            }
        }
        if (this.w0 == j3 && this.y0 == i7 && (arrayList2 = this.x0) != null && arrayList != null && arrayList.size() > arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (C((ArrayList) arrayList2.get(i12), (ArrayList) arrayList.get(i12))) {
                }
            }
            z9 = true;
            this.w0 = j3;
            this.x0 = arrayList;
            this.y0 = i7;
            u7Var = this.z0;
            if (!z9 && u7Var != null) {
                u7Var.g();
                this.C0 = true;
                return;
            }
            setAdapter(null);
            setAdapter(u7Var);
            while (true) {
                size = arrayList.size();
                p9Var = this.N0;
                if (i10 < size || ((ArrayList) arrayList.get(i10)).contains(Integer.valueOf(p9Var.O0))) {
                    break;
                } else {
                    i10++;
                }
            }
            if (p9Var.Q0) {
                i10 = (arrayList.size() - 1) - i10;
            }
            setCurrentItem(i10);
            this.C0 = true;
        }
        z9 = false;
        this.w0 = j3;
        this.x0 = arrayList;
        this.y0 = i7;
        u7Var = this.z0;
        if (!z9) {
        }
        setAdapter(null);
        setAdapter(u7Var);
        while (true) {
            size = arrayList.size();
            p9Var = this.N0;
            if (i10 < size) {
                break;
            } else {
                break;
            }
            i10++;
        }
        if (p9Var.Q0) {
        }
        setCurrentItem(i10);
        this.C0 = true;
    }

    public final boolean E(boolean z9) {
        p9 p9Var = this.N0;
        boolean z10 = false;
        if (z9) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.x0;
            if (arrayList == null) {
                arrayList = this.A0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (p9Var.a && Build.VERSION.SDK_INT < 33) {
                    z10 = true;
                }
                x(currentItem2, !z10);
                return true;
            }
        }
        if (z9 || getCurrentItem() <= 0) {
            return false;
        }
        int currentItem3 = getCurrentItem() - 1;
        if (p9Var.a && Build.VERSION.SDK_INT < 33) {
            z10 = true;
        }
        x(currentItem3, !z10);
        return true;
    }

    public final void F() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            i4 i4Var = (i4) ((FrameLayout) getChildAt(i7)).getChildAt(0);
            i4Var.setActive(((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem() && !i4Var.D3);
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

    public i4 getCurrentPeerView() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (((Integer) getChildAt(i7).getTag()).intValue() == getCurrentItem()) {
                return (i4) ((FrameLayout) getChildAt(i7)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.A0;
    }

    @Override // c5.k, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return false;
    }

    @Override // c5.k, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.C0) {
            this.C0 = false;
            i4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                b4 b4Var = this.B0;
                g9 g9Var = (g9) b4Var;
                g9Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override // c5.k, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.L0) {
            return motionEvent.getAction() == 0 || motionEvent.getAction() == 2;
        }
        return false;
    }

    public void setDelegate(b4 b4Var) {
        this.B0 = b4Var;
    }

    public void setHorizontalProgressToDismiss(float f10) {
        if (Math.abs(f10) > 1.0f || this.Q0 == f10) {
            return;
        }
        this.Q0 = f10;
        setCameraDistance(getWidth() * 15);
        setPivotX(f10 < 0.0f ? getWidth() : 0.0f);
        setPivotY(getHeight() * 0.5f);
        setRotationY(f10 * 90.0f);
    }

    public void setKeyboardHeight(int i7) {
        if (this.E0 != i7) {
            this.E0 = i7;
            i4 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z9) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ((i4) ((FrameLayout) getChildAt(i7)).getChildAt(0)).setPaused(z9);
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fd0 extends org.telegram.ui.Components.sw0 implements r0.m {
    public final /* synthetic */ int w0 = 1;
    public final b2.q0 x0;
    public boolean y0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(org.telegram.ui.Wallet.a5 a5Var, Context context) {
        super(context, null);
        this.z0 = a5Var;
        this.x0 = new b2.q0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        xc0 xc0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.qm0 currentListView;
        org.telegram.ui.Components.k71 n02;
        org.telegram.ui.Wallet.v4 v4Var;
        switch (this.w0) {
            case 0:
                hd0 hd0Var = (hd0) this.z0;
                if (viewGroup == hd0Var.U && (xc0Var = hd0Var.K0) != null && xc0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.n2) hd0Var).actionBar;
                    boolean z10 = kVar.n0;
                    int top = hd0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (z10) {
                            org.telegram.ui.Components.qm0 currentListView2 = hd0Var.K0.getCurrentListView();
                            iArr[1] = i11;
                            if (top > 0) {
                                iArr[1] = 0;
                            }
                            if (currentListView2 != null && (i13 = iArr[1]) > 0) {
                                currentListView2.scrollBy(0, i13);
                                break;
                            }
                        }
                    } else {
                        if (top <= 0 && (currentListView = hd0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.d0) currentListView.getLayoutManager()).L0();
                            if (L0 != -1) {
                                s4.d1 K = currentListView.K(L0);
                                int top2 = K != null ? K.a.getTop() : -1;
                                int paddingTop = currentListView.getPaddingTop();
                                if (top2 != paddingTop || L0 != 0) {
                                    iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                                    currentListView.scrollBy(0, i11);
                                    z11 = true;
                                }
                            }
                        }
                        if (z10) {
                            if (!z11 && top < 0) {
                                iArr[1] = i11 - Math.max(top, i11);
                                break;
                            } else {
                                iArr[1] = i11;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.z0;
                if (!this.y0 && (n02 = a5Var.n0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == a5Var.a || viewGroup == n02) && (v4Var = a5Var.o0) != null && v4Var.f)) {
                        v4Var.d = true;
                    }
                    if (viewGroup != a5Var.a || i11 >= 0 || !Z()) {
                        if (viewGroup == n02 && i11 > 0) {
                            iArr[1] = c0(a5Var.a, i11) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = c0(n02, i11) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.sw0
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.w0) {
            case 0:
                hd0 hd0Var = (hd0) this.z0;
                if (hd0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, hd0Var.U.getY());
                    hd0Var.K0.Q(canvas, arrayList);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    public boolean Z() {
        org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.z0;
        LinearLayout linearLayout = a5Var.l0;
        return linearLayout != null && (linearLayout.getParent() instanceof View) && ((View) a5Var.l0.getParent()).getTop() <= a5Var.a.getPaddingTop();
    }

    @Override // r0.l
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.w0) {
            case 0:
                break;
            default:
                j(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                break;
        }
    }

    /* JADX WARN: Finally extract failed */
    public int c0(org.telegram.ui.Components.k71 k71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(iArr, 10);
        this.y0 = true;
        k71Var.j(mh0Var);
        try {
            k71Var.scrollBy(0, i10);
            ArrayList arrayList = k71Var.w0;
            if (arrayList != null) {
                arrayList.remove(mh0Var);
            }
            this.y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = k71Var.w0;
            if (arrayList2 != null) {
                arrayList2.remove(mh0Var);
            }
            this.y0 = false;
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.v4 v4Var;
        switch (this.w0) {
            case 1:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.z0;
                org.telegram.ui.Wallet.v4 v4Var2 = a5Var.o0;
                if (v4Var2 != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        v4Var2.c();
                        v4Var2.e = true;
                        v4Var2.g = motionEvent.getX();
                        v4Var2.h = motionEvent.getY();
                    } else if (actionMasked == 3) {
                        v4Var2.c();
                    } else if (actionMasked == 2 || actionMasked == 1) {
                        float abs = Math.abs(motionEvent.getX() - v4Var2.g);
                        float abs2 = Math.abs(motionEvent.getY() - v4Var2.h);
                        boolean z10 = abs2 > ((float) ViewConfiguration.get(v4Var2.c.getContext()).getScaledTouchSlop()) && abs2 > abs * 1.5f;
                        v4Var2.f = z10;
                        if (!z10) {
                            v4Var2.d = false;
                        }
                        if (actionMasked == 1) {
                            v4Var2.e = false;
                        }
                    }
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (v4Var = a5Var.o0) != null) {
                    org.telegram.ui.Wallet.m mVar = v4Var.i;
                    org.telegram.ui.Components.e71 e71Var = v4Var.c;
                    if (e71Var != null) {
                        e71Var.removeCallbacks(mVar);
                        v4Var.c.post(mVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                hd0 hd0Var = (hd0) this.z0;
                kVar = ((org.telegram.ui.ActionBar.n2) hd0Var).actionBar;
                if (view == kVar) {
                    d5Var = ((org.telegram.ui.ActionBar.n2) hd0Var).parentLayout;
                    if (d5Var != null) {
                        d5Var2 = ((org.telegram.ui.ActionBar.n2) hd0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.n2) hd0Var).actionBar;
                        ((ActionBarLayout) d5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        switch (this.w0) {
            case 1:
                return this.x0.b();
            default:
                return super.getNestedScrollAxes();
        }
    }

    @Override // r0.m
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        xc0 xc0Var;
        org.telegram.ui.Components.k71 n02;
        switch (this.w0) {
            case 0:
                hd0 hd0Var = (hd0) this.z0;
                try {
                    if (viewGroup == hd0Var.U && (xc0Var = hd0Var.K0) != null && xc0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.qm0 currentListView = hd0Var.K0.getCurrentListView();
                        int top = hd0Var.K0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new uz(this, 18));
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.z0;
                if (!this.y0 && i13 != 0 && (n02 = a5Var.n0()) != null) {
                    if (viewGroup != a5Var.a || !Z()) {
                        if (viewGroup == n02 && i13 < 0) {
                            iArr[1] = c0(a5Var.a, i13) + iArr[1];
                            break;
                        }
                    } else {
                        iArr[1] = c0(n02, i13) + iArr[1];
                        break;
                    }
                }
                break;
        }
    }

    @Override // r0.l
    public final void o(int i10, View view) {
        switch (this.w0) {
            case 0:
                this.x0.a = 0;
                break;
            default:
                b2.q0 q0Var = this.x0;
                if (i10 == 1) {
                    q0Var.b = 0;
                } else {
                    q0Var.a = 0;
                }
                org.telegram.ui.Wallet.v4 v4Var = ((org.telegram.ui.Wallet.a5) this.z0).o0;
                if (v4Var != null) {
                    org.telegram.ui.Wallet.m mVar = v4Var.i;
                    org.telegram.ui.Components.e71 e71Var = v4Var.c;
                    if (e71Var != null) {
                        e71Var.removeCallbacks(mVar);
                        v4Var.c.post(mVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.sw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.w0) {
            case 0:
                hd0 hd0Var = (hd0) this.z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (!z10) {
                    hd0Var.z0(true);
                    break;
                } else {
                    hd0Var.j0(this.y0);
                    this.y0 = false;
                    break;
                }
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.w0) {
            case 1:
                int size = (int) (View.MeasureSpec.getSize(i11) * 0.75f);
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.z0;
                if (a5Var.n != size) {
                    a5Var.n = size;
                    org.telegram.ui.Wallet.m4 m4Var = a5Var.d;
                    if (m4Var != null) {
                        m4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.j4 j4Var = a5Var.e;
                    if (j4Var != null) {
                        j4Var.requestLayout();
                    }
                }
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f10) {
        org.telegram.ui.Wallet.v4 v4Var;
        switch (this.w0) {
            case 1:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.z0;
                if (view != a5Var.n0() || (v4Var = a5Var.o0) == null) {
                    return false;
                }
                return v4Var.a((int) f7, (int) f10);
            default:
                return super.onNestedPreFling(view, f7, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        switch (this.w0) {
            case 0:
                break;
            default:
                super.onStopNestedScroll(view);
                break;
        }
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.w0) {
            case 0:
                if (((hd0) this.z0).K0 == null || i10 != 2) {
                }
                break;
            default:
                if ((i10 & 2) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.w0) {
            case 0:
                this.x0.a = i10;
                break;
            default:
                b2.q0 q0Var = this.x0;
                if (i11 != 1) {
                    q0Var.a = i10;
                    break;
                } else {
                    q0Var.b = i10;
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd0(hd0 hd0Var, Context context) {
        super(context, null);
        this.z0 = hd0Var;
        this.y0 = true;
        this.x0 = new b2.q0();
    }

    private final void b0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}

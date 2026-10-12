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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ld0 extends org.telegram.ui.Components.ow0 implements r0.n {
    public final /* synthetic */ int w0 = 1;
    public final b2.v0 x0;
    public boolean y0;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld0(org.telegram.ui.Wallet.z4 z4Var, Context context) {
        super(context, null);
        this.z0 = z4Var;
        this.x0 = new b2.v0();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        dd0 dd0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.mm0 currentListView;
        org.telegram.ui.Components.h71 n02;
        org.telegram.ui.Wallet.v4 v4Var;
        switch (this.w0) {
            case 0:
                nd0 nd0Var = (nd0) this.z0;
                if (viewGroup == nd0Var.U && (dd0Var = nd0Var.K0) != null && dd0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.m2) nd0Var).actionBar;
                    boolean z10 = kVar.n0;
                    int top = nd0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (z10) {
                            org.telegram.ui.Components.mm0 currentListView2 = nd0Var.K0.getCurrentListView();
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
                        if (top <= 0 && (currentListView = nd0Var.K0.getCurrentListView()) != null) {
                            int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                            if (L0 != -1) {
                                s4.b1 K = currentListView.K(L0);
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
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.z0;
                if (!this.y0 && (n02 = z4Var.n0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == z4Var.a || viewGroup == n02) && (v4Var = z4Var.o0) != null && v4Var.f)) {
                        v4Var.d = true;
                    }
                    if (viewGroup != z4Var.a || i11 >= 0 || !Z()) {
                        if (viewGroup == n02 && i11 > 0) {
                            iArr[1] = c0(z4Var.a, i11) + iArr[1];
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

    @Override // org.telegram.ui.Components.ow0
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.w0) {
            case 0:
                nd0 nd0Var = (nd0) this.z0;
                if (nd0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, nd0Var.U.getY());
                    nd0Var.K0.Q(canvas, arrayList);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    public boolean Z() {
        org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.z0;
        LinearLayout linearLayout = z4Var.l0;
        return linearLayout != null && (linearLayout.getParent() instanceof View) && ((View) z4Var.l0.getParent()).getTop() <= z4Var.a.getPaddingTop();
    }

    @Override // r0.m
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        switch (this.w0) {
            case 0:
                break;
            default:
                i(viewGroup, i10, i11, i12, i13, i14, new int[2]);
                break;
        }
    }

    /* JADX WARN: Finally extract failed */
    public int c0(org.telegram.ui.Components.h71 h71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.kc0 kc0Var = new org.telegram.ui.Components.kc0(iArr, 11);
        this.y0 = true;
        h71Var.j(kc0Var);
        try {
            h71Var.scrollBy(0, i10);
            ArrayList arrayList = h71Var.w0;
            if (arrayList != null) {
                arrayList.remove(kc0Var);
            }
            this.y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = h71Var.w0;
            if (arrayList2 != null) {
                arrayList2.remove(kc0Var);
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
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.z0;
                org.telegram.ui.Wallet.v4 v4Var2 = z4Var.o0;
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
                if (motionEvent.getActionMasked() == 1 && (v4Var = z4Var.o0) != null) {
                    org.telegram.ui.Wallet.m mVar = v4Var.i;
                    org.telegram.ui.Components.b71 b71Var = v4Var.c;
                    if (b71Var != null) {
                        b71Var.removeCallbacks(mVar);
                        v4Var.c.post(mVar);
                    }
                }
                return dispatchTouchEvent;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.w0) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j10);
                nd0 nd0Var = (nd0) this.z0;
                kVar = ((org.telegram.ui.ActionBar.m2) nd0Var).actionBar;
                if (view == kVar) {
                    b5Var = ((org.telegram.ui.ActionBar.m2) nd0Var).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.m2) nd0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.m2) nd0Var).actionBar;
                        ((ActionBarLayout) b5Var2).q(canvas, kVar2.getMeasuredHeight());
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
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

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        dd0 dd0Var;
        org.telegram.ui.Components.h71 n02;
        switch (this.w0) {
            case 0:
                nd0 nd0Var = (nd0) this.z0;
                try {
                    if (viewGroup == nd0Var.U && (dd0Var = nd0Var.K0) != null && dd0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.mm0 currentListView = nd0Var.K0.getCurrentListView();
                        int top = nd0Var.K0.getTop();
                        if (currentListView != null && top == 0) {
                            iArr[1] = i13;
                            currentListView.scrollBy(0, i13);
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new zz(this, 18));
                    return;
                }
                break;
            default:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.z0;
                if (!this.y0 && i13 != 0 && (n02 = z4Var.n0()) != null) {
                    if (viewGroup != z4Var.a || !Z()) {
                        if (viewGroup == n02 && i13 < 0) {
                            iArr[1] = c0(z4Var.a, i13) + iArr[1];
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

    @Override // r0.m
    public final void n(int i10, View view) {
        switch (this.w0) {
            case 0:
                this.x0.a = 0;
                break;
            default:
                b2.v0 v0Var = this.x0;
                if (i10 == 1) {
                    v0Var.b = 0;
                } else {
                    v0Var.a = 0;
                }
                org.telegram.ui.Wallet.v4 v4Var = ((org.telegram.ui.Wallet.z4) this.z0).o0;
                if (v4Var != null) {
                    org.telegram.ui.Wallet.m mVar = v4Var.i;
                    org.telegram.ui.Components.b71 b71Var = v4Var.c;
                    if (b71Var != null) {
                        b71Var.removeCallbacks(mVar);
                        v4Var.c.post(mVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.w0) {
            case 0:
                nd0 nd0Var = (nd0) this.z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (!z10) {
                    nd0Var.z0(true);
                    break;
                } else {
                    nd0Var.j0(this.y0);
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
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.z0;
                if (z4Var.n != size) {
                    z4Var.n = size;
                    org.telegram.ui.Wallet.m4 m4Var = z4Var.d;
                    if (m4Var != null) {
                        m4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.j4 j4Var = z4Var.e;
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
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.z0;
                if (view != z4Var.n0() || (v4Var = z4Var.o0) == null) {
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

    @Override // r0.m
    public final boolean p(View view, View view2, int i10, int i11) {
        switch (this.w0) {
            case 0:
                if (((nd0) this.z0).K0 == null || i10 != 2) {
                }
                break;
            default:
                if ((i10 & 2) != 0) {
                }
                break;
        }
        return false;
    }

    @Override // r0.m
    public final void s(View view, View view2, int i10, int i11) {
        switch (this.w0) {
            case 0:
                this.x0.a = i10;
                break;
            default:
                b2.v0 v0Var = this.x0;
                if (i11 != 1) {
                    v0Var.a = i10;
                    break;
                } else {
                    v0Var.b = i10;
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld0(nd0 nd0Var, Context context) {
        super(context, null);
        this.z0 = nd0Var;
        this.y0 = true;
        this.x0 = new b2.v0();
    }

    private final void b0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}

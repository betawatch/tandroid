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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jd0 extends org.telegram.ui.Components.ow0 implements r0.m {
    public final /* synthetic */ int w0 = 1;
    public final b2.v0 x0;
    public boolean y0;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd0(org.telegram.ui.Wallet.a5 a5Var, Context context) {
        super(context, null);
        this.z0 = a5Var;
        this.x0 = new b2.v0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        bd0 bd0Var;
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.Components.mm0 currentListView;
        org.telegram.ui.Components.i71 n02;
        org.telegram.ui.Wallet.w4 w4Var;
        switch (this.w0) {
            case 0:
                ld0 ld0Var = (ld0) this.z0;
                if (viewGroup == ld0Var.U && (bd0Var = ld0Var.K0) != null && bd0Var.isAttachedToWindow()) {
                    kVar = ((org.telegram.ui.ActionBar.m2) ld0Var).actionBar;
                    boolean z10 = kVar.n0;
                    int top = ld0Var.K0.getTop();
                    boolean z11 = false;
                    if (i11 >= 0) {
                        if (z10) {
                            org.telegram.ui.Components.mm0 currentListView2 = ld0Var.K0.getCurrentListView();
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
                        if (top <= 0 && (currentListView = ld0Var.K0.getCurrentListView()) != null) {
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
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.z0;
                if (!this.y0 && (n02 = a5Var.n0()) != null) {
                    if (i11 != 0 && i12 == 0 && ((viewGroup == a5Var.a || viewGroup == n02) && (w4Var = a5Var.o0) != null && w4Var.f)) {
                        w4Var.d = true;
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

    @Override // org.telegram.ui.Components.ow0
    public void L(Canvas canvas, ArrayList arrayList) {
        switch (this.w0) {
            case 0:
                ld0 ld0Var = (ld0) this.z0;
                if (ld0Var.K0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, ld0Var.U.getY());
                    ld0Var.K0.Q(canvas, arrayList);
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
    public int c0(org.telegram.ui.Components.i71 i71Var, int i10) {
        int[] iArr = {0};
        org.telegram.ui.Components.kc0 kc0Var = new org.telegram.ui.Components.kc0(iArr, 11);
        this.y0 = true;
        i71Var.j(kc0Var);
        try {
            i71Var.scrollBy(0, i10);
            ArrayList arrayList = i71Var.w0;
            if (arrayList != null) {
                arrayList.remove(kc0Var);
            }
            this.y0 = false;
            return iArr[0];
        } catch (Throwable th2) {
            ArrayList arrayList2 = i71Var.w0;
            if (arrayList2 != null) {
                arrayList2.remove(kc0Var);
            }
            this.y0 = false;
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Wallet.w4 w4Var;
        switch (this.w0) {
            case 1:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.z0;
                org.telegram.ui.Wallet.w4 w4Var2 = a5Var.o0;
                if (w4Var2 != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        w4Var2.c();
                        w4Var2.e = true;
                        w4Var2.g = motionEvent.getX();
                        w4Var2.h = motionEvent.getY();
                    } else if (actionMasked == 3) {
                        w4Var2.c();
                    } else if (actionMasked == 2 || actionMasked == 1) {
                        float abs = Math.abs(motionEvent.getX() - w4Var2.g);
                        float abs2 = Math.abs(motionEvent.getY() - w4Var2.h);
                        boolean z10 = abs2 > ((float) ViewConfiguration.get(w4Var2.c.getContext()).getScaledTouchSlop()) && abs2 > abs * 1.5f;
                        w4Var2.f = z10;
                        if (!z10) {
                            w4Var2.d = false;
                        }
                        if (actionMasked == 1) {
                            w4Var2.e = false;
                        }
                    }
                }
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() == 1 && (w4Var = a5Var.o0) != null) {
                    org.telegram.ui.Wallet.n nVar = w4Var.i;
                    org.telegram.ui.Components.c71 c71Var = w4Var.c;
                    if (c71Var != null) {
                        c71Var.removeCallbacks(nVar);
                        w4Var.c.post(nVar);
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
                ld0 ld0Var = (ld0) this.z0;
                kVar = ((org.telegram.ui.ActionBar.m2) ld0Var).actionBar;
                if (view == kVar) {
                    b5Var = ((org.telegram.ui.ActionBar.m2) ld0Var).parentLayout;
                    if (b5Var != null) {
                        b5Var2 = ((org.telegram.ui.ActionBar.m2) ld0Var).parentLayout;
                        kVar2 = ((org.telegram.ui.ActionBar.m2) ld0Var).actionBar;
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

    @Override // r0.m
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        bd0 bd0Var;
        org.telegram.ui.Components.i71 n02;
        switch (this.w0) {
            case 0:
                ld0 ld0Var = (ld0) this.z0;
                try {
                    if (viewGroup == ld0Var.U && (bd0Var = ld0Var.K0) != null && bd0Var.isAttachedToWindow()) {
                        org.telegram.ui.Components.mm0 currentListView = ld0Var.K0.getCurrentListView();
                        int top = ld0Var.K0.getTop();
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
                org.telegram.ui.Wallet.w4 w4Var = ((org.telegram.ui.Wallet.a5) this.z0).o0;
                if (w4Var != null) {
                    org.telegram.ui.Wallet.n nVar = w4Var.i;
                    org.telegram.ui.Components.c71 c71Var = w4Var.c;
                    if (c71Var != null) {
                        c71Var.removeCallbacks(nVar);
                        w4Var.c.post(nVar);
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
                ld0 ld0Var = (ld0) this.z0;
                super.onLayout(z10, i10, i11, i12, i13);
                if (!z10) {
                    ld0Var.z0(true);
                    break;
                } else {
                    ld0Var.j0(this.y0);
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
                    org.telegram.ui.Wallet.n4 n4Var = a5Var.d;
                    if (n4Var != null) {
                        n4Var.requestLayout();
                    }
                    org.telegram.ui.Wallet.k4 k4Var = a5Var.e;
                    if (k4Var != null) {
                        k4Var.requestLayout();
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
        org.telegram.ui.Wallet.w4 w4Var;
        switch (this.w0) {
            case 1:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.z0;
                if (view != a5Var.n0() || (w4Var = a5Var.o0) == null) {
                    return false;
                }
                return w4Var.a((int) f7, (int) f10);
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
                if (((ld0) this.z0).K0 == null || i10 != 2) {
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
    public jd0(ld0 ld0Var, Context context) {
        super(context, null);
        this.z0 = ld0Var;
        this.y0 = true;
        this.x0 = new b2.v0();
    }

    private final void b0(View view) {
    }

    private final void a0(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}

package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class cw0 extends org.telegram.ui.Components.x81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cw0(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.x81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        u5 u5Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                ((u31) view).a(i11);
                break;
            case 2:
                break;
            case 3:
                th1 th1Var = (th1) obj;
                SparseArray sparseArray = th1Var.a;
                rh1 rh1Var = (rh1) sparseArray.get(i10);
                if (rh1Var != null) {
                    n2Var = rh1Var.a;
                } else {
                    org.telegram.ui.ActionBar.n2 T = th1Var.T(i10);
                    rh1 rh1Var2 = new rh1(T);
                    sparseArray.put(i10, rh1Var2);
                    n2Var = T;
                    rh1Var = rh1Var2;
                }
                if (!rh1Var.b) {
                    n2Var.onFragmentCreate();
                    rh1Var.b = true;
                }
                n2Var.setParentLayout(th1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.b);
                    n2Var.setTitleOverlayText(th1Var.n, th1Var.r, th1Var.s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                }
                frameLayout.addView(fragmentView, w7.z5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(frameLayout);
                th1Var.checkSystemBarColors();
                th1Var.S();
                break;
            case 4:
                break;
            default:
                yh.x3 x3Var = (yh.x3) obj;
                if (i11 == 0) {
                    yh.x3.j1(x3Var, false);
                    xh.n2 n2Var2 = x3Var.b0;
                    if (n2Var2 != null) {
                        u5Var = n2Var2.Y;
                    }
                } else if (i11 == 2) {
                    yh.x3.j1(x3Var, true);
                    xh.n2 n2Var3 = x3Var.c0;
                    if (n2Var3 != null) {
                        u5Var = n2Var3.Y;
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(u5Var);
                frameLayout2.addView(u5Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public final View d(int i10) {
        u5 u5Var;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.b);
                frameLayout.setOnClickListener(new j60(this, 23));
                return frameLayout;
            case 1:
                return new u31((v31) this.c, (Context) this.b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.setOnClickListener(new a41(this, 7));
                return frameLayout2;
            case 3:
                return new n41((Context) this.b, 8);
            case 4:
                return i10 == 0 ? ((tg.a0) this.b).getContainerView() : ((tg.z0) this.c).getContainerView();
            default:
                yh.x3 x3Var = (yh.x3) this.c;
                if (i10 == 0) {
                    yh.x3.j1(x3Var, false);
                    xh.n2 n2Var = x3Var.b0;
                    if (n2Var != null) {
                        u5Var = n2Var.Y;
                        AndroidUtilities.removeFromParent(u5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                        frameLayout3.addView(u5Var, w7.z5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        yh.x3.j1(x3Var, true);
                        xh.n2 n2Var2 = x3Var.c0;
                        if (n2Var2 != null) {
                            u5Var = n2Var2.Y;
                        }
                    }
                    return null;
                }
                u5Var = x3Var.Y;
                AndroidUtilities.removeFromParent(u5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.b);
                frameLayout32.addView(u5Var, w7.z5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((th1) this.c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.x3 x3Var = (yh.x3) this.c;
                return (x3Var.L1(true) ? 1 : 0) + (x3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public int h(int i10) {
        switch (this.a) {
            case 1:
                return i10 == 0 ? 0 : 1;
            case 2:
            case 3:
            default:
                return super.h(i10);
            case 4:
                return i10;
            case 5:
                return (i10 - (((yh.x3) this.c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public cw0(tg.a0 a0Var, tg.z0 z0Var) {
        this.a = 4;
        this.b = a0Var;
        this.c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}

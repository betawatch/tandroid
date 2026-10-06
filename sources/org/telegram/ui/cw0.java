package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class cw0 extends org.telegram.ui.Components.y81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cw0(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        u5 u5Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                ((s31) view).a(i11);
                break;
            case 2:
                break;
            case 3:
                rh1 rh1Var = (rh1) obj;
                SparseArray sparseArray = rh1Var.a;
                ph1 ph1Var = (ph1) sparseArray.get(i10);
                if (ph1Var != null) {
                    n2Var = ph1Var.a;
                } else {
                    org.telegram.ui.ActionBar.n2 T = rh1Var.T(i10);
                    ph1 ph1Var2 = new ph1(T);
                    sparseArray.put(i10, ph1Var2);
                    n2Var = T;
                    ph1Var = ph1Var2;
                }
                if (!ph1Var.b) {
                    n2Var.onFragmentCreate();
                    ph1Var.b = true;
                }
                n2Var.setParentLayout(rh1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.b);
                    n2Var.setTitleOverlayText(rh1Var.n, rh1Var.r, rh1Var.s);
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
                rh1Var.checkSystemBarColors();
                rh1Var.S();
                break;
            case 4:
                break;
            default:
                yh.y3 y3Var = (yh.y3) obj;
                if (i11 == 0) {
                    yh.y3.j1(y3Var, false);
                    xh.n2 n2Var2 = y3Var.b0;
                    if (n2Var2 != null) {
                        u5Var = n2Var2.Y;
                    }
                } else if (i11 == 2) {
                    yh.y3.j1(y3Var, true);
                    xh.n2 n2Var3 = y3Var.c0;
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

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        u5 u5Var;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.b);
                frameLayout.setOnClickListener(new j60(this, 23));
                return frameLayout;
            case 1:
                return new s31((t31) this.c, (Context) this.b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.setOnClickListener(new y31(this, 7));
                return frameLayout2;
            case 3:
                return new l41((Context) this.b, 8);
            case 4:
                return i10 == 0 ? ((tg.a0) this.b).getContainerView() : ((tg.z0) this.c).getContainerView();
            default:
                yh.y3 y3Var = (yh.y3) this.c;
                if (i10 == 0) {
                    yh.y3.j1(y3Var, false);
                    xh.n2 n2Var = y3Var.b0;
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
                        yh.y3.j1(y3Var, true);
                        xh.n2 n2Var2 = y3Var.c0;
                        if (n2Var2 != null) {
                            u5Var = n2Var2.Y;
                        }
                    }
                    return null;
                }
                u5Var = y3Var.Y;
                AndroidUtilities.removeFromParent(u5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.b);
                frameLayout32.addView(u5Var, w7.z5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((rh1) this.c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.y3 y3Var = (yh.y3) this.c;
                return (y3Var.L1(true) ? 1 : 0) + (y3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override // org.telegram.ui.Components.y81
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
                return (i10 - (((yh.y3) this.c).L1(false) ? 1 : 0)) + 1;
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

package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ow0 extends org.telegram.ui.Components.c91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ow0(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        x5 x5Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                ((h41) view).a(i11);
                break;
            case 2:
                break;
            case 3:
                ji1 ji1Var = (ji1) obj;
                SparseArray sparseArray = ji1Var.a;
                hi1 hi1Var = (hi1) sparseArray.get(i10);
                if (hi1Var != null) {
                    m2Var = hi1Var.a;
                } else {
                    org.telegram.ui.ActionBar.m2 V = ji1Var.V(i10);
                    hi1 hi1Var2 = new hi1(V);
                    sparseArray.put(i10, hi1Var2);
                    m2Var = V;
                    hi1Var = hi1Var2;
                }
                if (!hi1Var.b) {
                    m2Var.onFragmentCreate();
                    hi1Var.b = true;
                }
                m2Var.setParentLayout(ji1Var.getParentLayout());
                if (m2Var.getFragmentView() == null) {
                    m2Var.performCreateView((Context) this.b);
                    m2Var.setTitleOverlayText(ji1Var.n, ji1Var.r, ji1Var.s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = m2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!m2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                }
                frameLayout.addView(fragmentView, w7.a6.d(-1.0f, -1));
                if (m2Var.getActionBar() != null && m2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(m2Var.getActionBar());
                    frameLayout.addView(m2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.a;
                r0.z.c(frameLayout);
                ji1Var.checkSystemBarColors();
                ji1Var.U();
                break;
            case 4:
                break;
            default:
                zh.r3 r3Var = (zh.r3) obj;
                if (i11 == 0) {
                    zh.r3.k1(r3Var, false);
                    yh.l2 l2Var = r3Var.c0;
                    if (l2Var != null) {
                        x5Var = l2Var.Y;
                    }
                } else if (i11 == 2) {
                    zh.r3.k1(r3Var, true);
                    yh.l2 l2Var2 = r3Var.d0;
                    if (l2Var2 != null) {
                        x5Var = l2Var2.Y;
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(x5Var);
                frameLayout2.addView(x5Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        x5 x5Var;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.b);
                frameLayout.setOnClickListener(new t60(this, 22));
                return frameLayout;
            case 1:
                return new h41((i41) this.c, (Context) this.b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.setOnClickListener(new v41(this, 6));
                return frameLayout2;
            case 3:
                return new d61((Context) this.b, 7);
            case 4:
                return i10 == 0 ? ((ug.a0) this.b).getContainerView() : ((ug.z0) this.c).getContainerView();
            default:
                zh.r3 r3Var = (zh.r3) this.c;
                if (i10 == 0) {
                    zh.r3.k1(r3Var, false);
                    yh.l2 l2Var = r3Var.c0;
                    if (l2Var != null) {
                        x5Var = l2Var.Y;
                        AndroidUtilities.removeFromParent(x5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                        frameLayout3.addView(x5Var, w7.a6.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        zh.r3.k1(r3Var, true);
                        yh.l2 l2Var2 = r3Var.d0;
                        if (l2Var2 != null) {
                            x5Var = l2Var2.Y;
                        }
                    }
                    return null;
                }
                x5Var = r3Var.Y;
                AndroidUtilities.removeFromParent(x5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.b);
                frameLayout32.addView(x5Var, w7.a6.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((ji1) this.c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                zh.r3 r3Var = (zh.r3) this.c;
                return (r3Var.M1(true) ? 1 : 0) + (r3Var.M1(false) ? 1 : 0) + 1;
        }
    }

    @Override // org.telegram.ui.Components.c91
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
                return (i10 - (((zh.r3) this.c).M1(false) ? 1 : 0)) + 1;
        }
    }

    public ow0(ug.a0 a0Var, ug.z0 z0Var) {
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

package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hw0 extends org.telegram.ui.Components.a81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hw0(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.n2 n2Var;
        t5 t5Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                ((d41) view).a(i11);
                break;
            case 2:
                break;
            case 3:
                bi1 bi1Var = (bi1) obj;
                SparseArray sparseArray = bi1Var.a;
                zh1 zh1Var = (zh1) sparseArray.get(i10);
                if (zh1Var != null) {
                    n2Var = zh1Var.a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = bi1Var.V(i10);
                    zh1 zh1Var2 = new zh1(V);
                    sparseArray.put(i10, zh1Var2);
                    n2Var = V;
                    zh1Var = zh1Var2;
                }
                if (!zh1Var.b) {
                    n2Var.onFragmentCreate();
                    zh1Var.b = true;
                }
                n2Var.setParentLayout(bi1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.b);
                    n2Var.setTitleOverlayText(bi1Var.n, bi1Var.r, bi1Var.s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                }
                frameLayout.addView(fragmentView, w7.x5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(frameLayout);
                bi1Var.checkSystemBarColors();
                bi1Var.U();
                break;
            case 4:
                break;
            default:
                zh.w3 w3Var = (zh.w3) obj;
                if (i11 == 0) {
                    zh.w3.j1(w3Var, false);
                    yh.l2 l2Var = w3Var.b0;
                    if (l2Var != null) {
                        t5Var = l2Var.Y;
                    }
                } else if (i11 == 2) {
                    zh.w3.j1(w3Var, true);
                    yh.l2 l2Var2 = w3Var.c0;
                    if (l2Var2 != null) {
                        t5Var = l2Var2.Y;
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(t5Var);
                frameLayout2.addView(t5Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        t5 t5Var;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.b);
                frameLayout.setOnClickListener(new l60(this, 23));
                return frameLayout;
            case 1:
                return new d41((e41) this.c, (Context) this.b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.setOnClickListener(new j41(this, 7));
                return frameLayout2;
            case 3:
                return new v51((Context) this.b, 7);
            case 4:
                return i10 == 0 ? ((ug.b0) this.b).getContainerView() : ((ug.a1) this.c).getContainerView();
            default:
                zh.w3 w3Var = (zh.w3) this.c;
                if (i10 == 0) {
                    zh.w3.j1(w3Var, false);
                    yh.l2 l2Var = w3Var.b0;
                    if (l2Var != null) {
                        t5Var = l2Var.Y;
                        AndroidUtilities.removeFromParent(t5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                        frameLayout3.addView(t5Var, w7.x5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        zh.w3.j1(w3Var, true);
                        yh.l2 l2Var2 = w3Var.c0;
                        if (l2Var2 != null) {
                            t5Var = l2Var2.Y;
                        }
                    }
                    return null;
                }
                t5Var = w3Var.Y;
                AndroidUtilities.removeFromParent(t5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.b);
                frameLayout32.addView(t5Var, w7.x5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((bi1) this.c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                zh.w3 w3Var = (zh.w3) this.c;
                return (w3Var.L1(true) ? 1 : 0) + (w3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override // org.telegram.ui.Components.a81
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
                return (i10 - (((zh.w3) this.c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public hw0(ug.b0 b0Var, ug.a1 a1Var) {
        this.a = 4;
        this.b = b0Var;
        this.c = a1Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}

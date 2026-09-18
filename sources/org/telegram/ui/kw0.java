package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class kw0 extends org.telegram.ui.Components.b81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kw0(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.b81
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.o2 o2Var;
        t5 t5Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                ((c41) view).a(i11);
                break;
            case 2:
                break;
            case 3:
                ai1 ai1Var = (ai1) obj;
                SparseArray sparseArray = ai1Var.a;
                yh1 yh1Var = (yh1) sparseArray.get(i10);
                if (yh1Var != null) {
                    o2Var = yh1Var.a;
                } else {
                    org.telegram.ui.ActionBar.o2 V = ai1Var.V(i10);
                    yh1 yh1Var2 = new yh1(V);
                    sparseArray.put(i10, yh1Var2);
                    o2Var = V;
                    yh1Var = yh1Var2;
                }
                if (!yh1Var.b) {
                    o2Var.onFragmentCreate();
                    yh1Var.b = true;
                }
                o2Var.setParentLayout(ai1Var.getParentLayout());
                if (o2Var.getFragmentView() == null) {
                    o2Var.performCreateView((Context) this.b);
                    o2Var.setTitleOverlayText(ai1Var.n, ai1Var.r, ai1Var.s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = o2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!o2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                }
                frameLayout.addView(fragmentView, w7.x5.c(-1.0f, -1));
                if (o2Var.getActionBar() != null && o2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(o2Var.getActionBar());
                    frameLayout.addView(o2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(frameLayout);
                ai1Var.checkSystemBarColors();
                ai1Var.U();
                break;
            case 4:
                break;
            default:
                yh.a4 a4Var = (yh.a4) obj;
                if (i11 == 0) {
                    yh.a4.j1(a4Var, false);
                    xh.m2 m2Var = a4Var.b0;
                    if (m2Var != null) {
                        t5Var = m2Var.Y;
                    }
                } else if (i11 == 2) {
                    yh.a4.j1(a4Var, true);
                    xh.m2 m2Var2 = a4Var.c0;
                    if (m2Var2 != null) {
                        t5Var = m2Var2.Y;
                    }
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(t5Var);
                frameLayout2.addView(t5Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.b81
    public final View d(int i10) {
        t5 t5Var;
        switch (this.a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.b);
                frameLayout.setOnClickListener(new m60(this, 23));
                return frameLayout;
            case 1:
                return new c41((d41) this.c, (Context) this.b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.setOnClickListener(new i41(this, 7));
                return frameLayout2;
            case 3:
                return new t41((Context) this.b, 8);
            case 4:
                return i10 == 0 ? ((tg.b0) this.b).getContainerView() : ((tg.a1) this.c).getContainerView();
            default:
                yh.a4 a4Var = (yh.a4) this.c;
                if (i10 == 0) {
                    yh.a4.j1(a4Var, false);
                    xh.m2 m2Var = a4Var.b0;
                    if (m2Var != null) {
                        t5Var = m2Var.Y;
                        AndroidUtilities.removeFromParent(t5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                        frameLayout3.addView(t5Var, w7.x5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        yh.a4.j1(a4Var, true);
                        xh.m2 m2Var2 = a4Var.c0;
                        if (m2Var2 != null) {
                            t5Var = m2Var2.Y;
                        }
                    }
                    return null;
                }
                t5Var = a4Var.Y;
                AndroidUtilities.removeFromParent(t5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.b);
                frameLayout32.addView(t5Var, w7.x5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override // org.telegram.ui.Components.b81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((ai1) this.c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.a4 a4Var = (yh.a4) this.c;
                return (a4Var.L1(true) ? 1 : 0) + (a4Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override // org.telegram.ui.Components.b81
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
                return (i10 - (((yh.a4) this.c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public kw0(tg.b0 b0Var, tg.a1 a1Var) {
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

package ai;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u81;
import org.telegram.ui.i31;
import org.telegram.ui.l41;
import org.telegram.ui.og1;
import org.telegram.ui.p21;
import org.telegram.ui.q21;
import org.telegram.ui.qg1;
import org.telegram.ui.y50;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class i5 extends u81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i5(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
        n5 n5Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                k7 k7Var = (k7) obj;
                if (i11 == 0) {
                    k7.s1(k7Var, false);
                    yh.l2 l2Var = k7Var.c0;
                    if (l2Var != null) {
                        n5Var = l2Var.Y;
                    }
                } else if (i11 == 2) {
                    k7.s1(k7Var, true);
                    yh.l2 l2Var2 = k7Var.d0;
                    if (l2Var2 != null) {
                        n5Var = l2Var2.Y;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(n5Var);
                frameLayout.addView(n5Var);
                break;
            case 2:
                ((p21) view).a(i11);
                break;
            case 4:
                qg1 qg1Var = (qg1) obj;
                SparseArray sparseArray = qg1Var.a;
                og1 og1Var = (og1) sparseArray.get(i10);
                if (og1Var != null) {
                    n2Var = og1Var.a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = qg1Var.V(i10);
                    og1 og1Var2 = new og1(V);
                    sparseArray.put(i10, og1Var2);
                    n2Var = V;
                    og1Var = og1Var2;
                }
                if (!og1Var.b) {
                    n2Var.onFragmentCreate();
                    og1Var.b = true;
                }
                n2Var.setParentLayout(qg1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.b);
                    n2Var.setTitleOverlayText(qg1Var.n, qg1Var.r, qg1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                }
                frameLayout2.addView(fragmentView, w7.z5.d(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout2.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(frameLayout2);
                qg1Var.checkSystemBarColors();
                qg1Var.U();
                break;
        }
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        n5 n5Var;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.c;
                if (i10 == 0) {
                    k7.s1(k7Var, false);
                    yh.l2 l2Var = k7Var.c0;
                    if (l2Var != null) {
                        n5Var = l2Var.Y;
                        AndroidUtilities.removeFromParent(n5Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.b);
                        frameLayout.addView(n5Var, w7.z5.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        k7.s1(k7Var, true);
                        yh.l2 l2Var2 = k7Var.d0;
                        if (l2Var2 != null) {
                            n5Var = l2Var2.Y;
                        }
                    }
                    return null;
                }
                n5Var = k7Var.Y;
                AndroidUtilities.removeFromParent(n5Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.addView(n5Var, w7.z5.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                frameLayout3.setOnClickListener(new y50(this, 22));
                return frameLayout3;
            case 2:
                return new p21((q21) this.c, (Context) this.b);
            case 3:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new i31(this, 5));
                return frameLayout4;
            case 4:
                return new l41((Context) this.b, 7);
            default:
                return i10 == 0 ? ((ug.y) this.b).getContainerView() : ((ug.x0) this.c).getContainerView();
        }
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.c;
                return (k7Var.Y1(true) ? 1 : 0) + (k7Var.Y1(false) ? 1 : 0) + 1;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 2;
            case 4:
                ((qg1) this.c).getClass();
                return 4;
            default:
                return 2;
        }
    }

    @Override // org.telegram.ui.Components.u81
    public int h(int i10) {
        switch (this.a) {
            case 0:
                return (i10 - (((k7) this.c).Y1(false) ? 1 : 0)) + 1;
            case 2:
                return i10 == 0 ? 0 : 1;
            case 5:
                return i10;
            default:
                return super.h(i10);
        }
    }

    public i5(ug.y yVar, ug.x0 x0Var) {
        this.a = 5;
        this.b = yVar;
        this.c = x0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}

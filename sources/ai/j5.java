package ai;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v81;
import org.telegram.ui.c31;
import org.telegram.ui.j41;
import org.telegram.ui.mg1;
import org.telegram.ui.n21;
import org.telegram.ui.o21;
import org.telegram.ui.og1;
import org.telegram.ui.s50;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class j5 extends v81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j5(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.v81
    public final void b(View view, int i10, int i11) {
        o5 o5Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                l7 l7Var = (l7) obj;
                if (i11 == 0) {
                    l7.w1(l7Var, false);
                    yh.k2 k2Var = l7Var.c0;
                    if (k2Var != null) {
                        o5Var = k2Var.Y;
                    }
                } else if (i11 == 2) {
                    l7.w1(l7Var, true);
                    yh.k2 k2Var2 = l7Var.d0;
                    if (k2Var2 != null) {
                        o5Var = k2Var2.Y;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(o5Var);
                frameLayout.addView(o5Var);
                break;
            case 2:
                ((n21) view).a(i11);
                break;
            case 4:
                og1 og1Var = (og1) obj;
                SparseArray sparseArray = og1Var.a;
                mg1 mg1Var = (mg1) sparseArray.get(i10);
                if (mg1Var != null) {
                    n2Var = mg1Var.a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = og1Var.V(i10);
                    mg1 mg1Var2 = new mg1(V);
                    sparseArray.put(i10, mg1Var2);
                    n2Var = V;
                    mg1Var = mg1Var2;
                }
                if (!mg1Var.b) {
                    n2Var.onFragmentCreate();
                    mg1Var.b = true;
                }
                n2Var.setParentLayout(og1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.b);
                    n2Var.setTitleOverlayText(og1Var.n, og1Var.r, og1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                }
                frameLayout2.addView(fragmentView, w7.z5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout2.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(frameLayout2);
                og1Var.checkSystemBarColors();
                og1Var.U();
                break;
        }
    }

    @Override // org.telegram.ui.Components.v81
    public final View d(int i10) {
        o5 o5Var;
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.c;
                if (i10 == 0) {
                    l7.w1(l7Var, false);
                    yh.k2 k2Var = l7Var.c0;
                    if (k2Var != null) {
                        o5Var = k2Var.Y;
                        AndroidUtilities.removeFromParent(o5Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.b);
                        frameLayout.addView(o5Var, w7.z5.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        l7.w1(l7Var, true);
                        yh.k2 k2Var2 = l7Var.d0;
                        if (k2Var2 != null) {
                            o5Var = k2Var2.Y;
                        }
                    }
                    return null;
                }
                o5Var = l7Var.Y;
                AndroidUtilities.removeFromParent(o5Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.addView(o5Var, w7.z5.e(-1, -1, 119));
                return frameLayout2;
            case 1:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                frameLayout3.setOnClickListener(new s50(this, 23));
                return frameLayout3;
            case 2:
                return new n21((o21) this.c, (Context) this.b);
            case 3:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new c31(this, 6));
                return frameLayout4;
            case 4:
                return new j41((Context) this.b, 7);
            default:
                return i10 == 0 ? ((ug.z) this.b).getContainerView() : ((ug.y0) this.c).getContainerView();
        }
    }

    @Override // org.telegram.ui.Components.v81
    public final int e() {
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.c;
                return (l7Var.g2(true) ? 1 : 0) + (l7Var.g2(false) ? 1 : 0) + 1;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 2;
            case 4:
                ((og1) this.c).getClass();
                return 4;
            default:
                return 2;
        }
    }

    @Override // org.telegram.ui.Components.v81
    public int h(int i10) {
        switch (this.a) {
            case 0:
                return (i10 - (((l7) this.c).g2(false) ? 1 : 0)) + 1;
            case 2:
                return i10 == 0 ? 0 : 1;
            case 5:
                return i10;
            default:
                return super.h(i10);
        }
    }

    public j5(ug.z zVar, ug.y0 y0Var) {
        this.a = 5;
        this.b = zVar;
        this.c = y0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}

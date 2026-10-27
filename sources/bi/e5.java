package bi;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.wz;
import org.telegram.ui.r41;
import org.telegram.ui.ug1;
import org.telegram.ui.v21;
import org.telegram.ui.w21;
import org.telegram.ui.wg1;
import org.telegram.ui.x21;
import org.telegram.ui.xj0;
import org.telegram.ui.z50;
import org.telegram.ui.zj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e5 extends n91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e5(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        j5 j5Var;
        org.telegram.ui.ActionBar.r2 r2Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                h7 h7Var = (h7) obj;
                if (i11 == 0) {
                    h7.v1(h7Var, false);
                    zh.l2 l2Var = h7Var.c0;
                    if (l2Var != null) {
                        j5Var = l2Var.Y;
                    }
                } else if (i11 == 2) {
                    h7.v1(h7Var, true);
                    zh.l2 l2Var2 = h7Var.d0;
                    if (l2Var2 != null) {
                        j5Var = l2Var2.Y;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(j5Var);
                frameLayout.addView(j5Var);
                break;
            case 1:
                zj0 zj0Var = (zj0) obj;
                xj0[] xj0VarArr = zj0Var.b;
                xj0VarArr[i10].d.g3.O(false);
                if (!xj0VarArr[i10].i) {
                    zj0Var.l0(i10, false);
                    break;
                }
                break;
            case 3:
                ((w21) view).a(i11);
                break;
            case 5:
                wg1 wg1Var = (wg1) obj;
                SparseArray sparseArray = wg1Var.a;
                ug1 ug1Var = (ug1) sparseArray.get(i10);
                if (ug1Var != null) {
                    r2Var = ug1Var.a;
                } else {
                    org.telegram.ui.ActionBar.r2 W = wg1Var.W(i10);
                    ug1 ug1Var2 = new ug1(W);
                    sparseArray.put(i10, ug1Var2);
                    r2Var = W;
                    ug1Var = ug1Var2;
                }
                if (!ug1Var.b) {
                    r2Var.onFragmentCreate();
                    ug1Var.b = true;
                }
                r2Var.setParentLayout(wg1Var.getParentLayout());
                if (r2Var.getFragmentView() == null) {
                    r2Var.performCreateView((Context) this.b);
                    r2Var.setTitleOverlayText(wg1Var.n, wg1Var.r, wg1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = r2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!r2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, kb1.g(-1.0f, -1));
                if (r2Var.getActionBar() != null && r2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(r2Var.getActionBar());
                    frameLayout2.addView(r2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(frameLayout2);
                wg1Var.checkSystemBarColors();
                wg1Var.V();
                break;
        }
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        j5 j5Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        switch (this.a) {
            case 0:
                h7 h7Var = (h7) this.c;
                if (i10 == 0) {
                    h7.v1(h7Var, false);
                    zh.l2 l2Var = h7Var.c0;
                    if (l2Var != null) {
                        j5Var = l2Var.Y;
                        AndroidUtilities.removeFromParent(j5Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.b);
                        frameLayout.addView(j5Var, kb1.i(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        h7.v1(h7Var, true);
                        zh.l2 l2Var2 = h7Var.d0;
                        if (l2Var2 != null) {
                            j5Var = l2Var2.Y;
                        }
                    }
                    return null;
                }
                j5Var = h7Var.Y;
                AndroidUtilities.removeFromParent(j5Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.addView(j5Var, kb1.i(-1, -1, 119));
                return frameLayout2;
            case 1:
                zj0 zj0Var = (zj0) this.c;
                xj0 xj0Var = zj0Var.b[i10];
                Context context = (Context) this.b;
                xj0Var.d = zj0Var.h0(context, i10);
                s71 s71Var = xj0Var.d;
                u6Var = ((org.telegram.ui.ActionBar.r2) zj0Var).resourceProvider;
                wz wzVar = new wz(context, s71Var, u6Var, new org.telegram.ui.Components.h2(this, i10, 21));
                xj0Var.e = wzVar;
                return wzVar;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                frameLayout3.setOnClickListener(new z50(this, 25));
                return frameLayout3;
            case 3:
                return new w21((x21) this.c, (Context) this.b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new v21(this, 8));
                return frameLayout4;
            case 5:
                return new r41((Context) this.b, 7);
            default:
                return i10 == 0 ? ((vg.a0) this.b).getContainerView() : ((vg.z0) this.c).getContainerView();
        }
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        switch (this.a) {
            case 0:
                h7 h7Var = (h7) this.c;
                return (h7Var.f2(true) ? 1 : 0) + (h7Var.f2(false) ? 1 : 0) + 1;
            case 1:
                return 2;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            case 5:
                ((wg1) this.c).getClass();
                return 4;
            default:
                return 2;
        }
    }

    @Override // org.telegram.ui.Components.n91
    public int h(int i10) {
        switch (this.a) {
            case 0:
                return (i10 - (((h7) this.c).f2(false) ? 1 : 0)) + 1;
            case 1:
                return i10;
            case 2:
            case 4:
            case 5:
            default:
                return super.h(i10);
            case 3:
                return i10 == 0 ? 0 : 1;
            case 6:
                return i10;
        }
    }

    public e5(vg.a0 a0Var, vg.z0 z0Var) {
        this.a = 6;
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

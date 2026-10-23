package ai;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d91;
import org.telegram.ui.g31;
import org.telegram.ui.n41;
import org.telegram.ui.r21;
import org.telegram.ui.s21;
import org.telegram.ui.sg1;
import org.telegram.ui.ug1;
import org.telegram.ui.w50;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class j5 extends d91 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j5(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        o5 o5Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                l7 l7Var = (l7) obj;
                if (i11 == 0) {
                    l7.v1(l7Var, false);
                    yh.k2 k2Var = l7Var.c0;
                    if (k2Var != null) {
                        o5Var = k2Var.Y;
                    }
                } else if (i11 == 2) {
                    l7.v1(l7Var, true);
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
                ((r21) view).a(i11);
                break;
            case 4:
                ug1 ug1Var = (ug1) obj;
                SparseArray sparseArray = ug1Var.a;
                sg1 sg1Var = (sg1) sparseArray.get(i10);
                if (sg1Var != null) {
                    o2Var = sg1Var.a;
                } else {
                    org.telegram.ui.ActionBar.o2 V = ug1Var.V(i10);
                    sg1 sg1Var2 = new sg1(V);
                    sparseArray.put(i10, sg1Var2);
                    o2Var = V;
                    sg1Var = sg1Var2;
                }
                if (!sg1Var.b) {
                    o2Var.onFragmentCreate();
                    sg1Var.b = true;
                }
                o2Var.setParentLayout(ug1Var.getParentLayout());
                if (o2Var.getFragmentView() == null) {
                    o2Var.performCreateView((Context) this.b);
                    o2Var.setTitleOverlayText(ug1Var.n, ug1Var.r, ug1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = o2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!o2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, fragmentView, null);
                }
                frameLayout2.addView(fragmentView, w7.z5.c(-1.0f, -1));
                if (o2Var.getActionBar() != null && o2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(o2Var.getActionBar());
                    frameLayout2.addView(o2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(frameLayout2);
                ug1Var.checkSystemBarColors();
                ug1Var.U();
                break;
        }
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        o5 o5Var;
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.c;
                if (i10 == 0) {
                    l7.v1(l7Var, false);
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
                        l7.v1(l7Var, true);
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
                frameLayout3.setOnClickListener(new w50(this, 23));
                return frameLayout3;
            case 2:
                return new r21((s21) this.c, (Context) this.b);
            case 3:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new g31(this, 6));
                return frameLayout4;
            case 4:
                return new n41((Context) this.b, 7);
            default:
                return i10 == 0 ? ((ug.y) this.b).getContainerView() : ((ug.x0) this.c).getContainerView();
        }
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.c;
                return (l7Var.f2(true) ? 1 : 0) + (l7Var.f2(false) ? 1 : 0) + 1;
            case 1:
                return 2;
            case 2:
                return 5;
            case 3:
                return 2;
            case 4:
                ((ug1) this.c).getClass();
                return 4;
            default:
                return 2;
        }
    }

    @Override // org.telegram.ui.Components.d91
    public int h(int i10) {
        switch (this.a) {
            case 0:
                return (i10 - (((l7) this.c).f2(false) ? 1 : 0)) + 1;
            case 2:
                return i10 == 0 ? 0 : 1;
            case 5:
                return i10;
            default:
                return super.h(i10);
        }
    }

    public j5(ug.y yVar, ug.x0 x0Var) {
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

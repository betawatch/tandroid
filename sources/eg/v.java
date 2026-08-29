package eg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import ih.m3;
import java.util.WeakHashMap;
import jh.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.q71;
import org.telegram.ui.n31;
import org.telegram.ui.t50;
import org.telegram.ui.tg1;
import org.telegram.ui.vg1;
import org.telegram.ui.w21;
import org.telegram.ui.x21;
import org.telegram.ui.y21;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v extends q71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        bg.u1 u1Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                h5 h5Var = (h5) obj;
                if (i11 == 0) {
                    h5.j1(h5Var, false);
                    m3 m3Var = h5Var.X;
                    if (m3Var != null) {
                        u1Var = m3Var.U;
                    }
                } else if (i11 == 2) {
                    h5.j1(h5Var, true);
                    m3 m3Var2 = h5Var.Y;
                    if (m3Var2 != null) {
                        u1Var = m3Var2.U;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(u1Var);
                frameLayout.addView(u1Var);
                break;
            case 2:
                break;
            case 3:
                ((x21) view).a(i11);
                break;
            case 4:
                break;
            default:
                vg1 vg1Var = (vg1) obj;
                SparseArray sparseArray = vg1Var.a;
                tg1 tg1Var = (tg1) sparseArray.get(i10);
                if (tg1Var != null) {
                    o2Var = tg1Var.a;
                } else {
                    org.telegram.ui.ActionBar.o2 V = vg1Var.V(i10);
                    tg1 tg1Var2 = new tg1(V);
                    sparseArray.put(i10, tg1Var2);
                    o2Var = V;
                    tg1Var = tg1Var2;
                }
                if (!tg1Var.b) {
                    o2Var.onFragmentCreate();
                    tg1Var.b = true;
                }
                o2Var.setParentLayout(vg1Var.getParentLayout());
                if (o2Var.getFragmentView() == null) {
                    o2Var.performCreateView((Context) this.b);
                    o2Var.setTitleOverlayText(vg1Var.n, vg1Var.r, vg1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = o2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!o2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(g6.w0(null, g6.d6, false));
                }
                frameLayout2.addView(fragmentView, f6.c(-1.0f, -1));
                if (o2Var.getActionBar() != null && o2Var.getActionBar().G) {
                    AndroidUtilities.removeFromParent(o2Var.getActionBar());
                    frameLayout2.addView(o2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.a;
                r0.z.c(frameLayout2);
                vg1Var.checkSystemBarColors();
                vg1Var.U();
                break;
        }
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        bg.u1 u1Var;
        switch (this.a) {
            case 0:
                return i10 == 0 ? ((c1) this.b).getContainerView() : ((g2) this.c).getContainerView();
            case 1:
                h5 h5Var = (h5) this.c;
                if (i10 == 0) {
                    h5.j1(h5Var, false);
                    m3 m3Var = h5Var.X;
                    if (m3Var != null) {
                        u1Var = m3Var.U;
                        AndroidUtilities.removeFromParent(u1Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.b);
                        frameLayout.addView(u1Var, f6.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        h5.j1(h5Var, true);
                        m3 m3Var2 = h5Var.Y;
                        if (m3Var2 != null) {
                            u1Var = m3Var2.U;
                        }
                    }
                    return null;
                }
                u1Var = h5Var.U;
                AndroidUtilities.removeFromParent(u1Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.addView(u1Var, f6.e(-1, -1, 119));
                return frameLayout2;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                frameLayout3.setOnClickListener(new t50(this, 24));
                return frameLayout3;
            case 3:
                return new x21((y21) this.c, (Context) this.b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new w21(this, 8));
                return frameLayout4;
            default:
                return new n31((Context) this.b, 8);
        }
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                h5 h5Var = (h5) this.c;
                return (h5Var.L1(true) ? 1 : 0) + (h5Var.L1(false) ? 1 : 0) + 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            default:
                ((vg1) this.c).getClass();
                return 4;
        }
    }

    @Override // org.telegram.ui.Components.q71
    public int h(int i10) {
        switch (this.a) {
            case 0:
                return i10;
            case 1:
                return (i10 - (((h5) this.c).L1(false) ? 1 : 0)) + 1;
            case 2:
            default:
                return super.h(i10);
            case 3:
                return i10 == 0 ? 0 : 1;
        }
    }

    public v(c1 c1Var, g2 g2Var) {
        this.a = 0;
        this.b = c1Var;
        this.c = g2Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}

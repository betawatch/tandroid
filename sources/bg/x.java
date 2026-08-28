package bg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import fh.x3;
import g7.e6;
import gh.k5;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.b81;
import org.telegram.ui.q50;
import org.telegram.ui.rg1;
import org.telegram.ui.tg1;
import org.telegram.ui.w21;
import org.telegram.ui.x21;
import org.telegram.ui.y21;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x extends e71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(Object obj, Context context, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        bh.g gVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                break;
            case 1:
                k5 k5Var = (k5) obj;
                if (i10 == 0) {
                    k5.j1(k5Var, false);
                    x3 x3Var = k5Var.X;
                    if (x3Var != null) {
                        gVar = x3Var.U;
                    }
                } else if (i10 == 2) {
                    k5.j1(k5Var, true);
                    x3 x3Var2 = k5Var.Y;
                    if (x3Var2 != null) {
                        gVar = x3Var2.U;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(gVar);
                frameLayout.addView(gVar);
                break;
            case 2:
                break;
            case 3:
                ((x21) view).a(i10);
                break;
            case 4:
                break;
            default:
                tg1 tg1Var = (tg1) obj;
                SparseArray sparseArray = tg1Var.a;
                rg1 rg1Var = (rg1) sparseArray.get(i9);
                if (rg1Var != null) {
                    o2Var = rg1Var.a;
                } else {
                    org.telegram.ui.ActionBar.o2 U = tg1Var.U(i9);
                    rg1 rg1Var2 = new rg1(U);
                    sparseArray.put(i9, rg1Var2);
                    o2Var = U;
                    rg1Var = rg1Var2;
                }
                if (!rg1Var.b) {
                    o2Var.onFragmentCreate();
                    rg1Var.b = true;
                }
                o2Var.setParentLayout(tg1Var.getParentLayout());
                if (o2Var.getFragmentView() == null) {
                    o2Var.performCreateView((Context) this.b);
                    o2Var.setTitleOverlayText(tg1Var.n, tg1Var.r, tg1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = o2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!o2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(f6.w0(null, f6.d6, false));
                }
                frameLayout2.addView(fragmentView, e6.c(-1.0f, -1));
                if (o2Var.getActionBar() != null && o2Var.getActionBar().G) {
                    AndroidUtilities.removeFromParent(o2Var.getActionBar());
                    frameLayout2.addView(o2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.a;
                r0.z.c(frameLayout2);
                tg1Var.checkSystemBarColors();
                tg1Var.T();
                break;
        }
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        bh.g gVar;
        switch (this.a) {
            case 0:
                return i9 == 0 ? ((h1) this.b).getContainerView() : ((q2) this.c).getContainerView();
            case 1:
                k5 k5Var = (k5) this.c;
                if (i9 == 0) {
                    k5.j1(k5Var, false);
                    x3 x3Var = k5Var.X;
                    if (x3Var != null) {
                        gVar = x3Var.U;
                        AndroidUtilities.removeFromParent(gVar);
                        FrameLayout frameLayout = new FrameLayout((Context) this.b);
                        frameLayout.addView(gVar, e6.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        k5.j1(k5Var, true);
                        x3 x3Var2 = k5Var.Y;
                        if (x3Var2 != null) {
                            gVar = x3Var2.U;
                        }
                    }
                    return null;
                }
                gVar = k5Var.U;
                AndroidUtilities.removeFromParent(gVar);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.addView(gVar, e6.e(-1, -1, 119));
                return frameLayout2;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                frameLayout3.setOnClickListener(new q50(this, 24));
                return frameLayout3;
            case 3:
                return new x21((y21) this.c, (Context) this.b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new w21(this, 8));
                return frameLayout4;
            default:
                return new b81((Context) this.b, 6);
        }
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                k5 k5Var = (k5) this.c;
                return (k5Var.L1(true) ? 1 : 0) + (k5Var.L1(false) ? 1 : 0) + 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            default:
                ((tg1) this.c).getClass();
                return 4;
        }
    }

    @Override // org.telegram.ui.Components.e71
    public int h(int i9) {
        switch (this.a) {
            case 0:
                return i9;
            case 1:
                return (i9 - (((k5) this.c).L1(false) ? 1 : 0)) + 1;
            case 2:
            default:
                return super.h(i9);
            case 3:
                return i9 == 0 ? 0 : 1;
        }
    }

    public x(h1 h1Var, q2 q2Var) {
        this.a = 0;
        this.b = h1Var;
        this.c = q2Var;
    }

    private final void i(View view, int i9, int i10) {
    }

    private final void j(View view, int i9, int i10) {
    }

    private final void k(View view, int i9, int i10) {
    }
}

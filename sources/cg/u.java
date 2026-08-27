package cg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import gh.s3;
import h7.z5;
import hh.i5;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g71;
import org.telegram.ui.qg1;
import org.telegram.ui.sg1;
import org.telegram.ui.u50;
import org.telegram.ui.v21;
import org.telegram.ui.w21;
import org.telegram.ui.x21;
import org.telegram.ui.z71;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u extends g71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        ag.w wVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                i5 i5Var = (i5) obj;
                if (i11 == 0) {
                    i5.j1(i5Var, false);
                    s3 s3Var = i5Var.X;
                    if (s3Var != null) {
                        wVar = s3Var.U;
                    }
                } else if (i11 == 2) {
                    i5.j1(i5Var, true);
                    s3 s3Var2 = i5Var.Y;
                    if (s3Var2 != null) {
                        wVar = s3Var2.U;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(wVar);
                frameLayout.addView(wVar);
                break;
            case 2:
                break;
            case 3:
                ((w21) view).a(i11);
                break;
            case 4:
                break;
            default:
                sg1 sg1Var = (sg1) obj;
                SparseArray sparseArray = sg1Var.a;
                qg1 qg1Var = (qg1) sparseArray.get(i10);
                if (qg1Var != null) {
                    n2Var = qg1Var.a;
                } else {
                    org.telegram.ui.ActionBar.n2 V = sg1Var.V(i10);
                    qg1 qg1Var2 = new qg1(V);
                    sparseArray.put(i10, qg1Var2);
                    n2Var = V;
                    qg1Var = qg1Var2;
                }
                if (!qg1Var.b) {
                    n2Var.onFragmentCreate();
                    qg1Var.b = true;
                }
                n2Var.setParentLayout(sg1Var.getParentLayout());
                if (n2Var.getFragmentView() == null) {
                    n2Var.performCreateView((Context) this.b);
                    n2Var.setTitleOverlayText(sg1Var.n, sg1Var.r, sg1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = n2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!n2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(g6.w0(null, g6.d6, false));
                }
                frameLayout2.addView(fragmentView, z5.c(-1.0f, -1));
                if (n2Var.getActionBar() != null && n2Var.getActionBar().G) {
                    AndroidUtilities.removeFromParent(n2Var.getActionBar());
                    frameLayout2.addView(n2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.a;
                r0.z.c(frameLayout2);
                sg1Var.checkSystemBarColors();
                sg1Var.U();
                break;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        ag.w wVar;
        switch (this.a) {
            case 0:
                return i10 == 0 ? ((d1) this.b).getContainerView() : ((i2) this.c).getContainerView();
            case 1:
                i5 i5Var = (i5) this.c;
                if (i10 == 0) {
                    i5.j1(i5Var, false);
                    s3 s3Var = i5Var.X;
                    if (s3Var != null) {
                        wVar = s3Var.U;
                        AndroidUtilities.removeFromParent(wVar);
                        FrameLayout frameLayout = new FrameLayout((Context) this.b);
                        frameLayout.addView(wVar, z5.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        i5.j1(i5Var, true);
                        s3 s3Var2 = i5Var.Y;
                        if (s3Var2 != null) {
                            wVar = s3Var2.U;
                        }
                    }
                    return null;
                }
                wVar = i5Var.U;
                AndroidUtilities.removeFromParent(wVar);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.addView(wVar, z5.e(-1, -1, 119));
                return frameLayout2;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                frameLayout3.setOnClickListener(new u50(this, 24));
                return frameLayout3;
            case 3:
                return new w21((x21) this.c, (Context) this.b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new v21(this, 8));
                return frameLayout4;
            default:
                return new z71((Context) this.b, 6);
        }
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                i5 i5Var = (i5) this.c;
                return (i5Var.L1(true) ? 1 : 0) + (i5Var.L1(false) ? 1 : 0) + 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            default:
                ((sg1) this.c).getClass();
                return 4;
        }
    }

    @Override // org.telegram.ui.Components.g71
    public int h(int i10) {
        switch (this.a) {
            case 0:
                return i10;
            case 1:
                return (i10 - (((i5) this.c).L1(false) ? 1 : 0)) + 1;
            case 2:
            default:
                return super.h(i10);
            case 3:
                return i10 == 0 ? 0 : 1;
        }
    }

    public u(d1 d1Var, i2 i2Var) {
        this.a = 0;
        this.b = d1Var;
        this.c = i2Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}

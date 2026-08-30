package gg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import k7.b6;
import kh.m3;
import lh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c81;
import org.telegram.ui.a51;
import org.telegram.ui.e60;
import org.telegram.ui.fh1;
import org.telegram.ui.hh1;
import org.telegram.ui.i31;
import org.telegram.ui.j31;
import org.telegram.ui.k31;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u extends c81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(Object obj, Context context, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        dg.s1 s1Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                break;
            case 1:
                g5 g5Var = (g5) obj;
                if (i11 == 0) {
                    g5.j1(g5Var, false);
                    m3 m3Var = g5Var.Y;
                    if (m3Var != null) {
                        s1Var = m3Var.V;
                    }
                } else if (i11 == 2) {
                    g5.j1(g5Var, true);
                    m3 m3Var2 = g5Var.Z;
                    if (m3Var2 != null) {
                        s1Var = m3Var2.V;
                    }
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                AndroidUtilities.removeFromParent(s1Var);
                frameLayout.addView(s1Var);
                break;
            case 2:
                break;
            case 3:
                ((j31) view).a(i11);
                break;
            case 4:
                break;
            default:
                hh1 hh1Var = (hh1) obj;
                SparseArray sparseArray = hh1Var.a;
                fh1 fh1Var = (fh1) sparseArray.get(i10);
                if (fh1Var != null) {
                    p2Var = fh1Var.a;
                } else {
                    org.telegram.ui.ActionBar.p2 V = hh1Var.V(i10);
                    fh1 fh1Var2 = new fh1(V);
                    sparseArray.put(i10, fh1Var2);
                    p2Var = V;
                    fh1Var = fh1Var2;
                }
                if (!fh1Var.b) {
                    p2Var.onFragmentCreate();
                    fh1Var.b = true;
                }
                p2Var.setParentLayout(hh1Var.getParentLayout());
                if (p2Var.getFragmentView() == null) {
                    p2Var.performCreateView((Context) this.b);
                    p2Var.setTitleOverlayText(hh1Var.n, hh1Var.r, hh1Var.s);
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                View fragmentView = p2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!p2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(j6.w0(null, j6.d6, false));
                }
                frameLayout2.addView(fragmentView, b6.c(-1.0f, -1));
                if (p2Var.getActionBar() != null && p2Var.getActionBar().H) {
                    AndroidUtilities.removeFromParent(p2Var.getActionBar());
                    frameLayout2.addView(p2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.j0.a;
                r0.z.c(frameLayout2);
                hh1Var.checkSystemBarColors();
                hh1Var.U();
                break;
        }
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        dg.s1 s1Var;
        switch (this.a) {
            case 0:
                return i10 == 0 ? ((b1) this.b).getContainerView() : ((f2) this.c).getContainerView();
            case 1:
                g5 g5Var = (g5) this.c;
                if (i10 == 0) {
                    g5.j1(g5Var, false);
                    m3 m3Var = g5Var.Y;
                    if (m3Var != null) {
                        s1Var = m3Var.V;
                        AndroidUtilities.removeFromParent(s1Var);
                        FrameLayout frameLayout = new FrameLayout((Context) this.b);
                        frameLayout.addView(s1Var, b6.e(-1, -1, 119));
                        return frameLayout;
                    }
                    return null;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        g5.j1(g5Var, true);
                        m3 m3Var2 = g5Var.Z;
                        if (m3Var2 != null) {
                            s1Var = m3Var2.V;
                        }
                    }
                    return null;
                }
                s1Var = g5Var.V;
                AndroidUtilities.removeFromParent(s1Var);
                FrameLayout frameLayout2 = new FrameLayout((Context) this.b);
                frameLayout2.addView(s1Var, b6.e(-1, -1, 119));
                return frameLayout2;
            case 2:
                FrameLayout frameLayout3 = new FrameLayout((Context) this.b);
                frameLayout3.setOnClickListener(new e60(this, 24));
                return frameLayout3;
            case 3:
                return new j31((k31) this.c, (Context) this.b);
            case 4:
                FrameLayout frameLayout4 = new FrameLayout((Context) this.b);
                frameLayout4.setOnClickListener(new i31(this, 8));
                return frameLayout4;
            default:
                return new a51((Context) this.b, 7);
        }
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                g5 g5Var = (g5) this.c;
                return (g5Var.L1(true) ? 1 : 0) + (g5Var.L1(false) ? 1 : 0) + 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 2;
            default:
                ((hh1) this.c).getClass();
                return 4;
        }
    }

    @Override // org.telegram.ui.Components.c81
    public int h(int i10) {
        switch (this.a) {
            case 0:
                return i10;
            case 1:
                return (i10 - (((g5) this.c).L1(false) ? 1 : 0)) + 1;
            case 2:
            default:
                return super.h(i10);
            case 3:
                return i10 == 0 ? 0 : 1;
        }
    }

    public u(b1 b1Var, f2 f2Var) {
        this.a = 0;
        this.b = b1Var;
        this.c = f2Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}

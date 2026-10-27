package fi;

import a8.ee;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.v91;
import org.telegram.ui.gk;
import org.telegram.ui.kd1;
import org.telegram.ui.np0;
import org.telegram.ui.tp0;
import org.telegram.ui.u21;
import org.telegram.ui.w21;
import org.telegram.ui.wn;
import org.telegram.ui.x21;
import org.telegram.ui.yj0;
import org.telegram.ui.zj0;
import org.telegram.ui.zv0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h1 extends v91 {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Object obj, Context context, int i10) {
        super(context, null);
        this.V = i10;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.v91
    public void A(int i10) {
        switch (this.V) {
            case 3:
                if (i10 == 0) {
                    wn wnVar = (wn) this.W;
                    if (wnVar.E1) {
                        wnVar.E1 = false;
                        wnVar.C1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v91
    public int H() {
        switch (this.V) {
            case 10:
                return 12;
            default:
                return super.H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.v91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.V) {
            case 1:
                n9 n9Var = (n9) this.W;
                View currentView = n9Var.b.getCurrentView();
                if (!(currentView instanceof g9)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    n9Var.g1();
                    return true;
                }
                g9 g9Var = (g9) currentView;
                ArrayList arrayList = g9Var.L;
                nm0 nm0Var = g9Var.f;
                if (g9Var.a == 0 && motionEvent != null && (E = nm0Var.E(motionEvent.getX(), motionEvent.getY() - g9Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    u8 u8Var = (u8) arrayList.get(R);
                    if (u8Var.a == 3 && !u8Var.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x9 = motionEvent.getX();
                        if (!z10 ? x9 > AndroidUtilities.dp(100.0f) : x9 < g9Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = u8Var.i;
                            if (i10 != -1) {
                                n9Var.M = i10;
                                if (i10 == 3) {
                                    if (!n9Var.n.isEmpty() && !n9Var.r.isEmpty()) {
                                        n9Var.N = i10;
                                    }
                                } else if (i10 != 4) {
                                    n9Var.N = i10;
                                } else if (!n9Var.d.isEmpty() && !n9Var.e.isEmpty()) {
                                    n9Var.N = i10;
                                }
                                g9Var.f(true);
                                g9Var.e(true);
                            }
                            if (i10 != -1) {
                                n9Var.g1();
                            }
                            return i10 == -1;
                        }
                    }
                }
                i10 = -1;
                if (i10 != -1) {
                }
                if (i10 != -1) {
                }
                if (i10 == -1) {
                }
                break;
            case 2:
            default:
                return super.i(motionEvent);
            case 3:
                gk gkVar = ((wn) this.W).B1;
                return gkVar != null && gkVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.v91
    public boolean j(MotionEvent motionEvent) {
        switch (this.V) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.v91
    public boolean k(MotionEvent motionEvent) {
        switch (this.V) {
            case 2:
                return false;
            case 7:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.v91, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.v91
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.V) {
            case 1:
                n9 n9Var = (n9) this.W;
                z10 = ((org.telegram.ui.ActionBar.k3) n9Var).keyboardVisible;
                if (z10) {
                    n9Var.g1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v91
    public void u() {
        switch (this.V) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((ii.j0) this.W).v.d.g3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v91
    public void v() {
        u21 u21Var;
        switch (this.V) {
            case 4:
                zj0.a0((zj0) this.W);
                break;
            case 7:
                if ((getCurrentView() instanceof w21) && (u21Var = ((w21) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(u21Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v91
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        switch (this.V) {
            case 0:
                l2 l2Var = (l2) this.W;
                h1 h1Var = l2Var.f;
                k2 k2Var = l2Var.h;
                if (k2Var != null) {
                    k2Var.F = h1Var.getPositionAnimated();
                    k2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.k3) l2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                l2.H = h1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.k3) ((n9) this.W)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.k3) ((ii.j0) this.W)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                wn wnVar = (wn) this.W;
                wnVar.j1.getClass();
                wnVar.j1.getClass();
                wnVar.u7();
                break;
            case 4:
                yj0 yj0Var = ((zj0) this.W).w;
                if (yj0Var != null) {
                    yj0Var.invalidate();
                    break;
                }
                break;
            case 5:
                tp0 tp0Var = (tp0) this.W;
                float positionAnimated = tp0Var.I.getPositionAnimated();
                tp0Var.M.setSelected(positionAnimated);
                tp0Var.e.setProgressToGradient(1.0f - ee.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                tp0Var.G0();
                np0 D0 = tp0Var.D0();
                d dVar = tp0Var.Q;
                if (dVar != null && D0 != null && D0 != tp0Var.R) {
                    tp0Var.R = D0;
                    m4.c cVar = D0.e;
                    dVar.i((CharSequence) cVar.b, true, true);
                    tp0Var.Q.g((SpannableStringBuilder) cVar.c, true);
                    break;
                }
                break;
            case 6:
                ((zv0) this.W).e();
                break;
            case 7:
                viewGroup4 = ((org.telegram.ui.ActionBar.k3) ((x21) this.W)).containerView;
                viewGroup4.invalidate();
                break;
            case 8:
                ((kd1) this.W).e();
                break;
            case 9:
                viewGroup5 = ((org.telegram.ui.ActionBar.k3) ((org.telegram.ui.Wallet.i2) this.W)).containerView;
                viewGroup5.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.W;
                m5Var.V0();
                org.telegram.ui.Wallet.t7 t7Var = m5Var.j0;
                if (t7Var != null && t7Var.h1) {
                    t7Var.f0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v91
    public void y(int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.V) {
            case 10:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.W;
                m5Var.e0 = i10;
                if (i10 != 1 && (n8Var = m5Var.i0) != null) {
                    n8Var.b(false);
                }
                if (i10 == 1) {
                    m5Var.p0.post(new org.telegram.ui.Wallet.o3(m5Var, 13));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.V = i10;
        this.W = r2Var;
    }
}

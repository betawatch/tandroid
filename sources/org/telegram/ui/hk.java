package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hk extends org.telegram.ui.Components.x71 {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk(Object obj, Context context, int i10) {
        super(context, null);
        this.V = i10;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.x71
    public void A(int i10) {
        switch (this.V) {
            case 0:
                if (i10 == 0) {
                    un unVar = (un) this.W;
                    if (unVar.G1) {
                        unVar.G1 = false;
                        unVar.E1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public int H() {
        switch (this.V) {
            case 6:
                return 12;
            default:
                return super.H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.x71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.V) {
            case 0:
                kk kkVar = ((un) this.W).D1;
                return kkVar != null && kkVar.b > 0.5f;
            case 8:
                vh.w6 w6Var = (vh.w6) this.W;
                View currentView = w6Var.i1.getCurrentView();
                if (!(currentView instanceof vh.r6)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    w6Var.M0();
                    return true;
                }
                vh.r6 r6Var = (vh.r6) currentView;
                ArrayList arrayList = r6Var.L;
                org.telegram.ui.Components.uk0 uk0Var = r6Var.f;
                if (r6Var.a == 0 && motionEvent != null && (E = uk0Var.E(motionEvent.getX(), motionEvent.getY() - r6Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    vh.g6 g6Var = (vh.g6) arrayList.get(R);
                    if (g6Var.a == 3 && !g6Var.n) {
                        boolean z10 = org.telegram.messenger.dd.X;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > org.telegram.messenger.i0.L(100.0f) : x10 < r6Var.getWidth() - org.telegram.messenger.i0.L(100.0f)) {
                            i10 = g6Var.i;
                            if (i10 != -1) {
                                w6Var.D1 = i10;
                                if (i10 == 3) {
                                    if (!w6Var.o1.isEmpty() && !w6Var.p1.isEmpty()) {
                                        w6Var.E1 = i10;
                                    }
                                } else if (i10 != 4) {
                                    w6Var.E1 = i10;
                                } else if (!w6Var.k1.isEmpty() && !w6Var.l1.isEmpty()) {
                                    w6Var.E1 = i10;
                                }
                                r6Var.g(true);
                                r6Var.f(true);
                            }
                            if (i10 != -1) {
                                w6Var.M0();
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
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.x71
    public boolean j(MotionEvent motionEvent) {
        switch (this.V) {
            case 9:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.x71
    public boolean k(MotionEvent motionEvent) {
        switch (this.V) {
            case 3:
                return false;
            case 9:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.x71, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void t(View view, View view2, int i10, int i11) {
        switch (this.V) {
            case 8:
                vh.w6 w6Var = (vh.w6) this.W;
                if (w6Var.d) {
                    w6Var.M0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void u() {
        switch (this.V) {
            case 9:
                if (getCurrentPosition() == 1) {
                    ((yh.z) this.W).r1.d.f3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void v() {
        yz0 yz0Var;
        switch (this.V) {
            case 3:
                if ((getCurrentView() instanceof a01) && (yz0Var = ((a01) getCurrentView()).n) != null) {
                    org.telegram.messenger.i0.v1(yz0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                un unVar = (un) this.W;
                unVar.l1.getClass();
                unVar.l1.getClass();
                unVar.x7();
                break;
            case 1:
                rn0 rn0Var = (rn0) this.W;
                float positionAnimated = rn0Var.I.getPositionAnimated();
                rn0Var.M.setSelected(positionAnimated);
                rn0Var.e.setProgressToGradient(1.0f - w7.u.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                rn0Var.K0();
                ln0 H0 = rn0Var.H0();
                vh.d dVar = rn0Var.Q;
                if (dVar != null && H0 != null && H0 != rn0Var.R) {
                    rn0Var.R = H0;
                    m5.e eVar = H0.e;
                    dVar.i((CharSequence) eVar.b, true, true);
                    rn0Var.Q.g((SpannableStringBuilder) eVar.c, true);
                    break;
                }
                break;
            case 2:
                ((jt0) this.W).e();
                break;
            case 3:
                ((b01) this.W).b.invalidate();
                break;
            case 4:
                ((v91) this.W).e();
                break;
            case 5:
                ((org.telegram.ui.Wallet.z2) this.W).b.invalidate();
                break;
            case 6:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.W;
                b6Var.Z0();
                org.telegram.ui.Wallet.h8 h8Var = b6Var.j0;
                if (h8Var != null && h8Var.h1) {
                    h8Var.f0();
                    break;
                }
                break;
            case 7:
                vh.u1 u1Var = (vh.u1) this.W;
                hk hkVar = u1Var.m1;
                vh.t1 t1Var = u1Var.n1;
                if (t1Var != null) {
                    t1Var.F = hkVar.getPositionAnimated();
                    t1Var.invalidate();
                }
                u1Var.b.invalidate();
                invalidate();
                vh.u1.y1 = hkVar.getCurrentPosition();
                break;
            case 8:
                ((vh.w6) this.W).b.invalidate();
                break;
            default:
                ((yh.z) this.W).b.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void y(int i10) {
        org.telegram.ui.Wallet.y8 y8Var;
        switch (this.V) {
            case 6:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) this.W;
                b6Var.e0 = i10;
                if (i10 != 1 && (y8Var = b6Var.i0) != null) {
                    y8Var.b(false);
                }
                if (i10 == 1) {
                    b6Var.p0.post(new org.telegram.ui.Wallet.f4(b6Var, 13));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hk(org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.V = i10;
        this.W = k2Var;
    }
}

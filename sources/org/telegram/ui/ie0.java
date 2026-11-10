package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;

    public /* synthetic */ ie0(me0 me0Var, int i7) {
        this.a = i7;
        this.b = me0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ri.f fVar;
        qh.b[] bVarArr;
        int i7 = this.a;
        me0 me0Var = this.b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = me0Var.S) != null) {
                    fVar.c.d = 0L;
                    me0Var.T.c.d = 0L;
                    me0Var.i0();
                    break;
                }
                break;
            case 1:
                me0.g0(me0Var);
                break;
            case 2:
                me0Var.getClass();
                i9.l0(me0Var);
                break;
            case 3:
                me0.h0(me0Var);
                break;
            case 4:
                me0.f0(me0Var);
                break;
            case 5:
                org.telegram.messenger.g0.E2(me0Var.P);
                break;
            case 6:
                me0Var.getClass();
                new dh0(me0Var.getParentActivity(), me0Var).show();
                break;
            case 7:
                me0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                me0Var.presentFragment(new i9(bundle));
                break;
            default:
                if (me0Var.getParentActivity() != null && (bVarArr = me0Var.K) != null) {
                    float width = ((r0.getWidth() / 2.0f) + (me0Var.b.getWidth() - ((bVarArr[4].getX() + me0Var.F.getX()) + r0.getWidth()))) / org.telegram.messenger.g0.p;
                    fi.m3 m3Var = new fi.m3(me0Var.getParentActivity(), 3);
                    me0Var.P = m3Var;
                    m3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-me0Var.L));
                    me0Var.P.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    me0Var.P.r(false);
                    me0Var.P.k(true);
                    me0Var.P.u(org.telegram.messenger.id.M0(2131744301, null));
                    me0Var.P.o(1.0f, (-width) + 7.33f);
                    me0Var.b.addView(me0Var.P, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    fi.m3 m3Var2 = me0Var.P;
                    m3Var2.q0 = new ie0(me0Var, 5);
                    m3Var2.d = 8000L;
                    m3Var2.w();
                    org.telegram.ui.Components.z20.r.b();
                    break;
                }
                break;
        }
    }
}

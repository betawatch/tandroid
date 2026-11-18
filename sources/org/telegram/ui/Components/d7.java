package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;
    public final /* synthetic */ y60 c;
    public final /* synthetic */ org.telegram.messenger.fj d;

    public /* synthetic */ d7(g8 g8Var, org.telegram.messenger.fj fjVar, y60 y60Var, int i7) {
        this.a = i7;
        this.b = g8Var;
        this.d = fjVar;
        this.c = y60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList i7;
        TLRPC.TL_document tL_document;
        int i10 = this.a;
        y60 y60Var = this.c;
        org.telegram.messenger.fj fjVar = this.d;
        g8 g8Var = this.b;
        switch (i10) {
            case 0:
                g8Var.getClass();
                y60Var.v();
                g8Var.N0(fjVar);
                break;
            case 1:
                g8Var.getClass();
                y60Var.v();
                g8Var.W0(fjVar);
                break;
            case 2:
                g8Var.S0(fjVar, false, new d7(g8Var, fjVar, y60Var, 5), false);
                break;
            case 3:
                g8Var.getClass();
                y60Var.v();
                g8Var.N0(fjVar);
                break;
            case 4:
                g8Var.getClass();
                y60Var.v();
                g8Var.W0(fjVar);
                break;
            case 5:
                org.telegram.messenger.gp gpVar = g8Var.q2;
                TLRPC.Document a10 = gpVar.a();
                gpVar.c.remove(fjVar);
                if (gpVar.a() != a10) {
                    gpVar.e();
                }
                g8Var.r2.remove(fjVar);
                g8Var.u1.f();
                y60Var.v();
                g8Var.V0(false);
                org.telegram.messenger.f3.n(null, 2131753909, new lc((FrameLayout) g8Var.b, g8Var.J0), R.raw.ic_delete, 36);
                break;
            case 6:
                g8Var.S0(fjVar, true, new e7(g8Var, y60Var, 4), false);
                break;
            case 7:
                long e10 = org.telegram.messenger.j10.i(g8Var.a).e();
                int i11 = org.telegram.messenger.j10.t0;
                int i12 = g8Var.a;
                if (i11 != i12) {
                    g8Var.A2.O0(i12);
                }
                if (fjVar.e1() < 0) {
                    if (fjVar.F0() instanceof TLRPC.TL_document) {
                        tL_document = (TLRPC.TL_document) fjVar.F0();
                        i7 = null;
                    }
                    y60Var.v();
                    org.telegram.messenger.f3.n(null, 2131753907, new lc((FrameLayout) g8Var.b, g8Var.J0), R.raw.saved_messages, 36);
                    break;
                } else {
                    i7 = org.telegram.messenger.f3.i(fjVar);
                    tL_document = null;
                }
                if (i7 != null) {
                    org.telegram.messenger.zy.C(g8Var.a).q0(i7, e10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                } else {
                    org.telegram.messenger.zy C = org.telegram.messenger.zy.C(g8Var.a);
                    org.telegram.messenger.xy e11 = org.telegram.messenger.xy.e(tL_document, null, fjVar.k.attachPath, e10, null, null, null, null, null, true, 0, 0, 0, g8Var.q2, false);
                    e10 = e10;
                    C.r0(e11);
                }
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    lc.b0(Q).Q(R.raw.forward, 36, e10 == org.telegram.messenger.j10.i(g8Var.a).e() ? org.telegram.messenger.gd.M0(2131750482, null) : e10 > 0 ? org.telegram.messenger.gd.a0(null, null, 2131750481, org.telegram.messenger.n5.t(e10)) : org.telegram.messenger.gd.a0(null, null, 2131750486, org.telegram.messenger.n5.t(e10))).j();
                }
                y60Var.v();
                org.telegram.messenger.f3.n(null, 2131753907, new lc((FrameLayout) g8Var.b, g8Var.J0), R.raw.saved_messages, 36);
            default:
                g8Var.R0(fjVar);
                y60Var.v();
                break;
        }
    }

    public /* synthetic */ d7(g8 g8Var, y60 y60Var, org.telegram.messenger.fj fjVar, int i7) {
        this.a = i7;
        this.b = g8Var;
        this.c = y60Var;
        this.d = fjVar;
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ts0 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ sk0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts0(sk0 sk0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(0, context, p6Var);
        this.l0 = i10;
        this.m0 = sk0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d(org.telegram.messenger.jj jjVar) {
        switch (this.l0) {
            case 0:
                us0 us0Var = (us0) this.m0;
                if (!org.telegram.messenger.jj.R4(jjVar.k) && !jjVar.h4()) {
                    if (jjVar.I3()) {
                        return MediaController.B().o0(us0Var.d, jjVar, us0Var.w.e1, true, null);
                    }
                    return false;
                }
                boolean S = MediaController.B().S(jjVar);
                MediaController.B().r0(S ? us0Var.d : null, false);
                if (jjVar.h4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                mt0 mt0Var = (mt0) this.m0;
                int i10 = mt0Var.d;
                zt0 zt0Var = mt0Var.f;
                if (org.telegram.messenger.jj.R4(jjVar.k) || jjVar.h4()) {
                    boolean S2 = MediaController.B().S(jjVar);
                    MediaController.B().r0(S2 ? zt0Var.v1[i10].a : null, false);
                    return S2;
                }
                if (jjVar.I3()) {
                    return MediaController.B().o0(zt0Var.v1[i10].a, jjVar, zt0Var.e1, true, null);
                }
                return false;
            default:
                org.telegram.ui.z00 z00Var = ((org.telegram.ui.u00) this.m0).w;
                if (org.telegram.messenger.jj.R4(jjVar.k) || jjVar.h4()) {
                    boolean S3 = MediaController.B().S(jjVar);
                    MediaController.B().r0(S3 ? z00Var.f : null, false);
                    return S3;
                }
                if (!jjVar.I3()) {
                    return false;
                }
                String str = z00Var.Q;
                long j10 = z00Var.E;
                long j11 = z00Var.H;
                e2.a0 a0Var = new e2.a0(str, j10, j11, j11, z00Var.D);
                a0Var.e = z00Var.N;
                a0Var.f = z00Var.w;
                a0Var.d = z00Var.O;
                a0Var.g = z00Var.J ? 1 : 0;
                return MediaController.B().o0(z00Var.f, jjVar, 0L, true, a0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(org.telegram.ui.u00 u00Var, Context context) {
        super(1, context, null);
        this.l0 = 2;
        this.m0 = u00Var;
    }
}

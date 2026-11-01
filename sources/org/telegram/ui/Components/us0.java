package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class us0 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ tk0 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us0(tk0 tk0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(0, context, p6Var);
        this.l0 = i10;
        this.m0 = tk0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d(org.telegram.messenger.kj kjVar) {
        switch (this.l0) {
            case 0:
                vs0 vs0Var = (vs0) this.m0;
                if (!org.telegram.messenger.kj.R4(kjVar.k) && !kjVar.h4()) {
                    if (kjVar.I3()) {
                        return MediaController.B().o0(vs0Var.d, kjVar, vs0Var.w.e1, true, null);
                    }
                    return false;
                }
                boolean S = MediaController.B().S(kjVar);
                MediaController.B().r0(S ? vs0Var.d : null, false);
                if (kjVar.h4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                nt0 nt0Var = (nt0) this.m0;
                int i10 = nt0Var.d;
                au0 au0Var = nt0Var.f;
                if (org.telegram.messenger.kj.R4(kjVar.k) || kjVar.h4()) {
                    boolean S2 = MediaController.B().S(kjVar);
                    MediaController.B().r0(S2 ? au0Var.v1[i10].a : null, false);
                    return S2;
                }
                if (kjVar.I3()) {
                    return MediaController.B().o0(au0Var.v1[i10].a, kjVar, au0Var.e1, true, null);
                }
                return false;
            default:
                org.telegram.ui.y00 y00Var = ((org.telegram.ui.t00) this.m0).w;
                if (org.telegram.messenger.kj.R4(kjVar.k) || kjVar.h4()) {
                    boolean S3 = MediaController.B().S(kjVar);
                    MediaController.B().r0(S3 ? y00Var.f : null, false);
                    return S3;
                }
                if (!kjVar.I3()) {
                    return false;
                }
                String str = y00Var.Q;
                long j10 = y00Var.E;
                long j11 = y00Var.H;
                e2.a0 a0Var = new e2.a0(str, j10, j11, j11, y00Var.D);
                a0Var.e = y00Var.N;
                a0Var.f = y00Var.w;
                a0Var.d = y00Var.O;
                a0Var.g = y00Var.J ? 1 : 0;
                return MediaController.B().o0(y00Var.f, kjVar, 0L, true, a0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(org.telegram.ui.t00 t00Var, Context context) {
        super(1, context, null);
        this.l0 = 2;
        this.m0 = t00Var;
    }
}

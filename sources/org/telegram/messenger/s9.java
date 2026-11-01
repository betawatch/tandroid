package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ze0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class s9 implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s9(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.s2) this.d).a(((y9) this.c).b(this.b), (TLRPC.TL_error) obj2);
                break;
            case 1:
                wp wpVar = (wp) this.c;
                yh.b0 b0Var = (yh.b0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    wpVar.T2(0, this.b, true);
                }
                b0Var.a(bool, tL_error);
                break;
            case 2:
                wp wpVar2 = (wp) this.c;
                yh.b0 b0Var2 = (yh.b0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    wpVar2.T2(0, this.b, true);
                }
                b0Var2.a(bool2, tL_error2);
                break;
            default:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                ze0 ze0Var = (ze0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                x1Var.dismiss();
                long j10 = this.b;
                if (tL_error3 == null) {
                    ze0Var.a(Long.valueOf(j10), auth_authorization, null);
                    break;
                } else {
                    ze0Var.a(Long.valueOf(j10), null, tL_error3.text);
                    break;
                }
        }
    }

    public /* synthetic */ s9(wp wpVar, long j10, k20 k20Var, int i10) {
        this.a = i10;
        this.c = wpVar;
        this.b = j10;
        this.d = k20Var;
    }
}

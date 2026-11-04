package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qd0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k9 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k9(Object obj, Object obj2, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((ai.f0) this.d).a(((q9) this.c).b(this.b), (TLRPC.TL_error) obj2);
                break;
            case 1:
                hp hpVar = (hp) this.c;
                ji.g0 g0Var = (ji.g0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    hpVar.V2(0, this.b, true);
                }
                g0Var.a(bool, tL_error);
                break;
            case 2:
                hp hpVar2 = (hp) this.c;
                ji.g0 g0Var2 = (ji.g0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    hpVar2.V2(0, this.b, true);
                }
                g0Var2.a(bool2, tL_error2);
                break;
            default:
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.c;
                qd0 qd0Var = (qd0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                s1Var.dismiss();
                long j10 = this.b;
                if (tL_error3 == null) {
                    qd0Var.a(Long.valueOf(j10), auth_authorization, null);
                    break;
                } else {
                    qd0Var.a(Long.valueOf(j10), null, tL_error3.text);
                    break;
                }
        }
    }

    public /* synthetic */ k9(hp hpVar, long j10, n10 n10Var, int i3) {
        this.a = i3;
        this.c = hpVar;
        this.b = j10;
        this.d = n10Var;
    }
}

package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vd0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o9 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o9(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((bi.z) this.d).a(((u9) this.c).b(this.b), (TLRPC.TL_error) obj2);
                break;
            case 1:
                mp mpVar = (mp) this.c;
                li.i0 i0Var = (li.i0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    mpVar.b3(0, this.b, true);
                }
                i0Var.a(bool, tL_error);
                break;
            case 2:
                mp mpVar2 = (mp) this.c;
                li.i0 i0Var2 = (li.i0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    mpVar2.b3(0, this.b, true);
                }
                i0Var2.a(bool2, tL_error2);
                break;
            default:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                vd0 vd0Var = (vd0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                u1Var.dismiss();
                long j3 = this.b;
                if (tL_error3 == null) {
                    vd0Var.a(Long.valueOf(j3), auth_authorization, null);
                    break;
                } else {
                    vd0Var.a(Long.valueOf(j3), null, tL_error3.text);
                    break;
                }
        }
    }

    public /* synthetic */ o9(mp mpVar, long j3, q10 q10Var, int i7) {
        this.a = i7;
        this.c = mpVar;
        this.b = j3;
        this.d = q10Var;
    }
}

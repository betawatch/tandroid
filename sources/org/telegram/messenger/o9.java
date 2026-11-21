package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ud0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                ud0 ud0Var = (ud0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                t1Var.dismiss();
                long j3 = this.b;
                if (tL_error3 == null) {
                    ud0Var.a(Long.valueOf(j3), auth_authorization, null);
                    break;
                } else {
                    ud0Var.a(Long.valueOf(j3), null, tL_error3.text);
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

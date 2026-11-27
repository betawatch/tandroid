// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k65 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fn7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ k65(j95 j95Var, long j, id[] idVarArr, TLRPC.User user, boolean z, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = j95Var;
        this.b = j;
        this.e = idVarArr;
        this.f = user;
        this.c = z;
        this.g = invitetogroupcall;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        TLObject tLObject2 = this.g;
        Object obj = this.f;
        Object obj2 = this.e;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                j95 j95Var = (j95) fn7Var;
                id[] idVarArr = (id[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) tLObject2;
                long j = this.b;
                if (tLObject == null) {
                    hl.c3(new us0(j95Var, idVarArr, this.c, tL_error, j, invitetogroupcall));
                    break;
                } else {
                    uc7.s1(j95Var.n1.a).Y3((TLRPC.Updates) tLObject, false);
                    hl.c3(new ba7((Object) j95Var, j, (Object) idVarArr, (Object) user, (byte) 11));
                    break;
                }
            default:
                uc7 uc7Var = (uc7) fn7Var;
                z21 z21Var = (z21) obj2;
                e eVar = (e) obj;
                TLRPC.TL_channels_editBanned tL_channels_editBanned = (TLRPC.TL_channels_editBanned) tLObject2;
                if (tL_error != null) {
                    hl.c3(new va7((Object) uc7Var, (Object) tL_error, (Object) eVar, (Object) tL_channels_editBanned, this.c, (byte) 0));
                    break;
                } else {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    hl.d3(new t77(uc7Var, this.b, (byte) 17), 1000L);
                    if (z21Var != null) {
                        hl.c3(z21Var);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ k65(uc7 uc7Var, long j, z21 z21Var, e eVar, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z) {
        this.d = uc7Var;
        this.b = j;
        this.e = z21Var;
        this.f = eVar;
        this.g = tL_channels_editBanned;
        this.c = z;
    }
}

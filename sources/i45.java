// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i45 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gk7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ i45(h75 h75Var, long j, hd[] hdVarArr, TLRPC.User user, boolean z, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = h75Var;
        this.b = j;
        this.e = hdVarArr;
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
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                h75 h75Var = (h75) gk7Var;
                hd[] hdVarArr = (hd[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) tLObject2;
                long j = this.b;
                if (tLObject == null) {
                    gl.d3(new ms0(h75Var, hdVarArr, this.c, tL_error, j, invitetogroupcall));
                    break;
                } else {
                    na7.q1(h75Var.n1.a).Q3((TLRPC.Updates) tLObject, false);
                    gl.d3(new m77((Object) h75Var, j, (Object) hdVarArr, (Object) user, (byte) 11));
                    break;
                }
            default:
                na7 na7Var = (na7) gk7Var;
                q21 q21Var = (q21) obj2;
                d dVar = (d) obj;
                TLRPC.TL_channels_editBanned tL_channels_editBanned = (TLRPC.TL_channels_editBanned) tLObject2;
                if (tL_error != null) {
                    gl.d3(new z77((Object) na7Var, (Object) tL_error, (Object) dVar, (Object) tL_channels_editBanned, this.c, (byte) 0));
                    break;
                } else {
                    na7Var.Q3((TLRPC.Updates) tLObject, false);
                    gl.e3(new r57(na7Var, this.b, (byte) 15), 1000L);
                    if (q21Var != null) {
                        gl.d3(q21Var);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ i45(na7 na7Var, long j, q21 q21Var, d dVar, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z) {
        this.d = na7Var;
        this.b = j;
        this.e = q21Var;
        this.f = dVar;
        this.g = tL_channels_editBanned;
        this.c = z;
    }
}

// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class g65 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jm7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ g65(g95 g95Var, long j, he[] heVarArr, TLRPC.User user, boolean z, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = g95Var;
        this.b = j;
        this.e = heVarArr;
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
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                g95 g95Var = (g95) jm7Var;
                he[] heVarArr = (he[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) tLObject2;
                long j = this.b;
                if (tLObject == null) {
                    gm.c3(new ut0(g95Var, heVarArr, this.c, tL_error, j, invitetogroupcall));
                    break;
                } else {
                    oc7.r1(g95Var.n1.a).T3((TLRPC.Updates) tLObject, false);
                    gm.c3(new p97((Object) g95Var, j, (Object) heVarArr, (Object) user, (byte) 11));
                    break;
                }
            default:
                oc7 oc7Var = (oc7) jm7Var;
                y31 y31Var = (y31) obj2;
                d dVar = (d) obj;
                TLRPC.TL_channels_editBanned tL_channels_editBanned = (TLRPC.TL_channels_editBanned) tLObject2;
                if (tL_error != null) {
                    gm.c3(new aa7((Object) oc7Var, (Object) tL_error, (Object) dVar, (Object) tL_channels_editBanned, this.c, (byte) 0));
                    break;
                } else {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    gm.d3(new r77(oc7Var, this.b, (byte) 16), 1000L);
                    if (y31Var != null) {
                        gm.c3(y31Var);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g65(oc7 oc7Var, long j, y31 y31Var, d dVar, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z) {
        this.d = oc7Var;
        this.b = j;
        this.e = y31Var;
        this.f = dVar;
        this.g = tL_channels_editBanned;
        this.c = z;
    }
}

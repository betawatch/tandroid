// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fv4 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fv4(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        TLRPC.Updates updates = null;
        long j = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((yh) obj3).a(((lv4) obj4).b(j), (TLRPC.TL_error) obj2);
                break;
            case 1:
                ew5 ew5Var = (ew5) obj4;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    oc7.r1(ew5Var.a).T3(updates, false);
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    gm.c3(new zv5(ew5Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.b, (byte) 1));
                }
                gm.c3(new d65(ew5Var, tL_error, updates, tL_messages_importChatInvite, (byte) 8));
                break;
            case 2:
                oc7 oc7Var = (oc7) obj4;
                up2 up2Var = (up2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    oc7Var.a3(0, j, true);
                }
                up2Var.a(bool, tL_error2);
                break;
            case 3:
                oc7 oc7Var2 = (oc7) obj4;
                up2 up2Var2 = (up2) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    oc7Var2.a3(0, j, true);
                }
                up2Var2.a(bool2, tL_error3);
                break;
            case 4:
                fh6 fh6Var = (fh6) obj3;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                ((he) obj4).dismiss();
                if (tL_error4 == null) {
                    fh6Var.a(Long.valueOf(j), auth_authorization, null);
                    break;
                } else {
                    fh6Var.a(Long.valueOf(j), null, tL_error4.text);
                    break;
                }
            case 5:
                yb9 yb9Var = (yb9) obj4;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                yra yraVar = (yra) obj;
                k11 k11Var = (k11) obj2;
                k11Var.d();
                jva.u(yb9Var.a, yraVar.a).f(yraVar.b, tL_starGiftUnique, this.b, null, true, new p((Object) yb9Var, (Object) k11Var, (Object) tL_starGiftUnique, (byte) 24));
                break;
            default:
                ((zwa) obj4).Y0((c6c) obj3, this.b, (Boolean) obj, (String) obj2);
                break;
        }
    }

    public /* synthetic */ fv4(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}

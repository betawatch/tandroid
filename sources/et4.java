// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class et4 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ et4(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        TLRPC.Updates updates = null;
        long j = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((yg) obj3).a(((kt4) obj4).b(j), (TLRPC.TL_error) obj2);
                break;
            case 1:
                fu5 fu5Var = (fu5) obj4;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    na7.q1(fu5Var.a).Q3(updates, false);
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    gl.d3(new au5(fu5Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.b, (byte) 1));
                }
                gl.d3(new e45(fu5Var, tL_error, updates, tL_messages_importChatInvite, (byte) 8));
                break;
            case 2:
                na7 na7Var = (na7) obj4;
                jo2 jo2Var = (jo2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    na7Var.X2(0, j, true);
                }
                jo2Var.a(bool, tL_error2);
                break;
            case 3:
                na7 na7Var2 = (na7) obj4;
                jo2 jo2Var2 = (jo2) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    na7Var2.X2(0, j, true);
                }
                jo2Var2.a(bool2, tL_error3);
                break;
            case 4:
                ef6 ef6Var = (ef6) obj3;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                ((hd) obj4).dismiss();
                if (tL_error4 == null) {
                    ef6Var.a(Long.valueOf(j), auth_authorization, null);
                    break;
                } else {
                    ef6Var.a(Long.valueOf(j), null, tL_error4.text);
                    break;
                }
            case 5:
                y99 y99Var = (y99) obj4;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                ypa ypaVar = (ypa) obj;
                c01 c01Var = (c01) obj2;
                c01Var.d();
                gta.u(y99Var.a, ypaVar.a).f(ypaVar.b, tL_starGiftUnique, this.b, null, true, new p((Object) y99Var, (Object) c01Var, (Object) tL_starGiftUnique, (byte) 24));
                break;
            default:
                ((vua) obj4).Y0((c4c) obj3, this.b, (Boolean) obj, (String) obj2);
                break;
        }
    }

    public /* synthetic */ et4(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}

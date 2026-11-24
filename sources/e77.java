// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e77 implements p8c {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Runnable g;

    public /* synthetic */ e77(na7 na7Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, TLRPC.Chat chat, pc7 pc7Var) {
        this.b = na7Var;
        this.d = tL_messages_invitedUsers;
        this.e = iArr;
        this.c = i;
        this.f = chat;
        this.g = pc7Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        Runnable runnable = this.g;
        TLObject tLObject = this.f;
        int i = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj3;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                d77 d77Var = (d77) runnable;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo != null) {
                        d77Var.run();
                        break;
                    } else {
                        TLRPC.UserFull W1 = na7Var.W1(user.id);
                        if (W1 != null) {
                            botInfoArr[0] = W1.bot_info;
                            d77Var.run();
                            break;
                        } else if (!zArr[0]) {
                            na7Var.Y2(user, i, true, new ht(zArr, botInfoArr, d77Var, (byte) 28));
                            break;
                        }
                    }
                }
                break;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                pc7 pc7Var = (pc7) runnable;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                na7Var.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i2 = iArr[0] + 1;
                iArr[0] = i2;
                if (i2 >= i) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        gl.d3(new nn6((Object) na7Var, (Object) chat, (Object) tL_messages_invitedUsers, (byte) 2));
                    }
                    if (pc7Var != null) {
                        pc7Var.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e77(na7 na7Var, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i, d77 d77Var) {
        this.b = na7Var;
        this.d = zArr;
        this.e = botInfoArr;
        this.f = user;
        this.c = i;
        this.g = d77Var;
    }
}

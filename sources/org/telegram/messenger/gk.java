package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class gk implements x10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ mp b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gk(mp mpVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, TLRPC.Chat chat, Runnable runnable) {
        this.b = mpVar;
        this.e = tL_messages_invitedUsers;
        this.f = iArr;
        this.d = i7;
        this.g = chat;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.c;
        Object obj3 = this.g;
        int i10 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        mp mpVar = this.b;
        switch (i7) {
            case 0:
                vf.b bVar = (vf.b) obj5;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj4;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Long l10 = (Long) obj;
                try {
                    if (bVar != null) {
                        bVar.b();
                    } else {
                        u1VarArr[0].dismiss();
                    }
                } catch (Exception unused) {
                }
                u1VarArr[0] = null;
                h2Var.setVisibleDialog(null);
                if (!zArr[0]) {
                    if (l10 != null) {
                        if (l10.longValue() >= 0) {
                            mpVar.G3(mpVar.c2(l10), null, h2Var, i10);
                            break;
                        } else {
                            mpVar.G3(null, mpVar.O0(Long.valueOf(-l10.longValue())), h2Var, 1);
                            break;
                        }
                    } else if (h2Var.getParentActivity() != null) {
                        try {
                            if (h2Var instanceof org.telegram.ui.bn) {
                                ((org.telegram.ui.bn) h2Var).Xb();
                            }
                            org.telegram.ui.Components.lc.b0(h2Var).t(gd.M0(2131747942, null), null).j();
                            break;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            return;
                        }
                    }
                }
                break;
            case 1:
                boolean[] zArr2 = (boolean[]) obj2;
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) obj5;
                TLRPC.User user = (TLRPC.User) obj4;
                ql qlVar = (ql) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr2[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo != null) {
                        qlVar.run();
                        break;
                    } else {
                        TLRPC.UserFull d2 = mpVar.d2(user.id);
                        if (d2 != null) {
                            botInfoArr[0] = d2.bot_info;
                            qlVar.run();
                            break;
                        } else if (!zArr2[0]) {
                            mpVar.c3(user, i10, true, new e3(zArr2, botInfoArr, qlVar, 5));
                            break;
                        }
                    }
                }
                break;
            default:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj5;
                int[] iArr = (int[]) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                Runnable runnable = (Runnable) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                mpVar.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                if (i11 >= i10) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        g0.g3(new yf(mpVar, chat, tL_messages_invitedUsers, 2));
                    }
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ gk(mp mpVar, vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, org.telegram.ui.ActionBar.h2 h2Var, boolean[] zArr, int i7) {
        this.b = mpVar;
        this.e = bVar;
        this.f = u1VarArr;
        this.g = h2Var;
        this.c = zArr;
        this.d = i7;
    }

    public /* synthetic */ gk(mp mpVar, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i7, ql qlVar) {
        this.b = mpVar;
        this.c = zArr;
        this.e = botInfoArr;
        this.f = user;
        this.d = i7;
        this.g = qlVar;
    }
}

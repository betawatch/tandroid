package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class hk implements z10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ np b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hk(np npVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i7, TLRPC.Chat chat, Runnable runnable) {
        this.b = npVar;
        this.e = tL_messages_invitedUsers;
        this.f = iArr;
        this.d = i7;
        this.g = chat;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.c;
        Object obj3 = this.g;
        int i10 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        np npVar = this.b;
        switch (i7) {
            case 0:
                vf.b bVar = (vf.b) obj5;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Long l10 = (Long) obj;
                try {
                    if (bVar != null) {
                        bVar.b();
                    } else {
                        t1VarArr[0].dismiss();
                    }
                } catch (Exception unused) {
                }
                t1VarArr[0] = null;
                e2Var.setVisibleDialog(null);
                if (!zArr[0]) {
                    if (l10 != null) {
                        if (l10.longValue() >= 0) {
                            npVar.z3(npVar.a2(l10), null, e2Var, i10);
                            break;
                        } else {
                            npVar.z3(null, npVar.M0(Long.valueOf(-l10.longValue())), e2Var, 1);
                            break;
                        }
                    } else if (e2Var.getParentActivity() != null) {
                        try {
                            if (e2Var instanceof org.telegram.ui.an) {
                                ((org.telegram.ui.an) e2Var).Xb();
                            }
                            org.telegram.ui.Components.cc.a0(e2Var).t(hd.M0(2131748134, null), null).j();
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
                tl tlVar = (tl) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr2[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo != null) {
                        tlVar.run();
                        break;
                    } else {
                        TLRPC.UserFull b22 = npVar.b2(user.id);
                        if (b22 != null) {
                            botInfoArr[0] = b22.bot_info;
                            tlVar.run();
                            break;
                        } else if (!zArr2[0]) {
                            npVar.W2(user, i10, true, new d3(zArr2, botInfoArr, tlVar, 5));
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
                npVar.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                if (i11 >= i10) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        g0.h3(new mg(npVar, chat, tL_messages_invitedUsers, 2));
                    }
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ hk(np npVar, vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, int i7) {
        this.b = npVar;
        this.e = bVar;
        this.f = t1VarArr;
        this.g = e2Var;
        this.c = zArr;
        this.d = i7;
    }

    public /* synthetic */ hk(np npVar, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i7, tl tlVar) {
        this.b = npVar;
        this.c = zArr;
        this.e = botInfoArr;
        this.f = user;
        this.d = i7;
        this.g = tlVar;
    }
}

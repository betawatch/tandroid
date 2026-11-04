package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ak implements u10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ hp b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ak(hp hpVar, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i3, TLRPC.Chat chat, Runnable runnable) {
        this.b = hpVar;
        this.e = tL_messages_invitedUsers;
        this.f = iArr;
        this.d = i3;
        this.g = chat;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        Object obj2 = this.c;
        Object obj3 = this.g;
        int i10 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                sf.b bVar = (sf.b) obj5;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Long l10 = (Long) obj;
                try {
                    if (bVar != null) {
                        bVar.b();
                    } else {
                        s1VarArr[0].dismiss();
                    }
                } catch (Exception unused) {
                }
                s1VarArr[0] = null;
                d2Var.setVisibleDialog(null);
                if (!zArr[0]) {
                    if (l10 != null) {
                        if (l10.longValue() >= 0) {
                            hpVar.z3(hpVar.a2(l10), null, d2Var, i10);
                            break;
                        } else {
                            hpVar.z3(null, hpVar.M0(Long.valueOf(-l10.longValue())), d2Var, 1);
                            break;
                        }
                    } else if (d2Var.getParentActivity() != null) {
                        try {
                            if (d2Var instanceof org.telegram.ui.wm) {
                                ((org.telegram.ui.wm) d2Var).Tb();
                            }
                            org.telegram.ui.Components.fc.a0(d2Var).t(bd.M0(2131748142, null), null).j();
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
                ml mlVar = (ml) obj3;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) obj;
                if (!zArr2[0]) {
                    botInfoArr[0] = botInfo;
                    if (botInfo != null) {
                        mlVar.run();
                        break;
                    } else {
                        TLRPC.UserFull b22 = hpVar.b2(user.id);
                        if (b22 != null) {
                            botInfoArr[0] = b22.bot_info;
                            mlVar.run();
                            break;
                        } else if (!zArr2[0]) {
                            hpVar.W2(user, i10, true, new d3(zArr2, botInfoArr, mlVar, 5));
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
                hpVar.getClass();
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                if (i11 >= i10) {
                    if (!tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                        g0.h3(new fg(hpVar, chat, tL_messages_invitedUsers, 2));
                    }
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ak(hp hpVar, sf.b bVar, org.telegram.ui.ActionBar.s1[] s1VarArr, org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, int i3) {
        this.b = hpVar;
        this.e = bVar;
        this.f = s1VarArr;
        this.g = d2Var;
        this.c = zArr;
        this.d = i3;
    }

    public /* synthetic */ ak(hp hpVar, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i3, ml mlVar) {
        this.b = hpVar;
        this.c = zArr;
        this.e = botInfoArr;
        this.f = user;
        this.d = i3;
        this.g = mlVar;
    }
}

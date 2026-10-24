package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dx implements v60 {
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 a;
    public final /* synthetic */ ey b;

    public dx(ey eyVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.b = eyVar;
        this.a = c2Var;
    }

    @Override // org.telegram.ui.v60
    public final void a(w60 w60Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.o2[] o2VarArr = {w60Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.bx
            public final /* synthetic */ dx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        ey eyVar = this.b.b;
                        Boolean bool = eyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", eyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.u0 = new f5(runnable, 12);
                            eyVar.presentFragment(mdVar);
                            o2VarArr[1] = mdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        dx dxVar = this.b;
                        ey eyVar2 = dxVar.b;
                        eyVar2.O4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new ot(10, dxVar, o2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.bx
            public final /* synthetic */ dx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        ey eyVar = this.b.b;
                        Boolean bool = eyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", eyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.u0 = new f5(runnable, 12);
                            eyVar.presentFragment(mdVar);
                            o2VarArr[1] = mdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        dx dxVar = this.b;
                        ey eyVar2 = dxVar.b;
                        eyVar2.O4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new ot(10, dxVar, o2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new ai.f2(this, c2Var, j10, 2), new Utilities.Callback(this) { // from class: org.telegram.ui.cx
            public final /* synthetic */ dx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ey eyVar = this.b.b;
                        if (eyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = eyVar.getMessagesController().getUser(Long.valueOf(eyVar.H));
                            MessagesController messagesController = eyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = eyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, bool == null || !bool.booleanValue(), true, null, runnable, new gf(6, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ey eyVar2 = this.b.b;
                        if (eyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = eyVar2.getMessagesController();
                            long j11 = j10;
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.cx
            public final /* synthetic */ dx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ey eyVar = this.b.b;
                        if (eyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = eyVar.getMessagesController().getUser(Long.valueOf(eyVar.H));
                            MessagesController messagesController = eyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = eyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, bool == null || !bool.booleanValue(), true, null, runnable, new gf(6, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ey eyVar2 = this.b.b;
                        if (eyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = eyVar2.getMessagesController();
                            long j11 = j10;
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            break;
                        }
                }
            }
        }, new ai.x2(this, c2Var, j10, o2VarArr, 5));
    }
}

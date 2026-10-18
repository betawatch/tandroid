package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class dx implements t60 {
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 a;
    public final /* synthetic */ ey b;

    public dx(ey eyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.b = eyVar;
        this.a = b2Var;
    }

    @Override // org.telegram.ui.t60
    public final void a(u60 u60Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {u60Var, null};
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
                            od odVar = new od(bundle);
                            odVar.t0 = new g5(runnable, 12);
                            eyVar.presentFragment(odVar);
                            n2VarArr[1] = odVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        dx dxVar = this.b;
                        ey eyVar2 = dxVar.b;
                        eyVar2.O4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new nt(10, dxVar, n2VarArr));
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
                            od odVar = new od(bundle);
                            odVar.t0 = new g5(runnable, 12);
                            eyVar.presentFragment(odVar);
                            n2VarArr[1] = odVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        dx dxVar = this.b;
                        ey eyVar2 = dxVar.b;
                        eyVar2.O4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new nt(10, dxVar, n2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new ai.g2(this, b2Var, j10, 2), new Utilities.Callback(this) { // from class: org.telegram.ui.cx
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
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, bool == null || !bool.booleanValue(), true, null, runnable, new jf(6, runnable));
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
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new jf(7, runnable2));
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
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, bool == null || !bool.booleanValue(), true, null, runnable, new jf(6, runnable));
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
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new jf(7, runnable2));
                            break;
                        }
                }
            }
        }, new ai.w2(this, b2Var, j10, n2VarArr, 5));
    }
}

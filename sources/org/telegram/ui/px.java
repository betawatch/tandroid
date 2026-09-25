package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class px implements f70 {
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 a;
    public final /* synthetic */ qy b;

    public px(qy qyVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.b = qyVar;
        this.a = a2Var;
    }

    @Override // org.telegram.ui.f70
    public final void a(g70 g70Var, final long j3) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.m2[] m2VarArr = {g70Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.nx
            public final /* synthetic */ px b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        qy qyVar = this.b.b;
                        Boolean bool = qyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", qyVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.t0 = new b5(runnable, 12);
                            qyVar.presentFragment(ldVar);
                            m2VarArr[1] = ldVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        px pxVar = this.b;
                        qy qyVar2 = pxVar.b;
                        qyVar2.Q4(qyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new tt(10, pxVar, m2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.nx
            public final /* synthetic */ px b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        qy qyVar = this.b.b;
                        Boolean bool = qyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", qyVar.G.has_username.booleanValue());
                            ld ldVar = new ld(bundle);
                            ldVar.t0 = new b5(runnable, 12);
                            qyVar.presentFragment(ldVar);
                            m2VarArr[1] = ldVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        px pxVar = this.b;
                        qy qyVar2 = pxVar.b;
                        qyVar2.Q4(qyVar2.getMessagesController().getChat(Long.valueOf(j3)), runnable, new tt(10, pxVar, m2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.a2 a2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new gu(this, a2Var, j3, i13), new Utilities.Callback(this) { // from class: org.telegram.ui.ox
            public final /* synthetic */ px b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        qy qyVar = this.b.b;
                        if (qyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = qyVar.getMessagesController().getUser(Long.valueOf(qyVar.H));
                            MessagesController messagesController = qyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = qyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, qyVar, bool == null || !bool.booleanValue(), true, null, runnable, new kf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        qy qyVar2 = this.b.b;
                        if (qyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = qyVar2.getMessagesController();
                            long j10 = j3;
                            qyVar2.getMessagesController().setUserAdminRole(j10, qyVar2.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, qyVar2.G.user_admin_rights), null, false, qyVar2, false, true, null, runnable2, new kf(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.ox
            public final /* synthetic */ px b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        qy qyVar = this.b.b;
                        if (qyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = qyVar.getMessagesController().getUser(Long.valueOf(qyVar.H));
                            MessagesController messagesController = qyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = qyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j3, user, tL_chatAdminRights, null, false, qyVar, bool == null || !bool.booleanValue(), true, null, runnable, new kf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        qy qyVar2 = this.b.b;
                        if (qyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = qyVar2.getMessagesController();
                            long j10 = j3;
                            qyVar2.getMessagesController().setUserAdminRole(j10, qyVar2.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(Long.valueOf(j10)).admin_rights, qyVar2.G.user_admin_rights), null, false, qyVar2, false, true, null, runnable2, new kf(7, runnable2));
                            break;
                        }
                }
            }
        }, new ai.l(this, a2Var, j3, m2VarArr, 7));
    }
}

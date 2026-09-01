package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class px implements e70 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ py b;

    public px(py pyVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.b = pyVar;
        this.a = d2Var;
    }

    @Override // org.telegram.ui.e70
    public final void a(f70 f70Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.p2[] p2VarArr = {f70Var, null};
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
                        py pyVar = this.b.b;
                        Boolean bool = pyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", pyVar.D.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.q0 = new d5(runnable, 12);
                            pyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        px pxVar = this.b;
                        py pyVar2 = pxVar.b;
                        pyVar2.Q4(pyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.l41(22, pxVar, p2VarArr));
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
                        py pyVar = this.b.b;
                        Boolean bool = pyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", pyVar.D.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.q0 = new d5(runnable, 12);
                            pyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        px pxVar = this.b;
                        py pyVar2 = pxVar.b;
                        pyVar2.Q4(pyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.l41(22, pxVar, p2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new ju(this, d2Var, j10, i13), new Utilities.Callback(this) { // from class: org.telegram.ui.ox
            public final /* synthetic */ px b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        py pyVar = this.b.b;
                        if (pyVar.D.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = pyVar.getMessagesController().getUser(Long.valueOf(pyVar.E));
                            MessagesController messagesController = pyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = pyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, pyVar, bool == null || !bool.booleanValue(), true, null, runnable, new gf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        py pyVar2 = this.b.b;
                        if (pyVar2.D.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = pyVar2.getMessagesController();
                            long j11 = j10;
                            pyVar2.getMessagesController().setUserAdminRole(j11, pyVar2.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, pyVar2.D.user_admin_rights), null, false, pyVar2, false, true, null, runnable2, new gf(7, runnable2));
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
                        py pyVar = this.b.b;
                        if (pyVar.D.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = pyVar.getMessagesController().getUser(Long.valueOf(pyVar.E));
                            MessagesController messagesController = pyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = pyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, pyVar, bool == null || !bool.booleanValue(), true, null, runnable, new gf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        py pyVar2 = this.b.b;
                        if (pyVar2.D.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = pyVar2.getMessagesController();
                            long j11 = j10;
                            pyVar2.getMessagesController().setUserAdminRole(j11, pyVar2.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, pyVar2.D.user_admin_rights), null, false, pyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            break;
                        }
                }
            }
        }, new lh.y0(this, d2Var, j10, p2VarArr, 4));
    }
}

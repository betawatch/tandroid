package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class bx implements r60 {
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 a;
    public final /* synthetic */ cy b;

    public bx(cy cyVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.b = cyVar;
        this.a = b2Var;
    }

    @Override // org.telegram.ui.r60
    public final void a(s60 s60Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.n2[] n2VarArr = {s60Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.zw
            public final /* synthetic */ bx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        cy cyVar = this.b.b;
                        Boolean bool = cyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", cyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.t0 = new g5(runnable, 12);
                            cyVar.presentFragment(mdVar);
                            n2VarArr[1] = mdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        bx bxVar = this.b;
                        cy cyVar2 = bxVar.b;
                        cyVar2.O4(cyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new lt(10, bxVar, n2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.zw
            public final /* synthetic */ bx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        cy cyVar = this.b.b;
                        Boolean bool = cyVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", cyVar.G.has_username.booleanValue());
                            md mdVar = new md(bundle);
                            mdVar.t0 = new g5(runnable, 12);
                            cyVar.presentFragment(mdVar);
                            n2VarArr[1] = mdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        bx bxVar = this.b;
                        cy cyVar2 = bxVar.b;
                        cyVar2.O4(cyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new lt(10, bxVar, n2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.b2 b2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new ai.f2(this, b2Var, j10, 2), new Utilities.Callback(this) { // from class: org.telegram.ui.ax
            public final /* synthetic */ bx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cy cyVar = this.b.b;
                        if (cyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = cyVar.getMessagesController().getUser(Long.valueOf(cyVar.H));
                            MessagesController messagesController = cyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, cyVar, bool == null || !bool.booleanValue(), true, null, runnable, new gf(6, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cy cyVar2 = this.b.b;
                        if (cyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = cyVar2.getMessagesController();
                            long j11 = j10;
                            cyVar2.getMessagesController().setUserAdminRole(j11, cyVar2.getAccountInstance().getUserConfig().getCurrentUser(), bq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, cyVar2.G.user_admin_rights), null, false, cyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.ax
            public final /* synthetic */ bx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cy cyVar = this.b.b;
                        if (cyVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = cyVar.getMessagesController().getUser(Long.valueOf(cyVar.H));
                            MessagesController messagesController = cyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cyVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, cyVar, bool == null || !bool.booleanValue(), true, null, runnable, new gf(6, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cy cyVar2 = this.b.b;
                        if (cyVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = cyVar2.getMessagesController();
                            long j11 = j10;
                            cyVar2.getMessagesController().setUserAdminRole(j11, cyVar2.getAccountInstance().getUserConfig().getCurrentUser(), bq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, cyVar2.G.user_admin_rights), null, false, cyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            break;
                        }
                }
            }
        }, new ai.x2(this, b2Var, j10, n2VarArr, 5));
    }
}

package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ax implements y60 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 a;
    public final /* synthetic */ ey b;

    public ax(ey eyVar, org.telegram.ui.ActionBar.e2 e2Var) {
        this.b = eyVar;
        this.a = e2Var;
    }

    @Override // org.telegram.ui.y60
    public final void a(z60 z60Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.r2[] r2VarArr = {z60Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.yw
            public final /* synthetic */ ax b;

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
                            nd ndVar = new nd(bundle);
                            ndVar.u0 = new e5(runnable, 12);
                            eyVar.presentFragment(ndVar);
                            r2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        ax axVar = this.b;
                        ey eyVar2 = axVar.b;
                        eyVar2.Y4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.d71(26, axVar, r2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.yw
            public final /* synthetic */ ax b;

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
                            nd ndVar = new nd(bundle);
                            ndVar.u0 = new e5(runnable, 12);
                            eyVar.presentFragment(ndVar);
                            r2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        ax axVar = this.b;
                        ey eyVar2 = axVar.b;
                        eyVar2.Y4(eyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.d71(26, axVar, r2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new bi.c2(this, e2Var, j10, 2), new Utilities.Callback(this) { // from class: org.telegram.ui.zw
            public final /* synthetic */ ax b;

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
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, bool == null || !bool.booleanValue(), true, null, runnable, new ef(8, runnable));
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
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), iq.t0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new ef(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.zw
            public final /* synthetic */ ax b;

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
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, eyVar, bool == null || !bool.booleanValue(), true, null, runnable, new ef(8, runnable));
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
                            eyVar2.getMessagesController().setUserAdminRole(j11, eyVar2.getAccountInstance().getUserConfig().getCurrentUser(), iq.t0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, eyVar2.G.user_admin_rights), null, false, eyVar2, false, true, null, runnable2, new ef(7, runnable2));
                            break;
                        }
                }
            }
        }, new bi.t2(this, e2Var, j10, r2VarArr, 5));
    }
}

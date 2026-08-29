package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fx implements s60 {
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 a;
    public final /* synthetic */ fy b;

    public fx(fy fyVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.b = fyVar;
        this.a = c2Var;
    }

    @Override // org.telegram.ui.s60
    public final void a(t60 t60Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.o2[] o2VarArr = {t60Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.dx
            public final /* synthetic */ fx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        fy fyVar = this.b.b;
                        Boolean bool = fyVar.C.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", fyVar.C.has_username.booleanValue());
                            hd hdVar = new hd(bundle);
                            hdVar.p0 = new b5(runnable, 12);
                            fyVar.presentFragment(hdVar);
                            o2VarArr[1] = hdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        fx fxVar = this.b;
                        fy fyVar2 = fxVar.b;
                        fyVar2.Q4(fyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.voip.o(14, fxVar, o2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.dx
            public final /* synthetic */ fx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        fy fyVar = this.b.b;
                        Boolean bool = fyVar.C.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", fyVar.C.has_username.booleanValue());
                            hd hdVar = new hd(bundle);
                            hdVar.p0 = new b5(runnable, 12);
                            fyVar.presentFragment(hdVar);
                            o2VarArr[1] = hdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        fx fxVar = this.b;
                        fy fyVar2 = fxVar.b;
                        fyVar2.Q4(fyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.voip.o(14, fxVar, o2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new au(this, c2Var, j10, i13), new Utilities.Callback(this) { // from class: org.telegram.ui.ex
            public final /* synthetic */ fx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        fy fyVar = this.b.b;
                        if (fyVar.C.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = fyVar.getMessagesController().getUser(Long.valueOf(fyVar.D));
                            MessagesController messagesController = fyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = fyVar.C;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, fyVar, bool == null || !bool.booleanValue(), true, null, runnable, new ze(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        fy fyVar2 = this.b.b;
                        if (fyVar2.C.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = fyVar2.getMessagesController();
                            long j11 = j10;
                            fyVar2.getMessagesController().setUserAdminRole(j11, fyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, fyVar2.C.user_admin_rights), null, false, fyVar2, false, true, null, runnable2, new ze(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.ex
            public final /* synthetic */ fx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        fy fyVar = this.b.b;
                        if (fyVar.C.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = fyVar.getMessagesController().getUser(Long.valueOf(fyVar.D));
                            MessagesController messagesController = fyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = fyVar.C;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, fyVar, bool == null || !bool.booleanValue(), true, null, runnable, new ze(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        fy fyVar2 = this.b.b;
                        if (fyVar2.C.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = fyVar2.getMessagesController();
                            long j11 = j10;
                            fyVar2.getMessagesController().setUserAdminRole(j11, fyVar2.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, fyVar2.C.user_admin_rights), null, false, fyVar2, false, true, null, runnable2, new ze(7, runnable2));
                            break;
                        }
                }
            }
        }, new ih.z0(this, c2Var, j10, o2VarArr, 4));
    }
}

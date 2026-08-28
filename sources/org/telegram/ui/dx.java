package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dx implements q60 {
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 a;
    public final /* synthetic */ dy b;

    public dx(dy dyVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.b = dyVar;
        this.a = c2Var;
    }

    @Override // org.telegram.ui.q60
    public final void a(r60 r60Var, final long j10) {
        final int i9 = 0;
        final int i10 = 1;
        final org.telegram.ui.ActionBar.o2[] o2VarArr = {r60Var, null};
        final int i11 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.bx
            public final /* synthetic */ dx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i11) {
                    case 0:
                        dy dyVar = this.b.b;
                        Boolean bool = dyVar.C.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", dyVar.C.has_username.booleanValue());
                            id idVar = new id(bundle);
                            idVar.p0 = new a5(runnable, 12);
                            dyVar.presentFragment(idVar);
                            o2VarArr[1] = idVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        dx dxVar = this.b;
                        dy dyVar2 = dxVar.b;
                        dyVar2.Q4(dyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.p61(17, dxVar, o2VarArr));
                        break;
                }
            }
        };
        final int i12 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.bx
            public final /* synthetic */ dx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        dy dyVar = this.b.b;
                        Boolean bool = dyVar.C.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", dyVar.C.has_username.booleanValue());
                            id idVar = new id(bundle);
                            idVar.p0 = new a5(runnable, 12);
                            dyVar.presentFragment(idVar);
                            o2VarArr[1] = idVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        dx dxVar = this.b;
                        dy dyVar2 = dxVar.b;
                        dyVar2.Q4(dyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.p61(17, dxVar, o2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new zt(this, c2Var, j10, i12), new Utilities.Callback(this) { // from class: org.telegram.ui.cx
            public final /* synthetic */ dx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i9) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        dy dyVar = this.b.b;
                        if (dyVar.C.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = dyVar.getMessagesController().getUser(Long.valueOf(dyVar.D));
                            MessagesController messagesController = dyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = dyVar.C;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, dyVar, bool == null || !bool.booleanValue(), true, null, runnable, new bf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        dy dyVar2 = this.b.b;
                        if (dyVar2.C.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = dyVar2.getMessagesController();
                            long j11 = j10;
                            dyVar2.getMessagesController().setUserAdminRole(j11, dyVar2.getAccountInstance().getUserConfig().getCurrentUser(), bq.r0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, dyVar2.C.user_admin_rights), null, false, dyVar2, false, true, null, runnable2, new bf(7, runnable2));
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
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        dy dyVar = this.b.b;
                        if (dyVar.C.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = dyVar.getMessagesController().getUser(Long.valueOf(dyVar.D));
                            MessagesController messagesController = dyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = dyVar.C;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, dyVar, bool == null || !bool.booleanValue(), true, null, runnable, new bf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        dy dyVar2 = this.b.b;
                        if (dyVar2.C.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = dyVar2.getMessagesController();
                            long j11 = j10;
                            dyVar2.getMessagesController().setUserAdminRole(j11, dyVar2.getAccountInstance().getUserConfig().getCurrentUser(), bq.r0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, dyVar2.C.user_admin_rights), null, false, dyVar2, false, true, null, runnable2, new bf(7, runnable2));
                            break;
                        }
                }
            }
        }, new fh.d1(this, c2Var, j10, o2VarArr, 4));
    }
}

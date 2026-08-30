package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ox implements d70 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ oy b;

    public ox(oy oyVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.b = oyVar;
        this.a = d2Var;
    }

    @Override // org.telegram.ui.d70
    public final void a(e70 e70Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.p2[] p2VarArr = {e70Var, null};
        final int i12 = 0;
        Utilities.Callback callback = new Utilities.Callback(this) { // from class: org.telegram.ui.mx
            public final /* synthetic */ ox b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        oy oyVar = this.b.b;
                        Boolean bool = oyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", oyVar.D.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.q0 = new d5(runnable, 12);
                            oyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        ox oxVar = this.b;
                        oy oyVar2 = oxVar.b;
                        oyVar2.Q4(oyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.k41(23, oxVar, p2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        Utilities.Callback callback2 = new Utilities.Callback(this) { // from class: org.telegram.ui.mx
            public final /* synthetic */ ox b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        oy oyVar = this.b.b;
                        Boolean bool = oyVar.D.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", oyVar.D.has_username.booleanValue());
                            nd ndVar = new nd(bundle);
                            ndVar.q0 = new d5(runnable, 12);
                            oyVar.presentFragment(ndVar);
                            p2VarArr[1] = ndVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        ox oxVar = this.b;
                        oy oyVar2 = oxVar.b;
                        oyVar2.Q4(oyVar2.getMessagesController().getChat(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.k41(23, oxVar, p2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        Utilities.doCallbacks(callback, callback2, new iu(this, d2Var, j10, i13), new Utilities.Callback(this) { // from class: org.telegram.ui.nx
            public final /* synthetic */ ox b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        oy oyVar = this.b.b;
                        if (oyVar.D.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = oyVar.getMessagesController().getUser(Long.valueOf(oyVar.E));
                            MessagesController messagesController = oyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = oyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, oyVar, bool == null || !bool.booleanValue(), true, null, runnable, new gf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        oy oyVar2 = this.b.b;
                        if (oyVar2.D.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = oyVar2.getMessagesController();
                            long j11 = j10;
                            oyVar2.getMessagesController().setUserAdminRole(j11, oyVar2.getAccountInstance().getUserConfig().getCurrentUser(), jq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, oyVar2.D.user_admin_rights), null, false, oyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            break;
                        }
                }
            }
        }, new Utilities.Callback(this) { // from class: org.telegram.ui.nx
            public final /* synthetic */ ox b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        oy oyVar = this.b.b;
                        if (oyVar.D.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User user = oyVar.getMessagesController().getUser(Long.valueOf(oyVar.E));
                            MessagesController messagesController = oyVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = oyVar.D;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.setUserAdminRole(j10, user, tL_chatAdminRights, null, false, oyVar, bool == null || !bool.booleanValue(), true, null, runnable, new gf(6, runnable));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        oy oyVar2 = this.b.b;
                        if (oyVar2.D.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            MessagesController messagesController2 = oyVar2.getMessagesController();
                            long j11 = j10;
                            oyVar2.getMessagesController().setUserAdminRole(j11, oyVar2.getAccountInstance().getUserConfig().getCurrentUser(), jq.s0(messagesController2.getChat(Long.valueOf(j11)).admin_rights, oyVar2.D.user_admin_rights), null, false, oyVar2, false, true, null, runnable2, new gf(7, runnable2));
                            break;
                        }
                }
            }
        }, new kh.y0(this, d2Var, j10, p2VarArr, 4));
    }
}

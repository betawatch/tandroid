package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class aw implements f50 {
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 a;
    public final /* synthetic */ zw b;

    public aw(zw zwVar, org.telegram.ui.ActionBar.u1 u1Var) {
        this.b = zwVar;
        this.a = u1Var;
    }

    @Override // org.telegram.ui.f50
    public final void e(g50 g50Var, final long j3) {
        final int i7 = 0;
        final int i10 = 1;
        final org.telegram.ui.ActionBar.f2[] f2VarArr = {g50Var, null};
        final int i11 = 0;
        org.telegram.messenger.c20 c20Var = new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.yv
            public final /* synthetic */ aw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i11) {
                    case 0:
                        zw zwVar = this.b.b;
                        Boolean bool = zwVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", zwVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.u0 = new a5(runnable, 12);
                            zwVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        aw awVar = this.b;
                        zw zwVar2 = awVar.b;
                        zwVar2.c5(zwVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.h41(17, awVar, f2VarArr));
                        break;
                }
            }
        };
        final int i12 = 1;
        org.telegram.messenger.c20 c20Var2 = new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.yv
            public final /* synthetic */ aw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        zw zwVar = this.b.b;
                        Boolean bool = zwVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", zwVar.G.has_username.booleanValue());
                            bd bdVar = new bd(bundle);
                            bdVar.u0 = new a5(runnable, 12);
                            zwVar.presentFragment(bdVar);
                            f2VarArr[1] = bdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        aw awVar = this.b;
                        zw zwVar2 = awVar.b;
                        zwVar2.c5(zwVar2.getMessagesController().M0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.h41(17, awVar, f2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.u1 u1Var = this.a;
        Utilities.u(0, c20Var, c20Var2, new bi.b2(this, u1Var, j3, 2), new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.zv
            public final /* synthetic */ aw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        zw zwVar = this.b.b;
                        if (zwVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User a22 = zwVar.getMessagesController().a2(Long.valueOf(zwVar.H));
                            org.telegram.messenger.qp messagesController = zwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = zwVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, zwVar, bool == null || !bool.booleanValue(), true, null, runnable, new we(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        zw zwVar2 = this.b.b;
                        if (zwVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.qp messagesController2 = zwVar2.getMessagesController();
                            long j10 = j3;
                            zwVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(zwVar2.getAccountInstance().a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, zwVar2.G.user_admin_rights), null, false, zwVar2, false, true, null, runnable2, new we(7, runnable2));
                            break;
                        }
                }
            }
        }, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.zv
            public final /* synthetic */ aw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.c20
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        zw zwVar = this.b.b;
                        if (zwVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User a22 = zwVar.getMessagesController().a2(Long.valueOf(zwVar.H));
                            org.telegram.messenger.qp messagesController = zwVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = zwVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.P4(j3, a22, tL_chatAdminRights, null, false, zwVar, bool == null || !bool.booleanValue(), true, null, runnable, new we(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        zw zwVar2 = this.b.b;
                        if (zwVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.qp messagesController2 = zwVar2.getMessagesController();
                            long j10 = j3;
                            zwVar2.getMessagesController().P4(j10, org.telegram.messenger.p10.i(zwVar2.getAccountInstance().a).f(), mp.x0(messagesController2.M0(Long.valueOf(j10)).admin_rights, zwVar2.G.user_admin_rights), null, false, zwVar2, false, true, null, runnable2, new we(7, runnable2));
                            break;
                        }
                }
            }
        }, new bi.r2(this, u1Var, j3, f2VarArr, 5));
    }
}

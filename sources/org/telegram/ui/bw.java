package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bw implements d50 {
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 a;
    public final /* synthetic */ bx b;

    public bw(bx bxVar, org.telegram.ui.ActionBar.t1 t1Var) {
        this.b = bxVar;
        this.a = t1Var;
    }

    @Override // org.telegram.ui.d50
    public final void d(e50 e50Var, final long j3) {
        final int i7 = 0;
        final int i10 = 1;
        final org.telegram.ui.ActionBar.g2[] g2VarArr = {e50Var, null};
        final int i11 = 0;
        org.telegram.messenger.w10 w10Var = new org.telegram.messenger.w10(this) { // from class: org.telegram.ui.zv
            public final /* synthetic */ bw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.w10
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i11) {
                    case 0:
                        bx bxVar = this.b.b;
                        Boolean bool = bxVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", bxVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.v0 = new a5(runnable, 12);
                            bxVar.presentFragment(adVar);
                            g2VarArr[1] = adVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        bw bwVar = this.b;
                        bx bxVar2 = bwVar.b;
                        bxVar2.k5(bxVar2.getMessagesController().O0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.o(13, bwVar, g2VarArr));
                        break;
                }
            }
        };
        final int i12 = 1;
        org.telegram.messenger.w10 w10Var2 = new org.telegram.messenger.w10(this) { // from class: org.telegram.ui.zv
            public final /* synthetic */ bw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.w10
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        bx bxVar = this.b.b;
                        Boolean bool = bxVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", bxVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.v0 = new a5(runnable, 12);
                            bxVar.presentFragment(adVar);
                            g2VarArr[1] = adVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        bw bwVar = this.b;
                        bx bxVar2 = bwVar.b;
                        bxVar2.k5(bxVar2.getMessagesController().O0(Long.valueOf(j3)), runnable, new org.telegram.ui.Components.voip.o(13, bwVar, g2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.t1 t1Var = this.a;
        Utilities.u(0, w10Var, w10Var2, new bi.d4(this, t1Var, j3, 4), new org.telegram.messenger.w10(this) { // from class: org.telegram.ui.aw
            public final /* synthetic */ bw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.w10
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        bx bxVar = this.b.b;
                        if (bxVar.H.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User c22 = bxVar.getMessagesController().c2(Long.valueOf(bxVar.I));
                            org.telegram.messenger.mp messagesController = bxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = bxVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.b5(j3, c22, tL_chatAdminRights, null, false, bxVar, bool == null || !bool.booleanValue(), true, null, runnable, new ve(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        bx bxVar2 = this.b.b;
                        if (bxVar2.H.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.mp messagesController2 = bxVar2.getMessagesController();
                            long j10 = j3;
                            bxVar2.getMessagesController().b5(j10, org.telegram.messenger.i10.i(bxVar2.getAccountInstance().a).f(), np.x0(messagesController2.O0(Long.valueOf(j10)).admin_rights, bxVar2.H.user_admin_rights), null, false, bxVar2, false, true, null, runnable2, new ve(7, runnable2));
                            break;
                        }
                }
            }
        }, new org.telegram.messenger.w10(this) { // from class: org.telegram.ui.aw
            public final /* synthetic */ bw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.w10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        bx bxVar = this.b.b;
                        if (bxVar.H.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User c22 = bxVar.getMessagesController().c2(Long.valueOf(bxVar.I));
                            org.telegram.messenger.mp messagesController = bxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = bxVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.b5(j3, c22, tL_chatAdminRights, null, false, bxVar, bool == null || !bool.booleanValue(), true, null, runnable, new ve(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        bx bxVar2 = this.b.b;
                        if (bxVar2.H.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.mp messagesController2 = bxVar2.getMessagesController();
                            long j10 = j3;
                            bxVar2.getMessagesController().b5(j10, org.telegram.messenger.i10.i(bxVar2.getAccountInstance().a).f(), np.x0(messagesController2.O0(Long.valueOf(j10)).admin_rights, bxVar2.H.user_admin_rights), null, false, bxVar2, false, true, null, runnable2, new ve(7, runnable2));
                            break;
                        }
                }
            }
        }, new bi.k2(this, t1Var, j3, g2VarArr, 6));
    }
}

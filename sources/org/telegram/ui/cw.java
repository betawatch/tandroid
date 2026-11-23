package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class cw implements e50 {
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 a;
    public final /* synthetic */ cx b;

    public cw(cx cxVar, org.telegram.ui.ActionBar.t1 t1Var) {
        this.b = cxVar;
        this.a = t1Var;
    }

    @Override // org.telegram.ui.e50
    public final void c(f50 f50Var, final long j3) {
        final int i7 = 0;
        final int i10 = 1;
        final org.telegram.ui.ActionBar.g2[] g2VarArr = {f50Var, null};
        final int i11 = 0;
        org.telegram.messenger.y10 y10Var = new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.aw
            public final /* synthetic */ cw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.y10
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i11) {
                    case 0:
                        cx cxVar = this.b.b;
                        Boolean bool = cxVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", cxVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.v0 = new a5(runnable, 12);
                            cxVar.presentFragment(adVar);
                            g2VarArr[1] = adVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        cw cwVar = this.b;
                        cx cxVar2 = cwVar.b;
                        cxVar2.k5(cxVar2.getMessagesController().O0(Long.valueOf(j3)), runnable, new ss(9, cwVar, g2VarArr));
                        break;
                }
            }
        };
        final int i12 = 1;
        org.telegram.messenger.y10 y10Var2 = new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.aw
            public final /* synthetic */ cw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.y10
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        cx cxVar = this.b.b;
                        Boolean bool = cxVar.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j3);
                            bundle.putBoolean("forcePublic", cxVar.H.has_username.booleanValue());
                            ad adVar = new ad(bundle);
                            adVar.v0 = new a5(runnable, 12);
                            cxVar.presentFragment(adVar);
                            g2VarArr[1] = adVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        cw cwVar = this.b;
                        cx cxVar2 = cwVar.b;
                        cxVar2.k5(cxVar2.getMessagesController().O0(Long.valueOf(j3)), runnable, new ss(9, cwVar, g2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.t1 t1Var = this.a;
        Utilities.u(0, y10Var, y10Var2, new bi.b4(this, t1Var, j3, 4), new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.bw
            public final /* synthetic */ cw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.y10
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cx cxVar = this.b.b;
                        if (cxVar.H.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User c22 = cxVar.getMessagesController().c2(Long.valueOf(cxVar.I));
                            org.telegram.messenger.np messagesController = cxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cxVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.b5(j3, c22, tL_chatAdminRights, null, false, cxVar, bool == null || !bool.booleanValue(), true, null, runnable, new ve(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cx cxVar2 = this.b.b;
                        if (cxVar2.H.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.np messagesController2 = cxVar2.getMessagesController();
                            long j10 = j3;
                            cxVar2.getMessagesController().b5(j10, org.telegram.messenger.k10.i(cxVar2.getAccountInstance().a).f(), np.x0(messagesController2.O0(Long.valueOf(j10)).admin_rights, cxVar2.H.user_admin_rights), null, false, cxVar2, false, true, null, runnable2, new ve(7, runnable2));
                            break;
                        }
                }
            }
        }, new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.bw
            public final /* synthetic */ cw b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.y10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        cx cxVar = this.b.b;
                        if (cxVar.H.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User c22 = cxVar.getMessagesController().c2(Long.valueOf(cxVar.I));
                            org.telegram.messenger.np messagesController = cxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = cxVar.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.b5(j3, c22, tL_chatAdminRights, null, false, cxVar, bool == null || !bool.booleanValue(), true, null, runnable, new ve(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        cx cxVar2 = this.b.b;
                        if (cxVar2.H.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.np messagesController2 = cxVar2.getMessagesController();
                            long j10 = j3;
                            cxVar2.getMessagesController().b5(j10, org.telegram.messenger.k10.i(cxVar2.getAccountInstance().a).f(), np.x0(messagesController2.O0(Long.valueOf(j10)).admin_rights, cxVar2.H.user_admin_rights), null, false, cxVar2, false, true, null, runnable2, new ve(7, runnable2));
                            break;
                        }
                }
            }
        }, new bi.i2(this, t1Var, j3, g2VarArr, 6));
    }
}

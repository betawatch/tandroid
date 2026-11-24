// default package

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ij3 implements tc5 {
    public final /* synthetic */ he a;
    public final /* synthetic */ nk3 b;

    public ij3(nk3 nk3Var, he heVar) {
        this.b = nk3Var;
        this.a = heVar;
    }

    @Override // tc5
    public final void a(uc5 uc5Var, final long j) {
        final byte b = 0;
        final byte b2 = 1;
        final d[] dVarArr = {uc5Var, null};
        final byte b3 = 0;
        qac qacVar = new qac(this) { // from class: gj3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            @Override // qac
            public final void a(Object obj) {
                byte b4 = b3;
                d[] dVarArr2 = dVarArr;
                long j2 = j;
                ij3 ij3Var = this.b;
                Runnable runnable = (Runnable) obj;
                switch (b4) {
                    case 0:
                        nk3 nk3Var = ij3Var.b;
                        Boolean bool = nk3Var.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j2);
                            bundle.putBoolean("forcePublic", nk3Var.H.has_username.booleanValue());
                            fj1 fj1Var = new fj1(bundle);
                            fj1Var.v0 = new h92(runnable, (byte) 18);
                            nk3Var.presentFragment(fj1Var);
                            dVarArr2[1] = fj1Var;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        nk3 nk3Var2 = ij3Var.b;
                        nk3Var2.m5(nk3Var2.getMessagesController().L0(Long.valueOf(j2)), runnable, new rd3(ij3Var, dVarArr2, (byte) 7));
                        break;
                }
            }
        };
        final byte b4 = 1;
        qac qacVar2 = new qac(this) { // from class: gj3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            @Override // qac
            public final void a(Object obj) {
                byte b42 = b4;
                d[] dVarArr2 = dVarArr;
                long j2 = j;
                ij3 ij3Var = this.b;
                Runnable runnable = (Runnable) obj;
                switch (b42) {
                    case 0:
                        nk3 nk3Var = ij3Var.b;
                        Boolean bool = nk3Var.H.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j2);
                            bundle.putBoolean("forcePublic", nk3Var.H.has_username.booleanValue());
                            fj1 fj1Var = new fj1(bundle);
                            fj1Var.v0 = new h92(runnable, (byte) 18);
                            nk3Var.presentFragment(fj1Var);
                            dVarArr2[1] = fj1Var;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        nk3 nk3Var2 = ij3Var.b;
                        nk3Var2.m5(nk3Var2.getMessagesController().L0(Long.valueOf(j2)), runnable, new rd3(ij3Var, dVarArr2, (byte) 7));
                        break;
                }
            }
        };
        he heVar = this.a;
        Utilities.u(0, qacVar, qacVar2, new p2c((Object) this, (Object) heVar, j, (byte) 2), new qac(this) { // from class: hj3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            @Override // qac
            public final void a(Object obj) {
                byte b5 = b;
                ij3 ij3Var = this.b;
                switch (b5) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        nk3 nk3Var = ij3Var.b;
                        if (nk3Var.H.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User W1 = nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.I));
                            oc7 messagesController = nk3Var.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = nk3Var.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.X4(j, W1, tL_chatAdminRights, null, false, nk3Var, bool == null || !bool.booleanValue(), true, null, runnable, new cf(runnable, (byte) 14));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        nk3 nk3Var2 = ij3Var.b;
                        if (nk3Var2.H.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            oc7 messagesController2 = nk3Var2.getMessagesController();
                            long j2 = j;
                            nk3Var2.getMessagesController().X4(j2, z8c.h(nk3Var2.getAccountInstance().a).f(), ke2.p0(messagesController2.L0(Long.valueOf(j2)).admin_rights, nk3Var2.H.user_admin_rights), null, false, nk3Var2, false, true, null, runnable2, new cf(runnable2, (byte) 13));
                            break;
                        }
                }
            }
        }, new qac(this) { // from class: hj3
            public final /* synthetic */ ij3 b;

            {
                this.b = this;
            }

            @Override // qac
            public final void a(Object obj) {
                byte b5 = b2;
                ij3 ij3Var = this.b;
                switch (b5) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        nk3 nk3Var = ij3Var.b;
                        if (nk3Var.H.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User W1 = nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.I));
                            oc7 messagesController = nk3Var.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = nk3Var.H;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.X4(j, W1, tL_chatAdminRights, null, false, nk3Var, bool == null || !bool.booleanValue(), true, null, runnable, new cf(runnable, (byte) 14));
                            break;
                        }
                        break;
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        nk3 nk3Var2 = ij3Var.b;
                        if (nk3Var2.H.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            oc7 messagesController2 = nk3Var2.getMessagesController();
                            long j2 = j;
                            nk3Var2.getMessagesController().X4(j2, z8c.h(nk3Var2.getAccountInstance().a).f(), ke2.p0(messagesController2.L0(Long.valueOf(j2)).admin_rights, nk3Var2.H.user_admin_rights), null, false, nk3Var2, false, true, null, runnable2, new cf(runnable2, (byte) 13));
                            break;
                        }
                }
            }
        }, new s2c((Object) this, (Object) heVar, j, (Object) dVarArr, (byte) 3));
    }
}

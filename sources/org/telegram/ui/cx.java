package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cx implements b60 {
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 a;
    public final /* synthetic */ ay b;

    public cx(ay ayVar, org.telegram.ui.ActionBar.x1 x1Var) {
        this.b = ayVar;
        this.a = x1Var;
    }

    @Override // org.telegram.ui.b60
    public final void f(c60 c60Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.k2[] k2VarArr = {c60Var, null};
        final int i12 = 0;
        org.telegram.messenger.q20 q20Var = new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.ax
            public final /* synthetic */ cx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        ay ayVar = this.b.b;
                        Boolean bool = ayVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", ayVar.G.has_username.booleanValue());
                            kd kdVar = new kd(bundle);
                            kdVar.u0 = new z4(runnable, 12);
                            ayVar.presentFragment(kdVar);
                            k2VarArr[1] = kdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        cx cxVar = this.b;
                        ay ayVar2 = cxVar.b;
                        ayVar2.b5(ayVar2.getMessagesController().L0(Long.valueOf(j10)), runnable, new xs(9, cxVar, k2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        org.telegram.messenger.q20 q20Var2 = new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.ax
            public final /* synthetic */ cx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        ay ayVar = this.b.b;
                        Boolean bool = ayVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", ayVar.G.has_username.booleanValue());
                            kd kdVar = new kd(bundle);
                            kdVar.u0 = new z4(runnable, 12);
                            ayVar.presentFragment(kdVar);
                            k2VarArr[1] = kdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        cx cxVar = this.b;
                        ay ayVar2 = cxVar.b;
                        ayVar2.b5(ayVar2.getMessagesController().L0(Long.valueOf(j10)), runnable, new xs(9, cxVar, k2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.x1 x1Var = this.a;
        Utilities.u(0, q20Var, q20Var2, new au(this, x1Var, j10, i13), new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.bx
            public final /* synthetic */ cx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ay ayVar = this.b.b;
                        if (ayVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User Z1 = ayVar.getMessagesController().Z1(Long.valueOf(ayVar.H));
                            org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ayVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.M4(j10, Z1, tL_chatAdminRights, null, false, ayVar, bool == null || !bool.booleanValue(), true, null, runnable, new jf(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ay ayVar2 = this.b.b;
                        if (ayVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.vp messagesController2 = ayVar2.getMessagesController();
                            long j11 = j10;
                            ayVar2.getMessagesController().M4(j11, org.telegram.messenger.d20.i(ayVar2.getAccountInstance().a).f(), iq.w0(messagesController2.L0(Long.valueOf(j11)).admin_rights, ayVar2.G.user_admin_rights), null, false, ayVar2, false, true, null, runnable2, new jf(7, runnable2));
                            break;
                        }
                }
            }
        }, new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.bx
            public final /* synthetic */ cx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        ay ayVar = this.b.b;
                        if (ayVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User Z1 = ayVar.getMessagesController().Z1(Long.valueOf(ayVar.H));
                            org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = ayVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.M4(j10, Z1, tL_chatAdminRights, null, false, ayVar, bool == null || !bool.booleanValue(), true, null, runnable, new jf(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        ay ayVar2 = this.b.b;
                        if (ayVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.vp messagesController2 = ayVar2.getMessagesController();
                            long j11 = j10;
                            ayVar2.getMessagesController().M4(j11, org.telegram.messenger.d20.i(ayVar2.getAccountInstance().a).f(), iq.w0(messagesController2.L0(Long.valueOf(j11)).admin_rights, ayVar2.G.user_admin_rights), null, false, ayVar2, false, true, null, runnable2, new jf(7, runnable2));
                            break;
                        }
                }
            }
        }, new ko(this, x1Var, j10, k2VarArr, 1));
    }
}

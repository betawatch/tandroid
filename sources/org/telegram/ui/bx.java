package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class bx implements a60 {
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 a;
    public final /* synthetic */ zx b;

    public bx(zx zxVar, org.telegram.ui.ActionBar.x1 x1Var) {
        this.b = zxVar;
        this.a = x1Var;
    }

    @Override // org.telegram.ui.a60
    public final void f(b60 b60Var, final long j10) {
        final int i10 = 0;
        final int i11 = 1;
        final org.telegram.ui.ActionBar.k2[] k2VarArr = {b60Var, null};
        final int i12 = 0;
        org.telegram.messenger.r20 r20Var = new org.telegram.messenger.r20(this) { // from class: org.telegram.ui.zw
            public final /* synthetic */ bx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.r20
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i12) {
                    case 0:
                        zx zxVar = this.b.b;
                        Boolean bool = zxVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", zxVar.G.has_username.booleanValue());
                            kd kdVar = new kd(bundle);
                            kdVar.u0 = new z4(runnable, 12);
                            zxVar.presentFragment(kdVar);
                            k2VarArr[1] = kdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        bx bxVar = this.b;
                        zx zxVar2 = bxVar.b;
                        zxVar2.c5(zxVar2.getMessagesController().L0(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.voip.u(10, bxVar, k2VarArr));
                        break;
                }
            }
        };
        final int i13 = 1;
        org.telegram.messenger.r20 r20Var2 = new org.telegram.messenger.r20(this) { // from class: org.telegram.ui.zw
            public final /* synthetic */ bx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.r20
            public final void a(Object obj) {
                Runnable runnable = (Runnable) obj;
                switch (i13) {
                    case 0:
                        zx zxVar = this.b.b;
                        Boolean bool = zxVar.G.has_username;
                        if (bool != null && bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("step", 1);
                            bundle.putLong("chat_id", j10);
                            bundle.putBoolean("forcePublic", zxVar.G.has_username.booleanValue());
                            kd kdVar = new kd(bundle);
                            kdVar.u0 = new z4(runnable, 12);
                            zxVar.presentFragment(kdVar);
                            k2VarArr[1] = kdVar;
                            break;
                        } else {
                            runnable.run();
                            break;
                        }
                    default:
                        bx bxVar = this.b;
                        zx zxVar2 = bxVar.b;
                        zxVar2.c5(zxVar2.getMessagesController().L0(Long.valueOf(j10)), runnable, new org.telegram.ui.Components.voip.u(10, bxVar, k2VarArr));
                        break;
                }
            }
        };
        org.telegram.ui.ActionBar.x1 x1Var = this.a;
        Utilities.u(0, r20Var, r20Var2, new zt(this, x1Var, j10, i13), new org.telegram.messenger.r20(this) { // from class: org.telegram.ui.ax
            public final /* synthetic */ bx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.r20
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        zx zxVar = this.b.b;
                        if (zxVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User Z1 = zxVar.getMessagesController().Z1(Long.valueOf(zxVar.H));
                            org.telegram.messenger.wp messagesController = zxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = zxVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.M4(j10, Z1, tL_chatAdminRights, null, false, zxVar, bool == null || !bool.booleanValue(), true, null, runnable, new hf(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        zx zxVar2 = this.b.b;
                        if (zxVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.wp messagesController2 = zxVar2.getMessagesController();
                            long j11 = j10;
                            zxVar2.getMessagesController().M4(j11, org.telegram.messenger.e20.i(zxVar2.getAccountInstance().a).f(), iq.x0(messagesController2.L0(Long.valueOf(j11)).admin_rights, zxVar2.G.user_admin_rights), null, false, zxVar2, false, true, null, runnable2, new hf(7, runnable2));
                            break;
                        }
                }
            }
        }, new org.telegram.messenger.r20(this) { // from class: org.telegram.ui.ax
            public final /* synthetic */ bx b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.r20
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        Runnable runnable = (Runnable) obj;
                        zx zxVar = this.b.b;
                        if (zxVar.G.bot_admin_rights == null) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.User Z1 = zxVar.getMessagesController().Z1(Long.valueOf(zxVar.H));
                            org.telegram.messenger.wp messagesController = zxVar.getMessagesController();
                            TLRPC.RequestPeerType requestPeerType = zxVar.G;
                            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                            Boolean bool = requestPeerType.bot_participant;
                            messagesController.M4(j10, Z1, tL_chatAdminRights, null, false, zxVar, bool == null || !bool.booleanValue(), true, null, runnable, new hf(8, runnable));
                            break;
                        }
                    default:
                        Runnable runnable2 = (Runnable) obj;
                        zx zxVar2 = this.b.b;
                        if (zxVar2.G.user_admin_rights == null) {
                            runnable2.run();
                            break;
                        } else {
                            org.telegram.messenger.wp messagesController2 = zxVar2.getMessagesController();
                            long j11 = j10;
                            zxVar2.getMessagesController().M4(j11, org.telegram.messenger.e20.i(zxVar2.getAccountInstance().a).f(), iq.x0(messagesController2.L0(Long.valueOf(j11)).admin_rights, zxVar2.G.user_admin_rights), null, false, zxVar2, false, true, null, runnable2, new hf(7, runnable2));
                            break;
                        }
                }
            }
        }, new ko(this, x1Var, j10, k2VarArr, 1));
    }
}

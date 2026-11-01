package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements org.telegram.messenger.k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n6(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        final int i11 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        final int i12 = 0;
        switch (i10) {
            case 0:
                ag.q0 q0Var = (ag.q0) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                org.telegram.messenger.i0.r(q0Var);
                org.telegram.messenger.i0.g3(q0Var);
                break;
            case 1:
                un unVar = (un) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                gg ggVar = (gg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = unVar.Ib.keySet().iterator();
                    while (it.hasNext() && unVar.Ib.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    unVar.Ib.put(getwebpagepreview.message, webPage);
                }
                ggVar.a(bool, webPage);
                break;
            case 2:
                final zx zxVar = (zx) obj5;
                kd kdVar = (kd) obj4;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                final Long l4 = (Long) obj2;
                Utilities.u(0, new ag.m2(zxVar, l4, kdVar, k2Var, 11), new w(zxVar, x1Var, l4, 8), new org.telegram.messenger.r20() { // from class: org.telegram.ui.sv
                    @Override // org.telegram.messenger.r20
                    public final void a(Object obj6) {
                        switch (i12) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                zx zxVar2 = zxVar;
                                if (zxVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User Z1 = zxVar2.getMessagesController().Z1(Long.valueOf(zxVar2.H));
                                    org.telegram.messenger.wp messagesController = zxVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = zxVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.M4(longValue, Z1, tL_chatAdminRights, null, false, zxVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new hf(5, runnable));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                zx zxVar3 = zxVar;
                                if (zxVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    org.telegram.messenger.wp messagesController2 = zxVar3.getMessagesController();
                                    Long l10 = l4;
                                    zxVar3.getMessagesController().M4(l10.longValue(), org.telegram.messenger.e20.i(zxVar3.getAccountInstance().a).f(), iq.x0(messagesController2.L0(l10).admin_rights, zxVar3.G.user_admin_rights), null, true, zxVar3, false, true, null, runnable2, new hf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new org.telegram.messenger.r20() { // from class: org.telegram.ui.sv
                    @Override // org.telegram.messenger.r20
                    public final void a(Object obj6) {
                        switch (i11) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                zx zxVar2 = zxVar;
                                if (zxVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User Z1 = zxVar2.getMessagesController().Z1(Long.valueOf(zxVar2.H));
                                    org.telegram.messenger.wp messagesController = zxVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = zxVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.M4(longValue, Z1, tL_chatAdminRights, null, false, zxVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new hf(5, runnable));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                zx zxVar3 = zxVar;
                                if (zxVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    org.telegram.messenger.wp messagesController2 = zxVar3.getMessagesController();
                                    Long l10 = l4;
                                    zxVar3.getMessagesController().M4(l10.longValue(), org.telegram.messenger.e20.i(zxVar3.getAccountInstance().a).f(), iq.x0(messagesController2.L0(l10).admin_rights, zxVar3.G.user_admin_rights), null, true, zxVar3, false, true, null, runnable2, new hf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new pa(zxVar, x1Var, l4, kdVar, k2Var, 4));
                break;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.cc(z2Var.E, z2Var.I0).e0(str, false);
                        break;
                    }
                } else {
                    z2Var.dismiss();
                    while (i12 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i12).id, passkey.id)) {
                            passkeys.passkeys.remove(i12);
                            i12--;
                        }
                        i12++;
                    }
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        T.presentFragment(passkeysActivity);
                        org.telegram.messenger.i0.h3(new if0(11, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}

package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n6 implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n6(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        final int i10 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        final int i11 = 0;
        switch (i7) {
            case 0:
                m6 m6Var = (m6) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                org.telegram.messenger.g0.r(m6Var);
                org.telegram.messenger.g0.h3(m6Var);
                break;
            case 1:
                an anVar = (an) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                ag agVar = (ag) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = anVar.Mb.keySet().iterator();
                    while (it.hasNext() && anVar.Mb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    anVar.Mb.put(getwebpagepreview.message, webPage);
                }
                agVar.a(bool, webPage);
                break;
            case 2:
                final ww wwVar = (ww) obj5;
                bd bdVar = (bd) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                final Long l10 = (Long) obj2;
                Utilities.u(0, new di.s2(wwVar, l10, bdVar, f2Var, 11), new y(wwVar, u1Var, l10, 8), new org.telegram.messenger.c20() { // from class: org.telegram.ui.ou
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj6) {
                        switch (i11) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                ww wwVar2 = wwVar;
                                if (wwVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User a22 = wwVar2.getMessagesController().a2(Long.valueOf(wwVar2.H));
                                    org.telegram.messenger.qp messagesController = wwVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = wwVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.P4(longValue, a22, tL_chatAdminRights, null, false, wwVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new ve(5, runnable));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ww wwVar3 = wwVar;
                                if (wwVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    org.telegram.messenger.qp messagesController2 = wwVar3.getMessagesController();
                                    Long l11 = l10;
                                    wwVar3.getMessagesController().P4(l11.longValue(), org.telegram.messenger.p10.i(wwVar3.getAccountInstance().a).f(), kp.x0(messagesController2.M0(l11).admin_rights, wwVar3.G.user_admin_rights), null, true, wwVar3, false, true, null, runnable2, new ve(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new org.telegram.messenger.c20() { // from class: org.telegram.ui.ou
                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj6) {
                        switch (i10) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                ww wwVar2 = wwVar;
                                if (wwVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User a22 = wwVar2.getMessagesController().a2(Long.valueOf(wwVar2.H));
                                    org.telegram.messenger.qp messagesController = wwVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = wwVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.P4(longValue, a22, tL_chatAdminRights, null, false, wwVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new ve(5, runnable));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ww wwVar3 = wwVar;
                                if (wwVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    org.telegram.messenger.qp messagesController2 = wwVar3.getMessagesController();
                                    Long l11 = l10;
                                    wwVar3.getMessagesController().P4(l11.longValue(), org.telegram.messenger.p10.i(wwVar3.getAccountInstance().a).f(), kp.x0(messagesController2.M0(l11).admin_rights, wwVar3.G.user_admin_rights), null, true, wwVar3, false, true, null, runnable2, new ve(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new bi.z2(wwVar, u1Var, l10, bdVar, f2Var, 5));
                break;
            default:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.hc(v2Var.E, v2Var.I0).e0(str, false);
                        break;
                    }
                } else {
                    v2Var.dismiss();
                    while (i11 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i11).id, passkey.id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        T.presentFragment(passkeysActivity);
                        org.telegram.messenger.g0.i3(new zc0(18, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}

package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o6(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        final int i10 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        final int i11 = 0;
        switch (i3) {
            case 0:
                o4.b1 b1Var = (o4.b1) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                org.telegram.messenger.g0.r(b1Var);
                org.telegram.messenger.g0.h3(b1Var);
                break;
            case 1:
                wm wmVar = (wm) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                wf wfVar = (wf) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = wmVar.Nb.keySet().iterator();
                    while (it.hasNext() && wmVar.Nb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    wmVar.Nb.put(getwebpagepreview.message, webPage);
                }
                wfVar.a(bool, webPage);
                break;
            case 2:
                final uw uwVar = (uw) obj5;
                ad adVar = (ad) obj4;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                final Long l10 = (Long) obj2;
                Utilities.u(0, new ai.v1(uwVar, l10, adVar, d2Var, 12), new z(uwVar, s1Var, l10, 8), new org.telegram.messenger.u10() { // from class: org.telegram.ui.mu
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj6) {
                        switch (i11) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                uw uwVar2 = uwVar;
                                if (uwVar2.H.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User a22 = uwVar2.getMessagesController().a2(Long.valueOf(uwVar2.I));
                                    org.telegram.messenger.hp messagesController = uwVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = uwVar2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.P4(longValue, a22, tL_chatAdminRights, null, false, uwVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new se(5, runnable));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                uw uwVar3 = uwVar;
                                if (uwVar3.H.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    org.telegram.messenger.hp messagesController2 = uwVar3.getMessagesController();
                                    Long l11 = l10;
                                    uwVar3.getMessagesController().P4(l11.longValue(), org.telegram.messenger.h10.i(uwVar3.getAccountInstance().a).f(), ip.x0(messagesController2.M0(l11).admin_rights, uwVar3.H.user_admin_rights), null, true, uwVar3, false, true, null, runnable2, new se(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new org.telegram.messenger.u10() { // from class: org.telegram.ui.mu
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj6) {
                        switch (i10) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                uw uwVar2 = uwVar;
                                if (uwVar2.H.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User a22 = uwVar2.getMessagesController().a2(Long.valueOf(uwVar2.I));
                                    org.telegram.messenger.hp messagesController = uwVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = uwVar2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.P4(longValue, a22, tL_chatAdminRights, null, false, uwVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new se(5, runnable));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                uw uwVar3 = uwVar;
                                if (uwVar3.H.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    org.telegram.messenger.hp messagesController2 = uwVar3.getMessagesController();
                                    Long l11 = l10;
                                    uwVar3.getMessagesController().P4(l11.longValue(), org.telegram.messenger.h10.i(uwVar3.getAccountInstance().a).f(), ip.x0(messagesController2.M0(l11).admin_rights, uwVar3.H.user_admin_rights), null, true, uwVar3, false, true, null, runnable2, new se(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new ci.o2(uwVar, s1Var, l10, adVar, d2Var, 5));
                break;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.fc(t2Var.F, t2Var.J0).e0(str, false);
                        break;
                    }
                } else {
                    t2Var.dismiss();
                    while (i11 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i11).id, passkey.id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        T.presentFragment(passkeysActivity);
                        org.telegram.messenger.g0.i3(new tb0(22, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}

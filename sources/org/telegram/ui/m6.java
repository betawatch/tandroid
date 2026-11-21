package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m6(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        final int i10 = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        final int i11 = 0;
        switch (i7) {
            case 0:
                org.telegram.messenger.camera.i iVar = (org.telegram.messenger.camera.i) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                org.telegram.messenger.g0.r(iVar);
                org.telegram.messenger.g0.g3(iVar);
                break;
            case 1:
                bn bnVar = (bn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                xf xfVar = (xf) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = bnVar.Qb.keySet().iterator();
                    while (it.hasNext() && bnVar.Qb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    bnVar.Qb.put(getwebpagepreview.message, webPage);
                }
                xfVar.a(bool, webPage);
                break;
            case 2:
                final cx cxVar = (cx) obj5;
                ad adVar = (ad) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                final Long l10 = (Long) obj2;
                Utilities.u(0, new bi.m2(cxVar, l10, adVar, g2Var, 12), new x(cxVar, t1Var, l10, 8), new org.telegram.messenger.x10() { // from class: org.telegram.ui.ru
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj6) {
                        switch (i11) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                cx cxVar2 = cxVar;
                                if (cxVar2.H.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User c22 = cxVar2.getMessagesController().c2(Long.valueOf(cxVar2.I));
                                    org.telegram.messenger.mp messagesController = cxVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = cxVar2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.b5(longValue, c22, tL_chatAdminRights, null, false, cxVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new ve(4, runnable));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                cx cxVar3 = cxVar;
                                if (cxVar3.H.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    org.telegram.messenger.mp messagesController2 = cxVar3.getMessagesController();
                                    Long l11 = l10;
                                    cxVar3.getMessagesController().b5(l11.longValue(), org.telegram.messenger.j10.i(cxVar3.getAccountInstance().a).f(), np.x0(messagesController2.O0(l11).admin_rights, cxVar3.H.user_admin_rights), null, true, cxVar3, false, true, null, runnable2, new ve(3, runnable2));
                                    break;
                                }
                        }
                    }
                }, new org.telegram.messenger.x10() { // from class: org.telegram.ui.ru
                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj6) {
                        switch (i10) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                cx cxVar2 = cxVar;
                                if (cxVar2.H.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User c22 = cxVar2.getMessagesController().c2(Long.valueOf(cxVar2.I));
                                    org.telegram.messenger.mp messagesController = cxVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = cxVar2.H;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.b5(longValue, c22, tL_chatAdminRights, null, false, cxVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new ve(4, runnable));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                cx cxVar3 = cxVar;
                                if (cxVar3.H.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    org.telegram.messenger.mp messagesController2 = cxVar3.getMessagesController();
                                    Long l11 = l10;
                                    cxVar3.getMessagesController().b5(l11.longValue(), org.telegram.messenger.j10.i(cxVar3.getAccountInstance().a).f(), np.x0(messagesController2.O0(l11).admin_rights, cxVar3.H.user_admin_rights), null, true, cxVar3, false, true, null, runnable2, new ve(3, runnable2));
                                    break;
                                }
                        }
                    }
                }, new di.n2(cxVar, t1Var, l10, adVar, g2Var, 5));
                break;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.lc(w2Var.F, w2Var.J0).f0(str, false);
                        break;
                    }
                } else {
                    w2Var.dismiss();
                    while (i11 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i11).id, passkey.id)) {
                            passkeys.passkeys.remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        T.presentFragment(passkeysActivity);
                        org.telegram.messenger.g0.h3(new fe0(11, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}

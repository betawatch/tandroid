package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m6(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        final int i11 = 1;
        final int i12 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(n5Var);
                AndroidUtilities.runOnUIThread(n5Var);
                break;
            case 1:
                bo boVar = (bo) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                kg kgVar = (kg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = boVar.lb.keySet().iterator();
                    while (it.hasNext() && boVar.lb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    boVar.lb.put(getwebpagepreview.message, webPage);
                }
                kgVar.run(bool, webPage);
                break;
            case 2:
                final uy uyVar = (uy) obj5;
                ld ldVar = (ld) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.e4(uyVar, l4, ldVar, n2Var, 10), new y(uyVar, b2Var, l4, 6), new Utilities.Callback() { // from class: org.telegram.ui.bw
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i12) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                uy uyVar2 = uyVar;
                                if (uyVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = uyVar2.getMessagesController().getUser(Long.valueOf(uyVar2.H));
                                    MessagesController messagesController = uyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = uyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, uyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new lf(5, runnable));
                                    break;
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                uy uyVar3 = uyVar;
                                if (uyVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = uyVar3.getMessagesController();
                                    Long l10 = l4;
                                    uyVar3.getMessagesController().setUserAdminRole(l10.longValue(), uyVar3.getAccountInstance().getUserConfig().getCurrentUser(), pq.s0(messagesController2.getChat(l10).admin_rights, uyVar3.G.user_admin_rights), null, true, uyVar3, false, true, null, runnable2, new lf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.bw
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i11) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                uy uyVar2 = uyVar;
                                if (uyVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = uyVar2.getMessagesController().getUser(Long.valueOf(uyVar2.H));
                                    MessagesController messagesController = uyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = uyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, uyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new lf(5, runnable));
                                    break;
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                uy uyVar3 = uyVar;
                                if (uyVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = uyVar3.getMessagesController();
                                    Long l10 = l4;
                                    uyVar3.getMessagesController().setUserAdminRole(l10.longValue(), uyVar3.getAccountInstance().getUserConfig().getCurrentUser(), pq.s0(messagesController2.getChat(l10).admin_rights, uyVar3.G.user_admin_rights), null, true, uyVar3, false, true, null, runnable2, new lf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new sa(uyVar, b2Var, l4, ldVar, n2Var, 4));
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.vc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(str, false);
                        break;
                    }
                } else {
                    f3Var.dismiss();
                    while (i12 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i12).id, passkey.id)) {
                            passkeys.passkeys.remove(i12);
                            i12--;
                        }
                        i12++;
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new ml0(i11, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}

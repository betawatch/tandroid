package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q6(Object obj, Object obj2, Object obj3, int i10) {
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
                m4.v0 v0Var = (m4.v0) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(v0Var);
                AndroidUtilities.runOnUIThread(v0Var);
                break;
            case 1:
                un unVar = (un) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                lg lgVar = (lg) obj3;
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
                lgVar.run(bool, webPage);
                break;
            case 2:
                final cy cyVar = (cy) obj5;
                nd ndVar = (nd) obj4;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new di.y2(cyVar, l4, ndVar, r2Var, 11), new y(cyVar, e2Var, l4, 7), new Utilities.Callback() { // from class: org.telegram.ui.mv
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i12) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                cy cyVar2 = cyVar;
                                if (cyVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = cyVar2.getMessagesController().getUser(Long.valueOf(cyVar2.H));
                                    MessagesController messagesController = cyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = cyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, cyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new ff(5, runnable));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                cy cyVar3 = cyVar;
                                if (cyVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = cyVar3.getMessagesController();
                                    Long l10 = l4;
                                    cyVar3.getMessagesController().setUserAdminRole(l10.longValue(), cyVar3.getAccountInstance().getUserConfig().getCurrentUser(), gq.t0(messagesController2.getChat(l10).admin_rights, cyVar3.G.user_admin_rights), null, true, cyVar3, false, true, null, runnable2, new ff(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.mv
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i11) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                cy cyVar2 = cyVar;
                                if (cyVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = cyVar2.getMessagesController().getUser(Long.valueOf(cyVar2.H));
                                    MessagesController messagesController = cyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = cyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, cyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new ff(5, runnable));
                                    break;
                                }
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                cy cyVar3 = cyVar;
                                if (cyVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = cyVar3.getMessagesController();
                                    Long l10 = l4;
                                    cyVar3.getMessagesController().setUserAdminRole(l10.longValue(), cyVar3.getAccountInstance().getUserConfig().getCurrentUser(), gq.t0(messagesController2.getChat(l10).admin_rights, cyVar3.G.user_admin_rights), null, true, cyVar3, false, true, null, runnable2, new ff(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new bi.b3(cyVar, e2Var, l4, ndVar, r2Var, 5));
                break;
            default:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.wc(k3Var.topBulletinContainer, k3Var.getResourcesProvider()).f0(str, false);
                        break;
                    }
                } else {
                    k3Var.dismiss();
                    while (i12 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i12).id, passkey.id)) {
                            passkeys.passkeys.remove(i12);
                            i12--;
                        }
                        i12++;
                    }
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new wb0(28, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}

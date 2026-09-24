package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l6(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i10 = this.a;
        int i11 = 7;
        final int i12 = 1;
        final int i13 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(l5Var);
                AndroidUtilities.runOnUIThread(l5Var);
                break;
            case 1:
                wn wnVar = (wn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                pg pgVar = (pg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = wnVar.lb.keySet().iterator();
                    while (it.hasNext() && wnVar.lb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    wnVar.lb.put(getwebpagepreview.message, webPage);
                }
                pgVar.run(bool, webPage);
                break;
            case 2:
                final qy qyVar = (qy) obj5;
                ld ldVar = (ld) obj4;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.e4(qyVar, l4, ldVar, m2Var, 11), new z(qyVar, a2Var, l4, i11), new Utilities.Callback() { // from class: org.telegram.ui.xv
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i13) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                qy qyVar2 = qyVar;
                                if (qyVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = qyVar2.getMessagesController().getUser(Long.valueOf(qyVar2.H));
                                    MessagesController messagesController = qyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = qyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, qyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new kf(5, runnable));
                                    break;
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                qy qyVar3 = qyVar;
                                if (qyVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = qyVar3.getMessagesController();
                                    Long l10 = l4;
                                    qyVar3.getMessagesController().setUserAdminRole(l10.longValue(), qyVar3.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(l10).admin_rights, qyVar3.G.user_admin_rights), null, true, qyVar3, false, true, null, runnable2, new kf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.xv
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i12) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                qy qyVar2 = qyVar;
                                if (qyVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = qyVar2.getMessagesController().getUser(Long.valueOf(qyVar2.H));
                                    MessagesController messagesController = qyVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = qyVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, qyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new kf(5, runnable));
                                    break;
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                qy qyVar3 = qyVar;
                                if (qyVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = qyVar3.getMessagesController();
                                    Long l10 = l4;
                                    qyVar3.getMessagesController().setUserAdminRole(l10.longValue(), qyVar3.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(l10).admin_rights, qyVar3.G.user_admin_rights), null, true, qyVar3, false, true, null, runnable2, new kf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new sa(qyVar, a2Var, l4, ldVar, m2Var, 4));
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.yc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0(str, false);
                        break;
                    }
                } else {
                    e3Var.dismiss();
                    while (i13 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i13).id, passkey.id)) {
                            passkeys.passkeys.remove(i13);
                            i13--;
                        }
                        i13++;
                    }
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new xi0(i11, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}

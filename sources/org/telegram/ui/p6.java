package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p6(Object obj, Object obj2, Object obj3, int i10) {
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
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(cVar);
                AndroidUtilities.runOnUIThread(cVar);
                break;
            case 1:
                xn xnVar = (xn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                eg egVar = (eg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = xnVar.jb.keySet().iterator();
                    while (it.hasNext() && xnVar.jb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    xnVar.jb.put(getwebpagepreview.message, webPage);
                }
                egVar.run(bool, webPage);
                break;
            case 2:
                final py pyVar = (py) obj5;
                nd ndVar = (nd) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                final Long l10 = (Long) obj2;
                Utilities.doCallbacks(new hg.c1(pyVar, l10, ndVar, p2Var), new a0(pyVar, d2Var, l10, 6), new Utilities.Callback() { // from class: org.telegram.ui.yv
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i12) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                py pyVar2 = pyVar;
                                if (pyVar2.D.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = pyVar2.getMessagesController().getUser(Long.valueOf(pyVar2.E));
                                    MessagesController messagesController = pyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = pyVar2.D;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, pyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new gf(5, runnable));
                                    break;
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                py pyVar3 = pyVar;
                                if (pyVar3.D.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = pyVar3.getMessagesController();
                                    Long l11 = l10;
                                    pyVar3.getMessagesController().setUserAdminRole(l11.longValue(), pyVar3.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(l11).admin_rights, pyVar3.D.user_admin_rights), null, true, pyVar3, false, true, null, runnable2, new gf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.yv
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i11) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                py pyVar2 = pyVar;
                                if (pyVar2.D.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = pyVar2.getMessagesController().getUser(Long.valueOf(pyVar2.E));
                                    MessagesController messagesController = pyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = pyVar2.D;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, pyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new gf(5, runnable));
                                    break;
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                py pyVar3 = pyVar;
                                if (pyVar3.D.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = pyVar3.getMessagesController();
                                    Long l11 = l10;
                                    pyVar3.getMessagesController().setUserAdminRole(l11.longValue(), pyVar3.getAccountInstance().getUserConfig().getCurrentUser(), kq.s0(messagesController2.getChat(l11).admin_rights, pyVar3.D.user_admin_rights), null, true, pyVar3, false, true, null, runnable2, new gf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new mh.f2(pyVar, d2Var, l10, ndVar, p2Var, 5));
                break;
            default:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0(str, false);
                        break;
                    }
                } else {
                    h3Var.dismiss();
                    while (i12 < passkeys.passkeys.size()) {
                        if (TextUtils.equals(passkeys.passkeys.get(i12).id, passkey.id)) {
                            passkeys.passkeys.remove(i12);
                            i12--;
                        }
                        i12++;
                    }
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                        U.presentFragment(passkeysActivity);
                        AndroidUtilities.runOnUIThread(new ue0(17, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}

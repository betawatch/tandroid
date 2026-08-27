package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar);
                break;
            case 1:
                rn rnVar = (rn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                bg bgVar = (bg) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = rnVar.ib.keySet().iterator();
                    while (it.hasNext() && rnVar.ib.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    rnVar.ib.put(getwebpagepreview.message, webPage);
                }
                bgVar.run(bool, webPage);
                break;
            case 2:
                final gy gyVar = (gy) obj5;
                id idVar = (id) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                final Long l10 = (Long) obj2;
                Utilities.doCallbacks(new cg.e1(gyVar, l10, idVar, n2Var), new b0(gyVar, b2Var, l10, 6), new Utilities.Callback() { // from class: org.telegram.ui.rv
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i12) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                gy gyVar2 = gyVar;
                                if (gyVar2.C.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = gyVar2.getMessagesController().getUser(Long.valueOf(gyVar2.D));
                                    MessagesController messagesController = gyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = gyVar2.C;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, gyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new bf(5, runnable));
                                    break;
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                gy gyVar3 = gyVar;
                                if (gyVar3.C.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = gyVar3.getMessagesController();
                                    Long l11 = l10;
                                    gyVar3.getMessagesController().setUserAdminRole(l11.longValue(), gyVar3.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(l11).admin_rights, gyVar3.C.user_admin_rights), null, true, gyVar3, false, true, null, runnable2, new bf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new Utilities.Callback() { // from class: org.telegram.ui.rv
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i11) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                gy gyVar2 = gyVar;
                                if (gyVar2.C.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = gyVar2.getMessagesController().getUser(Long.valueOf(gyVar2.D));
                                    MessagesController messagesController = gyVar2.getMessagesController();
                                    long longValue = l10.longValue();
                                    TLRPC.RequestPeerType requestPeerType = gyVar2.C;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, gyVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new bf(5, runnable));
                                    break;
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                gy gyVar3 = gyVar;
                                if (gyVar3.C.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = gyVar3.getMessagesController();
                                    Long l11 = l10;
                                    gyVar3.getMessagesController().setUserAdminRole(l11.longValue(), gyVar3.getAccountInstance().getUserConfig().getCurrentUser(), dq.s0(messagesController2.getChat(l11).admin_rights, gyVar3.C.user_admin_rights), null, true, gyVar3, false, true, null, runnable2, new bf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new hh.i2(gyVar, b2Var, l10, idVar, n2Var, 5));
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0(str, false);
                        break;
                    }
                } else {
                    e3Var.dismiss();
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
                        AndroidUtilities.runOnUIThread(new ff0(13, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}

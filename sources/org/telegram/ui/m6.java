package org.telegram.ui;

import android.text.TextUtils;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) obj3;
                ((float[]) obj5)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj4)[0] = ((Boolean) obj2).booleanValue();
                AndroidUtilities.cancelRunOnUIThread(m5Var);
                AndroidUtilities.runOnUIThread(m5Var);
                break;
            case 1:
                xn xnVar = (xn) obj5;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) obj4;
                ig igVar = (ig) obj3;
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = xnVar.lb.keySet().iterator();
                    while (it.hasNext() && xnVar.lb.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    xnVar.lb.put(getwebpagepreview.message, webPage);
                }
                igVar.run(bool, webPage);
                break;
            case 2:
                final ry ryVar = (ry) obj5;
                ld ldVar = (ld) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                final Long l4 = (Long) obj2;
                Utilities.doCallbacks(new ai.e4(ryVar, l4, ldVar, n2Var, 11), new z(ryVar, b2Var, l4, 7), new Utilities.Callback() { // from class: org.telegram.ui.yv
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj6) {
                        switch (i12) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                ry ryVar2 = ryVar;
                                if (ryVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = ryVar2.getMessagesController().getUser(Long.valueOf(ryVar2.H));
                                    MessagesController messagesController = ryVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = ryVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, ryVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new lf(5, runnable));
                                    break;
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ry ryVar3 = ryVar;
                                if (ryVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = ryVar3.getMessagesController();
                                    Long l10 = l4;
                                    ryVar3.getMessagesController().setUserAdminRole(l10.longValue(), ryVar3.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(l10).admin_rights, ryVar3.G.user_admin_rights), null, true, ryVar3, false, true, null, runnable2, new lf(4, runnable2));
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
                                ry ryVar2 = ryVar;
                                if (ryVar2.G.bot_admin_rights == null) {
                                    runnable.run();
                                    break;
                                } else {
                                    TLRPC.User user = ryVar2.getMessagesController().getUser(Long.valueOf(ryVar2.H));
                                    MessagesController messagesController = ryVar2.getMessagesController();
                                    long longValue = l4.longValue();
                                    TLRPC.RequestPeerType requestPeerType = ryVar2.G;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(longValue, user, tL_chatAdminRights, null, false, ryVar2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new lf(5, runnable));
                                    break;
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                ry ryVar3 = ryVar;
                                if (ryVar3.G.user_admin_rights == null) {
                                    runnable2.run();
                                    break;
                                } else {
                                    MessagesController messagesController2 = ryVar3.getMessagesController();
                                    Long l10 = l4;
                                    ryVar3.getMessagesController().setUserAdminRole(l10.longValue(), ryVar3.getAccountInstance().getUserConfig().getCurrentUser(), lq.s0(messagesController2.getChat(l10).admin_rights, ryVar3.G.user_admin_rights), null, true, ryVar3, false, true, null, runnable2, new lf(4, runnable2));
                                    break;
                                }
                        }
                    }
                }, new sa(ryVar, b2Var, l4, ldVar, n2Var, 4));
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj5;
                TL_account.Passkey passkey = (TL_account.Passkey) obj4;
                String str = (String) obj3;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(str, false);
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
                        AndroidUtilities.runOnUIThread(new gl0(i11, passkeysActivity, passkey), 150L);
                        break;
                    }
                }
                break;
        }
    }
}

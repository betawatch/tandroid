package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fs extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ js a;

    public fs(js jsVar) {
        this.a = jsVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        js jsVar = this.a;
        if (i10 == -1) {
            jsVar.finishFragment();
            return;
        }
        if (i10 != 1 || jsVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.D));
        TLRPC.UserFull userFull = jsVar.getMessagesController().getUserFull(jsVar.D);
        user.first_name = jsVar.b.getText().toString();
        user.last_name = jsVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = jsVar.d.getTextWithEntities();
        jsVar.getMessagesController().putUser(user, false);
        jsVar.getContactsController().addContact(user, textWithEntities, jsVar.G && jsVar.T);
        i11 = ((org.telegram.ui.ActionBar.n2) jsVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + jsVar.D, 3).commit();
        jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(jsVar.D));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.n2) jsVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        jsVar.finishFragment();
        is isVar = jsVar.K;
        if (isVar != null) {
            isVar.c();
        }
    }
}

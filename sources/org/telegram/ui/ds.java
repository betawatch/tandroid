package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ds extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ hs a;

    public ds(hs hsVar) {
        this.a = hsVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        hs hsVar = this.a;
        if (i10 == -1) {
            hsVar.finishFragment();
            return;
        }
        if (i10 != 1 || hsVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
        TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.H);
        user.first_name = hsVar.b.getText().toString();
        user.last_name = hsVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = hsVar.d.getTextWithEntities();
        hsVar.getMessagesController().putUser(user, false);
        hsVar.getContactsController().addContact(user, textWithEntities, hsVar.K && hsVar.X);
        i11 = ((org.telegram.ui.ActionBar.n2) hsVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + hsVar.H, 3).commit();
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(hsVar.H));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.n2) hsVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        hsVar.finishFragment();
        gs gsVar = hsVar.O;
        if (gsVar != null) {
            gsVar.c();
        }
    }
}

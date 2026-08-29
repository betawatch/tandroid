package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ds extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ hs a;

    public ds(hs hsVar) {
        this.a = hsVar;
    }

    @Override // org.telegram.ui.ActionBar.k
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
        TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
        TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.D);
        user.first_name = hsVar.b.getText().toString();
        user.last_name = hsVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = hsVar.d.getTextWithEntities();
        hsVar.getMessagesController().putUser(user, false);
        hsVar.getContactsController().addContact(user, textWithEntities, hsVar.G && hsVar.T);
        i11 = ((org.telegram.ui.ActionBar.o2) hsVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + hsVar.D, 3).commit();
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(hsVar.D));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.o2) hsVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        hsVar.finishFragment();
        gs gsVar = hsVar.K;
        if (gsVar != null) {
            gsVar.b();
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ks extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ os a;

    public ks(os osVar) {
        this.a = osVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        os osVar = this.a;
        if (i10 == -1) {
            osVar.finishFragment();
            return;
        }
        if (i10 != 1 || osVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = osVar.getMessagesController().getUser(Long.valueOf(osVar.E));
        TLRPC.UserFull userFull = osVar.getMessagesController().getUserFull(osVar.E);
        user.first_name = osVar.b.getText().toString();
        user.last_name = osVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = osVar.d.getTextWithEntities();
        osVar.getMessagesController().putUser(user, false);
        osVar.getContactsController().addContact(user, textWithEntities, osVar.H && osVar.U);
        i11 = ((org.telegram.ui.ActionBar.p2) osVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + osVar.E, 3).commit();
        osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(osVar.E));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.p2) osVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        osVar.finishFragment();
        ns nsVar = osVar.L;
        if (nsVar != null) {
            nsVar.a();
        }
    }
}

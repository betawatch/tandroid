package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class is extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ms a;

    public is(ms msVar) {
        this.a = msVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        ms msVar = this.a;
        if (i10 == -1) {
            msVar.finishFragment();
            return;
        }
        if (i10 != 1 || msVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = msVar.getMessagesController().getUser(Long.valueOf(msVar.H));
        TLRPC.UserFull userFull = msVar.getMessagesController().getUserFull(msVar.H);
        user.first_name = msVar.b.getText().toString();
        user.last_name = msVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = msVar.d.getTextWithEntities();
        msVar.getMessagesController().putUser(user, false);
        msVar.getContactsController().addContact(user, textWithEntities, msVar.K && msVar.X);
        i11 = ((org.telegram.ui.ActionBar.m2) msVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + msVar.H, 3).commit();
        msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(msVar.H));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.m2) msVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        msVar.finishFragment();
        ls lsVar = msVar.O;
        if (lsVar != null) {
            lsVar.b();
        }
    }
}

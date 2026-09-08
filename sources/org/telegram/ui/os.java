package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class os extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ss a;

    public os(ss ssVar) {
        this.a = ssVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        ss ssVar = this.a;
        if (i10 == -1) {
            ssVar.finishFragment();
            return;
        }
        if (i10 != 1 || ssVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
        TLRPC.UserFull userFull = ssVar.getMessagesController().getUserFull(ssVar.H);
        user.first_name = ssVar.b.getText().toString();
        user.last_name = ssVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = ssVar.d.getTextWithEntities();
        ssVar.getMessagesController().putUser(user, false);
        ssVar.getContactsController().addContact(user, textWithEntities, ssVar.K && ssVar.X);
        i11 = ((org.telegram.ui.ActionBar.n2) ssVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + ssVar.H, 3).commit();
        ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(ssVar.H));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.n2) ssVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        ssVar.finishFragment();
        rs rsVar = ssVar.O;
        if (rsVar != null) {
            rsVar.c();
        }
    }
}

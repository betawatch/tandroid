package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ps extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ts a;

    public ps(ts tsVar) {
        this.a = tsVar;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        int i12;
        ts tsVar = this.a;
        if (i10 == -1) {
            tsVar.finishFragment();
            return;
        }
        if (i10 != 1 || tsVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
        TLRPC.UserFull userFull = tsVar.getMessagesController().getUserFull(tsVar.H);
        user.first_name = tsVar.b.getText().toString();
        user.last_name = tsVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = tsVar.d.getTextWithEntities();
        tsVar.getMessagesController().putUser(user, false);
        tsVar.getContactsController().addContact(user, textWithEntities, tsVar.K && tsVar.X);
        i11 = ((org.telegram.ui.ActionBar.p2) tsVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + tsVar.H, 3).commit();
        tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(tsVar.H));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.p2) tsVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        tsVar.finishFragment();
        ss ssVar = tsVar.O;
        if (ssVar != null) {
            ssVar.b();
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ls extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ps a;

    public ls(ps psVar) {
        this.a = psVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        ps psVar = this.a;
        if (i10 == -1) {
            psVar.finishFragment();
            return;
        }
        if (i10 != 1 || psVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
        TLRPC.UserFull userFull = psVar.getMessagesController().getUserFull(psVar.E);
        user.first_name = psVar.b.getText().toString();
        user.last_name = psVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = psVar.d.getTextWithEntities();
        psVar.getMessagesController().putUser(user, false);
        psVar.getContactsController().addContact(user, textWithEntities, psVar.H && psVar.U);
        i11 = ((org.telegram.ui.ActionBar.p2) psVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + psVar.E, 3).commit();
        psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(psVar.E));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.p2) psVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        psVar.finishFragment();
        os osVar = psVar.L;
        if (osVar != null) {
            osVar.a();
        }
    }
}

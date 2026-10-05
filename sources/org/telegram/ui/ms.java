package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ms extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ qs a;

    public ms(qs qsVar) {
        this.a = qsVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        qs qsVar = this.a;
        if (i10 == -1) {
            qsVar.finishFragment();
            return;
        }
        if (i10 != 1 || qsVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = qsVar.getMessagesController().getUser(Long.valueOf(qsVar.H));
        TLRPC.UserFull userFull = qsVar.getMessagesController().getUserFull(qsVar.H);
        user.first_name = qsVar.b.getText().toString();
        user.last_name = qsVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = qsVar.d.getTextWithEntities();
        qsVar.getMessagesController().putUser(user, false);
        qsVar.getContactsController().addContact(user, textWithEntities, qsVar.K && qsVar.X);
        i11 = ((org.telegram.ui.ActionBar.n2) qsVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + qsVar.H, 3).commit();
        qsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        qsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(qsVar.H));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.n2) qsVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            qsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        qsVar.finishFragment();
        ps psVar = qsVar.O;
        if (psVar != null) {
            psVar.a();
        }
    }
}

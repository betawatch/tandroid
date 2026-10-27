package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hs extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ls a;

    public hs(ls lsVar) {
        this.a = lsVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        ls lsVar = this.a;
        if (i10 == -1) {
            lsVar.finishFragment();
            return;
        }
        if (i10 != 1 || lsVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = lsVar.getMessagesController().getUser(Long.valueOf(lsVar.H));
        TLRPC.UserFull userFull = lsVar.getMessagesController().getUserFull(lsVar.H);
        user.first_name = lsVar.b.getText().toString();
        user.last_name = lsVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = lsVar.d.getTextWithEntities();
        lsVar.getMessagesController().putUser(user, false);
        lsVar.getContactsController().addContact(user, textWithEntities, lsVar.K && lsVar.X);
        i11 = ((org.telegram.ui.ActionBar.r2) lsVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + lsVar.H, 3).commit();
        lsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        lsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(lsVar.H));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.r2) lsVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            lsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        lsVar.finishFragment();
        ks ksVar = lsVar.O;
        if (ksVar != null) {
            ksVar.a();
        }
    }
}

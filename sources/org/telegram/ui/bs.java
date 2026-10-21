package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class bs extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ fs a;

    public bs(fs fsVar) {
        this.a = fsVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        fs fsVar = this.a;
        if (i10 == -1) {
            fsVar.finishFragment();
            return;
        }
        if (i10 != 1 || fsVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = fsVar.getMessagesController().getUser(Long.valueOf(fsVar.H));
        TLRPC.UserFull userFull = fsVar.getMessagesController().getUserFull(fsVar.H);
        user.first_name = fsVar.b.getText().toString();
        user.last_name = fsVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = fsVar.d.getTextWithEntities();
        fsVar.getMessagesController().putUser(user, false);
        fsVar.getContactsController().addContact(user, textWithEntities, fsVar.K && fsVar.X);
        i11 = ((org.telegram.ui.ActionBar.n2) fsVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + fsVar.H, 3).commit();
        fsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        fsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(fsVar.H));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.n2) fsVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            fsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        fsVar.finishFragment();
        es esVar = fsVar.O;
        if (esVar != null) {
            esVar.c();
        }
    }
}

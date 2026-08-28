package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class es extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ is a;

    public es(is isVar) {
        this.a = isVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        int i10;
        int i11;
        is isVar = this.a;
        if (i9 == -1) {
            isVar.finishFragment();
            return;
        }
        if (i9 != 1 || isVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
        TLRPC.UserFull userFull = isVar.getMessagesController().getUserFull(isVar.D);
        user.first_name = isVar.b.getText().toString();
        user.last_name = isVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = isVar.d.getTextWithEntities();
        isVar.getMessagesController().putUser(user, false);
        isVar.getContactsController().addContact(user, textWithEntities, isVar.G && isVar.T);
        i10 = ((org.telegram.ui.ActionBar.o2) isVar).currentAccount;
        MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_bar_vis3" + isVar.D, 3).commit();
        isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(isVar.D));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i11 = ((org.telegram.ui.ActionBar.o2) isVar).currentAccount;
            MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
            isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        isVar.finishFragment();
        hs hsVar = isVar.K;
        if (hsVar != null) {
            hsVar.c();
        }
    }
}

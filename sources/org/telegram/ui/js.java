package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class js extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ns a;

    public js(ns nsVar) {
        this.a = nsVar;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        ns nsVar = this.a;
        if (i10 == -1) {
            nsVar.finishFragment();
            return;
        }
        if (i10 != 1 || nsVar.b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.H));
        TLRPC.UserFull userFull = nsVar.getMessagesController().getUserFull(nsVar.H);
        user.first_name = nsVar.b.getText().toString();
        user.last_name = nsVar.c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = nsVar.d.getTextWithEntities();
        nsVar.getMessagesController().putUser(user, false);
        nsVar.getContactsController().addContact(user, textWithEntities, nsVar.K && nsVar.X);
        i11 = ((org.telegram.ui.ActionBar.n2) nsVar).currentAccount;
        MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + nsVar.H, 3).commit();
        nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(nsVar.H));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= TLObject.FLAG_22;
                userFull.note = textWithEntities;
            }
            i12 = ((org.telegram.ui.ActionBar.n2) nsVar).currentAccount;
            MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
            nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.id), userFull);
        }
        nsVar.finishFragment();
        ms msVar = nsVar.O;
        if (msVar != null) {
            msVar.b();
        }
    }
}

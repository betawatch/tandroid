package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cm extends fu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ dm c;

    public cm(dm dmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = dmVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return this.c.a.N.Ca.E(this.a, fileLocation, i10, z4, false);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        lm lmVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            zn znVar = lmVar.N;
            bj bjVar = new bj(messageObject, 4);
            org.telegram.ui.ActionBar.e5 parentLayout = znVar.getParentLayout();
            int currentAccount = znVar.getCurrentAccount();
            org.telegram.ui.Components.x40 x40Var = new org.telegram.ui.Components.x40(0, true, true);
            x40Var.a = znVar;
            x40Var.t(photoEntry);
            x40Var.b = new gg.a0(currentAccount, bjVar, parentLayout, x40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        lmVar.N.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new dg.d3(29, this, messageObject));
    }
}

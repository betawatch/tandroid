package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class am extends fu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ bm c;

    public am(bm bmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = bmVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return this.c.a.N.Ca.E(this.a, fileLocation, i10, z4, false);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        jm jmVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            xn xnVar = jmVar.N;
            zi ziVar = new zi(messageObject, 4);
            org.telegram.ui.ActionBar.f5 parentLayout = xnVar.getParentLayout();
            int currentAccount = xnVar.getCurrentAccount();
            org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
            y40Var.a = xnVar;
            y40Var.t(photoEntry);
            y40Var.b = new hg.a0(currentAccount, ziVar, parentLayout, y40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        jmVar.N.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new eg.b3(29, this, messageObject));
    }
}

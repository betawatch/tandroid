package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hm extends zu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ im c;

    public hm(im imVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = imVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.c.a.Q.Ga.E(this.a, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        rm rmVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            fo foVar = rmVar.Q;
            gj gjVar = new gj(messageObject, 5);
            org.telegram.ui.ActionBar.b5 parentLayout = foVar.getParentLayout();
            int currentAccount = foVar.getCurrentAccount();
            org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(0, true, true);
            i50Var.a = foVar;
            i50Var.s(photoEntry);
            i50Var.b = new ia(currentAccount, gjVar, parentLayout, i50Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        rmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new bi.m1(29, this, messageObject));
    }
}

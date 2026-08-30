package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class am extends yt0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ bm c;

    public am(bm bmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = bmVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return this.c.a.N.Ca.E(this.a, fileLocation, i10, z4, false);
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        jm jmVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            xn xnVar = jmVar.N;
            zi ziVar = new zi(messageObject, 4);
            org.telegram.ui.ActionBar.e5 parentLayout = xnVar.getParentLayout();
            int currentAccount = xnVar.getCurrentAccount();
            org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(0, true, true);
            w40Var.a = xnVar;
            w40Var.t(photoEntry);
            w40Var.b = new gg.a0(currentAccount, ziVar, parentLayout, w40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        jmVar.N.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new dg.d3(29, this, messageObject));
    }
}

package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class em extends su0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ fm c;

    public em(fm fmVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = fmVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.c.a.Q.Fa.E(this.a, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        om omVar = this.c.a;
        MessageObject messageObject = this.a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            co coVar = omVar.Q;
            dj djVar = new dj(messageObject, 4);
            org.telegram.ui.ActionBar.d5 parentLayout = coVar.getParentLayout();
            int currentAccount = coVar.getCurrentAccount();
            org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(0, true, true);
            u40Var.a = coVar;
            u40Var.t(photoEntry);
            u40Var.b = new da(currentAccount, djVar, parentLayout, u40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        omVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new bi.m1(29, this, messageObject));
    }
}

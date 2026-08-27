package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ml extends st0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ rn c;

    public ml(rn rnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = rnVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return rn.A1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean O() {
        rn rnVar = this.c;
        if (rnVar.U == null || !rnVar.x9()) {
            return false;
        }
        rnVar.U.P();
        return true;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final MessageObject U() {
        MessageObject messageObject = this.c.l5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void e(CharSequence charSequence) {
        this.c.U.e1(charSequence, false);
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        rn rnVar = this.c;
        if (rnVar.l5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            rnVar.s(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            rnVar.U.d0();
        }
    }
}

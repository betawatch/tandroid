package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class pl extends bu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ sn c;

    public pl(sn snVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = snVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return sn.E1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean P() {
        sn snVar = this.c;
        if (snVar.Y == null || !snVar.C9()) {
            return false;
        }
        snVar.Y.N();
        return true;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final MessageObject V() {
        MessageObject messageObject = this.c.p5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void e(CharSequence charSequence) {
        this.c.Y.c1(charSequence, false);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        sn snVar = this.c;
        if (snVar.p5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            snVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            snVar.Y.b0();
        }
    }
}

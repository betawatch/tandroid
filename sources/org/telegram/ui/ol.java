package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ol extends cu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ sn c;

    public ol(sn snVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = snVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return sn.E1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean P() {
        sn snVar = this.c;
        if (snVar.Y == null || !snVar.C9()) {
            return false;
        }
        snVar.Y.M();
        return true;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final MessageObject V() {
        MessageObject messageObject = this.c.B5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void e(CharSequence charSequence) {
        this.c.Y.c1(charSequence, false);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        sn snVar = this.c;
        if (snVar.B5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            snVar.s(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            snVar.Y.a0();
        }
    }
}

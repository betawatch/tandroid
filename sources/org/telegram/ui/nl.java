package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nl extends pt0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ tn c;

    public nl(tn tnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = tnVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return tn.A1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean O() {
        tn tnVar = this.c;
        if (tnVar.U == null || !tnVar.x9()) {
            return false;
        }
        tnVar.U.P();
        return true;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final MessageObject U() {
        MessageObject messageObject = this.c.l5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void e(CharSequence charSequence) {
        this.c.U.f1(charSequence, false);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        tn tnVar = this.c;
        if (tnVar.l5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            tnVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            tnVar.U.d0();
        }
    }
}

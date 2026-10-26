package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pl extends gu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ un c;

    public pl(un unVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = unVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.G1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean P() {
        un unVar = this.c;
        if (unVar.Y == null || !unVar.F9()) {
            return false;
        }
        unVar.Y.M();
        return true;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final MessageObject V() {
        MessageObject messageObject = this.c.B5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void e(CharSequence charSequence) {
        this.c.Y.c1(charSequence, false);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        un unVar = this.c;
        if (unVar.B5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            unVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            unVar.Y.a0();
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class am extends av0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ fo c;

    public am(fo foVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = foVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return fo.E1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean O() {
        fo foVar = this.c;
        if (foVar.Y == null || !foVar.C9()) {
            return false;
        }
        foVar.Y.N();
        return true;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final MessageObject U() {
        MessageObject messageObject = this.c.p5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void e(CharSequence charSequence) {
        this.c.Y.d1(charSequence, false);
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        fo foVar = this.c;
        if (foVar.p5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            foVar.s(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            foVar.Y.b0();
        }
    }
}

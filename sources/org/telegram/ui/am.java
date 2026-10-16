package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class am extends zu0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ fo c;

    public am(fo foVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = foVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return fo.E1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean P() {
        fo foVar = this.c;
        if (foVar.Y == null || !foVar.C9()) {
            return false;
        }
        foVar.Y.N();
        return true;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final MessageObject V() {
        MessageObject messageObject = this.c.p5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final void e(CharSequence charSequence) {
        this.c.Y.c1(charSequence, false);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
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

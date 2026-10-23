package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class nl extends zt0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ qn c;

    public nl(qn qnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = qnVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return qn.E1(this.c, this.a, null, i10, z10, true);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean P() {
        qn qnVar = this.c;
        if (qnVar.Y == null || !qnVar.C9()) {
            return false;
        }
        qnVar.Y.N();
        return true;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final MessageObject V() {
        MessageObject messageObject = this.c.p5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void e(CharSequence charSequence) {
        this.c.Y.c1(charSequence, false);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        qn qnVar = this.c;
        if (qnVar.p5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            qnVar.s(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        } else {
            qnVar.Y.b0();
        }
    }
}

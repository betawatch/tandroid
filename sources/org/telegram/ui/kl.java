package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kl extends rt0 {
    public final /* synthetic */ MessageObject a;
    public final /* synthetic */ MediaController.PhotoEntry b;
    public final /* synthetic */ qn c;

    public kl(qn qnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.c = qnVar;
        this.a = messageObject;
        this.b = photoEntry;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        return qn.A1(this.c, this.a, null, i9, z10, true);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean O() {
        qn qnVar = this.c;
        if (qnVar.U == null || !qnVar.x9()) {
            return false;
        }
        qnVar.U.O();
        return true;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final MessageObject U() {
        MessageObject messageObject = this.c.l5;
        MessageObject messageObject2 = this.a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void e(CharSequence charSequence) {
        this.c.U.f1(charSequence, false);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        qn qnVar = this.c;
        if (qnVar.l5 != this.a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.b;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null) {
            qnVar.r(photoEntry, videoEditedInfo, z10, i10, 0, z11, 0L);
        } else {
            qnVar.U.c0();
        }
    }
}

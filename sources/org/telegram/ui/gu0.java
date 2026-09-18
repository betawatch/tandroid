package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gu0 extends vu0 {
    public final ImageReceiver.BitmapHolder a;
    public final /* synthetic */ dv0 b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ MediaController.PhotoEntry d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public gu0(PhotoViewer photoViewer, dv0 dv0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.g = photoViewer;
        this.b = dv0Var;
        this.c = messageObject;
        this.d = photoEntry;
        this.e = z10;
        this.f = z11;
        this.a = photoViewer.C4.getBitmapSafe();
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        dv0 dv0Var = this.b;
        if (dv0Var != null) {
            return dv0Var.E(this.c, null, 0, z10, false);
        }
        return null;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void L(VideoEditedInfo videoEditedInfo) {
        MediaController.PhotoEntry photoEntry = this.d;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null || !TextUtils.isEmpty(photoEntry.caption)) {
            c0(videoEditedInfo, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final MessageObject U() {
        return this.c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z10, int i10, boolean z11, boolean z12) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.l4 != null) {
            rn rnVar = null;
            MessageObject messageObject = this.c;
            MessageObject messageObject2 = z11 ? messageObject : null;
            MediaController.PhotoEntry photoEntry = this.d;
            if (messageObject2 != null && !TextUtils.isEmpty(photoEntry.caption)) {
                messageObject2.editingMessage = photoEntry.caption;
                messageObject2.editingMessageEntities = photoEntry.entities;
            }
            if (z11 || messageObject == null) {
                bo boVar = photoViewer.l4;
                messageObject = boVar.n5;
                rnVar = boVar.l5;
            }
            rn rnVar2 = rnVar;
            MessageObject messageObject3 = messageObject;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.l4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.l4.a();
                    bo boVar2 = photoViewer.l4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, boVar2.X3, null, rnVar2, photoEntry.entities, photoEntry.ttl, messageObject2, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, boVar2.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.g5);
                    return;
                }
                MessageObject messageObject4 = messageObject2;
                AccountInstance accountInstance2 = photoViewer.l4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.l4.a();
                bo boVar3 = photoViewer.l4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, boVar3.X3, null, rnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, boVar3.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.g5);
                return;
            }
            MessageObject messageObject5 = messageObject2;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.l4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.l4.a();
                bo boVar4 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, boVar4.X3, null, rnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, boVar4.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.g5);
                return;
            }
            if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.l4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.l4.a();
                bo boVar5 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, boVar5.X3, null, rnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, boVar5.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.g5);
            }
        }
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.a;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        c0(videoEditedInfo, z10, i11, false, z11);
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean r() {
        return this.b != null && this.f;
    }
}

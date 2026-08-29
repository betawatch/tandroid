package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class at0 extends pt0 {
    public final ImageReceiver.BitmapHolder a;
    public final /* synthetic */ xt0 b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ MediaController.PhotoEntry d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public at0(PhotoViewer photoViewer, xt0 xt0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.g = photoViewer;
        this.b = xt0Var;
        this.c = messageObject;
        this.d = photoEntry;
        this.e = z10;
        this.f = z11;
        this.a = photoViewer.y4.getBitmapSafe();
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        xt0 xt0Var = this.b;
        if (xt0Var != null) {
            return xt0Var.E(this.c, null, 0, z10, false);
        }
        return null;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void L(VideoEditedInfo videoEditedInfo) {
        MediaController.PhotoEntry photoEntry = this.d;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null || !TextUtils.isEmpty(photoEntry.caption)) {
            c0(videoEditedInfo, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final MessageObject U() {
        return this.c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z10, int i10, boolean z11, boolean z12) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.h4 != null) {
            jn jnVar = null;
            MessageObject messageObject = this.c;
            MessageObject messageObject2 = z11 ? messageObject : null;
            MediaController.PhotoEntry photoEntry = this.d;
            if (messageObject2 != null && !TextUtils.isEmpty(photoEntry.caption)) {
                messageObject2.editingMessage = photoEntry.caption;
                messageObject2.editingMessageEntities = photoEntry.entities;
            }
            if (z11 || messageObject == null) {
                tn tnVar = photoViewer.h4;
                messageObject = tnVar.j5;
                jnVar = tnVar.h5;
            }
            jn jnVar2 = jnVar;
            MessageObject messageObject3 = messageObject;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.h4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.h4.a();
                    tn tnVar2 = photoViewer.h4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, tnVar2.T3, null, jnVar2, photoEntry.entities, photoEntry.ttl, messageObject2, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, tnVar2.C8(), 0L, 0L, photoViewer.h4.N8(), photoViewer.h4.c5);
                    return;
                }
                MessageObject messageObject4 = messageObject2;
                AccountInstance accountInstance2 = photoViewer.h4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.h4.a();
                tn tnVar3 = photoViewer.h4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, tnVar3.T3, null, jnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, tnVar3.C8(), 0L, 0L, photoViewer.h4.N8(), photoViewer.h4.c5);
                return;
            }
            MessageObject messageObject5 = messageObject2;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.h4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.h4.a();
                tn tnVar4 = photoViewer.h4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, tnVar4.T3, null, jnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, tnVar4.C8(), 0L, 0L, photoViewer.h4.N8(), photoViewer.h4.c5);
                return;
            }
            if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.h4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.h4.a();
                tn tnVar5 = photoViewer.h4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, tnVar5.T3, null, jnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, tnVar5.C8(), 0L, 0L, photoViewer.h4.N8(), photoViewer.h4.c5);
            }
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.a;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        c0(videoEditedInfo, z10, i11, false, z11);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean r() {
        return this.b != null && this.f;
    }
}

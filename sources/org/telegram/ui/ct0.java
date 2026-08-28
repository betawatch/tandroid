package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ct0 extends rt0 {
    public final ImageReceiver.BitmapHolder a;
    public final /* synthetic */ zt0 b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ MediaController.PhotoEntry d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public ct0(PhotoViewer photoViewer, zt0 zt0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.g = photoViewer;
        this.b = zt0Var;
        this.c = messageObject;
        this.d = photoEntry;
        this.e = z10;
        this.f = z11;
        this.a = photoViewer.y4.getBitmapSafe();
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        zt0 zt0Var = this.b;
        if (zt0Var != null) {
            return zt0Var.E(this.c, null, 0, z10, false);
        }
        return null;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void L(VideoEditedInfo videoEditedInfo) {
        MediaController.PhotoEntry photoEntry = this.d;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null || !TextUtils.isEmpty(photoEntry.caption)) {
            c0(videoEditedInfo, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final MessageObject U() {
        return this.c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z10, int i9, boolean z11, boolean z12) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.h4 != null) {
            gn gnVar = null;
            MessageObject messageObject = this.c;
            MessageObject messageObject2 = z11 ? messageObject : null;
            MediaController.PhotoEntry photoEntry = this.d;
            if (messageObject2 != null && !TextUtils.isEmpty(photoEntry.caption)) {
                messageObject2.editingMessage = photoEntry.caption;
                messageObject2.editingMessageEntities = photoEntry.entities;
            }
            if (z11 || messageObject == null) {
                qn qnVar = photoViewer.h4;
                messageObject = qnVar.j5;
                gnVar = qnVar.h5;
            }
            gn gnVar2 = gnVar;
            MessageObject messageObject3 = messageObject;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.h4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.h4.a();
                    qn qnVar2 = photoViewer.h4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, qnVar2.T3, null, gnVar2, photoEntry.entities, photoEntry.ttl, messageObject2, z10, i9, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, qnVar2.C8(), 0L, 0L, photoViewer.h4.N8(), photoViewer.h4.c5);
                    return;
                }
                MessageObject messageObject4 = messageObject2;
                AccountInstance accountInstance2 = photoViewer.h4.getAccountInstance();
                String str2 = photoEntry.path;
                long a3 = photoViewer.h4.a();
                qn qnVar3 = photoViewer.h4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a3, messageObject3, qnVar3.T3, null, gnVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i9, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, qnVar3.C8(), 0L, 0L, photoViewer.h4.N8(), photoViewer.h4.c5);
                return;
            }
            MessageObject messageObject5 = messageObject2;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.h4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a10 = photoViewer.h4.a();
                qn qnVar4 = photoViewer.h4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a10, messageObject3, qnVar4.T3, null, gnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i9, 0, 0, z12, photoEntry.caption, qnVar4.C8(), 0L, 0L, photoViewer.h4.N8(), photoViewer.h4.c5);
                return;
            }
            if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.h4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a11 = photoViewer.h4.a();
                qn qnVar5 = photoViewer.h4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a11, messageObject3, qnVar5.T3, null, gnVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i9, 0, 0, z12, photoEntry.caption, qnVar5.C8(), 0L, 0L, photoViewer.h4.N8(), photoViewer.h4.c5);
            }
        }
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final ImageReceiver.BitmapHolder j(int i9) {
        return this.a;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        c0(videoEditedInfo, z10, i10, false, z11);
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final boolean r() {
        return this.b != null && this.f;
    }
}

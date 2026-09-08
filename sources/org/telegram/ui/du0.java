package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class du0 extends su0 {
    public final ImageReceiver.BitmapHolder a;
    public final /* synthetic */ av0 b;
    public final /* synthetic */ MessageObject c;
    public final /* synthetic */ MediaController.PhotoEntry d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public du0(PhotoViewer photoViewer, av0 av0Var, MessageObject messageObject, MediaController.PhotoEntry photoEntry, boolean z10, boolean z11) {
        this.g = photoViewer;
        this.b = av0Var;
        this.c = messageObject;
        this.d = photoEntry;
        this.e = z10;
        this.f = z11;
        this.a = photoViewer.C4.getBitmapSafe();
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        av0 av0Var = this.b;
        if (av0Var != null) {
            return av0Var.E(this.c, null, 0, z10, false);
        }
        return null;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void L(VideoEditedInfo videoEditedInfo) {
        MediaController.PhotoEntry photoEntry = this.d;
        if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null || !TextUtils.isEmpty(photoEntry.caption)) {
            c0(videoEditedInfo, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final MessageObject U() {
        return this.c;
    }

    public final void c0(VideoEditedInfo videoEditedInfo, boolean z10, int i10, boolean z11, boolean z12) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.l4 != null) {
            sn snVar = null;
            MessageObject messageObject = this.c;
            MessageObject messageObject2 = z11 ? messageObject : null;
            MediaController.PhotoEntry photoEntry = this.d;
            if (messageObject2 != null && !TextUtils.isEmpty(photoEntry.caption)) {
                messageObject2.editingMessage = photoEntry.caption;
                messageObject2.editingMessageEntities = photoEntry.entities;
            }
            if (z11 || messageObject == null) {
                co coVar = photoViewer.l4;
                messageObject = coVar.n5;
                snVar = coVar.l5;
            }
            sn snVar2 = snVar;
            MessageObject messageObject3 = messageObject;
            if (photoEntry.isVideo) {
                if (videoEditedInfo != null) {
                    AccountInstance accountInstance = photoViewer.l4.getAccountInstance();
                    String str = photoEntry.path;
                    long a2 = photoViewer.l4.a();
                    co coVar2 = photoViewer.l4;
                    SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, a2, messageObject3, coVar2.X3, null, snVar2, photoEntry.entities, photoEntry.ttl, messageObject2, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, coVar2.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.g5);
                    return;
                }
                MessageObject messageObject4 = messageObject2;
                AccountInstance accountInstance2 = photoViewer.l4.getAccountInstance();
                String str2 = photoEntry.path;
                long a10 = photoViewer.l4.a();
                co coVar3 = photoViewer.l4;
                SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, a10, messageObject3, coVar3.X3, null, snVar2, photoEntry.entities, photoEntry.ttl, messageObject4, z10, i10, 0, z12, photoEntry.hasSpoiler, photoEntry.caption, coVar3.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.g5);
                return;
            }
            MessageObject messageObject5 = messageObject2;
            if (photoEntry.imagePath != null) {
                AccountInstance accountInstance3 = photoViewer.l4.getAccountInstance();
                String str3 = photoEntry.imagePath;
                String str4 = photoEntry.thumbPath;
                long a11 = photoViewer.l4.a();
                co coVar4 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, a11, messageObject3, coVar4.X3, null, snVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, coVar4.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.g5);
                return;
            }
            if (photoEntry.path != null) {
                AccountInstance accountInstance4 = photoViewer.l4.getAccountInstance();
                String str5 = photoEntry.path;
                String str6 = photoEntry.thumbPath;
                long a12 = photoViewer.l4.a();
                co coVar5 = photoViewer.l4;
                SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, a12, messageObject3, coVar5.X3, null, snVar2, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, messageObject5, videoEditedInfo, z10, i10, 0, 0, z12, photoEntry.caption, coVar5.C8(), 0L, 0L, photoViewer.l4.N8(), photoViewer.l4.g5);
            }
        }
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final ImageReceiver.BitmapHolder j(int i10) {
        return this.a;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        c0(videoEditedInfo, z10, i11, false, z11);
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean r() {
        return this.b != null && this.f;
    }
}

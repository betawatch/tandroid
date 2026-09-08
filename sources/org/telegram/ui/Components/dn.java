package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dn implements ti {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ bn c;

    public dn(Utilities.Callback callback, org.telegram.ui.ActionBar.n2 n2Var, bn bnVar) {
        this.a = n2Var;
        this.b = callback;
        this.c = bnVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B(hh hhVar) {
        NotificationCenter.getInstance(this.a.getCurrentAccount()).doOnIdle(hhVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean D0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        bn bnVar = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bnVar.j0;
        Utilities.Callback callback = this.b;
        if (i10 == 15) {
            org.telegram.ui.ActionBar.n2 n2Var = this.a;
            e5.g0(n2Var.getContext(), n2Var.getResourceProvider(), null, null, new cn(0, callback), null);
        } else if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    String str = photoEntry.imagePath;
                    if (str != null) {
                        sendingMediaInfo.path = str;
                    } else {
                        sendingMediaInfo.path = photoEntry.path;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                    sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                    sendingMediaInfo.discardLivePhoto = true;
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    CharSequence charSequence = photoEntry.caption;
                    sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                    sendingMediaInfo.emojiMarkup = photoEntry.emojiMarkup;
                    sendingMediaInfo.originalPhotoEntry = photoEntry;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str2 = searchImage.imagePath;
                    if (str2 != null) {
                        sendingMediaInfo.path = str2;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.coverPath = searchImage.coverPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence2 = searchImage.caption;
                    sendingMediaInfo.caption = charSequence2 != null ? charSequence2.toString() : null;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
                callback.run(new sh.d(sendingMediaInfo));
            }
        }
        bnVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void H() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void K(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final void X(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

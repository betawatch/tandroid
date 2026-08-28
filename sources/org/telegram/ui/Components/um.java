package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class um implements ii {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ sm c;

    public um(Utilities.Callback callback, org.telegram.ui.ActionBar.o2 o2Var, sm smVar) {
        this.a = o2Var;
        this.b = callback;
        this.c = smVar;
    }

    @Override // org.telegram.ui.Components.ii
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        sm smVar = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = smVar.f0;
        Utilities.Callback callback = this.b;
        if (i9 == 15) {
            org.telegram.ui.ActionBar.o2 o2Var = this.a;
            y4.g0(o2Var.getContext(), o2Var.getResourceProvider(), null, null, new tm(0, callback), null);
        } else if (i9 == 7 || i9 == 8) {
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
                callback.run(new zg.d(sendingMediaInfo));
            }
        }
        smVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void t(wg wgVar) {
        NotificationCenter.getInstance(this.a.getCurrentAccount()).doOnIdle(wgVar);
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean t0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void A(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final void E(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ii
    public final void u() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}

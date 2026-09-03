package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class an implements ji {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ ym c;

    public an(Utilities.Callback callback, org.telegram.ui.ActionBar.p2 p2Var, ym ymVar) {
        this.a = p2Var;
        this.b = callback;
        this.c = ymVar;
    }

    @Override // org.telegram.ui.Components.ji
    public final void C0(wg wgVar) {
        NotificationCenter.getInstance(this.a.getCurrentAccount()).doOnIdle(wgVar);
    }

    @Override // org.telegram.ui.Components.ji
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        ym ymVar = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ymVar.g0;
        Utilities.Callback callback = this.b;
        if (i10 == 15) {
            org.telegram.ui.ActionBar.p2 p2Var = this.a;
            z4.g0(p2Var.getContext(), p2Var.getResourceProvider(), null, null, new zm(0, callback), null);
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
                callback.run(new eh.d(sendingMediaInfo));
            }
        }
        ymVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean X1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final void Q0() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void Z0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public final void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}

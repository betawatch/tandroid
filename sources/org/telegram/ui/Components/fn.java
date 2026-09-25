package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class fn implements ui {
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ dn c;

    public fn(Utilities.Callback callback, org.telegram.ui.ActionBar.m2 m2Var, dn dnVar) {
        this.a = m2Var;
        this.b = callback;
        this.c = dnVar;
    }

    @Override // org.telegram.ui.Components.ui
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        dn dnVar = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = dnVar.j0;
        Utilities.Callback callback = this.b;
        if (i10 == 15) {
            org.telegram.ui.ActionBar.m2 m2Var = this.a;
            e5.g0(m2Var.getContext(), m2Var.getResourceProvider(), null, null, new en(0, callback), null);
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
                callback.run(new rh.d(sendingMediaInfo));
            }
        }
        dnVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ boolean S1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui
    public final boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui
    public final void x0(hh hhVar) {
        NotificationCenter.getInstance(this.a.getCurrentAccount()).doOnIdle(hhVar);
    }

    @Override // org.telegram.ui.Components.ui
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ui
    public final void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

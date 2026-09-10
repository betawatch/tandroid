package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z40 implements wi {
    public final /* synthetic */ e50 a;

    public z40(e50 e50Var) {
        this.a = e50Var;
    }

    @Override // org.telegram.ui.Components.wi
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        yi yiVar;
        e50 e50Var = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = e50Var.a;
        if (p2Var == null || p2Var.getParentActivity() == null || (yiVar = e50Var.c) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            yiVar.dismissWithButtonClick(i10);
            if (i10 == 0) {
                e50Var.m();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = yiVar.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = e50Var.c.j0.getSelectedPhotosOrder();
        ArrayList arrayList = new ArrayList();
        boolean z14 = false;
        for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
            Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList.add(sendingMediaInfo);
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
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                sendingMediaInfo.discardLivePhoto = true;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
                TLRPC.VideoSize videoSize = photoEntry.emojiMarkup;
                sendingMediaInfo.emojiMarkup = videoSize;
                z14 = videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup;
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
        }
        e50.b(e50Var, z14, arrayList);
        if (i10 != 8) {
            e50Var.c.dismiss(true);
        }
    }

    @Override // org.telegram.ui.Components.wi
    public final void K0() {
        AndroidUtilities.hideKeyboard(this.a.a.getFragmentView().findFocus());
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean R1() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final void v0() {
        this.a.r();
    }

    @Override // org.telegram.ui.Components.wi
    public final void y0(jh jhVar) {
        jhVar.run();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.wi
    public final void i1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

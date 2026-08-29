package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n40 implements li {
    public final /* synthetic */ s40 a;

    public n40(s40 s40Var) {
        this.a = s40Var;
    }

    @Override // org.telegram.ui.Components.li
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ni niVar;
        s40 s40Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = s40Var.a;
        if (o2Var == null || o2Var.getParentActivity() == null || (niVar = s40Var.c) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            niVar.dismissWithButtonClick(i10);
            if (i10 == 0) {
                s40Var.m();
                return;
            }
            return;
        }
        HashMap<Object, Object> selectedPhotos = niVar.f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = s40Var.c.f0.getSelectedPhotosOrder();
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
        s40.b(s40Var, z14, arrayList);
        if (i10 != 8) {
            s40Var.c.dismiss(true);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void L0() {
        AndroidUtilities.hideKeyboard(this.a.a.getFragmentView().findFocus());
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ boolean T1() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final void u0() {
        this.a.r();
    }

    @Override // org.telegram.ui.Components.li
    public final void x0(zg zgVar) {
        zgVar.run();
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.li
    public final void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}

package nh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.wg;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class u2 implements ji {
    public final /* synthetic */ d4 a;

    public u2(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.ji
    public final void C() {
        this.a.Y1.P();
    }

    @Override // org.telegram.ui.Components.ji
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        TL_stories.StoryItem storyItem;
        AccountInstance accountInstance;
        String str;
        d4 d4Var = this.a;
        if (!d4Var.G0.j0 || (storyItem = d4Var.L1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || d4Var.F2.g0.getSelectedPhotos().isEmpty())) {
            t2 t2Var = d4Var.F2;
            if (t2Var != null) {
                t2Var.dismissWithButtonClick(i10);
                return;
            }
            return;
        }
        if (i10 != 8) {
            d4Var.F2.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = d4Var.F2.g0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = d4Var.F2.g0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        int i13 = 0;
        int i14 = 0;
        while (i14 < Math.ceil(selectedPhotos.size() / 10.0f)) {
            int i15 = i14 * 10;
            int min = Math.min(10, selectedPhotos.size() - i15);
            ArrayList arrayList = new ArrayList();
            for (int i16 = 0; i16 < min; i16++) {
                int i17 = i15 + i16;
                if (i17 < selectedPhotosOrder.size()) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i17));
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    boolean z13 = photoEntry.isVideo;
                    if (z13 || (str = photoEntry.imagePath) == null) {
                        String str2 = photoEntry.path;
                        if (str2 != null) {
                            sendingMediaInfo.path = str2;
                        }
                    } else {
                        sendingMediaInfo.path = str;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.isVideo = z13;
                    CharSequence charSequence = photoEntry.caption;
                    sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                    sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                    sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                    arrayList.add(sendingMediaInfo);
                    photoEntry.reset();
                }
            }
            boolean z14 = i14 == 0 ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i13)).updateStickersOrder : false;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = d4Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, d4Var.y1, null, null, storyItem, null, i10 == 4 || z12, z4, null, z10, i11, i12, 0, z14, null, null, 0L, false, 0L, d4Var.Y1.getSendMonoForumPeerId(), d4Var.Y1.getSendMessageSuggestionParams());
            i14++;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            i13 = 0;
        }
        d4Var.Y1.setFieldText("");
        d4Var.k0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
        AccountInstance accountInstance;
        d4 d4Var = this.a;
        TL_stories.StoryItem storyItem = d4Var.L1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = d4Var.getAccountInstance();
        SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence != null ? charSequence : null, d4Var.y1, null, null, storyItem, z4, i10, i11, null, null, j10, z10, j11);
        d4Var.k0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.ji
    public final boolean k() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.ji
    public final void x(wg wgVar) {
        NotificationCenter.getInstance(this.a.z2).doOnIdle(wgVar);
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void D(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void G(TLRPC.User user) {
    }
}

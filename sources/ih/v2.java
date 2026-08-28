package ih;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.wg;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v2 implements ii {
    public final /* synthetic */ i4 a;

    public v2(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.ii
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        TL_stories.StoryItem storyItem;
        AccountInstance accountInstance;
        String str;
        i4 i4Var = this.a;
        if (!i4Var.F0.i0 || (storyItem = i4Var.K1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i9 != 8 && i9 != 7 && (i9 != 4 || i4Var.E2.f0.getSelectedPhotos().isEmpty())) {
            u2 u2Var = i4Var.E2;
            if (u2Var != null) {
                u2Var.dismissWithButtonClick(i9);
                return;
            }
            return;
        }
        if (i9 != 8) {
            i4Var.E2.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = i4Var.E2.f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = i4Var.E2.f0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        while (i13 < Math.ceil(selectedPhotos.size() / 10.0f)) {
            int i14 = i13 * 10;
            int min = Math.min(10, selectedPhotos.size() - i14);
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < min; i15++) {
                int i16 = i14 + i15;
                if (i16 < selectedPhotosOrder.size()) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i16));
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    boolean z14 = photoEntry.isVideo;
                    if (z14 || (str = photoEntry.imagePath) == null) {
                        String str2 = photoEntry.path;
                        if (str2 != null) {
                            sendingMediaInfo.path = str2;
                        }
                    } else {
                        sendingMediaInfo.path = str;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.isVideo = z14;
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
            boolean z15 = i13 == 0 ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i12)).updateStickersOrder : false;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = i4Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, i4Var.x1, null, null, storyItem, null, i9 == 4 || z13, z10, null, z11, i10, i11, 0, z15, null, null, 0L, false, 0L, i4Var.X1.getSendMonoForumPeerId(), i4Var.X1.getSendMessageSuggestionParams());
            i13++;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            i12 = 0;
        }
        i4Var.X1.setFieldText("");
        i4Var.k0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean j() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.ii
    public final void t(wg wgVar) {
        NotificationCenter.getInstance(this.a.y2).doOnIdle(wgVar);
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean t0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void u() {
        this.a.X1.O();
    }

    @Override // org.telegram.ui.Components.ii
    public final void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        i4 i4Var = this.a;
        TL_stories.StoryItem storyItem = i4Var.K1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = i4Var.getAccountInstance();
        SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence != null ? charSequence : null, i4Var.x1, null, null, storyItem, z10, i9, i10, null, null, j10, z11, j11);
        i4Var.k0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void A(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void E(TLRPC.User user) {
    }
}

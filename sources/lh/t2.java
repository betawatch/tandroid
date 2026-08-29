package lh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.zg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class t2 implements li {
    public final /* synthetic */ d4 a;

    public t2(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.li
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        TL_stories.StoryItem storyItem;
        AccountInstance accountInstance;
        String str;
        d4 d4Var = this.a;
        if (!d4Var.F0.i0 || (storyItem = d4Var.K1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || d4Var.E2.f0.getSelectedPhotos().isEmpty())) {
            s2 s2Var = d4Var.E2;
            if (s2Var != null) {
                s2Var.dismissWithButtonClick(i10);
                return;
            }
            return;
        }
        if (i10 != 8) {
            d4Var.E2.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = d4Var.E2.f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = d4Var.E2.f0.getSelectedPhotosOrder();
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
            boolean z15 = i14 == 0 ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i13)).updateStickersOrder : false;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = d4Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, d4Var.x1, null, null, storyItem, null, i10 == 4 || z13, z10, null, z11, i11, i12, 0, z15, null, null, 0L, false, 0L, d4Var.X1.getSendMonoForumPeerId(), d4Var.X1.getSendMessageSuggestionParams());
            i14++;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            i13 = 0;
        }
        d4Var.X1.setFieldText("");
        d4Var.k0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.li
    public final void L0() {
        this.a.X1.P();
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ boolean T1() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        d4 d4Var = this.a;
        TL_stories.StoryItem storyItem = d4Var.K1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = d4Var.getAccountInstance();
        SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence != null ? charSequence : null, d4Var.x1, null, null, storyItem, z10, i10, i11, null, null, j10, z11, j11);
        d4Var.k0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.li
    public final boolean a0() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.li
    public final void x0(zg zgVar) {
        NotificationCenter.getInstance(this.a.y2).doOnIdle(zgVar);
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void j1(TLRPC.User user) {
    }
}

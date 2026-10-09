package ai;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class i4 implements wi {
    public final /* synthetic */ f6 a;

    public i4(f6 f6Var) {
        this.a = f6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // org.telegram.ui.Components.wi
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        TL_stories.StoryItem storyItem;
        AccountInstance accountInstance;
        boolean z14;
        ?? r12;
        String str;
        f6 f6Var = this.a;
        if (!f6Var.J0.m0 || (storyItem = f6Var.O1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || f6Var.I2.j0.getSelectedPhotos().isEmpty())) {
            h4 h4Var = f6Var.I2;
            if (h4Var != null) {
                h4Var.dismissWithButtonClick(i10);
                return;
            }
            return;
        }
        boolean z15 = true;
        if (i10 != 8) {
            f6Var.I2.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = f6Var.I2.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = f6Var.I2.j0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ?? r72 = 0;
        int i13 = 0;
        while (i13 < Math.ceil(selectedPhotos.size() / 10.0f)) {
            int i14 = i13 * 10;
            int min = Math.min(10, selectedPhotos.size() - i14);
            ?? arrayList = new ArrayList();
            for (int i15 = r72; i15 < min; i15++) {
                int i16 = i14 + i15;
                if (i16 < selectedPhotosOrder.size()) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i16));
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    boolean z16 = photoEntry.isVideo;
                    if (z16 || (str = photoEntry.imagePath) == null) {
                        String str2 = photoEntry.path;
                        if (str2 != null) {
                            sendingMediaInfo.path = str2;
                        }
                    } else {
                        sendingMediaInfo.path = str;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.isVideo = z16;
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
            boolean z17 = i13 == 0 ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(r72)).updateStickersOrder : r72;
            HashMap<Object, Object> hashMap = selectedPhotos;
            accountInstance = f6Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            int i17 = r72;
            long j11 = f6Var.B1;
            if (i10 == 4 || z13) {
                z14 = 4;
                r12 = 1;
            } else {
                z14 = 4;
                r12 = i17;
            }
            SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, null, null, storyItem, null, r12, z10, null, z11, i11, i12, 0, z17, null, null, 0L, false, 0L, f6Var.b2.getSendMonoForumPeerId(), f6Var.b2.getSendMessageSuggestionParams());
            i13++;
            z15 = true;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            r72 = i17;
        }
        boolean z18 = z15;
        boolean z19 = r72;
        f6Var.b2.setFieldText("");
        f6Var.k0(j10 <= 0 ? z18 : z19);
    }

    @Override // org.telegram.ui.Components.wi
    public final void P0() {
        this.a.b2.N();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean Y1() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        AccountInstance accountInstance;
        f6 f6Var = this.a;
        TL_stories.StoryItem storyItem = f6Var.O1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = f6Var.getAccountInstance();
        SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence != null ? charSequence : null, f6Var.B1, null, null, storyItem, z10, i10, i11, null, null, j3, z11, j10);
        f6Var.k0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.wi
    public final void f0(jh jhVar) {
        NotificationCenter.getInstance(this.a.C2).doOnIdle(jhVar);
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean i0() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void a1(Object obj) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void p1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void B0() {
    }
}

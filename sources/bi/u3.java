package bi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class u3 implements ti {
    public final /* synthetic */ o5 a;

    public u3(o5 o5Var) {
        this.a = o5Var;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B(hh hhVar) {
        NotificationCenter.getInstance(this.a.C2).doOnIdle(hhVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean D0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        AccountInstance accountInstance;
        o5 o5Var = this.a;
        TL_stories.StoryItem storyItem = o5Var.O1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = o5Var.getAccountInstance();
        SendMessagesHelper.prepareSendingAudioDocuments(accountInstance, arrayList, charSequence != null ? charSequence : null, o5Var.B1, null, null, storyItem, z10, i10, i11, null, null, j3, z11, j10);
        o5Var.k0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.ti
    public final void H() {
        this.a.b2.P();
    }

    @Override // org.telegram.ui.Components.ti
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        TL_stories.StoryItem storyItem;
        AccountInstance accountInstance;
        String str;
        o5 o5Var = this.a;
        if (!o5Var.J0.m0 || (storyItem = o5Var.O1.a) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || o5Var.I2.j0.getSelectedPhotos().isEmpty())) {
            t3 t3Var = o5Var.I2;
            if (t3Var != null) {
                t3Var.dismissWithButtonClick(i10);
                return;
            }
            return;
        }
        if (i10 != 8) {
            o5Var.I2.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = o5Var.I2.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = o5Var.I2.j0.getSelectedPhotosOrder();
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
            accountInstance = o5Var.getAccountInstance();
            ArrayList<Object> arrayList2 = selectedPhotosOrder;
            SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, o5Var.B1, null, null, storyItem, null, i10 == 4 || z13, z10, null, z11, i11, i12, 0, z15, null, null, 0L, false, 0L, o5Var.b2.getSendMonoForumPeerId(), o5Var.b2.getSendMessageSuggestionParams());
            i14++;
            selectedPhotos = hashMap;
            selectedPhotosOrder = arrayList2;
            i13 = 0;
        }
        o5Var.b2.setFieldText("");
        o5Var.k0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean q() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void K(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void X(TLRPC.User user) {
    }
}

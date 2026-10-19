package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class hl implements org.telegram.ui.Components.ri {
    public final /* synthetic */ qn a;

    public hl(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.Components.ri
    public final void J() {
        this.a.Y.N();
    }

    @Override // org.telegram.ui.Components.ri
    public final void X(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        qn qnVar = this.a;
        if (qnVar.Y == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        qnVar.Y.setFieldText("@" + publicUsername + " ");
        qnVar.Y.F0();
    }

    @Override // org.telegram.ui.Components.ri
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ci.b3 b3Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i13;
        int i14;
        boolean z15;
        ArrayList arrayList;
        boolean z16;
        HashMap<Object, Object> hashMap2;
        boolean z17;
        String str;
        TLRPC.Message message;
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null || (b3Var = qnVar.J1) == null) {
            return;
        }
        boolean z18 = b3Var.G;
        MessageObject messageObject = b3Var.K1;
        qnVar.p5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || b3Var.j0.getSelectedPhotos().isEmpty())) {
            ci.b3 b3Var2 = qnVar.J1;
            if (b3Var2 != null) {
                b3Var2.dismissWithButtonClick(i10);
            }
            qnVar.Ea(i10);
            return;
        }
        ci.b3 b3Var3 = qnVar.J1;
        if (b3Var3 != null && i10 != 8) {
            b3Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = qnVar.J1.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = qnVar.J1.j0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            hashMap = selectedPhotos;
        } else {
            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            int i15 = 0;
            while (i15 < ceil) {
                int i16 = i15 * 10;
                int min = Math.min(10, selectedPhotos.size() - i16);
                ArrayList arrayList2 = new ArrayList();
                int i17 = 0;
                while (i17 < min) {
                    int i18 = i16 + i17;
                    if (i18 >= selectedPhotosOrder.size()) {
                        hashMap2 = selectedPhotos;
                        z17 = z18;
                    } else {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i18));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        sendingMediaInfo.imagePath = photoEntry.imagePath;
                        boolean isLivePhoto = photoEntry.isLivePhoto();
                        sendingMediaInfo.isLivePhoto = isLivePhoto;
                        boolean z19 = photoEntry.isVideo;
                        if (z18 && isLivePhoto) {
                            sendingMediaInfo.isLivePhoto = false;
                            z19 = false;
                        }
                        if (z19 || (str = photoEntry.imagePath) == null) {
                            String str2 = photoEntry.path;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            }
                        } else {
                            sendingMediaInfo.path = str;
                            if (!z18 && photoEntry.isHighQuality()) {
                                sendingMediaInfo.originalPhotoEntry = photoEntry.clone();
                            }
                        }
                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                        sendingMediaInfo.coverPhoto = photoEntry.coverPhoto;
                        sendingMediaInfo.isVideo = z19;
                        sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                        hashMap2 = selectedPhotos;
                        z17 = z18;
                        sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                        sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                        CharSequence charSequence = photoEntry.caption;
                        sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                        sendingMediaInfo.entities = photoEntry.entities;
                        sendingMediaInfo.masks = photoEntry.stickers;
                        sendingMediaInfo.ttl = photoEntry.ttl;
                        sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                        sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                        sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                        sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                        sendingMediaInfo.stars = photoEntry.starsAmount;
                        sendingMediaInfo.highQuality = !z17 && photoEntry.isHighQuality();
                        arrayList2.add(sendingMediaInfo);
                        photoEntry.reset();
                    }
                    i17++;
                    z18 = z17;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z20 = z18;
                if (i15 == 0) {
                    qnVar.o8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = qnVar.p5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(qnVar.getAccountInstance(), arrayList2, qnVar.T5, qnVar.n5, qnVar.X3, null, qnVar.l5, i10 == 4 || z13, z10, qnVar.p5, z11, i11, i12, qnVar.R3, z14, null, qnVar.H8(), j10, z12, j11, qnVar.S8(), qnVar.g5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = qnVar.g5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(qnVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = qnVar.getAccountInstance();
                    int i19 = ceil;
                    long j12 = qnVar.T5;
                    MessageObject messageObject3 = qnVar.p5;
                    int i20 = i15;
                    MessageObject messageObject4 = qnVar.X3;
                    gn gnVar = qnVar.l5;
                    if (i10 == 4 || z13) {
                        z15 = 4;
                        arrayList = arrayList2;
                        z16 = true;
                    } else {
                        z15 = 4;
                        arrayList = arrayList2;
                        z16 = false;
                    }
                    i14 = i20;
                    i13 = i19;
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, gnVar, z16, z10, null, z11, i11, i12, qnVar.R3, z14, null, qnVar.H8(), j10, z12, j11, qnVar.S8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z18 = z20;
            }
            hashMap = selectedPhotos;
            qnVar.B6();
            qnVar.Y.setFieldText("");
        }
        if (i11 != 0) {
            if (qnVar.S3 == -1) {
                qnVar.S3 = 0;
            }
            qnVar.S3 += hashMap.size();
            qnVar.Ic(true);
        }
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final void u(org.telegram.ui.Components.gh ghVar) {
        this.a.k8(ghVar);
    }

    @Override // org.telegram.ui.Components.ri
    public final boolean v() {
        return this.a.U9();
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void E() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void O(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}

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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class jl implements org.telegram.ui.Components.ri {
    public final /* synthetic */ sn a;

    public jl(sn snVar) {
        this.a = snVar;
    }

    @Override // org.telegram.ui.Components.ri
    public final void J() {
        this.a.Y.N();
    }

    @Override // org.telegram.ui.Components.ri
    public final void X(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        sn snVar = this.a;
        if (snVar.Y == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        snVar.Y.setFieldText("@" + publicUsername + " ");
        snVar.Y.F0();
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
        sn snVar = this.a;
        if (snVar.getParentActivity() == null || (b3Var = snVar.J1) == null) {
            return;
        }
        boolean z18 = b3Var.G;
        MessageObject messageObject = b3Var.K1;
        snVar.p5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || b3Var.j0.getSelectedPhotos().isEmpty())) {
            ci.b3 b3Var2 = snVar.J1;
            if (b3Var2 != null) {
                b3Var2.dismissWithButtonClick(i10);
            }
            snVar.Ea(i10);
            return;
        }
        ci.b3 b3Var3 = snVar.J1;
        if (b3Var3 != null && i10 != 8) {
            b3Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = snVar.J1.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = snVar.J1.j0.getSelectedPhotosOrder();
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
                    snVar.o8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = snVar.p5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(snVar.getAccountInstance(), arrayList2, snVar.T5, snVar.n5, snVar.X3, null, snVar.l5, i10 == 4 || z13, z10, snVar.p5, z11, i11, i12, snVar.R3, z14, null, snVar.H8(), j10, z12, j11, snVar.S8(), snVar.g5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = snVar.g5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(snVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = snVar.getAccountInstance();
                    int i19 = ceil;
                    long j12 = snVar.T5;
                    MessageObject messageObject3 = snVar.p5;
                    int i20 = i15;
                    MessageObject messageObject4 = snVar.X3;
                    in inVar = snVar.l5;
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
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, inVar, z16, z10, null, z11, i11, i12, snVar.R3, z14, null, snVar.H8(), j10, z12, j11, snVar.S8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z18 = z20;
            }
            hashMap = selectedPhotos;
            snVar.B6();
            snVar.Y.setFieldText("");
        }
        if (i11 != 0) {
            if (snVar.S3 == -1) {
                snVar.S3 = 0;
            }
            snVar.S3 += hashMap.size();
            snVar.Ic(true);
        }
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final void r(org.telegram.ui.Components.gh ghVar) {
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

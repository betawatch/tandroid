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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dl implements org.telegram.ui.Components.ii {
    public final /* synthetic */ qn a;

    public dl(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.Components.ii
    public final void E(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        qn qnVar = this.a;
        if (qnVar.U == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        qnVar.U.setFieldText("@" + publicUsername + " ");
        qnVar.U.G0();
    }

    @Override // org.telegram.ui.Components.ii
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ih.u2 u2Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i12;
        int i13;
        ArrayList arrayList;
        boolean z15;
        HashMap<Object, Object> hashMap2;
        boolean z16;
        String str;
        TLRPC.Message message;
        qn qnVar = this.a;
        if (qnVar.getParentActivity() == null || (u2Var = qnVar.F1) == null) {
            return;
        }
        boolean z17 = u2Var.C;
        MessageObject messageObject = u2Var.D1;
        qnVar.l5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i9 != 8 && i9 != 7 && (i9 != 4 || u2Var.f0.getSelectedPhotos().isEmpty())) {
            ih.u2 u2Var2 = qnVar.F1;
            if (u2Var2 != null) {
                u2Var2.dismissWithButtonClick(i9);
            }
            qnVar.Aa(i9);
            return;
        }
        ih.u2 u2Var3 = qnVar.F1;
        if (u2Var3 != null && i9 != 8) {
            u2Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = qnVar.F1.f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = qnVar.F1.f0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            hashMap = selectedPhotos;
        } else {
            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            int i14 = 0;
            while (i14 < ceil) {
                int i15 = i14 * 10;
                int min = Math.min(10, selectedPhotos.size() - i15);
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (i16 < min) {
                    int i17 = i15 + i16;
                    if (i17 >= selectedPhotosOrder.size()) {
                        hashMap2 = selectedPhotos;
                        z16 = z17;
                    } else {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i17));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        sendingMediaInfo.imagePath = photoEntry.imagePath;
                        boolean isLivePhoto = photoEntry.isLivePhoto();
                        sendingMediaInfo.isLivePhoto = isLivePhoto;
                        boolean z18 = photoEntry.isVideo;
                        if (z17 && isLivePhoto) {
                            sendingMediaInfo.isLivePhoto = false;
                            z18 = false;
                        }
                        if (z18 || (str = photoEntry.imagePath) == null) {
                            String str2 = photoEntry.path;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            }
                        } else {
                            sendingMediaInfo.path = str;
                            if (!z17 && photoEntry.isHighQuality()) {
                                sendingMediaInfo.originalPhotoEntry = photoEntry.clone();
                            }
                        }
                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                        sendingMediaInfo.coverPhoto = photoEntry.coverPhoto;
                        sendingMediaInfo.isVideo = z18;
                        sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                        hashMap2 = selectedPhotos;
                        z16 = z17;
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
                        sendingMediaInfo.highQuality = !z16 && photoEntry.isHighQuality();
                        arrayList2.add(sendingMediaInfo);
                        photoEntry.reset();
                    }
                    i16++;
                    z17 = z16;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z19 = z17;
                if (i14 == 0) {
                    qnVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = qnVar.l5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i12 = ceil;
                    i13 = i14;
                    SendMessagesHelper.prepareSendingMedia(qnVar.getAccountInstance(), arrayList2, qnVar.P5, qnVar.j5, qnVar.T3, null, qnVar.h5, i9 == 4 || z13, z10, qnVar.l5, z11, i10, i11, qnVar.N3, z14, null, qnVar.C8(), j10, z12, j11, qnVar.N8(), qnVar.c5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = qnVar.c5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(qnVar.l5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = qnVar.getAccountInstance();
                    int i18 = ceil;
                    long j12 = qnVar.P5;
                    MessageObject messageObject3 = qnVar.l5;
                    int i19 = i14;
                    MessageObject messageObject4 = qnVar.T3;
                    gn gnVar = qnVar.h5;
                    if (i9 == 4 || z13) {
                        arrayList = arrayList2;
                        z15 = true;
                    } else {
                        arrayList = arrayList2;
                        z15 = false;
                    }
                    i13 = i19;
                    i12 = i18;
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, gnVar, z15, z10, null, z11, i10, i11, qnVar.N3, z14, null, qnVar.C8(), j10, z12, j11, qnVar.N8(), messageSuggestionParams2);
                }
                i14 = i13 + 1;
                ceil = i12;
                selectedPhotos = hashMap3;
                z17 = z19;
            }
            hashMap = selectedPhotos;
            qnVar.y6();
            qnVar.U.setFieldText("");
        }
        if (i10 != 0) {
            if (qnVar.O3 == -1) {
                qnVar.O3 = 0;
            }
            qnVar.O3 += hashMap.size();
            qnVar.Ec(true);
        }
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean j() {
        return this.a.P9();
    }

    @Override // org.telegram.ui.Components.ii
    public final void t(org.telegram.ui.Components.wg wgVar) {
        this.a.h8(wgVar);
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean t0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void u() {
        this.a.U.O();
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void A(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}

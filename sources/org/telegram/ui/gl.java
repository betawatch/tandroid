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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gl implements org.telegram.ui.Components.li {
    public final /* synthetic */ tn a;

    public gl(tn tnVar) {
        this.a = tnVar;
    }

    @Override // org.telegram.ui.Components.li
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        lh.s2 s2Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i13;
        int i14;
        ArrayList arrayList;
        boolean z15;
        HashMap<Object, Object> hashMap2;
        boolean z16;
        String str;
        TLRPC.Message message;
        tn tnVar = this.a;
        if (tnVar.getParentActivity() == null || (s2Var = tnVar.F1) == null) {
            return;
        }
        boolean z17 = s2Var.C;
        MessageObject messageObject = s2Var.D1;
        tnVar.l5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || s2Var.f0.getSelectedPhotos().isEmpty())) {
            lh.s2 s2Var2 = tnVar.F1;
            if (s2Var2 != null) {
                s2Var2.dismissWithButtonClick(i10);
            }
            tnVar.Aa(i10);
            return;
        }
        lh.s2 s2Var3 = tnVar.F1;
        if (s2Var3 != null && i10 != 8) {
            s2Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = tnVar.F1.f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = tnVar.F1.f0.getSelectedPhotosOrder();
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
                        z16 = z17;
                    } else {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i18));
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
                    i17++;
                    z17 = z16;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z19 = z17;
                if (i15 == 0) {
                    tnVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = tnVar.l5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(tnVar.getAccountInstance(), arrayList2, tnVar.P5, tnVar.j5, tnVar.T3, null, tnVar.h5, i10 == 4 || z13, z10, tnVar.l5, z11, i11, i12, tnVar.N3, z14, null, tnVar.C8(), j10, z12, j11, tnVar.N8(), tnVar.c5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = tnVar.c5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(tnVar.l5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = tnVar.getAccountInstance();
                    int i19 = ceil;
                    long j12 = tnVar.P5;
                    MessageObject messageObject3 = tnVar.l5;
                    int i20 = i15;
                    MessageObject messageObject4 = tnVar.T3;
                    jn jnVar = tnVar.h5;
                    if (i10 == 4 || z13) {
                        arrayList = arrayList2;
                        z15 = true;
                    } else {
                        arrayList = arrayList2;
                        z15 = false;
                    }
                    i14 = i20;
                    i13 = i19;
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, jnVar, z15, z10, null, z11, i11, i12, tnVar.N3, z14, null, tnVar.C8(), j10, z12, j11, tnVar.N8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z17 = z19;
            }
            hashMap = selectedPhotos;
            tnVar.y6();
            tnVar.U.setFieldText("");
        }
        if (i11 != 0) {
            if (tnVar.O3 == -1) {
                tnVar.O3 = 0;
            }
            tnVar.O3 += hashMap.size();
            tnVar.Ec(true);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final void L0() {
        this.a.U.P();
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ boolean T1() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final boolean a0() {
        return this.a.P9();
    }

    @Override // org.telegram.ui.Components.li
    public final void j1(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        tn tnVar = this.a;
        if (tnVar.U == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        tnVar.U.setFieldText("@" + publicUsername + " ");
        tnVar.U.H0();
    }

    @Override // org.telegram.ui.Components.li
    public final void x0(org.telegram.ui.Components.zg zgVar) {
        this.a.h8(zgVar);
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}

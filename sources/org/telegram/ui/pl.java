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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pl implements org.telegram.ui.Components.ti {
    public final /* synthetic */ bo a;

    public pl(bo boVar) {
        this.a = boVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        ai.g4 g4Var;
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
        bo boVar = this.a;
        if (boVar.getParentActivity() == null || (g4Var = boVar.J1) == null) {
            return;
        }
        boolean z17 = g4Var.G;
        MessageObject messageObject = g4Var.H1;
        boVar.p5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || g4Var.j0.getSelectedPhotos().isEmpty())) {
            ai.g4 g4Var2 = boVar.J1;
            if (g4Var2 != null) {
                g4Var2.dismissWithButtonClick(i10);
            }
            boVar.Aa(i10);
            return;
        }
        ai.g4 g4Var3 = boVar.J1;
        if (g4Var3 != null && i10 != 8) {
            g4Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = boVar.J1.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = boVar.J1.j0.getSelectedPhotosOrder();
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
                    boVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = boVar.p5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(boVar.getAccountInstance(), arrayList2, boVar.T5, boVar.n5, boVar.X3, null, boVar.l5, i10 == 4 || z13, z10, boVar.p5, z11, i11, i12, boVar.R3, z14, null, boVar.C8(), j3, z12, j10, boVar.N8(), boVar.g5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = boVar.g5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(boVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = boVar.getAccountInstance();
                    int i19 = ceil;
                    long j11 = boVar.T5;
                    MessageObject messageObject3 = boVar.p5;
                    int i20 = i15;
                    MessageObject messageObject4 = boVar.X3;
                    rn rnVar = boVar.l5;
                    if (i10 == 4 || z13) {
                        arrayList = arrayList2;
                        z15 = true;
                    } else {
                        arrayList = arrayList2;
                        z15 = false;
                    }
                    i14 = i20;
                    i13 = i19;
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, messageObject3, messageObject4, null, rnVar, z15, z10, null, z11, i11, i12, boVar.R3, z14, null, boVar.C8(), j3, z12, j10, boVar.N8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z17 = z19;
            }
            hashMap = selectedPhotos;
            boVar.y6();
            boVar.Y.setFieldText("");
        }
        if (i11 != 0) {
            if (boVar.S3 == -1) {
                boVar.S3 = 0;
            }
            boVar.S3 += hashMap.size();
            boVar.Ec(true);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final void K0() {
        this.a.Y.Q();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean S1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean c0() {
        return this.a.P9();
    }

    @Override // org.telegram.ui.Components.ti
    public final void j1(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        bo boVar = this.a;
        if (boVar.Y == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        boVar.Y.setFieldText("@" + publicUsername + " ");
        boVar.Y.I0();
    }

    @Override // org.telegram.ui.Components.ti
    public final void x0(org.telegram.ui.Components.fh fhVar) {
        this.a.h8(fhVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

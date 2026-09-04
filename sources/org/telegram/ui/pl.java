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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pl implements org.telegram.ui.Components.ti {
    public final /* synthetic */ co a;

    public pl(co coVar) {
        this.a = coVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B(org.telegram.ui.Components.hh hhVar) {
        this.a.h8(hhVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean D0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void H() {
        this.a.Y.P();
    }

    @Override // org.telegram.ui.Components.ti
    public final void X(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        co coVar = this.a;
        if (coVar.Y == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        coVar.Y.setFieldText("@" + publicUsername + " ");
        coVar.Y.H0();
    }

    @Override // org.telegram.ui.Components.ti
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        bi.t3 t3Var;
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
        co coVar = this.a;
        if (coVar.getParentActivity() == null || (t3Var = coVar.J1) == null) {
            return;
        }
        boolean z17 = t3Var.G;
        MessageObject messageObject = t3Var.H1;
        coVar.p5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || t3Var.j0.getSelectedPhotos().isEmpty())) {
            bi.t3 t3Var2 = coVar.J1;
            if (t3Var2 != null) {
                t3Var2.dismissWithButtonClick(i10);
            }
            coVar.Aa(i10);
            return;
        }
        bi.t3 t3Var3 = coVar.J1;
        if (t3Var3 != null && i10 != 8) {
            t3Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = coVar.J1.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = coVar.J1.j0.getSelectedPhotosOrder();
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
                    coVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = coVar.p5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(coVar.getAccountInstance(), arrayList2, coVar.T5, coVar.n5, coVar.X3, null, coVar.l5, i10 == 4 || z13, z10, coVar.p5, z11, i11, i12, coVar.R3, z14, null, coVar.C8(), j3, z12, j10, coVar.N8(), coVar.g5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = coVar.g5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(coVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = coVar.getAccountInstance();
                    int i19 = ceil;
                    long j11 = coVar.T5;
                    MessageObject messageObject3 = coVar.p5;
                    int i20 = i15;
                    MessageObject messageObject4 = coVar.X3;
                    sn snVar = coVar.l5;
                    if (i10 == 4 || z13) {
                        arrayList = arrayList2;
                        z15 = true;
                    } else {
                        arrayList = arrayList2;
                        z15 = false;
                    }
                    i14 = i20;
                    i13 = i19;
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, messageObject3, messageObject4, null, snVar, z15, z10, null, z11, i11, i12, coVar.R3, z14, null, coVar.C8(), j3, z12, j10, coVar.N8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z17 = z19;
            }
            hashMap = selectedPhotos;
            coVar.y6();
            coVar.Y.setFieldText("");
        }
        if (i11 != 0) {
            if (coVar.S3 == -1) {
                coVar.S3 = 0;
            }
            coVar.S3 += hashMap.size();
            coVar.Ec(true);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean q() {
        return this.a.P9();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void K(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

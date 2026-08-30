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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ml implements org.telegram.ui.Components.ji {
    public final /* synthetic */ xn a;

    public ml(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.ui.Components.ji
    public final void C() {
        this.a.V.P();
    }

    @Override // org.telegram.ui.Components.ji
    public final void G(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        xn xnVar = this.a;
        if (xnVar.V == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        xnVar.V.setFieldText("@" + publicUsername + " ");
        xnVar.V.H0();
    }

    @Override // org.telegram.ui.Components.ji
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        nh.t2 t2Var;
        HashMap<Object, Object> hashMap;
        boolean z13;
        int i13;
        int i14;
        ArrayList arrayList;
        boolean z14;
        HashMap<Object, Object> hashMap2;
        boolean z15;
        String str;
        TLRPC.Message message;
        xn xnVar = this.a;
        if (xnVar.getParentActivity() == null || (t2Var = xnVar.G1) == null) {
            return;
        }
        boolean z16 = t2Var.D;
        MessageObject messageObject = t2Var.E1;
        xnVar.m5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z11;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || t2Var.g0.getSelectedPhotos().isEmpty())) {
            nh.t2 t2Var2 = xnVar.G1;
            if (t2Var2 != null) {
                t2Var2.dismissWithButtonClick(i10);
            }
            xnVar.Aa(i10);
            return;
        }
        nh.t2 t2Var3 = xnVar.G1;
        if (t2Var3 != null && i10 != 8) {
            t2Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = xnVar.G1.g0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = xnVar.G1.g0.getSelectedPhotosOrder();
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
                        z15 = z16;
                    } else {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i18));
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        sendingMediaInfo.imagePath = photoEntry.imagePath;
                        boolean isLivePhoto = photoEntry.isLivePhoto();
                        sendingMediaInfo.isLivePhoto = isLivePhoto;
                        boolean z17 = photoEntry.isVideo;
                        if (z16 && isLivePhoto) {
                            sendingMediaInfo.isLivePhoto = false;
                            z17 = false;
                        }
                        if (z17 || (str = photoEntry.imagePath) == null) {
                            String str2 = photoEntry.path;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            }
                        } else {
                            sendingMediaInfo.path = str;
                            if (!z16 && photoEntry.isHighQuality()) {
                                sendingMediaInfo.originalPhotoEntry = photoEntry.clone();
                            }
                        }
                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                        sendingMediaInfo.coverPhoto = photoEntry.coverPhoto;
                        sendingMediaInfo.isVideo = z17;
                        sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                        hashMap2 = selectedPhotos;
                        z15 = z16;
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
                        sendingMediaInfo.highQuality = !z15 && photoEntry.isHighQuality();
                        arrayList2.add(sendingMediaInfo);
                        photoEntry.reset();
                    }
                    i17++;
                    z16 = z15;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z18 = z16;
                if (i15 == 0) {
                    xnVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z13 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z13 = false;
                }
                MessageObject messageObject2 = xnVar.m5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(xnVar.getAccountInstance(), arrayList2, xnVar.Q5, xnVar.k5, xnVar.U3, null, xnVar.i5, i10 == 4 || z12, z4, xnVar.m5, z10, i11, i12, xnVar.O3, z13, null, xnVar.C8(), j10, z11, j11, xnVar.N8(), xnVar.d5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = xnVar.d5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(xnVar.m5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = xnVar.getAccountInstance();
                    int i19 = ceil;
                    long j12 = xnVar.Q5;
                    MessageObject messageObject3 = xnVar.m5;
                    int i20 = i15;
                    MessageObject messageObject4 = xnVar.U3;
                    nn nnVar = xnVar.i5;
                    if (i10 == 4 || z12) {
                        arrayList = arrayList2;
                        z14 = true;
                    } else {
                        arrayList = arrayList2;
                        z14 = false;
                    }
                    i14 = i20;
                    i13 = i19;
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, nnVar, z14, z4, null, z10, i11, i12, xnVar.O3, z13, null, xnVar.C8(), j10, z11, j11, xnVar.N8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z16 = z18;
            }
            hashMap = selectedPhotos;
            xnVar.y6();
            xnVar.V.setFieldText("");
        }
        if (i11 != 0) {
            if (xnVar.P3 == -1) {
                xnVar.P3 = 0;
            }
            xnVar.P3 += hashMap.size();
            xnVar.Ec(true);
        }
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final boolean k() {
        return this.a.P9();
    }

    @Override // org.telegram.ui.Components.ji
    public final void x(org.telegram.ui.Components.wg wgVar) {
        this.a.h8(wgVar);
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void D(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}

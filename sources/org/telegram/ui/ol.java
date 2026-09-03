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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ol implements org.telegram.ui.Components.ji {
    public final /* synthetic */ zn a;

    public ol(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.Components.ji
    public final void C0(org.telegram.ui.Components.wg wgVar) {
        this.a.h8(wgVar);
    }

    @Override // org.telegram.ui.Components.ji
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
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
        zn znVar = this.a;
        if (znVar.getParentActivity() == null || (t2Var = znVar.G1) == null) {
            return;
        }
        boolean z16 = t2Var.D;
        MessageObject messageObject = t2Var.E1;
        znVar.m5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z11;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || t2Var.g0.getSelectedPhotos().isEmpty())) {
            nh.t2 t2Var2 = znVar.G1;
            if (t2Var2 != null) {
                t2Var2.dismissWithButtonClick(i10);
            }
            znVar.Aa(i10);
            return;
        }
        nh.t2 t2Var3 = znVar.G1;
        if (t2Var3 != null && i10 != 8) {
            t2Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = znVar.G1.g0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = znVar.G1.g0.getSelectedPhotosOrder();
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
                    znVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z13 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z13 = false;
                }
                MessageObject messageObject2 = znVar.m5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(znVar.getAccountInstance(), arrayList2, znVar.Q5, znVar.k5, znVar.U3, null, znVar.i5, i10 == 4 || z12, z4, znVar.m5, z10, i11, i12, znVar.O3, z13, null, znVar.C8(), j10, z11, j11, znVar.N8(), znVar.d5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = znVar.d5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(znVar.m5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = znVar.getAccountInstance();
                    int i19 = ceil;
                    long j12 = znVar.Q5;
                    MessageObject messageObject3 = znVar.m5;
                    int i20 = i15;
                    MessageObject messageObject4 = znVar.U3;
                    pn pnVar = znVar.i5;
                    if (i10 == 4 || z12) {
                        arrayList = arrayList2;
                        z14 = true;
                    } else {
                        arrayList = arrayList2;
                        z14 = false;
                    }
                    i14 = i20;
                    i13 = i19;
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, pnVar, z14, z4, null, z10, i11, i12, znVar.O3, z13, null, znVar.C8(), j10, z11, j11, znVar.N8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z16 = z18;
            }
            hashMap = selectedPhotos;
            znVar.y6();
            znVar.V.setFieldText("");
        }
        if (i11 != 0) {
            if (znVar.P3 == -1) {
                znVar.P3 = 0;
            }
            znVar.P3 += hashMap.size();
            znVar.Ec(true);
        }
    }

    @Override // org.telegram.ui.Components.ji
    public final void Q0() {
        this.a.V.P();
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean X1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final boolean h0() {
        return this.a.P9();
    }

    @Override // org.telegram.ui.Components.ji
    public final void o1(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        zn znVar = this.a;
        if (znVar.V == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        znVar.V.setFieldText("@" + publicUsername + " ");
        znVar.V.H0();
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void Z0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}

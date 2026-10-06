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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ll implements org.telegram.ui.Components.vi {
    public final /* synthetic */ yn a;

    public ll(yn ynVar) {
        this.a = ynVar;
    }

    @Override // org.telegram.ui.Components.vi
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
        yn ynVar = this.a;
        if (ynVar.getParentActivity() == null || (g4Var = ynVar.H1) == null) {
            return;
        }
        boolean z17 = g4Var.G;
        MessageObject messageObject = g4Var.H1;
        ynVar.n5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || g4Var.j0.getSelectedPhotos().isEmpty())) {
            ai.g4 g4Var2 = ynVar.H1;
            if (g4Var2 != null) {
                g4Var2.dismissWithButtonClick(i10);
            }
            ynVar.za(i10);
            return;
        }
        ai.g4 g4Var3 = ynVar.H1;
        if (g4Var3 != null && i10 != 8) {
            g4Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = ynVar.H1.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = ynVar.H1.j0.getSelectedPhotosOrder();
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
                    ynVar.l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = ynVar.n5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(ynVar.getAccountInstance(), arrayList2, ynVar.R5, ynVar.l5, ynVar.V3, null, ynVar.j5, i10 == 4 || z13, z10, ynVar.n5, z11, i11, i12, ynVar.P3, z14, null, ynVar.D8(), j3, z12, j10, ynVar.O8(), ynVar.e5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = ynVar.e5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(ynVar.n5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = ynVar.getAccountInstance();
                    int i19 = ceil;
                    long j11 = ynVar.R5;
                    MessageObject messageObject3 = ynVar.n5;
                    int i20 = i15;
                    MessageObject messageObject4 = ynVar.V3;
                    on onVar = ynVar.j5;
                    if (i10 == 4 || z13) {
                        arrayList = arrayList2;
                        z15 = true;
                    } else {
                        arrayList = arrayList2;
                        z15 = false;
                    }
                    i14 = i20;
                    i13 = i19;
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j11, messageObject3, messageObject4, null, onVar, z15, z10, null, z11, i11, i12, ynVar.P3, z14, null, ynVar.D8(), j3, z12, j10, ynVar.O8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z17 = z19;
            }
            hashMap = selectedPhotos;
            ynVar.y6();
            ynVar.W.setFieldText("");
        }
        if (i11 != 0) {
            if (ynVar.Q3 == -1) {
                ynVar.Q3 = 0;
            }
            ynVar.Q3 += hashMap.size();
            ynVar.Dc(true);
        }
    }

    @Override // org.telegram.ui.Components.vi
    public final void K0() {
        this.a.W.N();
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ boolean S1() {
        return false;
    }

    @Override // org.telegram.ui.Components.vi
    public final boolean a0() {
        return this.a.O9();
    }

    @Override // org.telegram.ui.Components.vi
    public final void j1(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        yn ynVar = this.a;
        if (ynVar.W == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        ynVar.W.setFieldText("@" + publicUsername + " ");
        ynVar.W.H0();
    }

    @Override // org.telegram.ui.Components.vi
    public final void x0(org.telegram.ui.Components.ih ihVar) {
        this.a.h8(ihVar);
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}

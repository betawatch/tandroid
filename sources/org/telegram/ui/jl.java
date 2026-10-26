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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jl implements org.telegram.ui.Components.ri {
    public final /* synthetic */ un a;

    public jl(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.Components.ri
    public final void A(org.telegram.ui.Components.gh ghVar) {
        this.a.o8(ghVar);
    }

    @Override // org.telegram.ui.Components.ri
    public final boolean E() {
        return this.a.Z9();
    }

    @Override // org.telegram.ui.Components.ri
    public final void R() {
        this.a.Y.M();
    }

    @Override // org.telegram.ui.Components.ri
    public final void Y(TLRPC.User user) {
        String publicUsername = UserObject.getPublicUsername(user);
        un unVar = this.a;
        if (unVar.Y == null || user == null || TextUtils.isEmpty(publicUsername)) {
            return;
        }
        unVar.Y.setFieldText("@" + publicUsername + " ");
        unVar.Y.F0();
    }

    @Override // org.telegram.ui.Components.ri
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        di.a3 a3Var;
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
        un unVar = this.a;
        if (unVar.getParentActivity() == null || (a3Var = unVar.V1) == null) {
            return;
        }
        boolean z18 = a3Var.G;
        MessageObject messageObject = a3Var.K1;
        unVar.B5 = messageObject;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || a3Var.j0.getSelectedPhotos().isEmpty())) {
            di.a3 a3Var2 = unVar.V1;
            if (a3Var2 != null) {
                a3Var2.dismissWithButtonClick(i10);
            }
            unVar.Ja(i10);
            return;
        }
        di.a3 a3Var3 = unVar.V1;
        if (a3Var3 != null && i10 != 8) {
            a3Var3.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = unVar.V1.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = unVar.V1.j0.getSelectedPhotosOrder();
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
                    unVar.s8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                    z14 = ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder;
                } else {
                    z14 = false;
                }
                MessageObject messageObject2 = unVar.B5;
                if (messageObject2 == null || !messageObject2.needResendWhenEdit()) {
                    i13 = ceil;
                    i14 = i15;
                    SendMessagesHelper.prepareSendingMedia(unVar.getAccountInstance(), arrayList2, unVar.f6, unVar.z5, unVar.j4, null, unVar.x5, i10 == 4 || z13, z10, unVar.B5, z11, i11, i12, unVar.d4, z14, null, unVar.L8(), j10, z12, j11, unVar.X8(), unVar.s5);
                } else {
                    MessageSuggestionParams messageSuggestionParams = unVar.s5;
                    if (messageSuggestionParams == null) {
                        messageSuggestionParams = MessageSuggestionParams.of(unVar.B5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams2 = messageSuggestionParams;
                    AccountInstance accountInstance = unVar.getAccountInstance();
                    int i19 = ceil;
                    long j12 = unVar.f6;
                    MessageObject messageObject3 = unVar.B5;
                    int i20 = i15;
                    MessageObject messageObject4 = unVar.j4;
                    kn knVar = unVar.x5;
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
                    SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList, j12, messageObject3, messageObject4, null, knVar, z16, z10, null, z11, i11, i12, unVar.d4, z14, null, unVar.L8(), j10, z12, j11, unVar.X8(), messageSuggestionParams2);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z18 = z20;
            }
            hashMap = selectedPhotos;
            unVar.D6();
            unVar.Y.setFieldText("");
        }
        if (i11 != 0) {
            if (unVar.e4 == -1) {
                unVar.e4 = 0;
            }
            unVar.e4 += hashMap.size();
            unVar.Rc(true);
        }
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean x0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void T(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}

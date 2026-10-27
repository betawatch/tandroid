package fi;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ey;
import org.telegram.ui.fg1;
import org.telegram.ui.ht;
import org.telegram.ui.ke;
import org.telegram.ui.qx;
import org.telegram.ui.ro0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        double d;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        File file;
        String str;
        File file2;
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z11 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str2 = (String) this.f;
                u1 u1Var = s1Var.s;
                ArrayList arrayList = u1Var.n;
                if (s1Var.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i10 = ((org.telegram.ui.ActionBar.k3) u1Var.r).currentAccount;
                        s1Var.d = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new bi.r9(s1Var, str2, z11, 1));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    s1Var.h = messages_botresults.next_offset;
                    if (z11) {
                        arrayList.clear();
                    }
                    arrayList.size();
                    arrayList.addAll(messages_botresults.results);
                    s1Var.l();
                    u1Var.d.c(false);
                    s1Var.r = false;
                    return;
                }
                return;
            case 1:
                sb sbVar = (sb) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z12 = this.b;
                File file3 = (File) this.e;
                w7 w7Var = (w7) this.f;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, z12 ? 95 : 99, new FileOutputStream(file3));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new e2.m0(sbVar, w7Var, file3, 8));
                return;
            case 2:
                jg.z zVar = (jg.z) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                boolean z13 = this.b;
                ArrayList arrayList5 = zVar.b;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                int i19 = zVar.a;
                MessagesController.getInstance(i19).putUsers(arrayList3, true);
                MessagesController.getInstance(i19).putChats(arrayList4, true);
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                zVar.c = false;
                zVar.e(false, z13);
                return;
            case 3:
                li.j4.f((org.telegram.ui.ActionBar.r2) this.c, (Context) this.d, (org.telegram.ui.ActionBar.u6) this.e, (li.s3) this.f, this.b);
                return;
            case 4:
                ((FactCheckController) this.c).lambda$applyFactCheck$15((TLObject) this.d, (TLRPC.TL_textWithEntities) this.e, this.b, (org.telegram.ui.ActionBar.e2) this.f);
                return;
            case 5:
                ((MediaDataController) this.c).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) this.e, (TLObject) this.d, (String) this.f, this.b);
                return;
            case 6:
                ((MessagesController) this.c).lambda$setParticipantBannedRole$90((TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.r2) this.e, (TLRPC.TL_channels_editBanned) this.f, this.b);
                return;
            case 7:
                ((MessagesStorage) this.c).lambda$replaceMessageIfExists$238((TLRPC.Message) this.d, this.b, (ArrayList) this.e, (ArrayList) this.f);
                return;
            case 8:
                ((MessagesStorage) this.c).lambda$putChannelViews$195((a0.h) this.d, (a0.h) this.e, (a0.h) this.f, this.b);
                return;
            case 9:
                ((SendMessagesHelper) this.c).lambda$sendEditRichMessageRequest$26((TLRPC.TL_messages_editMessage) this.d, (MessageObject) this.e, (org.telegram.ui.ActionBar.r2) this.f, this.b);
                return;
            case 10:
                ((SendMessagesHelper) this.c).lambda$performSendMessageRequest$83((TLRPC.Message) this.e, this.b, (TLObject) this.d, (SendMessagesHelper.DelayedMessage) this.f);
                return;
            case 11:
                ((UnconfirmedAuthController) this.c).lambda$updateList$7((boolean[]) this.d, (ArrayList) this.e, this.b, (Utilities.Callback) this.f);
                return;
            case 12:
                ((CameraController) this.c).lambda$recordVideo$12((CameraController.ICameraView) this.d, (File) this.e, this.b, (Runnable) this.f);
                return;
            case 13:
                ke keVar = (ke) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z14 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.n0(password);
                    keVar.F(twoStepVerificationActivity.m0(), twoStepVerificationActivity, z14);
                    return;
                }
                return;
            case 14:
                Object obj = null;
                wn wnVar = (wn) this.c;
                qf.c cVar = (qf.c) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                bi.t3 t3Var = (bi.t3) this.f;
                boolean z15 = this.b;
                cVar.b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    wnVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    wnVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        obj = wnVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (peerDialogId < 0) {
                        obj = wnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                }
                t3Var.run(obj, Boolean.valueOf(z15));
                return;
            case 15:
                org.telegram.ui.Components.qa qaVar = (org.telegram.ui.Components.qa) this.c;
                String str3 = (String) this.f;
                Bitmap bitmap2 = (Bitmap) this.d;
                boolean z16 = this.b;
                Bitmap bitmap3 = (Bitmap) this.e;
                if (TextUtils.equals(qaVar.a, str3)) {
                    qaVar.f = null;
                    Bitmap bitmap4 = qaVar.b;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                    }
                    qaVar.b = bitmap2;
                    Runnable runnable = qaVar.e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap2.recycle();
                }
                if (z16) {
                    bitmap3.recycle();
                    return;
                }
                return;
            case 16:
                ju juVar = (ju) this.c;
                boolean z17 = this.b;
                bi.t tVar = (bi.t) this.d;
                String str4 = (String) this.f;
                TextView textView = (TextView) this.e;
                ClipboardManager clipboardManager = (ClipboardManager) juVar.getContext().getSystemService("clipboard");
                boolean z18 = z17 && (TextUtils.isEmpty(tVar.getText()) || TextUtils.equals(tVar.getText().toString(), str4)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                wh.q(textView.animate().alpha(z18 ? 1.0f : 0.0f).scaleX(z18 ? 1.0f : 0.7f).scaleY(z18 ? 1.0f : 0.7f), ds.h, 300L);
                return;
            case 17:
                az azVar = (az) this.c;
                String str5 = (String) this.f;
                boolean z19 = this.b;
                String str6 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.d;
                azVar.a.remove(str6);
                sz szVar = azVar.b;
                xy xyVar = szVar.j0;
                HashMap hashMap = szVar.l0;
                if (xyVar.v && xyVar.w.equals(str5)) {
                    szVar.j0.E(str5, "", false, true, z19, str6, tLObject4);
                    return;
                }
                if (z19 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    azVar.a(str5, false);
                    return;
                } else {
                    if (!(tLObject4 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str6)) {
                        return;
                    }
                    hashMap.put(str6, (TLRPC.messages_BotResults) tLObject4);
                    return;
                }
            case 18:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                wn wnVar2 = (wn) this.f;
                boolean z20 = this.b;
                File w10 = w7.w(r2Var.getCurrentAccount(), "webp");
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                float f7 = 512;
                float f10 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
                double d10 = (f10 * f7) / f7;
                if (((float) Math.floor(d10)) > f10) {
                    f10 = (float) Math.floor(d10);
                }
                float f11 = f10;
                Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                createBitmap.recycle();
                ArrayList arrayList6 = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList6.add(photoEntry);
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                mediaEntity.parentObject = tL_messages_stickerSet;
                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true).getAbsolutePath();
                mediaEntity.x = 0.5f - ((Math.min(512, 512) / f7) / 2.0f);
                mediaEntity.y = 0.5f - ((Math.min(512, 512) / f7) / 2.0f);
                mediaEntity.width = Math.min(512, 512) / f7;
                mediaEntity.height = Math.min(512, 512) / f7;
                int floor = (int) Math.floor(f11 * 0.5d);
                mediaEntity.viewWidth = floor;
                mediaEntity.viewHeight = floor;
                mediaEntity.scale = 2.0f;
                mediaEntity.document = document;
                if (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoStickerDocument(document)) {
                    mediaEntity.subType = (byte) ((MessageObject.isAnimatedStickerDocument(document, true) ? (byte) 1 : (byte) 4) | mediaEntity.subType);
                }
                ArrayList<VideoEditedInfo.MediaEntity> arrayList7 = new ArrayList<>();
                photoEntry.mediaEntities = arrayList7;
                arrayList7.add(mediaEntity);
                photoEntry.averageDuration = 3000L;
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                    if (pathToAttach != null) {
                        try {
                            RLottieNative a2 = RLottieNative.a(pathToAttach.getAbsolutePath(), null, null, null, 0, null);
                            if (a2 != null) {
                                int[] iArr = a2.a;
                                int i20 = iArr[0];
                                int i21 = iArr[1];
                                a2.d();
                                d = i20 / i21;
                            } else {
                                d = 0.0d;
                            }
                            photoEntry.averageDuration = (long) (d * 1000.0d);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                PhotoViewer.v1().N2(r2Var.getParentActivity(), null, r2Var.getResourceProvider());
                PhotoViewer.v1().j2(arrayList6, 0, 11, false, new uy0(), wnVar2);
                PhotoViewer.v1().Z0(document, z20 ? document : null, true, null);
                ht.o().T = z20 ? tL_messages_stickerSet : null;
                return;
            case 19:
                qx qxVar = (qx) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                String str7 = (String) this.f;
                boolean z21 = this.b;
                ey eyVar = qxVar.a;
                if (tL_error2 == null) {
                    TLRPC.User user = eyVar.getMessagesController().getUser(Long.valueOf(eyVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = eyVar.getUserConfig().getCurrentUser();
                        if (user == null) {
                            return;
                        } else {
                            eyVar.getMessagesController().putUser(user, false);
                        }
                    } else {
                        eyVar.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList8 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList8, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList8, 800);
                    TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize == null || eyVar.c4 == null) {
                        z10 = true;
                    } else {
                        i16 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i16).getPathToAttach(closestPhotoSizeWithSize, true);
                        i17 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                        FileLoader.getInstance(i17).getPathToAttach(eyVar.c4, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(eyVar.c4.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(eyVar.c4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i18 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                        user = user;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUserOrChat(i18, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str7 != null) {
                        i15 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                        new File(str7).renameTo(FileLoader.getInstance(i15).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && eyVar.d4 != null) {
                        i13 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i14 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(eyVar.d4, true).renameTo(pathToAttach3);
                    }
                    eyVar.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(user);
                    i11 = 0;
                    eyVar.getMessagesStorage().putUsersAndChats(arrayList9, null, false, true);
                    TLRPC.UserFull userFull = eyVar.getMessagesController().getUserFull(eyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        eyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    i11 = 0;
                }
                eyVar.c4 = null;
                eyVar.d4 = null;
                NotificationCenter notificationCenter = eyVar.getNotificationCenter();
                int i22 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i11] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i22, objArr);
                eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i11]);
                eyVar.getUserConfig().saveConfig(true);
                i12 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                MessagesController.getInstance(i12).removeSuggestion(0L, "USERPIC_SETUP");
                eyVar.c5();
                org.telegram.ui.Components.qc qcVar = eyVar.e4;
                if (qcVar != null) {
                    org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
                    hcVar.d.c(LocaleController.getString(z21 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    hcVar.setProgress(1.0f);
                    org.telegram.ui.Components.mb button = hcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    wh.q(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), ds.h, 360L);
                    org.telegram.ui.Components.qc qcVar2 = eyVar.e4;
                    qcVar2.j = 5000;
                    qcVar2.i(false);
                    eyVar.e4.i(true);
                    return;
                }
                return;
            case 20:
                ro0.b0((ro0) this.c, this.b, (String) this.f, (String) this.d, (TL_account.updatePasswordSettings) this.e);
                return;
            case 21:
                ro0.j0((ro0) this.c, (TLRPC.TL_error) this.e, this.b, (TLObject) this.d, (String) this.f);
                return;
            case 22:
                fg1.V((fg1) this.c, (TLObject) this.d, this.b, (String) this.f, (TL_account.passwordInputSettings) this.e);
                return;
            case 23:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.c;
                boolean z22 = this.b;
                String str8 = (String) this.f;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.e;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    vg.j.d(z22, str8, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, r2Var2.getParentActivity(), r2Var2.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        vg.j.e(z22, str8, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, r2Var2.getParentActivity(), r2Var2.getResourceProvider());
                        return;
                    }
                    return;
                }
            default:
                vi.u0 u0Var = (vi.u0) this.c;
                boolean z23 = this.b;
                vi.w wVar = (vi.w) this.d;
                vi.q0 q0Var = (vi.q0) this.e;
                File file4 = (File) this.f;
                u0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    u0Var.g();
                    long j10 = u0Var.H;
                    if (z23) {
                        synchronized (wVar) {
                            wVar.w = true;
                            try {
                                wVar.g();
                                wVar.w = false;
                            } catch (Throwable th3) {
                                wVar.w = false;
                                throw th3;
                            }
                        }
                        u0Var.g();
                        u0Var.k(q0Var, 1);
                        file2 = wVar.a;
                        try {
                            u0Var.c(true);
                            vi.w wVar2 = u0Var.T;
                            long j11 = u0Var.J;
                            long j12 = u0Var.K;
                            int i23 = wVar.i();
                            int i24 = u0Var.n.a;
                            int i25 = u0Var.o;
                            if (i23 <= 0) {
                                i23 = u0Var.p.a;
                            }
                            a3.l lVar = new a3.l(i24, i25, i23);
                            str = "resume prepared without remux: retainedDurationMs=";
                            k2.t0 a10 = w7.x.a(file4, wVar2, j11, j12, true, lVar);
                            j10 = a10.b;
                            u0Var.m.b("resume trim remux completed: requested=" + u0Var.J + ".." + u0Var.K + ", actualStartMs=" + a10.a + ", mode=" + ((String) a10.c) + ", retainedDurationMs=" + j10 + ", outputSize=" + u0Var.T.a.length() + ", elapsedMs=" + vi.u0.f(nanoTime));
                        } catch (Exception e11) {
                            e = e11;
                            file = file2;
                            try {
                                u0Var.i.post(new vi.e0(u0Var, e, 1));
                                if (file4 != null) {
                                    w7.x.c(file4);
                                }
                                if (file != null) {
                                    w7.x.c(file);
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                if (file4 != null) {
                                    w7.x.c(file4);
                                }
                                if (file != null) {
                                    w7.x.c(file);
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            file = file2;
                            if (file4 != null) {
                            }
                            if (file != null) {
                            }
                            throw th;
                        }
                    } else {
                        str = "resume prepared without remux: retainedDurationMs=";
                        file2 = null;
                    }
                    u0Var.g();
                    u0Var.U = null;
                    if (!z23) {
                        u0Var.m.b(str + j10 + ", elapsedMs=" + vi.u0.f(nanoTime));
                    }
                    u0Var.i.post(new vi.f0(u0Var, j10, 0));
                    if (file4 != null) {
                        w7.x.c(file4);
                    }
                    if (file2 != null) {
                        w7.x.c(file2);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    e = e12;
                    file = null;
                } catch (Throwable th6) {
                    th = th6;
                    file = null;
                }
        }
    }

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
    }

    public /* synthetic */ r1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f = obj3;
        this.b = z10;
    }

    public /* synthetic */ r1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ r1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.e = tLObject;
        this.b = z10;
        this.d = tLObject2;
        this.f = obj;
    }

    public /* synthetic */ r1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = 23;
        this.c = payments_giveawayinfo;
        this.b = z10;
        this.f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = r2Var;
    }

    public /* synthetic */ r1(org.telegram.ui.Components.qa qaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.a = 15;
        this.c = qaVar;
        this.f = str;
        this.d = bitmap;
        this.b = z10;
        this.e = bitmap2;
    }

    public /* synthetic */ r1(ju juVar, boolean z10, bi.t tVar, String str, TextView textView) {
        this.a = 16;
        this.c = juVar;
        this.b = z10;
        this.d = tVar;
        this.f = str;
        this.e = textView;
    }

    public /* synthetic */ r1(az azVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.a = 17;
        this.c = azVar;
        this.f = str;
        this.b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public /* synthetic */ r1(ro0 ro0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 20;
        this.c = ro0Var;
        this.b = z10;
        this.f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public /* synthetic */ r1(fg1 fg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 22;
        this.c = fg1Var;
        this.d = tLObject;
        this.b = z10;
        this.f = str;
        this.e = passwordinputsettings;
    }

    public /* synthetic */ r1(vi.u0 u0Var, boolean z10, vi.w wVar, vi.q0 q0Var, File file) {
        this.a = 24;
        this.c = u0Var;
        this.b = z10;
        this.d = wVar;
        this.e = q0Var;
        this.f = file;
    }
}

package ai;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ey;
import org.telegram.ui.fo0;
import org.telegram.ui.gt;
import org.telegram.ui.rx;
import org.telegram.ui.sn;
import org.telegram.ui.xf1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e2(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        Object obj;
        double d;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        File file;
        String str;
        File file2;
        boolean z11 = false;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject = (TLObject) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z12 = this.c;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    k7Var.Z1(twoStepVerificationActivity.l0(), null, twoStepVerificationActivity, z12, null);
                    return;
                }
                return;
            case 1:
                ei.t1 t1Var = (ei.t1) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                boolean z13 = this.c;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str2 = (String) this.f;
                ei.v1 v1Var = t1Var.s;
                ArrayList arrayList = v1Var.n;
                if (t1Var.r) {
                    if (!(tLObject2 instanceof TLRPC.messages_BotResults)) {
                        i10 = ((org.telegram.ui.ActionBar.f3) v1Var.r).currentAccount;
                        t1Var.d = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new w9(t1Var, str2, z13, 1));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                    t1Var.h = messages_botresults.next_offset;
                    if (z13) {
                        arrayList.clear();
                    }
                    arrayList.size();
                    arrayList.addAll(messages_botresults.results);
                    t1Var.l();
                    v1Var.d.c(false);
                    t1Var.r = false;
                    return;
                }
                return;
            case 2:
                ei.vb vbVar = (ei.vb) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                boolean z14 = this.c;
                File file3 = (File) this.b;
                ei.a8 a8Var = (ei.a8) this.f;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, z14 ? 95 : 99, new FileOutputStream(file3));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new ei.z1(vbVar, a8Var, file3, 7));
                return;
            case 3:
                ig.y yVar = (ig.y) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.b;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                boolean z15 = this.c;
                ArrayList arrayList5 = yVar.b;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                int i18 = yVar.a;
                MessagesController.getInstance(i18).putUsers(arrayList3, true);
                MessagesController.getInstance(i18).putChats(arrayList4, true);
                NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                yVar.c = false;
                yVar.e(false, z15);
                return;
            case 4:
                ki.j4.f((org.telegram.ui.ActionBar.n2) this.d, (Context) this.e, (org.telegram.ui.ActionBar.d6) this.b, (ki.t3) this.f, this.c);
                return;
            case 5:
                ((FactCheckController) this.d).lambda$applyFactCheck$15((TLObject) this.b, (TLRPC.TL_textWithEntities) this.e, this.c, (org.telegram.ui.ActionBar.b2) this.f);
                return;
            case 6:
                ((MediaDataController) this.d).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) this.e, (TLObject) this.b, (String) this.f, this.c);
                return;
            case 7:
                ((MessagesController) this.d).lambda$setParticipantBannedRole$90((TLRPC.TL_error) this.e, (org.telegram.ui.ActionBar.n2) this.b, (TLRPC.TL_channels_editBanned) this.f, this.c);
                return;
            case 8:
                ((MessagesStorage) this.d).lambda$putChannelViews$191((a0.h) this.e, (a0.h) this.b, (a0.h) this.f, this.c);
                return;
            case 9:
                ((MessagesStorage) this.d).lambda$replaceMessageIfExists$234((TLRPC.Message) this.e, this.c, (ArrayList) this.b, (ArrayList) this.f);
                return;
            case 10:
                ((SendMessagesHelper) this.d).lambda$sendEditRichMessageRequest$26((TLRPC.TL_messages_editMessage) this.e, (MessageObject) this.b, (org.telegram.ui.ActionBar.n2) this.f, this.c);
                return;
            case 11:
                ((SendMessagesHelper) this.d).lambda$performSendMessageRequest$83((TLRPC.Message) this.e, this.c, (TLObject) this.b, (SendMessagesHelper.DelayedMessage) this.f);
                return;
            case 12:
                ((UnconfirmedAuthController) this.d).lambda$updateList$7((boolean[]) this.e, (ArrayList) this.b, this.c, (Utilities.Callback) this.f);
                return;
            case 13:
                ((CameraController) this.d).lambda$recordVideo$12((CameraController.ICameraView) this.e, (File) this.b, this.c, (Runnable) this.f);
                return;
            case 14:
                org.telegram.ui.ke keVar = (org.telegram.ui.ke) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject3 = (TLObject) this.b;
                TwoStepVerificationActivity twoStepVerificationActivity2 = (TwoStepVerificationActivity) this.f;
                boolean z16 = this.c;
                if (tL_error2 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    twoStepVerificationActivity2.I = password2;
                    TwoStepVerificationActivity.m0(password2);
                    keVar.b0(z16, twoStepVerificationActivity2.l0(), twoStepVerificationActivity2);
                    return;
                }
                return;
            case 15:
                sn snVar = (sn) this.d;
                pf.c cVar = (pf.c) this.e;
                TLObject tLObject4 = (TLObject) this.b;
                t3 t3Var = (t3) this.f;
                boolean z17 = this.c;
                cVar.b();
                if (tLObject4 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject4;
                    snVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    snVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        obj = snVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (peerDialogId < 0) {
                        obj = snVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    t3Var.run(obj, Boolean.valueOf(z17));
                    return;
                }
                obj = null;
                t3Var.run(obj, Boolean.valueOf(z17));
                return;
            case 16:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) this.d;
                String str3 = (String) this.e;
                Bitmap bitmap2 = (Bitmap) this.b;
                boolean z18 = this.c;
                Bitmap bitmap3 = (Bitmap) this.f;
                if (TextUtils.equals(oaVar.a, str3)) {
                    oaVar.f = null;
                    Bitmap bitmap4 = oaVar.b;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                    }
                    oaVar.b = bitmap2;
                    Runnable runnable = oaVar.e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap2.recycle();
                }
                if (z18) {
                    bitmap3.recycle();
                    return;
                }
                return;
            case 17:
                iu iuVar = (iu) this.d;
                boolean z19 = this.c;
                t tVar = (t) this.e;
                String str4 = (String) this.b;
                TextView textView = (TextView) this.f;
                ClipboardManager clipboardManager = (ClipboardManager) iuVar.getContext().getSystemService("clipboard");
                boolean z20 = z19 && (TextUtils.isEmpty(tVar.getText()) || TextUtils.equals(tVar.getText().toString(), str4)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                wh.t(textView.animate().alpha(z20 ? 1.0f : 0.0f).scaleX(z20 ? 1.0f : 0.7f).scaleY(z20 ? 1.0f : 0.7f), bs.h, 300L);
                return;
            case 18:
                bz bzVar = (bz) this.d;
                String str5 = (String) this.e;
                boolean z21 = this.c;
                String str6 = (String) this.f;
                TLObject tLObject5 = (TLObject) this.b;
                bzVar.a.remove(str6);
                tz tzVar = bzVar.b;
                yy yyVar = tzVar.j0;
                HashMap hashMap = tzVar.l0;
                if (yyVar.v && yyVar.w.equals(str5)) {
                    tzVar.j0.E(str5, "", false, true, z21, str6, tLObject5);
                    return;
                }
                if (z21 && (!(tLObject5 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject5).results.isEmpty())) {
                    bzVar.a(str5, false);
                    return;
                } else {
                    if (!(tLObject5 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str6)) {
                        return;
                    }
                    hashMap.put(str6, (TLRPC.messages_BotResults) tLObject5);
                    return;
                }
            case 19:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.e;
                TLRPC.Document document = (TLRPC.Document) this.b;
                sn snVar2 = (sn) this.f;
                boolean z22 = this.c;
                File w9 = ei.a8.w(n2Var.getCurrentAccount(), "webp");
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
                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                createBitmap.recycle();
                ArrayList arrayList6 = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w9.getAbsolutePath(), 0, false, 0, 0, 0L);
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
                                int i19 = iArr[0];
                                int i20 = iArr[1];
                                a2.d();
                                d = i19 / i20;
                            } else {
                                d = 0.0d;
                            }
                            photoEntry.averageDuration = (long) (d * 1000.0d);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                PhotoViewer.t1().K2(n2Var.getParentActivity(), null, n2Var.getResourceProvider());
                PhotoViewer.t1().g2(arrayList6, 0, 11, false, new fy0(), snVar2);
                PhotoViewer.t1().Y0(document, z22 ? document : null, true, null);
                gt.q().T = z22 ? tL_messages_stickerSet : null;
                return;
            case 20:
                rx rxVar = (rx) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                TLObject tLObject6 = (TLObject) this.b;
                String str7 = (String) this.f;
                boolean z23 = this.c;
                ey eyVar = rxVar.a;
                if (tL_error3 == null) {
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
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject6;
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
                        i15 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i15).getPathToAttach(closestPhotoSizeWithSize, true);
                        i16 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                        FileLoader.getInstance(i16).getPathToAttach(eyVar.c4, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(eyVar.c4.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(eyVar.c4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i17 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUserOrChat(i17, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str7 != null) {
                        i14 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                        new File(str7).renameTo(FileLoader.getInstance(i14).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && eyVar.d4 != null) {
                        i12 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i12).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i13 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                        FileLoader.getInstance(i13).getPathToAttach(eyVar.d4, true).renameTo(pathToAttach3);
                    }
                    eyVar.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(user);
                    eyVar.getMessagesStorage().putUsersAndChats(arrayList9, null, false, true);
                    TLRPC.UserFull userFull = eyVar.getMessagesController().getUserFull(eyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        eyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                }
                eyVar.c4 = null;
                eyVar.d4 = null;
                eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                eyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                eyVar.getUserConfig().saveConfig(true);
                i11 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                MessagesController.getInstance(i11).removeSuggestion(0L, "USERPIC_SETUP");
                eyVar.S4();
                org.telegram.ui.Components.qc qcVar = eyVar.e4;
                if (qcVar != null) {
                    org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
                    hcVar.d.c(LocaleController.getString(z23 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    hcVar.setProgress(1.0f);
                    org.telegram.ui.Components.mb button = hcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    wh.t(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), bs.h, 360L);
                    org.telegram.ui.Components.qc qcVar2 = eyVar.e4;
                    qcVar2.j = 5000;
                    qcVar2.i(false);
                    eyVar.e4.i(true);
                    return;
                }
                return;
            case 21:
                fo0.a0((fo0) this.d, this.c, (String) this.e, (String) this.b, (TL_account.updatePasswordSettings) this.f);
                return;
            case 22:
                fo0.i0((fo0) this.d, (TLRPC.TL_error) this.e, this.c, (TLObject) this.b, (String) this.f);
                return;
            case 23:
                xf1.U((xf1) this.d, (TLObject) this.b, this.c, (String) this.e, (TL_account.passwordInputSettings) this.f);
                return;
            case 24:
                si.t0 t0Var = (si.t0) this.d;
                boolean z24 = this.c;
                si.x xVar = (si.x) this.e;
                si.p0 p0Var = (si.p0) this.b;
                File file4 = (File) this.f;
                t0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    t0Var.g();
                    long j10 = t0Var.E;
                    if (z24) {
                        synchronized (xVar) {
                            xVar.v = true;
                            try {
                                xVar.g();
                            } finally {
                                xVar.v = false;
                            }
                        }
                        t0Var.g();
                        t0Var.k(p0Var, 1);
                        file2 = xVar.a;
                        try {
                            t0Var.c(true);
                            str = "resume prepared without remux: retainedDurationMs=";
                            a3.z a10 = w7.p7.a(file4, t0Var.Q, t0Var.G, t0Var.H, true);
                            j10 = a10.b;
                            t0Var.m.b("resume trim remux completed: requested=" + t0Var.G + ".." + t0Var.H + ", actualStartMs=" + a10.a + ", retainedDurationMs=" + j10 + ", outputSize=" + t0Var.Q.a.length() + ", elapsedMs=" + si.t0.f(nanoTime));
                        } catch (Exception e10) {
                            e = e10;
                            file = file2;
                            try {
                                t0Var.i.post(new si.e0(t0Var, e, 1));
                                if (file4 != null) {
                                    w7.p7.c(file4);
                                }
                                if (file == null) {
                                    w7.p7.c(file);
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                if (file4 != null) {
                                    w7.p7.c(file4);
                                }
                                if (file != null) {
                                    w7.p7.c(file);
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
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
                    t0Var.g();
                    t0Var.R = null;
                    if (!z24) {
                        t0Var.m.b(str + j10 + ", elapsedMs=" + si.t0.f(nanoTime));
                    }
                    t0Var.i.post(new si.f0(t0Var, j10, objArr == true ? 1 : 0));
                    if (file4 != null) {
                        w7.p7.c(file4);
                    }
                    if (file2 != null) {
                        w7.p7.c(file2);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    e = e11;
                    file = null;
                    t0Var.i.post(new si.e0(t0Var, e, 1));
                    if (file4 != null) {
                    }
                    if (file == null) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    file = null;
                    if (file4 != null) {
                    }
                    if (file != null) {
                    }
                    throw th;
                }
            default:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.d;
                boolean z25 = this.c;
                String str8 = (String) this.e;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    ug.h.d(z25, str8, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ug.h.e(z25, str8, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ e2(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = z10;
        this.f = obj4;
    }

    public /* synthetic */ e2(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = z10;
        this.b = obj3;
        this.f = obj4;
    }

    public /* synthetic */ e2(Object obj, TLObject tLObject, boolean z10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = tLObject;
        this.c = z10;
        this.e = obj2;
        this.f = obj3;
    }

    public /* synthetic */ e2(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = z10;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
    }

    public /* synthetic */ e2(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.b2 b2Var) {
        this.a = 5;
        this.d = factCheckController;
        this.b = tLObject;
        this.e = tL_textWithEntities;
        this.c = z10;
        this.f = b2Var;
    }

    public /* synthetic */ e2(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 25;
        this.d = payments_giveawayinfo;
        this.c = z10;
        this.e = str;
        this.b = tL_messageMediaGiveaway;
        this.f = n2Var;
    }

    public /* synthetic */ e2(bz bzVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.a = 18;
        this.d = bzVar;
        this.e = str;
        this.c = z10;
        this.f = str2;
        this.b = tLObject;
    }
}

package ei;

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
import org.telegram.messenger.mk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cy;
import org.telegram.ui.eo0;
import org.telegram.ui.et;
import org.telegram.ui.ie;
import org.telegram.ui.px;
import org.telegram.ui.qn;
import org.telegram.ui.vf1;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
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
                t1 t1Var = (t1) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z12 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str2 = (String) this.f;
                v1 v1Var = t1Var.s;
                ArrayList arrayList = v1Var.n;
                if (t1Var.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i10 = ((org.telegram.ui.ActionBar.f3) v1Var.r).currentAccount;
                        t1Var.d = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new ai.w9(t1Var, str2, z12, 1));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    t1Var.h = messages_botresults.next_offset;
                    if (z12) {
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
            case 1:
                vb vbVar = (vb) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z13 = this.b;
                File file3 = (File) this.e;
                a8 a8Var = (a8) this.f;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, z13 ? 95 : 99, new FileOutputStream(file3));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new z1(vbVar, a8Var, file3, 7));
                return;
            case 2:
                ig.y yVar = (ig.y) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                boolean z14 = this.b;
                ArrayList arrayList5 = yVar.b;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                int i18 = yVar.a;
                MessagesController.getInstance(i18).putUsers(arrayList3, true);
                MessagesController.getInstance(i18).putChats(arrayList4, true);
                NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                yVar.c = false;
                yVar.e(false, z14);
                return;
            case 3:
                ki.j4.f((org.telegram.ui.ActionBar.n2) this.c, (Context) this.d, (org.telegram.ui.ActionBar.d6) this.e, (ki.t3) this.f, this.b);
                return;
            case 4:
                ((FactCheckController) this.c).lambda$applyFactCheck$15((TLObject) this.d, (TLRPC.TL_textWithEntities) this.e, this.b, (org.telegram.ui.ActionBar.b2) this.f);
                return;
            case 5:
                ((MediaDataController) this.c).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) this.e, (TLObject) this.d, (String) this.f, this.b);
                return;
            case 6:
                ((MessagesController) this.c).lambda$setParticipantBannedRole$90((TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.n2) this.e, (TLRPC.TL_channels_editBanned) this.f, this.b);
                return;
            case 7:
                ((MessagesStorage) this.c).lambda$putChannelViews$191((a0.h) this.d, (a0.h) this.e, (a0.h) this.f, this.b);
                return;
            case 8:
                ((MessagesStorage) this.c).lambda$replaceMessageIfExists$234((TLRPC.Message) this.d, this.b, (ArrayList) this.e, (ArrayList) this.f);
                return;
            case 9:
                ((SendMessagesHelper) this.c).lambda$sendEditRichMessageRequest$26((TLRPC.TL_messages_editMessage) this.d, (MessageObject) this.e, (org.telegram.ui.ActionBar.n2) this.f, this.b);
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
                ie ieVar = (ie) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z15 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    ieVar.b0(twoStepVerificationActivity.l0(), twoStepVerificationActivity, z15);
                    return;
                }
                return;
            case 14:
                qn qnVar = (qn) this.c;
                pf.c cVar = (pf.c) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                ai.x3 x3Var = (ai.x3) this.f;
                boolean z16 = this.b;
                cVar.b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    qnVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    qnVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        obj = qnVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (peerDialogId < 0) {
                        obj = qnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    x3Var.run(obj, Boolean.valueOf(z16));
                    return;
                }
                obj = null;
                x3Var.run(obj, Boolean.valueOf(z16));
                return;
            case 15:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) this.c;
                String str3 = (String) this.f;
                Bitmap bitmap2 = (Bitmap) this.d;
                boolean z17 = this.b;
                Bitmap bitmap3 = (Bitmap) this.e;
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
                if (z17) {
                    bitmap3.recycle();
                    return;
                }
                return;
            case 16:
                iu iuVar = (iu) this.c;
                boolean z18 = this.b;
                ai.t tVar = (ai.t) this.d;
                String str4 = (String) this.f;
                TextView textView = (TextView) this.e;
                ClipboardManager clipboardManager = (ClipboardManager) iuVar.getContext().getSystemService("clipboard");
                boolean z19 = z18 && (TextUtils.isEmpty(tVar.getText()) || TextUtils.equals(tVar.getText().toString(), str4)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                mk.t(textView.animate().alpha(z19 ? 1.0f : 0.0f).scaleX(z19 ? 1.0f : 0.7f).scaleY(z19 ? 1.0f : 0.7f), bs.h, 300L);
                return;
            case 17:
                bz bzVar = (bz) this.c;
                String str5 = (String) this.f;
                boolean z20 = this.b;
                String str6 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.d;
                bzVar.a.remove(str6);
                tz tzVar = bzVar.b;
                yy yyVar = tzVar.j0;
                HashMap hashMap = tzVar.l0;
                if (yyVar.v && yyVar.w.equals(str5)) {
                    tzVar.j0.E(str5, "", false, true, z20, str6, tLObject4);
                    return;
                }
                if (z20 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    bzVar.a(str5, false);
                    return;
                } else {
                    if (!(tLObject4 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str6)) {
                        return;
                    }
                    hashMap.put(str6, (TLRPC.messages_BotResults) tLObject4);
                    return;
                }
            case 18:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                qn qnVar2 = (qn) this.f;
                boolean z21 = this.b;
                File w9 = a8.w(n2Var.getCurrentAccount(), "webp");
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
                PhotoViewer.u1().M2(n2Var.getParentActivity(), null, n2Var.getResourceProvider());
                PhotoViewer.u1().i2(arrayList6, 0, 11, false, new hy0(), qnVar2);
                PhotoViewer.u1().Z0(document, z21 ? document : null, true, null);
                et.q().T = z21 ? tL_messages_stickerSet : null;
                return;
            case 19:
                px pxVar = (px) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                String str7 = (String) this.f;
                boolean z22 = this.b;
                cy cyVar = pxVar.a;
                if (tL_error2 == null) {
                    TLRPC.User user = cyVar.getMessagesController().getUser(Long.valueOf(cyVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = cyVar.getUserConfig().getCurrentUser();
                        if (user == null) {
                            return;
                        } else {
                            cyVar.getMessagesController().putUser(user, false);
                        }
                    } else {
                        cyVar.getUserConfig().setCurrentUser(user);
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
                    if (closestPhotoSizeWithSize == null || cyVar.c4 == null) {
                        z10 = true;
                    } else {
                        i15 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i15).getPathToAttach(closestPhotoSizeWithSize, true);
                        i16 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                        FileLoader.getInstance(i16).getPathToAttach(cyVar.c4, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cyVar.c4.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(cyVar.c4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i17 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUserOrChat(i17, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str7 != null) {
                        i14 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                        new File(str7).renameTo(FileLoader.getInstance(i14).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && cyVar.d4 != null) {
                        i12 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i12).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i13 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                        FileLoader.getInstance(i13).getPathToAttach(cyVar.d4, true).renameTo(pathToAttach3);
                    }
                    cyVar.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(user);
                    cyVar.getMessagesStorage().putUsersAndChats(arrayList9, null, false, true);
                    TLRPC.UserFull userFull = cyVar.getMessagesController().getUserFull(cyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        cyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                }
                cyVar.c4 = null;
                cyVar.d4 = null;
                cyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                cyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                cyVar.getUserConfig().saveConfig(true);
                i11 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
                MessagesController.getInstance(i11).removeSuggestion(0L, "USERPIC_SETUP");
                cyVar.S4();
                org.telegram.ui.Components.qc qcVar = cyVar.e4;
                if (qcVar != null) {
                    org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
                    hcVar.d.c(LocaleController.getString(z22 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    hcVar.setProgress(1.0f);
                    org.telegram.ui.Components.mb button = hcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    mk.t(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), bs.h, 360L);
                    org.telegram.ui.Components.qc qcVar2 = cyVar.e4;
                    qcVar2.j = 5000;
                    qcVar2.i(false);
                    cyVar.e4.i(true);
                    return;
                }
                return;
            case 20:
                eo0.a0((eo0) this.c, this.b, (String) this.f, (String) this.d, (TL_account.updatePasswordSettings) this.e);
                return;
            case 21:
                eo0.i0((eo0) this.c, (TLRPC.TL_error) this.e, this.b, (TLObject) this.d, (String) this.f);
                return;
            case 22:
                vf1.U((vf1) this.c, (TLObject) this.d, this.b, (String) this.f, (TL_account.passwordInputSettings) this.e);
                return;
            case 23:
                si.s0 s0Var = (si.s0) this.c;
                boolean z23 = this.b;
                si.w wVar = (si.w) this.d;
                si.o0 o0Var = (si.o0) this.e;
                File file4 = (File) this.f;
                s0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    s0Var.g();
                    long j10 = s0Var.E;
                    if (z23) {
                        synchronized (wVar) {
                            wVar.v = true;
                            try {
                                wVar.g();
                            } finally {
                                wVar.v = false;
                            }
                        }
                        s0Var.g();
                        s0Var.k(o0Var, 1);
                        file2 = wVar.a;
                        try {
                            s0Var.c(true);
                            str = "resume prepared without remux: retainedDurationMs=";
                            a3.z a10 = w7.m7.a(file4, s0Var.Q, s0Var.G, s0Var.H, true);
                            j10 = a10.b;
                            s0Var.m.b("resume trim remux completed: requested=" + s0Var.G + ".." + s0Var.H + ", actualStartMs=" + a10.a + ", retainedDurationMs=" + j10 + ", outputSize=" + s0Var.Q.a.length() + ", elapsedMs=" + si.s0.f(nanoTime));
                        } catch (Exception e10) {
                            e = e10;
                            file = file2;
                            try {
                                s0Var.i.post(new si.e0(s0Var, e, 1));
                                if (file4 != null) {
                                    w7.m7.c(file4);
                                }
                                if (file == null) {
                                    w7.m7.c(file);
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                if (file4 != null) {
                                    w7.m7.c(file4);
                                }
                                if (file != null) {
                                    w7.m7.c(file);
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
                    s0Var.g();
                    s0Var.R = null;
                    if (!z23) {
                        s0Var.m.b(str + j10 + ", elapsedMs=" + si.s0.f(nanoTime));
                    }
                    s0Var.i.post(new si.f0(s0Var, j10, objArr == true ? 1 : 0));
                    if (file4 != null) {
                        w7.m7.c(file4);
                    }
                    if (file2 != null) {
                        w7.m7.c(file2);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    e = e11;
                    file = null;
                    s0Var.i.post(new si.e0(s0Var, e, 1));
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
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.c;
                boolean z24 = this.b;
                String str8 = (String) this.f;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.e;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    ug.i.d(z24, str8, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ug.i.e(z24, str8, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ s1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
    }

    public /* synthetic */ s1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f = obj3;
        this.b = z10;
    }

    public /* synthetic */ s1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ s1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.e = tLObject;
        this.b = z10;
        this.d = tLObject2;
        this.f = obj;
    }

    public /* synthetic */ s1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 24;
        this.c = payments_giveawayinfo;
        this.b = z10;
        this.f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = n2Var;
    }

    public /* synthetic */ s1(org.telegram.ui.Components.oa oaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.a = 15;
        this.c = oaVar;
        this.f = str;
        this.d = bitmap;
        this.b = z10;
        this.e = bitmap2;
    }

    public /* synthetic */ s1(iu iuVar, boolean z10, ai.t tVar, String str, TextView textView) {
        this.a = 16;
        this.c = iuVar;
        this.b = z10;
        this.d = tVar;
        this.f = str;
        this.e = textView;
    }

    public /* synthetic */ s1(bz bzVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.a = 17;
        this.c = bzVar;
        this.f = str;
        this.b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public /* synthetic */ s1(eo0 eo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 20;
        this.c = eo0Var;
        this.b = z10;
        this.f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public /* synthetic */ s1(vf1 vf1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 22;
        this.c = vf1Var;
        this.d = tLObject;
        this.b = z10;
        this.f = str;
        this.e = passwordinputsettings;
    }

    public /* synthetic */ s1(si.s0 s0Var, boolean z10, si.w wVar, si.o0 o0Var, File file) {
        this.a = 23;
        this.c = s0Var;
        this.b = z10;
        this.d = wVar;
        this.e = o0Var;
        this.f = file;
    }
}

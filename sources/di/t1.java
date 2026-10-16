package di;

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
import org.telegram.messenger.sk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.wz;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.fo;
import org.telegram.ui.kf;
import org.telegram.ui.my;
import org.telegram.ui.oh1;
import org.telegram.ui.qe;
import org.telegram.ui.xt;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
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
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                v1 v1Var = (v1) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z12 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str2 = (String) this.f;
                y1 y1Var = v1Var.s;
                ArrayList arrayList = y1Var.n;
                if (v1Var.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i10 = ((org.telegram.ui.ActionBar.e3) y1Var.r).currentAccount;
                        v1Var.d = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new u1((Object) v1Var, (Object) str2, z12, (int) (objArr == true ? 1 : 0)));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    v1Var.h = messages_botresults.next_offset;
                    if (z12) {
                        arrayList.clear();
                    }
                    arrayList.size();
                    arrayList.addAll(messages_botresults.results);
                    v1Var.l();
                    y1Var.d.c(false);
                    v1Var.r = false;
                    return;
                }
                return;
            case 1:
                kc kcVar = (kc) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z13 = this.b;
                File file3 = (File) this.e;
                k8 k8Var = (k8) this.f;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, z13 ? 95 : 99, new FileOutputStream(file3));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new a3.l0(kcVar, k8Var, file3, 20));
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
                ji.l4.f((org.telegram.ui.ActionBar.m2) this.c, (Context) this.d, (org.telegram.ui.ActionBar.c6) this.e, (ji.u3) this.f, this.b);
                return;
            case 4:
                ((FactCheckController) this.c).lambda$applyFactCheck$15((TLObject) this.d, (TLRPC.TL_textWithEntities) this.e, this.b, (org.telegram.ui.ActionBar.a2) this.f);
                return;
            case 5:
                ((MediaDataController) this.c).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) this.e, (TLObject) this.d, (String) this.f, this.b);
                return;
            case 6:
                ((MessagesController) this.c).lambda$setParticipantBannedRole$90((TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.m2) this.e, (TLRPC.TL_channels_editBanned) this.f, this.b);
                return;
            case 7:
                ((MessagesStorage) this.c).lambda$putChannelViews$191((a0.h) this.d, (a0.h) this.e, (a0.h) this.f, this.b);
                return;
            case 8:
                ((MessagesStorage) this.c).lambda$replaceMessageIfExists$234((TLRPC.Message) this.d, this.b, (ArrayList) this.e, (ArrayList) this.f);
                return;
            case 9:
                ((SendMessagesHelper) this.c).lambda$sendEditRichMessageRequest$26((TLRPC.TL_messages_editMessage) this.d, (MessageObject) this.e, (org.telegram.ui.ActionBar.m2) this.f, this.b);
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
                qe qeVar = (qe) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z15 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    qeVar.b0(z15, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 14:
                fo foVar = (fo) this.c;
                pf.c cVar = (pf.c) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                kf kfVar = (kf) this.f;
                boolean z16 = this.b;
                cVar.b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    foVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    foVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        obj = foVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (peerDialogId < 0) {
                        obj = foVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    kfVar.run(obj, Boolean.valueOf(z16));
                    return;
                }
                obj = null;
                kfVar.run(obj, Boolean.valueOf(z16));
                return;
            case 15:
                org.telegram.ui.Components.qa qaVar = (org.telegram.ui.Components.qa) this.c;
                String str3 = (String) this.f;
                Bitmap bitmap2 = (Bitmap) this.d;
                boolean z17 = this.b;
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
                if (z17) {
                    bitmap3.recycle();
                    return;
                }
                return;
            case 16:
                nu nuVar = (nu) this.c;
                boolean z18 = this.b;
                gi.o oVar = (gi.o) this.d;
                String str4 = (String) this.f;
                TextView textView = (TextView) this.e;
                ClipboardManager clipboardManager = (ClipboardManager) nuVar.getContext().getSystemService("clipboard");
                boolean z19 = z18 && (TextUtils.isEmpty(oVar.getText()) || TextUtils.equals(oVar.getText().toString(), str4)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                sk.t(textView.animate().alpha(z19 ? 1.0f : 0.0f).scaleX(z19 ? 1.0f : 0.7f).scaleY(z19 ? 1.0f : 0.7f), es.h, 300L);
                return;
            case 17:
                dz dzVar = (dz) this.c;
                String str5 = (String) this.f;
                boolean z20 = this.b;
                String str6 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.d;
                dzVar.a.remove(str6);
                wz wzVar = dzVar.b;
                az azVar = wzVar.j0;
                HashMap hashMap = wzVar.l0;
                if (azVar.v && azVar.w.equals(str5)) {
                    wzVar.j0.E(str5, "", false, true, z20, str6, tLObject4);
                    return;
                }
                if (z20 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    dzVar.a(str5, false);
                    return;
                } else {
                    if (!(tLObject4 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str6)) {
                        return;
                    }
                    hashMap.put(str6, (TLRPC.messages_BotResults) tLObject4);
                    return;
                }
            case 18:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                fo foVar2 = (fo) this.f;
                boolean z21 = this.b;
                File w9 = k8.w(m2Var.getCurrentAccount(), "webp");
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
                PhotoViewer.t1().K2(m2Var.getParentActivity(), null, m2Var.getResourceProvider());
                PhotoViewer.t1().g2(arrayList6, 0, 11, false, new ly0(), foVar2);
                PhotoViewer.t1().X0(document, z21 ? document : null, true, null);
                xt.q().T = z21 ? tL_messages_stickerSet : null;
                return;
            case 19:
                my myVar = (my) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                String str7 = (String) this.f;
                boolean z22 = this.b;
                yy yyVar = myVar.a;
                if (tL_error2 == null) {
                    TLRPC.User user = yyVar.getMessagesController().getUser(Long.valueOf(yyVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = yyVar.getUserConfig().getCurrentUser();
                        if (user == null) {
                            return;
                        } else {
                            yyVar.getMessagesController().putUser(user, false);
                        }
                    } else {
                        yyVar.getUserConfig().setCurrentUser(user);
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
                    if (closestPhotoSizeWithSize == null || yyVar.c4 == null) {
                        z10 = true;
                    } else {
                        i15 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i15).getPathToAttach(closestPhotoSizeWithSize, true);
                        i16 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                        FileLoader.getInstance(i16).getPathToAttach(yyVar.c4, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(yyVar.c4.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(yyVar.c4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i17 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUserOrChat(i17, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str7 != null) {
                        i14 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                        new File(str7).renameTo(FileLoader.getInstance(i14).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && yyVar.d4 != null) {
                        i12 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i12).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i13 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                        FileLoader.getInstance(i13).getPathToAttach(yyVar.d4, true).renameTo(pathToAttach3);
                    }
                    yyVar.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(user);
                    yyVar.getMessagesStorage().putUsersAndChats(arrayList9, null, false, true);
                    TLRPC.UserFull userFull = yyVar.getMessagesController().getUserFull(yyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        yyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                }
                yyVar.c4 = null;
                yyVar.d4 = null;
                yyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                yyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                yyVar.getUserConfig().saveConfig(true);
                i11 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
                MessagesController.getInstance(i11).removeSuggestion(0L, "USERPIC_SETUP");
                yyVar.S4();
                org.telegram.ui.Components.sc scVar = yyVar.e4;
                if (scVar != null) {
                    org.telegram.ui.Components.jc jcVar = (org.telegram.ui.Components.jc) scVar.e;
                    jcVar.d.c(LocaleController.getString(z22 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    jcVar.setProgress(1.0f);
                    org.telegram.ui.Components.ob button = jcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    sk.t(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), es.h, 360L);
                    org.telegram.ui.Components.sc scVar2 = yyVar.e4;
                    scVar2.j = 5000;
                    scVar2.i(false);
                    yyVar.e4.i(true);
                    return;
                }
                return;
            case 20:
                ap0.a0((ap0) this.c, this.b, (String) this.f, (String) this.d, (TL_account.updatePasswordSettings) this.e);
                return;
            case 21:
                ap0.i0((ap0) this.c, (TLRPC.TL_error) this.e, this.b, (TLObject) this.d, (String) this.f);
                return;
            case 22:
                oh1.U((oh1) this.c, (TLObject) this.d, this.b, (String) this.f, (TL_account.passwordInputSettings) this.e);
                return;
            case 23:
                ri.r0 r0Var = (ri.r0) this.c;
                boolean z23 = this.b;
                ri.v vVar = (ri.v) this.d;
                ri.n0 n0Var = (ri.n0) this.e;
                File file4 = (File) this.f;
                r0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    r0Var.g();
                    long j10 = r0Var.E;
                    if (z23) {
                        synchronized (vVar) {
                            vVar.v = true;
                            try {
                                vVar.g();
                            } finally {
                                vVar.v = false;
                            }
                        }
                        r0Var.g();
                        r0Var.k(n0Var, 1);
                        file2 = vVar.a;
                        try {
                            r0Var.c(true);
                            str = "resume prepared without remux: retainedDurationMs=";
                            a3.z a10 = w7.m7.a(file4, r0Var.Q, r0Var.G, r0Var.H, true);
                            j10 = a10.b;
                            r0Var.m.b("resume trim remux completed: requested=" + r0Var.G + ".." + r0Var.H + ", actualStartMs=" + a10.a + ", retainedDurationMs=" + j10 + ", outputSize=" + r0Var.Q.a.length() + ", elapsedMs=" + ri.r0.f(nanoTime));
                        } catch (Exception e10) {
                            e = e10;
                            file = file2;
                            try {
                                r0Var.i.post(new ri.c0(r0Var, e, 1));
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
                    r0Var.g();
                    r0Var.R = null;
                    if (!z23) {
                        r0Var.m.b(str + j10 + ", elapsedMs=" + ri.r0.f(nanoTime));
                    }
                    r0Var.i.post(new ri.d0(r0Var, j10, objArr2 == true ? 1 : 0));
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
                    r0Var.i.post(new ri.c0(r0Var, e, 1));
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
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.e;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    ug.j.d(z24, str8, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, m2Var2.getParentActivity(), m2Var2.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ug.j.e(z24, str8, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, m2Var2.getParentActivity(), m2Var2.getResourceProvider());
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
    }

    public /* synthetic */ t1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f = obj3;
        this.b = z10;
    }

    public /* synthetic */ t1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ t1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.e = tLObject;
        this.b = z10;
        this.d = tLObject2;
        this.f = obj;
    }

    public /* synthetic */ t1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = 24;
        this.c = payments_giveawayinfo;
        this.b = z10;
        this.f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = m2Var;
    }

    public /* synthetic */ t1(org.telegram.ui.Components.qa qaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.a = 15;
        this.c = qaVar;
        this.f = str;
        this.d = bitmap;
        this.b = z10;
        this.e = bitmap2;
    }

    public /* synthetic */ t1(nu nuVar, boolean z10, gi.o oVar, String str, TextView textView) {
        this.a = 16;
        this.c = nuVar;
        this.b = z10;
        this.d = oVar;
        this.f = str;
        this.e = textView;
    }

    public /* synthetic */ t1(dz dzVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.a = 17;
        this.c = dzVar;
        this.f = str;
        this.b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public /* synthetic */ t1(ap0 ap0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 20;
        this.c = ap0Var;
        this.b = z10;
        this.f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public /* synthetic */ t1(oh1 oh1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 22;
        this.c = oh1Var;
        this.d = tLObject;
        this.b = z10;
        this.f = str;
        this.e = passwordinputsettings;
    }

    public /* synthetic */ t1(ri.r0 r0Var, boolean z10, ri.v vVar, ri.n0 n0Var, File file) {
        this.a = 23;
        this.c = r0Var;
        this.b = z10;
        this.d = vVar;
        this.e = n0Var;
        this.f = file;
    }
}

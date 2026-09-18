package ci;

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
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.gh1;
import org.telegram.ui.iy;
import org.telegram.ui.ke;
import org.telegram.ui.kg;
import org.telegram.ui.st;
import org.telegram.ui.uy;
import org.telegram.ui.xo0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Object obj;
        double d;
        double d10;
        int i11;
        int i12;
        TLRPC.User user;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z11 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str = (String) this.f;
                z1 z1Var = w1Var.s;
                ArrayList arrayList = z1Var.n;
                if (w1Var.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i10 = ((org.telegram.ui.ActionBar.f3) z1Var.r).currentAccount;
                        w1Var.d = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new v1(w1Var, str, z11, 0));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    w1Var.h = messages_botresults.next_offset;
                    if (z11) {
                        arrayList.clear();
                    }
                    arrayList.size();
                    arrayList.addAll(messages_botresults.results);
                    w1Var.l();
                    z1Var.d.c(false);
                    w1Var.r = false;
                    return;
                }
                return;
            case 1:
                oc ocVar = (oc) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z12 = this.b;
                File file = (File) this.e;
                o8 o8Var = (o8) this.f;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, z12 ? 95 : 99, new FileOutputStream(file));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new a3.k0(ocVar, o8Var, file, 19));
                return;
            case 2:
                hg.y yVar = (hg.y) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                boolean z13 = this.b;
                ArrayList arrayList5 = yVar.b;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                int i19 = yVar.a;
                MessagesController.getInstance(i19).putUsers(arrayList3, true);
                MessagesController.getInstance(i19).putChats(arrayList4, true);
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                yVar.c = false;
                yVar.e(false, z13);
                return;
            case 3:
                ii.j4.f((org.telegram.ui.ActionBar.n2) this.c, (Context) this.d, (org.telegram.ui.ActionBar.e6) this.e, (ii.t3) this.f, this.b);
                return;
            case 4:
                ki.h0 h0Var = (ki.h0) this.c;
                boolean z14 = this.b;
                ki.o oVar = (ki.o) this.d;
                ki.e0 e0Var = (ki.e0) this.e;
                File file2 = (File) this.f;
                h0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    h0Var.f();
                    long j3 = h0Var.y;
                    if (z14) {
                        synchronized (oVar) {
                            oVar.c();
                        }
                        h0Var.f();
                        h0Var.j(e0Var, 1);
                        File file3 = oVar.a;
                        h0Var.c(true);
                        a3.z a2 = w7.k.a(file2, h0Var.J, h0Var.A, h0Var.B, true);
                        j3 = a2.b;
                        h0Var.l.b("resume trim remux completed: requested=" + h0Var.A + ".." + h0Var.B + ", actualStartMs=" + a2.a + ", retainedDurationMs=" + j3 + ", outputSize=" + h0Var.J.a.length() + ", elapsedMs=" + ki.h0.e(nanoTime));
                        w7.k.c(file3);
                    }
                    w7.k.c(file2);
                    h0Var.f();
                    h0Var.K = null;
                    if (!z14) {
                        h0Var.l.b("resume prepared without remux: retainedDurationMs=" + j3 + ", elapsedMs=" + ki.h0.e(nanoTime));
                    }
                    h0Var.h.post(new ki.y(h0Var, j3, 0));
                    return;
                } catch (Exception e7) {
                    h0Var.h.post(new ki.x(h0Var, e7, 1));
                    return;
                }
            case 5:
                ((FactCheckController) this.c).lambda$applyFactCheck$15((TLObject) this.d, (TLRPC.TL_textWithEntities) this.e, this.b, (org.telegram.ui.ActionBar.b2) this.f);
                return;
            case 6:
                ((MediaDataController) this.c).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) this.e, (TLObject) this.d, (String) this.f, this.b);
                return;
            case 7:
                ((MessagesController) this.c).lambda$setParticipantBannedRole$91((TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.n2) this.e, (TLRPC.TL_channels_editBanned) this.f, this.b);
                return;
            case 8:
                ((MessagesStorage) this.c).lambda$putChannelViews$191((a0.i) this.d, (a0.i) this.e, (a0.i) this.f, this.b);
                return;
            case 9:
                ((MessagesStorage) this.c).lambda$replaceMessageIfExists$234((TLRPC.Message) this.d, this.b, (ArrayList) this.e, (ArrayList) this.f);
                return;
            case 10:
                ((SendMessagesHelper) this.c).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) this.d, (MessageObject) this.e, (org.telegram.ui.ActionBar.n2) this.f, this.b);
                return;
            case 11:
                ((SendMessagesHelper) this.c).lambda$performSendMessageRequest$80((TLRPC.Message) this.e, this.b, (TLObject) this.d, (SendMessagesHelper.DelayedMessage) this.f);
                return;
            case 12:
                ((UnconfirmedAuthController) this.c).lambda$updateList$7((boolean[]) this.d, (ArrayList) this.e, this.b, (Utilities.Callback) this.f);
                return;
            case 13:
                ((CameraController) this.c).lambda$recordVideo$12((CameraController.ICameraView) this.d, (File) this.e, this.b, (Runnable) this.f);
                return;
            case 14:
                ke keVar = (ke) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z15 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    keVar.b0(z15, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 15:
                zn znVar = (zn) this.c;
                nf.e eVar = (nf.e) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                kg kgVar = (kg) this.f;
                boolean z16 = this.b;
                eVar.b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    znVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    znVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        obj = znVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (peerDialogId < 0) {
                        obj = znVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    kgVar.run(obj, Boolean.valueOf(z16));
                    return;
                }
                obj = null;
                kgVar.run(obj, Boolean.valueOf(z16));
                return;
            case 16:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) this.c;
                String str2 = (String) this.f;
                Bitmap bitmap2 = (Bitmap) this.d;
                boolean z17 = this.b;
                Bitmap bitmap3 = (Bitmap) this.e;
                if (TextUtils.equals(oaVar.a, str2)) {
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
            case 17:
                bu buVar = (bu) this.c;
                boolean z18 = this.b;
                fi.o oVar2 = (fi.o) this.d;
                String str3 = (String) this.f;
                TextView textView = (TextView) this.e;
                ClipboardManager clipboardManager = (ClipboardManager) buVar.getContext().getSystemService("clipboard");
                boolean z19 = z18 && (TextUtils.isEmpty(oVar2.getText()) || TextUtils.equals(oVar2.getText().toString(), str3)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                wh.r(textView.animate().alpha(z19 ? 1.0f : 0.0f).scaleX(z19 ? 1.0f : 0.7f).scaleY(z19 ? 1.0f : 0.7f), qr.h, 300L);
                return;
            case 18:
                sy syVar = (sy) this.c;
                String str4 = (String) this.f;
                boolean z20 = this.b;
                String str5 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.d;
                syVar.a.remove(str5);
                kz kzVar = syVar.b;
                py pyVar = kzVar.j0;
                HashMap hashMap = kzVar.l0;
                if (pyVar.v && pyVar.w.equals(str4)) {
                    kzVar.j0.E(str4, "", false, true, z20, str5, tLObject4);
                    return;
                }
                if (z20 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    syVar.a(str4, false);
                    return;
                } else {
                    if (!(tLObject4 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str5)) {
                        return;
                    }
                    hashMap.put(str5, (TLRPC.messages_BotResults) tLObject4);
                    return;
                }
            case 19:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                zn znVar2 = (zn) this.f;
                boolean z21 = this.b;
                File w10 = o8.w(n2Var.getCurrentAccount(), "webp");
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                float f7 = 512;
                float f10 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
                double d11 = (f10 * f7) / f7;
                if (((float) Math.floor(d11)) > f10) {
                    f10 = (float) Math.floor(d11);
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
                            RLottieNative a10 = RLottieNative.a(pathToAttach.getAbsolutePath(), null, null, null, 0, null);
                            if (a10 != null) {
                                int[] iArr = a10.a;
                                int i20 = iArr[0];
                                int i21 = iArr[1];
                                a10.d();
                                d = 1000.0d;
                                d10 = i20 / i21;
                            } else {
                                d = 1000.0d;
                                d10 = 0.0d;
                            }
                            photoEntry.averageDuration = (long) (d10 * d);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                PhotoViewer.t1().J2(n2Var.getParentActivity(), null, n2Var.getResourceProvider());
                PhotoViewer.t1().f2(arrayList6, 0, 11, false, new yx0(), znVar2);
                PhotoViewer.t1().X0(document, z21 ? document : null, true, null);
                st.q().T = z21 ? tL_messages_stickerSet : null;
                return;
            case 20:
                iy iyVar = (iy) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                String str6 = (String) this.f;
                boolean z22 = this.b;
                uy uyVar = iyVar.a;
                if (tL_error2 == null) {
                    TLRPC.User user2 = uyVar.getMessagesController().getUser(Long.valueOf(uyVar.getUserConfig().getClientUserId()));
                    if (user2 == null) {
                        user2 = uyVar.getUserConfig().getCurrentUser();
                        if (user2 == null) {
                            return;
                        } else {
                            uyVar.getMessagesController().putUser(user2, false);
                        }
                    } else {
                        uyVar.getUserConfig().setCurrentUser(user2);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList8 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList8, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList8, 800);
                    TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    user2.photo = tL_userProfilePhoto;
                    TLRPC.User user3 = user2;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (closestPhotoSizeWithSize != null) {
                        tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                    }
                    if (closestPhotoSizeWithSize2 != null) {
                        tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                    }
                    if (closestPhotoSizeWithSize == null || uyVar.b4 == null) {
                        user = user3;
                        z10 = true;
                    } else {
                        i16 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i16).getPathToAttach(closestPhotoSizeWithSize, true);
                        i17 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        FileLoader.getInstance(i17).getPathToAttach(uyVar.b4, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(uyVar.b4.volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(uyVar.b4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i18 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        user = user3;
                        z10 = true;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUserOrChat(i18, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str6 != null) {
                        i15 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        new File(str6).renameTo(FileLoader.getInstance(i15).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && uyVar.c4 != null) {
                        i13 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i14 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(uyVar.c4, true).renameTo(pathToAttach3);
                    }
                    uyVar.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(user);
                    i11 = 0;
                    uyVar.getMessagesStorage().putUsersAndChats(arrayList9, null, false, true);
                    TLRPC.UserFull userFull = uyVar.getMessagesController().getUserFull(uyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        uyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    i11 = 0;
                }
                uyVar.b4 = null;
                uyVar.c4 = null;
                NotificationCenter notificationCenter = uyVar.getNotificationCenter();
                int i22 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i11] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i22, objArr);
                uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i11]);
                uyVar.getUserConfig().saveConfig(true);
                i12 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                MessagesController.getInstance(i12).removeSuggestion(0L, "USERPIC_SETUP");
                uyVar.U4();
                org.telegram.ui.Components.qc qcVar = uyVar.d4;
                if (qcVar != null) {
                    org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
                    hcVar.d.c(LocaleController.getString(z22 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    hcVar.setProgress(1.0f);
                    org.telegram.ui.Components.mb button = hcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    wh.r(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), qr.h, 360L);
                    org.telegram.ui.Components.qc qcVar2 = uyVar.d4;
                    qcVar2.j = 5000;
                    qcVar2.i(false);
                    uyVar.d4.i(true);
                    return;
                }
                return;
            case 21:
                xo0.a0((xo0) this.c, this.b, (String) this.f, (String) this.d, (TL_account.updatePasswordSettings) this.e);
                return;
            case 22:
                xo0.i0((xo0) this.c, (TLRPC.TL_error) this.e, this.b, (TLObject) this.d, (String) this.f);
                return;
            case 23:
                gh1.U((gh1) this.c, (TLObject) this.d, this.b, (String) this.f, (TL_account.passwordInputSettings) this.e);
                return;
            default:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.c;
                boolean z23 = this.b;
                String str7 = (String) this.f;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.e;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    tg.i.d(z23, str7, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        tg.i.e(z23, str7, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ u1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
    }

    public /* synthetic */ u1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f = obj3;
        this.b = z10;
    }

    public /* synthetic */ u1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ u1(ki.h0 h0Var, boolean z10, ki.o oVar, ki.e0 e0Var, File file) {
        this.a = 4;
        this.c = h0Var;
        this.b = z10;
        this.d = oVar;
        this.e = e0Var;
        this.f = file;
    }

    public /* synthetic */ u1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.e = tLObject;
        this.b = z10;
        this.d = tLObject2;
        this.f = obj;
    }

    public /* synthetic */ u1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 24;
        this.c = payments_giveawayinfo;
        this.b = z10;
        this.f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = n2Var;
    }

    public /* synthetic */ u1(org.telegram.ui.Components.oa oaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.a = 16;
        this.c = oaVar;
        this.f = str;
        this.d = bitmap;
        this.b = z10;
        this.e = bitmap2;
    }

    public /* synthetic */ u1(bu buVar, boolean z10, fi.o oVar, String str, TextView textView) {
        this.a = 17;
        this.c = buVar;
        this.b = z10;
        this.d = oVar;
        this.f = str;
        this.e = textView;
    }

    public /* synthetic */ u1(sy syVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.a = 18;
        this.c = syVar;
        this.f = str;
        this.b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public /* synthetic */ u1(xo0 xo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 21;
        this.c = xo0Var;
        this.b = z10;
        this.f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public /* synthetic */ u1(gh1 gh1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 23;
        this.c = gh1Var;
        this.d = tLObject;
        this.b = z10;
        this.f = str;
        this.e = passwordinputsettings;
    }
}

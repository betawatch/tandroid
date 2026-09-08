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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.co;
import org.telegram.ui.hh1;
import org.telegram.ui.iy;
import org.telegram.ui.ke;
import org.telegram.ui.mg;
import org.telegram.ui.st;
import org.telegram.ui.uy;
import org.telegram.ui.xo0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.a;
        int i19 = 0;
        boolean z11 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.c;
        switch (i18) {
            case 0:
                w1 w1Var = (w1) obj5;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) obj2;
                String str = (String) obj4;
                z1 z1Var = w1Var.s;
                ArrayList arrayList = z1Var.n;
                if (w1Var.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i10 = ((org.telegram.ui.ActionBar.f3) z1Var.r).currentAccount;
                        w1Var.d = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new v1(w1Var, str, z11, 0));
                        break;
                    } else {
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
                        break;
                    }
                }
                break;
            case 1:
                pc pcVar = (pc) obj5;
                File file = (File) obj2;
                o8 o8Var = (o8) obj4;
                try {
                    ((Bitmap) obj3).compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(file));
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                AndroidUtilities.runOnUIThread(new a3.k0(pcVar, o8Var, file, 20));
                break;
            case 2:
                ig.y yVar = (ig.y) obj5;
                ArrayList arrayList2 = yVar.b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj3);
                int i20 = yVar.a;
                MessagesController.getInstance(i20).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i20).putChats((ArrayList) obj4, true);
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                yVar.c = false;
                yVar.e(false, z11);
                break;
            case 3:
                ji.j4.f((org.telegram.ui.ActionBar.n2) obj5, (Context) obj3, (org.telegram.ui.ActionBar.f6) obj2, (ji.s3) obj4, z11);
                break;
            case 4:
                ((FactCheckController) obj5).lambda$applyFactCheck$15((TLObject) obj3, (TLRPC.TL_textWithEntities) obj2, z11, (org.telegram.ui.ActionBar.b2) obj4);
                break;
            case 5:
                ((MediaDataController) obj5).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) obj2, (TLObject) obj3, (String) obj4, z11);
                break;
            case 6:
                ((MessagesController) obj5).lambda$setParticipantBannedRole$91((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.n2) obj2, (TLRPC.TL_channels_editBanned) obj4, z11);
                break;
            case 7:
                ((MessagesStorage) obj5).lambda$putChannelViews$191((a0.i) obj3, (a0.i) obj2, (a0.i) obj4, z11);
                break;
            case 8:
                ((MessagesStorage) obj5).lambda$replaceMessageIfExists$234((TLRPC.Message) obj3, z11, (ArrayList) obj2, (ArrayList) obj4);
                break;
            case 9:
                ((SendMessagesHelper) obj5).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) obj3, (MessageObject) obj2, (org.telegram.ui.ActionBar.n2) obj4, z11);
                break;
            case 10:
                ((SendMessagesHelper) obj5).lambda$performSendMessageRequest$80((TLRPC.Message) obj2, z11, (TLObject) obj3, (SendMessagesHelper.DelayedMessage) obj4);
                break;
            case 11:
                ((UnconfirmedAuthController) obj5).lambda$updateList$7((boolean[]) obj3, (ArrayList) obj2, z11, (Utilities.Callback) obj4);
                break;
            case 12:
                ((CameraController) obj5).lambda$recordVideo$12((CameraController.ICameraView) obj3, (File) obj2, z11, (Runnable) obj4);
                break;
            case 13:
                ke keVar = (ke) obj5;
                TLObject tLObject2 = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj4;
                if (((TLRPC.TL_error) obj2) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    keVar.b0(z11, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 14:
                co coVar = (co) obj5;
                TLObject tLObject3 = (TLObject) obj3;
                mg mgVar = (mg) obj4;
                ((of.e) obj2).b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    coVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    coVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        obj = coVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (peerDialogId < 0) {
                        obj = coVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    mgVar.run(obj, Boolean.valueOf(z11));
                    break;
                }
                obj = null;
                mgVar.run(obj, Boolean.valueOf(z11));
            case 15:
                org.telegram.ui.Components.oa oaVar = (org.telegram.ui.Components.oa) obj5;
                Bitmap bitmap = (Bitmap) obj3;
                Bitmap bitmap2 = (Bitmap) obj2;
                if (TextUtils.equals(oaVar.a, (String) obj4)) {
                    oaVar.f = null;
                    Bitmap bitmap3 = oaVar.b;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    oaVar.b = bitmap;
                    Runnable runnable = oaVar.e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap.recycle();
                }
                if (z11) {
                    bitmap2.recycle();
                    break;
                }
                break;
            case 16:
                gi.o oVar = (gi.o) obj3;
                String str2 = (String) obj4;
                TextView textView = (TextView) obj2;
                ClipboardManager clipboardManager = (ClipboardManager) ((zt) obj5).getContext().getSystemService("clipboard");
                boolean z12 = z11 && (TextUtils.isEmpty(oVar.getText()) || TextUtils.equals(oVar.getText().toString(), str2)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                wl.q(textView.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.7f).scaleY(z12 ? 1.0f : 0.7f), pr.h, 300L);
                break;
            case 17:
                sy syVar = (sy) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj2;
                TLObject tLObject4 = (TLObject) obj3;
                syVar.a.remove(str4);
                kz kzVar = syVar.b;
                py pyVar = kzVar.j0;
                HashMap hashMap = kzVar.l0;
                boolean z13 = pyVar.v;
                boolean z14 = this.b;
                if (!z13 || !pyVar.w.equals(str3)) {
                    if (z14 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                        syVar.a(str3, false);
                        break;
                    } else if ((tLObject4 instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str4)) {
                        hashMap.put(str4, (TLRPC.messages_BotResults) tLObject4);
                        break;
                    }
                } else {
                    kzVar.j0.E(str3, "", false, true, z14, str4, tLObject4);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj5;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                co coVar2 = (co) obj4;
                File w10 = o8.w(n2Var.getCurrentAccount(), "webp");
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
                ArrayList arrayList3 = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList3.add(photoEntry);
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
                ArrayList<VideoEditedInfo.MediaEntity> arrayList4 = new ArrayList<>();
                photoEntry.mediaEntities = arrayList4;
                arrayList4.add(mediaEntity);
                photoEntry.averageDuration = 3000L;
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                    if (pathToAttach != null) {
                        try {
                            RLottieNative a2 = RLottieNative.a(pathToAttach.getAbsolutePath(), null, 0, 0, null, false, null, false, 0, null);
                            if (a2 != null) {
                                int[] iArr = a2.a;
                                int i21 = iArr[0];
                                int i22 = iArr[1];
                                a2.d();
                                d = i21 / i22;
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
                PhotoViewer.t1().K2(n2Var.getParentActivity(), null, n2Var.getResourceProvider());
                PhotoViewer.t1().f2(arrayList3, 0, 11, false, new lx0(), coVar2);
                PhotoViewer.t1().X0(document, z11 ? document : null, true, null);
                st.q().T = z11 ? tL_messages_stickerSet : null;
                break;
            case 19:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject5 = (TLObject) obj3;
                String str5 = (String) obj4;
                uy uyVar = ((iy) obj5).a;
                if (tL_error == null) {
                    TLRPC.User user = uyVar.getMessagesController().getUser(Long.valueOf(uyVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = uyVar.getUserConfig().getCurrentUser();
                        if (user != null) {
                            uyVar.getMessagesController().putUser(user, false);
                        }
                    } else {
                        uyVar.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList5, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList5, 800);
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
                    if (closestPhotoSizeWithSize == null || uyVar.c4 == null) {
                        z10 = z11;
                    } else {
                        i15 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i15).getPathToAttach(closestPhotoSizeWithSize, true);
                        i16 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        FileLoader.getInstance(i16).getPathToAttach(uyVar.c4, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(uyVar.c4.volume_id);
                        sb2.append("_");
                        String n10 = a4.a.n(uyVar.c4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        z10 = z11;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String n11 = a4.a.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i17 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        imageLoader.replaceImageInCache(n10, n11, ImageLocation.getForUserOrChat(i17, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str5 != null) {
                        i14 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        new File(str5).renameTo(FileLoader.getInstance(i14).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null && uyVar.d4 != null) {
                        i12 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i12).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i13 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                        FileLoader.getInstance(i13).getPathToAttach(uyVar.d4, true).renameTo(pathToAttach3);
                    }
                    uyVar.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(user);
                    i19 = 0;
                    uyVar.getMessagesStorage().putUsersAndChats(arrayList6, null, false, true);
                    TLRPC.UserFull userFull = uyVar.getMessagesController().getUserFull(uyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        uyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    z10 = z11;
                }
                uyVar.c4 = null;
                uyVar.d4 = null;
                NotificationCenter notificationCenter = uyVar.getNotificationCenter();
                int i23 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i19] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i23, objArr);
                uyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i19]);
                uyVar.getUserConfig().saveConfig(true);
                i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                MessagesController.getInstance(i11).removeSuggestion(0L, "USERPIC_SETUP");
                uyVar.U4();
                org.telegram.ui.Components.qc qcVar = uyVar.e4;
                if (qcVar != null) {
                    org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
                    hcVar.d.c(LocaleController.getString(z10 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    hcVar.setProgress(1.0f);
                    org.telegram.ui.Components.mb button = hcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    wl.q(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), pr.h, 360L);
                    org.telegram.ui.Components.qc qcVar2 = uyVar.e4;
                    qcVar2.j = 5000;
                    qcVar2.i(false);
                    uyVar.e4.i(true);
                    break;
                }
                break;
            case 20:
                xo0.a0((xo0) obj5, z11, (String) obj4, (String) obj3, (TL_account.updatePasswordSettings) obj2);
                break;
            case 21:
                xo0.i0((xo0) obj5, (TLRPC.TL_error) obj2, z11, (TLObject) obj3, (String) obj4);
                break;
            case 22:
                hh1.U((hh1) obj5, (TLObject) obj3, z11, (String) obj4, (TL_account.passwordInputSettings) obj2);
                break;
            default:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj5;
                String str6 = (String) obj4;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                boolean z15 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                boolean z16 = this.b;
                if (!z15) {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ug.j.e(z16, str6, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                        break;
                    }
                } else {
                    ug.j.d(z16, str6, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, n2Var2.getParentActivity(), n2Var2.getResourceProvider());
                    break;
                }
                break;
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

    public /* synthetic */ u1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.e = tLObject;
        this.b = z10;
        this.d = tLObject2;
        this.f = obj;
    }

    public /* synthetic */ u1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 23;
        this.c = payments_giveawayinfo;
        this.b = z10;
        this.f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = n2Var;
    }

    public /* synthetic */ u1(org.telegram.ui.Components.oa oaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.a = 15;
        this.c = oaVar;
        this.f = str;
        this.d = bitmap;
        this.b = z10;
        this.e = bitmap2;
    }

    public /* synthetic */ u1(zt ztVar, boolean z10, gi.o oVar, String str, TextView textView) {
        this.a = 16;
        this.c = ztVar;
        this.b = z10;
        this.d = oVar;
        this.f = str;
        this.e = textView;
    }

    public /* synthetic */ u1(sy syVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.a = 17;
        this.c = syVar;
        this.f = str;
        this.b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public /* synthetic */ u1(xo0 xo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 20;
        this.c = xo0Var;
        this.b = z10;
        this.f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public /* synthetic */ u1(hh1 hh1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 22;
        this.c = hh1Var;
        this.d = tLObject;
        this.b = z10;
        this.f = str;
        this.e = passwordinputsettings;
    }
}

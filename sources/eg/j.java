package eg;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import jh.j7;
import nh.gb;
import nh.o7;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.st;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.cg1;
import org.telegram.ui.de;
import org.telegram.ui.fy;
import org.telegram.ui.ht;
import org.telegram.ui.sx;
import org.telegram.ui.tn;
import org.telegram.ui.zf;
import th.b4;
import th.m3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
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
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.f;
        switch (i18) {
            case 0:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj5;
                boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                boolean z13 = this.b;
                if (!z12) {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        s.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, o2Var.getParentActivity(), o2Var.getResourceProvider());
                        break;
                    }
                } else {
                    s.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, o2Var.getParentActivity(), o2Var.getResourceProvider());
                    break;
                }
                break;
            case 1:
                nh.r1 r1Var = (nh.r1) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) obj5;
                String str2 = (String) obj3;
                nh.t1 t1Var = r1Var.s;
                ArrayList arrayList = t1Var.n;
                if (r1Var.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i10 = ((f3) t1Var.r).currentAccount;
                        r1Var.d = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new j7(r1Var, str2, z11, r7));
                        break;
                    } else {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        r1Var.h = messages_botresults.next_offset;
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        r1Var.l();
                        t1Var.d.c(false);
                        r1Var.r = false;
                        break;
                    }
                }
                break;
            case 2:
                gb gbVar = (gb) obj4;
                File file = (File) obj2;
                o7 o7Var = (o7) obj5;
                try {
                    ((Bitmap) obj3).compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(file));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new l3.m(gbVar, o7Var, file, 17));
                break;
            case 3:
                ((FactCheckController) obj4).lambda$applyFactCheck$15((TLObject) obj3, (TLRPC.TL_textWithEntities) obj2, z11, (org.telegram.ui.ActionBar.c2) obj5);
                break;
            case 4:
                ((MediaDataController) obj4).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) obj2, (TLObject) obj5, (String) obj3, z11);
                break;
            case 5:
                ((MessagesController) obj4).lambda$setParticipantBannedRole$91((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.o2) obj5, (TLRPC.TL_channels_editBanned) obj2, z11);
                break;
            case 6:
                ((MessagesStorage) obj4).lambda$putChannelViews$191((a0.h) obj3, (a0.h) obj2, (a0.h) obj5, z11);
                break;
            case 7:
                ((MessagesStorage) obj4).lambda$replaceMessageIfExists$234((TLRPC.Message) obj3, z11, (ArrayList) obj2, (ArrayList) obj5);
                break;
            case 8:
                ((SendMessagesHelper) obj4).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) obj3, (MessageObject) obj2, (org.telegram.ui.ActionBar.o2) obj5, z11);
                break;
            case 9:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$80((TLRPC.Message) obj3, z11, (TLObject) obj2, (SendMessagesHelper.DelayedMessage) obj5);
                break;
            case 10:
                ((UnconfirmedAuthController) obj4).lambda$updateList$7((boolean[]) obj3, (ArrayList) obj2, z11, (Utilities.Callback) obj5);
                break;
            case 11:
                ((CameraController) obj4).lambda$recordVideo$12((CameraController.ICameraView) obj3, (File) obj2, z11, (Runnable) obj5);
                break;
            case 12:
                de deVar = (de) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj5;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.m0(password);
                    deVar.b0(z11, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 13:
                tn tnVar = (tn) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                zf zfVar = (zf) obj5;
                ((ye.c) obj3).b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    tnVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    tnVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        obj = tnVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (peerDialogId < 0) {
                        obj = tnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    zfVar.run(obj, Boolean.valueOf(z11));
                    break;
                }
                obj = null;
                zfVar.run(obj, Boolean.valueOf(z11));
            case 14:
                la laVar = (la) obj4;
                Bitmap bitmap = (Bitmap) obj2;
                Bitmap bitmap2 = (Bitmap) obj5;
                if (TextUtils.equals(laVar.a, (String) obj3)) {
                    laVar.f = null;
                    Bitmap bitmap3 = laVar.b;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    laVar.b = bitmap;
                    Runnable runnable = laVar.e;
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
            case 15:
                jh.m mVar = (jh.m) obj2;
                String str3 = (String) obj3;
                TextView textView = (TextView) obj5;
                ClipboardManager clipboardManager = (ClipboardManager) ((st) obj4).getContext().getSystemService("clipboard");
                r7 = (z11 && (TextUtils.isEmpty(mVar.getText()) || TextUtils.equals(mVar.getText().toString(), str3)) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? 1 : 0;
                org.telegram.ui.b.q(textView.animate().alpha(r7 != 0 ? 1.0f : 0.0f).scaleX(r7 != 0 ? 1.0f : 0.7f).scaleY(r7 != 0 ? 1.0f : 0.7f), jr.h, 300L);
                break;
            case 16:
                my myVar = (my) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLObject tLObject4 = (TLObject) obj5;
                myVar.a.remove(str5);
                fz fzVar = myVar.b;
                jy jyVar = fzVar.f0;
                HashMap hashMap = fzVar.h0;
                boolean z14 = jyVar.v;
                boolean z15 = this.b;
                if (!z14 || !jyVar.w.equals(str4)) {
                    if (z15 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                        myVar.a(str4, false);
                        break;
                    } else if ((tLObject4 instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str5)) {
                        hashMap.put(str5, (TLRPC.messages_BotResults) tLObject4);
                        break;
                    }
                } else {
                    fzVar.f0.E(str4, "", false, true, z15, str5, tLObject4);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj5;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj4;
                TLRPC.Document document = (TLRPC.Document) obj3;
                tn tnVar2 = (tn) obj2;
                File w10 = o7.w(o2Var2.getCurrentAccount(), "webp");
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                float f9 = 512;
                float f10 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
                double d10 = (f10 * f9) / f9;
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
                ArrayList arrayList2 = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList2.add(photoEntry);
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                mediaEntity.parentObject = tL_messages_stickerSet;
                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true).getAbsolutePath();
                mediaEntity.x = 0.5f - ((Math.min(512, 512) / f9) / 2.0f);
                mediaEntity.y = 0.5f - ((Math.min(512, 512) / f9) / 2.0f);
                mediaEntity.width = Math.min(512, 512) / f9;
                mediaEntity.height = Math.min(512, 512) / f9;
                int floor = (int) Math.floor(f11 * 0.5d);
                mediaEntity.viewWidth = floor;
                mediaEntity.viewHeight = floor;
                mediaEntity.scale = 2.0f;
                mediaEntity.document = document;
                if (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoStickerDocument(document)) {
                    mediaEntity.subType = (byte) ((MessageObject.isAnimatedStickerDocument(document, true) ? (byte) 1 : (byte) 4) | mediaEntity.subType);
                }
                ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = new ArrayList<>();
                photoEntry.mediaEntities = arrayList3;
                arrayList3.add(mediaEntity);
                photoEntry.averageDuration = 3000L;
                if (MessageObject.isAnimatedStickerDocument(document, true)) {
                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
                    if (pathToAttach != null) {
                        try {
                            RLottieNative a2 = RLottieNative.a(pathToAttach.getAbsolutePath(), null, 0, 0, null, false, null, false, 0, null);
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
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                PhotoViewer.t1().K2(o2Var2.getParentActivity(), null, o2Var2.getResourceProvider());
                PhotoViewer.t1().f2(arrayList2, 0, 11, false, new ex0(), tnVar2);
                PhotoViewer.t1().X0(document, z11 ? document : null, true, null);
                ht.q().T = z11 ? tL_messages_stickerSet : null;
                break;
            case 18:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject5 = (TLObject) obj5;
                String str6 = (String) obj3;
                fy fyVar = ((sx) obj4).a;
                if (tL_error == null) {
                    TLRPC.User user = fyVar.getMessagesController().getUser(Long.valueOf(fyVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = fyVar.getUserConfig().getCurrentUser();
                        if (user != null) {
                            fyVar.getMessagesController().putUser(user, false);
                        }
                    } else {
                        fyVar.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList4 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList4, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList4, 800);
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
                    if (closestPhotoSizeWithSize == null || fyVar.Y3 == null) {
                        z10 = z11;
                    } else {
                        i15 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i15).getPathToAttach(closestPhotoSizeWithSize, true);
                        i16 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        FileLoader.getInstance(i16).getPathToAttach(fyVar.Y3, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fyVar.Y3.volume_id);
                        sb2.append("_");
                        String l10 = a4.w.l(fyVar.Y3.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        z10 = z11;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String l11 = a4.w.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i17 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        imageLoader.replaceImageInCache(l10, l11, ImageLocation.getForUserOrChat(i17, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str6 != null) {
                        i14 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        new File(str6).renameTo(FileLoader.getInstance(i14).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null && fyVar.Z3 != null) {
                        i12 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i12).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i13 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                        FileLoader.getInstance(i13).getPathToAttach(fyVar.Z3, true).renameTo(pathToAttach3);
                    }
                    fyVar.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    i19 = 0;
                    fyVar.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.UserFull userFull = fyVar.getMessagesController().getUserFull(fyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        fyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    z10 = z11;
                }
                fyVar.Y3 = null;
                fyVar.Z3 = null;
                NotificationCenter notificationCenter = fyVar.getNotificationCenter();
                int i22 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i19] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i22, objArr);
                fyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i19]);
                fyVar.getUserConfig().saveConfig(true);
                i11 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                MessagesController.getInstance(i11).removeSuggestion(0L, "USERPIC_SETUP");
                fyVar.U4();
                mc mcVar = fyVar.a4;
                if (mcVar != null) {
                    dc dcVar = (dc) mcVar.e;
                    dcVar.d.c(LocaleController.getString(z10 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    dcVar.setProgress(1.0f);
                    ib button = dcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    org.telegram.ui.b.q(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), jr.h, 360L);
                    mc mcVar2 = fyVar.a4;
                    mcVar2.j = 5000;
                    mcVar2.i(false);
                    fyVar.a4.i(true);
                    break;
                }
                break;
            case 19:
                bo0.a0((bo0) obj4, z11, (String) obj3, (String) obj2, (TL_account.updatePasswordSettings) obj5);
                break;
            case 20:
                bo0.i0((bo0) obj4, (TLRPC.TL_error) obj2, z11, (TLObject) obj5, (String) obj3);
                break;
            case 21:
                cg1.U((cg1) obj4, (TLObject) obj2, z11, (String) obj3, (TL_account.passwordInputSettings) obj5);
                break;
            case 22:
                sf.u uVar = (sf.u) obj4;
                ArrayList arrayList6 = uVar.b;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) obj3);
                int i23 = uVar.a;
                MessagesController.getInstance(i23).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i23).putChats((ArrayList) obj5, true);
                NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                uVar.c = false;
                uVar.e(false, z11);
                break;
            default:
                b4.f((org.telegram.ui.ActionBar.o2) obj5, (Context) obj4, (c6) obj3, (m3) obj2, z11);
                break;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
    }

    public /* synthetic */ j(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = tLObject;
        this.b = z10;
        this.f = tLObject2;
        this.c = str;
    }

    public /* synthetic */ j(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = tL_error;
        this.f = tLObject;
        this.c = str;
        this.b = z10;
    }

    public /* synthetic */ j(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z10) {
        this.a = 5;
        this.d = messagesController;
        this.c = tL_error;
        this.f = o2Var;
        this.e = tL_channels_editBanned;
        this.b = z10;
    }

    public /* synthetic */ j(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = 0;
        this.d = payments_giveawayinfo;
        this.b = z10;
        this.c = str;
        this.e = tL_messageMediaGiveaway;
        this.f = o2Var;
    }

    public /* synthetic */ j(org.telegram.ui.ActionBar.o2 o2Var, Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.f = o2Var;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ j(st stVar, boolean z10, jh.m mVar, String str, TextView textView) {
        this.a = 15;
        this.d = stVar;
        this.b = z10;
        this.e = mVar;
        this.c = str;
        this.f = textView;
    }

    public /* synthetic */ j(bo0 bo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 19;
        this.d = bo0Var;
        this.b = z10;
        this.c = str;
        this.e = str2;
        this.f = updatepasswordsettings;
    }

    public /* synthetic */ j(cg1 cg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 21;
        this.d = cg1Var;
        this.e = tLObject;
        this.b = z10;
        this.c = str;
        this.f = passwordinputsettings;
    }
}

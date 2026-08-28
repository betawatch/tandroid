package bg;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import gh.m7;
import ih.h3;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import kh.a8;
import kh.wb;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xb;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.bg;
import org.telegram.ui.co0;
import org.telegram.ui.dy;
import org.telegram.ui.fe;
import org.telegram.ui.ht;
import org.telegram.ui.qn;
import org.telegram.ui.qx;
import qh.a4;
import qh.l3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i9) {
        this.a = i9;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        Object obj;
        double d;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.a;
        int i18 = 0;
        boolean z11 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.f;
        switch (i17) {
            case 0:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj5;
                boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                boolean z13 = this.b;
                if (!z12) {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        u.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, o2Var.getParentActivity(), o2Var.getResourceProvider());
                        break;
                    }
                } else {
                    u.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, o2Var.getParentActivity(), o2Var.getResourceProvider());
                    break;
                }
                break;
            case 1:
                kh.u1 u1Var = (kh.u1) obj4;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) obj5;
                String str2 = (String) obj3;
                kh.w1 w1Var = u1Var.s;
                ArrayList arrayList = w1Var.n;
                if (u1Var.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i9 = ((org.telegram.ui.ActionBar.f3) w1Var.r).currentAccount;
                        u1Var.d = ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getInlineBotResults, new m7(u1Var, str2, z11, r7));
                        break;
                    } else {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        u1Var.h = messages_botresults.next_offset;
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.size();
                        arrayList.addAll(messages_botresults.results);
                        u1Var.l();
                        w1Var.d.c(false);
                        u1Var.r = false;
                        break;
                    }
                }
                break;
            case 2:
                wb wbVar = (wb) obj4;
                File file = (File) obj2;
                a8 a8Var = (a8) obj5;
                try {
                    ((Bitmap) obj3).compress(Bitmap.CompressFormat.JPEG, z11 ? 95 : 99, new FileOutputStream(file));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new h3(wbVar, a8Var, file, 17));
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
                fe feVar = (fe) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj5;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.E = password;
                    TwoStepVerificationActivity.l0(password);
                    feVar.b0(z11, twoStepVerificationActivity.k0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 13:
                qn qnVar = (qn) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                bg bgVar = (bg) obj5;
                ((ve.d) obj3).b();
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
                    bgVar.run(obj, Boolean.valueOf(z11));
                    break;
                }
                obj = null;
                bgVar.run(obj, Boolean.valueOf(z11));
            case 14:
                ga gaVar = (ga) obj4;
                Bitmap bitmap = (Bitmap) obj2;
                Bitmap bitmap2 = (Bitmap) obj5;
                if (TextUtils.equals(gaVar.a, (String) obj3)) {
                    gaVar.f = null;
                    Bitmap bitmap3 = gaVar.b;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    gaVar.b = bitmap;
                    Runnable runnable = gaVar.e;
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
                gh.o oVar = (gh.o) obj2;
                String str3 = (String) obj3;
                TextView textView = (TextView) obj5;
                ClipboardManager clipboardManager = (ClipboardManager) ((mt) obj4).getContext().getSystemService("clipboard");
                r7 = (z11 && (TextUtils.isEmpty(oVar.getText()) || TextUtils.equals(oVar.getText().toString(), str3)) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? 1 : 0;
                ll.r(textView.animate().alpha(r7 != 0 ? 1.0f : 0.0f).scaleX(r7 != 0 ? 1.0f : 0.7f).scaleY(r7 != 0 ? 1.0f : 0.7f), gr.h, 300L);
                break;
            case 16:
                ey eyVar = (ey) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                TLObject tLObject4 = (TLObject) obj5;
                eyVar.a.remove(str5);
                wy wyVar = eyVar.b;
                ay ayVar = wyVar.f0;
                HashMap hashMap = wyVar.h0;
                boolean z14 = ayVar.v;
                boolean z15 = this.b;
                if (!z14 || !ayVar.w.equals(str4)) {
                    if (z15 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                        eyVar.a(str4, false);
                        break;
                    } else if ((tLObject4 instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str5)) {
                        hashMap.put(str5, (TLRPC.messages_BotResults) tLObject4);
                        break;
                    }
                } else {
                    wyVar.f0.E(str4, "", false, true, z15, str5, tLObject4);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj5;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj4;
                TLRPC.Document document = (TLRPC.Document) obj3;
                qn qnVar2 = (qn) obj2;
                File w8 = a8.w(o2Var2.getCurrentAccount(), "webp");
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                float f10 = 512;
                float f11 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
                double d9 = (f11 * f10) / f10;
                if (((float) Math.floor(d9)) > f11) {
                    f11 = (float) Math.floor(d9);
                }
                float f12 = f11;
                Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w8));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                createBitmap.recycle();
                ArrayList arrayList2 = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w8.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList2.add(photoEntry);
                VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                mediaEntity.type = (byte) 0;
                mediaEntity.parentObject = tL_messages_stickerSet;
                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true).getAbsolutePath();
                mediaEntity.x = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                mediaEntity.y = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                mediaEntity.width = Math.min(512, 512) / f10;
                mediaEntity.height = Math.min(512, 512) / f10;
                int floor = (int) Math.floor(f12 * 0.5d);
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
                                int i19 = iArr[0];
                                int i20 = iArr[1];
                                a2.d();
                                d = i19 / i20;
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
                PhotoViewer.t1().f2(arrayList2, 0, 11, false, new tw0(), qnVar2);
                PhotoViewer.t1().X0(document, z11 ? document : null, true, null);
                ht.q().T = z11 ? tL_messages_stickerSet : null;
                break;
            case 18:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject5 = (TLObject) obj5;
                String str6 = (String) obj3;
                dy dyVar = ((qx) obj4).a;
                if (tL_error == null) {
                    TLRPC.User user = dyVar.getMessagesController().getUser(Long.valueOf(dyVar.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = dyVar.getUserConfig().getCurrentUser();
                        if (user != null) {
                            dyVar.getMessagesController().putUser(user, false);
                        }
                    } else {
                        dyVar.getUserConfig().setCurrentUser(user);
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
                    if (closestPhotoSizeWithSize == null || dyVar.Y3 == null) {
                        z10 = z11;
                    } else {
                        i14 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i14).getPathToAttach(closestPhotoSizeWithSize, true);
                        i15 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        FileLoader.getInstance(i15).getPathToAttach(dyVar.Y3, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(dyVar.Y3.volume_id);
                        sb2.append("_");
                        String l10 = aa.d.l(dyVar.Y3.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        z10 = z11;
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String l11 = aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i16 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        imageLoader.replaceImageInCache(l10, l11, ImageLocation.getForUserOrChat(i16, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str6 != null) {
                        i13 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        new File(str6).renameTo(FileLoader.getInstance(i13).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null && dyVar.Z3 != null) {
                        i11 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i12 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(dyVar.Z3, true).renameTo(pathToAttach3);
                    }
                    dyVar.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(user);
                    i18 = 0;
                    dyVar.getMessagesStorage().putUsersAndChats(arrayList5, null, false, true);
                    TLRPC.UserFull userFull = dyVar.getMessagesController().getUserFull(dyVar.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        dyVar.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    z10 = z11;
                }
                dyVar.Y3 = null;
                dyVar.Z3 = null;
                NotificationCenter notificationCenter = dyVar.getNotificationCenter();
                int i21 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i18] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i21, objArr);
                dyVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i18]);
                dyVar.getUserConfig().saveConfig(true);
                i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                MessagesController.getInstance(i10).removeSuggestion(0L, "USERPIC_SETUP");
                dyVar.U4();
                gc gcVar = dyVar.a4;
                if (gcVar != null) {
                    xb xbVar = (xb) gcVar.e;
                    xbVar.d.c(LocaleController.getString(z10 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    xbVar.setProgress(1.0f);
                    db button = xbVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    ll.r(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), gr.h, 360L);
                    gc gcVar2 = dyVar.a4;
                    gcVar2.j = 5000;
                    gcVar2.i(false);
                    dyVar.a4.i(true);
                    break;
                }
                break;
            case 19:
                co0.Z((co0) obj4, z11, (String) obj3, (String) obj2, (TL_account.updatePasswordSettings) obj5);
                break;
            case 20:
                co0.h0((co0) obj4, (TLRPC.TL_error) obj2, z11, (TLObject) obj5, (String) obj3);
                break;
            case 21:
                ag1.T((ag1) obj4, (TLObject) obj2, z11, (String) obj3, (TL_account.passwordInputSettings) obj5);
                break;
            case 22:
                pf.u uVar = (pf.u) obj4;
                ArrayList arrayList6 = uVar.b;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) obj3);
                int i22 = uVar.a;
                MessagesController.getInstance(i22).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i22).putChats((ArrayList) obj5, true);
                NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                uVar.c = false;
                uVar.e(false, z11);
                break;
            default:
                a4.f((org.telegram.ui.ActionBar.o2) obj5, (Context) obj4, (b6) obj3, (l3) obj2, z11);
                break;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i9) {
        this.a = i9;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ m(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i9) {
        this.a = i9;
        this.d = obj;
        this.e = tLObject;
        this.b = z10;
        this.f = tLObject2;
        this.c = str;
    }

    public /* synthetic */ m(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10, int i9) {
        this.a = i9;
        this.d = obj;
        this.e = tL_error;
        this.f = tLObject;
        this.c = str;
        this.b = z10;
    }

    public /* synthetic */ m(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z10) {
        this.a = 5;
        this.d = messagesController;
        this.c = tL_error;
        this.f = o2Var;
        this.e = tL_channels_editBanned;
        this.b = z10;
    }

    public /* synthetic */ m(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = 0;
        this.d = payments_giveawayinfo;
        this.b = z10;
        this.c = str;
        this.e = tL_messageMediaGiveaway;
        this.f = o2Var;
    }

    public /* synthetic */ m(org.telegram.ui.ActionBar.o2 o2Var, Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.a = i9;
        this.f = o2Var;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = z10;
    }

    public /* synthetic */ m(mt mtVar, boolean z10, gh.o oVar, String str, TextView textView) {
        this.a = 15;
        this.d = mtVar;
        this.b = z10;
        this.e = oVar;
        this.c = str;
        this.f = textView;
    }

    public /* synthetic */ m(co0 co0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 19;
        this.d = co0Var;
        this.b = z10;
        this.c = str;
        this.e = str2;
        this.f = updatepasswordsettings;
    }

    public /* synthetic */ m(ag1 ag1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 21;
        this.d = ag1Var;
        this.e = tLObject;
        this.b = z10;
        this.c = str;
        this.f = passwordinputsettings;
    }
}

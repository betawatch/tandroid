package gg;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import lh.k7;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.zb;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cy;
import org.telegram.ui.fg;
import org.telegram.ui.jo0;
import org.telegram.ui.ke;
import org.telegram.ui.og1;
import org.telegram.ui.pt;
import org.telegram.ui.xn;
import ph.da;
import ph.u6;
import vh.d4;
import vh.o3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        double d;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.a;
        int i19 = 0;
        boolean z10 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.f;
        switch (i18) {
            case 0:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj4;
                String str = (String) obj3;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj5;
                boolean z11 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                boolean z12 = this.b;
                if (!z11) {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        r.e(z12, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, p2Var.getParentActivity(), p2Var.getResourceProvider());
                        break;
                    }
                } else {
                    r.d(z12, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, p2Var.getParentActivity(), p2Var.getResourceProvider());
                    break;
                }
                break;
            case 1:
                ((FactCheckController) obj4).lambda$applyFactCheck$15((TLObject) obj3, (TLRPC.TL_textWithEntities) obj2, z10, (org.telegram.ui.ActionBar.d2) obj5);
                break;
            case 2:
                ((MediaDataController) obj4).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) obj2, (TLObject) obj5, (String) obj3, z10);
                break;
            case 3:
                ((MessagesController) obj4).lambda$setParticipantBannedRole$91((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.p2) obj5, (TLRPC.TL_channels_editBanned) obj2, z10);
                break;
            case 4:
                ((MessagesStorage) obj4).lambda$putChannelViews$191((a0.h) obj3, (a0.h) obj2, (a0.h) obj5, z10);
                break;
            case 5:
                ((MessagesStorage) obj4).lambda$replaceMessageIfExists$234((TLRPC.Message) obj3, z10, (ArrayList) obj2, (ArrayList) obj5);
                break;
            case 6:
                ((SendMessagesHelper) obj4).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) obj3, (MessageObject) obj2, (org.telegram.ui.ActionBar.p2) obj5, z10);
                break;
            case 7:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$80((TLRPC.Message) obj3, z10, (TLObject) obj2, (SendMessagesHelper.DelayedMessage) obj5);
                break;
            case 8:
                ((UnconfirmedAuthController) obj4).lambda$updateList$7((boolean[]) obj3, (ArrayList) obj2, z10, (Utilities.Callback) obj5);
                break;
            case 9:
                ((CameraController) obj4).lambda$recordVideo$12((CameraController.ICameraView) obj3, (File) obj2, z10, (Runnable) obj5);
                break;
            case 10:
                ke keVar = (ke) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj5;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.F = password;
                    TwoStepVerificationActivity.m0(password);
                    keVar.b0(z10, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 11:
                xn xnVar = (xn) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                fg fgVar = (fg) obj5;
                ((af.f) obj3).b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    xnVar.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    xnVar.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        obj = xnVar.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    } else if (peerDialogId < 0) {
                        obj = xnVar.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                    }
                    fgVar.run(obj, Boolean.valueOf(z10));
                    break;
                }
                obj = null;
                fgVar.run(obj, Boolean.valueOf(z10));
            case 12:
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
                if (z10) {
                    bitmap2.recycle();
                    break;
                }
                break;
            case 13:
                lh.n nVar = (lh.n) obj2;
                String str2 = (String) obj3;
                TextView textView = (TextView) obj5;
                ClipboardManager clipboardManager = (ClipboardManager) ((vt) obj4).getContext().getSystemService("clipboard");
                boolean z13 = z10 && (TextUtils.isEmpty(nVar.getText()) || TextUtils.equals(nVar.getText().toString(), str2)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                org.telegram.ui.b.p(textView.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.7f).scaleY(z13 ? 1.0f : 0.7f), nr.h, 300L);
                break;
            case 14:
                ry ryVar = (ry) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                TLObject tLObject3 = (TLObject) obj5;
                ryVar.a.remove(str4);
                kz kzVar = ryVar.b;
                oy oyVar = kzVar.g0;
                HashMap hashMap = kzVar.i0;
                boolean z14 = oyVar.v;
                boolean z15 = this.b;
                if (!z14 || !oyVar.w.equals(str3)) {
                    if (z15 && (!(tLObject3 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject3).results.isEmpty())) {
                        ryVar.a(str3, false);
                        break;
                    } else if ((tLObject3 instanceof TLRPC.messages_BotResults) && !hashMap.containsKey(str4)) {
                        hashMap.put(str4, (TLRPC.messages_BotResults) tLObject3);
                        break;
                    }
                } else {
                    kzVar.g0.E(str3, "", false, true, z15, str4, tLObject3);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj5;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj4;
                TLRPC.Document document = (TLRPC.Document) obj3;
                xn xnVar2 = (xn) obj2;
                File w10 = u6.w(p2Var2.getCurrentAccount(), "webp");
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                float f10 = 512;
                float f11 = devicePerformanceClass != 0 ? devicePerformanceClass != 2 ? 2560 : 3840 : 1280;
                double d10 = (f11 * f10) / f10;
                if (((float) Math.floor(d10)) > f11) {
                    f11 = (float) Math.floor(d10);
                }
                float f12 = f11;
                Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
                createBitmap.recycle();
                ArrayList arrayList = new ArrayList();
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w10.getAbsolutePath(), 0, false, 0, 0, 0L);
                arrayList.add(photoEntry);
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
                ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
                photoEntry.mediaEntities = arrayList2;
                arrayList2.add(mediaEntity);
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
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                PhotoViewer.t1().K2(p2Var2.getParentActivity(), null, p2Var2.getResourceProvider());
                PhotoViewer.t1().f2(arrayList, 0, 11, false, new nx0(), xnVar2);
                PhotoViewer.t1().X0(document, z10 ? document : null, true, null);
                pt.q().T = z10 ? tL_messages_stickerSet : null;
                break;
            case 16:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject4 = (TLObject) obj5;
                String str5 = (String) obj3;
                org.telegram.ui.oy oyVar2 = ((cy) obj4).a;
                if (tL_error == null) {
                    TLRPC.User user = oyVar2.getMessagesController().getUser(Long.valueOf(oyVar2.getUserConfig().getClientUserId()));
                    if (user == null) {
                        user = oyVar2.getUserConfig().getCurrentUser();
                        if (user != null) {
                            oyVar2.getMessagesController().putUser(user, false);
                        }
                    } else {
                        oyVar2.getUserConfig().setCurrentUser(user);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    ArrayList<TLRPC.PhotoSize> arrayList3 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList3, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList3, 800);
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
                    if (closestPhotoSizeWithSize == null || oyVar2.Z3 == null) {
                        z4 = z10;
                    } else {
                        i14 = ((org.telegram.ui.ActionBar.p2) oyVar2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i14).getPathToAttach(closestPhotoSizeWithSize, true);
                        i15 = ((org.telegram.ui.ActionBar.p2) oyVar2).currentAccount;
                        FileLoader.getInstance(i15).getPathToAttach(oyVar2.Z3, true).renameTo(pathToAttach2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(oyVar2.Z3.volume_id);
                        sb.append("_");
                        String m9 = android.support.v4.media.a.m(oyVar2.Z3.local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        z4 = z10;
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        String m10 = android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i16 = ((org.telegram.ui.ActionBar.p2) oyVar2).currentAccount;
                        imageLoader.replaceImageInCache(m9, m10, ImageLocation.getForUserOrChat(i16, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str5 != null) {
                        i13 = ((org.telegram.ui.ActionBar.p2) oyVar2).currentAccount;
                        new File(str5).renameTo(FileLoader.getInstance(i13).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                    } else if (closestPhotoSizeWithSize2 != null && oyVar2.a4 != null) {
                        i11 = ((org.telegram.ui.ActionBar.p2) oyVar2).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i11).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i12 = ((org.telegram.ui.ActionBar.p2) oyVar2).currentAccount;
                        FileLoader.getInstance(i12).getPathToAttach(oyVar2.a4, true).renameTo(pathToAttach3);
                    }
                    oyVar2.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(user);
                    i19 = 0;
                    oyVar2.getMessagesStorage().putUsersAndChats(arrayList4, null, false, true);
                    TLRPC.UserFull userFull = oyVar2.getMessagesController().getUserFull(oyVar2.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        oyVar2.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    z4 = z10;
                }
                oyVar2.Z3 = null;
                oyVar2.a4 = null;
                NotificationCenter notificationCenter = oyVar2.getNotificationCenter();
                int i22 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i19] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i22, objArr);
                oyVar2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i19]);
                oyVar2.getUserConfig().saveConfig(true);
                i10 = ((org.telegram.ui.ActionBar.p2) oyVar2).currentAccount;
                MessagesController.getInstance(i10).removeSuggestion(0L, "USERPIC_SETUP");
                oyVar2.U4();
                ic icVar = oyVar2.b4;
                if (icVar != null) {
                    zb zbVar = (zb) icVar.e;
                    zbVar.d.c(LocaleController.getString(z4 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    zbVar.setProgress(1.0f);
                    db button = zbVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    org.telegram.ui.b.p(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), nr.h, 360L);
                    ic icVar2 = oyVar2.b4;
                    icVar2.j = 5000;
                    icVar2.i(false);
                    oyVar2.b4.i(true);
                    break;
                }
                break;
            case 17:
                jo0.a0((jo0) obj4, z10, (String) obj3, (String) obj2, (TL_account.updatePasswordSettings) obj5);
                break;
            case 18:
                jo0.i0((jo0) obj4, (TLRPC.TL_error) obj2, z10, (TLObject) obj5, (String) obj3);
                break;
            case 19:
                og1.U((og1) obj4, (TLObject) obj2, z10, (String) obj3, (TL_account.passwordInputSettings) obj5);
                break;
            case 20:
                ph.g1 g1Var = (ph.g1) obj4;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) obj5;
                String str6 = (String) obj3;
                ph.i1 i1Var = g1Var.s;
                ArrayList arrayList5 = i1Var.n;
                if (g1Var.r) {
                    if (!(tLObject5 instanceof TLRPC.messages_BotResults)) {
                        i17 = ((g3) i1Var.r).currentAccount;
                        g1Var.d = ConnectionsManager.getInstance(i17).sendRequest(tL_messages_getInlineBotResults, new k7(g1Var, str6, z10, 7));
                        break;
                    } else {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject5;
                        g1Var.h = messages_botresults.next_offset;
                        if (z10) {
                            arrayList5.clear();
                        }
                        arrayList5.size();
                        arrayList5.addAll(messages_botresults.results);
                        g1Var.l();
                        i1Var.d.c(false);
                        g1Var.r = false;
                        break;
                    }
                }
                break;
            case 21:
                da daVar = (da) obj4;
                File file = (File) obj2;
                u6 u6Var = (u6) obj5;
                try {
                    ((Bitmap) obj3).compress(Bitmap.CompressFormat.JPEG, z10 ? 95 : 99, new FileOutputStream(file));
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                AndroidUtilities.runOnUIThread(new m71(daVar, u6Var, file, 19));
                break;
            case 22:
                uf.t tVar = (uf.t) obj4;
                ArrayList arrayList6 = tVar.b;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) obj3);
                int i23 = tVar.a;
                MessagesController.getInstance(i23).putUsers((ArrayList) obj2, true);
                MessagesController.getInstance(i23).putChats((ArrayList) obj5, true);
                NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                tVar.c = false;
                tVar.e(false, z10);
                break;
            default:
                d4.f((org.telegram.ui.ActionBar.p2) obj5, (Context) obj4, (f6) obj3, (o3) obj2, z10);
                break;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, boolean z4, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z4;
        this.f = obj4;
    }

    public /* synthetic */ j(Object obj, Object obj2, boolean z4, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z4;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j(Object obj, TLObject tLObject, boolean z4, TLObject tLObject2, String str, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = tLObject;
        this.b = z4;
        this.f = tLObject2;
        this.d = str;
    }

    public /* synthetic */ j(Object obj, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.e = tL_error;
        this.f = tLObject;
        this.d = str;
        this.b = z4;
    }

    public /* synthetic */ j(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channels_editBanned tL_channels_editBanned, boolean z4) {
        this.a = 3;
        this.c = messagesController;
        this.d = tL_error;
        this.f = p2Var;
        this.e = tL_channels_editBanned;
        this.b = z4;
    }

    public /* synthetic */ j(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z4, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = 0;
        this.c = payments_giveawayinfo;
        this.b = z4;
        this.d = str;
        this.e = tL_messageMediaGiveaway;
        this.f = p2Var;
    }

    public /* synthetic */ j(org.telegram.ui.ActionBar.p2 p2Var, Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.a = i10;
        this.f = p2Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z4;
    }

    public /* synthetic */ j(vt vtVar, boolean z4, lh.n nVar, String str, TextView textView) {
        this.a = 13;
        this.c = vtVar;
        this.b = z4;
        this.e = nVar;
        this.d = str;
        this.f = textView;
    }

    public /* synthetic */ j(jo0 jo0Var, boolean z4, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 17;
        this.c = jo0Var;
        this.b = z4;
        this.d = str;
        this.e = str2;
        this.f = updatepasswordsettings;
    }

    public /* synthetic */ j(og1 og1Var, TLObject tLObject, boolean z4, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 19;
        this.c = og1Var;
        this.e = tLObject;
        this.b = z4;
        this.d = str;
        this.f = passwordinputsettings;
    }
}

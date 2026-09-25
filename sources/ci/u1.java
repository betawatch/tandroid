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
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ey;
import org.telegram.ui.hg;
import org.telegram.ui.je;
import org.telegram.ui.nt;
import org.telegram.ui.oo0;
import org.telegram.ui.wn;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v13, types: [ki.t] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        File file;
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
                        i10 = ((org.telegram.ui.ActionBar.e3) z1Var.r).currentAccount;
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
                lc lcVar = (lc) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z12 = this.b;
                File file2 = (File) this.e;
                l8 l8Var = (l8) this.f;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, z12 ? 95 : 99, new FileOutputStream(file2));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new a3.k0(lcVar, l8Var, file2, 19));
                return;
            case 2:
                hg.a0 a0Var = (hg.a0) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                boolean z13 = this.b;
                ArrayList arrayList5 = a0Var.b;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                int i19 = a0Var.a;
                MessagesController.getInstance(i19).putUsers(arrayList3, true);
                MessagesController.getInstance(i19).putChats(arrayList4, true);
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                a0Var.c = false;
                a0Var.e(false, z13);
                return;
            case 3:
                ii.k4.f((org.telegram.ui.ActionBar.m2) this.c, (Context) this.d, (org.telegram.ui.ActionBar.d6) this.e, (ii.u3) this.f, this.b);
                return;
            case 4:
                ki.s0 s0Var = (ki.s0) this.c;
                boolean z14 = this.b;
                ?? r32 = (ki.t) this.d;
                ki.o0 o0Var = (ki.o0) this.e;
                File file3 = (File) this.f;
                s0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    try {
                        s0Var.f();
                        long j3 = s0Var.D;
                        if (z14) {
                            try {
                                synchronized (r32) {
                                    r32.u = true;
                                    try {
                                        r32.f();
                                        r32.u = false;
                                    } catch (Throwable th2) {
                                        r32.u = false;
                                        throw th2;
                                    }
                                }
                                s0Var.f();
                                s0Var.j(o0Var, 1);
                                file = r32.a;
                                try {
                                    s0Var.c(true);
                                    a3.z a2 = w7.k.a(file3, s0Var.P, s0Var.F, s0Var.G, true);
                                    j3 = a2.b;
                                    s0Var.l.b("resume trim remux completed: requested=" + s0Var.F + ".." + s0Var.G + ", actualStartMs=" + a2.a + ", retainedDurationMs=" + j3 + ", outputSize=" + s0Var.P.a.length() + ", elapsedMs=" + ki.s0.e(nanoTime));
                                } catch (Exception e7) {
                                    e = e7;
                                    s0Var.h.post(new ki.c0(s0Var, e, 1));
                                    if (file3 != null) {
                                        w7.k.c(file3);
                                    }
                                    if (file == null) {
                                        return;
                                    }
                                    w7.k.c(file);
                                    return;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                file = null;
                                s0Var.h.post(new ki.c0(s0Var, e, 1));
                                if (file3 != null) {
                                }
                                if (file == null) {
                                }
                                w7.k.c(file);
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                r32 = 0;
                                if (file3 != null) {
                                    w7.k.c(file3);
                                }
                                if (r32 != 0) {
                                    w7.k.c(r32);
                                }
                                throw th;
                            }
                        } else {
                            file = null;
                        }
                        s0Var.f();
                        s0Var.Q = null;
                        if (!z14) {
                            s0Var.l.b("resume prepared without remux: retainedDurationMs=" + j3 + ", elapsedMs=" + ki.s0.e(nanoTime));
                        }
                        s0Var.h.post(new ki.d0(s0Var, j3, 0));
                        if (file3 != null) {
                            w7.k.c(file3);
                        }
                        if (file == null) {
                            return;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e11) {
                    e = e11;
                    file = null;
                } catch (Throwable th5) {
                    th = th5;
                    r32 = 0;
                }
                w7.k.c(file);
                return;
            case 5:
                ((FactCheckController) this.c).lambda$applyFactCheck$15((TLObject) this.d, (TLRPC.TL_textWithEntities) this.e, this.b, (org.telegram.ui.ActionBar.a2) this.f);
                return;
            case 6:
                ((MediaDataController) this.c).lambda$loadStickersByEmojiOrName$84((TLRPC.TL_error) this.e, (TLObject) this.d, (String) this.f, this.b);
                return;
            case 7:
                ((MessagesController) this.c).lambda$setParticipantBannedRole$91((TLRPC.TL_error) this.d, (org.telegram.ui.ActionBar.m2) this.e, (TLRPC.TL_channels_editBanned) this.f, this.b);
                return;
            case 8:
                ((MessagesStorage) this.c).lambda$putChannelViews$191((a0.i) this.d, (a0.i) this.e, (a0.i) this.f, this.b);
                return;
            case 9:
                ((MessagesStorage) this.c).lambda$replaceMessageIfExists$234((TLRPC.Message) this.d, this.b, (ArrayList) this.e, (ArrayList) this.f);
                return;
            case 10:
                ((SendMessagesHelper) this.c).lambda$sendEditRichMessageRequest$23((TLRPC.TL_messages_editMessage) this.d, (MessageObject) this.e, (org.telegram.ui.ActionBar.m2) this.f, this.b);
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
                je jeVar = (je) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z15 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.m0(password);
                    jeVar.b0(z15, twoStepVerificationActivity.l0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 15:
                wn wnVar = (wn) this.c;
                nf.e eVar = (nf.e) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                hg hgVar = (hg) this.f;
                boolean z16 = this.b;
                eVar.b();
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
                    hgVar.run(obj, Boolean.valueOf(z16));
                    return;
                }
                obj = null;
                hgVar.run(obj, Boolean.valueOf(z16));
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
                cu cuVar = (cu) this.c;
                boolean z18 = this.b;
                fi.o oVar = (fi.o) this.d;
                String str3 = (String) this.f;
                TextView textView = (TextView) this.e;
                ClipboardManager clipboardManager = (ClipboardManager) cuVar.getContext().getSystemService("clipboard");
                boolean z19 = z18 && (TextUtils.isEmpty(oVar.getText()) || TextUtils.equals(oVar.getText().toString(), str3)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                ok.s(textView.animate().alpha(z19 ? 1.0f : 0.0f).scaleX(z19 ? 1.0f : 0.7f).scaleY(z19 ? 1.0f : 0.7f), rr.h, 300L);
                return;
            case 18:
                ty tyVar = (ty) this.c;
                String str4 = (String) this.f;
                boolean z20 = this.b;
                String str5 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.d;
                tyVar.a.remove(str5);
                lz lzVar = tyVar.b;
                qy qyVar = lzVar.j0;
                HashMap hashMap = lzVar.l0;
                if (qyVar.v && qyVar.w.equals(str4)) {
                    lzVar.j0.E(str4, "", false, true, z20, str5, tLObject4);
                    return;
                }
                if (z20 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    tyVar.a(str4, false);
                    return;
                } else {
                    if (!(tLObject4 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str5)) {
                        return;
                    }
                    hashMap.put(str5, (TLRPC.messages_BotResults) tLObject4);
                    return;
                }
            case 19:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                wn wnVar2 = (wn) this.f;
                boolean z21 = this.b;
                File w10 = l8.w(m2Var.getCurrentAccount(), "webp");
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
                } catch (Throwable th6) {
                    FileLog.e(th6);
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
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                    }
                } else if (MessageObject.isVideoStickerDocument(document)) {
                    photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
                }
                PhotoViewer.t1().J2(m2Var.getParentActivity(), null, m2Var.getResourceProvider());
                PhotoViewer.t1().f2(arrayList6, 0, 11, false, new wx0(), wnVar2);
                PhotoViewer.t1().X0(document, z21 ? document : null, true, null);
                nt.q().T = z21 ? tL_messages_stickerSet : null;
                return;
            case 20:
                ey eyVar = (ey) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                String str6 = (String) this.f;
                boolean z22 = this.b;
                org.telegram.ui.qy qyVar2 = eyVar.a;
                if (tL_error2 == null) {
                    TLRPC.User user2 = qyVar2.getMessagesController().getUser(Long.valueOf(qyVar2.getUserConfig().getClientUserId()));
                    if (user2 == null) {
                        user2 = qyVar2.getUserConfig().getCurrentUser();
                        if (user2 == null) {
                            return;
                        } else {
                            qyVar2.getMessagesController().putUser(user2, false);
                        }
                    } else {
                        qyVar2.getUserConfig().setCurrentUser(user2);
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
                    if (closestPhotoSizeWithSize == null || qyVar2.b4 == null) {
                        user = user3;
                        z10 = true;
                    } else {
                        i16 = ((org.telegram.ui.ActionBar.m2) qyVar2).currentAccount;
                        File pathToAttach2 = FileLoader.getInstance(i16).getPathToAttach(closestPhotoSizeWithSize, true);
                        i17 = ((org.telegram.ui.ActionBar.m2) qyVar2).currentAccount;
                        FileLoader.getInstance(i17).getPathToAttach(qyVar2.b4, true).renameTo(pathToAttach2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(qyVar2.b4.volume_id);
                        sb2.append("_");
                        String o9 = a4.a.o(qyVar2.b4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        String o10 = a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3);
                        ImageLoader imageLoader = ImageLoader.getInstance();
                        i18 = ((org.telegram.ui.ActionBar.m2) qyVar2).currentAccount;
                        user = user3;
                        z10 = true;
                        imageLoader.replaceImageInCache(o9, o10, ImageLocation.getForUserOrChat(i18, user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str6 != null) {
                        i15 = ((org.telegram.ui.ActionBar.m2) qyVar2).currentAccount;
                        new File(str6).renameTo(FileLoader.getInstance(i15).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && qyVar2.c4 != null) {
                        i13 = ((org.telegram.ui.ActionBar.m2) qyVar2).currentAccount;
                        File pathToAttach3 = FileLoader.getInstance(i13).getPathToAttach(closestPhotoSizeWithSize2, true);
                        i14 = ((org.telegram.ui.ActionBar.m2) qyVar2).currentAccount;
                        FileLoader.getInstance(i14).getPathToAttach(qyVar2.c4, true).renameTo(pathToAttach3);
                    }
                    qyVar2.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(user);
                    i11 = 0;
                    qyVar2.getMessagesStorage().putUsersAndChats(arrayList9, null, false, true);
                    TLRPC.UserFull userFull = qyVar2.getMessagesController().getUserFull(qyVar2.getUserConfig().getClientUserId());
                    if (userFull != null) {
                        userFull.profile_photo = tL_photos_photo.photo;
                        qyVar2.getMessagesStorage().updateUserInfo(userFull, false);
                    }
                } else {
                    i11 = 0;
                }
                qyVar2.b4 = null;
                qyVar2.c4 = null;
                NotificationCenter notificationCenter = qyVar2.getNotificationCenter();
                int i22 = NotificationCenter.updateInterfaces;
                Object[] objArr = new Object[1];
                objArr[i11] = Integer.valueOf(MessagesController.UPDATE_MASK_ALL);
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i22, objArr);
                qyVar2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[i11]);
                qyVar2.getUserConfig().saveConfig(true);
                i12 = ((org.telegram.ui.ActionBar.m2) qyVar2).currentAccount;
                MessagesController.getInstance(i12).removeSuggestion(0L, "USERPIC_SETUP");
                qyVar2.U4();
                org.telegram.ui.Components.qc qcVar = qyVar2.d4;
                if (qcVar != null) {
                    org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) qcVar.e;
                    hcVar.d.c(LocaleController.getString(z22 ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true, true);
                    hcVar.setProgress(1.0f);
                    org.telegram.ui.Components.mb button = hcVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    ok.s(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), rr.h, 360L);
                    org.telegram.ui.Components.qc qcVar2 = qyVar2.d4;
                    qcVar2.j = 5000;
                    qcVar2.i(false);
                    qyVar2.d4.i(true);
                    return;
                }
                return;
            case 21:
                oo0.a0((oo0) this.c, this.b, (String) this.f, (String) this.d, (TL_account.updatePasswordSettings) this.e);
                return;
            case 22:
                oo0.i0((oo0) this.c, (TLRPC.TL_error) this.e, this.b, (TLObject) this.d, (String) this.f);
                return;
            case 23:
                zg1.U((zg1) this.c, (TLObject) this.d, this.b, (String) this.f, (TL_account.passwordInputSettings) this.e);
                return;
            default:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.c;
                boolean z23 = this.b;
                String str7 = (String) this.f;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.e;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    tg.i.d(z23, str7, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, m2Var2.getParentActivity(), m2Var2.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        tg.i.e(z23, str7, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, m2Var2.getParentActivity(), m2Var2.getResourceProvider());
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

    public /* synthetic */ u1(ki.s0 s0Var, boolean z10, ki.t tVar, ki.o0 o0Var, File file) {
        this.a = 4;
        this.c = s0Var;
        this.b = z10;
        this.d = tVar;
        this.e = o0Var;
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

    public /* synthetic */ u1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = 24;
        this.c = payments_giveawayinfo;
        this.b = z10;
        this.f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = m2Var;
    }

    public /* synthetic */ u1(org.telegram.ui.Components.oa oaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.a = 16;
        this.c = oaVar;
        this.f = str;
        this.d = bitmap;
        this.b = z10;
        this.e = bitmap2;
    }

    public /* synthetic */ u1(cu cuVar, boolean z10, fi.o oVar, String str, TextView textView) {
        this.a = 17;
        this.c = cuVar;
        this.b = z10;
        this.d = oVar;
        this.f = str;
        this.e = textView;
    }

    public /* synthetic */ u1(ty tyVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.a = 18;
        this.c = tyVar;
        this.f = str;
        this.b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public /* synthetic */ u1(oo0 oo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 21;
        this.c = oo0Var;
        this.b = z10;
        this.f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public /* synthetic */ u1(zg1 zg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 23;
        this.c = zg1Var;
        this.d = tLObject;
        this.b = z10;
        this.f = str;
        this.e = passwordinputsettings;
    }
}

package org.telegram.messenger.voip;

import android.app.Activity;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ke;
import org.telegram.ui.m31;
import org.telegram.ui.u31;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ e(long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j3;
        this.e = tLObject;
        this.f = tL_error;
        this.h = atomicBoolean;
        this.n = atomicInteger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                ((ConferenceCall) this.c).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.d, this.b, (TLObject) this.e, (TLRPC.TL_error) this.f, (AtomicBoolean) this.h, (AtomicInteger) this.n);
                break;
            case 1:
                s60.n((s60) this.c, (b2) this.d, (Context) this.e, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.n);
                break;
            case 2:
                TLObject tLObject = (TLObject) this.e;
                Activity activity = (Activity) this.c;
                d6 d6Var = (d6) this.d;
                byte[] bArr = (byte[]) this.f;
                xn xnVar = (xn) this.h;
                MessageObject messageObject = (MessageObject) this.n;
                u31 u31Var = new u31(activity, d6Var, this.b, bArr);
                u31Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject);
                u31Var.s = new m31(xnVar, activity, d6Var, messageObject);
                u31Var.show();
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                xn xnVar2 = (xn) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.n;
                if (tL_error == null) {
                    TLRPC.User user = xnVar2.getMessagesController().getUser(Long.valueOf(xnVar2.getUserConfig().getClientUserId()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject2;
                    ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
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
                    if (closestPhotoSizeWithSize == null || fileLocationArr[0] == null) {
                        z10 = true;
                    } else {
                        FileLoader.getInstance(xnVar2.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(xnVar2.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String o9 = a4.a.o(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(o9, a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(xnVar2.getCurrentAccount(), user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(xnVar2.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(xnVar2.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(xnVar2.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    xnVar2.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    xnVar2.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = xnVar2.getMessagesController();
                    long j3 = this.b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j3);
                    userFull.profile_photo = tL_photos_photo.photo;
                    xnVar2.getMessagesStorage().updateUserInfo(userFull, false);
                    xc.a0(xnVar2).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ke(j3, xnVar2)), null).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(TLObject tLObject, Activity activity, d6 d6Var, long j3, byte[] bArr, xn xnVar, MessageObject messageObject) {
        this.e = tLObject;
        this.c = activity;
        this.d = d6Var;
        this.b = j3;
        this.f = bArr;
        this.h = xnVar;
        this.n = messageObject;
    }

    public /* synthetic */ e(TLRPC.TL_error tL_error, xn xnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f = tL_error;
        this.c = xnVar;
        this.e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.n = fileLocationArr2;
        this.b = j3;
    }

    public /* synthetic */ e(s60 s60Var, b2 b2Var, Context context, long j3, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.c = s60Var;
        this.d = b2Var;
        this.e = context;
        this.b = j3;
        this.f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.n = channelParticipant;
    }
}

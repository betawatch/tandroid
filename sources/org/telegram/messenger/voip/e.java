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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.zc;
import org.telegram.ui.a41;
import org.telegram.ui.fo;
import org.telegram.ui.i41;
import org.telegram.ui.re;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

    public /* synthetic */ e(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j10;
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
                p70.o((p70) this.c, (a2) this.d, (Context) this.e, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.n);
                break;
            case 2:
                TLObject tLObject = (TLObject) this.e;
                Activity activity = (Activity) this.c;
                c6 c6Var = (c6) this.d;
                byte[] bArr = (byte[]) this.f;
                fo foVar = (fo) this.h;
                MessageObject messageObject = (MessageObject) this.n;
                i41 i41Var = new i41(activity, c6Var, this.b, bArr);
                i41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject);
                i41Var.s = new a41(foVar, activity, c6Var, messageObject);
                i41Var.show();
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                fo foVar2 = (fo) this.c;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
                String str = (String) this.h;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.n;
                if (tL_error == null) {
                    TLRPC.User user = foVar2.getMessagesController().getUser(Long.valueOf(foVar2.getUserConfig().getClientUserId()));
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
                        FileLoader.getInstance(foVar2.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(foVar2.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(foVar2.getCurrentAccount(), user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(foVar2.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(foVar2.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(foVar2.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    foVar2.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    foVar2.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = foVar2.getMessagesController();
                    long j10 = this.b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    foVar2.getMessagesStorage().updateUserInfo(userFull, false);
                    zc.a0(foVar2).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new re(j10, foVar2)), null).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e(TLObject tLObject, Activity activity, c6 c6Var, long j10, byte[] bArr, fo foVar, MessageObject messageObject) {
        this.e = tLObject;
        this.c = activity;
        this.d = c6Var;
        this.b = j10;
        this.f = bArr;
        this.h = foVar;
        this.n = messageObject;
    }

    public /* synthetic */ e(TLRPC.TL_error tL_error, fo foVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f = tL_error;
        this.c = foVar;
        this.e = tLObject;
        this.d = fileLocationArr;
        this.h = str;
        this.n = fileLocationArr2;
        this.b = j10;
    }

    public /* synthetic */ e(p70 p70Var, a2 a2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.c = p70Var;
        this.d = a2Var;
        this.e = context;
        this.b = j10;
        this.f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.n = channelParticipant;
    }
}

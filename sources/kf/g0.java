package kf;

import android.app.Activity;
import android.content.Context;
import gg.y0;
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
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t60;
import org.telegram.ui.i31;
import org.telegram.ui.q31;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ g0(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.e = conferenceCall;
        this.f = getgroupcallchainblocks;
        this.b = j10;
        this.c = tLObject;
        this.d = tL_error;
        this.h = atomicBoolean;
        this.n = atomicInteger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                zn znVar = (zn) this.e;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f;
                String str = (String) this.n;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.h;
                if (tL_error == null) {
                    TLRPC.User user = znVar.getMessagesController().getUser(Long.valueOf(znVar.getUserConfig().getClientUserId()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
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
                        z4 = true;
                    } else {
                        FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileLocationArr[0].volume_id);
                        sb.append("_");
                        String m9 = android.support.v4.media.a.m(fileLocationArr[0].local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        z4 = true;
                        ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUserOrChat(znVar.getCurrentAccount(), user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z4));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(znVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    znVar.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    znVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = znVar.getMessagesController();
                    long j10 = this.b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    znVar.getMessagesStorage().updateUserInfo(userFull, false);
                    qc.a0(znVar).V(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new y0(j10, znVar)), null).j();
                    break;
                }
                break;
            case 1:
                ((ConferenceCall) this.e).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f, this.b, (TLObject) this.c, (TLRPC.TL_error) this.d, (AtomicBoolean) this.h, (AtomicInteger) this.n);
                break;
            case 2:
                t60.n((t60) this.d, (d2) this.e, (Context) this.c, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.n);
                break;
            default:
                TLObject tLObject2 = (TLObject) this.c;
                Activity activity = (Activity) this.d;
                f6 f6Var = (f6) this.f;
                byte[] bArr = (byte[]) this.h;
                zn znVar2 = (zn) this.e;
                MessageObject messageObject = (MessageObject) this.n;
                q31 q31Var = new q31(activity, f6Var, this.b, bArr);
                q31Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject2);
                q31Var.s = new i31(znVar2, activity, f6Var, messageObject);
                q31Var.show();
                break;
        }
    }

    public /* synthetic */ g0(TLObject tLObject, Activity activity, f6 f6Var, long j10, byte[] bArr, zn znVar, MessageObject messageObject) {
        this.c = tLObject;
        this.d = activity;
        this.f = f6Var;
        this.b = j10;
        this.h = bArr;
        this.e = znVar;
        this.n = messageObject;
    }

    public /* synthetic */ g0(TLRPC.TL_error tL_error, zn znVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.d = tL_error;
        this.e = znVar;
        this.c = tLObject;
        this.f = fileLocationArr;
        this.n = str;
        this.h = fileLocationArr2;
        this.b = j10;
    }

    public /* synthetic */ g0(t60 t60Var, d2 d2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = t60Var;
        this.e = d2Var;
        this.c = context;
        this.b = j10;
        this.f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.n = channelParticipant;
    }
}

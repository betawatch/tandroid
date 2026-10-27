package ag;

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
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.p21;
import org.telegram.ui.wn;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ m0(long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
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
        boolean z10;
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                wn wnVar = (wn) this.e;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f;
                String str = (String) this.n;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.h;
                if (tL_error == null) {
                    TLRPC.User user = wnVar.getMessagesController().getUser(Long.valueOf(wnVar.getUserConfig().getClientUserId()));
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
                        z10 = true;
                    } else {
                        FileLoader.getInstance(wnVar.getCurrentAccount()).getPathToAttach(fileLocationArr[0], true).renameTo(FileLoader.getInstance(wnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocationArr[0].volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(fileLocationArr[0].local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUserOrChat(wnVar.getCurrentAccount(), user, 1), false);
                    }
                    if (closestVideoSizeWithSize != null && str != null) {
                        new File(str).renameTo(FileLoader.getInstance(wnVar.getCurrentAccount()).getPathToAttach(closestVideoSizeWithSize, "mp4", z10));
                    } else if (closestPhotoSizeWithSize2 != null && fileLocationArr2[0] != null) {
                        FileLoader.getInstance(wnVar.getCurrentAccount()).getPathToAttach(fileLocationArr2[0], true).renameTo(FileLoader.getInstance(wnVar.getCurrentAccount()).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    wnVar.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    wnVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    MessagesController messagesController = wnVar.getMessagesController();
                    long j10 = this.b;
                    TLRPC.UserFull userFull = messagesController.getUserFull(j10);
                    userFull.profile_photo = tL_photos_photo.photo;
                    wnVar.getMessagesStorage().updateUserInfo(userFull, false);
                    wc.b0(wnVar).W(Collections.singletonList(user), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new o0(j10, wnVar)), null).j();
                    break;
                }
                break;
            case 1:
                ((ConferenceCall) this.e).lambda$poll$7((TL_phone.getGroupCallChainBlocks) this.f, this.b, (TLObject) this.c, (TLRPC.TL_error) this.d, (AtomicBoolean) this.h, (AtomicInteger) this.n);
                break;
            case 2:
                o70.n((o70) this.d, (e2) this.e, (Context) this.c, this.b, (TLRPC.TL_chatInviteExported) this.f, (TLRPC.TL_chatInviteImporter) this.h, (TLRPC.ChannelParticipant) this.n);
                break;
            default:
                TLObject tLObject2 = (TLObject) this.c;
                Activity activity = (Activity) this.d;
                u6 u6Var = (u6) this.f;
                byte[] bArr = (byte[]) this.h;
                wn wnVar2 = (wn) this.e;
                MessageObject messageObject = (MessageObject) this.n;
                x21 x21Var = new x21(activity, u6Var, this.b, bArr);
                x21Var.R((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject2);
                x21Var.v = new p21(wnVar2, activity, u6Var, messageObject);
                x21Var.show();
                break;
        }
    }

    public /* synthetic */ m0(TLObject tLObject, Activity activity, u6 u6Var, long j10, byte[] bArr, wn wnVar, MessageObject messageObject) {
        this.c = tLObject;
        this.d = activity;
        this.f = u6Var;
        this.b = j10;
        this.h = bArr;
        this.e = wnVar;
        this.n = messageObject;
    }

    public /* synthetic */ m0(TLRPC.TL_error tL_error, wn wnVar, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.d = tL_error;
        this.e = wnVar;
        this.c = tLObject;
        this.f = fileLocationArr;
        this.n = str;
        this.h = fileLocationArr2;
        this.b = j10;
    }

    public /* synthetic */ m0(o70 o70Var, e2 e2Var, Context context, long j10, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) {
        this.d = o70Var;
        this.e = e2Var;
        this.c = context;
        this.b = j10;
        this.f = tL_chatInviteExported;
        this.h = tL_chatInviteImporter;
        this.n = channelParticipant;
    }
}

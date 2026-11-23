package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class hl implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ np b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ hl(np npVar, long j3, TLObject tLObject) {
        this.b = npVar;
        this.d = j3;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        TLObject tLObject = this.c;
        np npVar = this.b;
        switch (i7) {
            case 0:
                npVar.u0.l(j3);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    npVar.f4(tL_messages_peerSettings.users, false);
                    npVar.Z3(tL_messages_peerSettings.chats, false);
                    npVar.D4(j3, peerSettings);
                    break;
                }
                break;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User c22 = npVar.c2(Long.valueOf(npVar.getUserConfig().e()));
                if (c22 == null) {
                    c22 = npVar.getUserConfig().f();
                    npVar.e4(c22, false, false);
                } else {
                    npVar.getUserConfig().w(c22);
                }
                if (c22 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c22);
                    npVar.getMessagesStorage().m1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        c22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.id;
                        userProfilePhoto.photo_small = w7.w(photo.sizes, ls.g2, false, null, false).location;
                        c22.photo.photo_big = w7.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        c22.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        c22.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull d2 = npVar.d2(j3);
                    if (d2 != null) {
                        d2.profile_photo = tL_photos_photo.photo;
                        npVar.getMessagesStorage().j2(d2, false);
                    }
                    npVar.getUserConfig().f().photo = c22.photo;
                    npVar.e4(c22, false, false);
                    npVar.getNotificationCenter().k(46, new Object[0]);
                    npVar.getNotificationCenter().k(2, Integer.valueOf(np.I8));
                    npVar.getNotificationCenter().k(2, 2);
                    npVar.getUserConfig().v(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hl(np npVar, TLObject tLObject, long j3) {
        this.b = npVar;
        this.c = tLObject;
        this.d = j3;
    }
}

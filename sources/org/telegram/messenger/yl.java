package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class yl implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ np b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ yl(np npVar, long j3, TLObject tLObject) {
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
                    npVar.Y3(tL_messages_peerSettings.users, false);
                    npVar.S3(tL_messages_peerSettings.chats, false);
                    npVar.u4(j3, peerSettings);
                    break;
                }
                break;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User a22 = npVar.a2(Long.valueOf(npVar.getUserConfig().e()));
                if (a22 == null) {
                    a22 = npVar.getUserConfig().f();
                    npVar.X3(a22, false, false);
                } else {
                    npVar.getUserConfig().w(a22);
                }
                if (a22 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a22);
                    npVar.getMessagesStorage().m1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        a22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.id;
                        userProfilePhoto.photo_small = w7.w(photo.sizes, ns.g2, false, null, false).location;
                        a22.photo.photo_big = w7.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        a22.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        a22.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull b22 = npVar.b2(j3);
                    if (b22 != null) {
                        b22.profile_photo = tL_photos_photo.photo;
                        npVar.getMessagesStorage().j2(b22, false);
                    }
                    npVar.getUserConfig().f().photo = a22.photo;
                    npVar.X3(a22, false, false);
                    npVar.getNotificationCenter().k(46, new Object[0]);
                    npVar.getNotificationCenter().k(2, Integer.valueOf(np.D8));
                    npVar.getNotificationCenter().k(2, 2);
                    npVar.getUserConfig().v(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yl(np npVar, TLObject tLObject, long j3) {
        this.b = npVar;
        this.c = tLObject;
        this.d = j3;
    }
}

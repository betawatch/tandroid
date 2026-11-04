package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class rl implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hp b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ rl(hp hpVar, long j10, TLObject tLObject) {
        this.b = hpVar;
        this.d = j10;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.d;
        TLObject tLObject = this.c;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                hpVar.u0.l(j10);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    hpVar.Y3(tL_messages_peerSettings.users, false);
                    hpVar.S3(tL_messages_peerSettings.chats, false);
                    hpVar.u4(j10, peerSettings);
                    break;
                }
                break;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User a22 = hpVar.a2(Long.valueOf(hpVar.getUserConfig().e()));
                if (a22 == null) {
                    a22 = hpVar.getUserConfig().f();
                    hpVar.X3(a22, false, false);
                } else {
                    hpVar.getUserConfig().w(a22);
                }
                if (a22 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a22);
                    hpVar.getMessagesStorage().m1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        a22.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.id;
                        userProfilePhoto.photo_small = w7.w(photo.sizes, hs.g2, false, null, false).location;
                        a22.photo.photo_big = w7.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        a22.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        a22.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull b22 = hpVar.b2(j10);
                    if (b22 != null) {
                        b22.profile_photo = tL_photos_photo.photo;
                        hpVar.getMessagesStorage().j2(b22, false);
                    }
                    hpVar.getUserConfig().f().photo = a22.photo;
                    hpVar.X3(a22, false, false);
                    hpVar.getNotificationCenter().k(46, new Object[0]);
                    hpVar.getNotificationCenter().k(2, Integer.valueOf(hp.C8));
                    hpVar.getNotificationCenter().k(2, 2);
                    hpVar.getUserConfig().v(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ rl(hp hpVar, TLObject tLObject, long j10) {
        this.b = hpVar;
        this.c = tLObject;
        this.d = j10;
    }
}

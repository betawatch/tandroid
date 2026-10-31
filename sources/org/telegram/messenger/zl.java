package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class zl implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vp b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;

    public /* synthetic */ zl(vp vpVar, long j10, TLObject tLObject) {
        this.b = vpVar;
        this.d = j10;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        TLObject tLObject = this.c;
        vp vpVar = this.b;
        switch (i10) {
            case 0:
                vpVar.t0.l(j10);
                if (tLObject != null) {
                    TLRPC.TL_messages_peerSettings tL_messages_peerSettings = (TLRPC.TL_messages_peerSettings) tLObject;
                    TLRPC.PeerSettings peerSettings = tL_messages_peerSettings.settings;
                    vpVar.V3(tL_messages_peerSettings.users, false);
                    vpVar.P3(tL_messages_peerSettings.chats, false);
                    vpVar.r4(j10, peerSettings);
                    break;
                }
                break;
            default:
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                TLRPC.User Z1 = vpVar.Z1(Long.valueOf(vpVar.getUserConfig().e()));
                if (Z1 == null) {
                    Z1 = vpVar.getUserConfig().f();
                    vpVar.U3(Z1, false, false);
                } else {
                    vpVar.getUserConfig().w(Z1);
                }
                if (Z1 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Z1);
                    vpVar.getMessagesStorage().m1(arrayList, null, false, true);
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                        Z1.photo = tL_userProfilePhoto;
                        tL_userProfilePhoto.has_video = !tL_photos_photo.photo.video_sizes.isEmpty();
                        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                        TLRPC.Photo photo = tL_photos_photo.photo;
                        userProfilePhoto.photo_id = photo.id;
                        userProfilePhoto.photo_small = b8.w(photo.sizes, zs.g2, false, null, false).location;
                        Z1.photo.photo_big = b8.w(tL_photos_photo.photo.sizes, 800, false, null, false).location;
                        Z1.photo.dc_id = tL_photos_photo.photo.dc_id;
                    } else {
                        Z1.photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    TLRPC.UserFull a2 = vpVar.a2(j10);
                    if (a2 != null) {
                        a2.profile_photo = tL_photos_photo.photo;
                        vpVar.getMessagesStorage().j2(a2, false);
                    }
                    vpVar.getUserConfig().f().photo = Z1.photo;
                    vpVar.U3(Z1, false, false);
                    vpVar.getNotificationCenter().k(46, new Object[0]);
                    vpVar.getNotificationCenter().k(2, Integer.valueOf(vp.D8));
                    vpVar.getNotificationCenter().k(2, 2);
                    vpVar.getUserConfig().v(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zl(vp vpVar, TLObject tLObject, long j10) {
        this.b = vpVar;
        this.c = tLObject;
        this.d = j10;
    }
}

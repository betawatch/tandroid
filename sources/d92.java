// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class d92 extends yc8 {
    public final /* synthetic */ g92 a;

    public d92(g92 g92Var) {
        this.a = g92Var;
    }

    @Override // yc8, ed8
    public final void F() {
        this.a.e.getImageReceiver().v0(true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r11 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0040, code lost:
    
        if (r11 != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    @Override // yc8, ed8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        TLRPC.FileLocation fileLocation2;
        g92 g92Var = this.a;
        long j = g92Var.C0;
        if (fileLocation != null) {
            if (g92Var.D0 != null) {
                TLRPC.User X1 = j == 0 ? null : g92Var.getMessagesController().X1(Long.valueOf(j));
                if (X1 != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    g92Var.e.getLocationInWindow(iArr);
                    fd8 fd8Var = new fd8();
                    fd8Var.b = iArr[0];
                    fd8Var.c = iArr[1];
                    mb0 mb0Var = g92Var.e;
                    fd8Var.d = mb0Var;
                    ImageReceiver imageReceiver = mb0Var.getImageReceiver();
                    fd8Var.a = imageReceiver;
                    if (j == 0) {
                        j = -g92Var.w0;
                    }
                    fd8Var.f = j;
                    fd8Var.e = imageReceiver.p();
                    fd8Var.g = -1L;
                    fd8Var.h = g92Var.e.getImageReceiver().z();
                    fd8Var.k = g92Var.d.getScaleX();
                    fd8Var.p = true;
                    return fd8Var;
                }
            } else {
                TLRPC.Chat M0 = g92Var.getMessagesController().M0(Long.valueOf(g92Var.w0));
                if (M0 != null) {
                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    g92Var.e.getLocationInWindow(iArr2);
                    fd8 fd8Var2 = new fd8();
                    fd8Var2.b = iArr2[0];
                    fd8Var2.c = iArr2[1];
                    mb0 mb0Var2 = g92Var.e;
                    fd8Var2.d = mb0Var2;
                    ImageReceiver imageReceiver2 = mb0Var2.getImageReceiver();
                    fd8Var2.a = imageReceiver2;
                    if (j == 0) {
                    }
                    fd8Var2.f = j;
                    fd8Var2.e = imageReceiver2.p();
                    fd8Var2.g = -1L;
                    fd8Var2.h = g92Var.e.getImageReceiver().z();
                    fd8Var2.k = g92Var.d.getScaleX();
                    fd8Var2.p = true;
                    return fd8Var2;
                }
            }
        }
        return null;
    }

    @Override // yc8, ed8
    public final boolean N() {
        g92 g92Var = this.a;
        long j = g92Var.C0;
        if (j == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = g92Var.getMessagesController().o1(j);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        g92Var.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ye(this, (byte) 12));
        return false;
    }

    @Override // yc8, ed8
    public final void g(String str, String str2, boolean z) {
        this.a.s.p(str, str2, z);
    }

    @Override // yc8, ed8
    public final int x() {
        return 1;
    }
}

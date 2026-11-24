// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m82 extends i98 {
    public final /* synthetic */ p82 a;

    public m82(p82 p82Var) {
        this.a = p82Var;
    }

    @Override // i98, o98
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
    @Override // i98, o98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        TLRPC.FileLocation fileLocation2;
        p82 p82Var = this.a;
        long j = p82Var.C0;
        if (fileLocation != null) {
            if (p82Var.D0 != null) {
                TLRPC.User V1 = j == 0 ? null : p82Var.getMessagesController().V1(Long.valueOf(j));
                if (V1 != null) {
                    TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                    if (userProfilePhoto != null) {
                        fileLocation2 = userProfilePhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                    int[] iArr = new int[2];
                    p82Var.e.getLocationInWindow(iArr);
                    p98 p98Var = new p98();
                    p98Var.b = iArr[0];
                    p98Var.c = iArr[1];
                    kb0 kb0Var = p82Var.e;
                    p98Var.d = kb0Var;
                    ImageReceiver imageReceiver = kb0Var.getImageReceiver();
                    p98Var.a = imageReceiver;
                    if (j == 0) {
                        j = -p82Var.w0;
                    }
                    p98Var.f = j;
                    p98Var.e = imageReceiver.p();
                    p98Var.g = -1L;
                    p98Var.h = p82Var.e.getImageReceiver().z();
                    p98Var.k = p82Var.d.getScaleX();
                    p98Var.p = true;
                    return p98Var;
                }
            } else {
                TLRPC.Chat K0 = p82Var.getMessagesController().K0(Long.valueOf(p82Var.w0));
                if (K0 != null) {
                    TLRPC.ChatPhoto chatPhoto = K0.photo;
                    if (chatPhoto != null) {
                        fileLocation2 = chatPhoto.photo_big;
                    }
                }
                fileLocation2 = null;
                if (fileLocation2 != null) {
                    int[] iArr2 = new int[2];
                    p82Var.e.getLocationInWindow(iArr2);
                    p98 p98Var2 = new p98();
                    p98Var2.b = iArr2[0];
                    p98Var2.c = iArr2[1];
                    kb0 kb0Var2 = p82Var.e;
                    p98Var2.d = kb0Var2;
                    ImageReceiver imageReceiver2 = kb0Var2.getImageReceiver();
                    p98Var2.a = imageReceiver2;
                    if (j == 0) {
                    }
                    p98Var2.f = j;
                    p98Var2.e = imageReceiver2.p();
                    p98Var2.g = -1L;
                    p98Var2.h = p82Var.e.getImageReceiver().z();
                    p98Var2.k = p82Var.d.getScaleX();
                    p98Var2.p = true;
                    return p98Var2;
                }
            }
        }
        return null;
    }

    @Override // i98, o98
    public final boolean N() {
        p82 p82Var = this.a;
        long j = p82Var.C0;
        if (j == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = p82Var.getMessagesController().m1(j);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
        p82Var.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new uf(this, (byte) 12));
        return false;
    }

    @Override // i98, o98
    public final void g(String str, String str2, boolean z) {
        this.a.s.p(str, str2, z);
    }

    @Override // i98, o98
    public final int x() {
        return 1;
    }
}

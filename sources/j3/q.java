package j3;

import android.util.Base64;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements p8.i {
    public final /* synthetic */ int a;

    @Override // p8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return new j(new com.google.android.exoplayer2.upstream.r(), 2500, 5000);
            default:
                byte[] bArr = new byte[12];
                k3.h.h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}

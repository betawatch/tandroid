package h3;

import android.util.Base64;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements n8.i {
    public final /* synthetic */ int a;

    @Override // n8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return new j(new com.google.android.exoplayer2.upstream.r(), 2500, 5000);
            default:
                byte[] bArr = new byte[12];
                i3.h.h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}

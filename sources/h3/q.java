package h3;

import android.util.Base64;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements o8.i {
    public final /* synthetic */ int a;

    @Override // o8.i
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

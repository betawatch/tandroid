package m3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public interface l extends com.google.android.exoplayer2.upstream.j {
    void b(int i10, int i11, byte[] bArr);

    boolean d(byte[] bArr, int i10, int i11, boolean z10);

    int e(int i10, int i11, byte[] bArr);

    boolean g(byte[] bArr, int i10, int i11, boolean z10);

    long getLength();

    long getPosition();

    long i();

    void j(int i10);

    void q();

    void readFully(byte[] bArr, int i10, int i11);

    int skip(int i10);

    void t(int i10);
}

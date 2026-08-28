package m3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface l extends com.google.android.exoplayer2.upstream.j {
    void c(int i9, int i10, byte[] bArr);

    boolean d(byte[] bArr, int i9, int i10, boolean z10);

    int e(int i9, int i10, byte[] bArr);

    boolean g(byte[] bArr, int i9, int i10, boolean z10);

    long getLength();

    long getPosition();

    long k();

    void n(int i9);

    void readFully(byte[] bArr, int i9, int i10);

    int skip(int i9);

    void t();

    void u(int i9);
}

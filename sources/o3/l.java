package o3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public interface l extends com.google.android.exoplayer2.upstream.j {
    void a(int i10, int i11, byte[] bArr);

    boolean c(byte[] bArr, int i10, int i11, boolean z10);

    int d(int i10, int i11, byte[] bArr);

    boolean f(byte[] bArr, int i10, int i11, boolean z10);

    long getLength();

    long getPosition();

    long h();

    void i(int i10);

    void readFully(byte[] bArr, int i10, int i11);

    void s();

    int skip(int i10);

    void t(int i10);
}

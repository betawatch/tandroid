package bg;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j10) {
        this.b = j10;
    }

    @Override // bg.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // bg.a
    public final int b() {
        return -1;
    }

    @Override // bg.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // bg.a
    public final void d() {
        this.c = 0;
    }

    @Override // bg.a
    public final void e(int i10, int i11) {
        this.c = AudioConversions.usToShorts(this.b, i10, i11);
    }
}

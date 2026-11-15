package dh;

import org.telegram.messenger.si;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a {
    public boolean a;
    public long b;

    public void a(long j3) {
        this.b = si.p(this.b, j3);
    }

    public void b(boolean z10) {
        a(z10 ? 1L : 0L);
    }

    public void c(float f10) {
        a(Float.floatToIntBits(f10));
    }
}

package dh;

import org.telegram.messenger.si;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a {
    public boolean a;
    public long b;

    public void a(long j3) {
        this.b = si.r(this.b, j3);
    }

    public void b(boolean z10) {
        a(z10 ? 1L : 0L);
    }

    public void c(float f10) {
        a(Float.floatToIntBits(f10));
    }
}

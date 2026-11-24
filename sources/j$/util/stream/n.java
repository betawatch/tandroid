package j$.util.stream;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class n extends j5 {
    public Set b;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.b.contains(obj)) {
            return;
        }
        this.b.add(obj);
        this.a.accept((n5) obj);
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void end() {
        this.b = null;
        this.a.end();
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public final void n(long j) {
        this.b = new HashSet();
        this.a.n(-1L);
    }
}

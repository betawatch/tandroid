package j$.util.stream;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

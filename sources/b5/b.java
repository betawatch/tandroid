package b5;

import java.util.Collections;
import java.util.List;
import t4.f;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements f {
    public static final b b = new b();
    public final List a;

    public b(t4.b bVar) {
        this.a = Collections.singletonList(bVar);
    }

    @Override // t4.f
    public final int e(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // t4.f
    public final long m(int i10) {
        f5.a.f(i10 == 0);
        return 0L;
    }

    @Override // t4.f
    public final List q(long j10) {
        return j10 >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // t4.f
    public final int v() {
        return 1;
    }

    public b() {
        this.a = Collections.EMPTY_LIST;
    }
}

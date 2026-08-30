package d5;

import java.util.Collections;
import java.util.List;
import v4.f;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b implements f {
    public static final b b = new b();
    public final List a;

    public b(v4.b bVar) {
        this.a = Collections.singletonList(bVar);
    }

    @Override // v4.f
    public final int b(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // v4.f
    public final long g(int i10) {
        h5.a.f(i10 == 0);
        return 0L;
    }

    @Override // v4.f
    public final List m(long j10) {
        return j10 >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // v4.f
    public final int p() {
        return 1;
    }

    public b() {
        this.a = Collections.EMPTY_LIST;
    }
}

package d5;

import java.util.Collections;
import java.util.List;
import v4.f;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b implements f {
    public static final b b = new b();
    public final List a;

    public b(v4.b bVar) {
        this.a = Collections.singletonList(bVar);
    }

    @Override // v4.f
    public final int d(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // v4.f
    public final long l(int i10) {
        h5.a.f(i10 == 0);
        return 0L;
    }

    @Override // v4.f
    public final List q(long j10) {
        return j10 >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // v4.f
    public final int x() {
        return 1;
    }

    public b() {
        this.a = Collections.EMPTY_LIST;
    }
}

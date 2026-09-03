package d5;

import java.util.Collections;
import java.util.List;
import v4.f;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b implements f {
    public static final b b = new b();
    public final List a;

    public b(v4.b bVar) {
        this.a = Collections.singletonList(bVar);
    }

    @Override // v4.f
    public final int e(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // v4.f
    public final long h(int i10) {
        h5.a.f(i10 == 0);
        return 0L;
    }

    @Override // v4.f
    public final List q(long j10) {
        return j10 >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // v4.f
    public final int r() {
        return 1;
    }

    public b() {
        this.a = Collections.EMPTY_LIST;
    }
}

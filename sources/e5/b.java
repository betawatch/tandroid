package e5;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b implements v4.f {
    public final /* synthetic */ int a = 0;
    public final List b;

    public b(ArrayList arrayList) {
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // v4.f
    public final int b(long j10) {
        switch (this.a) {
            case 0:
                if (j10 < 0) {
                }
                break;
            default:
                if (j10 < 0) {
                }
                break;
        }
        return -1;
    }

    @Override // v4.f
    public final long g(int i10) {
        switch (this.a) {
            case 0:
                h5.a.f(i10 == 0);
                break;
            default:
                h5.a.f(i10 == 0);
                break;
        }
        return 0L;
    }

    @Override // v4.f
    public final List m(long j10) {
        switch (this.a) {
            case 0:
                if (j10 < 0) {
                    break;
                } else {
                    break;
                }
            default:
                if (j10 < 0) {
                    break;
                } else {
                    break;
                }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // v4.f
    public final int p() {
        switch (this.a) {
        }
        return 1;
    }

    public b(List list) {
        this.b = list;
    }
}

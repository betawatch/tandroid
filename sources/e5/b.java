package e5;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements v4.f {
    public final /* synthetic */ int a;
    public final List b;

    public /* synthetic */ b(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    @Override // v4.f
    public final int d(long j10) {
        switch (this.a) {
            case 0:
                if (j10 < 0) {
                }
                break;
        }
        return -1;
    }

    @Override // v4.f
    public final long l(int i10) {
        switch (this.a) {
            case 0:
                h5.a.f(i10 == 0);
                break;
        }
        return 0L;
    }

    @Override // v4.f
    public final List q(long j10) {
        switch (this.a) {
            case 0:
                if (j10 < 0) {
                    break;
                } else {
                    break;
                }
        }
        return this.b;
    }

    @Override // v4.f
    public final int x() {
        switch (this.a) {
        }
        return 1;
    }

    public b(ArrayList arrayList) {
        this.a = 0;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }
}

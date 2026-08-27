package a5;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements r4.g {
    public final /* synthetic */ int a;
    public final List b;

    public /* synthetic */ b(int i10, List list) {
        this.a = i10;
        this.b = list;
    }

    @Override // r4.g
    public final int c(long j10) {
        switch (this.a) {
            case 0:
                if (j10 < 0) {
                }
                break;
            case 1:
                if (j10 < 0) {
                }
                break;
        }
        return -1;
    }

    @Override // r4.g
    public final long f(int i10) {
        switch (this.a) {
            case 0:
                d5.a.f(i10 == 0);
                break;
            case 1:
                d5.a.f(i10 == 0);
                break;
        }
        return 0L;
    }

    @Override // r4.g
    public final List h(long j10) {
        switch (this.a) {
            case 0:
                return j10 >= 0 ? this.b : Collections.EMPTY_LIST;
            case 1:
                return j10 >= 0 ? this.b : Collections.EMPTY_LIST;
            default:
                return this.b;
        }
    }

    @Override // r4.g
    public final int p() {
        switch (this.a) {
        }
        return 1;
    }

    public b(ArrayList arrayList) {
        this.a = 0;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }
}

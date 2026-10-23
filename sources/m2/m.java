package m2;

import b2.w;
import e2.m0;
import e9.n0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public abstract class m {
    public final w a;
    public final n0 b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final j h;

    public m(w wVar, List list, s sVar, List list2, List list3, List list4) {
        u6.g(!list.isEmpty());
        this.a = wVar;
        this.b = n0.u(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = list4;
        this.h = sVar.a(this);
        long j10 = sVar.c;
        long j11 = sVar.b;
        String str = m0.a;
        this.c = m0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.i c();

    public abstract j h();
}

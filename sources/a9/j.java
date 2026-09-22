package a9;

import com.google.android.gms.internal.play_billing.s1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class j extends k {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ k e;

    public j(k kVar, int i10, int i11) {
        this.e = kVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s1.a(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // a9.h
    public final int n() {
        return this.e.o() + this.c + this.d;
    }

    @Override // a9.h
    public final int o() {
        return this.e.o() + this.c;
    }

    @Override // a9.h
    public final Object[] p() {
        return this.e.p();
    }

    @Override // a9.k, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final k subList(int i10, int i11) {
        s1.b(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}

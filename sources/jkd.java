// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jkd extends yhd {
    public final transient skd c;
    public final transient mkd d;

    public jkd(skd skdVar, mkd mkdVar) {
        this.c = skdVar;
        this.d = mkdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // ogd
    public final int h(Object[] objArr) {
        return this.d.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // yhd, ogd
    public final fhd k() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.h;
    }
}

package c8;

import java.io.Serializable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class f extends a8.g implements Serializable {
    public final Object b;
    public final a8.f c;

    public f(Object obj, a8.f fVar) {
        super(1, false);
        this.b = obj;
        this.c = fVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

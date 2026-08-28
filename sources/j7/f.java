package j7;

import java.io.Serializable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends h7.f implements Serializable {
    public final Object b;
    public final h7.e c;

    public f(Object obj, h7.e eVar) {
        super(1, false);
        this.b = obj;
        this.c = eVar;
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

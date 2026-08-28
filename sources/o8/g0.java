package o8;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g0 implements n8.i, Serializable {
    public final int a;

    public g0() {
        l.a(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // n8.i
    public final Object get() {
        return new ArrayList(this.a);
    }
}

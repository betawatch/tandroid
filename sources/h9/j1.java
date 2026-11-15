package h9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class j1 implements g9.t, Serializable {
    public final int a;

    public j1() {
        o.g(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // g9.t
    public final Object get() {
        return new ArrayList(this.a);
    }
}

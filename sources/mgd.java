// default package

import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mgd extends n3 implements Serializable {
    public final Object b;
    public final m3 c;

    public mgd(Object obj, m3 m3Var) {
        super((byte) 1, false);
        this.b = obj;
        this.c = m3Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // n3, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}

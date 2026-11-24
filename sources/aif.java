// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class aif extends f7d {
    public final transient Object[] e;

    public aif(Object[] objArr) {
        super((byte) 5);
        this.e = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[RETURN] */
    @Override // f7d, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.e;
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
                if (obj2 != null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }
}

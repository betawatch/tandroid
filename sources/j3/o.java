package j3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements p8.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // p8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return (j) this.b;
            case 1:
                return (d5.u) this.b;
            case 2:
                return (l) this.b;
            case 3:
                return Boolean.valueOf(((q0) this.b).K);
            default:
                try {
                    return (l4.b0) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}

package j$.util.function;

/* loaded from: classes2.dex */
public final /* synthetic */ class x0 implements Supplier {
    public final /* synthetic */ java.util.function.Supplier a;

    private /* synthetic */ x0(java.util.function.Supplier supplier) {
        this.a = supplier;
    }

    public static /* synthetic */ Supplier a(java.util.function.Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof y0 ? ((y0) supplier).a : new x0(supplier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.function.Supplier supplier = this.a;
        if (obj instanceof x0) {
            obj = ((x0) obj).a;
        }
        return supplier.equals(obj);
    }

    @Override // j$.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}

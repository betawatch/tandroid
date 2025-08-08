package androidx.datastore.core;

/* loaded from: classes.dex */
final class Data extends State {
    private final int hashCode;
    private final Object value;

    public Data(Object obj, int i) {
        super(null);
        this.value = obj;
        this.hashCode = i;
    }

    public final Object getValue() {
        return this.value;
    }

    public final void checkHashCode() {
        Object obj = this.value;
        if (!((obj != null ? obj.hashCode() : 0) == this.hashCode)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }
}

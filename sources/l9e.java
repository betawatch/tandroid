// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class l9e extends v9c {
    public boolean b;
    public final /* synthetic */ Object c;

    public l9e(Object obj) {
        super((byte) 12);
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            lq5.n();
            return null;
        }
        this.b = true;
        return this.c;
    }
}

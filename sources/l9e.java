// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

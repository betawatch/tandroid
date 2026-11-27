// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class b54 extends c54 {
    public final nsb c;

    public b54(long j, nsb nsbVar) {
        super(j);
        this.c = nsbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // c54
    public final String toString() {
        return super.toString() + this.c;
    }
}

// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

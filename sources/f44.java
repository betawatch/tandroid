// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class f44 extends g44 {
    public final nob c;

    public f44(long j, nob nobVar) {
        super(j);
        this.c = nobVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // g44
    public final String toString() {
        return super.toString() + this.c;
    }
}

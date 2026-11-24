// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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

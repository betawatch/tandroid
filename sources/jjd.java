// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jjd implements Runnable {
    public final tod a;
    public final ymd b;

    public jjd(tod todVar, ymd ymdVar) {
        this.a = todVar;
        this.b = ymdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a == this) {
            ymd ymdVar = this.b;
            if (akd.h.f(this.a, this, tod.h(ymdVar))) {
                tod.j(this.a);
            }
        }
    }
}

// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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

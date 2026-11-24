// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h0b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u0b b;

    public /* synthetic */ h0b(u0b u0bVar, byte b) {
        this.a = b;
        this.b = u0bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        u0b u0bVar = this.b;
        switch (b) {
            case 0:
                u0bVar.n1.f();
                break;
            case 1:
                u0bVar.n1.f();
                break;
            case 2:
                u0bVar.dismiss();
                hq6.d0(u0bVar.a).h2(u0bVar.getContext(), u0bVar.M1, 1, u0bVar.F1, false, false);
                break;
            case 3:
                na7.q1(u0bVar.a).z3("stickers", u0bVar.F1, 1, null);
                break;
            default:
                u0bVar.dismiss();
                hq6.d0(u0bVar.a).h2(u0bVar.getContext(), u0bVar.M1, 1, u0bVar.F1, false, false);
                break;
        }
    }
}

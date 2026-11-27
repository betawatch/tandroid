// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f4b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s4b b;

    public /* synthetic */ f4b(s4b s4bVar, byte b) {
        this.a = b;
        this.b = s4bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s4b s4bVar = this.b;
        switch (b) {
            case 0:
                s4bVar.n1.f();
                break;
            case 1:
                s4bVar.n1.f();
                break;
            case 2:
                s4bVar.dismiss();
                ls6.d0(s4bVar.a).h2(s4bVar.getContext(), s4bVar.M1, 1, s4bVar.F1, false, false);
                break;
            case 3:
                uc7.s1(s4bVar.a).H3("stickers", s4bVar.F1, 1, null);
                break;
            default:
                s4bVar.dismiss();
                ls6.d0(s4bVar.a).h2(s4bVar.getContext(), s4bVar.M1, 1, s4bVar.F1, false, false);
                break;
        }
    }
}

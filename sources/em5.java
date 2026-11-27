// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class em5 extends yi6 {
    public final /* synthetic */ byte g;
    public final String h;
    public final String i;

    public /* synthetic */ em5(String str, String str2, byte b) {
        this.g = b;
        this.h = str;
        this.i = str2;
    }

    @Override // yi6
    public final void a(zpd zpdVar) {
        switch (this.g) {
            case 0:
                zpdVar.i(this);
                break;
            default:
                zpdVar.s(this);
                break;
        }
    }

    @Override // yi6
    public final String f() {
        byte b = this.g;
        String str = this.i;
        String str2 = this.h;
        switch (b) {
            case 0:
                return "destination=" + str2 + ", title=" + str;
            default:
                return "destination=" + str2 + ", title=" + str;
        }
    }
}

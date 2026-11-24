// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bk5 extends tg6 {
    public final /* synthetic */ byte g;
    public final String h;
    public final String i;

    public /* synthetic */ bk5(String str, String str2, byte b) {
        this.g = b;
        this.h = str;
        this.i = str2;
    }

    @Override // tg6
    public final void a(ild ildVar) {
        switch (this.g) {
            case 0:
                ildVar.i(this);
                break;
            default:
                ildVar.s(this);
                break;
        }
    }

    @Override // tg6
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

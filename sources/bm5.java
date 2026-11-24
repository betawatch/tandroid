// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bm5 extends ui6 {
    public final /* synthetic */ byte g;
    public final String h;
    public final String i;

    public /* synthetic */ bm5(String str, String str2, byte b) {
        this.g = b;
        this.h = str;
        this.i = str2;
    }

    @Override // ui6
    public final void a(knd kndVar) {
        switch (this.g) {
            case 0:
                kndVar.i(this);
                break;
            default:
                kndVar.s(this);
                break;
        }
    }

    @Override // ui6
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

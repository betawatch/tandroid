package ie;

import f7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends p {
    public final /* synthetic */ int g;
    public final String h;
    public final String i;

    public /* synthetic */ k(int i9, String str, String str2) {
        this.g = i9;
        this.h = str;
        this.i = str2;
    }

    @Override // ie.p
    public final void a(p8 p8Var) {
        switch (this.g) {
            case 0:
                p8Var.i(this);
                break;
            default:
                p8Var.s(this);
                break;
        }
    }

    @Override // ie.p
    public final String f() {
        switch (this.g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.i;
            default:
                return "destination=" + this.h + ", title=" + this.i;
        }
    }
}

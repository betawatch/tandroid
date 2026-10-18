package df;

import v7.x6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class k extends p {
    public final /* synthetic */ int g;
    public final String h;
    public final String i;

    public /* synthetic */ k(int i10, String str, String str2) {
        this.g = i10;
        this.h = str;
        this.i = str2;
    }

    @Override // df.p
    public final void a(x6 x6Var) {
        switch (this.g) {
            case 0:
                x6Var.i(this);
                break;
            default:
                x6Var.s(this);
                break;
        }
    }

    @Override // df.p
    public final String f() {
        switch (this.g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.i;
            default:
                return "destination=" + this.h + ", title=" + this.i;
        }
    }
}

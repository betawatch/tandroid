package kf;

import c8.b1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class k extends p {
    public final /* synthetic */ int g;
    public final String h;
    public final String i;

    public /* synthetic */ k(int i7, String str, String str2) {
        this.g = i7;
        this.h = str;
        this.i = str2;
    }

    @Override // kf.p
    public final void a(b1 b1Var) {
        switch (this.g) {
            case 0:
                b1Var.i(this);
                break;
            default:
                b1Var.s(this);
                break;
        }
    }

    @Override // kf.p
    public final String f() {
        switch (this.g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.i;
            default:
                return "destination=" + this.h + ", title=" + this.i;
        }
    }
}

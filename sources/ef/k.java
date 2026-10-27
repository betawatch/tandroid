package ef;

import a8.bc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    @Override // ef.p
    public final void a(bc bcVar) {
        switch (this.g) {
            case 0:
                bcVar.i(this);
                break;
            default:
                bcVar.s(this);
                break;
        }
    }

    @Override // ef.p
    public final String f() {
        switch (this.g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.i;
            default:
                return "destination=" + this.h + ", title=" + this.i;
        }
    }
}

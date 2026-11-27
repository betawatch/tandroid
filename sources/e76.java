// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class e76 extends y1 {
    public final c76 a;
    public boolean b;
    public int c;

    public e76(c76 c76Var) {
        this.a = c76Var;
    }

    @Override // y1
    public final boolean b(hk0 hk0Var) {
        if (!(hk0Var instanceof j76)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }

    @Override // y1
    public final hk0 e() {
        return this.a;
    }

    @Override // y1
    public final boolean f() {
        return true;
    }

    @Override // y1
    public final qk2 h(mp3 mp3Var) {
        if (mp3Var.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return qk2.a(mp3Var.b);
    }
}

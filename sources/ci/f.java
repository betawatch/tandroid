package ci;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class f extends dh.b {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, d6Var);
        this.n = 2;
    }

    @Override // dh.b, dh.a
    public int B() {
        switch (this.n) {
            case 2:
                if (b()) {
                    return 83886079;
                }
                return TLObject.FLAG_29;
            default:
                return super.B();
        }
    }

    @Override // dh.b, dh.a
    public int a() {
        switch (this.n) {
            case 2:
                return b() ? 117440511 : 285212672;
            default:
                return super.a();
        }
    }

    @Override // dh.b
    public boolean b() {
        switch (this.n) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override // dh.b, dh.a
    public int c() {
        switch (this.n) {
            case 2:
                if (b()) {
                    return 301989887;
                }
                return TLObject.FLAG_29;
            default:
                return super.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(org.telegram.ui.ActionBar.d6 d6Var, int i10, float f7, int i11) {
        super(d6Var, i10, f7);
        this.n = i11;
    }
}

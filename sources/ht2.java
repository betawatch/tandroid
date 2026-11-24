// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ht2 extends y11 {
    public final w11 G;

    public ht2(int i, w11 w11Var) {
        super(i);
        this.G = w11Var;
        if (w11Var != w11.a) {
            if (i >= 1) {
                return;
            }
            c1b.a(td4.o(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + h79.a(y11.class).b() + " instead").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(Object obj, boolean z) {
        w11 w11Var = this.G;
        w11 w11Var2 = w11.c;
        g7c g7cVar = g7c.a;
        if (w11Var == w11Var2) {
            Object d = super.d(obj);
            return (!(d instanceof nk1) || (d instanceof mk1)) ? d : g7cVar;
        }
        Object obj2 = a21.d;
        pk1 pk1Var = (pk1) fy.a.getObjectVolatile(this, y11.E);
        while (true) {
            long andIncrement = y11.b.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean r = r(andIncrement, false);
            int i = a21.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (pk1Var.d != j3) {
                pk1 i3 = i(j3, pk1Var);
                if (i3 != null) {
                    pk1Var = i3;
                } else if (r) {
                    return new mk1(n());
                }
            }
            int D = D(pk1Var, i2, obj, j, obj2, r);
            if (D == 0) {
                pk1Var.b();
                return g7cVar;
            }
            if (D == 1) {
                break;
            }
            if (D != 2) {
                if (D == 3) {
                    dq9.m("unexpected");
                    return null;
                }
                if (D == 4) {
                    if (j < m()) {
                        pk1Var.b();
                    }
                    return new mk1(n());
                }
                if (D == 5) {
                    pk1Var.b();
                }
            } else {
                if (r) {
                    pk1Var.i();
                    return new mk1(n());
                }
                amc amcVar = obj2 instanceof amc ? (amc) obj2 : null;
                if (amcVar != null) {
                    amcVar.a(pk1Var, i2 + i);
                }
                f((pk1Var.d * j2) + i2);
            }
        }
    }

    @Override // y11, x2a
    public final Object a(px2 px2Var, Object obj) {
        if (G(obj, true) instanceof mk1) {
            throw n();
        }
        return g7c.a;
    }

    @Override // y11, x2a
    public final Object d(Object obj) {
        return G(obj, false);
    }

    @Override // y11
    public final boolean u() {
        return this.G == w11.b;
    }
}

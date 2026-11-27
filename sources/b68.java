// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b68 implements mcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j68 b;
    public final /* synthetic */ m68 c;

    public /* synthetic */ b68(j68 j68Var, m68 m68Var, byte b) {
        this.a = b;
        this.b = j68Var;
        this.c = m68Var;
    }

    @Override // mcc
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        m68 m68Var = this.c;
        j68 j68Var = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                long currentTimeMillis = System.currentTimeMillis();
                o68 o68Var = j68Var.x;
                d30 d30Var = o68Var.w2;
                kcb kcbVar = (kcb) d30Var.c;
                if (kcbVar != null) {
                    kcbVar.firstFrameRendered = false;
                    d30Var.a = false;
                    kcbVar.setOnReadyListener(new z48(runnable, currentTimeMillis, (byte) 1));
                    ((ccb) o68Var.A1).g(false);
                    e29 e29Var = o68Var.j0;
                    if (e29Var != null) {
                        e29Var.setAnimation(m68Var.u);
                    }
                    if (o68Var.B2 > 0 && l.longValue() > o68Var.B2 - 1400) {
                        l = 0L;
                    }
                    o68Var.O0(l.longValue(), true);
                    o68Var.D3 = false;
                    hl.d3(runnable, 400L);
                    if (bool.booleanValue()) {
                        o68Var.c1(false);
                        break;
                    }
                } else {
                    ((ccb) o68Var.A1).g(false);
                    o68Var.setActive(true);
                    o68Var.D3 = false;
                    o68Var.S0 = new dt2(runnable, (byte) 6);
                    if (bool.booleanValue()) {
                        o68Var.c1(false);
                    }
                    hl.d3(runnable, 400L);
                    break;
                }
                break;
            default:
                Long l2 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                long currentTimeMillis2 = System.currentTimeMillis();
                o68 o68Var2 = j68Var.x;
                d30 d30Var2 = o68Var2.w2;
                kcb kcbVar2 = (kcb) d30Var2.c;
                if (kcbVar2 != null) {
                    kcbVar2.firstFrameRendered = false;
                    d30Var2.a = false;
                    kcbVar2.setOnReadyListener(new z48(runnable2, currentTimeMillis2, (byte) 2));
                    ((ccb) o68Var2.A1).g(false);
                    e29 e29Var2 = o68Var2.j0;
                    if (e29Var2 != null) {
                        e29Var2.setAnimation(m68Var.u);
                    }
                    if (o68Var2.B2 > 0 && l2.longValue() > o68Var2.B2 - 1400) {
                        l2 = 0L;
                    }
                    o68Var2.O0(l2.longValue(), true);
                    o68Var2.D3 = false;
                    hl.d3(runnable2, 400L);
                    if (bool2.booleanValue()) {
                        o68Var2.c1(false);
                        break;
                    }
                } else {
                    ((ccb) o68Var2.A1).g(false);
                    o68Var2.setActive(true);
                    o68Var2.D3 = false;
                    o68Var2.S0 = new dt2(runnable2, (byte) 7);
                    if (bool2.booleanValue()) {
                        o68Var2.c1(false);
                    }
                    hl.d3(runnable2, 400L);
                    break;
                }
                break;
        }
    }
}

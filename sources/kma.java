// default package

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kma implements nr5 {
    public final wj7 a = new wj7();
    public final z8d b = new z8d((byte) 7);
    public final k09 c = new k09(new jma(2, null), 6);

    public kma(String str) {
    }

    @Override // nr5
    public final Object a(n83 n83Var) {
        return new Integer(((AtomicInteger) this.b.b).incrementAndGet());
    }

    @Override // nr5
    public final Object b(zw2 zw2Var) {
        return new Integer(((AtomicInteger) this.b.b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r8 != r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r8 != r5) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kma] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [wj7] */
    @Override // nr5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ur4 ur4Var, zw2 zw2Var) {
        hma hmaVar;
        int i;
        Object obj;
        Object obj2;
        try {
            if (zw2Var instanceof hma) {
                hmaVar = (hma) zw2Var;
                int i2 = hmaVar.e;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    hmaVar.e = i2 - TLObject.FLAG_31;
                    Object obj3 = hmaVar.c;
                    i = hmaVar.e;
                    vx2 vx2Var = vx2.a;
                    if (i != 0) {
                        ixe.b(obj3);
                        hmaVar.a = ur4Var;
                        wj7 wj7Var = this.a;
                        hmaVar.b = wj7Var;
                        hmaVar.e = 1;
                        Object d = wj7Var.d(hmaVar);
                        obj = wj7Var;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                grb.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj4 = (uj7) hmaVar.a;
                            ixe.b(obj3);
                            obj2 = obj4;
                            return obj3;
                        }
                        Object obj5 = hmaVar.b;
                        ur4Var = (ur4) hmaVar.a;
                        ixe.b(obj3);
                        obj = obj5;
                    }
                    hmaVar.a = obj;
                    hmaVar.b = null;
                    hmaVar.e = 2;
                    obj3 = ur4Var.invoke(hmaVar);
                    obj2 = obj;
                }
            }
            if (i != 0) {
            }
            hmaVar.a = obj;
            hmaVar.b = null;
            hmaVar.e = 2;
            obj3 = ur4Var.invoke(hmaVar);
            obj2 = obj;
        } finally {
            ((wj7) this).f(null);
        }
        hmaVar = new hma(this, zw2Var);
        Object obj32 = hmaVar.c;
        i = hmaVar.e;
        vx2 vx2Var2 = vx2.a;
    }

    @Override // nr5
    public final mm4 d() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // nr5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(is4 is4Var, zw2 zw2Var) {
        ima imaVar;
        int i;
        wj7 wj7Var;
        boolean z;
        Throwable th;
        if (zw2Var instanceof ima) {
            imaVar = (ima) zw2Var;
            int i2 = imaVar.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                imaVar.e = i2 - TLObject.FLAG_31;
                Object obj = imaVar.c;
                i = imaVar.e;
                if (i != 0) {
                    ixe.b(obj);
                    wj7 wj7Var2 = this.a;
                    boolean e = wj7Var2.e();
                    try {
                        Object valueOf = Boolean.valueOf(e);
                        imaVar.a = wj7Var2;
                        imaVar.b = e;
                        imaVar.e = 1;
                        Object invoke = is4Var.invoke(valueOf, imaVar);
                        Object obj2 = vx2.a;
                        if (invoke == obj2) {
                            return obj2;
                        }
                        wj7Var = wj7Var2;
                        z = e;
                        obj = invoke;
                    } catch (Throwable th2) {
                        wj7Var = wj7Var2;
                        z = e;
                        th = th2;
                        if (z) {
                            wj7Var.f(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = imaVar.b;
                    wj7Var = imaVar.a;
                    try {
                        ixe.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    wj7Var.f(null);
                }
                return obj;
            }
        }
        imaVar = new ima(this, zw2Var);
        Object obj3 = imaVar.c;
        i = imaVar.e;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }
}

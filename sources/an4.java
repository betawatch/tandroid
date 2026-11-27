// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class an4 implements nm4 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final yfb d;

    public an4(nm4 nm4Var, mx2 mx2Var) {
        this.b = mx2Var;
        this.c = xhd.b(mx2Var);
        this.d = new ii1(nm4Var, null, (byte) 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r13 != r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    @Override // nm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, zw2 zw2Var) {
        zm4 zm4Var;
        Object obj2;
        int i;
        byte b = this.a;
        f9c f9cVar = f9c.a;
        vx2 vx2Var = vx2.a;
        yfb yfbVar = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                if (zw2Var instanceof zm4) {
                    zm4Var = (zm4) zw2Var;
                    int i2 = zm4Var.e;
                    if ((i2 & TLObject.FLAG_31) != 0) {
                        zm4Var.e = i2 - TLObject.FLAG_31;
                        obj2 = zm4Var.c;
                        i = zm4Var.e;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    obj = zm4Var.b;
                                    this = zm4Var.a;
                                    ixe.b(obj2);
                                } else if (i != 3) {
                                    grb.i("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                            ixe.b(obj2);
                            return f9cVar;
                        }
                        ixe.b(obj2);
                        if (!((m89) obj4).a) {
                            zm4Var.a = this;
                            zm4Var.b = obj;
                            zm4Var.e = 2;
                            obj2 = ((w73) yfbVar).invoke(obj, zm4Var);
                            break;
                        } else {
                            zm4Var.e = 1;
                            if (((nm4) obj3).c(obj, zm4Var) != vx2Var) {
                                return f9cVar;
                            }
                        }
                        return vx2Var;
                        if (!((Boolean) obj2).booleanValue()) {
                            return f9cVar;
                        }
                        ((m89) this.b).a = true;
                        nm4 nm4Var = (nm4) this.c;
                        zm4Var.a = null;
                        zm4Var.b = null;
                        zm4Var.e = 3;
                        if (nm4Var.c(obj, zm4Var) != vx2Var) {
                            return f9cVar;
                        }
                        return vx2Var;
                    }
                }
                zm4Var = new zm4(this, zw2Var);
                obj2 = zm4Var.c;
                i = zm4Var.e;
                if (i == 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            default:
                Object a = jvd.a((mx2) obj4, obj, obj3, (ii1) yfbVar, zw2Var);
                return a == vx2Var ? a : f9cVar;
        }
    }

    public an4(m89 m89Var, nm4 nm4Var, w73 w73Var) {
        this.b = m89Var;
        this.c = nm4Var;
        this.d = w73Var;
    }
}

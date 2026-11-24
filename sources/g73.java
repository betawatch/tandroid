// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class g73 implements ik4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g73(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    @Override // ik4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, fw2 fw2Var) {
        f73 f73Var;
        int i;
        Object g;
        byte b = this.a;
        g5c g5cVar = g5c.a;
        bx2 bx2Var = bx2.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (fw2Var instanceof f73) {
                    f73Var = (f73) fw2Var;
                    int i2 = f73Var.b;
                    if ((i2 & TLObject.FLAG_31) != 0) {
                        f73Var.b = i2 - TLObject.FLAG_31;
                        Object obj3 = f73Var.a;
                        i = f73Var.b;
                        if (i != 0) {
                            qse.b(obj3);
                            ik4 ik4Var = (ik4) obj2;
                            fwa fwaVar = (fwa) obj;
                            if (fwaVar instanceof l19) {
                                throw ((l19) fwaVar).b;
                            }
                            if (fwaVar instanceof s53) {
                                Object obj4 = ((s53) fwaVar).b;
                                f73Var.b = 1;
                                return ik4Var.c(obj4, f73Var) == bx2Var ? bx2Var : g5cVar;
                            }
                            if (!(fwaVar instanceof uf4 ? true : fwaVar instanceof o4c)) {
                                throw new gp2();
                            }
                            sc8.j("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        } else {
                            if (i == 1) {
                                qse.b(obj3);
                                return g5cVar;
                            }
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                }
                f73Var = new f73(this, fw2Var);
                Object obj32 = f73Var.a;
                i = f73Var.b;
                if (i != 0) {
                }
                return null;
            case 1:
                v73 v73Var = (v73) obj2;
                return ((v73Var.h.F() instanceof uf4) || (g = v73Var.g(true, fw2Var)) != bx2Var) ? g5cVar : g;
            default:
                w5a w5aVar = (w5a) obj;
                fga fgaVar = (fga) obj2;
                w5aVar.getClass();
                fgaVar.h = w5aVar;
                if (fgaVar.j) {
                    fgaVar.j = false;
                    fgaVar.b();
                }
                Object e = fgaVar.e(w5aVar.a.a, cga.a, fw2Var);
                return e == bx2Var ? e : g5cVar;
        }
    }
}

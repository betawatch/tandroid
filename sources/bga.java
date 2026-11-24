// default package

import android.util.Log;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bga extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ fga c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bga(fga fgaVar, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = fgaVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        fga fgaVar = this.c;
        switch (b) {
            case 0:
                return new bga(fgaVar, fw2Var, (byte) 0);
            default:
                return new bga(fgaVar, fw2Var, (byte) 1);
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ax2 ax2Var = (ax2) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
        }
        return ((bga) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [bx2, java.lang.Object] */
    @Override // of0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        byte b2 = 0;
        ?? r2 = 0;
        ?? r4 = bx2.a;
        fga fgaVar = this.c;
        fw2 fw2Var = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        qse.b(obj);
                        return g5cVar;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                lv6 lv6Var = new lv6(fgaVar.e.getData(), new aga(fgaVar, null), r2 == true ? 1 : 0, (byte) 29);
                g73 g73Var = new g73(fgaVar, (byte) 2);
                this.b = true;
                return lv6Var.h(g73Var, this) == r4 ? r4 : g5cVar;
            default:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        qse.b(obj);
                        v63 v63Var = fgaVar.e;
                        dga dgaVar = new dga(fgaVar, fw2Var, b2);
                        this.b = true;
                        if (v63Var.a(dgaVar, this) == r4) {
                            g5cVar = r4;
                        }
                    } else {
                        if (!z2) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qse.b(obj);
                    }
                    return g5cVar;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    w5a w5aVar = fgaVar.h;
                    if (w5aVar == null) {
                        rp5.e("localSessionData");
                        throw null;
                    }
                    fgaVar.d.getClass();
                    fgaVar.h = w5a.a(w5aVar, null, snb.a(), null, 5);
                    return g5cVar;
                }
        }
    }
}

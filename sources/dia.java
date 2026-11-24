// default package

import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dia extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ hia c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dia(hia hiaVar, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = hiaVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        hia hiaVar = this.c;
        switch (b) {
            case 0:
                return new dia(hiaVar, px2Var, (byte) 0);
            default:
                return new dia(hiaVar, px2Var, (byte) 1);
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ky2 ky2Var = (ky2) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
        }
        return ((dia) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = g7c.a;
        Object obj3 = ly2.a;
        hia hiaVar = this.c;
        px2 px2Var = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        tue.b(obj);
                        return obj2;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                lx6 lx6Var = new lx6(hiaVar.e.getData(), new cia(hiaVar, null), (byte) 29);
                s83 s83Var = new s83(hiaVar, (byte) 2);
                this.b = true;
                return lx6Var.g(s83Var, this) == obj3 ? obj3 : obj2;
            default:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        tue.b(obj);
                        h83 h83Var = hiaVar.e;
                        fia fiaVar = new fia(hiaVar, px2Var, (byte) 0);
                        this.b = true;
                        if (h83Var.a(fiaVar, this) == obj3) {
                            obj2 = obj3;
                        }
                    } else {
                        if (!z2) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tue.b(obj);
                    }
                    return obj2;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    y7a y7aVar = hiaVar.h;
                    if (y7aVar == null) {
                        rr5.e("localSessionData");
                        throw null;
                    }
                    hiaVar.d.getClass();
                    hiaVar.h = y7a.a(y7aVar, null, tpb.a(), null, 5);
                    return obj2;
                }
        }
    }
}

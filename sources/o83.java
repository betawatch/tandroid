// default package

import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o83 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o83(v7a v7aVar, px2 px2Var) {
        super(2, px2Var);
        this.a = (byte) 2;
        this.b = v7aVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        switch (this.a) {
            case 0:
                o83 o83Var = new o83(2, px2Var, (byte) 0);
                o83Var.b = obj;
                return o83Var;
            case 1:
                o83 o83Var2 = new o83(2, px2Var, (byte) 1);
                o83Var2.b = obj;
                return o83Var2;
            default:
                return new o83((v7a) this.b, px2Var);
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return ((o83) create((iya) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 1:
                ((o83) create((String) obj, (px2) obj2)).invokeSuspend(g7cVar);
                return g7cVar;
            default:
                return ((o83) create((v7a) obj, (px2) obj2)).invokeSuspend(g7cVar);
        }
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                tue.b(obj);
                return Boolean.valueOf(!(((iya) this.b) instanceof vh4));
            case 1:
                tue.b(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.b));
                return g7c.a;
            default:
                tue.b(obj);
                return (v7a) this.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o83(int i, px2 px2Var, byte b) {
        super(i, px2Var);
        this.a = b;
    }
}

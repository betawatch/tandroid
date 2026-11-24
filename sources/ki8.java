// default package

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ki8 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fs4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki8(fs4 fs4Var, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.d = fs4Var;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        fs4 fs4Var = this.d;
        switch (b) {
            case 0:
                ki8 ki8Var = new ki8(fs4Var, px2Var, (byte) 0);
                ki8Var.c = obj;
                return ki8Var;
            default:
                ki8 ki8Var2 = new ki8(fs4Var, px2Var, (byte) 1);
                ki8Var2.c = obj;
                return ki8Var2;
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        lj7 lj7Var = (lj7) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
        }
        return ((ki8) create(lj7Var, px2Var)).invokeSuspend(g7cVar);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        fs4 fs4Var = this.d;
        ly2 ly2Var = ly2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    tue.b(obj);
                    lj7 lj7Var = (lj7) this.c;
                    this.b = true;
                    obj = fs4Var.invoke(lj7Var, this);
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (!z) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                lj7 lj7Var2 = (lj7) obj;
                lj7Var2.getClass();
                ((AtomicBoolean) lj7Var2.b.b).set(true);
                return lj7Var2;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    tue.b(obj);
                    lj7 lj7Var3 = new lj7(new LinkedHashMap(((lj7) this.c).a()), false);
                    this.c = lj7Var3;
                    this.b = true;
                    return fs4Var.invoke(lj7Var3, this) == ly2Var ? ly2Var : lj7Var3;
                }
                if (!z2) {
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lj7 lj7Var4 = (lj7) this.c;
                tue.b(obj);
                return lj7Var4;
        }
    }
}

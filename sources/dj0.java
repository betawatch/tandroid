// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dj0 {
    public Context a;

    public dj0(Context context) {
        this.a = context.getApplicationContext();
    }

    public final c53 a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        c53 c53Var = new c53();
        c53Var.a = zo3.a(h9d.a);
        pj4 pj4Var = new pj4((Object) context, (byte) 8);
        c53Var.b = pj4Var;
        c53Var.c = zo3.a(new wk4((Object) pj4Var, (Object) new i13(pj4Var, (byte) 0), (byte) 11));
        pj4 pj4Var2 = c53Var.b;
        c53Var.d = new g29((Object) pj4Var2, (byte) 7);
        lt8 a = zo3.a(new sk4(c53Var.d, zo3.a(new i13(pj4Var2, (byte) 1)), (byte) 21));
        c53Var.e = a;
        i2f i2fVar = new i2f((byte) 25);
        pj4 pj4Var3 = c53Var.b;
        vk9 vk9Var = new vk9((Object) pj4Var3, (Object) a, (Object) i2fVar, (byte) 2);
        lt8 lt8Var = c53Var.a;
        lt8 lt8Var2 = c53Var.c;
        gl2 gl2Var = new gl2(lt8Var, lt8Var2, vk9Var, a, a, (byte) 5);
        eq2 eq2Var = new eq2();
        eq2Var.a = pj4Var3;
        eq2Var.b = lt8Var2;
        eq2Var.c = a;
        eq2Var.d = vk9Var;
        eq2Var.e = lt8Var;
        eq2Var.f = a;
        eq2Var.h = a;
        c53Var.f = zo3.a(new vk9((Object) gl2Var, (Object) eq2Var, (Object) new c5a(lt8Var, a, vk9Var, a, (byte) 19), (byte) 9));
        return c53Var;
    }
}

// default package

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n63 {
    public Context a;

    public final o63 a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        o63 o63Var = new o63();
        o63Var.a = jq3.a(jbd.a);
        mq5 mq5Var = new mq5(context);
        o63Var.b = mq5Var;
        o63Var.c = jq3.a(new wm4((Object) mq5Var, (Object) new u23(mq5Var, (byte) 0), (byte) 11));
        mq5 mq5Var2 = o63Var.b;
        o63Var.d = new et8((Object) mq5Var2, (byte) 8);
        mv8 a = jq3.a(new mj4(o63Var.d, jq3.a(new u23(mq5Var2, (byte) 1)), (byte) 23));
        o63Var.e = a;
        k4f k4fVar = new k4f((byte) 25);
        mq5 mq5Var3 = o63Var.b;
        wm9 wm9Var = new wm9((Object) mq5Var3, (Object) a, (Object) k4fVar, (byte) 2);
        mv8 mv8Var = o63Var.a;
        mv8 mv8Var2 = o63Var.c;
        sm2 sm2Var = new sm2(mv8Var, mv8Var2, wm9Var, a, a, (byte) 6);
        pr2 pr2Var = new pr2();
        pr2Var.a = mq5Var3;
        pr2Var.b = mv8Var2;
        pr2Var.c = a;
        pr2Var.d = wm9Var;
        pr2Var.e = mv8Var;
        pr2Var.f = a;
        pr2Var.h = a;
        o63Var.f = jq3.a(new wm9((Object) sm2Var, (Object) pr2Var, (Object) new xvc(mv8Var, a, wm9Var, a, (byte) 19), (byte) 9));
        return o63Var;
    }

    public final PackageInfo b(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }
}

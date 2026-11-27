// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class h3d {
    public static final h3d b;
    public di4 a;

    static {
        h3d h3dVar = new h3d();
        h3dVar.a = null;
        b = h3dVar;
    }

    public static di4 a(Context context) {
        di4 di4Var;
        h3d h3dVar = b;
        synchronized (h3dVar) {
            di4Var = h3dVar.a;
            if (di4Var == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                di4Var = new di4(context);
                h3dVar.a = di4Var;
            }
        }
        return di4Var;
    }
}

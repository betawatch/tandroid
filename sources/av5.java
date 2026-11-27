// default package

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class av5 {
    public static final /* synthetic */ gx5[] d;
    public final String a;
    public final ThreadLocal b;
    public final xj8 c;

    static {
        hw8 hw8Var = new hw8(s91.NO_RECEIVER, av5.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        s89.a.getClass();
        d = new gx5[]{hw8Var};
    }

    public av5(Context context, String str) {
        xj8 xj8Var;
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        final byte b = 0;
        byte b2 = 3;
        j09 j09Var = new j09(new ur4(this) { // from class: xu5
            public final /* synthetic */ av5 b;

            {
                this.b = this;
            }

            @Override // ur4
            public final Object invoke(Object obj) {
                byte b3 = b;
                av5 av5Var = this.b;
                switch (b3) {
                    case 0:
                        zx2 zx2Var = (zx2) obj;
                        zx2Var.getClass();
                        Log.w(s89.a(av5.class).b(), "CorruptionException in " + av5Var.a + " DataStore running in process " + Process.myPid(), zx2Var);
                        return new sj7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = av5Var.a;
                        LinkedHashSet linkedHashSet = qja.a;
                        linkedHashSet.getClass();
                        return tl2.a(new oja(context2, str2, rja.a, new w73(linkedHashSet, null, (byte) 3), new pja(3, null)));
                }
            }
        }, b2);
        final byte b3 = 1;
        ur4 ur4Var = new ur4(this) { // from class: xu5
            public final /* synthetic */ av5 b;

            {
                this.b = this;
            }

            @Override // ur4
            public final Object invoke(Object obj) {
                byte b32 = b3;
                av5 av5Var = this.b;
                switch (b32) {
                    case 0:
                        zx2 zx2Var = (zx2) obj;
                        zx2Var.getClass();
                        Log.w(s89.a(av5.class).b(), "CorruptionException in " + av5Var.a + " DataStore running in process " + Process.myPid(), zx2Var);
                        return new sj7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = av5Var.a;
                        LinkedHashSet linkedHashSet = qja.a;
                        linkedHashSet.getClass();
                        return tl2.a(new oja(context2, str2, rja.a, new w73(linkedHashSet, null, (byte) 3), new pja(3, null)));
                }
            }
        };
        qc3 qc3Var = bp3.a;
        qb3 qb3Var = qb3.c;
        lfb lfbVar = new lfb();
        qb3Var.getClass();
        xw2 a = xde.a(azd.c(qb3Var, lfbVar));
        j26 j26Var = new j26(str, j09Var, ur4Var, a);
        d[0].getClass();
        xj8 xj8Var2 = (xj8) j26Var.c;
        if (xj8Var2 == null) {
            synchronized (j26Var.b) {
                if (((xj8) j26Var.c) == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    List list = (List) ur4Var.invoke(applicationContext);
                    yj8 yj8Var = new yj8((byte) 0, applicationContext, j26Var);
                    j26Var.c = new xj8(new xj8(new o83(new bd4(uif.d, zc4.c, new ad4(yj8Var, (byte) 2)), tl2.a(new ii1(list, null, b2)), j09Var, a)));
                }
                xj8Var = (xj8) j26Var.c;
                xj8Var.getClass();
            }
            xj8Var2 = xj8Var;
        }
        this.c = xj8Var2;
    }

    public final void a(ur4 ur4Var) {
    }

    public final Object b(zj8 zj8Var, Long l) {
        zj8Var.getClass();
        return ytd.a(new yu5(this, zj8Var, l, null, (byte) 0));
    }
}

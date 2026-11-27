// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ljf extends zhf {
    private static final Map zzb = new ConcurrentHashMap();
    protected slf zzc;
    private int zzd;

    public ljf() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = slf.e;
    }

    public static tjf b(tjf tjfVar) {
        int size = tjfVar.size();
        return tjfVar.zzg(size == 0 ? 10 : size << 1);
    }

    public static Object c(Method method, ljf ljfVar, Object... objArr) {
        try {
            return method.invoke(ljfVar, objArr);
        } catch (IllegalAccessException e) {
            grb.j("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            grb.j("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void e(Class cls, ljf ljfVar) {
        ljfVar.d();
        zzb.put(cls, ljfVar);
    }

    public static ljf k(Class cls) {
        Map map = zzb;
        ljf ljfVar = (ljf) map.get(cls);
        if (ljfVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ljfVar = (ljf) map.get(cls);
            } catch (ClassNotFoundException e) {
                su3.f("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (ljfVar != null) {
            return ljfVar;
        }
        try {
            ljf ljfVar2 = (ljf) ((ljf) wlf.a.allocateInstance(cls)).h(6, null);
            if (ljfVar2 != null) {
                map.put(cls, ljfVar2);
                return ljfVar2;
            }
            grb.g();
            return null;
        } catch (InstantiationException e2) {
            vr9.l(e2);
            return null;
        }
    }

    @Override // zhf
    public final int a(jlf jlfVar) {
        if (g()) {
            int d = jlfVar.d(this);
            if (d >= 0) {
                return d;
            }
            grb.i(uh9.k(d, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int d2 = jlfVar.d(this);
        if (d2 >= 0) {
            this.zzd = (this.zzd & TLObject.FLAG_31) | d2;
            return d2;
        }
        grb.i(uh9.k(d2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void d() {
        this.zzd &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return glf.c.a(getClass()).b(this, (ljf) obj);
    }

    public final void f() {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean g() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    public abstract Object h(int i, ljf ljfVar);

    public final int hashCode() {
        if (g()) {
            return glf.c.a(getClass()).e(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int e = glf.c.a(getClass()).e(this);
        this.zza = e;
        return e;
    }

    public final int i() {
        if (g()) {
            int d = glf.c.a(getClass()).d(this);
            if (d >= 0) {
                return d;
            }
            grb.i(uh9.k(d, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int d2 = glf.c.a(getClass()).d(this);
        if (d2 >= 0) {
            this.zzd = (this.zzd & TLObject.FLAG_31) | d2;
            return d2;
        }
        grb.i(uh9.k(d2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final kjf j() {
        return (kjf) h(5, null);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = ukf.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        ukf.c(this, sb, 0);
        return sb.toString();
    }
}

// default package

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class f4e extends utd {
    private static final Map zzb = new ConcurrentHashMap();
    protected jge zzc;
    private int zzd;

    public f4e() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = jge.f;
    }

    public static final boolean c(f4e f4eVar, boolean z) {
        byte byteValue = ((Byte) f4eVar.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = kce.c.a(f4eVar.getClass()).e(f4eVar);
        if (z) {
            f4eVar.d(2);
        }
        return e;
    }

    public static f4e h(Class cls) {
        Map map = zzb;
        f4e f4eVar = (f4e) map.get(cls);
        if (f4eVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                f4eVar = (f4e) map.get(cls);
            } catch (ClassNotFoundException e) {
                wa3.h("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (f4eVar != null) {
            return f4eVar;
        }
        try {
            f4e f4eVar2 = (f4e) ((f4e) ohe.a.allocateInstance(cls)).d(6);
            if (f4eVar2 != null) {
                map.put(cls, f4eVar2);
                return f4eVar2;
            }
            rjb.h();
            return null;
        } catch (InstantiationException e2) {
            dq9.o(e2);
            return null;
        }
    }

    public static Object i(Method method, f4e f4eVar, Object... objArr) {
        try {
            return method.invoke(f4eVar, objArr);
        } catch (IllegalAccessException e) {
            rjb.k("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            rjb.k("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void k(Class cls, f4e f4eVar) {
        f4eVar.j();
        zzb.put(cls, f4eVar);
    }

    @Override // utd
    public final int b(cde cdeVar) {
        if (m()) {
            int f = cdeVar.f(this);
            if (f >= 0) {
                return f;
            }
            dq9.m(hg9.j(f, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f2 = cdeVar.f(this);
        if (f2 >= 0) {
            this.zzd = (this.zzd & TLObject.FLAG_31) | f2;
            return f2;
        }
        dq9.m(hg9.j(f2, "serialized size must be non-negative, was "));
        return 0;
    }

    public abstract Object d(int i);

    public final int e() {
        if (m()) {
            int f = kce.c.a(getClass()).f(this);
            if (f >= 0) {
                return f;
            }
            dq9.m(hg9.j(f, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f2 = kce.c.a(getClass()).f(this);
        if (f2 >= 0) {
            this.zzd = (this.zzd & TLObject.FLAG_31) | f2;
            return f2;
        }
        dq9.m(hg9.j(f2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kce.c.a(getClass()).b(this, (f4e) obj);
    }

    public final h2e f() {
        return (h2e) d(5);
    }

    public final h2e g() {
        h2e h2eVar = (h2e) d(5);
        if (!h2eVar.a.equals(this)) {
            if (!h2eVar.b.m()) {
                f4e f4eVar = (f4e) h2eVar.a.d(4);
                kce.c.a(f4eVar.getClass()).zzg(f4eVar, h2eVar.b);
                h2eVar.b = f4eVar;
            }
            f4e f4eVar2 = h2eVar.b;
            kce.c.a(f4eVar2.getClass()).zzg(f4eVar2, this);
        }
        return h2eVar;
    }

    public final int hashCode() {
        if (m()) {
            return kce.c.a(getClass()).c(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int c = kce.c.a(getClass()).c(this);
        this.zza = c;
        return c;
    }

    public final void j() {
        this.zzd &= ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final void l() {
        this.zzd = (this.zzd & TLObject.FLAG_31) | ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    public final boolean m() {
        return (this.zzd & TLObject.FLAG_31) != 0;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = hbe.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        hbe.c(this, sb, 0);
        return sb.toString();
    }
}

// default package

import java.lang.reflect.Field;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class gud {
    public Object A;
    public final ng5 a;
    public final Object[] b;
    public final Class c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int[] m;
    public int n;
    public int o;
    public int p = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public int q = TLObject.FLAG_31;
    public int r = 0;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public Field x;
    public Object y;
    public Object z;

    public gud(Class cls, String str, Object[] objArr) {
        this.c = cls;
        ng5 ng5Var = new ng5(str, (byte) 4);
        this.a = ng5Var;
        this.b = objArr;
        this.d = ng5Var.b();
        int b = ng5Var.b();
        this.e = b;
        if (b == 0) {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.k = 0;
            this.j = 0;
            this.l = 0;
            this.m = null;
            return;
        }
        int b2 = ng5Var.b();
        this.f = b2;
        int b3 = ng5Var.b();
        this.g = ng5Var.b();
        this.h = ng5Var.b();
        this.k = ng5Var.b();
        this.j = ng5Var.b();
        this.i = ng5Var.b();
        this.l = ng5Var.b();
        int b4 = ng5Var.b();
        this.m = b4 != 0 ? new int[b4] : null;
        this.n = (b2 << 1) + b3;
    }

    public static Field b(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            wn4.j(b00.j(sb, " not found. Known fields are ", arrays));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
    
        if ((r8.t & 2048) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        if ((r1 & 1) == 1) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        ng5 ng5Var = this.a;
        if (ng5Var.b >= ng5Var.c.length()) {
            return false;
        }
        this.s = ng5Var.b();
        int b = ng5Var.b();
        this.t = b;
        int i = b & kk7.d4;
        this.u = i;
        int i2 = this.s;
        if (i2 < this.p) {
            this.p = i2;
        }
        if (i2 > this.q) {
            this.q = i2;
        }
        phd phdVar = phd.s;
        byte b2 = phdVar.a;
        if (i != b2 && i >= phd.e.a) {
            byte b3 = phd.r.a;
        }
        this.r++;
        Class cls = gvd.a;
        if ((b & 1024) != 0) {
            int i3 = this.o;
            this.o = i3 + 1;
            this.m[i3] = i2;
        }
        this.y = null;
        this.z = null;
        this.A = null;
        int i4 = this.d;
        if (i > b2) {
            this.v = ng5Var.b();
            int i5 = this.u;
            if (i5 != phd.b.a + 51 && i5 != phd.d.a + 51) {
                if (i5 != phd.c.a + 51 || (i4 & 1) != 1) {
                    return true;
                }
                this.z = c();
            }
            this.y = c();
            return true;
        }
        this.x = b(this.c, (String) c());
        if ((i4 & 1) == 1 && this.u <= phd.d.a) {
            this.w = ng5Var.b();
        }
        int i6 = this.u;
        if (i6 == phd.b.a || i6 == phd.d.a) {
            this.y = this.x.getType();
            return true;
        }
        if (i6 != phd.f.a && i6 != phd.r.a) {
            if (i6 != phd.c.a && i6 != phd.h.a && i6 != phd.n.a) {
                if (i6 == phdVar.a) {
                    this.A = c();
                }
                return true;
            }
            this.z = c();
        }
        this.y = c();
        return true;
        return true;
    }

    public final Object c() {
        int i = this.n;
        this.n = i + 1;
        return this.b[i];
    }
}

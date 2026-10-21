package m4;

import android.os.Bundle;
import android.text.TextUtils;
import e9.x1;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class d {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final o1 a;
    public final int b;
    public final int c;
    public final Bundle d;
    public final i9.a e;
    public final boolean f;
    public final Object g;

    static {
        String str = e2.m0.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        m = Integer.toString(8, 36);
        n = Integer.toString(9, 36);
    }

    public d(o1 o1Var, int i10, int i11, Bundle bundle, boolean z10, i9.a aVar, Object obj) {
        this.a = o1Var;
        this.b = i10;
        this.c = i11;
        this.d = new Bundle(bundle);
        this.f = z10;
        this.e = aVar;
        this.g = obj;
    }

    public static Object a(int i10, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i10) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                u6.f("Parameter has incorrect type.", obj instanceof Long);
                break;
            case 2:
                u6.f("Parameter has incorrect type.", obj instanceof Integer);
                break;
            case 3:
                u6.f("Parameter has incorrect type.", obj instanceof Boolean);
                break;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                u6.f("Parameter has incorrect type.", obj instanceof Float);
                break;
            case 5:
                u6.f("Parameter has incorrect type.", obj instanceof b2.g1);
                break;
            case 6:
                u6.f("Parameter has incorrect type.", obj instanceof b2.o0);
                break;
            case 7:
                u6.f("Parameter has incorrect type.", obj instanceof b2.r0);
                break;
            case 8:
                u6.f("Parameter has incorrect type.", obj instanceof b2.t1);
                break;
        }
        return obj;
    }

    public static boolean c(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((d) list.get(i11)).e.b(0) == i10) {
                return true;
            }
        }
        return false;
    }

    public static d d(o1 o1Var) {
        String str = o1Var.b;
        Bundle bundle = o1Var.c;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(39));
            Object h10 = h(i(parseInt), bundle);
            c cVar = new c();
            u6.f("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", ((o1) cVar.d) == null);
            cVar.a = parseInt;
            cVar.g = a(i(parseInt), h10);
            return cVar.a();
        }
        int parseInt2 = Integer.parseInt(str.substring(40));
        Object h11 = h(parseInt2 == 40010 ? 5 : 0, bundle);
        c cVar2 = new c();
        o1 o1Var2 = new o1(parseInt2);
        u6.f("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", cVar2.a == -1);
        cVar2.d = o1Var2;
        cVar2.g = a(o1Var2.a == 40010 ? 5 : 0, h11);
        return cVar2.a();
    }

    public static x1 g(List list) {
        int b10;
        if (list.isEmpty()) {
            e9.l0 l0Var = e9.n0.b;
            return x1.e;
        }
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            d dVar = (d) list.get(i12);
            boolean z10 = dVar.f;
            i9.a aVar = dVar.e;
            if (z10 && dVar.b()) {
                int i13 = 0;
                while (true) {
                    if (i13 < aVar.b && (b10 = aVar.b(i13)) != 6) {
                        if (i10 == -1 && b10 == 2) {
                            i10 = i12;
                            break;
                        }
                        if (i11 == -1 && b10 == 3) {
                            i11 = i12;
                            break;
                        }
                        i13++;
                    }
                }
            }
        }
        e9.k0 t10 = e9.n0.t();
        if (i10 != -1) {
            t10.c(((d) list.get(i10)).e(2));
        }
        if (i11 != -1) {
            t10.c(((d) list.get(i11)).e(3));
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            d dVar2 = (d) list.get(i14);
            if (dVar2.f && dVar2.b() && i14 != i10 && i14 != i11 && dVar2.e.a(6)) {
                t10.c(dVar2.e(6));
            }
        }
        return t10.f();
    }

    public static Object h(int i10, Bundle bundle) {
        if (!bundle.containsKey("androidx.media3.session.CUSTOM_COMMAND_PARAMETER")) {
            return null;
        }
        switch (i10) {
            case 1:
                return Long.valueOf(bundle.getLong("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 2:
                return Integer.valueOf(bundle.getInt("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 3:
                return Boolean.valueOf(bundle.getBoolean("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 4:
                return Float.valueOf(bundle.getFloat("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 5:
                Bundle bundle2 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle2.getClass();
                return b2.g1.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle3.getClass();
                return b2.o0.a(9, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle4.getClass();
                return b2.r0.b(9, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle5.getClass();
                return b2.t1.b(bundle5);
            default:
                return null;
        }
    }

    public static int i(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 5) {
            return 1;
        }
        if (i10 == 10) {
            return 2;
        }
        if (i10 == 19) {
            return 7;
        }
        if (i10 == 24) {
            return 4;
        }
        if (i10 == 29) {
            return 8;
        }
        if (i10 == 31) {
            return 6;
        }
        switch (i10) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean j(String str) {
        return str.startsWith("androidx.media3.session.PLAYER_COMMAND_") || str.startsWith("androidx.media3.session.SESSION_COMMAND_");
    }

    public final boolean b() {
        Object obj = this.g;
        o1 o1Var = this.a;
        if (o1Var != null) {
            int i10 = o1Var.a;
            if (i10 != 0) {
                return i10 == 40010 && obj != null;
            }
            return true;
        }
        int i11 = this.b;
        if (i11 != 19) {
            if (i11 != 24) {
                if (i11 != 29 && i11 != 31) {
                    switch (i11) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return obj != null;
    }

    public final d e(int i10) {
        String str;
        o1 o1Var = this.a;
        if (o1Var != null && o1Var.a == 0) {
            i9.a aVar = new i9.a(new int[]{i10});
            if (this.e.equals(aVar)) {
                return this;
            }
            return new d(this.a, this.b, this.c, new Bundle(this.d), this.f, aVar, this.g);
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.g != null) {
            bundle = new Bundle();
            l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", 9, bundle);
        }
        if (o1Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + o1Var.a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.b;
        }
        return new d(new o1(str, bundle), -1, this.c, this.d, this.f, new i9.a(new int[]{i10}), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && TextUtils.equals("", "") && this.f == dVar.f && this.e.equals(dVar.e) && Objects.equals(this.g, dVar.g);
    }

    public final void f(b2.f1 f1Var) {
        if (this.f) {
            Object obj = this.g;
            int i10 = this.b;
            if (i10 == 19) {
                if (obj != null) {
                    f1Var.B((b2.r0) obj);
                    return;
                }
                return;
            }
            if (i10 == 24) {
                if (obj != null) {
                    f1Var.U(((Float) obj).floatValue());
                    return;
                } else if (f1Var.F() == 0.0f) {
                    f1Var.c0();
                    return;
                } else {
                    f1Var.B0();
                    return;
                }
            }
            if (i10 == 29) {
                if (obj != null) {
                    f1Var.p((b2.t1) obj);
                    return;
                }
                return;
            }
            if (i10 == 31) {
                if (obj != null) {
                    f1Var.r0((b2.o0) obj);
                    return;
                }
                return;
            }
            switch (i10) {
                case 1:
                    if (obj == null) {
                        f1Var.X(!f1Var.t());
                        break;
                    } else {
                        f1Var.X(((Boolean) obj).booleanValue());
                        break;
                    }
                case 2:
                    f1Var.b();
                    break;
                case 3:
                    f1Var.stop();
                    break;
                case 4:
                    f1Var.G();
                    break;
                case 5:
                    if (obj != null) {
                        f1Var.g(((Long) obj).longValue());
                        break;
                    }
                    break;
                case 6:
                    f1Var.E();
                    break;
                case 7:
                    f1Var.V();
                    break;
                case 8:
                    f1Var.f0();
                    break;
                case 9:
                    f1Var.H0();
                    break;
                case 10:
                    if (obj != null) {
                        f1Var.Y(((Integer) obj).intValue());
                        break;
                    }
                    break;
                case 11:
                    f1Var.J0();
                    break;
                case 12:
                    f1Var.I0();
                    break;
                case 13:
                    if (obj != null) {
                        f1Var.a(((Float) obj).floatValue());
                        break;
                    }
                    break;
                case 14:
                    if (obj == null) {
                        f1Var.w(!f1Var.D0());
                        break;
                    } else {
                        f1Var.w(((Boolean) obj).booleanValue());
                        break;
                    }
                case 15:
                    if (obj != null) {
                        f1Var.j(((Integer) obj).intValue());
                        break;
                    }
                    break;
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), 0, Integer.valueOf(this.c), "", Boolean.valueOf(this.f), null, this.e, this.g);
    }

    public final Bundle k(int i10) {
        Bundle bundle = new Bundle();
        o1 o1Var = this.a;
        if (o1Var != null) {
            bundle.putBundle(h, o1Var.a());
        }
        int i11 = this.b;
        if (i11 != -1) {
            bundle.putInt(i, i11);
        }
        int i12 = this.c;
        if (i12 != 0) {
            bundle.putInt(j, i12);
        }
        Bundle bundle2 = this.d;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(k, bundle2);
        }
        boolean z10 = this.f;
        if (!z10) {
            bundle.putBoolean(l, z10);
        }
        i9.a aVar = this.e;
        if (aVar.b != 1 || aVar.b(0) != 6) {
            bundle.putIntArray(m, Arrays.copyOfRange(aVar.a, 0, aVar.b));
        }
        if (this.g != null) {
            l(n, i10, bundle);
        }
        return bundle;
    }

    public final void l(String str, int i10, Bundle bundle) {
        o1 o1Var = this.a;
        int i11 = o1Var != null ? o1Var.a == 40010 ? 5 : 0 : i(this.b);
        Object obj = this.g;
        switch (i11) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                break;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((b2.g1) obj).c());
                break;
            case 6:
                bundle.putBundle(str, ((b2.o0) obj).c(i10, false));
                break;
            case 7:
                bundle.putBundle(str, ((b2.r0) obj).c(i10));
                break;
            case 8:
                bundle.putBundle(str, ((b2.t1) obj).c());
                break;
        }
    }
}

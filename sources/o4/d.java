package o4;

import android.os.Bundle;
import android.text.TextUtils;
import b8.zb;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final n1 a;
    public final int b;
    public final int c;
    public final Bundle d;
    public final k9.a e;
    public final boolean f;
    public final Object g;

    static {
        String str = g2.n0.a;
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

    public d(n1 n1Var, int i3, int i10, Bundle bundle, boolean z10, k9.a aVar, Object obj) {
        this.a = n1Var;
        this.b = i3;
        this.c = i10;
        this.d = new Bundle(bundle);
        this.f = z10;
        this.e = aVar;
        this.g = obj;
    }

    public static Object a(int i3, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i3) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                zb.e("Parameter has incorrect type.", obj instanceof Long);
                break;
            case 2:
                zb.e("Parameter has incorrect type.", obj instanceof Integer);
                break;
            case 3:
                zb.e("Parameter has incorrect type.", obj instanceof Boolean);
                break;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                zb.e("Parameter has incorrect type.", obj instanceof Float);
                break;
            case 5:
                zb.e("Parameter has incorrect type.", obj instanceof d2.f1);
                break;
            case 6:
                zb.e("Parameter has incorrect type.", obj instanceof d2.n0);
                break;
            case 7:
                zb.e("Parameter has incorrect type.", obj instanceof d2.q0);
                break;
            case 8:
                zb.e("Parameter has incorrect type.", obj instanceof d2.s1);
                break;
        }
        return obj;
    }

    public static boolean c(int i3, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((d) list.get(i10)).e.b(0) == i3) {
                return true;
            }
        }
        return false;
    }

    public static d d(n1 n1Var) {
        String str = n1Var.b;
        Bundle bundle = n1Var.c;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(39));
            Object h7 = h(i(parseInt), bundle);
            c cVar = new c();
            zb.e("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", ((n1) cVar.d) == null);
            cVar.a = parseInt;
            cVar.g = a(i(parseInt), h7);
            return cVar.a();
        }
        int parseInt2 = Integer.parseInt(str.substring(40));
        Object h10 = h(parseInt2 == 40010 ? 5 : 0, bundle);
        c cVar2 = new c();
        n1 n1Var2 = new n1(parseInt2);
        zb.e("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", cVar2.a == -1);
        cVar2.d = n1Var2;
        cVar2.g = a(n1Var2.a == 40010 ? 5 : 0, h10);
        return cVar2.a();
    }

    public static g9.s1 g(List list) {
        int b10;
        if (list.isEmpty()) {
            g9.g0 g0Var = g9.i0.b;
            return g9.s1.e;
        }
        int i3 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = (d) list.get(i11);
            boolean z10 = dVar.f;
            k9.a aVar = dVar.e;
            if (z10 && dVar.b()) {
                int i12 = 0;
                while (true) {
                    if (i12 < aVar.b && (b10 = aVar.b(i12)) != 6) {
                        if (i3 == -1 && b10 == 2) {
                            i3 = i11;
                            break;
                        }
                        if (i10 == -1 && b10 == 3) {
                            i10 = i11;
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        g9.f0 p10 = g9.i0.p();
        if (i3 != -1) {
            p10.c(((d) list.get(i3)).e(2));
        }
        if (i10 != -1) {
            p10.c(((d) list.get(i10)).e(3));
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            d dVar2 = (d) list.get(i13);
            if (dVar2.f && dVar2.b() && i13 != i3 && i13 != i10 && dVar2.e.a(6)) {
                p10.c(dVar2.e(6));
            }
        }
        return p10.f();
    }

    public static Object h(int i3, Bundle bundle) {
        if (!bundle.containsKey("androidx.media3.session.CUSTOM_COMMAND_PARAMETER")) {
            return null;
        }
        switch (i3) {
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
                return d2.f1.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle3.getClass();
                return d2.n0.a(9, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle4.getClass();
                return d2.q0.b(9, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle5.getClass();
                return d2.s1.b(bundle5);
            default:
                return null;
        }
    }

    public static int i(int i3) {
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 5) {
            return 1;
        }
        if (i3 == 10) {
            return 2;
        }
        if (i3 == 19) {
            return 7;
        }
        if (i3 == 24) {
            return 4;
        }
        if (i3 == 29) {
            return 8;
        }
        if (i3 == 31) {
            return 6;
        }
        switch (i3) {
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
        n1 n1Var = this.a;
        if (n1Var != null) {
            int i3 = n1Var.a;
            if (i3 != 0) {
                return i3 == 40010 && obj != null;
            }
            return true;
        }
        int i10 = this.b;
        if (i10 != 19) {
            if (i10 != 24) {
                if (i10 != 29 && i10 != 31) {
                    switch (i10) {
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

    public final d e(int i3) {
        String str;
        n1 n1Var = this.a;
        if (n1Var != null && n1Var.a == 0) {
            k9.a aVar = new k9.a(new int[]{i3});
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
        if (n1Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + n1Var.a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.b;
        }
        return new d(new n1(str, bundle), -1, this.c, this.d, this.f, new k9.a(new int[]{i3}), null);
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

    public final void f(d2.e1 e1Var) {
        if (this.f) {
            Object obj = this.g;
            int i3 = this.b;
            if (i3 == 19) {
                if (obj != null) {
                    e1Var.l((d2.q0) obj);
                    return;
                }
                return;
            }
            if (i3 == 24) {
                if (obj != null) {
                    e1Var.R(((Float) obj).floatValue());
                    return;
                } else if (e1Var.E() == 0.0f) {
                    e1Var.a0();
                    return;
                } else {
                    e1Var.C0();
                    return;
                }
            }
            if (i3 == 29) {
                if (obj != null) {
                    e1Var.g0((d2.s1) obj);
                    return;
                }
                return;
            }
            if (i3 == 31) {
                if (obj != null) {
                    e1Var.v0((d2.n0) obj);
                    return;
                }
                return;
            }
            switch (i3) {
                case 1:
                    if (obj == null) {
                        e1Var.V(!e1Var.u());
                        break;
                    } else {
                        e1Var.V(((Boolean) obj).booleanValue());
                        break;
                    }
                case 2:
                    e1Var.a();
                    break;
                case 3:
                    e1Var.stop();
                    break;
                case 4:
                    e1Var.F();
                    break;
                case 5:
                    if (obj != null) {
                        e1Var.f(((Long) obj).longValue());
                        break;
                    }
                    break;
                case 6:
                    e1Var.D();
                    break;
                case 7:
                    e1Var.S();
                    break;
                case 8:
                    e1Var.d0();
                    break;
                case 9:
                    e1Var.I0();
                    break;
                case 10:
                    if (obj != null) {
                        e1Var.W(((Integer) obj).intValue());
                        break;
                    }
                    break;
                case 11:
                    e1Var.K0();
                    break;
                case 12:
                    e1Var.J0();
                    break;
                case 13:
                    if (obj != null) {
                        e1Var.b(((Float) obj).floatValue());
                        break;
                    }
                    break;
                case 14:
                    if (obj == null) {
                        e1Var.x(!e1Var.E0());
                        break;
                    } else {
                        e1Var.x(((Boolean) obj).booleanValue());
                        break;
                    }
                case 15:
                    if (obj != null) {
                        e1Var.k(((Integer) obj).intValue());
                        break;
                    }
                    break;
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), 0, Integer.valueOf(this.c), "", Boolean.valueOf(this.f), null, this.e, this.g);
    }

    public final Bundle k(int i3) {
        Bundle bundle = new Bundle();
        n1 n1Var = this.a;
        if (n1Var != null) {
            bundle.putBundle(h, n1Var.a());
        }
        int i10 = this.b;
        if (i10 != -1) {
            bundle.putInt(i, i10);
        }
        int i11 = this.c;
        if (i11 != 0) {
            bundle.putInt(j, i11);
        }
        Bundle bundle2 = this.d;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(k, bundle2);
        }
        boolean z10 = this.f;
        if (!z10) {
            bundle.putBoolean(l, z10);
        }
        k9.a aVar = this.e;
        if (aVar.b != 1 || aVar.b(0) != 6) {
            bundle.putIntArray(m, Arrays.copyOfRange(aVar.a, 0, aVar.b));
        }
        if (this.g != null) {
            l(n, i3, bundle);
        }
        return bundle;
    }

    public final void l(String str, int i3, Bundle bundle) {
        n1 n1Var = this.a;
        int i10 = n1Var != null ? n1Var.a == 40010 ? 5 : 0 : i(this.b);
        Object obj = this.g;
        switch (i10) {
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
                bundle.putBundle(str, ((d2.f1) obj).c());
                break;
            case 6:
                bundle.putBundle(str, ((d2.n0) obj).c(i3, false));
                break;
            case 7:
                bundle.putBundle(str, ((d2.q0) obj).c(i3));
                break;
            case 8:
                bundle.putBundle(str, ((d2.s1) obj).c());
                break;
        }
    }
}

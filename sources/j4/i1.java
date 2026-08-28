package j4;

import java.util.Arrays;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i1 implements h3.g {
    public static final String f;
    public static final String h;
    public static final i3.i n;
    public final int a;
    public final String b;
    public final int c;
    public final h3.t0[] d;
    public int e;

    static {
        int i9 = d5.f0.a;
        f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        n = new i3.i(9);
    }

    public i1(String str, h3.t0... t0VarArr) {
        d5.a.f(t0VarArr.length > 0);
        this.b = str;
        this.d = t0VarArr;
        this.a = t0VarArr.length;
        int g10 = d5.q.g(t0VarArr[0].B);
        this.c = g10 == -1 ? d5.q.g(t0VarArr[0].A) : g10;
        String str2 = t0VarArr[0].c;
        str2 = (str2 == null || str2.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str2;
        int i9 = t0VarArr[0].e | 16384;
        for (int i10 = 1; i10 < t0VarArr.length; i10++) {
            String str3 = t0VarArr[i10].c;
            if (!str2.equals((str3 == null || str3.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str3)) {
                b("languages", i10, t0VarArr[0].c, t0VarArr[i10].c);
                return;
            } else {
                if (i9 != (t0VarArr[i10].e | 16384)) {
                    b("role flags", i10, Integer.toBinaryString(t0VarArr[0].e), Integer.toBinaryString(t0VarArr[i10].e));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i9, String str2, String str3) {
        StringBuilder q10 = j3.r0.q("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        q10.append(str3);
        q10.append("' (track ");
        q10.append(i9);
        q10.append(")");
        d5.a.p("TrackGroup", "", new IllegalStateException(q10.toString()));
    }

    public final int a(h3.t0 t0Var) {
        int i9 = 0;
        while (true) {
            h3.t0[] t0VarArr = this.d;
            if (i9 >= t0VarArr.length) {
                return -1;
            }
            if (t0Var == t0VarArr[i9]) {
                return i9;
            }
            i9++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i1.class == obj.getClass()) {
            i1 i1Var = (i1) obj;
            if (this.b.equals(i1Var.b) && Arrays.equals(this.d, i1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = j3.r0.f(527, 31, this.b) + Arrays.hashCode(this.d);
        }
        return this.e;
    }
}

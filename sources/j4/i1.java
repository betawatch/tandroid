package j4;

import java.util.Arrays;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i1 implements h3.g {
    public static final String f;
    public static final String h;
    public static final ia.l n;
    public final int a;
    public final String b;
    public final int c;
    public final h3.t0[] d;
    public int e;

    static {
        int i10 = d5.g0.a;
        f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        n = new ia.l(8);
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
        int i10 = t0VarArr[0].e | 16384;
        for (int i11 = 1; i11 < t0VarArr.length; i11++) {
            String str3 = t0VarArr[i11].c;
            if (!str2.equals((str3 == null || str3.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str3)) {
                b("languages", i11, t0VarArr[0].c, t0VarArr[i11].c);
                return;
            } else {
                if (i10 != (t0VarArr[i11].e | 16384)) {
                    b("role flags", i11, Integer.toBinaryString(t0VarArr[0].e), Integer.toBinaryString(t0VarArr[i11].e));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder p6 = i0.a.p("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        p6.append(str3);
        p6.append("' (track ");
        p6.append(i10);
        p6.append(")");
        d5.a.p("TrackGroup", "", new IllegalStateException(p6.toString()));
    }

    public final int a(h3.t0 t0Var) {
        int i10 = 0;
        while (true) {
            h3.t0[] t0VarArr = this.d;
            if (i10 >= t0VarArr.length) {
                return -1;
            }
            if (t0Var == t0VarArr[i10]) {
                return i10;
            }
            i10++;
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
            this.e = i0.a.g(527, 31, this.b) + Arrays.hashCode(this.d);
        }
        return this.e;
    }
}

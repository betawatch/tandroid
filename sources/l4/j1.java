package l4;

import java.util.Arrays;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j1 implements j3.g {
    public static final String f;
    public static final String h;
    public static final k3.d n;
    public final int a;
    public final String b;
    public final int c;
    public final j3.t0[] d;
    public int e;

    static {
        int i10 = f5.d0.a;
        f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        n = new k3.d(18);
    }

    public j1(String str, j3.t0... t0VarArr) {
        f5.a.f(t0VarArr.length > 0);
        this.b = str;
        this.d = t0VarArr;
        this.a = t0VarArr.length;
        int g10 = f5.o.g(t0VarArr[0].B);
        this.c = g10 == -1 ? f5.o.g(t0VarArr[0].A) : g10;
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
        StringBuilder k9 = th.k("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        k9.append(str3);
        k9.append("' (track ");
        k9.append(i10);
        k9.append(")");
        f5.a.p("TrackGroup", "", new IllegalStateException(k9.toString()));
    }

    public final int a(j3.t0 t0Var) {
        int i10 = 0;
        while (true) {
            j3.t0[] t0VarArr = this.d;
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
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.b.equals(j1Var.b) && Arrays.equals(this.d, j1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = j7.l1.f(527, 31, this.b) + Arrays.hashCode(this.d);
        }
        return this.e;
    }
}

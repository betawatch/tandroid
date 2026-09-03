package o4;

import java.util.Arrays;
import mh.c3;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s0 implements j3.g {
    public static final String f;
    public static final String h;
    public static final c3 n;
    public final int a;
    public final String b;
    public final int c;
    public final j3.n0[] d;
    public int e;

    static {
        int i10 = h5.d0.a;
        f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        n = new c3(4);
    }

    public s0(String str, j3.n0... n0VarArr) {
        h5.a.f(n0VarArr.length > 0);
        this.b = str;
        this.d = n0VarArr;
        this.a = n0VarArr.length;
        int g10 = h5.o.g(n0VarArr[0].C);
        this.c = g10 == -1 ? h5.o.g(n0VarArr[0].B) : g10;
        String str2 = n0VarArr[0].c;
        str2 = (str2 == null || str2.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str2;
        int i10 = n0VarArr[0].e | 16384;
        for (int i11 = 1; i11 < n0VarArr.length; i11++) {
            String str3 = n0VarArr[i11].c;
            if (!str2.equals((str3 == null || str3.equals(TranslateController.UNKNOWN_LANGUAGE)) ? "" : str3)) {
                b("languages", i11, n0VarArr[0].c, n0VarArr[i11].c);
                return;
            } else {
                if (i10 != (n0VarArr[i11].e | 16384)) {
                    b("role flags", i11, Integer.toBinaryString(n0VarArr[0].e), Integer.toBinaryString(n0VarArr[i11].e));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder m9 = yh.m("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        m9.append(str3);
        m9.append("' (track ");
        m9.append(i10);
        m9.append(")");
        h5.a.p("TrackGroup", "", new IllegalStateException(m9.toString()));
    }

    public final int a(j3.n0 n0Var) {
        int i10 = 0;
        while (true) {
            j3.n0[] n0VarArr = this.d;
            if (i10 >= n0VarArr.length) {
                return -1;
            }
            if (n0Var == n0VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass()) {
            s0 s0Var = (s0) obj;
            if (this.b.equals(s0Var.b) && Arrays.equals(this.d, s0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = l.d.e(527, 31, this.b) + Arrays.hashCode(this.d);
        }
        return this.e;
    }
}

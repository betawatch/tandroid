package f2;

import android.text.TextUtils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u1 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static u1 b(String str) {
        char c10;
        d5.a.f(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < split.length; i13++) {
            String b10 = g7.b0.b(split[i13].trim());
            b10.getClass();
            switch (b10.hashCode()) {
                case 100571:
                    if (b10.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (b10.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (b10.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (b10.equals("style")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = i13;
                    break;
                case 1:
                    i11 = i13;
                    break;
                case 2:
                    i9 = i13;
                    break;
                case 3:
                    i12 = i13;
                    break;
            }
        }
        if (i9 == -1 || i10 == -1 || i11 == -1) {
            return null;
        }
        int length = split.length;
        u1 u1Var = new u1();
        u1Var.a = i9;
        u1Var.b = i10;
        u1Var.c = i12;
        u1Var.d = i11;
        u1Var.e = length;
        return u1Var;
    }

    public boolean a() {
        int i9 = this.a;
        int i10 = 2;
        if ((i9 & 7) != 0) {
            int i11 = this.d;
            int i12 = this.b;
            if (((i11 > i12 ? 1 : i11 == i12 ? 2 : 4) & i9) == 0) {
                return false;
            }
        }
        if ((i9 & 112) != 0) {
            int i13 = this.d;
            int i14 = this.c;
            if ((((i13 > i14 ? 1 : i13 == i14 ? 2 : 4) << 4) & i9) == 0) {
                return false;
            }
        }
        if ((i9 & 1792) != 0) {
            int i15 = this.e;
            int i16 = this.b;
            if ((((i15 > i16 ? 1 : i15 == i16 ? 2 : 4) << 8) & i9) == 0) {
                return false;
            }
        }
        if ((i9 & 28672) != 0) {
            int i17 = this.e;
            int i18 = this.c;
            if (i17 > i18) {
                i10 = 1;
            } else if (i17 != i18) {
                i10 = 4;
            }
            if ((i9 & (i10 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}

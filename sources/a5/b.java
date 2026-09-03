package a5;

import android.text.TextUtils;
import k7.a7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b b(String str) {
        char c3;
        h5.a.f(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String b10 = a7.b(split[i14].trim());
            b10.getClass();
            switch (b10.hashCode()) {
                case 100571:
                    if (b10.equals("end")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3556653:
                    if (b10.equals("text")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109757538:
                    if (b10.equals("start")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109780401:
                    if (b10.equals("style")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i12 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i13 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i12 == -1) {
            return null;
        }
        int length = split.length;
        b bVar = new b();
        bVar.a = i10;
        bVar.b = i11;
        bVar.c = i13;
        bVar.d = i12;
        bVar.e = length;
        return bVar;
    }

    public boolean a() {
        int i10 = this.a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.d;
            int i13 = this.b;
            if (((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.d;
            int i15 = this.c;
            if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.e;
            int i17 = this.b;
            if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.e;
            int i19 = this.c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}

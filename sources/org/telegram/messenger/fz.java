package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class fz {
    public char a;
    public String b;
    public int c;
    public int d;

    public static void c(char c2) {
        throw new RuntimeException("Unexpected char '" + c2 + "'.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ee, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
    
        if (r14 == false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[LOOP:6: B:115:0x0042->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0143 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002e A[LOOP:1: B:28:0x002e->B:34:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c7 A[PHI: r4
      0x00c7: PHI (r4v2 boolean) = (r4v1 boolean), (r4v0 boolean) binds: [B:109:0x00c0, B:88:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a() {
        boolean z10;
        int i3;
        int i10;
        int i11;
        boolean z11;
        char b10;
        char c2;
        char b11;
        char b12;
        int i12;
        int i13;
        char charAt;
        d();
        char c10 = this.a;
        int i14 = 0;
        boolean z12 = true;
        if (c10 == '+') {
            z10 = true;
        } else if (c10 != '-') {
            z10 = true;
            float f10 = 0.0f;
            switch (this.a) {
                case '.':
                    i3 = 0;
                    i10 = 0;
                    i11 = 0;
                    z11 = false;
                    if (this.a == '.') {
                        char b13 = b();
                        this.a = b13;
                        switch (b13) {
                            case '0':
                                if (i3 == 0) {
                                    while (true) {
                                        char b14 = b();
                                        this.a = b14;
                                        i10--;
                                        switch (b14) {
                                        }
                                    }
                                }
                                break;
                            case '1':
                            case '2':
                            case hs.o0 /* 51 */:
                            case hs.p0 /* 52 */:
                            case hs.q0 /* 53 */:
                            case hs.r0 /* 54 */:
                            case hs.s0 /* 55 */:
                            case hs.t0 /* 56 */:
                            case hs.u0 /* 57 */:
                                while (true) {
                                    if (i3 < 9) {
                                        i3++;
                                        i10--;
                                        i11 = (this.a - '0') + (i11 * 10);
                                    }
                                    char b15 = b();
                                    this.a = b15;
                                    switch (b15) {
                                    }
                                }
                                break;
                            default:
                                if (!z11) {
                                    c(b13);
                                    throw null;
                                }
                                break;
                        }
                    }
                    c2 = this.a;
                    if (c2 != 'E' || c2 == 'e') {
                        b11 = b();
                        this.a = b11;
                        if (b11 != '+') {
                            if (b11 != '-') {
                                switch (b11) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case hs.o0 /* 51 */:
                                    case hs.p0 /* 52 */:
                                    case hs.q0 /* 53 */:
                                    case hs.r0 /* 54 */:
                                    case hs.s0 /* 55 */:
                                    case hs.t0 /* 56 */:
                                    case hs.u0 /* 57 */:
                                        switch (this.a) {
                                            case '0':
                                                while (true) {
                                                    char b16 = b();
                                                    this.a = b16;
                                                    switch (b16) {
                                                    }
                                                }
                                                break;
                                            case '1':
                                            case '2':
                                            case hs.o0 /* 51 */:
                                            case hs.p0 /* 52 */:
                                            case hs.q0 /* 53 */:
                                            case hs.r0 /* 54 */:
                                            case hs.s0 /* 55 */:
                                            case hs.t0 /* 56 */:
                                            case hs.u0 /* 57 */:
                                                int i15 = 0;
                                                while (true) {
                                                    if (i14 < 3) {
                                                        i14++;
                                                        i15 = (this.a - '0') + (i15 * 10);
                                                    }
                                                    char b17 = b();
                                                    this.a = b17;
                                                    switch (b17) {
                                                    }
                                                }
                                                break;
                                        }
                                    default:
                                        c(b11);
                                        throw null;
                                }
                            } else {
                                z12 = false;
                            }
                        }
                        b12 = b();
                        this.a = b12;
                        switch (b12) {
                            case '0':
                            case '1':
                            case '2':
                            case hs.o0 /* 51 */:
                            case hs.p0 /* 52 */:
                            case hs.q0 /* 53 */:
                            case hs.r0 /* 54 */:
                            case hs.s0 /* 55 */:
                            case hs.t0 /* 56 */:
                            case hs.u0 /* 57 */:
                                break;
                            default:
                                c(b12);
                                throw null;
                        }
                    }
                    if (!z12) {
                        i14 = -i14;
                    }
                    i12 = i14 + i10;
                    if (!z10) {
                        i11 = -i11;
                    }
                    if (i12 >= -125 && i11 != 0) {
                        if (i12 < 128) {
                            f10 = i11 > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
                        } else if (i12 == 0) {
                            f10 = i11;
                        } else {
                            if (i11 >= 67108864) {
                                i11++;
                            }
                            double d = i11;
                            double[] dArr = kz.a;
                            f10 = (float) (i12 > 0 ? d * dArr[i12] : d / dArr[-i12]);
                        }
                    }
                    while (true) {
                        i13 = this.c;
                        if (i13 < this.d && ((charAt = this.b.charAt(i13)) == '\t' || charAt == '\n' || charAt == ' ' || charAt == ',')) {
                            this.a = b();
                        }
                    }
                    return f10;
                case '/':
                default:
                    f10 = Float.NaN;
                    while (true) {
                        i13 = this.c;
                        if (i13 < this.d) {
                            break;
                        }
                        this.a = b();
                    }
                    return f10;
                case '0':
                    while (true) {
                        char b18 = b();
                        this.a = b18;
                        if (b18 != '.' && b18 != 'E' && b18 != 'e') {
                            switch (b18) {
                                case '0':
                                case '1':
                                case '2':
                                case hs.o0 /* 51 */:
                                case hs.p0 /* 52 */:
                                case hs.q0 /* 53 */:
                                case hs.r0 /* 54 */:
                                case hs.s0 /* 55 */:
                                case hs.t0 /* 56 */:
                                case hs.u0 /* 57 */:
                                    break;
                                default:
                                    while (true) {
                                        i13 = this.c;
                                        if (i13 < this.d) {
                                        }
                                        this.a = b();
                                    }
                                    return f10;
                            }
                        }
                    }
                    i3 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        if (i3 >= 9) {
                            i3++;
                            i11 = (i11 * 10) + (this.a - '0');
                        } else {
                            i10++;
                        }
                        b10 = b();
                        this.a = b10;
                        switch (b10) {
                        }
                        z11 = true;
                        if (this.a == '.') {
                        }
                        c2 = this.a;
                        if (c2 != 'E') {
                        }
                        b11 = b();
                        this.a = b11;
                        if (b11 != '+') {
                        }
                        b12 = b();
                        this.a = b12;
                        switch (b12) {
                        }
                        if (!z12) {
                        }
                        i12 = i14 + i10;
                        if (!z10) {
                        }
                        if (i12 >= -125) {
                            if (i12 < 128) {
                            }
                        }
                        while (true) {
                            i13 = this.c;
                            if (i13 < this.d) {
                            }
                            this.a = b();
                        }
                        return f10;
                    }
                    break;
                case '1':
                case '2':
                case hs.o0 /* 51 */:
                case hs.p0 /* 52 */:
                case hs.q0 /* 53 */:
                case hs.r0 /* 54 */:
                case hs.s0 /* 55 */:
                case hs.t0 /* 56 */:
                case hs.u0 /* 57 */:
                    i3 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        if (i3 >= 9) {
                        }
                        b10 = b();
                        this.a = b10;
                        switch (b10) {
                        }
                        z11 = true;
                        if (this.a == '.') {
                        }
                        c2 = this.a;
                        if (c2 != 'E') {
                        }
                        b11 = b();
                        this.a = b11;
                        if (b11 != '+') {
                        }
                        b12 = b();
                        this.a = b12;
                        switch (b12) {
                        }
                        if (!z12) {
                        }
                        i12 = i14 + i10;
                        if (!z10) {
                        }
                        if (i12 >= -125) {
                        }
                        while (true) {
                            i13 = this.c;
                            if (i13 < this.d) {
                            }
                            this.a = b();
                        }
                        return f10;
                        break;
                    }
                    break;
            }
        } else {
            z10 = false;
        }
        this.a = b();
        float f102 = 0.0f;
        switch (this.a) {
        }
    }

    public final char b() {
        int i3 = this.c;
        int i10 = this.d;
        if (i3 < i10) {
            this.c = i3 + 1;
        }
        int i11 = this.c;
        if (i11 == i10) {
            return (char) 0;
        }
        return this.b.charAt(i11);
    }

    public final void d() {
        while (true) {
            int i3 = this.c;
            if (i3 >= this.d || !Character.isWhitespace(this.b.charAt(i3))) {
                return;
            } else {
                this.a = b();
            }
        }
    }
}

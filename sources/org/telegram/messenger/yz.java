package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class yz {
    public char a;
    public String b;
    public int c;
    public int d;

    public static void c(char c10) {
        throw new RuntimeException("Unexpected char '" + c10 + "'.");
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
        int i10;
        int i11;
        int i12;
        boolean z11;
        char b10;
        char c10;
        char b11;
        char b12;
        int i13;
        int i14;
        char charAt;
        d();
        char c11 = this.a;
        int i15 = 0;
        boolean z12 = true;
        if (c11 == '+') {
            z10 = true;
        } else if (c11 != '-') {
            z10 = true;
            float f7 = 0.0f;
            switch (this.a) {
                case '.':
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    z11 = false;
                    if (this.a == '.') {
                        char b13 = b();
                        this.a = b13;
                        switch (b13) {
                            case '0':
                                if (i10 == 0) {
                                    while (true) {
                                        char b14 = b();
                                        this.a = b14;
                                        i11--;
                                        switch (b14) {
                                        }
                                    }
                                }
                                break;
                            case '1':
                            case '2':
                            case zs.o0 /* 51 */:
                            case zs.p0 /* 52 */:
                            case zs.q0 /* 53 */:
                            case zs.r0 /* 54 */:
                            case zs.s0 /* 55 */:
                            case zs.t0 /* 56 */:
                            case zs.u0 /* 57 */:
                                while (true) {
                                    if (i10 < 9) {
                                        i10++;
                                        i11--;
                                        i12 = (this.a - '0') + (i12 * 10);
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
                    c10 = this.a;
                    if (c10 != 'E' || c10 == 'e') {
                        b11 = b();
                        this.a = b11;
                        if (b11 != '+') {
                            if (b11 != '-') {
                                switch (b11) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case zs.o0 /* 51 */:
                                    case zs.p0 /* 52 */:
                                    case zs.q0 /* 53 */:
                                    case zs.r0 /* 54 */:
                                    case zs.s0 /* 55 */:
                                    case zs.t0 /* 56 */:
                                    case zs.u0 /* 57 */:
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
                                            case zs.o0 /* 51 */:
                                            case zs.p0 /* 52 */:
                                            case zs.q0 /* 53 */:
                                            case zs.r0 /* 54 */:
                                            case zs.s0 /* 55 */:
                                            case zs.t0 /* 56 */:
                                            case zs.u0 /* 57 */:
                                                int i16 = 0;
                                                while (true) {
                                                    if (i15 < 3) {
                                                        i15++;
                                                        i16 = (this.a - '0') + (i16 * 10);
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
                            case zs.o0 /* 51 */:
                            case zs.p0 /* 52 */:
                            case zs.q0 /* 53 */:
                            case zs.r0 /* 54 */:
                            case zs.s0 /* 55 */:
                            case zs.t0 /* 56 */:
                            case zs.u0 /* 57 */:
                                break;
                            default:
                                c(b12);
                                throw null;
                        }
                    }
                    if (!z12) {
                        i15 = -i15;
                    }
                    i13 = i15 + i11;
                    if (!z10) {
                        i12 = -i12;
                    }
                    if (i13 >= -125 && i12 != 0) {
                        if (i13 < 128) {
                            f7 = i12 > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
                        } else if (i13 == 0) {
                            f7 = i12;
                        } else {
                            if (i12 >= 67108864) {
                                i12++;
                            }
                            double d = i12;
                            double[] dArr = d00.a;
                            f7 = (float) (i13 > 0 ? d * dArr[i13] : d / dArr[-i13]);
                        }
                    }
                    while (true) {
                        i14 = this.c;
                        if (i14 < this.d && ((charAt = this.b.charAt(i14)) == '\t' || charAt == '\n' || charAt == ' ' || charAt == ',')) {
                            this.a = b();
                        }
                    }
                    return f7;
                case '/':
                default:
                    f7 = Float.NaN;
                    while (true) {
                        i14 = this.c;
                        if (i14 < this.d) {
                            break;
                        }
                        this.a = b();
                    }
                    return f7;
                case '0':
                    while (true) {
                        char b18 = b();
                        this.a = b18;
                        if (b18 != '.' && b18 != 'E' && b18 != 'e') {
                            switch (b18) {
                                case '0':
                                case '1':
                                case '2':
                                case zs.o0 /* 51 */:
                                case zs.p0 /* 52 */:
                                case zs.q0 /* 53 */:
                                case zs.r0 /* 54 */:
                                case zs.s0 /* 55 */:
                                case zs.t0 /* 56 */:
                                case zs.u0 /* 57 */:
                                    break;
                                default:
                                    while (true) {
                                        i14 = this.c;
                                        if (i14 < this.d) {
                                        }
                                        this.a = b();
                                    }
                                    return f7;
                            }
                        }
                    }
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    while (true) {
                        if (i10 >= 9) {
                            i10++;
                            i12 = (i12 * 10) + (this.a - '0');
                        } else {
                            i11++;
                        }
                        b10 = b();
                        this.a = b10;
                        switch (b10) {
                        }
                        z11 = true;
                        if (this.a == '.') {
                        }
                        c10 = this.a;
                        if (c10 != 'E') {
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
                        i13 = i15 + i11;
                        if (!z10) {
                        }
                        if (i13 >= -125) {
                            if (i13 < 128) {
                            }
                        }
                        while (true) {
                            i14 = this.c;
                            if (i14 < this.d) {
                            }
                            this.a = b();
                        }
                        return f7;
                    }
                    break;
                case '1':
                case '2':
                case zs.o0 /* 51 */:
                case zs.p0 /* 52 */:
                case zs.q0 /* 53 */:
                case zs.r0 /* 54 */:
                case zs.s0 /* 55 */:
                case zs.t0 /* 56 */:
                case zs.u0 /* 57 */:
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    while (true) {
                        if (i10 >= 9) {
                        }
                        b10 = b();
                        this.a = b10;
                        switch (b10) {
                        }
                        z11 = true;
                        if (this.a == '.') {
                        }
                        c10 = this.a;
                        if (c10 != 'E') {
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
                        i13 = i15 + i11;
                        if (!z10) {
                        }
                        if (i13 >= -125) {
                        }
                        while (true) {
                            i14 = this.c;
                            if (i14 < this.d) {
                            }
                            this.a = b();
                        }
                        return f7;
                        break;
                    }
                    break;
            }
        } else {
            z10 = false;
        }
        this.a = b();
        float f72 = 0.0f;
        switch (this.a) {
        }
    }

    public final char b() {
        int i10 = this.c;
        int i11 = this.d;
        if (i10 < i11) {
            this.c = i10 + 1;
        }
        int i12 = this.c;
        if (i12 == i11) {
            return (char) 0;
        }
        return this.b.charAt(i12);
    }

    public final void d() {
        while (true) {
            int i10 = this.c;
            if (i10 >= this.d || !Character.isWhitespace(this.b.charAt(i10))) {
                return;
            } else {
                this.a = b();
            }
        }
    }
}

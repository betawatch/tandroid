package org.telegram.messenger;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class nz {
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
        boolean z9;
        int i7;
        int i10;
        int i11;
        boolean z10;
        char b10;
        char c10;
        char b11;
        char b12;
        int i12;
        int i13;
        char charAt;
        d();
        char c11 = this.a;
        int i14 = 0;
        boolean z11 = true;
        if (c11 == '+') {
            z9 = true;
        } else if (c11 != '-') {
            z9 = true;
            float f10 = 0.0f;
            switch (this.a) {
                case '.':
                    i7 = 0;
                    i10 = 0;
                    i11 = 0;
                    z10 = false;
                    if (this.a == '.') {
                        char b13 = b();
                        this.a = b13;
                        switch (b13) {
                            case '0':
                                if (i7 == 0) {
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
                            case qs.o0 /* 51 */:
                            case qs.p0 /* 52 */:
                            case qs.q0 /* 53 */:
                            case qs.r0 /* 54 */:
                            case qs.s0 /* 55 */:
                            case qs.t0 /* 56 */:
                            case qs.u0 /* 57 */:
                                while (true) {
                                    if (i7 < 9) {
                                        i7++;
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
                                if (!z10) {
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
                                    case qs.o0 /* 51 */:
                                    case qs.p0 /* 52 */:
                                    case qs.q0 /* 53 */:
                                    case qs.r0 /* 54 */:
                                    case qs.s0 /* 55 */:
                                    case qs.t0 /* 56 */:
                                    case qs.u0 /* 57 */:
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
                                            case qs.o0 /* 51 */:
                                            case qs.p0 /* 52 */:
                                            case qs.q0 /* 53 */:
                                            case qs.r0 /* 54 */:
                                            case qs.s0 /* 55 */:
                                            case qs.t0 /* 56 */:
                                            case qs.u0 /* 57 */:
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
                                z11 = false;
                            }
                        }
                        b12 = b();
                        this.a = b12;
                        switch (b12) {
                            case '0':
                            case '1':
                            case '2':
                            case qs.o0 /* 51 */:
                            case qs.p0 /* 52 */:
                            case qs.q0 /* 53 */:
                            case qs.r0 /* 54 */:
                            case qs.s0 /* 55 */:
                            case qs.t0 /* 56 */:
                            case qs.u0 /* 57 */:
                                break;
                            default:
                                c(b12);
                                throw null;
                        }
                    }
                    if (!z11) {
                        i14 = -i14;
                    }
                    i12 = i14 + i10;
                    if (!z9) {
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
                            double[] dArr = sz.a;
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
                                case qs.o0 /* 51 */:
                                case qs.p0 /* 52 */:
                                case qs.q0 /* 53 */:
                                case qs.r0 /* 54 */:
                                case qs.s0 /* 55 */:
                                case qs.t0 /* 56 */:
                                case qs.u0 /* 57 */:
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
                    i7 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        if (i7 >= 9) {
                            i7++;
                            i11 = (i11 * 10) + (this.a - '0');
                        } else {
                            i10++;
                        }
                        b10 = b();
                        this.a = b10;
                        switch (b10) {
                        }
                        z10 = true;
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
                        if (!z11) {
                        }
                        i12 = i14 + i10;
                        if (!z9) {
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
                case qs.o0 /* 51 */:
                case qs.p0 /* 52 */:
                case qs.q0 /* 53 */:
                case qs.r0 /* 54 */:
                case qs.s0 /* 55 */:
                case qs.t0 /* 56 */:
                case qs.u0 /* 57 */:
                    i7 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        if (i7 >= 9) {
                        }
                        b10 = b();
                        this.a = b10;
                        switch (b10) {
                        }
                        z10 = true;
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
                        if (!z11) {
                        }
                        i12 = i14 + i10;
                        if (!z9) {
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
            z9 = false;
        }
        this.a = b();
        float f102 = 0.0f;
        switch (this.a) {
        }
    }

    public final char b() {
        int i7 = this.c;
        int i10 = this.d;
        if (i7 < i10) {
            this.c = i7 + 1;
        }
        int i11 = this.c;
        if (i11 == i10) {
            return (char) 0;
        }
        return this.b.charAt(i11);
    }

    public final void d() {
        while (true) {
            int i7 = this.c;
            if (i7 >= this.d || !Character.isWhitespace(this.b.charAt(i7))) {
                return;
            } else {
                this.a = b();
            }
        }
    }
}

// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class cgb {
    public char a;
    public String b;
    public int c;
    public int d;

    public static void c(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0058, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
    
        if (r15 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00ea, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[LOOP:6: B:113:0x0041->B:119:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013d A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002d A[LOOP:1: B:28:0x002d->B:34:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c5 A[PHI: r4 r6
      0x00c5: PHI (r4v2 boolean) = (r4v1 boolean), (r4v0 boolean) binds: [B:97:0x00be, B:77:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r6v10 char) = (r6v9 char), (r6v8 char) binds: [B:97:0x00be, B:77:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a() {
        boolean z;
        char b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        char b2;
        int i4;
        int i5;
        char charAt;
        d();
        char c3 = this.a;
        int i6 = 0;
        boolean z2 = true;
        if (c3 == '+') {
            z = true;
        } else if (c3 != '-') {
            b = c3;
            z = true;
            float f = 0.0f;
            switch (b) {
                case '.':
                    i = 0;
                    i2 = 0;
                    boolean z3 = false;
                    c = b;
                    i3 = 0;
                    if (c == '.') {
                        c = b();
                        this.a = c;
                        switch (c) {
                            case '0':
                                if (i3 == 0) {
                                    while (true) {
                                        c2 = b();
                                        this.a = c2;
                                        i--;
                                        switch (c2) {
                                        }
                                    }
                                }
                                break;
                            case '1':
                            case '2':
                            case jn7.n0 /* 51 */:
                            case jn7.o0 /* 52 */:
                            case jn7.p0 /* 53 */:
                            case jn7.q0 /* 54 */:
                            case jn7.r0 /* 55 */:
                            case '8':
                            case jn7.t0 /* 57 */:
                                while (true) {
                                    if (i3 < 9) {
                                        i3++;
                                        i--;
                                        i2 = (this.a - '0') + (i2 * 10);
                                    }
                                    c2 = b();
                                    this.a = c2;
                                    switch (c2) {
                                    }
                                    if (c2 != 'E' || c2 == 'e') {
                                        b2 = b();
                                        this.a = b2;
                                        if (b2 != '+') {
                                            if (b2 != '-') {
                                                switch (b2) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case jn7.n0 /* 51 */:
                                                    case jn7.o0 /* 52 */:
                                                    case jn7.p0 /* 53 */:
                                                    case jn7.q0 /* 54 */:
                                                    case jn7.r0 /* 55 */:
                                                    case '8':
                                                    case jn7.t0 /* 57 */:
                                                        switch (b2) {
                                                            case '0':
                                                                while (true) {
                                                                    char b3 = b();
                                                                    this.a = b3;
                                                                    switch (b3) {
                                                                    }
                                                                }
                                                                break;
                                                            case '1':
                                                            case '2':
                                                            case jn7.n0 /* 51 */:
                                                            case jn7.o0 /* 52 */:
                                                            case jn7.p0 /* 53 */:
                                                            case jn7.q0 /* 54 */:
                                                            case jn7.r0 /* 55 */:
                                                            case '8':
                                                            case jn7.t0 /* 57 */:
                                                                int i7 = 0;
                                                                while (true) {
                                                                    if (i6 < 3) {
                                                                        i6++;
                                                                        i7 = (this.a - '0') + (i7 * 10);
                                                                    }
                                                                    char b4 = b();
                                                                    this.a = b4;
                                                                    switch (b4) {
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    default:
                                                        c(b2);
                                                        throw null;
                                                }
                                            } else {
                                                z2 = false;
                                            }
                                        }
                                        b2 = b();
                                        this.a = b2;
                                        switch (b2) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case jn7.n0 /* 51 */:
                                            case jn7.o0 /* 52 */:
                                            case jn7.p0 /* 53 */:
                                            case jn7.q0 /* 54 */:
                                            case jn7.r0 /* 55 */:
                                            case '8':
                                            case jn7.t0 /* 57 */:
                                                break;
                                            default:
                                                c(b2);
                                                throw null;
                                        }
                                    }
                                    if (!z2) {
                                        i6 = -i6;
                                    }
                                    i4 = i6 + i;
                                    if (!z) {
                                        i2 = -i2;
                                    }
                                    if (i4 >= -125 && i2 != 0) {
                                        if (i4 < 128) {
                                            f = i2 > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
                                        } else if (i4 == 0) {
                                            f = i2;
                                        } else {
                                            if (i2 >= 67108864) {
                                                i2++;
                                            }
                                            double d = i2;
                                            double[] dArr = hgb.a;
                                            f = (float) (i4 > 0 ? d * dArr[i4] : d / dArr[-i4]);
                                        }
                                    }
                                    while (true) {
                                        i5 = this.c;
                                        if (i5 >= this.d && ((charAt = this.b.charAt(i5)) == '\t' || charAt == '\n' || charAt == ' ' || charAt == ',')) {
                                            this.a = b();
                                        }
                                    }
                                    return f;
                                    break;
                                }
                                break;
                            default:
                                if (!z3) {
                                    c(c);
                                    throw null;
                                }
                                break;
                        }
                    }
                    c2 = c;
                    if (c2 != 'E') {
                    }
                    b2 = b();
                    this.a = b2;
                    if (b2 != '+') {
                    }
                    b2 = b();
                    this.a = b2;
                    switch (b2) {
                    }
                    if (!z2) {
                    }
                    i4 = i6 + i;
                    if (!z) {
                    }
                    if (i4 >= -125) {
                        if (i4 < 128) {
                        }
                    }
                    while (true) {
                        i5 = this.c;
                        if (i5 >= this.d) {
                        }
                        this.a = b();
                    }
                    return f;
                case '/':
                default:
                    f = Float.NaN;
                    while (true) {
                        i5 = this.c;
                        if (i5 >= this.d) {
                        }
                        this.a = b();
                    }
                    return f;
                case '0':
                    while (true) {
                        char b5 = b();
                        this.a = b5;
                        if (b5 != '.' && b5 != 'E' && b5 != 'e') {
                            switch (b5) {
                                case '0':
                                case '1':
                                case '2':
                                case jn7.n0 /* 51 */:
                                case jn7.o0 /* 52 */:
                                case jn7.p0 /* 53 */:
                                case jn7.q0 /* 54 */:
                                case jn7.r0 /* 55 */:
                                case '8':
                                case jn7.t0 /* 57 */:
                                    break;
                                default:
                                    while (true) {
                                        i5 = this.c;
                                        if (i5 >= this.d) {
                                        }
                                        this.a = b();
                                    }
                                    return f;
                            }
                        }
                    }
                    i3 = 0;
                    i = 0;
                    i2 = 0;
                    while (true) {
                        if (i3 >= 9) {
                            i3++;
                            i2 = (i2 * 10) + (this.a - '0');
                        } else {
                            i++;
                        }
                        c = b();
                        this.a = c;
                        switch (c) {
                        }
                        if (c == '.') {
                        }
                        c2 = c;
                        if (c2 != 'E') {
                        }
                        b2 = b();
                        this.a = b2;
                        if (b2 != '+') {
                        }
                        b2 = b();
                        this.a = b2;
                        switch (b2) {
                        }
                        if (!z2) {
                        }
                        i4 = i6 + i;
                        if (!z) {
                        }
                        if (i4 >= -125) {
                        }
                        while (true) {
                            i5 = this.c;
                            if (i5 >= this.d) {
                            }
                            this.a = b();
                        }
                        return f;
                    }
                    break;
                case '1':
                case '2':
                case jn7.n0 /* 51 */:
                case jn7.o0 /* 52 */:
                case jn7.p0 /* 53 */:
                case jn7.q0 /* 54 */:
                case jn7.r0 /* 55 */:
                case '8':
                case jn7.t0 /* 57 */:
                    i3 = 0;
                    i = 0;
                    i2 = 0;
                    while (true) {
                        if (i3 >= 9) {
                        }
                        c = b();
                        this.a = c;
                        switch (c) {
                        }
                        if (c == '.') {
                        }
                        c2 = c;
                        if (c2 != 'E') {
                        }
                        b2 = b();
                        this.a = b2;
                        if (b2 != '+') {
                        }
                        b2 = b();
                        this.a = b2;
                        switch (b2) {
                        }
                        if (!z2) {
                        }
                        i4 = i6 + i;
                        if (!z) {
                        }
                        if (i4 >= -125) {
                        }
                        while (true) {
                            i5 = this.c;
                            if (i5 >= this.d) {
                            }
                            this.a = b();
                        }
                        return f;
                        break;
                    }
                    break;
            }
        } else {
            z = false;
        }
        b = b();
        this.a = b;
        float f2 = 0.0f;
        switch (b) {
        }
    }

    public final char b() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            i++;
            this.c = i;
        }
        if (i == i2) {
            return (char) 0;
        }
        return this.b.charAt(i);
    }

    public final void d() {
        while (true) {
            int i = this.c;
            if (i >= this.d || !Character.isWhitespace(this.b.charAt(i))) {
                return;
            } else {
                this.a = b();
            }
        }
    }
}

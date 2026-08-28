package j$.time.format;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class j implements f {
    public static final String[] d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    public static final j e = new j("+HH:MM:ss", "Z");
    public final String a;
    public final int b;
    public final int c;

    static {
        new j("+HH:MM:ss", "0");
    }

    public j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        for (int i9 = 0; i9 < 22; i9++) {
            if (d[i9].equals(str)) {
                this.b = i9;
                this.c = i9 % 11;
                this.a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
    }

    @Override // j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb2) {
        Long a2 = rVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z10 = false;
        if (a2 == null) {
            return false;
        }
        long longValue = a2.longValue();
        int i9 = (int) longValue;
        if (longValue != i9) {
            throw new ArithmeticException();
        }
        String str = this.a;
        if (i9 == 0) {
            sb2.append(str);
            return true;
        }
        int abs = Math.abs((i9 / 3600) % 100);
        int abs2 = Math.abs((i9 / 60) % 60);
        int abs3 = Math.abs(i9 % 60);
        int length = sb2.length();
        sb2.append(i9 < 0 ? "-" : "+");
        if (this.b >= 11 && abs < 10) {
            sb2.append((char) (abs + 48));
        } else {
            a(false, abs, sb2);
        }
        int i10 = this.c;
        if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && abs3 > 0) || (i10 >= 1 && abs2 > 0))) {
            a(i10 > 0 && i10 % 2 == 0, abs2, sb2);
            abs += abs2;
            if (i10 == 7 || i10 == 8 || (i10 >= 5 && abs3 > 0)) {
                if (i10 > 0 && i10 % 2 == 0) {
                    z10 = true;
                }
                a(z10, abs3, sb2);
                abs += abs3;
            }
        }
        if (abs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    public static void a(boolean z10, int i9, StringBuilder sb2) {
        sb2.append(z10 ? ":" : "");
        sb2.append((char) ((i9 / 10) + 48));
        sb2.append((char) ((i9 % 10) + 48));
    }

    public final String toString() {
        String replace = this.a.replace("'", "''");
        return "Offset(" + d[this.b] + ",'" + replace + "')";
    }
}

// default package

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class by7 extends y1 {
    public final ay7 a = new ay7();
    public final j66 b = new j66();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fe, code lost:
    
        if (r3 != r4) goto L55;
     */
    @Override // y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int b;
        int i;
        j66 j66Var = this.b;
        StringBuilder sb = j66Var.b;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int i2 = 0;
        while (i2 < charSequence.length()) {
            int F = ik8.F(j66Var.a);
            if (F == 0) {
                int c = dve.c(i2, charSequence.length(), charSequence);
                if (c < charSequence.length() && charSequence.charAt(c) == '[') {
                    j66Var.a = 2;
                    j66Var.d = new StringBuilder();
                    i2 = c + 1;
                    if (i2 >= charSequence.length()) {
                        j66Var.d.append('\n');
                    }
                }
                i2 = -1;
            } else if (F == 1) {
                b = kse.b(i2, charSequence);
                if (b != -1) {
                    j66Var.d.append(charSequence, i2, b);
                    if (b >= charSequence.length()) {
                        j66Var.d.append('\n');
                        i2 = b;
                    } else if (charSequence.charAt(b) == ']' && (i = b + 1) < charSequence.length() && charSequence.charAt(i) == ':' && j66Var.d.length() <= 999) {
                        String sb2 = j66Var.d.toString();
                        Pattern pattern = u44.a;
                        String replaceAll = u44.c.matcher(sb2.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            j66Var.e = replaceAll;
                            j66Var.a = 3;
                            i2 = dve.c(b + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i2 = -1;
            } else if (F == 2) {
                int c2 = dve.c(i2, charSequence.length(), charSequence);
                int a = kse.a(c2, charSequence);
                if (a != -1) {
                    j66Var.f = charSequence.charAt(c2) == '<' ? charSequence.subSequence(c2 + 1, a - 1).toString() : charSequence.subSequence(c2, a).toString();
                    i2 = dve.c(a, charSequence.length(), charSequence);
                    if (i2 >= charSequence.length()) {
                        j66Var.i = true;
                        sb.setLength(0);
                    }
                    j66Var.a = 4;
                }
                i2 = -1;
            } else if (F == 3) {
                i2 = dve.c(i2, charSequence.length(), charSequence);
                if (i2 >= charSequence.length()) {
                    j66Var.a = 1;
                } else {
                    j66Var.g = (char) 0;
                    char charAt = charSequence.charAt(i2);
                    if (charAt == '\"' || charAt == '\'') {
                        j66Var.g = charAt;
                    } else if (charAt == '(') {
                        j66Var.g = ')';
                    }
                    if (j66Var.g != 0) {
                        j66Var.a = 5;
                        j66Var.h = new StringBuilder();
                        i2++;
                        if (i2 == charSequence.length()) {
                            j66Var.h.append('\n');
                        }
                    } else {
                        j66Var.a();
                        j66Var.a = 1;
                    }
                }
            } else if (F == 4) {
                b = kse.d(charSequence, i2, j66Var.g);
                if (b != -1) {
                    j66Var.h.append(charSequence.subSequence(i2, b));
                    if (b >= charSequence.length()) {
                        j66Var.h.append('\n');
                        i2 = b;
                    } else {
                        i2 = dve.c(b + 1, charSequence.length(), charSequence);
                        if (i2 == charSequence.length()) {
                            j66Var.i = true;
                            j66Var.a();
                            sb.setLength(0);
                            j66Var.a = 1;
                        }
                    }
                }
                i2 = -1;
            } else if (F == 5) {
                return;
            }
            if (i2 == -1) {
                j66Var.a = 6;
                return;
            }
        }
    }

    @Override // y1
    public final boolean c() {
        return true;
    }

    @Override // y1
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // y1
    public final hk0 e() {
        return this.a;
    }

    @Override // y1
    public final void g(tp5 tp5Var) {
        StringBuilder sb = this.b.b;
        if (sb.length() > 0) {
            tp5Var.a(sb.toString(), this.a);
        }
    }

    @Override // y1
    public final qk2 h(mp3 mp3Var) {
        if (mp3Var.h) {
            return null;
        }
        return qk2.a(mp3Var.b);
    }
}

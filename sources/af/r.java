package af;

import java.util.Locale;
import java.util.regex.Pattern;
import v7.e5;
import v7.f5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class r extends ff.a {
    public final df.r a = new df.r();
    public final n b = new n();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r4 == r5) goto L21;
     */
    @Override // ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int b10;
        int i10;
        n nVar = this.b;
        StringBuilder sb2 = nVar.b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int c10 = m1.j.c(nVar.a);
            if (c10 == 0) {
                int c11 = f5.c(i11, charSequence.length(), charSequence);
                if (c11 < charSequence.length() && charSequence.charAt(c11) == '[') {
                    nVar.a = 2;
                    nVar.d = new StringBuilder();
                    i11 = c11 + 1;
                    if (i11 >= charSequence.length()) {
                        nVar.d.append('\n');
                    }
                }
                i11 = -1;
            } else if (c10 == 1) {
                b10 = e5.b(i11, charSequence);
                if (b10 != -1) {
                    nVar.d.append(charSequence, i11, b10);
                    if (b10 >= charSequence.length()) {
                        nVar.d.append('\n');
                        i11 = b10;
                    } else if (charSequence.charAt(b10) == ']' && (i10 = b10 + 1) < charSequence.length() && charSequence.charAt(i10) == ':' && nVar.d.length() <= 999) {
                        String sb3 = nVar.d.toString();
                        Pattern pattern = cf.a.a;
                        String replaceAll = cf.a.c.matcher(sb3.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            nVar.e = replaceAll;
                            nVar.a = 3;
                            i11 = f5.c(b10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i11 = -1;
            } else if (c10 == 2) {
                int c12 = f5.c(i11, charSequence.length(), charSequence);
                int a2 = e5.a(c12, charSequence);
                if (a2 != -1) {
                    nVar.f = charSequence.charAt(c12) == '<' ? charSequence.subSequence(c12 + 1, a2 - 1).toString() : charSequence.subSequence(c12, a2).toString();
                    i11 = f5.c(a2, charSequence.length(), charSequence);
                    if (i11 >= charSequence.length()) {
                        nVar.i = true;
                        sb2.setLength(0);
                    }
                    nVar.a = 4;
                }
                i11 = -1;
            } else if (c10 == 3) {
                i11 = f5.c(i11, charSequence.length(), charSequence);
                if (i11 >= charSequence.length()) {
                    nVar.a = 1;
                } else {
                    nVar.g = (char) 0;
                    char charAt = charSequence.charAt(i11);
                    if (charAt == '\"' || charAt == '\'') {
                        nVar.g = charAt;
                    } else if (charAt == '(') {
                        nVar.g = ')';
                    }
                    if (nVar.g != 0) {
                        nVar.a = 5;
                        nVar.h = new StringBuilder();
                        i11++;
                        if (i11 == charSequence.length()) {
                            nVar.h.append('\n');
                        }
                    } else {
                        nVar.a();
                        nVar.a = 1;
                    }
                }
            } else if (c10 == 4) {
                b10 = e5.d(charSequence, i11, nVar.g);
                if (b10 != -1) {
                    nVar.h.append(charSequence.subSequence(i11, b10));
                    if (b10 >= charSequence.length()) {
                        nVar.h.append('\n');
                        i11 = b10;
                    } else {
                        i11 = f5.c(b10 + 1, charSequence.length(), charSequence);
                        if (i11 == charSequence.length()) {
                            nVar.i = true;
                            nVar.a();
                            sb2.setLength(0);
                            nVar.a = 1;
                        }
                    }
                }
                i11 = -1;
            } else if (c10 == 5) {
                return;
            }
            if (i11 == -1) {
                nVar.a = 6;
                return;
            }
        }
    }

    @Override // ff.a
    public final boolean c() {
        return true;
    }

    @Override // ff.a
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // ff.a
    public final df.a e() {
        return this.a;
    }

    @Override // ff.a
    public final void g(ef.a aVar) {
        StringBuilder sb2 = this.b.b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.a);
        }
    }

    @Override // ff.a
    public final a h(h hVar) {
        if (hVar.h) {
            return null;
        }
        return a.a(hVar.b);
    }
}

package gf;

import c8.a1;
import c8.z0;
import java.util.Locale;
import java.util.regex.Pattern;
import kf.r;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class p extends mf.a {
    public final r a = new r();
    public final l b = new l();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r4 == r5) goto L21;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int b10;
        int i7;
        l lVar = this.b;
        StringBuilder sb2 = lVar.b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int i10 = 0;
        while (i10 < charSequence.length()) {
            int c10 = p1.g.c(lVar.a);
            if (c10 == 0) {
                int c11 = a1.c(i10, charSequence.length(), charSequence);
                if (c11 < charSequence.length() && charSequence.charAt(c11) == '[') {
                    lVar.a = 2;
                    lVar.d = new StringBuilder();
                    i10 = c11 + 1;
                    if (i10 >= charSequence.length()) {
                        lVar.d.append('\n');
                    }
                }
                i10 = -1;
            } else if (c10 == 1) {
                b10 = z0.b(i10, charSequence);
                if (b10 != -1) {
                    lVar.d.append(charSequence, i10, b10);
                    if (b10 >= charSequence.length()) {
                        lVar.d.append('\n');
                        i10 = b10;
                    } else if (charSequence.charAt(b10) == ']' && (i7 = b10 + 1) < charSequence.length() && charSequence.charAt(i7) == ':' && lVar.d.length() <= 999) {
                        String sb3 = lVar.d.toString();
                        Pattern pattern = jf.a.a;
                        String replaceAll = jf.a.c.matcher(sb3.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            lVar.e = replaceAll;
                            lVar.a = 3;
                            i10 = a1.c(b10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i10 = -1;
            } else if (c10 == 2) {
                int c12 = a1.c(i10, charSequence.length(), charSequence);
                int a10 = z0.a(c12, charSequence);
                if (a10 != -1) {
                    lVar.f = charSequence.charAt(c12) == '<' ? charSequence.subSequence(c12 + 1, a10 - 1).toString() : charSequence.subSequence(c12, a10).toString();
                    i10 = a1.c(a10, charSequence.length(), charSequence);
                    if (i10 >= charSequence.length()) {
                        lVar.i = true;
                        sb2.setLength(0);
                    }
                    lVar.a = 4;
                }
                i10 = -1;
            } else if (c10 == 3) {
                i10 = a1.c(i10, charSequence.length(), charSequence);
                if (i10 >= charSequence.length()) {
                    lVar.a = 1;
                } else {
                    lVar.g = (char) 0;
                    char charAt = charSequence.charAt(i10);
                    if (charAt == '\"' || charAt == '\'') {
                        lVar.g = charAt;
                    } else if (charAt == '(') {
                        lVar.g = ')';
                    }
                    if (lVar.g != 0) {
                        lVar.a = 5;
                        lVar.h = new StringBuilder();
                        i10++;
                        if (i10 == charSequence.length()) {
                            lVar.h.append('\n');
                        }
                    } else {
                        lVar.a();
                        lVar.a = 1;
                    }
                }
            } else if (c10 == 4) {
                b10 = z0.d(charSequence, i10, lVar.g);
                if (b10 != -1) {
                    lVar.h.append(charSequence.subSequence(i10, b10));
                    if (b10 >= charSequence.length()) {
                        lVar.h.append('\n');
                        i10 = b10;
                    } else {
                        i10 = a1.c(b10 + 1, charSequence.length(), charSequence);
                        if (i10 == charSequence.length()) {
                            lVar.i = true;
                            lVar.a();
                            sb2.setLength(0);
                            lVar.a = 1;
                        }
                    }
                }
                i10 = -1;
            } else if (c10 == 5) {
                return;
            }
            if (i10 == -1) {
                lVar.a = 6;
                return;
            }
        }
    }

    @Override // mf.a
    public final boolean c() {
        return true;
    }

    @Override // mf.a
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // mf.a
    public final kf.a e() {
        return this.a;
    }

    @Override // mf.a
    public final void g(lf.a aVar) {
        StringBuilder sb2 = this.b.b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.a);
        }
    }

    @Override // mf.a
    public final a h(g gVar) {
        if (gVar.h) {
            return null;
        }
        return a.a(gVar.b);
    }
}

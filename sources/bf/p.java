package bf;

import a8.nb;
import a8.tb;
import ef.r;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class p extends gf.a {
    public final r a = new r();
    public final l b = new l();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r4 == r5) goto L21;
     */
    @Override // gf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int b10;
        int i10;
        l lVar = this.b;
        StringBuilder sb2 = lVar.b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int c10 = m1.j.c(lVar.a);
            if (c10 == 0) {
                int c11 = tb.c(i11, charSequence.length(), charSequence);
                if (c11 < charSequence.length() && charSequence.charAt(c11) == '[') {
                    lVar.a = 2;
                    lVar.d = new StringBuilder();
                    i11 = c11 + 1;
                    if (i11 >= charSequence.length()) {
                        lVar.d.append('\n');
                    }
                }
                i11 = -1;
            } else if (c10 == 1) {
                b10 = nb.b(i11, charSequence);
                if (b10 != -1) {
                    lVar.d.append(charSequence, i11, b10);
                    if (b10 >= charSequence.length()) {
                        lVar.d.append('\n');
                        i11 = b10;
                    } else if (charSequence.charAt(b10) == ']' && (i10 = b10 + 1) < charSequence.length() && charSequence.charAt(i10) == ':' && lVar.d.length() <= 999) {
                        String sb3 = lVar.d.toString();
                        Pattern pattern = df.a.a;
                        String replaceAll = df.a.c.matcher(sb3.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            lVar.e = replaceAll;
                            lVar.a = 3;
                            i11 = tb.c(b10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i11 = -1;
            } else if (c10 == 2) {
                int c12 = tb.c(i11, charSequence.length(), charSequence);
                int a2 = nb.a(c12, charSequence);
                if (a2 != -1) {
                    lVar.f = charSequence.charAt(c12) == '<' ? charSequence.subSequence(c12 + 1, a2 - 1).toString() : charSequence.subSequence(c12, a2).toString();
                    i11 = tb.c(a2, charSequence.length(), charSequence);
                    if (i11 >= charSequence.length()) {
                        lVar.i = true;
                        sb2.setLength(0);
                    }
                    lVar.a = 4;
                }
                i11 = -1;
            } else if (c10 == 3) {
                i11 = tb.c(i11, charSequence.length(), charSequence);
                if (i11 >= charSequence.length()) {
                    lVar.a = 1;
                } else {
                    lVar.g = (char) 0;
                    char charAt = charSequence.charAt(i11);
                    if (charAt == '\"' || charAt == '\'') {
                        lVar.g = charAt;
                    } else if (charAt == '(') {
                        lVar.g = ')';
                    }
                    if (lVar.g != 0) {
                        lVar.a = 5;
                        lVar.h = new StringBuilder();
                        i11++;
                        if (i11 == charSequence.length()) {
                            lVar.h.append('\n');
                        }
                    } else {
                        lVar.a();
                        lVar.a = 1;
                    }
                }
            } else if (c10 == 4) {
                b10 = nb.d(charSequence, i11, lVar.g);
                if (b10 != -1) {
                    lVar.h.append(charSequence.subSequence(i11, b10));
                    if (b10 >= charSequence.length()) {
                        lVar.h.append('\n');
                        i11 = b10;
                    } else {
                        i11 = tb.c(b10 + 1, charSequence.length(), charSequence);
                        if (i11 == charSequence.length()) {
                            lVar.i = true;
                            lVar.a();
                            sb2.setLength(0);
                            lVar.a = 1;
                        }
                    }
                }
                i11 = -1;
            } else if (c10 == 5) {
                return;
            }
            if (i11 == -1) {
                lVar.a = 6;
                return;
            }
        }
    }

    @Override // gf.a
    public final boolean c() {
        return true;
    }

    @Override // gf.a
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // gf.a
    public final ef.a e() {
        return this.a;
    }

    @Override // gf.a
    public final void g(ff.a aVar) {
        StringBuilder sb2 = this.b.b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.a);
        }
    }

    @Override // gf.a
    public final a h(g gVar) {
        if (gVar.h) {
            return null;
        }
        return a.a(gVar.b);
    }
}

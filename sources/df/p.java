package df;

import b8.dc;
import b8.ec;
import gf.r;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p extends jf.a {
    public final r a = new r();
    public final l b = new l();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r4 == r5) goto L21;
     */
    @Override // jf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int b10;
        int i3;
        l lVar = this.b;
        StringBuilder sb2 = lVar.b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int i10 = 0;
        while (i10 < charSequence.length()) {
            int c2 = o1.g.c(lVar.a);
            if (c2 == 0) {
                int c10 = ec.c(i10, charSequence.length(), charSequence);
                if (c10 < charSequence.length() && charSequence.charAt(c10) == '[') {
                    lVar.a = 2;
                    lVar.d = new StringBuilder();
                    i10 = c10 + 1;
                    if (i10 >= charSequence.length()) {
                        lVar.d.append('\n');
                    }
                }
                i10 = -1;
            } else if (c2 == 1) {
                b10 = dc.b(i10, charSequence);
                if (b10 != -1) {
                    lVar.d.append(charSequence, i10, b10);
                    if (b10 >= charSequence.length()) {
                        lVar.d.append('\n');
                        i10 = b10;
                    } else if (charSequence.charAt(b10) == ']' && (i3 = b10 + 1) < charSequence.length() && charSequence.charAt(i3) == ':' && lVar.d.length() <= 999) {
                        String sb3 = lVar.d.toString();
                        Pattern pattern = ff.a.a;
                        String replaceAll = ff.a.c.matcher(sb3.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            lVar.e = replaceAll;
                            lVar.a = 3;
                            i10 = ec.c(b10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i10 = -1;
            } else if (c2 == 2) {
                int c11 = ec.c(i10, charSequence.length(), charSequence);
                int a10 = dc.a(c11, charSequence);
                if (a10 != -1) {
                    lVar.f = charSequence.charAt(c11) == '<' ? charSequence.subSequence(c11 + 1, a10 - 1).toString() : charSequence.subSequence(c11, a10).toString();
                    i10 = ec.c(a10, charSequence.length(), charSequence);
                    if (i10 >= charSequence.length()) {
                        lVar.i = true;
                        sb2.setLength(0);
                    }
                    lVar.a = 4;
                }
                i10 = -1;
            } else if (c2 == 3) {
                i10 = ec.c(i10, charSequence.length(), charSequence);
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
            } else if (c2 == 4) {
                b10 = dc.d(charSequence, i10, lVar.g);
                if (b10 != -1) {
                    lVar.h.append(charSequence.subSequence(i10, b10));
                    if (b10 >= charSequence.length()) {
                        lVar.h.append('\n');
                        i10 = b10;
                    } else {
                        i10 = ec.c(b10 + 1, charSequence.length(), charSequence);
                        if (i10 == charSequence.length()) {
                            lVar.i = true;
                            lVar.a();
                            sb2.setLength(0);
                            lVar.a = 1;
                        }
                    }
                }
                i10 = -1;
            } else if (c2 == 5) {
                return;
            }
            if (i10 == -1) {
                lVar.a = 6;
                return;
            }
        }
    }

    @Override // jf.a
    public final boolean c() {
        return true;
    }

    @Override // jf.a
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // jf.a
    public final gf.a e() {
        return this.a;
    }

    @Override // jf.a
    public final void g(hf.a aVar) {
        StringBuilder sb2 = this.b.b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.a);
        }
    }

    @Override // jf.a
    public final a h(g gVar) {
        if (gVar.h) {
            return null;
        }
        return a.a(gVar.b);
    }
}

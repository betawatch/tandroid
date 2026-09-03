package ke;

import java.util.Locale;
import java.util.regex.Pattern;
import k7.u;
import k7.v;
import ne.r;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o extends pe.a {
    public final r a = new r();
    public final k b = new k();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r4 == r5) goto L21;
     */
    @Override // pe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int b10;
        int i10;
        k kVar = this.b;
        StringBuilder sb = kVar.b;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int c3 = m1.j.c(kVar.a);
            if (c3 == 0) {
                int c10 = v.c(i11, charSequence.length(), charSequence);
                if (c10 < charSequence.length() && charSequence.charAt(c10) == '[') {
                    kVar.a = 2;
                    kVar.d = new StringBuilder();
                    i11 = c10 + 1;
                    if (i11 >= charSequence.length()) {
                        kVar.d.append('\n');
                    }
                }
                i11 = -1;
            } else if (c3 == 1) {
                b10 = u.b(i11, charSequence);
                if (b10 != -1) {
                    kVar.d.append(charSequence, i11, b10);
                    if (b10 >= charSequence.length()) {
                        kVar.d.append('\n');
                        i11 = b10;
                    } else if (charSequence.charAt(b10) == ']' && (i10 = b10 + 1) < charSequence.length() && charSequence.charAt(i10) == ':' && kVar.d.length() <= 999) {
                        String sb2 = kVar.d.toString();
                        Pattern pattern = me.a.a;
                        String replaceAll = me.a.c.matcher(sb2.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            kVar.e = replaceAll;
                            kVar.a = 3;
                            i11 = v.c(b10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i11 = -1;
            } else if (c3 == 2) {
                int c11 = v.c(i11, charSequence.length(), charSequence);
                int a2 = u.a(c11, charSequence);
                if (a2 != -1) {
                    kVar.f = charSequence.charAt(c11) == '<' ? charSequence.subSequence(c11 + 1, a2 - 1).toString() : charSequence.subSequence(c11, a2).toString();
                    i11 = v.c(a2, charSequence.length(), charSequence);
                    if (i11 >= charSequence.length()) {
                        kVar.i = true;
                        sb.setLength(0);
                    }
                    kVar.a = 4;
                }
                i11 = -1;
            } else if (c3 == 3) {
                i11 = v.c(i11, charSequence.length(), charSequence);
                if (i11 >= charSequence.length()) {
                    kVar.a = 1;
                } else {
                    kVar.g = (char) 0;
                    char charAt = charSequence.charAt(i11);
                    if (charAt == '\"' || charAt == '\'') {
                        kVar.g = charAt;
                    } else if (charAt == '(') {
                        kVar.g = ')';
                    }
                    if (kVar.g != 0) {
                        kVar.a = 5;
                        kVar.h = new StringBuilder();
                        i11++;
                        if (i11 == charSequence.length()) {
                            kVar.h.append('\n');
                        }
                    } else {
                        kVar.a();
                        kVar.a = 1;
                    }
                }
            } else if (c3 == 4) {
                b10 = u.d(charSequence, i11, kVar.g);
                if (b10 != -1) {
                    kVar.h.append(charSequence.subSequence(i11, b10));
                    if (b10 >= charSequence.length()) {
                        kVar.h.append('\n');
                        i11 = b10;
                    } else {
                        i11 = v.c(b10 + 1, charSequence.length(), charSequence);
                        if (i11 == charSequence.length()) {
                            kVar.i = true;
                            kVar.a();
                            sb.setLength(0);
                            kVar.a = 1;
                        }
                    }
                }
                i11 = -1;
            } else if (c3 == 5) {
                return;
            }
            if (i11 == -1) {
                kVar.a = 6;
                return;
            }
        }
    }

    @Override // pe.a
    public final boolean c() {
        return true;
    }

    @Override // pe.a
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // pe.a
    public final ne.a e() {
        return this.a;
    }

    @Override // pe.a
    public final void g(oe.a aVar) {
        StringBuilder sb = this.b.b;
        if (sb.length() > 0) {
            aVar.a(sb.toString(), this.a);
        }
    }

    @Override // pe.a
    public final j4.h h(e eVar) {
        if (eVar.h) {
            return null;
        }
        return j4.h.a(eVar.b);
    }
}

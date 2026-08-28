package fe;

import f7.d8;
import f7.e8;
import ie.r;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends ke.a {
    public final r a = new r();
    public final k b = new k();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r4 == r5) goto L21;
     */
    @Override // ke.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int b10;
        int i9;
        k kVar = this.b;
        StringBuilder sb2 = kVar.b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int i10 = 0;
        while (i10 < charSequence.length()) {
            int b11 = m1.j.b(kVar.a);
            if (b11 == 0) {
                int c10 = e8.c(i10, charSequence.length(), charSequence);
                if (c10 < charSequence.length() && charSequence.charAt(c10) == '[') {
                    kVar.a = 2;
                    kVar.d = new StringBuilder();
                    i10 = c10 + 1;
                    if (i10 >= charSequence.length()) {
                        kVar.d.append('\n');
                    }
                }
                i10 = -1;
            } else if (b11 == 1) {
                b10 = d8.b(i10, charSequence);
                if (b10 != -1) {
                    kVar.d.append(charSequence, i10, b10);
                    if (b10 >= charSequence.length()) {
                        kVar.d.append('\n');
                        i10 = b10;
                    } else if (charSequence.charAt(b10) == ']' && (i9 = b10 + 1) < charSequence.length() && charSequence.charAt(i9) == ':' && kVar.d.length() <= 999) {
                        String sb3 = kVar.d.toString();
                        Pattern pattern = he.a.a;
                        String replaceAll = he.a.c.matcher(sb3.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            kVar.e = replaceAll;
                            kVar.a = 3;
                            i10 = e8.c(b10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i10 = -1;
            } else if (b11 == 2) {
                int c11 = e8.c(i10, charSequence.length(), charSequence);
                int a2 = d8.a(c11, charSequence);
                if (a2 != -1) {
                    kVar.f = charSequence.charAt(c11) == '<' ? charSequence.subSequence(c11 + 1, a2 - 1).toString() : charSequence.subSequence(c11, a2).toString();
                    i10 = e8.c(a2, charSequence.length(), charSequence);
                    if (i10 >= charSequence.length()) {
                        kVar.i = true;
                        sb2.setLength(0);
                    }
                    kVar.a = 4;
                }
                i10 = -1;
            } else if (b11 == 3) {
                i10 = e8.c(i10, charSequence.length(), charSequence);
                if (i10 >= charSequence.length()) {
                    kVar.a = 1;
                } else {
                    kVar.g = (char) 0;
                    char charAt = charSequence.charAt(i10);
                    if (charAt == '\"' || charAt == '\'') {
                        kVar.g = charAt;
                    } else if (charAt == '(') {
                        kVar.g = ')';
                    }
                    if (kVar.g != 0) {
                        kVar.a = 5;
                        kVar.h = new StringBuilder();
                        i10++;
                        if (i10 == charSequence.length()) {
                            kVar.h.append('\n');
                        }
                    } else {
                        kVar.a();
                        kVar.a = 1;
                    }
                }
            } else if (b11 == 4) {
                b10 = d8.d(charSequence, i10, kVar.g);
                if (b10 != -1) {
                    kVar.h.append(charSequence.subSequence(i10, b10));
                    if (b10 >= charSequence.length()) {
                        kVar.h.append('\n');
                        i10 = b10;
                    } else {
                        i10 = e8.c(b10 + 1, charSequence.length(), charSequence);
                        if (i10 == charSequence.length()) {
                            kVar.i = true;
                            kVar.a();
                            sb2.setLength(0);
                            kVar.a = 1;
                        }
                    }
                }
                i10 = -1;
            } else if (b11 == 5) {
                return;
            }
            if (i10 == -1) {
                kVar.a = 6;
                return;
            }
        }
    }

    @Override // ke.a
    public final boolean c() {
        return true;
    }

    @Override // ke.a
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // ke.a
    public final ie.a e() {
        return this.a;
    }

    @Override // ke.a
    public final void g(je.a aVar) {
        StringBuilder sb2 = this.b.b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.a);
        }
    }

    @Override // ke.a
    public final e4.h h(e eVar) {
        if (eVar.h) {
            return null;
        }
        return e4.h.a(eVar.b);
    }
}

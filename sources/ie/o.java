package ie;

import java.util.Locale;
import java.util.regex.Pattern;
import le.r;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o extends ne.a {
    public final r a = new r();
    public final k b = new k();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r4 == r5) goto L21;
     */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int b10;
        int i10;
        k kVar = this.b;
        StringBuilder sb2 = kVar.b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int b11 = m1.j.b(kVar.a);
            if (b11 == 0) {
                int c3 = i7.k.c(i11, charSequence.length(), charSequence);
                if (c3 < charSequence.length() && charSequence.charAt(c3) == '[') {
                    kVar.a = 2;
                    kVar.d = new StringBuilder();
                    i11 = c3 + 1;
                    if (i11 >= charSequence.length()) {
                        kVar.d.append('\n');
                    }
                }
                i11 = -1;
            } else if (b11 == 1) {
                b10 = i7.j.b(i11, charSequence);
                if (b10 != -1) {
                    kVar.d.append(charSequence, i11, b10);
                    if (b10 >= charSequence.length()) {
                        kVar.d.append('\n');
                        i11 = b10;
                    } else if (charSequence.charAt(b10) == ']' && (i10 = b10 + 1) < charSequence.length() && charSequence.charAt(i10) == ':' && kVar.d.length() <= 999) {
                        String sb3 = kVar.d.toString();
                        Pattern pattern = ke.a.a;
                        String replaceAll = ke.a.c.matcher(sb3.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            kVar.e = replaceAll;
                            kVar.a = 3;
                            i11 = i7.k.c(b10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i11 = -1;
            } else if (b11 == 2) {
                int c6 = i7.k.c(i11, charSequence.length(), charSequence);
                int a2 = i7.j.a(c6, charSequence);
                if (a2 != -1) {
                    kVar.f = charSequence.charAt(c6) == '<' ? charSequence.subSequence(c6 + 1, a2 - 1).toString() : charSequence.subSequence(c6, a2).toString();
                    i11 = i7.k.c(a2, charSequence.length(), charSequence);
                    if (i11 >= charSequence.length()) {
                        kVar.i = true;
                        sb2.setLength(0);
                    }
                    kVar.a = 4;
                }
                i11 = -1;
            } else if (b11 == 3) {
                i11 = i7.k.c(i11, charSequence.length(), charSequence);
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
            } else if (b11 == 4) {
                b10 = i7.j.d(charSequence, i11, kVar.g);
                if (b10 != -1) {
                    kVar.h.append(charSequence.subSequence(i11, b10));
                    if (b10 >= charSequence.length()) {
                        kVar.h.append('\n');
                        i11 = b10;
                    } else {
                        i11 = i7.k.c(b10 + 1, charSequence.length(), charSequence);
                        if (i11 == charSequence.length()) {
                            kVar.i = true;
                            kVar.a();
                            sb2.setLength(0);
                            kVar.a = 1;
                        }
                    }
                }
                i11 = -1;
            } else if (b11 == 5) {
                return;
            }
            if (i11 == -1) {
                kVar.a = 6;
                return;
            }
        }
    }

    @Override // ne.a
    public final boolean c() {
        return true;
    }

    @Override // ne.a
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // ne.a
    public final le.a e() {
        return this.a;
    }

    @Override // ne.a
    public final void g(me.a aVar) {
        StringBuilder sb2 = this.b.b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.a);
        }
    }

    @Override // ne.a
    public final g4.h h(e eVar) {
        if (eVar.h) {
            return null;
        }
        return g4.h.a(eVar.b);
    }
}

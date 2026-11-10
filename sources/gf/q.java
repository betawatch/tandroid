package gf;

import c8.w0;
import c8.x0;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class q extends mf.a {
    public final kf.r a = new kf.r();
    public final m b = new m();

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
        m mVar = this.b;
        StringBuilder sb2 = mVar.b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int i10 = 0;
        while (i10 < charSequence.length()) {
            int c10 = p1.g.c(mVar.a);
            if (c10 == 0) {
                int c11 = x0.c(i10, charSequence.length(), charSequence);
                if (c11 < charSequence.length() && charSequence.charAt(c11) == '[') {
                    mVar.a = 2;
                    mVar.d = new StringBuilder();
                    i10 = c11 + 1;
                    if (i10 >= charSequence.length()) {
                        mVar.d.append('\n');
                    }
                }
                i10 = -1;
            } else if (c10 == 1) {
                b10 = w0.b(i10, charSequence);
                if (b10 != -1) {
                    mVar.d.append(charSequence, i10, b10);
                    if (b10 >= charSequence.length()) {
                        mVar.d.append('\n');
                        i10 = b10;
                    } else if (charSequence.charAt(b10) == ']' && (i7 = b10 + 1) < charSequence.length() && charSequence.charAt(i7) == ':' && mVar.d.length() <= 999) {
                        String sb3 = mVar.d.toString();
                        Pattern pattern = jf.a.a;
                        String replaceAll = jf.a.c.matcher(sb3.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            mVar.e = replaceAll;
                            mVar.a = 3;
                            i10 = x0.c(b10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i10 = -1;
            } else if (c10 == 2) {
                int c12 = x0.c(i10, charSequence.length(), charSequence);
                int a10 = w0.a(c12, charSequence);
                if (a10 != -1) {
                    mVar.f = charSequence.charAt(c12) == '<' ? charSequence.subSequence(c12 + 1, a10 - 1).toString() : charSequence.subSequence(c12, a10).toString();
                    i10 = x0.c(a10, charSequence.length(), charSequence);
                    if (i10 >= charSequence.length()) {
                        mVar.i = true;
                        sb2.setLength(0);
                    }
                    mVar.a = 4;
                }
                i10 = -1;
            } else if (c10 == 3) {
                i10 = x0.c(i10, charSequence.length(), charSequence);
                if (i10 >= charSequence.length()) {
                    mVar.a = 1;
                } else {
                    mVar.g = (char) 0;
                    char charAt = charSequence.charAt(i10);
                    if (charAt == '\"' || charAt == '\'') {
                        mVar.g = charAt;
                    } else if (charAt == '(') {
                        mVar.g = ')';
                    }
                    if (mVar.g != 0) {
                        mVar.a = 5;
                        mVar.h = new StringBuilder();
                        i10++;
                        if (i10 == charSequence.length()) {
                            mVar.h.append('\n');
                        }
                    } else {
                        mVar.a();
                        mVar.a = 1;
                    }
                }
            } else if (c10 == 4) {
                b10 = w0.d(charSequence, i10, mVar.g);
                if (b10 != -1) {
                    mVar.h.append(charSequence.subSequence(i10, b10));
                    if (b10 >= charSequence.length()) {
                        mVar.h.append('\n');
                        i10 = b10;
                    } else {
                        i10 = x0.c(b10 + 1, charSequence.length(), charSequence);
                        if (i10 == charSequence.length()) {
                            mVar.i = true;
                            mVar.a();
                            sb2.setLength(0);
                            mVar.a = 1;
                        }
                    }
                }
                i10 = -1;
            } else if (c10 == 5) {
                return;
            }
            if (i10 == -1) {
                mVar.a = 6;
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
    public final a h(h hVar) {
        if (hVar.h) {
            return null;
        }
        return a.a(hVar.b);
    }
}

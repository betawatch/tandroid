// default package

import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ik2 extends tp5 {
    public static final Pattern e = el6.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    @Override // tp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ui6 b() {
        boolean z;
        String str;
        String str2;
        int i = this.d + 1;
        this.d = i;
        el6 el6Var = this.a;
        zz0 zz0Var = el6Var.i;
        if (zz0Var == null) {
            return e("]");
        }
        vib vibVar = (vib) zz0Var.e;
        boolean z2 = zz0Var.a;
        if (!zz0Var.c) {
            el6Var.i = (zz0) zz0Var.f;
            return e("]");
        }
        el6Var.g = i;
        if (el6Var.d() == '(') {
            this.d++;
            d();
            el6 el6Var2 = this.a;
            int i2 = this.d;
            el6Var2.g = i2;
            int a = vpe.a(i2, el6Var2.f);
            if (a == -1) {
                str = null;
            } else {
                char d = el6Var2.d();
                String str3 = el6Var2.f;
                int i3 = el6Var2.g;
                String substring = d == '<' ? str3.substring(i3 + 1, a - 1) : str3.substring(i3, a);
                el6Var2.g = a;
                str = j54.a(substring);
            }
            this.d = this.a.g;
            if (str != null) {
                d();
                String str4 = this.c;
                int i4 = this.d;
                if (e.matcher(str4.substring(i4 - 1, i4)).matches()) {
                    el6 el6Var3 = this.a;
                    int i5 = this.d;
                    el6Var3.g = i5;
                    int c = vpe.c(i5, el6Var3.f);
                    if (c == -1) {
                        str2 = null;
                    } else {
                        String substring2 = el6Var3.f.substring(el6Var3.g + 1, c - 1);
                        el6Var3.g = c;
                        str2 = j54.a(substring2);
                    }
                    this.d = this.a.g;
                    d();
                } else {
                    str2 = null;
                }
                el6 el6Var4 = this.a;
                el6Var4.g = this.d;
                if (el6Var4.d() == ')') {
                    this.d++;
                    z = true;
                } else {
                    this.d = i;
                    z = false;
                }
                if (!z) {
                    int i6 = this.d;
                    el6 el6Var5 = this.a;
                    el6Var5.g = i6;
                    if (i6 < el6Var5.f.length() && el6Var5.f.charAt(el6Var5.g) == '[') {
                        int i7 = el6Var5.g + 1;
                        int b = vpe.b(i7, el6Var5.f);
                        int i8 = b - i7;
                        if (b != -1 && i8 <= 999 && b < el6Var5.f.length() && el6Var5.f.charAt(b) == ']') {
                            el6Var5.g = b + 1;
                        }
                    }
                    int i9 = this.a.g;
                    this.d = i9;
                    int i10 = i9 - i6;
                    String substring3 = i10 > 2 ? this.c.substring(i6, i10 + i6) : !zz0Var.d ? this.c.substring(zz0Var.b, i) : null;
                    if (substring3 != null) {
                        Pattern pattern = j54.a;
                        String replaceAll = j54.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        el6 el6Var6 = this.a;
                        el6Var6.getClass();
                        e66 e66Var = (e66) ((Map) el6Var6.a.c).get(replaceAll);
                        if (e66Var != null) {
                            str = e66Var.h;
                            str2 = e66Var.i;
                            z = true;
                        }
                    }
                }
                if (z) {
                    this.d = i;
                    el6 el6Var7 = this.a;
                    el6Var7.i = (zz0) el6Var7.i.f;
                    return e("]");
                }
                bm5 bm5Var = z2 ? new bm5(str, str2, (byte) 0) : new bm5(str, str2, (byte) 1);
                ui6 ui6Var = (ui6) vibVar.f;
                while (ui6Var != null) {
                    ui6 ui6Var2 = (ui6) ui6Var.f;
                    bm5Var.b(ui6Var);
                    ui6Var = ui6Var2;
                }
                gf3 gf3Var = (gf3) zz0Var.g;
                el6 el6Var8 = this.a;
                el6Var8.g = this.d;
                el6Var8.e(gf3Var);
                this.d = this.a.g;
                ui6 ui6Var3 = (ui6) bm5Var.c;
                ui6 ui6Var4 = (ui6) bm5Var.d;
                if (ui6Var3 != ui6Var4) {
                    ane.b(ui6Var3, ui6Var4);
                }
                vibVar.g();
                el6 el6Var9 = this.a;
                zz0 zz0Var2 = (zz0) el6Var9.i.f;
                el6Var9.i = zz0Var2;
                if (!z2) {
                    while (zz0Var2 != null) {
                        if (!zz0Var2.a) {
                            zz0Var2.c = false;
                        }
                        zz0Var2 = (zz0) zz0Var2.f;
                    }
                }
                return bm5Var;
            }
            z = false;
        } else {
            z = false;
            str = null;
        }
        str2 = null;
        if (!z) {
        }
        if (z) {
        }
    }

    @Override // tp5
    public final char c() {
        return ']';
    }
}

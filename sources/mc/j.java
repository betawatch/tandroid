package mc;

import java.util.Locale;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class j extends k {
    public String c;
    public String d;
    public String e;
    public final StringBuilder f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public lc.b k;

    public j(int i10) {
        super(i10, 0);
        this.f = new StringBuilder();
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public final void e(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.e = valueOf;
    }

    public final void f(char c10) {
        this.i = true;
        String str = this.g;
        StringBuilder sb2 = this.f;
        if (str != null) {
            sb2.append(str);
            this.g = null;
        }
        sb2.append(c10);
    }

    public final void g(String str) {
        this.i = true;
        String str2 = this.g;
        StringBuilder sb2 = this.f;
        if (str2 != null) {
            sb2.append(str2);
            this.g = null;
        }
        if (sb2.length() == 0) {
            this.g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void h(int[] iArr) {
        this.i = true;
        String str = this.g;
        StringBuilder sb2 = this.f;
        if (str != null) {
            sb2.append(str);
            this.g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void i(String str) {
        String str2 = this.c;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.c = str;
        this.d = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public final String j() {
        String str = this.c;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.c;
    }

    public final void k() {
        if (this.k == null) {
            this.k = new lc.b();
        }
        String str = this.e;
        StringBuilder sb2 = this.f;
        if (str != null) {
            String trim = str.trim();
            this.e = trim;
            if (trim.length() > 0) {
                String sb3 = this.i ? sb2.length() > 0 ? sb2.toString() : this.g : this.h ? "" : null;
                lc.b bVar = this.k;
                String str2 = this.e;
                int i10 = bVar.i(str2);
                if (i10 != -1) {
                    bVar.c[i10] = sb3;
                } else {
                    int i11 = bVar.a;
                    int i12 = i11 + 1;
                    if (i12 < i11) {
                        throw new IllegalArgumentException("Must be true");
                    }
                    String[] strArr = bVar.b;
                    int length = strArr.length;
                    if (length < i12) {
                        int i13 = length >= 4 ? i11 * 2 : 4;
                        if (i12 <= i13) {
                            i12 = i13;
                        }
                        String[] strArr2 = new String[i12];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i12));
                        bVar.b = strArr2;
                        String[] strArr3 = bVar.c;
                        String[] strArr4 = new String[i12];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                        bVar.c = strArr4;
                    }
                    String[] strArr5 = bVar.b;
                    int i14 = bVar.a;
                    strArr5[i14] = str2;
                    bVar.c[i14] = sb3;
                    bVar.a = i14 + 1;
                }
            }
        }
        this.e = null;
        this.h = false;
        this.i = false;
        k.d(sb2);
        this.g = null;
    }

    @Override // mc.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public j c() {
        this.c = null;
        this.d = null;
        this.e = null;
        k.d(this.f);
        this.g = null;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = null;
        return this;
    }
}

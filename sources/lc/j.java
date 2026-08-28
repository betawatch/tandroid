package lc;

import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public kc.c k;

    public j(int i9) {
        super(i9, 0);
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
        for (int i9 : iArr) {
            sb2.appendCodePoint(i9);
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
            this.k = new kc.c();
        }
        String str = this.e;
        StringBuilder sb2 = this.f;
        if (str != null) {
            String trim = str.trim();
            this.e = trim;
            if (trim.length() > 0) {
                String sb3 = this.i ? sb2.length() > 0 ? sb2.toString() : this.g : this.h ? "" : null;
                kc.c cVar = this.k;
                String str2 = this.e;
                int i9 = cVar.i(str2);
                if (i9 != -1) {
                    cVar.c[i9] = sb3;
                } else {
                    int i10 = cVar.a;
                    int i11 = i10 + 1;
                    if (i11 < i10) {
                        throw new IllegalArgumentException("Must be true");
                    }
                    String[] strArr = cVar.b;
                    int length = strArr.length;
                    if (length < i11) {
                        int i12 = length >= 4 ? i10 * 2 : 4;
                        if (i11 <= i12) {
                            i11 = i12;
                        }
                        String[] strArr2 = new String[i11];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i11));
                        cVar.b = strArr2;
                        String[] strArr3 = cVar.c;
                        String[] strArr4 = new String[i11];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
                        cVar.c = strArr4;
                    }
                    String[] strArr5 = cVar.b;
                    int i13 = cVar.a;
                    strArr5[i13] = str2;
                    cVar.c[i13] = sb3;
                    cVar.a = i13 + 1;
                }
            }
        }
        this.e = null;
        this.h = false;
        this.i = false;
        k.d(sb2);
        this.g = null;
    }

    @Override // lc.k
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

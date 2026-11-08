package dd;

import java.util.Locale;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
    public cd.c k;

    public j(int i7) {
        super(i7, 0);
        this.f = new StringBuilder();
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public final void d(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.e = valueOf;
    }

    public final void e(char c10) {
        this.i = true;
        String str = this.g;
        StringBuilder sb2 = this.f;
        if (str != null) {
            sb2.append(str);
            this.g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
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

    public final void g(int[] iArr) {
        this.i = true;
        String str = this.g;
        StringBuilder sb2 = this.f;
        if (str != null) {
            sb2.append(str);
            this.g = null;
        }
        for (int i7 : iArr) {
            sb2.appendCodePoint(i7);
        }
    }

    public final void h(String str) {
        String str2 = this.c;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.c = str;
        this.d = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public final String i() {
        String str = this.c;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.c;
    }

    public final void j() {
        if (this.k == null) {
            this.k = new cd.c();
        }
        String str = this.e;
        StringBuilder sb2 = this.f;
        if (str != null) {
            String trim = str.trim();
            this.e = trim;
            if (trim.length() > 0) {
                String sb3 = this.i ? sb2.length() > 0 ? sb2.toString() : this.g : this.h ? "" : null;
                cd.c cVar = this.k;
                String str2 = this.e;
                int f10 = cVar.f(str2);
                if (f10 != -1) {
                    cVar.c[f10] = sb3;
                } else {
                    int i7 = cVar.a;
                    int i10 = i7 + 1;
                    if (i10 < i7) {
                        throw new IllegalArgumentException("Must be true");
                    }
                    String[] strArr = cVar.b;
                    int length = strArr.length;
                    if (length < i10) {
                        int i11 = length >= 4 ? i7 * 2 : 4;
                        if (i10 <= i11) {
                            i10 = i11;
                        }
                        String[] strArr2 = new String[i10];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
                        cVar.b = strArr2;
                        String[] strArr3 = cVar.c;
                        String[] strArr4 = new String[i10];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
                        cVar.c = strArr4;
                    }
                    String[] strArr5 = cVar.b;
                    int i12 = cVar.a;
                    strArr5[i12] = str2;
                    cVar.c[i12] = sb3;
                    cVar.a = i12 + 1;
                }
            }
        }
        this.e = null;
        this.h = false;
        this.i = false;
        k.c(sb2);
        this.g = null;
    }

    @Override // dd.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j b() {
        this.c = null;
        this.d = null;
        this.e = null;
        k.c(this.f);
        this.g = null;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = null;
        return this;
    }
}

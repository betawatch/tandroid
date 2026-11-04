package ad;

import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class k extends l {
    public String c;
    public String d;
    public String e;
    public final StringBuilder f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public zc.b k;

    public k(int i3) {
        super(i3, 0);
        this.f = new StringBuilder();
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public final void d(char c2) {
        String valueOf = String.valueOf(c2);
        String str = this.e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.e = valueOf;
    }

    public final void e(char c2) {
        this.i = true;
        String str = this.g;
        StringBuilder sb2 = this.f;
        if (str != null) {
            sb2.append(str);
            this.g = null;
        }
        sb2.append(c2);
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
        for (int i3 : iArr) {
            sb2.appendCodePoint(i3);
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
            this.k = new zc.b();
        }
        String str = this.e;
        StringBuilder sb2 = this.f;
        if (str != null) {
            String trim = str.trim();
            this.e = trim;
            if (trim.length() > 0) {
                String sb3 = this.i ? sb2.length() > 0 ? sb2.toString() : this.g : this.h ? "" : null;
                zc.b bVar = this.k;
                String str2 = this.e;
                int h = bVar.h(str2);
                if (h != -1) {
                    bVar.c[h] = sb3;
                } else {
                    int i3 = bVar.a;
                    int i10 = i3 + 1;
                    if (i10 < i3) {
                        throw new IllegalArgumentException("Must be true");
                    }
                    String[] strArr = bVar.b;
                    int length = strArr.length;
                    if (length < i10) {
                        int i11 = length >= 4 ? i3 * 2 : 4;
                        if (i10 <= i11) {
                            i10 = i11;
                        }
                        String[] strArr2 = new String[i10];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
                        bVar.b = strArr2;
                        String[] strArr3 = bVar.c;
                        String[] strArr4 = new String[i10];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
                        bVar.c = strArr4;
                    }
                    String[] strArr5 = bVar.b;
                    int i12 = bVar.a;
                    strArr5[i12] = str2;
                    bVar.c[i12] = sb3;
                    bVar.a = i12 + 1;
                }
            }
        }
        this.e = null;
        this.h = false;
        this.i = false;
        l.c(sb2);
        this.g = null;
    }

    @Override // ad.l
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public k b() {
        this.c = null;
        this.d = null;
        this.e = null;
        l.c(this.f);
        this.g = null;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = null;
        return this;
    }
}

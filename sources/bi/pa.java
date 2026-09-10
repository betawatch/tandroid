package bi;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class pa extends ng.a {
    public int c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f;
    public TLRPC.User g;
    public TLRPC.Chat h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;

    public pa(int i10, boolean z10) {
        super(i10, z10);
        this.p = -1;
    }

    public static pa b(String str, CharSequence charSequence, int i10) {
        pa paVar = new pa(9, false);
        paVar.e = str;
        paVar.f = charSequence;
        paVar.q = i10;
        return paVar;
    }

    public static pa c() {
        return new pa(0, false);
    }

    public static pa d() {
        pa paVar = new pa(-1, false);
        paVar.o = -1;
        return paVar;
    }

    public static pa e() {
        return new pa(1, false);
    }

    public static pa f() {
        return new pa(2, false);
    }

    public static pa g(CharSequence charSequence) {
        pa paVar = new pa(6, false);
        paVar.e = charSequence;
        return paVar;
    }

    public static pa h(int i10, int i11, boolean z10) {
        pa paVar = new pa(3, false);
        paVar.i = i10;
        paVar.k = z10;
        paVar.j = i11;
        return paVar;
    }

    public static pa i(TLRPC.User user, boolean z10, boolean z11) {
        pa paVar = new pa(3, true);
        paVar.g = user;
        paVar.k = z10;
        paVar.l = z11;
        return paVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pa.class != obj.getClass()) {
            return false;
        }
        pa paVar = (pa) obj;
        int i10 = this.a;
        if (i10 != paVar.a) {
            return false;
        }
        if (i10 == -1 && (this.o != paVar.o || this.p != paVar.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != paVar.g || this.h != paVar.h || this.i != paVar.i || this.j != paVar.j || this.k != paVar.k || this.m != paVar.m || this.n != paVar.n)) {
            return false;
        }
        if (i10 == 0 && this.c != paVar.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, paVar.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, paVar.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, paVar.e) && TextUtils.equals(this.f, paVar.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, paVar.e) || this.c != paVar.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != paVar.c || !TextUtils.equals(this.e, paVar.e) || this.k != paVar.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == paVar.q && this.d == paVar.d && TextUtils.equals(this.e, paVar.e) && TextUtils.equals(this.f, paVar.f))) {
            return this.a != 10 || this.q == paVar.q;
        }
        return false;
    }
}

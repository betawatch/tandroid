// default package

import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class k7b extends ja {
    public byte c;
    public BitmapDrawable d;
    public CharSequence e;
    public CharSequence f;
    public TLRPC.User g;
    public TLRPC.Chat h;
    public byte i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public byte q;

    public k7b(int i, boolean z) {
        super(i, z);
        this.p = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k7b b(String str, CharSequence charSequence, int i) {
        k7b k7bVar = new k7b(9, false);
        k7bVar.e = str;
        k7bVar.f = charSequence;
        k7bVar.q = i;
        return k7bVar;
    }

    public static k7b c() {
        return new k7b(0, false);
    }

    public static k7b d() {
        k7b k7bVar = new k7b(-1, false);
        k7bVar.o = -1;
        return k7bVar;
    }

    public static k7b e() {
        return new k7b(1, false);
    }

    public static k7b f() {
        return new k7b(2, false);
    }

    public static k7b g(CharSequence charSequence) {
        k7b k7bVar = new k7b(6, false);
        k7bVar.e = charSequence;
        return k7bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k7b h(int i, int i2, boolean z) {
        k7b k7bVar = new k7b(3, false);
        k7bVar.i = i;
        k7bVar.k = z;
        k7bVar.j = i2;
        return k7bVar;
    }

    public static k7b i(TLRPC.User user, boolean z, boolean z2) {
        k7b k7bVar = new k7b(3, true);
        k7bVar.g = user;
        k7bVar.k = z;
        k7bVar.l = z2;
        return k7bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k7b.class != obj.getClass()) {
            return false;
        }
        k7b k7bVar = (k7b) obj;
        int i = this.a;
        if (i != k7bVar.a) {
            return false;
        }
        if (i == -1 && (this.o != k7bVar.o || this.p != k7bVar.p)) {
            return false;
        }
        if (i == 3 && (this.g != k7bVar.g || this.h != k7bVar.h || this.i != k7bVar.i || this.j != k7bVar.j || this.k != k7bVar.k || this.m != k7bVar.m || this.n != k7bVar.n)) {
            return false;
        }
        if (i == 0 && this.c != k7bVar.c) {
            return false;
        }
        if (i == 2 && !TextUtils.equals(this.e, k7bVar.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, k7bVar.e)) {
            return false;
        }
        int i2 = this.a;
        if ((i2 == 4 || i2 == 11) && !(TextUtils.equals(this.e, k7bVar.e) && TextUtils.equals(this.f, k7bVar.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, k7bVar.e) || this.c != k7bVar.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != k7bVar.c || !TextUtils.equals(this.e, k7bVar.e) || this.k != k7bVar.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == k7bVar.q && this.d == k7bVar.d && TextUtils.equals(this.e, k7bVar.e) && TextUtils.equals(this.f, k7bVar.f))) {
            return this.a != 10 || this.q == k7bVar.q;
        }
        return false;
    }
}

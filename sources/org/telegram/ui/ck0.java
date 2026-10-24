package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ck0 extends pg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public ik0 g;
    public int h;
    public boolean i;

    public static ck0 b(int i10, String str, boolean z10) {
        ck0 ck0Var = new ck0(1, true);
        ck0Var.c = i10;
        ck0Var.e = str;
        ck0Var.i = z10;
        return ck0Var;
    }

    public static ck0 c(int i10, String str, String str2) {
        ck0 ck0Var = new ck0(5, true);
        ck0Var.c = i10;
        ck0Var.e = str;
        ck0Var.f = str2;
        return ck0Var;
    }

    public static ck0 d(int i10, String str) {
        ck0 ck0Var = new ck0(4, true);
        ck0Var.c = i10;
        ck0Var.e = str;
        return ck0Var;
    }

    @Override // pg.a
    public final boolean a(pg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (ck0.class != aVar.getClass()) {
            return false;
        }
        ck0 ck0Var = (ck0) aVar;
        return this.c == ck0Var.c && this.d == ck0Var.d && this.h == ck0Var.h && this.i == ck0Var.i && Objects.equals(this.e, ck0Var.e) && Objects.equals(this.f, ck0Var.f) && this.g == ck0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ck0.class == obj.getClass()) {
            ck0 ck0Var = (ck0) obj;
            if (this.c == ck0Var.c && this.h == ck0Var.h && ((this.a == 8 || (this.d == ck0Var.d && Objects.equals(this.e, ck0Var.e) && (this.a == 6 || Objects.equals(this.f, ck0Var.f)))) && this.g == ck0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ph0 extends rg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public th0 g;
    public int h;
    public boolean i;

    public static ph0 b(int i7, String str, boolean z10) {
        ph0 ph0Var = new ph0(1, true);
        ph0Var.c = i7;
        ph0Var.e = str;
        ph0Var.i = z10;
        return ph0Var;
    }

    public static ph0 c(int i7, String str, String str2) {
        ph0 ph0Var = new ph0(5, true);
        ph0Var.c = i7;
        ph0Var.e = str;
        ph0Var.f = str2;
        return ph0Var;
    }

    public static ph0 d(int i7, String str) {
        ph0 ph0Var = new ph0(4, true);
        ph0Var.c = i7;
        ph0Var.e = str;
        return ph0Var;
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (ph0.class != aVar.getClass()) {
            return false;
        }
        ph0 ph0Var = (ph0) aVar;
        return this.c == ph0Var.c && this.d == ph0Var.d && this.h == ph0Var.h && this.i == ph0Var.i && Objects.equals(this.e, ph0Var.e) && Objects.equals(this.f, ph0Var.f) && this.g == ph0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ph0.class == obj.getClass()) {
            ph0 ph0Var = (ph0) obj;
            if (this.c == ph0Var.c && this.h == ph0Var.h && ((this.a == 8 || (this.d == ph0Var.d && Objects.equals(this.e, ph0Var.e) && (this.a == 6 || Objects.equals(this.f, ph0Var.f)))) && this.g == ph0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

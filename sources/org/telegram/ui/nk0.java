package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class nk0 extends og.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public tk0 g;
    public int h;
    public boolean i;

    public static nk0 b(int i10, String str, boolean z10) {
        nk0 nk0Var = new nk0(1, true);
        nk0Var.c = i10;
        nk0Var.e = str;
        nk0Var.i = z10;
        return nk0Var;
    }

    public static nk0 c(int i10, String str, String str2) {
        nk0 nk0Var = new nk0(5, true);
        nk0Var.c = i10;
        nk0Var.e = str;
        nk0Var.f = str2;
        return nk0Var;
    }

    public static nk0 d(int i10, String str) {
        nk0 nk0Var = new nk0(4, true);
        nk0Var.c = i10;
        nk0Var.e = str;
        return nk0Var;
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (nk0.class != aVar.getClass()) {
            return false;
        }
        nk0 nk0Var = (nk0) aVar;
        return this.c == nk0Var.c && this.d == nk0Var.d && this.h == nk0Var.h && this.i == nk0Var.i && Objects.equals(this.e, nk0Var.e) && Objects.equals(this.f, nk0Var.f) && this.g == nk0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nk0.class == obj.getClass()) {
            nk0 nk0Var = (nk0) obj;
            if (this.c == nk0Var.c && this.h == nk0Var.h && ((this.a == 8 || (this.d == nk0Var.d && Objects.equals(this.e, nk0Var.e) && (this.a == 6 || Objects.equals(this.f, nk0Var.f)))) && this.g == nk0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

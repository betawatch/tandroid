package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ok0 extends og.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public vk0 g;
    public int h;
    public boolean i;

    public static ok0 b(int i10, String str, boolean z10) {
        ok0 ok0Var = new ok0(1, true);
        ok0Var.c = i10;
        ok0Var.e = str;
        ok0Var.i = z10;
        return ok0Var;
    }

    public static ok0 c(int i10, String str, String str2) {
        ok0 ok0Var = new ok0(5, true);
        ok0Var.c = i10;
        ok0Var.e = str;
        ok0Var.f = str2;
        return ok0Var;
    }

    public static ok0 d(int i10, String str) {
        ok0 ok0Var = new ok0(4, true);
        ok0Var.c = i10;
        ok0Var.e = str;
        return ok0Var;
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (ok0.class != aVar.getClass()) {
            return false;
        }
        ok0 ok0Var = (ok0) aVar;
        return this.c == ok0Var.c && this.d == ok0Var.d && this.h == ok0Var.h && this.i == ok0Var.i && Objects.equals(this.e, ok0Var.e) && Objects.equals(this.f, ok0Var.f) && this.g == ok0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ok0.class == obj.getClass()) {
            ok0 ok0Var = (ok0) obj;
            if (this.c == ok0Var.c && this.h == ok0Var.h && ((this.a == 8 || (this.d == ok0Var.d && Objects.equals(this.e, ok0Var.e) && (this.a == 6 || Objects.equals(this.f, ok0Var.f)))) && this.g == ok0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

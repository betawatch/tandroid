package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dk0 extends bg.b {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public jk0 g;
    public int h;
    public boolean i;

    public static dk0 b(int i10, String str, boolean z4) {
        dk0 dk0Var = new dk0(1, true);
        dk0Var.c = i10;
        dk0Var.e = str;
        dk0Var.i = z4;
        return dk0Var;
    }

    public static dk0 c(int i10, String str, String str2) {
        dk0 dk0Var = new dk0(5, true);
        dk0Var.c = i10;
        dk0Var.e = str;
        dk0Var.f = str2;
        return dk0Var;
    }

    public static dk0 d(int i10, String str) {
        dk0 dk0Var = new dk0(4, true);
        dk0Var.c = i10;
        dk0Var.e = str;
        return dk0Var;
    }

    @Override // bg.b
    public final boolean a(bg.b bVar) {
        if (this == bVar) {
            return true;
        }
        if (dk0.class != bVar.getClass()) {
            return false;
        }
        dk0 dk0Var = (dk0) bVar;
        return this.c == dk0Var.c && this.d == dk0Var.d && this.h == dk0Var.h && this.i == dk0Var.i && Objects.equals(this.e, dk0Var.e) && Objects.equals(this.f, dk0Var.f) && this.g == dk0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dk0.class == obj.getClass()) {
            dk0 dk0Var = (dk0) obj;
            if (this.c == dk0Var.c && this.h == dk0Var.h && ((this.a == 8 || (this.d == dk0Var.d && Objects.equals(this.e, dk0Var.e) && (this.a == 6 || Objects.equals(this.f, dk0Var.f)))) && this.g == dk0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

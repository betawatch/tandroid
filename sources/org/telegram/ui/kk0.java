package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kk0 extends qg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public qk0 g;
    public int h;
    public boolean i;

    public static kk0 b(int i10, String str, boolean z10) {
        kk0 kk0Var = new kk0(1, true);
        kk0Var.c = i10;
        kk0Var.e = str;
        kk0Var.i = z10;
        return kk0Var;
    }

    public static kk0 c(int i10, String str, String str2) {
        kk0 kk0Var = new kk0(5, true);
        kk0Var.c = i10;
        kk0Var.e = str;
        kk0Var.f = str2;
        return kk0Var;
    }

    public static kk0 d(int i10, String str) {
        kk0 kk0Var = new kk0(4, true);
        kk0Var.c = i10;
        kk0Var.e = str;
        return kk0Var;
    }

    @Override // qg.a
    public final boolean a(qg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (kk0.class != aVar.getClass()) {
            return false;
        }
        kk0 kk0Var = (kk0) aVar;
        return this.c == kk0Var.c && this.d == kk0Var.d && this.h == kk0Var.h && this.i == kk0Var.i && Objects.equals(this.e, kk0Var.e) && Objects.equals(this.f, kk0Var.f) && this.g == kk0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kk0.class == obj.getClass()) {
            kk0 kk0Var = (kk0) obj;
            if (this.c == kk0Var.c && this.h == kk0Var.h && ((this.a == 8 || (this.d == kk0Var.d && Objects.equals(this.e, kk0Var.e) && (this.a == 6 || Objects.equals(this.f, kk0Var.f)))) && this.g == kk0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

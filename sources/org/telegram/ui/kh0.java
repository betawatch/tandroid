package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class kh0 extends rg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public oh0 g;
    public int h;
    public boolean i;

    public static kh0 b(int i7, String str, boolean z9) {
        kh0 kh0Var = new kh0(1, true);
        kh0Var.c = i7;
        kh0Var.e = str;
        kh0Var.i = z9;
        return kh0Var;
    }

    public static kh0 c(int i7, String str, String str2) {
        kh0 kh0Var = new kh0(5, true);
        kh0Var.c = i7;
        kh0Var.e = str;
        kh0Var.f = str2;
        return kh0Var;
    }

    public static kh0 d(int i7, String str) {
        kh0 kh0Var = new kh0(4, true);
        kh0Var.c = i7;
        kh0Var.e = str;
        return kh0Var;
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (kh0.class != aVar.getClass()) {
            return false;
        }
        kh0 kh0Var = (kh0) aVar;
        return this.c == kh0Var.c && this.d == kh0Var.d && this.h == kh0Var.h && this.i == kh0Var.i && Objects.equals(this.e, kh0Var.e) && Objects.equals(this.f, kh0Var.f) && this.g == kh0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kh0.class == obj.getClass()) {
            kh0 kh0Var = (kh0) obj;
            if (this.c == kh0Var.c && this.h == kh0Var.h && ((this.a == 8 || (this.d == kh0Var.d && Objects.equals(this.e, kh0Var.e) && (this.a == 6 || Objects.equals(this.f, kh0Var.f)))) && this.g == kh0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

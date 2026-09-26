package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class hk0 extends og.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public nk0 g;
    public int h;
    public boolean i;

    public static hk0 b(int i10, String str, boolean z10) {
        hk0 hk0Var = new hk0(1, true);
        hk0Var.c = i10;
        hk0Var.e = str;
        hk0Var.i = z10;
        return hk0Var;
    }

    public static hk0 c(int i10, String str, String str2) {
        hk0 hk0Var = new hk0(5, true);
        hk0Var.c = i10;
        hk0Var.e = str;
        hk0Var.f = str2;
        return hk0Var;
    }

    public static hk0 d(int i10, String str) {
        hk0 hk0Var = new hk0(4, true);
        hk0Var.c = i10;
        hk0Var.e = str;
        return hk0Var;
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (hk0.class != aVar.getClass()) {
            return false;
        }
        hk0 hk0Var = (hk0) aVar;
        return this.c == hk0Var.c && this.d == hk0Var.d && this.h == hk0Var.h && this.i == hk0Var.i && Objects.equals(this.e, hk0Var.e) && Objects.equals(this.f, hk0Var.f) && this.g == hk0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hk0.class == obj.getClass()) {
            hk0 hk0Var = (hk0) obj;
            if (this.c == hk0Var.c && this.h == hk0Var.h && ((this.a == 8 || (this.d == hk0Var.d && Objects.equals(this.e, hk0Var.e) && (this.a == 6 || Objects.equals(this.f, hk0Var.f)))) && this.g == hk0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

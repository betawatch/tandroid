package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lk0 extends og.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public rk0 g;
    public int h;
    public boolean i;

    public static lk0 b(int i10, String str, boolean z10) {
        lk0 lk0Var = new lk0(1, true);
        lk0Var.c = i10;
        lk0Var.e = str;
        lk0Var.i = z10;
        return lk0Var;
    }

    public static lk0 c(int i10, String str, String str2) {
        lk0 lk0Var = new lk0(5, true);
        lk0Var.c = i10;
        lk0Var.e = str;
        lk0Var.f = str2;
        return lk0Var;
    }

    public static lk0 d(int i10, String str) {
        lk0 lk0Var = new lk0(4, true);
        lk0Var.c = i10;
        lk0Var.e = str;
        return lk0Var;
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (lk0.class != aVar.getClass()) {
            return false;
        }
        lk0 lk0Var = (lk0) aVar;
        return this.c == lk0Var.c && this.d == lk0Var.d && this.h == lk0Var.h && this.i == lk0Var.i && Objects.equals(this.e, lk0Var.e) && Objects.equals(this.f, lk0Var.f) && this.g == lk0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lk0.class == obj.getClass()) {
            lk0 lk0Var = (lk0) obj;
            if (this.c == lk0Var.c && this.h == lk0Var.h && ((this.a == 8 || (this.d == lk0Var.d && Objects.equals(this.e, lk0Var.e) && (this.a == 6 || Objects.equals(this.f, lk0Var.f)))) && this.g == lk0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

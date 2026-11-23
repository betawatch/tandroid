package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class oh0 extends rg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public sh0 g;
    public int h;
    public boolean i;

    public static oh0 b(int i7, String str, boolean z10) {
        oh0 oh0Var = new oh0(1, true);
        oh0Var.c = i7;
        oh0Var.e = str;
        oh0Var.i = z10;
        return oh0Var;
    }

    public static oh0 c(int i7, String str, String str2) {
        oh0 oh0Var = new oh0(5, true);
        oh0Var.c = i7;
        oh0Var.e = str;
        oh0Var.f = str2;
        return oh0Var;
    }

    public static oh0 d(int i7, String str) {
        oh0 oh0Var = new oh0(4, true);
        oh0Var.c = i7;
        oh0Var.e = str;
        return oh0Var;
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (oh0.class != aVar.getClass()) {
            return false;
        }
        oh0 oh0Var = (oh0) aVar;
        return this.c == oh0Var.c && this.d == oh0Var.d && this.h == oh0Var.h && this.i == oh0Var.i && Objects.equals(this.e, oh0Var.e) && Objects.equals(this.f, oh0Var.f) && this.g == oh0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oh0.class == obj.getClass()) {
            oh0 oh0Var = (oh0) obj;
            if (this.c == oh0Var.c && this.h == oh0Var.h && ((this.a == 8 || (this.d == oh0Var.d && Objects.equals(this.e, oh0Var.e) && (this.a == 6 || Objects.equals(this.f, oh0Var.f)))) && this.g == oh0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

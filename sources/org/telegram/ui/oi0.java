package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class oi0 extends hg.b {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public si0 g;
    public int h;
    public boolean i;

    public static oi0 b(int i10, String str, boolean z10) {
        oi0 oi0Var = new oi0(1, true);
        oi0Var.c = i10;
        oi0Var.e = str;
        oi0Var.i = z10;
        return oi0Var;
    }

    public static oi0 c(int i10, String str, String str2) {
        oi0 oi0Var = new oi0(5, true);
        oi0Var.c = i10;
        oi0Var.e = str;
        oi0Var.f = str2;
        return oi0Var;
    }

    public static oi0 d(int i10, String str) {
        oi0 oi0Var = new oi0(4, true);
        oi0Var.c = i10;
        oi0Var.e = str;
        return oi0Var;
    }

    @Override // hg.b
    public final boolean a(hg.b bVar) {
        if (this == bVar) {
            return true;
        }
        if (oi0.class != bVar.getClass()) {
            return false;
        }
        oi0 oi0Var = (oi0) bVar;
        return this.c == oi0Var.c && this.d == oi0Var.d && this.h == oi0Var.h && this.i == oi0Var.i && Objects.equals(this.e, oi0Var.e) && Objects.equals(this.f, oi0Var.f) && this.g == oi0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oi0.class == obj.getClass()) {
            oi0 oi0Var = (oi0) obj;
            if (this.c == oi0Var.c && this.h == oi0Var.h && ((this.a == 8 || (this.d == oi0Var.d && Objects.equals(this.e, oi0Var.e) && (this.a == 6 || Objects.equals(this.f, oi0Var.f)))) && this.g == oi0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

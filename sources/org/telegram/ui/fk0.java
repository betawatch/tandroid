package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fk0 extends cg.b {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public lk0 g;
    public int h;
    public boolean i;

    public static fk0 b(int i10, String str, boolean z4) {
        fk0 fk0Var = new fk0(1, true);
        fk0Var.c = i10;
        fk0Var.e = str;
        fk0Var.i = z4;
        return fk0Var;
    }

    public static fk0 c(int i10, String str, String str2) {
        fk0 fk0Var = new fk0(5, true);
        fk0Var.c = i10;
        fk0Var.e = str;
        fk0Var.f = str2;
        return fk0Var;
    }

    public static fk0 d(int i10, String str) {
        fk0 fk0Var = new fk0(4, true);
        fk0Var.c = i10;
        fk0Var.e = str;
        return fk0Var;
    }

    @Override // cg.b
    public final boolean a(cg.b bVar) {
        if (this == bVar) {
            return true;
        }
        if (fk0.class != bVar.getClass()) {
            return false;
        }
        fk0 fk0Var = (fk0) bVar;
        return this.c == fk0Var.c && this.d == fk0Var.d && this.h == fk0Var.h && this.i == fk0Var.i && Objects.equals(this.e, fk0Var.e) && Objects.equals(this.f, fk0Var.f) && this.g == fk0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fk0.class == obj.getClass()) {
            fk0 fk0Var = (fk0) obj;
            if (this.c == fk0Var.c && this.h == fk0Var.h && ((this.a == 8 || (this.d == fk0Var.d && Objects.equals(this.e, fk0Var.e) && (this.a == 6 || Objects.equals(this.f, fk0Var.f)))) && this.g == fk0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ik0 extends qg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public ok0 g;
    public int h;
    public boolean i;

    public static ik0 b(int i10, String str, boolean z10) {
        ik0 ik0Var = new ik0(1, true);
        ik0Var.c = i10;
        ik0Var.e = str;
        ik0Var.i = z10;
        return ik0Var;
    }

    public static ik0 c(int i10, String str, String str2) {
        ik0 ik0Var = new ik0(5, true);
        ik0Var.c = i10;
        ik0Var.e = str;
        ik0Var.f = str2;
        return ik0Var;
    }

    public static ik0 d(int i10, String str) {
        ik0 ik0Var = new ik0(4, true);
        ik0Var.c = i10;
        ik0Var.e = str;
        return ik0Var;
    }

    @Override // qg.a
    public final boolean a(qg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (ik0.class != aVar.getClass()) {
            return false;
        }
        ik0 ik0Var = (ik0) aVar;
        return this.c == ik0Var.c && this.d == ik0Var.d && this.h == ik0Var.h && this.i == ik0Var.i && Objects.equals(this.e, ik0Var.e) && Objects.equals(this.f, ik0Var.f) && this.g == ik0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ik0.class == obj.getClass()) {
            ik0 ik0Var = (ik0) obj;
            if (this.c == ik0Var.c && this.h == ik0Var.h && ((this.a == 8 || (this.d == ik0Var.d && Objects.equals(this.e, ik0Var.e) && (this.a == 6 || Objects.equals(this.f, ik0Var.f)))) && this.g == ik0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

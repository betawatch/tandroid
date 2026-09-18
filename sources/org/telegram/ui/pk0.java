package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class pk0 extends og.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public vk0 g;
    public int h;
    public boolean i;

    public static pk0 b(int i10, String str, boolean z10) {
        pk0 pk0Var = new pk0(1, true);
        pk0Var.c = i10;
        pk0Var.e = str;
        pk0Var.i = z10;
        return pk0Var;
    }

    public static pk0 c(int i10, String str, String str2) {
        pk0 pk0Var = new pk0(5, true);
        pk0Var.c = i10;
        pk0Var.e = str;
        pk0Var.f = str2;
        return pk0Var;
    }

    public static pk0 d(int i10, String str) {
        pk0 pk0Var = new pk0(4, true);
        pk0Var.c = i10;
        pk0Var.e = str;
        return pk0Var;
    }

    @Override // og.a
    public final boolean a(og.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (pk0.class != aVar.getClass()) {
            return false;
        }
        pk0 pk0Var = (pk0) aVar;
        return this.c == pk0Var.c && this.d == pk0Var.d && this.h == pk0Var.h && this.i == pk0Var.i && Objects.equals(this.e, pk0Var.e) && Objects.equals(this.f, pk0Var.f) && this.g == pk0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pk0.class == obj.getClass()) {
            pk0 pk0Var = (pk0) obj;
            if (this.c == pk0Var.c && this.h == pk0Var.h && ((this.a == 8 || (this.d == pk0Var.d && Objects.equals(this.e, pk0Var.e) && (this.a == 6 || Objects.equals(this.f, pk0Var.f)))) && this.g == pk0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

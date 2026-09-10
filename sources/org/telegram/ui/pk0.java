package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pk0 extends ng.a {
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

    @Override // ng.a
    public final boolean a(ng.a aVar) {
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

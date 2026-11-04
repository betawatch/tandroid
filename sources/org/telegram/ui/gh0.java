package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gh0 extends sg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public lh0 g;
    public int h;
    public boolean i;

    public static gh0 b(int i3, String str, boolean z10) {
        gh0 gh0Var = new gh0(1, true);
        gh0Var.c = i3;
        gh0Var.e = str;
        gh0Var.i = z10;
        return gh0Var;
    }

    public static gh0 c(int i3, String str, String str2) {
        gh0 gh0Var = new gh0(5, true);
        gh0Var.c = i3;
        gh0Var.e = str;
        gh0Var.f = str2;
        return gh0Var;
    }

    public static gh0 d(int i3, String str) {
        gh0 gh0Var = new gh0(4, true);
        gh0Var.c = i3;
        gh0Var.e = str;
        return gh0Var;
    }

    @Override // sg.a
    public final boolean a(sg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (gh0.class != aVar.getClass()) {
            return false;
        }
        gh0 gh0Var = (gh0) aVar;
        return this.c == gh0Var.c && this.d == gh0Var.d && this.h == gh0Var.h && this.i == gh0Var.i && Objects.equals(this.e, gh0Var.e) && Objects.equals(this.f, gh0Var.f) && this.g == gh0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gh0.class == obj.getClass()) {
            gh0 gh0Var = (gh0) obj;
            if (this.c == gh0Var.c && this.h == gh0Var.h && ((this.a == 8 || (this.d == gh0Var.d && Objects.equals(this.e, gh0Var.e) && (this.a == 6 || Objects.equals(this.f, gh0Var.f)))) && this.g == gh0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

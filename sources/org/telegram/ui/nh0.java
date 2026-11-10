package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nh0 extends rg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public rh0 g;
    public int h;
    public boolean i;

    public static nh0 b(int i7, String str, boolean z9) {
        nh0 nh0Var = new nh0(1, true);
        nh0Var.c = i7;
        nh0Var.e = str;
        nh0Var.i = z9;
        return nh0Var;
    }

    public static nh0 c(int i7, String str, String str2) {
        nh0 nh0Var = new nh0(5, true);
        nh0Var.c = i7;
        nh0Var.e = str;
        nh0Var.f = str2;
        return nh0Var;
    }

    public static nh0 d(int i7, String str) {
        nh0 nh0Var = new nh0(4, true);
        nh0Var.c = i7;
        nh0Var.e = str;
        return nh0Var;
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (nh0.class != aVar.getClass()) {
            return false;
        }
        nh0 nh0Var = (nh0) aVar;
        return this.c == nh0Var.c && this.d == nh0Var.d && this.h == nh0Var.h && this.i == nh0Var.i && Objects.equals(this.e, nh0Var.e) && Objects.equals(this.f, nh0Var.f) && this.g == nh0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nh0.class == obj.getClass()) {
            nh0 nh0Var = (nh0) obj;
            if (this.c == nh0Var.c && this.h == nh0Var.h && ((this.a == 8 || (this.d == nh0Var.d && Objects.equals(this.e, nh0Var.e) && (this.a == 6 || Objects.equals(this.f, nh0Var.f)))) && this.g == nh0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

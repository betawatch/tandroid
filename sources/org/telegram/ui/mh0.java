package org.telegram.ui;

import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mh0 extends rg.a {
    public int c;
    public int d;
    public CharSequence e;
    public CharSequence f;
    public qh0 g;
    public int h;
    public boolean i;

    public static mh0 b(int i7, String str, boolean z9) {
        mh0 mh0Var = new mh0(1, true);
        mh0Var.c = i7;
        mh0Var.e = str;
        mh0Var.i = z9;
        return mh0Var;
    }

    public static mh0 c(int i7, String str, String str2) {
        mh0 mh0Var = new mh0(5, true);
        mh0Var.c = i7;
        mh0Var.e = str;
        mh0Var.f = str2;
        return mh0Var;
    }

    public static mh0 d(int i7, String str) {
        mh0 mh0Var = new mh0(4, true);
        mh0Var.c = i7;
        mh0Var.e = str;
        return mh0Var;
    }

    @Override // rg.a
    public final boolean a(rg.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (mh0.class != aVar.getClass()) {
            return false;
        }
        mh0 mh0Var = (mh0) aVar;
        return this.c == mh0Var.c && this.d == mh0Var.d && this.h == mh0Var.h && this.i == mh0Var.i && Objects.equals(this.e, mh0Var.e) && Objects.equals(this.f, mh0Var.f) && this.g == mh0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mh0.class == obj.getClass()) {
            mh0 mh0Var = (mh0) obj;
            if (this.c == mh0Var.c && this.h == mh0Var.h && ((this.a == 8 || (this.d == mh0Var.d && Objects.equals(this.e, mh0Var.e) && (this.a == 6 || Objects.equals(this.f, mh0Var.f)))) && this.g == mh0Var.g)) {
                return true;
            }
        }
        return false;
    }
}

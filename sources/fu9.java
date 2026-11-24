// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fu9 extends age {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ ju9 j;

    public fu9(ju9 ju9Var, int i, int i2, int i3, int i4, int i5, ArrayList arrayList, int i6, int i7, ArrayList arrayList2) {
        this.j = ju9Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = arrayList;
        this.g = i6;
        this.h = i7;
        this.i = arrayList2;
    }

    @Override // age
    public final boolean a(int i, int i2) {
        return b(i, i2);
    }

    @Override // age
    public final boolean b(int i, int i2) {
        k47 k47Var;
        ju9 ju9Var = this.j;
        if (i >= 0 && i2 >= 0) {
            if (i == this.b && i2 == ju9Var.s) {
                return true;
            }
            if (i == this.c && i2 == ju9Var.y) {
                return true;
            }
        }
        k47 k47Var2 = null;
        int i3 = this.d;
        if (i < i3 || i >= this.e) {
            int i4 = this.g;
            k47Var = (i < i4 || i >= this.h) ? null : (k47) this.i.get(i - i4);
        } else {
            k47Var = (k47) this.f.get(i - i3);
        }
        int i5 = ju9Var.w;
        if (i2 < i5 || i2 >= ju9Var.x) {
            int i6 = ju9Var.E;
            if (i2 >= i6 && i2 < ju9Var.F) {
                k47Var2 = (k47) ju9Var.f.get(i2 - i6);
            }
        } else {
            k47Var2 = (k47) ju9Var.e.get(i2 - i5);
        }
        return (k47Var2 == null || k47Var == null || k47Var2.F0() == null || k47Var.F0() == null || k47Var2.F0().id != k47Var.F0().id) ? false : true;
    }

    @Override // age
    public final int c() {
        return this.j.r;
    }

    @Override // age
    public final int d() {
        return this.a;
    }
}

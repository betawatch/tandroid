package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ur {
    public final int a;
    public String b;
    public final ArrayList c;
    public final boolean[] d;
    public boolean[] e;
    public boolean f;
    public final int g;
    public int h;
    public int i;
    public final /* synthetic */ vr j;

    public ur(vr vrVar, int i10, ArrayList arrayList) {
        this.j = vrVar;
        this.a = i10;
        int size = arrayList.size();
        this.g = size;
        this.i = 0;
        if (size > 0) {
            this.c = arrayList;
            this.d = new boolean[size];
            this.f = true;
            i();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i10 = 0; i10 < this.g; i10++) {
            if (!this.d[i10] || ((zArr = this.e) != null && !zArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void b(org.telegram.messenger.t20 t20Var) {
        for (int i10 = 0; i10 < this.g; i10++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i10]) {
                t20Var.a(i10, (TLObject) this.c.get(i10));
            }
        }
    }

    public final void c(org.telegram.messenger.t20 t20Var) {
        boolean[] zArr;
        for (int i10 = 0; i10 < this.g; i10++) {
            if (this.d[i10] && ((zArr = this.e) == null || zArr[i10])) {
                t20Var.a(i10, (TLObject) this.c.get(i10));
            }
        }
    }

    public final boolean d() {
        return (this.e != null ? this.h : this.g) > 1;
    }

    public final boolean e() {
        return (this.e != null ? this.h : this.g) > 0;
    }

    public final void f() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            int i11 = this.g;
            zArr = this.d;
            if (i10 >= i11) {
                break;
            }
            if (!zArr[i10] || ((zArr2 = this.e) != null && !zArr2[i10])) {
                i10++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        h();
        this.j.P1.O(true);
    }

    public final void g(int i10) {
        boolean[] zArr = this.e;
        if (zArr == null || zArr[i10]) {
            boolean[] zArr2 = this.d;
            boolean z10 = zArr2[i10];
            zArr2[i10] = !z10;
            if (z10) {
                this.i--;
            } else {
                this.i++;
            }
            this.j.P1.O(true);
        }
    }

    public final void h() {
        this.i = 0;
        this.h = 0;
        for (int i10 = 0; i10 < this.g; i10++) {
            boolean[] zArr = this.e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i10]) {
                    this.i++;
                }
            } else if (zArr[i10]) {
                this.h++;
                if (zArr2[i10]) {
                    this.i++;
                }
            }
        }
    }

    public final void i() {
        TLObject tLObject;
        int i10 = this.g;
        if (i10 == 0) {
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i11]) {
                tLObject = (TLObject) this.c.get(i11);
                break;
            }
        }
        tLObject = null;
        String k10 = tLObject instanceof TLRPC.User ? org.telegram.messenger.h20.k((TLRPC.User) tLObject) : org.telegram.messenger.i5.o(tLObject);
        int i12 = this.a;
        if (i12 == 0) {
            this.b = org.telegram.messenger.cd.L0(2131751503, null);
            return;
        }
        if (i12 == 1) {
            this.b = d() ? org.telegram.messenger.cd.L0(2131751583, null) : org.telegram.messenger.cd.a0(null, null, 2131751588, k10);
            return;
        }
        if (i12 == 3) {
            this.b = d() ? org.telegram.messenger.cd.L0(2131751578, null) : org.telegram.messenger.cd.a0(null, null, 2131751579, k10);
        } else if (i12 == 2) {
            if (this.j.Y1) {
                this.b = d() ? org.telegram.messenger.cd.L0(2131751501, null) : org.telegram.messenger.cd.a0(null, null, 2131751502, k10);
            } else {
                this.b = d() ? org.telegram.messenger.cd.L0(2131751568, null) : org.telegram.messenger.cd.a0(null, null, 2131751569, k10);
            }
        }
    }
}

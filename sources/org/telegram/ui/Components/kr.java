package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kr {
    public final int a;
    public String b;
    public final ArrayList c;
    public final boolean[] d;
    public boolean[] e;
    public boolean f;
    public final int g;
    public int h;
    public int i;
    public final /* synthetic */ lr j;

    public kr(lr lrVar, int i3, ArrayList arrayList) {
        this.j = lrVar;
        this.a = i3;
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
        for (int i3 = 0; i3 < this.g; i3++) {
            if (!this.d[i3] || ((zArr = this.e) != null && !zArr[i3])) {
                return false;
            }
        }
        return true;
    }

    public final void b(org.telegram.messenger.x10 x10Var) {
        for (int i3 = 0; i3 < this.g; i3++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i3]) {
                x10Var.a(i3, (TLObject) this.c.get(i3));
            }
        }
    }

    public final void c(org.telegram.messenger.x10 x10Var) {
        boolean[] zArr;
        for (int i3 = 0; i3 < this.g; i3++) {
            if (this.d[i3] && ((zArr = this.e) == null || zArr[i3])) {
                x10Var.a(i3, (TLObject) this.c.get(i3));
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
        int i3 = 0;
        while (true) {
            int i10 = this.g;
            zArr = this.d;
            if (i3 >= i10) {
                break;
            }
            if (!zArr[i3] || ((zArr2 = this.e) != null && !zArr2[i3])) {
                i3++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        h();
        this.j.Q1.O(true);
    }

    public final void g(int i3) {
        boolean[] zArr = this.e;
        if (zArr == null || zArr[i3]) {
            boolean[] zArr2 = this.d;
            boolean z10 = zArr2[i3];
            zArr2[i3] = !z10;
            if (z10) {
                this.i--;
            } else {
                this.i++;
            }
            this.j.Q1.O(true);
        }
    }

    public final void h() {
        this.i = 0;
        this.h = 0;
        for (int i3 = 0; i3 < this.g; i3++) {
            boolean[] zArr = this.e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i3]) {
                    this.i++;
                }
            } else if (zArr[i3]) {
                this.h++;
                if (zArr2[i3]) {
                    this.i++;
                }
            }
        }
    }

    public final void i() {
        TLObject tLObject;
        int i3 = this.g;
        if (i3 == 0) {
            return;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i10]) {
                tLObject = (TLObject) this.c.get(i10);
                break;
            }
        }
        tLObject = null;
        String k10 = tLObject instanceof TLRPC.User ? org.telegram.messenger.l10.k((TLRPC.User) tLObject) : org.telegram.messenger.g5.o(tLObject);
        int i11 = this.a;
        if (i11 == 0) {
            this.b = org.telegram.messenger.bd.M0(2131751503, null);
            return;
        }
        if (i11 == 1) {
            this.b = d() ? org.telegram.messenger.bd.M0(2131751583, null) : org.telegram.messenger.bd.a0(null, null, 2131751588, k10);
            return;
        }
        if (i11 == 3) {
            this.b = d() ? org.telegram.messenger.bd.M0(2131751578, null) : org.telegram.messenger.bd.a0(null, null, 2131751579, k10);
        } else if (i11 == 2) {
            if (this.j.Z1) {
                this.b = d() ? org.telegram.messenger.bd.M0(2131751501, null) : org.telegram.messenger.bd.a0(null, null, 2131751502, k10);
            } else {
                this.b = d() ? org.telegram.messenger.bd.M0(2131751568, null) : org.telegram.messenger.bd.a0(null, null, 2131751569, k10);
            }
        }
    }
}

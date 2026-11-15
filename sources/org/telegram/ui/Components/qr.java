package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qr {
    public final int a;
    public String b;
    public final ArrayList c;
    public final boolean[] d;
    public boolean[] e;
    public boolean f;
    public final int g;
    public int h;
    public int i;
    public final /* synthetic */ rr j;

    public qr(rr rrVar, int i7, ArrayList arrayList) {
        this.j = rrVar;
        this.a = i7;
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
        for (int i7 = 0; i7 < this.g; i7++) {
            if (!this.d[i7] || ((zArr = this.e) != null && !zArr[i7])) {
                return false;
            }
        }
        return true;
    }

    public final void b(org.telegram.messenger.c20 c20Var) {
        for (int i7 = 0; i7 < this.g; i7++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i7]) {
                c20Var.a(i7, (TLObject) this.c.get(i7));
            }
        }
    }

    public final void c(org.telegram.messenger.c20 c20Var) {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.g; i7++) {
            if (this.d[i7] && ((zArr = this.e) == null || zArr[i7])) {
                c20Var.a(i7, (TLObject) this.c.get(i7));
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
        int i7 = 0;
        while (true) {
            int i10 = this.g;
            zArr = this.d;
            if (i7 >= i10) {
                break;
            }
            if (!zArr[i7] || ((zArr2 = this.e) != null && !zArr2[i7])) {
                i7++;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        h();
        this.j.T1.O(true);
    }

    public final void g(int i7) {
        boolean[] zArr = this.e;
        if (zArr == null || zArr[i7]) {
            boolean[] zArr2 = this.d;
            boolean z10 = zArr2[i7];
            zArr2[i7] = !z10;
            if (z10) {
                this.i--;
            } else {
                this.i++;
            }
            this.j.T1.O(true);
        }
    }

    public final void h() {
        this.i = 0;
        this.h = 0;
        for (int i7 = 0; i7 < this.g; i7++) {
            boolean[] zArr = this.e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i7]) {
                    this.i++;
                }
            } else if (zArr[i7]) {
                this.h++;
                if (zArr2[i7]) {
                    this.i++;
                }
            }
        }
    }

    public final void i() {
        TLObject tLObject;
        int i7 = this.g;
        if (i7 == 0) {
            return;
        }
        for (int i10 = 0; i10 < i7; i10++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i10]) {
                tLObject = (TLObject) this.c.get(i10);
                break;
            }
        }
        tLObject = null;
        String k10 = tLObject instanceof TLRPC.User ? org.telegram.messenger.q10.k((TLRPC.User) tLObject) : org.telegram.messenger.g5.o(tLObject);
        int i11 = this.a;
        if (i11 == 0) {
            this.b = org.telegram.messenger.hd.M0(2131751502, null);
            return;
        }
        if (i11 == 1) {
            this.b = d() ? org.telegram.messenger.hd.M0(2131751582, null) : org.telegram.messenger.hd.a0(null, null, 2131751587, k10);
            return;
        }
        if (i11 == 3) {
            this.b = d() ? org.telegram.messenger.hd.M0(2131751577, null) : org.telegram.messenger.hd.a0(null, null, 2131751578, k10);
        } else if (i11 == 2) {
            if (this.j.c2) {
                this.b = d() ? org.telegram.messenger.hd.M0(2131751500, null) : org.telegram.messenger.hd.a0(null, null, 2131751501, k10);
            } else {
                this.b = d() ? org.telegram.messenger.hd.M0(2131751567, null) : org.telegram.messenger.hd.a0(null, null, 2131751568, k10);
            }
        }
    }
}

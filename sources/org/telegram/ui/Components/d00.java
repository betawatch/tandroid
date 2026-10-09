package org.telegram.ui.Components;

import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class d00 extends s4.s {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public d00(int i10, boolean z10) {
        super(i10);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static mw0 C1(mw0 mw0Var) {
        if (mw0Var == null) {
            return null;
        }
        if (mw0Var.a == 0.0f) {
            mw0Var.a = 100.0f;
        }
        if (mw0Var.b == 0.0f) {
            mw0Var.b = 100.0f;
        }
        float f7 = mw0Var.a;
        float f10 = mw0Var.b;
        float f11 = f7 / f10;
        if (f11 <= 4.0f && f11 >= 0.2f) {
            return mw0Var;
        }
        float max = Math.max(f7, f10);
        mw0Var.a = max;
        mw0Var.b = max;
        return mw0Var;
    }

    public final void B1() {
        int i10;
        int min;
        boolean z10;
        float f7;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() == A() && this.W == this.m && this.T == this.J) {
            return;
        }
        int i11 = this.m;
        this.W = i11;
        float f10 = i11;
        if (f10 == 0.0f) {
            f10 = 100.0f;
        }
        sparseIntArray.clear();
        SparseIntArray sparseIntArray2 = this.S;
        sparseIntArray2.clear();
        boolean z11 = false;
        this.V = 0;
        this.U = 0;
        int A = A();
        this.T = A;
        if (A == 0) {
            return;
        }
        int dp = AndroidUtilities.dp(100.0f);
        int i12 = this.J;
        boolean z12 = this.Q;
        int i13 = A + (z12 ? 1 : 0);
        int i14 = 0;
        int i15 = 0;
        int i16 = i12;
        while (i14 < i13) {
            mw0 C1 = i14 < A ? C1(D1(i14)) : null;
            if (C1 == null) {
                z10 = i15 != 0 ? true : z11;
                i10 = dp;
                min = i12;
            } else {
                i10 = dp;
                min = Math.min(i12, (int) Math.floor((((C1.a / C1.b) * dp) / f10) * i12));
                boolean z13 = i16 < min || (min > 33 && i16 < min + (-15));
                if (C1.c) {
                    sparseIntArray.put(i14, i16);
                    this.V++;
                    f7 = f10;
                    i16 = i12;
                    i15 = 0;
                    i14++;
                    dp = i10;
                    f10 = f7;
                    z11 = false;
                } else {
                    z10 = z13;
                }
            }
            if (z10) {
                if (i16 == 0 || i15 == 0) {
                    f7 = f10;
                } else {
                    int i17 = i16 / i15;
                    int i18 = i14 - i15;
                    f7 = f10;
                    int i19 = i18;
                    while (true) {
                        int i20 = i18 + i15;
                        if (i19 >= i20) {
                            break;
                        }
                        if (i19 == i20 - 1) {
                            sparseIntArray.put(i19, sparseIntArray.get(i19) + i16);
                        } else {
                            sparseIntArray.put(i19, sparseIntArray.get(i19) + i17);
                        }
                        i16 -= i17;
                        i19++;
                    }
                    sparseIntArray2.put(i14 - 1, this.V);
                }
                if (i14 == A) {
                    break;
                }
                this.V++;
                i16 = i12;
                i15 = 0;
            } else {
                f7 = f10;
                if (i16 < min) {
                    min = i16;
                }
            }
            if (this.V == 0) {
                this.U = Math.max(this.U, i14);
            }
            if (i14 == A - 1 && !z12) {
                sparseIntArray2.put(i14, this.V);
            }
            i15++;
            i16 -= min;
            sparseIntArray.put(i14, min);
            i14++;
            dp = i10;
            f10 = f7;
            z11 = false;
        }
        this.V++;
    }

    public mw0 D1(int i10) {
        return new mw0(100.0f, 100.0f);
    }

    public final boolean E1(int i10) {
        B1();
        return this.S.get(i10, ConnectionsManager.DEFAULT_DATACENTER_ID) != Integer.MAX_VALUE;
    }

    @Override // s4.s, s4.p0
    public final int I(pf.e eVar, s4.a1 a1Var) {
        return a1Var.b();
    }

    @Override // s4.s, s4.p0
    public final int u(pf.e eVar, s4.a1 a1Var) {
        return 1;
    }

    @Override // s4.s, s4.d0, s4.p0
    public boolean y0() {
        return false;
    }
}

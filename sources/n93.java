// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n93 extends y61 {
    public final /* synthetic */ o93 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n93(o93 o93Var, Context context, int i, int[] iArr, int[] iArr2) {
        super(context, i, iArr, 1, iArr2);
        this.f0 = o93Var;
    }

    @Override // y61
    public final int b() {
        return nm7.s3;
    }

    @Override // y61
    public final void c(int i, boolean z) {
        int i2;
        q93 q93Var = (q93) this.f0.e;
        if (!z) {
            q93Var.m1();
            return;
        }
        if (i < 0 || i >= q93Var.o3.length) {
            return;
        }
        int i3 = 0;
        while (true) {
            p93[] p93VarArr = q93Var.o3;
            i2 = -1;
            if (i3 >= p93VarArr.length) {
                i3 = -1;
                break;
            } else if (p93VarArr[i3].d == i) {
                break;
            } else {
                i3++;
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 < q93Var.k3.size()) {
                l93 l93Var = (l93) q93Var.k3.get(i4);
                if (l93Var != null && l93Var.a == 2 && l93Var.h == i3) {
                    i2 = i4;
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        if (i2 >= 0) {
            q93Var.f1(new pg(i2, (byte) 2), 0, true);
        } else {
            q93Var.m1();
        }
    }

    @Override // y61
    public final int d() {
        return 10;
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ org.telegram.messenger.r20 c;

    public /* synthetic */ pz0(int i10, org.telegram.messenger.r20 r20Var, boolean[] zArr) {
        this.a = i10;
        this.b = zArr;
        this.c = r20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.r20 r20Var;
        org.telegram.messenger.r20 r20Var2;
        org.telegram.messenger.r20 r20Var3;
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0] && (r20Var = this.c) != null) {
                    zArr[0] = true;
                    r20Var.a(Boolean.TRUE);
                }
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.n0(14), 220L);
                break;
            case 1:
                boolean[] zArr2 = this.b;
                if (!zArr2[0] && (r20Var2 = this.c) != null) {
                    zArr2[0] = true;
                    r20Var2.a(Boolean.FALSE);
                    break;
                }
                break;
            default:
                boolean[] zArr3 = this.b;
                if (!zArr3[0] && (r20Var3 = this.c) != null) {
                    r20Var3.a("cancelled");
                    zArr3[0] = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pz0(rh.e6 e6Var, boolean[] zArr, org.telegram.messenger.r20 r20Var) {
        this.a = 2;
        this.b = zArr;
        this.c = r20Var;
    }
}

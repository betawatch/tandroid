package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;

    public /* synthetic */ y6(i7 i7Var, int i7) {
        this.a = i7;
        this.b = i7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i7.a(this.b);
                break;
            case 1:
                i7 i7Var = this.b;
                if (i7Var.Y == 5) {
                    i7Var.j(1, false);
                    break;
                }
                break;
            case 2:
                this.b.F0.clear();
                break;
            case 3:
                this.b.s(-1);
                break;
            case 4:
                i7 i7Var2 = this.b;
                if (i7Var2.j) {
                    if (r2.a) {
                        a8.b("debug_loading: " + i7Var2.L0.getName() + " pause operation, clear requests");
                    }
                    i7Var2.e(null, false, true);
                    break;
                } else {
                    for (int i7 = 0; i7 < i7Var2.G0.size(); i7++) {
                        ConnectionsManager.getInstance(i7Var2.R).failNotRunningRequest(((h7) i7Var2.G0.get(i7)).a);
                    }
                    break;
                }
            case 5:
                i7.b(this.b);
                break;
            case 6:
                this.b.j(0, false);
                break;
            default:
                i7 i7Var3 = this.b;
                if (i7Var3.Y != 3 && i7Var3.Y != 2) {
                    i7Var3.Y = 5;
                    y6 y6Var = new y6(i7Var3, 1);
                    a8.b("cancelRequests".concat(" with callback"));
                    if (i7Var3.G0 != null) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[8];
                        for (int i10 = 0; i10 < i7Var3.G0.size(); i10++) {
                            h7 h7Var = (h7) i7Var3.G0.get(i10);
                            if (h7Var.a != 0) {
                                h7Var.j = true;
                                h7Var.l = new ng(h7Var, iArr, y6Var, 20);
                                iArr[0] = iArr[0] + 1;
                                a8.b("cancelRequests cancel " + h7Var.a + " with callback");
                                ConnectionsManager.getInstance(i7Var3.R).cancelRequest(h7Var.a, true, new b7(h7Var, 1));
                                int i11 = h7Var.d >>> 16;
                                iArr2[i11] = iArr2[i11] + h7Var.c;
                            }
                        }
                        for (int i12 = 0; i12 < 8; i12++) {
                            int i13 = (i12 << 16) | 2;
                            if (iArr2[i12] > ((!i7Var3.j || b6.g()) ? TLObject.FLAG_20 : 262144)) {
                                ConnectionsManager.getInstance(i7Var3.R).discardConnection(i7Var3.u0 ? i7Var3.y0 : i7Var3.T, i13);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}

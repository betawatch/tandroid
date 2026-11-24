// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l94 b;

    public /* synthetic */ b94(l94 l94Var, byte b) {
        this.a = b;
        this.b = l94Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        byte b2 = 1;
        l94 l94Var = this.b;
        switch (b) {
            case 0:
                if (l94Var.Y == 1 && !l94Var.Z) {
                    l94Var.q(-1);
                    break;
                }
                break;
            case 1:
                if (l94Var.Y == 5) {
                    l94Var.h(1, false);
                    break;
                }
                break;
            case 2:
                l94Var.F0.clear();
                break;
            case 3:
                l94Var.q(-1);
                break;
            case 4:
                if (l94Var.j) {
                    if (w01.a) {
                        fa4.b("debug_loading: " + l94Var.L0.getName() + " pause operation, clear requests");
                    }
                    l94Var.c(null, false, true);
                    break;
                } else {
                    while (i < l94Var.G0.size()) {
                        ConnectionsManager.getInstance(l94Var.R).failNotRunningRequest(((k94) l94Var.G0.get(i)).a);
                        i++;
                    }
                    break;
                }
            case 5:
                l94Var.j();
                ba4.G(l94Var.R).e(null, null, null, null, null, l94Var.r);
                break;
            case 6:
                l94Var.h(0, false);
                break;
            default:
                if (l94Var.Y != 3 && l94Var.Y != 2) {
                    l94Var.Y = (byte) 5;
                    b94 b94Var = new b94(l94Var, b2);
                    fa4.b("cancelRequests with callback");
                    if (l94Var.G0 != null) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[8];
                        for (int i2 = 0; i2 < l94Var.G0.size(); i2++) {
                            k94 k94Var = (k94) l94Var.G0.get(i2);
                            if (k94Var.a != 0) {
                                k94Var.j = true;
                                k94Var.l = new mg3(k94Var, iArr, b94Var, (byte) 21);
                                iArr[0] = iArr[0] + 1;
                                fa4.b("cancelRequests cancel " + k94Var.a + " with callback");
                                ConnectionsManager.getInstance(l94Var.R).cancelRequest(k94Var.a, true, new e94(k94Var, (byte) 1));
                                int i3 = k94Var.d >>> 16;
                                iArr2[i3] = iArr2[i3] + k94Var.c;
                            }
                        }
                        while (i < 8) {
                            int i4 = (i << 16) | 2;
                            if (iArr2[i] > ((!l94Var.j || yp3.d()) ? TLObject.FLAG_20 : 262144)) {
                                ConnectionsManager.getInstance(l94Var.R).discardConnection(l94Var.u0 ? l94Var.y0 : l94Var.T, i4);
                            }
                            i++;
                        }
                        break;
                    }
                }
                break;
        }
    }
}

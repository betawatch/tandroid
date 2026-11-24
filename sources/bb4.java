// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class bb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb4 b;

    public /* synthetic */ bb4(lb4 lb4Var, byte b) {
        this.a = b;
        this.b = lb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        byte b2 = 1;
        lb4 lb4Var = this.b;
        switch (b) {
            case 0:
                if (lb4Var.Y == 1 && !lb4Var.Z) {
                    lb4Var.q(-1);
                    break;
                }
                break;
            case 1:
                if (lb4Var.Y == 5) {
                    lb4Var.h(1, false);
                    break;
                }
                break;
            case 2:
                lb4Var.F0.clear();
                break;
            case 3:
                lb4Var.q(-1);
                break;
            case 4:
                if (lb4Var.j) {
                    if (e21.a) {
                        fc4.b("debug_loading: " + lb4Var.L0.getName() + " pause operation, clear requests");
                    }
                    lb4Var.c(null, false, true);
                    break;
                } else {
                    while (i < lb4Var.G0.size()) {
                        ConnectionsManager.getInstance(lb4Var.R).failNotRunningRequest(((kb4) lb4Var.G0.get(i)).a);
                        i++;
                    }
                    break;
                }
            case 5:
                lb4Var.j();
                bc4.G(lb4Var.R).e(null, null, null, null, null, lb4Var.r);
                break;
            case 6:
                lb4Var.h(0, false);
                break;
            default:
                if (lb4Var.Y != 3 && lb4Var.Y != 2) {
                    lb4Var.Y = (byte) 5;
                    bb4 bb4Var = new bb4(lb4Var, b2);
                    fc4.b("cancelRequests with callback");
                    if (lb4Var.G0 != null) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[8];
                        for (int i2 = 0; i2 < lb4Var.G0.size(); i2++) {
                            kb4 kb4Var = (kb4) lb4Var.G0.get(i2);
                            if (kb4Var.a != 0) {
                                kb4Var.j = true;
                                kb4Var.l = new pz2(kb4Var, iArr, bb4Var, (byte) 23);
                                iArr[0] = iArr[0] + 1;
                                fc4.b("cancelRequests cancel " + kb4Var.a + " with callback");
                                ConnectionsManager.getInstance(lb4Var.R).cancelRequest(kb4Var.a, true, new eb4(kb4Var, (byte) 1));
                                int i3 = kb4Var.d >>> 16;
                                iArr2[i3] = iArr2[i3] + kb4Var.c;
                            }
                        }
                        while (i < 8) {
                            int i4 = (i << 16) | 2;
                            if (iArr2[i] > ((!lb4Var.j || ir3.d()) ? TLObject.FLAG_20 : 262144)) {
                                ConnectionsManager.getInstance(lb4Var.R).discardConnection(lb4Var.u0 ? lb4Var.y0 : lb4Var.T, i4);
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

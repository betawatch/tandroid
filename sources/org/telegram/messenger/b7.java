package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;

    public /* synthetic */ b7(m7 m7Var, int i10) {
        this.a = i10;
        this.b = m7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m7.a(this.b);
                break;
            case 1:
                m7 m7Var = this.b;
                if (m7Var.Y == 5) {
                    m7Var.j(1, false);
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
                m7 m7Var2 = this.b;
                if (m7Var2.j) {
                    if (v2.a) {
                        f8.b("debug_loading: " + m7Var2.L0.getName() + " pause operation, clear requests");
                    }
                    m7Var2.e(null, false, true);
                    break;
                } else {
                    for (int i10 = 0; i10 < m7Var2.G0.size(); i10++) {
                        ConnectionsManager.getInstance(m7Var2.R).failNotRunningRequest(((l7) m7Var2.G0.get(i10)).a);
                    }
                    break;
                }
            case 5:
                m7.b(this.b);
                break;
            case 6:
                this.b.j(0, false);
                break;
            default:
                m7 m7Var3 = this.b;
                if (m7Var3.Y != 3 && m7Var3.Y != 2) {
                    m7Var3.Y = 5;
                    b7 b7Var = new b7(m7Var3, 1);
                    f8.b("cancelRequests".concat(" with callback"));
                    if (m7Var3.G0 != null) {
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[8];
                        for (int i11 = 0; i11 < m7Var3.G0.size(); i11++) {
                            l7 l7Var = (l7) m7Var3.G0.get(i11);
                            if (l7Var.a != 0) {
                                l7Var.j = true;
                                l7Var.l = new mg(l7Var, iArr, b7Var, 20);
                                iArr[0] = iArr[0] + 1;
                                f8.b("cancelRequests cancel " + l7Var.a + " with callback");
                                ConnectionsManager.getInstance(m7Var3.R).cancelRequest(l7Var.a, true, new f7(l7Var, 1));
                                int i12 = l7Var.d >>> 16;
                                iArr2[i12] = iArr2[i12] + l7Var.c;
                            }
                        }
                        for (int i13 = 0; i13 < 8; i13++) {
                            int i14 = (i13 << 16) | 2;
                            if (iArr2[i13] > ((!m7Var3.j || d6.g()) ? TLObject.FLAG_20 : 262144)) {
                                ConnectionsManager.getInstance(m7Var3.R).discardConnection(m7Var3.u0 ? m7Var3.y0 : m7Var3.T, i14);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}

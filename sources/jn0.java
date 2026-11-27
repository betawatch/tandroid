// default package

import java.io.File;
import org.telegram.messenger.ShortcutResultReceiver;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jn0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;

    public /* synthetic */ jn0(pcc pccVar, byte b) {
        this.a = b;
        this.b = pccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(null);
                break;
            case 1:
                pccVar.a(null);
                break;
            case 2:
                hl.c3(new jn0(pccVar, b2));
                break;
            case 3:
                z61.i0 = false;
                long m0 = z61.m0(xb4.j(4), 5);
                long m02 = z61.m0(xb4.j(4), 4);
                long m03 = z61.m0(xb4.j(100), 0) + z61.m0(xb4.j(0), 0);
                long m04 = z61.m0(xb4.j(101), 0) + z61.m0(xb4.j(2), 0);
                long m05 = z61.m0(xb4.j(5), 1) + z61.m0(xb4.j(3), 1);
                long m06 = z61.m0(xb4.j(5), 2) + z61.m0(xb4.j(3), 2);
                long m07 = z61.m0(xb4.j(4), 3) + z61.m0(new File(xb4.j(4), "acache"), 0);
                long m08 = z61.m0(xb4.j(1), 0);
                long m09 = z61.m0(xb4.j(6), 0);
                long m010 = z61.m0(hl.O0(), 1);
                boolean z = f11.a;
                long j = m0 + m02 + m04 + m08 + m03 + m05 + m06 + m07 + m09 + m010;
                z61.k0 = Long.valueOf(j);
                z61.j0 = System.currentTimeMillis();
                if (!z61.i0) {
                    hl.c3(new ve(pccVar, j, (byte) 1));
                    break;
                }
                break;
            case 4:
                if (pccVar != null) {
                    pccVar.a(null);
                    break;
                }
                break;
            case 5:
                if (pccVar != null) {
                    pccVar.a(null);
                    break;
                }
                break;
            case 6:
                if (pccVar != null) {
                    pccVar.a(null);
                    break;
                }
                break;
            case 7:
                if (pccVar != null) {
                    pccVar.a(null);
                    break;
                }
                break;
            case 8:
                if (pccVar != null) {
                    pccVar.a(null);
                    break;
                }
                break;
            case 9:
                pccVar.a(null);
                break;
            case 10:
                if (pccVar != null) {
                    pccVar.a(null);
                    break;
                }
                break;
            case 11:
                if (pccVar != null) {
                    pccVar.a(null);
                    break;
                }
                break;
            case 12:
                pccVar.a(new nza());
                break;
            case 13:
                int i = ShortcutResultReceiver.a;
                pccVar.a(Boolean.TRUE);
                break;
            case 14:
                pccVar.a(LaunchActivity.S());
                break;
            case 15:
                pccVar.a("Wallet engine is closed");
                break;
            case 16:
                pccVar.a(null);
                break;
            default:
                pccVar.a(null);
                break;
        }
    }
}

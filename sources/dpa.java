// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dpa extends yye {
    public final ey7 a = new ey7();
    public final zd1 b = new zd1();
    public usb c;

    @Override // yye
    public final vf7 b(xf7 xf7Var, ByteBuffer byteBuffer) {
        tf7 fpaVar;
        long j;
        usb usbVar = this.c;
        if (usbVar == null || xf7Var.r != usbVar.e()) {
            usb usbVar2 = new usb(xf7Var.e);
            this.c = usbVar2;
            usbVar2.a(xf7Var.e - xf7Var.r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ey7 ey7Var = this.a;
        ey7Var.L(limit, array);
        zd1 zd1Var = this.b;
        zd1Var.j(limit, array);
        zd1Var.n(39);
        long f = (zd1Var.f(1) << 32) | zd1Var.f(32);
        zd1Var.n(20);
        int f2 = zd1Var.f(12);
        int f3 = zd1Var.f(8);
        ey7Var.O(14);
        if (f3 == 0) {
            fpaVar = new fpa();
        } else if (f3 == 255) {
            long C = ey7Var.C();
            int i = f2 - 4;
            ey7Var.k(0, i, new byte[i]);
            fpaVar = new wn8(C, f, (byte) 0);
        } else if (f3 == 4) {
            int A = ey7Var.A();
            ArrayList arrayList = new ArrayList(A);
            for (int i2 = 0; i2 < A; i2++) {
                ey7Var.C();
                boolean z = (ey7Var.A() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int A2 = ey7Var.A();
                    boolean z2 = (A2 & 64) != 0;
                    boolean z3 = (A2 & 32) != 0;
                    if (z2) {
                        ey7Var.C();
                    } else {
                        int A3 = ey7Var.A();
                        ArrayList arrayList3 = new ArrayList(A3);
                        for (int i3 = 0; i3 < A3; i3++) {
                            ey7Var.A();
                            ey7Var.C();
                            arrayList3.add(new z3f((byte) 26));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        ey7Var.A();
                        ey7Var.C();
                    }
                    ey7Var.H();
                    ey7Var.A();
                    ey7Var.A();
                }
                arrayList.add(new j09(arrayList2));
            }
            fpaVar = new gpa(arrayList);
        } else if (f3 == 5) {
            usb usbVar3 = this.c;
            ey7Var.C();
            boolean z4 = (ey7Var.A() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int A4 = ey7Var.A();
                boolean z5 = (A4 & 64) != 0;
                boolean z6 = (A4 & 32) != 0;
                boolean z7 = (A4 & 16) != 0;
                long d = (!z5 || z7) ? -9223372036854775807L : wn8.d(f, ey7Var);
                if (!z5) {
                    int A5 = ey7Var.A();
                    ArrayList arrayList4 = new ArrayList(A5);
                    for (int i4 = 0; i4 < A5; i4++) {
                        ey7Var.A();
                        usbVar3.b(!z7 ? wn8.d(f, ey7Var) : -9223372036854775807L);
                        arrayList4.add(new sae());
                    }
                    list = arrayList4;
                }
                if (z6) {
                    ey7Var.A();
                    ey7Var.C();
                }
                ey7Var.H();
                ey7Var.A();
                ey7Var.A();
                j = d;
            }
            fpaVar = new epa(j, usbVar3.b(j), list);
        } else if (f3 != 6) {
            fpaVar = null;
        } else {
            usb usbVar4 = this.c;
            long d2 = wn8.d(f, ey7Var);
            fpaVar = new wn8(d2, usbVar4.b(d2), (byte) 1);
        }
        return fpaVar == null ? new vf7(new tf7[0]) : new vf7(fpaVar);
    }
}

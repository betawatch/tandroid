// default package

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fnc implements reb {
    public static final p43 e;
    public final ey7 a = new ey7();
    public final ey7 b = new ey7();
    public final enc c;
    public Inflater d;

    static {
        no5 no5Var = po5.b;
        e = new p43(-9223372036854775807L, -9223372036854775807L, j99.e);
    }

    public fnc(List list) {
        int i;
        enc encVar = new enc();
        this.c = encVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = gcc.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                encVar.f = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = encVar.f;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        efd.g("VobsubParser", "Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    efd.f("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        encVar.g = Integer.parseInt(split2[0]);
                        encVar.h = Integer.parseInt(split2[1]);
                        encVar.d = true;
                    } catch (RuntimeException e3) {
                        efd.g("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    @Override // reb
    public final /* synthetic */ heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x00b7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0276  */
    @Override // reb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        p43 p43Var;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        m43 m43Var;
        long j2;
        long j3;
        j99 j99Var;
        Rect rect;
        ey7 ey7Var = this.a;
        ey7Var.L(i + i2, bArr);
        ey7Var.N(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        ey7 ey7Var2 = this.b;
        if (gcc.R(ey7Var, ey7Var2, inflater)) {
            ey7Var.L(ey7Var2.c, ey7Var2.a);
        }
        enc encVar = this.c;
        long j4 = -9223372036854775807L;
        encVar.b = -9223372036854775807L;
        encVar.c = -9223372036854775807L;
        boolean z4 = false;
        encVar.e = false;
        encVar.i = null;
        encVar.j = -1;
        encVar.k = -1;
        int a = ey7Var.a();
        if (a < 2 || ey7Var.H() != a) {
            p43Var = e;
        } else {
            if (encVar.f == null) {
                efd.f("VobsubParser", "Skipping SPU (no palette)");
            } else if (encVar.d) {
                int i3 = ey7Var.b - 2;
                ey7Var.N(ey7Var.H() + i3);
                while (true) {
                    if (ey7Var.a() < 4) {
                        j = j4;
                        z2 = z4;
                        z = z2;
                    } else {
                        int i4 = ey7Var.b;
                        int H = ey7Var.H() * 10000;
                        int H2 = ey7Var.H() + i3;
                        z = (H2 == i4 || H2 >= ey7Var.c) ? z4 : true;
                        int i5 = z ? H2 : ey7Var.c;
                        j = j4;
                        boolean z5 = true;
                        while (ey7Var.b < i5 && z5) {
                            long j5 = H;
                            int[] iArr = encVar.a;
                            boolean z6 = z4;
                            int A = ey7Var.A();
                            if (A != 255) {
                                switch (A) {
                                    case 0:
                                        z3 = true;
                                        break;
                                    case 1:
                                        encVar.b = j5;
                                        z3 = true;
                                        break;
                                    case 2:
                                        encVar.c = j5;
                                        z3 = true;
                                        break;
                                    case 3:
                                        if (ey7Var.a() >= 2) {
                                            int A2 = ey7Var.A();
                                            int A3 = ey7Var.A();
                                            iArr[3] = enc.a(encVar.f, A2 >> 4);
                                            iArr[2] = enc.a(encVar.f, A2 & 15);
                                            iArr[1] = enc.a(encVar.f, A3 >> 4);
                                            iArr[z6 ? 1 : 0] = enc.a(encVar.f, A3 & 15);
                                            encVar.e = true;
                                            z3 = true;
                                            break;
                                        } else {
                                            efd.f("VobsubParser", "Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (ey7Var.a() >= 2) {
                                            if (!encVar.e) {
                                                efd.f("VobsubParser", "Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int A4 = ey7Var.A();
                                                int A5 = ey7Var.A();
                                                iArr[3] = enc.c(iArr[3], A4 >> 4);
                                                iArr[2] = enc.c(iArr[2], A4 & 15);
                                                iArr[1] = enc.c(iArr[1], A5 >> 4);
                                                iArr[z6 ? 1 : 0] = enc.c(iArr[z6 ? 1 : 0], A5 & 15);
                                                z3 = true;
                                                break;
                                            }
                                        } else {
                                            efd.f("VobsubParser", "Incomplete alpha command");
                                            break;
                                        }
                                    case 5:
                                        if (ey7Var.a() >= 6) {
                                            int A6 = ey7Var.A();
                                            int A7 = ey7Var.A();
                                            int i6 = (A6 << 4) | (A7 >> 4);
                                            int A8 = ((A7 & 15) << 8) | ey7Var.A();
                                            int A9 = ey7Var.A();
                                            int A10 = ey7Var.A();
                                            encVar.i = new Rect(i6, (A9 << 4) | (A10 >> 4), A8 + 1, (((A10 & 15) << 8) | ey7Var.A()) + 1);
                                            z3 = true;
                                            break;
                                        } else {
                                            efd.f("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (ey7Var.a() >= 4) {
                                            encVar.j = ey7Var.H();
                                            encVar.k = ey7Var.H();
                                            z3 = true;
                                            break;
                                        } else {
                                            efd.f("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        c00.p(A, "Unrecognized command: ", "VobsubParser");
                                        break;
                                }
                                z4 = z6 ? 1 : 0;
                                z5 = z3;
                            }
                            z3 = z6 ? 1 : 0;
                            z4 = z6 ? 1 : 0;
                            z5 = z3;
                        }
                        z2 = z4;
                        if (z) {
                            ey7Var.N(H2);
                        }
                    }
                    if (z) {
                        j4 = j;
                        z4 = z2;
                    } else {
                        if (encVar.f != null || !encVar.d || !encVar.e || (rect = encVar.i) == null || encVar.j == -1 || encVar.k == -1 || rect.width() < 2 || encVar.i.height() < 2) {
                            m43Var = null;
                        } else {
                            Rect rect2 = encVar.i;
                            int[] iArr2 = new int[rect2.height() * rect2.width()];
                            zd1 zd1Var = new zd1();
                            ey7Var.N(encVar.j);
                            zd1Var.k(ey7Var);
                            encVar.b(zd1Var, true, rect2, iArr2);
                            ey7Var.N(encVar.k);
                            zd1Var.k(ey7Var);
                            encVar.b(zd1Var, z2, rect2, iArr2);
                            m43Var = new m43(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / encVar.h, 0, 0, rect2.left / encVar.g, 0, TLObject.FLAG_31, -3.4028235E38f, rect2.width() / encVar.g, rect2.height() / encVar.h, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                        }
                        j2 = encVar.c;
                        if (j2 == j) {
                            long j6 = encVar.b;
                            if (j6 != j && j2 > j6) {
                                j2 -= j6;
                            }
                            j3 = j2;
                        } else {
                            j3 = j;
                        }
                        if (m43Var == null) {
                            j99Var = po5.u(m43Var);
                        } else {
                            no5 no5Var = po5.b;
                            j99Var = j99.e;
                        }
                        p43Var = new p43(encVar.b, j3, j99Var);
                    }
                }
            } else {
                efd.f("VobsubParser", "Skipping SPU (no plane)");
            }
            j = -9223372036854775807L;
            z2 = false;
            if (encVar.f != null) {
            }
            m43Var = null;
            j2 = encVar.c;
            if (j2 == j) {
            }
            if (m43Var == null) {
            }
            p43Var = new p43(encVar.b, j3, j99Var);
        }
        ot2Var.accept(p43Var);
    }

    @Override // reb
    public final int s() {
        return 2;
    }

    @Override // reb
    public final void reset() {
    }
}

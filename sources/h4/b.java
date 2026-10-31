package h4;

import a1.g;
import android.graphics.Bitmap;
import android.graphics.Rect;
import e2.j;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
import org.telegram.tgnet.TLObject;
import sc.e;
import z3.d;
import z3.l;
import z3.m;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements m {
    public static final z3.a e;
    public final x a = new x();
    public final x b = new x();
    public final a c;
    public Inflater d;

    static {
        l0 l0Var = n0.b;
        e = new z3.a(-9223372036854775807L, -9223372036854775807L, x1.e);
    }

    public b(List list) {
        int i10;
        a aVar = new a();
        this.c = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = e2.l0.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                aVar.f = new int[split.length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int[] iArr = aVar.f;
                    try {
                        i10 = Integer.parseInt(split[i11].trim(), 16);
                    } catch (RuntimeException e7) {
                        e2.a.m("VobsubParser", "Parsing color failed", e7);
                        i10 = 0;
                    }
                    iArr[i11] = i10;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    e2.a.l("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        aVar.g = Integer.parseInt(split2[0]);
                        aVar.h = Integer.parseInt(split2[1]);
                        aVar.d = true;
                    } catch (RuntimeException e10) {
                        e2.a.m("VobsubParser", "Parsing IDX failed", e10);
                    }
                }
            }
        }
    }

    @Override // z3.m
    public final /* synthetic */ d l(int i10, int i11, byte[] bArr) {
        return e.a(this, bArr, i11);
    }

    @Override // z3.m
    public final int o() {
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x00bd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0286  */
    @Override // z3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(byte[] bArr, int i10, int i11, l lVar, j jVar) {
        z3.a aVar;
        boolean z10;
        long j10;
        int i12;
        boolean z11;
        d2.b bVar;
        long j11;
        long j12;
        Rect rect;
        x xVar = this.a;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        if (this.d == null) {
            this.d = new Inflater();
        }
        Inflater inflater = this.d;
        x xVar2 = this.b;
        if (e2.l0.Q(xVar, xVar2, inflater)) {
            xVar.L(xVar2.c, xVar2.a);
        }
        a aVar2 = this.c;
        long j13 = -9223372036854775807L;
        aVar2.b = -9223372036854775807L;
        aVar2.c = -9223372036854775807L;
        boolean z12 = false;
        aVar2.e = false;
        aVar2.i = null;
        aVar2.j = -1;
        aVar2.k = -1;
        int a2 = xVar.a();
        if (a2 < 2 || xVar.H() != a2) {
            aVar = e;
        } else {
            if (aVar2.f == null) {
                e2.a.l("VobsubParser", "Skipping SPU (no palette)");
            } else if (aVar2.d) {
                int i13 = xVar.b - 2;
                xVar.N(xVar.H() + i13);
                while (true) {
                    if (xVar.a() < 4) {
                        z11 = z12;
                        z10 = z11;
                        j10 = j13;
                    } else {
                        int i14 = xVar.b;
                        int H = xVar.H() * 10000;
                        int H2 = xVar.H() + i13;
                        z10 = (H2 == i14 || H2 >= xVar.c) ? z12 : true;
                        if (z10) {
                            j10 = j13;
                            i12 = H2;
                        } else {
                            j10 = j13;
                            i12 = xVar.c;
                        }
                        boolean z13 = true;
                        while (xVar.b < i12 && z13) {
                            long j14 = H;
                            boolean z14 = z12;
                            int[] iArr = aVar2.a;
                            int A = xVar.A();
                            if (A != 255) {
                                switch (A) {
                                    case 0:
                                        z13 = true;
                                        break;
                                    case 1:
                                        aVar2.b = j14;
                                        z13 = true;
                                        break;
                                    case 2:
                                        aVar2.c = j14;
                                        z13 = true;
                                        break;
                                    case 3:
                                        if (xVar.a() >= 2) {
                                            int A2 = xVar.A();
                                            int A3 = xVar.A();
                                            iArr[3] = a.a(aVar2.f, A2 >> 4);
                                            iArr[2] = a.a(aVar2.f, A2 & 15);
                                            iArr[1] = a.a(aVar2.f, A3 >> 4);
                                            iArr[z14 ? 1 : 0] = a.a(aVar2.f, A3 & 15);
                                            aVar2.e = true;
                                            z13 = true;
                                            break;
                                        } else {
                                            e2.a.l("VobsubParser", "Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (xVar.a() >= 2) {
                                            if (!aVar2.e) {
                                                e2.a.l("VobsubParser", "Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int A4 = xVar.A();
                                                int A5 = xVar.A();
                                                iArr[3] = a.c(iArr[3], A4 >> 4);
                                                iArr[2] = a.c(iArr[2], A4 & 15);
                                                iArr[1] = a.c(iArr[1], A5 >> 4);
                                                iArr[z14 ? 1 : 0] = a.c(iArr[z14 ? 1 : 0], A5 & 15);
                                                z13 = true;
                                                break;
                                            }
                                        } else {
                                            e2.a.l("VobsubParser", "Incomplete alpha command");
                                            break;
                                        }
                                    case 5:
                                        if (xVar.a() >= 6) {
                                            int A6 = xVar.A();
                                            int A7 = xVar.A();
                                            int i15 = (A6 << 4) | (A7 >> 4);
                                            int A8 = ((A7 & 15) << 8) | xVar.A();
                                            int A9 = xVar.A();
                                            int A10 = xVar.A();
                                            aVar2.i = new Rect(i15, (A9 << 4) | (A10 >> 4), A8 + 1, (((A10 & 15) << 8) | xVar.A()) + 1);
                                            z13 = true;
                                            break;
                                        } else {
                                            e2.a.l("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (xVar.a() >= 4) {
                                            aVar2.j = xVar.H();
                                            aVar2.k = xVar.H();
                                            z13 = true;
                                            break;
                                        } else {
                                            e2.a.l("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        g.w(A, "Unrecognized command: ", "VobsubParser");
                                        break;
                                }
                                z12 = z14 ? 1 : 0;
                            }
                            z13 = z14 ? 1 : 0;
                            z12 = z14 ? 1 : 0;
                        }
                        z11 = z12;
                        if (z10) {
                            xVar.N(H2);
                        }
                    }
                    if (z10) {
                        j13 = j10;
                        z12 = z11;
                    } else {
                        if (aVar2.f != null || !aVar2.d || !aVar2.e || (rect = aVar2.i) == null || aVar2.j == -1 || aVar2.k == -1 || rect.width() < 2 || aVar2.i.height() < 2) {
                            bVar = null;
                        } else {
                            Rect rect2 = aVar2.i;
                            int[] iArr2 = new int[rect2.height() * rect2.width()];
                            a4.g gVar = new a4.g();
                            xVar.N(aVar2.j);
                            gVar.c0(xVar);
                            aVar2.b(gVar, true, rect2, iArr2);
                            xVar.N(aVar2.k);
                            gVar.c0(xVar);
                            aVar2.b(gVar, z11, rect2, iArr2);
                            bVar = new d2.b(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar2.h, 0, 0, rect2.left / aVar2.g, 0, TLObject.FLAG_31, -3.4028235E38f, rect2.width() / aVar2.g, rect2.height() / aVar2.h, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                        }
                        j11 = aVar2.c;
                        if (j11 == j10) {
                            long j15 = aVar2.b;
                            j12 = (j15 == j10 || j11 <= j15) ? j11 : j11 - j15;
                        } else {
                            j12 = j10;
                        }
                        aVar = new z3.a(aVar2.b, j12, bVar == null ? n0.y(bVar) : x1.e);
                    }
                }
            } else {
                e2.a.l("VobsubParser", "Skipping SPU (no plane)");
            }
            z11 = false;
            j10 = -9223372036854775807L;
            if (aVar2.f != null) {
            }
            bVar = null;
            j11 = aVar2.c;
            if (j11 == j10) {
            }
            aVar = new z3.a(aVar2.b, j12, bVar == null ? n0.y(bVar) : x1.e);
        }
        jVar.accept(aVar);
    }

    @Override // z3.m
    public final /* synthetic */ void reset() {
    }
}

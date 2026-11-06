package k4;

import a8.p0;
import android.graphics.Bitmap;
import android.graphics.Rect;
import c4.d;
import c4.l;
import c4.m;
import d4.f;
import h2.j;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class b implements m {
    public static final c4.a e;
    public final x a = new x();
    public final x b = new x();
    public final a c;
    public Inflater d;

    static {
        g0 g0Var = i0.b;
        e = new c4.a(-9223372036854775807L, -9223372036854775807L, t1.e);
    }

    public b(List list) {
        int i7;
        a aVar = new a();
        this.c = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = m0.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                aVar.f = new int[split.length];
                for (int i10 = 0; i10 < split.length; i10++) {
                    int[] iArr = aVar.f;
                    try {
                        i7 = Integer.parseInt(split[i10].trim(), 16);
                    } catch (RuntimeException e10) {
                        h2.a.m("VobsubParser", "Parsing color failed", e10);
                        i7 = 0;
                    }
                    iArr[i10] = i7;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    h2.a.l("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        aVar.g = Integer.parseInt(split2[0]);
                        aVar.h = Integer.parseInt(split2[1]);
                        aVar.d = true;
                    } catch (RuntimeException e11) {
                        h2.a.m("VobsubParser", "Parsing IDX failed", e11);
                    }
                }
            }
        }
    }

    @Override // c4.m
    public final int P() {
        return 2;
    }

    @Override // c4.m
    public final /* synthetic */ d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x00bd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0286  */
    @Override // c4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        c4.a aVar;
        boolean z9;
        long j3;
        int i11;
        boolean z10;
        g2.b bVar;
        long j10;
        long j11;
        Rect rect;
        x xVar = this.a;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        if (this.d == null) {
            this.d = new Inflater();
        }
        Inflater inflater = this.d;
        x xVar2 = this.b;
        if (m0.Q(xVar, xVar2, inflater)) {
            xVar.L(xVar2.c, xVar2.a);
        }
        a aVar2 = this.c;
        long j12 = -9223372036854775807L;
        aVar2.b = -9223372036854775807L;
        aVar2.c = -9223372036854775807L;
        boolean z11 = false;
        aVar2.e = false;
        aVar2.i = null;
        aVar2.j = -1;
        aVar2.k = -1;
        int a10 = xVar.a();
        if (a10 < 2 || xVar.H() != a10) {
            aVar = e;
        } else {
            if (aVar2.f == null) {
                h2.a.l("VobsubParser", "Skipping SPU (no palette)");
            } else if (aVar2.d) {
                int i12 = xVar.b - 2;
                xVar.N(xVar.H() + i12);
                while (true) {
                    if (xVar.a() < 4) {
                        z10 = z11;
                        z9 = z10;
                        j3 = j12;
                    } else {
                        int i13 = xVar.b;
                        int H = xVar.H() * 10000;
                        int H2 = xVar.H() + i12;
                        z9 = (H2 == i13 || H2 >= xVar.c) ? z11 : true;
                        if (z9) {
                            j3 = j12;
                            i11 = H2;
                        } else {
                            j3 = j12;
                            i11 = xVar.c;
                        }
                        boolean z12 = true;
                        while (xVar.b < i11 && z12) {
                            long j13 = H;
                            boolean z13 = z11;
                            int[] iArr = aVar2.a;
                            int A = xVar.A();
                            if (A != 255) {
                                switch (A) {
                                    case 0:
                                        z12 = true;
                                        break;
                                    case 1:
                                        aVar2.b = j13;
                                        z12 = true;
                                        break;
                                    case 2:
                                        aVar2.c = j13;
                                        z12 = true;
                                        break;
                                    case 3:
                                        if (xVar.a() >= 2) {
                                            int A2 = xVar.A();
                                            int A3 = xVar.A();
                                            iArr[3] = a.a(aVar2.f, A2 >> 4);
                                            iArr[2] = a.a(aVar2.f, A2 & 15);
                                            iArr[1] = a.a(aVar2.f, A3 >> 4);
                                            iArr[z13 ? 1 : 0] = a.a(aVar2.f, A3 & 15);
                                            aVar2.e = true;
                                            z12 = true;
                                            break;
                                        } else {
                                            h2.a.l("VobsubParser", "Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (xVar.a() >= 2) {
                                            if (!aVar2.e) {
                                                h2.a.l("VobsubParser", "Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int A4 = xVar.A();
                                                int A5 = xVar.A();
                                                iArr[3] = a.c(iArr[3], A4 >> 4);
                                                iArr[2] = a.c(iArr[2], A4 & 15);
                                                iArr[1] = a.c(iArr[1], A5 >> 4);
                                                iArr[z13 ? 1 : 0] = a.c(iArr[z13 ? 1 : 0], A5 & 15);
                                                z12 = true;
                                                break;
                                            }
                                        } else {
                                            h2.a.l("VobsubParser", "Incomplete alpha command");
                                            break;
                                        }
                                    case 5:
                                        if (xVar.a() >= 6) {
                                            int A6 = xVar.A();
                                            int A7 = xVar.A();
                                            int i14 = (A6 << 4) | (A7 >> 4);
                                            int A8 = ((A7 & 15) << 8) | xVar.A();
                                            int A9 = xVar.A();
                                            int A10 = xVar.A();
                                            aVar2.i = new Rect(i14, (A9 << 4) | (A10 >> 4), A8 + 1, (((A10 & 15) << 8) | xVar.A()) + 1);
                                            z12 = true;
                                            break;
                                        } else {
                                            h2.a.l("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (xVar.a() >= 4) {
                                            aVar2.j = xVar.H();
                                            aVar2.k = xVar.H();
                                            z12 = true;
                                            break;
                                        } else {
                                            h2.a.l("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        com.google.android.recaptcha.internal.a.o(A, "Unrecognized command: ", "VobsubParser");
                                        break;
                                }
                                z11 = z13 ? 1 : 0;
                            }
                            z12 = z13 ? 1 : 0;
                            z11 = z13 ? 1 : 0;
                        }
                        z10 = z11;
                        if (z9) {
                            xVar.N(H2);
                        }
                    }
                    if (z9) {
                        j12 = j3;
                        z11 = z10;
                    } else {
                        if (aVar2.f != null || !aVar2.d || !aVar2.e || (rect = aVar2.i) == null || aVar2.j == -1 || aVar2.k == -1 || rect.width() < 2 || aVar2.i.height() < 2) {
                            bVar = null;
                        } else {
                            Rect rect2 = aVar2.i;
                            int[] iArr2 = new int[rect2.height() * rect2.width()];
                            f fVar = new f();
                            xVar.N(aVar2.j);
                            fVar.I(xVar);
                            aVar2.b(fVar, true, rect2, iArr2);
                            xVar.N(aVar2.k);
                            fVar.I(xVar);
                            aVar2.b(fVar, z10, rect2, iArr2);
                            bVar = new g2.b(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar2.h, 0, 0, rect2.left / aVar2.g, 0, TLObject.FLAG_31, -3.4028235E38f, rect2.width() / aVar2.g, rect2.height() / aVar2.h, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                        }
                        j10 = aVar2.c;
                        if (j10 == j3) {
                            long j14 = aVar2.b;
                            j11 = (j14 == j3 || j10 <= j14) ? j10 : j10 - j14;
                        } else {
                            j11 = j3;
                        }
                        aVar = new c4.a(aVar2.b, j11, bVar == null ? i0.u(bVar) : t1.e);
                    }
                }
            } else {
                h2.a.l("VobsubParser", "Skipping SPU (no plane)");
            }
            z10 = false;
            j3 = -9223372036854775807L;
            if (aVar2.f != null) {
            }
            bVar = null;
            j10 = aVar2.c;
            if (j10 == j3) {
            }
            aVar = new c4.a(aVar2.b, j11, bVar == null ? i0.u(bVar) : t1.e);
        }
        jVar.accept(aVar);
    }

    @Override // c4.m
    public final /* synthetic */ void reset() {
    }
}

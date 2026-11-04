package j4;

import a1.g;
import android.graphics.Bitmap;
import android.graphics.Rect;
import b4.d;
import b4.l;
import b4.m;
import c4.f;
import g2.k;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements m {
    public static final b4.a e;
    public final y a = new y();
    public final y b = new y();
    public final a c;
    public Inflater d;

    static {
        g0 g0Var = i0.b;
        e = new b4.a(-9223372036854775807L, -9223372036854775807L, s1.e);
    }

    public b(List list) {
        int i3;
        a aVar = new a();
        this.c = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = n0.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                aVar.f = new int[split.length];
                for (int i10 = 0; i10 < split.length; i10++) {
                    int[] iArr = aVar.f;
                    try {
                        i3 = Integer.parseInt(split[i10].trim(), 16);
                    } catch (RuntimeException e10) {
                        g2.a.m("VobsubParser", "Parsing color failed", e10);
                        i3 = 0;
                    }
                    iArr[i10] = i3;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    g2.a.l("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        aVar.g = Integer.parseInt(split2[0]);
                        aVar.h = Integer.parseInt(split2[1]);
                        aVar.d = true;
                    } catch (RuntimeException e11) {
                        g2.a.m("VobsubParser", "Parsing IDX failed", e11);
                    }
                }
            }
        }
    }

    @Override // b4.m
    public final /* synthetic */ d B(int i3, int i10, byte[] bArr) {
        return g.a(this, bArr, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x00bd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0286  */
    @Override // b4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(byte[] bArr, int i3, int i10, l lVar, k kVar) {
        b4.a aVar;
        boolean z10;
        long j10;
        int i11;
        boolean z11;
        f2.b bVar;
        long j11;
        long j12;
        Rect rect;
        y yVar = this.a;
        yVar.L(i3 + i10, bArr);
        yVar.N(i3);
        if (this.d == null) {
            this.d = new Inflater();
        }
        Inflater inflater = this.d;
        y yVar2 = this.b;
        if (n0.Q(yVar, yVar2, inflater)) {
            yVar.L(yVar2.c, yVar2.a);
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
        int a10 = yVar.a();
        if (a10 < 2 || yVar.H() != a10) {
            aVar = e;
        } else {
            if (aVar2.f == null) {
                g2.a.l("VobsubParser", "Skipping SPU (no palette)");
            } else if (aVar2.d) {
                int i12 = yVar.b - 2;
                yVar.N(yVar.H() + i12);
                while (true) {
                    if (yVar.a() < 4) {
                        z11 = z12;
                        z10 = z11;
                        j10 = j13;
                    } else {
                        int i13 = yVar.b;
                        int H = yVar.H() * 10000;
                        int H2 = yVar.H() + i12;
                        z10 = (H2 == i13 || H2 >= yVar.c) ? z12 : true;
                        if (z10) {
                            j10 = j13;
                            i11 = H2;
                        } else {
                            j10 = j13;
                            i11 = yVar.c;
                        }
                        boolean z13 = true;
                        while (yVar.b < i11 && z13) {
                            long j14 = H;
                            boolean z14 = z12;
                            int[] iArr = aVar2.a;
                            int A = yVar.A();
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
                                        if (yVar.a() >= 2) {
                                            int A2 = yVar.A();
                                            int A3 = yVar.A();
                                            iArr[3] = a.a(aVar2.f, A2 >> 4);
                                            iArr[2] = a.a(aVar2.f, A2 & 15);
                                            iArr[1] = a.a(aVar2.f, A3 >> 4);
                                            iArr[z14 ? 1 : 0] = a.a(aVar2.f, A3 & 15);
                                            aVar2.e = true;
                                            z13 = true;
                                            break;
                                        } else {
                                            g2.a.l("VobsubParser", "Incomplete color command");
                                            break;
                                        }
                                    case 4:
                                        if (yVar.a() >= 2) {
                                            if (!aVar2.e) {
                                                g2.a.l("VobsubParser", "Ignoring alpha command before color command");
                                                break;
                                            } else {
                                                int A4 = yVar.A();
                                                int A5 = yVar.A();
                                                iArr[3] = a.c(iArr[3], A4 >> 4);
                                                iArr[2] = a.c(iArr[2], A4 & 15);
                                                iArr[1] = a.c(iArr[1], A5 >> 4);
                                                iArr[z14 ? 1 : 0] = a.c(iArr[z14 ? 1 : 0], A5 & 15);
                                                z13 = true;
                                                break;
                                            }
                                        } else {
                                            g2.a.l("VobsubParser", "Incomplete alpha command");
                                            break;
                                        }
                                    case 5:
                                        if (yVar.a() >= 6) {
                                            int A6 = yVar.A();
                                            int A7 = yVar.A();
                                            int i14 = (A6 << 4) | (A7 >> 4);
                                            int A8 = ((A7 & 15) << 8) | yVar.A();
                                            int A9 = yVar.A();
                                            int A10 = yVar.A();
                                            aVar2.i = new Rect(i14, (A9 << 4) | (A10 >> 4), A8 + 1, (((A10 & 15) << 8) | yVar.A()) + 1);
                                            z13 = true;
                                            break;
                                        } else {
                                            g2.a.l("VobsubParser", "Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (yVar.a() >= 4) {
                                            aVar2.j = yVar.H();
                                            aVar2.k = yVar.H();
                                            z13 = true;
                                            break;
                                        } else {
                                            g2.a.l("VobsubParser", "Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        com.google.android.recaptcha.internal.a.o(A, "Unrecognized command: ", "VobsubParser");
                                        break;
                                }
                                z12 = z14 ? 1 : 0;
                            }
                            z13 = z14 ? 1 : 0;
                            z12 = z14 ? 1 : 0;
                        }
                        z11 = z12;
                        if (z10) {
                            yVar.N(H2);
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
                            f fVar = new f();
                            yVar.N(aVar2.j);
                            fVar.I(yVar);
                            aVar2.b(fVar, true, rect2, iArr2);
                            yVar.N(aVar2.k);
                            fVar.I(yVar);
                            aVar2.b(fVar, z11, rect2, iArr2);
                            bVar = new f2.b(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar2.h, 0, 0, rect2.left / aVar2.g, 0, TLObject.FLAG_31, -3.4028235E38f, rect2.width() / aVar2.g, rect2.height() / aVar2.h, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                        }
                        j11 = aVar2.c;
                        if (j11 == j10) {
                            long j15 = aVar2.b;
                            j12 = (j15 == j10 || j11 <= j15) ? j11 : j11 - j15;
                        } else {
                            j12 = j10;
                        }
                        aVar = new b4.a(aVar2.b, j12, bVar == null ? i0.u(bVar) : s1.e);
                    }
                }
            } else {
                g2.a.l("VobsubParser", "Skipping SPU (no plane)");
            }
            z11 = false;
            j10 = -9223372036854775807L;
            if (aVar2.f != null) {
            }
            bVar = null;
            j11 = aVar2.c;
            if (j11 == j10) {
            }
            aVar = new b4.a(aVar2.b, j12, bVar == null ? i0.u(bVar) : s1.e);
        }
        kVar.accept(aVar);
    }

    @Override // b4.m
    public final int Y() {
        return 2;
    }

    @Override // b4.m
    public final /* synthetic */ void reset() {
    }
}

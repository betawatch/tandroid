// default package

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.Rating;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.EOFException;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fk3 implements uj2, fq7, cx9, mn4, r9, ugc, oj5, fd1, mj5, d99, qq7, rt8, o44, nc8, t43, v78, tcc, x21, fqb {
    public Object a;

    public fk3(byte b) {
        switch (b) {
            case 14:
                this.a = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 19:
                this.a = new Bundle();
                break;
            default:
                this.a = new yw7(10);
                break;
        }
    }

    public static w76 U(Looper looper, Object obj, String str) {
        ite.i(obj, "Listener must not be null");
        ite.i(looper, "Looper must not be null");
        return new w76(looper, obj, str);
    }

    public static float[] W(ArrayList arrayList) {
        float f;
        int i;
        int i2;
        float f2;
        double d;
        double d2;
        double[] dArr;
        ArrayList arrayList2;
        float f3;
        int i3;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            f = 255.0f;
            if (i5 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i5);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i5++;
        }
        int size2 = arrayList.size();
        int i6 = 1;
        double d3 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i = 0;
            i2 = 1;
            f2 = 255.0f;
            d = 1.0d;
            d2 = 6.0d;
            dArr = null;
        } else {
            char c = 2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d4 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i7 = 1;
            while (true) {
                i3 = size2 - 1;
                if (i7 >= i3) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i7 - 1);
                PointF pointF3 = (PointF) arrayList.get(i7);
                int i8 = i7 + 1;
                double d5 = d3;
                PointF pointF4 = (PointF) arrayList.get(i8);
                double[] dArr5 = dArr2[i7];
                char c2 = c;
                float f4 = pointF3.x;
                double d6 = d4;
                int i9 = i4;
                int i10 = i6;
                double d7 = f4 - pointF2.x;
                dArr5[i9] = d7 / 6.0d;
                float f5 = pointF4.x;
                float f6 = f;
                dArr5[i10] = (f5 - r14) / 3.0d;
                double d8 = f5 - f4;
                dArr5[c2] = d8 / 6.0d;
                float f7 = pointF4.y;
                float f8 = pointF3.y;
                dArr3[i7] = ((f7 - f8) / d8) - ((f8 - pointF2.y) / d7);
                i7 = i8;
                c = c2;
                d3 = d5;
                d4 = d6;
                i4 = i9;
                i6 = i10;
                f = f6;
            }
            i = i4;
            i2 = i6;
            f2 = f;
            d = d3;
            char c3 = c;
            double d9 = d4;
            d2 = 6.0d;
            dArr3[i] = d9;
            dArr3[i3] = d9;
            double[] dArr6 = dArr2[i3];
            dArr6[i2] = d;
            dArr6[i] = d9;
            dArr6[c3] = d9;
            for (int i11 = i2; i11 < size2; i11++) {
                double[] dArr7 = dArr2[i11];
                double d10 = dArr7[i];
                int i12 = i11 - 1;
                double[] dArr8 = dArr2[i12];
                double d11 = d10 / dArr8[i2];
                dArr7[i2] = dArr7[i2] - (dArr8[c3] * d11);
                dArr7[i] = d9;
                dArr3[i11] = dArr3[i11] - (d11 * dArr3[i12]);
            }
            for (int i13 = size2 - 2; i13 >= 0; i13--) {
                double[] dArr9 = dArr2[i13];
                double d12 = dArr9[c3];
                int i14 = i13 + 1;
                double[] dArr10 = dArr2[i14];
                double d13 = d12 / dArr10[i2];
                dArr9[i2] = dArr9[i2] - (dArr10[i] * d13);
                dArr9[c3] = d9;
                dArr3[i13] = dArr3[i13] - (d13 * dArr3[i14]);
            }
            dArr = new double[size2];
            for (int i15 = i; i15 < size2; i15++) {
                dArr[i15] = dArr3[i15] / dArr2[i15][i2];
            }
        }
        int length = dArr.length;
        if (length < i2) {
            arrayList2 = null;
            f3 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i16 = i;
            while (i16 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i16);
                int i17 = i16 + 1;
                PointF pointF6 = (PointF) arrayList.get(i17);
                int i18 = (int) pointF5.x;
                while (true) {
                    float f9 = pointF6.x;
                    if (i18 < ((int) f9)) {
                        float f10 = i18;
                        PointF pointF7 = pointF5;
                        double d14 = f9 - pointF5.x;
                        double d15 = (f10 - r12) / d14;
                        double d16 = d - d15;
                        int i19 = length;
                        double[] dArr11 = dArr;
                        float f11 = (float) (((((((d15 * d15) * d15) - d15) * dArr11[i17]) + ((((d16 * d16) * d16) - d16) * dArr11[i16])) * ((d14 * d14) / d2)) + (pointF6.y * d15) + (pointF7.y * d16));
                        if (f11 > f2) {
                            f11 = f2;
                        } else if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        arrayList2.add(new PointF(f10, f11));
                        i18++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i19;
                    }
                }
                i16 = i17;
            }
            f3 = 0.0f;
            arrayList2.add((PointF) b10.f(1, arrayList));
        }
        int i20 = i;
        float f12 = ((PointF) arrayList2.get(i20)).x;
        if (f12 > f3) {
            for (int i21 = (int) f12; i21 >= 0; i21--) {
                arrayList2.add(i20, new PointF(i21, f3));
            }
        }
        float f13 = ((PointF) b10.f(1, arrayList2)).x;
        if (f13 < f2) {
            for (int i22 = ((int) f13) + 1; i22 <= 255; i22++) {
                arrayList2.add(new PointF(i22, f2));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i20 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i20);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i20] = sqrt;
            i20++;
        }
        return fArr;
    }

    public static void Y(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override // fd1
    public final kd1 A() {
        my5 my5Var = ((sa8) this.a).P0;
        for (int i = 0; i < my5Var.getChildCount(); i++) {
            if (my5Var.getChildAt(i) instanceof kd1) {
                return (kd1) my5Var.getChildAt(i);
            }
        }
        return null;
    }

    @Override // fqb
    public final void C(long j, boolean z) {
        cl8 cl8Var = (cl8) this.a;
        if (!z) {
            cl8Var.m(j);
            return;
        }
        ndc ndcVar = cl8Var.e;
        if (ndcVar != null) {
            ndcVar.p0(j, true);
            return;
        }
        if (cl8Var.i()) {
            cl8Var.F.m(j, true);
            return;
        }
        ndc ndcVar2 = cl8Var.E;
        if (ndcVar2 != null) {
            ndcVar2.p0(j, false);
        }
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        j67 j67Var = (j67) this.a;
        iq5 H0 = gm.H0(wzcVar, false);
        j67Var.d = H0;
        j67Var.G.setPadding(H0.a, H0.b, H0.c, H0.d);
        j67Var.F.requestLayout();
        return wzc.b;
    }

    @Override // ugc
    public final boolean D(int i) {
        return false;
    }

    @Override // fd1
    public final long E() {
        return ((sa8) this.a).getCaptionsVideoPosition();
    }

    @Override // fqb
    public final void E0(float f, int i) {
        ArrayList arrayList;
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null || (arrayList = g6bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((g6b) cl8Var.d.T.get(i)).P = f;
    }

    @Override // d99
    public final boolean F() {
        return true;
    }

    @Override // fd1
    public final FrameLayout G() {
        return (sa8) this.a;
    }

    @Override // v78
    public final void H(String str) {
        ((d88) this.a).m0(str);
    }

    @Override // t43
    public final void H0(boolean z) {
        ((x68) this.a).c.setAspectLock(z);
    }

    @Override // fqb
    public final void H1(float f) {
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null) {
            return;
        }
        g6bVar.E = f;
        g6bVar.j = true;
        cl8Var.w(true);
    }

    @Override // uj2
    public final void I(float f, float f2) {
        tk5 tk5Var;
        tk5Var = ((d) ((gk3) this.a).u0).parentLayout;
        ((ActionBarLayout) tk5Var).p();
    }

    @Override // nc8
    public final TextureView J() {
        return null;
    }

    @Override // fd1
    public final long K() {
        return ((sa8) this.a).getCaptionsTrimEnd();
    }

    @Override // fqb
    public final void K0(float f) {
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null) {
            return;
        }
        g6bVar.P = f;
        cl8Var.b();
    }

    @Override // nc8
    public final void L(k47 k47Var) {
        ((fab) ((a58) this.a).G1).f(false);
    }

    @Override // mn4
    public final Cursor M(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // fd1
    public final long N() {
        return ((sa8) this.a).getCaptionsTrimStart();
    }

    @Override // fd1
    public final void P(kd1 kd1Var) {
        ((sa8) this.a).a0(kd1Var);
    }

    @Override // d99
    public final void Q() {
        gl6 gl6Var = (gl6) this.a;
        gl6Var.b.a.h();
        gl6Var.x.setViewHidden(false);
        PhotoViewer photoViewer = ((ra8) gl6Var).L;
        Drawable[] drawableArr = PhotoViewer.d9;
        photoViewer.g2(true, true);
    }

    @Override // fd1
    public final void R(long j) {
        h74 h74Var;
        PhotoViewer photoViewer = ((sa8) this.a).j2;
        ndc ndcVar = photoViewer.G2;
        if (ndcVar == null || (h74Var = ndcVar.d) == null || !h74Var.c0()) {
            return;
        }
        photoViewer.G2.o0(j);
    }

    @Override // t43
    public final void R0(boolean z) {
        w68 w68Var = ((x68) this.a).a;
        if (w68Var != null) {
            ((e98) w68Var).b(z);
        }
    }

    @Override // fqb
    public final void R1(float f, int i) {
        ArrayList arrayList;
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null || (arrayList = g6bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((g6b) cl8Var.d.T.get(i)).W = f;
    }

    @Override // fd1
    public final void S(w44 w44Var) {
        ((sa8) this.a).s0(w44Var);
    }

    @Override // fqb
    public final void S1(float f) {
        g6b g6bVar = ((cl8) this.a).d;
        if (g6bVar == null) {
            return;
        }
        g6bVar.a0 = f;
        g6bVar.j = true;
    }

    @Override // d99
    public final void T() {
        ((gl6) this.a).x.setViewHidden(true);
    }

    @Override // fqb
    public final void V() {
        cl8 cl8Var = (cl8) this.a;
        cl8Var.s(null, null, true);
        v9b v9bVar = ((k9b) cl8Var).D0;
        k9b k9bVar = v9bVar.Y0;
        if (k9bVar != null) {
            k9bVar.s(null, null, true);
        }
        z8b z8bVar = v9bVar.w1;
        if (z8bVar != null) {
            z8bVar.n0();
        }
        l9b l9bVar = v9bVar.d1;
        if (l9bVar != null) {
            l9bVar.setHasRoundVideo(false);
        }
        g6b g6bVar = v9bVar.L1;
        if (g6bVar != null) {
            File file = g6bVar.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                g6bVar = v9bVar.L1;
                g6bVar.o0 = null;
            }
            if (g6bVar.p0 != null) {
                try {
                    new File(v9bVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                v9bVar.L1.p0 = null;
            }
        }
    }

    @Override // fqb
    public final void V1() {
        ((cl8) this.a).p(null);
    }

    @Override // t43
    public final void W0() {
        w68 w68Var = ((x68) this.a).a;
        if (w68Var != null) {
            PhotoViewer photoViewer = ((e98) w68Var).a;
            if (photoViewer.d2 == 1) {
                photoViewer.H2 = true;
                photoViewer.B2();
            }
        }
    }

    @Override // fqb
    public final void X(boolean z, float f) {
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar != null) {
            g6bVar.Z = f;
            g6bVar.j = true;
            ndc ndcVar = cl8Var.e;
            if (ndcVar == null || ndcVar.U() == -9223372036854775807L) {
                return;
            }
            cl8Var.m((long) (f * cl8Var.e.U()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r3.N(r9);
        r8 = r3.b;
        r3.O(6);
        r9 = r3.z();
        r10 = r9 + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r1 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if ((r17.f() + r9) <= r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        ncd.f("Id3Peeker", "Skipping ID3 tag with tagLength=" + r10 + " greater than input length=" + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r6 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r6 = new byte[r10];
        java.lang.System.arraycopy(r3.a, r8, r6, 0, 10);
        r17.d(r6, 10, r9, false);
        r6 = new sl5(r18).c(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        r17.a(r9, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nf7 Z(vb3 vb3Var, ql5 ql5Var, int i) {
        int i2;
        long j = vb3Var.c;
        yw7 yw7Var = (yw7) this.a;
        int i3 = 0;
        nf7 nf7Var = null;
        loop0: while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = yw7Var.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    vb3Var.d(yw7Var.a, i6 - i7, i7, false);
                    yw7Var.N(i5);
                    yw7Var.M(i6);
                    if (yw7Var.a() < 3) {
                        zo4.m("position=", yw7Var.b, ", limit=", yw7Var.c);
                        return null;
                    }
                    int D = yw7Var.D();
                    yw7Var.b -= 3;
                    if (D != 4801587) {
                        if (wcd.a(yw7Var.i()) != -1) {
                            break loop0;
                        }
                    } else {
                        yw7Var.O(3);
                        int A = yw7Var.A();
                        if (A >= 2 && A <= 4) {
                            break;
                        }
                    }
                    if (i4 == 0) {
                        yw7Var.c(20);
                    }
                    i4++;
                    if (i4 > i) {
                        break loop0;
                    }
                } catch (EOFException unused) {
                }
            }
            i3 += i2;
        }
        vb3Var.f = 0;
        vb3Var.a(i3, false);
        return nf7Var;
    }

    @Override // ugc
    public final void a(int i, boolean z) {
        ux4 ux4Var = (ux4) this.a;
        if (ux4Var.l2 == i) {
            return;
        }
        ux4Var.l2 = i;
        ux4Var.d2.g();
        ux4Var.T1.O(true);
    }

    public final void a0(String str, Bitmap bitmap) {
        Integer num = (Integer) lt6.c.get(str);
        if (num == null || num.intValue() == 2) {
            ((Bundle) this.a).putParcelable(str, bitmap);
        } else {
            u36.j(kt6.o("The ", str, " key cannot be used to put a Bitmap"));
        }
    }

    @Override // uj2
    public final boolean a1(float f, float f2) {
        return ((gk3) this.a).u0.isInPreviewMode();
    }

    @Override // ugc
    public final boolean b() {
        return true;
    }

    @Override // x21
    public final void b0(y21 y21Var, j21 j21Var, h21 h21Var, gx gxVar) {
        ((jc8) this.a).c(false, j21Var, h21Var, gxVar);
    }

    @Override // uj2
    public final boolean b2() {
        return false;
    }

    @Override // t43
    public final void c0() {
        w68 w68Var = ((x68) this.a).a;
        if (w68Var != null) {
            ((e98) w68Var).a.f0.invalidate();
        }
    }

    @Override // uj2
    public final boolean c1(View view, float f, float f2) {
        return false;
    }

    @Override // fqb
    public final void c2(float f) {
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null) {
            return;
        }
        g6bVar.t0 = f;
        g6bVar.j = true;
        cl8Var.y(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mn4
    public final void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                z2.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // o44
    public final void d() {
        z8b z8bVar = (z8b) this.a;
        z8bVar.D0(null, true);
        if (z8bVar.C0) {
            v9b v9bVar = z8bVar.u2;
            v9bVar.d1.f.d();
            v9bVar.k0(-1, false, true);
            z8bVar.C0 = false;
        }
        z8bVar.O0(false);
    }

    @Override // v78
    public final void e() {
        d88 d88Var = (d88) this.a;
        d88Var.a.c0();
        d88Var.b.c0();
    }

    public final void e0(long j, String str) {
        Integer num = (Integer) lt6.c.get(str);
        if (num == null || num.intValue() == 0) {
            ((Bundle) this.a).putLong(str, j);
        } else {
            u36.j(kt6.o("The ", str, " key cannot be used to put a long"));
        }
    }

    @Override // fqb
    public final void e2(int i, long j) {
        ArrayList arrayList;
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null || (arrayList = g6bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((g6b) cl8Var.d.T.get(i)).X = j;
    }

    @Override // uj2
    public final boolean f0() {
        return true;
    }

    @Override // fqb
    public final void f1(long j) {
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null) {
            return;
        }
        g6bVar.r0 = j;
        g6bVar.j = true;
        cl8Var.y(true);
    }

    @Override // x21
    public final void g0(y21 y21Var, j21 j21Var, yt0 yt0Var, t52 t52Var) {
        ((jc8) this.a).c(true, j21Var, yt0Var, t52Var);
    }

    @Override // cx9
    public final CharSequence getContentDescription() {
        kl4 kl4Var = (kl4) this.a;
        float f = kl4Var.b;
        return String.valueOf(Math.round((kl4Var.a.getProgress() * (kl4Var.c - f)) + f));
    }

    @Override // uj2
    public final long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // fqb
    public final void h(int i) {
        cm2 cm2Var = ((cl8) this.a).F;
        if (cm2Var != null) {
            ArrayList arrayList = cm2Var.h;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                bm2 bm2Var = (bm2) obj;
                if (bm2Var.a == i) {
                    bm2Var.b.e(true, 1.0f);
                    cm2Var.invalidate();
                    return;
                }
            }
        }
    }

    public final void h0(String str, i19 i19Var) {
        Rating rating;
        float f = i19Var.b;
        Integer num = (Integer) lt6.c.get(str);
        if (num != null && num.intValue() != 3) {
            u36.j(kt6.o("The ", str, " key cannot be used to put a Rating"));
            return;
        }
        Bundle bundle = (Bundle) this.a;
        Rating rating2 = i19Var.c;
        if (rating2 == null) {
            boolean b = i19Var.b();
            int i = i19Var.a;
            if (b) {
                switch (i) {
                    case 1:
                        rating2 = Rating.newHeartRating(i == 1 && f == 1.0f);
                        i19Var.c = rating2;
                        break;
                    case 2:
                        rating2 = Rating.newThumbRating(i == 2 && f == 1.0f);
                        i19Var.c = rating2;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        rating2 = Rating.newStarRating(i, i19Var.a());
                        i19Var.c = rating2;
                        break;
                    case 6:
                        if (i != 6 || !i19Var.b()) {
                            f = -1.0f;
                        }
                        rating2 = Rating.newPercentageRating(f);
                        i19Var.c = rating2;
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            rating2 = Rating.newUnratedRating(i);
            i19Var.c = rating2;
        }
        rating = rating2;
        bundle.putParcelable(str, rating);
    }

    @Override // fqb
    public final void h1(boolean z) {
        ao9 ao9Var;
        v9b v9bVar = ((k9b) ((cl8) this.a)).D0;
        z8b z8bVar = v9bVar.w1;
        if (z8bVar != null) {
            ao9 ao9Var2 = null;
            if (!z) {
                if (z8bVar.getSelectedEntity() instanceof ao9) {
                    v9bVar.w1.D0(null, true);
                    return;
                }
                return;
            }
            if (z8bVar.getSelectedEntity() instanceof ao9) {
                return;
            }
            tv7 tv7Var = v9bVar.w1.H0;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= tv7Var.getChildCount()) {
                    ao9Var = null;
                    break;
                }
                View childAt = tv7Var.getChildAt(i2);
                if (childAt instanceof ao9) {
                    ao9Var = (ao9) childAt;
                    break;
                }
                i2++;
            }
            if (ao9Var != null) {
                z8b z8bVar2 = v9bVar.w1;
                tv7 tv7Var2 = z8bVar2.H0;
                while (true) {
                    if (i >= tv7Var2.getChildCount()) {
                        break;
                    }
                    View childAt2 = tv7Var2.getChildAt(i);
                    if (childAt2 instanceof ao9) {
                        ao9Var2 = (ao9) childAt2;
                        break;
                    }
                    i++;
                }
                z8bVar2.D0(ao9Var2, true);
            }
        }
    }

    @Override // o44
    public final w44 i() {
        return ((z8b) this.a).z0;
    }

    public final void i0(String str, String str2) {
        Integer num = (Integer) lt6.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.a).putCharSequence(str, str2);
        } else {
            u36.j(kt6.o("The ", str, " key cannot be used to put a String"));
        }
    }

    @Override // tcc
    public final void invalidate() {
        ((PhotoViewer) this.a).f0.invalidate();
    }

    @Override // cx9
    public final int j0() {
        return 0;
    }

    @Override // fq7
    public final void j1(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        di4 di4Var = (di4) this.a;
        Handler handler = di4Var.B0;
        o04 o04Var = di4Var.C0;
        handler.removeCallbacks(o04Var);
        TextView textView = di4Var.H0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(o04Var, 2000L);
    }

    public final void k(StringBuilder sb, Iterator it) {
        jw5 jw5Var = (jw5) this.a;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(jw5.c(entry.getKey()));
            sb.append("=");
            sb.append(jw5.c(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) jw5Var.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(jw5.c(entry2.getKey()));
                sb.append("=");
                sb.append(jw5.c(entry2.getValue()));
            }
        }
    }

    public final void k0(CharSequence charSequence, String str) {
        Integer num = (Integer) lt6.c.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.a).putCharSequence(str, charSequence);
        } else {
            u36.j(kt6.o("The ", str, " key cannot be used to put a CharSequence"));
        }
    }

    @Override // fqb
    public final void k2(long j) {
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null) {
            return;
        }
        g6bVar.D = j;
        g6bVar.j = true;
        cl8Var.w(true);
    }

    public final void l0() {
        cf9 cf9Var = (cf9) this.a;
        cf9Var.getClass();
        try {
            iid iidVar = (iid) cf9Var.b;
            Parcel R = iidVar.R();
            int i = tid.a;
            R.writeInt(0);
            iidVar.V(R, 2);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    @Override // r9
    public final void m(Object obj) {
        q9 q9Var = (q9) obj;
        hq4 hq4Var = (hq4) this.a;
        dq4 dq4Var = (dq4) hq4Var.F.pollFirst();
        if (dq4Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = dq4Var.a;
        int i = dq4Var.b;
        dp4 o = hq4Var.c.o(str);
        if (o != null) {
            o.x(i, q9Var.a, q9Var.b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    public final void m0() {
        cf9 cf9Var = (cf9) this.a;
        cf9Var.getClass();
        try {
            iid iidVar = (iid) cf9Var.b;
            Parcel R = iidVar.R();
            int i = tid.a;
            R.writeInt(0);
            iidVar.V(R, 3);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    @Override // cx9
    public final void n(boolean z, float f) {
        kl4 kl4Var = (kl4) this.a;
        float f2 = kl4Var.b;
        float A = td4.A(kl4Var.c, f2, f, f2);
        kl4Var.d = A;
        if (z) {
            ro roVar = kl4Var.e;
            roVar.getClass();
            roVar.c(null, A);
        }
        kl4Var.invalidate();
    }

    @Override // fqb
    public final void n0(float f) {
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null) {
            return;
        }
        g6bVar.s0 = f;
        g6bVar.j = true;
        cl8Var.y(true);
    }

    @Override // fd1
    public final void o(boolean z) {
        sa8 sa8Var = (sa8) this.a;
        PhotoViewer photoViewer = sa8Var.j2;
        ndc ndcVar = photoViewer.G2;
        if (ndcVar != null) {
            if (z) {
                if (ndcVar.c0()) {
                    sa8Var.i2 = true;
                    photoViewer.m();
                    photoViewer.G2.f0();
                    return;
                }
                return;
            }
            if (sa8Var.i2) {
                sa8Var.i2 = false;
                if (photoViewer.H2 || photoViewer.T0()) {
                    return;
                }
                photoViewer.G2.g0();
            }
        }
    }

    public final void o0() {
        cf9 cf9Var = (cf9) this.a;
        cf9Var.getClass();
        try {
            iid iidVar = (iid) cf9Var.b;
            Parcel R = iidVar.R();
            int i = tid.a;
            R.writeInt(0);
            iidVar.V(R, 1);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    @Override // mj5
    public final void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        ((dd6) this.a).m(location);
    }

    @Override // nc8
    public final void p(k47 k47Var) {
        ((fab) ((a58) this.a).G1).f(true);
    }

    public final void p0(mi5 mi5Var, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((cwc) this.a).c) {
        }
        throw new qs7(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), mi5Var);
    }

    @Override // fd1
    public final FrameLayout q() {
        return ((sa8) this.a).j2.f0;
    }

    @Override // fqb
    public final void s(float f) {
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null) {
            return;
        }
        g6bVar.u0 = f;
        g6bVar.j = true;
        cl8Var.b();
    }

    @Override // fqb
    public final void s1(float f, int i) {
        ArrayList arrayList;
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null || (arrayList = g6bVar.T) == null || i < 0 || i >= arrayList.size()) {
            return;
        }
        ((g6b) cl8Var.d.T.get(i)).V = f;
    }

    @Override // fd1
    public final ylb t() {
        return ((sa8) this.a).G1;
    }

    @Override // fd1
    public final kd1 u() {
        return ((sa8) this.a).c0();
    }

    @Override // rt8
    public final void v() {
        ((qo7) this.a).a();
    }

    @Override // fqb
    public final void v1(float f) {
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null) {
            return;
        }
        g6bVar.F = f;
        g6bVar.j = true;
        cl8Var.w(true);
    }

    @Override // d99
    public final void w() {
        gl6 gl6Var = (gl6) this.a;
        gl6Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new fh4(gl6Var, (byte) 25)).setInterpolator(d53.h);
    }

    @Override // fqb
    public final void w0(boolean z) {
        cl8 cl8Var = (cl8) this.a;
        if (cl8Var.i()) {
            cl8Var.F.getClass();
        }
        cl8Var.x(-4, z);
    }

    @Override // fqb
    public final void y(float f) {
        cl8 cl8Var = (cl8) this.a;
        g6b g6bVar = cl8Var.d;
        if (g6bVar == null) {
            return;
        }
        g6bVar.G = f;
        g6bVar.j = true;
        cl8Var.b();
    }

    @Override // d99
    public final void B() {
    }

    @Override // ugc
    public final void O(ArrayList arrayList) {
    }

    @Override // ugc
    public final void c() {
    }

    @Override // ugc
    public final void d0() {
    }

    @Override // rt8
    public final void f(zo7 zo7Var) {
    }

    @Override // ugc
    public final void g(float f) {
    }

    @Override // uj2
    public final void q0() {
    }

    @Override // cx9
    public final void x() {
    }

    @Override // uj2
    public final void y0() {
    }

    @Override // d99
    public final void z() {
    }

    public /* synthetic */ fk3(Object obj) {
        this.a = obj;
    }

    @Override // uj2
    public final void l(float f, float f2) {
    }

    @Override // uj2
    public final void G1(View view, float f, float f2) {
    }

    @Override // uj2
    public final void j(View view, float f, float f2) {
    }

    @Override // uj2
    public final void r(View view, float f, float f2) {
    }
}

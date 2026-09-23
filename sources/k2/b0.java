package k2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.RecyclerView;
import b2.r0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import m.x0;
import n7.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.g1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.z50;
import org.telegram.ui.tt0;
import pg.r1;
import pg.t0;
import qg.y1;
import r0.l1;
import s4.h1;
import s4.o0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public class b0 implements y2.n, x0, n5.b, o0.b, u61, d5, la0, r0.n, y1, r2.k, com.google.android.gms.common.api.internal.o, h1, com.google.android.gms.common.api.internal.s, s0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b0(int i10) {
        this.a = i10;
    }

    public static float[] j(ArrayList arrayList) {
        double d;
        double d10;
        float f7;
        double[] dArr;
        ArrayList arrayList2;
        float f10;
        int i10;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointF pointF = (PointF) arrayList.get(i11);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i12 = 1;
            while (true) {
                i10 = size2 - 1;
                if (i12 >= i10) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i12 - 1);
                PointF pointF3 = (PointF) arrayList.get(i12);
                int i13 = i12 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i13);
                double[] dArr5 = dArr2[i12];
                float f11 = pointF3.x;
                double d14 = d12;
                double d15 = f11 - pointF2.x;
                dArr5[0] = d15 / 6.0d;
                float f12 = pointF4.x;
                dArr5[1] = (f12 - r14) / 3.0d;
                double d16 = f12 - f11;
                dArr5[2] = d16 / 6.0d;
                float f13 = pointF4.y;
                float f14 = pointF3.y;
                dArr3[i12] = ((f13 - f14) / d16) - ((f14 - pointF2.y) / d15);
                i12 = i13;
                d11 = d13;
                d12 = d14;
            }
            d = d11;
            double d17 = d12;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr3[0] = d17;
            dArr3[i10] = d17;
            double[] dArr6 = dArr2[i10];
            dArr6[1] = d;
            dArr6[0] = d17;
            dArr6[2] = d17;
            for (int i14 = 1; i14 < size2; i14++) {
                double[] dArr7 = dArr2[i14];
                double d18 = dArr7[0];
                int i15 = i14 - 1;
                double[] dArr8 = dArr2[i15];
                double d19 = d18 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d19);
                dArr7[0] = d17;
                dArr3[i14] = dArr3[i14] - (d19 * dArr3[i15]);
            }
            for (int i16 = size2 - 2; i16 >= 0; i16--) {
                double[] dArr9 = dArr2[i16];
                double d20 = dArr9[2];
                int i17 = i16 + 1;
                double[] dArr10 = dArr2[i17];
                double d21 = d20 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d21);
                dArr9[2] = d17;
                dArr3[i16] = dArr3[i16] - (d21 * dArr3[i17]);
            }
            dArr = new double[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                dArr[i18] = dArr3[i18] / dArr2[i18][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f10 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i19 = 0;
            while (i19 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i19);
                int i20 = i19 + 1;
                PointF pointF6 = (PointF) arrayList.get(i20);
                int i21 = (int) pointF5.x;
                while (true) {
                    float f15 = pointF6.x;
                    if (i21 < ((int) f15)) {
                        float f16 = i21;
                        PointF pointF7 = pointF5;
                        double d22 = f15 - pointF5.x;
                        double d23 = (f16 - r12) / d22;
                        double d24 = d - d23;
                        int i22 = length;
                        double[] dArr11 = dArr;
                        float f17 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i20]) + ((((d24 * d24) * d24) - d24) * dArr11[i19])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f17 > f7) {
                            f17 = 255.0f;
                        } else if (f17 < 0.0f) {
                            f17 = 0.0f;
                        }
                        arrayList2.add(new PointF(f16, f17));
                        i21++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i22;
                    }
                }
                i19 = i20;
            }
            f10 = 0.0f;
            arrayList2.add((PointF) hg.c.h(1, arrayList));
        }
        float f18 = ((PointF) arrayList2.get(0)).x;
        if (f18 > f10) {
            for (int i23 = (int) f18; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f19 = ((PointF) hg.c.h(1, arrayList2)).x;
        if (f19 < f7) {
            for (int i24 = ((int) f19) + 1; i24 <= 255; i24++) {
                arrayList2.add(new PointF(i24, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i25 = 0; i25 < size3; i25++) {
            PointF pointF8 = (PointF) arrayList2.get(i25);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i25] = sqrt;
        }
        return fArr;
    }

    public static b0 m(float f7, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new b0(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new b0(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new b0(i11, i12, new int[0]) : new b0(i12, i11, new int[0]);
    }

    @Override // o0.b
    public Cursor G(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
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

    @Override // androidx.lifecycle.s0
    public p0 H(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // s4.h1
    public View I(int i10) {
        return ((o0) this.b).q(i10);
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.b).U0(i10, z10, 0, true, 0L);
    }

    @Override // org.telegram.ui.Components.la0
    public void L(int i10, int i11, CharSequence charSequence, boolean z10) {
        wi wiVar = (wi) this.b;
        if (wiVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wiVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, wiVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            wiVar.m1().setText(spannableStringBuilder);
            wiVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // s4.h1
    public int N(View view) {
        return o0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).bottomMargin;
    }

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        bm0 bm0Var = (bm0) this.b;
        bm0Var.v.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        bm0Var.s.requestLayout();
        return l1.b;
    }

    @Override // y2.n
    public void a() {
        l2.g gVar = (l2.g) this.b;
        gVar.A.a();
        b5 b5Var = gVar.C;
        if (b5Var != null) {
            throw b5Var;
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        s6.a aVar = (s6.a) this.b;
        Parcel I0 = eVar.I0();
        k7.a.d(I0, fVar);
        k7.a.c(I0, aVar);
        I0.writeStrongBinder(null);
        eVar.J0(I0, 2);
    }

    @Override // androidx.lifecycle.s0
    public p0 b(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void c(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // o0.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // s4.h1
    public int d(View view) {
        return o0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).topMargin;
    }

    @Override // fd.a
    public Object get() {
        return new lf.i((Context) ((a9.r) this.b).a, new rb.a(23), new qb.b(23), 4);
    }

    public void h(int i10, int i11, c3.p pVar) {
        char c10;
        char c11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        u3.d dVar = (u3.d) this.b;
        u3.e eVar = dVar.b;
        SparseArray sparseArray = dVar.c;
        e2.v vVar = dVar.k;
        e2.v vVar2 = dVar.i;
        int i16 = 1;
        int i17 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (dVar.J != 2) {
                    return;
                }
                u3.c cVar = (u3.c) sparseArray.get(dVar.P);
                int i18 = dVar.S;
                e2.v vVar3 = dVar.p;
                if (i18 != 4 || !"V_VP9".equals(cVar.c)) {
                    pVar.q(i11);
                    return;
                } else {
                    vVar3.G(i11);
                    pVar.readFully(vVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                dVar.d(i10);
                u3.c cVar2 = dVar.x;
                int i19 = cVar2.h;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    pVar.q(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                cVar2.P = bArr;
                pVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                dVar.d(i10);
                byte[] bArr2 = new byte[i11];
                dVar.x.j = bArr2;
                pVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                pVar.readFully(bArr3, 0, i11);
                dVar.d(i10);
                dVar.x.k = new c3.g0(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(vVar.a, (byte) 0);
                pVar.readFully(vVar.a, 4 - i11, i11);
                vVar.J(0);
                dVar.z = (int) vVar.z();
                return;
            }
            if (i10 == 25506) {
                dVar.d(i10);
                byte[] bArr4 = new byte[i11];
                dVar.x.l = bArr4;
                pVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw b2.s0.a(null, "Unexpected id: " + i10);
            }
            dVar.d(i10);
            byte[] bArr5 = new byte[i11];
            dVar.x.x = bArr5;
            pVar.readFully(bArr5, 0, i11);
            return;
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            vVar2.G(0);
        }
        u3.c cVar3 = (u3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.q(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i20 = (vVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i11 - dVar.Q) - 3;
            } else {
                dVar.j(pVar, 4);
                int i21 = (vVar2.a[3] & 255) + 1;
                dVar.N = i21;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                dVar.O = iArr2;
                if (i20 == 2) {
                    int i22 = (i11 - dVar.Q) - 4;
                    int i23 = dVar.N;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw b2.s0.a(null, "Unexpected lacing value: " + i20);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = dVar.N - i16;
                            if (i24 >= i27) {
                                c10 = 1;
                                c11 = 0;
                                dVar.O[i27] = ((i11 - dVar.Q) - i26) - i25;
                                break;
                            }
                            dVar.O[i24] = i17;
                            int i28 = i26 + 1;
                            dVar.j(pVar, i28);
                            if (vVar2.a[i26] == 0) {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= 8) {
                                    j3 = 0;
                                    i12 = i28;
                                    break;
                                }
                                int i30 = 1 << (7 - i29);
                                if ((vVar2.a[i26] & i30) != 0) {
                                    i12 = i28 + i29;
                                    dVar.j(pVar, i12);
                                    j3 = vVar2.a[i26] & b10 & (~i30);
                                    while (i28 < i12) {
                                        j3 = (j3 << 8) | (vVar2.a[i28] & b10);
                                        i28++;
                                        b10 = 255;
                                    }
                                    if (i24 > 0) {
                                        j3 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i29++;
                                    b10 = 255;
                                }
                            }
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i31 = (int) j3;
                            int[] iArr3 = dVar.O;
                            if (i24 != 0) {
                                i31 += iArr3[i24 - 1];
                            }
                            iArr3[i24] = i31;
                            i25 += i31;
                            i24++;
                            i26 = i12;
                            b10 = 255;
                            i16 = 1;
                            i17 = 0;
                        }
                        throw b2.s0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i13 = dVar.N - 1;
                        if (i32 >= i13) {
                            break;
                        }
                        dVar.O[i32] = 0;
                        while (true) {
                            i14 = i34 + 1;
                            dVar.j(pVar, i14);
                            int i35 = vVar2.a[i34] & 255;
                            int[] iArr4 = dVar.O;
                            i15 = iArr4[i32] + i35;
                            iArr4[i32] = i15;
                            if (i35 != 255) {
                                break;
                            } else {
                                i34 = i14;
                            }
                        }
                        i33 += i15;
                        i32++;
                        i34 = i14;
                    }
                    dVar.O[i13] = ((i11 - dVar.Q) - i34) - i33;
                }
            }
            c10 = 1;
            c11 = 0;
            byte[] bArr6 = vVar2.a;
            dVar.K = dVar.l((bArr6[c10] & 255) | (bArr6[c11] << 8)) + dVar.E;
            dVar.R = (cVar3.e == 2 || (i10 == 163 && (vVar2.a[2] & 128) == 128)) ? 1 : 0;
            dVar.J = 2;
            dVar.M = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = dVar.M;
                if (i36 >= dVar.N) {
                    dVar.J = 0;
                    return;
                } else {
                    dVar.e(cVar3, ((dVar.M * cVar3.f) / MediaDataController.MAX_STYLE_RUNS_COUNT) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i36], false), 0);
                    dVar.M++;
                }
            }
        } else {
            while (true) {
                int i37 = dVar.M;
                if (i37 >= dVar.N) {
                    return;
                }
                int[] iArr5 = dVar.O;
                iArr5[i37] = dVar.n(pVar, cVar3, iArr5[i37], true);
                dVar.M++;
            }
        }
    }

    public p4.r i() {
        if (((ArrayList) this.b) == null) {
            return p4.r.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.b);
        return new p4.r(bundle, (ArrayList) this.b);
    }

    @Override // org.telegram.ui.Components.u61
    public void invalidate() {
        switch (this.a) {
            case 9:
                ((t1) ((g1) this.b).b).invalidate();
                break;
            default:
                ((eg0) this.b).h.invalidate();
                break;
        }
    }

    public void k(int i10, long j3) {
        u3.d dVar = (u3.d) this.b;
        if (i10 == 20529) {
            if (j3 == 0) {
                return;
            }
            throw b2.s0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
        if (i10 == 20530) {
            if (j3 == 1) {
                return;
            }
            throw b2.s0.a(null, "ContentEncodingScope " + j3 + " not supported");
        }
        switch (i10) {
            case 131:
                dVar.d(i10);
                dVar.x.e = (int) j3;
                return;
            case 136:
                dVar.d(i10);
                dVar.x.X = j3 == 1;
                return;
            case 155:
                dVar.L = dVar.l(j3);
                return;
            case 159:
                dVar.d(i10);
                dVar.x.Q = (int) j3;
                return;
            case 176:
                dVar.d(i10);
                dVar.x.n = (int) j3;
                return;
            case MessagesStorage.LAST_DB_VERSION /* 179 */:
                dVar.b(i10);
                dVar.F.b(dVar.l(j3));
                return;
            case 186:
                dVar.d(i10);
                dVar.x.o = (int) j3;
                return;
            case 215:
                dVar.d(i10);
                dVar.x.d = (int) j3;
                return;
            case 231:
                dVar.E = dVar.l(j3);
                return;
            case 238:
                dVar.S = (int) j3;
                return;
            case 241:
                if (dVar.H) {
                    return;
                }
                dVar.b(i10);
                dVar.G.b(j3);
                dVar.H = true;
                return;
            case 251:
                dVar.T = true;
                return;
            case 16871:
                dVar.d(i10);
                dVar.x.h = (int) j3;
                return;
            case 16980:
                if (j3 == 3) {
                    return;
                }
                throw b2.s0.a(null, "ContentCompAlgo " + j3 + " not supported");
            case 17029:
                if (j3 < 1 || j3 > 2) {
                    throw b2.s0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                }
                return;
            case 17143:
                if (j3 == 1) {
                    return;
                }
                throw b2.s0.a(null, "EBMLReadVersion " + j3 + " not supported");
            case 18401:
                if (j3 == 5) {
                    return;
                }
                throw b2.s0.a(null, "ContentEncAlgo " + j3 + " not supported");
            case 18408:
                if (j3 == 1) {
                    return;
                }
                throw b2.s0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
            case 21420:
                dVar.A = j3 + dVar.s;
                return;
            case 21432:
                int i11 = (int) j3;
                dVar.d(i10);
                if (i11 == 0) {
                    dVar.x.y = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.x.y = 2;
                    return;
                } else if (i11 == 3) {
                    dVar.x.y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    dVar.x.y = 3;
                    return;
                }
            case 21680:
                dVar.d(i10);
                dVar.x.q = (int) j3;
                return;
            case 21682:
                dVar.d(i10);
                dVar.x.s = (int) j3;
                return;
            case 21690:
                dVar.d(i10);
                dVar.x.r = (int) j3;
                return;
            case 21930:
                dVar.d(i10);
                dVar.x.W = j3 == 1;
                return;
            case 21938:
                dVar.d(i10);
                u3.c cVar = dVar.x;
                cVar.z = true;
                cVar.p = (int) j3;
                return;
            case 21998:
                dVar.d(i10);
                dVar.x.g = (int) j3;
                return;
            case 22186:
                dVar.d(i10);
                dVar.x.T = j3;
                return;
            case 22203:
                dVar.d(i10);
                dVar.x.U = j3;
                return;
            case 25188:
                dVar.d(i10);
                dVar.x.R = (int) j3;
                return;
            case 30114:
                dVar.U = j3;
                return;
            case 30321:
                dVar.d(i10);
                int i12 = (int) j3;
                if (i12 == 0) {
                    dVar.x.t = 0;
                    return;
                }
                if (i12 == 1) {
                    dVar.x.t = 1;
                    return;
                } else if (i12 == 2) {
                    dVar.x.t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    dVar.x.t = 3;
                    return;
                }
            case 2352003:
                dVar.d(i10);
                dVar.x.f = (int) j3;
                return;
            case 2807729:
                dVar.t = j3;
                return;
            default:
                switch (i10) {
                    case 21945:
                        dVar.d(i10);
                        int i13 = (int) j3;
                        if (i13 == 1) {
                            dVar.x.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            dVar.x.C = 1;
                            return;
                        }
                    case 21946:
                        dVar.d(i10);
                        int g10 = b2.j.g((int) j3);
                        if (g10 != -1) {
                            dVar.x.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.d(i10);
                        dVar.x.z = true;
                        int f7 = b2.j.f((int) j3);
                        if (f7 != -1) {
                            dVar.x.A = f7;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.d(i10);
                        dVar.x.D = (int) j3;
                        return;
                    case 21949:
                        dVar.d(i10);
                        dVar.x.E = (int) j3;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // qg.y1
    public void l(float f7) {
        tt0 tt0Var = (tt0) this.b;
        t0.e(tt0Var.P1).k(String.valueOf(pg.m.a.indexOf(tt0Var.W0.getCurrentBrush())), f7);
        r1 r1Var = tt0Var.K1;
        r1Var.c = f7;
        tt0Var.t0(r1Var, null);
    }

    public void n(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.b;
        if (pVar != eVar.y || mVar == null) {
            if (pVar == eVar.e) {
                if (mVar != null) {
                    eVar.n(eVar.d, mVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        p4.u uVar = eVar.x.a;
        String d = mVar.d();
        p4.v vVar = new p4.v(uVar, d, eVar.b(uVar, d), false);
        vVar.i(mVar);
        if (eVar.d == vVar) {
            return;
        }
        eVar.h(eVar, vVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    public byte o() {
        int read = ((com.google.firebase.messaging.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int p() {
        return ((o() & 255) << 24) | ((o() & 255) << 16) | ((o() & 255) << 8) | (o() & 255);
    }

    public int q() {
        return ((o() & Byte.MAX_VALUE) << 21) | ((o() & Byte.MAX_VALUE) << 14) | ((o() & Byte.MAX_VALUE) << 7) | (o() & Byte.MAX_VALUE);
    }

    public void r(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    public void s(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((com.google.firebase.messaging.d) this.b).skip(j3 - j10);
            if (skip <= 0) {
                throw new EOFException();
            }
            j10 += skip;
        }
    }

    public String toString() {
        switch (this.a) {
            case 23:
                re.b bVar = re.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // s4.h1
    public int u() {
        return ((o0) this.b).G();
    }

    @Override // r2.k
    public r2.l v(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (i10 < 31 && ((context = (Context) this.b) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new rb.a(20).v(nVar);
        }
        int h = r0.h(((b2.s) nVar.c).r);
        e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + e2.d0.G(h));
        return new a1(14, new r2.b(h, 0), new r2.b(h, 1)).v(nVar);
    }

    @Override // org.telegram.ui.Components.la0
    public Paint.FontMetricsInt w() {
        return ((wi) this.b).E0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // s4.h1
    public int x() {
        o0 o0Var = (o0) this.b;
        return o0Var.n - o0Var.C();
    }

    public /* synthetic */ b0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ b0(s6.g gVar, s6.a aVar) {
        this.a = 27;
        this.b = aVar;
    }

    public b0() {
        this.a = 8;
        this.b = new o2.d(5, 1.0f, false);
    }

    public b0(int i10, int i11, int[] iArr) {
        this.a = 10;
        z50[] z50VarArr = new z50[(iArr.length / 2) + 1];
        this.b = z50VarArr;
        z50 z50Var = new z50(i10, i11);
        int i12 = 0;
        z50VarArr[0] = z50Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((z50[]) this.b)[i13] = new z50(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    @Override // qg.y1
    public float get() {
        tt0 tt0Var = (tt0) this.b;
        int i10 = tt0Var.P1;
        pg.m currentBrush = tt0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return t0.e(i10).i;
        }
        return t0.e(i10).f(String.valueOf(pg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    public b0(v1.c[] initializers) {
        this.a = 29;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.b = initializers;
    }

    public b0(ArrayList arrayList) {
        this.a = 24;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public b0(EditText editText) {
        this.a = 19;
        this.b = new a1(editText);
    }

    public b0(Context context, Uri uri) {
        this.a = 7;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // org.telegram.ui.Components.la0
    public /* synthetic */ void O(String str) {
    }

    @Override // m.x0
    public void e(int i10) {
    }

    @Override // m.x0
    public void g(int i10) {
    }

    @Override // org.telegram.ui.Components.la0
    public /* synthetic */ void A(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.la0
    public /* synthetic */ void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }
}

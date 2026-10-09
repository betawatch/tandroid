package l2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.media.Rating;
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
import android.widget.TextView;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import androidx.recyclerview.widget.RecyclerView;
import ci.u5;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.v;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import k2.g0;
import m.q3;
import m.x0;
import m2.t;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.h1;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.a5;
import org.telegram.ui.Wallet.f3;
import org.telegram.ui.ec0;
import org.telegram.ui.k9;
import org.telegram.ui.ts0;
import org.telegram.ui.u9;
import pg.u0;
import qg.v1;
import qg.w0;
import s4.d1;
import s4.g1;
import s4.j1;
import s4.p0;
import s4.q0;
import v7.g5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class f implements x0, n5.b, o0.a, a81, f5, mb0, lg.o, ah.j, u9, v1, com.google.android.gms.common.api.internal.o, j1, s, s0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ f(int i10, boolean z10) {
        this.a = i10;
    }

    public static float[] q(ArrayList arrayList) {
        float f7;
        int i10;
        int i11;
        float f10;
        double d;
        double d10;
        double[] dArr;
        ArrayList arrayList2;
        float f11;
        int i12;
        int size = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            f7 = 255.0f;
            if (i14 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i14);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i14++;
        }
        int size2 = arrayList.size();
        int i15 = 1;
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i10 = 0;
            i11 = 1;
            f10 = 255.0f;
            d = 1.0d;
            d10 = 6.0d;
            dArr = null;
        } else {
            char c10 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i16 = 1;
            while (true) {
                i12 = size2 - 1;
                if (i16 >= i12) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i16 - 1);
                PointF pointF3 = (PointF) arrayList.get(i16);
                int i17 = i16 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i17);
                double[] dArr5 = dArr2[i16];
                char c11 = c10;
                float f12 = pointF3.x;
                double d14 = d12;
                int i18 = i13;
                int i19 = i15;
                double d15 = f12 - pointF2.x;
                dArr5[i18] = d15 / 6.0d;
                float f13 = pointF4.x;
                float f14 = f7;
                dArr5[i19] = (f13 - r14) / 3.0d;
                double d16 = f13 - f12;
                dArr5[c11] = d16 / 6.0d;
                float f15 = pointF4.y;
                float f16 = pointF3.y;
                dArr3[i16] = ((f15 - f16) / d16) - ((f16 - pointF2.y) / d15);
                i16 = i17;
                c10 = c11;
                d11 = d13;
                d12 = d14;
                i13 = i18;
                i15 = i19;
                f7 = f14;
            }
            i10 = i13;
            i11 = i15;
            f10 = f7;
            d = d11;
            char c12 = c10;
            double d17 = d12;
            d10 = 6.0d;
            dArr3[i10] = d17;
            dArr3[i12] = d17;
            double[] dArr6 = dArr2[i12];
            dArr6[i11] = d;
            dArr6[i10] = d17;
            dArr6[c12] = d17;
            for (int i20 = i11; i20 < size2; i20++) {
                double[] dArr7 = dArr2[i20];
                double d18 = dArr7[i10];
                int i21 = i20 - 1;
                double[] dArr8 = dArr2[i21];
                double d19 = d18 / dArr8[i11];
                dArr7[i11] = dArr7[i11] - (dArr8[c12] * d19);
                dArr7[i10] = d17;
                dArr3[i20] = dArr3[i20] - (d19 * dArr3[i21]);
            }
            for (int i22 = size2 - 2; i22 >= 0; i22--) {
                double[] dArr9 = dArr2[i22];
                double d20 = dArr9[c12];
                int i23 = i22 + 1;
                double[] dArr10 = dArr2[i23];
                double d21 = d20 / dArr10[i11];
                dArr9[i11] = dArr9[i11] - (dArr10[i10] * d21);
                dArr9[c12] = d17;
                dArr3[i22] = dArr3[i22] - (d21 * dArr3[i23]);
            }
            dArr = new double[size2];
            for (int i24 = i10; i24 < size2; i24++) {
                dArr[i24] = dArr3[i24] / dArr2[i24][i11];
            }
        }
        int length = dArr.length;
        if (length < i11) {
            arrayList2 = null;
            f11 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i25 = i10;
            while (i25 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i25);
                int i26 = i25 + 1;
                PointF pointF6 = (PointF) arrayList.get(i26);
                int i27 = (int) pointF5.x;
                while (true) {
                    float f17 = pointF6.x;
                    if (i27 < ((int) f17)) {
                        float f18 = i27;
                        PointF pointF7 = pointF5;
                        double d22 = f17 - pointF5.x;
                        double d23 = (f18 - r12) / d22;
                        double d24 = d - d23;
                        int i28 = length;
                        double[] dArr11 = dArr;
                        float f19 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i26]) + ((((d24 * d24) * d24) - d24) * dArr11[i25])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f19 > f10) {
                            f19 = f10;
                        } else if (f19 < 0.0f) {
                            f19 = 0.0f;
                        }
                        arrayList2.add(new PointF(f18, f19));
                        i27++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i28;
                    }
                }
                i25 = i26;
            }
            f11 = 0.0f;
            arrayList2.add((PointF) hg.c.g(1, arrayList));
        }
        int i29 = i10;
        float f20 = ((PointF) arrayList2.get(i29)).x;
        if (f20 > f11) {
            for (int i30 = (int) f20; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f21 = ((PointF) hg.c.g(1, arrayList2)).x;
        if (f21 < f10) {
            for (int i31 = ((int) f21) + 1; i31 <= 255; i31++) {
                arrayList2.add(new PointF(i31, f10));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i29 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i29);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i29] = sqrt;
            i29++;
        }
        return fArr;
    }

    public static f s(float f7, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new f(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new f(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new f(i11, i12, new int[0]) : new f(i12, i11, new int[0]);
    }

    public void A(String str, String str2) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    public void B(CharSequence charSequence, String str) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.b).putCharSequence(str, charSequence);
    }

    @Override // ah.j
    public void B0(ah.a aVar) {
        aVar.a(((mr0) this.b).getThemedColor(i6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    public void C(d1 d1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        p0 p0Var = recyclerView.x;
        View view = d1Var.a;
        pf.e eVar = recyclerView.b;
        la.h hVar = p0Var.a;
        g0 g0Var = (g0) hVar.b;
        int indexOfChild = ((RecyclerView) g0Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) hVar.c).F(indexOfChild)) {
                hVar.Z(view);
            }
            g0Var.Z0(indexOfChild);
        }
        eVar.g(view);
    }

    @Override // lg.o
    public void D(boolean z10) {
        ((vf0) this.b).c.setAspectLock(z10);
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.b).R0(i10, z10, 0, true, 0L);
    }

    @Override // org.telegram.ui.u9
    public void K(String str) {
        String trim;
        int i10;
        a5 a5Var = (a5) this.b;
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new f3(a5Var, 7));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        String scheme = parse.getScheme();
        if (("ton".equalsIgnoreCase(scheme) || "tc".equalsIgnoreCase(scheme)) && (a5Var.getParentActivity() instanceof LaunchActivity)) {
            LaunchActivity launchActivity = (LaunchActivity) a5Var.getParentActivity();
            i10 = ((n2) a5Var).currentAccount;
            if (new ec0(launchActivity, i10, null, false).g(parse)) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new f3(a5Var, 7));
    }

    @Override // lg.o
    public void S(boolean z10) {
        vf0 vf0Var = (vf0) this.b;
        vf0Var.getClass();
        uf0 uf0Var = vf0Var.a;
        if (uf0Var != null) {
            ((ts0) uf0Var).a(z10);
        }
    }

    @Override // lg.o
    public void W() {
        uf0 uf0Var = ((vf0) this.b).a;
        if (uf0Var != null) {
            PhotoViewer photoViewer = ((ts0) uf0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // o0.a
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 25:
                s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                s6.a aVar = (s6.a) this.b;
                Parcel H0 = eVar.H0();
                k7.a.d(H0, fVar);
                k7.a.c(H0, aVar);
                eVar.I0(H0, 1);
                return;
            default:
                v8.e eVar2 = (v8.e) this.b;
                e8.b bVar = (e8.b) obj;
                bVar.getClass();
                e8.a aVar2 = new e8.a(1, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    try {
                        iVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e7) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e7);
                    Bundle bundle = Bundle.EMPTY;
                    g5.a(Status.h, Boolean.FALSE, aVar2.b);
                    return;
                }
        }
    }

    @Override // s4.j1
    public int b(View view) {
        return p0.x(view) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).leftMargin;
    }

    @Override // s4.j1
    public int c() {
        return ((p0) this.b).D();
    }

    @Override // s4.j1
    public int c0() {
        p0 p0Var = (p0) this.b;
        return p0Var.m - p0Var.E();
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // org.telegram.ui.Components.mb0
    public Paint.FontMetricsInt f() {
        return ((yi) this.b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // gd.a
    public Object get() {
        return new la.h((Context) ((g0) this.b).b, new ob.a(24), new na.d(24), 4);
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 h(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // org.telegram.ui.Components.a81
    public void invalidate() {
        ((u1) ((h1) this.b).b).invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(int i10, int i11, c3.p pVar) {
        int i12;
        int i13;
        int i14;
        long j3;
        int i15;
        int i16;
        int i17;
        int i18;
        u3.d dVar = (u3.d) this.b;
        u3.e eVar = dVar.b;
        SparseArray sparseArray = dVar.c;
        v vVar = dVar.k;
        v vVar2 = dVar.i;
        int i19 = 1;
        int i20 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (dVar.J != 2) {
                    return;
                }
                u3.c cVar = (u3.c) sparseArray.get(dVar.P);
                int i21 = dVar.S;
                v vVar3 = dVar.p;
                if (i21 != 4 || !"V_VP9".equals(cVar.c)) {
                    pVar.r(i11);
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
                int i22 = cVar2.h;
                if (i22 != 1685485123 && i22 != 1685480259) {
                    pVar.r(i11);
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
            pVar.r(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i23 = (vVar2.a[2] & 6) >> 1;
            int i24 = 255;
            if (i23 == 0) {
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
                int i25 = (vVar2.a[3] & 255) + 1;
                dVar.N = i25;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i25];
                } else if (iArr2.length < i25) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i25)];
                }
                dVar.O = iArr2;
                if (i23 == 2) {
                    int i26 = (i11 - dVar.Q) - 4;
                    int i27 = dVar.N;
                    Arrays.fill(iArr2, 0, i27, i26 / i27);
                } else {
                    if (i23 != 1) {
                        if (i23 != 3) {
                            throw b2.s0.a(null, "Unexpected lacing value: " + i23);
                        }
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            int i31 = dVar.N - i19;
                            if (i28 >= i31) {
                                i12 = i19;
                                i13 = i20;
                                dVar.O[i31] = ((i11 - dVar.Q) - i30) - i29;
                                break;
                            }
                            dVar.O[i28] = i20;
                            int i32 = i30 + 1;
                            dVar.j(pVar, i32);
                            if (vVar2.a[i30] == 0) {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                            int i33 = i19;
                            int i34 = i20;
                            while (true) {
                                if (i34 >= 8) {
                                    i14 = i20;
                                    j3 = 0;
                                    i15 = i32;
                                    break;
                                }
                                int i35 = i33 << (7 - i34);
                                i14 = i20;
                                if ((vVar2.a[i30] & i35) != 0) {
                                    i15 = i32 + i34;
                                    dVar.j(pVar, i15);
                                    j3 = vVar2.a[i30] & i24 & (~i35);
                                    while (i32 < i15) {
                                        j3 = (j3 << 8) | (vVar2.a[i32] & i24);
                                        i32++;
                                        i24 = 255;
                                    }
                                    if (i28 > 0) {
                                        j3 -= (1 << ((i34 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i34++;
                                    i20 = i14;
                                    i24 = 255;
                                }
                            }
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i36 = (int) j3;
                            int[] iArr3 = dVar.O;
                            if (i28 != 0) {
                                i36 += iArr3[i28 - 1];
                            }
                            iArr3[i28] = i36;
                            i29 += i36;
                            i28++;
                            i30 = i15;
                            i19 = i33;
                            i20 = i14;
                            i24 = 255;
                        }
                        throw b2.s0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 4;
                    while (true) {
                        i16 = dVar.N - 1;
                        if (i37 >= i16) {
                            break;
                        }
                        dVar.O[i37] = 0;
                        while (true) {
                            i17 = i39 + 1;
                            dVar.j(pVar, i17);
                            int i40 = vVar2.a[i39] & 255;
                            int[] iArr4 = dVar.O;
                            i18 = iArr4[i37] + i40;
                            iArr4[i37] = i18;
                            if (i40 != 255) {
                                break;
                            } else {
                                i39 = i17;
                            }
                        }
                        i38 += i18;
                        i37++;
                        i39 = i17;
                    }
                    dVar.O[i16] = ((i11 - dVar.Q) - i39) - i38;
                }
            }
            i12 = 1;
            i13 = 0;
            byte[] bArr6 = vVar2.a;
            dVar.K = dVar.l((bArr6[i12] & 255) | (bArr6[i13] << 8)) + dVar.E;
            dVar.R = (cVar3.e == 2 || (i10 == 163 && (vVar2.a[2] & 128) == 128)) ? i12 : i13;
            dVar.J = 2;
            dVar.M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i41 = dVar.M;
                if (i41 >= dVar.N) {
                    dVar.J = 0;
                    return;
                } else {
                    dVar.e(cVar3, ((dVar.M * cVar3.f) / MediaDataController.MAX_STYLE_RUNS_COUNT) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i41], false), 0);
                    dVar.M++;
                }
            }
        } else {
            while (true) {
                int i42 = dVar.M;
                if (i42 >= dVar.N) {
                    return;
                }
                int[] iArr5 = dVar.O;
                boolean z10 = i12;
                iArr5[i42] = dVar.n(pVar, cVar3, iArr5[i42], z10);
                dVar.M += z10 ? 1 : 0;
            }
        }
    }

    @Override // org.telegram.ui.Components.mb0
    public void k(int i10, int i11, CharSequence charSequence, boolean z10) {
        yi yiVar = (yi) this.b;
        if (yiVar.o1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(yiVar.o1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, yiVar.o1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            yiVar.o1().setText(spannableStringBuilder);
            yiVar.o1().setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // ah.j
    public void l(Canvas canvas) {
        mr0 mr0Var = (mr0) this.b;
        canvas.drawColor(mr0Var.getThemedColor(i6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            mr0Var.O0.b(canvas, -3);
        }
    }

    public l5.j n() {
        Context context = (Context) this.b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        l5.j jVar = new l5.j();
        jVar.a = n5.a.a(l5.m.a);
        g0 g0Var = new g0(context, 7);
        jVar.b = g0Var;
        boolean z10 = false;
        jVar.c = n5.a.a(new pf.b(g0Var, new f(g0Var, 3), z10, 26));
        g0 g0Var2 = jVar.b;
        jVar.d = new t(g0Var2, 16);
        gd.a a2 = n5.a.a(new b5(jVar.d, n5.a.a(new m.f3(g0Var2, 20)), z10, 15));
        jVar.e = a2;
        qb.b bVar = new qb.b(19);
        g0 g0Var3 = jVar.b;
        la.h hVar = new la.h(g0Var3, a2, bVar, 23);
        gd.a aVar = jVar.a;
        gd.a aVar2 = jVar.c;
        u5 u5Var = new u5(aVar, aVar2, hVar, a2, a2);
        q3 q3Var = new q3();
        q3Var.a = g0Var3;
        q3Var.b = aVar2;
        q3Var.c = a2;
        q3Var.d = hVar;
        q3Var.e = aVar;
        q3Var.f = a2;
        q3Var.h = a2;
        oi.f fVar = new oi.f();
        fVar.a = aVar;
        fVar.b = a2;
        fVar.c = hVar;
        fVar.d = a2;
        jVar.f = n5.a.a(new aa.a(u5Var, q3Var, fVar, false, 29));
        return jVar;
    }

    public s0.d o(int i10) {
        return null;
    }

    public s0.d p(int i10) {
        return null;
    }

    @Override // qg.v1
    public void q0(float f7) {
        w0 w0Var = (w0) this.b;
        u0.e(w0Var.a).k("-1", f7);
        w0Var.e.setBrushSize(f7);
    }

    public void r(int i10, long j3) {
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
                dVar.F.c(dVar.l(j3));
                return;
            case 186:
                dVar.d(i10);
                dVar.x.o = (int) j3;
                return;
            case 215:
                dVar.d(i10);
                dVar.x.d = (int) j3;
                return;
            case TLRPC.LAYER /* 231 */:
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
                dVar.G.c(j3);
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

    public boolean t(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void u(d1 d1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        boolean z10;
        d1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(d1Var);
        recyclerView.h(d1Var);
        d1Var.q(false);
        g1 g1Var = (g1) recyclerView.c0;
        g1Var.getClass();
        int i11 = q0Var.a;
        int i12 = q0Var.b;
        View view = d1Var.a;
        int left = q0Var2 == null ? view.getLeft() : q0Var2.a;
        int top = q0Var2 == null ? view.getTop() : q0Var2.b;
        if (d1Var.j() || (i11 == left && i12 == top)) {
            int i13 = d1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            d1Var.i = (d1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            g1Var.s(d1Var, q0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = g1Var.r(d1Var, q0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    @Override // s4.j1
    public View u0(int i10) {
        return ((p0) this.b).q(i10);
    }

    public void v(String str, Bitmap bitmap) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    @Override // lg.o
    public void w() {
        uf0 uf0Var = ((vf0) this.b).a;
        if (uf0Var != null) {
            ((ts0) uf0Var).a.e0.invalidate();
        }
    }

    @Override // s4.j1
    public int w0(View view) {
        return p0.y(view) + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).rightMargin;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void x(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    public void y(long j3, String str) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.b).putLong(str, j3);
    }

    public void z(String str, n4.g0 g0Var) {
        Rating rating;
        float f7 = g0Var.b;
        int i10 = g0Var.a;
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a1.g.q("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.b;
        if (g0Var.c == null) {
            if (g0Var.b()) {
                switch (i10) {
                    case 1:
                        g0Var.c = Rating.newHeartRating(i10 == 1 && f7 == 1.0f);
                        break;
                    case 2:
                        g0Var.c = Rating.newThumbRating(i10 == 2 && f7 == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        g0Var.c = Rating.newStarRating(i10, g0Var.a());
                        break;
                    case 6:
                        if (i10 != 6 || !g0Var.b()) {
                            f7 = -1.0f;
                        }
                        g0Var.c = Rating.newPercentageRating(f7);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            g0Var.c = Rating.newUnratedRating(i10);
        }
        rating = g0Var.c;
        bundle.putParcelable(str, rating);
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ String z0() {
        return null;
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ f(s6.g gVar, s6.a aVar) {
        this.a = 25;
        this.b = aVar;
    }

    public f(int i10, int i11, int[] iArr) {
        this.a = 9;
        a70[] a70VarArr = new a70[(iArr.length / 2) + 1];
        this.b = a70VarArr;
        a70 a70Var = new a70(i10, i11);
        int i12 = 0;
        a70VarArr[0] = a70Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((a70[]) this.b)[i13] = new a70(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public f(v1.c[] initializers) {
        this.a = 28;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.b = initializers;
    }

    @Override // qg.v1
    public float get() {
        w0 w0Var = (w0) this.b;
        int i10 = w0Var.a;
        pg.m currentBrush = w0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).i;
        }
        return u0.e(i10).f("-1", currentBrush.d());
    }

    public f(TextView textView) {
        this.a = 18;
        this.b = new q1.g(textView);
    }

    public f(Context context, Uri uri) {
        this.a = 6;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public f(int i10) {
        this.a = i10;
        switch (i10) {
            case 7:
                this.b = new o2.d(5, 1.0f, false);
                break;
            case 22:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.e(this);
                    break;
                } else {
                    this.b = new ei0(this);
                    break;
                }
            default:
                this.b = new Bundle();
                break;
        }
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // m.x0
    public void d(int i10) {
    }

    @Override // m.x0
    public void g(int i10) {
    }

    @Override // org.telegram.ui.Components.mb0
    public /* synthetic */ void m(String str) {
    }

    @Override // org.telegram.ui.Components.mb0
    public /* synthetic */ void e(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.mb0
    public /* synthetic */ void i(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}

// default package

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.EOFException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class aj3 implements jx9, cj2, cr7, ty9, rn4, s9, tic, rj5, tw8, fc1, pj5, oa9, nr7, j98, bv9, ifc, a70 {
    public final /* synthetic */ byte a;
    public Object b;

    public aj3(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 29:
                this.b = new z8d((byte) 26);
                break;
            default:
                this.b = new ey7(10);
                break;
        }
    }

    public static aj3 Q(Object obj) {
        if (obj != null) {
            return new aj3(obj, (byte) 13);
        }
        p3d.h("instance cannot be null");
        return null;
    }

    public static a86 T(Looper looper, Object obj, String str) {
        xve.i(obj, "Listener must not be null");
        xve.i(looper, "Looper must not be null");
        return new a86(looper, obj, str);
    }

    public static float[] V(ArrayList arrayList) {
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
            arrayList2.add((PointF) c00.g(1, arrayList));
        }
        int i20 = i;
        float f12 = ((PointF) arrayList2.get(i20)).x;
        if (f12 > f3) {
            for (int i21 = (int) f12; i21 >= 0; i21--) {
                arrayList2.add(i20, new PointF(i21, f3));
            }
        }
        float f13 = ((PointF) c00.g(1, arrayList2)).x;
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

    public static void b0(String str, TreeMap treeMap) {
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

    @Override // tic
    public final boolean A(int i) {
        return false;
    }

    @Override // jx9
    public final void B(of3 of3Var) {
        ((uj3) this.b).c5(of3Var);
    }

    @Override // bv9
    public final boolean B0(int i, View view) {
        return false;
    }

    @Override // j98
    public final void C(int i, boolean z, boolean z2) {
        w78 w78Var = (w78) this.b;
        w78Var.removeSelfFromStack();
        if (z) {
            return;
        }
        w78Var.Z(w78Var.b, w78Var.c, z2, i);
    }

    @Override // fc1
    public final FrameLayout D() {
        return (hc8) this.b;
    }

    @Override // oa9
    public final boolean E() {
        switch (this.a) {
            case 19:
                return true;
            default:
                vab vabVar = (vab) this.b;
                boolean z = vabVar.t0 == null;
                if (!z) {
                    vabVar.C0(null, true);
                }
                return z;
        }
    }

    @Override // rn4
    public final Cursor F(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // fc1
    public final long G() {
        return ((hc8) this.b).getCaptionsTrimEnd();
    }

    @Override // a70
    public final void H(int i, int i2) {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        RectF rectF = ProfileActivity.Z6;
        long a = profileActivity.a();
        profileActivity.getMessagesController().V4(i, a);
        if (profileActivity.w2 == null && profileActivity.v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User X1 = profileActivity.getMessagesController().X1(Long.valueOf(a));
        TLRPC.UserFull userFull = profileActivity.w2;
        undoView.k(a, i2, X1, Integer.valueOf(userFull != null ? userFull.ttl_period : profileActivity.v2.ttl_period), null, null);
    }

    @Override // cj2
    public final void I(float f, float f2) {
        wk5 wk5Var;
        wk5Var = ((e) ((nj3) this.b).o0).parentLayout;
        ((ActionBarLayout) wk5Var).p();
    }

    @Override // fc1
    public final long J() {
        return ((hc8) this.b).getCaptionsTrimStart();
    }

    @Override // fc1
    public final void K(kc1 kc1Var) {
        ((hc8) this.b).a0(kc1Var);
    }

    @Override // fc1
    public final void M(long j) {
        s64 s64Var;
        PhotoViewer photoViewer = ((hc8) this.b).d2;
        kfc kfcVar = photoViewer.G2;
        if (kfcVar == null || (s64Var = kfcVar.d) == null || !s64Var.c0()) {
            return;
        }
        photoViewer.G2.o0(j);
    }

    @Override // a70
    public final void N() {
        ((ProfileActivity) this.b).presentFragment(new x60());
        dismiss();
    }

    @Override // oa9
    public final void O() {
        switch (this.a) {
            case 19:
                gc8 gc8Var = (gc8) this.b;
                gc8Var.b.a.f();
                gc8Var.x.setViewHidden(false);
                PhotoViewer photoViewer = gc8Var.L;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.g2(true, true);
                break;
            default:
                vab vabVar = (vab) this.b;
                vabVar.n0.a.f();
                vabVar.N0.setViewHidden(false);
                break;
        }
    }

    @Override // fc1
    public final void P(h44 h44Var) {
        ((hc8) this.b).s0(h44Var);
    }

    @Override // oa9
    public final void R() {
        switch (this.a) {
            case 19:
                ((gc8) this.b).x.setViewHidden(true);
                break;
            default:
                vab vabVar = (vab) this.b;
                if (vabVar.t0 != null) {
                    vabVar.C0(null, true);
                }
                vabVar.N0.setViewHidden(true);
                break;
        }
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        q67 q67Var = (q67) this.b;
        mq5 H0 = hl.H0(l2dVar, false);
        q67Var.d = H0;
        q67Var.G.setPadding(H0.a, H0.b, H0.c, H0.d);
        q67Var.F.requestLayout();
        return l2d.b;
    }

    @Override // cr7
    public final void S0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        ai4 ai4Var = (ai4) this.b;
        Handler handler = ai4Var.B0;
        zz3 zz3Var = ai4Var.C0;
        handler.removeCallbacks(zz3Var);
        TextView textView = ai4Var.H0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(zz3Var, 2000L);
    }

    @Override // cj2
    public final boolean T0(float f, float f2) {
        return ((nj3) this.b).o0.isInPreviewMode();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05c2 A[Catch: lo4 | vg2 -> 0x0653, TryCatch #5 {lo4 | vg2 -> 0x0653, blocks: (B:287:0x05a8, B:288:0x05be, B:290:0x05c2, B:291:0x05c5, B:293:0x05c9, B:295:0x05d3, B:297:0x05d9, B:302:0x05de), top: B:286:0x05a8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pm3 U(lh2 lh2Var) {
        th4 th4Var;
        th4 th4Var2;
        th4 th4Var3;
        float f;
        float f2;
        lj ljVar;
        float f3;
        float f4;
        float f5;
        byte b;
        ke9[] ke9VarArr;
        vg2 vg2Var;
        lo4 e;
        rj0 rj0Var;
        int i;
        v93 v93Var;
        int i2;
        z3f z3fVar;
        pm3 pm3Var;
        ArrayList arrayList;
        String str;
        int i3;
        boolean z;
        double d;
        double abs;
        int i4;
        int i5;
        int i6;
        z8d z8dVar = (z8d) this.b;
        rj0 rj0Var2 = (rj0) lh2Var.c;
        if (rj0Var2 == null) {
            rj0Var2 = ((rx6) lh2Var.b).I();
            lh2Var.c = rj0Var2;
        }
        wz4 wz4Var = new wz4(rj0Var2);
        int i7 = 0;
        vh4 vh4Var = new vh4(rj0Var2, (byte) 0);
        ArrayList arrayList2 = (ArrayList) vh4Var.c;
        int i8 = rj0Var2.b;
        int i9 = rj0Var2.a;
        int i10 = (i8 * 3) / 388;
        int i11 = 3;
        if (i10 < 3) {
            i10 = 3;
        }
        char c = 5;
        int[] iArr = new int[5];
        int i12 = i10 - 1;
        boolean z2 = false;
        while (true) {
            int i13 = 4;
            char c2 = c;
            int i14 = 1;
            if (i12 >= i8 || z2) {
                break;
            }
            Arrays.fill(iArr, i7);
            int i15 = i11;
            int i16 = i7;
            while (i16 < i9) {
                int i17 = i7 & 1;
                if (rj0Var2.b(i16, i12)) {
                    if (i17 == i14) {
                        i7++;
                    }
                    iArr[i7] = iArr[i7] + i14;
                    i4 = i13;
                } else if (i17 != 0) {
                    i4 = i13;
                    iArr[i7] = iArr[i7] + 1;
                } else if (i7 == i13) {
                    if (!vh4.q(iArr)) {
                        i4 = i13;
                        int i18 = i14;
                        iArr[0] = iArr[2];
                        iArr[i18] = iArr[i15];
                        iArr[2] = iArr[i4];
                        iArr[i15] = i18;
                        iArr[i4] = 0;
                    } else if (vh4Var.u(i12, i16, iArr)) {
                        if (vh4Var.a) {
                            z2 = vh4Var.v();
                            i4 = i13;
                            i5 = 2;
                        } else {
                            if (arrayList2.size() > i14) {
                                int size = arrayList2.size();
                                int i19 = 0;
                                th4 th4Var4 = null;
                                while (true) {
                                    if (i19 >= size) {
                                        i4 = i13;
                                        i5 = 2;
                                        i6 = 0;
                                        break;
                                    }
                                    Object obj = arrayList2.get(i19);
                                    i19++;
                                    i4 = i13;
                                    th4 th4Var5 = (th4) obj;
                                    int i20 = size;
                                    if (th4Var5.d >= 2) {
                                        if (th4Var4 != null) {
                                            vh4Var.a = true;
                                            i5 = 2;
                                            i6 = ((int) (Math.abs(th4Var4.a - th4Var5.a) - Math.abs(th4Var4.b - th4Var5.b))) / 2;
                                            break;
                                        }
                                        th4Var4 = th4Var5;
                                    }
                                    i13 = i4;
                                    size = i20;
                                }
                            } else {
                                i4 = i13;
                                i6 = 0;
                                i5 = 2;
                            }
                            if (i6 > iArr[i5]) {
                                i12 += (i6 - r8) - 2;
                                i16 = i9 - 1;
                            }
                        }
                        i7 = 0;
                        Arrays.fill(iArr, 0);
                        i10 = i5;
                    } else {
                        i4 = i13;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i15];
                        iArr[2] = iArr[i4];
                        iArr[i15] = 1;
                        iArr[i4] = 0;
                    }
                    i7 = i15;
                } else {
                    i4 = i13;
                    i7++;
                    iArr[i7] = iArr[i7] + 1;
                }
                i16++;
                i13 = i4;
                i14 = 1;
            }
            if (vh4.q(iArr) && vh4Var.u(i12, i9, iArr)) {
                int i21 = iArr[0];
                if (vh4Var.a) {
                    z2 = vh4Var.v();
                }
                i10 = i21;
            }
            i12 += i10;
            c = c2;
            i11 = i15;
            i7 = 0;
        }
        if (arrayList2.size() < i11) {
            throw tm7.a();
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((th4) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList2, vh4.e);
        th4[] th4VarArr = new th4[3];
        int i22 = 0;
        double d2 = Double.MAX_VALUE;
        for (int i23 = 2; i22 < arrayList2.size() - i23; i23 = 2) {
            th4 th4Var6 = (th4) arrayList2.get(i22);
            float f6 = th4Var6.c;
            i22++;
            int i24 = i22;
            while (i24 < arrayList2.size() - 1) {
                th4 th4Var7 = (th4) arrayList2.get(i24);
                double K = vh4.K(th4Var6, th4Var7);
                i24++;
                for (int i25 = i24; i25 < arrayList2.size(); i25++) {
                    th4 th4Var8 = (th4) arrayList2.get(i25);
                    if (th4Var8.c <= 1.4f * f6) {
                        double K2 = vh4.K(th4Var7, th4Var8);
                        double K3 = vh4.K(th4Var6, th4Var8);
                        if (K < K2) {
                            if (K2 <= K3) {
                                K3 = K2;
                                K2 = K3;
                            } else if (K >= K3) {
                                d = K3;
                                K3 = K;
                                abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                                if (abs >= d2) {
                                    th4VarArr[0] = th4Var6;
                                    th4VarArr[1] = th4Var7;
                                    th4VarArr[2] = th4Var8;
                                    d2 = abs;
                                }
                            }
                            d = K;
                            abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                            if (abs >= d2) {
                            }
                        } else {
                            if (K2 < K3) {
                                d = K2;
                                if (K < K3) {
                                    K2 = K3;
                                    K3 = K;
                                    abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                                    if (abs >= d2) {
                                    }
                                }
                            } else {
                                d = K3;
                                K3 = K2;
                            }
                            K2 = K;
                            abs = Math.abs(K2 - (d * 2.0d)) + Math.abs(K2 - (K3 * 2.0d));
                            if (abs >= d2) {
                            }
                        }
                    }
                }
            }
        }
        if (d2 == Double.MAX_VALUE) {
            throw tm7.a();
        }
        float a = ke9.a(th4VarArr[0], th4VarArr[1]);
        float a2 = ke9.a(th4VarArr[1], th4VarArr[2]);
        float a3 = ke9.a(th4VarArr[0], th4VarArr[2]);
        if (a2 >= a && a2 >= a3) {
            th4Var = th4VarArr[0];
            th4Var2 = th4VarArr[1];
            th4Var3 = th4VarArr[2];
        } else if (a3 < a2 || a3 < a) {
            th4Var = th4VarArr[2];
            th4Var2 = th4VarArr[0];
            th4Var3 = th4VarArr[1];
        } else {
            th4Var = th4VarArr[1];
            th4Var2 = th4VarArr[0];
            th4Var3 = th4VarArr[2];
        }
        float f7 = th4Var.a;
        float f8 = th4Var.b;
        if (qu6.B(th4Var2.a, f7, th4Var3.b - f8, (th4Var2.b - f8) * (th4Var3.a - f7)) < 0.0f) {
            th4 th4Var9 = th4Var3;
            th4Var3 = th4Var2;
            th4Var2 = th4Var9;
        }
        th4VarArr[0] = th4Var2;
        th4VarArr[1] = th4Var;
        th4VarArr[2] = th4Var3;
        float z3 = wz4Var.z(th4Var, th4Var3);
        float f9 = th4Var.a;
        float f10 = th4Var3.b;
        float f11 = th4Var3.a;
        float z4 = wz4Var.z(th4Var, th4Var2);
        float f12 = th4Var2.b;
        float f13 = th4Var2.a;
        float f14 = (z4 + z3) / 2.0f;
        if (f14 < 1.0f) {
            throw tm7.a();
        }
        float a4 = ke9.a(th4Var, th4Var3) / f14;
        int i26 = (int) (a4 + (a4 < 0.0f ? -0.5f : 0.5f));
        float a5 = ke9.a(th4Var, th4Var2) / f14;
        int i27 = (((int) (a5 + (a5 >= 0.0f ? 0.5f : -0.5f))) + i26) / 2;
        int i28 = i27 + 7;
        int i29 = i28 & 3;
        if (i29 == 0) {
            i28 = i27 + 8;
        } else if (i29 == 2) {
            i28 = i27 + 6;
        } else if (i29 == 3) {
            i28 = i27 + 5;
        }
        int i30 = i28;
        int[] iArr2 = xdc.e;
        if (i30 % 4 != 1) {
            throw lo4.a();
        }
        try {
            xdc c3 = xdc.c((i30 - 17) / 4);
            int i31 = (c3.a << 2) + 10;
            if (c3.b.length > 0) {
                float f15 = (f11 - f9) + f13;
                f2 = f11;
                float f16 = (f10 - f8) + f12;
                float f17 = 1.0f - (3.0f / i31);
                int A = (int) qd4.A(f15, f9, f17, f9);
                int A2 = (int) qd4.A(f16, f8, f17, f8);
                f = f9;
                for (int i32 = 4; i32 <= 16; i32 <<= 1) {
                    try {
                        ljVar = wz4Var.A(f14, i32, A, A2);
                        break;
                    } catch (tm7 unused) {
                    }
                }
            } else {
                f = f9;
                f2 = f11;
            }
            ljVar = null;
            float f18 = i30 - 3.5f;
            if (ljVar != null) {
                f3 = ljVar.a;
                f4 = ljVar.b;
                f5 = f18 - 3.0f;
            } else {
                f3 = (f2 - f) + f13;
                f4 = (f10 - f8) + f12;
                f5 = f18;
            }
            float f19 = f4;
            float f20 = th4Var.a;
            float f21 = th4Var.b;
            float f22 = th4Var3.a;
            float f23 = th4Var3.b;
            float f24 = th4Var2.a;
            float f25 = th4Var2.b;
            c78 a6 = c78.a(3.5f, 3.5f, f18, 3.5f, f5, f5, 3.5f, f18);
            lj ljVar2 = ljVar;
            float f26 = a6.e;
            float f27 = a6.i;
            float f28 = f26 * f27;
            float f29 = a6.f;
            float f30 = a6.h;
            float f31 = f28 - (f29 * f30);
            float f32 = a6.g;
            float f33 = f29 * f32;
            float f34 = a6.d;
            float f35 = f33 - (f34 * f27);
            float f36 = (f34 * f30) - (f26 * f32);
            float f37 = a6.c;
            float f38 = f37 * f30;
            float f39 = a6.b;
            float f40 = f38 - (f39 * f27);
            float f41 = a6.a;
            float f42 = (f27 * f41) - (f37 * f32);
            float f43 = (f32 * f39) - (f30 * f41);
            float f44 = (f39 * f29) - (f37 * f26);
            float f45 = (f37 * f34) - (f29 * f41);
            float f46 = (f41 * f26) - (f39 * f34);
            c78 a7 = c78.a(f20, f21, f22, f23, f3, f19, f24, f25);
            float f47 = a7.a;
            float f48 = a7.d;
            float f49 = a7.g;
            float f50 = (f49 * f44) + (f48 * f40) + (f47 * f31);
            float f51 = (f49 * f45) + (f48 * f42) + (f47 * f35);
            float f52 = (f49 * f46) + (f48 * f43) + (f47 * f36);
            float f53 = a7.b;
            float f54 = a7.e;
            float f55 = a7.h;
            float f56 = (f55 * f44) + (f54 * f40) + (f53 * f31);
            float f57 = (f55 * f45) + (f54 * f42) + (f53 * f35);
            float f58 = (f55 * f46) + (f54 * f43) + (f53 * f36);
            float f59 = a7.c;
            float f60 = a7.f;
            float f61 = a7.i;
            float f62 = (f44 * f61) + (f40 * f60) + (f31 * f59);
            float f63 = (f45 * f61) + (f42 * f60) + (f35 * f59);
            float f64 = (f61 * f46) + (f60 * f43) + (f59 * f36);
            if (i30 <= 0 || i30 <= 0) {
                throw tm7.a();
            }
            rj0 rj0Var3 = new rj0(i30, i30);
            int i33 = i30 << 1;
            th4 th4Var10 = th4Var;
            float[] fArr = new float[i33];
            int i34 = 0;
            while (i34 < i30) {
                int i35 = i30;
                float f65 = i34 + 0.5f;
                int i36 = 0;
                while (i36 < i33) {
                    int i37 = i36;
                    fArr[i37] = (i37 / 2) + 0.5f;
                    fArr[i37 + 1] = f65;
                    i36 = i37 + 2;
                }
                int i38 = i33 - 1;
                th4 th4Var11 = th4Var2;
                int i39 = 0;
                while (i39 < i38) {
                    float f66 = fArr[i39];
                    int i40 = i39 + 1;
                    int i41 = i39;
                    float f67 = fArr[i40];
                    th4 th4Var12 = th4Var3;
                    float i42 = bs2.i(f63, f67, f62 * f66, f64);
                    fArr[i41] = (((f51 * f67) + (f50 * f66)) + f52) / i42;
                    fArr[i40] = (((f67 * f57) + (f66 * f56)) + f58) / i42;
                    i39 = i41 + 2;
                    th4Var3 = th4Var12;
                }
                th4 th4Var13 = th4Var3;
                int i43 = rj0Var2.b;
                float f68 = f63;
                int i44 = 0;
                boolean z5 = true;
                while (i44 < i38 && z5) {
                    int i45 = (int) fArr[i44];
                    int i46 = i44 + 1;
                    int i47 = i38;
                    int i48 = (int) fArr[i46];
                    int i49 = i44;
                    if (i45 < -1 || i45 > i9 || i48 < -1 || i48 > i43) {
                        throw tm7.a();
                    }
                    if (i45 == -1) {
                        fArr[i49] = 0.0f;
                    } else if (i45 == i9) {
                        fArr[i49] = i9 - 1;
                    } else {
                        z = false;
                        if (i48 != -1) {
                            fArr[i46] = 0.0f;
                        } else if (i48 == i43) {
                            fArr[i46] = i43 - 1;
                        } else {
                            z5 = z;
                            i44 = i49 + 2;
                            i38 = i47;
                        }
                        z5 = true;
                        i44 = i49 + 2;
                        i38 = i47;
                    }
                    z = true;
                    if (i48 != -1) {
                    }
                    z5 = true;
                    i44 = i49 + 2;
                    i38 = i47;
                }
                int i50 = i33 - 2;
                boolean z6 = true;
                while (i50 >= 0 && z6) {
                    int i51 = (int) fArr[i50];
                    int i52 = i50 + 1;
                    int i53 = i50;
                    int i54 = (int) fArr[i52];
                    if (i51 < -1 || i51 > i9 || i54 < -1 || i54 > i43) {
                        throw tm7.a();
                    }
                    if (i51 == -1) {
                        fArr[i53] = 0.0f;
                    } else if (i51 == i9) {
                        fArr[i53] = i9 - 1;
                    } else {
                        z6 = false;
                        if (i54 != -1) {
                            fArr[i52] = 0.0f;
                        } else if (i54 == i43) {
                            fArr[i52] = i43 - 1;
                        } else {
                            i50 = i53 - 2;
                        }
                        z6 = true;
                        i50 = i53 - 2;
                    }
                    z6 = true;
                    if (i54 != -1) {
                    }
                    z6 = true;
                    i50 = i53 - 2;
                }
                for (int i55 = 0; i55 < i33; i55 += 2) {
                    try {
                        if (rj0Var2.b((int) fArr[i55], (int) fArr[i55 + 1])) {
                            rj0Var3.c(i55 / 2, i34);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw tm7.a();
                    }
                }
                i34++;
                i30 = i35;
                th4Var2 = th4Var11;
                f63 = f68;
                th4Var3 = th4Var13;
            }
            th4 th4Var14 = th4Var2;
            th4 th4Var15 = th4Var3;
            if (ljVar2 == null) {
                b = 3;
                ke9VarArr = new ke9[]{th4Var14, th4Var10, th4Var15};
            } else {
                b = 3;
                ke9VarArr = new ke9[]{th4Var14, th4Var10, th4Var15, ljVar2};
            }
            ke9[] ke9VarArr2 = ke9VarArr;
            vh4 vh4Var2 = new vh4(rj0Var3, b);
            try {
                v93Var = z8dVar.X0(vh4Var2);
            } catch (lo4 e2) {
                e = e2;
                vg2Var = null;
                try {
                    vh4Var2.E();
                    vh4Var2.c = null;
                    vh4Var2.d = null;
                    vh4Var2.a = true;
                    vh4Var2.B();
                    vh4Var2.A();
                    rj0Var = (rj0) vh4Var2.b;
                    i = 0;
                    while (i < rj0Var.a) {
                        int i56 = i + 1;
                        for (int i57 = i56; i57 < rj0Var.b; i57++) {
                            if (rj0Var.b(i, i57) != rj0Var.b(i57, i)) {
                                rj0Var.a(i57, i);
                                rj0Var.a(i, i57);
                            }
                        }
                        i = i56;
                    }
                    v93 X0 = z8dVar.X0(vh4Var2);
                    X0.e = new z3f((byte) 24);
                    v93Var = X0;
                    i2 = v93Var.f;
                    z3fVar = v93Var.e;
                    if (z3fVar != null) {
                    }
                    pm3Var = new pm3(v93Var.a, ke9VarArr2);
                    arrayList = v93Var.b;
                    if (arrayList != null) {
                    }
                    str = v93Var.c;
                    if (str != null) {
                    }
                    if (i2 >= 0) {
                        pm3Var.D(je9.d, Integer.valueOf(i3));
                        pm3Var.D(je9.e, Integer.valueOf(i2));
                    }
                    pm3Var.D(je9.c, v93Var.d);
                    pm3Var.D(je9.f, "]Q" + ((int) v93Var.h));
                    return pm3Var;
                } catch (lo4 | vg2 unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw vg2Var;
                }
            } catch (vg2 e3) {
                vg2Var = e3;
                e = null;
                vh4Var2.E();
                vh4Var2.c = null;
                vh4Var2.d = null;
                vh4Var2.a = true;
                vh4Var2.B();
                vh4Var2.A();
                rj0Var = (rj0) vh4Var2.b;
                i = 0;
                while (i < rj0Var.a) {
                }
                v93 X02 = z8dVar.X0(vh4Var2);
                X02.e = new z3f((byte) 24);
                v93Var = X02;
                i2 = v93Var.f;
                z3fVar = v93Var.e;
                if (z3fVar != null) {
                }
                pm3Var = new pm3(v93Var.a, ke9VarArr2);
                arrayList = v93Var.b;
                if (arrayList != null) {
                }
                str = v93Var.c;
                if (str != null) {
                }
                if (i2 >= 0) {
                }
                pm3Var.D(je9.c, v93Var.d);
                pm3Var.D(je9.f, "]Q" + ((int) v93Var.h));
                return pm3Var;
            }
            i2 = v93Var.f;
            z3fVar = v93Var.e;
            if (z3fVar != null) {
                z3fVar.getClass();
                if (ke9VarArr2.length >= 3) {
                    ke9 ke9Var = ke9VarArr2[0];
                    ke9VarArr2[0] = ke9VarArr2[2];
                    ke9VarArr2[2] = ke9Var;
                }
            }
            pm3Var = new pm3(v93Var.a, ke9VarArr2);
            arrayList = v93Var.b;
            if (arrayList != null) {
                pm3Var.D(je9.a, arrayList);
            }
            str = v93Var.c;
            if (str != null) {
                pm3Var.D(je9.b, str);
            }
            if (i2 >= 0 && (i3 = v93Var.g) >= 0) {
                pm3Var.D(je9.d, Integer.valueOf(i3));
                pm3Var.D(je9.e, Integer.valueOf(i2));
            }
            pm3Var.D(je9.c, v93Var.d);
            pm3Var.D(je9.f, "]Q" + ((int) v93Var.h));
            return pm3Var;
        } catch (IllegalArgumentException unused4) {
            throw lo4.a();
        }
    }

    @Override // cj2
    public final boolean W0(View view, float f, float f2) {
        return false;
    }

    public final void Y(Exception exc) {
        p pVar = (p) this.b;
        if (pVar.R0) {
            return;
        }
        pVar.N0(true, false);
        pVar.J0(false);
        if ((exc instanceof f1) || (exc instanceof g1)) {
            jj.t0(ob6.M0(2131747131, null), pVar);
        } else {
            jj.t0(exc.getMessage(), pVar);
        }
    }

    @Override // cj2
    public final boolean Y1() {
        return false;
    }

    @Override // tic, bv9
    public final void a(float f) {
        switch (this.a) {
            case 8:
                break;
            default:
                s98 s98Var = (s98) this.b;
                r98[] r98VarArr = s98Var.n;
                if (f != 1.0f || r98VarArr[1].getVisibility() == 0) {
                    if (s98Var.w) {
                        r98VarArr[0].setTranslationX((-f) * r6.getMeasuredWidth());
                        r98VarArr[1].setTranslationX(r98VarArr[0].getMeasuredWidth() - (f * r98VarArr[0].getMeasuredWidth()));
                    } else {
                        r98VarArr[0].setTranslationX(r6.getMeasuredWidth() * f);
                        r98VarArr[1].setTranslationX((f * r98VarArr[0].getMeasuredWidth()) - r98VarArr[0].getMeasuredWidth());
                    }
                    if (f == 1.0f) {
                        r98 r98Var = r98VarArr[0];
                        r98VarArr[0] = r98VarArr[1];
                        r98VarArr[1] = r98Var;
                        r98Var.setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // tic
    public final boolean b() {
        return true;
    }

    @Override // tic, bv9
    public final void c(int i, boolean z) {
        switch (this.a) {
            case 8:
                yx4 yx4Var = (yx4) this.b;
                if (yx4Var.l2 != i) {
                    yx4Var.l2 = i;
                    yx4Var.d2.g();
                    yx4Var.T1.O(true);
                    break;
                }
                break;
            default:
                s98 s98Var = (s98) this.b;
                r98[] r98VarArr = s98Var.n;
                if (r98VarArr[0].b != i) {
                    s98Var.e = i == s98Var.h.getFirstTabId();
                    r98 r98Var = r98VarArr[1];
                    r98Var.b = i;
                    r98Var.setVisibility(0);
                    s98Var.n0(true);
                    s98Var.w = z;
                    s7 s7Var = s98Var.c;
                    if (i != 0) {
                        s7Var.setSearchFieldHint(ob6.M0(2131745492, null));
                        break;
                    } else {
                        s7Var.setSearchFieldHint(ob6.M0(2131745489, null));
                        break;
                    }
                }
                break;
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
    
        if ((r17.e() + r9) <= r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        efd.f("Id3Peeker", "Skipping ID3 tag with tagLength=" + r10 + " greater than input length=" + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r6 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r6 = new byte[r10];
        java.lang.System.arraycopy(r3.a, r8, r6, 0, 10);
        r17.d(r6, 10, r9, false);
        r6 = new vl5(r18).c(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        r17.a(r9, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final uf7 c0(cb3 cb3Var, tl5 tl5Var, int i) {
        int i2;
        long j = cb3Var.c;
        ey7 ey7Var = (ey7) this.b;
        int i3 = 0;
        uf7 uf7Var = null;
        loop0: while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = ey7Var.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    cb3Var.d(ey7Var.a, i6 - i7, i7, false);
                    ey7Var.N(i5);
                    ey7Var.M(i6);
                    if (ey7Var.a() < 3) {
                        xi4.m("position=", ey7Var.b, ", limit=", ey7Var.c);
                        return null;
                    }
                    int D = ey7Var.D();
                    ey7Var.b -= 3;
                    if (D != 4801587) {
                        if (nfd.a(ey7Var.i()) != -1) {
                            break loop0;
                        }
                    } else {
                        ey7Var.O(3);
                        int A = ey7Var.A();
                        if (A >= 2 && A <= 4) {
                            break;
                        }
                    }
                    if (i4 == 0) {
                        ey7Var.c(20);
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
        cb3Var.f = 0;
        cb3Var.a(i3, false);
        return uf7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rn4
    public final void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                a3.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // a70
    public final void dismiss() {
        ((ProfileActivity) this.b).T0.U(null, null);
    }

    @Override // cj2
    public final boolean e0() {
        return true;
    }

    @Override // j98
    public final boolean f() {
        return true;
    }

    public final void f0() {
        i09 i09Var = (i09) this.b;
        i09Var.getClass();
        try {
            ykd ykdVar = (ykd) i09Var.b;
            Parcel R = ykdVar.R();
            int i = jld.a;
            R.writeInt(0);
            ykdVar.V(R, 2);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override // jx9
    public final void finish() {
        Point point = hl.q;
        if (point.x > point.y) {
            ((uj3) this.b).finishPreviewFragment();
        }
    }

    public final void g(StringBuilder sb, Iterator it) {
        ow5 ow5Var = (ow5) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(ow5.c(entry.getKey()));
            sb.append("=");
            sb.append(ow5.c(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) ow5Var.b);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(ow5.c(entry2.getKey()));
                sb.append("=");
                sb.append(ow5.c(entry2.getValue()));
            }
        }
    }

    public final void g0() {
        i09 i09Var = (i09) this.b;
        i09Var.getClass();
        try {
            ykd ykdVar = (ykd) i09Var.b;
            Parcel R = ykdVar.R();
            int i = jld.a;
            R.writeInt(0);
            ykdVar.V(R, 3);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override // uw8
    public final Object get() {
        return this.b;
    }

    @Override // ty9
    public final CharSequence getContentDescription() {
        kl4 kl4Var = (kl4) this.b;
        float f = kl4Var.b;
        return String.valueOf(Math.round((kl4Var.a.getProgress() * (kl4Var.c - f)) + f));
    }

    @Override // cj2
    public final long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // j98
    public final void h() {
        w78 w78Var = (w78) this.b;
        int size = w78Var.b.size();
        tb tbVar = w78Var.R;
        if (size != 0) {
            tbVar.invalidate();
            w78Var.a0(true);
        } else {
            tbVar.setPivotX(0.0f);
            w78Var.R.setPivotY(0.0f);
            w78Var.a0(false);
        }
    }

    public final void h0() {
        i09 i09Var = (i09) this.b;
        i09Var.getClass();
        try {
            ykd ykdVar = (ykd) i09Var.b;
            Parcel R = ykdVar.R();
            int i = jld.a;
            R.writeInt(0);
            ykdVar.V(R, 1);
        } catch (RemoteException e) {
            p3d.i(e);
        }
    }

    @Override // fc1
    public final void i(boolean z) {
        hc8 hc8Var = (hc8) this.b;
        PhotoViewer photoViewer = hc8Var.d2;
        kfc kfcVar = photoViewer.G2;
        if (kfcVar != null) {
            if (z) {
                if (kfcVar.c0()) {
                    hc8Var.c2 = true;
                    photoViewer.m();
                    photoViewer.G2.f0();
                    return;
                }
                return;
            }
            if (hc8Var.c2) {
                hc8Var.c2 = false;
                if (photoViewer.H2 || photoViewer.T0()) {
                    return;
                }
                photoViewer.G2.g0();
            }
        }
    }

    @Override // ty9
    public final int i0() {
        return 0;
    }

    public final void j0(pi5 pi5Var, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((ryc) this.b).c) {
        }
        throw new tt7(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), pi5Var);
    }

    @Override // s9
    public final void k(Object obj) {
        r9 r9Var = (r9) obj;
        kq4 kq4Var = (kq4) this.b;
        gq4 gq4Var = (gq4) kq4Var.F.pollFirst();
        if (gq4Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = gq4Var.a;
        int i = gq4Var.b;
        gp4 p = kq4Var.c.p(str);
        if (p != null) {
            p.x(i, r9Var.a, r9Var.b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // j98
    public final void l(Editable editable) {
        w78 w78Var = (w78) this.b;
        iu3 iu3Var = w78Var.N;
        w78Var.a = editable;
        iu3Var.setText(editable);
    }

    @Override // fc1
    public final FrameLayout m() {
        return ((hc8) this.b).d2.f0;
    }

    @Override // ty9
    public final void o(boolean z, float f) {
        kl4 kl4Var = (kl4) this.b;
        float f2 = kl4Var.b;
        float A = qd4.A(kl4Var.c, f2, f, f2);
        kl4Var.d = A;
        if (z) {
            rn rnVar = kl4Var.e;
            rnVar.getClass();
            rnVar.c(null, A);
        }
        kl4Var.invalidate();
    }

    @Override // pj5
    public final void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        ((id6) this.b).m(location);
    }

    @Override // ifc
    public final void onStateChanged(boolean z, int i) {
        mm8 mm8Var = (mm8) this.b;
        lm8 lm8Var = mm8Var.M;
        hl.r(lm8Var);
        kfc kfcVar = mm8Var.E;
        if (kfcVar == null || !kfcVar.c0()) {
            return;
        }
        hl.c3(lm8Var);
    }

    @Override // ifc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // ifc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((mm8) this.b).h();
    }

    @Override // jx9
    public final void p(float f) {
        Point point = hl.q;
        if (point.x > point.y) {
            ((uj3) this.b).movePreviewFragment(f);
        }
    }

    @Override // oa9
    public final void q() {
        switch (this.a) {
            case 19:
                gc8 gc8Var = (gc8) this.b;
                gc8Var.e.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new ch4(gc8Var, (byte) 25)).setInterpolator(k43.h);
                break;
        }
    }

    @Override // fc1
    public final vnb r() {
        return ((hc8) this.b).A1;
    }

    @Override // fc1
    public final kc1 t() {
        return ((hc8) this.b).c0();
    }

    @Override // oa9
    public final void u() {
        switch (this.a) {
            case 19:
                break;
            default:
                tb tbVar = ((vab) this.b).z0;
                if (tbVar != null) {
                    tbVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // oa9
    public final void v() {
        switch (this.a) {
            case 19:
                break;
            default:
                vab vabVar = (vab) this.b;
                if (!vabVar.M0) {
                    vabVar.U0.b(1);
                    vabVar.s((v01) v01.a.get(0));
                    break;
                } else {
                    vabVar.M0 = false;
                    break;
                }
        }
    }

    @Override // fc1
    public final kc1 w() {
        ry5 ry5Var = ((hc8) this.b).J0;
        for (int i = 0; i < ry5Var.getChildCount(); i++) {
            if (ry5Var.getChildAt(i) instanceof kc1) {
                return (kc1) ry5Var.getChildAt(i);
            }
        }
        return null;
    }

    @Override // fc1
    public final long z() {
        return ((hc8) this.b).getCaptionsVideoPosition();
    }

    @Override // ifc
    public final void onRenderedFirstFrame() {
    }

    private final void W() {
    }

    private final void Z() {
    }

    private final void d0() {
    }

    @Override // tic
    public final void X() {
    }

    @Override // tic
    public final void d() {
    }

    @Override // bv9
    public final void e() {
    }

    @Override // cj2
    public final void p0() {
    }

    @Override // ty9
    public final void x() {
    }

    @Override // cj2
    public final void x0() {
    }

    @Override // j98
    public final void y() {
    }

    private final void a0(float f) {
    }

    @Override // tic
    public final void L(ArrayList arrayList) {
    }

    @Override // ifc
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    @Override // ifc
    public final void onSeekFinished(uj ujVar) {
    }

    @Override // ifc
    public final void onSeekStarted(uj ujVar) {
    }

    @Override // cj2
    public final void n(float f, float f2) {
    }

    @Override // ifc
    public final void onError(kfc kfcVar, Exception exc) {
    }

    public /* synthetic */ aj3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ aj3(byte b, boolean z) {
        this.a = b;
    }

    public aj3(TextView textView) {
        this.a = (byte) 2;
        this.b = new zy3(textView);
    }

    public aj3(Context context, Uri uri) {
        this.a = (byte) 6;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // cj2
    public final void D1(View view, float f, float f2) {
    }

    @Override // cj2
    public final void j(View view, float f, float f2) {
    }

    @Override // cj2
    public final void s(View view, float f, float f2) {
    }

    @Override // ifc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}

package ki;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.dr0;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bs0;
import org.telegram.ui.it0;
import org.telegram.ui.kb0;
import org.telegram.ui.n9;
import org.telegram.ui.oi0;
import org.telegram.ui.x9;
import w7.v8;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public class t1 implements org.telegram.ui.Components.e5, j0, m.f2, y2.g, m.y0, n5.b, o0.a, q71, fb0, mg.o, x71, hg.z1, x9, com.google.android.gms.common.api.internal.o, rg.v1, s4.h1, com.google.android.gms.common.api.internal.r {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ t1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static void M(String str, TreeMap treeMap) {
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

    public static float[] u(ArrayList arrayList) {
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
            arrayList2.add((PointF) i2.d.h(1, arrayList));
        }
        int i29 = i10;
        float f20 = ((PointF) arrayList2.get(i29)).x;
        if (f20 > f11) {
            for (int i30 = (int) f20; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f21 = ((PointF) i2.d.h(1, arrayList2)).x;
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

    public static t1 w(float f7, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new t1(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new t1(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new t1(i11, i12, new int[0]) : new t1(i12, i11, new int[0]);
    }

    @Override // ki.j0
    public m9 B() {
        return (o4) this.b;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.b;
                d2Var.s0(i10, i11, z10);
                oi0 oi0Var = d2Var.O0;
                if (oi0Var != null) {
                    oi0Var.i();
                    d2Var.O0 = null;
                    break;
                }
                break;
            default:
                ((ChatActivityEnterView) this.b).R0(i10, z10, 0, true, 0L);
                break;
        }
    }

    @Override // mg.o
    public void D(boolean z10) {
        ((nf0) this.b).c.setAspectLock(z10);
    }

    @Override // org.telegram.ui.x9
    public void E(String str) {
        String trim;
        int i10;
        org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.b;
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.n3(m5Var, 7));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        String scheme = parse.getScheme();
        if (("ton".equalsIgnoreCase(scheme) || "tc".equalsIgnoreCase(scheme)) && (m5Var.getParentActivity() instanceof LaunchActivity)) {
            LaunchActivity launchActivity = (LaunchActivity) m5Var.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) m5Var).currentAccount;
            if (new kb0(launchActivity, i10, null, false).g(parse)) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.n3(m5Var, 7));
    }

    @Override // ki.j0
    public a F() {
        return ((o4) this.b).a;
    }

    @Override // ki.j0
    public boolean G() {
        o4 o4Var = (o4) this.b;
        m4 m4Var = o4Var.G;
        if (m4Var == null) {
            return false;
        }
        a aVar = o4Var.a;
        return ((s3) m4Var).a.T4();
    }

    @Override // org.telegram.ui.Components.fb0
    public void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        ti tiVar = (ti) this.b;
        if (tiVar.o1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tiVar.o1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, tiVar.o1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            tiVar.o1().setText(spannableStringBuilder);
            tiVar.o1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // y2.g
    public void I(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.h) this.b).x((y2.o) iVar, j10, j11);
    }

    @Override // hg.z1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // ki.j0
    public void K(int i10, int i11) {
        o4 o4Var = (o4) this.b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.a;
            h2 h2Var = ((s3) m4Var).a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override // s4.h1
    public View L(int i10) {
        return ((s4.n0) this.b).q(i10);
    }

    @Override // ki.j0
    public void N() {
        o4 o4Var = (o4) this.b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.a;
            w3 w3Var = ((s3) m4Var).a;
            h2 h2Var = w3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f3.onContentChanged();
        }
    }

    @Override // hg.z1
    public boolean O(int i10) {
        return i10 == ((zq0) this.b).r;
    }

    public boolean Q(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // mg.o
    public void R(boolean z10) {
        nf0 nf0Var = (nf0) this.b;
        nf0Var.getClass();
        mf0 mf0Var = nf0Var.a;
        if (mf0Var != null) {
            ((bs0) mf0Var).a(z10);
        }
    }

    public void S(s4.b1 b1Var, b2.u0 u0Var, b2.u0 u0Var2) {
        boolean z10;
        s4.b1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(b1Var);
        recyclerView.h(b1Var);
        b1Var.q(false);
        s4.e1 e1Var = (s4.e1) recyclerView.c0;
        e1Var.getClass();
        int i11 = u0Var.a;
        int i12 = u0Var.b;
        View view = b1Var.a;
        int left = u0Var2 == null ? view.getLeft() : u0Var2.a;
        int top = u0Var2 == null ? view.getTop() : u0Var2.b;
        if (b1Var.j() || (i11 == left && i12 == top)) {
            int i13 = b1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i10 = T.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            b1Var.i = (b1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            e1Var.s(b1Var, u0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = e1Var.r(b1Var, u0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void T(s4.b1 b1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        s4.n0 n0Var = recyclerView.x;
        View view = b1Var.a;
        qf.e eVar = recyclerView.b;
        m.g3 g3Var = n0Var.a;
        ih.g gVar = (ih.g) g3Var.b;
        int indexOfChild = gVar.a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ad.d) g3Var.c).F(indexOfChild)) {
                g3Var.S(view);
            }
            gVar.a(indexOfChild);
        }
        eVar.g(view);
    }

    @Override // rg.v1
    public void U(float f7) {
        it0 it0Var = (it0) this.b;
        qg.u0.e(it0Var.P1).k(String.valueOf(qg.m.a.indexOf(it0Var.W0.getCurrentBrush())), f7);
        qg.s1 s1Var = it0Var.K1;
        s1Var.c = f7;
        it0Var.t0(s1Var, null);
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override // mg.o
    public void V() {
        mf0 mf0Var = ((nf0) this.b).a;
        if (mf0Var != null) {
            PhotoViewer photoViewer = ((bs0) mf0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // ki.j0
    public void W() {
        o4 o4Var = (o4) this.b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            a aVar = o4Var.a;
            w3.P1(((s3) m4Var).a);
        }
    }

    @Override // s4.h1
    public int X(View view) {
        return s4.n0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).rightMargin;
    }

    public void Z(ba.a aVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((tc.u) this.b).c) {
        }
        throw new tc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
    }

    public void a0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + c0());
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        s6.a aVar = (s6.a) this.b;
        Parcel H0 = eVar.H0();
        k7.a.d(H0, fVar);
        k7.a.c(H0, aVar);
        eVar.I0(H0, 1);
    }

    public void b0(long j10) {
        long c02 = c0();
        if (c02 != j10) {
            if (c02 != -1) {
                if (c02 != -2) {
                    return;
                } else {
                    c02 = -2;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(c02);
            throw new IOException(t10.toString());
        }
    }

    @Override // ki.j0
    public void c(h1 h1Var) {
        m4 m4Var = ((o4) this.b).G;
        if (m4Var != null) {
            w3 w3Var = ((s3) m4Var).a;
            w3.N1(w3Var, h1Var);
            w3Var.f3.n(h1Var, true);
        }
    }

    public long c0() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // s4.h1
    public int d(View view) {
        return s4.n0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).leftMargin;
    }

    @Override // m.f2
    public void e(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // hg.z1
    public void f(int i10) {
        zq0 zq0Var = (zq0) this.b;
        dr0 dr0Var = zq0Var.K;
        zq0Var.s = i10;
        if (zq0Var.v != i10) {
            zq0Var.d.clear();
        }
        int i11 = zq0Var.J;
        if (zq0Var.h() != 0 || zq0Var.e.e() || zq0Var.I) {
            dr0Var.x0.b(i11);
        } else {
            dr0Var.Q.e(false, true);
        }
        zq0Var.l();
        int i12 = dr0.a1;
        dr0Var.L0(true);
    }

    @Override // ki.j0
    public void g() {
        o4 o4Var = (o4) this.b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            w3.Q1(((s3) m4Var).a, o4Var.a);
        }
    }

    @Override // hd.a
    public Object get() {
        return new m.g3((Context) ((k0.b) this.b).b, new rb.b(24), new pb.a(24), 3);
    }

    public s0.c i(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.q71
    public void invalidate() {
        ((org.telegram.ui.Cells.u1) ((org.telegram.ui.Cells.h1) this.b).b).invalidate();
    }

    @Override // y2.g
    public k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        g2.b0 b0Var = oVar.d;
        u2.t tVar = new u2.t(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        int i11 = oVar.c;
        hVar.m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
        k4.d dVar = min == -9223372036854775807L ? y2.l.f : new k4.d(0, min, false);
        hVar.q.t(tVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // s4.h1
    public int k() {
        return ((s4.n0) this.b).D();
    }

    @Override // y2.g
    public void l(y2.i iVar, long j10, long j11, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        if (i10 == 0) {
            long j12 = oVar.a;
            tVar = new u2.t(oVar.b, j10);
        } else {
            long j13 = oVar.a;
            g2.m mVar = oVar.b;
            g2.b0 b0Var = oVar.d;
            tVar = new u2.t(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        }
        hVar.q.v(tVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    public String m(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            la.d dVar = (la.d) this.b;
            la.e eVar = new la.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // y2.g
    public void n(y2.i iVar, long j10, long j11) {
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        long j13 = oVar.a;
        g2.m mVar = oVar.b;
        g2.b0 b0Var = oVar.d;
        u2.t tVar = new u2.t(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        hVar.m.getClass();
        hVar.q.r(tVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f;
        m2.c cVar2 = hVar.G;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j14 = cVar.b(0).b;
        int i10 = 0;
        while (i10 < size && hVar.G.b(i10).b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.m.size()) {
                e2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = hVar.M;
                j12 = -9223372036854775807L;
                if (j15 == -9223372036854775807L || cVar.h * 1000 > j15) {
                    hVar.L = 0;
                } else {
                    e2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                }
            }
            int i11 = hVar.L;
            hVar.L = i11 + 1;
            if (i11 < hVar.m.y3(oVar.c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                hVar.C = new com.google.android.gms.internal.cast.z4();
                return;
            }
        }
        j12 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j10 - j11;
        hVar.J = j10;
        hVar.N += i10;
        synchronized (hVar.t) {
            try {
                if (oVar.b.a.equals(hVar.E)) {
                    Uri uri = hVar.G.k;
                    if (uri == null) {
                        uri = v8.a(oVar.d.c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.G;
        if (!cVar3.d || hVar.K != j12) {
            hVar.z(true);
            return;
        }
        m2.t tVar2 = cVar3.i;
        if (tVar2 == null) {
            hVar.w();
            return;
        }
        String str = tVar2.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.K = e2.m0.V(tVar2.c) - hVar.J;
                hVar.z(true);
                return;
            } catch (b2.w0 e) {
                hVar.y(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            hVar.A(tVar2, new l2.g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            hVar.A(tVar2, new sb.a(12));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.w();
        } else {
            hVar.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void o(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public void onStateChanged(boolean z10, int i10) {
        dl0 dl0Var = (dl0) this.b;
        if (z10 && dl0Var.n.n() >= 0) {
            dl0Var.w = true;
        }
        ah0 ah0Var = dl0Var.f;
        rc0 rc0Var = dl0Var.x;
        ah0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(rc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(rc0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // m.f2
    public void p(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new com.google.android.gms.internal.cast.p(this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, mVar, kVar, false, 1), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ String p0() {
        return null;
    }

    public s0.c q(int i10) {
        return null;
    }

    @Override // mg.o
    public void r() {
        mf0 mf0Var = ((nf0) this.b).a;
        if (mf0Var != null) {
            ((bs0) mf0Var).a.e0.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.fb0
    public Paint.FontMetricsInt s() {
        return ((ti) this.b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // ki.j0
    public org.telegram.ui.Cells.n9 t() {
        m4 m4Var = ((o4) this.b).G;
        if (m4Var != null) {
            return ((s3) m4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // ki.j0
    public void v(CharSequence charSequence) {
        m4 m4Var = ((o4) this.b).G;
        if (m4Var != null) {
            s3 s3Var = (s3) m4Var;
            s3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            s3Var.a.u4(charSequence.toString());
        }
    }

    @Override // o0.a
    public Cursor x(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    @Override // s4.h1
    public int z() {
        s4.n0 n0Var = (s4.n0) this.b;
        return n0Var.m - n0Var.E();
    }

    public /* synthetic */ t1(s6.g gVar, s6.a aVar) {
        this.a = 28;
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.x71
    public void onRenderedFirstFrame() {
    }

    public t1(int i10) {
        this.a = i10;
        switch (i10) {
            case 10:
                this.b = new o2.d(1.0f, 5, 0, false);
                break;
            case 15:
                break;
            case 25:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.d(this);
                    break;
                } else {
                    this.b = new uh0(this);
                    break;
                }
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    @Override // rg.v1
    public float get() {
        it0 it0Var = (it0) this.b;
        int i10 = it0Var.P1;
        qg.m currentBrush = it0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.u0.e(i10).i;
        }
        return qg.u0.e(i10).f(String.valueOf(qg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    public t1(int i10, int i11, int[] iArr) {
        this.a = 12;
        t60[] t60VarArr = new t60[(iArr.length / 2) + 1];
        this.b = t60VarArr;
        t60 t60Var = new t60(i10, i11);
        int i12 = 0;
        t60VarArr[0] = t60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((t60[]) this.b)[i13] = new t60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public t1(Context context, Uri uri) {
        this.a = 9;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ void F0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.fb0
    public /* synthetic */ void P(String str) {
    }

    @Override // hg.z1
    public /* synthetic */ void Y(ArrayList arrayList) {
    }

    @Override // m.y0
    public void a(int i10) {
    }

    @Override // m.y0
    public void h(int i10) {
    }

    @Override // org.telegram.ui.x9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.x71
    public void onError(a81 a81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.fb0
    public /* synthetic */ void A(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.fb0
    public /* synthetic */ void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.x71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}

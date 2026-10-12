package ji;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
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
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ai0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.y71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.at0;
import org.telegram.ui.hu0;
import org.telegram.ui.jc0;
import org.telegram.ui.y9;
import w7.u8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public class w4 implements j0, m.e2, y2.g, l.i, l2.i, o0.a, y71, org.telegram.ui.Components.f5, lb0, mg.o, bh.h, y9, com.google.android.gms.common.api.internal.o, rg.x1, s4.h1, com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ w4(int i10, boolean z10) {
        this.a = i10;
    }

    public static float[] R(ArrayList arrayList) {
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
            arrayList2.add((PointF) i2.d.g(1, arrayList));
        }
        int i29 = i10;
        float f20 = ((PointF) arrayList2.get(i29)).x;
        if (f20 > f11) {
            for (int i30 = (int) f20; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f21 = ((PointF) i2.d.g(1, arrayList2)).x;
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

    public static w4 T(float f7, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new w4(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new w4(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new w4(i11, i12, new int[0]) : new w4(i12, i11, new int[0]);
    }

    @Override // mg.o
    public void A() {
        sf0 sf0Var = ((tf0) this.b).a;
        if (sf0Var != null) {
            ((at0) sf0Var).a.e0.invalidate();
        }
    }

    @Override // y2.g
    public void B(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.h) this.b).x((y2.o) iVar, j10, j11);
    }

    @Override // rg.x1
    public void B0(float f7) {
        hu0 hu0Var = (hu0) this.b;
        qg.s0.e(hu0Var.P1).k(String.valueOf(qg.m.a.indexOf(hu0Var.W0.getCurrentBrush())), f7);
        qg.q1 q1Var = hu0Var.K1;
        q1Var.c = f7;
        hu0Var.t0(q1Var, null);
    }

    @Override // ji.j0
    public o9 C() {
        q3 q3Var = ((y4) this.b).N;
        if (q3Var != null) {
            return q3Var.a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // s4.h1
    public int D() {
        return ((s4.n0) this.b).D();
    }

    @Override // s4.h1
    public View D0(int i10) {
        return ((s4.n0) this.b).q(i10);
    }

    @Override // ji.j0
    public void F(CharSequence charSequence) {
        q3 q3Var = ((y4) this.b).N;
        if (q3Var != null) {
            q3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            q3Var.a.u4(charSequence.toString());
        }
    }

    public void G(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void H() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    public s0.c I(int i10) {
        return null;
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ String I0() {
        return null;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.b).R0(i10, z10, 0, true, 0L);
    }

    @Override // org.telegram.ui.y9
    public void K(String str) {
        String trim;
        int i10;
        org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.b;
        if (str == null) {
            trim = "";
        } else {
            try {
                trim = str.trim();
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.f3(z4Var, 7));
                return;
            }
        }
        Uri parse = Uri.parse(trim);
        String scheme = parse.getScheme();
        if (("ton".equalsIgnoreCase(scheme) || "tc".equalsIgnoreCase(scheme)) && (z4Var.getParentActivity() instanceof LaunchActivity)) {
            LaunchActivity launchActivity = (LaunchActivity) z4Var.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) z4Var).currentAccount;
            if (new jc0(launchActivity, i10, null, false).g(parse)) {
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.f3(z4Var, 7));
    }

    @Override // ji.j0
    public n9 L() {
        return (y4) this.b;
    }

    @Override // s4.h1
    public int L0(View view) {
        return s4.n0.y(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).rightMargin;
    }

    @Override // mg.o
    public void M(boolean z10) {
        ((tf0) this.b).c.setAspectLock(z10);
    }

    public String N(Object obj) {
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

    @Override // ji.j0
    public a O() {
        return ((y4) this.b).a;
    }

    public s0.c P(int i10) {
        return null;
    }

    @Override // ji.j0
    public boolean Q() {
        y4 y4Var = (y4) this.b;
        q3 q3Var = y4Var.N;
        if (q3Var == null) {
            return false;
        }
        a aVar = y4Var.a;
        return q3Var.a.T4();
    }

    @Override // ji.j0
    public void S(int i10, int i11) {
        y4 y4Var = (y4) this.b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.a;
            h2 h2Var = q3Var.a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    public boolean U(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void V(s4.b1 b1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        boolean z10;
        s4.b1 T;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(b1Var);
        recyclerView.h(b1Var);
        b1Var.q(false);
        s4.e1 e1Var = (s4.e1) recyclerView.c0;
        e1Var.getClass();
        int i11 = v0Var.a;
        int i12 = v0Var.b;
        View view = b1Var.a;
        int left = v0Var2 == null ? view.getLeft() : v0Var2.a;
        int top = v0Var2 == null ? view.getTop() : v0Var2.b;
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
            e1Var.s(b1Var, v0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = e1Var.r(b1Var, v0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void W(s4.b1 b1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        s4.n0 n0Var = recyclerView.x;
        View view = b1Var.a;
        qf.e eVar = recyclerView.b;
        li.k kVar = n0Var.a;
        h5 h5Var = (h5) kVar.b;
        int indexOfChild = ((RecyclerView) h5Var.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ad.d) kVar.c).G(indexOfChild)) {
                kVar.X(view);
            }
            h5Var.a1(indexOfChild);
        }
        eVar.g(view);
    }

    @Override // o0.a
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
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

    public Object Y() {
        if (n7.a.b == null) {
            n7.a.b = new com.google.firebase.messaging.r();
        }
        synchronized (n7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // ji.j0
    public void Z() {
        y4 y4Var = (y4) this.b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.a;
            x3 x3Var = q3Var.a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f3.onContentChanged();
        }
    }

    @Override // ji.j0
    public void a(h1 h1Var) {
        q3 q3Var = ((y4) this.b).N;
        if (q3Var != null) {
            x3 x3Var = q3Var.a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.c0(h1Var, true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        s6.f fVar = new s6.f(0, (TaskCompletionSource) obj2);
        s6.e eVar = (s6.e) ((s6.h) obj).u();
        s6.a aVar = (s6.a) this.b;
        Parcel H0 = eVar.H0();
        k7.a.d(H0, fVar);
        k7.a.c(H0, aVar);
        eVar.I0(H0, 1);
    }

    @Override // l2.i
    public long b(long j10) {
        return 0L;
    }

    @Override // s4.h1
    public int b0() {
        s4.n0 n0Var = (s4.n0) this.b;
        return n0Var.m - n0Var.E();
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // m.e2
    public void d(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // l2.i
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ boolean e1(String str, org.telegram.ui.o9 o9Var) {
        return false;
    }

    @Override // ji.j0
    public void f() {
        y4 y4Var = (y4) this.b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            x3.Q1(q3Var.a, y4Var.a);
        }
    }

    @Override // rg.x1
    public float get() {
        hu0 hu0Var = (hu0) this.b;
        int i10 = hu0Var.P1;
        qg.m currentBrush = hu0Var.W0.getCurrentBrush();
        return currentBrush == null ? qg.s0.e(i10).i : qg.s0.e(i10).f(String.valueOf(qg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // l2.i
    public long h(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // l2.i
    public m2.j i(long j10) {
        return (m2.j) this.b;
    }

    @Override // mg.o
    public void i0(boolean z10) {
        tf0 tf0Var = (tf0) this.b;
        tf0Var.getClass();
        sf0 sf0Var = tf0Var.a;
        if (sf0Var != null) {
            ((at0) sf0Var).a(z10);
        }
    }

    @Override // org.telegram.ui.Components.y71
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
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        int i11 = oVar.c;
        hVar.m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
        k4.d dVar = min == -9223372036854775807L ? y2.l.f : new k4.d(0, min, false);
        hVar.q.t(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // y2.g
    public void k(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        if (i10 == 0) {
            long j12 = oVar.a;
            uVar = new u2.u(oVar.b, j10);
        } else {
            long j13 = oVar.a;
            g2.m mVar = oVar.b;
            g2.b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        }
        hVar.q.v(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // mg.o
    public void k0() {
        sf0 sf0Var = ((tf0) this.b).a;
        if (sf0Var != null) {
            PhotoViewer photoViewer = ((at0) sf0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // y2.g
    public void l(y2.i iVar, long j10, long j11) {
        long j12;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        long j13 = oVar.a;
        g2.m mVar = oVar.b;
        g2.b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        hVar.m.getClass();
        hVar.q.r(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
                        uri = u8.a(oVar.d.c);
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
        c5.a aVar = cVar3.i;
        if (aVar == null) {
            hVar.w();
            return;
        }
        String str = aVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.K = e2.m0.V(aVar.c) - hVar.J;
                hVar.z(true);
                return;
            } catch (b2.x0 e) {
                hVar.y(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            hVar.A(aVar, new l2.g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            hVar.A(aVar, new sb.a(12));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.w();
        } else {
            hVar.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // org.telegram.ui.Components.lb0
    public Paint.FontMetricsInt m() {
        return ((vi) this.b).H0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // bh.h
    public void m0(bh.a aVar) {
        aVar.a(((jr0) this.b).getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override // l.i
    public void n(l.k kVar) {
        l2.f fVar = ((ActionMenuView) this.b).K;
        if (fVar != null) {
            fVar.n(kVar);
        }
    }

    @Override // l2.i
    public long o(long j10, long j11) {
        return 0L;
    }

    @Override // ji.j0
    public void o0() {
        y4 y4Var = (y4) this.b;
        q3 q3Var = y4Var.N;
        if (q3Var != null) {
            a aVar = y4Var.a;
            x3.P1(q3Var.a);
        }
    }

    @Override // l.i
    public boolean p(l.k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.b).P;
        if (kVar2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((d4) kVar2).b).W.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.a0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // s4.h1
    public int q(View view) {
        return s4.n0.x(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).leftMargin;
    }

    @Override // m.e2
    public void s(l.k kVar, l.m mVar) {
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

    @Override // l2.i
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 29:
                te.b bVar = te.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((s4.b) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // l2.i
    public long u() {
        return 0L;
    }

    @Override // bh.h
    public void v(Canvas canvas) {
        jr0 jr0Var = (jr0) this.b;
        canvas.drawColor(jr0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            jr0Var.O0.b(canvas, -3);
        }
    }

    @Override // l2.i
    public long w(long j10) {
        return 1L;
    }

    @Override // l2.i
    public long x(long j10, long j11) {
        return 1L;
    }

    @Override // org.telegram.ui.Components.lb0
    public void y(int i10, int i11, CharSequence charSequence, boolean z10) {
        vi viVar = (vi) this.b;
        if (viVar.o1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(viVar.o1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, viVar.o1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            viVar.o1().setText(spannableStringBuilder);
            viVar.o1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void z(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.b);
    }

    public /* synthetic */ w4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ w4(s6.g gVar, s6.a aVar) {
        this.a = 28;
        this.b = aVar;
    }

    public w4(int i10) {
        this.a = i10;
        switch (i10) {
            case 17:
                this.b = new HashMap();
                break;
            case 25:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.d(this);
                    break;
                } else {
                    this.b = new ai0(this);
                    break;
                }
            default:
                this.b = new o2.d(1.0f, 5, 0, false);
                break;
        }
    }

    public w4(int i10, int i11, int[] iArr) {
        this.a = 12;
        w60[] w60VarArr = new w60[(iArr.length / 2) + 1];
        this.b = w60VarArr;
        w60 w60Var = new w60(i10, i11);
        int i12 = 0;
        w60VarArr[0] = w60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((w60[]) this.b)[i13] = new w60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public w4(Context context, Uri uri) {
        this.a = 9;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Components.lb0
    public /* synthetic */ void E(String str) {
    }

    @Override // org.telegram.ui.y9
    public /* synthetic */ void W0(MrzRecognizer.Result result) {
    }

    @Override // l2.i
    public long c(long j10, long j11) {
        return j11;
    }

    @Override // org.telegram.ui.Components.lb0
    public /* synthetic */ void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.lb0
    public /* synthetic */ void r(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}

package n2;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.a1;
import e9.g0;
import e9.i0;
import gg.b2;
import hg.k0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.kq0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.rq0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.m9;
import org.telegram.ui.ts0;
import org.telegram.ui.u9;
import org.telegram.ui.web.d1;
import pg.b1;
import pg.e1;
import r7.z;
import s4.c1;
import s4.f1;
import s4.h1;
import s4.o0;
import s4.p0;
import yh.w2;
import yh.y3;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public class e implements o0.b, k71, d5, ta0, lg.o, r71, b2, u9, com.google.android.gms.common.api.internal.s, h1, w2.a, kq0, pk0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ e(int i10, boolean z10) {
        this.a = i10;
    }

    public static float[] D(ArrayList arrayList) {
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
            arrayList2.add((PointF) k0.g(1, arrayList));
        }
        float f18 = ((PointF) arrayList2.get(0)).x;
        if (f18 > f10) {
            for (int i23 = (int) f18; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f19 = ((PointF) k0.g(1, arrayList2)).x;
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

    public static e E(float f7, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new e(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new e(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new e(i11, i12, new int[0]) : new e(i12, i11, new int[0]);
    }

    public int B(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    @Override // s4.h1
    public int C(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    public void G(aa.a aVar) {
        h8.j jVar = (h8.j) this.b;
        jVar.a = aVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    public boolean H(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void I(c1 c1Var, q0 q0Var, q0 q0Var2) {
        boolean z10;
        c1 U;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.c0;
        f1Var.getClass();
        int i11 = q0Var.a;
        int i12 = q0Var.b;
        View view = c1Var.a;
        int left = q0Var2 == null ? view.getLeft() : q0Var2.a;
        int top = q0Var2 == null ? view.getTop() : q0Var2.b;
        if (c1Var.j() || (i11 == left && i12 == top)) {
            int i13 = c1Var.h;
            int i14 = -1;
            if (i13 != -1) {
                for (int i15 = 0; i15 < recyclerView.getChildCount(); i15++) {
                    View childAt = recyclerView.getChildAt(i15);
                    if (childAt != null && (U = recyclerView.U(childAt)) != null && !U.j() && (i10 = U.h) >= 0 && i10 < i13 && i10 > i14) {
                        i14 = i10;
                    }
                }
            }
            c1Var.i = (c1Var.h - i14) + (i14 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = f1Var.r(c1Var, q0Var, i11, i12, left, top);
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.b).T0(i10, z10, 0, true, 0L);
    }

    @Override // org.telegram.ui.u9
    public String J0() {
        return ((d1) this.b).i0;
    }

    @Override // org.telegram.ui.u9
    public void K(String str) {
        d1 d1Var = (d1) this.b;
        try {
            d1Var.P = System.currentTimeMillis();
            d1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // lg.o
    public void L(boolean z10) {
        ((df0) this.b).c.setAspectLock(z10);
    }

    public void M(c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        o0 o0Var = recyclerView.x;
        View view = c1Var.a;
        of.e eVar = recyclerView.b;
        lf.i iVar = o0Var.a;
        ka.c cVar = (ka.c) iVar.b;
        int indexOfChild = ((RecyclerView) cVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) iVar.c).F(indexOfChild)) {
                iVar.Y(view);
            }
            cVar.j0(indexOfChild);
        }
        eVar.g(view);
    }

    @Override // org.telegram.ui.Components.ta0
    public void O(int i10, int i11, CharSequence charSequence, boolean z10) {
        vi viVar = (vi) this.b;
        if (viVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(viVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, viVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            viVar.m1().setText(spannableStringBuilder);
            viVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // gg.b2
    public void a(int i10) {
        rq0 rq0Var = (rq0) this.b;
        vq0 vq0Var = rq0Var.K;
        rq0Var.s = i10;
        if (rq0Var.v != i10) {
            rq0Var.d.clear();
        }
        int i11 = rq0Var.J;
        if (rq0Var.h() != 0 || rq0Var.e.e() || rq0Var.I) {
            vq0Var.x0.b(i11);
        } else {
            vq0Var.Q.e(false, true);
        }
        rq0Var.l();
        int i12 = vq0.a1;
        vq0Var.K0(true);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 16:
                g8.e eVar = (g8.e) this.b;
                z zVar = (z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, eVar);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                break;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar2 = (s6.e) ((s6.h) obj).u();
                s6.a aVar = (s6.a) this.b;
                Parcel I0 = eVar2.I0();
                k7.a.d(I0, fVar2);
                k7.a.c(I0, aVar);
                eVar2.J0(I0, 1);
                break;
        }
    }

    @Override // w2.a
    public long b(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).b) {
            return ((z3.a) arrayList.get(0)).b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.b;
            long j11 = aVar.b;
            if (j3 < j10) {
                long j12 = ((z3.a) arrayList.get(i10 - 1)).d;
                return (j12 == -9223372036854775807L || j12 <= j3 || j12 >= j11) ? j11 : j12;
            }
        }
        long j13 = ((z3.a) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // s4.h1
    public int c(View view) {
        return o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    @Override // w2.a
    public void clear() {
        ((ArrayList) this.b).clear();
    }

    @Override // o0.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // w2.a
    public i0 d(long j3) {
        int B = B(j3);
        if (B == 0) {
            g0 g0Var = i0.b;
            return a1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.b).get(B - 1);
        long j10 = aVar.d;
        if (j10 == -9223372036854775807L || j3 < j10) {
            return aVar.a;
        }
        g0 g0Var2 = i0.b;
        return a1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // w2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(z3.a aVar, long j3) {
        boolean z10;
        int size;
        ArrayList arrayList = (ArrayList) this.b;
        long j10 = aVar.b;
        e2.d.b(j10 != -9223372036854775807L);
        if (j10 <= j3) {
            long j11 = aVar.d;
            if (j11 == -9223372036854775807L || j3 < j11) {
                z10 = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j10 >= ((z3.a) arrayList.get(size)).b) {
                        arrayList.add(size + 1, aVar);
                        return z10;
                    }
                    if (((z3.a) arrayList.get(size)).b <= j3) {
                        z10 = false;
                    }
                }
                arrayList.add(0, aVar);
                return z10;
            }
        }
        z10 = false;
        while (size >= 0) {
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // lg.o
    public void e0(boolean z10) {
        df0 df0Var = (df0) this.b;
        df0Var.getClass();
        cf0 cf0Var = df0Var.a;
        if (cf0Var != null) {
            ((ts0) cf0Var).a(z10);
        }
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ boolean e1(String str, m9 m9Var) {
        return false;
    }

    @Override // s4.h1
    public int g() {
        return ((o0) this.b).D();
    }

    @Override // lg.o
    public void g0() {
        cf0 cf0Var = ((df0) this.b).a;
        if (cf0Var != null) {
            PhotoViewer photoViewer = ((ts0) cf0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.p3();
            }
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.b;
        tVar.a.ab(null, tVar.e, tVar.b, view, 0.0f, 0.0f, o0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new w2(this, 8));
    }

    @Override // gg.b2
    public /* synthetic */ a0.i i() {
        return null;
    }

    @Override // org.telegram.ui.Components.k71
    public void invalidate() {
        ((u1) ((org.telegram.ui.Cells.h1) this.b).b).invalidate();
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // w2.a
    public long l(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).b;
            if (j3 == j10) {
                return j10;
            }
            if (j3 < j10) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j11 = aVar.d;
                return (j11 == -9223372036854775807L || j11 > j3) ? aVar.b : j11;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        return (j12 == -9223372036854775807L || j3 < j12) ? aVar2.b : j12;
    }

    @Override // w2.a
    public void m(long j3) {
        ArrayList arrayList = (ArrayList) this.b;
        int B = B(j3);
        if (B == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(B - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            B--;
        }
        arrayList.subList(0, B).clear();
    }

    @Override // gg.b2
    public /* synthetic */ a0.i o() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public void onDismiss() {
        d1 d1Var = (d1) this.b;
        d1Var.z("scan_qr_popup_closed", null);
        d1Var.h0 = false;
    }

    @Override // org.telegram.ui.Components.r71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r71
    public void onStateChanged(boolean z10, int i10) {
        rk0 rk0Var = (rk0) this.b;
        if (z10 && rk0Var.n.n() >= 0) {
            rk0Var.w = true;
        }
        qg0 qg0Var = rk0Var.f;
        kc0 kc0Var = rk0Var.x;
        qg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(kc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(kc0Var, 16L);
        }
    }

    @Override // org.telegram.ui.Components.r71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // o0.b
    public Cursor q(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean r() {
        return false;
    }

    @Override // gg.b2
    public boolean s(int i10) {
        return i10 == ((rq0) this.b).r;
    }

    public void t() {
        pg.c1 c1Var = ((e1) this.b).d;
        if (c1Var != null) {
            b1 b1Var = c1Var.s;
            if (b1Var != null) {
                c1Var.cancelRunnable(b1Var);
                c1Var.s = null;
            }
            b1 b1Var2 = new b1(c1Var, 1);
            c1Var.s = b1Var2;
            c1Var.postRunnable(b1Var2, 1L);
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public s0.c u(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.kq0
    public void u0() {
        qc k10 = ((y3) this.b).getBulletinFactory().k(false);
        k10.t = true;
        k10.j();
    }

    public s0.c v(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ta0
    public Paint.FontMetricsInt w() {
        return ((vi) this.b).E0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // s4.h1
    public int x() {
        o0 o0Var = (o0) this.b;
        return o0Var.m - o0Var.E();
    }

    @Override // s4.h1
    public View y(int i10) {
        return ((o0) this.b).q(i10);
    }

    @Override // lg.o
    public void z() {
        cf0 cf0Var = ((df0) this.b).a;
        if (cf0Var != null) {
            ((ts0) cf0Var).a.e0.invalidate();
        }
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.r71
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ e(s6.g gVar, s6.a aVar) {
        this.a = 21;
        this.b = aVar;
    }

    public e(int i10) {
        this.a = i10;
        switch (i10) {
            case 18:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.b = new s0.d(this);
                    break;
                } else {
                    this.b = new kh0(this);
                    break;
                }
            case 24:
                this.b = new ArrayList();
                break;
            case 26:
                this.b = new CopyOnWriteArrayList();
                break;
            default:
                this.b = new o2.d(5, 1.0f, false);
                break;
        }
    }

    public e(int i10, int i11, int[] iArr) {
        this.a = 4;
        h60[] h60VarArr = new h60[(iArr.length / 2) + 1];
        this.b = h60VarArr;
        h60 h60Var = new h60(i10, i11);
        int i12 = 0;
        h60VarArr[0] = h60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((h60[]) this.b)[i13] = new h60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 15;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    @Override // org.telegram.ui.Components.kq0
    public /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void p() {
    }

    public e(Context context, Uri uri) {
        this.a = 1;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // gg.b2
    public /* synthetic */ void F(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ta0
    public /* synthetic */ void P(String str) {
    }

    @Override // org.telegram.ui.u9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.r71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.r71
    public void onError(u71 u71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.ta0
    public /* synthetic */ void A(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.ta0
    public /* synthetic */ void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.r71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}

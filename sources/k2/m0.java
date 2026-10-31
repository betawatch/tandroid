package k2;

import android.app.Activity;
import android.content.ContentProviderClient;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import b2.p1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.c20;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.gj;
import org.telegram.messenger.hc;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.mz;
import org.telegram.messenger.oz;
import org.telegram.messenger.pz;
import org.telegram.messenger.qz;
import org.telegram.messenger.s2;
import org.telegram.messenger.va;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.qs0;
import org.telegram.ui.t71;
import org.telegram.ui.xn0;
import r0.j1;
import u2.r1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m0 implements y2.m, l.x, l.j, k1.f, n5.b, o0.a, u2.e1, va, mz, mn0, l1, q4, v90, r0.m, ws0, xn0 {
    public Object a;

    public /* synthetic */ m0(Object obj) {
        this.a = obj;
    }

    public static float[] h0(ArrayList arrayList) {
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
            arrayList2.add((PointF) i0.a.g(1, arrayList));
        }
        int i29 = i10;
        float f20 = ((PointF) arrayList2.get(i29)).x;
        if (f20 > f11) {
            for (int i30 = (int) f20; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f21 = ((PointF) i0.a.g(1, arrayList2)).x;
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

    public static m0 j0(float f7, int i10) {
        Point point = org.telegram.messenger.i0.q;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new m0(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new m0(i11, i12, i12, i11);
        }
        return (i10 == 1) == (i11 < i12) ? new m0(i11, i12, new int[0]) : new m0(i12, i11, new int[0]);
    }

    public static void q0(String str, TreeMap treeMap) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean A1(q1 q1Var, jj jjVar) {
        return false;
    }

    @Override // l.x
    public boolean B(l.l lVar) {
        m.h hVar = (m.h) this.a;
        if (lVar == hVar.c) {
            return false;
        }
        ((l.e0) lVar).A.getClass();
        hVar.getClass();
        l.x xVar = hVar.e;
        if (xVar != null) {
            return xVar.B(lVar);
        }
        return false;
    }

    public void B0(ba.a aVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((lc.v) this.a).c) {
        }
        throw new lc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), aVar);
    }

    @Override // org.telegram.ui.Components.ws0
    public org.telegram.ui.ActionBar.b1 D(String str) {
        org.telegram.ui.ActionBar.b1 h = ((z60) this.a).h();
        h.setText(str);
        return h;
    }

    @Override // org.telegram.messenger.mz
    public void E() {
        qz qzVar = (qz) this.a;
        HashMap hashMap = qzVar.n;
        qzVar.getNotificationCenter().k(zs.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.messenger.mz
    public void F(Location location) {
        qz qzVar = (qz) this.a;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.i0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = org.telegram.messenger.i0.b0(location.getLongitude());
        HashMap hashMap = qzVar.n;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            jj jjVar = (jj) ((Map.Entry) it.next()).getValue();
            qzVar.r0(oz.d(tL_messageMediaGeo, jj.B0(jjVar.k), jjVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ qs0 H1() {
        return null;
    }

    @Override // o0.a
    public Cursor I(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean I0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.a).R0(z10, i10, 0, 0L, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean K1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void L1(q1 q1Var, int i10, float f7, float f10, boolean z10) {
        z9 z9Var = (z9) this.a;
        org.telegram.ui.Cells.f fVar = z9Var.D;
        if (z9Var.a()) {
            z9Var.y = 0;
            q1Var.invalidate();
            org.telegram.messenger.i0.r(fVar);
            org.telegram.messenger.i0.h3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean M0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.v90
    public void N(int i10, int i11, CharSequence charSequence, boolean z10) {
        bi biVar = (bi) this.a;
        if (biVar.Z0() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(biVar.Z0().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                k6.l(spannableStringBuilder, biVar.Z0().getEditText().getPaint().getFontMetricsInt(), false);
            }
            biVar.Z0().setText(spannableStringBuilder);
            biVar.Z0().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean N1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R(q1 q1Var) {
        return false;
    }

    @Override // r0.m
    public j1 R0(View view, j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        nl0 nl0Var = (nl0) this.a;
        nl0Var.w.setPadding(I0.a, I0.b, I0.c, I0.d);
        nl0Var.s.requestLayout();
        return j1.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S0(jj jjVar) {
        return org.telegram.ui.Cells.f1.a(jjVar);
    }

    @Override // org.telegram.ui.xn0
    public void V() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((bh.d) this.a).b).startActivityForResult(intent, 11);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ zg.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z(q1 q1Var) {
        return false;
    }

    @Override // y2.m
    public void a() {
        l2.h hVar = (l2.h) this.a;
        hVar.A.a();
        IOException iOException = hVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.xn0
    public void b(ArrayList arrayList) {
        bh.d dVar = (bh.d) this.a;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            pz pzVar = (pz) arrayList.get(0);
            if (pzVar.c != null) {
                dVar.e = new File(b8.z(4), Utilities.b.nextInt() + ".jpg");
                Point c12 = org.telegram.messenger.i0.c1();
                Bitmap K = hc.K(pzVar.c, null, (float) c12.x, (float) c12.y, true);
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) dVar.e));
                ((b81) dVar.d).b((File) dVar.e, K, true);
            }
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    public int b0() {
        return ((org.telegram.messenger.l0) this.a).c;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return ((z9) this.a).a();
    }

    @Override // org.telegram.ui.Cells.l1
    public void c1(q1 q1Var, int i10) {
        z9 z9Var = (z9) this.a;
        org.telegram.ui.Cells.f fVar = z9Var.D;
        if (z9Var.a()) {
            z9Var.y = 2;
            q1Var.invalidate();
            org.telegram.messenger.i0.r(fVar);
            org.telegram.messenger.i0.h3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c2(int i10) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                cf.b.g((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // k1.f
    public Object d(ld.p pVar, ed.c cVar) {
        return ((k1.z) this.a).d(new n1.c(pVar, null, 0), cVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int f0(q1 q1Var) {
        return 0;
    }

    @Override // l.x
    public void g(l.l lVar, boolean z10) {
        if (lVar instanceof l.e0) {
            ((l.e0) lVar).z.k().c(false);
        }
        l.x xVar = ((m.h) this.a).e;
        if (xVar != null) {
            xVar.g(lVar, z10);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ l9 g2() {
        return null;
    }

    @Override // zc.a
    public Object get() {
        return this.a;
    }

    @Override // org.telegram.ui.Components.mn0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // k1.f
    public wd.b getData() {
        return ((k1.z) this.a).c;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean i0() {
        return c();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mn0
    public void k(boolean z10, float f7) {
        t71 t71Var = (t71) ((org.telegram.ui.Cells.i0) this.a);
        int i10 = (int) (t6.q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        t6.q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = t71Var.f.e;
            ck0 ck0Var = (ck0) themeActivity.b.K(themeActivity.f0);
            if (ck0Var != null) {
                ((b9) ck0Var.a).setText(cd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (t6.q * 100.0f))));
            }
            t6.F(true);
        }
    }

    @Override // org.telegram.ui.Components.ws0
    public org.telegram.ui.ActionBar.b1 k0(int i10, Runnable runnable, String str, boolean z10, boolean z11) {
        z60 z60Var = (z60) this.a;
        int x10 = z60Var.x();
        z60Var.c(i10, str, new ag.j0(runnable, z11, z60Var, 22), z10);
        View w9 = z60Var.w(x10);
        if (w9 instanceof org.telegram.ui.ActionBar.b1) {
            return (org.telegram.ui.ActionBar.b1) w9;
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean k1(q1 q1Var, int i10) {
        return i10 == ((z9) this.a).y;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean m0(o5 o5Var) {
        return false;
    }

    public void n0() {
        o2.k kVar = (o2.k) this.a;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.a;
        }
        p1[] p1VarArr = new p1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                p1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new r1(p1VarArr);
        kVar.G.e(kVar);
    }

    @Override // l.j
    public void p(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.a;
        m.h hVar = toolbar.a.J;
        if (hVar == null || !hVar.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.b0) it.next()).a.t();
            }
        }
    }

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // u2.e1
    public void r(u2.f1 f1Var) {
        o2.k kVar = (o2.k) this.a;
        kVar.G.r(kVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean r1() {
        return false;
    }

    public void t0() {
        a4.l lVar = (a4.l) this.a;
        lVar.getClass();
        try {
            i8.c cVar = (i8.c) lVar.b;
            Parcel P0 = cVar.P0();
            int i10 = s7.b.a;
            P0.writeInt(0);
            cVar.T0(P0, 2);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    @Override // l.j
    public boolean u(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.a).getClass();
        return false;
    }

    public void u0() {
        a4.l lVar = (a4.l) this.a;
        lVar.getClass();
        try {
            i8.c cVar = (i8.c) lVar.b;
            Parcel P0 = cVar.P0();
            int i10 = s7.b.a;
            P0.writeInt(0);
            cVar.T0(P0, 3);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public void v0() {
        a4.l lVar = (a4.l) this.a;
        lVar.getClass();
        try {
            i8.c cVar = (i8.c) lVar.b;
            Parcel P0 = cVar.P0();
            int i10 = s7.b.a;
            P0.writeInt(0);
            cVar.T0(P0, 1);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    @Override // org.telegram.ui.Components.v90
    public Paint.FontMetricsInt w() {
        return ((bi) this.a).y2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w0(jj jjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ws0
    public void y() {
        ((z60) this.a).k();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle y1(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
        z9 z9Var = (z9) this.a;
        org.telegram.ui.Cells.f fVar = z9Var.D;
        if (z9Var.a()) {
            z9Var.y = 2;
            org.telegram.messenger.i0.r(fVar);
            org.telegram.messenger.i0.h3(fVar, 5000L);
        }
    }

    public m0(int i10, int i11, int... iArr) {
        k50[] k50VarArr = new k50[(iArr.length / 2) + 1];
        this.a = k50VarArr;
        k50 k50Var = new k50(i10, i11);
        int i12 = 0;
        k50VarArr[0] = k50Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((k50[]) this.a)[i13] = new k50(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public m0(String str, Set set) {
        this.a = new org.telegram.messenger.r0(str, set);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B1() {
    }

    @Override // org.telegram.ui.Components.mn0
    public void C() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void M(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O(jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var) {
    }

    @Override // org.telegram.ui.Components.v90
    public /* synthetic */ void X(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(q1 q1Var, c20 c20Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void S1(q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0(q1 q1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n1(q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void D0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.v90
    public /* synthetic */ void L(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f1(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void l1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Components.v90
    public /* synthetic */ void m(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o0(q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r0(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}

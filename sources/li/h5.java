package li;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.u71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gs0;
import org.telegram.ui.nt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h5 implements f1, m.k, o0.a, kp0, org.telegram.ui.Components.e5, ng.o, pe.a, com.google.android.gms.common.api.internal.o, sg.x1, o5.b, androidx.lifecycle.s0, com.google.android.gms.common.api.internal.r {
    public Object a;

    public /* synthetic */ h5(Object obj) {
        this.a = obj;
    }

    public static float[] d(ArrayList arrayList) {
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
            arrayList2.add((PointF) ic.a.g(1, arrayList));
        }
        int i29 = i10;
        float f20 = ((PointF) arrayList2.get(i29)).x;
        if (f20 > f11) {
            for (int i30 = (int) f20; i30 >= 0; i30--) {
                arrayList2.add(i29, new PointF(i30, f11));
            }
        }
        float f21 = ((PointF) ic.a.g(1, arrayList2)).x;
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

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 B(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.a) {
            if (cVar.a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // o0.a
    public Cursor D(Uri uri, String[] strArr, String[] strArr2) {
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

    @Override // li.f1
    public void E(g1 g1Var, int i10, int i11) {
        b3 b3Var;
        s9 textSelectionHelper;
        p5 p5Var = (p5) this.a;
        if (p5Var.G || i10 == i11 || (b3Var = p5Var.E) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == p5Var) {
            return;
        }
        p5Var.post(new hi.v4(this, g1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.a;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override // ng.o
    public void H(boolean z10) {
        of0 of0Var = (of0) this.a;
        of0Var.getClass();
        nf0 nf0Var = of0Var.a;
        if (nf0Var != null) {
            ((gs0) nf0Var).d(z10);
        }
    }

    @Override // ng.o
    public void P() {
        nf0 nf0Var = ((of0) this.a).a;
        if (nf0Var != null) {
            PhotoViewer photoViewer = ((gs0) nf0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.s3();
            }
        }
    }

    @Override // li.f1
    public void T(CharSequence charSequence) {
        b3 b3Var = ((p5) this.a).E;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.z4(charSequence.toString());
    }

    @Override // org.telegram.ui.Components.kp0
    public void U(float f7, boolean z10) {
        og.h hVar = (og.h) this.a;
        float f10 = hVar.b;
        float z11 = c3.h0.z(hVar.c, f10, f7, f10);
        hVar.d = z11;
        if (z10) {
            u6 u6Var = hVar.e;
            u6Var.getClass();
            u6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    @Override // sg.x1
    public void V(float f7) {
        nt0 nt0Var = (nt0) this.a;
        rg.s0.e(nt0Var.E1).k(String.valueOf(rg.m.a.indexOf(nt0Var.L0.getCurrentBrush())), f7);
        rg.q1 q1Var = nt0Var.z1;
        q1Var.c = f7;
        nt0Var.r0(q1Var, null);
    }

    @Override // li.f1
    public void Y(Editable editable) {
        p5 p5Var = (p5) this.a;
        a aVar = p5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = p5Var.r.E;
        }
        p5Var.t();
        b3 b3Var = p5Var.E;
        if (b3Var == null || p5Var.a == null) {
            return;
        }
        b3Var.a();
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        w8.j jVar = (w8.j) this.a;
        f8.b bVar = (f8.b) obj;
        Bundle G = bVar.G();
        G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        f8.a aVar = new f8.a(0, (TaskCompletionSource) obj2);
        try {
            f8.i iVar = (f8.i) bVar.u();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = f8.c.a;
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            G.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            try {
                iVar.a.transact(19, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            Bundle bundle = Bundle.EMPTY;
            aVar.V(Status.h, null);
        }
    }

    @Override // li.f1
    public void b(g1 g1Var) {
        b3 b3Var = ((p5) this.a).E;
        if (b3Var != null) {
            v3 v3Var = b3Var.a;
            v3.S1(v3Var, g1Var);
            v3Var.p3.s(g1Var, true);
        }
    }

    public String c(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ma.d dVar = (ma.d) this.a;
            ma.e eVar = new ma.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.a;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // li.f1
    public boolean e() {
        p5 p5Var = (p5) this.a;
        b3 b3Var = p5Var.E;
        if (b3Var == null || p5Var.a == null) {
            return false;
        }
        return b3Var.a.Y4();
    }

    public void f(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.a;
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

    @Override // li.f1
    public /* synthetic */ boolean f0(boolean z10) {
        return false;
    }

    @Override // pe.a
    public /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // li.f1
    public /* synthetic */ boolean g(g1 g1Var) {
        return false;
    }

    @Override // id.a
    public Object get() {
        return new t5.i((Context) ((id.a) this.a).get(), "com.google.android.datatransport.events", Integer.valueOf(t5.i.d).intValue());
    }

    @Override // org.telegram.ui.Components.kp0
    public CharSequence getContentDescription() {
        og.h hVar = (og.h) this.a;
        float f7 = hVar.b;
        return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
    }

    @Override // pe.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public void h(aa.b0 b0Var, Thread thread, Throwable th2) {
        y9.n nVar = (y9.n) this.a;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    y9.x.a(nVar.e.G(new y9.k(nVar, System.currentTimeMillis(), th2, thread, b0Var)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override // pe.a
    public /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override // li.f1
    public void k(int i10, int i11) {
        f2 f2Var;
        p5 p5Var = (p5) this.a;
        b3 b3Var = p5Var.E;
        if (b3Var == null || p5Var.a == null || (f2Var = b3Var.a.R3) == null) {
            return;
        }
        f2Var.f(i10, i11);
    }

    @Override // org.telegram.ui.Components.kp0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // pe.a
    public /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // pe.a
    public boolean needClickAt(View view, float f7, float f10) {
        int dp = AndroidUtilities.dp(9.0f);
        u71 u71Var = (u71) this.a;
        float f11 = -dp;
        u71Var.g.inset(f11, f11);
        boolean contains = u71Var.g.contains(f7, f10);
        float f12 = dp;
        u71Var.g.inset(f12, f12);
        return contains;
    }

    @Override // pe.a
    public /* synthetic */ boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override // li.f1
    public /* synthetic */ boolean o(g1 g1Var) {
        return false;
    }

    @Override // pe.a
    public void onClickAt(View view, float f7, float f10) {
        Runnable runnable = ((u71) this.a).j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // pe.a
    public void onClickTouchDown(View view, float f7, float f10) {
        ((u71) this.a).h.c(true);
    }

    @Override // pe.a
    public void onClickTouchUp(View view, float f7, float f10) {
        ((u71) this.a).h.c(false);
    }

    @Override // pe.a
    public /* synthetic */ boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void p(Object obj) {
        ((h8.c) obj).onLocationResult((LocationResult) this.a);
    }

    @Override // ng.o
    public void q() {
        nf0 nf0Var = ((of0) this.a).a;
        if (nf0Var != null) {
            ((gs0) nf0Var).a.e0.invalidate();
        }
    }

    @Override // ng.o
    public void x(boolean z10) {
        ((of0) this.a).c.setAspectLock(z10);
    }

    @Override // sg.x1
    public float get() {
        nt0 nt0Var = (nt0) this.a;
        int i10 = nt0Var.E1;
        rg.m currentBrush = nt0Var.L0.getCurrentBrush();
        if (currentBrush == null) {
            return rg.s0.e(i10).i;
        }
        return rg.s0.e(i10).f(String.valueOf(rg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // li.f1
    public /* synthetic */ void t(g1 g1Var) {
    }

    @Override // li.f1
    public /* synthetic */ void R() {
    }

    @Override // org.telegram.ui.Components.kp0
    public void y() {
    }

    @Override // pe.a
    public /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override // pe.a
    public /* synthetic */ void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override // pe.a
    public /* synthetic */ void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override // pe.a
    public /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}

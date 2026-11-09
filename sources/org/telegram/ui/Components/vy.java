package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vy implements r51, og.n, org.telegram.ui.nm0, o2.i, mm0, com.google.android.gms.common.api.internal.p, tg.l1, j51, u4.c, com.google.android.gms.common.api.internal.n, v4.d0, v4.i1, q5.b {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ vy(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public static void K(String str, TreeMap treeMap) {
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

    public static float[] i(ArrayList arrayList) {
        float f10;
        int i7;
        int i10;
        float f11;
        double d;
        double d2;
        double[] dArr;
        ArrayList arrayList2;
        float f12;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            f10 = 255.0f;
            if (i13 >= size) {
                break;
            }
            PointF pointF = (PointF) arrayList.get(i13);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
            i13++;
        }
        int size2 = arrayList.size();
        int i14 = 1;
        double d10 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            i7 = 0;
            i10 = 1;
            f11 = 255.0f;
            d = 1.0d;
            d2 = 6.0d;
            dArr = null;
        } else {
            char c10 = 2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d11 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i15 = 1;
            while (true) {
                i11 = size2 - 1;
                if (i15 >= i11) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i15 - 1);
                PointF pointF3 = (PointF) arrayList.get(i15);
                int i16 = i15 + 1;
                double d12 = d10;
                PointF pointF4 = (PointF) arrayList.get(i16);
                double[] dArr5 = dArr2[i15];
                char c11 = c10;
                float f13 = pointF3.x;
                double d13 = d11;
                int i17 = i12;
                int i18 = i14;
                double d14 = f13 - pointF2.x;
                dArr5[i17] = d14 / 6.0d;
                float f14 = pointF4.x;
                float f15 = f10;
                dArr5[i18] = (f14 - r14) / 3.0d;
                double d15 = f14 - f13;
                dArr5[c11] = d15 / 6.0d;
                float f16 = pointF4.y;
                float f17 = pointF3.y;
                dArr3[i15] = ((f16 - f17) / d15) - ((f17 - pointF2.y) / d14);
                i15 = i16;
                c10 = c11;
                d10 = d12;
                d11 = d13;
                i12 = i17;
                i14 = i18;
                f10 = f15;
            }
            i7 = i12;
            i10 = i14;
            f11 = f10;
            d = d10;
            char c12 = c10;
            double d16 = d11;
            d2 = 6.0d;
            dArr3[i7] = d16;
            dArr3[i11] = d16;
            double[] dArr6 = dArr2[i11];
            dArr6[i10] = d;
            dArr6[i7] = d16;
            dArr6[c12] = d16;
            for (int i19 = i10; i19 < size2; i19++) {
                double[] dArr7 = dArr2[i19];
                double d17 = dArr7[i7];
                int i20 = i19 - 1;
                double[] dArr8 = dArr2[i20];
                double d18 = d17 / dArr8[i10];
                dArr7[i10] = dArr7[i10] - (dArr8[c12] * d18);
                dArr7[i7] = d16;
                dArr3[i19] = dArr3[i19] - (d18 * dArr3[i20]);
            }
            for (int i21 = size2 - 2; i21 >= 0; i21--) {
                double[] dArr9 = dArr2[i21];
                double d19 = dArr9[c12];
                int i22 = i21 + 1;
                double[] dArr10 = dArr2[i22];
                double d20 = d19 / dArr10[i10];
                dArr9[i10] = dArr9[i10] - (dArr10[i7] * d20);
                dArr9[c12] = d16;
                dArr3[i21] = dArr3[i21] - (d20 * dArr3[i22]);
            }
            dArr = new double[size2];
            for (int i23 = i7; i23 < size2; i23++) {
                dArr[i23] = dArr3[i23] / dArr2[i23][i10];
            }
        }
        int length = dArr.length;
        if (length < i10) {
            arrayList2 = null;
            f12 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i24 = i7;
            while (i24 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i24);
                int i25 = i24 + 1;
                PointF pointF6 = (PointF) arrayList.get(i25);
                int i26 = (int) pointF5.x;
                while (true) {
                    float f18 = pointF6.x;
                    if (i26 < ((int) f18)) {
                        float f19 = i26;
                        PointF pointF7 = pointF5;
                        double d21 = f18 - pointF5.x;
                        double d22 = (f19 - r12) / d21;
                        double d23 = d - d22;
                        int i27 = length;
                        double[] dArr11 = dArr;
                        float f20 = (float) (((((((d22 * d22) * d22) - d22) * dArr11[i25]) + ((((d23 * d23) * d23) - d23) * dArr11[i24])) * ((d21 * d21) / d2)) + (pointF6.y * d22) + (pointF7.y * d23));
                        if (f20 > f11) {
                            f20 = f11;
                        } else if (f20 < 0.0f) {
                            f20 = 0.0f;
                        }
                        arrayList2.add(new PointF(f19, f20));
                        i26++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i27;
                    }
                }
                i24 = i25;
            }
            f12 = 0.0f;
            arrayList2.add((PointF) jg.g.i(1, arrayList));
        }
        int i28 = i7;
        float f21 = ((PointF) arrayList2.get(i28)).x;
        if (f21 > f12) {
            for (int i29 = (int) f21; i29 >= 0; i29--) {
                arrayList2.add(i28, new PointF(i29, f12));
            }
        }
        float f22 = ((PointF) jg.g.i(1, arrayList2)).x;
        if (f22 < f11) {
            for (int i30 = ((int) f22) + 1; i30 <= 255; i30++) {
                arrayList2.add(new PointF(i30, f11));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        while (i28 < size3) {
            PointF pointF8 = (PointF) arrayList2.get(i28);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i28] = sqrt;
            i28++;
        }
        return fArr;
    }

    @Override // v4.i1
    public int A() {
        return ((v4.n0) this.b).D();
    }

    @Override // v4.d0
    public void E(int i7, int i10) {
        ((v4.g0) this.b).j(i7, i10);
    }

    @Override // og.n
    public void H(boolean z9) {
        ((gd0) this.b).c.setAspectLock(z9);
    }

    @Override // u4.c
    public void L() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public byte M() {
        int read = ((ab.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // v4.d0
    public void M0(int i7, int i10) {
        ((v4.g0) this.b).p(i7, i10);
    }

    @Override // v4.i1
    public int N() {
        v4.n0 n0Var = (v4.n0) this.b;
        return n0Var.m - n0Var.E();
    }

    public int O() {
        return ((M() & 255) << 24) | ((M() & 255) << 16) | ((M() & 255) << 8) | (M() & 255);
    }

    public int P() {
        return ((M() & Byte.MAX_VALUE) << 21) | ((M() & Byte.MAX_VALUE) << 14) | ((M() & Byte.MAX_VALUE) << 7) | (M() & Byte.MAX_VALUE);
    }

    public void Q(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }

    public void R(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((ab.d) this.b).skip(j3 - j10);
            if (skip <= 0) {
                throw new EOFException();
            }
            j10 += skip;
        }
    }

    public void S(com.google.android.gms.internal.clearcut.z0 z0Var, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((rc.u) this.b).c) {
        }
        throw new rc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), z0Var);
    }

    public Object T() {
        if (q7.a.b == null) {
            q7.a.b = new ab.a0();
        }
        synchronized (q7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // v4.i1
    public View W(int i7) {
        return ((v4.n0) this.b).q(i7);
    }

    @Override // tg.l1
    public void X(float f10) {
        tg.o0 o0Var = (tg.o0) this.b;
        sg.l0.e(o0Var.a).k("-1", f10);
        o0Var.e.setBrushSize(f10);
    }

    @Override // og.n
    public void Z(boolean z9) {
        gd0 gd0Var = (gd0) this.b;
        gd0Var.getClass();
        fd0 fd0Var = gd0Var.a;
        if (fd0Var != null) {
            ((org.telegram.ui.to0) fd0Var).m(z9);
        }
    }

    @Override // o2.i
    public long a(long j3) {
        return 0L;
    }

    @Override // v4.i1
    public int a0(View view) {
        return v4.n0.y(view) + ((ViewGroup.MarginLayoutParams) ((v4.o0) view.getLayoutParams())).rightMargin;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 16:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                s6.b bVar = (s6.b) ((s6.a) obj).n();
                q6.r rVar = (q6.r) this.b;
                Parcel j12 = bVar.j1();
                n7.a.b(j12, rVar);
                try {
                    bVar.b.transact(1, j12, null, 1);
                    j12.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    j12.recycle();
                    throw th2;
                }
            default:
                y8.j jVar = (y8.j) this.b;
                h8.b bVar2 = (h8.b) obj;
                Bundle B = bVar2.B();
                B.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                h8.a aVar = new h8.a(0, (TaskCompletionSource) obj2);
                try {
                    h8.i iVar = (h8.i) bVar2.n();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i7 = h8.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    B.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th3) {
                        obtain.recycle();
                        throw th3;
                    }
                } catch (RemoteException e10) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.d0(Status.h, null);
                    return;
                }
        }
    }

    public void b() {
        sg.t0 t0Var = ((sg.v0) this.b).d;
        if (t0Var != null) {
            sg.s0 s0Var = t0Var.s;
            if (s0Var != null) {
                t0Var.cancelRunnable(s0Var);
                t0Var.s = null;
            }
            sg.s0 s0Var2 = new sg.s0(t0Var, 1);
            t0Var.s = s0Var2;
            t0Var.postRunnable(s0Var2, 1L);
        }
    }

    @Override // org.telegram.ui.nm0
    public void c(ArrayList arrayList) {
        a8.r7 r7Var = (a8.r7) this.b;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList.get(0);
            if (fzVar.c != null) {
                r7Var.f = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                Point c12 = org.telegram.messenger.g0.c1();
                Bitmap K = org.telegram.messenger.gc.K(fzVar.c, null, (float) c12.x, (float) c12.y, true);
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) r7Var.f));
                ((b71) r7Var.e).b((File) r7Var.f, K, true);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // og.n
    public void c0() {
        fd0 fd0Var = ((gd0) this.b).a;
        if (fd0Var != null) {
            PhotoViewer photoViewer = ((org.telegram.ui.to0) fd0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.G2 = true;
                photoViewer.n3();
            }
        }
    }

    @Override // o2.i
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public void f(Object obj) {
        com.google.android.gms.common.api.internal.m mVar;
        androidx.activity.n nVar = ((u7.i) this.b).b;
        synchronized (nVar) {
            nVar.b = false;
            mVar = ((com.google.android.gms.common.api.internal.o) nVar.c).b;
        }
        if (mVar != null) {
            ((u7.c) nVar.d).c(mVar, 2441);
        }
    }

    @Override // o2.i
    public long g(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // fd.a
    public Object get() {
        return new v5.i(Integer.valueOf(v5.i.d).intValue(), (Context) ((fd.a) this.b).get(), "com.google.android.datatransport.events");
    }

    @Override // org.telegram.ui.Components.mm0
    public CharSequence getContentDescription() {
        pg.i iVar = (pg.i) this.b;
        float f10 = iVar.b;
        return String.valueOf(Math.round((iVar.a.getProgress() * (iVar.c - f10)) + f10));
    }

    @Override // o2.i
    public p2.j h(long j3) {
        return (p2.j) this.b;
    }

    @Override // org.telegram.ui.Components.j51
    public void invalidate() {
        ((ti.i) this.b).m.invalidate();
    }

    @Override // v4.i1
    public int k(View view) {
        return v4.n0.x(view) - ((ViewGroup.MarginLayoutParams) ((v4.o0) view.getLayoutParams())).leftMargin;
    }

    @Override // v4.d0
    public void k1(int i7, int i10) {
        ((v4.g0) this.b).n(i7, i10, null);
    }

    @Override // org.telegram.ui.Components.mm0
    public void l(boolean z9, float f10) {
        pg.i iVar = (pg.i) this.b;
        float f11 = iVar.b;
        float z10 = com.google.android.recaptcha.internal.a.z(iVar.c, f11, f10, f11);
        iVar.d = z10;
        if (z9) {
            l6 l6Var = iVar.e;
            l6Var.getClass();
            l6Var.c(null, z10);
        }
        iVar.invalidate();
    }

    @Override // u4.c
    public void l0(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i7);
    }

    @Override // org.telegram.ui.nm0
    public void m() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((a8.r7) this.b).c).startActivityForResult(intent, 11);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // o2.i
    public long o(long j3, long j10) {
        return 0L;
    }

    @Override // v4.d0
    public void o0(int i7, int i10) {
        ((v4.g0) this.b).o(i7, i10);
    }

    @Override // org.telegram.ui.Components.r51
    public void onError(u51 u51Var, Exception exc) {
        switch (this.a) {
            case 1:
                org.telegram.messenger.a8.g(exc, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.r51
    public void onRenderedFirstFrame() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.r51
    public void onStateChanged(boolean z9, int i7) {
        p40 p40Var;
        org.telegram.messenger.j20 j20Var;
        switch (this.a) {
            case 1:
                h40 h40Var = (h40) this.b;
                u51 u51Var = h40Var.H0.S;
                if (u51Var != null && u51Var.d0() && i7 == 4 && (j20Var = (p40Var = h40Var.H0).R) != null) {
                    u51 u51Var2 = p40Var.S;
                    long j3 = j20Var.a;
                    if (j3 <= 0) {
                        j3 = 0;
                    }
                    u51Var2.p0(j3);
                    break;
                }
                break;
            default:
                ki0 ki0Var = (ki0) this.b;
                if (z9 && ki0Var.n.S() >= 0) {
                    ki0Var.x = true;
                }
                ie0 ie0Var = ki0Var.f;
                pb0 pb0Var = ki0Var.y;
                ie0Var.a(z9, true);
                org.telegram.messenger.g0.r(pb0Var);
                if (z9) {
                    org.telegram.messenger.g0.i3(pb0Var, 16L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.r51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Components.mm0
    public /* synthetic */ int q0() {
        return 0;
    }

    public void s(s4.p pVar, s4.m mVar, Collection collection) {
        s4.e eVar = (s4.e) this.b;
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
        s4.u uVar = eVar.x.a;
        String d = mVar.d();
        s4.v vVar = new s4.v(uVar, d, eVar.b(uVar, d), false);
        vVar.i(mVar);
        if (eVar.d == vVar) {
            return;
        }
        eVar.h(eVar, vVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // o2.i
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // o2.i
    public long u() {
        return 0L;
    }

    @Override // og.n
    public void w() {
        fd0 fd0Var = ((gd0) this.b).a;
        if (fd0Var != null) {
            ((org.telegram.ui.to0) fd0Var).a.e0.invalidate();
        }
    }

    @Override // o2.i
    public long x(long j3) {
        return 1L;
    }

    @Override // o2.i
    public long z(long j3, long j10) {
        return 1L;
    }

    public vy(int i7) {
        this.a = i7;
        switch (i7) {
            case 12:
                this.b = new org.telegram.utils.twidget.v(1.0f, 5, 1, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.r51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
        int i7 = this.a;
    }

    public vy(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 11;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    @Override // tg.l1
    public float get() {
        tg.o0 o0Var = (tg.o0) this.b;
        int i7 = o0Var.a;
        sg.h currentBrush = o0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return sg.l0.e(i7).i;
        }
        return sg.l0.e(i7).f("-1", currentBrush.d());
    }

    public vy(TextView textView) {
        this.a = 18;
        this.b = new t1.g(textView);
    }

    private final /* synthetic */ void B(m2.a aVar) {
    }

    private final /* synthetic */ void C(m2.a aVar) {
    }

    private final /* synthetic */ void F(SurfaceTexture surfaceTexture) {
    }

    private final /* synthetic */ void G(SurfaceTexture surfaceTexture) {
    }

    private final /* synthetic */ void p(m2.a aVar) {
    }

    private final /* synthetic */ void r(m2.a aVar) {
    }

    private final /* synthetic */ void v(m2.a aVar) {
    }

    private final /* synthetic */ void y(m2.a aVar) {
    }

    private final void n() {
    }

    private final void q() {
    }

    @Override // org.telegram.ui.Components.mm0
    public void D() {
    }

    private final void j(u51 u51Var, Exception exc) {
    }

    @Override // o2.i
    public long d(long j3, long j10) {
        return j10;
    }

    private final void I(int i7, int i10, float f10, int i11) {
    }

    private final void J(int i7, int i10, float f10, int i11) {
    }
}

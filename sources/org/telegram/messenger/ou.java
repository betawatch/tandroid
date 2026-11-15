package org.telegram.messenger;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.view.GestureDetector;
import android.widget.TextView;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dr0;
import org.telegram.ui.nm0;
import org.telegram.ui.po0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class ou implements kc, l51, org.telegram.ui.Cells.l1, te.d, ce0, s51, og.n, nm0, o2.i, pm0, com.google.android.gms.common.api.internal.q, tg.l1, u2.m {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ou(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public static float[] G0(ArrayList arrayList) {
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
            arrayList2.add((PointF) i5.c.h(1, arrayList));
        }
        int i28 = i7;
        float f21 = ((PointF) arrayList2.get(i28)).x;
        if (f21 > f12) {
            for (int i29 = (int) f21; i29 >= 0; i29--) {
                arrayList2.add(i28, new PointF(i29, f12));
            }
        }
        float f22 = ((PointF) i5.c.h(1, arrayList2)).x;
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

    public static void e1(String str, TreeMap treeMap) {
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

    @Override // org.telegram.messenger.kc
    public void A(ImageReceiver imageReceiver) {
        ((pu) this.b).t0(true);
    }

    @Override // o2.i
    public long D(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // og.n
    public void D0() {
        fd0 fd0Var = ((gd0) this.b).a;
        if (fd0Var != null) {
            PhotoViewer photoViewer = ((po0) fd0Var).a;
            if (photoViewer.d2 == 1) {
                photoViewer.H2 = true;
                photoViewer.o3();
            }
        }
    }

    @Override // o2.i
    public p2.j E(long j3) {
        return (p2.j) this.b;
    }

    public void E0() {
        sg.s0 s0Var = ((sg.u0) this.b).d;
        if (s0Var != null) {
            sg.r0 r0Var = s0Var.s;
            if (r0Var != null) {
                s0Var.cancelRunnable(r0Var);
                s0Var.s = null;
            }
            sg.r0 r0Var2 = new sg.r0(s0Var, 1);
            s0Var.s = r0Var2;
            s0Var.postRunnable(r0Var2, 1L);
        }
    }

    @Override // og.n
    public void F() {
        fd0 fd0Var = ((gd0) this.b).a;
        if (fd0Var != null) {
            ((po0) fd0Var).a.f0.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1() {
        return false;
    }

    @Override // o2.i
    public long L(long j3, long j10) {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean L0(long j3) {
        return false;
    }

    @Override // og.n
    public void M(boolean z10) {
        ((gd0) this.b).c.setAspectLock(z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    public void R0(s4.p pVar, s4.m mVar, Collection collection) {
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

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public void S1(gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.y = 2;
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T1(org.telegram.ui.Cells.q1 q1Var, gj gjVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ce0
    public void W(boolean z10) {
        ((ji.p) this.b).setEditPillHidden(z10);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        s6.b bVar = (s6.b) ((s6.a) obj).n();
        q6.r rVar = (q6.r) this.b;
        Parcel j12 = bVar.j1();
        n7.a.b(j12, rVar);
        try {
            bVar.b.transact(1, j12, null, 1);
            j12.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            j12.recycle();
            throw th2;
        }
    }

    @Override // o2.i
    public long b(long j3) {
        return 0L;
    }

    @Override // te.d
    public void b0() {
        ((org.telegram.ui.Components.y8) this.b).a.invalidate();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean c() {
        return ((org.telegram.ui.Cells.z9) this.b).a();
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean c0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ dr0 c2() {
        return null;
    }

    @Override // u2.m
    public void d(int i7, int i10, int i11, long j3) {
        ((MediaCodec) this.b).queueInputBuffer(i7, 0, i10, j3, i11);
    }

    @Override // org.telegram.ui.Components.ce0
    public void d0(RectF rectF) {
        ((ji.p) this.b).l(rectF);
    }

    @Override // u2.m
    public void e(int i7, k2.d dVar, long j3, int i10) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i7, 0, dVar.i, j3, i10);
    }

    @Override // org.telegram.ui.nm0
    public void f(ArrayList arrayList) {
        a8.r7 r7Var = (a8.r7) this.b;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            dz dzVar = (dz) arrayList.get(0);
            if (dzVar.c != null) {
                r7Var.f = new File(w7.z(4), Utilities.b.nextInt() + ".jpg");
                Point c12 = g0.c1();
                Bitmap K = fc.K(dzVar.c, null, (float) c12.x, (float) c12.y, true);
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) r7Var.f));
                ((b71) r7Var.e).b((File) r7Var.f, K, true);
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f1(gj gjVar) {
        return org.telegram.ui.Cells.y0.a(gjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // o2.i
    public boolean g0() {
        return true;
    }

    public byte g1() {
        int read = ((ab.d) this.b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // org.telegram.ui.Cells.l1
    public void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.y = 0;
            q1Var.invalidate();
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override // tg.l1
    public float get() {
        tg.o0 o0Var = (tg.o0) this.b;
        int i7 = o0Var.a;
        sg.h currentBrush = o0Var.e.getCurrentBrush();
        return currentBrush == null ? sg.k0.e(i7).i : sg.k0.e(i7).f("-1", currentBrush.d());
    }

    @Override // org.telegram.ui.Components.pm0
    public CharSequence getContentDescription() {
        pg.h hVar = (pg.h) this.b;
        float f10 = hVar.b;
        return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f10)) + f10));
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    public int h1() {
        return ((g1() & 255) << 24) | ((g1() & 255) << 16) | ((g1() & 255) << 8) | (g1() & 255);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int i0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Components.l51
    public void invalidate() {
        ((org.telegram.ui.Cells.q1) ((org.telegram.ui.Cells.j1) this.b).b).invalidate();
    }

    public int j1() {
        return ((g1() & Byte.MAX_VALUE) << 21) | ((g1() & Byte.MAX_VALUE) << 14) | ((g1() & Byte.MAX_VALUE) << 7) | (g1() & Byte.MAX_VALUE);
    }

    @Override // o2.i
    public long k0() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.pm0
    public void l(boolean z10, float f10) {
        pg.h hVar = (pg.h) this.b;
        float f11 = hVar.b;
        float z11 = com.google.android.gms.internal.vision.e2.z(hVar.c, f11, f10, f11);
        hVar.d = z11;
        if (z10) {
            org.telegram.ui.Components.j6 j6Var = hVar.e;
            j6Var.getClass();
            j6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean l0() {
        return c();
    }

    public void l1() {
        ((org.telegram.ui.ActionBar.u2) this.b).p0 = false;
    }

    @Override // og.n
    public void m0(boolean z10) {
        gd0 gd0Var = (gd0) this.b;
        gd0Var.getClass();
        fd0 fd0Var = gd0Var.a;
        if (fd0Var != null) {
            ((po0) fd0Var).n(z10);
        }
    }

    public void m1(org.telegram.ui.ge geVar) {
        ((org.telegram.ui.ActionBar.u2) this.b).I0 = geVar;
    }

    public void n1(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((ab.d) this.b).skip(j3 - j10);
            if (skip <= 0) {
                throw new EOFException();
            }
            j10 += skip;
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean o0(org.telegram.ui.Components.p5 p5Var) {
        return false;
    }

    public void o1(com.google.android.gms.internal.clearcut.y0 y0Var, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list == null || (str = (String) list.get(0)) == null || str.length() == 0) {
            return;
        }
        synchronized (((rc.u) this.b).c) {
        }
        throw new rc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), y0Var);
    }

    @Override // org.telegram.ui.Components.s51
    public void onError(u51 u51Var, Exception exc) {
        switch (this.a) {
            case 8:
                a8.g(exc, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.s51
    public void onRenderedFirstFrame() {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.s51
    public void onStateChanged(boolean z10, int i7) {
        r40 r40Var;
        g20 g20Var;
        switch (this.a) {
            case 8:
                j40 j40Var = (j40) this.b;
                u51 u51Var = j40Var.I0.T;
                if (u51Var != null && u51Var.d0() && i7 == 4 && (g20Var = (r40Var = j40Var.I0).S) != null) {
                    u51 u51Var2 = r40Var.T;
                    long j3 = g20Var.a;
                    if (j3 <= 0) {
                        j3 = 0;
                    }
                    u51Var2.p0(j3);
                    break;
                }
                break;
            default:
                oi0 oi0Var = (oi0) this.b;
                if (z10 && oi0Var.n.S() >= 0) {
                    oi0Var.x = true;
                }
                ke0 ke0Var = oi0Var.f;
                wa0 wa0Var = oi0Var.y;
                ke0Var.a(z10, true);
                g0.r(wa0Var);
                if (z10) {
                    g0.i3(wa0Var, 16L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.s51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.Components.pm0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) this.b;
        org.telegram.ui.Cells.f fVar = z9Var.E;
        if (z9Var.a()) {
            z9Var.y = 2;
            q1Var.invalidate();
            g0.r(fVar);
            g0.i3(fVar, 5000L);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean q() {
        return false;
    }

    public Object q1() {
        if (q7.a.b == null) {
            q7.a.b = new ab.b0();
        }
        synchronized (q7.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // tg.l1
    public void r0(float f10) {
        tg.o0 o0Var = (tg.o0) this.b;
        sg.k0.e(o0Var.a).k("-1", f10);
        o0Var.e.setBrushSize(f10);
    }

    @Override // te.d
    public /* synthetic */ boolean s(float f10) {
        return false;
    }

    @Override // org.telegram.ui.nm0
    public void s0() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((a8.r7) this.b).c).startActivityForResult(intent, 11);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // u2.m
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // o2.i
    public long t0(long j3) {
        return 1L;
    }

    public String toString() {
        switch (this.a) {
            case 22:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // o2.i
    public long v0(long j3, long j10) {
        return 1L;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean v2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String x(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Components.ce0
    public ji.p x0() {
        return (ji.p) this.b;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x1() {
        return false;
    }

    @Override // o2.i
    public long y(long j3, long j10) {
        return 0L;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean y0(gj gjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return i7 == ((org.telegram.ui.Cells.z9) this.b).y;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ org.telegram.ui.Cells.i9 z2() {
        return null;
    }

    public ou(int i7) {
        this.a = i7;
        switch (i7) {
            case 19:
                this.b = new org.telegram.utils.twidget.v(1.0f, 5, 1, false);
                break;
        }
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
        int i7 = this.a;
    }

    public ou(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = 18;
        this.b = new GestureDetector(context, onGestureListener, null);
    }

    public ou(TextView textView) {
        this.a = 25;
        this.b = new t1.g(textView);
    }

    public ou(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = 1;
        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context, e6Var, false);
        this.b = u2Var;
        u2Var.O();
    }

    private final void K0() {
    }

    private final void P0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Components.pm0
    public void C() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1() {
    }

    @Override // u2.m
    public void Y() {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }

    @Override // u2.m
    public void flush() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s2() {
    }

    @Override // u2.m
    public void shutdown() {
    }

    @Override // u2.m
    public void start() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t() {
    }

    @Override // te.d
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x2() {
    }

    private final /* synthetic */ void M0(m2.a aVar) {
    }

    private final /* synthetic */ void Q0(m2.a aVar) {
    }

    private final /* synthetic */ void S0(m2.a aVar) {
    }

    private final /* synthetic */ void U0(m2.a aVar) {
    }

    private final /* synthetic */ void Y0(m2.a aVar) {
    }

    private final /* synthetic */ void Z0(m2.a aVar) {
    }

    private final /* synthetic */ void a1(SurfaceTexture surfaceTexture) {
    }

    private final /* synthetic */ void b1(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(dj djVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O1(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // te.d
    public /* synthetic */ void n(boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0(org.telegram.ui.Cells.q1 q1Var) {
    }

    private final void J0(u51 u51Var, Exception exc) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void a2(org.telegram.ui.Cells.q1 q1Var, l10 l10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2(String str, String str2) {
    }

    @Override // o2.i
    public long i(long j3, long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    private final void c1(int i7, int i10, float f10, int i11) {
    }

    private final void d1(int i7, int i10, float f10, int i11) {
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void w0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
    }
}

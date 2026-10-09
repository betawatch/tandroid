package com.google.firebase.messaging;

import ae.h1;
import ae.k2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e9.a1;
import e9.g0;
import e9.i0;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.Inflater;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Wallet.n5;
import u2.o1;
import y9.w0;
import y9.x0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class s implements z3.m {
    public static s f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ s(int i10, boolean z10) {
        this.a = i10;
    }

    public static synchronized s c() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f == null) {
                    f = new s(0);
                }
                sVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public static void g(long j3, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j3) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
    }

    @Override // z3.m
    public int O() {
        switch (this.a) {
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
    @Override // z3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void P(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
        int[] iArr;
        int i12;
        d2.b bVar;
        int i13;
        int i14;
        int i15;
        d2.b bVar2;
        int i16;
        int A;
        int i17;
        d2.b bVar3;
        a1 a1Var;
        Rect rect;
        int i18 = 4;
        int i19 = 0;
        int i20 = 2;
        int i21 = 1;
        switch (this.a) {
            case 2:
                int i22 = 3;
                c4.a aVar = (c4.a) this.d;
                e2.v vVar = (e2.v) this.c;
                e2.v vVar2 = (e2.v) this.b;
                vVar2.H(i10 + i11, bArr);
                vVar2.J(i10);
                if (((Inflater) this.e) == null) {
                    this.e = new Inflater();
                }
                if (e2.d0.N(vVar2, vVar, (Inflater) this.e)) {
                    vVar2.H(vVar.c, vVar.a);
                }
                aVar.d = 0;
                int[] iArr2 = aVar.b;
                e2.v vVar3 = aVar.a;
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                aVar.h = 0;
                aVar.i = 0;
                vVar3.G(0);
                aVar.c = false;
                ArrayList arrayList = new ArrayList();
                while (vVar2.a() >= i22) {
                    int i23 = vVar2.c;
                    int x10 = vVar2.x();
                    int D = vVar2.D();
                    int i24 = vVar2.b + D;
                    if (i24 > i23) {
                        vVar2.J(i23);
                        iArr = iArr2;
                        i17 = i21;
                        bVar2 = null;
                        i13 = i19;
                    } else {
                        char c10 = 128;
                        if (x10 != 128) {
                            switch (x10) {
                                case 20:
                                    if (D % 5 == i20) {
                                        vVar2.K(i20);
                                        Arrays.fill(iArr2, i19);
                                        int i25 = D / 5;
                                        int i26 = i19;
                                        while (i26 < i25) {
                                            int x11 = vVar2.x();
                                            double x12 = vVar2.x();
                                            double x13 = vVar2.x() - 128;
                                            int[] iArr3 = iArr2;
                                            double x14 = vVar2.x() - 128;
                                            iArr3[x11] = e2.d0.h((int) ((x14 * 1.772d) + x12), 0, 255) | (vVar2.x() << 24) | (e2.d0.h((int) ((1.402d * x13) + x12), 0, 255) << 16) | (e2.d0.h((int) ((x12 - (0.34414d * x14)) - (x13 * 0.71414d)), 0, 255) << 8);
                                            i26++;
                                            c10 = c10;
                                            i25 = i25;
                                            iArr2 = iArr3;
                                            i21 = 1;
                                        }
                                        iArr = iArr2;
                                        boolean z10 = i21;
                                        aVar.c = z10;
                                        i16 = z10;
                                        break;
                                    }
                                    iArr = iArr2;
                                    i16 = i21;
                                case 21:
                                    if (D >= 4) {
                                        vVar2.K(3);
                                        int i27 = D - 4;
                                        if (((128 & vVar2.x()) != 0 ? i21 : i19) != 0) {
                                            if (i27 >= 7 && (A = vVar2.A()) >= 4) {
                                                aVar.h = vVar2.D();
                                                aVar.i = vVar2.D();
                                                vVar3.G(A - 4);
                                                i27 = D - 11;
                                            }
                                        }
                                        int i28 = vVar3.b;
                                        int i29 = vVar3.c;
                                        if (i28 < i29 && i27 > 0) {
                                            int min = Math.min(i27, i29 - i28);
                                            vVar2.h(i28, min, vVar3.a);
                                            vVar3.J(i28 + min);
                                        }
                                    }
                                    iArr = iArr2;
                                    i16 = i21;
                                    break;
                                case 22:
                                    if (D >= 19) {
                                        aVar.d = vVar2.D();
                                        aVar.e = vVar2.D();
                                        vVar2.K(11);
                                        aVar.f = vVar2.D();
                                        aVar.g = vVar2.D();
                                    }
                                default:
                                    iArr = iArr2;
                                    i16 = i21;
                                    break;
                            }
                            i13 = 0;
                            bVar = null;
                            i12 = i16;
                        } else {
                            iArr = iArr2;
                            i12 = i21;
                            if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i14 = vVar3.c) == 0 || vVar3.b != i14 || !aVar.c) {
                                bVar = null;
                            } else {
                                vVar3.J(0);
                                int i30 = aVar.h * aVar.i;
                                int[] iArr4 = new int[i30];
                                int i31 = 0;
                                while (i31 < i30) {
                                    int x15 = vVar3.x();
                                    if (x15 != 0) {
                                        i15 = i31 + 1;
                                        iArr4[i31] = iArr[x15];
                                    } else {
                                        int x16 = vVar3.x();
                                        if (x16 != 0) {
                                            i15 = ((x16 & 64) == 0 ? x16 & 63 : ((x16 & 63) << 8) | vVar3.x()) + i31;
                                            Arrays.fill(iArr4, i31, i15, (x16 & 128) == 0 ? iArr[0] : iArr[vVar3.x()]);
                                        }
                                    }
                                    i31 = i15;
                                }
                                Bitmap createBitmap = Bitmap.createBitmap(iArr4, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                                float f7 = aVar.f;
                                float f10 = aVar.d;
                                float f11 = f7 / f10;
                                float f12 = aVar.g;
                                float f13 = aVar.e;
                                bVar = new d2.b(null, null, null, createBitmap, f12 / f13, 0, 0, f11, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f10, aVar.i / f13, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                            }
                            i13 = 0;
                            aVar.d = 0;
                            aVar.e = 0;
                            aVar.f = 0;
                            aVar.g = 0;
                            aVar.h = 0;
                            aVar.i = 0;
                            vVar3.G(0);
                            aVar.c = false;
                        }
                        vVar2.J(i24);
                        bVar2 = bVar;
                        i17 = i12;
                    }
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                    i19 = i13;
                    iArr2 = iArr;
                    i20 = 2;
                    i22 = 3;
                    i21 = i17;
                }
                hVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
                break;
            default:
                e2.v vVar4 = (e2.v) this.b;
                vVar4.H(i10 + i11, bArr);
                vVar4.J(i10);
                e2.v vVar5 = (e2.v) this.c;
                h4.a aVar2 = (h4.a) this.d;
                if (((Inflater) this.e) == null) {
                    this.e = new Inflater();
                }
                if (e2.d0.N(vVar4, vVar5, (Inflater) this.e)) {
                    vVar4.H(vVar5.c, vVar5.a);
                }
                aVar2.c = false;
                aVar2.g = null;
                aVar2.h = -1;
                aVar2.i = -1;
                int a2 = vVar4.a();
                if (a2 >= 2 && vVar4.D() == a2) {
                    int[] iArr5 = aVar2.d;
                    if (iArr5 != null && aVar2.b) {
                        vVar4.K(vVar4.D() - 2);
                        int D2 = vVar4.D();
                        int[] iArr6 = aVar2.a;
                        while (vVar4.b < D2 && vVar4.a() > 0) {
                            switch (vVar4.x()) {
                                case 3:
                                    if (vVar4.a() < 2) {
                                        break;
                                    } else {
                                        int x17 = vVar4.x();
                                        int x18 = vVar4.x();
                                        iArr6[3] = h4.a.a(x17 >> 4, iArr5);
                                        iArr6[2] = h4.a.a(x17 & 15, iArr5);
                                        iArr6[1] = h4.a.a(x18 >> 4, iArr5);
                                        iArr6[0] = h4.a.a(x18 & 15, iArr5);
                                        aVar2.c = true;
                                        i18 = 4;
                                    }
                                case 4:
                                    if (vVar4.a() >= 2 && aVar2.c) {
                                        int x19 = vVar4.x();
                                        int x20 = vVar4.x();
                                        iArr6[3] = h4.a.c(iArr6[3], x19 >> 4);
                                        iArr6[2] = h4.a.c(iArr6[2], x19 & 15);
                                        iArr6[1] = h4.a.c(iArr6[1], x20 >> 4);
                                        iArr6[0] = h4.a.c(iArr6[0], x20 & 15);
                                        i18 = 4;
                                    }
                                    break;
                                case 5:
                                    if (vVar4.a() < 6) {
                                        break;
                                    } else {
                                        int x21 = vVar4.x();
                                        int x22 = vVar4.x();
                                        int i32 = (x21 << i18) | (x22 >> 4);
                                        int x23 = ((x22 & 15) << 8) | vVar4.x();
                                        int x24 = vVar4.x();
                                        int x25 = vVar4.x();
                                        aVar2.g = new Rect(i32, (x24 << 4) | (x25 >> 4), x23 + 1, (((x25 & 15) << 8) | vVar4.x()) + 1);
                                        i18 = 4;
                                    }
                                case 6:
                                    if (vVar4.a() < i18) {
                                        break;
                                    } else {
                                        aVar2.h = vVar4.D();
                                        aVar2.i = vVar4.D();
                                    }
                            }
                        }
                    }
                    if (aVar2.d != null && aVar2.b && aVar2.c && (rect = aVar2.g) != null && aVar2.h != -1 && aVar2.i != -1 && rect.width() >= 2 && aVar2.g.height() >= 2) {
                        Rect rect2 = aVar2.g;
                        int[] iArr7 = new int[rect2.height() * rect2.width()];
                        a4.g gVar = new a4.g();
                        vVar4.J(aVar2.h);
                        gVar.p(vVar4);
                        aVar2.b(gVar, true, rect2, iArr7);
                        vVar4.J(aVar2.i);
                        gVar.p(vVar4);
                        aVar2.b(gVar, false, rect2, iArr7);
                        bVar3 = new d2.b(null, null, null, Bitmap.createBitmap(iArr7, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar2.f, 0, 0, rect2.left / aVar2.e, 0, TLObject.FLAG_31, -3.4028235E38f, rect2.width() / aVar2.e, rect2.height() / aVar2.f, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                        if (bVar3 == null) {
                            a1Var = i0.z(bVar3);
                        } else {
                            g0 g0Var = i0.b;
                            a1Var = a1.e;
                        }
                        hVar.accept(new z3.a(-9223372036854775807L, 5000000L, a1Var));
                        break;
                    }
                }
                bVar3 = null;
                if (bVar3 == null) {
                }
                hVar.accept(new z3.a(-9223372036854775807L, 5000000L, a1Var));
                break;
        }
    }

    public ArrayList a(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        g(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        g(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public w0 b() {
        String str = ((x0) this.c) == null ? " rolloutVariant" : "";
        if (((String) this.b) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.d) == null) {
            str = sc.v.v(str, " parameterValue");
        }
        if (((Long) this.e) == null) {
            str = sc.v.v(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.c, (String) this.b, (String) this.d, ((Long) this.e).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean d(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean e(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0269, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020d  */
    /* JADX WARN: Type inference failed for: r2v19, types: [ce.h, fe.d, fe.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(k1.k kVar) {
        ce.b bVar;
        da.a aVar;
        int i10;
        int i11;
        boolean z10;
        k1.k kVar2;
        ce.h hVar;
        da.a aVar2;
        long j3;
        boolean z11;
        int i12;
        int i13;
        Object obj;
        Object a2;
        long j10;
        ce.h hVar2;
        k1.k kVar3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        ce.c cVar;
        k1.k kVar4 = kVar;
        ce.b bVar2 = (ce.b) this.d;
        bVar2.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = ce.b.b;
        boolean z12 = false;
        boolean z13 = true;
        long j11 = 1152921504606846975L;
        boolean z14 = bVar2.i(atomicLongFieldUpdater2.get(bVar2), false) ? false : !bVar2.a(r2 & 1152921504606846975L);
        Object obj2 = ce.g.a;
        if (z14) {
            obj = obj2;
        } else {
            da.a aVar3 = ce.d.j;
            ce.h hVar3 = (ce.h) ce.b.f.get(bVar2);
            while (true) {
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bVar2);
                long j12 = andIncrement & j11;
                boolean i14 = bVar2.i(andIncrement, z12);
                int i15 = ce.d.b;
                long j13 = i15;
                long j14 = j11;
                long j15 = j12 / j13;
                int i16 = (int) (j12 % j13);
                if (hVar3.c != j15) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = ce.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ce.b.f;
                    ce.h hVar4 = ce.d.a;
                    ce.c cVar2 = ce.c.a;
                    while (true) {
                        a2 = fe.a.a(hVar3, j15, cVar2);
                        if (!fe.a.d(a2)) {
                            fe.t b10 = fe.a.b(a2);
                            while (true) {
                                fe.t tVar = (fe.t) atomicReferenceFieldUpdater.get(bVar2);
                                z10 = z13;
                                j10 = j15;
                                aVar = aVar3;
                                cVar = cVar2;
                                if (tVar.c >= b10.c) {
                                    break;
                                }
                                if (!b10.j()) {
                                    break;
                                }
                                while (!atomicReferenceFieldUpdater.compareAndSet(bVar2, tVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(bVar2) != tVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
                                        aVar3 = aVar;
                                        z13 = z10;
                                        j15 = j10;
                                        cVar2 = cVar;
                                    }
                                }
                                if (tVar.f()) {
                                    tVar.e();
                                }
                            }
                        } else {
                            z10 = z13;
                            j10 = j15;
                            aVar = aVar3;
                            break;
                        }
                        aVar3 = aVar;
                        z13 = z10;
                        j15 = j10;
                        cVar2 = cVar;
                    }
                    if (fe.a.d(a2)) {
                        bVar2.c();
                        if (hVar3.c * ce.d.b < atomicLongFieldUpdater3.get(bVar2)) {
                            hVar3.b();
                            ce.h hVar5 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar5;
                            i10 = i15;
                            i11 = i16;
                            kVar3 = null;
                            kVar2 = null;
                            if (kVar3 == null) {
                                hVar = kVar3;
                            } else {
                                if (i14) {
                                    obj = new ce.e(bVar.f());
                                    break;
                                }
                                ce.b bVar3 = bVar;
                                hVar3 = hVar2;
                                bVar2 = bVar3;
                                aVar3 = aVar;
                                j11 = j14;
                                z13 = z10;
                                z12 = false;
                            }
                        } else {
                            ce.h hVar6 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar6;
                            i10 = i15;
                            i11 = i16;
                            kVar2 = null;
                            kVar3 = kVar2;
                            if (kVar3 == null) {
                            }
                        }
                    } else {
                        ?? r22 = (ce.h) fe.a.b(a2);
                        long j16 = r22.c;
                        if (j16 > j10) {
                            long j17 = ce.d.b * j16;
                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = ce.b.b;
                            int i17 = i15;
                            int i18 = i16;
                            while (true) {
                                long j18 = atomicLongFieldUpdater4.get(bVar2);
                                long j19 = j18 & j14;
                                if (j19 >= j17) {
                                    ce.h hVar7 = hVar3;
                                    bVar = bVar2;
                                    hVar2 = hVar7;
                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                    i11 = i18;
                                    kVar2 = null;
                                    i10 = i17;
                                    break;
                                }
                                ce.b bVar4 = bVar2;
                                long j20 = j17;
                                AtomicLongFieldUpdater atomicLongFieldUpdater5 = atomicLongFieldUpdater4;
                                i11 = i18;
                                kVar2 = null;
                                i10 = i17;
                                hVar2 = hVar3;
                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                bVar = bVar4;
                                if (ce.b.b.compareAndSet(bVar, j18, (((int) (j18 >> 60)) << 60) + j19)) {
                                    break;
                                }
                                hVar3 = hVar2;
                                bVar2 = bVar;
                                atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                i17 = i10;
                                atomicLongFieldUpdater4 = atomicLongFieldUpdater5;
                                i18 = i11;
                                j17 = j20;
                            }
                            if (j16 * ce.d.b < atomicLongFieldUpdater.get(bVar)) {
                                r22.b();
                            }
                            kVar3 = kVar2;
                            if (kVar3 == null) {
                            }
                        } else {
                            ce.h hVar8 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar8;
                            i10 = i15;
                            i11 = i16;
                            kVar2 = null;
                            kVar3 = r22;
                            if (kVar3 == null) {
                            }
                        }
                    }
                } else {
                    ce.h hVar9 = hVar3;
                    bVar = bVar2;
                    aVar = aVar3;
                    i10 = i15;
                    i11 = i16;
                    z10 = z13;
                    kVar2 = null;
                    hVar = hVar9;
                }
                hVar.n(i11, kVar4);
                if (i14) {
                    bVar2 = bVar;
                    aVar2 = aVar;
                    j3 = j12;
                    z11 = i14;
                    i12 = 2;
                    i13 = bVar2.p(hVar, i11, kVar4, j3, aVar2, z11);
                } else {
                    bVar2 = bVar;
                    aVar2 = aVar;
                    j3 = j12;
                    z11 = i14;
                    k1.k kVar5 = kVar2;
                    i12 = 2;
                    Object l4 = hVar.l(i11);
                    if (l4 == null) {
                        if (bVar2.a(j3)) {
                            if (hVar.k(i11, kVar5, ce.d.d)) {
                                z13 = z10;
                                i13 = z13;
                                Object obj3 = hd.i.a;
                                if (i13 == 0) {
                                    hVar.b();
                                    break;
                                }
                                if (i13 == z13) {
                                    break;
                                }
                                if (i13 != i12) {
                                    if (i13 == 3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    if (i13 != 4) {
                                        if (i13 == 5) {
                                            hVar.b();
                                        }
                                        kVar4 = kVar;
                                        hVar3 = hVar;
                                        aVar3 = aVar2;
                                        j11 = j14;
                                        z12 = false;
                                    } else {
                                        if (j3 < ce.b.c.get(bVar2)) {
                                            hVar.b();
                                        }
                                        obj = new ce.e(bVar2.f());
                                    }
                                } else if (z11) {
                                    hVar.i();
                                    obj = new ce.e(bVar2.f());
                                } else {
                                    k2 k2Var = aVar2 instanceof k2 ? (k2) aVar2 : null;
                                    if (k2Var != null) {
                                        k2Var.b(hVar, i11 + i10);
                                    }
                                    hVar.i();
                                    obj = obj2;
                                }
                            }
                        } else if (aVar2 == null) {
                            i13 = 3;
                        } else if (hVar.k(i11, kVar5, aVar2)) {
                            i13 = 2;
                        }
                        z13 = z10;
                        i13 = bVar2.p(hVar, i11, kVar4, j3, aVar2, z11);
                        Object obj32 = hd.i.a;
                        if (i13 == 0) {
                        }
                    } else {
                        if (l4 instanceof k2) {
                            hVar.n(i11, kVar5);
                            if (bVar2.m(l4, kVar4)) {
                                hVar.o(i11, ce.d.i);
                                z13 = z10;
                                i13 = 0;
                            } else {
                                da.a aVar4 = ce.d.k;
                                if (hVar.f.getAndSet((i11 * 2) + 1, aVar4) != aVar4) {
                                    z13 = z10;
                                    hVar.m(i11, z13);
                                } else {
                                    z13 = z10;
                                }
                                i13 = 5;
                            }
                            Object obj322 = hd.i.a;
                            if (i13 == 0) {
                            }
                        }
                        z13 = z10;
                        i13 = bVar2.p(hVar, i11, kVar4, j3, aVar2, z11);
                        Object obj3222 = hd.i.a;
                        if (i13 == 0) {
                        }
                    }
                }
                z13 = z10;
                Object obj32222 = hd.i.a;
                if (i13 == 0) {
                }
            }
        }
        i12 = 2;
        if (obj instanceof ce.e) {
            Throwable th2 = ((ce.e) obj).a;
            if (th2 != null) {
                throw th2;
            }
            throw new b2.v("Channel was closed normally");
        }
        if (obj instanceof ce.f) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.e).getAndIncrement() == 0) {
            ae.g0.q((ae.d0) this.b, new bb.i(this, null, i12));
        }
    }

    public m2.b j(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.d;
        ArrayList a2 = a(list);
        if (a2.size() < 2) {
            return (m2.b) e9.q.k(a2, null);
        }
        Collections.sort(a2, new a4.d(20));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) a2.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= a2.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) a2.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (m2.b) a2.get(0);
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = a2.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < subList.size(); i14++) {
            i13 += ((m2.b) subList.get(i14)).d;
        }
        int nextInt = ((Random) this.e).nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= subList.size()) {
                bVar = (m2.b) e9.q.l(subList);
                break;
            }
            bVar = (m2.b) subList.get(i10);
            i15 += bVar.d;
            if (nextInt < i15) {
                break;
            }
            i10++;
        }
        hashMap.put(arrayList, bVar);
        return bVar;
    }

    public Task k(Callable callable) {
        Task continueWith;
        synchronized (this.d) {
            continueWith = ((Task) this.c).continueWith((Executor) this.b, new m2.t(callable, 21));
            this.c = continueWith.continueWith((Executor) this.b, new ob.a(25));
        }
        return continueWith;
    }

    public Task l(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.c).continueWithTask((Executor) this.b, new m2.t(callable, 21));
            this.c = continueWithTask.continueWith((Executor) this.b, new ob.a(25));
        }
        return continueWithTask;
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
        int i10 = this.a;
    }

    @Override // z3.m
    public /* synthetic */ z3.d s(int i10, int i11, byte[] bArr) {
        switch (this.a) {
        }
        return sc.v.a(this, bArr, i11);
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return ((m2.t) this.e).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public s(ae.d0 d0Var, je.g gVar, k1.m mVar) {
        this.a = 5;
        this.b = d0Var;
        this.c = mVar;
        ce.a[] aVarArr = ce.a.a;
        this.d = new ce.b(ConnectionsManager.DEFAULT_DATACENTER_ID);
        this.e = new AtomicInteger(0);
        h1 h1Var = (h1) d0Var.c().get(ae.c0.b);
        if (h1Var == null) {
            return;
        }
        h1Var.invokeOnCompletion(new be.d(1, gVar, this));
    }

    public s(ExecutorService executorService) {
        this.a = 12;
        this.c = Tasks.forResult(null);
        this.d = new Object();
        this.e = new ThreadLocal();
        this.b = executorService;
        executorService.execute(new n5(this, 10));
    }

    public s(List list) {
        int i10;
        this.a = 4;
        this.b = new e2.v();
        this.c = new e2.v();
        h4.a aVar = new h4.a();
        this.d = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = e2.d0.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                aVar.d = new int[split.length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int[] iArr = aVar.d;
                    try {
                        i10 = Integer.parseInt(split[i11].trim(), 16);
                    } catch (RuntimeException unused) {
                        i10 = 0;
                    }
                    iArr[i11] = i10;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length == 2) {
                    try {
                        aVar.e = Integer.parseInt(split2[0]);
                        aVar.f = Integer.parseInt(split2[1]);
                        aVar.b = true;
                    } catch (RuntimeException e7) {
                        e2.a.o("VobsubParser", "Parsing IDX failed", e7);
                    }
                }
            }
        }
    }

    private final /* synthetic */ void h() {
    }

    private final /* synthetic */ void i() {
    }

    public s(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.a = 1;
        this.e = typeface;
        this.b = bVar;
        this.d = new androidx.emoji2.text.r(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i14 = a2 + bVar.a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.c = new char[i10 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i15 = a10 + bVar.a;
            i11 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(this, i16);
            p1.a b10 = nVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.a) : 0, (char[]) this.c, i16 * 2);
            p1.a b11 = nVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                androidx.emoji2.text.r rVar = (androidx.emoji2.text.r) this.d;
                p1.a b12 = nVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.a;
                    i13 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                rVar.a(nVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public s(m2.t tVar, Object obj, Object obj2, Object[] objArr) {
        this.a = 10;
        this.e = tVar;
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
    }

    public s(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.b = new e2.v();
                this.c = new e2.v();
                this.d = new c4.a();
                break;
            case 6:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public s(o1 o1Var, boolean[] zArr) {
        this.a = 11;
        this.b = o1Var;
        this.c = zArr;
        int i10 = o1Var.a;
        this.d = new boolean[i10];
        this.e = new boolean[i10];
    }
}

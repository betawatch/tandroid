package com.google.firebase.messaging;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.Inflater;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.y5;
import u2.o1;
import w7.x5;
import y9.w0;
import y9.x0;
import zd.f1;
import zd.i2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    public static synchronized s b() {
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

    @Override // z3.m
    public int U() {
        switch (this.a) {
        }
        return 2;
    }

    public w0 a() {
        String str = ((x0) this.c) == null ? " rolloutVariant" : "";
        if (((String) this.b) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.d) == null) {
            str = p6.t(str, " parameterValue");
        }
        if (((Long) this.e) == null) {
            str = p6.t(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.c, (String) this.b, (String) this.d, ((Long) this.e).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean c(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean d(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x026a, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v8, types: [be.h, ee.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(k1.k kVar) {
        be.b bVar;
        d9.f fVar;
        int i10;
        int i11;
        k1.k kVar2;
        be.h hVar;
        long j3;
        boolean z10;
        d9.f fVar2;
        int i12;
        int i13;
        int i14;
        Object obj;
        Object a2;
        int i15;
        be.h hVar2;
        k1.k kVar3;
        ee.d dVar;
        long j10;
        be.c cVar;
        k1.k kVar4 = kVar;
        be.b bVar2 = (be.b) this.d;
        bVar2.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = be.b.b;
        boolean z11 = false;
        long j11 = 1152921504606846975L;
        boolean z12 = bVar2.i(atomicLongFieldUpdater.get(bVar2), false) ? false : !bVar2.a(r2 & 1152921504606846975L);
        Object obj2 = be.g.a;
        if (!z12) {
            d9.f fVar3 = be.d.j;
            be.h hVar3 = (be.h) be.b.f.get(bVar2);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar2);
                long j12 = andIncrement & j11;
                boolean i16 = bVar2.i(andIncrement, z11);
                int i17 = be.d.b;
                long j13 = i17;
                long j14 = j11;
                long j15 = j12 / j13;
                int i18 = (int) (j12 % j13);
                if (hVar3.c != j15) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = be.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.b.f;
                    be.h hVar4 = be.d.a;
                    be.c cVar2 = be.c.a;
                    while (true) {
                        a2 = ee.a.a(hVar3, j15, cVar2);
                        if (!ee.a.d(a2)) {
                            ee.t b10 = ee.a.b(a2);
                            while (true) {
                                ee.t tVar = (ee.t) atomicReferenceFieldUpdater.get(bVar2);
                                i15 = i18;
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
                                        i18 = i15;
                                        cVar2 = cVar;
                                    }
                                }
                                if (tVar.f()) {
                                    tVar.e();
                                }
                            }
                        } else {
                            i15 = i18;
                            break;
                        }
                        i18 = i15;
                        cVar2 = cVar;
                    }
                    if (ee.a.d(a2)) {
                        bVar2.c();
                        if (hVar3.c * be.d.b < atomicLongFieldUpdater2.get(bVar2)) {
                            hVar3.b();
                            be.h hVar5 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar5;
                            fVar = fVar3;
                            i10 = i17;
                            i11 = i15;
                            kVar3 = null;
                            kVar2 = null;
                            if (kVar3 == null) {
                                hVar = kVar3;
                            } else {
                                if (i16) {
                                    obj = new be.e(bVar.f());
                                    break;
                                }
                                be.b bVar3 = bVar;
                                hVar3 = hVar2;
                                bVar2 = bVar3;
                                j11 = j14;
                                fVar3 = fVar;
                                z11 = false;
                            }
                        } else {
                            be.h hVar6 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar6;
                            fVar = fVar3;
                            i10 = i17;
                            i11 = i15;
                            kVar2 = null;
                            kVar3 = kVar2;
                            if (kVar3 == null) {
                            }
                        }
                    } else {
                        ?? r32 = (be.h) ee.a.b(a2);
                        long j16 = r32.c;
                        if (j16 > j15) {
                            long j17 = be.d.b * j16;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = be.b.b;
                            int i19 = i17;
                            long j18 = j16;
                            ee.d dVar2 = r32;
                            while (true) {
                                long j19 = atomicLongFieldUpdater3.get(bVar2);
                                long j20 = j19 & j14;
                                if (j20 >= j17) {
                                    be.h hVar7 = hVar3;
                                    bVar = bVar2;
                                    hVar2 = hVar7;
                                    fVar = fVar3;
                                    dVar = dVar2;
                                    i10 = i19;
                                    j10 = j18;
                                    i11 = i15;
                                    kVar2 = null;
                                    break;
                                }
                                be.b bVar4 = bVar2;
                                fVar = fVar3;
                                long j21 = (((int) (j19 >> 60)) << 60) + j20;
                                i10 = i19;
                                j10 = j18;
                                kVar2 = null;
                                dVar = dVar2;
                                hVar2 = hVar3;
                                i11 = i15;
                                bVar = bVar4;
                                if (be.b.b.compareAndSet(bVar, j19, j21)) {
                                    break;
                                }
                                hVar3 = hVar2;
                                bVar2 = bVar;
                                i15 = i11;
                                i19 = i10;
                                j18 = j10;
                                dVar2 = dVar;
                                fVar3 = fVar;
                            }
                            if (j10 * be.d.b < atomicLongFieldUpdater2.get(bVar)) {
                                dVar.b();
                            }
                            kVar3 = kVar2;
                            if (kVar3 == null) {
                            }
                        } else {
                            be.h hVar8 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar8;
                            fVar = fVar3;
                            i10 = i17;
                            i11 = i15;
                            kVar2 = null;
                            kVar3 = r32;
                            if (kVar3 == null) {
                            }
                        }
                    }
                } else {
                    be.h hVar9 = hVar3;
                    bVar = bVar2;
                    fVar = fVar3;
                    i10 = i17;
                    i11 = i18;
                    kVar2 = null;
                    hVar = hVar9;
                }
                hVar.n(i11, kVar4);
                if (i16) {
                    bVar2 = bVar;
                    j3 = j12;
                    z10 = i16;
                    fVar2 = fVar;
                    i12 = 2;
                    i14 = bVar2.p(hVar, i11, kVar4, j3, fVar2, z10);
                    i13 = 1;
                } else {
                    bVar2 = bVar;
                    j3 = j12;
                    z10 = i16;
                    k1.k kVar5 = kVar2;
                    fVar2 = fVar;
                    i12 = 2;
                    Object l4 = hVar.l(i11);
                    if (l4 != null) {
                        if (l4 instanceof i2) {
                            hVar.n(i11, kVar5);
                            if (bVar2.m(l4, kVar4)) {
                                hVar.o(i11, be.d.i);
                                i13 = 1;
                                i14 = 0;
                            } else {
                                d9.f fVar4 = be.d.k;
                                if (hVar.f.getAndSet((i11 * 2) + 1, fVar4) != fVar4) {
                                    i13 = 1;
                                    hVar.m(i11, true);
                                } else {
                                    i13 = 1;
                                }
                                i14 = 5;
                            }
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i11, kVar4, j3, fVar2, z10);
                    } else if (bVar2.a(j3)) {
                        if (hVar.k(i11, kVar5, be.d.d)) {
                            i13 = 1;
                            i14 = 1;
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i11, kVar4, j3, fVar2, z10);
                    } else if (fVar2 == null) {
                        i13 = 1;
                        i14 = 3;
                    } else {
                        if (hVar.k(i11, kVar5, fVar2)) {
                            i13 = 1;
                            i14 = 2;
                        }
                        i13 = 1;
                        i14 = bVar2.p(hVar, i11, kVar4, j3, fVar2, z10);
                    }
                }
                Object obj3 = gd.i.a;
                if (i14 == 0) {
                    hVar.b();
                    break;
                }
                if (i14 == i13) {
                    break;
                }
                if (i14 != i12) {
                    if (i14 == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (i14 != 4) {
                        if (i14 == 5) {
                            hVar.b();
                        }
                        kVar4 = kVar;
                        hVar3 = hVar;
                        fVar3 = fVar2;
                        j11 = j14;
                        z11 = false;
                    } else {
                        if (j3 < be.b.c.get(bVar2)) {
                            hVar.b();
                        }
                        obj = new be.e(bVar2.f());
                    }
                } else if (z10) {
                    hVar.i();
                    obj = new be.e(bVar2.f());
                } else {
                    i2 i2Var = fVar2 instanceof i2 ? (i2) fVar2 : null;
                    if (i2Var != null) {
                        i2Var.a(hVar, i11 + i10);
                    }
                    hVar.i();
                    obj = obj2;
                }
            }
        } else {
            obj = obj2;
        }
        i12 = 2;
        if (obj instanceof be.e) {
            Throwable th2 = ((be.e) obj).a;
            if (th2 != null) {
                throw th2;
            }
            throw new b2.v("Channel was closed normally");
        }
        if (obj instanceof be.f) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.e).getAndIncrement() == 0) {
            zd.e0.q((zd.c0) this.b, new bb.j(this, null, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fd  */
    @Override // z3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e0(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
        int[] iArr;
        d2.b bVar;
        int i12;
        int i13;
        d2.b bVar2;
        d2.b bVar3;
        a1 a1Var;
        Rect rect;
        int i14 = 4;
        int i15 = 0;
        int i16 = 2;
        switch (this.a) {
            case 2:
                c4.a aVar = (c4.a) this.d;
                e2.v vVar = (e2.v) this.c;
                e2.v vVar2 = (e2.v) this.b;
                vVar2.H(i10 + i11, bArr);
                vVar2.J(i10);
                if (((Inflater) this.e) == null) {
                    this.e = new Inflater();
                }
                if (e2.d0.O(vVar2, vVar, (Inflater) this.e)) {
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
                while (vVar2.a() >= 3) {
                    int i17 = vVar2.c;
                    int x10 = vVar2.x();
                    int D = vVar2.D();
                    int i18 = vVar2.b + D;
                    if (i18 > i17) {
                        vVar2.J(i17);
                        iArr = iArr2;
                        bVar2 = null;
                    } else {
                        if (x10 != 128) {
                            switch (x10) {
                                case 20:
                                    if (D % 5 == i16) {
                                        vVar2.K(i16);
                                        Arrays.fill(iArr2, i15);
                                        int i19 = D / 5;
                                        int i20 = 0;
                                        while (i20 < i19) {
                                            int x11 = vVar2.x();
                                            double x12 = vVar2.x();
                                            double x13 = vVar2.x() - 128;
                                            int[] iArr3 = iArr2;
                                            double x14 = vVar2.x() - 128;
                                            iArr3[x11] = e2.d0.h((int) ((x14 * 1.772d) + x12), 0, 255) | (vVar2.x() << 24) | (e2.d0.h((int) ((1.402d * x13) + x12), 0, 255) << 16) | (e2.d0.h((int) ((x12 - (0.34414d * x14)) - (x13 * 0.71414d)), 0, 255) << 8);
                                            i20++;
                                            i19 = i19;
                                            iArr2 = iArr3;
                                        }
                                        iArr = iArr2;
                                        aVar.c = true;
                                        break;
                                    }
                                    iArr = iArr2;
                                    break;
                                case 21:
                                    if (D >= 4) {
                                        vVar2.K(3);
                                        int i21 = D - 4;
                                        if ((128 & vVar2.x()) != 0) {
                                            if (i21 >= 7) {
                                                int A = vVar2.A();
                                                if (A >= 4) {
                                                    aVar.h = vVar2.D();
                                                    aVar.i = vVar2.D();
                                                    vVar3.G(A - 4);
                                                    i21 = D - 11;
                                                }
                                                iArr = iArr2;
                                                break;
                                            }
                                        }
                                        int i22 = vVar3.b;
                                        int i23 = vVar3.c;
                                        if (i22 < i23 && i21 > 0) {
                                            int min = Math.min(i21, i23 - i22);
                                            vVar2.h(i22, min, vVar3.a);
                                            vVar3.J(i22 + min);
                                        }
                                        iArr = iArr2;
                                    }
                                    iArr = iArr2;
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
                                    break;
                            }
                            bVar = null;
                        } else {
                            iArr = iArr2;
                            if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i12 = vVar3.c) == 0 || vVar3.b != i12 || !aVar.c) {
                                bVar = null;
                            } else {
                                vVar3.J(0);
                                int i24 = aVar.h * aVar.i;
                                int[] iArr4 = new int[i24];
                                int i25 = 0;
                                while (i25 < i24) {
                                    int x15 = vVar3.x();
                                    if (x15 != 0) {
                                        i13 = i25 + 1;
                                        iArr4[i25] = iArr[x15];
                                    } else {
                                        int x16 = vVar3.x();
                                        if (x16 != 0) {
                                            i13 = ((x16 & 64) == 0 ? x16 & 63 : ((x16 & 63) << 8) | vVar3.x()) + i25;
                                            Arrays.fill(iArr4, i25, i13, (x16 & 128) == 0 ? iArr[0] : iArr[vVar3.x()]);
                                        }
                                    }
                                    i25 = i13;
                                }
                                Bitmap createBitmap = Bitmap.createBitmap(iArr4, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                                float f7 = aVar.f;
                                float f10 = aVar.d;
                                float f11 = f7 / f10;
                                float f12 = aVar.g;
                                float f13 = aVar.e;
                                bVar = new d2.b(null, null, null, createBitmap, f12 / f13, 0, 0, f11, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f10, aVar.i / f13, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                            }
                            aVar.d = 0;
                            aVar.e = 0;
                            aVar.f = 0;
                            aVar.g = 0;
                            aVar.h = 0;
                            aVar.i = 0;
                            vVar3.G(0);
                            aVar.c = false;
                        }
                        vVar2.J(i18);
                        bVar2 = bVar;
                    }
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                    iArr2 = iArr;
                    i15 = 0;
                    i16 = 2;
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
                if (e2.d0.O(vVar4, vVar5, (Inflater) this.e)) {
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
                                        i14 = 4;
                                    }
                                case 4:
                                    if (vVar4.a() >= 2 && aVar2.c) {
                                        int x19 = vVar4.x();
                                        int x20 = vVar4.x();
                                        iArr6[3] = h4.a.c(iArr6[3], x19 >> 4);
                                        iArr6[2] = h4.a.c(iArr6[2], x19 & 15);
                                        iArr6[1] = h4.a.c(iArr6[1], x20 >> 4);
                                        iArr6[0] = h4.a.c(iArr6[0], x20 & 15);
                                        i14 = 4;
                                    }
                                    break;
                                case 5:
                                    if (vVar4.a() < 6) {
                                        break;
                                    } else {
                                        int x21 = vVar4.x();
                                        int x22 = vVar4.x();
                                        int i26 = (x21 << i14) | (x22 >> 4);
                                        int x23 = ((x22 & 15) << 8) | vVar4.x();
                                        int x24 = vVar4.x();
                                        int x25 = vVar4.x();
                                        aVar2.g = new Rect(i26, (x24 << 4) | (x25 >> 4), x23 + 1, (((x25 & 15) << 8) | vVar4.x()) + 1);
                                        i14 = 4;
                                    }
                                case 6:
                                    if (vVar4.a() < i14) {
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
                        a4.h hVar2 = new a4.h();
                        vVar4.J(aVar2.h);
                        hVar2.p(vVar4);
                        aVar2.b(hVar2, true, rect2, iArr7);
                        vVar4.J(aVar2.i);
                        hVar2.p(vVar4);
                        aVar2.b(hVar2, false, rect2, iArr7);
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

    public Task h(Callable callable) {
        Task continueWith;
        synchronized (this.d) {
            continueWith = ((Task) this.c).continueWith((Executor) this.b, new v8.s(callable));
            this.c = continueWith.continueWith((Executor) this.b, new t7.u(24));
        }
        return continueWith;
    }

    public Task i(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.c).continueWithTask((Executor) this.b, new v8.s(callable));
            this.c = continueWithTask.continueWith((Executor) this.b, new t7.u(24));
        }
        return continueWithTask;
    }

    @Override // z3.m
    public /* synthetic */ z3.d p(int i10, int i11, byte[] bArr) {
        switch (this.a) {
        }
        return w.f.a(this, bArr, i11);
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
        int i10 = this.a;
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return ((mg.n) this.e).toString();
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

    public s(zd.c0 c0Var, ie.g gVar, k1.m mVar) {
        this.a = 5;
        this.b = c0Var;
        this.c = mVar;
        be.a[] aVarArr = be.a.a;
        this.d = new be.b(ConnectionsManager.DEFAULT_DATACENTER_ID);
        this.e = new AtomicInteger(0);
        f1 f1Var = (f1) c0Var.c().get(zd.b0.b);
        if (f1Var == null) {
            return;
        }
        f1Var.invokeOnCompletion(new ae.d(1, gVar, this));
    }

    public s(ExecutorService executorService) {
        this.a = 12;
        this.c = Tasks.forResult(null);
        this.d = new Object();
        this.e = new ThreadLocal();
        this.b = executorService;
        executorService.execute(new rg.b0(this, 6));
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

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    public s(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.a = 1;
        this.e = typeface;
        this.b = bVar;
        this.d = new androidx.emoji2.text.s(1024);
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
            androidx.emoji2.text.o oVar = new androidx.emoji2.text.o(this, i16);
            p1.a b10 = oVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.a) : 0, (char[]) this.c, i16 * 2);
            p1.a b11 = oVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.d;
                p1.a b12 = oVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.a;
                    i13 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                sVar.a(oVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public s(mg.n nVar, Object obj, Object obj2, Object[] objArr) {
        this.a = 10;
        this.e = nVar;
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
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public s(lg.e eVar) {
        this.a = 6;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        if (eVar.E) {
            TextView textView = new TextView(eVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(eVar.getContext());
        this.c = textView2;
        linearLayout.addView(textView2, x5.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        y5 y5Var = new y5(eVar.getContext());
        this.b = y5Var;
        linearLayout.addView(y5Var, x5.n(-1, -2));
        textView2.setGravity(8388611);
        y5Var.setGravity(8388613);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
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

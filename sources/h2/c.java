package h2;

import a8.la;
import a8.xa;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.b3;
import m.l1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ic;
import org.telegram.messenger.q5;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.rk;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class c {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public c(pe.b bVar, qe.j jVar, a4.k kVar, me.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.b = bVar;
        this.c = jVar;
        this.d = kVar;
        this.a = -1;
        o0 o0Var = bVar.a;
        this.e = o0Var;
        this.f = o0Var.b ? null : new qe.e(descriptor);
    }

    public void A(Runnable runnable) {
        i0 i0Var = (i0) this.b;
        if (i0Var.a.getLooper().getThread().isAlive()) {
            i0Var.d(runnable);
        }
    }

    public void B(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((b3) this.d) == null) {
                this.d = new b3();
            }
            b3 b3Var = (b3) this.d;
            b3Var.c = colorStateList;
            b3Var.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void C(int i7) {
        la.p(i7 >= 0);
        this.a = i7;
        r(i7);
    }

    public void D(ColorStateList colorStateList) {
        if (((b3) this.e) == null) {
            this.e = new b3();
        }
        b3 b3Var = (b3) this.e;
        b3Var.c = colorStateList;
        b3Var.b = true;
        b();
    }

    public void E(PorterDuff.Mode mode) {
        if (((b3) this.e) == null) {
            this.e = new b3();
        }
        b3 b3Var = (b3) this.e;
        b3Var.d = mode;
        b3Var.a = true;
        b();
    }

    public boolean F() {
        return ((ce0) this.b).b() && ((ce0) this.c).b() && ((ce0) this.d).b() && ((ce0) this.e).b();
    }

    public void G(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        l2.f0 f0Var = ((l2.u) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        f0Var.F1();
        f0Var.t1(1, 10, num);
        f0Var.t1(2, 10, num);
        f0Var.m.e(21, new l2.t(intValue, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r10 < r3.b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j3, x xVar) {
        int i7;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        if (j3 != -9223372036854775807L && (i7 = this.a) != 0) {
            if (i7 != -1 && priorityQueue.size() >= this.a) {
                i2.t tVar = (i2.t) priorityQueue.peek();
                String str = l0.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            x xVar2 = arrayDeque2.isEmpty() ? new x() : (x) arrayDeque2.pop();
            xVar2.K(xVar.a());
            System.arraycopy(xVar.a, xVar.b, xVar2.a, 0, xVar2.a());
            i2.t tVar2 = (i2.t) this.f;
            if (tVar2 != null && j3 == tVar2.b) {
                tVar2.a.add(xVar2);
                return;
            }
            i2.t tVar3 = arrayDeque.isEmpty() ? new i2.t() : (i2.t) arrayDeque.pop();
            ArrayList arrayList = tVar3.a;
            la.f(j3 != -9223372036854775807L);
            la.p(arrayList.isEmpty());
            tVar3.b = j3;
            arrayList.add(xVar2);
            priorityQueue.add(tVar3);
            this.f = tVar3;
            int i10 = this.a;
            if (i10 != -1) {
                r(i10);
                return;
            }
            return;
        }
        ((i2.u) this.b).a(j3, xVar);
    }

    public void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((b3) this.d) != null) {
                if (((b3) this.f) == null) {
                    this.f = new b3();
                }
                b3 b3Var = (b3) this.f;
                b3Var.c = null;
                b3Var.b = false;
                b3Var.d = null;
                b3Var.a = false;
                WeakHashMap weakHashMap = r0.i0.a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    b3Var.b = true;
                    b3Var.c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    b3Var.a = true;
                    b3Var.d = d;
                }
                if (b3Var.b || b3Var.a) {
                    m.q.d(background, b3Var, view.getDrawableState());
                    return;
                }
            }
            b3 b3Var2 = (b3) this.e;
            if (b3Var2 != null) {
                m.q.d(background, b3Var2, view.getDrawableState());
                return;
            }
            b3 b3Var3 = (b3) this.d;
            if (b3Var3 != null) {
                m.q.d(background, b3Var3, view.getDrawableState());
            }
        }
    }

    public c c(me.d descriptor) {
        byte b10;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        pe.b bVar = (pe.b) this.b;
        qe.j f10 = qe.f.f(descriptor, bVar);
        a4.k kVar = (a4.k) this.d;
        xa xaVar = (xa) kVar.c;
        int i7 = xaVar.b + 1;
        xaVar.b = i7;
        Object[] objArr = (Object[]) xaVar.c;
        if (i7 == objArr.length) {
            int i10 = i7 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i10);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            xaVar.c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) xaVar.d, i10);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            xaVar.d = copyOf2;
        }
        ((Object[]) xaVar.c)[i7] = descriptor;
        kVar.h(f10.a);
        String str = (String) kVar.f;
        int i11 = kVar.b;
        while (true) {
            int q10 = kVar.q(i11);
            b10 = 10;
            if (q10 == -1) {
                kVar.b = q10;
                break;
            }
            char charAt = str.charAt(q10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                kVar.b = q10;
                b10 = qe.f.b(charAt);
                break;
            }
            i11 = q10 + 1;
        }
        if (b10 != 4) {
            int ordinal = f10.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new c(bVar, f10, kVar, descriptor) : (((qe.j) this.c) == f10 && bVar.a.b) ? this : new c(bVar, f10, kVar, descriptor);
        }
        a4.k.n(kVar, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public int d(me.d descriptor) {
        pe.b json = (pe.b) this.b;
        o0 o0Var = json.a;
        a4.k kVar = (a4.k) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        qe.j jVar = (qe.j) this.c;
        int ordinal = jVar.ordinal();
        int i7 = 0;
        r10 = false;
        boolean z10 = false;
        int i10 = -1;
        if (ordinal == 0) {
            qe.e eVar = (qe.e) this.f;
            o0 o0Var2 = (o0) this.e;
            boolean u10 = kVar.u();
            if (kVar.e()) {
                o0Var2.getClass();
                String name = kVar.g();
                kVar.h(':');
                kotlin.jvm.internal.j.e(descriptor, "<this>");
                kotlin.jvm.internal.j.e(json, "json");
                kotlin.jvm.internal.j.e(name, "name");
                o0 o0Var3 = json.a;
                o0Var3.getClass();
                qe.f.e(descriptor, json);
                int d = descriptor.d(name);
                i10 = -3;
                if (d == -3 && o0Var3.c) {
                    c5 c5Var = json.c;
                    b1.f fVar = new b1.f(2, descriptor, json);
                    c5Var.getClass();
                    c5Var.getClass();
                    kotlin.jvm.internal.j.e(descriptor, "descriptor");
                    Map map = (Map) ((ConcurrentHashMap) c5Var.a).get(descriptor);
                    qe.g gVar = qe.f.a;
                    Object obj = map != null ? map.get(gVar) : null;
                    Object obj2 = obj != null ? obj : null;
                    if (obj2 == null) {
                        obj2 = fVar.invoke();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c5Var.a;
                        Object obj3 = concurrentHashMap.get(descriptor);
                        Object obj4 = obj3;
                        if (obj3 == null) {
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                            concurrentHashMap.put(descriptor, concurrentHashMap2);
                            obj4 = concurrentHashMap2;
                        }
                        ((Map) obj4).put(gVar, obj2);
                    }
                    Integer num = (Integer) ((Map) obj2).get(name);
                    if (num != null) {
                        i10 = num.intValue();
                    }
                } else {
                    i10 = d;
                }
                if (i10 == -3) {
                    String obj5 = ((String) kVar.f).subSequence(0, kVar.b).toString();
                    int f10 = xd.d.f(obj5);
                    kotlin.jvm.internal.j.e(obj5, "<this>");
                    kVar.m(obj5.lastIndexOf(name, f10), "Encountered an unknown key '" + name + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
                if (eVar != null) {
                    oe.d dVar = eVar.a;
                    if (i10 < 64) {
                        dVar.c |= 1 << i10;
                    } else {
                        int i11 = (i10 >>> 6) - 1;
                        long[] jArr = dVar.d;
                        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
                    }
                }
            } else {
                if (u10) {
                    o0Var.getClass();
                    qe.f.c(kVar, "object");
                    throw null;
                }
                if (eVar != null) {
                    oe.d dVar2 = eVar.a;
                    c1.d dVar3 = dVar2.b;
                    me.d dVar4 = dVar2.a;
                    int f11 = dVar4.f();
                    while (true) {
                        long j3 = dVar2.c;
                        if (j3 != -1) {
                            int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                            dVar2.c |= 1 << numberOfTrailingZeros;
                            if (((Boolean) dVar3.invoke(dVar4, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                i10 = numberOfTrailingZeros;
                                break;
                            }
                        } else if (f11 > 64) {
                            long[] jArr2 = dVar2.d;
                            int length = jArr2.length;
                            loop1: while (true) {
                                if (i7 >= length) {
                                    break;
                                }
                                int i12 = i7 + 1;
                                int i13 = i12 * 64;
                                long j10 = jArr2[i7];
                                while (j10 != -1) {
                                    long[] jArr3 = jArr2;
                                    int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j10);
                                    j10 |= 1 << numberOfTrailingZeros2;
                                    int i14 = numberOfTrailingZeros2 + i13;
                                    if (((Boolean) dVar3.invoke(dVar4, Integer.valueOf(i14))).booleanValue()) {
                                        jArr3[i7] = j10;
                                        i10 = i14;
                                        break loop1;
                                    }
                                    jArr2 = jArr3;
                                }
                                jArr2[i7] = j10;
                                i7 = i12;
                            }
                        }
                    }
                }
            }
        } else if (ordinal != 2) {
            boolean u11 = kVar.u();
            if (kVar.e()) {
                int i15 = this.a;
                if (i15 != -1 && !u11) {
                    a4.k.n(kVar, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i10 = i15 + 1;
                this.a = i10;
            } else if (u11) {
                o0Var.getClass();
                qe.f.c(kVar, "array");
                throw null;
            }
        } else {
            int i16 = this.a;
            boolean z11 = i16 % 2 != 0;
            if (!z11) {
                kVar.h(':');
            } else if (i16 != -1) {
                z10 = kVar.u();
            }
            if (kVar.e()) {
                if (z11) {
                    if (this.a == -1) {
                        int i17 = kVar.b;
                        if (z10) {
                            a4.k.n(kVar, "Unexpected leading comma", i17, 4);
                            throw null;
                        }
                    } else {
                        int i18 = kVar.b;
                        if (!z10) {
                            a4.k.n(kVar, "Expected comma after the key-value pair", i18, 4);
                            throw null;
                        }
                    }
                }
                i10 = this.a + 1;
                this.a = i10;
            } else if (z10) {
                o0Var.getClass();
                qe.f.c(kVar, "object");
                throw null;
            }
        }
        if (jVar != qe.j.e) {
            xa xaVar = (xa) kVar.c;
            ((int[]) xaVar.d)[xaVar.b] = i10;
        }
        return i10;
    }

    public int e() {
        a4.k kVar = (a4.k) this.d;
        long i7 = kVar.i();
        int i10 = (int) i7;
        if (i7 == i10) {
            return i10;
        }
        a4.k.n(kVar, "Failed to parse int for input '" + i7 + '\'', 0, 6);
        throw null;
    }

    public int f(me.d descriptor, int i7) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return e();
    }

    public long g() {
        return ((a4.k) this.d).i();
    }

    public long h(me.d descriptor, int i7) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return g();
    }

    public boolean i() {
        qe.e eVar = (qe.e) this.f;
        if (!(eVar != null ? eVar.b : false)) {
            a4.k kVar = (a4.k) this.d;
            int q10 = kVar.q(kVar.t());
            String str = (String) kVar.f;
            int length = str.length() - q10;
            boolean z10 = false;
            if (length >= 4 && q10 != -1) {
                int i7 = 0;
                while (true) {
                    if (i7 < 4) {
                        if ("null".charAt(i7) != str.charAt(q10 + i7)) {
                            break;
                        }
                        i7++;
                    } else if (length <= 4 || qe.f.b(str.charAt(q10 + 4)) != 0) {
                        z10 = true;
                        kVar.b = q10 + 4;
                    }
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public Object j(me.d descriptor, int i7, ke.a deserializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        if (deserializer.d().c() || i()) {
            return l(deserializer);
        }
        return null;
    }

    public Object k(me.d descriptor, int i7, ke.a deserializer, Object obj) {
        xa xaVar = (xa) ((a4.k) this.d).c;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        boolean z10 = ((qe.j) this.c) == qe.j.e && (i7 & 1) == 0;
        if (z10) {
            int[] iArr = (int[]) xaVar.d;
            int i10 = xaVar.b;
            if (iArr[i10] == -2) {
                ((Object[]) xaVar.c)[i10] = qe.g.a;
            }
        }
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        Object l10 = l(deserializer);
        if (z10) {
            int[] iArr2 = (int[]) xaVar.d;
            int i11 = xaVar.b;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                xaVar.b = i12;
                Object[] objArr = (Object[]) xaVar.c;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i13);
                    kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                    xaVar.c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) xaVar.d, i13);
                    kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
                    xaVar.d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) xaVar.c;
            int i14 = xaVar.b;
            objArr2[i14] = l10;
            ((int[]) xaVar.d)[i14] = -2;
        }
        return l10;
    }

    public Object l(ke.a deserializer) {
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        try {
            return deserializer.b(this);
        } catch (ke.b e10) {
            String message = e10.getMessage();
            kotlin.jvm.internal.j.b(message);
            if (xd.d.e(message, "at path")) {
                throw e10;
            }
            throw new ke.b(e10.a, e10.getMessage() + " at path: " + ((xa) ((a4.k) this.d).c).m(), e10);
        }
    }

    public String m() {
        a4.k kVar = (a4.k) this.d;
        ((o0) this.e).getClass();
        return kVar.j();
    }

    public String n(me.d descriptor, int i7) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return m();
    }

    public void o() {
        this.b = null;
        if (((rk) this.f) != null) {
            Utilities.e.a((rk) this.f);
        }
        Bitmap bitmap = (Bitmap) this.c;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((Bitmap) this.c).recycle();
        }
        this.c = null;
    }

    public void p(me.d descriptor) {
        a4.k kVar = (a4.k) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        o0 o0Var = ((pe.b) this.b).a;
        o0Var.getClass();
        if (kVar.u()) {
            o0Var.getClass();
            qe.f.c(kVar, "");
            throw null;
        }
        kVar.h(((qe.j) this.c).b);
        xa xaVar = (xa) kVar.c;
        int i7 = xaVar.b;
        int[] iArr = (int[]) xaVar.d;
        if (iArr[i7] == -2) {
            iArr[i7] = -1;
            xaVar.b = i7 - 1;
        }
        int i10 = xaVar.b;
        if (i10 != -1) {
            xaVar.b = i10 - 1;
        }
    }

    public void q() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f;
        byteBuffer.position(0);
        ce0 ce0Var = (ce0) this.b;
        if (ce0Var.f == null) {
            ce0Var.a();
        }
        float[] fArr = ce0Var.f;
        ce0 ce0Var2 = (ce0) this.c;
        if (ce0Var2.f == null) {
            ce0Var2.a();
        }
        float[] fArr2 = ce0Var2.f;
        ce0 ce0Var3 = (ce0) this.d;
        if (ce0Var3.f == null) {
            ce0Var3.a();
        }
        float[] fArr3 = ce0Var3.f;
        ce0 ce0Var4 = (ce0) this.e;
        if (ce0Var4.f == null) {
            ce0Var4.a();
        }
        float[] fArr4 = ce0Var4.f;
        for (int i7 = 0; i7 < 200; i7++) {
            byteBuffer.put((byte) (fArr2[i7] * 255.0f));
            byteBuffer.put((byte) (fArr3[i7] * 255.0f));
            byteBuffer.put((byte) (fArr4[i7] * 255.0f));
            byteBuffer.put((byte) (fArr[i7] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public void r(int i7) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i7) {
            i2.t tVar = (i2.t) priorityQueue.poll();
            String str = l0.a;
            int i10 = 0;
            while (true) {
                arrayList = tVar.a;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((i2.u) this.b).a(tVar.b, (x) arrayList.get(i10));
                ((ArrayDeque) this.c).push((x) arrayList.get(i10));
                i10++;
            }
            arrayList.clear();
            i2.t tVar2 = (i2.t) this.f;
            if (tVar2 != null && tVar2.b == tVar.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(tVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (((org.telegram.ui.rk) r8.f) != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap s(Bitmap bitmap, String str, int i7, int i10, boolean z10) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (TextUtils.equals((String) this.b, str)) {
                Bitmap bitmap2 = (Bitmap) this.c;
                if (bitmap2 != null) {
                    return bitmap2;
                }
            }
            if (((rk) this.f) != null) {
                Utilities.e.a((rk) this.f);
            }
            this.b = str;
            q5 q5Var = Utilities.e;
            rk rkVar = new rk(this, bitmap, i7, i10, str, z10);
            this.f = rkVar;
            q5Var.c(rkVar);
            return (Bitmap) this.c;
        }
        return null;
    }

    public Bitmap t(ic icVar) {
        if (icVar == null) {
            return null;
        }
        return s(icVar.c, icVar.a, icVar.e, 0, false);
    }

    public Bitmap u(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return null;
        }
        return s(imageReceiver.n(), imageReceiver.R, imageReceiver.V, imageReceiver.W, false);
    }

    public ColorStateList v() {
        b3 b3Var = (b3) this.e;
        if (b3Var != null) {
            return (ColorStateList) b3Var.c;
        }
        return null;
    }

    public PorterDuff.Mode w() {
        b3 b3Var = (b3) this.e;
        if (b3Var != null) {
            return (PorterDuff.Mode) b3Var.d;
        }
        return null;
    }

    public void x(AttributeSet attributeSet, int i7) {
        ColorStateList i10;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = f.a.z;
        h6.m D = h6.m.D(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) D.c;
        View view2 = (View) this.b;
        r0.i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) D.c, i7);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                m.q qVar = (m.q) this.c;
                Context context2 = view.getContext();
                int i11 = this.a;
                synchronized (qVar) {
                    i10 = qVar.a.i(context2, i11);
                }
                if (i10 != null) {
                    B(i10);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, D.s(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, l1.b(typedArray.getInt(2, -1), null));
            }
            D.G();
        } catch (Throwable th2) {
            D.G();
            throw th2;
        }
    }

    public void y() {
        this.a = -1;
        B(null);
        b();
    }

    public void z(int i7) {
        ColorStateList colorStateList;
        this.a = i7;
        m.q qVar = (m.q) this.c;
        if (qVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.a.i(context, i7);
            }
        } else {
            colorStateList = null;
        }
        B(colorStateList);
        b();
    }

    public c(View view) {
        this.a = -1;
        this.b = view;
        this.c = m.q.a();
    }

    public c(i2.u uVar) {
        this.b = uVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public c() {
        this.b = new ce0();
        this.c = new ce0();
        this.d = new ce0();
        this.e = new ce0();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(int i7, Runnable runnable) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i7;
        this.e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}

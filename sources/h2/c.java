package h2;

import a8.ia;
import a8.wa;
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
import m.c3;
import m.m1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jc;
import org.telegram.messenger.p5;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.qk;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        p0 p0Var = bVar.a;
        this.e = p0Var;
        this.f = p0Var.b ? null : new qe.e(descriptor);
    }

    public void A(Runnable runnable) {
        i0 i0Var = (i0) this.b;
        if (i0Var.a.getLooper().getThread().isAlive()) {
            i0Var.d(runnable);
        }
    }

    public void B(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((c3) this.d) == null) {
                this.d = new c3();
            }
            c3 c3Var = (c3) this.d;
            c3Var.c = colorStateList;
            c3Var.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void C(int i7) {
        ia.p(i7 >= 0);
        this.a = i7;
        r(i7);
    }

    public void D(ColorStateList colorStateList) {
        if (((c3) this.e) == null) {
            this.e = new c3();
        }
        c3 c3Var = (c3) this.e;
        c3Var.c = colorStateList;
        c3Var.b = true;
        b();
    }

    public void E(PorterDuff.Mode mode) {
        if (((c3) this.e) == null) {
            this.e = new c3();
        }
        c3 c3Var = (c3) this.e;
        c3Var.d = mode;
        c3Var.a = true;
        b();
    }

    public boolean F() {
        return ((qd0) this.b).b() && ((qd0) this.c).b() && ((qd0) this.d).b() && ((qd0) this.e).b();
    }

    public void G(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        l2.i0 i0Var = ((l2.v) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        i0Var.F1();
        i0Var.t1(1, 10, num);
        i0Var.t1(2, 10, num);
        i0Var.m.e(21, new l2.u(intValue, 1));
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
                String str = m0.a;
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
            ia.f(j3 != -9223372036854775807L);
            ia.p(arrayList.isEmpty());
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
        ((i2.u) this.b).b(j3, xVar);
    }

    public void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c3) this.d) != null) {
                if (((c3) this.f) == null) {
                    this.f = new c3();
                }
                c3 c3Var = (c3) this.f;
                c3Var.c = null;
                c3Var.b = false;
                c3Var.d = null;
                c3Var.a = false;
                WeakHashMap weakHashMap = r0.i0.a;
                ColorStateList c10 = r0.a0.c(view);
                if (c10 != null) {
                    c3Var.b = true;
                    c3Var.c = c10;
                }
                PorterDuff.Mode d = r0.a0.d(view);
                if (d != null) {
                    c3Var.a = true;
                    c3Var.d = d;
                }
                if (c3Var.b || c3Var.a) {
                    m.r.d(background, c3Var, view.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.e;
            if (c3Var2 != null) {
                m.r.d(background, c3Var2, view.getDrawableState());
                return;
            }
            c3 c3Var3 = (c3) this.d;
            if (c3Var3 != null) {
                m.r.d(background, c3Var3, view.getDrawableState());
            }
        }
    }

    public c c(me.d descriptor) {
        byte b10;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        pe.b bVar = (pe.b) this.b;
        qe.j f10 = qe.f.f(descriptor, bVar);
        a4.k kVar = (a4.k) this.d;
        wa waVar = (wa) kVar.c;
        int i7 = waVar.b + 1;
        waVar.b = i7;
        Object[] objArr = (Object[]) waVar.c;
        if (i7 == objArr.length) {
            int i10 = i7 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i10);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            waVar.c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) waVar.d, i10);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            waVar.d = copyOf2;
        }
        ((Object[]) waVar.c)[i7] = descriptor;
        kVar.h(f10.a);
        String str = (String) kVar.f;
        int i11 = kVar.b;
        while (true) {
            int r10 = kVar.r(i11);
            b10 = 10;
            if (r10 == -1) {
                kVar.b = r10;
                break;
            }
            char charAt = str.charAt(r10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                kVar.b = r10;
                b10 = qe.f.b(charAt);
                break;
            }
            i11 = r10 + 1;
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
        p0 p0Var = json.a;
        a4.k kVar = (a4.k) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        qe.j jVar = (qe.j) this.c;
        int ordinal = jVar.ordinal();
        int i7 = 0;
        r10 = false;
        boolean z9 = false;
        int i10 = -1;
        if (ordinal == 0) {
            qe.e eVar = (qe.e) this.f;
            p0 p0Var2 = (p0) this.e;
            boolean v = kVar.v();
            if (kVar.e()) {
                p0Var2.getClass();
                String name = kVar.g();
                kVar.h(':');
                kotlin.jvm.internal.j.e(descriptor, "<this>");
                kotlin.jvm.internal.j.e(json, "json");
                kotlin.jvm.internal.j.e(name, "name");
                p0 p0Var3 = json.a;
                p0Var3.getClass();
                qe.f.e(descriptor, json);
                int d = descriptor.d(name);
                i10 = -3;
                if (d == -3 && p0Var3.c) {
                    org.telegram.ui.Components.n nVar = json.c;
                    b1.f fVar = new b1.f(2, descriptor, json);
                    nVar.getClass();
                    nVar.getClass();
                    kotlin.jvm.internal.j.e(descriptor, "descriptor");
                    Map map = (Map) ((ConcurrentHashMap) nVar.a).get(descriptor);
                    qe.g gVar = qe.f.a;
                    Object obj = map != null ? map.get(gVar) : null;
                    Object obj2 = obj != null ? obj : null;
                    if (obj2 == null) {
                        obj2 = fVar.invoke();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) nVar.a;
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
                if (v) {
                    p0Var.getClass();
                    qe.f.c(kVar, "object");
                    throw null;
                }
                if (eVar != null) {
                    oe.d dVar2 = eVar.a;
                    c1.c cVar = dVar2.b;
                    me.d dVar3 = dVar2.a;
                    int f11 = dVar3.f();
                    while (true) {
                        long j3 = dVar2.c;
                        if (j3 != -1) {
                            int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                            dVar2.c |= 1 << numberOfTrailingZeros;
                            if (((Boolean) cVar.invoke(dVar3, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
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
                                    if (((Boolean) cVar.invoke(dVar3, Integer.valueOf(i14))).booleanValue()) {
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
            boolean v10 = kVar.v();
            if (kVar.e()) {
                int i15 = this.a;
                if (i15 != -1 && !v10) {
                    a4.k.n(kVar, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i10 = i15 + 1;
                this.a = i10;
            } else if (v10) {
                p0Var.getClass();
                qe.f.c(kVar, "array");
                throw null;
            }
        } else {
            int i16 = this.a;
            boolean z10 = i16 % 2 != 0;
            if (!z10) {
                kVar.h(':');
            } else if (i16 != -1) {
                z9 = kVar.v();
            }
            if (kVar.e()) {
                if (z10) {
                    if (this.a == -1) {
                        int i17 = kVar.b;
                        if (z9) {
                            a4.k.n(kVar, "Unexpected leading comma", i17, 4);
                            throw null;
                        }
                    } else {
                        int i18 = kVar.b;
                        if (!z9) {
                            a4.k.n(kVar, "Expected comma after the key-value pair", i18, 4);
                            throw null;
                        }
                    }
                }
                i10 = this.a + 1;
                this.a = i10;
            } else if (z9) {
                p0Var.getClass();
                qe.f.c(kVar, "object");
                throw null;
            }
        }
        if (jVar != qe.j.e) {
            wa waVar = (wa) kVar.c;
            ((int[]) waVar.d)[waVar.b] = i10;
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
            int r10 = kVar.r(kVar.u());
            String str = (String) kVar.f;
            int length = str.length() - r10;
            boolean z9 = false;
            if (length >= 4 && r10 != -1) {
                int i7 = 0;
                while (true) {
                    if (i7 < 4) {
                        if ("null".charAt(i7) != str.charAt(r10 + i7)) {
                            break;
                        }
                        i7++;
                    } else if (length <= 4 || qe.f.b(str.charAt(r10 + 4)) != 0) {
                        z9 = true;
                        kVar.b = r10 + 4;
                    }
                }
            }
            if (!z9) {
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
        wa waVar = (wa) ((a4.k) this.d).c;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        boolean z9 = ((qe.j) this.c) == qe.j.e && (i7 & 1) == 0;
        if (z9) {
            int[] iArr = (int[]) waVar.d;
            int i10 = waVar.b;
            if (iArr[i10] == -2) {
                ((Object[]) waVar.c)[i10] = qe.g.a;
            }
        }
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        Object l10 = l(deserializer);
        if (z9) {
            int[] iArr2 = (int[]) waVar.d;
            int i11 = waVar.b;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                waVar.b = i12;
                Object[] objArr = (Object[]) waVar.c;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i13);
                    kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                    waVar.c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) waVar.d, i13);
                    kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
                    waVar.d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) waVar.c;
            int i14 = waVar.b;
            objArr2[i14] = l10;
            ((int[]) waVar.d)[i14] = -2;
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
            throw new ke.b(e10.a, e10.getMessage() + " at path: " + ((wa) ((a4.k) this.d).c).m(), e10);
        }
    }

    public String m() {
        a4.k kVar = (a4.k) this.d;
        ((p0) this.e).getClass();
        return kVar.j();
    }

    public String n(me.d descriptor, int i7) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return m();
    }

    public void o() {
        this.b = null;
        if (((qk) this.f) != null) {
            Utilities.e.a((qk) this.f);
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
        p0 p0Var = ((pe.b) this.b).a;
        p0Var.getClass();
        if (kVar.v()) {
            p0Var.getClass();
            qe.f.c(kVar, "");
            throw null;
        }
        kVar.h(((qe.j) this.c).b);
        wa waVar = (wa) kVar.c;
        int i7 = waVar.b;
        int[] iArr = (int[]) waVar.d;
        if (iArr[i7] == -2) {
            iArr[i7] = -1;
            waVar.b = i7 - 1;
        }
        int i10 = waVar.b;
        if (i10 != -1) {
            waVar.b = i10 - 1;
        }
    }

    public void q() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f;
        byteBuffer.position(0);
        qd0 qd0Var = (qd0) this.b;
        if (qd0Var.f == null) {
            qd0Var.a();
        }
        float[] fArr = qd0Var.f;
        qd0 qd0Var2 = (qd0) this.c;
        if (qd0Var2.f == null) {
            qd0Var2.a();
        }
        float[] fArr2 = qd0Var2.f;
        qd0 qd0Var3 = (qd0) this.d;
        if (qd0Var3.f == null) {
            qd0Var3.a();
        }
        float[] fArr3 = qd0Var3.f;
        qd0 qd0Var4 = (qd0) this.e;
        if (qd0Var4.f == null) {
            qd0Var4.a();
        }
        float[] fArr4 = qd0Var4.f;
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
            String str = m0.a;
            int i10 = 0;
            while (true) {
                arrayList = tVar.a;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((i2.u) this.b).b(tVar.b, (x) arrayList.get(i10));
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
    
        if (((org.telegram.ui.qk) r8.f) != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap s(Bitmap bitmap, String str, int i7, int i10, boolean z9) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (TextUtils.equals((String) this.b, str)) {
                Bitmap bitmap2 = (Bitmap) this.c;
                if (bitmap2 != null) {
                    return bitmap2;
                }
            }
            if (((qk) this.f) != null) {
                Utilities.e.a((qk) this.f);
            }
            this.b = str;
            p5 p5Var = Utilities.e;
            qk qkVar = new qk(this, bitmap, i7, i10, str, z9);
            this.f = qkVar;
            p5Var.c(qkVar);
            return (Bitmap) this.c;
        }
        return null;
    }

    public Bitmap t(jc jcVar) {
        if (jcVar == null) {
            return null;
        }
        return s(jcVar.c, jcVar.a, jcVar.e, 0, false);
    }

    public Bitmap u(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return null;
        }
        return s(imageReceiver.n(), imageReceiver.Q, imageReceiver.U, imageReceiver.V, false);
    }

    public ColorStateList v() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.c;
        }
        return null;
    }

    public PorterDuff.Mode w() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public void x(AttributeSet attributeSet, int i7) {
        ColorStateList i10;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = f.a.z;
        h6.m x10 = h6.m.x(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) x10.c;
        View view2 = (View) this.b;
        r0.i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) x10.c, i7);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                m.r rVar = (m.r) this.c;
                Context context2 = view.getContext();
                int i11 = this.a;
                synchronized (rVar) {
                    i10 = rVar.a.i(context2, i11);
                }
                if (i10 != null) {
                    B(i10);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.a0.f(view, x10.o(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, m1.b(typedArray.getInt(2, -1), null));
            }
            x10.C();
        } catch (Throwable th2) {
            x10.C();
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
        m.r rVar = (m.r) this.c;
        if (rVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (rVar) {
                colorStateList = rVar.a.i(context, i7);
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
        this.c = m.r.a();
    }

    public c(i2.u uVar) {
        this.b = uVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public c() {
        this.b = new qd0();
        this.c = new qd0();
        this.d = new qd0();
        this.e = new qd0();
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

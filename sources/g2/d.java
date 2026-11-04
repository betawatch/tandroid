package g2;

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
import b8.kg;
import b8.zb;
import gi.w5;
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
import org.telegram.messenger.cc;
import org.telegram.messenger.p5;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.mk;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public d(me.b bVar, ne.j jVar, e0.e0 e0Var, je.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        this.b = bVar;
        this.c = jVar;
        this.d = e0Var;
        this.a = -1;
        q0 q0Var = bVar.a;
        this.e = q0Var;
        this.f = q0Var.b ? null : new ne.e(descriptor);
    }

    public void A(Runnable runnable) {
        j0 j0Var = (j0) this.b;
        if (j0Var.a.getLooper().getThread().isAlive()) {
            j0Var.d(runnable);
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

    public void C(int i3) {
        zb.p(i3 >= 0);
        this.a = i3;
        r(i3);
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
        return ((ld0) this.b).b() && ((ld0) this.c).b() && ((ld0) this.d).b() && ((ld0) this.e).b();
    }

    public void G(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        k2.i0 i0Var = ((k2.w) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        i0Var.F1();
        i0Var.t1(1, 10, num);
        i0Var.t1(2, 10, num);
        i0Var.m.e(21, new k2.v(intValue, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r10 < r3.b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j10, y yVar) {
        int i3;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        if (j10 != -9223372036854775807L && (i3 = this.a) != 0) {
            if (i3 != -1 && priorityQueue.size() >= this.a) {
                h2.t tVar = (h2.t) priorityQueue.peek();
                String str = n0.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            y yVar2 = arrayDeque2.isEmpty() ? new y() : (y) arrayDeque2.pop();
            yVar2.K(yVar.a());
            System.arraycopy(yVar.a, yVar.b, yVar2.a, 0, yVar2.a());
            h2.t tVar2 = (h2.t) this.f;
            if (tVar2 != null && j10 == tVar2.b) {
                tVar2.a.add(yVar2);
                return;
            }
            h2.t tVar3 = arrayDeque.isEmpty() ? new h2.t() : (h2.t) arrayDeque.pop();
            ArrayList arrayList = tVar3.a;
            zb.f(j10 != -9223372036854775807L);
            zb.p(arrayList.isEmpty());
            tVar3.b = j10;
            arrayList.add(yVar2);
            priorityQueue.add(tVar3);
            this.f = tVar3;
            int i10 = this.a;
            if (i10 != -1) {
                r(i10);
                return;
            }
            return;
        }
        ((h2.u) this.b).a(j10, yVar);
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
                ColorStateList c2 = r0.a0.c(view);
                if (c2 != null) {
                    b3Var.b = true;
                    b3Var.c = c2;
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

    public d c(je.d descriptor) {
        byte b10;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        me.b bVar = (me.b) this.b;
        ne.j f10 = ne.f.f(descriptor, bVar);
        e0.e0 e0Var = (e0.e0) this.d;
        kg kgVar = (kg) e0Var.c;
        int i3 = kgVar.b + 1;
        kgVar.b = i3;
        Object[] objArr = (Object[]) kgVar.c;
        if (i3 == objArr.length) {
            int i10 = i3 * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i10);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
            kgVar.c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) kgVar.d, i10);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
            kgVar.d = copyOf2;
        }
        ((Object[]) kgVar.c)[i3] = descriptor;
        e0Var.h(f10.a);
        String str = (String) e0Var.f;
        int i11 = e0Var.b;
        while (true) {
            int r5 = e0Var.r(i11);
            b10 = 10;
            if (r5 == -1) {
                e0Var.b = r5;
                break;
            }
            char charAt = str.charAt(r5);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                e0Var.b = r5;
                b10 = ne.f.b(charAt);
                break;
            }
            i11 = r5 + 1;
        }
        if (b10 != 4) {
            int ordinal = f10.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new d(bVar, f10, e0Var, descriptor) : (((ne.j) this.c) == f10 && bVar.a.b) ? this : new d(bVar, f10, e0Var, descriptor);
        }
        e0.e0.n(e0Var, "Unexpected leading comma", 0, 6);
        throw null;
    }

    public int d(je.d descriptor) {
        me.b json = (me.b) this.b;
        q0 q0Var = json.a;
        e0.e0 e0Var = (e0.e0) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        ne.j jVar = (ne.j) this.c;
        int ordinal = jVar.ordinal();
        int i3 = 0;
        r10 = false;
        boolean z10 = false;
        int i10 = -1;
        if (ordinal == 0) {
            ne.e eVar = (ne.e) this.f;
            q0 q0Var2 = (q0) this.e;
            boolean v = e0Var.v();
            if (e0Var.e()) {
                q0Var2.getClass();
                String name = e0Var.g();
                e0Var.h(':');
                kotlin.jvm.internal.j.e(descriptor, "<this>");
                kotlin.jvm.internal.j.e(json, "json");
                kotlin.jvm.internal.j.e(name, "name");
                q0 q0Var3 = json.a;
                q0Var3.getClass();
                ne.f.e(descriptor, json);
                int d = descriptor.d(name);
                i10 = -3;
                if (d == -3 && q0Var3.c) {
                    w5 w5Var = json.c;
                    b1.f fVar = new b1.f(2, descriptor, json);
                    w5Var.getClass();
                    w5Var.getClass();
                    kotlin.jvm.internal.j.e(descriptor, "descriptor");
                    Map map = (Map) ((ConcurrentHashMap) w5Var.b).get(descriptor);
                    ne.g gVar = ne.f.a;
                    Object obj = map != null ? map.get(gVar) : null;
                    Object obj2 = obj != null ? obj : null;
                    if (obj2 == null) {
                        obj2 = fVar.invoke();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) w5Var.b;
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
                    String obj5 = ((String) e0Var.f).subSequence(0, e0Var.b).toString();
                    int f10 = ud.d.f(obj5);
                    kotlin.jvm.internal.j.e(obj5, "<this>");
                    e0Var.m(obj5.lastIndexOf(name, f10), "Encountered an unknown key '" + name + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                    throw null;
                }
                if (eVar != null) {
                    le.d dVar = eVar.a;
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
                    q0Var.getClass();
                    ne.f.c(e0Var, "object");
                    throw null;
                }
                if (eVar != null) {
                    le.d dVar2 = eVar.a;
                    c1.c cVar = dVar2.b;
                    je.d dVar3 = dVar2.a;
                    int f11 = dVar3.f();
                    while (true) {
                        long j10 = dVar2.c;
                        if (j10 != -1) {
                            int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                            dVar2.c |= 1 << numberOfTrailingZeros;
                            if (((Boolean) cVar.invoke(dVar3, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                i10 = numberOfTrailingZeros;
                                break;
                            }
                        } else if (f11 > 64) {
                            long[] jArr2 = dVar2.d;
                            int length = jArr2.length;
                            loop1: while (true) {
                                if (i3 >= length) {
                                    break;
                                }
                                int i12 = i3 + 1;
                                int i13 = i12 * 64;
                                long j11 = jArr2[i3];
                                while (j11 != -1) {
                                    long[] jArr3 = jArr2;
                                    int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j11);
                                    j11 |= 1 << numberOfTrailingZeros2;
                                    int i14 = numberOfTrailingZeros2 + i13;
                                    if (((Boolean) cVar.invoke(dVar3, Integer.valueOf(i14))).booleanValue()) {
                                        jArr3[i3] = j11;
                                        i10 = i14;
                                        break loop1;
                                    }
                                    jArr2 = jArr3;
                                }
                                jArr2[i3] = j11;
                                i3 = i12;
                            }
                        }
                    }
                }
            }
        } else if (ordinal != 2) {
            boolean v10 = e0Var.v();
            if (e0Var.e()) {
                int i15 = this.a;
                if (i15 != -1 && !v10) {
                    e0.e0.n(e0Var, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i10 = i15 + 1;
                this.a = i10;
            } else if (v10) {
                q0Var.getClass();
                ne.f.c(e0Var, "array");
                throw null;
            }
        } else {
            int i16 = this.a;
            boolean z11 = i16 % 2 != 0;
            if (!z11) {
                e0Var.h(':');
            } else if (i16 != -1) {
                z10 = e0Var.v();
            }
            if (e0Var.e()) {
                if (z11) {
                    if (this.a == -1) {
                        int i17 = e0Var.b;
                        if (z10) {
                            e0.e0.n(e0Var, "Unexpected leading comma", i17, 4);
                            throw null;
                        }
                    } else {
                        int i18 = e0Var.b;
                        if (!z10) {
                            e0.e0.n(e0Var, "Expected comma after the key-value pair", i18, 4);
                            throw null;
                        }
                    }
                }
                i10 = this.a + 1;
                this.a = i10;
            } else if (z10) {
                q0Var.getClass();
                ne.f.c(e0Var, "object");
                throw null;
            }
        }
        if (jVar != ne.j.e) {
            kg kgVar = (kg) e0Var.c;
            ((int[]) kgVar.d)[kgVar.b] = i10;
        }
        return i10;
    }

    public int e() {
        e0.e0 e0Var = (e0.e0) this.d;
        long i3 = e0Var.i();
        int i10 = (int) i3;
        if (i3 == i10) {
            return i10;
        }
        e0.e0.n(e0Var, "Failed to parse int for input '" + i3 + '\'', 0, 6);
        throw null;
    }

    public int f(je.d descriptor, int i3) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return e();
    }

    public long g() {
        return ((e0.e0) this.d).i();
    }

    public long h(je.d descriptor, int i3) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return g();
    }

    public boolean i() {
        ne.e eVar = (ne.e) this.f;
        if (!(eVar != null ? eVar.b : false)) {
            e0.e0 e0Var = (e0.e0) this.d;
            int r5 = e0Var.r(e0Var.u());
            String str = (String) e0Var.f;
            int length = str.length() - r5;
            boolean z10 = false;
            if (length >= 4 && r5 != -1) {
                int i3 = 0;
                while (true) {
                    if (i3 < 4) {
                        if ("null".charAt(i3) != str.charAt(r5 + i3)) {
                            break;
                        }
                        i3++;
                    } else if (length <= 4 || ne.f.b(str.charAt(r5 + 4)) != 0) {
                        z10 = true;
                        e0Var.b = r5 + 4;
                    }
                }
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public Object j(je.d descriptor, int i3, he.a deserializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        if (deserializer.d().c() || i()) {
            return l(deserializer);
        }
        return null;
    }

    public Object k(je.d descriptor, int i3, he.a deserializer, Object obj) {
        kg kgVar = (kg) ((e0.e0) this.d).c;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        boolean z10 = ((ne.j) this.c) == ne.j.e && (i3 & 1) == 0;
        if (z10) {
            int[] iArr = (int[]) kgVar.d;
            int i10 = kgVar.b;
            if (iArr[i10] == -2) {
                ((Object[]) kgVar.c)[i10] = ne.g.a;
            }
        }
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        Object l10 = l(deserializer);
        if (z10) {
            int[] iArr2 = (int[]) kgVar.d;
            int i11 = kgVar.b;
            if (iArr2[i11] != -2) {
                int i12 = i11 + 1;
                kgVar.b = i12;
                Object[] objArr = (Object[]) kgVar.c;
                if (i12 == objArr.length) {
                    int i13 = i12 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i13);
                    kotlin.jvm.internal.j.d(copyOf, "copyOf(...)");
                    kgVar.c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) kgVar.d, i13);
                    kotlin.jvm.internal.j.d(copyOf2, "copyOf(...)");
                    kgVar.d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) kgVar.c;
            int i14 = kgVar.b;
            objArr2[i14] = l10;
            ((int[]) kgVar.d)[i14] = -2;
        }
        return l10;
    }

    public Object l(he.a deserializer) {
        kotlin.jvm.internal.j.e(deserializer, "deserializer");
        try {
            return deserializer.a(this);
        } catch (he.b e10) {
            String message = e10.getMessage();
            kotlin.jvm.internal.j.b(message);
            if (ud.d.e(message, "at path")) {
                throw e10;
            }
            throw new he.b(e10.a, e10.getMessage() + " at path: " + ((kg) ((e0.e0) this.d).c).n(), e10);
        }
    }

    public String m() {
        e0.e0 e0Var = (e0.e0) this.d;
        ((q0) this.e).getClass();
        return e0Var.j();
    }

    public String n(je.d descriptor, int i3) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        return m();
    }

    public void o() {
        this.b = null;
        if (((mk) this.f) != null) {
            Utilities.e.a((mk) this.f);
        }
        Bitmap bitmap = (Bitmap) this.c;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((Bitmap) this.c).recycle();
        }
        this.c = null;
    }

    public void p(je.d descriptor) {
        e0.e0 e0Var = (e0.e0) this.d;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        q0 q0Var = ((me.b) this.b).a;
        q0Var.getClass();
        if (e0Var.v()) {
            q0Var.getClass();
            ne.f.c(e0Var, "");
            throw null;
        }
        e0Var.h(((ne.j) this.c).b);
        kg kgVar = (kg) e0Var.c;
        int i3 = kgVar.b;
        int[] iArr = (int[]) kgVar.d;
        if (iArr[i3] == -2) {
            iArr[i3] = -1;
            kgVar.b = i3 - 1;
        }
        int i10 = kgVar.b;
        if (i10 != -1) {
            kgVar.b = i10 - 1;
        }
    }

    public void q() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f;
        byteBuffer.position(0);
        ld0 ld0Var = (ld0) this.b;
        if (ld0Var.f == null) {
            ld0Var.a();
        }
        float[] fArr = ld0Var.f;
        ld0 ld0Var2 = (ld0) this.c;
        if (ld0Var2.f == null) {
            ld0Var2.a();
        }
        float[] fArr2 = ld0Var2.f;
        ld0 ld0Var3 = (ld0) this.d;
        if (ld0Var3.f == null) {
            ld0Var3.a();
        }
        float[] fArr3 = ld0Var3.f;
        ld0 ld0Var4 = (ld0) this.e;
        if (ld0Var4.f == null) {
            ld0Var4.a();
        }
        float[] fArr4 = ld0Var4.f;
        for (int i3 = 0; i3 < 200; i3++) {
            byteBuffer.put((byte) (fArr2[i3] * 255.0f));
            byteBuffer.put((byte) (fArr3[i3] * 255.0f));
            byteBuffer.put((byte) (fArr4[i3] * 255.0f));
            byteBuffer.put((byte) (fArr[i3] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public void r(int i3) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i3) {
            h2.t tVar = (h2.t) priorityQueue.poll();
            String str = n0.a;
            int i10 = 0;
            while (true) {
                arrayList = tVar.a;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ((h2.u) this.b).a(tVar.b, (y) arrayList.get(i10));
                ((ArrayDeque) this.c).push((y) arrayList.get(i10));
                i10++;
            }
            arrayList.clear();
            h2.t tVar2 = (h2.t) this.f;
            if (tVar2 != null && tVar2.b == tVar.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(tVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (((org.telegram.ui.mk) r8.f) != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap s(Bitmap bitmap, String str, int i3, int i10, boolean z10) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if (TextUtils.equals((String) this.b, str)) {
                Bitmap bitmap2 = (Bitmap) this.c;
                if (bitmap2 != null) {
                    return bitmap2;
                }
            }
            if (((mk) this.f) != null) {
                Utilities.e.a((mk) this.f);
            }
            this.b = str;
            p5 p5Var = Utilities.e;
            mk mkVar = new mk(this, bitmap, i3, i10, str, z10);
            this.f = mkVar;
            p5Var.c(mkVar);
            return (Bitmap) this.c;
        }
        return null;
    }

    public Bitmap t(cc ccVar) {
        if (ccVar == null) {
            return null;
        }
        return s(ccVar.c, ccVar.a, ccVar.e, 0, false);
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

    public void x(AttributeSet attributeSet, int i3) {
        ColorStateList i10;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = f.a.z;
        k4.j F = k4.j.F(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) F.b;
        View view2 = (View) this.b;
        r0.i0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) F.b, i3);
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
                r0.a0.f(view, F.y(1));
            }
            if (typedArray.hasValue(2)) {
                r0.a0.g(view, l1.b(typedArray.getInt(2, -1), null));
            }
            F.H();
        } catch (Throwable th2) {
            F.H();
            throw th2;
        }
    }

    public void y() {
        this.a = -1;
        B(null);
        b();
    }

    public void z(int i3) {
        ColorStateList colorStateList;
        this.a = i3;
        m.q qVar = (m.q) this.c;
        if (qVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.a.i(context, i3);
            }
        } else {
            colorStateList = null;
        }
        B(colorStateList);
        b();
    }

    public d(View view) {
        this.a = -1;
        this.b = view;
        this.c = m.q.a();
    }

    public d(h2.u uVar) {
        this.b = uVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public d() {
        this.b = new ld0();
        this.c = new ld0();
        this.d = new ld0();
        this.e = new ld0();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public d(int i3, Runnable runnable) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i3;
        this.e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}

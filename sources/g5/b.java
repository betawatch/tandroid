package g5;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import c2.t;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.clearcut.e;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.z3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e7.v;
import g7.e8;
import h3.n1;
import h3.o1;
import h3.p1;
import h3.r1;
import h3.s1;
import h7.k6;
import h7.oa;
import h7.w6;
import ia.d0;
import j4.a1;
import j4.c0;
import j4.h0;
import j4.p;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.e4;
import jh.h9;
import jh.i9;
import jh.x3;
import l3.h;
import ld.n;
import m.i3;
import m2.g;
import m3.j;
import m3.k;
import m3.w;
import m5.f0;
import n2.b0;
import n2.d;
import n2.z;
import nc.i;
import oa.m;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import r0.j0;
import r0.m1;
import r0.o;
import r5.f;
import r5.x;
import w2.q;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements h0, h, s0, ld.b, OnCompleteListener, o, s, z, n9.a, ke.b, c6 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static String j(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static String v(b bVar) {
        Collection<String> collection = (Collection) bVar.b;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) bVar.c;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb2.append("/");
            }
            sb2.append("/");
            boolean z10 = true;
            for (String str2 : collection) {
                r5.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!r5.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i10 = 0; i10 < str2.length(); i10++) {
                        char charAt = str2.charAt(i10);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb3.append(charAt);
                        }
                    }
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                z10 = false;
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public void A(k3 k3Var) {
        try {
            v3 t10 = w3.t();
            t10.d((o3) this.b);
            t10.c();
            w3.p((w3) t10.b, k3Var);
            ((t) this.c).h((w3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void B(z3 z3Var) {
        try {
            t tVar = (t) this.c;
            v3 t10 = w3.t();
            t10.d((o3) this.b);
            t10.c();
            w3.r((w3) t10.b, z3Var);
            tVar.h((w3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void C(a4 a4Var) {
        if (a4Var == null) {
            return;
        }
        try {
            v3 t10 = w3.t();
            t10.d((o3) this.b);
            t10.c();
            w3.s((w3) t10.b, a4Var);
            ((t) this.c).h((w3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void D(f3 f3Var, o3 o3Var) {
        if (f3Var == null) {
            return;
        }
        try {
            v3 t10 = w3.t();
            t10.d(o3Var);
            t10.c();
            w3.n((w3) t10.b, f3Var);
            ((t) this.c).h((w3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void E(h3 h3Var, o3 o3Var) {
        try {
            v3 t10 = w3.t();
            t10.d(o3Var);
            t10.c();
            w3.o((w3) t10.b, h3Var);
            ((t) this.c).h((w3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter F() {
        return g6.v3;
    }

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        g gVar = (g) this.c;
        m1 h = j0.h(view, m1Var);
        if (h.a.n()) {
            return h;
        }
        Rect rect = (Rect) this.b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m1 b10 = j0.b(gVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint N(String str) {
        return g6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int N0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : g6.w0(null, i10, false);
    }

    @Override // ke.b
    public ke.a V0(b bVar) {
        List list = (List) this.c;
        List list2 = (List) bVar.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new i(bVar, (List) this.b, list);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        return g6.I.q();
    }

    @Override // n9.a
    public StackTraceElement[] a0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        n9.a[] aVarArr = (n9.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            n9.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.a0(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((ab.a) this.c).a0(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        f0 f0Var = (f0) this.b;
        String str = (String) this.c;
        x xVar = (x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        l.j("Not connected to device", f0Var.F == 2);
        f fVar = (f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        fVar.R0(M0, 5);
        synchronized (f0Var.s) {
            try {
                if (f0Var.p != null) {
                    taskCompletionSource.setException(l.m(new Status(2001, null, null, null)));
                } else {
                    f0Var.p = taskCompletionSource;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j4.h0
    public void b(int i10, c0 c0Var, j4.x xVar) {
        Pair o10 = o(i10, c0Var);
        if (o10 != null) {
            ((s1) this.c).i.c(new o1(this, o10, xVar, 0));
        }
    }

    @Override // j4.h0
    public void c(int i10, c0 c0Var, j4.x xVar) {
        Pair o10 = o(i10, c0Var);
        if (o10 != null) {
            ((s1) this.c).i.c(new o1(this, o10, xVar, 1));
        }
    }

    @Override // j4.h0
    public void d(int i10, c0 c0Var, p pVar, j4.x xVar, IOException iOException, boolean z10) {
        Pair o10 = o(i10, c0Var);
        if (o10 != null) {
            ((s1) this.c).i.c(new p1(this, o10, pVar, xVar, iOException, z10, 0));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.s0
    public Object e(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        i4.a aVar = (i4.a) ((s0) this.b).e(uri, oVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (i4.a) aVar.a(list);
    }

    @Override // j4.h0
    public void f(int i10, c0 c0Var, p pVar, j4.x xVar) {
        Pair o10 = o(i10, c0Var);
        if (o10 != null) {
            ((s1) this.c).i.c(new n1(this, o10, pVar, xVar, 2));
        }
    }

    @Override // j4.h0
    public void g(int i10, c0 c0Var, p pVar, j4.x xVar) {
        Pair o10 = o(i10, c0Var);
        if (o10 != null) {
            ((s1) this.c).i.c(new n1(this, o10, pVar, xVar, 1));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // j4.h0
    public void h(int i10, c0 c0Var, p pVar, j4.x xVar) {
        Pair o10 = o(i10, c0Var);
        if (o10 != null) {
            ((s1) this.c).i.c(new n1(this, o10, pVar, xVar, 0));
        }
    }

    public d i() {
        if (((n2.l) this.b) != null) {
            return new d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public boolean k(int i10) {
        return ((d5.g) this.b).a.get(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m l(ta.a aVar) {
        String str;
        m b0Var;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        int i10 = 6;
        m mVar = null;
        m dVar = EnumSet.class.isAssignableFrom(cls) ? new n1.d(type, i10) : cls == EnumMap.class ? new m5.o(type, i10) : null;
        if (dVar != null) {
            return dVar;
        }
        oa.d.f((ArrayList) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                w6 w6Var = ra.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e9) {
                    str = "Failed making constructor '" + ra.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e9.getMessage() + ra.c.e(e9);
                }
                b0Var = str != null ? new b0(str, i10) : new o0.b(declaredConstructor, 2);
            } catch (NoSuchMethodException unused) {
            }
            if (b0Var == null) {
                return b0Var;
            }
            int i11 = 17;
            if (Collection.class.isAssignableFrom(cls)) {
                int i12 = 16;
                mVar = SortedSet.class.isAssignableFrom(cls) ? new w9.d(i12) : Set.class.isAssignableFrom(cls) ? new xa.a(i12) : Queue.class.isAssignableFrom(cls) ? new za.b(i12) : new ab.a(i11);
            } else if (Map.class.isAssignableFrom(cls)) {
                mVar = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new v(i11) : ConcurrentMap.class.isAssignableFrom(cls) ? new w9.d(i11) : SortedMap.class.isAssignableFrom(cls) ? new xa.a(i11) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new ta.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new ab.a(18) : new za.b(i11);
            }
            if (mVar != null) {
                return mVar;
            }
            String j10 = j(cls);
            return j10 != null ? new e(j10) : new b0(cls, 5);
        }
        b0Var = null;
        if (b0Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void m(float f10, float f11, int i10, int i11) {
        g6.q(f10, f11, i10, i11);
    }

    public mb.b n() {
        if (((mb.b) this.c) == null) {
            mb.f fVar = (mb.f) this.b;
            int[] iArr = fVar.c;
            lb.d dVar = fVar.a;
            int i10 = dVar.a;
            int i11 = dVar.b;
            mb.b bVar = new mb.b(i10, i11);
            if (fVar.b.length < i10) {
                fVar.b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (b10[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int length = iArr.length;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                int i21 = iArr[i20];
                if (i21 > i17) {
                    i19 = i20;
                    i17 = i21;
                }
                if (i21 > i18) {
                    i18 = i21;
                }
            }
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                int i25 = i24 - i19;
                int i26 = iArr[i24] * i25 * i25;
                if (i26 > i23) {
                    i22 = i24;
                    i23 = i26;
                }
            }
            if (i19 <= i22) {
                int i27 = i19;
                i19 = i22;
                i22 = i27;
            }
            if (i19 - i22 <= length / 16) {
                throw lb.e.a();
            }
            int i28 = i19 - 1;
            int i29 = i28;
            int i30 = -1;
            while (i28 > i22) {
                int i31 = i28 - i22;
                int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                if (i32 > i30) {
                    i29 = i28;
                    i30 = i32;
                }
                i28--;
            }
            int i33 = i29 << 3;
            byte[] a2 = dVar.a();
            for (int i34 = 0; i34 < i11; i34++) {
                int i35 = i34 * i10;
                for (int i36 = 0; i36 < i10; i36++) {
                    if ((a2[i35 + i36] & 255) < i33) {
                        int i37 = (i36 / 32) + (bVar.c * i34);
                        int[] iArr2 = bVar.d;
                        iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                    }
                }
            }
            this.c = bVar;
        }
        return (mb.b) this.c;
    }

    public Pair o(int i10, c0 c0Var) {
        c0 c0Var2;
        r1 r1Var = (r1) this.b;
        c0 c0Var3 = null;
        if (c0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= r1Var.c.size()) {
                    c0Var2 = null;
                    break;
                }
                if (((c0) r1Var.c.get(i11)).d == c0Var.d) {
                    Object obj = c0Var.a;
                    Object obj2 = r1Var.b;
                    int i12 = h3.a.d;
                    c0Var2 = c0Var.b(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (c0Var2 == null) {
                return null;
            }
            c0Var3 = c0Var2;
        }
        return Pair.create(Integer.valueOf(i10 + r1Var.d), c0Var3);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int o1(int i10) {
        return ((SparseIntArray) this.b).get(i10);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        l8.c cVar = (l8.c) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (cVar.f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    public k p(Object... objArr) {
        Constructor c10;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    c10 = ((ia.l) this.b).c();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e9) {
                    throw new RuntimeException("Error instantiating extension", e9);
                }
            }
            c10 = null;
        }
        if (c10 == null) {
            return null;
        }
        try {
            return (k) c10.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    @Override // ld.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(ld.c cVar, tc.c cVar2) {
        ld.d dVar;
        int i10;
        b bVar;
        Throwable th;
        switch (this.a) {
            case 10:
                Object q6 = ((b) this.b).q(new ia.b0(cVar, (d0) this.c), cVar2);
                return q6 == sc.a.a ? q6 : pc.i.a;
            default:
                if (cVar2 instanceof ld.d) {
                    dVar = (ld.d) cVar2;
                    int i11 = dVar.b;
                    if ((i11 & TLObject.FLAG_31) != 0) {
                        dVar.b = i11 - TLObject.FLAG_31;
                        Object obj = dVar.a;
                        Object obj2 = sc.a.a;
                        i10 = dVar.b;
                        if (i10 != 0) {
                            k6.b(obj);
                            ld.b bVar2 = (ld.b) this.b;
                            dVar.d = this;
                            dVar.e = cVar;
                            dVar.b = 1;
                            obj = n.a(bVar2, cVar, dVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            bVar = this;
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                k6.b(obj);
                                return pc.i.a;
                            }
                            cVar = dVar.e;
                            bVar = dVar.d;
                            k6.b(obj);
                        }
                        th = (Throwable) obj;
                        if (th != null) {
                            ia.z zVar = (ia.z) bVar.c;
                            dVar.d = null;
                            dVar.e = null;
                            dVar.b = 2;
                            if (zVar.a(cVar, th, dVar) == obj2) {
                                return obj2;
                            }
                        }
                        return pc.i.a;
                    }
                }
                dVar = new ld.d(this, cVar2);
                Object obj3 = dVar.a;
                Object obj22 = sc.a.a;
                i10 = dVar.b;
                if (i10 != 0) {
                }
                th = (Throwable) obj3;
                if (th != null) {
                }
                return pc.i.a;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int q0(int i10) {
        return N0(i10);
    }

    public void r(boolean z10, boolean z11, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        x3 x3Var = (x3) this.c;
        i9 i9Var = x3Var.e;
        i9.x1 = f10;
        h9 h9Var = i9Var.v0;
        if (h9Var != null) {
            h9Var.setSpeed(f10);
        }
        e4.a0(x3Var.l, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    public void s(o0.g gVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.c;
        a9.i iVar = (a9.i) this.b;
        int i10 = gVar.b;
        if (i10 != 0) {
            nVar.execute(new i3(iVar, i10));
        } else {
            nVar.execute(new a9.o(iVar, gVar.a, false, 29));
        }
    }

    public void t(n2.l lVar) {
        this.b = lVar;
        if (lVar.a() != null) {
            lVar.a().getClass();
            String str = lVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 16:
                try {
                    return n().toString();
                } catch (lb.e unused) {
                    return "";
                }
            case 28:
                return ((HashMap) this.b).toString();
            default:
                return super.toString();
        }
    }

    public w u(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i11 >= iArr.length) {
                d5.a.o("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new j();
            }
            if (i10 == iArr[i11]) {
                return ((a1[]) this.c)[i11];
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ boolean u0() {
        return false;
    }

    public void w(f3 f3Var) {
        try {
            D(f3Var, (o3) this.b);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(f3 f3Var, int i10, long j10) {
        try {
            n3 n3Var = (n3) ((o3) this.b).g();
            n3Var.c();
            o3.p((o3) n3Var.b, i10);
            o3 o3Var = (o3) n3Var.a();
            this.b = o3Var;
            if (j10 != 0) {
                n3 n3Var2 = (n3) o3Var.g();
                n3Var2.c();
                o3.r((o3) n3Var2.b, j10);
                o3Var = (o3) n3Var2.a();
            }
            D(f3Var, o3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void y(f3 f3Var, long j10, boolean z10) {
        o3 o3Var;
        try {
            e3 e3Var = (e3) f3Var.g();
            s3 s3Var = (s3) f3Var.o().g();
            s3Var.c();
            u3.n((u3) s3Var.b, z10);
            e3Var.c();
            f3.r((f3) e3Var.b, (u3) s3Var.a());
            f3 f3Var2 = (f3) e3Var.a();
            if (j10 == 0) {
                o3Var = (o3) this.b;
            } else {
                n3 n3Var = (n3) ((o3) this.b).g();
                n3Var.c();
                o3.r((o3) n3Var.b, j10);
                o3Var = (o3) n3Var.a();
            }
            D(f3Var2, o3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void z(f3 f3Var, int i10, long j10, boolean z10) {
        o3 o3Var;
        try {
            n3 n3Var = (n3) ((o3) this.b).g();
            n3Var.c();
            o3.p((o3) n3Var.b, i10);
            this.b = (o3) n3Var.a();
            e3 e3Var = (e3) f3Var.g();
            s3 s3Var = (s3) f3Var.o().g();
            s3Var.c();
            u3.n((u3) s3Var.b, z10);
            e3Var.c();
            f3.r((f3) e3Var.b, (u3) s3Var.a());
            f3 f3Var2 = (f3) e3Var.a();
            if (j10 == 0) {
                o3Var = (o3) this.b;
            } else {
                n3 n3Var2 = (n3) ((o3) this.b).g();
                n3Var2.c();
                o3.r((o3) n3Var2.b, j10);
                o3Var = (o3) n3Var2.a();
            }
            D(f3Var2, o3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public b(a5.n nVar) {
        this.a = 4;
        this.c = new e8();
        this.b = nVar;
        oa.b();
    }

    public b(Context context, o3 o3Var) {
        this.a = 23;
        t tVar = new t(5);
        try {
            q.b(context);
            tVar.c = q.a().c(u2.a.e).a("PLAY_BILLING_LIBRARY", new t2.c("proto"), new xa.a(15));
        } catch (Throwable unused) {
            tVar.b = true;
        }
        this.c = tVar;
        this.b = o3Var;
    }

    public b(n9.a[] aVarArr) {
        this.a = 25;
        this.b = aVarArr;
        this.c = new ab.a(16);
    }

    public b(mb.f fVar) {
        this.a = 16;
        this.b = fVar;
    }

    public b(d5.g gVar, SparseArray sparseArray) {
        this.a = 6;
        this.b = gVar;
        SparseBooleanArray sparseBooleanArray = gVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = gVar.a(i10);
            i3.a aVar = (i3.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.c = sparseArray2;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 2;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void c1(int i10, int i11) {
    }

    public b(int i10, int i11) {
        this.a = 2;
        this.b = new int[]{i10, i11};
        this.c = new float[]{0.0f, 1.0f};
    }

    public b(int i10, int i11, int i12) {
        this.a = 2;
        this.b = new int[]{i10, i11, i12};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(g gVar) {
        this.a = 18;
        this.c = gVar;
        this.b = new Rect();
    }

    public b(ia.l lVar) {
        this.a = 19;
        this.b = lVar;
        this.c = new AtomicBoolean(false);
    }
}

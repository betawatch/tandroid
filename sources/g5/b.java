package g5;

import a5.m;
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
import androidx.biometric.j;
import c2.t;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.clearcut.e;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f7.d7;
import f7.f8;
import g7.oa;
import g7.t6;
import g7.y5;
import h3.n1;
import h3.o1;
import h3.p1;
import h3.r1;
import h3.s1;
import ih.i4;
import ih.l9;
import ih.m9;
import j4.a1;
import j4.d0;
import j4.i0;
import j4.q;
import j4.y;
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
import l3.g;
import m3.k;
import m3.w;
import m5.c0;
import m5.f0;
import mc.i;
import n2.a0;
import n2.d;
import n5.e0;
import na.n;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import q5.f;
import q5.x;
import r0.j0;
import r0.m1;
import r0.o;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements i0, g, kd.b, s0, OnCompleteListener, o, s, m9.a, je.b, a0, b6 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i9) {
        this.a = i9;
    }

    public static String i(Class cls) {
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
                q5.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!q5.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i9 = 0; i9 < str2.length(); i9++) {
                        char charAt = str2.charAt(i9);
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

    public void A(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.p((x3) t10.b, l3Var);
            ((t) this.c).h((x3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void B(a4 a4Var) {
        try {
            t tVar = (t) this.c;
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.r((x3) t10.b, a4Var);
            tVar.h((x3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void C(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.s((x3) t10.b, b4Var);
            ((t) this.c).h((x3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.s0
    public Object D(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        i4.a aVar = (i4.a) ((s0) this.b).D(uri, oVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (i4.a) aVar.a(list);
    }

    public void E(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.b, g3Var);
            ((t) this.c).h((x3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void F(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.b, i3Var);
            ((t) this.c).h((x3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public ColorFilter H() {
        return f6.v3;
    }

    @Override // r0.o
    public m1 L0(View view, m1 m1Var) {
        m2.g gVar = (m2.g) this.c;
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
        for (int i9 = 0; i9 < childCount; i9++) {
            m1 b10 = j0.b(gVar.getChildAt(i9), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int N0(int i9) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i9);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : f6.w0(null, i9, false);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Paint O(String str) {
        return f6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public boolean a() {
        return f6.I.q();
    }

    @Override // je.b
    public je.a a1(we.b bVar) {
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

    @Override // j4.i0
    public void b(int i9, d0 d0Var, y yVar) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.c).i.c(new o1(this, n10, yVar, 0));
        }
    }

    @Override // j4.i0
    public void c(int i9, d0 d0Var, y yVar) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.c).i.c(new o1(this, n10, yVar, 1));
        }
    }

    @Override // j4.i0
    public void d(int i9, d0 d0Var, q qVar, y yVar, IOException iOException, boolean z10) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.c).i.c(new p1(this, n10, qVar, yVar, iOException, z10, 0));
        }
    }

    @Override // j4.i0
    public void e(int i9, d0 d0Var, q qVar, y yVar) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.c).i.c(new n1(this, n10, qVar, yVar, 2));
        }
    }

    @Override // j4.i0
    public void f(int i9, d0 d0Var, q qVar, y yVar) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.c).i.c(new n1(this, n10, qVar, yVar, 1));
        }
    }

    @Override // j4.i0
    public void g(int i9, d0 d0Var, q qVar, y yVar) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.c).i.c(new n1(this, n10, qVar, yVar, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    public d h() {
        if (((n2.l) this.b) != null) {
            return new d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public boolean j(int i9) {
        return ((d5.g) this.b).a.get(i9);
    }

    @Override // m9.a
    public StackTraceElement[] k(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        m9.a[] aVarArr = (m9.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i9 = 0; i9 < 1; i9++) {
            m9.a aVar = aVarArr[i9];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.k(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((v9.d) this.c).k(stackTraceElementArr2) : stackTraceElementArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n l(sa.a aVar) {
        String str;
        n eVar;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        n nVar = null;
        n c0Var = EnumSet.class.isAssignableFrom(cls) ? new c0(type, 5) : cls == EnumMap.class ? new e0(type, 2) : null;
        if (c0Var != null) {
            return c0Var;
        }
        na.d.f((ArrayList) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                t6 t6Var = qa.c.a;
                int i9 = 1;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e10) {
                    str = "Failed making constructor '" + qa.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + qa.c.e(e10);
                }
                eVar = str != null ? new e(str) : new n5.a0(declaredConstructor, i9);
            } catch (NoSuchMethodException unused) {
            }
            if (eVar == null) {
                return eVar;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                int i10 = 16;
                nVar = SortedSet.class.isAssignableFrom(cls) ? new v9.d(i10) : Set.class.isAssignableFrom(cls) ? new wa.a(i10) : Queue.class.isAssignableFrom(cls) ? new ya.b(i10) : new za.a(i10);
            } else if (Map.class.isAssignableFrom(cls)) {
                int i11 = 17;
                nVar = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new d7.u(i11) : ConcurrentMap.class.isAssignableFrom(cls) ? new v9.d(i11) : SortedMap.class.isAssignableFrom(cls) ? new wa.a(i11) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new sa.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new za.a(i11) : new ya.b(i11);
            }
            if (nVar != null) {
                return nVar;
            }
            String i12 = i(cls);
            if (i12 == null) {
                return new na.e(cls);
            }
            d7 d7Var = new d7();
            d7Var.a = i12;
            return d7Var;
        }
        eVar = null;
        if (eVar == null) {
        }
    }

    public lb.b m() {
        if (((lb.b) this.c) == null) {
            lb.f fVar = (lb.f) this.b;
            int[] iArr = fVar.c;
            kb.d dVar = fVar.a;
            int i9 = dVar.a;
            int i10 = dVar.b;
            lb.b bVar = new lb.b(i9, i10);
            if (fVar.b.length < i9) {
                fVar.b = new byte[i9];
            }
            for (int i11 = 0; i11 < 32; i11++) {
                iArr[i11] = 0;
            }
            for (int i12 = 1; i12 < 5; i12++) {
                byte[] b10 = dVar.b((i10 * i12) / 5, fVar.b);
                int i13 = (i9 * 4) / 5;
                for (int i14 = i9 / 5; i14 < i13; i14++) {
                    int i15 = (b10[i14] & 255) >> 3;
                    iArr[i15] = iArr[i15] + 1;
                }
            }
            int length = iArr.length;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length; i19++) {
                int i20 = iArr[i19];
                if (i20 > i16) {
                    i18 = i19;
                    i16 = i20;
                }
                if (i20 > i17) {
                    i17 = i20;
                }
            }
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < length; i23++) {
                int i24 = i23 - i18;
                int i25 = iArr[i23] * i24 * i24;
                if (i25 > i22) {
                    i21 = i23;
                    i22 = i25;
                }
            }
            if (i18 <= i21) {
                int i26 = i18;
                i18 = i21;
                i21 = i26;
            }
            if (i18 - i21 <= length / 16) {
                throw kb.e.a();
            }
            int i27 = i18 - 1;
            int i28 = i27;
            int i29 = -1;
            while (i27 > i21) {
                int i30 = i27 - i21;
                int i31 = (i17 - iArr[i27]) * (i18 - i27) * i30 * i30;
                if (i31 > i29) {
                    i28 = i27;
                    i29 = i31;
                }
                i27--;
            }
            int i32 = i28 << 3;
            byte[] a2 = dVar.a();
            for (int i33 = 0; i33 < i10; i33++) {
                int i34 = i33 * i9;
                for (int i35 = 0; i35 < i9; i35++) {
                    if ((a2[i34 + i35] & 255) < i32) {
                        int i36 = (i35 / 32) + (bVar.c * i33);
                        int[] iArr2 = bVar.d;
                        iArr2[i36] = iArr2[i36] | (1 << (i35 & 31));
                    }
                }
            }
            this.c = bVar;
        }
        return (lb.b) this.c;
    }

    public Pair n(int i9, d0 d0Var) {
        d0 d0Var2;
        r1 r1Var = (r1) this.b;
        d0 d0Var3 = null;
        if (d0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= r1Var.c.size()) {
                    d0Var2 = null;
                    break;
                }
                if (((d0) r1Var.c.get(i10)).d == d0Var.d) {
                    Object obj = d0Var.a;
                    Object obj2 = r1Var.b;
                    int i11 = h3.a.d;
                    d0Var2 = d0Var.b(Pair.create(obj2, obj));
                    break;
                }
                i10++;
            }
            if (d0Var2 == null) {
                return null;
            }
            d0Var3 = d0Var2;
        }
        return Pair.create(Integer.valueOf(i9 + r1Var.d), d0Var3);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void o(float f10, float f11, int i9, int i10) {
        f6.q(f10, f11, i9, i10);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        k8.c cVar = (k8.c) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (cVar.f) {
            cVar.e.remove(taskCompletionSource);
        }
    }

    public k p(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a2 = ((i3.i) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (k) a2.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int p0(int i9) {
        return N0(i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    @Override // kd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(kd.c cVar, sc.c cVar2) {
        kd.d dVar;
        int i9;
        b bVar;
        Throwable th;
        switch (this.a) {
            case 7:
                Object q10 = ((b) this.b).q(new ha.a0(cVar, (ha.c0) this.c), cVar2);
                return q10 == rc.a.a ? q10 : oc.i.a;
            default:
                if (cVar2 instanceof kd.d) {
                    dVar = (kd.d) cVar2;
                    int i10 = dVar.b;
                    if ((i10 & TLObject.FLAG_31) != 0) {
                        dVar.b = i10 - TLObject.FLAG_31;
                        Object obj = dVar.a;
                        Object obj2 = rc.a.a;
                        i9 = dVar.b;
                        if (i9 != 0) {
                            y5.b(obj);
                            kd.b bVar2 = (kd.b) this.b;
                            dVar.d = this;
                            dVar.e = cVar;
                            dVar.b = 1;
                            obj = kd.n.a(bVar2, cVar, dVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            bVar = this;
                        } else {
                            if (i9 != 1) {
                                if (i9 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y5.b(obj);
                                return oc.i.a;
                            }
                            cVar = dVar.e;
                            bVar = dVar.d;
                            y5.b(obj);
                        }
                        th = (Throwable) obj;
                        if (th != null) {
                            ha.y yVar = (ha.y) bVar.c;
                            dVar.d = null;
                            dVar.e = null;
                            dVar.b = 2;
                            if (yVar.a(cVar, th, dVar) == obj2) {
                                return obj2;
                            }
                        }
                        return oc.i.a;
                    }
                }
                dVar = new kd.d(this, cVar2);
                Object obj3 = dVar.a;
                Object obj22 = rc.a.a;
                i9 = dVar.b;
                if (i9 != 0) {
                }
                th = (Throwable) obj3;
                if (th != null) {
                }
                return oc.i.a;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int q1(int i9) {
        return ((SparseIntArray) this.b).get(i9);
    }

    public void r(boolean z10, boolean z11, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        ih.b4 b4Var = (ih.b4) this.c;
        m9 m9Var = b4Var.e;
        m9.x1 = f10;
        l9 l9Var = m9Var.v0;
        if (l9Var != null) {
            l9Var.setSpeed(f10);
        }
        i4.a0(b4Var.l, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    public void s(o0.f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.c;
        k5.i iVar = (k5.i) this.b;
        int i9 = fVar.b;
        if (i9 != 0) {
            oVar.execute(new m.i3(iVar, i9));
        } else {
            oVar.execute(new j(iVar, fVar.a, false, 28));
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

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ boolean t0() {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 14:
                try {
                    return m().toString();
                } catch (kb.e unused) {
                    return "";
                }
            case 26:
                return ((HashMap) this.b).toString();
            default:
                return super.toString();
        }
    }

    public w u(int i9) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i10 >= iArr.length) {
                d5.a.o("BaseMediaChunkOutput", "Unmatched track of type: " + i9);
                return new m3.j();
            }
            if (i9 == iArr[i10]) {
                return ((a1[]) this.c)[i10];
            }
            i10++;
        }
    }

    public void w(g3 g3Var) {
        try {
            E(g3Var, (p3) this.b);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(g3 g3Var, int i9, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i9);
            p3 p3Var = (p3) o3Var.a();
            this.b = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j10);
                p3Var = (p3) o3Var2.a();
            }
            E(g3Var, p3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void y(g3 g3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var = (o3) ((p3) this.b).g();
                o3Var.c();
                p3.r((p3) o3Var.b, j10);
                p3Var = (p3) o3Var.a();
            }
            E(g3Var2, p3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void z(g3 g3Var, int i9, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i9);
            this.b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j10);
                p3Var = (p3) o3Var2.a();
            }
            E(g3Var2, p3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public /* synthetic */ b(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    public b(m mVar) {
        this.a = 1;
        this.c = new f8();
        this.b = mVar;
        oa.b();
    }

    public b(Context context, p3 p3Var) {
        this.a = 24;
        t tVar = new t(5);
        try {
            w2.q.b(context);
            tVar.c = w2.q.a().c(u2.a.e).a("PLAY_BILLING_LIBRARY", new t2.c("proto"), new za.a(15));
        } catch (Throwable unused) {
            tVar.b = true;
        }
        this.c = tVar;
        this.b = p3Var;
    }

    public b(m9.a[] aVarArr) {
        this.a = 21;
        this.b = aVarArr;
        this.c = new v9.d(15);
    }

    public b(lb.f fVar) {
        this.a = 14;
        this.b = fVar;
    }

    public b(d5.g gVar, SparseArray sparseArray) {
        this.a = 8;
        this.b = gVar;
        SparseBooleanArray sparseBooleanArray = gVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i9 = 0; i9 < sparseBooleanArray.size(); i9++) {
            int a2 = gVar.a(i9);
            i3.a aVar = (i3.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.c = sparseArray2;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 3;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i9 = 0; i9 < size; i9++) {
            ((int[]) this.b)[i9] = ((Integer) arrayList.get(i9)).intValue();
            ((float[]) this.c)[i9] = ((Float) arrayList2.get(i9)).floatValue();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ void c1(int i9, int i10) {
    }

    public b(int i9, int i10) {
        this.a = 3;
        this.b = new int[]{i9, i10};
        this.c = new float[]{0.0f, 1.0f};
    }

    public b(int i9, int i10, int i11) {
        this.a = 3;
        this.b = new int[]{i9, i10, i11};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(m2.g gVar) {
        this.a = 17;
        this.c = gVar;
        this.b = new Rect();
    }

    public b(i3.i iVar) {
        this.a = 18;
        this.b = iVar;
        this.c = new AtomicBoolean(false);
    }
}

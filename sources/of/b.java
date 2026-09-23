package of;

import a3.h0;
import a3.j0;
import a3.l0;
import ai.e6;
import ai.ic;
import ai.jc;
import ai.q5;
import ai.v5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.FrameLayout;
import b2.q;
import b2.s0;
import b2.x1;
import c5.f0;
import c5.o;
import c6.e0;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import d6.j;
import e2.d0;
import e2.v;
import e9.g0;
import e9.i0;
import g6.n;
import g6.w;
import i4.i;
import ii.c4;
import ii.i1;
import ii.k3;
import ii.k4;
import ii.r;
import ii.u3;
import ii.v3;
import j$.util.Objects;
import j4.a0;
import j4.b0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.p0;
import n2.p;
import n4.y;
import n7.a1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.PhotoViewer;
import p4.x;
import p4.z;
import t7.u;
import u2.t;
import v7.m8;
import v7.r6;
import w7.c9;
import z3.l;
import z3.m;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public class b implements h, f0, s, OnCompleteListener, com.google.android.gms.internal.clearcut.h, cf.b, f6.a, g2.g, n, m, v3, a0, Continuation {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public static String E(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static b M() {
        b bVar;
        b bVar2 = d;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = d;
                if (bVar == null) {
                    bVar = new b(0);
                    d = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // z3.m
    public int A() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x03ab, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0117, code lost:
    
        if (")".equals(i4.a.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // z3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B(byte[] bArr, int i10, int i11, l lVar, e2.h hVar) {
        i4.c cVar;
        String str;
        String str2;
        String sb2;
        char c10;
        int i12;
        b bVar = this;
        v vVar = (v) bVar.b;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.d(vVar);
            while (!TextUtils.isEmpty(vVar.k(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ?? r42 = 0;
                int i13 = -1;
                char c11 = 65535;
                int i14 = 0;
                while (true) {
                    int i15 = 1;
                    if (c11 == 65535) {
                        i14 = vVar.b;
                        String k10 = vVar.k(StandardCharsets.UTF_8);
                        c11 = k10 == null ? (char) 0 : "STYLE".equals(k10) ? (char) 2 : k10.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        vVar.J(i14);
                        if (c11 == 0) {
                            c9.b(new aa.a(arrayList2), lVar, hVar);
                            return;
                        }
                        if (c11 == 1) {
                            while (!TextUtils.isEmpty(vVar.k(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str3 = null;
                            if (c11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                vVar.k(StandardCharsets.UTF_8);
                                i4.a aVar = (i4.a) bVar.c;
                                v vVar2 = aVar.a;
                                StringBuilder sb3 = aVar.b;
                                sb3.setLength(0);
                                int i16 = vVar.b;
                                while (!TextUtils.isEmpty(vVar.k(StandardCharsets.UTF_8))) {
                                }
                                vVar2.H(vVar.b, vVar.a);
                                vVar2.J(i16);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    i4.a.c(vVar2);
                                    if (vVar2.a() >= 5 && "::cue".equals(vVar2.v(5, StandardCharsets.UTF_8))) {
                                        int i17 = vVar2.b;
                                        String b10 = i4.a.b(vVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                vVar2.J(i17);
                                                str2 = "";
                                            } else {
                                                if ("(".equals(b10)) {
                                                    int i18 = vVar2.b;
                                                    int i19 = vVar2.c;
                                                    boolean z10 = false;
                                                    while (i18 < i19 && !z10) {
                                                        int i20 = i18 + 1;
                                                        z10 = ((char) vVar2.a[i18]) == ')';
                                                        i18 = i20;
                                                    }
                                                    str = vVar2.v((i18 - 1) - vVar2.b, StandardCharsets.UTF_8).trim();
                                                } else {
                                                    str = str3;
                                                }
                                                str2 = str;
                                            }
                                            if (str2 == 0 && "{".equals(i4.a.b(vVar2, sb3))) {
                                                i4.b bVar2 = new i4.b();
                                                bVar2.a = "";
                                                bVar2.b = "";
                                                bVar2.c = Collections.EMPTY_SET;
                                                bVar2.d = "";
                                                bVar2.e = str3;
                                                bVar2.g = r42;
                                                bVar2.i = r42;
                                                bVar2.j = i13;
                                                bVar2.k = i13;
                                                bVar2.l = i13;
                                                bVar2.m = i13;
                                                bVar2.n = i13;
                                                bVar2.p = i13;
                                                bVar2.q = r42;
                                                if (!str2.isEmpty()) {
                                                    int indexOf = str2.indexOf(91);
                                                    String str4 = str2;
                                                    if (indexOf != i13) {
                                                        Matcher matcher = i4.a.c.matcher(str2.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i15);
                                                            group.getClass();
                                                            bVar2.d = group;
                                                        }
                                                        str4 = str2.substring(r42, indexOf);
                                                    }
                                                    String str5 = d0.a;
                                                    String[] split = str4.split("\\.", i13);
                                                    String str6 = split[r42];
                                                    int indexOf2 = str6.indexOf(35);
                                                    if (indexOf2 != i13) {
                                                        bVar2.b = str6.substring(r42, indexOf2);
                                                        bVar2.a = str6.substring(indexOf2 + 1);
                                                    } else {
                                                        bVar2.b = str6;
                                                    }
                                                    if (split.length > i15) {
                                                        int length = split.length;
                                                        e2.d.b(length <= split.length);
                                                        bVar2.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i15, length)));
                                                    }
                                                }
                                                String str7 = str3;
                                                boolean z11 = false;
                                                while (!z11) {
                                                    int i21 = vVar2.b;
                                                    str7 = i4.a.b(vVar2, sb3);
                                                    boolean z12 = str7 == null || "}".equals(str7);
                                                    if (!z12) {
                                                        vVar2.J(i21);
                                                        i4.a.c(vVar2);
                                                        String a2 = i4.a.a(vVar2, sb3);
                                                        if (!a2.isEmpty() && ":".equals(i4.a.b(vVar2, sb3))) {
                                                            i4.a.c(vVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z13 = false;
                                                            while (true) {
                                                                if (z13) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i22 = vVar2.b;
                                                                    String b11 = i4.a.b(vVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        vVar2.J(i22);
                                                                        z13 = true;
                                                                    } else {
                                                                        sb4.append(b11);
                                                                    }
                                                                }
                                                            }
                                                            if (sb2 != null && !sb2.isEmpty()) {
                                                                int i23 = vVar2.b;
                                                                String b12 = i4.a.b(vVar2, sb3);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        vVar2.J(i23);
                                                                    }
                                                                }
                                                                if ("color".equals(a2)) {
                                                                    bVar2.f = e2.f.a(sb2, true);
                                                                    bVar2.g = true;
                                                                } else if ("background-color".equals(a2)) {
                                                                    bVar2.h = e2.f.a(sb2, true);
                                                                    bVar2.i = true;
                                                                } else if ("ruby-position".equals(a2)) {
                                                                    if ("over".equals(sb2)) {
                                                                        bVar2.p = 1;
                                                                    } else if ("under".equals(sb2)) {
                                                                        bVar2.p = 2;
                                                                    }
                                                                } else if ("text-combine-upright".equals(a2)) {
                                                                    bVar2.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                } else if ("text-decoration".equals(a2)) {
                                                                    if ("underline".equals(sb2)) {
                                                                        bVar2.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(a2)) {
                                                                    bVar2.e = r6.b(sb2);
                                                                } else if ("font-weight".equals(a2)) {
                                                                    if ("bold".equals(sb2)) {
                                                                        bVar2.l = 1;
                                                                    }
                                                                } else if ("font-style".equals(a2)) {
                                                                    if ("italic".equals(sb2)) {
                                                                        bVar2.m = 1;
                                                                    }
                                                                } else if ("font-size".equals(a2)) {
                                                                    Matcher matcher2 = i4.a.d.matcher(r6.b(sb2));
                                                                    if (matcher2.matches()) {
                                                                        String group2 = matcher2.group(2);
                                                                        group2.getClass();
                                                                        switch (group2.hashCode()) {
                                                                            case 37:
                                                                                if (group2.equals("%")) {
                                                                                    c10 = 0;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3240:
                                                                                if (group2.equals("em")) {
                                                                                    c10 = 1;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3592:
                                                                                if (group2.equals("px")) {
                                                                                    c10 = 2;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        c10 = 65535;
                                                                        switch (c10) {
                                                                            case 0:
                                                                                i12 = 1;
                                                                                bVar2.n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i12 = 1;
                                                                                bVar2.n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i12 = 1;
                                                                                bVar2.n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String group3 = matcher2.group(i12);
                                                                        group3.getClass();
                                                                        bVar2.o = Float.parseFloat(group3);
                                                                        z11 = z12;
                                                                    } else {
                                                                        e2.a.n("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z11 = z12;
                                                }
                                                if ("}".equals(str7)) {
                                                    arrayList3.add(bVar2);
                                                }
                                                r42 = 0;
                                                i13 = -1;
                                                str3 = null;
                                                i15 = 1;
                                            }
                                        }
                                    }
                                    str2 = str3;
                                    if (str2 == 0) {
                                    }
                                }
                            } else if (c11 == 3) {
                                Pattern pattern = i4.h.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String k11 = vVar.k(charset);
                                if (k11 == null) {
                                    cVar = null;
                                } else {
                                    Pattern pattern2 = i4.h.a;
                                    Matcher matcher3 = pattern2.matcher(k11);
                                    if (matcher3.matches()) {
                                        cVar = i4.h.d(null, matcher3, vVar, arrayList);
                                    } else {
                                        cVar = null;
                                        String k12 = vVar.k(charset);
                                        if (k12 != null) {
                                            Matcher matcher4 = pattern2.matcher(k12);
                                            if (matcher4.matches()) {
                                                cVar = i4.h.d(k11.trim(), matcher4, vVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVar != null) {
                                    arrayList2.add(cVar);
                                }
                            }
                            bVar = this;
                        }
                    }
                }
            }
        } catch (s0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public c5.e C() {
        if (((o) this.b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override // ii.v3
    public o70 D(View view) {
        r rVar = (r) this.c;
        o70 o70Var = new o70(rVar, (d6) this.b, view, false, false, true);
        rVar.H = o70Var;
        return o70Var;
    }

    @Override // ii.v3
    public void F() {
        r rVar = (r) this.c;
        rVar.X();
        rVar.Y();
    }

    @Override // cf.b
    public cf.a F1(a1 a1Var) {
        List list = (List) this.c;
        List list2 = (List) a1Var.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new ed.i(a1Var, (List) this.b, list);
    }

    public boolean G(int i10) {
        return ((q) this.b).a.get(i10);
    }

    @Override // ii.v3
    public void H(u3 u3Var, View view) {
        r rVar = (r) this.c;
        o70 o70Var = new o70(rVar, (d6) this.b, view, false, false, true);
        o70Var.Q = true;
        rVar.H = k4.c(o70Var, rVar.b.f0, rVar.getContext(), (d6) this.b, u3Var, true);
    }

    public void I(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new j0(this, gVar, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory J(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e7) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e7);
            return null;
        } catch (InstantiationException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fb.n K(kb.a aVar) {
        String str;
        fb.n vVar;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        int i10 = 18;
        fb.n nVar = null;
        fb.n mVar = EnumSet.class.isAssignableFrom(cls) ? new a6.m(type, i10) : cls == EnumMap.class ? new xa.c(type, 19) : null;
        if (mVar != null) {
            return mVar;
        }
        fb.d.f((ArrayList) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                m8 m8Var = ib.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + ib.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + ib.c.e(e);
                }
                vVar = str != null ? new ee.v(str, 1) : new a4.m(declaredConstructor, 13);
            } catch (NoSuchMethodException unused) {
            }
            if (vVar == null) {
                return vVar;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                int i11 = 8;
                nVar = SortedSet.class.isAssignableFrom(cls) ? new na.d(i11) : Set.class.isAssignableFrom(cls) ? new ob.a(i11) : Queue.class.isAssignableFrom(cls) ? new qb.b(i11) : new rb.a(i11);
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    nVar = new u();
                } else {
                    int i12 = 9;
                    nVar = ConcurrentMap.class.isAssignableFrom(cls) ? new na.d(i12) : SortedMap.class.isAssignableFrom(cls) ? new ob.a(i12) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new kb.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new rb.a(i12) : new qb.b(i12);
                }
            }
            if (nVar != null) {
                return nVar;
            }
            String E = E(cls);
            return E != null ? new com.google.android.gms.internal.clearcut.e(E) : new a6.i(cls, i10);
        }
        vVar = null;
        if (vVar == null) {
        }
    }

    public dc.b L() {
        if (((dc.b) this.c) == null) {
            dc.f fVar = (dc.f) this.b;
            int[] iArr = fVar.c;
            cc.d dVar = fVar.a;
            int i10 = dVar.a;
            int i11 = dVar.b;
            dc.b bVar = new dc.b(i10, i11);
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
                throw cc.e.a();
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
        return (dc.b) this.c;
    }

    public String N(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean O() {
        return ((a) ((lf.i) this.b).d) != null;
    }

    public void P(Exception exc, boolean z10) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        i0 v = i0.v(hashSet);
        hashSet.clear();
        g0 listIterator = v.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    public void Q(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        v5 v5Var = (v5) this.c;
        jc jcVar = v5Var.e;
        jc.B1 = f7;
        ic icVar = jcVar.z0;
        if (icVar != null) {
            icVar.setSpeed(f7);
        }
        e6.a0(v5Var.l, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    public void R(n2.b bVar) {
        ((HashSet) this.b).add(bVar);
        if (((n2.b) this.c) != null) {
            return;
        }
        this.c = bVar;
        p m10 = bVar.b.m();
        bVar.x = m10;
        android.support.v4.media.session.f fVar = bVar.r;
        String str = d0.a;
        m10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(t.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
    }

    public void S(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new h0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    public void T(g gVar) {
        d dVar;
        g gVar2;
        int i10;
        Log.d("CAST_CONTROLLER", "set current media");
        lf.i iVar = (lf.i) this.b;
        g gVar3 = (g) iVar.c;
        if (b5.d.u()) {
            if (gVar3 == null && gVar == null) {
                return;
            }
            if (gVar3 != null) {
                ArrayList arrayList = gVar3.a;
                if (gVar != null && arrayList.size() == gVar.a.size()) {
                    while (i10 < arrayList.size()) {
                        f a2 = gVar3.a(i10);
                        f a10 = gVar.a(i10);
                        i10 = ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.a, a10.a) && Objects.equals(a2.b, a10.b) && Objects.equals(a2.c, a10.c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f == a10.f)) ? i10 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) iVar.d) != null && gVar != null) {
            iVar.r(gVar);
        }
        if (((a) iVar.d) != null && (gVar2 = (g) iVar.c) != null) {
            iVar.T(gVar2);
        }
        if (gVar != null && gVar.a.size() > 0 && !gVar.a(0).a.startsWith("audio/") && (dVar = (d) iVar.b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) iVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        iVar.c = gVar;
    }

    public void U(o oVar) {
        this.b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    public void V(d6.c cVar) {
        lf.i iVar = (lf.i) this.b;
        if (cVar == null) {
            return;
        }
        n6.l.e("Must be called from the main thread.");
        e6.h hVar = cVar.j;
        String a2 = cVar.a();
        if (TextUtils.isEmpty(a2) || hVar == null) {
            return;
        }
        a aVar = (a) iVar.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a2)) {
            iVar.W(new a(cVar, (d6.g) this.c, hVar));
            n6.l.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer t12 = PhotoViewer.t1();
            d.i();
            if (t12.E == null || t12.e0 == null || !t12.Q1()) {
                return;
            }
            new xc(t12.e0, new ai.d()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? LocaleController.formatString(R.string.ChromecastStartedTo, str) : LocaleController.getString(R.string.ChromecastStarted)).j();
        }
    }

    public void W(x1 x1Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a1.e(2, this, x1Var));
        }
    }

    public void X(g3 g3Var) {
        try {
            e0(g3Var, (p3) this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Y(g3 g3Var, int i10, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j3);
                p3Var = (p3) o3Var2.a();
            }
            e0(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Z(g3 g3Var, long j3, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var = (o3) ((p3) this.b).g();
                o3Var.c();
                p3.r((p3) o3Var.b, j3);
                p3Var = (p3) o3Var.a();
            }
            e0(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // j4.a0
    public void a(v vVar) {
        j4.d0 d0Var = (j4.d0) this.c;
        SparseArray sparseArray = d0Var.h;
        a4.h hVar = (a4.h) this.b;
        if (vVar.x() == 0 && (vVar.x() & 128) != 0) {
            vVar.K(6);
            int a2 = vVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                vVar.h(0, 4, hVar.b);
                hVar.q(0);
                int i11 = hVar.i(16);
                hVar.t(3);
                if (i11 == 0) {
                    hVar.t(13);
                } else {
                    int i12 = hVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new b0(new e0.i0(d0Var, i12)));
                        d0Var.n++;
                    }
                }
            }
            if (d0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void a0(g3 g3Var, int i10, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i10);
            this.b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j3);
                p3Var = (p3) o3Var2.a();
            }
            e0(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        e0 e0Var = (e0) this.b;
        String str = (String) this.c;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        n6.l.j("Not connected to device", e0Var.F == 2);
        g6.f fVar = (g6.f) wVar.u();
        Parcel O0 = fVar.O0();
        O0.writeString(str);
        fVar.T0(O0, 5);
        synchronized (e0Var.s) {
            try {
                if (e0Var.p != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b0(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.p((x3) t10.b, l3Var);
            ((b2.p) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // d6.h
    public void c(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public void c0(a4 a4Var) {
        try {
            b2.p pVar = (b2.p) this.c;
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.r((x3) t10.b, a4Var);
            pVar.i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.n((Context) this.b, ((g2.o) this.c).createDataSource());
    }

    @Override // ii.v3
    public void d(ii.w3 w3Var, View view) {
        r rVar = (r) this.c;
        o70 o70Var = new o70(rVar, (d6) this.b, view, false, false, true);
        o70Var.Q = true;
        n2 n2Var = rVar.b.f0;
        rVar.getContext();
        rVar.H = k4.b(o70Var, n2Var, w3Var, true);
    }

    public void d0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.s((x3) t10.b, b4Var);
            ((b2.p) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // ii.v3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(float f7) {
        boolean z10;
        c4 c4Var = ((r) this.c).s;
        if (c4Var != null) {
            FrameLayout frameLayout = c4Var.H;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f7 >= r4[1]) {
                    z10 = true;
                    c4Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            c4Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    public void e0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.b, g3Var);
            ((b2.p) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // d6.h
    public void f(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void f0(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.b, i3Var);
            ((b2.p) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // ii.v3
    public void g(ii.e6 e6Var, String str) {
        r rVar = (r) this.c;
        if (rVar.v == null) {
            d6 d6Var = (d6) this.b;
            rVar.v = new m.p3(new ah.b(16, this, d6Var), d6Var);
        }
        rVar.v.d(e6Var, str);
    }

    @Override // ii.v3
    public void h(int i10) {
        r.O((r) this.c, 74, i10);
    }

    @Override // d6.h
    public void i(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    @Override // d6.h
    public void j(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((lf.i) this.b).W(null);
    }

    @Override // d6.h
    public void k(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        V(cVar);
    }

    @Override // ii.v3
    public void l() {
        r rVar = (r) this.c;
        ii.x3 x3Var = rVar.r;
        c4 c4Var = rVar.s;
        if (c4Var != null) {
            k3 k3Var = x3Var.n3;
            int i10 = (k3Var != null && k3Var.y() && x3Var.C4()) ? 1 : 0;
            if (c4Var.a0 == 2) {
                c4Var.b0 = i10;
            } else {
                c4Var.f(i10, true);
            }
            if (i10 != 0) {
                rVar.W();
            }
        }
        rVar.Z();
    }

    @Override // d6.h
    public void m(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override // f6.a
    public void n(Bitmap bitmap) {
        y yVar = (y) this.b;
        yVar.c = bitmap;
        f6.g gVar = (f6.g) this.c;
        gVar.l = yVar;
        gVar.b();
    }

    @Override // ii.v3
    public void o() {
        c4 c4Var = ((r) this.c).s;
        if (c4Var != null) {
            int i10 = c4Var.a0;
            if (i10 == 2) {
                i10 = 0;
            }
            c4Var.b0 = i10;
            c4Var.e(false, false);
            c4Var.f(2, true);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z10;
        d6.b bVar;
        com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.b;
        d6.b bVar2 = (d6.b) this.c;
        x xVar = rVar.c;
        g6.b bVar3 = com.google.android.gms.internal.cast.r.j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
            if (z11) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                boolean z12 = !z10 && bVar2.x;
                if (xVar != null || (bVar = rVar.d) == null) {
                }
                boolean z13 = bVar.v;
                boolean z14 = bVar.s;
                p4.y yVar = new p4.y();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    yVar.b = z12;
                }
                if (i10 >= 30) {
                    yVar.d = z13;
                }
                if (i10 >= 30) {
                    yVar.c = z14;
                }
                x.i(new z(yVar));
                Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                if (z13) {
                    com.google.android.gms.internal.cast.u uVar = rVar.f;
                    n6.l.h(uVar);
                    com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                    x.b();
                    x.c().f = qVar;
                    f2.a(f1.b0);
                    return;
                }
                return;
            }
        }
        z10 = true;
        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
        if (z10) {
        }
        if (xVar != null) {
        }
    }

    @Override // ii.v3
    public void onContentChanged() {
        r rVar = (r) this.c;
        c4 c4Var = rVar.s;
        if (c4Var != null) {
            c4Var.setSendLoading(rVar.r.m3());
        }
        rVar.V(true);
        rVar.Y();
        ii.d dVar = rVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override // g6.n
    public void p(String str, long j3, long j10, long j11) {
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.p(str, j3, j10, j11);
        }
    }

    @Override // ii.v3
    public void q(ii.a aVar) {
        r rVar = (r) this.c;
        wi wiVar = rVar.b;
        n2 n2Var = wiVar.f0;
        if (n2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(n2Var)) {
            wi wiVar2 = new wi(rVar.getContext(), wiVar.f0, false, false, false, null);
            wiVar2.Z1 = new ob.a(11);
            wiVar2.P = true;
            wiVar2.x1.setVisibility(8);
            wiVar2.t2 = new q5(rVar, aVar, wiVar2, 10);
            wiVar2.r1();
            wiVar2.show();
        }
    }

    @Override // z3.m
    public /* synthetic */ z3.d r(int i10, int i11, byte[] bArr) {
        return w.c.a(this, bArr, i11);
    }

    @Override // ii.v3
    public void s() {
        r rVar = (r) this.c;
        if (rVar.getCurrentItemTop() != rVar.I) {
            rVar.b.X1(rVar, 0);
        }
        rVar.a0();
        r.K(rVar);
    }

    @Override // ii.v3
    public void t(i1 i1Var, boolean z10) {
        ((r) this.c).b.t1(i1Var, z10);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.b;
        Bundle bundle = (Bundle) this.c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : aVar.a(bundle).onSuccessTask(j6.m.a, j6.b.b);
    }

    public String toString() {
        switch (this.a) {
            case 10:
                try {
                    return L().toString();
                } catch (cc.e unused) {
                    return "";
                }
            case 17:
                return ((HashMap) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // ii.v3
    public void u(int i10) {
        r rVar = (r) this.c;
        rVar.b.X1(rVar, i10);
        rVar.a0();
        r.K(rVar);
    }

    @Override // d6.h
    public void v(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    @Override // d6.h
    public void w(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        V(cVar);
    }

    @Override // d6.h
    public void x(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override // g6.n
    public void y(String str, long j3, int i10, Object obj, long j10, long j11) {
        ((g6.m) this.c).g = null;
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.y(str, j3, i10, obj, j10, j11);
        }
    }

    @Override // ii.v3
    public void z() {
        c4 c4Var = ((r) this.c).s;
        if (c4Var != null) {
            c4Var.e(false, true);
            int i10 = c4Var.b0;
            c4Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.c;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue() : false ? bVar.b() : bVar.e;
        if (b10 == null) {
            synchronized (bVar.d) {
                try {
                    HashMap hashMap = bVar.e;
                    b10 = hashMap;
                    if (hashMap == null) {
                        HashMap b11 = bVar.b();
                        bVar.e = b11;
                        b10 = b11;
                    }
                } finally {
                }
            }
        }
        if (b10 == null) {
            b10 = Collections.EMPTY_MAP;
        }
        return (String) b10.get(dVar.b);
    }

    public /* synthetic */ b(int i10, boolean z10) {
        this.a = i10;
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = null;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.a = 8;
        b2.p pVar = new b2.p(1);
        try {
            l5.t.b(context);
            pVar.c = l5.t.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new rb.a(5));
        } catch (Throwable unused) {
            pVar.b = true;
        }
        this.c = pVar;
        this.b = p3Var;
    }

    public b(dc.f fVar) {
        this.a = 10;
        this.b = fVar;
    }

    public b(int i10) {
        this.a = i10;
        switch (i10) {
            case 21:
                this.b = new v();
                this.c = new i4.a();
                break;
            case 28:
                this.b = new HashSet();
                break;
            default:
                d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
                p0 p0Var = new p0(24);
                c10.getClass();
                n6.l.e("Must be called from the main thread.");
                d6.g gVar = c10.c;
                gVar.getClass();
                boolean z10 = false;
                try {
                    d6.y yVar = gVar.a;
                    j jVar = new j(p0Var);
                    Parcel O0 = yVar.O0();
                    com.google.android.gms.internal.cast.v.d(O0, jVar);
                    yVar.S0(O0, 4);
                } catch (RemoteException e) {
                    d6.g.c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
                }
                this.b = new lf.i(11, z10);
                d6.g b10 = c10.b();
                this.c = b10;
                b10.a(this);
                V(b10.c());
                break;
        }
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    public b(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 26:
                this.b = context == null ? null : context.getApplicationContext();
                break;
            case 29:
                n6.l.h(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(org.telegram.messenger.beta.R.string.common_google_play_services_unknown_issue);
                break;
            default:
                g2.o oVar = new g2.o();
                this.b = context.getApplicationContext();
                this.c = oVar;
                break;
        }
    }

    public b(q qVar, SparseArray sparseArray) {
        this.a = 23;
        this.b = qVar;
        SparseBooleanArray sparseBooleanArray = qVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = qVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.c = sparseArray2;
    }

    public b(Handler handler, l0 l0Var) {
        this.a = 1;
        if (l0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = l0Var;
    }

    public b(Animator animator) {
        this.a = 4;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 20;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.a = 20;
        this.b = new int[]{i10, i11};
        this.c = new float[]{0.0f, 1.0f};
    }

    @Override // j4.a0
    public void b(e2.b0 b0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public b(int i10, int i11, int i12) {
        this.a = 20;
        this.b = new int[]{i10, i11, i12};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(e9.a1 a1Var, int[] iArr) {
        this.a = 15;
        this.b = i0.v(a1Var);
        this.c = iArr;
    }

    public b(j4.d0 d0Var) {
        this.a = 24;
        this.c = d0Var;
        this.b = new a4.h(new byte[4], 4);
    }
}

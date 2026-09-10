package n4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.s0;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.Status;
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
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import hi.j0;
import hi.j1;
import hi.k1;
import hi.l0;
import hi.m0;
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
import n7.a1;
import org.telegram.ui.Cells.s9;
import p4.t0;
import v7.p8;
import v7.r6;
import w7.c9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class y implements OnCompleteListener, c5.f0, com.google.android.gms.common.api.internal.s, com.google.android.gms.internal.clearcut.h, cf.b, f6.a, g2.g, g6.n, j1, z3.m, j4.b0, Continuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ y(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static String e(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static void i(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = y.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
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
    public void A(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
        i4.c cVar;
        String str;
        String str2;
        String sb2;
        char c10;
        int i12;
        y yVar = this;
        e2.v vVar = (e2.v) yVar.b;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        ArrayList arrayList = new ArrayList();
        try {
            i4.i.d(vVar);
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
                                i4.a aVar = (i4.a) yVar.c;
                                e2.v vVar2 = aVar.a;
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
                                                i4.b bVar = new i4.b();
                                                bVar.a = "";
                                                bVar.b = "";
                                                bVar.c = Collections.EMPTY_SET;
                                                bVar.d = "";
                                                bVar.e = str3;
                                                bVar.g = r42;
                                                bVar.i = r42;
                                                bVar.j = i13;
                                                bVar.k = i13;
                                                bVar.l = i13;
                                                bVar.m = i13;
                                                bVar.n = i13;
                                                bVar.p = i13;
                                                bVar.q = r42;
                                                if (!str2.isEmpty()) {
                                                    int indexOf = str2.indexOf(91);
                                                    String str4 = str2;
                                                    if (indexOf != i13) {
                                                        Matcher matcher = i4.a.c.matcher(str2.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i15);
                                                            group.getClass();
                                                            bVar.d = group;
                                                        }
                                                        str4 = str2.substring(r42, indexOf);
                                                    }
                                                    String str5 = e2.d0.a;
                                                    String[] split = str4.split("\\.", i13);
                                                    String str6 = split[r42];
                                                    int indexOf2 = str6.indexOf(35);
                                                    if (indexOf2 != i13) {
                                                        bVar.b = str6.substring(r42, indexOf2);
                                                        bVar.a = str6.substring(indexOf2 + 1);
                                                    } else {
                                                        bVar.b = str6;
                                                    }
                                                    if (split.length > i15) {
                                                        int length = split.length;
                                                        e2.d.b(length <= split.length);
                                                        bVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i15, length)));
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
                                                                    bVar.f = e2.f.a(sb2, true);
                                                                    bVar.g = true;
                                                                } else if ("background-color".equals(a2)) {
                                                                    bVar.h = e2.f.a(sb2, true);
                                                                    bVar.i = true;
                                                                } else if ("ruby-position".equals(a2)) {
                                                                    if ("over".equals(sb2)) {
                                                                        bVar.p = 1;
                                                                    } else if ("under".equals(sb2)) {
                                                                        bVar.p = 2;
                                                                    }
                                                                } else if ("text-combine-upright".equals(a2)) {
                                                                    bVar.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                } else if ("text-decoration".equals(a2)) {
                                                                    if ("underline".equals(sb2)) {
                                                                        bVar.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(a2)) {
                                                                    bVar.e = r6.b(sb2);
                                                                } else if ("font-weight".equals(a2)) {
                                                                    if ("bold".equals(sb2)) {
                                                                        bVar.l = 1;
                                                                    }
                                                                } else if ("font-style".equals(a2)) {
                                                                    if ("italic".equals(sb2)) {
                                                                        bVar.m = 1;
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
                                                                                bVar.n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i12 = 1;
                                                                                bVar.n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i12 = 1;
                                                                                bVar.n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String group3 = matcher2.group(i12);
                                                                        group3.getClass();
                                                                        bVar.o = Float.parseFloat(group3);
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
                                                    arrayList3.add(bVar);
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
                            yVar = this;
                        }
                    }
                }
            }
        } catch (s0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void B(g3 g3Var) {
        try {
            M(g3Var, (p3) this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void C(g3 g3Var, int i10, long j3) {
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
            M(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // hi.j1
    public void D(CharSequence charSequence) {
        ((l0) this.b).J(charSequence);
    }

    public void E(g3 g3Var, long j3, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var = (o3) ((p3) this.b).g();
                o3Var.c();
                p3.r((p3) o3Var.b, j3);
                p3Var = (p3) o3Var.a();
            }
            M(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // hi.j1
    public /* synthetic */ boolean F(k1 k1Var) {
        return false;
    }

    @Override // hi.j1
    public void G(Editable editable) {
        ((m0) this.c).i();
        ((l0) this.b).b0();
    }

    @Override // hi.j1
    public /* synthetic */ boolean H(boolean z10) {
        return false;
    }

    public void I(g3 g3Var, int i10, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i10);
            this.b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j3);
                p3Var = (p3) o3Var2.a();
            }
            M(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void J(l3 l3Var) {
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

    public void K(a4 a4Var) {
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

    public void L(b4 b4Var) {
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

    public void M(g3 g3Var, p3 p3Var) {
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

    public void N(i3 i3Var, p3 p3Var) {
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

    @Override // hi.j1
    public /* synthetic */ boolean P(k1 k1Var) {
        return false;
    }

    @Override // j4.b0
    public void a(e2.v vVar) {
        j4.e0 e0Var = (j4.e0) this.c;
        SparseArray sparseArray = e0Var.h;
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
                        sparseArray.put(i12, new j4.c0(new e0.i0(e0Var, i12)));
                        e0Var.n++;
                    }
                }
            }
            if (e0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        c6.e0 e0Var = (c6.e0) this.b;
        String str = (String) this.c;
        g6.w wVar = (g6.w) obj;
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

    @Override // hi.j1
    public void b(k1 k1Var) {
        ((l0) this.b).b(k1Var);
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.n((Context) this.b, ((g2.o) this.c).createDataSource());
    }

    public c5.e d() {
        if (((c5.o) this.b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override // hi.j1
    public boolean f() {
        return ((l0) this.b).R();
    }

    public boolean g(int i10) {
        return ((b2.q) this.b).a.get(i10);
    }

    @Override // hi.j1
    public void h(int i10, int i11) {
        ((l0) this.b).U(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory j(String str) {
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

    @Override // z3.m
    public /* synthetic */ z3.d k(int i10, int i11, byte[] bArr) {
        return w.f.a(this, bArr, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fb.n l(kb.a aVar) {
        String str;
        fb.n eVar;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        int i10 = 17;
        fb.n nVar = null;
        fb.n mVar = EnumSet.class.isAssignableFrom(cls) ? new a4.m(type, 15) : cls == EnumMap.class ? new pb.c(type, i10) : null;
        if (mVar != null) {
            return mVar;
        }
        fb.d.f((ArrayList) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                p8 p8Var = ib.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + ib.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + ib.c.e(e);
                }
                eVar = str != null ? new com.google.android.gms.internal.clearcut.e(str) : new a6.i(declaredConstructor, i10);
            } catch (NoSuchMethodException unused) {
            }
            if (eVar == null) {
                return eVar;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                int i11 = 8;
                nVar = SortedSet.class.isAssignableFrom(cls) ? new na.d(i11) : Set.class.isAssignableFrom(cls) ? new ob.a(i11) : Queue.class.isAssignableFrom(cls) ? new qb.b(i11) : new rb.a(i11);
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    nVar = new t7.u();
                } else {
                    int i12 = 9;
                    nVar = ConcurrentMap.class.isAssignableFrom(cls) ? new na.d(i12) : SortedMap.class.isAssignableFrom(cls) ? new ob.a(i12) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new kb.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new rb.a(i12) : new qb.b(i12);
                }
            }
            if (nVar != null) {
                return nVar;
            }
            String e7 = e(cls);
            return e7 != null ? new c5.i(e7) : new xa.c(cls, 18);
        }
        eVar = null;
        if (eVar == null) {
        }
    }

    @Override // g6.n
    public void m(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.b;
        if (nVar != null) {
            nVar.m(str, j3, j10, j11);
        }
    }

    @Override // z3.m
    public int n() {
        return 1;
    }

    public dc.b o() {
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

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z10;
        d6.b bVar;
        switch (this.a) {
            case 2:
                a9.e eVar = (a9.e) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (eVar.f) {
                    eVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.b;
                d6.b bVar2 = (d6.b) this.c;
                p4.x xVar = rVar.c;
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
                            return;
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
                        p4.x.i(new p4.z(yVar));
                        Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                        if (z13) {
                            com.google.android.gms.internal.cast.u uVar = rVar.f;
                            n6.l.h(uVar);
                            com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                            p4.x.b();
                            p4.x.c().f = qVar;
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
                    return;
                } else {
                    return;
                }
        }
    }

    public void p(Exception exc, boolean z10) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        e9.i0 v = e9.i0.v(hashSet);
        hashSet.clear();
        e9.g0 listIterator = v.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    public void q(n2.b bVar) {
        ((HashSet) this.b).add(bVar);
        if (((n2.b) this.c) != null) {
            return;
        }
        this.c = bVar;
        n2.q p5 = bVar.b.p();
        bVar.x = p5;
        android.support.v4.media.session.f fVar = bVar.r;
        String str = e2.d0.a;
        p5.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.u.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), p5)).sendToTarget();
    }

    @Override // hi.j1
    public void r(k1 k1Var, int i10, int i11) {
        s9 E;
        l0 l0Var = (l0) this.b;
        if (((m0) this.c).d || i10 == i11 || (E = l0Var.E()) == null) {
            return;
        }
        if (E.y() && E.W == l0Var.M()) {
            return;
        }
        k1Var.post(new j0(this, k1Var, i11, E, l0Var, i10));
    }

    @Override // f6.a
    public void s(Bitmap bitmap) {
        of.b bVar = (of.b) this.b;
        bVar.c = bitmap;
        f6.g gVar = (f6.g) this.c;
        gVar.l = bVar;
        gVar.b();
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
                    return o().toString();
                } catch (cc.e unused) {
                    return "";
                }
            case 17:
                return ((HashMap) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // cf.b
    public cf.a u(a1 a1Var) {
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

    public void v(p pVar, Handler handler) {
        r rVar = (r) this.b;
        synchronized (rVar.d) {
            rVar.m = pVar;
            rVar.a.setCallback(pVar.b, handler);
            pVar.C(rVar, handler);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void w(h0 h0Var) {
        r rVar = (r) this.b;
        rVar.g = h0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f.getBroadcastItem(beginBroadcast)).t(h0Var);
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            rVar.f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.a;
        if (h0Var.w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(h0Var.a, h0Var.b, h0Var.d, h0Var.n);
            builder.setBufferedPosition(h0Var.c);
            builder.setActions(h0Var.e);
            builder.setErrorMessage(h0Var.h);
            for (g0 g0Var : h0Var.r) {
                g0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(g0Var.a, g0Var.b, g0Var.c);
                builder2.setExtras(g0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(h0Var.s);
            if (Build.VERSION.SDK_INT >= 22) {
                f0.a(builder, h0Var.v);
            }
            h0Var.w = builder.build();
        }
        mediaSession.setPlaybackState(h0Var.w);
    }

    @Override // hi.j1
    public void x(k1 k1Var) {
        ((l0) this.b).g();
    }

    @Override // g6.n
    public void y(String str, long j3, int i10, Object obj, long j10, long j11) {
        ((g6.m) this.c).g = null;
        g6.n nVar = (g6.n) this.b;
        if (nVar != null) {
            nVar.y(str, j3, i10, obj, j10, j11);
        }
    }

    public void z(c5.o oVar) {
        this.b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.c = str;
            }
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

    public /* synthetic */ y(int i10, boolean z10) {
        this.a = i10;
    }

    public /* synthetic */ y(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = null;
    }

    public /* synthetic */ y(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public y(Context context, p3 p3Var) {
        this.a = 8;
        b2.p pVar = new b2.p(1);
        try {
            l5.s.b(context);
            pVar.c = l5.s.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new qb.b(6));
        } catch (Throwable unused) {
            pVar.b = true;
        }
        this.c = pVar;
        this.b = p3Var;
    }

    public y(dc.f fVar) {
        this.a = 10;
        this.b = fVar;
    }

    public y(int i10) {
        this.a = i10;
        switch (i10) {
            case 28:
                this.b = new HashSet();
                break;
            default:
                this.b = new e2.v();
                this.c = new i4.a();
                break;
        }
    }

    public y(Context context, int i10) {
        this.a = i10;
        switch (i10) {
            case 26:
                this.b = context == null ? null : context.getApplicationContext();
                break;
            default:
                g2.o oVar = new g2.o();
                this.b = context.getApplicationContext();
                this.c = oVar;
                break;
        }
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    @Override // hi.j1
    public /* synthetic */ void t() {
    }

    public y(b2.q qVar, SparseArray sparseArray) {
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

    public y(Animator animator) {
        this.a = 4;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public y(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 20;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public y(int i10, int i11) {
        this.a = 20;
        this.b = new int[]{i10, i11};
        this.c = new float[]{0.0f, 1.0f};
    }

    public y(int i10, int i11, int i12) {
        this.a = 20;
        this.b = new int[]{i10, i11, i12};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public y(a3.f fVar) {
        this.a = 1;
        this.c = fVar;
    }

    public y(e9.a1 a1Var, int[] iArr) {
        this.a = 15;
        this.b = e9.i0.v(a1Var);
        this.c = iArr;
    }

    public y(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                this.b = new u(context, str, bundle);
            } else if (i11 >= 28) {
                this.b = new t(context, str, bundle);
            } else if (i11 >= 22) {
                this.b = new s(context, str, bundle);
            } else {
                this.b = new r(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            v(new n(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((r) this.b).a.setMediaButtonReceiver(pendingIntent);
            this.c = new l2.h(context, this);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    @Override // j4.b0
    public void c(e2.b0 b0Var, c3.q qVar, j4.g0 g0Var) {
    }

    public y(j4.e0 e0Var) {
        this.a = 24;
        this.c = e0Var;
        this.b = new a4.h(new byte[4], 4);
    }
}

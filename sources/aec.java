// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class aec implements no7, uab, x74, f69, f9d, r24, OnCompleteListener, djd, x4d, Continuation {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public aec(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.c = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            case 9:
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = new xu7();
                this.c = new uuc();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c(Object obj, Object obj2) {
        boolean z;
        aia aiaVar;
        dmd dmdVar;
        aia aiaVar2;
        f84 f84Var;
        qx qxVar = (qx) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        qnd qndVar = (qnd) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        qndVar.getClass();
        w56 h = qxVar.h();
        u56 u56Var = h.b;
        u56Var.getClass();
        xme xmeVar = qndVar.B;
        f84[] f84VarArr = xmeVar == null ? null : xmeVar.b;
        if (f84VarArr != null) {
            int length = f84VarArr.length;
            ?? r11 = 0;
            while (true) {
                if (r11 >= length) {
                    f84Var = null;
                    break;
                }
                f84Var = f84VarArr[r11];
                if ("location_updates_with_callback".equals(f84Var.a)) {
                    break;
                } else {
                    r11++;
                }
            }
            if (f84Var != null && f84Var.b() >= 1) {
                z = true;
                aiaVar = qndVar.G;
                synchronized (aiaVar) {
                    try {
                        try {
                            dmd dmdVar2 = (dmd) qndVar.G.get(u56Var);
                            if (dmdVar2 == null || z) {
                                dmdVar = new dmd(qxVar);
                                qndVar.G.put(u56Var, dmdVar);
                            } else {
                                dmdVar2.U(h);
                                dmdVar = dmdVar2;
                                dmdVar2 = null;
                            }
                            int identityHashCode = System.identityHashCode(u56Var.a);
                            String str = u56Var.b;
                            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(identityHashCode).length());
                            sb.append(str);
                            sb.append("@");
                            sb.append(identityHashCode);
                            String sb2 = sb.toString();
                            if (z) {
                                z2f z2fVar = (z2f) qndVar.k();
                                if (dmdVar2 == null) {
                                    dmdVar2 = null;
                                }
                                bkd bkdVar = new bkd(null, taskCompletionSource);
                                Parcel R = z2fVar.R();
                                int i = rgd.a;
                                R.writeInt(1);
                                int r = jte.r(R, 20293);
                                jte.q(R, 1, 4);
                                R.writeInt(2);
                                jte.f(R, 2, dmdVar2);
                                jte.f(R, 3, dmdVar);
                                jte.l(R, 6, sb2);
                                jte.s(R, r);
                                R.writeInt(1);
                                locationRequest.writeToParcel(R, 0);
                                rgd.c(R, bkdVar);
                                z2fVar.V(R, 88);
                                aiaVar2 = aiaVar;
                            } else {
                                z2f z2fVar2 = (z2f) qndVar.k();
                                int i2 = locationRequest.a;
                                aiaVar2 = aiaVar;
                                long j = locationRequest.b;
                                long j2 = locationRequest.c;
                                long j3 = locationRequest.d;
                                long j4 = locationRequest.e;
                                int i3 = locationRequest.f;
                                float f = locationRequest.h;
                                boolean z2 = locationRequest.n;
                                long j5 = locationRequest.r;
                                int i4 = locationRequest.s;
                                int i5 = locationRequest.w;
                                String str2 = locationRequest.x;
                                boolean z3 = locationRequest.y;
                                WorkSource workSource = locationRequest.E;
                                bnd bndVar = locationRequest.F;
                                String str3 = Build.VERSION.SDK_INT < 30 ? null : str2;
                                if (j2 == -1) {
                                    j2 = j;
                                } else if (i2 != 105) {
                                    j2 = Math.min(j2, j);
                                }
                                jod jodVar = new jod(new LocationRequest(i2, j, j2, Math.max(j3, j), Long.MAX_VALUE, j4, i3, f, z2, j5 == -1 ? j : j5, i4, i5, str3, z3, new WorkSource(workSource), bndVar), null, false, false, null, false, false, null, Long.MAX_VALUE);
                                wkd wkdVar = new wkd(taskCompletionSource, dmdVar);
                                int i6 = dmd.c;
                                IInterface queryLocalInterface = dmdVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                                IInterface k7fVar = queryLocalInterface instanceof bbf ? (bbf) queryLocalInterface : new k7f(dmdVar, "com.google.android.gms.location.ILocationCallback", (byte) 5);
                                IInterface queryLocalInterface2 = wkdVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                                IInterface wheVar = queryLocalInterface2 instanceof gse ? (gse) queryLocalInterface2 : new whe(wkdVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 5);
                                Parcel R2 = z2fVar2.R();
                                int i7 = rgd.a;
                                R2.writeInt(1);
                                int r2 = jte.r(R2, 20293);
                                jte.q(R2, 1, 4);
                                R2.writeInt(1);
                                jte.k(R2, 2, jodVar, 0);
                                jte.f(R2, 5, k7fVar.asBinder());
                                jte.f(R2, 6, wheVar.asBinder());
                                jte.l(R2, 8, sb2);
                                jte.s(R2, r2);
                                z2fVar2.V(R2, 59);
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = aiaVar;
                        throw th;
                    }
                }
            }
        }
        z = false;
        aiaVar = qndVar.G;
        synchronized (aiaVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // x74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(float f, int i) {
        boolean z;
        fyc fycVar = (fyc) this.c;
        boolean z2 = true;
        if ((fycVar.c() == 0.0f && fycVar.s == 2) || fycVar.s == 3) {
            fycVar.s = (byte) 1;
            z = true;
        } else {
            z = false;
        }
        if (f == 1.0f) {
            int i2 = fycVar.x;
            int i3 = fycVar.w;
            if (i2 != i3) {
                fycVar.x = i3;
                if (z2) {
                    ((Runnable) this.b).run();
                }
                fycVar.a();
            }
        }
        z2 = z;
        if (z2) {
        }
        fycVar.a();
    }

    @Override // f9d
    public final void R(String str, long j, int i, r8d r8dVar, long j2, long j3) {
        ((y8d) this.c).g = null;
        f9d f9dVar = (f9d) this.b;
        if (f9dVar != null) {
            f9dVar.R(str, j, i, r8dVar, j2, j3);
        }
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        gec gecVar = (gec) this.c;
        vxc h = jdc.h(view, vxcVar);
        if (h.a.n()) {
            return h;
        }
        Rect rect = (Rect) this.b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gecVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            vxc b = jdc.b(gecVar.getChildAt(i), h);
            rect.left = Math.min(b.b(), rect.left);
            rect.top = Math.min(b.d(), rect.top);
            rect.right = Math.min(b.c(), rect.right);
            rect.bottom = Math.min(b.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // r24
    public final /* bridge */ /* synthetic */ r24 a(Class cls, zn7 zn7Var) {
        ((HashMap) this.b).put(cls, zn7Var);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f69
    public final void accept(Object obj, Object obj2) {
        Object[] objArr = 0;
        switch (this.a) {
            case 6:
                z2d z2dVar = new z2d((u84) this.b, (TaskCompletionSource) obj2, objArr == true ? 1 : 0);
                q2d q2dVar = (q2d) ((n3d) obj).k();
                eo eoVar = (eo) this.c;
                Parcel c = q2dVar.c();
                e2d.c(c, z2dVar);
                e2d.b(c, eoVar);
                q2dVar.d(c, 1);
                return;
            case 10:
                c(obj, obj2);
                return;
            default:
                afd afdVar = (afd) this.b;
                String str = (String) this.c;
                lhf lhfVar = (lhf) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                fre.j("Not connected to device", afdVar.G == 2);
                x6d x6dVar = (x6d) lhfVar.k();
                Parcel R = x6dVar.R();
                R.writeString(str);
                x6dVar.W(R, 5);
                synchronized (afdVar.t) {
                    if (afdVar.q != null) {
                        taskCompletionSource.setException(bmd.a(new Status(2001, null, null, null)));
                        return;
                    } else {
                        afdVar.q = taskCompletionSource;
                        return;
                    }
                }
        }
    }

    @Override // x4d
    public final void b(Bitmap bitmap) {
        v8b v8bVar = (v8b) this.b;
        v8bVar.c = bitmap;
        c5f c5fVar = (c5f) this.c;
        c5fVar.l = v8bVar;
        c5fVar.b();
    }

    public final synchronized void d(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.c) == null) {
                if (((Context) this.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    lad.f("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
                if (powerManager == null) {
                    lad.f("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public final int e(Context context, xx4 xx4Var) {
        fre.h(context);
        fre.h(xx4Var);
        int i = 0;
        if (!xx4Var.v()) {
            return 0;
        }
        int i2 = xx4Var.i();
        int g = g(i2);
        if (g != -1) {
            return g;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            int i3 = 0;
            while (true) {
                if (i3 >= sparseIntArray.size()) {
                    i = -1;
                    break;
                }
                int keyAt = sparseIntArray.keyAt(i3);
                if (keyAt > i2 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i3++;
            }
            if (i == -1) {
                i = ((dy4) this.c).c(context, i2);
            }
            sparseIntArray.put(i2, i);
        }
        return i;
    }

    @Override // uab
    public final /* synthetic */ kab f(int i, int i2, byte[] bArr) {
        return de9.c(this, bArr, i2);
    }

    public final int g(int i) {
        int i2;
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    public final void h(Status status, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = (Map) this.b;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = (Map) this.c;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).e(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new zn(status));
            }
        }
    }

    public final void i(fhe fheVar) {
        try {
            s(fheVar, (lle) this.b);
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void j(fhe fheVar, int i, long j) {
        try {
            ale aleVar = (ale) ((lle) this.b).g();
            aleVar.b();
            lle.p((lle) aleVar.b, i);
            lle lleVar = (lle) aleVar.a();
            this.b = lleVar;
            if (j != 0) {
                ale aleVar2 = (ale) lleVar.g();
                aleVar2.b();
                lle.r((lle) aleVar2.b, j);
                lleVar = (lle) aleVar2.a();
            }
            s(fheVar, lleVar);
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // f9d
    public final void j0(String str, long j, long j2, long j3) {
        f9d f9dVar = (f9d) this.b;
        if (f9dVar != null) {
            f9dVar.j0(str, j, j2, j3);
        }
    }

    public final void k(fhe fheVar, long j, boolean z) {
        try {
            tge tgeVar = (tge) fheVar.g();
            fne fneVar = (fne) fheVar.o().g();
            fneVar.b();
            eoe.n((eoe) fneVar.b, z);
            tgeVar.b();
            fhe.r((fhe) tgeVar.b, (eoe) fneVar.a());
            fhe fheVar2 = (fhe) tgeVar.a();
            lle lleVar = (lle) this.b;
            if (j != 0) {
                ale aleVar = (ale) lleVar.g();
                aleVar.b();
                lle.r((lle) aleVar.b, j);
                lleVar = (lle) aleVar.a();
            }
            s(fheVar2, lleVar);
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x037e, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0110, code lost:
    
        if (")".equals(uuc.b(r11, r6)) == false) goto L58;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // uab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(byte[] bArr, int i, int i2, tab tabVar, us2 us2Var) {
        wuc wucVar;
        String str;
        ?? r0;
        String sb;
        int i3;
        char c;
        aec aecVar = this;
        xu7 xu7Var = (xu7) aecVar.b;
        xu7Var.L(i + i2, bArr);
        xu7Var.N(i);
        ArrayList arrayList = new ArrayList();
        try {
            dvc.d(xu7Var);
            while (!TextUtils.isEmpty(xu7Var.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z = false;
                int i4 = -1;
                int i5 = 0;
                char c2 = 65535;
                while (true) {
                    ?? r9 = 1;
                    if (c2 == 65535) {
                        i5 = xu7Var.b;
                        String n = xu7Var.n(StandardCharsets.UTF_8);
                        c2 = n == null ? (char) 0 : "STYLE".equals(n) ? (char) 2 : n.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        xu7Var.N(i5);
                        if (c2 == 0) {
                            lne.b(new vk9(arrayList2), tabVar, us2Var);
                            return;
                        }
                        if (c2 == 1) {
                            while (!TextUtils.isEmpty(xu7Var.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    w26.j("A style block was found after the first cue.");
                                    return;
                                }
                                xu7Var.n(StandardCharsets.UTF_8);
                                uuc uucVar = (uuc) aecVar.c;
                                xu7 xu7Var2 = uucVar.a;
                                StringBuilder sb2 = uucVar.b;
                                sb2.setLength(0);
                                int i6 = xu7Var.b;
                                while (!TextUtils.isEmpty(xu7Var.n(StandardCharsets.UTF_8))) {
                                }
                                xu7Var2.L(xu7Var.b, xu7Var.a);
                                xu7Var2.N(i6);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    uuc.c(xu7Var2);
                                    if (xu7Var2.a() >= 5 && "::cue".equals(xu7Var2.y(5, StandardCharsets.UTF_8))) {
                                        int i7 = xu7Var2.b;
                                        String b = uuc.b(xu7Var2, sb2);
                                        if (b != null) {
                                            if ("{".equals(b)) {
                                                xu7Var2.N(i7);
                                                str = "";
                                            } else if ("(".equals(b)) {
                                                int i8 = xu7Var2.b;
                                                int i9 = xu7Var2.c;
                                                boolean z2 = z ? 1 : 0;
                                                while (i8 < i9 && z2 == 0) {
                                                    int i10 = i8 + 1;
                                                    z2 = ((char) xu7Var2.a[i8]) == ')' ? r9 : z ? 1 : 0;
                                                    i8 = i10;
                                                }
                                                str = xu7Var2.y((i8 - 1) - xu7Var2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(uuc.b(xu7Var2, sb2))) {
                                                vuc vucVar = new vuc();
                                                vucVar.a = "";
                                                vucVar.b = "";
                                                vucVar.c = Collections.EMPTY_SET;
                                                vucVar.d = "";
                                                vucVar.e = str2;
                                                vucVar.g = z;
                                                vucVar.i = z;
                                                vucVar.j = i4;
                                                vucVar.k = i4;
                                                vucVar.l = i4;
                                                vucVar.m = i4;
                                                vucVar.n = i4;
                                                vucVar.p = i4;
                                                vucVar.q = z;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i4) {
                                                        ?? matcher = uuc.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r9);
                                                            group.getClass();
                                                            vucVar.d = group;
                                                        }
                                                        str = str.substring(z ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = g8c.a;
                                                    String[] split = str.split("\\.", i4);
                                                    String str4 = split[z ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i4) {
                                                        vucVar.b = str4.substring(z ? 1 : 0, indexOf2);
                                                        vucVar.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        vucVar.b = str4;
                                                    }
                                                    if (split.length > r9) {
                                                        int length = split.length;
                                                        gre.f(length <= split.length ? r9 : z ? 1 : 0);
                                                        vucVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r9, length)));
                                                    }
                                                }
                                                boolean z3 = z ? 1 : 0;
                                                String str5 = str2;
                                                boolean z4 = r9;
                                                while (z3 == 0) {
                                                    int i11 = xu7Var2.b;
                                                    str5 = uuc.b(xu7Var2, sb2);
                                                    boolean z5 = (str5 == null || "}".equals(str5)) ? z4 : z;
                                                    if (z5 == 0) {
                                                        xu7Var2.N(i11);
                                                        uuc.c(xu7Var2);
                                                        String a = uuc.a(xu7Var2, sb2);
                                                        if (!a.isEmpty() && ":".equals(uuc.b(xu7Var2, sb2))) {
                                                            uuc.c(xu7Var2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z6 = false;
                                                            while (true) {
                                                                if (z6) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i12 = xu7Var2.b;
                                                                    String b2 = uuc.b(xu7Var2, sb2);
                                                                    if (b2 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(b2) || ";".equals(b2)) {
                                                                        xu7Var2.N(i12);
                                                                        z6 = true;
                                                                    } else {
                                                                        sb3.append(b2);
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !sb.isEmpty()) {
                                                                int i13 = xu7Var2.b;
                                                                String b3 = uuc.b(xu7Var2, sb2);
                                                                if (!";".equals(b3)) {
                                                                    if ("}".equals(b3)) {
                                                                        xu7Var2.N(i13);
                                                                    }
                                                                }
                                                                if ("color".equals(a)) {
                                                                    i3 = 1;
                                                                    vucVar.f = il2.a(sb, true);
                                                                    vucVar.g = true;
                                                                } else {
                                                                    i3 = 1;
                                                                    if ("background-color".equals(a)) {
                                                                        vucVar.h = il2.a(sb, true);
                                                                        vucVar.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a)) {
                                                                            if ("over".equals(sb)) {
                                                                                vucVar.p = 1;
                                                                            } else if ("under".equals(sb)) {
                                                                                vucVar.p = 2;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a)) {
                                                                            vucVar.q = "all".equals(sb) || sb.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a)) {
                                                                            if ("underline".equals(sb)) {
                                                                                i3 = 1;
                                                                                vucVar.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a)) {
                                                                            vucVar.e = smd.c(sb);
                                                                        } else if (!"font-weight".equals(a)) {
                                                                            i3 = 1;
                                                                            if ("font-style".equals(a)) {
                                                                                if ("italic".equals(sb)) {
                                                                                    vucVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a)) {
                                                                                ?? matcher2 = uuc.d.matcher(smd.c(sb));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    switch (c) {
                                                                                        case 0:
                                                                                            r0 = 1;
                                                                                            vucVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r0 = 1;
                                                                                            vucVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r0 = 1;
                                                                                            vucVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            sdb.a();
                                                                                            return;
                                                                                    }
                                                                                    String group3 = matcher2.group(r0);
                                                                                    group3.getClass();
                                                                                    vucVar.o = Float.parseFloat(group3);
                                                                                } else {
                                                                                    lad.f("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb)) {
                                                                            i3 = 1;
                                                                            vucVar.l = 1;
                                                                        }
                                                                        z4 = r0;
                                                                        z3 = z5;
                                                                        z = false;
                                                                    }
                                                                }
                                                                r0 = i3;
                                                                z4 = r0;
                                                                z3 = z5;
                                                                z = false;
                                                            }
                                                            r0 = 1;
                                                            z4 = r0;
                                                            z3 = z5;
                                                            z = false;
                                                        }
                                                    }
                                                    r0 = z4;
                                                    z4 = r0;
                                                    z3 = z5;
                                                    z = false;
                                                }
                                                boolean z7 = z4;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(vucVar);
                                                }
                                                r9 = z7;
                                                z = false;
                                                i4 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c2 == 3) {
                                Pattern pattern = bvc.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n2 = xu7Var.n(charset);
                                if (n2 == null) {
                                    wucVar = null;
                                } else {
                                    Pattern pattern2 = bvc.a;
                                    Matcher matcher3 = pattern2.matcher(n2);
                                    if (matcher3.matches()) {
                                        wucVar = bvc.d(null, matcher3, xu7Var, arrayList);
                                    } else {
                                        wucVar = null;
                                        String n3 = xu7Var.n(charset);
                                        if (n3 != null) {
                                            Matcher matcher4 = pattern2.matcher(n3);
                                            if (matcher4.matches()) {
                                                wucVar = bvc.d(n2.trim(), matcher4, xu7Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (wucVar != null) {
                                    arrayList2.add(wucVar);
                                }
                            }
                            aecVar = this;
                        }
                    }
                }
            }
        } catch (av7 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void m(fhe fheVar, int i, long j, boolean z) {
        try {
            ale aleVar = (ale) ((lle) this.b).g();
            aleVar.b();
            lle.p((lle) aleVar.b, i);
            this.b = (lle) aleVar.a();
            tge tgeVar = (tge) fheVar.g();
            fne fneVar = (fne) fheVar.o().g();
            fneVar.b();
            eoe.n((eoe) fneVar.b, z);
            tgeVar.b();
            fhe.r((fhe) tgeVar.b, (eoe) fneVar.a());
            fhe fheVar2 = (fhe) tgeVar.a();
            lle lleVar = (lle) this.b;
            if (j != 0) {
                ale aleVar2 = (ale) lleVar.g();
                aleVar2.b();
                lle.r((lle) aleVar2.b, j);
                lleVar = (lle) aleVar2.a();
            }
            s(fheVar2, lleVar);
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void n(vje vjeVar) {
        try {
            koe t = toe.t();
            t.c((lle) this.b);
            t.b();
            toe.p((toe) t.b, vjeVar);
            ((e31) this.c).p((toe) t.a());
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // uab
    public final int o() {
        return 1;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        boolean z;
        dd1 dd1Var;
        ocd ocdVar = (ocd) this.b;
        dd1 dd1Var2 = (dd1) this.c;
        gu6 gu6Var = ocdVar.b;
        dc6 dc6Var = ocd.i;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z2 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            dc6Var.b("The module-to-client output switcher flag %s", true != z2 ? "not existed" : "existed");
            if (z2) {
                z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(dc6Var.a, dc6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(dd1Var2.y)));
                boolean z3 = !z && dd1Var2.y;
                if (gu6Var != null || (dd1Var = ocdVar.c) == null) {
                }
                boolean z4 = dd1Var.w;
                boolean z5 = dd1Var.s;
                hu6 hu6Var = new hu6();
                if (Build.VERSION.SDK_INT >= 30) {
                    hu6Var.b = z3;
                    hu6Var.d = z4;
                    hu6Var.c = z5;
                }
                gu6.i(new iu6(hu6Var));
                Log.i(dc6Var.a, dc6Var.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(ocdVar.f), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5)));
                if (z4) {
                    ydd yddVar = ocdVar.e;
                    fre.h(yddVar);
                    vbd vbdVar = new vbd(yddVar);
                    gu6.b();
                    gu6.c().f = vbdVar;
                    i5f.a(k1f.c0);
                    return;
                }
                return;
            }
        }
        z = true;
        Log.i(dc6Var.a, dc6Var.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(dd1Var2.y)));
        if (z) {
        }
        if (gu6Var != null) {
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        fyc fycVar = (fyc) this.c;
        fycVar.c.a(f);
        fycVar.d.a(f);
        fycVar.b.a(f);
        ((Runnable) this.b).run();
    }

    public final void q(zpe zpeVar) {
        try {
            e31 e31Var = (e31) this.c;
            koe t = toe.t();
            t.c((lle) this.b);
            t.b();
            toe.r((toe) t.b, zpeVar);
            e31Var.p((toe) t.a());
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void r(oqe oqeVar) {
        if (oqeVar == null) {
            return;
        }
        try {
            koe t = toe.t();
            t.c((lle) this.b);
            t.b();
            toe.s((toe) t.b, oqeVar);
            ((e31) this.c).p((toe) t.a());
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void s(fhe fheVar, lle lleVar) {
        if (fheVar == null) {
            return;
        }
        try {
            koe t = toe.t();
            t.c(lleVar);
            t.b();
            toe.n((toe) t.b, fheVar);
            ((e31) this.c).p((toe) t.a());
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    public final void t(fie fieVar, lle lleVar) {
        try {
            koe t = toe.t();
            t.c(lleVar);
            t.b();
            toe.o((toe) t.b, fieVar);
            ((e31) this.c).p((toe) t.a());
        } catch (Throwable th) {
            xgd.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        fm9 fm9Var = (fm9) this.b;
        Bundle bundle = (Bundle) this.c;
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : fm9Var.d(bundle).onSuccessTask(wn3.d, e6d.a);
    }

    @Override // uab
    public final void reset() {
    }

    public /* synthetic */ aec(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ aec(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public aec(Context context, lle lleVar) {
        this.a = (byte) 13;
        e31 e31Var = new e31((byte) 12);
        try {
            i1c.b(context);
            e31Var.c = i1c.a().c(i51.e).a("PLAY_BILLING_LIBRARY", new s24("proto"), new y5d());
        } catch (Throwable unused) {
            e31Var.b = true;
        }
        this.c = e31Var;
        this.b = lleVar;
    }

    public aec(IBinder iBinder) {
        this.a = (byte) 20;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new hnd(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public aec(rod rodVar) {
        this.a = (byte) 18;
        this.c = new pse();
        this.b = rodVar;
        i2f.O3();
    }

    public aec(dy4 dy4Var) {
        this.a = (byte) 5;
        this.b = new SparseIntArray();
        fre.h(dy4Var);
        this.c = dy4Var;
    }

    public /* synthetic */ aec(byte b, boolean z) {
        this.a = b;
    }

    public aec(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 21:
                this.c = new AtomicLong(-1L);
                this.b = new u84(context, u84.o, new ngb("mlkit:vision"), ay4.c);
                break;
            default:
                this.b = context;
                break;
        }
    }

    public aec(gec gecVar) {
        this.a = (byte) 0;
        this.c = gecVar;
        this.b = new Rect();
    }
}

package com.google.firebase.messaging;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import b2.f1;
import b2.l1;
import b2.o1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e9.c2;
import e9.n0;
import ei.r5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.c3;
import m.m1;
import m.n2;
import m.s3;
import m4.f0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lg0;
import u2.g0;
import v7.d8;
import v7.q7;
import v7.u6;
import w7.q6;
import z9.a2;
import z9.l0;
import z9.m0;
import z9.p0;
import z9.q0;
import z9.r0;
import z9.s1;
import z9.t0;
import z9.t1;
import z9.u0;
import z9.u1;
import z9.v0;
import z9.v1;
import z9.w1;
import z9.x0;
import z9.y0;
import z9.z1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class l implements d6 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public static void H(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = m1.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = m.r.b;
        }
        PorterDuff.Mode mode2 = m.r.b;
        synchronized (m.r.class) {
            h = n2.h(i10, mode);
        }
        mutate.setColorFilter(h);
    }

    public static l0 b(l0 l0Var, y9.e eVar, s3 s3Var) {
        l a2 = l0Var.a();
        String f7 = ((y9.c) eVar.b).f();
        if (f7 != null) {
            a2.e = new v0(f7);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List x10 = x(((y9.d) ((AtomicMarkableReference) ((c2.b) s3Var.d).b).getReference()).a());
        List x11 = x(((y9.d) ((AtomicMarkableReference) ((c2.b) s3Var.e).b).getReference()).a());
        if (!x10.isEmpty() || !x11.isEmpty()) {
            m0 m0Var = (m0) l0Var.c;
            s1 s1Var = m0Var.a;
            Boolean bool = m0Var.d;
            t1 t1Var = m0Var.e;
            List list = m0Var.f;
            int i10 = m0Var.g;
            String str = s1Var == null ? " execution" : "";
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            a2.c = new m0(s1Var, x10, x11, bool, t1Var, list, i10);
        }
        return a2.k();
    }

    public static a2 e(l0 l0Var, s3 s3Var) {
        List o10 = ((c5.b0) s3Var.f).o();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < o10.size(); i10++) {
            y9.l lVar = (y9.l) o10.get(i10);
            lVar.getClass();
            qi.e eVar = new qi.e();
            y9.b bVar = (y9.b) lVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            eVar.a = new x0(str2, str);
            String str3 = bVar.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            eVar.b = str3;
            String str4 = bVar.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            eVar.c = str4;
            eVar.d = Long.valueOf(bVar.f);
            arrayList.add(eVar.h());
        }
        if (arrayList.isEmpty()) {
            return l0Var;
        }
        l a2 = l0Var.a();
        a2.f = new y0(arrayList);
        return a2.k();
    }

    public static boolean g(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static l m(Context context, x9.u uVar, ca.c cVar, x9.a aVar, y9.e eVar, s3 s3Var, qf.b bVar, ea.b bVar2, n2.e eVar2, x9.j jVar) {
        x9.p pVar = new x9.p(context, uVar, aVar, bVar, bVar2);
        ca.b bVar3 = new ca.b(cVar, bVar2, jVar);
        aa.b bVar4 = da.a.b;
        l5.t.b(context);
        return new l(pVar, bVar3, new da.a(new da.c(l5.t.a().c(new j5.a(da.a.c, da.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new i5.c("json"), da.a.e), bVar2.d(), eVar2)), eVar, s3Var, uVar);
    }

    public static ColorStateList o(Context context, int i10) {
        int c10 = c3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{c3.b, c3.d, c3.c, c3.f}, new int[]{c3.b(context, R.attr.colorButtonNormal), i0.b.k(c10, i10), i0.b.k(c10, i10), i10});
    }

    public static g0 t(f1 f1Var, n0 n0Var, g0 g0Var, l1 l1Var) {
        o1 y02 = f1Var.y0();
        int A = f1Var.A();
        Object l4 = y02.p() ? null : y02.l(A);
        int b10 = (f1Var.n() || y02.p()) ? -1 : y02.f(A, l1Var, false).b(e2.m0.S(f1Var.M0()) - l1Var.e);
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            g0 g0Var2 = (g0) n0Var.get(i10);
            if (z(g0Var2, l4, f1Var.n(), f1Var.m0(), f1Var.N(), b10)) {
                return g0Var2;
            }
        }
        if (n0Var.isEmpty() && g0Var != null && z(g0Var, l4, f1Var.n(), f1Var.m0(), f1Var.N(), b10)) {
            return g0Var;
        }
        return null;
    }

    public static LayerDrawable w(n2 n2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable g10 = n2Var.g(context, R.drawable.abc_star_black_48dp);
        Drawable g11 = n2Var.g(context, R.drawable.abc_star_half_black_48dp);
        if ((g10 instanceof BitmapDrawable) && g10.getIntrinsicWidth() == dimensionPixelSize && g10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) g10;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            g10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g10.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((g11 instanceof BitmapDrawable) && g11.getIntrinsicWidth() == dimensionPixelSize && g11.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) g11;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            g11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g11.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static List x(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new z9.d0(str, str2));
        }
        Collections.sort(arrayList, new lg0(26));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean z(g0 g0Var, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = g0Var.a;
        int i13 = g0Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10 && i13 == i10 && g0Var.c == i11) {
            return true;
        }
        return !z10 && i13 == -1 && g0Var.e == i12;
    }

    public void A(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        qf.b bVar;
        boolean equals = str2.equals("crash");
        x9.p pVar = (x9.p) this.a;
        Context context = pVar.a;
        int i10 = context.getResources().getConfiguration().orientation;
        qf.b bVar2 = pVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        r rVar = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            rVar = new r(th4.getLocalizedMessage(), th4.getClass().getName(), bVar2.s0(th4.getStackTrace()), rVar, 4);
        }
        r rVar2 = rVar;
        l lVar = new l();
        lVar.b = str2;
        lVar.a = Long.valueOf(j10);
        t1 b10 = u9.c.a.b(context);
        int i11 = ((t0) b10).c;
        Boolean valueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList a2 = u9.c.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) rVar2.d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        List d = x9.p.d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        arrayList.add(new r0(name, 4, d));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    bVar = bVar2;
                } else {
                    StackTraceElement[] s02 = bVar2.s0(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d10 = x9.p.d(s02, 0);
                    if (d10 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    bVar = bVar2;
                    arrayList.add(new r0(name2, 0, d10));
                }
                it2 = it;
                bVar2 = bVar;
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        p0 c10 = x9.p.c(rVar2, 0);
        q0 q0Var = new q0(0L, "0", "0");
        List a10 = pVar.a();
        if (a10 == null) {
            throw new NullPointerException("Null binaries");
        }
        lVar.c = new m0(new z9.n0(unmodifiableList, c10, null, q0Var, a10), null, null, valueOf, b10, a2, i10);
        lVar.d = pVar.b(i10);
        l0 k10 = lVar.k();
        ca.b bVar3 = (ca.b) this.b;
        y9.e eVar = (y9.e) this.d;
        s3 s3Var = (s3) this.e;
        bVar3.d(e(b(k10, eVar, s3Var), s3Var), str, equals);
    }

    public void C(String str, String... strArr) {
        Bundle bundle = (Bundle) this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            q6.a("String array is empty and is ignored by put method.");
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < Math.min(strArr2.length, 100); i11++) {
            String str2 = strArr2[i11];
            strArr2[i10] = str2;
            if (strArr2[i11] == null) {
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("String at ");
                sb2.append(i11);
                sb2.append(" is null and is ignored by put method.");
                q6.a(sb2.toString());
            } else {
                int i12 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb3 = new StringBuilder(53);
                    sb3.append("String at ");
                    sb3.append(i11);
                    sb3.append(" is too long, truncating string.");
                    q6.a(sb3.toString());
                    String str3 = strArr2[i10];
                    if (str3.length() > 20000) {
                        if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                            i12 = 19999;
                        }
                        str3 = str3.substring(0, i12);
                    }
                    strArr2[i10] = str3;
                }
                i10++;
            }
        }
        if (i10 > 0) {
            Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i10);
            if (objArr.length >= 100) {
                q6.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:? -> B:43:0x0137). Please report as a decompilation issue!!! */
    public Task D(Executor executor, String str) {
        x9.b bVar;
        ArrayBlockingQueue arrayBlockingQueue;
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((ca.b) this.b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                aa.b bVar2 = ca.b.g;
                String e = ca.b.e(file);
                bVar2.getClass();
                arrayList.add(new x9.b(aa.b.i(e), file.getName(), file));
            } catch (IOException e7) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e7);
                file.delete();
            }
            i10 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            int i13 = i12 + 1;
            x9.b bVar3 = (x9.b) arrayList.get(i12);
            if (str == null || str.equals(bVar3.b)) {
                da.a aVar = (da.a) this.c;
                if (bVar3.a.f == null) {
                    try {
                        str2 = (String) x9.w.a(((ra.c) ((x9.u) this.f).d).d());
                    } catch (Exception e10) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e10);
                        str2 = null;
                    }
                    d8 a2 = bVar3.a.a();
                    a2.d = str2;
                    bVar = new x9.b(a2.a(), bVar3.b, bVar3.c);
                } else {
                    bVar = bVar3;
                }
                boolean z10 = str != null;
                da.c cVar = aVar.a;
                ArrayBlockingQueue arrayBlockingQueue2 = cVar.f;
                synchronized (arrayBlockingQueue2) {
                    try {
                        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.i.b).getAndIncrement();
                            if (cVar.f.size() < cVar.e) {
                                u9.b bVar4 = u9.b.a;
                                bVar4.b("Enqueueing report: " + bVar.b);
                                bVar4.b("Queue size: " + cVar.f.size());
                                try {
                                    arrayBlockingQueue = arrayBlockingQueue2;
                                    try {
                                        taskCompletionSource = taskCompletionSource2;
                                        cVar.g.execute(new c5.v(cVar, bVar, taskCompletionSource2, false, 5));
                                        bVar4.b("Closing task for report: " + bVar.b);
                                        taskCompletionSource.trySetResult(bVar);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    arrayBlockingQueue = arrayBlockingQueue2;
                                    throw th;
                                }
                            } else {
                                taskCompletionSource = taskCompletionSource2;
                                cVar.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) cVar.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            taskCompletionSource = taskCompletionSource2;
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        arrayBlockingQueue = arrayBlockingQueue2;
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new si.a(this, 27)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void E(float f7, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        L();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        oa.f fVar;
        int a2;
        PackageInfo d;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        l9.h hVar = (l9.h) this.a;
        hVar.a();
        bundle.putString("gmp_app_id", hVar.c.b);
        n nVar = (n) this.b;
        synchronized (nVar) {
            try {
                if (nVar.a == 0 && (d = nVar.d("com.google.android.gms")) != null) {
                    nVar.a = d.versionCode;
                }
                i10 = nVar.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((n) this.b).a());
        bundle.putString("app_ver_name", ((n) this.b).b());
        l9.h hVar2 = (l9.h) this.a;
        hVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(hVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String str4 = ((ra.a) Tasks.await(((ra.c) ((ra.d) this.f)).e())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((ra.c) ((ra.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (oa.f) ((qa.b) this.e).get();
            ya.b bVar = (ya.b) ((qa.b) this.d).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e7) {
            e = e7;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((ra.c) ((ra.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (oa.f) ((qa.b) this.e).get();
            ya.b bVar2 = (ya.b) ((qa.b) this.d).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((ra.c) ((ra.d) this.f)).d()));
        bundle.putString("cliv", "fcm-23.4.0");
        fVar = (oa.f) ((qa.b) this.e).get();
        ya.b bVar22 = (ya.b) ((qa.b) this.d).get();
        if (fVar == null || bVar22 == null || (a2 = ((oa.c) fVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(m1.j.c(a2)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public void G(float f7, float f10, float f11, float f12) {
        Matrix matrix = (Matrix) this.f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.c;
        matrix.postRotate(f12, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f11, f11);
        matrix.postTranslate(f7, f10);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int I(int i10) {
        return u(i10);
    }

    public Task J(String str, String str2, Bundle bundle) {
        int i10;
        try {
            F(str, str2, bundle);
            j6.a aVar = (j6.a) this.c;
            j6.m mVar = j6.m.a;
            b4.d dVar = aVar.c;
            if (dVar.f() < 12000000) {
                return dVar.g() != 0 ? aVar.a(bundle).continueWithTask(mVar, new qf.b(25, aVar, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            j6.l k10 = j6.l.k(aVar.b);
            synchronized (k10) {
                i10 = k10.a;
                k10.a = i10 + 1;
            }
            return k10.l(new j6.k(i10, 1, bundle, 1)).continueWith(mVar, j6.b.a);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public void K(boolean z10) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        ArrayList arrayList3 = (ArrayList) this.a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new ny0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new ny0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new ny0(this, i12, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void L() {
        Bitmap bitmap = (Bitmap) this.c;
        RectF rectF = (RectF) this.d;
        Matrix matrix = (Matrix) this.f;
        BitmapShader bitmapShader = (BitmapShader) this.e;
        if (bitmapShader == null) {
            return;
        }
        float width = rectF.width() / bitmap.getWidth();
        float height = rectF.height() / bitmap.getHeight();
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(width, height);
        bitmapShader.setLocalMatrix(matrix);
    }

    public void M(o1 o1Var) {
        a5.a aVar = new a5.a(4, 5);
        if (((n0) this.b).isEmpty()) {
            f(aVar, (g0) this.e, o1Var);
            if (!Objects.equals((g0) this.f, (g0) this.e)) {
                f(aVar, (g0) this.f, o1Var);
            }
            if (!Objects.equals((g0) this.d, (g0) this.e) && !Objects.equals((g0) this.d, (g0) this.f)) {
                f(aVar, (g0) this.d, o1Var);
            }
        } else {
            for (int i10 = 0; i10 < ((n0) this.b).size(); i10++) {
                f(aVar, (g0) ((n0) this.b).get(i10), o1Var);
            }
            if (!((n0) this.b).contains((g0) this.d)) {
                f(aVar, (g0) this.d, o1Var);
            }
        }
        this.c = aVar.d(true);
    }

    public void N() {
        rf.d dVar = (rf.d) this.e;
        rf.d dVar2 = null;
        for (rf.d dVar3 : ((HashMap) this.a).values()) {
            if (dVar3.m || dVar3.b.a != 0) {
                if (dVar2 == null || dVar3.d > dVar2.d) {
                    dVar2 = dVar3;
                }
            }
        }
        if (dVar != dVar2) {
            this.e = dVar2;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            sb2.append(dVar2 != null ? dVar2.c : null);
            Log.i("PIP_DEBUG", sb2.toString());
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar2 != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, dVar2.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            if ((dVar != null && dVar.f) != (dVar2 != null && dVar2.f)) {
                m4.x xVar = (m4.x) this.f;
                if (xVar != null) {
                    try {
                        synchronized (m4.x.b) {
                            m4.x.c.remove(xVar.a.i);
                        }
                        xVar.a.r();
                    } catch (Exception unused) {
                    }
                    this.f = null;
                }
                if (dVar2 != null) {
                    m4.r rVar = new m4.r((LaunchActivity) this.d, dVar2.l);
                    rVar.c = "pip-media-session";
                    u6.p(!rVar.m);
                    rVar.m = true;
                    Context context = rVar.a;
                    Object obj = m4.x.b;
                    int intValue = ((Integer) f0.C.get()).intValue();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 27) {
                        intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
                    }
                    e2.d dVar4 = rVar.g;
                    int i11 = 6;
                    if (dVar4 == null) {
                        c5.f fVar = new c5.f();
                        fVar.c = context;
                        fVar.a = -1;
                        fVar.a = intValue;
                        fVar.b = true;
                        rVar.g = new g2.i(fVar);
                    } else {
                        rVar.g = new c5.b0(dVar4, intValue, i11);
                    }
                    int i12 = 28;
                    if (i10 == 29) {
                        e2.d dVar5 = rVar.g;
                        AtomicReference atomicReference = m4.r.n;
                        i9.a aVar = (i9.a) atomicReference.get();
                        if (aVar == null) {
                            Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                            Point point = new Point();
                            defaultDisplay.getSize(point);
                            Point point2 = new Point();
                            defaultDisplay.getRealSize(point2);
                            int i13 = point2.y;
                            int i14 = point2.x;
                            Point point3 = new Point(i13 - (i14 - point.x), i14 - (i13 - point.y));
                            aVar = new i9.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                            atomicReference.set(aVar);
                        }
                        rVar.g = new n4.s(i12, dVar5, aVar);
                    }
                    rVar.g = new qf.b(rVar.g, i12);
                    this.f = new m4.x(rVar.a, rVar.c, rVar.b, rVar.i, rVar.j, rVar.k, rVar.d, rVar.e, rVar.f, rVar.g, rVar.h, rVar.l);
                }
            }
            if (dVar != null) {
                tf.e eVar = dVar.b;
                eVar.n = false;
                eVar.h();
                rf.d dVar6 = eVar.j;
                ((rf.b) dVar6.a.b).a.remove(eVar);
                ((rf.b) dVar6.a.b).b.remove(eVar);
                l lVar = dVar6.a;
                String str = dVar6.c;
                HashMap hashMap = ((rf.b) lVar.b).c;
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str);
                    }
                }
            }
            if (dVar2 != null) {
                m4.x xVar2 = (m4.x) this.f;
                if (xVar2 != null) {
                    f1 f1Var = xVar2.a.t.a;
                    i2.g0 g0Var = dVar2.l;
                    if (f1Var != g0Var) {
                        xVar2.a(g0Var);
                    }
                }
                ((rf.a) this.c).bringToFront();
                tf.e eVar2 = dVar2.b;
                rf.d dVar7 = eVar2.j;
                ((rf.b) dVar7.a.b).a.add(eVar2);
                ((rf.b) dVar7.a.b).b.add(eVar2);
                l lVar2 = dVar7.a;
                String str2 = dVar7.c;
                HashMap hashMap2 = ((rf.b) lVar2.b).c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str2, arrayList2);
                }
                arrayList2.add(null);
            } else if (dVar != null && AndroidUtilities.isInPictureInPictureMode((LaunchActivity) this.d)) {
                ((LaunchActivity) this.d).moveTaskToBack(false);
            }
            ((rf.a) this.c).invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        return ((r5) this.f).B0;
    }

    public void c(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void d(float f7, float f10, int i10, int i11) {
        h6.q(f7, f10, i10, i11);
    }

    public void f(a5.a aVar, g0 g0Var, o1 o1Var) {
        if (g0Var == null) {
            return;
        }
        if (o1Var.b(g0Var.a) != -1) {
            aVar.x(g0Var, o1Var);
            return;
        }
        o1 o1Var2 = (o1) ((c2) this.c).get(g0Var);
        if (o1Var2 != null) {
            aVar.x(g0Var, o1Var2);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Drawable getDrawable(String str) {
        r5 r5Var = (r5) this.f;
        l lVar = r5Var.D0;
        if (str.equals("drawableMsgIn")) {
            if (r5Var.E0 == null) {
                r5Var.E0 = new f5(0, false, false, lVar);
            }
            return r5Var.E0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (r5Var.F0 == null) {
                r5Var.F0 = new f5(0, false, true, lVar);
            }
            return r5Var.F0;
        }
        if (str.equals("drawableMsgOut")) {
            if (r5Var.G0 == null) {
                r5Var.G0 = new f5(0, true, false, lVar);
            }
            return r5Var.G0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (r5Var.H0 == null) {
                r5Var.H0 = new f5(0, true, true, lVar);
            }
            return r5Var.H0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (r5Var.I0 == null) {
                r5Var.I0 = new f5(1, false, false, lVar);
            }
            r5Var.I0.invalidateSelf();
            return r5Var.I0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (r5Var.J0 == null) {
                r5Var.J0 = new f5(1, false, true, lVar);
            }
            return r5Var.J0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (r5Var.K0 == null) {
                r5Var.K0 = new f5(1, true, false, lVar);
            }
            return r5Var.K0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return h6.P0(str);
        }
        if (r5Var.L0 == null) {
            r5Var.L0 = new f5(1, true, true, lVar);
        }
        return r5Var.L0;
    }

    public l5.h h() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((l5.m) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = r.c.u(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = r.c.u(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = r.c.u(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new l5.h((String) this.a, (Integer) this.b, (l5.m) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public q9.b i() {
        n6.l.i((String) this.f, "setActionToken is required before calling build().");
        new String((String) this.e);
        C("actionToken", (String) this.f);
        String str = (String) this.c;
        if ((str == null ? null : new String(str)) == null) {
            this.c = "AssistAction";
            C("name", "AssistAction");
        }
        String str2 = (String) this.d;
        if ((str2 != null ? new String(str2) : null) == null) {
            String valueOf = String.valueOf((String) this.f);
            String concat = valueOf.length() != 0 ? "https://developers.google.com/actions?invocation=".concat(valueOf) : new String("https://developers.google.com/actions?invocation=");
            n6.l.h(concat);
            this.d = concat;
            C("url", concat);
        }
        n6.l.i((String) this.c, "setObject is required before calling build().");
        n6.l.i((String) this.d, "setObject is required before calling build().");
        return new q9.b((String) this.b, (String) this.c, (String) this.d, null, new q9.a(), (String) this.e, (Bundle) this.a);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter j() {
        return h6.v3;
    }

    public l0 k() {
        String str = ((Long) this.a) == null ? " timestamp" : "";
        if (((String) this.b) == null) {
            str = str.concat(" type");
        }
        if (((u1) this.c) == null) {
            str = r.c.u(str, " app");
        }
        if (((v1) this.d) == null) {
            str = r.c.u(str, " device");
        }
        if (str.isEmpty()) {
            return new l0(((Long) this.a).longValue(), (String) this.b, (u1) this.c, (v1) this.d, (w1) this.e, (z1) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public u0 l() {
        String str = ((Integer) this.b) == null ? " batteryVelocity" : "";
        if (((Boolean) this.c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = r.c.u(str, " orientation");
        }
        if (((Long) this.e) == null) {
            str = r.c.u(str, " ramUsed");
        }
        if (((Long) this.f) == null) {
            str = r.c.u(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new u0((Double) this.a, ((Integer) this.b).intValue(), ((Boolean) this.c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint n(String str) {
        str.getClass();
        switch (str) {
            case "paintChatActionText2":
                return (TextPaint) this.b;
            case "paintChatBotButton":
                return (TextPaint) this.c;
            case "paintChatActionBackgroundDarken":
                return (Paint) this.e;
            case "paintChatActionBackgroundSelected":
                return (Paint) this.d;
            case "paintChatActionText":
                return (TextPaint) this.a;
            default:
                return h6.T0(str);
        }
    }

    public void p(rf.d dVar) {
        if (((rf.d) this.e) == dVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, dVar.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            m4.x xVar = (m4.x) this.f;
            if (xVar != null) {
                f1 f1Var = xVar.a.t.a;
                i2.g0 g0Var = dVar.l;
                if (f1Var != g0Var) {
                    xVar.a(g0Var);
                }
            }
        }
        ((rf.a) this.c).invalidate();
    }

    public Task q(Task task) {
        return task.continueWith(new a3.b(2), new a1.c(this, 23));
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int r(int i10) {
        return u(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int u(int i10) {
        return ((r5) this.f).C0.get(i10, h6.x0(null, i10, false));
    }

    public rf.a v() {
        if (((rf.a) this.c) == null) {
            this.c = new rf.a((LaunchActivity) this.d);
        }
        return (rf.a) this.c;
    }

    public ColorStateList y(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return q7.a(context, R.color.abc_tint_edittext);
        }
        if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return q7.a(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return o(context, c3.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return o(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return o(context, c3.c(context, R.attr.colorAccent));
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return q7.a(context, R.color.abc_tint_spinner);
            }
            if (g(i10, (int[]) this.b)) {
                return c3.d(context, R.attr.colorControlNormal);
            }
            if (g(i10, (int[]) this.e)) {
                return q7.a(context, R.color.abc_tint_default);
            }
            if (g(i10, (int[]) this.f)) {
                return q7.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return q7.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = c3.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = c3.b;
            iArr2[0] = c3.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = c3.e;
            iArr2[1] = c3.c(context, R.attr.colorControlActivated);
            iArr[2] = c3.f;
            iArr2[2] = c3.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = c3.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = c3.e;
            iArr2[1] = c3.c(context, R.attr.colorControlActivated);
            iArr[2] = c3.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public l(int i10, int i11) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = new RectF();
        this.f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i10), Math.max(1, i11), Bitmap.Config.ARGB_8888);
        this.c = createBitmap;
        this.b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.e = bitmapShader;
        paint.setShader(bitmapShader);
        L();
    }

    public l(int i10) {
        switch (i10) {
            case 4:
                Paint paint = new Paint(1);
                this.a = paint;
                this.d = new RectF();
                this.f = new Matrix();
                Bitmap createBitmap = Bitmap.createBitmap(30, 40, Bitmap.Config.ARGB_8888);
                this.c = createBitmap;
                this.b = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                this.e = bitmapShader;
                paint.setShader(bitmapShader);
                L();
                break;
            case 5:
                this.a = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                break;
            case 6:
                this.a = new Bundle();
                this.b = "AssistAction";
                break;
            default:
                this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void B(int i10, int i11) {
    }
}

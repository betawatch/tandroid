package j2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
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
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import b2.f1;
import b2.o1;
import c5.w;
import c5.x;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e9.c2;
import e9.n0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j6.m;
import j6.n;
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
import l5.s;
import m.a3;
import m.l1;
import m.m2;
import m.p3;
import m.q;
import m4.f0;
import m4.y;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.ld;
import org.telegram.messenger.ms;
import org.telegram.messenger.mz;
import org.telegram.messenger.w0;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.LaunchActivity;
import th.m1;
import u2.g0;
import v7.a8;
import v7.r7;
import v7.t6;
import x7.g8;
import x9.v;
import z9.a2;
import z9.d0;
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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class f {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public static void A(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = l1.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = q.b;
        }
        PorterDuff.Mode mode2 = q.b;
        synchronized (q.class) {
            h = m2.h(i10, mode);
        }
        mutate.setColorFilter(h);
    }

    public static l0 a(l0 l0Var, y9.e eVar, p3 p3Var) {
        f a2 = l0Var.a();
        String e = ((y9.c) eVar.b).e();
        if (e != null) {
            a2.e = new v0(e);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List r10 = r(((y9.d) ((AtomicMarkableReference) ((ac.a) p3Var.d).b).getReference()).a());
        List r11 = r(((y9.d) ((AtomicMarkableReference) ((ac.a) p3Var.e).b).getReference()).a());
        if (!r10.isEmpty() || !r11.isEmpty()) {
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
            a2.c = new m0(s1Var, r10, r11, bool, t1Var, list, i10);
        }
        return a2.h();
    }

    public static a2 c(l0 l0Var, p3 p3Var) {
        List m10 = ((x) p3Var.f).m();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < m10.size(); i10++) {
            y9.l lVar = (y9.l) m10.get(i10);
            lVar.getClass();
            ji.f fVar = new ji.f(17, false);
            y9.b bVar = (y9.b) lVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            fVar.b = new x0(str2, str);
            String str3 = bVar.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            fVar.c = str3;
            String str4 = bVar.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            fVar.d = str4;
            fVar.e = Long.valueOf(bVar.f);
            arrayList.add(fVar.e());
        }
        if (arrayList.isEmpty()) {
            return l0Var;
        }
        f a2 = l0Var.a();
        a2.f = new y0(arrayList);
        return a2.h();
    }

    public static boolean e(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static f k(Context context, v vVar, ca.c cVar, x9.a aVar, y9.e eVar, p3 p3Var, n4.q qVar, ea.d dVar, g8 g8Var, x9.j jVar) {
        x9.q qVar2 = new x9.q(context, vVar, aVar, qVar, dVar);
        ca.b bVar = new ca.b(cVar, dVar, jVar);
        aa.b bVar2 = da.a.b;
        s.b(context);
        return new f(qVar2, bVar, new da.a(new da.b(s.a().c(new j5.a(da.a.c, da.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new i5.c("json"), da.a.e), dVar.d(), g8Var)), eVar, p3Var, vVar);
    }

    public static ColorStateList l(Context context, int i10) {
        int c10 = a3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{a3.b, a3.d, a3.c, a3.f}, new int[]{a3.b(context, R.attr.colorButtonNormal), i0.b.k(c10, i10), i0.b.k(c10, i10), i10});
    }

    public static g0 o(f1 f1Var, n0 n0Var, g0 g0Var, b2.l1 l1Var) {
        o1 y02 = f1Var.y0();
        int A = f1Var.A();
        Object l4 = y02.p() ? null : y02.l(A);
        int b10 = (f1Var.n() || y02.p()) ? -1 : y02.f(A, l1Var, false).b(e2.l0.S(f1Var.M0()) - l1Var.e);
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            g0 g0Var2 = (g0) n0Var.get(i10);
            if (t(g0Var2, l4, f1Var.n(), f1Var.l0(), f1Var.N(), b10)) {
                return g0Var2;
            }
        }
        if (n0Var.isEmpty() && g0Var != null && t(g0Var, l4, f1Var.n(), f1Var.l0(), f1Var.N(), b10)) {
            return g0Var;
        }
        return null;
    }

    public static LayerDrawable q(m2 m2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable g10 = m2Var.g(context, R.drawable.abc_star_black_48dp);
        Drawable g11 = m2Var.g(context, R.drawable.abc_star_half_black_48dp);
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

    public static List r(Map map) {
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
            arrayList.add(new d0(str, str2));
        }
        Collections.sort(arrayList, new x2.e(6));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean t(g0 g0Var, Object obj, boolean z10, int i10, int i11, int i12) {
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

    public void B() {
        if (((LocationManager) this.b) == null) {
            this.b = (LocationManager) w0.b.getSystemService("location");
        }
        try {
            ((LocationManager) this.b).requestLocationUpdates("gps", 1L, 0.0f, (ld) this.c);
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            ((LocationManager) this.b).requestLocationUpdates("network", 1L, 0.0f, (ld) this.d);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        try {
            Location lastKnownLocation = ((LocationManager) this.b).getLastKnownLocation("gps");
            this.f = lastKnownLocation;
            if (lastKnownLocation == null) {
                this.f = ((LocationManager) this.b).getLastKnownLocation("network");
            }
        } catch (Exception e10) {
            f8.g(e10, true);
        }
        ms msVar = (ms) this.e;
        if (msVar != null) {
            i0.r(msVar);
        }
        ms msVar2 = new ms(this, 15);
        this.e = msVar2;
        i0.h3(msVar2, 5000L);
    }

    public Task C(String str, String str2, Bundle bundle) {
        int i10;
        try {
            y(str, str2, bundle);
            j6.a aVar = (j6.a) this.c;
            n nVar = n.a;
            b4.d dVar = aVar.c;
            if (dVar.h() < 12000000) {
                return dVar.i() != 0 ? aVar.a(bundle).continueWithTask(nVar, new hf.b(27, aVar, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            m j10 = m.j(aVar.b);
            synchronized (j10) {
                i10 = j10.a;
                j10.a = i10 + 1;
            }
            return j10.k(new j6.k(i10, 1, bundle, 1)).continueWith(nVar, j6.b.a);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public void D() {
        if (((LocationManager) this.b) == null) {
            return;
        }
        ms msVar = (ms) this.e;
        if (msVar != null) {
            i0.r(msVar);
        }
        j();
    }

    public void E(boolean z10) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        ArrayList arrayList3 = (ArrayList) this.a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new bx0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new bx0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new bx0(this, i12, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void F() {
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

    public void G(o1 o1Var) {
        a5.a aVar = new a5.a(4, 6);
        if (((n0) this.b).isEmpty()) {
            d(aVar, (g0) this.e, o1Var);
            if (!Objects.equals((g0) this.f, (g0) this.e)) {
                d(aVar, (g0) this.f, o1Var);
            }
            if (!Objects.equals((g0) this.d, (g0) this.e) && !Objects.equals((g0) this.d, (g0) this.f)) {
                d(aVar, (g0) this.d, o1Var);
            }
        } else {
            for (int i10 = 0; i10 < ((n0) this.b).size(); i10++) {
                d(aVar, (g0) ((n0) this.b).get(i10), o1Var);
            }
            if (!((n0) this.b).contains((g0) this.d)) {
                d(aVar, (g0) this.d, o1Var);
            }
        }
        this.c = aVar.d(true);
    }

    public void H() {
        jf.f fVar = (jf.f) this.e;
        jf.f fVar2 = null;
        for (jf.f fVar3 : ((HashMap) this.a).values()) {
            if (fVar3.m || fVar3.b.a != 0) {
                if (fVar2 == null || fVar3.d > fVar2.d) {
                    fVar2 = fVar3;
                }
            }
        }
        if (fVar != fVar2) {
            this.e = fVar2;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            sb2.append(fVar2 != null ? fVar2.c : null);
            Log.i("PIP_DEBUG", sb2.toString());
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (fVar2 != null) {
                    i0.v3(launchActivity, fVar2.a());
                } else {
                    i0.b3(launchActivity);
                }
            }
            int i10 = 0;
            if ((fVar != null && fVar.f) != (fVar2 != null && fVar2.f)) {
                y yVar = (y) this.f;
                if (yVar != null) {
                    try {
                        synchronized (y.b) {
                            y.c.remove(yVar.a.i);
                        }
                        yVar.a.r();
                    } catch (Exception unused) {
                    }
                    this.f = null;
                }
                if (fVar2 != null) {
                    m4.s sVar = new m4.s((LaunchActivity) this.d, fVar2.l);
                    sVar.c = "pip-media-session";
                    t6.p(!sVar.m);
                    sVar.m = true;
                    Context context = sVar.a;
                    Object obj = y.b;
                    int intValue = ((Integer) f0.C.get()).intValue();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 < 27) {
                        intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
                    }
                    e2.d dVar = sVar.g;
                    if (dVar == null) {
                        c5.e eVar = new c5.e();
                        eVar.c = context;
                        eVar.a = -1;
                        eVar.a = intValue;
                        eVar.b = true;
                        sVar.g = new g2.j(eVar);
                    } else {
                        sVar.g = new x(dVar, intValue, 10);
                    }
                    if (i11 == 29) {
                        e2.d dVar2 = sVar.g;
                        AtomicReference atomicReference = m4.s.n;
                        i9.a aVar = (i9.a) atomicReference.get();
                        if (aVar == null) {
                            Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                            Point point = new Point();
                            defaultDisplay.getSize(point);
                            Point point2 = new Point();
                            defaultDisplay.getRealSize(point2);
                            int i12 = point2.y;
                            int i13 = point2.x;
                            Point point3 = new Point(i12 - (i13 - point.x), i13 - (i12 - point.y));
                            i9.a aVar2 = new i9.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                            atomicReference.set(aVar2);
                            aVar = aVar2;
                        }
                        sVar.g = new n4.q(dVar2, aVar);
                    }
                    sVar.g = new m4.c(sVar.g, i10);
                    this.f = new y(sVar.a, sVar.c, sVar.b, sVar.i, sVar.j, sVar.k, sVar.d, sVar.e, sVar.f, sVar.g, sVar.h, sVar.l);
                }
            }
            if (fVar != null) {
                lf.e eVar2 = fVar.b;
                eVar2.n = false;
                eVar2.h();
                jf.f fVar4 = eVar2.j;
                ((jf.c) fVar4.a.b).a.remove(eVar2);
                ((jf.c) fVar4.a.b).b.remove(eVar2);
                f fVar5 = fVar4.a;
                String str = fVar4.c;
                HashMap hashMap = ((jf.c) fVar5.b).c;
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str);
                    }
                }
            }
            if (fVar2 != null) {
                y yVar2 = (y) this.f;
                if (yVar2 != null) {
                    f1 f1Var = yVar2.a.t.a;
                    i2.i0 i0Var = fVar2.l;
                    if (f1Var != i0Var) {
                        yVar2.a(i0Var);
                    }
                }
                ((jf.a) this.c).bringToFront();
                lf.e eVar3 = fVar2.b;
                jf.f fVar6 = eVar3.j;
                ((jf.c) fVar6.a.b).a.add(eVar3);
                ((jf.c) fVar6.a.b).b.add(eVar3);
                f fVar7 = fVar6.a;
                String str2 = fVar6.c;
                HashMap hashMap2 = ((jf.c) fVar7.b).c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str2, arrayList2);
                }
                arrayList2.add(null);
            } else if (fVar != null && i0.H1((LaunchActivity) this.d)) {
                ((LaunchActivity) this.d).moveTaskToBack(false);
            }
            ((jf.a) this.c).invalidate();
        }
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public void d(a5.a aVar, g0 g0Var, o1 o1Var) {
        if (g0Var == null) {
            return;
        }
        if (o1Var.b(g0Var.a) != -1) {
            aVar.w(g0Var, o1Var);
            return;
        }
        o1 o1Var2 = (o1) ((c2) this.c).get(g0Var);
        if (o1Var2 != null) {
            aVar.w(g0Var, o1Var2);
        }
    }

    public l5.h f() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((l5.l) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = sc.e.A(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = sc.e.A(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = sc.e.A(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new l5.h((String) this.a, (Integer) this.b, (l5.l) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public q9.b g() {
        n6.l.h((String) this.f, "setActionToken is required before calling build().");
        new String((String) this.e);
        v("actionToken", (String) this.f);
        String str = (String) this.c;
        if ((str == null ? null : new String(str)) == null) {
            this.c = "AssistAction";
            v("name", "AssistAction");
        }
        String str2 = (String) this.d;
        if ((str2 != null ? new String(str2) : null) == null) {
            String valueOf = String.valueOf((String) this.f);
            String concat = valueOf.length() != 0 ? "https://developers.google.com/actions?invocation=".concat(valueOf) : new String("https://developers.google.com/actions?invocation=");
            n6.l.g(concat);
            this.d = concat;
            v("url", concat);
        }
        n6.l.h((String) this.c, "setObject is required before calling build().");
        n6.l.h((String) this.d, "setObject is required before calling build().");
        return new q9.b((String) this.b, (String) this.c, (String) this.d, null, new q9.a(), (String) this.e, (Bundle) this.a);
    }

    public l0 h() {
        String str = ((Long) this.a) == null ? " timestamp" : "";
        if (((String) this.b) == null) {
            str = str.concat(" type");
        }
        if (((u1) this.c) == null) {
            str = sc.e.A(str, " app");
        }
        if (((v1) this.d) == null) {
            str = sc.e.A(str, " device");
        }
        if (str.isEmpty()) {
            return new l0(((Long) this.a).longValue(), (String) this.b, (u1) this.c, (v1) this.d, (w1) this.e, (z1) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public u0 i() {
        String str = ((Integer) this.b) == null ? " batteryVelocity" : "";
        if (((Boolean) this.c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = sc.e.A(str, " orientation");
        }
        if (((Long) this.e) == null) {
            str = sc.e.A(str, " ramUsed");
        }
        if (((Long) this.f) == null) {
            str = sc.e.A(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new u0((Double) this.a, ((Integer) this.b).intValue(), ((Boolean) this.c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void j() {
        ((LocationManager) this.b).removeUpdates((ld) this.c);
        ((LocationManager) this.b).removeUpdates((ld) this.d);
        this.f = null;
        this.e = null;
    }

    public void m(jf.f fVar) {
        if (((jf.f) this.e) == fVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (fVar != null) {
                    i0.v3(launchActivity, fVar.a());
                } else {
                    i0.b3(launchActivity);
                }
            }
            y yVar = (y) this.f;
            if (yVar != null) {
                f1 f1Var = yVar.a.t.a;
                i2.i0 i0Var = fVar.l;
                if (f1Var != i0Var) {
                    yVar.a(i0Var);
                }
            }
        }
        ((jf.a) this.c).invalidate();
    }

    public Task n(Task task) {
        return task.continueWith(new a3.b(3), new wh.b(this, 4));
    }

    public jf.a p() {
        if (((jf.a) this.c) == null) {
            this.c = new jf.a((LaunchActivity) this.d);
        }
        return (jf.a) this.c;
    }

    public ColorStateList s(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return r7.a(context, R.color.abc_tint_edittext);
        }
        if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return r7.a(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return l(context, a3.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return l(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return l(context, a3.c(context, R.attr.colorAccent));
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return r7.a(context, R.color.abc_tint_spinner);
            }
            if (e((int[]) this.b, i10)) {
                return a3.d(context, R.attr.colorControlNormal);
            }
            if (e((int[]) this.e, i10)) {
                return r7.a(context, R.color.abc_tint_default);
            }
            if (e((int[]) this.f, i10)) {
                return r7.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return r7.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = a3.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = a3.b;
            iArr2[0] = a3.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = a3.e;
            iArr2[1] = a3.c(context, R.attr.colorControlActivated);
            iArr[2] = a3.f;
            iArr2[2] = a3.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = a3.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = a3.e;
            iArr2[1] = a3.c(context, R.attr.colorControlActivated);
            iArr[2] = a3.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void u(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        n4.q qVar;
        boolean equals = str2.equals("crash");
        x9.q qVar2 = (x9.q) this.a;
        Context context = qVar2.a;
        int i10 = context.getResources().getConfiguration().orientation;
        n4.q qVar3 = qVar2.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        ji.f fVar = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            fVar = new ji.f(th4.getLocalizedMessage(), th4.getClass().getName(), qVar3.h0(th4.getStackTrace()), fVar, 4);
        }
        ji.f fVar2 = fVar;
        f fVar3 = new f();
        fVar3.b = str2;
        fVar3.a = Long.valueOf(j10);
        t1 b10 = u9.d.a.b(context);
        int i11 = ((t0) b10).c;
        Boolean valueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList a2 = u9.d.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) fVar2.d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        List d = x9.q.d(stackTraceElementArr, 4);
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
                    qVar = qVar3;
                } else {
                    StackTraceElement[] h02 = qVar3.h0(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d10 = x9.q.d(h02, 0);
                    if (d10 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    qVar = qVar3;
                    arrayList.add(new r0(name2, 0, d10));
                }
                it2 = it;
                qVar3 = qVar;
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        p0 c10 = x9.q.c(fVar2, 0);
        q0 q0Var = new q0(0L, "0", "0");
        List a10 = qVar2.a();
        if (a10 == null) {
            throw new NullPointerException("Null binaries");
        }
        fVar3.c = new m0(new z9.n0(unmodifiableList, c10, null, q0Var, a10), null, null, valueOf, b10, a2, i10);
        fVar3.d = qVar2.b(i10);
        l0 h = fVar3.h();
        ca.b bVar = (ca.b) this.b;
        y9.e eVar = (y9.e) this.d;
        p3 p3Var = (p3) this.e;
        bVar.d(c(a(h, eVar, p3Var), p3Var), str, equals);
    }

    public void v(String str, String... strArr) {
        Bundle bundle = (Bundle) this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            w7.t6.a("String array is empty and is ignored by put method.");
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
                w7.t6.a(sb2.toString());
            } else {
                int i12 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb3 = new StringBuilder(53);
                    sb3.append("String at ");
                    sb3.append(i11);
                    sb3.append(" is too long, truncating string.");
                    w7.t6.a(sb3.toString());
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
                w7.t6.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:? -> B:43:0x0137). Please report as a decompilation issue!!! */
    public Task w(Executor executor, String str) {
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
                        str2 = (String) x9.x.a(((ra.c) ((v) this.f).d).d());
                    } catch (Exception e10) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e10);
                        str2 = null;
                    }
                    a8 a2 = bVar3.a.a();
                    a2.d = str2;
                    bVar = new x9.b(a2.a(), bVar3.b, bVar3.c);
                } else {
                    bVar = bVar3;
                }
                boolean z10 = str != null;
                da.b bVar4 = aVar.a;
                ArrayBlockingQueue arrayBlockingQueue2 = bVar4.f;
                synchronized (arrayBlockingQueue2) {
                    try {
                        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) bVar4.i.b).getAndIncrement();
                            if (bVar4.f.size() < bVar4.e) {
                                u9.c cVar = u9.c.a;
                                cVar.b("Enqueueing report: " + bVar.b);
                                cVar.b("Queue size: " + bVar4.f.size());
                                try {
                                    arrayBlockingQueue = arrayBlockingQueue2;
                                    try {
                                        taskCompletionSource = taskCompletionSource2;
                                        bVar4.g.execute(new w(bVar4, bVar, taskCompletionSource2, false, 4));
                                        cVar.b("Closing task for report: " + bVar.b);
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
                                bVar4.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) bVar4.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            taskCompletionSource = taskCompletionSource2;
                            bVar4.b(bVar, taskCompletionSource);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        arrayBlockingQueue = arrayBlockingQueue2;
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new m1(this)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void x(float f7, float f10, float f11, float f12) {
        RectF rectF = i0.P;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        F();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(String str, String str2, Bundle bundle) {
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
        p4 p4Var = (p4) this.b;
        synchronized (p4Var) {
            try {
                if (p4Var.a == 0 && (d = p4Var.d("com.google.android.gms")) != null) {
                    p4Var.a = d.versionCode;
                }
                i10 = p4Var.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((p4) this.b).a());
        bundle.putString("app_ver_name", ((p4) this.b).b());
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
            za.b bVar = (za.b) ((qa.b) this.d).get();
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
            za.b bVar2 = (za.b) ((qa.b) this.d).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((ra.c) ((ra.d) this.f)).d()));
        bundle.putString("cliv", "fcm-23.4.0");
        fVar = (oa.f) ((qa.b) this.e).get();
        za.b bVar22 = (za.b) ((qa.b) this.d).get();
        if (fVar == null || bVar22 == null || (a2 = ((oa.c) fVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(m1.j.c(a2)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public void z(float f7, float f10, float f11, float f12) {
        Matrix matrix = (Matrix) this.f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.c;
        matrix.postRotate(f12, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f11, f11);
        matrix.postTranslate(f7, f10);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public f(int i10, int i11) {
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
        F();
    }

    public f(int i10) {
        switch (i10) {
            case 5:
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
                F();
                break;
            case 6:
                this.a = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                break;
            case 7:
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

    public f(mz mzVar) {
        int i10 = 1;
        this.c = new ld(this, i10);
        this.d = new ld(this, i10);
        this.a = mzVar;
    }
}

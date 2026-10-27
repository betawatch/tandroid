package aa;

import a8.ff;
import a8.kc;
import a8.ng;
import a8.vf;
import a8.yb;
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
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.b3;
import m.m2;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public static n0 a(n0 n0Var, z9.e eVar, r3 r3Var) {
        m0 a2 = n0Var.a();
        String y3 = ((z9.c) eVar.b).y();
        if (y3 != null) {
            a2.e = new x0(y3);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List q5 = q(((z9.d) ((AtomicMarkableReference) ((c2.b) r3Var.d).b).getReference()).a());
        List q9 = q(((z9.d) ((AtomicMarkableReference) ((c2.b) r3Var.e).b).getReference()).a());
        if (!q5.isEmpty() || !q9.isEmpty()) {
            o0 o0Var = (o0) n0Var.c;
            u1 u1Var = o0Var.a;
            Boolean bool = o0Var.d;
            v1 v1Var = o0Var.e;
            List list = o0Var.f;
            int i10 = o0Var.g;
            String str = u1Var == null ? " execution" : "";
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            a2.c = new o0(u1Var, q5, q9, bool, v1Var, list, i10);
        }
        return a2.f();
    }

    public static c2 c(n0 n0Var, r3 r3Var) {
        List l4 = ((d5.z) r3Var.f).l();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < l4.size(); i10++) {
            z9.l lVar = (z9.l) l4.get(i10);
            lVar.getClass();
            com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q();
            z9.b bVar = (z9.b) lVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            qVar.b = new z0(str2, str);
            String str3 = bVar.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            qVar.a = str3;
            String str4 = bVar.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            qVar.c = str4;
            qVar.d = Long.valueOf(bVar.f);
            arrayList.add(qVar.e());
        }
        if (arrayList.isEmpty()) {
            return n0Var;
        }
        m0 a2 = n0Var.a();
        a2.f = new a1(arrayList);
        return a2.f();
    }

    public static boolean e(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static m0 j(Context context, y9.v vVar, da.c cVar, y9.a aVar, z9.e eVar, r3 r3Var, rf.b bVar, b0 b0Var, y9.l lVar, y9.j jVar) {
        y9.q qVar = new y9.q(context, vVar, aVar, bVar, b0Var);
        da.b bVar2 = new da.b(cVar, b0Var, jVar);
        ba.a aVar2 = ea.a.b;
        m5.t.b(context);
        return new m0(qVar, bVar2, new ea.a(new ea.c(m5.t.a().c(new k5.a(ea.a.c, ea.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new j5.c("json"), ea.a.e), b0Var.d(), lVar)), eVar, r3Var, vVar);
    }

    public static ColorStateList k(Context context, int i10) {
        int c10 = b3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{b3.b, b3.d, b3.c, b3.f}, new int[]{b3.b(context, R.attr.colorButtonNormal), i0.a.k(c10, i10), i0.a.k(c10, i10), i10});
    }

    public static u2.g0 n(b2.g1 g1Var, f9.i0 i0Var, u2.g0 g0Var, b2.m1 m1Var) {
        b2.p1 y02 = g1Var.y0();
        int A = g1Var.A();
        Object l4 = y02.p() ? null : y02.l(A);
        int b10 = (g1Var.n() || y02.p()) ? -1 : y02.f(A, m1Var, false).b(e2.n0.S(g1Var.M0()) - m1Var.e);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            u2.g0 g0Var2 = (u2.g0) i0Var.get(i10);
            if (s(g0Var2, l4, g1Var.n(), g1Var.m0(), g1Var.N(), b10)) {
                return g0Var2;
            }
        }
        if (i0Var.isEmpty() && g0Var != null && s(g0Var, l4, g1Var.n(), g1Var.m0(), g1Var.N(), b10)) {
            return g0Var;
        }
        return null;
    }

    public static LayerDrawable p(m2 m2Var, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable g7 = m2Var.g(context, R.drawable.abc_star_black_48dp);
        Drawable g10 = m2Var.g(context, R.drawable.abc_star_half_black_48dp);
        if ((g7 instanceof BitmapDrawable) && g7.getIntrinsicWidth() == dimensionPixelSize && g7.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) g7;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            g7.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g7.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((g10 instanceof BitmapDrawable) && g10.getIntrinsicWidth() == dimensionPixelSize && g10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) g10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            g10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static List q(Map map) {
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
            arrayList.add(new e0(str, str2));
        }
        Collections.sort(arrayList, new y2.p(2));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean s(u2.g0 g0Var, Object obj, boolean z10, int i10, int i11, int i12) {
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

    public static void z(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = m.l1.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = m.q.b;
        }
        PorterDuff.Mode mode2 = m.q.b;
        synchronized (m.q.class) {
            h = m2.h(i10, mode);
        }
        mutate.setColorFilter(h);
    }

    public Task A(String str, String str2, Bundle bundle) {
        int i10;
        try {
            x(str, str2, bundle);
            k6.a aVar = (k6.a) this.c;
            k6.n nVar = k6.n.a;
            b4.d dVar = aVar.c;
            if (dVar.f() < 12000000) {
                return dVar.g() != 0 ? aVar.a(bundle).continueWithTask(nVar, new rf.b(28, aVar, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            k6.m j10 = k6.m.j(aVar.b);
            synchronized (j10) {
                i10 = j10.a;
                j10.a = i10 + 1;
            }
            return j10.k(new k6.l(i10, 1, bundle, 1)).continueWith(nVar, k6.b.a);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public void B(boolean z10) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        ArrayList arrayList3 = (ArrayList) this.a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new cz0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new cz0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new cz0(this, i12, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void C() {
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

    public void D(b2.p1 p1Var) {
        ng ngVar = new ng(4, 7);
        if (((f9.i0) this.b).isEmpty()) {
            d(ngVar, (u2.g0) this.e, p1Var);
            if (!Objects.equals((u2.g0) this.f, (u2.g0) this.e)) {
                d(ngVar, (u2.g0) this.f, p1Var);
            }
            if (!Objects.equals((u2.g0) this.d, (u2.g0) this.e) && !Objects.equals((u2.g0) this.d, (u2.g0) this.f)) {
                d(ngVar, (u2.g0) this.d, p1Var);
            }
        } else {
            for (int i10 = 0; i10 < ((f9.i0) this.b).size(); i10++) {
                d(ngVar, (u2.g0) ((f9.i0) this.b).get(i10), p1Var);
            }
            if (!((f9.i0) this.b).contains((u2.g0) this.d)) {
                d(ngVar, (u2.g0) this.d, p1Var);
            }
        }
        this.c = ngVar.c(true);
    }

    public void E() {
        sf.d dVar = (sf.d) this.e;
        sf.d dVar2 = null;
        for (sf.d dVar3 : ((HashMap) this.a).values()) {
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
            int i10 = 0;
            if ((dVar != null && dVar.f) != (dVar2 != null && dVar2.f)) {
                m4.y yVar = (m4.y) this.f;
                if (yVar != null) {
                    try {
                        synchronized (m4.y.b) {
                            m4.y.c.remove(yVar.a.i);
                        }
                        yVar.a.r();
                    } catch (Exception unused) {
                    }
                    this.f = null;
                }
                if (dVar2 != null) {
                    m4.s sVar = new m4.s((LaunchActivity) this.d, dVar2.l);
                    sVar.c = "pip-media-session";
                    yb.p(!sVar.m);
                    sVar.m = true;
                    Context context = sVar.a;
                    Object obj = m4.y.b;
                    int intValue = ((Integer) m4.f0.C.get()).intValue();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 < 27) {
                        intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
                    }
                    e2.d dVar4 = sVar.g;
                    int i12 = 6;
                    if (dVar4 == null) {
                        d5.f fVar = new d5.f();
                        fVar.c = context;
                        fVar.a = -1;
                        fVar.a = intValue;
                        fVar.b = true;
                        sVar.g = new g2.i(fVar);
                    } else {
                        sVar.g = new d5.z(dVar4, intValue, i12);
                    }
                    if (i11 == 29) {
                        e2.d dVar5 = sVar.g;
                        AtomicReference atomicReference = m4.s.n;
                        j9.a aVar = (j9.a) atomicReference.get();
                        if (aVar == null) {
                            Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                            Point point = new Point();
                            defaultDisplay.getSize(point);
                            Point point2 = new Point();
                            defaultDisplay.getRealSize(point2);
                            int i13 = point2.y;
                            int i14 = point2.x;
                            Point point3 = new Point(i13 - (i14 - point.x), i14 - (i13 - point.y));
                            j9.a aVar2 = new j9.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                            atomicReference.set(aVar2);
                            aVar = aVar2;
                        }
                        sVar.g = new m4.w1(i10, dVar5, aVar);
                    }
                    sVar.g = new m4.c(sVar.g, i10);
                    this.f = new m4.y(sVar.a, sVar.c, sVar.b, sVar.i, sVar.j, sVar.k, sVar.d, sVar.e, sVar.f, sVar.g, sVar.h, sVar.l);
                }
            }
            if (dVar != null) {
                uf.e eVar = dVar.b;
                eVar.n = false;
                eVar.h();
                sf.d dVar6 = eVar.j;
                ((sf.b) dVar6.a.b).a.remove(eVar);
                ((sf.b) dVar6.a.b).b.remove(eVar);
                m0 m0Var = dVar6.a;
                String str = dVar6.c;
                HashMap hashMap = ((sf.b) m0Var.b).c;
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str);
                    }
                }
            }
            if (dVar2 != null) {
                m4.y yVar2 = (m4.y) this.f;
                if (yVar2 != null) {
                    b2.g1 g1Var = yVar2.a.t.a;
                    i2.j0 j0Var = dVar2.l;
                    if (g1Var != j0Var) {
                        yVar2.a(j0Var);
                    }
                }
                ((sf.a) this.c).bringToFront();
                uf.e eVar2 = dVar2.b;
                sf.d dVar7 = eVar2.j;
                ((sf.b) dVar7.a.b).a.add(eVar2);
                ((sf.b) dVar7.a.b).b.add(eVar2);
                m0 m0Var2 = dVar7.a;
                String str2 = dVar7.c;
                HashMap hashMap2 = ((sf.b) m0Var2.b).c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str2, arrayList2);
                }
                arrayList2.add(null);
            } else if (dVar != null && AndroidUtilities.isInPictureInPictureMode((LaunchActivity) this.d)) {
                ((LaunchActivity) this.d).moveTaskToBack(false);
            }
            ((sf.a) this.c).invalidate();
        }
    }

    public void b(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public void d(ng ngVar, u2.g0 g0Var, b2.p1 p1Var) {
        if (g0Var == null) {
            return;
        }
        if (p1Var.b(g0Var.a) != -1) {
            ngVar.w(g0Var, p1Var);
            return;
        }
        b2.p1 p1Var2 = (b2.p1) ((f9.x1) this.c).get(g0Var);
        if (p1Var2 != null) {
            ngVar.w(g0Var, p1Var2);
        }
    }

    public n0 f() {
        String str = ((Long) this.a) == null ? " timestamp" : "";
        if (((String) this.b) == null) {
            str = str.concat(" type");
        }
        if (((w1) this.c) == null) {
            str = b10.u(str, " app");
        }
        if (((x1) this.d) == null) {
            str = b10.u(str, " device");
        }
        if (str.isEmpty()) {
            return new n0(((Long) this.a).longValue(), (String) this.b, (w1) this.c, (x1) this.d, (y1) this.e, (b2) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public w0 g() {
        String str = ((Integer) this.c) == null ? " batteryVelocity" : "";
        if (((Boolean) this.d) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.e) == null) {
            str = b10.u(str, " orientation");
        }
        if (((Long) this.a) == null) {
            str = b10.u(str, " ramUsed");
        }
        if (((Long) this.f) == null) {
            str = b10.u(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new w0((Double) this.b, ((Integer) this.c).intValue(), ((Boolean) this.d).booleanValue(), ((Integer) this.e).intValue(), ((Long) this.a).longValue(), ((Long) this.f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public m5.h h() {
        String str = ((String) this.b) == null ? " transportName" : "";
        if (((m5.m) this.d) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.a) == null) {
            str = b10.u(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = b10.u(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = b10.u(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new m5.h((String) this.b, (Integer) this.c, (m5.m) this.d, ((Long) this.a).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public r9.b i() {
        o6.l.i((String) this.f, "setActionToken is required before calling build().");
        new String((String) this.e);
        u("actionToken", (String) this.f);
        String str = (String) this.c;
        if ((str == null ? null : new String(str)) == null) {
            this.c = "AssistAction";
            u("name", "AssistAction");
        }
        String str2 = (String) this.d;
        if ((str2 != null ? new String(str2) : null) == null) {
            String valueOf = String.valueOf((String) this.f);
            String concat = valueOf.length() != 0 ? "https://developers.google.com/actions?invocation=".concat(valueOf) : new String("https://developers.google.com/actions?invocation=");
            o6.l.h(concat);
            this.d = concat;
            u("url", concat);
        }
        o6.l.i((String) this.c, "setObject is required before calling build().");
        o6.l.i((String) this.d, "setObject is required before calling build().");
        return new r9.b((String) this.b, (String) this.c, (String) this.d, null, new r9.a(), (String) this.e, (Bundle) this.a);
    }

    public void l(sf.d dVar) {
        if (((sf.d) this.e) == dVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, dVar.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            m4.y yVar = (m4.y) this.f;
            if (yVar != null) {
                b2.g1 g1Var = yVar.a.t.a;
                i2.j0 j0Var = dVar.l;
                if (g1Var != j0Var) {
                    yVar.a(j0Var);
                }
            }
        }
        ((sf.a) this.c).invalidate();
    }

    public Task m(Task task) {
        return task.continueWith(new a3.b(2), new a1.c(this, 16));
    }

    public sf.a o() {
        if (((sf.a) this.c) == null) {
            this.c = new sf.a((LaunchActivity) this.d);
        }
        return (sf.a) this.c;
    }

    public ColorStateList r(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return kc.a(context, R.color.abc_tint_edittext);
        }
        if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return kc.a(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return k(context, b3.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return k(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return k(context, b3.c(context, R.attr.colorAccent));
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return kc.a(context, R.color.abc_tint_spinner);
            }
            if (e(i10, (int[]) this.b)) {
                return b3.d(context, R.attr.colorControlNormal);
            }
            if (e(i10, (int[]) this.e)) {
                return kc.a(context, R.color.abc_tint_default);
            }
            if (e(i10, (int[]) this.f)) {
                return kc.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return kc.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = b3.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = b3.b;
            iArr2[0] = b3.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = b3.e;
            iArr2[1] = b3.c(context, R.attr.colorControlActivated);
            iArr[2] = b3.f;
            iArr2[2] = b3.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = b3.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = b3.e;
            iArr2[1] = b3.c(context, R.attr.colorControlActivated);
            iArr[2] = b3.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void t(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        rf.b bVar;
        boolean equals = str2.equals("crash");
        y9.q qVar = (y9.q) this.a;
        Context context = qVar.a;
        int i10 = context.getResources().getConfiguration().orientation;
        rf.b bVar2 = qVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        com.google.firebase.messaging.q qVar2 = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            qVar2 = new com.google.firebase.messaging.q(th4.getLocalizedMessage(), th4.getClass().getName(), bVar2.w(th4.getStackTrace()), qVar2);
        }
        m0 m0Var = new m0();
        m0Var.b = str2;
        m0Var.a = Long.valueOf(j10);
        v1 b10 = v9.c.a.b(context);
        int i11 = ((v0) b10).c;
        Boolean valueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList a2 = v9.c.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) qVar2.c;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        List d = y9.q.d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        arrayList.add(new t0(name, 4, d));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    bVar = bVar2;
                } else {
                    StackTraceElement[] w10 = bVar2.w(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d10 = y9.q.d(w10, 0);
                    if (d10 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    bVar = bVar2;
                    arrayList.add(new t0(name2, 0, d10));
                }
                it2 = it;
                bVar2 = bVar;
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        r0 c10 = y9.q.c(qVar2, 0);
        s0 s0Var = new s0(0L, "0", "0");
        List a10 = qVar.a();
        if (a10 == null) {
            throw new NullPointerException("Null binaries");
        }
        m0Var.c = new o0(new p0(unmodifiableList, c10, null, s0Var, a10), null, null, valueOf, b10, a2, i10);
        m0Var.d = qVar.b(i10);
        n0 f7 = m0Var.f();
        da.b bVar3 = (da.b) this.b;
        z9.e eVar = (z9.e) this.d;
        r3 r3Var = (r3) this.e;
        bVar3.d(c(a(f7, eVar, r3Var), r3Var), str, equals);
    }

    public void u(String str, String... strArr) {
        Bundle bundle = (Bundle) this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            vf.a("String array is empty and is ignored by put method.");
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
                vf.a(sb2.toString());
            } else {
                int i12 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb3 = new StringBuilder(53);
                    sb3.append("String at ");
                    sb3.append(i11);
                    sb3.append(" is too long, truncating string.");
                    vf.a(sb3.toString());
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
                vf.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    public Task v(Executor executor, String str) {
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((da.b) this.b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                ba.a aVar = da.b.g;
                String e = da.b.e(file);
                aVar.getClass();
                arrayList.add(new y9.b(ba.a.i(e), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
            i10 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            int i13 = i12 + 1;
            y9.b bVar = (y9.b) arrayList.get(i12);
            if (str == null || str.equals(bVar.b)) {
                ea.a aVar2 = (ea.a) this.c;
                if (bVar.a.f == null) {
                    try {
                        str2 = (String) y9.x.a(((sa.c) ((y9.v) this.f).d).d());
                    } catch (Exception e11) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e11);
                        str2 = null;
                    }
                    ff a2 = bVar.a.a();
                    a2.e = str2;
                    bVar = new y9.b(a2.a(), bVar.b, bVar.c);
                }
                boolean z10 = str != null;
                ea.c cVar = aVar2.a;
                synchronized (cVar.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.i.a).getAndIncrement();
                            if (cVar.f.size() < cVar.e) {
                                v9.b bVar2 = v9.b.a;
                                bVar2.b("Enqueueing report: " + bVar.b);
                                bVar2.b("Queue size: " + cVar.f.size());
                                cVar.g.execute(new com.google.android.gms.common.api.internal.q1(cVar, bVar, taskCompletionSource, 5));
                                bVar2.b("Closing task for report: " + bVar.b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) cVar.i.b).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new vg.d(this)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void w(float f7, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        C();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        pa.f fVar;
        int a2;
        PackageInfo d;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        m9.h hVar = (m9.h) this.a;
        hVar.a();
        bundle.putString("gmp_app_id", hVar.c.b);
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
        synchronized (mVar) {
            try {
                if (mVar.a == 0 && (d = mVar.d("com.google.android.gms")) != null) {
                    mVar.a = d.versionCode;
                }
                i10 = mVar.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((com.google.firebase.messaging.m) this.b).a());
        bundle.putString("app_ver_name", ((com.google.firebase.messaging.m) this.b).b());
        m9.h hVar2 = (m9.h) this.a;
        hVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(hVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String str4 = ((sa.a) Tasks.await(((sa.c) ((sa.d) this.f)).e())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e) {
            e = e;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((sa.c) ((sa.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (pa.f) ((ra.b) this.e).get();
            za.b bVar = (za.b) ((ra.b) this.d).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((sa.c) ((sa.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (pa.f) ((ra.b) this.e).get();
            za.b bVar2 = (za.b) ((ra.b) this.d).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((sa.c) ((sa.d) this.f)).d()));
        bundle.putString("cliv", "fcm-23.4.0");
        fVar = (pa.f) ((ra.b) this.e).get();
        za.b bVar22 = (za.b) ((ra.b) this.d).get();
        if (fVar == null || bVar22 == null || (a2 = ((pa.c) fVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(m1.j.c(a2)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public void y(float f7, float f10, float f11, float f12) {
        Matrix matrix = (Matrix) this.f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.c;
        matrix.postRotate(f12, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f11, f11);
        matrix.postTranslate(f7, f10);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public m0(int i10, int i11) {
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
        C();
    }

    public m0(int i10) {
        switch (i10) {
            case 6:
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
                C();
                break;
            case 7:
                this.a = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                break;
            case 8:
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
}

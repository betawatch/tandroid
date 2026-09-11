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
import b2.b1;
import b2.h1;
import b2.k1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.c6;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.k0;
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
import m.a3;
import m.l1;
import m.m2;
import m.p3;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f11;
import u2.f0;
import v7.c8;
import v7.u7;
import w7.g6;
import y9.a2;
import y9.l0;
import y9.m0;
import y9.n0;
import y9.p0;
import y9.q0;
import y9.r0;
import y9.s1;
import y9.t0;
import y9.t1;
import y9.u0;
import y9.u1;
import y9.v0;
import y9.v1;
import y9.w1;
import y9.x0;
import y9.y0;
import y9.z1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n implements f6 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public static void C(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = l1.a;
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

    public static l0 b(l0 l0Var, x9.e eVar, p3 p3Var) {
        n a2 = l0Var.a();
        String e7 = ((x9.c) eVar.b).e();
        if (e7 != null) {
            a2.e = new v0(e7);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List s10 = s(((x9.d) ((AtomicMarkableReference) ((m) p3Var.d).b).getReference()).a());
        List s11 = s(((x9.d) ((AtomicMarkableReference) ((m) p3Var.e).b).getReference()).a());
        if (!s10.isEmpty() || !s11.isEmpty()) {
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
            a2.c = new m0(s1Var, s10, s11, bool, t1Var, list, i10);
        }
        return a2.i();
    }

    public static a2 d(l0 l0Var, p3 p3Var) {
        List g10 = ((c5.b0) p3Var.f).g();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < g10.size(); i10++) {
            x9.l lVar = (x9.l) g10.get(i10);
            lVar.getClass();
            s sVar = new s(13, false);
            x9.b bVar = (x9.b) lVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            sVar.c = new x0(str2, str);
            String str3 = bVar.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            sVar.b = str3;
            String str4 = bVar.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            sVar.d = str4;
            sVar.e = Long.valueOf(bVar.f);
            arrayList.add(sVar.a());
        }
        if (arrayList.isEmpty()) {
            return l0Var;
        }
        n a2 = l0Var.a();
        a2.f = new y0(arrayList);
        return a2.i();
    }

    public static boolean f(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static n k(Context context, w9.u uVar, ba.c cVar, w9.a aVar, x9.e eVar, p3 p3Var, n4.y yVar, da.b bVar, z0 z0Var, w9.j jVar) {
        w9.p pVar = new w9.p(context, uVar, aVar, yVar, bVar);
        ba.b bVar2 = new ba.b(cVar, bVar, jVar);
        z9.b bVar3 = ca.a.b;
        l5.s.b(context);
        return new n(pVar, bVar2, new ca.a(new ca.c(l5.s.a().c(new j5.a(ca.a.c, ca.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new i5.c("json"), ca.a.e), bVar.d(), z0Var)), eVar, p3Var, uVar);
    }

    public static ColorStateList m(Context context, int i10) {
        int c10 = a3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{a3.b, a3.d, a3.c, a3.f}, new int[]{a3.b(context, R.attr.colorButtonNormal), i0.a.h(c10, i10), i0.a.h(c10, i10), i10});
    }

    public static f0 p(b1 b1Var, i0 i0Var, f0 f0Var, h1 h1Var) {
        k1 w02 = b1Var.w0();
        int B = b1Var.B();
        Object l4 = w02.p() ? null : w02.l(B);
        int b10 = (b1Var.o() || w02.p()) ? -1 : w02.f(B, h1Var, false).b(e2.d0.Q(b1Var.J0()) - h1Var.e);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            f0 f0Var2 = (f0) i0Var.get(i10);
            if (u(f0Var2, l4, b1Var.o(), b1Var.k0(), b1Var.O(), b10)) {
                return f0Var2;
            }
        }
        if (i0Var.isEmpty() && f0Var != null && u(f0Var, l4, b1Var.o(), b1Var.k0(), b1Var.O(), b10)) {
            return f0Var;
        }
        return null;
    }

    public static LayerDrawable r(m2 m2Var, Context context, int i10) {
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

    public static List s(Map map) {
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
            arrayList.add(new y9.d0(str, str2));
        }
        Collections.sort(arrayList, new f11(11));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean u(f0 f0Var, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = f0Var.a;
        int i13 = f0Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10 && i13 == i10 && f0Var.c == i11) {
            return true;
        }
        return !z10 && i13 == -1 && f0Var.e == i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        na.f fVar;
        int a2;
        PackageInfo d;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        k9.h hVar = (k9.h) this.a;
        hVar.a();
        bundle.putString("gmp_app_id", hVar.c.b);
        p pVar = (p) this.b;
        synchronized (pVar) {
            try {
                if (pVar.a == 0 && (d = pVar.d("com.google.android.gms")) != null) {
                    pVar.a = d.versionCode;
                }
                i10 = pVar.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((p) this.b).a());
        bundle.putString("app_ver_name", ((p) this.b).b());
        k9.h hVar2 = (k9.h) this.a;
        hVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(hVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String str4 = ((qa.a) Tasks.await(((qa.c) ((qa.d) this.f)).e())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e7) {
            e = e7;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((qa.c) ((qa.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (na.f) ((pa.b) this.e).get();
            xa.b bVar = (xa.b) ((pa.b) this.d).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((qa.c) ((qa.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (na.f) ((pa.b) this.e).get();
            xa.b bVar2 = (xa.b) ((pa.b) this.d).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((qa.c) ((qa.d) this.f)).d()));
        bundle.putString("cliv", "fcm-23.4.0");
        fVar = (na.f) ((pa.b) this.e).get();
        xa.b bVar22 = (xa.b) ((pa.b) this.d).get();
        if (fVar == null || bVar22 == null || (a2 = ((na.c) fVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(m1.j.c(a2)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public void B(float f7, float f10, float f11, float f12) {
        Matrix matrix = (Matrix) this.f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.c;
        matrix.postRotate(f12, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f11, f11);
        matrix.postTranslate(f7, f10);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public Task D(String str, String str2, Bundle bundle) {
        int i10;
        try {
            A(str, str2, bundle);
            j6.a aVar = (j6.a) this.c;
            j6.m mVar = j6.m.a;
            b4.d dVar = aVar.c;
            if (dVar.f() < 12000000) {
                if (dVar.g() == 0) {
                    return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
                return aVar.a(bundle).continueWithTask(mVar, new pf.b(aVar, bundle, false, 24));
            }
            j6.l l4 = j6.l.l(aVar.b);
            synchronized (l4) {
                i10 = l4.a;
                l4.a = i10 + 1;
            }
            return l4.m(new j6.k(i10, 1, bundle, 1)).continueWith(mVar, j6.b.a);
        } catch (InterruptedException | ExecutionException e7) {
            return Tasks.forException(e7);
        }
    }

    public void E(boolean z10) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        ArrayList arrayList3 = (ArrayList) this.a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new tx0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new tx0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new tx0(this, i12, 2));
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

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
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
                return j6.S0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int G0(int i10) {
        return ((c6) this.f).C0.get(i10, j6.w0(null, i10, false));
    }

    public void H(k1 k1Var) {
        a5.a aVar = new a5.a(4, 5);
        if (((i0) this.b).isEmpty()) {
            e(aVar, (f0) this.e, k1Var);
            if (!Objects.equals((f0) this.f, (f0) this.e)) {
                e(aVar, (f0) this.f, k1Var);
            }
            if (!Objects.equals((f0) this.d, (f0) this.e) && !Objects.equals((f0) this.d, (f0) this.f)) {
                e(aVar, (f0) this.d, k1Var);
            }
        } else {
            for (int i10 = 0; i10 < ((i0) this.b).size(); i10++) {
                e(aVar, (f0) ((i0) this.b).get(i10), k1Var);
            }
            if (!((i0) this.b).contains((f0) this.d)) {
                e(aVar, (f0) this.d, k1Var);
            }
        }
        this.c = aVar.c();
    }

    public void I() {
        qf.e eVar = (qf.e) this.e;
        qf.e eVar2 = null;
        for (qf.e eVar3 : ((HashMap) this.a).values()) {
            if (eVar3.m || eVar3.b.a != 0) {
                if (eVar2 == null || eVar3.d > eVar2.d) {
                    eVar2 = eVar3;
                }
            }
        }
        if (eVar != eVar2) {
            this.e = eVar2;
            StringBuilder sb2 = new StringBuilder("onMaxPrioritySourceChanged ");
            sb2.append(eVar2 != null ? eVar2.c : null);
            Log.i("PIP_DEBUG", sb2.toString());
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (eVar2 != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, eVar2.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            boolean z10 = false;
            if ((eVar != null && eVar.f) != (eVar2 != null && eVar2.f)) {
                m4.t tVar = (m4.t) this.f;
                if (tVar != null) {
                    try {
                        synchronized (m4.t.b) {
                            m4.t.c.remove(tVar.a.i);
                        }
                        tVar.a.r();
                    } catch (Exception unused) {
                    }
                    this.f = null;
                }
                if (eVar2 != null) {
                    LaunchActivity launchActivity2 = (LaunchActivity) this.d;
                    i2.f0 f0Var = eVar2.l;
                    ob.a aVar = new ob.a(13);
                    launchActivity2.getClass();
                    f0Var.getClass();
                    Bundle bundle = new Bundle();
                    Bundle bundle2 = new Bundle();
                    g0 g0Var = i0.b;
                    a1 a1Var = a1.e;
                    this.f = new m4.t(launchActivity2, f0Var, a1Var, a1Var, a1Var, aVar, bundle, bundle2, new n4.y(24, new g2.i(launchActivity2), z10));
                }
            }
            if (eVar != null) {
                sf.e eVar4 = eVar.b;
                eVar4.n = false;
                eVar4.h();
                qf.e eVar5 = eVar4.j;
                ((qf.c) eVar5.a.b).a.remove(eVar4);
                ((qf.c) eVar5.a.b).b.remove(eVar4);
                n nVar = eVar5.a;
                String str = eVar5.c;
                HashMap hashMap = ((qf.c) nVar.b).c;
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str);
                    }
                }
            }
            if (eVar2 != null) {
                m4.t tVar2 = (m4.t) this.f;
                if (tVar2 != null) {
                    b1 b1Var = tVar2.a.t.a;
                    i2.f0 f0Var2 = eVar2.l;
                    if (b1Var != f0Var2) {
                        tVar2.a(f0Var2);
                    }
                }
                ((qf.a) this.c).bringToFront();
                sf.e eVar6 = eVar2.b;
                qf.e eVar7 = eVar6.j;
                ((qf.c) eVar7.a.b).a.add(eVar6);
                ((qf.c) eVar7.a.b).b.add(eVar6);
                n nVar2 = eVar7.a;
                String str2 = eVar7.c;
                HashMap hashMap2 = ((qf.c) nVar2.b).c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str2, arrayList2);
                }
                arrayList2.add(null);
            } else if (eVar != null && AndroidUtilities.isInPictureInPictureMode((LaunchActivity) this.d)) {
                ((LaunchActivity) this.d).moveTaskToBack(false);
            }
            ((qf.a) this.c).invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return ((c6) this.f).B0;
    }

    public void c(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public void e(a5.a aVar, f0 f0Var, k1 k1Var) {
        if (f0Var == null) {
            return;
        }
        if (k1Var.b(f0Var.a) != -1) {
            aVar.t(f0Var, k1Var);
            return;
        }
        k1 k1Var2 = (k1) ((k0) this.c).get(f0Var);
        if (k1Var2 != null) {
            aVar.t(f0Var, k1Var2);
        }
    }

    public l5.h g() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((l5.l) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = p6.t(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = p6.t(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = p6.t(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new l5.h((String) this.a, (Integer) this.b, (l5.l) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Drawable getDrawable(String str) {
        c6 c6Var = (c6) this.f;
        n nVar = c6Var.D0;
        if (str.equals("drawableMsgIn")) {
            if (c6Var.E0 == null) {
                c6Var.E0 = new f5(0, false, false, nVar);
            }
            return c6Var.E0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (c6Var.F0 == null) {
                c6Var.F0 = new f5(0, false, true, nVar);
            }
            return c6Var.F0;
        }
        if (str.equals("drawableMsgOut")) {
            if (c6Var.G0 == null) {
                c6Var.G0 = new f5(0, true, false, nVar);
            }
            return c6Var.G0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (c6Var.H0 == null) {
                c6Var.H0 = new f5(0, true, true, nVar);
            }
            return c6Var.H0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (c6Var.I0 == null) {
                c6Var.I0 = new f5(1, false, false, nVar);
            }
            c6Var.I0.invalidateSelf();
            return c6Var.I0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (c6Var.J0 == null) {
                c6Var.J0 = new f5(1, false, true, nVar);
            }
            return c6Var.J0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (c6Var.K0 == null) {
                c6Var.K0 = new f5(1, true, false, nVar);
            }
            return c6Var.K0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return j6.O0(str);
        }
        if (c6Var.L0 == null) {
            c6Var.L0 = new f5(1, true, true, nVar);
        }
        return c6Var.L0;
    }

    public p9.b h() {
        n6.l.i((String) this.f, "setActionToken is required before calling build().");
        new String((String) this.e);
        w("actionToken", (String) this.f);
        String str = (String) this.c;
        if ((str == null ? null : new String(str)) == null) {
            this.c = "AssistAction";
            w("name", "AssistAction");
        }
        String str2 = (String) this.d;
        if ((str2 != null ? new String(str2) : null) == null) {
            String valueOf = String.valueOf((String) this.f);
            String concat = valueOf.length() != 0 ? "https://developers.google.com/actions?invocation=".concat(valueOf) : new String("https://developers.google.com/actions?invocation=");
            n6.l.h(concat);
            this.d = concat;
            w("url", concat);
        }
        n6.l.i((String) this.c, "setObject is required before calling build().");
        n6.l.i((String) this.d, "setObject is required before calling build().");
        return new p9.b((String) this.b, (String) this.c, (String) this.d, null, new p9.a(), (String) this.e, (Bundle) this.a);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int h1(int i10) {
        return G0(i10);
    }

    public l0 i() {
        String str = ((Long) this.a) == null ? " timestamp" : "";
        if (((String) this.b) == null) {
            str = str.concat(" type");
        }
        if (((u1) this.c) == null) {
            str = p6.t(str, " app");
        }
        if (((v1) this.d) == null) {
            str = p6.t(str, " device");
        }
        if (str.isEmpty()) {
            return new l0(((Long) this.a).longValue(), (String) this.b, (u1) this.c, (v1) this.d, (w1) this.e, (z1) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public u0 j() {
        String str = ((Integer) this.b) == null ? " batteryVelocity" : "";
        if (((Boolean) this.c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = p6.t(str, " orientation");
        }
        if (((Long) this.e) == null) {
            str = p6.t(str, " ramUsed");
        }
        if (((Long) this.f) == null) {
            str = p6.t(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new u0((Double) this.a, ((Integer) this.b).intValue(), ((Boolean) this.c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void l(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    public void n(qf.e eVar) {
        if (((qf.e) this.e) == eVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (eVar != null) {
                    AndroidUtilities.setPictureInPictureParams(launchActivity, eVar.a());
                } else {
                    AndroidUtilities.resetPictureInPictureParams(launchActivity);
                }
            }
            m4.t tVar = (m4.t) this.f;
            if (tVar != null) {
                b1 b1Var = tVar.a.t.a;
                i2.f0 f0Var = eVar.l;
                if (b1Var != f0Var) {
                    tVar.a(f0Var);
                }
            }
        }
        ((qf.a) this.c).invalidate();
    }

    public Task o(Task task) {
        return task.continueWith(new a3.a(2), new a1.c(this, 15));
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean o0() {
        return false;
    }

    public qf.a q() {
        if (((qf.a) this.c) == null) {
            this.c = new qf.a((LaunchActivity) this.d);
        }
        return (qf.a) this.c;
    }

    public ColorStateList t(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return u7.a(context, R.color.abc_tint_edittext);
        }
        if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return u7.a(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return m(context, a3.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return m(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return m(context, a3.c(context, R.attr.colorAccent));
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return u7.a(context, R.color.abc_tint_spinner);
            }
            if (f(i10, (int[]) this.b)) {
                return a3.d(context, R.attr.colorControlNormal);
            }
            if (f(i10, (int[]) this.e)) {
                return u7.a(context, R.color.abc_tint_default);
            }
            if (f(i10, (int[]) this.f)) {
                return u7.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return u7.a(context, R.color.abc_tint_seek_thumb);
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

    public void v(Throwable th2, Thread thread, String str, String str2, long j3, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        n4.y yVar;
        boolean equals = str2.equals("crash");
        w9.p pVar = (w9.p) this.a;
        Context context = pVar.a;
        int i10 = context.getResources().getConfiguration().orientation;
        n4.y yVar2 = pVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        s sVar = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            sVar = new s(th4.getLocalizedMessage(), th4.getClass().getName(), yVar2.C(th4.getStackTrace()), sVar, 3);
        }
        s sVar2 = sVar;
        n nVar = new n();
        nVar.b = str2;
        nVar.a = Long.valueOf(j3);
        t1 b10 = t9.c.a.b(context);
        int i11 = ((t0) b10).c;
        Boolean valueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList a2 = t9.c.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar2.d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        List d = w9.p.d(stackTraceElementArr, 4);
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
                    yVar = yVar2;
                } else {
                    StackTraceElement[] C = yVar2.C(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d10 = w9.p.d(C, 0);
                    if (d10 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    yVar = yVar2;
                    arrayList.add(new r0(name2, 0, d10));
                }
                it2 = it;
                yVar2 = yVar;
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        p0 c10 = w9.p.c(sVar2, 0);
        q0 q0Var = new q0(0L, "0", "0");
        List a10 = pVar.a();
        if (a10 == null) {
            throw new NullPointerException("Null binaries");
        }
        nVar.c = new m0(new n0(unmodifiableList, c10, null, q0Var, a10), null, null, valueOf, b10, a2, i10);
        nVar.d = pVar.b(i10);
        l0 i12 = nVar.i();
        ba.b bVar = (ba.b) this.b;
        x9.e eVar = (x9.e) this.d;
        p3 p3Var = (p3) this.e;
        bVar.d(d(b(i12, eVar, p3Var), p3Var), str, equals);
    }

    public void w(String str, String... strArr) {
        Bundle bundle = (Bundle) this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            g6.a("String array is empty and is ignored by put method.");
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
                g6.a(sb2.toString());
            } else {
                int i12 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb3 = new StringBuilder(53);
                    sb3.append("String at ");
                    sb3.append(i11);
                    sb3.append(" is too long, truncating string.");
                    g6.a(sb3.toString());
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
                g6.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return j6.v3;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:? -> B:43:0x0137). Please report as a decompilation issue!!! */
    public Task y(Executor executor, String str) {
        w9.b bVar;
        ArrayBlockingQueue arrayBlockingQueue;
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((ba.b) this.b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                z9.b bVar2 = ba.b.g;
                String e7 = ba.b.e(file);
                bVar2.getClass();
                arrayList.add(new w9.b(z9.b.i(e7), file.getName(), file));
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
            w9.b bVar3 = (w9.b) arrayList.get(i12);
            if (str == null || str.equals(bVar3.b)) {
                ca.a aVar = (ca.a) this.c;
                if (bVar3.a.f == null) {
                    try {
                        str2 = (String) w9.w.a(((qa.c) ((w9.u) this.f).d).d());
                    } catch (Exception e11) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e11);
                        str2 = null;
                    }
                    c8 a2 = bVar3.a.a();
                    a2.d = str2;
                    bVar = new w9.b(a2.a(), bVar3.b, bVar3.c);
                } else {
                    bVar = bVar3;
                }
                boolean z10 = str != null;
                ca.c cVar = aVar.a;
                ArrayBlockingQueue arrayBlockingQueue2 = cVar.f;
                synchronized (arrayBlockingQueue2) {
                    try {
                        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.i.b).getAndIncrement();
                            if (cVar.f.size() < cVar.e) {
                                t9.b bVar4 = t9.b.a;
                                bVar4.b("Enqueueing report: " + bVar.b);
                                bVar4.b("Queue size: " + cVar.f.size());
                                try {
                                    arrayBlockingQueue = arrayBlockingQueue2;
                                    try {
                                        taskCompletionSource = taskCompletionSource2;
                                        cVar.g.execute(new c5.v(cVar, bVar, taskCompletionSource2, false, 4));
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
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new t0.a(this)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void z(float f7, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        F();
    }

    public n(int i10, int i11) {
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

    public n(int i10) {
        switch (i10) {
            case 4:
                this.a = new Bundle();
                this.b = "AssistAction";
                break;
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

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void O0(int i10, int i11) {
    }
}

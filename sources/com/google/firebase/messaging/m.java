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
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f7.f8;
import f7.t7;
import g7.d8;
import g9.a2;
import g9.l0;
import g9.m0;
import g9.n0;
import g9.p0;
import g9.r0;
import g9.s1;
import g9.t0;
import g9.t1;
import g9.u0;
import g9.u1;
import g9.v0;
import g9.v1;
import g9.w1;
import g9.x0;
import g9.y0;
import g9.z1;
import h3.c2;
import h3.p2;
import h3.r2;
import j$.util.DesugarCollections;
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
import kh.s5;
import m.d3;
import m.m1;
import m.n2;
import m.t3;
import o8.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.gb0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m implements b6 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public m(int i9, int i10) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = new RectF();
        this.f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i9), Math.max(1, i10), Bitmap.Config.ARGB_8888);
        this.c = createBitmap;
        this.b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.e = bitmapShader;
        paint.setShader(bitmapShader);
        C();
    }

    public static l0 b(l0 l0Var, f9.e eVar, t3 t3Var) {
        m a2 = l0Var.a();
        String c10 = ((f9.c) eVar.b).c();
        if (c10 != null) {
            a2.e = new v0(c10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List q10 = q(((f9.d) ((AtomicMarkableReference) ((l) t3Var.d).b).getReference()).a());
        List q11 = q(((f9.d) ((AtomicMarkableReference) ((l) t3Var.e).b).getReference()).a());
        if (!q10.isEmpty() || !q11.isEmpty()) {
            m0 m0Var = (m0) l0Var.c;
            s1 s1Var = m0Var.a;
            Boolean bool = m0Var.d;
            t1 t1Var = m0Var.e;
            List list = m0Var.f;
            int i9 = m0Var.g;
            String str = s1Var == null ? " execution" : "";
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            a2.c = new m0(s1Var, q10, q11, bool, t1Var, list, i9);
        }
        return a2.g();
    }

    public static a2 d(l0 l0Var, t3 t3Var) {
        List f10 = ((n2.w) t3Var.f).f();
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < f10.size(); i9++) {
            f9.n nVar = (f9.n) f10.get(i9);
            nVar.getClass();
            t tVar = new t(9, false);
            f9.b bVar = (f9.b) nVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            tVar.c = new x0(str2, str);
            String str3 = bVar.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            tVar.b = str3;
            String str4 = bVar.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            tVar.d = str4;
            tVar.e = Long.valueOf(bVar.f);
            arrayList.add(tVar.l());
        }
        if (arrayList.isEmpty()) {
            return l0Var;
        }
        m a2 = l0Var.a();
        a2.f = new y0(arrayList);
        return a2.g();
    }

    public static boolean f(int i9, int[] iArr) {
        for (int i10 : iArr) {
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    public static m k(Context context, e9.x xVar, j9.c cVar, e9.a aVar, f9.e eVar, t3 t3Var, g5.b bVar, c3.h hVar, we.b bVar2, e9.k kVar) {
        e9.r rVar = new e9.r(context, xVar, aVar, bVar, hVar);
        j9.b bVar3 = new j9.b(cVar, hVar, kVar);
        h9.c cVar2 = k9.a.b;
        w2.q.b(context);
        k9.a aVar2 = new k9.a(new k9.c(w2.q.a().c(new u2.a(k9.a.c, k9.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new t2.c("json"), k9.a.e), hVar.d(), bVar2));
        m mVar = new m();
        mVar.a = rVar;
        mVar.b = bVar3;
        mVar.c = aVar2;
        mVar.d = eVar;
        mVar.e = t3Var;
        mVar.f = xVar;
        return mVar;
    }

    public static ColorStateList l(Context context, int i9) {
        int c10 = d3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{d3.b, d3.d, d3.c, d3.f}, new int[]{d3.b(context, R.attr.colorButtonNormal), i0.a.h(c10, i9), i0.a.h(c10, i9), i9});
    }

    public static j4.d0 n(c2 c2Var, o8.z zVar, j4.d0 d0Var, p2 p2Var) {
        r2 A = c2Var.A();
        int l10 = c2Var.l();
        Object l11 = A.p() ? null : A.l(l10);
        int b10 = (c2Var.c() || A.p()) ? -1 : A.f(l10, p2Var, false).b(d5.f0.H(c2Var.D()) - p2Var.e);
        for (int i9 = 0; i9 < zVar.size(); i9++) {
            j4.d0 d0Var2 = (j4.d0) zVar.get(i9);
            if (s(d0Var2, l11, c2Var.c(), c2Var.w(), c2Var.m(), b10)) {
                return d0Var2;
            }
        }
        if (zVar.isEmpty() && d0Var != null && s(d0Var, l11, c2Var.c(), c2Var.w(), c2Var.m(), b10)) {
            return d0Var;
        }
        return null;
    }

    public static LayerDrawable p(n2 n2Var, Context context, int i9) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i9);
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
            arrayList.add(new g9.d0(str, str2));
        }
        Collections.sort(arrayList, new a5.e(14));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean s(j4.d0 d0Var, Object obj, boolean z10, int i9, int i10, int i11) {
        Object obj2 = d0Var.a;
        int i12 = d0Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10 && i12 == i9 && d0Var.c == i10) {
            return true;
        }
        return !z10 && i12 == -1 && d0Var.e == i11;
    }

    public static void z(Drawable drawable, int i9, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = m1.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = m.r.b;
        }
        PorterDuff.Mode mode2 = m.r.b;
        synchronized (m.r.class) {
            h = n2.h(i9, mode);
        }
        mutate.setColorFilter(h);
    }

    public Task A(String str, String str2, Bundle bundle) {
        int i9;
        try {
            x(str, str2, bundle);
            t5.a aVar = (t5.a) this.c;
            t5.m mVar = t5.m.a;
            com.google.android.exoplayer2.upstream.w wVar = aVar.c;
            if (wVar.f() < 12000000) {
                if (wVar.g() == 0) {
                    return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
                return aVar.a(bundle).continueWithTask(mVar, new e3(aVar, bundle, false, 22));
            }
            t5.l b10 = t5.l.b(aVar.b);
            synchronized (b10) {
                i9 = b10.a;
                b10.a = i9 + 1;
            }
            return b10.c(new t5.k(i9, 1, bundle, 1)).continueWith(mVar, t5.b.a);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    public void B(boolean z10) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        ArrayList arrayList3 = (ArrayList) this.a;
        for (int i9 = 0; i9 < arrayList3.size(); i9++) {
            ((ValueAnimator) arrayList3.get(i9)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i9)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new bx0(this, i9, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((ValueAnimator) arrayList2.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i10)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new bx0(this, i10, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ValueAnimator) arrayList.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i11)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new bx0(this, i11, 2));
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

    public void D(r2 r2Var) {
        a6.a aVar = new a6.a(4, 17);
        if (((o8.z) this.b).isEmpty()) {
            e(aVar, (j4.d0) this.e, r2Var);
            if (!g7.c0.a((j4.d0) this.f, (j4.d0) this.e)) {
                e(aVar, (j4.d0) this.f, r2Var);
            }
            if (!g7.c0.a((j4.d0) this.d, (j4.d0) this.e) && !g7.c0.a((j4.d0) this.d, (j4.d0) this.f)) {
                e(aVar, (j4.d0) this.d, r2Var);
            }
        } else {
            for (int i9 = 0; i9 < ((o8.z) this.b).size(); i9++) {
                e(aVar, (j4.d0) ((o8.z) this.b).get(i9), r2Var);
            }
            if (!((o8.z) this.b).contains((j4.d0) this.d)) {
                e(aVar, (j4.d0) this.d, r2Var);
            }
        }
        this.c = aVar.c();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public ColorFilter H() {
        return f6.v3;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int N0(int i9) {
        return ((s5) this.f).y0.get(i9, f6.w0(null, i9, false));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Paint O(String str) {
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
                return f6.S0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public boolean a() {
        return ((s5) this.f).x0;
    }

    public void c(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public void e(a6.a aVar, j4.d0 d0Var, r2 r2Var) {
        if (d0Var == null) {
            return;
        }
        if (r2Var.b(d0Var.a) != -1) {
            aVar.j(d0Var, r2Var);
            return;
        }
        r2 r2Var2 = (r2) ((q0) this.c).get(d0Var);
        if (r2Var2 != null) {
            aVar.j(d0Var, r2Var2);
        }
    }

    public l0 g() {
        String str = ((Long) this.a) == null ? " timestamp" : "";
        if (((String) this.b) == null) {
            str = str.concat(" type");
        }
        if (((u1) this.c) == null) {
            str = ta.b.j(str, " app");
        }
        if (((v1) this.d) == null) {
            str = ta.b.j(str, " device");
        }
        if (str.isEmpty()) {
            return new l0(((Long) this.a).longValue(), (String) this.b, (u1) this.c, (v1) this.d, (w1) this.e, (z1) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public Drawable getDrawable(String str) {
        s5 s5Var = (s5) this.f;
        m mVar = s5Var.z0;
        if (str.equals("drawableMsgIn")) {
            if (s5Var.A0 == null) {
                s5Var.A0 = new d5(0, false, false, mVar);
            }
            return s5Var.A0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (s5Var.B0 == null) {
                s5Var.B0 = new d5(0, false, true, mVar);
            }
            return s5Var.B0;
        }
        if (str.equals("drawableMsgOut")) {
            if (s5Var.C0 == null) {
                s5Var.C0 = new d5(0, true, false, mVar);
            }
            return s5Var.C0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (s5Var.D0 == null) {
                s5Var.D0 = new d5(0, true, true, mVar);
            }
            return s5Var.D0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (s5Var.E0 == null) {
                s5Var.E0 = new d5(1, false, false, mVar);
            }
            s5Var.E0.invalidateSelf();
            return s5Var.E0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (s5Var.F0 == null) {
                s5Var.F0 = new d5(1, false, true, mVar);
            }
            return s5Var.F0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (s5Var.G0 == null) {
                s5Var.G0 = new d5(1, true, false, mVar);
            }
            return s5Var.G0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return f6.O0(str);
        }
        if (s5Var.H0 == null) {
            s5Var.H0 = new d5(1, true, true, mVar);
        }
        return s5Var.H0;
    }

    public u0 h() {
        String str = ((Integer) this.b) == null ? " batteryVelocity" : "";
        if (((Boolean) this.c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = ta.b.j(str, " orientation");
        }
        if (((Long) this.e) == null) {
            str = ta.b.j(str, " ramUsed");
        }
        if (((Long) this.f) == null) {
            str = ta.b.j(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new u0((Double) this.a, ((Integer) this.b).intValue(), ((Boolean) this.c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public w2.h i() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((w2.l) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = ta.b.j(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = ta.b.j(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = ta.b.j(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new w2.h((String) this.a, (Integer) this.b, (w2.l) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public x8.b j() {
        x5.l.i((String) this.f, "setActionToken is required before calling build().");
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
            x5.l.h(concat);
            this.d = concat;
            u("url", concat);
        }
        x5.l.i((String) this.c, "setObject is required before calling build().");
        x5.l.i((String) this.d, "setObject is required before calling build().");
        return new x8.b((String) this.b, (String) this.c, (String) this.d, null, new x8.a(), (String) this.e, (Bundle) this.a);
    }

    public Task m(Task task) {
        return task.continueWith(new gb0(1), new a1.c(this, 15));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void o(float f10, float f11, int i9, int i10) {
        f6.q(f10, f11, i9, i10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int p0(int i9) {
        return N0(i9);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public int q1(int i9) {
        return N0(i9);
    }

    public ColorStateList r(Context context, int i9) {
        if (i9 == R.drawable.abc_edit_text_material) {
            return t7.a(context, R.color.abc_tint_edittext);
        }
        if (i9 == R.drawable.abc_switch_track_mtrl_alpha) {
            return t7.a(context, R.color.abc_tint_switch_track);
        }
        if (i9 != R.drawable.abc_switch_thumb_material) {
            if (i9 == R.drawable.abc_btn_default_mtrl_shape) {
                return l(context, d3.c(context, R.attr.colorButtonNormal));
            }
            if (i9 == R.drawable.abc_btn_borderless_material) {
                return l(context, 0);
            }
            if (i9 == R.drawable.abc_btn_colored_material) {
                return l(context, d3.c(context, R.attr.colorAccent));
            }
            if (i9 == R.drawable.abc_spinner_mtrl_am_alpha || i9 == R.drawable.abc_spinner_textfield_background_material) {
                return t7.a(context, R.color.abc_tint_spinner);
            }
            if (f(i9, (int[]) this.b)) {
                return d3.d(context, R.attr.colorControlNormal);
            }
            if (f(i9, (int[]) this.e)) {
                return t7.a(context, R.color.abc_tint_default);
            }
            if (f(i9, (int[]) this.f)) {
                return t7.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i9 == R.drawable.abc_seekbar_thumb_material) {
                return t7.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = d3.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = d3.b;
            iArr2[0] = d3.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = d3.e;
            iArr2[1] = d3.c(context, R.attr.colorControlActivated);
            iArr[2] = d3.f;
            iArr2[2] = d3.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = d3.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = d3.e;
            iArr2[1] = d3.c(context, R.attr.colorControlActivated);
            iArr[2] = d3.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void t(Throwable th, Thread thread, String str, String str2, long j10, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        g5.b bVar;
        boolean equals = str2.equals("crash");
        e9.r rVar = (e9.r) this.a;
        Context context = rVar.a;
        int i9 = context.getResources().getConfiguration().orientation;
        g5.b bVar2 = rVar.d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        t tVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            tVar = new t(th3.getLocalizedMessage(), th3.getClass().getName(), bVar2.k(th3.getStackTrace()), tVar, 19);
        }
        t tVar2 = tVar;
        m mVar = new m();
        mVar.b = str2;
        mVar.a = Long.valueOf(j10);
        t1 b10 = b9.e.a.b(context);
        int i10 = ((t0) b10).c;
        Boolean valueOf = i10 > 0 ? Boolean.valueOf(i10 != 100) : null;
        ArrayList a2 = b9.e.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) tVar2.d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        List d = e9.r.d(stackTraceElementArr, 4);
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
                    StackTraceElement[] k10 = bVar2.k(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d9 = e9.r.d(k10, 0);
                    if (d9 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    bVar = bVar2;
                    arrayList.add(new r0(name2, 0, d9));
                }
                it2 = it;
                bVar2 = bVar;
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        p0 c10 = e9.r.c(tVar2, 0);
        g9.q0 q0Var = new g9.q0(0L, "0", "0");
        List a3 = rVar.a();
        if (a3 == null) {
            throw new NullPointerException("Null binaries");
        }
        mVar.c = new m0(new n0(unmodifiableList, c10, null, q0Var, a3), null, null, valueOf, b10, a2, i9);
        mVar.d = rVar.b(i9);
        l0 g10 = mVar.g();
        j9.b bVar3 = (j9.b) this.b;
        f9.e eVar = (f9.e) this.d;
        t3 t3Var = (t3) this.e;
        bVar3.d(d(b(g10, eVar, t3Var), t3Var), str, equals);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ boolean t0() {
        return false;
    }

    public void u(String str, String... strArr) {
        Bundle bundle = (Bundle) this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            d8.a("String array is empty and is ignored by put method.");
            return;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < Math.min(strArr2.length, 100); i10++) {
            String str2 = strArr2[i10];
            strArr2[i9] = str2;
            if (strArr2[i10] == null) {
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("String at ");
                sb2.append(i10);
                sb2.append(" is null and is ignored by put method.");
                d8.a(sb2.toString());
            } else {
                int i11 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb3 = new StringBuilder(53);
                    sb3.append("String at ");
                    sb3.append(i10);
                    sb3.append(" is too long, truncating string.");
                    d8.a(sb3.toString());
                    String str3 = strArr2[i9];
                    if (str3.length() > 20000) {
                        if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                            i11 = 19999;
                        }
                        str3 = str3.substring(0, i11);
                    }
                    strArr2[i9] = str3;
                }
                i9++;
            }
        }
        if (i9 > 0) {
            Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i9);
            if (objArr.length >= 100) {
                d8.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    public Task v(Executor executor, String str) {
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((j9.b) this.b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 1;
            File file = (File) b10.get(i9);
            try {
                h9.c cVar = j9.b.g;
                String e10 = j9.b.e(file);
                cVar.getClass();
                arrayList.add(new e9.b(h9.c.i(e10), file.getName(), file));
            } catch (IOException e11) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e11);
                file.delete();
            }
            i9 = i10;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            int i12 = i11 + 1;
            e9.b bVar = (e9.b) arrayList.get(i11);
            if (str == null || str.equals(bVar.b)) {
                k9.a aVar = (k9.a) this.c;
                if (bVar.a.f == null) {
                    try {
                        str2 = (String) e9.z.a(((y9.c) ((e9.x) this.f).d).d());
                    } catch (Exception e12) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e12);
                        str2 = null;
                    }
                    f8 a2 = bVar.a.a();
                    a2.d = str2;
                    bVar = new e9.b(a2.a(), bVar.b, bVar.c);
                }
                boolean z10 = str != null;
                k9.c cVar2 = aVar.a;
                synchronized (cVar2.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar2.i.b).getAndIncrement();
                            if (cVar2.f.size() < cVar2.e) {
                                b9.d dVar = b9.d.a;
                                dVar.b("Enqueueing report: " + bVar.b);
                                dVar.b("Queue size: " + cVar2.f.size());
                                cVar2.g.execute(new q1(cVar2, bVar, taskCompletionSource, 6));
                                dVar.b("Closing task for report: " + bVar.b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar2.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) cVar2.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar2.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new a9.b(this, 23)));
            }
            i11 = i12;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void w(float f10, float f11, float f12, float f13) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, f11, f12, f13);
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
        int i9;
        String str3;
        v9.f fVar;
        int a2;
        PackageInfo d;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        s8.h hVar = (s8.h) this.a;
        hVar.a();
        bundle.putString("gmp_app_id", hVar.c.b);
        o oVar = (o) this.b;
        synchronized (oVar) {
            try {
                if (oVar.a == 0 && (d = oVar.d("com.google.android.gms")) != null) {
                    oVar.a = d.versionCode;
                }
                i9 = oVar.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i9));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((o) this.b).a());
        bundle.putString("app_ver_name", ((o) this.b).b());
        s8.h hVar2 = (s8.h) this.a;
        hVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(hVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String str4 = ((y9.a) Tasks.await(((y9.c) ((y9.d) this.f)).e())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((y9.c) ((y9.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (v9.f) ((x9.b) this.e).get();
            fa.b bVar = (fa.b) ((x9.b) this.d).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((y9.c) ((y9.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (v9.f) ((x9.b) this.e).get();
            fa.b bVar2 = (fa.b) ((x9.b) this.d).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((y9.c) ((y9.d) this.f)).d()));
        bundle.putString("cliv", "fcm-23.4.0");
        fVar = (v9.f) ((x9.b) this.e).get();
        fa.b bVar22 = (fa.b) ((x9.b) this.d).get();
        if (fVar == null || bVar22 == null || (a2 = ((v9.c) fVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(m1.j.b(a2)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public void y(float f10, float f11, float f12, float f13) {
        Matrix matrix = (Matrix) this.f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.c;
        matrix.postRotate(f13, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f12, f12);
        matrix.postTranslate(f10, f11);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public m(int i9) {
        switch (i9) {
            case 7:
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
            case 8:
                this.a = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                break;
            case 9:
            default:
                this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            case 10:
                this.a = new Bundle();
                this.b = "AssistAction";
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public /* synthetic */ void c1(int i9, int i10) {
    }
}

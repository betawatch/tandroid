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
import d5.g0;
import g7.e8;
import g7.o7;
import h3.c2;
import h3.p2;
import h3.s2;
import h7.h8;
import h9.a2;
import h9.l0;
import h9.m0;
import h9.n0;
import h9.p0;
import h9.r0;
import h9.s1;
import h9.t0;
import h9.t1;
import h9.u0;
import h9.u1;
import h9.v0;
import h9.v1;
import h9.w1;
import h9.x0;
import h9.y0;
import h9.z1;
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
import lh.r5;
import m.d3;
import m.m1;
import m.n2;
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.i6;
import org.telegram.ui.kb0;
import p8.q0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m implements c6 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public m(int i10, int i11) {
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

    public static l0 b(l0 l0Var, g9.e eVar, t3 t3Var) {
        m a2 = l0Var.a();
        String c10 = ((g9.c) eVar.b).c();
        if (c10 != null) {
            a2.e = new v0(c10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List q6 = q(((g9.d) ((AtomicMarkableReference) ((l) t3Var.d).b).getReference()).a());
        List q9 = q(((g9.d) ((AtomicMarkableReference) ((l) t3Var.e).b).getReference()).a());
        if (!q6.isEmpty() || !q9.isEmpty()) {
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
            a2.c = new m0(s1Var, q6, q9, bool, t1Var, list, i10);
        }
        return a2.g();
    }

    public static a2 d(l0 l0Var, t3 t3Var) {
        List g10 = ((n2.v) t3Var.f).g();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < g10.size(); i10++) {
            g9.n nVar = (g9.n) g10.get(i10);
            nVar.getClass();
            t tVar = new t(10, false);
            g9.b bVar = (g9.b) nVar;
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

    public static boolean f(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static m k(Context context, f9.x xVar, k9.c cVar, f9.a aVar, g9.e eVar, t3 t3Var, g5.b bVar, c3.g gVar, xe.b bVar2, f9.k kVar) {
        f9.r rVar = new f9.r(context, xVar, aVar, bVar, gVar);
        k9.b bVar3 = new k9.b(cVar, gVar, kVar);
        i9.a aVar2 = l9.a.b;
        w2.q.b(context);
        l9.a aVar3 = new l9.a(new l9.c(w2.q.a().c(new u2.a(l9.a.c, l9.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new t2.c("json"), l9.a.e), gVar.d(), bVar2));
        m mVar = new m();
        mVar.a = rVar;
        mVar.b = bVar3;
        mVar.c = aVar3;
        mVar.d = eVar;
        mVar.e = t3Var;
        mVar.f = xVar;
        return mVar;
    }

    public static ColorStateList l(Context context, int i10) {
        int c10 = d3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{d3.b, d3.d, d3.c, d3.f}, new int[]{d3.b(context, R.attr.colorButtonNormal), i0.b.h(c10, i10), i0.b.h(c10, i10), i10});
    }

    public static j4.c0 o(c2 c2Var, p8.z zVar, j4.c0 c0Var, p2 p2Var) {
        s2 A = c2Var.A();
        int l10 = c2Var.l();
        Object l11 = A.p() ? null : A.l(l10);
        int b10 = (c2Var.c() || A.p()) ? -1 : A.f(l10, p2Var, false).b(g0.H(c2Var.D()) - p2Var.e);
        for (int i10 = 0; i10 < zVar.size(); i10++) {
            j4.c0 c0Var2 = (j4.c0) zVar.get(i10);
            if (s(c0Var2, l11, c2Var.c(), c2Var.w(), c2Var.m(), b10)) {
                return c0Var2;
            }
        }
        if (zVar.isEmpty() && c0Var != null && s(c0Var, l11, c2Var.c(), c2Var.w(), c2Var.m(), b10)) {
            return c0Var;
        }
        return null;
    }

    public static LayerDrawable p(n2 n2Var, Context context, int i10) {
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
            arrayList.add(new h9.d0(str, str2));
        }
        Collections.sort(arrayList, new a5.f(15));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean s(j4.c0 c0Var, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = c0Var.a;
        int i13 = c0Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10 && i13 == i10 && c0Var.c == i11) {
            return true;
        }
        return !z10 && i13 == -1 && c0Var.e == i12;
    }

    public static void z(Drawable drawable, int i10, PorterDuff.Mode mode) {
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

    public Task A(String str, String str2, Bundle bundle) {
        int i10;
        try {
            x(str, str2, bundle);
            u5.a aVar = (u5.a) this.c;
            u5.l lVar = u5.l.a;
            com.google.android.exoplayer2.upstream.w wVar = aVar.c;
            if (wVar.f() < 12000000) {
                if (wVar.g() == 0) {
                    return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                }
                return aVar.a(bundle).continueWithTask(lVar, new i6(aVar, bundle, false, 23));
            }
            u5.k b10 = u5.k.b(aVar.b);
            synchronized (b10) {
                i10 = b10.a;
                b10.a = i10 + 1;
            }
            return b10.c(new u5.j(i10, 1, bundle, 1)).continueWith(lVar, u5.b.a);
        } catch (InterruptedException | ExecutionException e9) {
            return Tasks.forException(e9);
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
                ofFloat.addUpdateListener(new dx0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new dx0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new dx0(this, i12, 2));
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

    public void D(s2 s2Var) {
        b6.a aVar = new b6.a(4, 21);
        if (((p8.z) this.b).isEmpty()) {
            e(aVar, (j4.c0) this.e, s2Var);
            if (!h7.e0.a((j4.c0) this.f, (j4.c0) this.e)) {
                e(aVar, (j4.c0) this.f, s2Var);
            }
            if (!h7.e0.a((j4.c0) this.d, (j4.c0) this.e) && !h7.e0.a((j4.c0) this.d, (j4.c0) this.f)) {
                e(aVar, (j4.c0) this.d, s2Var);
            }
        } else {
            for (int i10 = 0; i10 < ((p8.z) this.b).size(); i10++) {
                e(aVar, (j4.c0) ((p8.z) this.b).get(i10), s2Var);
            }
            if (!((p8.z) this.b).contains((j4.c0) this.d)) {
                e(aVar, (j4.c0) this.d, s2Var);
            }
        }
        this.c = aVar.c();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter F() {
        return g6.v3;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint N(String str) {
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
                return g6.S0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int N0(int i10) {
        return ((r5) this.f).y0.get(i10, g6.w0(null, i10, false));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        return ((r5) this.f).x0;
    }

    public void c(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public void e(b6.a aVar, j4.c0 c0Var, s2 s2Var) {
        if (c0Var == null) {
            return;
        }
        if (s2Var.b(c0Var.a) != -1) {
            aVar.j(c0Var, s2Var);
            return;
        }
        s2 s2Var2 = (s2) ((q0) this.c).get(c0Var);
        if (s2Var2 != null) {
            aVar.j(c0Var, s2Var2);
        }
    }

    public l0 g() {
        String str = ((Long) this.a) == null ? " timestamp" : "";
        if (((String) this.b) == null) {
            str = str.concat(" type");
        }
        if (((u1) this.c) == null) {
            str = s3.c.l(str, " app");
        }
        if (((v1) this.d) == null) {
            str = s3.c.l(str, " device");
        }
        if (str.isEmpty()) {
            return new l0(((Long) this.a).longValue(), (String) this.b, (u1) this.c, (v1) this.d, (w1) this.e, (z1) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Drawable getDrawable(String str) {
        r5 r5Var = (r5) this.f;
        m mVar = r5Var.z0;
        if (str.equals("drawableMsgIn")) {
            if (r5Var.A0 == null) {
                r5Var.A0 = new d5(0, false, false, mVar);
            }
            return r5Var.A0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (r5Var.B0 == null) {
                r5Var.B0 = new d5(0, false, true, mVar);
            }
            return r5Var.B0;
        }
        if (str.equals("drawableMsgOut")) {
            if (r5Var.C0 == null) {
                r5Var.C0 = new d5(0, true, false, mVar);
            }
            return r5Var.C0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (r5Var.D0 == null) {
                r5Var.D0 = new d5(0, true, true, mVar);
            }
            return r5Var.D0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (r5Var.E0 == null) {
                r5Var.E0 = new d5(1, false, false, mVar);
            }
            r5Var.E0.invalidateSelf();
            return r5Var.E0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (r5Var.F0 == null) {
                r5Var.F0 = new d5(1, false, true, mVar);
            }
            return r5Var.F0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (r5Var.G0 == null) {
                r5Var.G0 = new d5(1, true, false, mVar);
            }
            return r5Var.G0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return g6.O0(str);
        }
        if (r5Var.H0 == null) {
            r5Var.H0 = new d5(1, true, true, mVar);
        }
        return r5Var.H0;
    }

    public u0 h() {
        String str = ((Integer) this.b) == null ? " batteryVelocity" : "";
        if (((Boolean) this.c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = s3.c.l(str, " orientation");
        }
        if (((Long) this.e) == null) {
            str = s3.c.l(str, " ramUsed");
        }
        if (((Long) this.f) == null) {
            str = s3.c.l(str, " diskUsed");
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
            str = s3.c.l(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = s3.c.l(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = s3.c.l(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new w2.h((String) this.a, (Integer) this.b, (w2.l) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public y8.b j() {
        y5.l.i((String) this.f, "setActionToken is required before calling build().");
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
            y5.l.h(concat);
            this.d = concat;
            u("url", concat);
        }
        y5.l.i((String) this.c, "setObject is required before calling build().");
        y5.l.i((String) this.d, "setObject is required before calling build().");
        return new y8.b((String) this.b, (String) this.c, (String) this.d, null, new y8.a(), (String) this.e, (Bundle) this.a);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void m(float f10, float f11, int i10, int i11) {
        g6.q(f10, f11, i10, i11);
    }

    public Task n(Task task) {
        return task.continueWith(new kb0(1), new a1.c(this, 14));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int o1(int i10) {
        return N0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int q0(int i10) {
        return N0(i10);
    }

    public ColorStateList r(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return o7.a(context, R.color.abc_tint_edittext);
        }
        if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return o7.a(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return l(context, d3.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return l(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return l(context, d3.c(context, R.attr.colorAccent));
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return o7.a(context, R.color.abc_tint_spinner);
            }
            if (f(i10, (int[]) this.b)) {
                return d3.d(context, R.attr.colorControlNormal);
            }
            if (f(i10, (int[]) this.e)) {
                return o7.a(context, R.color.abc_tint_default);
            }
            if (f(i10, (int[]) this.f)) {
                return o7.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return o7.a(context, R.color.abc_tint_seek_thumb);
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
        f9.r rVar = (f9.r) this.a;
        Context context = rVar.a;
        int i10 = context.getResources().getConfiguration().orientation;
        g5.b bVar2 = rVar.d;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        t tVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            tVar = new t(th3.getLocalizedMessage(), th3.getClass().getName(), bVar2.a0(th3.getStackTrace()), tVar, 20);
        }
        t tVar2 = tVar;
        m mVar = new m();
        mVar.b = str2;
        mVar.a = Long.valueOf(j10);
        t1 b10 = c9.d.a.b(context);
        int i11 = ((t0) b10).c;
        Boolean valueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList a2 = c9.d.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) tVar2.d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        List d = f9.r.d(stackTraceElementArr, 4);
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
                    StackTraceElement[] a02 = bVar2.a0(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d10 = f9.r.d(a02, 0);
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
        p0 c10 = f9.r.c(tVar2, 0);
        h9.q0 q0Var = new h9.q0(0L, "0", "0");
        List a3 = rVar.a();
        if (a3 == null) {
            throw new NullPointerException("Null binaries");
        }
        mVar.c = new m0(new n0(unmodifiableList, c10, null, q0Var, a3), null, null, valueOf, b10, a2, i10);
        mVar.d = rVar.b(i10);
        l0 g10 = mVar.g();
        k9.b bVar3 = (k9.b) this.b;
        g9.e eVar = (g9.e) this.d;
        t3 t3Var = (t3) this.e;
        bVar3.d(d(b(g10, eVar, t3Var), t3Var), str, equals);
    }

    public void u(String str, String... strArr) {
        Bundle bundle = (Bundle) this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            h8.a("String array is empty and is ignored by put method.");
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
                h8.a(sb2.toString());
            } else {
                int i12 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb3 = new StringBuilder(53);
                    sb3.append("String at ");
                    sb3.append(i11);
                    sb3.append(" is too long, truncating string.");
                    h8.a(sb3.toString());
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
                h8.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ boolean u0() {
        return false;
    }

    public Task v(Executor executor, String str) {
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((k9.b) this.b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                i9.a aVar = k9.b.g;
                String e9 = k9.b.e(file);
                aVar.getClass();
                arrayList.add(new f9.b(i9.a.i(e9), file.getName(), file));
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
            f9.b bVar = (f9.b) arrayList.get(i12);
            if (str == null || str.equals(bVar.b)) {
                l9.a aVar2 = (l9.a) this.c;
                if (bVar.a.f == null) {
                    try {
                        str2 = (String) f9.b0.a(((z9.c) ((f9.x) this.f).d).d());
                    } catch (Exception e11) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e11);
                        str2 = null;
                    }
                    e8 a2 = bVar.a.a();
                    a2.d = str2;
                    bVar = new f9.b(a2.a(), bVar.b, bVar.c);
                }
                boolean z10 = str != null;
                l9.c cVar = aVar2.a;
                synchronized (cVar.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.i.b).getAndIncrement();
                            if (cVar.f.size() < cVar.e) {
                                c9.c cVar2 = c9.c.a;
                                cVar2.b("Enqueueing report: " + bVar.b);
                                cVar2.b("Queue size: " + cVar.f.size());
                                cVar.g.execute(new q1(cVar, bVar, taskCompletionSource, 6));
                                cVar2.b("Closing task for report: " + bVar.b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str3 = "Dropping report due to queue being full: " + bVar.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                ((AtomicInteger) cVar.i.c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new f9.z(this)));
            }
            i12 = i13;
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
        int i10;
        String str3;
        w9.f fVar;
        int a2;
        PackageInfo d;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        t8.h hVar = (t8.h) this.a;
        hVar.a();
        bundle.putString("gmp_app_id", hVar.c.b);
        o oVar = (o) this.b;
        synchronized (oVar) {
            try {
                if (oVar.a == 0 && (d = oVar.d("com.google.android.gms")) != null) {
                    oVar.a = d.versionCode;
                }
                i10 = oVar.a;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((o) this.b).a());
        bundle.putString("app_ver_name", ((o) this.b).b());
        t8.h hVar2 = (t8.h) this.a;
        hVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(hVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String str4 = ((z9.a) Tasks.await(((z9.c) ((z9.d) this.f)).e())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e9) {
            e = e9;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((z9.c) ((z9.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (w9.f) ((y9.b) this.e).get();
            ga.b bVar = (ga.b) ((y9.b) this.d).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((z9.c) ((z9.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (w9.f) ((y9.b) this.e).get();
            ga.b bVar2 = (ga.b) ((y9.b) this.d).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((z9.c) ((z9.d) this.f)).d()));
        bundle.putString("cliv", "fcm-23.4.0");
        fVar = (w9.f) ((y9.b) this.e).get();
        ga.b bVar22 = (ga.b) ((y9.b) this.d).get();
        if (fVar == null || bVar22 == null || (a2 = ((w9.c) fVar).a()) == 1) {
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

    public m(int i10) {
        switch (i10) {
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

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void c1(int i10, int i11) {
    }
}

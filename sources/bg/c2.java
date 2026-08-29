package bg;

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
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h7.d8;
import h7.s7;
import i7.o6;
import i7.w8;
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
import nh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c2 implements c6 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public c2(int i10, int i11) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.c = new RectF();
        this.f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i10), Math.max(1, i11), Bitmap.Config.ARGB_8888);
        this.b = createBitmap;
        this.a = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.e = bitmapShader;
        paint.setShader(bitmapShader);
        D();
    }

    public static i9.l0 b(i9.l0 l0Var, h9.e eVar, m.s3 s3Var) {
        c2 a2 = l0Var.a();
        String i10 = ((h9.c) eVar.b).i();
        if (i10 != null) {
            a2.e = new i9.v0(i10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List q6 = q(((h9.d) ((AtomicMarkableReference) ((ab.m) s3Var.d).b).getReference()).a());
        List q9 = q(((h9.d) ((AtomicMarkableReference) ((ab.m) s3Var.e).b).getReference()).a());
        if (!q6.isEmpty() || !q9.isEmpty()) {
            i9.m0 m0Var = (i9.m0) l0Var.c;
            i9.s1 s1Var = m0Var.a;
            Boolean bool = m0Var.d;
            i9.t1 t1Var = m0Var.e;
            List list = m0Var.f;
            int i11 = m0Var.g;
            String str = s1Var == null ? " execution" : "";
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            a2.c = new i9.m0(s1Var, q6, q9, bool, t1Var, list, i11);
        }
        return a2.g();
    }

    public static i9.a2 d(i9.l0 l0Var, m.s3 s3Var) {
        List f9 = ((p2.u) s3Var.f).f();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < f9.size(); i10++) {
            h9.n nVar = (h9.n) f9.get(i10);
            nVar.getClass();
            com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(11, false);
            h9.b bVar = (h9.b) nVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            sVar.c = new i9.x0(str2, str);
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
            arrayList.add(sVar.l());
        }
        if (arrayList.isEmpty()) {
            return l0Var;
        }
        c2 a2 = l0Var.a();
        a2.f = new i9.y0(arrayList);
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

    public static c2 k(Context context, g9.y yVar, l9.b bVar, g9.a aVar, h9.e eVar, m.s3 s3Var, g9.l lVar, e3.f fVar, g9.l lVar2, g9.k kVar) {
        g9.s sVar = new g9.s(context, yVar, aVar, lVar, fVar);
        l9.a aVar2 = new l9.a(bVar, fVar, kVar);
        j9.a aVar3 = m9.a.b;
        y2.q.b(context);
        m9.a aVar4 = new m9.a(new m9.c(y2.q.a().c(new w2.a(m9.a.c, m9.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new v2.c("json"), m9.a.e), fVar.d(), lVar2));
        c2 c2Var = new c2();
        c2Var.a = sVar;
        c2Var.b = aVar2;
        c2Var.c = aVar4;
        c2Var.d = eVar;
        c2Var.e = s3Var;
        c2Var.f = yVar;
        return c2Var;
    }

    public static ColorStateList m(Context context, int i10) {
        int c3 = m.d3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{m.d3.b, m.d3.d, m.d3.c, m.d3.f}, new int[]{m.d3.b(context, R.attr.colorButtonNormal), i0.a.h(c3, i10), i0.a.h(c3, i10), i10});
    }

    public static l4.c0 o(j3.c2 c2Var, q8.z zVar, l4.c0 c0Var, j3.p2 p2Var) {
        j3.r2 A = c2Var.A();
        int k9 = c2Var.k();
        Object l10 = A.p() ? null : A.l(k9);
        int b10 = (c2Var.c() || A.p()) ? -1 : A.f(k9, p2Var, false).b(f5.d0.H(c2Var.D()) - p2Var.e);
        for (int i10 = 0; i10 < zVar.size(); i10++) {
            l4.c0 c0Var2 = (l4.c0) zVar.get(i10);
            if (s(c0Var2, l10, c2Var.c(), c2Var.w(), c2Var.m(), b10)) {
                return c0Var2;
            }
        }
        if (zVar.isEmpty() && c0Var != null && s(c0Var, l10, c2Var.c(), c2Var.w(), c2Var.m(), b10)) {
            return c0Var;
        }
        return null;
    }

    public static LayerDrawable p(m.n2 n2Var, Context context, int i10) {
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
            arrayList.add(new i9.d0(str, str2));
        }
        Collections.sort(arrayList, new c5.e(15));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean s(l4.c0 c0Var, Object obj, boolean z10, int i10, int i11, int i12) {
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
        int[] iArr = m.m1.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = m.r.b;
        }
        PorterDuff.Mode mode2 = m.r.b;
        synchronized (m.r.class) {
            h = m.n2.h(i10, mode);
        }
        mutate.setColorFilter(h);
    }

    public Task A(String str, String str2, Bundle bundle) {
        int i10;
        try {
            x(str, str2, bundle);
            v5.a aVar = (v5.a) this.c;
            v5.m mVar = v5.m.a;
            com.google.android.exoplayer2.upstream.w wVar = aVar.c;
            if (wVar.f() < 12000000) {
                return wVar.g() != 0 ? aVar.a(bundle).continueWithTask(mVar, new v5.n(0, aVar, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            v5.l b10 = v5.l.b(aVar.b);
            synchronized (b10) {
                i10 = b10.a;
                b10.a = i10 + 1;
            }
            return b10.c(new v5.k(i10, 1, bundle, 1)).continueWith(mVar, v5.b.a);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter B() {
        return g6.v3;
    }

    public void C(boolean z10) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        ArrayList arrayList3 = (ArrayList) this.a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new mx0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new mx0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new mx0(this, i12, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int C0(int i10) {
        return ((f5) this.f).y0.get(i10, g6.w0(null, i10, false));
    }

    public void D() {
        Bitmap bitmap = (Bitmap) this.b;
        RectF rectF = (RectF) this.c;
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

    public void E(j3.r2 r2Var) {
        ag.j2 j2Var = new ag.j2(4, 21);
        if (((q8.z) this.b).isEmpty()) {
            e(j2Var, (l4.c0) this.e, r2Var);
            if (!o6.a((l4.c0) this.f, (l4.c0) this.e)) {
                e(j2Var, (l4.c0) this.f, r2Var);
            }
            if (!o6.a((l4.c0) this.d, (l4.c0) this.e) && !o6.a((l4.c0) this.d, (l4.c0) this.f)) {
                e(j2Var, (l4.c0) this.d, r2Var);
            }
        } else {
            for (int i10 = 0; i10 < ((q8.z) this.b).size(); i10++) {
                e(j2Var, (l4.c0) ((q8.z) this.b).get(i10), r2Var);
            }
            if (!((q8.z) this.b).contains((l4.c0) this.d)) {
                e(j2Var, (l4.c0) this.d, r2Var);
            }
        }
        this.c = j2Var.c();
    }

    @Override // org.telegram.ui.ActionBar.c6
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
                return g6.S0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        return ((f5) this.f).x0;
    }

    public void c(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public void e(ag.j2 j2Var, l4.c0 c0Var, j3.r2 r2Var) {
        if (c0Var == null) {
            return;
        }
        if (r2Var.b(c0Var.a) != -1) {
            j2Var.l(c0Var, r2Var);
            return;
        }
        j3.r2 r2Var2 = (j3.r2) ((q8.q0) this.c).get(c0Var);
        if (r2Var2 != null) {
            j2Var.l(c0Var, r2Var2);
        }
    }

    public i9.l0 g() {
        String str = ((Long) this.a) == null ? " timestamp" : "";
        if (((String) this.b) == null) {
            str = str.concat(" type");
        }
        if (((i9.u1) this.c) == null) {
            str = u3.c.k(str, " app");
        }
        if (((i9.v1) this.d) == null) {
            str = u3.c.k(str, " device");
        }
        if (str.isEmpty()) {
            return new i9.l0(((Long) this.a).longValue(), (String) this.b, (i9.u1) this.c, (i9.v1) this.d, (i9.w1) this.e, (i9.z1) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int g1(int i10) {
        return C0(i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Drawable getDrawable(String str) {
        f5 f5Var = (f5) this.f;
        c2 c2Var = f5Var.z0;
        if (str.equals("drawableMsgIn")) {
            if (f5Var.A0 == null) {
                f5Var.A0 = new d5(0, false, false, c2Var);
            }
            return f5Var.A0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (f5Var.B0 == null) {
                f5Var.B0 = new d5(0, false, true, c2Var);
            }
            return f5Var.B0;
        }
        if (str.equals("drawableMsgOut")) {
            if (f5Var.C0 == null) {
                f5Var.C0 = new d5(0, true, false, c2Var);
            }
            return f5Var.C0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (f5Var.D0 == null) {
                f5Var.D0 = new d5(0, true, true, c2Var);
            }
            return f5Var.D0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (f5Var.E0 == null) {
                f5Var.E0 = new d5(1, false, false, c2Var);
            }
            f5Var.E0.invalidateSelf();
            return f5Var.E0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (f5Var.F0 == null) {
                f5Var.F0 = new d5(1, false, true, c2Var);
            }
            return f5Var.F0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (f5Var.G0 == null) {
                f5Var.G0 = new d5(1, true, false, c2Var);
            }
            return f5Var.G0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return g6.O0(str);
        }
        if (f5Var.H0 == null) {
            f5Var.H0 = new d5(1, true, true, c2Var);
        }
        return f5Var.H0;
    }

    public i9.u0 h() {
        String str = ((Integer) this.b) == null ? " batteryVelocity" : "";
        if (((Boolean) this.c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = u3.c.k(str, " orientation");
        }
        if (((Long) this.e) == null) {
            str = u3.c.k(str, " ramUsed");
        }
        if (((Long) this.f) == null) {
            str = u3.c.k(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new i9.u0((Double) this.a, ((Integer) this.b).intValue(), ((Boolean) this.c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int h0(int i10) {
        return C0(i10);
    }

    public y2.h i() {
        String str = ((String) this.a) == null ? " transportName" : "";
        if (((y2.l) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = u3.c.k(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = u3.c.k(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = u3.c.k(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new y2.h((String) this.a, (Integer) this.b, (y2.l) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z8.b j() {
        z5.l.i((String) this.f, "setActionToken is required before calling build().");
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
            z5.l.h(concat);
            this.d = concat;
            u("url", concat);
        }
        z5.l.i((String) this.c, "setObject is required before calling build().");
        z5.l.i((String) this.d, "setObject is required before calling build().");
        return new z8.b((String) this.b, (String) this.c, (String) this.d, null, new z8.a(), (String) this.e, (Bundle) this.a);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void l(float f9, float f10, int i10, int i11) {
        g6.q(f9, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ boolean l0() {
        return false;
    }

    public Task n(Task task) {
        return task.continueWith(new ib0(1), new a1.c(this, 16));
    }

    public ColorStateList r(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return s7.a(context, R.color.abc_tint_edittext);
        }
        if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return s7.a(context, R.color.abc_tint_switch_track);
        }
        if (i10 != R.drawable.abc_switch_thumb_material) {
            if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return m(context, m.d3.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return m(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return m(context, m.d3.c(context, R.attr.colorAccent));
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return s7.a(context, R.color.abc_tint_spinner);
            }
            if (f(i10, (int[]) this.b)) {
                return m.d3.d(context, R.attr.colorControlNormal);
            }
            if (f(i10, (int[]) this.e)) {
                return s7.a(context, R.color.abc_tint_default);
            }
            if (f(i10, (int[]) this.f)) {
                return s7.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i10 == R.drawable.abc_seekbar_thumb_material) {
                return s7.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = m.d3.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = m.d3.b;
            iArr2[0] = m.d3.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = m.d3.e;
            iArr2[1] = m.d3.c(context, R.attr.colorControlActivated);
            iArr[2] = m.d3.f;
            iArr2[2] = m.d3.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = m.d3.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = m.d3.e;
            iArr2[1] = m.d3.c(context, R.attr.colorControlActivated);
            iArr[2] = m.d3.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void t(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        g9.l lVar;
        boolean equals = str2.equals("crash");
        g9.s sVar = (g9.s) this.a;
        Context context = sVar.a;
        int i10 = context.getResources().getConfiguration().orientation;
        g9.l lVar2 = sVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        com.google.firebase.messaging.s sVar2 = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            sVar2 = new com.google.firebase.messaging.s(th4.getLocalizedMessage(), th4.getClass().getName(), lVar2.m(th4.getStackTrace()), sVar2, 21);
        }
        com.google.firebase.messaging.s sVar3 = sVar2;
        c2 c2Var = new c2();
        c2Var.b = str2;
        c2Var.a = Long.valueOf(j10);
        i9.t1 b10 = d9.e.a.b(context);
        int i11 = ((i9.t0) b10).c;
        Boolean valueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList a2 = d9.e.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar3.d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        List d = g9.s.d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        arrayList.add(new i9.r0(name, 4, d));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    lVar = lVar2;
                } else {
                    StackTraceElement[] m10 = lVar2.m(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d10 = g9.s.d(m10, 0);
                    if (d10 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    lVar = lVar2;
                    arrayList.add(new i9.r0(name2, 0, d10));
                }
                it2 = it;
                lVar2 = lVar;
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        i9.p0 c3 = g9.s.c(sVar3, 0);
        i9.q0 q0Var = new i9.q0(0L, "0", "0");
        List a10 = sVar.a();
        if (a10 == null) {
            throw new NullPointerException("Null binaries");
        }
        c2Var.c = new i9.m0(new i9.n0(unmodifiableList, c3, null, q0Var, a10), null, null, valueOf, b10, a2, i10);
        c2Var.d = sVar.b(i10);
        i9.l0 g10 = c2Var.g();
        l9.a aVar = (l9.a) this.b;
        h9.e eVar = (h9.e) this.d;
        m.s3 s3Var = (m.s3) this.e;
        aVar.d(d(b(g10, eVar, s3Var), s3Var), str, equals);
    }

    public void u(String str, String... strArr) {
        Bundle bundle = (Bundle) this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            w8.a("String array is empty and is ignored by put method.");
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
                w8.a(sb2.toString());
            } else {
                int i12 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb3 = new StringBuilder(53);
                    sb3.append("String at ");
                    sb3.append(i11);
                    sb3.append(" is too long, truncating string.");
                    w8.a(sb3.toString());
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
                w8.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    public Task v(Executor executor, String str) {
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((l9.a) this.b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                j9.a aVar = l9.a.g;
                String e10 = l9.a.e(file);
                aVar.getClass();
                arrayList.add(new g9.b(j9.a.i(e10), file.getName(), file));
            } catch (IOException e11) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e11);
                file.delete();
            }
            i10 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            int i13 = i12 + 1;
            g9.b bVar = (g9.b) arrayList.get(i12);
            if (str == null || str.equals(bVar.b)) {
                m9.a aVar2 = (m9.a) this.c;
                if (bVar.a.f == null) {
                    try {
                        str2 = (String) g9.a0.a(((aa.c) ((g9.y) this.f).d).d());
                    } catch (Exception e12) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e12);
                        str2 = null;
                    }
                    d8 a2 = bVar.a.a();
                    a2.d = str2;
                    bVar = new g9.b(a2.a(), bVar.b, bVar.c);
                }
                boolean z10 = str != null;
                m9.c cVar = aVar2.a;
                synchronized (cVar.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.i.b).getAndIncrement();
                            if (cVar.f.size() < cVar.e) {
                                d9.d dVar = d9.d.a;
                                dVar.b("Enqueueing report: " + bVar.b);
                                dVar.b("Queue size: " + cVar.f.size());
                                cVar.g.execute(new com.google.android.gms.common.api.internal.q1(cVar, bVar, taskCompletionSource, 6));
                                dVar.b("Closing task for report: " + bVar.b);
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
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new eg.c(this)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    public void w(float f9, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f9, f10, f11, f12);
        RectF rectF2 = (RectF) this.c;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        D();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        x9.f fVar;
        int a2;
        PackageInfo d;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        u8.g gVar = (u8.g) this.a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.c.b);
        com.google.firebase.messaging.n nVar = (com.google.firebase.messaging.n) this.b;
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
        bundle.putString("app_ver", ((com.google.firebase.messaging.n) this.b).a());
        bundle.putString("app_ver_name", ((com.google.firebase.messaging.n) this.b).b());
        u8.g gVar2 = (u8.g) this.a;
        gVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String str4 = ((aa.a) Tasks.await(((aa.c) ((aa.d) this.f)).e())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((aa.c) ((aa.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (x9.f) ((z9.b) this.e).get();
            ha.b bVar = (ha.b) ((z9.b) this.d).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((aa.c) ((aa.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (x9.f) ((z9.b) this.e).get();
            ha.b bVar2 = (ha.b) ((z9.b) this.d).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((aa.c) ((aa.d) this.f)).d()));
        bundle.putString("cliv", "fcm-23.4.0");
        fVar = (x9.f) ((z9.b) this.e).get();
        ha.b bVar22 = (ha.b) ((z9.b) this.d).get();
        if (fVar == null || bVar22 == null || (a2 = ((x9.c) fVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(m1.j.b(a2)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public void y(float f9, float f10, float f11, float f12) {
        Matrix matrix = (Matrix) this.f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.b;
        matrix.postRotate(f12, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f11, f11);
        matrix.postTranslate(f9, f10);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public c2(int i10) {
        switch (i10) {
            case 8:
                Paint paint = new Paint(1);
                this.d = paint;
                this.c = new RectF();
                this.f = new Matrix();
                Bitmap createBitmap = Bitmap.createBitmap(30, 40, Bitmap.Config.ARGB_8888);
                this.b = createBitmap;
                this.a = new Canvas(createBitmap);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                this.e = bitmapShader;
                paint.setShader(bitmapShader);
                D();
                break;
            case 9:
                this.a = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                break;
            case 10:
            default:
                this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            case 11:
                this.a = new Bundle();
                this.b = "AssistAction";
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public /* synthetic */ void L0(int i10, int i11) {
    }
}

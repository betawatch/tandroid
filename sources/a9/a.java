package a9;

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
import b4.e0;
import cb.m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.s;
import e3.g;
import e5.f;
import f5.u;
import h5.d0;
import i9.k;
import i9.w;
import i9.y;
import j$.util.DesugarCollections;
import j3.o2;
import j7.g8;
import j7.s7;
import j9.b;
import j9.c;
import j9.d;
import j9.e;
import j9.n;
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
import k7.b7;
import k9.a2;
import k9.l0;
import k9.m0;
import k9.p0;
import k9.q0;
import k9.r0;
import k9.s1;
import k9.t0;
import k9.t1;
import k9.u0;
import k9.u1;
import k9.v0;
import k9.v1;
import k9.w1;
import k9.x0;
import k9.y0;
import k9.z1;
import m.c3;
import m.l1;
import m.m2;
import m.q;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.sb0;
import p2.v;
import q5.g0;
import qh.o4;
import s8.n0;
import x5.j;
import x5.l;
import y2.h;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a implements g6 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public a(int i10) {
        switch (i10) {
            case 8:
                this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            case 9:
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
                D();
                break;
            case 10:
                this.a = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                break;
            default:
                this.a = new Bundle();
                this.b = "AssistAction";
                break;
        }
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

    public static l0 b(l0 l0Var, e eVar, r3 r3Var) {
        a a2 = l0Var.a();
        String c3 = ((c) eVar.b).c();
        if (c3 != null) {
            a2.e = new v0(c3);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List q10 = q(((d) ((AtomicMarkableReference) ((m) r3Var.d).b).getReference()).a());
        List q11 = q(((d) ((AtomicMarkableReference) ((m) r3Var.e).b).getReference()).a());
        if (!q10.isEmpty() || !q11.isEmpty()) {
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
            a2.c = new m0(s1Var, q10, q11, bool, t1Var, list, i10);
        }
        return a2.h();
    }

    public static a2 d(l0 l0Var, r3 r3Var) {
        List f10 = ((v) r3Var.f).f();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < f10.size(); i10++) {
            n nVar = (n) f10.get(i10);
            nVar.getClass();
            s sVar = new s();
            b bVar = (b) nVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            sVar.b = new x0(str2, str);
            String str3 = bVar.c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            sVar.a = str3;
            String str4 = bVar.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            sVar.c = str4;
            sVar.d = Long.valueOf(bVar.f);
            arrayList.add(sVar.c());
        }
        if (arrayList.isEmpty()) {
            return l0Var;
        }
        a a2 = l0Var.a();
        a2.f = new y0(arrayList);
        return a2.h();
    }

    public static boolean f(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static a k(Context context, w wVar, n9.b bVar, i9.a aVar, e eVar, r3 r3Var, g0 g0Var, g gVar, f7.b bVar2, k kVar) {
        i9.q qVar = new i9.q(context, wVar, aVar, g0Var, gVar);
        n9.a aVar2 = new n9.a(bVar, gVar, kVar);
        l9.a aVar3 = o9.a.b;
        y2.q.b(context);
        o9.a aVar4 = new o9.a(new o9.c(y2.q.a().c(new w2.a(o9.a.c, o9.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new v2.c("json"), o9.a.e), gVar.d(), bVar2));
        a aVar5 = new a();
        aVar5.a = qVar;
        aVar5.b = aVar2;
        aVar5.c = aVar4;
        aVar5.d = eVar;
        aVar5.e = r3Var;
        aVar5.f = wVar;
        return aVar5;
    }

    public static ColorStateList m(Context context, int i10) {
        int c3 = c3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{c3.b, c3.d, c3.c, c3.f}, new int[]{c3.b(context, R.attr.colorButtonNormal), i0.a.h(c3, i10), i0.a.h(c3, i10), i10});
    }

    public static o4.v o(j3.a2 a2Var, s8.v vVar, o4.v vVar2, j3.m2 m2Var) {
        o2 z4 = a2Var.z();
        int m9 = a2Var.m();
        Object l10 = z4.p() ? null : z4.l(m9);
        int b10 = (a2Var.f() || z4.p()) ? -1 : z4.f(m9, m2Var, false).b(d0.G(a2Var.C()) - m2Var.e);
        for (int i10 = 0; i10 < vVar.size(); i10++) {
            o4.v vVar3 = (o4.v) vVar.get(i10);
            if (s(vVar3, l10, a2Var.f(), a2Var.w(), a2Var.o(), b10)) {
                return vVar3;
            }
        }
        if (vVar.isEmpty() && vVar2 != null && s(vVar2, l10, a2Var.f(), a2Var.w(), a2Var.o(), b10)) {
            return vVar2;
        }
        return null;
    }

    public static LayerDrawable p(m2 m2Var, Context context, int i10) {
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
            arrayList.add(new k9.d0(str, str2));
        }
        Collections.sort(arrayList, new f(15));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean s(o4.v vVar, Object obj, boolean z4, int i10, int i11, int i12) {
        Object obj2 = vVar.a;
        int i13 = vVar.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z4 && i13 == i10 && vVar.c == i11) {
            return true;
        }
        return !z4 && i13 == -1 && vVar.e == i12;
    }

    public Task B(String str, String str2, Bundle bundle) {
        int i10;
        try {
            y(str, str2, bundle);
            x5.a aVar = (x5.a) this.c;
            l lVar = l.a;
            p2.g gVar = aVar.c;
            if (gVar.g() < 12000000) {
                return gVar.h() != 0 ? aVar.a(bundle).continueWithTask(lVar, new g0(16, aVar, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            x5.k d = x5.k.d(aVar.b);
            synchronized (d) {
                i10 = d.a;
                d.a = i10 + 1;
            }
            return d.e(new j(i10, 1, bundle, 1)).continueWith(lVar, x5.b.a);
        } catch (InterruptedException | ExecutionException e6) {
            return Tasks.forException(e6);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int B0(int i10) {
        return ((o4) this.f).z0.get(i10, k6.w0(null, i10, false));
    }

    public void C(boolean z4) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        ArrayList arrayList3 = (ArrayList) this.a;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            ((ValueAnimator) arrayList3.get(i10)).cancel();
            if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i10)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new xx0(this, i10, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((ValueAnimator) arrayList2.get(i11)).cancel();
            if (z4) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i11)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new xx0(this, i11, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((ValueAnimator) arrayList.get(i12)).cancel();
            if (z4) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i12)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new xx0(this, i12, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void D() {
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

    public void E(o2 o2Var) {
        e0 e0Var = new e0(4, 22);
        if (((s8.v) this.b).isEmpty()) {
            e(e0Var, (o4.v) this.e, o2Var);
            if (!b7.a((o4.v) this.f, (o4.v) this.e)) {
                e(e0Var, (o4.v) this.f, o2Var);
            }
            if (!b7.a((o4.v) this.d, (o4.v) this.e) && !b7.a((o4.v) this.d, (o4.v) this.f)) {
                e(e0Var, (o4.v) this.d, o2Var);
            }
        } else {
            for (int i10 = 0; i10 < ((s8.v) this.b).size(); i10++) {
                e(e0Var, (o4.v) ((s8.v) this.b).get(i10), o2Var);
            }
            if (!((s8.v) this.b).contains((o4.v) this.d)) {
                e(e0Var, (o4.v) this.d, o2Var);
            }
        }
        this.c = e0Var.d();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Paint F(String str) {
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
                return k6.S0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int Z0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public boolean a() {
        return ((o4) this.f).y0;
    }

    public void c(String str, String str2) {
        HashMap hashMap = (HashMap) this.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public void e(e0 e0Var, o4.v vVar, o2 o2Var) {
        if (vVar == null) {
            return;
        }
        if (o2Var.b(vVar.a) != -1) {
            e0Var.x(vVar, o2Var);
            return;
        }
        o2 o2Var2 = (o2) ((n0) this.c).get(vVar);
        if (o2Var2 != null) {
            e0Var.x(vVar, o2Var2);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public int e0(int i10) {
        return B0(i10);
    }

    public b9.b g() {
        b6.m.i((String) this.f, "setActionToken is required before calling build().");
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
            b6.m.h(concat);
            this.d = concat;
            u("url", concat);
        }
        b6.m.i((String) this.c, "setObject is required before calling build().");
        b6.m.i((String) this.d, "setObject is required before calling build().");
        return new b9.b((String) this.b, (String) this.c, (String) this.d, null, new b9.a(), (String) this.e, (Bundle) this.a);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public Drawable getDrawable(String str) {
        o4 o4Var = (o4) this.f;
        a aVar = o4Var.A0;
        if (str.equals("drawableMsgIn")) {
            if (o4Var.B0 == null) {
                o4Var.B0 = new h5(0, false, false, aVar);
            }
            return o4Var.B0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (o4Var.C0 == null) {
                o4Var.C0 = new h5(0, false, true, aVar);
            }
            return o4Var.C0;
        }
        if (str.equals("drawableMsgOut")) {
            if (o4Var.D0 == null) {
                o4Var.D0 = new h5(0, true, false, aVar);
            }
            return o4Var.D0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (o4Var.E0 == null) {
                o4Var.E0 = new h5(0, true, true, aVar);
            }
            return o4Var.E0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (o4Var.F0 == null) {
                o4Var.F0 = new h5(1, false, false, aVar);
            }
            o4Var.F0.invalidateSelf();
            return o4Var.F0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (o4Var.G0 == null) {
                o4Var.G0 = new h5(1, false, true, aVar);
            }
            return o4Var.G0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (o4Var.H0 == null) {
                o4Var.H0 = new h5(1, true, false, aVar);
            }
            return o4Var.H0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return k6.O0(str);
        }
        if (o4Var.I0 == null) {
            o4Var.I0 = new h5(1, true, true, aVar);
        }
        return o4Var.I0;
    }

    public l0 h() {
        String str = ((Long) this.a) == null ? " timestamp" : "";
        if (((String) this.b) == null) {
            str = str.concat(" type");
        }
        if (((u1) this.c) == null) {
            str = w.c.e(str, " app");
        }
        if (((v1) this.d) == null) {
            str = w.c.e(str, " device");
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
            str = w.c.e(str, " orientation");
        }
        if (((Long) this.e) == null) {
            str = w.c.e(str, " ramUsed");
        }
        if (((Long) this.f) == null) {
            str = w.c.e(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new u0((Double) this.a, ((Integer) this.b).intValue(), ((Boolean) this.c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.e).longValue(), ((Long) this.f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public h j() {
        String str = ((String) this.b) == null ? " transportName" : "";
        if (((y2.l) this.c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = w.c.e(str, " eventMillis");
        }
        if (((Long) this.e) == null) {
            str = w.c.e(str, " uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            str = w.c.e(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new h((String) this.b, (Integer) this.a, (y2.l) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.ActionBar.g6
    public void l(float f10, float f11, int i10, int i11) {
        k6.q(f10, f11, i10, i11);
    }

    public Task n(Task task) {
        return task.continueWith(new sb0(1), new a1.c(this, 5));
    }

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ boolean o0() {
        return false;
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
                return m(context, c3.c(context, R.attr.colorButtonNormal));
            }
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return m(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return m(context, c3.c(context, R.attr.colorAccent));
            }
            if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                return s7.a(context, R.color.abc_tint_spinner);
            }
            if (f(i10, (int[]) this.b)) {
                return c3.d(context, R.attr.colorControlNormal);
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

    public void t(Throwable th2, Thread thread, String str, String str2, long j10, boolean z4) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        g0 g0Var;
        boolean equals = str2.equals("crash");
        i9.q qVar = (i9.q) this.a;
        Context context = qVar.a;
        int i10 = context.getResources().getConfiguration().orientation;
        g0 g0Var2 = qVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        sf.e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            eVar = new sf.e(th4.getLocalizedMessage(), th4.getClass().getName(), g0Var2.v0(th4.getStackTrace()), eVar, 12);
        }
        sf.e eVar2 = eVar;
        a aVar = new a();
        aVar.b = str2;
        aVar.a = Long.valueOf(j10);
        t1 b10 = f9.c.a.b(context);
        int i11 = ((t0) b10).c;
        Boolean valueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList a2 = f9.c.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) eVar2.d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        List d = i9.q.d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        arrayList.add(new r0(name, 4, d));
        if (z4) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    g0Var = g0Var2;
                } else {
                    StackTraceElement[] v02 = g0Var2.v0(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List d10 = i9.q.d(v02, 0);
                    if (d10 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    g0Var = g0Var2;
                    arrayList.add(new r0(name2, 0, d10));
                }
                it2 = it;
                g0Var2 = g0Var;
            }
        }
        List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        p0 c3 = i9.q.c(eVar2, 0);
        q0 q0Var = new q0(0L, "0", "0");
        List a10 = qVar.a();
        if (a10 == null) {
            throw new NullPointerException("Null binaries");
        }
        aVar.c = new m0(new k9.n0(unmodifiableList, c3, null, q0Var, a10), null, null, valueOf, b10, a2, i10);
        aVar.d = qVar.b(i10);
        l0 h = aVar.h();
        n9.a aVar2 = (n9.a) this.b;
        e eVar3 = (e) this.d;
        r3 r3Var = (r3) this.e;
        aVar2.d(d(b(h, eVar3, r3Var), r3Var), str, equals);
    }

    public void u(String str, String... strArr) {
        Bundle bundle = (Bundle) this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            j7.e0.a("String array is empty and is ignored by put method.");
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < Math.min(strArr2.length, 100); i11++) {
            String str2 = strArr2[i11];
            strArr2[i10] = str2;
            if (strArr2[i11] == null) {
                StringBuilder sb = new StringBuilder(59);
                sb.append("String at ");
                sb.append(i11);
                sb.append(" is null and is ignored by put method.");
                j7.e0.a(sb.toString());
            } else {
                int i12 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("String at ");
                    sb2.append(i11);
                    sb2.append(" is too long, truncating string.");
                    j7.e0.a(sb2.toString());
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
                j7.e0.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    public Task v(Executor executor, String str) {
        TaskCompletionSource taskCompletionSource;
        String str2;
        ArrayList b10 = ((n9.a) this.b).b();
        ArrayList arrayList = new ArrayList();
        int size = b10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            File file = (File) b10.get(i10);
            try {
                l9.a aVar = n9.a.g;
                String e6 = n9.a.e(file);
                aVar.getClass();
                arrayList.add(new i9.b(l9.a.i(e6), file.getName(), file));
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
            i9.b bVar = (i9.b) arrayList.get(i12);
            if (str == null || str.equals(bVar.b)) {
                o9.a aVar2 = (o9.a) this.c;
                if (bVar.a.f == null) {
                    try {
                        str2 = (String) y.a(((ca.c) ((w) this.f).d).d());
                    } catch (Exception e11) {
                        Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installation ID.", e11);
                        str2 = null;
                    }
                    g8 a2 = bVar.a.a();
                    a2.d = str2;
                    bVar = new i9.b(a2.a(), bVar.b, bVar.c);
                }
                boolean z4 = str != null;
                o9.c cVar = aVar2.a;
                synchronized (cVar.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z4) {
                            ((AtomicInteger) cVar.i.b).getAndIncrement();
                            if (cVar.f.size() < cVar.e) {
                                f9.b bVar2 = f9.b.a;
                                bVar2.b("Enqueueing report: " + bVar.b);
                                bVar2.b("Queue size: " + cVar.f.size());
                                cVar.g.execute(new com.google.android.gms.common.api.internal.s1(cVar, bVar, taskCompletionSource, 7));
                                bVar2.b("Closing task for report: " + bVar.b);
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
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new u(this)));
            }
            i12 = i13;
        }
        return Tasks.whenAll(arrayList2);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public ColorFilter w() {
        return k6.v3;
    }

    public void x(float f10, float f11, float f12, float f13) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        D();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        z9.f fVar;
        int a2;
        PackageInfo d;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        w8.g gVar = (w8.g) this.a;
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
        w8.g gVar2 = (w8.g) this.a;
        gVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        try {
            String str4 = ((ca.a) Tasks.await(((ca.c) ((ca.d) this.f)).e())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e6) {
            e = e6;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((ca.c) ((ca.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (z9.f) ((ba.b) this.e).get();
            ja.b bVar = (ja.b) ((ba.b) this.d).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((ca.c) ((ca.d) this.f)).d()));
            bundle.putString("cliv", "fcm-23.4.0");
            fVar = (z9.f) ((ba.b) this.e).get();
            ja.b bVar2 = (ja.b) ((ba.b) this.d).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((ca.c) ((ca.d) this.f)).d()));
        bundle.putString("cliv", "fcm-23.4.0");
        fVar = (z9.f) ((ba.b) this.e).get();
        ja.b bVar22 = (ja.b) ((ba.b) this.d).get();
        if (fVar == null || bVar22 == null || (a2 = ((z9.c) fVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(m1.j.c(a2)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public void z(float f10, float f11, float f12, float f13) {
        Matrix matrix = (Matrix) this.f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.c;
        matrix.postRotate(f13, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f12, f12);
        matrix.postTranslate(f10, f11);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public a(int i10, int i11) {
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
        D();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public /* synthetic */ void J0(int i10, int i11) {
    }
}

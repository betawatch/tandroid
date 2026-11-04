package l2;

import android.animation.ValueAnimator;
import android.content.Context;
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
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import b8.kg;
import b8.oc;
import b8.zb;
import cg.v0;
import com.google.android.gms.tasks.Tasks;
import d2.e1;
import d2.k1;
import d2.n1;
import d2.v;
import e5.u;
import g2.n0;
import g9.i0;
import g9.x1;
import j$.util.Objects;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import m.l1;
import m.m2;
import m.q;
import m.z2;
import m2.t;
import mi.h0;
import o4.e0;
import o4.x;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.jd;
import org.telegram.messenger.t0;
import org.telegram.messenger.uy;
import org.telegram.messenger.vs;
import org.telegram.ui.ActionBar.h4;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.LaunchActivity;
import p6.m;
import t2.o;
import w2.g0;
import x7.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class e {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public e(int i3, int i10) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = new RectF();
        this.f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i3), Math.max(1, i10), Bitmap.Config.ARGB_8888);
        this.c = createBitmap;
        this.b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.e = bitmapShader;
        paint.setShader(bitmapShader);
        t();
    }

    public static boolean b(int[] iArr, int i3) {
        for (int i10 : iArr) {
            if (i10 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i3) {
        int c2 = z2.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{z2.b, z2.d, z2.c, z2.f}, new int[]{z2.b(context, R.attr.colorButtonNormal), i0.a.k(c2, i3), i0.a.k(c2, i3), i3});
    }

    public static g0 g(e1 e1Var, i0 i0Var, g0 g0Var, k1 k1Var) {
        n1 y02 = e1Var.y0();
        int B = e1Var.B();
        Object l10 = y02.p() ? null : y02.l(B);
        int b10 = (e1Var.n() || y02.p()) ? -1 : y02.f(B, k1Var, false).b(n0.S(e1Var.N0()) - k1Var.e);
        for (int i3 = 0; i3 < i0Var.size(); i3++) {
            g0 g0Var2 = (g0) i0Var.get(i3);
            if (k(g0Var2, l10, e1Var.n(), e1Var.k0(), e1Var.M(), b10)) {
                return g0Var2;
            }
        }
        if (i0Var.isEmpty() && g0Var != null && k(g0Var, l10, e1Var.n(), e1Var.k0(), e1Var.M(), b10)) {
            return g0Var;
        }
        return null;
    }

    public static LayerDrawable i(m2 m2Var, Context context, int i3) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
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

    public static boolean k(g0 g0Var, Object obj, boolean z10, int i3, int i10, int i11) {
        Object obj2 = g0Var.a;
        int i12 = g0Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10 && i12 == i3 && g0Var.c == i10) {
            return true;
        }
        return !z10 && i12 == -1 && g0Var.e == i11;
    }

    public static void p(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = l1.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = q.b;
        }
        PorterDuff.Mode mode2 = q.b;
        synchronized (q.class) {
            h = m2.h(i3, mode);
        }
        mutate.setColorFilter(h);
    }

    public void a(kg kgVar, g0 g0Var, n1 n1Var) {
        if (g0Var == null) {
            return;
        }
        if (n1Var.b(g0Var.a) != -1) {
            kgVar.w(g0Var, n1Var);
            return;
        }
        n1 n1Var2 = (n1) ((x1) this.c).get(g0Var);
        if (n1Var2 != null) {
            kgVar.w(g0Var, n1Var2);
        }
    }

    public s9.b c() {
        m.h((String) this.f, "setActionToken is required before calling build().");
        new String((String) this.e);
        l("actionToken", (String) this.f);
        String str = (String) this.c;
        if ((str == null ? null : new String(str)) == null) {
            this.c = "AssistAction";
            l("name", "AssistAction");
        }
        String str2 = (String) this.d;
        if ((str2 != null ? new String(str2) : null) == null) {
            String valueOf = String.valueOf((String) this.f);
            String concat = valueOf.length() != 0 ? "https://developers.google.com/actions?invocation=".concat(valueOf) : new String("https://developers.google.com/actions?invocation=");
            m.g(concat);
            this.d = concat;
            l("url", concat);
        }
        m.h((String) this.c, "setObject is required before calling build().");
        m.h((String) this.d, "setObject is required before calling build().");
        return new s9.b((String) this.b, (String) this.c, (String) this.d, null, new s9.a(), (String) this.e, (Bundle) this.a);
    }

    public void d() {
        ((LocationManager) this.b).removeUpdates((jd) this.c);
        ((LocationManager) this.b).removeUpdates((jd) this.d);
        this.f = null;
        this.e = null;
    }

    public void f(uf.d dVar) {
        if (((uf.d) this.e) == dVar) {
            LaunchActivity launchActivity = (LaunchActivity) this.d;
            if (Build.VERSION.SDK_INT >= 26) {
                if (dVar != null) {
                    org.telegram.messenger.g0.w3(launchActivity, dVar.a());
                } else {
                    org.telegram.messenger.g0.c3(launchActivity);
                }
            }
            x xVar = (x) this.f;
            if (xVar != null) {
                e1 e1Var = xVar.a.t.a;
                k2.i0 i0Var = dVar.l;
                if (e1Var != i0Var) {
                    xVar.a(i0Var);
                }
            }
        }
        ((uf.a) this.c).invalidate();
    }

    public uf.a h() {
        if (((uf.a) this.c) == null) {
            this.c = new uf.a((LaunchActivity) this.d);
        }
        return (uf.a) this.c;
    }

    public ColorStateList j(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            return oc.a(context, R.color.abc_tint_edittext);
        }
        if (i3 == R.drawable.abc_switch_track_mtrl_alpha) {
            return oc.a(context, R.color.abc_tint_switch_track);
        }
        if (i3 != R.drawable.abc_switch_thumb_material) {
            if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, z2.c(context, R.attr.colorButtonNormal));
            }
            if (i3 == R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i3 == R.drawable.abc_btn_colored_material) {
                return e(context, z2.c(context, R.attr.colorAccent));
            }
            if (i3 == R.drawable.abc_spinner_mtrl_am_alpha || i3 == R.drawable.abc_spinner_textfield_background_material) {
                return oc.a(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.b, i3)) {
                return z2.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.e, i3)) {
                return oc.a(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f, i3)) {
                return oc.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i3 == R.drawable.abc_seekbar_thumb_material) {
                return oc.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = z2.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = z2.b;
            iArr2[0] = z2.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = z2.e;
            iArr2[1] = z2.c(context, R.attr.colorControlActivated);
            iArr[2] = z2.f;
            iArr2[2] = z2.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = z2.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = z2.e;
            iArr2[1] = z2.c(context, R.attr.colorControlActivated);
            iArr[2] = z2.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void l(String str, String... strArr) {
        Bundle bundle = (Bundle) this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            r.a("String array is empty and is ignored by put method.");
            return;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < Math.min(strArr2.length, 100); i10++) {
            String str2 = strArr2[i10];
            strArr2[i3] = str2;
            if (strArr2[i10] == null) {
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("String at ");
                sb2.append(i10);
                sb2.append(" is null and is ignored by put method.");
                r.a(sb2.toString());
            } else {
                int i11 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb3 = new StringBuilder(53);
                    sb3.append("String at ");
                    sb3.append(i10);
                    sb3.append(" is too long, truncating string.");
                    r.a(sb3.toString());
                    String str3 = strArr2[i3];
                    if (str3.length() > 20000) {
                        if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                            i11 = 19999;
                        }
                        str3 = str3.substring(0, i11);
                    }
                    strArr2[i3] = str3;
                }
                i3++;
            }
        }
        if (i3 > 0) {
            Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i3);
            if (objArr.length >= 100) {
                r.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    public void m(float f10, float f11, float f12, float f13) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(String str, Bundle bundle, boolean z10) {
        String str2;
        String str3;
        ra.g gVar;
        int a10;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        n9.h hVar = (n9.h) this.a;
        hVar.a();
        bundle.putString("gmp_app_id", hVar.c.b);
        bundle.putString("gmsv", Integer.toString(((h4) this.b).c()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((h4) this.b).a());
        h4 h4Var = (h4) this.b;
        synchronized (h4Var) {
            try {
                if (((String) h4Var.e) == null) {
                    h4Var.f();
                }
                str2 = (String) h4Var.e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str2);
        n9.h hVar2 = (n9.h) this.a;
        hVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(hVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        if (z10) {
            n9.h hVar3 = (n9.h) this.a;
            hVar3.a();
            bundle.putString("Goog-Api-Key", hVar3.c.a);
        }
        try {
            String str4 = ((ua.a) Tasks.await(((ua.d) ((ua.e) this.f)).f())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((ua.d) ((ua.e) this.f)).e()));
            bundle.putString("cliv", "fcm-25.1.3");
            gVar = (ra.g) ((ta.b) this.e).get();
            bb.b bVar = (bb.b) ((ta.b) this.d).get();
            if (gVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((ua.d) ((ua.e) this.f)).e()));
            bundle.putString("cliv", "fcm-25.1.3");
            gVar = (ra.g) ((ta.b) this.e).get();
            bb.b bVar2 = (bb.b) ((ta.b) this.d).get();
            if (gVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((ua.d) ((ua.e) this.f)).e()));
        bundle.putString("cliv", "fcm-25.1.3");
        gVar = (ra.g) ((ta.b) this.e).get();
        bb.b bVar22 = (bb.b) ((ta.b) this.d).get();
        if (gVar == null || bVar22 == null || (a10 = ((ra.d) gVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(o1.g.c(a10)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public void o(float f10, float f11, float f12, float f13) {
        Matrix matrix = (Matrix) this.f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.c;
        matrix.postRotate(f13, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f12, f12);
        matrix.postTranslate(f10, f11);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public void q() {
        if (((LocationManager) this.b) == null) {
            this.b = (LocationManager) t0.b.getSystemService("location");
        }
        try {
            ((LocationManager) this.b).requestLocationUpdates("gps", 1L, 0.0f, (jd) this.c);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            ((LocationManager) this.b).requestLocationUpdates("network", 1L, 0.0f, (jd) this.d);
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            Location lastKnownLocation = ((LocationManager) this.b).getLastKnownLocation("gps");
            this.f = lastKnownLocation;
            if (lastKnownLocation == null) {
                this.f = ((LocationManager) this.b).getLastKnownLocation("network");
            }
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        vs vsVar = (vs) this.e;
        if (vsVar != null) {
            org.telegram.messenger.g0.r(vsVar);
        }
        vs vsVar2 = new vs(this, 14);
        this.e = vsVar2;
        org.telegram.messenger.g0.i3(vsVar2, 5000L);
    }

    public void r() {
        if (((LocationManager) this.b) == null) {
            return;
        }
        vs vsVar = (vs) this.e;
        if (vsVar != null) {
            org.telegram.messenger.g0.r(vsVar);
        }
        d();
    }

    public void s(boolean z10) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        ArrayList arrayList3 = (ArrayList) this.a;
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            ((ValueAnimator) arrayList3.get(i3)).cancel();
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i3)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new wv0(this, i3, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((ValueAnimator) arrayList2.get(i10)).cancel();
            if (z10) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i10)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new wv0(this, i10, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ValueAnimator) arrayList.get(i11)).cancel();
            if (z10) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i11)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new wv0(this, i11, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void t() {
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

    public void u(n1 n1Var) {
        kg kgVar = new kg(4, 8);
        if (((i0) this.b).isEmpty()) {
            a(kgVar, (g0) this.e, n1Var);
            if (!Objects.equals((g0) this.f, (g0) this.e)) {
                a(kgVar, (g0) this.f, n1Var);
            }
            if (!Objects.equals((g0) this.d, (g0) this.e) && !Objects.equals((g0) this.d, (g0) this.f)) {
                a(kgVar, (g0) this.d, n1Var);
            }
        } else {
            for (int i3 = 0; i3 < ((i0) this.b).size(); i3++) {
                a(kgVar, (g0) ((i0) this.b).get(i3), n1Var);
            }
            if (!((i0) this.b).contains((g0) this.d)) {
                a(kgVar, (g0) this.d, n1Var);
            }
        }
        this.c = kgVar.e(true);
    }

    public void v() {
        uf.d dVar = (uf.d) this.e;
        uf.d dVar2 = null;
        for (uf.d dVar3 : ((HashMap) this.a).values()) {
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
                    org.telegram.messenger.g0.w3(launchActivity, dVar2.a());
                } else {
                    org.telegram.messenger.g0.c3(launchActivity);
                }
            }
            boolean z10 = false;
            if ((dVar != null && dVar.f) != (dVar2 != null && dVar2.f)) {
                x xVar = (x) this.f;
                if (xVar != null) {
                    try {
                        synchronized (x.b) {
                            x.c.remove(xVar.a.i);
                        }
                        xVar.a.r();
                    } catch (Exception unused) {
                    }
                    this.f = null;
                }
                if (dVar2 != null) {
                    o4.r rVar = new o4.r((LaunchActivity) this.d, dVar2.l);
                    rVar.c = "pip-media-session";
                    zb.p(!rVar.m);
                    rVar.m = true;
                    Context context = rVar.a;
                    Object obj = x.b;
                    int intValue = ((Integer) e0.C.get()).intValue();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 < 27) {
                        intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
                    }
                    g2.e eVar = rVar.g;
                    if (eVar == null) {
                        v0 v0Var = new v0();
                        v0Var.c = context;
                        v0Var.b = -1;
                        v0Var.b = intValue;
                        v0Var.a = true;
                        rVar.g = new i2.j(v0Var);
                    } else {
                        rVar.g = new u(eVar, intValue, 8);
                    }
                    if (i3 == 29) {
                        g2.e eVar2 = rVar.g;
                        AtomicReference atomicReference = o4.r.n;
                        k9.a aVar = (k9.a) atomicReference.get();
                        if (aVar == null) {
                            Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                            Point point = new Point();
                            defaultDisplay.getSize(point);
                            Point point2 = new Point();
                            defaultDisplay.getRealSize(point2);
                            int i10 = point2.y;
                            int i11 = point2.x;
                            Point point3 = new Point(i10 - (i11 - point.x), i11 - (i10 - point.y));
                            k9.a aVar2 = new k9.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
                            atomicReference.set(aVar2);
                            aVar = aVar2;
                        }
                        rVar.g = new t(eVar2, aVar, z10, 3);
                    }
                    rVar.g = new h0(rVar.g, 2);
                    this.f = new x(rVar.a, rVar.c, rVar.b, rVar.i, rVar.j, rVar.k, rVar.d, rVar.e, rVar.f, rVar.g, rVar.h, rVar.l);
                }
            }
            if (dVar != null) {
                wf.e eVar3 = dVar.b;
                eVar3.n = false;
                eVar3.h();
                uf.d dVar4 = eVar3.j;
                ((uf.b) dVar4.a.b).a.remove(eVar3);
                ((uf.b) dVar4.a.b).b.remove(eVar3);
                e eVar4 = dVar4.a;
                String str = dVar4.c;
                HashMap hashMap = ((uf.b) eVar4.b).c;
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        hashMap.remove(str);
                    }
                }
            }
            if (dVar2 != null) {
                x xVar2 = (x) this.f;
                if (xVar2 != null) {
                    e1 e1Var = xVar2.a.t.a;
                    k2.i0 i0Var = dVar2.l;
                    if (e1Var != i0Var) {
                        xVar2.a(i0Var);
                    }
                }
                ((uf.a) this.c).bringToFront();
                wf.e eVar5 = dVar2.b;
                uf.d dVar5 = eVar5.j;
                ((uf.b) dVar5.a.b).a.add(eVar5);
                ((uf.b) dVar5.a.b).b.add(eVar5);
                e eVar6 = dVar5.a;
                String str2 = dVar5.c;
                HashMap hashMap2 = ((uf.b) eVar6.b).c;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap2.put(str2, arrayList2);
                }
                arrayList2.add(null);
            } else if (dVar != null && org.telegram.messenger.g0.H1((LaunchActivity) this.d)) {
                ((LaunchActivity) this.d).moveTaskToBack(false);
            }
            ((uf.a) this.c).invalidate();
        }
    }

    public e(int i3) {
        switch (i3) {
            case 3:
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
                t();
                break;
            case 4:
                this.a = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new ArrayList();
                break;
            case 5:
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

    public e(o oVar, MediaFormat mediaFormat, v vVar, Surface surface, MediaCrypto mediaCrypto, t2.j jVar) {
        this.a = oVar;
        this.b = mediaFormat;
        this.c = vVar;
        this.d = surface;
        this.e = mediaCrypto;
        this.f = jVar;
    }

    public e(uy uyVar) {
        int i3 = 1;
        this.c = new jd(this, i3);
        this.d = new jd(this, i3);
        this.a = uyVar;
    }
}

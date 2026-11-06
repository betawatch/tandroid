package a8;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
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
import android.view.Surface;
import c8.hc;
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.ds;
import org.telegram.messenger.qd;
import org.telegram.ui.Components.xv0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class b8 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public b8(int i7, int i10) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = new RectF();
        this.f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i7), Math.max(1, i10), Bitmap.Config.ARGB_8888);
        this.c = createBitmap;
        this.b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.e = bitmapShader;
        paint.setShader(bitmapShader);
        r();
    }

    public static boolean b(int[] iArr, int i7) {
        for (int i10 : iArr) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i7) {
        int c10 = m.a3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{m.a3.b, m.a3.d, m.a3.c, m.a3.f}, new int[]{m.a3.b(context, R.attr.colorButtonNormal), i0.a.k(c10, i7), i0.a.k(c10, i7), i7});
    }

    public static x2.g0 f(e2.c1 c1Var, h9.i0 i0Var, x2.g0 g0Var, e2.i1 i1Var) {
        e2.l1 y02 = c1Var.y0();
        int B = c1Var.B();
        Object l10 = y02.p() ? null : y02.l(B);
        int b10 = (c1Var.p() || y02.p()) ? -1 : y02.f(B, i1Var, false).b(h2.m0.S(c1Var.l()) - i1Var.e);
        for (int i7 = 0; i7 < i0Var.size(); i7++) {
            x2.g0 g0Var2 = (x2.g0) i0Var.get(i7);
            if (i(g0Var2, l10, c1Var.p(), c1Var.n0(), c1Var.O(), b10)) {
                return g0Var2;
            }
        }
        if (i0Var.isEmpty() && g0Var != null && i(g0Var, l10, c1Var.p(), c1Var.n0(), c1Var.O(), b10)) {
            return g0Var;
        }
        return null;
    }

    public static LayerDrawable g(m.n2 n2Var, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
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

    public static boolean i(x2.g0 g0Var, Object obj, boolean z9, int i7, int i10, int i11) {
        Object obj2 = g0Var.a;
        int i12 = g0Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z9 && i12 == i7 && g0Var.c == i10) {
            return true;
        }
        return !z9 && i12 == -1 && g0Var.e == i11;
    }

    public static void n(Drawable drawable, int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = m.m1.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = m.r.b;
        }
        PorterDuff.Mode mode2 = m.r.b;
        synchronized (m.r.class) {
            h = m.n2.h(i7, mode);
        }
        mutate.setColorFilter(h);
    }

    public void a(wa waVar, x2.g0 g0Var, e2.l1 l1Var) {
        if (g0Var == null) {
            return;
        }
        if (l1Var.b(g0Var.a) != -1) {
            waVar.v(g0Var, l1Var);
            return;
        }
        e2.l1 l1Var2 = (e2.l1) ((h9.y1) this.c).get(g0Var);
        if (l1Var2 != null) {
            waVar.v(g0Var, l1Var2);
        }
    }

    public t9.b c() {
        q6.m.h((String) this.f, "setActionToken is required before calling build().");
        new String((String) this.e);
        j("actionToken", (String) this.f);
        String str = (String) this.c;
        if ((str == null ? null : new String(str)) == null) {
            this.c = "AssistAction";
            j("name", "AssistAction");
        }
        String str2 = (String) this.d;
        if ((str2 != null ? new String(str2) : null) == null) {
            String valueOf = String.valueOf((String) this.f);
            String concat = valueOf.length() != 0 ? "https://developers.google.com/actions?invocation=".concat(valueOf) : new String("https://developers.google.com/actions?invocation=");
            q6.m.g(concat);
            this.d = concat;
            j("url", concat);
        }
        q6.m.h((String) this.c, "setObject is required before calling build().");
        q6.m.h((String) this.d, "setObject is required before calling build().");
        return new t9.b((String) this.b, (String) this.c, (String) this.d, null, new t9.a(), (String) this.e, (Bundle) this.a);
    }

    public void d() {
        ((LocationManager) this.b).removeUpdates((qd) this.c);
        ((LocationManager) this.b).removeUpdates((qd) this.d);
        this.f = null;
        this.e = null;
    }

    public ColorStateList h(Context context, int i7) {
        if (i7 == R.drawable.abc_edit_text_material) {
            return b5.a.a(context, R.color.abc_tint_edittext);
        }
        if (i7 == R.drawable.abc_switch_track_mtrl_alpha) {
            return b5.a.a(context, R.color.abc_tint_switch_track);
        }
        if (i7 != R.drawable.abc_switch_thumb_material) {
            if (i7 == R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, m.a3.c(context, R.attr.colorButtonNormal));
            }
            if (i7 == R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i7 == R.drawable.abc_btn_colored_material) {
                return e(context, m.a3.c(context, R.attr.colorAccent));
            }
            if (i7 == R.drawable.abc_spinner_mtrl_am_alpha || i7 == R.drawable.abc_spinner_textfield_background_material) {
                return b5.a.a(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.b, i7)) {
                return m.a3.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.e, i7)) {
                return b5.a.a(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f, i7)) {
                return b5.a.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i7 == R.drawable.abc_seekbar_thumb_material) {
                return b5.a.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = m.a3.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = m.a3.b;
            iArr2[0] = m.a3.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = m.a3.e;
            iArr2[1] = m.a3.c(context, R.attr.colorControlActivated);
            iArr[2] = m.a3.f;
            iArr2[2] = m.a3.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = m.a3.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = m.a3.e;
            iArr2[1] = m.a3.c(context, R.attr.colorControlActivated);
            iArr[2] = m.a3.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void j(String str, String... strArr) {
        Bundle bundle = (Bundle) this.a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            hc.a("String array is empty and is ignored by put method.");
            return;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < Math.min(strArr2.length, 100); i10++) {
            String str2 = strArr2[i10];
            strArr2[i7] = str2;
            if (strArr2[i10] == null) {
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("String at ");
                sb2.append(i10);
                sb2.append(" is null and is ignored by put method.");
                hc.a(sb2.toString());
            } else {
                int i11 = 20000;
                if (str2.length() > 20000) {
                    StringBuilder sb3 = new StringBuilder(53);
                    sb3.append("String at ");
                    sb3.append(i10);
                    sb3.append(" is too long, truncating string.");
                    hc.a(sb3.toString());
                    String str3 = strArr2[i7];
                    if (str3.length() > 20000) {
                        if (Character.isHighSurrogate(str3.charAt(19999)) && Character.isLowSurrogate(str3.charAt(20000))) {
                            i11 = 19999;
                        }
                        str3 = str3.substring(0, i11);
                    }
                    strArr2[i7] = str3;
                }
                i7++;
            }
        }
        if (i7 > 0) {
            Object[] objArr = (String[]) Arrays.copyOfRange(strArr2, 0, i7);
            if (objArr.length >= 100) {
                hc.a("Input Array of elements is too big, cutting off.");
                objArr = Arrays.copyOf(objArr, 100);
            }
            bundle.putStringArray(str, (String[]) objArr);
        }
    }

    public void k(float f10, float f11, float f12, float f13) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(String str, Bundle bundle, boolean z9) {
        String str2;
        String str3;
        sa.f fVar;
        int a10;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        o9.g gVar = (o9.g) this.a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.c.b);
        bundle.putString("gmsv", Integer.toString(((ab.v) this.b).c()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((ab.v) this.b).a());
        ab.v vVar = (ab.v) this.b;
        synchronized (vVar) {
            try {
                if (((String) vVar.e) == null) {
                    vVar.f();
                }
                str2 = (String) vVar.e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str2);
        o9.g gVar2 = (o9.g) this.a;
        gVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        if (z9) {
            o9.g gVar3 = (o9.g) this.a;
            gVar3.a();
            bundle.putString("Goog-Api-Key", gVar3.c.a);
        }
        try {
            String str4 = ((va.a) Tasks.await(((va.c) ((va.d) this.f)).f())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((va.c) ((va.d) this.f)).e()));
            bundle.putString("cliv", "fcm-25.1.3");
            fVar = (sa.f) ((ua.b) this.e).get();
            cb.b bVar = (cb.b) ((ua.b) this.d).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) Tasks.await(((va.c) ((va.d) this.f)).e()));
            bundle.putString("cliv", "fcm-25.1.3");
            fVar = (sa.f) ((ua.b) this.e).get();
            cb.b bVar2 = (cb.b) ((ua.b) this.d).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) Tasks.await(((va.c) ((va.d) this.f)).e()));
        bundle.putString("cliv", "fcm-25.1.3");
        fVar = (sa.f) ((ua.b) this.e).get();
        cb.b bVar22 = (cb.b) ((ua.b) this.d).get();
        if (fVar == null || bVar22 == null || (a10 = ((sa.c) fVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(p1.g.c(a10)));
        bundle.putString("Firebase-Client", bVar22.a());
    }

    public void m(float f10, float f11, float f12, float f13) {
        Matrix matrix = (Matrix) this.f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.c;
        matrix.postRotate(f13, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f12, f12);
        matrix.postTranslate(f10, f11);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public void o() {
        if (((LocationManager) this.b) == null) {
            this.b = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
        }
        try {
            ((LocationManager) this.b).requestLocationUpdates("gps", 1L, 0.0f, (qd) this.c);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ((LocationManager) this.b).requestLocationUpdates("network", 1L, 0.0f, (qd) this.d);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            Location lastKnownLocation = ((LocationManager) this.b).getLastKnownLocation("gps");
            this.f = lastKnownLocation;
            if (lastKnownLocation == null) {
                this.f = ((LocationManager) this.b).getLastKnownLocation("network");
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        ds dsVar = (ds) this.e;
        if (dsVar != null) {
            org.telegram.messenger.g0.r(dsVar);
        }
        ds dsVar2 = new ds(this, 14);
        this.e = dsVar2;
        org.telegram.messenger.g0.i3(dsVar2, 5000L);
    }

    public void p() {
        if (((LocationManager) this.b) == null) {
            return;
        }
        ds dsVar = (ds) this.e;
        if (dsVar != null) {
            org.telegram.messenger.g0.r(dsVar);
        }
        d();
    }

    public void q(boolean z9) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        ArrayList arrayList3 = (ArrayList) this.a;
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            ((ValueAnimator) arrayList3.get(i7)).cancel();
            if (z9) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i7)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new xv0(this, i7, 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((ValueAnimator) arrayList2.get(i10)).cancel();
            if (z9) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i10)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new xv0(this, i10, 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ValueAnimator) arrayList.get(i11)).cancel();
            if (z9) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i11)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new xv0(this, i11, 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public void r() {
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

    public void s(e2.l1 l1Var) {
        wa waVar = new wa(4, 10);
        if (((h9.i0) this.b).isEmpty()) {
            a(waVar, (x2.g0) this.e, l1Var);
            if (!Objects.equals((x2.g0) this.f, (x2.g0) this.e)) {
                a(waVar, (x2.g0) this.f, l1Var);
            }
            if (!Objects.equals((x2.g0) this.d, (x2.g0) this.e) && !Objects.equals((x2.g0) this.d, (x2.g0) this.f)) {
                a(waVar, (x2.g0) this.d, l1Var);
            }
        } else {
            for (int i7 = 0; i7 < ((h9.i0) this.b).size(); i7++) {
                a(waVar, (x2.g0) ((h9.i0) this.b).get(i7), l1Var);
            }
            if (!((h9.i0) this.b).contains((x2.g0) this.d)) {
                a(waVar, (x2.g0) this.d, l1Var);
            }
        }
        this.c = waVar.d(true);
    }

    public b8(int i7) {
        switch (i7) {
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
                r();
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

    public b8(u2.o oVar, MediaFormat mediaFormat, e2.u uVar, Surface surface, MediaCrypto mediaCrypto, u2.j jVar) {
        this.a = oVar;
        this.b = mediaFormat;
        this.c = uVar;
        this.d = surface;
        this.e = mediaCrypto;
        this.f = jVar;
    }

    public b8(cz czVar) {
        int i7 = 1;
        this.c = new qd(this, i7);
        this.d = new qd(this, i7);
        this.a = czVar;
    }
}

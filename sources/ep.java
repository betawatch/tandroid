// default package

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
import com.google.android.gms.tasks.Tasks;
import j$.util.Objects;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ep {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ep(byte b) {
        switch (b) {
            case 1:
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
                p();
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

    public static boolean b(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i) {
        int c = cnb.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{cnb.b, cnb.d, cnb.c, cnb.f}, new int[]{cnb.b(context, R.attr.colorButtonNormal), bm2.k(c, i), bm2.k(c, i), i});
    }

    public static rx6 e(y54 y54Var, mm5 mm5Var, rx6 rx6Var, xnb xnbVar) {
        aob y0 = y54Var.y0();
        int A = y54Var.A();
        Object l = y0.p() ? null : y0.l(A);
        int b = (y54Var.l() || y0.p()) ? -1 : y0.f(A, xnbVar, false).b(g8c.T(y54Var.m()) - xnbVar.e);
        for (int i = 0; i < mm5Var.size(); i++) {
            rx6 rx6Var2 = (rx6) mm5Var.get(i);
            if (h(rx6Var2, l, y54Var.l(), y54Var.k0(), y54Var.L(), b)) {
                return rx6Var2;
            }
        }
        if (mm5Var.isEmpty() && rx6Var != null && h(rx6Var, l, y54Var.l(), y54Var.k0(), y54Var.L(), b)) {
            return rx6Var;
        }
        return null;
    }

    public static LayerDrawable f(ha9 ha9Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable g = ha9Var.g(context, R.drawable.abc_star_black_48dp);
        Drawable g2 = ha9Var.g(context, R.drawable.abc_star_half_black_48dp);
        if ((g instanceof BitmapDrawable) && g.getIntrinsicWidth() == dimensionPixelSize && g.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) g;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            g.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((g2 instanceof BitmapDrawable) && g2.getIntrinsicWidth() == dimensionPixelSize && g2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) g2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            g2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean h(rx6 rx6Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = rx6Var.a;
        int i4 = rx6Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && rx6Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && rx6Var.e == i3;
    }

    public static void l(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = lq3.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = fp.b;
        }
        PorterDuff.Mode mode2 = fp.b;
        synchronized (fp.class) {
            h = ha9.h(i, mode);
        }
        mutate.setColorFilter(h);
    }

    public final void a(kp kpVar, rx6 rx6Var, aob aobVar) {
        if (rx6Var != null) {
            if (aobVar.b(rx6Var.a) != -1) {
                kpVar.w(rx6Var, aobVar);
                return;
            }
            aob aobVar2 = (aob) ((b69) this.c).get(rx6Var);
            if (aobVar2 != null) {
                kpVar.w(rx6Var, aobVar2);
            }
        }
    }

    public final void c() {
        ((LocationManager) this.b).removeUpdates((cb6) this.c);
        ((LocationManager) this.b).removeUpdates((cb6) this.d);
        this.f = null;
        this.e = null;
    }

    public final ColorStateList g(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return rr.e(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return rr.e(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return d(context, cnb.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return d(context, cnb.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return rr.e(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.b, i)) {
                return cnb.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.e, i)) {
                return rr.e(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f, i)) {
                return rr.e(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return rr.e(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = cnb.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = cnb.b;
            iArr2[0] = cnb.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = cnb.e;
            iArr2[1] = cnb.c(context, R.attr.colorControlActivated);
            iArr[2] = cnb.f;
            iArr2[2] = cnb.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = cnb.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = cnb.e;
            iArr2[1] = cnb.c(context, R.attr.colorControlActivated);
            iArr[2] = cnb.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public final void i(float f, float f2, float f3, float f4) {
        RectF rectF = gl.P;
        rectF.set(f, f2, f3, f4);
        RectF rectF2 = (RectF) this.d;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        p();
    }

    public final void j(String str, Bundle bundle, boolean z) {
        String str2;
        String str3;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        jg4 jg4Var = (jg4) this.a;
        jg4Var.a();
        bundle.putString("gmp_app_id", jg4Var.c.b);
        bundle.putString("gmsv", Integer.toString(((kd7) this.b).c()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((kd7) this.b).a());
        kd7 kd7Var = (kd7) this.b;
        synchronized (kd7Var) {
            if (((String) kd7Var.e) == null) {
                kd7Var.f();
            }
            str2 = (String) kd7Var.e;
        }
        bundle.putString("app_ver_name", str2);
        jg4 jg4Var2 = (jg4) this.a;
        jg4Var2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(jg4Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        if (z) {
            jg4 jg4Var3 = (jg4) this.a;
            jg4Var3.a();
            bundle.putString("Goog-Api-Key", jg4Var3.c.a);
        }
        try {
            String str4 = ((x90) Tasks.await(((qg4) ((rg4) this.f)).f())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(((qg4) ((rg4) this.f)).e()));
        bundle.putString("cliv", "fcm-25.1.3");
        rd5 rd5Var = (rd5) ((mt8) this.e).get();
        tc3 tc3Var = (tc3) ((mt8) this.d).get();
        if (rd5Var == null || tc3Var == null) {
            return;
        }
        int a = ((oa3) rd5Var).a();
        int i = 1;
        if (a != 1) {
            if (a == 1) {
                i = 0;
            } else if (a != 2) {
                i = 3;
                if (a == 3) {
                    i = 2;
                } else if (a != 4) {
                    throw null;
                }
            }
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(i));
            bundle.putString("Firebase-Client", tc3Var.a());
        }
    }

    public final void k(float f, float f2, float f3, float f4) {
        Matrix matrix = (Matrix) this.f;
        matrix.reset();
        Bitmap bitmap = (Bitmap) this.c;
        matrix.postRotate(f4, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(f3, f3);
        matrix.postTranslate(f, f2);
        ((BitmapShader) this.e).setLocalMatrix(matrix);
    }

    public final void m() {
        LocationManager locationManager = (LocationManager) this.b;
        if (locationManager == null) {
            locationManager = (LocationManager) a.b.getSystemService("location");
            this.b = locationManager;
        }
        try {
            locationManager.requestLocationUpdates("gps", 1L, 0.0f, (cb6) this.c);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            ((LocationManager) this.b).requestLocationUpdates("network", 1L, 0.0f, (cb6) this.d);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        try {
            Location lastKnownLocation = ((LocationManager) this.b).getLastKnownLocation("gps");
            this.f = lastKnownLocation;
            if (lastKnownLocation == null) {
                this.f = ((LocationManager) this.b).getLastKnownLocation("network");
            }
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
        zk9 zk9Var = (zk9) this.e;
        if (zk9Var != null) {
            gl.r(zk9Var);
        }
        zk9 zk9Var2 = new zk9(this, (byte) 29);
        this.e = zk9Var2;
        gl.e3(zk9Var2, 5000L);
    }

    public void n() {
        if (((LocationManager) this.b) == null) {
            return;
        }
        zk9 zk9Var = (zk9) this.e;
        if (zk9Var != null) {
            gl.r(zk9Var);
        }
        c();
    }

    public final void o(boolean z) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        ArrayList arrayList3 = (ArrayList) this.a;
        for (int i = 0; i < arrayList3.size(); i++) {
            ((ValueAnimator) arrayList3.get(i)).cancel();
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ArrayList) this.d).get(i)).floatValue(), 0.0f);
                ofFloat.addUpdateListener(new t0b(this, i, (byte) 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((ValueAnimator) arrayList2.get(i2)).cancel();
            if (z) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i2)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new t0b(this, i2, (byte) 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((ValueAnimator) arrayList.get(i3)).cancel();
            if (z) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i3)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new t0b(this, i3, (byte) 2));
                ofFloat3.setDuration(100L);
                ofFloat3.start();
            }
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    public final void p() {
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

    public final void q(aob aobVar) {
        mm5 mm5Var;
        kp kpVar = new kp(4);
        if (((mm5) this.b).isEmpty()) {
            a(kpVar, (rx6) this.e, aobVar);
            if (!Objects.equals((rx6) this.f, (rx6) this.e)) {
                a(kpVar, (rx6) this.f, aobVar);
            }
            if (!Objects.equals((rx6) this.d, (rx6) this.e) && !Objects.equals((rx6) this.d, (rx6) this.f)) {
                a(kpVar, (rx6) this.d, aobVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((mm5) this.b).size();
                mm5Var = (mm5) this.b;
                if (i >= size) {
                    break;
                }
                a(kpVar, (rx6) mm5Var.get(i), aobVar);
                i++;
            }
            if (!mm5Var.contains((rx6) this.d)) {
                a(kpVar, (rx6) this.d, aobVar);
            }
        }
        this.c = kpVar.c(true);
    }

    public ep(int i, int i2) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = new RectF();
        this.f = new Matrix();
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, i), Math.max(1, i2), Bitmap.Config.ARGB_8888);
        this.c = createBitmap;
        this.b = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        this.e = bitmapShader;
        paint.setShader(bitmapShader);
        p();
    }

    public ep(ik6 ik6Var, MediaFormat mediaFormat, fm4 fm4Var, Surface surface, MediaCrypto mediaCrypto, bg6 bg6Var) {
        this.a = ik6Var;
        this.b = mediaFormat;
        this.c = fm4Var;
        this.d = surface;
        this.e = mediaCrypto;
        this.f = bg6Var;
    }

    public ep(v3a v3aVar) {
        byte b = 1;
        this.c = new cb6(this, b);
        this.d = new cb6(this, b);
        this.a = v3aVar;
    }
}

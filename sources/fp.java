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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class fp {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public fp(byte b) {
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
            case 2:
                this.a = new RectF();
                this.b = new RectF();
                this.c = new RectF();
                this.d = new RectF();
                break;
            case 7:
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
        int c = brb.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{brb.b, brb.d, brb.c, brb.f}, new int[]{brb.b(context, R.attr.colorButtonNormal), vm2.k(c, i), vm2.k(c, i), i});
    }

    public static vz6 e(s64 s64Var, po5 po5Var, vz6 vz6Var, xrb xrbVar) {
        asb y0 = s64Var.y0();
        int A = s64Var.A();
        Object l = y0.p() ? null : y0.l(A);
        int b = (s64Var.m() || y0.p()) ? -1 : y0.f(A, xrbVar, false).b(gcc.T(s64Var.k()) - xrbVar.e);
        for (int i = 0; i < po5Var.size(); i++) {
            vz6 vz6Var2 = (vz6) po5Var.get(i);
            if (h(vz6Var2, l, s64Var.m(), s64Var.k0(), s64Var.L(), b)) {
                return vz6Var2;
            }
        }
        if (po5Var.isEmpty() && vz6Var != null && h(vz6Var, l, s64Var.m(), s64Var.k0(), s64Var.L(), b)) {
            return vz6Var;
        }
        return null;
    }

    public static LayerDrawable f(vd9 vd9Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable g = vd9Var.g(context, R.drawable.abc_star_black_48dp);
        Drawable g2 = vd9Var.g(context, R.drawable.abc_star_half_black_48dp);
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

    public static boolean h(vz6 vz6Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = vz6Var.a;
        int i4 = vz6Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && vz6Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && vz6Var.e == i3;
    }

    public static void l(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        int[] iArr = cr3.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = gp.b;
        }
        PorterDuff.Mode mode2 = gp.b;
        synchronized (gp.class) {
            h = vd9.h(i, mode);
        }
        mutate.setColorFilter(h);
    }

    public final void a(lp lpVar, vz6 vz6Var, asb asbVar) {
        if (vz6Var != null) {
            if (asbVar.b(vz6Var.a) != -1) {
                lpVar.x(vz6Var, asbVar);
                return;
            }
            asb asbVar2 = (asb) ((o99) this.c).get(vz6Var);
            if (asbVar2 != null) {
                lpVar.x(vz6Var, asbVar2);
            }
        }
    }

    public final void c() {
        ((LocationManager) this.b).removeUpdates((gd6) this.c);
        ((LocationManager) this.b).removeUpdates((gd6) this.d);
        this.f = null;
        this.e = null;
    }

    public final ColorStateList g(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return sr.e(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return sr.e(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return d(context, brb.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return d(context, brb.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return sr.e(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.b, i)) {
                return brb.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.e, i)) {
                return sr.e(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f, i)) {
                return sr.e(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return sr.e(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d = brb.d(context, R.attr.colorSwitchThumbNormal);
        if (d == null || !d.isStateful()) {
            iArr[0] = brb.b;
            iArr2[0] = brb.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = brb.e;
            iArr2[1] = brb.c(context, R.attr.colorControlActivated);
            iArr[2] = brb.f;
            iArr2[2] = brb.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = brb.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = brb.e;
            iArr2[1] = brb.c(context, R.attr.colorControlActivated);
            iArr[2] = brb.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public final void i(float f, float f2, float f3, float f4) {
        RectF rectF = hl.P;
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
        ji4 ji4Var = (ji4) this.a;
        ji4Var.a();
        bundle.putString("gmp_app_id", ji4Var.c.b);
        bundle.putString("gmsv", Integer.toString(((uf7) this.b).c()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((uf7) this.b).a());
        uf7 uf7Var = (uf7) this.b;
        synchronized (uf7Var) {
            if (((String) uf7Var.e) == null) {
                uf7Var.f();
            }
            str2 = (String) uf7Var.e;
        }
        bundle.putString("app_ver_name", str2);
        ji4 ji4Var2 = (ji4) this.a;
        ji4Var2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(ji4Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        if (z) {
            ji4 ji4Var3 = (ji4) this.a;
            ji4Var3.a();
            bundle.putString("Goog-Api-Key", ji4Var3.c.a);
        }
        try {
            String str4 = ((z90) Tasks.await(((qi4) ((ri4) this.f)).f())).a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(((qi4) ((ri4) this.f)).e()));
        bundle.putString("cliv", "fcm-25.1.3");
        sf5 sf5Var = (sf5) ((vw8) this.e).get();
        md3 md3Var = (md3) ((vw8) this.d).get();
        if (sf5Var == null || md3Var == null) {
            return;
        }
        int a = ((hb3) sf5Var).a();
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
            bundle.putString("Firebase-Client", md3Var.a());
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
            locationManager.requestLocationUpdates("gps", 1L, 0.0f, (gd6) this.c);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            ((LocationManager) this.b).requestLocationUpdates("network", 1L, 0.0f, (gd6) this.d);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        try {
            Location lastKnownLocation = ((LocationManager) this.b).getLastKnownLocation("gps");
            this.f = lastKnownLocation;
            if (lastKnownLocation == null) {
                this.f = ((LocationManager) this.b).getLastKnownLocation("network");
            }
        } catch (Exception e3) {
            cc4.g(e3, true);
        }
        ux9 ux9Var = (ux9) this.e;
        if (ux9Var != null) {
            hl.r(ux9Var);
        }
        ux9 ux9Var2 = new ux9(this, (byte) 16);
        this.e = ux9Var2;
        hl.d3(ux9Var2, 5000L);
    }

    public void n() {
        if (((LocationManager) this.b) == null) {
            return;
        }
        ux9 ux9Var = (ux9) this.e;
        if (ux9Var != null) {
            hl.r(ux9Var);
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
                ofFloat.addUpdateListener(new r4b(this, i, (byte) 0));
                ofFloat.setDuration(100L);
                ofFloat.start();
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((ValueAnimator) arrayList2.get(i2)).cancel();
            if (z) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.e).get(i2)).floatValue(), 0.0f);
                ofFloat2.addUpdateListener(new r4b(this, i2, (byte) 1));
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((ValueAnimator) arrayList.get(i3)).cancel();
            if (z) {
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(((Float) ((ArrayList) this.f).get(i3)).floatValue(), 0.0f);
                ofFloat3.addUpdateListener(new r4b(this, i3, (byte) 2));
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

    public final void q(asb asbVar) {
        po5 po5Var;
        lp lpVar = new lp(4);
        if (((po5) this.b).isEmpty()) {
            a(lpVar, (vz6) this.e, asbVar);
            if (!Objects.equals((vz6) this.f, (vz6) this.e)) {
                a(lpVar, (vz6) this.f, asbVar);
            }
            if (!Objects.equals((vz6) this.d, (vz6) this.e) && !Objects.equals((vz6) this.d, (vz6) this.f)) {
                a(lpVar, (vz6) this.d, asbVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((po5) this.b).size();
                po5Var = (po5) this.b;
                if (i >= size) {
                    break;
                }
                a(lpVar, (vz6) po5Var.get(i), asbVar);
                i++;
            }
            if (!po5Var.contains((vz6) this.d)) {
                a(lpVar, (vz6) this.d, asbVar);
            }
        }
        this.c = lpVar.d(true);
    }

    public fp(int i, int i2) {
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

    public fp(nm6 nm6Var, MediaFormat mediaFormat, ko4 ko4Var, Surface surface, MediaCrypto mediaCrypto, fi6 fi6Var) {
        this.a = nm6Var;
        this.b = mediaFormat;
        this.c = ko4Var;
        this.d = surface;
        this.e = mediaCrypto;
        this.f = fi6Var;
    }

    public fp(n7a n7aVar) {
        byte b = 1;
        this.c = new gd6(this, b);
        this.d = new gd6(this, b);
        this.a = n7aVar;
    }
}

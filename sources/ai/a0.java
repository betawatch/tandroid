package ai;

import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class a0 {
    public static float a = -1.0f;

    public static Canvas a(int i7, int i10, Object obj) {
        RenderNode e10 = ni.a.e(obj);
        e10.setPosition(0, 0, i7, i10);
        return e10.beginRecording();
    }

    public static void b(Canvas canvas, Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static void c(Canvas canvas, Object obj) {
        canvas.drawRenderNode(ni.a.e(obj));
    }

    public static void d(Object obj) {
        ni.a.e(obj).endRecording();
    }

    public static boolean e(Object obj) {
        return obj != null && ni.a.e(obj).hasDisplayList();
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static float g(View view) {
        float f10;
        int identifier;
        float f11;
        if (Build.VERSION.SDK_INT >= 31) {
            WindowInsets rootWindowInsets = view != null ? view.getRootWindowInsets() : null;
            if (rootWindowInsets == null) {
                f11 = -1.0f;
            } else {
                f11 = rootWindowInsets.getRoundedCorner(0) != null ? r5.getRadius() : 0.0f;
            }
            if (f11 >= 0.0f) {
                return f11;
            }
        }
        if (a < 0.0f) {
            try {
                Resources system = Resources.getSystem();
                f10 = system.getIdentifier("rounded_corner_radius_top", "dimen", "android") != 0 ? system.getDimensionPixelSize(r3) : 0.0f;
                if (f10 <= 0.0f && (identifier = system.getIdentifier("rounded_corner_radius", "dimen", "android")) != 0) {
                    f10 = system.getDimensionPixelSize(identifier);
                }
            } catch (Exception unused) {
                f10 = 0.0f;
            }
            a = Math.max(0.0f, f10);
        }
        return a;
    }

    public static void h(Object obj, float f10) {
        ni.a.e(obj).setAlpha(f10);
    }

    public static void i(int i7, Paint paint) {
        BlendMode blendMode;
        switch (i7) {
            case 1:
                blendMode = BlendMode.PLUS;
                break;
            case 2:
                blendMode = BlendMode.SCREEN;
                break;
            case 3:
                blendMode = BlendMode.COLOR_DODGE;
                break;
            case 4:
                blendMode = BlendMode.OVERLAY;
                break;
            case 5:
                blendMode = BlendMode.SOFT_LIGHT;
                break;
            case 6:
                blendMode = BlendMode.COLOR_BURN;
                break;
            default:
                blendMode = null;
                break;
        }
        paint.setBlendMode(blendMode);
    }

    public static void j(Object obj, float f10) {
        ((RenderNode) obj).setRenderEffect(f10 > 0.0f ? RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP) : null);
    }

    public static void k(Object obj, float f10, float[] fArr) {
        ni.a.e(obj).setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(fArr), RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP)));
    }

    public static ColorFilter l(int i7) {
        BlendMode blendMode;
        blendMode = BlendMode.SRC_IN;
        return new BlendModeColorFilter(i7, blendMode);
    }
}

package bi;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class v {
    public static float a = -1.0f;

    public static Canvas a(int i3, int i10, Object obj) {
        RenderNode d = o4.v0.d(obj);
        d.setPosition(0, 0, i3, i10);
        return d.beginRecording();
    }

    public static void b(Canvas canvas, Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static void c(Canvas canvas, Object obj) {
        canvas.drawRenderNode(o4.v0.d(obj));
    }

    public static void d(Object obj) {
        o4.v0.d(obj).endRecording();
    }

    public static boolean e(Object obj) {
        return obj != null && o4.v0.d(obj).hasDisplayList();
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
        o4.v0.d(obj).setAlpha(f10);
    }

    public static void i(int i3, Paint paint) {
        BlendMode blendMode;
        switch (i3) {
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
        o4.v0.d(obj).setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(fArr), RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP)));
    }

    public static ColorFilter l(int i3) {
        BlendMode blendMode;
        blendMode = BlendMode.SRC_IN;
        return new BlendModeColorFilter(i3, blendMode);
    }
}

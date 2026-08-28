package android.support.v4.media.session;

import android.content.Context;
import android.graphics.RadialGradient;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.media.session.MediaSession;
import android.os.Build;
import android.text.style.LineHeightSpan;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static void a(g.x xVar, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            xVar.a(view.getUniqueDrawingId());
        } else {
            xVar.b = true;
        }
    }

    public static /* synthetic */ RadialGradient b(float f10, float f11, float f12, long[] jArr, float[] fArr) {
        return new RadialGradient(f10, f11, f12, jArr, fArr, Shader.TileMode.CLAMP);
    }

    public static /* synthetic */ RenderNode c() {
        return new RenderNode(null);
    }

    public static /* synthetic */ RenderNode d(String str) {
        return new RenderNode(str);
    }

    public static /* synthetic */ MediaSession e(Context context, String str) {
        return new MediaSession(context, str, null);
    }

    public static /* synthetic */ LineHeightSpan.Standard f(int i9) {
        return new LineHeightSpan.Standard(i9);
    }

    public static /* synthetic */ WindowInsets.Builder g() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ RenderNode j() {
        return new RenderNode("WebViewSwipeContainer");
    }

    public static /* synthetic */ void k() {
    }
}

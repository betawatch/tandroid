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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y {
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

    public static /* synthetic */ LineHeightSpan.Standard f(int i10) {
        return new LineHeightSpan.Standard(i10);
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

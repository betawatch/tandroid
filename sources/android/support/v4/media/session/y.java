package android.support.v4.media.session;

import android.content.Context;
import android.graphics.RadialGradient;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.text.style.LineHeightSpan;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y {
    public static void a(bh.a aVar, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            aVar.a(view.getUniqueDrawingId());
        } else {
            aVar.a = true;
        }
    }

    public static /* synthetic */ RadialGradient b(float f7, float f10, float f11, long[] jArr, float[] fArr) {
        return new RadialGradient(f7, f10, f11, jArr, fArr, Shader.TileMode.CLAMP);
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

    public static /* synthetic */ MediaSession f(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public static /* synthetic */ LineHeightSpan.Standard g(int i10) {
        return new LineHeightSpan.Standard(i10);
    }

    public static /* synthetic */ WindowInsets.Builder h() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder i(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ RenderNode k() {
        return new RenderNode("WebViewSwipeContainer");
    }

    public static /* synthetic */ void l() {
    }
}

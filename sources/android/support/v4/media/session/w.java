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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w {
    public static void a(dh.a aVar, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            aVar.a(view.getUniqueDrawingId());
        } else {
            aVar.a = true;
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

    public static /* synthetic */ MediaSession f(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public static /* synthetic */ LineHeightSpan.Standard g(int i7) {
        return new LineHeightSpan.Standard(i7);
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

    public static /* synthetic */ RenderNode m() {
        return new RenderNode("debug");
    }

    public static /* synthetic */ RenderNode n() {
        return new RenderNode("glass-fade-overlay-only");
    }

    public static /* synthetic */ RenderNode o() {
        return new RenderNode("glass-fade-content");
    }
}

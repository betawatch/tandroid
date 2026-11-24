// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class mk1 {
    public static void a(tab tabVar, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            tabVar.a(view.getUniqueDrawingId());
        } else {
            tabVar.b = true;
        }
    }

    public static /* synthetic */ RadialGradient b(float f, float f2, float f3, long[] jArr, float[] fArr) {
        return new RadialGradient(f, f2, f3, jArr, fArr, Shader.TileMode.CLAMP);
    }

    public static /* synthetic */ RenderNode c() {
        return new RenderNode("WebViewSwipeContainer");
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

    public static /* synthetic */ LineHeightSpan.Standard g(int i) {
        return new LineHeightSpan.Standard(i);
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
        return new RenderNode(null);
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ RenderNode m() {
        return new RenderNode("debug");
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ RenderNode o() {
        return new RenderNode("glass-fade-overlay-only");
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ RenderNode q() {
        return new RenderNode("glass-fade-content");
    }

    public static /* synthetic */ void r() {
    }
}

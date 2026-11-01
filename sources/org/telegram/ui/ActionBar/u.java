package org.telegram.ui.ActionBar;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u extends ViewOutlineProvider {
    public final Path a = new Path();

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float L = org.telegram.messenger.i0.L(29.0f);
        float L2 = org.telegram.messenger.i0.L(12.0f);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new float[]{L, L, L, L, L2, L2, L2, L2}, Path.Direction.CW);
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }
}

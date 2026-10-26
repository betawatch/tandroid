package org.telegram.ui.ActionBar;

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u extends ViewOutlineProvider {
    public final Path a = new Path();

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float dp = AndroidUtilities.dp(29.0f);
        float dp2 = AndroidUtilities.dp(12.0f);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new float[]{dp, dp, dp, dp, dp2, dp2, dp2, dp2}, Path.Direction.CW);
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            outline.setConvexPath(path);
        }
    }
}

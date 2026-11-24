// default package

import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m6 extends ViewOutlineProvider {
    public final Path a = new Path();

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float L = gl.L(29.0f);
        float L2 = gl.L(12.0f);
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

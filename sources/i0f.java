// default package

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class i0f {
    public static void a(Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            via.t(window);
        } else if (i >= 30) {
            via.s(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }
}

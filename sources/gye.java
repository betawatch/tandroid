// default package

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class gye {
    public static void a(Window window) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            tga.t(window);
        } else if (i >= 30) {
            tga.s(window);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }
}

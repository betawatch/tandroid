package e5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h {
    public static boolean a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i9 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i9 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

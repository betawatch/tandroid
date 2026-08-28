package k;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class k {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i9) {
        callback.onProvideKeyboardShortcuts(list, menu, i9);
    }
}

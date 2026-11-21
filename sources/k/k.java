package k;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class k {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i7) {
        callback.onProvideKeyboardShortcuts(list, menu, i7);
    }
}

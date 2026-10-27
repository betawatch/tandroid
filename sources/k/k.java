package k;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class k {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        callback.onProvideKeyboardShortcuts(list, menu, i10);
    }
}

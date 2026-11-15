package k;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class j {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i7) {
        return callback.onWindowStartingActionMode(callback2, i7);
    }
}

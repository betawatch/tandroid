// default package

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ble {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, do5 do5Var) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new bo5(inputConnection, do5Var) : au3.a(editorInfo).length == 0 ? inputConnection : new co5(inputConnection, do5Var);
        }
        fvc.f("editorInfo must be non-null");
        return null;
    }
}

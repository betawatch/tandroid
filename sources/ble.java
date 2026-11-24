// default package

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

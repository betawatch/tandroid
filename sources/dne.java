// default package

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class dne {
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, dq5 dq5Var) {
        if (editorInfo != null) {
            return Build.VERSION.SDK_INT >= 25 ? new bq5(inputConnection, dq5Var) : lv3.a(editorInfo).length == 0 ? inputConnection : new cq5(inputConnection, dq5Var);
        }
        gxc.d("editorInfo must be non-null");
        return null;
    }
}

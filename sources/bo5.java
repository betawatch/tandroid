// default package

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bo5 extends InputConnectionWrapper {
    public final /* synthetic */ do5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo5(InputConnection inputConnection, do5 do5Var) {
        super(inputConnection, false);
        this.a = do5Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        gi3 gi3Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            gi3Var = new gi3(new eo5(inputContentInfo));
        }
        if (this.a.a(gi3Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}

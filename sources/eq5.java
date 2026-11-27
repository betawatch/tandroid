// default package

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class eq5 extends InputConnectionWrapper {
    public final /* synthetic */ gq5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq5(InputConnection inputConnection, gq5 gq5Var) {
        super(inputConnection, false);
        this.a = gq5Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        kj4 kj4Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            kj4Var = new kj4((Object) new hq5(inputContentInfo), (byte) 8);
        }
        if (this.a.a(kj4Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}

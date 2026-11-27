// default package

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

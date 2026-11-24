// default package

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bq5 extends InputConnectionWrapper {
    public final /* synthetic */ dq5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq5(InputConnection inputConnection, dq5 dq5Var) {
        super(inputConnection, false);
        this.a = dq5Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        lj4 lj4Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            lj4Var = new lj4(new eq5(inputContentInfo));
        }
        if (this.a.a(lj4Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}

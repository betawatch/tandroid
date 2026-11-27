// default package

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class he1 extends EditTextBoldCursor {
    public final /* synthetic */ byte N1;
    public final /* synthetic */ ie1 O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he1(ie1 ie1Var, Context context, byte b) {
        super(context);
        this.N1 = b;
        this.O1 = ie1Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final vnb getResourcesProvider() {
        byte b = this.N1;
        ie1 ie1Var = this.O1;
        switch (b) {
        }
        return ie1Var.d;
    }
}

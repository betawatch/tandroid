// default package

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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

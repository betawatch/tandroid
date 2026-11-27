// default package

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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

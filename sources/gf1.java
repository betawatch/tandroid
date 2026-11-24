// default package

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gf1 extends EditTextBoldCursor {
    public final /* synthetic */ byte M1;
    public final /* synthetic */ hf1 N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf1(hf1 hf1Var, Context context, byte b) {
        super(context);
        this.M1 = b;
        this.N1 = hf1Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final ylb getResourcesProvider() {
        byte b = this.M1;
        hf1 hf1Var = this.N1;
        switch (b) {
        }
        return hf1Var.d;
    }
}

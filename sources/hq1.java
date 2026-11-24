// default package

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hq1 extends az3 {
    public final /* synthetic */ iq1 Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq1(iq1 iq1Var, d dVar, Activity activity, ylb ylbVar, ArrayList arrayList) {
        super(dVar, activity, ylbVar, arrayList);
        this.Q1 = iq1Var;
    }

    @Override // az3, my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        this.Q1.p.y6(false, true, 0.0f);
    }
}

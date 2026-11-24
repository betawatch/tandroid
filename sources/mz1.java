// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mz1 extends p3c {
    public final /* synthetic */ nz1 p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz1(nz1 nz1Var, Context context, d dVar, d4c d4cVar, ylb ylbVar) {
        super(context, dVar, d4cVar, ylbVar);
        this.p1 = nz1Var;
    }

    @Override // p3c, my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.p1.a;
        if (chatActivityEnterView.Q3 == this) {
            chatActivityEnterView.Q3 = null;
        }
        uz1 uz1Var = chatActivityEnterView.P3;
        if (uz1Var != null) {
            uz1Var.p(false);
        }
    }
}

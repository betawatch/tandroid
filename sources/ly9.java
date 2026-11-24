// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ly9 extends rz9 {
    public final /* synthetic */ View R;
    public final /* synthetic */ TL_stars.TL_starGiftUnique S;
    public final /* synthetic */ my9 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly9(my9 my9Var, Context context, lz9 lz9Var, View view, fz9 fz9Var, ylb ylbVar, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(my9Var.e, context, lz9Var, view, fz9Var, ylbVar);
        this.T = my9Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override // rz9, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}

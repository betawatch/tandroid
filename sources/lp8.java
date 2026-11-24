// default package

import android.content.Context;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lp8 extends rja {
    public final /* synthetic */ ProfileActivity x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp8(ProfileActivity profileActivity, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.x0 = profileActivity;
    }

    @Override // rja, g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        super.D(i, f, f2, h94Var);
        RectF rectF = ProfileActivity.e7;
        this.x0.V3();
    }
}

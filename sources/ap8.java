// default package

import android.content.Context;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ap8 extends jm {
    public final /* synthetic */ ProfileActivity V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.V0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        RectF rectF = ProfileActivity.e7;
        this.V0.J1();
    }

    @Override // lka
    public final void setTextColor(int i) {
        int p1;
        ProfileActivity profileActivity = this.V0;
        profileActivity.P5 = i;
        int f = on2.f(profileActivity.L5, i, cmb.v0(cmb.x6, profileActivity.A0));
        super.setTextColor(f);
        vq8 vq8Var = profileActivity.K6;
        if (vq8Var == null || vq8Var.c == (p1 = cmb.p1(1.4f, cmb.a(-0.02f, 0.15f, f)))) {
            return;
        }
        vq8Var.c = p1;
        vq8Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        RectF rectF = ProfileActivity.e7;
        ProfileActivity profileActivity = this.V0;
        profileActivity.m2();
        ita itaVar = profileActivity.T;
        if (itaVar != null) {
            itaVar.setTranslationX(f - profileActivity.m2());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        RectF rectF = ProfileActivity.e7;
        ProfileActivity profileActivity = this.V0;
        if (profileActivity.T != null) {
            gm.L(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        ita itaVar = profileActivity.T;
        if (itaVar != null) {
            itaVar.setTranslationY(f - gm.L(5.0f));
        }
    }
}

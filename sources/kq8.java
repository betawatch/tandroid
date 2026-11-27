// default package

import android.content.Context;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kq8 extends kl {
    public final /* synthetic */ ProfileActivity V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.V0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        super.setAlpha(f);
        RectF rectF = ProfileActivity.Z6;
        this.V0.I1();
    }

    @Override // ema
    public final void setTextColor(int i) {
        int p1;
        ProfileActivity profileActivity = this.V0;
        profileActivity.K5 = i;
        int f = vm2.f(profileActivity.G5, i, aob.v0(aob.y6, profileActivity.A0));
        super.setTextColor(f);
        gs8 gs8Var = profileActivity.F6;
        if (gs8Var == null || gs8Var.c == (p1 = aob.p1(1.4f, aob.a(-0.02f, 0.15f, f)))) {
            return;
        }
        gs8Var.c = p1;
        gs8Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.V0;
        profileActivity.l2();
        jva jvaVar = profileActivity.T;
        if (jvaVar != null) {
            jvaVar.setTranslationX(f - profileActivity.l2());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.V0;
        if (profileActivity.T != null) {
            hl.L(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        jva jvaVar = profileActivity.T;
        if (jvaVar != null) {
            jvaVar.setTranslationY(f - hl.L(5.0f));
        }
    }
}

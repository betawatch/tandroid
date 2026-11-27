// default package

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fr8 implements ibb {
    public final /* synthetic */ ProfileActivity a;

    public fr8(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // ibb
    public final mbb b(long j) {
        ProfileActivity profileActivity = this.a;
        if (j != profileActivity.a()) {
            return null;
        }
        profileActivity.f0.setRoundRadiusForExpand((int) hl.R1(profileActivity.m2(), 0.0f, profileActivity.l2));
        iq8 iq8Var = profileActivity.f0;
        boolean c0 = xc2.c0(profileActivity.F2);
        if (iq8Var == null || iq8Var.getRootView() == null) {
            return null;
        }
        float scaleX = ((View) iq8Var.getParent()).getScaleX();
        float f = iq8Var.getImageReceiver().N0 * scaleX;
        float f2 = c0 ? 0.32f * f : f;
        kbb kbbVar = new kbb(iq8Var, (byte) 0);
        float[] fArr = new float[2];
        iq8Var.getRootView().getLocationOnScreen(new int[2]);
        hl.p1(iq8Var, (ViewGroup) iq8Var.getRootView(), fArr);
        float f3 = (iq8Var.getImageReceiver().L0 * scaleX) + r4[0] + fArr[0];
        float f4 = (iq8Var.getImageReceiver().M0 * scaleX) + r4[1] + fArr[1];
        kbbVar.c.set(f3, f4, f3 + f, f + f4);
        kbbVar.e = iq8Var.getImageReceiver();
        kbbVar.b = f2;
        return kbbVar;
    }

    @Override // ibb
    public final void c(long j, pqa pqaVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.N2());
        if (j == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.g1(0, profileActivity.d2() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new y56(profileActivity, (byte) 15));
        }
        hl.d3(pqaVar, 30L);
    }
}

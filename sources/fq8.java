// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fq8 extends v79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ fq8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        View m;
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    hl.t1(profileActivity.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            default:
                if (i == 1) {
                    hl.t1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i != 2) {
                    profileActivity.G0 = false;
                }
                if (i == 0 && !profileActivity.G1 && (m = profileActivity.c.m(0)) != null) {
                    profileActivity.A3(m, 0.0f);
                }
                sla slaVar = profileActivity.U0;
                if (slaVar != null) {
                    boolean z = i != 0;
                    profileActivity.z1 = z;
                    slaVar.setEnabled((z || profileActivity.q2) ? false : true);
                }
                gr8 gr8Var = profileActivity.O;
                boolean z2 = profileActivity.a.J1;
                gr8Var.getClass();
                break;
        }
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                kg5 kg5Var = profileActivity.X;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                profileActivity.G1();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.M0() > profileActivity.y4 - 8) {
                    profileActivity.a2(false);
                }
                gr8 gr8Var = profileActivity.O;
                gr8Var.setPinnedToTop(gr8Var.getY() <= 0.0f);
                profileActivity.J3();
                break;
        }
    }
}

// default package

import android.view.View;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class kr8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wr8 b;

    public /* synthetic */ kr8(wr8 wr8Var, byte b) {
        this.a = b;
        this.b = wr8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        wr8 wr8Var = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = wr8Var.e;
                profileActivity.getMessagesController().G3(profileActivity, profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1)), null, profileActivity.getClassGuid(), null, false, false);
                break;
            default:
                ProfileActivity profileActivity2 = wr8Var.e;
                profileActivity2.S4 = !profileActivity2.S4;
                if (!profileActivity2.R4) {
                    profileActivity2.R4 = true;
                }
                profileActivity2.j3();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i = profileActivity2.r6;
                if (i >= 0) {
                    profileActivity2.c.g1(i, profileActivity2.s6 - profileActivity2.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}

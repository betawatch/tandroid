// default package

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ev8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ev8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                profileActivity.k3(true);
                break;
            default:
                gr8 gr8Var = profileActivity.O;
                if (gr8Var != null) {
                    gr8Var.f1(14);
                    profileActivity.k3(false);
                    break;
                }
                break;
        }
    }
}

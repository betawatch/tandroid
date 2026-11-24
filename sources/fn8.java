// default package

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fn8 extends kx9 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn8(ProfileActivity profileActivity, en8 en8Var) {
        super(en8Var);
        this.e = profileActivity;
    }

    @Override // kx9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.T5 = null;
    }
}

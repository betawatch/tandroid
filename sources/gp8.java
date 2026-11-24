// default package

import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gp8 extends mz9 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp8(ProfileActivity profileActivity, fp8 fp8Var) {
        super(fp8Var);
        this.e = profileActivity;
    }

    @Override // mz9, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Y5 = null;
    }
}

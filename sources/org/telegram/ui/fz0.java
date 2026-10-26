package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fz0 extends t51 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(ProfileActivity profileActivity, ez0 ez0Var) {
        super(ez0Var);
        this.e = profileActivity;
    }

    @Override // org.telegram.ui.t51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.H5 = null;
    }
}

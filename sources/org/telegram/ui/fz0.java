package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fz0 extends i61 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0(ProfileActivity profileActivity, ez0 ez0Var) {
        super(ez0Var);
        this.e = profileActivity;
    }

    @Override // org.telegram.ui.i61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.y5 = null;
    }
}

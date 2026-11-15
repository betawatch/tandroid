package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fv0 extends e11 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv0(ProfileActivity profileActivity, ev0 ev0Var) {
        super(ev0Var);
        this.e = profileActivity;
    }

    @Override // org.telegram.ui.e11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.R5 = null;
    }
}

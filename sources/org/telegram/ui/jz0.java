package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jz0 extends n61 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(ProfileActivity profileActivity, iz0 iz0Var) {
        super(iz0Var);
        this.e = profileActivity;
    }

    @Override // org.telegram.ui.n61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.y5 = null;
    }
}

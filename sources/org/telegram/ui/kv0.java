package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kv0 extends k11 {
    public final /* synthetic */ ProfileActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv0(ProfileActivity profileActivity, jv0 jv0Var) {
        super(jv0Var);
        this.e = profileActivity;
    }

    @Override // org.telegram.ui.k11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.P5 = null;
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mc extends z61 {
    public final /* synthetic */ cd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(cd cdVar, lc lcVar) {
        super(lcVar);
        this.e = cdVar;
    }

    @Override // org.telegram.ui.z61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}

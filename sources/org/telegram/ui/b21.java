package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class b21 extends s51 {
    public final /* synthetic */ d21 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b21(d21 d21Var, a21 a21Var) {
        super(a21Var);
        this.e = d21Var;
    }

    @Override // org.telegram.ui.s51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}

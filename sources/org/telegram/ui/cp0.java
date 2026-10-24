package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class cp0 extends s51 {
    public final /* synthetic */ fp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(fp0 fp0Var, bp0 bp0Var) {
        super(bp0Var);
        this.e = fp0Var;
    }

    @Override // org.telegram.ui.s51, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}

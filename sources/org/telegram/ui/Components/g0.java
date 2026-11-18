package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g0 extends org.telegram.ui.i11 {
    public final /* synthetic */ h0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, f0 f0Var) {
        super(f0Var);
        this.e = h0Var;
    }

    @Override // org.telegram.ui.i11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.e2 = null;
    }
}

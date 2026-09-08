package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class lc extends a71 {
    public final /* synthetic */ bd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(bd bdVar, kc kcVar) {
        super(kcVar);
        this.e = bdVar;
    }

    @Override // org.telegram.ui.a71, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}

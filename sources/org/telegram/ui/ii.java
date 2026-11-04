package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ii extends org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ wm o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(wm wmVar, gi giVar) {
        super(giVar, -2, -2);
        this.o = wmVar;
    }

    @Override // org.telegram.ui.ActionBar.f1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wm wmVar = this.o;
        if (wmVar.f9 != this) {
            return;
        }
        wmVar.f9 = null;
        wmVar.i9 = null;
        wmVar.h9 = null;
        wmVar.C0.R = true;
        if (wmVar.g9) {
            wmVar.v8(false, true, 0.0f);
        } else {
            wmVar.g9 = true;
        }
        mj mjVar = wmVar.a0;
        if (mjVar == null || mjVar.getEditField() == null) {
            return;
        }
        wmVar.a0.getEditField().setAllowDrawCursor(true);
    }
}

package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bc extends j11 {
    public final /* synthetic */ rc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(rc rcVar, ac acVar) {
        super(acVar);
        this.e = rcVar;
    }

    @Override // org.telegram.ui.j11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}

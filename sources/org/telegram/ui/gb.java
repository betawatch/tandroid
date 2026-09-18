package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gb extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ wb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(wb wbVar, fb fbVar) {
        super(fbVar, -2, -2);
        this.o = wbVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wb wbVar = this.o;
        if (wbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.oc.e();
        wbVar.F0 = null;
    }
}

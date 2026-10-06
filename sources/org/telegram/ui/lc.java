package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class lc extends r61 {
    public final /* synthetic */ cd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(cd cdVar, kc kcVar) {
        super(kcVar);
        this.e = cdVar;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.Q = null;
    }
}

package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class iq extends org.telegram.ui.Components.e10 {
    public final /* synthetic */ qq j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(qq qqVar, Activity activity, qq qqVar2) {
        super(activity, qqVar2);
        this.j1 = qqVar;
    }

    @Override // org.telegram.ui.Components.e10
    public final void J0() {
        qq qqVar = this.j1;
        qqVar.getMessagesController().S(qqVar.getParentActivity(), qqVar.n, qqVar, new w0(this, 27));
    }

    @Override // org.telegram.ui.Components.e10
    public final void I0() {
    }
}

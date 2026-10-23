package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class mk extends org.telegram.ui.Components.ml0 {
    public final /* synthetic */ qn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(qn qnVar, nj njVar, qj qjVar) {
        super(njVar, qjVar);
        this.l = qnVar;
    }

    public final void e(int i10) {
        if (this.l.Qa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}

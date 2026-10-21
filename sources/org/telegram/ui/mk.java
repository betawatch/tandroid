package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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

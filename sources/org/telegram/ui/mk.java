package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class mk extends org.telegram.ui.Components.ll0 {
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

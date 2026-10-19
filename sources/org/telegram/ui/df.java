package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ df(qn qnVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn.Y(this.b, this.c, this.d);
                break;
            default:
                qn.X(this.b, this.c, this.d);
                break;
        }
    }
}

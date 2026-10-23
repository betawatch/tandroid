package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nu0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ wr0(nu0 nu0Var, int i10, int i11) {
        this.a = i11;
        this.b = nu0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.h.scrollBy(0, this.c);
                break;
            default:
                this.b.h.scrollBy(0, this.c);
                break;
        }
    }
}

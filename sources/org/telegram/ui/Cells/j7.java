package org.telegram.ui.Cells;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;

    public /* synthetic */ j7(m7 m7Var, int i10) {
        this.a = i10;
        this.b = m7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m7 m7Var = this.b;
                m7Var.post(new j7(m7Var, 1));
                break;
            default:
                m7 m7Var2 = this.b;
                m7Var2.b0.isSpoilersRevealed = true;
                m7Var2.H.clear();
                m7Var2.I.clear();
                m7Var2.J.clear();
                m7Var2.invalidate();
                break;
        }
    }
}

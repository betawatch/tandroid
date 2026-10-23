package ai;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                b1Var.getClass();
                b1Var.V(ag.a.i(0L, i10 == 0 ? ag.b.a : ag.b.b), true, false, true);
                b1Var.d0.setText("");
                break;
            case 1:
                h1 h1Var = (h1) this.b;
                h1Var.getClass();
                h1Var.s(ag.a.i(0L, i10 == 0 ? ag.b.a : ag.b.b), true, false, true);
                h1Var.h.setText("");
                break;
            default:
                l6 l6Var = (l6) this.b;
                l6Var.getClass();
                l6Var.q = i10 == 0 ? ag.b.a : ag.b.b;
                l6Var.a(true);
                break;
        }
    }
}

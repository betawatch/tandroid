package ai;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                b1Var.V(ag.a.i(0L, i10 == 0 ? ag.c.a : ag.c.b), true, false, true);
                b1Var.d0.setText("");
                break;
            case 1:
                h1 h1Var = (h1) this.b;
                h1Var.getClass();
                h1Var.r(ag.a.i(0L, i10 == 0 ? ag.c.a : ag.c.b), true, false, true);
                h1Var.h.setText("");
                break;
            default:
                k6 k6Var = (k6) this.b;
                k6Var.getClass();
                k6Var.q = i10 == 0 ? ag.c.a : ag.c.b;
                k6Var.a(true);
                break;
        }
    }
}

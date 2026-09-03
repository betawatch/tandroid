package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ s1(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                d2 d2Var = this.b;
                if (!d2Var.isShowing()) {
                    try {
                        d2Var.show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}

package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wc0 b;

    public /* synthetic */ vc0(wc0 wc0Var, int i10) {
        this.a = i10;
        this.b = wc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.y();
                break;
            default:
                this.b.m(true);
                break;
        }
    }
}

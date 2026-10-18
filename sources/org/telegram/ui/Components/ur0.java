package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lu0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ur0(lu0 lu0Var, int i10, int i11) {
        this.a = i11;
        this.b = lu0Var;
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

package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class jd0 implements Runnable {
    public boolean a;
    public final /* synthetic */ od0 b;

    public jd0(od0 od0Var) {
        this.b = od0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        od0 od0Var = this.b;
        od0Var.a(z10);
        od0Var.postDelayed(this, od0Var.L);
    }
}

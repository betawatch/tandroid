package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.u b;

    public /* synthetic */ f11(bi.u uVar, int i7) {
        this.a = i7;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.I3(((j01) this.b.f2).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}

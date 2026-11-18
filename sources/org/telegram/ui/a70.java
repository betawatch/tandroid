package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o60 b;

    public /* synthetic */ a70(o60 o60Var, int i7) {
        this.a = i7;
        this.b = o60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        o60 o60Var = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    o60Var.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    o60Var.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    o60Var.run();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
        }
    }
}

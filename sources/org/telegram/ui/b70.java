package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s10 b;

    public /* synthetic */ b70(s10 s10Var, int i7) {
        this.a = i7;
        this.b = s10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        s10 s10Var = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                try {
                    s10Var.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.B1;
                try {
                    s10Var.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.B1;
                try {
                    s10Var.run();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
        }
    }
}

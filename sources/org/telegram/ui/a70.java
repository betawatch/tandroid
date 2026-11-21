package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h60 b;

    public /* synthetic */ a70(h60 h60Var, int i7) {
        this.a = i7;
        this.b = h60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        h60 h60Var = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    h60Var.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    h60Var.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    h60Var.run();
                    break;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
        }
    }
}

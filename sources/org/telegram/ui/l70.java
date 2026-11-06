package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ l70(zh.r3 r3Var, int i7) {
        this.a = i7;
        this.b = r3Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        Runnable runnable = this.b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                String str2 = LaunchActivity.B1;
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (runnable != null && "paid".equals(str)) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}

package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ x3(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean z10 = this.b;
        switch (i10) {
            case 0:
                FingerprintController.generateNewKey(z10);
                break;
            case 1:
                FingerprintController.lambda$generateNewKey$0(z10);
                break;
            case 2:
                LiteMode.lambda$onPowerSaverApplied$0(z10);
                break;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewTheme, Boolean.FALSE, Boolean.valueOf(z10));
                break;
        }
    }
}

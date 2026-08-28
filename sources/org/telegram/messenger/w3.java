package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ w3(int i9, boolean z10) {
        this.a = i9;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        boolean z10 = this.b;
        switch (i9) {
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

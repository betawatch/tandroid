package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ y3(int i10, boolean z10) {
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

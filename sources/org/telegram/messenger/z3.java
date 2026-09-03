package org.telegram.messenger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ z3(int i10, boolean z4) {
        this.a = i10;
        this.b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean z4 = this.b;
        switch (i10) {
            case 0:
                FingerprintController.generateNewKey(z4);
                break;
            case 1:
                FingerprintController.lambda$generateNewKey$0(z4);
                break;
            case 2:
                LiteMode.lambda$onPowerSaverApplied$0(z4);
                break;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewTheme, Boolean.FALSE, Boolean.valueOf(z4));
                break;
        }
    }
}

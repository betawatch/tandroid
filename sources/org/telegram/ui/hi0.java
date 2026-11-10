package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PasscodeActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hi0(PasscodeActivity passcodeActivity, boolean z9, int i7) {
        this.a = i7;
        this.b = passcodeActivity;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PasscodeActivity passcodeActivity = this.b;
                passcodeActivity.getMediaDataController().m();
                if (this.c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    o90 o90Var = passcodeActivity.U;
                    if (o90Var != null) {
                        org.telegram.messenger.g0.h3(o90Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.qs.e().k(50, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.b;
                passcodeActivity2.x.e(true, this.c);
                org.telegram.messenger.g0.r(passcodeActivity2.T);
                break;
        }
    }
}

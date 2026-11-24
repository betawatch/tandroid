// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class n25 extends PasscodeActivity {
    public final /* synthetic */ boolean[] X;
    public final /* synthetic */ qac Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n25(boolean[] zArr, qac qacVar) {
        super(3);
        this.X = zArr;
        this.Y = qacVar;
    }

    @Override // org.telegram.ui.PasscodeActivity, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.X[0]) {
            return;
        }
        this.Y.a("PASSCODE_FAILED");
    }
}

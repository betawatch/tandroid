// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class n05 extends PasscodeActivity {
    public final /* synthetic */ boolean[] X;
    public final /* synthetic */ p8c Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n05(boolean[] zArr, p8c p8cVar) {
        super(3);
        this.X = zArr;
        this.Y = p8cVar;
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

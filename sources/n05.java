// default package

import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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

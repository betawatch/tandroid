// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ju0 extends cj3 {
    public final /* synthetic */ boolean[] G4;
    public final /* synthetic */ ev0 H4;
    public final /* synthetic */ hv0 I4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju0(hv0 hv0Var, Bundle bundle, boolean[] zArr, ev0 ev0Var) {
        super(bundle);
        this.I4 = hv0Var;
        this.G4 = zArr;
        this.H4 = ev0Var;
    }

    @Override // cj3, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.G4;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        try {
            jSONObject = new JSONObject();
        } catch (Exception unused) {
            jSONObject = null;
        }
        this.I4.u(this.H4, "requested_chat_failed", jSONObject);
    }
}

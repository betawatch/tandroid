// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o8 implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u8 b;

    public /* synthetic */ o8(u8 u8Var, byte b) {
        this.a = b;
        this.b = u8Var;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        u8 u8Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    u8Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                mf6 mf6Var = new mf6();
                mf6Var.G = (byte) 2;
                u8Var.presentFragment(mf6Var, true);
                break;
        }
    }
}

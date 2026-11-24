// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dg implements ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ d c;

    public /* synthetic */ dg(byte b, String str, d dVar) {
        this.a = b;
        this.b = str;
        this.c = dVar;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        d dVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", qu2.r(dVar.getCurrentAccount()).s(1));
                    dVar.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                try {
                    dVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
        }
    }
}

// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dh implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ d c;

    public /* synthetic */ dh(byte b, String str, d dVar) {
        this.a = b;
        this.b = str;
        this.c = dVar;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        d dVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", bw2.r(dVar.getCurrentAccount()).s(1));
                    dVar.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                try {
                    dVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
        }
    }
}

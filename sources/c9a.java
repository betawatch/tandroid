// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class c9a implements ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ c9a(SessionsActivity sessionsActivity, byte b) {
        this.a = b;
        this.b = sessionsActivity;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        SessionsActivity sessionsActivity = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                sessionsActivity.j0();
                break;
        }
    }
}

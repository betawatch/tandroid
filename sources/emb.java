// default package

import android.content.Intent;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class emb implements c59, ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ emb(ThemeActivity themeActivity, byte b) {
        this.a = b;
        this.b = themeActivity;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        ThemeActivity themeActivity = this.b;
        switch (b) {
            case 1:
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                ik.T(themeActivity, 0, null, null);
                break;
        }
    }

    @Override // c59
    public final int run() {
        return this.b.A0();
    }
}

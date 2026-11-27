// default package

import android.content.Intent;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class job implements o69, fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ job(ThemeActivity themeActivity, byte b) {
        this.a = b;
        this.b = themeActivity;
    }

    @Override // o69
    public final int run() {
        return this.b.A0();
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        ThemeActivity themeActivity = this.b;
        switch (b) {
            case 1:
                jj.T(themeActivity, 0, null, null);
                break;
            default:
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}

// default package

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ekb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ ekb(ThemeActivity themeActivity, byte b) {
        this.a = b;
        this.b = themeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        ThemeActivity themeActivity = this.b;
        switch (b) {
            case 0:
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(a.b, Locale.getDefault()).getFromLocation(bkb.x, bkb.y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                gl.c3(new a5b(themeActivity, str, (byte) 8));
                break;
            default:
                themeActivity.b.f1(new dkb(themeActivity, b2), 700, true);
                break;
        }
    }
}

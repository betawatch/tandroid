// default package

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fmb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ fmb(ThemeActivity themeActivity, byte b) {
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
                    List<Address> fromLocation = new Geocoder(a.b, Locale.getDefault()).getFromLocation(cmb.x, cmb.y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                gm.c3(new b7b(themeActivity, str, (byte) 10));
                break;
            default:
                themeActivity.b.f1(new emb(themeActivity, b2), 700, true);
                break;
        }
    }
}

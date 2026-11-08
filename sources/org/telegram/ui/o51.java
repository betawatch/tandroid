package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ o51(ThemeActivity themeActivity, int i7) {
        this.a = i7;
        this.b = themeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ThemeActivity themeActivity = this.b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.k6.x, org.telegram.ui.ActionBar.k6.y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new by0(13, themeActivity, str));
                break;
            default:
                ThemeActivity themeActivity2 = this.b;
                themeActivity2.b.e1(new n51(themeActivity2, 0), 700, true);
                break;
        }
    }
}

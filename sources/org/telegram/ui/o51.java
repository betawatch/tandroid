package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.n6.x, org.telegram.ui.ActionBar.n6.y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new b31(5, themeActivity, str));
                break;
            default:
                ThemeActivity themeActivity2 = this.b;
                themeActivity2.b.e1(new n51(themeActivity2, 0), 700, true);
                break;
        }
    }
}

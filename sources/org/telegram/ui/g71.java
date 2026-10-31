package org.telegram.ui;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThemeActivity b;

    public /* synthetic */ g71(ThemeActivity themeActivity, int i10) {
        this.a = i10;
        this.b = themeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ThemeActivity themeActivity = this.b;
                String str = null;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.w0.b, Locale.getDefault()).getFromLocation(org.telegram.ui.ActionBar.t6.x, org.telegram.ui.ActionBar.t6.y, 1);
                    if (fromLocation.size() > 0) {
                        str = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new t11(6, themeActivity, str));
                break;
            default:
                ThemeActivity themeActivity2 = this.b;
                themeActivity2.b.e1(new f71(themeActivity2, 0), 700, true);
                break;
        }
    }
}

package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.ui.Components.xk;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ t7(FrameLayout frameLayout, double d, double d9, int i9) {
        this.a = i9;
        this.b = frameLayout;
        this.c = d;
        this.d = d9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u7 u7Var = (u7) this.b;
                double d = this.c;
                double d9 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d9, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d9, d);
                        u7Var.E = detectOcean;
                        if (detectOcean == null) {
                            u7Var.E = "";
                        } else {
                            u7Var.E = "🌊 " + ((Object) u7Var.E);
                        }
                    } else {
                        Address address = fromLocation.get(0);
                        StringBuilder sb2 = new StringBuilder();
                        HashSet hashSet = new HashSet();
                        hashSet.add(address.getSubAdminArea());
                        hashSet.add(address.getAdminArea());
                        hashSet.add(address.getLocality());
                        hashSet.add(address.getCountryName());
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (!TextUtils.isEmpty(str)) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(str);
                            }
                        }
                        u7Var.E = sb2.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            u7Var.E = countryCodeToEmoji + " " + ((Object) u7Var.E);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new t7(u7Var, d, d9, 1));
                break;
            case 1:
                u7 u7Var2 = (u7) this.b;
                double d10 = this.c;
                double d11 = this.d;
                u7Var2.B = d10;
                u7Var2.C = d11;
                u7Var2.A = false;
                CharSequence charSequence = u7Var2.E;
                org.telegram.ui.ActionBar.h5 h5Var = u7Var2.b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, h5Var.getPaint().getFontMetricsInt(), false);
                u7Var2.E = replaceEmoji;
                h5Var.l(replaceEmoji, false);
                break;
            default:
                ((xk) this.b).a0(this.c, this.d);
                break;
        }
    }
}

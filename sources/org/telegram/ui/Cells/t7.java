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
import org.telegram.ui.Components.al;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ t7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = d;
        this.d = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u7 u7Var = (u7) this.b;
                double d = this.c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d10, d);
                        u7Var.F = detectOcean;
                        if (detectOcean == null) {
                            u7Var.F = "";
                        } else {
                            u7Var.F = "🌊 " + ((Object) u7Var.F);
                        }
                    } else {
                        Address address = fromLocation.get(0);
                        StringBuilder sb = new StringBuilder();
                        HashSet hashSet = new HashSet();
                        hashSet.add(address.getSubAdminArea());
                        hashSet.add(address.getAdminArea());
                        hashSet.add(address.getLocality());
                        hashSet.add(address.getCountryName());
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (!TextUtils.isEmpty(str)) {
                                if (sb.length() > 0) {
                                    sb.append(", ");
                                }
                                sb.append(str);
                            }
                        }
                        u7Var.F = sb.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            u7Var.F = countryCodeToEmoji + " " + ((Object) u7Var.F);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new t7(u7Var, d, d10, 1));
                break;
            case 1:
                u7 u7Var2 = (u7) this.b;
                double d11 = this.c;
                double d12 = this.d;
                u7Var2.C = d11;
                u7Var2.D = d12;
                u7Var2.B = false;
                CharSequence charSequence = u7Var2.F;
                org.telegram.ui.ActionBar.k5 k5Var = u7Var2.b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, k5Var.getPaint().getFontMetricsInt(), false);
                u7Var2.F = replaceEmoji;
                k5Var.l(replaceEmoji, false);
                break;
            default:
                ((al) this.b).b0(this.c, this.d);
                break;
        }
    }
}

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
import org.telegram.ui.Components.bl;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ r7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = d;
        this.d = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) this.b;
                double d = this.c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d10, d);
                        s7Var.E = detectOcean;
                        if (detectOcean == null) {
                            s7Var.E = "";
                        } else {
                            s7Var.E = "🌊 " + ((Object) s7Var.E);
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
                        s7Var.E = sb2.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            s7Var.E = countryCodeToEmoji + " " + ((Object) s7Var.E);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new r7(s7Var, d, d10, 1));
                break;
            case 1:
                s7 s7Var2 = (s7) this.b;
                double d11 = this.c;
                double d12 = this.d;
                s7Var2.B = d11;
                s7Var2.C = d12;
                s7Var2.A = false;
                CharSequence charSequence = s7Var2.E;
                org.telegram.ui.ActionBar.h5 h5Var = s7Var2.b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, h5Var.getPaint().getFontMetricsInt(), false);
                s7Var2.E = replaceEmoji;
                h5Var.l(replaceEmoji, false);
                break;
            default:
                ((bl) this.b).b0(this.c, this.d);
                break;
        }
    }
}

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
import org.telegram.ui.Components.gl;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ v7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = d;
        this.d = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w7 w7Var = (w7) this.b;
                double d = this.c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String detectOcean = LocationController.detectOcean(d10, d);
                        w7Var.I = detectOcean;
                        if (detectOcean == null) {
                            w7Var.I = "";
                        } else {
                            w7Var.I = "🌊 " + ((Object) w7Var.I);
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
                        w7Var.I = sb2.toString();
                        String countryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (countryCodeToEmoji != null && Emoji.getEmojiDrawable(countryCodeToEmoji) != null) {
                            w7Var.I = countryCodeToEmoji + " " + ((Object) w7Var.I);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new v7(w7Var, d, d10, 1));
                break;
            case 1:
                w7 w7Var2 = (w7) this.b;
                double d11 = this.c;
                double d12 = this.d;
                w7Var2.F = d11;
                w7Var2.G = d12;
                w7Var2.E = false;
                CharSequence charSequence = w7Var2.I;
                org.telegram.ui.ActionBar.j5 j5Var = w7Var2.b;
                CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence, j5Var.getPaint().getFontMetricsInt(), false);
                w7Var2.I = replaceEmoji;
                j5Var.l(replaceEmoji, false);
                break;
            default:
                ((gl) this.b).b0(this.c, this.d);
                break;
        }
    }
}

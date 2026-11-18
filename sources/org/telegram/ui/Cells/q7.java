package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.messenger.qd;
import org.telegram.ui.Components.kl;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ q7(FrameLayout frameLayout, double d, double d2, int i7) {
        this.a = i7;
        this.b = frameLayout;
        this.c = d;
        this.d = d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.b;
                double d = this.c;
                double d2 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.b, gd.E0().y).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String c10 = qd.c(d2, d);
                        r7Var.L = c10;
                        if (c10 == null) {
                            r7Var.L = "";
                        } else {
                            r7Var.L = "🌊 " + ((Object) r7Var.L);
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
                        r7Var.L = sb2.toString();
                        String b10 = qd.b(address.getCountryCode());
                        if (b10 != null && org.telegram.messenger.j6.g(b10) != null) {
                            r7Var.L = b10 + " " + ((Object) r7Var.L);
                        }
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new q7(r7Var, d, d2, 1));
                break;
            case 1:
                r7 r7Var2 = (r7) this.b;
                double d10 = this.c;
                double d11 = this.d;
                r7Var2.I = d10;
                r7Var2.J = d11;
                r7Var2.H = false;
                CharSequence charSequence = r7Var2.L;
                org.telegram.ui.ActionBar.n5 n5Var = r7Var2.d;
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
                r7Var2.L = m10;
                n5Var.l(m10, false);
                break;
            default:
                ((kl) this.b).h0(this.c, this.d);
                break;
        }
    }
}

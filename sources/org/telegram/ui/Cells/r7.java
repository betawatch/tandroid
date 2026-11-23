package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.rd;
import org.telegram.ui.Components.ml;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ r7(FrameLayout frameLayout, double d, double d2, int i7) {
        this.a = i7;
        this.b = frameLayout;
        this.c = d;
        this.d = d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s7 s7Var = (s7) this.b;
                double d = this.c;
                double d2 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.b, hd.E0().y).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String c10 = rd.c(d2, d);
                        s7Var.L = c10;
                        if (c10 == null) {
                            s7Var.L = "";
                        } else {
                            s7Var.L = "🌊 " + ((Object) s7Var.L);
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
                        s7Var.L = sb2.toString();
                        String b10 = rd.b(address.getCountryCode());
                        if (b10 != null && org.telegram.messenger.j6.g(b10) != null) {
                            s7Var.L = b10 + " " + ((Object) s7Var.L);
                        }
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new r7(s7Var, d, d2, 1));
                break;
            case 1:
                s7 s7Var2 = (s7) this.b;
                double d10 = this.c;
                double d11 = this.d;
                s7Var2.I = d10;
                s7Var2.J = d11;
                s7Var2.H = false;
                CharSequence charSequence = s7Var2.L;
                org.telegram.ui.ActionBar.m5 m5Var = s7Var2.d;
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence, m5Var.getPaint().getFontMetricsInt(), false, null, 0);
                s7Var2.L = m10;
                m5Var.l(m10, false);
                break;
            default:
                ((ml) this.b).h0(this.c, this.d);
                break;
        }
    }
}

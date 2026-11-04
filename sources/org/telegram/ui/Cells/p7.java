package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.ld;
import org.telegram.ui.Components.uk;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ p7(FrameLayout frameLayout, double d, double d10, int i3) {
        this.a = i3;
        this.b = frameLayout;
        this.c = d;
        this.d = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q7 q7Var = (q7) this.b;
                double d = this.c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.b, bd.E0().y).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String c2 = ld.c(d10, d);
                        q7Var.L = c2;
                        if (c2 == null) {
                            q7Var.L = "";
                        } else {
                            q7Var.L = "🌊 " + ((Object) q7Var.L);
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
                        q7Var.L = sb2.toString();
                        String b10 = ld.b(address.getCountryCode());
                        if (b10 != null && org.telegram.messenger.i6.g(b10) != null) {
                            q7Var.L = b10 + " " + ((Object) q7Var.L);
                        }
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new p7(q7Var, d, d10, 1));
                break;
            case 1:
                q7 q7Var2 = (q7) this.b;
                double d11 = this.c;
                double d12 = this.d;
                q7Var2.I = d11;
                q7Var2.J = d12;
                q7Var2.H = false;
                CharSequence charSequence = q7Var2.L;
                org.telegram.ui.ActionBar.k5 k5Var = q7Var2.d;
                CharSequence m10 = org.telegram.messenger.i6.m(charSequence, k5Var.getPaint().getFontMetricsInt(), false, null, 0);
                q7Var2.L = m10;
                k5Var.l(m10, false);
                break;
            default:
                ((uk) this.b).h0(this.c, this.d);
                break;
        }
    }
}

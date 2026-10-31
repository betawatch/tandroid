package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.nd;
import org.telegram.ui.Components.bl;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ u7(FrameLayout frameLayout, double d, double d10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = d;
        this.d = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v7 v7Var = (v7) this.b;
                double d = this.c;
                double d10 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.w0.b, cd.D0().y).getFromLocation(d, d10, 1);
                    if (fromLocation.isEmpty()) {
                        String c10 = nd.c(d10, d);
                        v7Var.K = c10;
                        if (c10 == null) {
                            v7Var.K = "";
                        } else {
                            v7Var.K = "🌊 " + ((Object) v7Var.K);
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
                        v7Var.K = sb2.toString();
                        String b10 = nd.b(address.getCountryCode());
                        if (b10 != null && org.telegram.messenger.k6.g(b10) != null) {
                            v7Var.K = b10 + " " + ((Object) v7Var.K);
                        }
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new u7(v7Var, d, d10, 1));
                break;
            case 1:
                v7 v7Var2 = (v7) this.b;
                double d11 = this.c;
                double d12 = this.d;
                v7Var2.H = d11;
                v7Var2.I = d12;
                v7Var2.G = false;
                CharSequence charSequence = v7Var2.K;
                org.telegram.ui.ActionBar.u5 u5Var = v7Var2.d;
                CharSequence m10 = org.telegram.messenger.k6.m(charSequence, u5Var.getPaint().getFontMetricsInt(), false, null, 0);
                v7Var2.K = m10;
                u5Var.l(m10, false);
                break;
            default:
                ((bl) this.b).e0(this.c, this.d);
                break;
        }
    }
}

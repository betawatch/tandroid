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
import org.telegram.ui.Components.dl;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ p7(FrameLayout frameLayout, double d, double d2, int i7) {
        this.a = i7;
        this.b = frameLayout;
        this.c = d;
        this.d = d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q7 q7Var = (q7) this.b;
                double d = this.c;
                double d2 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(org.telegram.messenger.t0.b, hd.E0().y).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String c10 = rd.c(d2, d);
                        q7Var.L = c10;
                        if (c10 == null) {
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
                        String b10 = rd.b(address.getCountryCode());
                        if (b10 != null && org.telegram.messenger.j6.g(b10) != null) {
                            q7Var.L = b10 + " " + ((Object) q7Var.L);
                        }
                    }
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new p7(q7Var, d, d2, 1));
                break;
            case 1:
                q7 q7Var2 = (q7) this.b;
                double d10 = this.c;
                double d11 = this.d;
                q7Var2.I = d10;
                q7Var2.J = d11;
                q7Var2.H = false;
                CharSequence charSequence = q7Var2.L;
                org.telegram.ui.ActionBar.j5 j5Var = q7Var2.d;
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence, j5Var.getPaint().getFontMetricsInt(), false, null, 0);
                q7Var2.L = m10;
                j5Var.l(m10, false);
                break;
            default:
                ((dl) this.b).h0(this.c, this.d);
                break;
        }
    }
}

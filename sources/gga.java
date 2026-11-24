// default package

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gga implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ gga(FrameLayout frameLayout, double d, double d2, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.c = d;
        this.d = d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hga hgaVar = (hga) this.b;
                double d = this.c;
                double d2 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(a.b, k96.D0().y).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String c = eb6.c(d2, d);
                        hgaVar.L = c;
                        if (c == null) {
                            hgaVar.L = "";
                        } else {
                            hgaVar.L = "🌊 " + ((Object) hgaVar.L);
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
                        hgaVar.L = sb.toString();
                        String b = eb6.b(address.getCountryCode());
                        if (b != null && vu3.g(b) != null) {
                            hgaVar.L = b + " " + ((Object) hgaVar.L);
                        }
                    }
                } catch (Exception unused) {
                }
                gl.d3(new gga(hgaVar, d, d2, (byte) 1));
                break;
            case 1:
                hga hgaVar2 = (hga) this.b;
                double d3 = this.c;
                double d4 = this.d;
                hgaVar2.I = d3;
                hgaVar2.J = d4;
                hgaVar2.H = false;
                CharSequence charSequence = hgaVar2.L;
                jia jiaVar = hgaVar2.d;
                CharSequence m = vu3.m(charSequence, jiaVar.getPaint().getFontMetricsInt(), false, null, 0);
                hgaVar2.L = m;
                jiaVar.l(m, false);
                break;
            default:
                ((c42) this.b).g0(this.c, this.d);
                break;
        }
    }
}

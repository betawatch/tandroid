package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h0 {
    public int c;
    public final ArrayList a = new ArrayList();
    public String b = "";
    public boolean d = true;

    public final String a(boolean z10) {
        int indexOf = this.b.indexOf(58);
        if (indexOf < 0) {
            return "";
        }
        String substring = this.b.substring(0, indexOf);
        if (this.c == 20) {
            String[] split = substring.substring(2).split(";");
            return z10 ? split[0] : split.length > 1 ? split[split.length - 1] : "";
        }
        String[] split2 = substring.split(";");
        for (int i10 = 0; i10 < split2.length; i10++) {
            if (split2[i10].indexOf(61) < 0) {
                substring = split2[i10];
            }
        }
        return substring;
    }

    public final String[] b() {
        byte[] H;
        int indexOf = this.b.indexOf(58);
        if (indexOf < 0) {
            return new String[0];
        }
        String substring = this.b.substring(0, indexOf);
        String substring2 = this.b.substring(indexOf + 1);
        String str = null;
        String str2 = "UTF-8";
        for (String str3 : substring.split(";")) {
            String[] split = str3.split("=");
            if (split.length == 2) {
                if (split[0].equals("CHARSET")) {
                    str2 = split[1];
                } else if (split[0].equals("ENCODING")) {
                    str = split[1];
                }
            }
        }
        String[] split2 = substring2.split(";");
        for (int i10 = 0; i10 < split2.length; i10++) {
            if (!TextUtils.isEmpty(split2[i10]) && str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = i0.H(i0.h1(split2[i10]))) != null && H.length != 0) {
                try {
                    split2[i10] = new String(H, str2);
                } catch (Exception unused) {
                }
            }
        }
        return split2;
    }

    public final String c(boolean z10) {
        byte[] H;
        StringBuilder sb2 = new StringBuilder();
        int indexOf = this.b.indexOf(58);
        if (indexOf < 0) {
            return "";
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        String substring = this.b.substring(0, indexOf);
        String substring2 = this.b.substring(indexOf + 1);
        String str = null;
        String str2 = "UTF-8";
        for (String str3 : substring.split(";")) {
            String[] split = str3.split("=");
            if (split.length == 2) {
                if (split[0].equals("CHARSET")) {
                    str2 = split[1];
                } else if (split[0].equals("ENCODING")) {
                    str = split[1];
                }
            }
        }
        String[] split2 = substring2.split(";");
        boolean z11 = false;
        for (int i10 = 0; i10 < split2.length; i10++) {
            if (!TextUtils.isEmpty(split2[i10])) {
                if (str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = i0.H(i0.h1(split2[i10]))) != null && H.length != 0) {
                    try {
                        split2[i10] = new String(H, str2);
                    } catch (Exception unused) {
                    }
                }
                if (z11 && sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(split2[i10]);
                if (!z11) {
                    z11 = split2[i10].length() > 0;
                }
            }
        }
        if (z10) {
            int i11 = this.c;
            if (i11 == 0) {
                return af.b.c().b(sb2.toString());
            }
            if (i11 == 5) {
                String[] split3 = sb2.toString().split("T");
                if (split3.length > 0) {
                    String[] split4 = split3[0].split("-");
                    if (split4.length == 3) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(1, Utilities.z(split4[0]).intValue());
                        calendar.set(2, Utilities.z(split4[1]).intValue() - 1);
                        calendar.set(5, Utilities.z(split4[2]).intValue());
                        return cd.D0().C0().format(calendar.getTime());
                    }
                }
            }
        }
        return sb2.toString();
    }
}

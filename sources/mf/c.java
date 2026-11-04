package mf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public int a;
    public int b;
    public int c;
    public int d;
    public String e;

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(20);
        boolean z10 = false;
        int i3 = 0;
        boolean z11 = false;
        boolean z12 = false;
        for (int i10 = 0; i10 < this.e.length(); i10++) {
            char charAt = this.e.charAt(i10);
            if (charAt != '#') {
                if (charAt != '(') {
                    if (charAt == 'c') {
                        if (str2 != null) {
                            sb2.append(str2);
                        }
                        z10 = true;
                    } else if (charAt == 'n') {
                        if (str3 != null) {
                            sb2.append(str3);
                        }
                        z11 = true;
                    }
                } else if (i3 < str.length()) {
                    z12 = true;
                }
                if (charAt == ' ' && i10 > 0) {
                    int i11 = i10 - 1;
                    if (this.e.charAt(i11) == 'n') {
                        if (str3 == null) {
                        }
                    }
                    if (this.e.charAt(i11) == 'c' && str2 == null) {
                    }
                }
                if (i3 < str.length() || (z12 && charAt == ')')) {
                    sb2.append(this.e.substring(i10, i10 + 1));
                    if (charAt == ')') {
                        z12 = false;
                    }
                }
            } else if (i3 < str.length()) {
                int i12 = i3 + 1;
                sb2.append(str.substring(i3, i12));
                i3 = i12;
            } else if (z12) {
                sb2.append(" ");
            }
        }
        if (str2 != null && !z10) {
            sb2.insert(0, str2.concat(" "));
        } else if (str3 != null && !z11) {
            sb2.insert(0, str3);
        }
        return sb2.toString();
    }
}

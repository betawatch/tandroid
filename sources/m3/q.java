package m3;

import d5.g0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i10 = g0.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(z3.c cVar) {
        int i10 = 0;
        while (true) {
            z3.b[] bVarArr = cVar.a;
            if (i10 >= bVarArr.length) {
                return;
            }
            z3.b bVar = bVarArr[i10];
            if (bVar instanceof e4.e) {
                e4.e eVar = (e4.e) bVar;
                if ("iTunSMPB".equals(eVar.c) && a(eVar.d)) {
                    return;
                }
            } else if (bVar instanceof e4.k) {
                e4.k kVar = (e4.k) bVar;
                if ("com.apple.iTunes".equals(kVar.b) && "iTunSMPB".equals(kVar.c) && a(kVar.d)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}

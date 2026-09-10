package c3;

import b2.o0;
import b2.p0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w {
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
            String str2 = e2.d0.a;
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

    public final void b(p0 p0Var) {
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.a;
            if (i10 >= o0VarArr.length) {
                return;
            }
            o0 o0Var = o0VarArr[i10];
            if (o0Var instanceof q3.e) {
                q3.e eVar = (q3.e) o0Var;
                if ("iTunSMPB".equals(eVar.c) && a(eVar.d)) {
                    return;
                }
            } else if (o0Var instanceof q3.l) {
                q3.l lVar = (q3.l) o0Var;
                if ("com.apple.iTunes".equals(lVar.b) && "iTunSMPB".equals(lVar.c) && a(lVar.d)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}

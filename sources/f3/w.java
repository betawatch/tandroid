package f3;

import e2.p0;
import e2.q0;
import h2.m0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
            String str2 = m0.a;
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

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r7.b.equals("com.apple.iTunes") && r7.c.equals("iTunSMPB")) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(q0 q0Var) {
        p0 p0Var;
        q0Var.getClass();
        h9.f0 p10 = h9.i0.p();
        p0[] p0VarArr = q0Var.a;
        int length = p0VarArr.length;
        int i7 = 0;
        while (true) {
            p0 p0Var2 = null;
            if (i7 >= length) {
                break;
            }
            p0 p0Var3 = p0VarArr[i7];
            if (t3.e.class.isAssignableFrom(p0Var3.getClass())) {
                p0 p0Var4 = (p0) t3.e.class.cast(p0Var3);
                if (((t3.e) p0Var4).c.equals("iTunSMPB")) {
                    p0Var2 = p0Var4;
                }
            }
            if (p0Var2 != null) {
                p10.c(p0Var2);
            }
            i7++;
        }
        h9.g0 listIterator = p10.f().listIterator(0);
        while (listIterator.hasNext()) {
            if (a(((t3.e) listIterator.next()).d)) {
                return;
            }
        }
        h9.f0 p11 = h9.i0.p();
        for (p0 p0Var5 : p0VarArr) {
            if (t3.k.class.isAssignableFrom(p0Var5.getClass())) {
                p0Var = (p0) t3.k.class.cast(p0Var5);
                t3.k kVar = (t3.k) p0Var;
            }
            p0Var = null;
            if (p0Var != null) {
                p11.c(p0Var);
            }
        }
        h9.g0 listIterator2 = p11.f().listIterator(0);
        while (listIterator2.hasNext() && !a(((t3.k) listIterator2.next()).d)) {
        }
    }
}

package e3;

import d2.r0;
import d2.s0;
import g2.n0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            String str2 = n0.a;
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
    public final void b(s0 s0Var) {
        r0 r0Var;
        s0Var.getClass();
        g9.f0 p10 = g9.i0.p();
        r0[] r0VarArr = s0Var.a;
        int length = r0VarArr.length;
        int i3 = 0;
        while (true) {
            r0 r0Var2 = null;
            if (i3 >= length) {
                break;
            }
            r0 r0Var3 = r0VarArr[i3];
            if (s3.e.class.isAssignableFrom(r0Var3.getClass())) {
                r0 r0Var4 = (r0) s3.e.class.cast(r0Var3);
                if (((s3.e) r0Var4).c.equals("iTunSMPB")) {
                    r0Var2 = r0Var4;
                }
            }
            if (r0Var2 != null) {
                p10.c(r0Var2);
            }
            i3++;
        }
        g9.g0 listIterator = p10.f().listIterator(0);
        while (listIterator.hasNext()) {
            if (a(((s3.e) listIterator.next()).d)) {
                return;
            }
        }
        g9.f0 p11 = g9.i0.p();
        for (r0 r0Var5 : r0VarArr) {
            if (s3.k.class.isAssignableFrom(r0Var5.getClass())) {
                r0Var = (r0) s3.k.class.cast(r0Var5);
                s3.k kVar = (s3.k) r0Var;
            }
            r0Var = null;
            if (r0Var != null) {
                p11.c(r0Var);
            }
        }
        g9.g0 listIterator2 = p11.f().listIterator(0);
        while (listIterator2.hasNext() && !a(((s3.k) listIterator2.next()).d)) {
        }
    }
}
